package ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0014J3\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001a\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/CollageGroupView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "halfGap", "", "onLayout", "", "changed", "", "left", "top", "right", "bottom", "setData", "urls", "", "", "radiusPx", "", "bgColor", "paranjaColor", "(Ljava/util/List;Ljava/lang/Float;II)V", "layoutTwoImages", "layoutThreeImages", "layoutFourImages", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CollageGroupView extends ViewGroup {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final CornerRadius DEFAULT_INNER_RADIUS = CornerRadius.RADIUS_300;
    private final int halfGap;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/CollageGroupView$Companion;", "", "<init>", "()V", "", "DEFAULT_GAP", "I", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollageGroupView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.halfGap = UiExtKt.toPx(2) / 2;
    }

    private final void layoutFourImages() {
        int i11;
        int width = (getWidth() / 2) - this.halfGap;
        int height = (getHeight() / 2) + this.halfGap;
        View childAt = getChildAt(0);
        CollageItemView collageItemView = childAt instanceof CollageItemView ? (CollageItemView) childAt : null;
        if (collageItemView != null) {
            collageItemView.layout(0, 0, (getWidth() / 2) - this.halfGap, (getHeight() / 2) - this.halfGap, width);
        }
        View childAt2 = getChildAt(1);
        CollageItemView collageItemView2 = childAt2 instanceof CollageItemView ? (CollageItemView) childAt2 : null;
        if (collageItemView2 != null) {
            collageItemView2.layout(this.halfGap + (getWidth() / 2), 0, getWidth(), (getHeight() / 2) - this.halfGap, width);
        }
        View childAt3 = getChildAt(2);
        CollageItemView collageItemView3 = childAt3 instanceof CollageItemView ? (CollageItemView) childAt3 : null;
        if (collageItemView3 != null) {
            i11 = height;
            collageItemView3.layout(0, i11, (getWidth() / 2) - this.halfGap, getHeight(), width);
        } else {
            i11 = height;
        }
        View childAt4 = getChildAt(3);
        CollageItemView collageItemView4 = childAt4 instanceof CollageItemView ? (CollageItemView) childAt4 : null;
        if (collageItemView4 != null) {
            collageItemView4.layout((getWidth() / 2) + this.halfGap, i11, getWidth(), getHeight(), width);
        }
    }

    private final void layoutThreeImages() {
        int i11;
        int width = (getWidth() / 2) - this.halfGap;
        int height = (getHeight() / 2) + this.halfGap;
        View childAt = getChildAt(0);
        CollageItemView collageItemView = childAt instanceof CollageItemView ? (CollageItemView) childAt : null;
        if (collageItemView != null) {
            collageItemView.layout(0, 0, getWidth(), (getHeight() / 2) - this.halfGap, width);
        }
        View childAt2 = getChildAt(1);
        CollageItemView collageItemView2 = childAt2 instanceof CollageItemView ? (CollageItemView) childAt2 : null;
        if (collageItemView2 != null) {
            i11 = height;
            collageItemView2.layout(0, i11, width, getHeight(), width);
        } else {
            i11 = height;
        }
        View childAt3 = getChildAt(2);
        CollageItemView collageItemView3 = childAt3 instanceof CollageItemView ? (CollageItemView) childAt3 : null;
        if (collageItemView3 != null) {
            collageItemView3.layout((getWidth() / 2) + this.halfGap, i11, getWidth(), getHeight(), width);
        }
    }

    private final void layoutTwoImages() {
        int width = (getWidth() / 2) - this.halfGap;
        View childAt = getChildAt(0);
        CollageItemView collageItemView = childAt instanceof CollageItemView ? (CollageItemView) childAt : null;
        if (collageItemView != null) {
            collageItemView.layout(0, 0, width, getHeight(), width);
        }
        View childAt2 = getChildAt(1);
        CollageItemView collageItemView2 = childAt2 instanceof CollageItemView ? (CollageItemView) childAt2 : null;
        if (collageItemView2 != null) {
            collageItemView2.layout((getWidth() / 2) + this.halfGap, 0, getWidth(), getHeight(), width);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int childCount = getChildCount();
        if (childCount == 2) {
            layoutTwoImages();
        } else if (childCount == 3) {
            layoutThreeImages();
        } else {
            if (childCount != 4) {
                return;
            }
            layoutFourImages();
        }
    }

    public final void setData(@NotNull List<String> urls, Float radiusPx, int bgColor, int paranjaColor) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        float floatValue = radiusPx != null ? radiusPx.floatValue() : UiExtKt.toPxF(DEFAULT_INNER_RADIUS.getPx());
        removeAllViews();
        for (String str : urls) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(bgColor);
            gradientDrawable.setCornerRadius(floatValue);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(paranjaColor);
            gradientDrawable2.setCornerRadius(floatValue);
            List<? extends ImageTransformation> a02 = C7714v.a0(new ImageTransformation.RoundedCorners((int) floatValue, null, 2, null));
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CollageItemView collageItemView = new CollageItemView(context, null, 0, 6, null);
            addView(collageItemView);
            collageItemView.bind(str, gradientDrawable, gradientDrawable2, a02);
        }
    }
}
