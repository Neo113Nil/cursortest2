package ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.carousel;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.databinding.ItemHorizontalSplitCarouselBinding;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/carousel/CarouselVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkout/databinding/ItemHorizontalSplitCarouselBinding;", "binding", "<init>", "(Lru/ozon/app/android/checkout/databinding/ItemHorizontalSplitCarouselBinding;)V", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Horizontal$ProductImage;", "productImage", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Horizontal$ProductImage;)V", "Lru/ozon/app/android/checkout/databinding/ItemHorizontalSplitCarouselBinding;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CarouselVH extends RecyclerView.C {

    @NotNull
    private final ItemHorizontalSplitCarouselBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselVH(@NotNull ItemHorizontalSplitCarouselBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bind(@NotNull SplitDetailV2VO.Split.Horizontal.ProductImage productImage) {
        Intrinsics.checkNotNullParameter(productImage, "productImage");
        ItemHorizontalSplitCarouselBinding itemHorizontalSplitCarouselBinding = this.binding;
        ImageView carouselImageIV = itemHorizontalSplitCarouselBinding.carouselImageIV;
        Intrinsics.checkNotNullExpressionValue(carouselImageIV, "carouselImageIV");
        ImageViewExtKt.loadWithRoundCorners$default(carouselImageIV, productImage.getImageUrl(), null, 2, null);
        ImageView carouselImageIV2 = itemHorizontalSplitCarouselBinding.carouselImageIV;
        Intrinsics.checkNotNullExpressionValue(carouselImageIV2, "carouselImageIV");
        ThemeExtKt.setParandjaForDarkTheme(carouselImageIV2);
        Context context = itemHorizontalSplitCarouselBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!ThemeExtKt.isDarkThemeActive(context)) {
            itemHorizontalSplitCarouselBinding.carouselImageIV.setBackgroundTintList(null);
            return;
        }
        ImageView imageView = itemHorizontalSplitCarouselBinding.carouselImageIV;
        Context context2 = itemHorizontalSplitCarouselBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageView.setBackgroundTintList(ColorStateList.valueOf(ThemeExtKt.themeColor(context2, R$attr.layerOverlayParanja)));
    }
}
