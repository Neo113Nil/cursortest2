package ru.ozon.app.android.common.navigationblocks.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.navigationblocks.data.NavigationBlockDTO;
import ru.ozon.app.android.common.navigationblocks.data.NavigationBlocksV2DTO;
import ru.ozon.app.android.common.navigationblocks.presentation.NavigationBlock;
import ru.ozon.app.android.common.navigationblocks.presentation.NavigationBlocksV2VO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0007"}, d2 = {"toVo", "Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlocksV2VO;", "Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO;", "id", "", "Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlock;", "Lru/ozon/app/android/common/navigationblocks/data/NavigationBlockDTO;", "navigation-blocks_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavigationBlocksMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationBlocksV2VO toVo(NavigationBlocksV2DTO navigationBlocksV2DTO, long j11) {
        String outerBackgroundColor = navigationBlocksV2DTO.getOuterBackgroundColor();
        NavigationBlocksV2DTO.RoundedCorners roundedCorners = navigationBlocksV2DTO.getRoundedCorners();
        List<NavigationBlockDTO> blocks = navigationBlocksV2DTO.getBlocks();
        ArrayList arrayList = new ArrayList(C7714v.z(blocks, 10));
        Iterator<T> it = blocks.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((NavigationBlockDTO) it.next(), j11));
        }
        return new NavigationBlocksV2VO(j11, outerBackgroundColor, roundedCorners, arrayList);
    }

    private static final NavigationBlock toVo(NavigationBlockDTO navigationBlockDTO, long j11) {
        Icon icon = navigationBlockDTO.getIcon();
        String title = navigationBlockDTO.getTitle();
        String subtitle = navigationBlockDTO.getSubtitle();
        String backgroundColor = navigationBlockDTO.getBackgroundColor();
        AtomActionDTO action = navigationBlockDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, navigationBlockDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = navigationBlockDTO.getTrackingInfo();
        return new NavigationBlock(icon, title, subtitle, backgroundColor, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
