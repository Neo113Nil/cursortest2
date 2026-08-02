package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.data.InstallmentPurchaseV5DTO;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5SingleProductMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentV5SingleProductMapper implements Function2<InstallmentPurchaseV5DTO, d, List<? extends InstallmentPurchaseV5VO.SingleProduct>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InstallmentPurchaseV5VO.SingleProduct> invoke(@NotNull InstallmentPurchaseV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        Object content = state.getContentBlock().getContent();
        InstallmentPurchaseV5DTO.SingleCreditProduct singleCreditProduct = content instanceof InstallmentPurchaseV5DTO.SingleCreditProduct ? (InstallmentPurchaseV5DTO.SingleCreditProduct) content : null;
        if (singleCreditProduct != null) {
            String background = state.getBackground();
            Paddings horizontalPaddings = state.getContentBlock().getHorizontalPaddings();
            Paddings topPadding = state.getContentBlock().getTopPadding();
            Paddings bottomPadding = state.getContentBlock().getBottomPadding();
            boolean z11 = state.getTitleBlock() != null;
            CommonControlSettings common = singleCreditProduct.getCommon();
            InstallmentPurchaseV5VO.CommonVO vo = common != null ? InstallmentV5ExtKt.toVO(common, widgetId) : null;
            InstallmentPurchaseV5VO.SingleProduct.SingleProductContent.LeftBlock leftBlock = new InstallmentPurchaseV5VO.SingleProduct.SingleProductContent.LeftBlock(singleCreditProduct.getLeftBlock().getBackground(), singleCreditProduct.getLeftBlock().getTitle(), singleCreditProduct.getLeftBlock().getIcon());
            TextDTO title = singleCreditProduct.getTitle();
            TextDTO subtitle = singleCreditProduct.getSubtitle();
            CommonAtomIconDTO chevronIcon = singleCreditProduct.getChevronIcon();
            List<BadgeDTO> badges = singleCreditProduct.getBadges();
            String background2 = singleCreditProduct.getBackground();
            InstallmentPurchaseV5DTO.SingleCreditProduct.BottomBlock bottomBlock = singleCreditProduct.getBottomBlock();
            List<InstallmentPurchaseV5VO.SingleProduct> a02 = C7714v.a0(new InstallmentPurchaseV5VO.SingleProduct(widgetId, background, horizontalPaddings, topPadding, bottomPadding, new InstallmentPurchaseV5VO.SingleProduct.SingleProductContent(leftBlock, title, subtitle, chevronIcon, badges, background2, bottomBlock != null ? new InstallmentPurchaseV5VO.SingleProduct.SingleProductContent.BottomBlock(bottomBlock.getTitle(), bottomBlock.getBackground()) : null, singleCreditProduct.getOnboarding(), singleCreditProduct.getShimmerAnimationTimer()), z11, vo));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
