package ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.data.IconButtonsDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.presentation.IconButtonsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000b\u0010\u0011J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/presentation/IconButtonsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/data/IconButtonsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/presentation/IconButtonsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "toVo", "(Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/data/IconButtonsDTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/presentation/IconButtonsVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/data/IconButtonsDTO$IconButton;", "", "widgetId", "Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/presentation/IconButtonsVO$IconButton;", "(Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/data/IconButtonsDTO$IconButton;J)Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/presentation/IconButtonsVO$IconButton;", "state", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/data/IconButtonsDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IconButtonsMapper implements Function2<IconButtonsDTO, d, List<? extends IconButtonsVO>> {
    private final IconButtonsVO toVo(IconButtonsDTO iconButtonsDTO, d dVar) {
        long hashCode = dVar.d().hashCode();
        List<IconButtonsDTO.IconButton> items = iconButtonsDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((IconButtonsDTO.IconButton) it.next(), hashCode));
        }
        return new IconButtonsVO(hashCode, arrayList, iconButtonsDTO.getBackgroundTintColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<IconButtonsVO> invoke(@NotNull IconButtonsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo));
    }

    private final IconButtonsVO.IconButton toVo(IconButtonsDTO.IconButton iconButton, long j11) {
        String icon = iconButton.getIcon();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(iconButton.getAction(), iconButton.getTrackingInfo());
        String tintColor = iconButton.getTintColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = iconButton.getTrackingInfo();
        return new IconButtonsVO.IconButton(icon, tintColor, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
