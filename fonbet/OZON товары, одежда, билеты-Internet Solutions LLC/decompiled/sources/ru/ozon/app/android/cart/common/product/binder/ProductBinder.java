package ru.ozon.app.android.cart.common.product.binder;

import D90.c;
import Sc.InterfaceC4008j;
import WZ.t;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementListAdapter;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementOnItemTouchListener;
import ru.ozon.app.android.cart.common.product.ProductVO;
import ru.ozon.app.android.cart.feature.databinding.ItemCommonProductBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/cart/common/product/binder/ProductBinder;", "", "Lru/ozon/app/android/cart/feature/databinding/ItemCommonProductBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/cart/feature/databinding/ItemCommonProductBinding;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/widget/ImageView;", "Lru/ozon/app/android/cart/common/product/ProductVO;", "item", "loadProductImage", "(Landroid/widget/ImageView;Lru/ozon/app/android/cart/common/product/ProductVO;)V", "bind", "(Lru/ozon/app/android/cart/common/product/ProductVO;)V", "bindImage", "onAttach", "()V", "onDetach", "Lru/ozon/app/android/cart/feature/databinding/ItemCommonProductBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cart/common/product/ProductVO;", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementListAdapter;", "productDynamicElementAdapter", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementListAdapter;", "", "darkThemeRadius$delegate", "LSc/j;", "getDarkThemeRadius", "()I", "darkThemeRadius", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductBinder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemCommonProductBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    /* renamed from: darkThemeRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j darkThemeRadius;
    private ProductVO item;

    @NotNull
    private final DynamicElementListAdapter productDynamicElementAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductBinder(@NotNull ItemCommonProductBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.binding = binding;
        this.actionHandler = actionHandler;
        this.composerReferences = composerReferences;
        DynamicElementListAdapter dynamicElementListAdapter = new DynamicElementListAdapter(actionHandler);
        this.productDynamicElementAdapter = dynamicElementListAdapter;
        this.darkThemeRadius = LazyUtilsKt.unsafeLazy(ProductBinder$darkThemeRadius$2.INSTANCE);
        RecyclerView recyclerView = binding.productDynamicElementsRv;
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        recyclerView.addOnItemTouchListener(new DynamicElementOnItemTouchListener(constraintLayout));
        binding.productDynamicElementsRv.setAdapter(dynamicElementListAdapter);
        binding.productDynamicElementsRv.setLayoutManager(new LinearLayoutManager(binding.getConstraintLayout().getContext(), 1, false));
        binding.productDynamicElementsRv.setItemAnimator(null);
        binding.productDynamicElementsRv.setRecycledViewPool(composerReferences.getComposerViewPoolProvider().getViewPool());
        binding.getConstraintLayout().setOnClickListener(new c(this, 16));
    }

    private final int getDarkThemeRadius() {
        return ((Number) this.darkThemeRadius.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(ProductBinder productBinder, View view) {
        t trackingInfo;
        AtomAction action;
        ProductVO productVO = productBinder.item;
        if (productVO != null && (action = productVO.getAction()) != null) {
            productBinder.actionHandler.invoke(action);
        }
        ProductVO productVO2 = productBinder.item;
        if (productVO2 == null || (trackingInfo = productVO2.getTrackingInfo()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(productBinder.composerReferences.getTokenizedAnalytics(), trackingInfo, null, 2, null);
    }

    private final void loadProductImage(ImageView imageView, ProductVO productVO) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageViewExtKt.load$default(imageView, productVO.getImage().getUrl(), ThemeExtKt.isDarkThemeActive(context) ? C7714v.a0(new ImageTransformation.RoundedCorners(getDarkThemeRadius(), null, 2, null)) : K.f71697a, null, null, null, false, null, 124, null);
    }

    public final void bind(ProductVO item) {
        if (item == null) {
            return;
        }
        this.item = item;
        ImageView imageView = this.binding.imageIV;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ThemeExtKt.isDarkThemeActive(context)) {
            ImageViewExtKt.load$default(imageView, item.getImage().getUrl(), C7714v.a0(new ImageTransformation.RoundedCorners(getDarkThemeRadius(), null, 2, null)), null, null, null, false, null, 124, null);
            ru.ozon.uni.android.uikit.extensions.view.ImageViewExtKt.setBackgroundVectorDrawable(imageView, R$drawable.bg_all_corners_rounded_white_overlay);
            ThemeExtKt.setParandjaForDarkTheme(imageView);
            ThemeExtKt.setBackgroundParanjaForDarkTheme(imageView);
        } else {
            imageView.setColorFilter((ColorFilter) null);
            imageView.setBackground(null);
            imageView.setBackgroundColor(0);
            ImageViewExtKt.load$default(imageView, item.getImage().getUrl(), null, null, null, null, false, null, 126, null);
        }
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composerReferences.getTokenizedAnalytics(), trackingInfo, null, 2, null);
        }
        BadgeView badgeV = this.binding.badgeV;
        Intrinsics.checkNotNullExpressionValue(badgeV, "badgeV");
        BadgeHolderKt.bindOrGone$default(badgeV, item.getImage().getBadge(), (Function1) null, 2, (Object) null);
        this.productDynamicElementAdapter.submitList(item.getDynamicElements());
    }

    public final void bindImage(ProductVO item) {
        if (item != null) {
            ImageView imageIV = this.binding.imageIV;
            Intrinsics.checkNotNullExpressionValue(imageIV, "imageIV");
            loadProductImage(imageIV, item);
        }
    }

    public final void onAttach() {
        this.binding.productDynamicElementsRv.swapAdapter(this.productDynamicElementAdapter, true);
    }

    public final void onDetach() {
        this.binding.productDynamicElementsRv.swapAdapter(null, true);
    }
}
