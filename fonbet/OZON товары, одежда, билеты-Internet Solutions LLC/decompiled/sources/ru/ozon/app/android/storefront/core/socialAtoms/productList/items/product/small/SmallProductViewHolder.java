package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.small;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.atoms.databinding.ViewSocialSmallProductBinding;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemViewHolder;
import ru.ozon.uni.android.uikit.appearance.text.StrikethroughTextView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/product/small/SmallProductViewHolder;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemViewHolder;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/product/small/SmallProductVO;", "parent", "Landroid/view/ViewGroup;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "binding", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewSocialSmallProductBinding;", "imageView", "Landroid/widget/ImageView;", "priceView", "Landroid/widget/TextView;", "priceOriginalView", "Lru/ozon/uni/android/uikit/appearance/text/StrikethroughTextView;", "iconView", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/storefront/core/atoms/databinding/ViewSocialSmallProductBinding;Landroid/widget/ImageView;Landroid/widget/TextView;Lru/ozon/uni/android/uikit/appearance/text/StrikethroughTextView;Landroid/widget/ImageView;)V", "onBind", "vo", "setIcon", "iconSrc", "", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallProductViewHolder extends ProductListItemViewHolder<SmallProductVO> {

    @NotNull
    private final ImageView iconView;

    @NotNull
    private final ImageView imageView;

    @NotNull
    private final StrikethroughTextView priceOriginalView;

    @NotNull
    private final TextView priceView;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SmallProductViewHolder(ViewGroup viewGroup, Function1 function1, ViewSocialSmallProductBinding viewSocialSmallProductBinding, ImageView imageView, TextView textView, StrikethroughTextView strikethroughTextView, ImageView imageView2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, function1, r3, (i11 & 8) != 0 ? r3.imageView : imageView, (i11 & 16) != 0 ? r3.priceView : textView, (i11 & 32) != 0 ? r3.priceOriginalView : strikethroughTextView, (i11 & 64) != 0 ? r3.iconView : imageView2);
        ViewSocialSmallProductBinding inflate = (i11 & 4) != 0 ? ViewSocialSmallProductBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false) : viewSocialSmallProductBinding;
    }

    private final void setIcon(String iconSrc) {
        if (iconSrc == null) {
            ViewExtKt.gone(this.iconView);
        } else {
            ImageViewExtKt.load$default(this.iconView, iconSrc, null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.small.SmallProductViewHolder$setIcon$1
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception e11) {
                    ImageView imageView;
                    imageView = SmallProductViewHolder.this.iconView;
                    ViewExtKt.gone(imageView);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    ImageView imageView;
                    imageView = SmallProductViewHolder.this.iconView;
                    ViewExtKt.show(imageView);
                }
            }, null, null, false, null, 122, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemViewHolder
    public void onBind(@NotNull SmallProductVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        ImageViewExtKt.load$default(this.imageView, vo.getImage(), C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(ResourceExtKt.toPx(6), null, 2, null)), null, null, null, false, null, 124, null);
        this.priceView.setText(vo.getPrice());
        if (vo.getOriginalPrice() == null) {
            ViewExtKt.gone(this.priceOriginalView);
            ViewExtKt.gone(this.iconView);
        } else {
            ViewExtKt.show(this.priceOriginalView);
            this.priceOriginalView.setText(vo.getOriginalPrice());
            setIcon(vo.getIcon());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SmallProductViewHolder(@NotNull ViewGroup parent, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull ViewSocialSmallProductBinding binding, @NotNull ImageView imageView, @NotNull TextView priceView, @NotNull StrikethroughTextView priceOriginalView, @NotNull ImageView iconView) {
        super(r2, R$id.smallProductListItem, onAction);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(priceView, "priceView");
        Intrinsics.checkNotNullParameter(priceOriginalView, "priceOriginalView");
        Intrinsics.checkNotNullParameter(iconView, "iconView");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.imageView = imageView;
        this.priceView = priceView;
        this.priceOriginalView = priceOriginalView;
        this.iconView = iconView;
    }
}
