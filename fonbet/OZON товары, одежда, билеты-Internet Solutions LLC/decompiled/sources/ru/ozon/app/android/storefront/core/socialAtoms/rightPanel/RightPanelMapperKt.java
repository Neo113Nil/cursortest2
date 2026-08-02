package ru.ozon.app.android.storefront.core.socialAtoms.rightPanel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\b"}, d2 = {"mapToVo", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelVO;", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelDTO;", "widgetId", "", "toVO", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemDTO;", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RightPanelMapperKt {
    @NotNull
    public static final RightPanelVO mapToVo(@NotNull RightPanelDTO rightPanelDTO, long j11) {
        Intrinsics.checkNotNullParameter(rightPanelDTO, "<this>");
        List<RightPanelItemDTO> items = rightPanelDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((RightPanelItemDTO) it.next(), j11));
        }
        return new RightPanelVO(arrayList);
    }

    @NotNull
    public static final RightPanelItemVO toVO(@NotNull RightPanelItemDTO rightPanelItemDTO, long j11) {
        Intrinsics.checkNotNullParameter(rightPanelItemDTO, "<this>");
        Icon icon = rightPanelItemDTO.getIcon();
        SocialTextAtomDTO text = rightPanelItemDTO.getText();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(rightPanelItemDTO.getAction(), rightPanelItemDTO.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = rightPanelItemDTO.getTrackingInfo();
        return new RightPanelItemVO(icon, text, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, rightPanelItemDTO.getIconGradient());
    }
}
