package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.service;

import android.content.Context;
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
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.storefront.core.atoms.R$drawable;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.atoms.databinding.ViewSocialServiceBinding;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListView;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ViewSize;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/service/ServiceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "minimalLargeWidth", "smallWidth", "imageRadius", "viewSize", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ViewSize;", "binding", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewSocialServiceBinding;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setup", "vo", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/service/ServiceVO;", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceView extends ConstraintLayout {

    @NotNull
    private final ViewSocialServiceBinding binding;
    private final int imageRadius;
    private final int minimalLargeWidth;
    private final int smallWidth;
    private ViewSize viewSize;

    public /* synthetic */ ServiceView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.viewSize == ViewSize.SMALL) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.smallWidth, 1073741824);
        } else {
            ViewParent parent = getParent();
            SocialProductListView socialProductListView = parent instanceof SocialProductListView ? (SocialProductListView) parent : null;
            if (socialProductListView != null) {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(socialProductListView.getAvailableRightWidthInList(this, this.minimalLargeWidth), 1073741824);
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setup(@NotNull ServiceVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.viewSize = vo.getViewSize();
        AppCompatImageView imageView = this.binding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ImageViewExtKt.load$default(imageView, vo.getImage(), C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(this.imageRadius, null, 2, null)), null, null, null, false, null, 124, null);
        this.binding.titleView.setText(vo.getTitle());
        this.binding.descriptionView.setText(vo.getDescription());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.minimalLargeWidth = ResourceExtKt.toPx(230);
        this.smallWidth = ResourceExtKt.toPx(208);
        this.imageRadius = ResourceExtKt.toPx(6);
        ViewSocialServiceBinding inflate = ViewSocialServiceBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setLayoutParams(new ConstraintLayout.b(-2, ResourceExtKt.toPx(52)));
        setBackgroundResource(R$drawable.ic_bg_product);
        ViewExtKt.updatePadding$default(this, 0, 0, ResourceExtKt.toPx(10), 0, 11, null);
        setId(R$id.socialService);
    }
}
