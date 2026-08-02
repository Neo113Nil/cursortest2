package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import AI.b;
import Sc.InterfaceC4008j;
import Vg.c;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.badgescontainer.HorizontalBadgesContainerView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JA\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u00062\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u00020\u001f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductHorizontalBadgesBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "<init>", "()V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "horizontalBadgesContainer$delegate", "LSc/j;", "getHorizontalBadgesContainer", "()Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "horizontalBadgesContainer", "", "getPaddingBetweenInPx", "(Lru/ozon/app/android/product/common/product/ProductVO;)I", "paddingBetweenInPx", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductHorizontalBadgesBinder extends ProductPropertyBinder<ProductVO> {

    /* renamed from: horizontalBadgesContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j horizontalBadgesContainer = LazyUtilsKt.unsafeLazy(new ProductHorizontalBadgesBinder$horizontalBadgesContainer$2(this));

    private final HorizontalBadgesContainerView getHorizontalBadgesContainer() {
        return (HorizontalBadgesContainerView) this.horizontalBadgesContainer.getValue();
    }

    private final int getPaddingBetweenInPx(ProductVO productVO) {
        ProductVO.BadgePadding badgePadding = productVO.getBadgePadding();
        if (badgePadding != null) {
            return badgePadding.getBadgePaddingBetweenInPx();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(ProductHorizontalBadgesBinder productHorizontalBadgesBinder, View view) {
        productHorizontalBadgesBinder.getRootView().performClick();
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public /* bridge */ /* synthetic */ void bind(ProductVO productVO, d dVar, k kVar) {
        bind2(productVO, dVar, (k<?>) kVar);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void init(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        getHorizontalBadgesContainer().setOnClickListener(new b(this, 10));
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ProductVO product, @NotNull d info, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind((ProductHorizontalBadgesBinder) product, info, holder);
        getHorizontalBadgesContainer().setVisibility(product.getLeftBottomBadge() != null || product.getSecondLeftBottomBadge() != null ? 0 : 8);
        getHorizontalBadgesContainer().bindBadges(product.getLeftBottomBadge(), product.getSecondLeftBottomBadge(), getPaddingBetweenInPx(product));
    }
}
