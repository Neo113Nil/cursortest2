package ru.ozon.fintech.features.camera.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J'\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/fintech/features/camera/ui/FeedbackCircleView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "inner", "Landroid/widget/ImageView;", "outer", "animatorSet", "Landroid/animation/AnimatorSet;", "showAt", "", "x", "", "y", "newAnimator", "Landroid/animation/Animator;", "kotlin.jvm.PlatformType", "id", "target", "Landroid/view/View;", "(ILandroid/view/View;)Landroid/animation/Animator;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeedbackCircleView extends FrameLayout {

    @NotNull
    private final AnimatorSet animatorSet;

    @NotNull
    private final ImageView inner;

    @NotNull
    private final ImageView outer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeedbackCircleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Animator newAnimator(int id2, View target) {
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), id2);
        loadAnimator.setTarget(target);
        return loadAnimator;
    }

    public final void showAt(float x11, float y11) {
        setTranslationX(x11);
        setTranslationY(y11);
        this.animatorSet.cancel();
        this.animatorSet.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeedbackCircleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FeedbackCircleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackCircleView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context, attributeSet, i11);
        imageView.setImageResource(R.drawable.fintech_focus_inner);
        context.getResources();
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setAlpha(0.0f);
        this.inner = imageView;
        ImageView imageView2 = new ImageView(context, attributeSet, i11);
        imageView2.setImageResource(R.drawable.fintech_focus_outer);
        context.getResources();
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView2.setAlpha(0.0f);
        this.outer = imageView2;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(newAnimator(R.animator.focus_outer, imageView2), newAnimator(R.animator.focus_inner, imageView));
        this.animatorSet = animatorSet;
        Resources resources = context.getResources();
        setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(R.dimen.focus_diameter), resources.getDimensionPixelSize(R.dimen.focus_diameter)));
        setClipToPadding(false);
        setClipChildren(false);
        addView(imageView2);
        addView(imageView);
    }
}
