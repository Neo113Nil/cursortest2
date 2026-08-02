package ru.ozon.app.android.uikit.view.shimmer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$styleable;
import ru.ozon.app.android.uikit.view.shimmer.Shimmer;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010\u000fJ\u000f\u0010+\u001a\u00020\u000bH\u0007¢\u0006\u0004\b+\u0010\u000fJ\r\u0010,\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0010H\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000bH\u0007¢\u0006\u0004\b0\u0010\u000fR\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00107R\u0016\u00108\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/uikit/view/shimmer/ShimmerFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "init", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onAttachedToWindow", "()V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "onDetachedFromWindow", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/drawable/Drawable;", "who", "verifyDrawable", "(Landroid/graphics/drawable/Drawable;)Z", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer;", "shimmer", "setShimmer", "(Lru/ozon/app/android/uikit/view/shimmer/Shimmer;)Lru/ozon/app/android/uikit/view/shimmer/ShimmerFrameLayout;", "startShimmer", "stopShimmer", "isShimmerStarted", "()Z", "showShimmer", "(Z)V", "hideShimmer", "Landroid/graphics/Paint;", "contentPaint", "Landroid/graphics/Paint;", "Lru/ozon/app/android/uikit/view/shimmer/ShimmerDrawable;", "shimmerDrawable", "Lru/ozon/app/android/uikit/view/shimmer/ShimmerDrawable;", "Z", "stoppedShimmerBecauseVisibility", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ShimmerFrameLayout extends FrameLayout {

    @NotNull
    private final Paint contentPaint;

    @NotNull
    private final ShimmerDrawable shimmerDrawable;
    private boolean showShimmer;
    private boolean stoppedShimmerBecauseVisibility;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void init(Context context, AttributeSet attrs) {
        setWillNotDraw(false);
        this.shimmerDrawable.setCallback(this);
        if (attrs == null) {
            setShimmer(new Shimmer.AlphaHighlightBuilder().build());
            return;
        }
        int[] ShimmerFrameLayout = R$styleable.ShimmerFrameLayout;
        Intrinsics.checkNotNullExpressionValue(ShimmerFrameLayout, "ShimmerFrameLayout");
        AttrsExtensionKt.obtain(attrs, context, ShimmerFrameLayout, 0, new ShimmerFrameLayout$init$1(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.showShimmer) {
            this.shimmerDrawable.draw(canvas);
        }
    }

    public final void hideShimmer() {
        stopShimmer();
        this.showShimmer = false;
        invalidate();
    }

    public final boolean isShimmerStarted() {
        return this.shimmerDrawable.isShimmerStarted();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.shimmerDrawable.maybeStartShimmer();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.shimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (visibility != 0) {
            if (isShimmerStarted()) {
                stopShimmer();
                this.stoppedShimmerBecauseVisibility = true;
                return;
            }
            return;
        }
        if (this.stoppedShimmerBecauseVisibility) {
            this.shimmerDrawable.maybeStartShimmer();
            this.stoppedShimmerBecauseVisibility = false;
        }
    }

    @NotNull
    public final ShimmerFrameLayout setShimmer(Shimmer shimmer) {
        this.shimmerDrawable.setShimmer(shimmer);
        if (shimmer == null || !shimmer.getClipToChildren()) {
            setLayerType(0, null);
            return this;
        }
        setLayerType(2, this.contentPaint);
        return this;
    }

    public final void showShimmer(boolean startShimmer) {
        this.showShimmer = true;
        if (startShimmer) {
            startShimmer();
        }
        invalidate();
    }

    public final void startShimmer() {
        this.shimmerDrawable.startShimmer();
    }

    public final void stopShimmer() {
        this.stoppedShimmerBecauseVisibility = false;
        this.shimmerDrawable.stopShimmer();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NotNull Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return super.verifyDrawable(who) || who == this.shimmerDrawable;
    }

    public /* synthetic */ ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.contentPaint = new Paint();
        this.shimmerDrawable = new ShimmerDrawable();
        this.showShimmer = true;
        init(context, attributeSet);
    }
}
