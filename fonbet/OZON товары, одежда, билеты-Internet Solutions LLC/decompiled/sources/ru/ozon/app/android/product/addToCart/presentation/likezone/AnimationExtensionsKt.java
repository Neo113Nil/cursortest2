package ru.ozon.app.android.product.addToCart.presentation.likezone;

import Sc.r;
import Sc.s;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroid/view/View;", "", "durationMs", "Lkotlin/Function0;", "", "onEnd", "fadeOut", "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V", "fadeIn", "(Landroid/view/View;J)V", "", "targetMargin", "animateLeftMarginChange", "(Landroid/view/View;IJ)V", "Landroid/graphics/Bitmap;", "createSnapshotBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "bitmap", "Landroid/widget/ImageView;", "createSnapshotView", "(Landroid/view/View;Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/widget/ImageView;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnimationExtensionsKt {
    public static final void animateLeftMarginChange(@NotNull View view, int i11, long j11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ValueAnimator ofInt = ValueAnimator.ofInt(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11);
        ofInt.setDuration(j11);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new CF.a(view, 0));
        ofInt.start();
    }

    public static /* synthetic */ void animateLeftMarginChange$default(View view, int i11, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = 300;
        }
        animateLeftMarginChange(view, i11, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLeftMarginChange$lambda$5$lambda$4(View view, ValueAnimator valueAnimator) {
        int intValue = ((Integer) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = intValue;
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bitmap createSnapshotBitmap(@NotNull View view) {
        r.b bVar;
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            r.Companion companion = r.INSTANCE;
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            bVar = createBitmap;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            bVar = s.a(th2);
        }
        boolean z11 = bVar instanceof r.b;
        Object obj = bVar;
        if (z11) {
            obj = null;
        }
        return (Bitmap) obj;
    }

    @NotNull
    public static final ImageView createSnapshotView(@NotNull View view, @NotNull Context context, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
        layoutParams.leftMargin = view.getLeft();
        layoutParams.topMargin = view.getTop();
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(bitmap);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public static final void fadeIn(@NotNull View view, long j11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(j11);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
        view.setVisibility(0);
    }

    public static /* synthetic */ void fadeIn$default(View view, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 300;
        }
        fadeIn(view, j11);
    }

    public static final void fadeOut(@NotNull final View view, long j11, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(j11);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.AnimationExtensionsKt$fadeOut$lambda$1$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                view.setVisibility(8);
                view.setAlpha(1.0f);
                Function0 function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofFloat.start();
    }

    public static /* synthetic */ void fadeOut$default(View view, long j11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 300;
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        fadeOut(view, j11, function0);
    }
}
