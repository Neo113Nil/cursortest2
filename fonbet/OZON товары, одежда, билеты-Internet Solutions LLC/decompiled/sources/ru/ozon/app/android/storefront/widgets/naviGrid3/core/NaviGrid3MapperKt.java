package ru.ozon.app.android.storefront.widgets.naviGrid3.core;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.naviGrid3.data.CornerLabelDTO;
import ru.ozon.app.android.storefront.widgets.naviGrid3.data.ItemDTO;
import ru.ozon.app.android.storefront.widgets.naviGrid3.data.NaviGrid3DTO;
import ru.ozon.app.android.storefront.widgets.naviGrid3.presentation.CornerLabel;
import ru.ozon.app.android.storefront.widgets.naviGrid3.presentation.NaviGrid3ItemVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002¨\u0006\t"}, d2 = {"toVo", "", "Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/NaviGrid3ItemVO;", "Lru/ozon/app/android/storefront/widgets/naviGrid3/data/NaviGrid3DTO;", "id", "", "toVO", "Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/CornerLabel;", "Lru/ozon/app/android/storefront/widgets/naviGrid3/data/CornerLabelDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviGrid3MapperKt {
    private static final CornerLabel toVO(CornerLabelDTO cornerLabelDTO) {
        return new CornerLabel(cornerLabelDTO.getText(), cornerLabelDTO.getTextColor(), cornerLabelDTO.getBackgroundColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NaviGrid3ItemVO> toVo(NaviGrid3DTO naviGrid3DTO, long j11) {
        List<ItemDTO> items = naviGrid3DTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (ItemDTO itemDTO : items) {
            String image = itemDTO.getImage();
            String title = itemDTO.getTitle();
            CornerLabelDTO label = itemDTO.getLabel();
            t tVar = null;
            CornerLabel vo = label != null ? toVO(label) : null;
            AtomActionDTO action = itemDTO.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, itemDTO.getTrackingInfo()) : null;
            BadgeDTO adBadge = itemDTO.getAdBadge();
            Map<String, TokenizedTrackingInfo> trackingInfo = itemDTO.getTrackingInfo();
            if (trackingInfo != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
            }
            long j12 = j11;
            arrayList.add(new NaviGrid3ItemVO(j12, image, title, vo, atomAction, adBadge, tVar));
            j11 = j12;
        }
        return arrayList;
    }
}
