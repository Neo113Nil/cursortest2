package ru.ozon.android.messenger.blocks.notification;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.notification.NotificationDTO;
import ru.ozon.android.messenger.blocks.notification.b;
import ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.TimerBadge;
import ru.ozon.app.android.messenger.R$dimen;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* loaded from: classes10.dex */
public final class a implements Function2<NotificationDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends b>> {

    /* renamed from: a, reason: collision with root package name */
    private final float f85897a;

    /* renamed from: b, reason: collision with root package name */
    private final float f85898b;

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85897a = context.getResources().getDimension(R$dimen.m_image_blur_width);
        this.f85898b = context.getResources().getDimension(R$dimen.m_image_max_height);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<? extends b> invoke(NotificationDTO notificationDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        b.a aVar;
        ArrayList arrayList;
        NotificationDTO dto = notificationDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        if (dto.getImage() != null) {
            String url = dto.getImage().getUrl();
            Integer width = dto.getImage().getWidth();
            Integer height = dto.getImage().getHeight();
            NotificationDTO.ImageDTO image = dto.getImage();
            float f7 = this.f85898b / this.f85897a;
            boolean z11 = false;
            if (image.getWidth() != null && image.getHeight() != null && f7 < image.getHeight().intValue() / image.getWidth().intValue()) {
                z11 = true;
            }
            aVar = new b.a(url, width, height, z11);
        } else {
            aVar = null;
        }
        List<Badge> badges = dto.getBadges();
        List<TextAtom> content = dto.getContent();
        List<NotificationDTO.ButtonDTO> buttons = dto.getButtons();
        if (buttons != null) {
            arrayList = new ArrayList();
            Iterator<T> it = buttons.iterator();
            while (it.hasNext()) {
                ButtonV3Atom buttonAtom = ((NotificationDTO.ButtonDTO) it.next()).buttonAtom();
                if (buttonAtom != null) {
                    arrayList.add(buttonAtom);
                }
            }
        } else {
            arrayList = null;
        }
        TimerBadge timer = dto.getTimer();
        AtomActionDTO action = dto.getAction();
        return C7714v.a0(new b(blockId, aVar, badges, content, arrayList, timer, action != null ? AtomActionMapperKt.toAtomAction(action, ru.ozon.android.messenger.framework.analytics.h.b(dto.getTrackingInfo())) : null, dto.getTrackingInfo()));
    }
}
