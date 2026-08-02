package ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J.\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/CollageItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "bind", "", "imageUrl", "", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "paranjaDrawable", "transformations", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "layout", "selfLeft", "selfTop", "selfRight", "selfBottom", "imageSize", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CollageItemView extends FrameLayout {

    @NotNull
    private final AppCompatImageView imageView;

    public /* synthetic */ CollageItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull String imageUrl, @NotNull GradientDrawable backgroundDrawable, @NotNull GradientDrawable paranjaDrawable, @NotNull List<? extends ImageTransformation> transformations) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(backgroundDrawable, "backgroundDrawable");
        Intrinsics.checkNotNullParameter(paranjaDrawable, "paranjaDrawable");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        setBackground(new LayerDrawable(new GradientDrawable[]{backgroundDrawable, paranjaDrawable}));
        ImageViewExtKt.load$default(this.imageView, imageUrl, transformations, null, null, null, false, null, 124, null);
    }

    public final void layout(int selfLeft, int selfTop, int selfRight, int selfBottom, int imageSize) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(imageSize, 1073741824);
        this.imageView.measure(makeMeasureSpec, makeMeasureSpec);
        layout(selfLeft, selfTop, selfRight, selfBottom);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollageItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.imageView = appCompatImageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(appCompatImageView);
    }
}
