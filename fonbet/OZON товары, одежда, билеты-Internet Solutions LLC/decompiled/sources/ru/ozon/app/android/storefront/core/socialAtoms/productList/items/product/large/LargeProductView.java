package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.large;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.storefront.core.atoms.R$drawable;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.atoms.databinding.ViewSocialLargeProductBinding;
import ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomView;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0014J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/product/large/LargeProductView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "minimalWidth", "imageRadius", "binding", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewSocialLargeProductBinding;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setup", "vo", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/product/large/LargeProductVO;", "setIcon", "iconSrc", "", "setBadge", "badge", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LargeProductView extends ConstraintLayout {

    @NotNull
    private final ViewSocialLargeProductBinding binding;
    private final int imageRadius;
    private final int minimalWidth;

    public /* synthetic */ LargeProductView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setBadge(SocialBadgeAtomDTO badge) {
        ViewSocialLargeProductBinding viewSocialLargeProductBinding = this.binding;
        if (badge == null) {
            SocialBadgeAtomView socialBadgeAtomView = viewSocialLargeProductBinding.socialBadgeAtomView;
            Intrinsics.checkNotNullExpressionValue(socialBadgeAtomView, "socialBadgeAtomView");
            ViewExtKt.gone(socialBadgeAtomView);
            return;
        }
        SocialBadgeAtomView socialBadgeAtomView2 = viewSocialLargeProductBinding.socialBadgeAtomView;
        Intrinsics.checkNotNullExpressionValue(socialBadgeAtomView2, "socialBadgeAtomView");
        ViewExtKt.show(socialBadgeAtomView2);
        SocialBadgeAtomView socialBadgeAtomView3 = viewSocialLargeProductBinding.socialBadgeAtomView;
        socialBadgeAtomView3.setStyle(badge.getStyle());
        socialBadgeAtomView3.setText(badge.getText());
        socialBadgeAtomView3.setTextColor(badge.getTextColor());
        socialBadgeAtomView3.setBackground(badge.getBackgroundColors(), badge.getGradientStyle());
        if (badge.getIcon() != null) {
            socialBadgeAtomView3.showIcon(badge.getIcon(), badge.getIconTintColor());
        } else {
            socialBadgeAtomView3.hideIcon();
        }
        if (badge.getShowArrow()) {
            socialBadgeAtomView3.showArrow(badge.getArrowColor());
        } else {
            socialBadgeAtomView3.hideArrow();
        }
    }

    private final void setIcon(String iconSrc) {
        final ViewSocialLargeProductBinding viewSocialLargeProductBinding = this.binding;
        AppCompatImageView iconView = viewSocialLargeProductBinding.iconView;
        Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
        ImageViewExtKt.load$default(iconView, iconSrc, null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.large.LargeProductView$setIcon$1$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                AppCompatImageView iconView2 = ViewSocialLargeProductBinding.this.iconView;
                Intrinsics.checkNotNullExpressionValue(iconView2, "iconView");
                ViewExtKt.show(iconView2);
            }
        }, null, null, false, null, 122, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ViewParent parent = getParent();
        SocialProductListView socialProductListView = parent instanceof SocialProductListView ? (SocialProductListView) parent : null;
        Integer valueOf = socialProductListView != null ? Integer.valueOf(socialProductListView.getAvailableRightWidthInList(this, this.minimalWidth)) : null;
        if (valueOf != null) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(valueOf.intValue(), 1073741824);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setup(@NotNull LargeProductVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        ViewSocialLargeProductBinding viewSocialLargeProductBinding = this.binding;
        AppCompatImageView imageView = viewSocialLargeProductBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ImageViewExtKt.load$default(imageView, vo.getImage(), C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(this.imageRadius, null, 2, null)), null, null, null, false, null, 124, null);
        viewSocialLargeProductBinding.priceView.setText(vo.getPrice());
        viewSocialLargeProductBinding.priceOriginalView.setText(vo.getOriginalPrice());
        if (vo.getIcon() != null) {
            SocialBadgeAtomView socialBadgeAtomView = viewSocialLargeProductBinding.socialBadgeAtomView;
            Intrinsics.checkNotNullExpressionValue(socialBadgeAtomView, "socialBadgeAtomView");
            ViewExtKt.gone(socialBadgeAtomView);
            setIcon(vo.getIcon());
        } else {
            AppCompatImageView iconView = viewSocialLargeProductBinding.iconView;
            Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
            ViewExtKt.gone(iconView);
            setBadge(vo.getBadge());
        }
        viewSocialLargeProductBinding.descriptionView.setText(vo.getDescription());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeProductView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.minimalWidth = ResourceExtKt.toPx(230);
        this.imageRadius = ResourceExtKt.toPx(6);
        ViewSocialLargeProductBinding inflate = ViewSocialLargeProductBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setLayoutParams(new ConstraintLayout.b(-2, ResourceExtKt.toPx(52)));
        setBackgroundResource(R$drawable.ic_bg_product);
        ViewExtKt.updatePadding$default(this, 0, 0, ResourceExtKt.toPx(10), 0, 11, null);
        setId(R$id.socialLargeProduct);
    }
}
