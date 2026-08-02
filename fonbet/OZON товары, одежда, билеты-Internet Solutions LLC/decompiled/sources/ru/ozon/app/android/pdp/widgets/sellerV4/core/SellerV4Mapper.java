package ru.ozon.app.android.pdp.widgets.sellerV4.core;

import WZ.t;
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
import ru.ozon.app.android.pdp.widgets.sellerV4.data.SellerV4DTO;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerCellVO;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/core/SellerV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/sellerV4/data/SellerV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/sellerV4/data/SellerV4DTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerV4Mapper implements Function2<SellerV4DTO, d, List<? extends SellerV4VO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SellerV4VO> invoke(@NotNull SellerV4DTO dto, @NotNull d widgetInfo) {
        CommonControlSettings common;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        DisclosureIconTitleSubtitleCellDTO cell = dto.getSellerCell().getCell();
        CommonCellSettings common2 = cell.getCommon();
        AtomAction atomAction = null;
        AtomActionDTO action2 = common2 != null ? common2.getAction() : null;
        SellerCellVO sellerCellVO = new SellerCellVO(DisclosureIconTitleSubtitleCellDTO.copy$default(dto.getSellerCell().getCell(), null, null, null, null, action2 != null ? cell.getDisclosureIcon() : null, null, 47, null), dto.getSellerCell().getBackgroundColor(), action2 != null ? AtomActionMapperKt.toAtomAction(action2, cell.getTrackingInfo()) : null);
        ButtonDTO actionButton = dto.getActionButton();
        String backgroundColor = dto.getBackgroundColor();
        List<ButtonDTO> scrollableButtons = dto.getScrollableButtons();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        ButtonDTO actionButton2 = dto.getActionButton();
        if (actionButton2 != null && (common = actionButton2.getCommon()) != null && (action = common.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, dto.getActionButton().getTrackingInfo());
        }
        return C7714v.a0(new SellerV4VO(hashCode, sellerCellVO, backgroundColor, actionButton, scrollableButtons, tokenizedEvent$default, atomAction));
    }
}
