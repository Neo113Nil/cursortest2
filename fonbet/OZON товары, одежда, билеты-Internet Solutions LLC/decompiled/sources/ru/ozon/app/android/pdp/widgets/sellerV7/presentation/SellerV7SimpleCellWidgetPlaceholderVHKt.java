package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import kotlin.Metadata;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"hasAction", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getHasAction", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Z", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerV7SimpleCellWidgetPlaceholderVHKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasAction(CellDTO cellDTO) {
        CommonControlSettings common;
        CommonControlSettings common2;
        CommonControlSettings common3 = cellDTO.getCommon();
        AtomActionDTO atomActionDTO = null;
        if ((common3 != null ? common3.getAction() : null) != null) {
            return true;
        }
        CellDTO.LeftBlock leftBlock = cellDTO.getLeftBlock();
        if (((leftBlock == null || (common2 = leftBlock.getCommon()) == null) ? null : common2.getAction()) != null) {
            return true;
        }
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        if (rightBlock != null && (common = rightBlock.getCommon()) != null) {
            atomActionDTO = common.getAction();
        }
        return atomActionDTO != null;
    }
}
