package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import Ez.ViewOnClickListenerC2979c;
import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Vg.c;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.badgescontainer.HorizontalBadgesContainerView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.videocover.UtilsKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0016\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0002\b\u00030\fj\u0006\u0012\u0002\b\u0003`\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0002\b\u00030\fj\u0006\u0012\u0002\b\u0003`\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u000bR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u00020**\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollBadgesBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "updateBadges", "()V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "recycle", "Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "badgesContainer$delegate", "LSc/j;", "getBadgesContainer", "()Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "badgesContainer", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/product/common/core/GalleryItem;", "adultDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "", "getPaddingBetweenInPx", "(Lru/ozon/app/android/product/common/product/ProductVO;)I", "paddingBetweenInPx", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuScrollBadgesBinder extends ProductPropertyBinder<ProductVO> {

    @NotNull
    private final AdultDelegate<GalleryItem> adultDelegate;

    /* renamed from: badgesContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgesContainer;

    public SkuScrollBadgesBinder(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.badgesContainer = k.a(n.NONE, new SkuScrollBadgesBinder$badgesContainer$2(this));
        this.adultDelegate = new AdultDelegate<>(adultHandler, featureChecker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HorizontalBadgesContainerView getBadgesContainer() {
        return (HorizontalBadgesContainerView) this.badgesContainer.getValue();
    }

    private final int getPaddingBetweenInPx(ProductVO productVO) {
        ProductVO.BadgePadding badgePadding = productVO.getBadgePadding();
        if (badgePadding != null) {
            return badgePadding.getBadgePaddingBetweenInPx();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(SkuScrollBadgesBinder skuScrollBadgesBinder, View view) {
        skuScrollBadgesBinder.getRootView().performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBadges() {
        getBadgesContainer().bindBadges(getProduct().getLeftBottomBadge(), getProduct().getSecondLeftBottomBadge(), getPaddingBetweenInPx(getProduct()));
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public /* bridge */ /* synthetic */ void bind(ProductVO productVO, d dVar, ru.ozon.composer.ui.widget.k kVar) {
        bind2(productVO, dVar, (ru.ozon.composer.ui.widget.k<?>) kVar);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void init(@NotNull ru.ozon.composer.ui.widget.k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        getBadgesContainer().setOnClickListener(new ViewOnClickListenerC2979c(this, 5));
        RxExtKt.observe$default(this.adultDelegate.observeItem(), getLifecycleOwner(), new SkuScrollBadgesBinder$init$2(this), new SkuScrollBadgesBinder$init$3(a.f17149a), null, 8, null);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void recycle() {
        super.recycle();
        getBadgesContainer().reset();
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind((SkuScrollBadgesBinder) product, info, holder);
        if (!product.getIsAdult()) {
            ViewExtKt.show(getBadgesContainer());
            updateBadges();
            return;
        }
        ViewExtKt.gone(getBadgesContainer());
        GalleryItem.ImageItem imageItem = UtilsKt.getImageItem(product);
        if (imageItem != null) {
            this.adultDelegate.bindItem(imageItem);
        }
    }
}
