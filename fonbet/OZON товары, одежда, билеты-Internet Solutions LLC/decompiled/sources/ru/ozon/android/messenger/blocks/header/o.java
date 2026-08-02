package ru.ozon.android.messenger.blocks.header;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.header.ChatHeaderDTO;
import ru.ozon.android.messenger.blocks.header.s;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class o implements Function2<ChatHeaderDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends s>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d.b f85312a;

    public o(@NotNull d.b blockCustomSettings) {
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        this.f85312a = blockCustomSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends s> invoke(ChatHeaderDTO chatHeaderDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        AtomAction atomAction;
        ChatHeaderDTO state = chatHeaderDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        TextDTO titleAtom = state.getTitleAtom();
        List<TextDTO> subtitles = state.getSubtitles();
        AtomActionDTO action = state.getAction();
        K k11 = null;
        if (action != null) {
            Map<String, MessengerTrackingInfo> trackingInfo = state.getTrackingInfo();
            atomAction = AtomActionMapperKt.toAtomAction(action, trackingInfo != null ? ru.ozon.android.messenger.framework.analytics.h.b(trackingInfo) : null);
        } else {
            atomAction = null;
        }
        IconDTO avatarIcon = state.getAvatarIcon();
        String backgroundColor = state.getBackgroundColor();
        List<ChatHeaderDTO.IconItemDTO> titleIcons = state.getTitleIcons();
        if (titleIcons != null) {
            List<ChatHeaderDTO.IconItemDTO> list = titleIcons;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (ChatHeaderDTO.IconItemDTO iconItemDTO : list) {
                Icon icon = iconItemDTO.getIcon();
                ChatHeaderDTO.IconTooltipItemDTO tooltip = iconItemDTO.getTooltip();
                arrayList.add(new s.a(icon, tooltip != null ? new s.b(tooltip.getTitle(), tooltip.getDescription(), tooltip.getTrackingInfo()) : null));
            }
            k11 = arrayList;
        }
        if (k11 == null) {
            k11 = K.f71697a;
        }
        K k12 = k11;
        List<ButtonV3Atom.SmallButtonWithIcon> buttons = state.getButtons();
        if (buttons == null) {
            buttons = K.f71697a;
        }
        return C7714v.a0(new s(blockId, titleAtom, subtitles, atomAction, avatarIcon, backgroundColor, k12, buttons, state.getAnimation(), this.f85312a.a(), state.getStatus(), state.getTrackingInfo(), state.getStatusIcon(), state.getStatusIconUrl()));
    }
}
