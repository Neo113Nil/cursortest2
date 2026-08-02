package ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.data.CellListDTO;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation.FreshCellVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\u0010*\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/CellListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$CheckboxCellDTO;", "", "widgetId", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$CheckboxFreshVO;", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$CheckboxCellDTO;J)Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$CheckboxFreshVO;", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$Spacers;", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$SpacersVO;", "(Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$Spacers;)Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/presentation/FreshCellVO$SpacersVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO;Ll20/d;)Ljava/util/List;", "", "defaultTopMargin", "I", "defaultBottomMargin", "defaultRightMargin", "defaultBetweenBadgeMargin", "defaultHorizontalMargin", "", "defaultCornerRadius", "F", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CellListMapper implements Function2<CellListDTO, d, List<? extends FreshCellVO>> {
    private final int defaultTopMargin = ResourceExtKt.toPx(8);
    private final int defaultBottomMargin = ResourceExtKt.toPx(0);
    private final int defaultRightMargin = ResourceExtKt.toPx(16);
    private final int defaultBetweenBadgeMargin = ResourceExtKt.toPx(8);
    private final int defaultHorizontalMargin = ResourceExtKt.toPx(0);
    private final float defaultCornerRadius = ResourceExtKt.toPxF(24);

    private final FreshCellVO.CheckboxFreshVO toVO(CellListDTO.CheckboxCellDTO checkboxCellDTO, long j11) {
        CheckBoxDTO checkbox = checkboxCellDTO.getCheckbox();
        AtomActionDTO action = checkboxCellDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = checkboxCellDTO.getTrackingInfo();
        return new FreshCellVO.CheckboxFreshVO(checkbox, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FreshCellVO> invoke(@NotNull CellListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<CellListDTO.FreshCellDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (CellListDTO.FreshCellDTO freshCellDTO : items) {
            Long valueOf = Long.valueOf(hashCode);
            Integer valueOf2 = Integer.valueOf(freshCellDTO.getCell().getCenterBlock().getTitle().getText().hashCode());
            TextDTO text = freshCellDTO.getText();
            t tVar = null;
            OzonSpannableString text2 = text != null ? text.getText() : null;
            long hash = Objects.hash(valueOf, valueOf2, Integer.valueOf(text2 != null ? text2.hashCode() : 0));
            CellDTO cell = freshCellDTO.getCell();
            String badgeImage = freshCellDTO.getBadgeImage();
            CellListDTO.CheckboxCellDTO checkbox = freshCellDTO.getCheckbox();
            FreshCellVO.CheckboxFreshVO vo = checkbox != null ? toVO(checkbox, hashCode) : null;
            IconDTO rightIcon = freshCellDTO.getRightIcon();
            FreshCellVO.SpacersVO vo2 = toVO(freshCellDTO.getSpacers());
            String backgroundColor = freshCellDTO.getBackgroundColor();
            TextDTO text3 = freshCellDTO.getText();
            CornerRadius cornerRadius = freshCellDTO.getCornerRadius();
            float pxF = cornerRadius != null ? ResourceExtKt.toPxF(cornerRadius.getPx()) : this.defaultCornerRadius;
            AtomActionDTO action = freshCellDTO.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = freshCellDTO.getTrackingInfo();
            if (trackingInfo != null) {
                tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hash), null, 2, null);
            }
            arrayList.add(new FreshCellVO(hash, cell, badgeImage, vo, rightIcon, vo2, backgroundColor, text3, pxF, atomAction, tVar));
        }
        return arrayList;
    }

    private final FreshCellVO.SpacersVO toVO(CellListDTO.Spacers spacers) {
        Paddings horizontal;
        Paddings right;
        Paddings betweenBadge;
        Paddings bottom;
        Paddings top;
        return new FreshCellVO.SpacersVO((spacers == null || (top = spacers.getTop()) == null) ? this.defaultTopMargin : ResourceExtKt.toPx(top.getPx()), (spacers == null || (bottom = spacers.getBottom()) == null) ? this.defaultBottomMargin : ResourceExtKt.toPx(bottom.getPx()), (spacers == null || (betweenBadge = spacers.getBetweenBadge()) == null) ? this.defaultBetweenBadgeMargin : ResourceExtKt.toPx(betweenBadge.getPx()), (spacers == null || (right = spacers.getRight()) == null) ? this.defaultRightMargin : ResourceExtKt.toPx(right.getPx()), (spacers == null || (horizontal = spacers.getHorizontal()) == null) ? this.defaultHorizontalMargin : ResourceExtKt.toPx(horizontal.getPx()));
    }
}
