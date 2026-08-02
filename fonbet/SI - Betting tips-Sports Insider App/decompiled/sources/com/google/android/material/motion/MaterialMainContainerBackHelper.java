package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ViewUtils;
import d9.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private static final float MIN_SCALE = 0.9f;
    private float[] expandedCornerRadii;
    private Rect initialHideFromClipBounds;
    private Rect initialHideToClipBounds;
    private float initialTouchY;
    private final float maxTranslationY;
    private final float minEdgeGap;

    public MaterialMainContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.minEdgeGap = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.maxTranslationY = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    private float[] calculateExpandedCornerRadii() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.view.getRootWindowInsets()) == null) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        DisplayMetrics displayMetrics = this.view.getResources().getDisplayMetrics();
        int i5 = displayMetrics.widthPixels;
        int i10 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        this.view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        int roundedCornerRadius = (i11 == 0 && i12 == 0) ? getRoundedCornerRadius(rootWindowInsets, 0) : 0;
        int i13 = width + i11;
        int roundedCornerRadius2 = (i13 < i5 || i12 != 0) ? 0 : getRoundedCornerRadius(rootWindowInsets, 1);
        int roundedCornerRadius3 = (i13 < i5 || i12 + height < i10) ? 0 : getRoundedCornerRadius(rootWindowInsets, 2);
        int roundedCornerRadius4 = (i11 != 0 || i12 + height < i10) ? 0 : getRoundedCornerRadius(rootWindowInsets, 3);
        float f6 = roundedCornerRadius;
        float f10 = roundedCornerRadius2;
        float f11 = roundedCornerRadius3;
        float f12 = roundedCornerRadius4;
        return new float[]{f6, f6, f10, f10, f11, f11, f12, f12};
    }

    @NonNull
    private ValueAnimator createCornerAnimator(ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new a(), clippableRoundedCornerLayout.getCornerRadii(), getExpandedCornerRadii());
        ofObject.addUpdateListener(new f1(1, clippableRoundedCornerLayout));
        return ofObject;
    }

    @NonNull
    private AnimatorSet createResetScaleAndTranslationAnimator(final View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialMainContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view2 = view;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    private int getRoundedCornerRadius(WindowInsets windowInsets, int i5) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i5);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$createCornerAnimator$0(float f6, Object obj, Object obj2) {
        return lerpCornerRadii((float[]) obj, (float[]) obj2, f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createCornerAnimator$1(ClippableRoundedCornerLayout clippableRoundedCornerLayout, ValueAnimator valueAnimator) {
        clippableRoundedCornerLayout.updateCornerRadii((float[]) valueAnimator.getAnimatedValue());
    }

    private static float[] lerpCornerRadii(float[] fArr, float[] fArr2, float f6) {
        return new float[]{AnimationUtils.lerp(fArr[0], fArr2[0], f6), AnimationUtils.lerp(fArr[1], fArr2[1], f6), AnimationUtils.lerp(fArr[2], fArr2[2], f6), AnimationUtils.lerp(fArr[3], fArr2[3], f6), AnimationUtils.lerp(fArr[4], fArr2[4], f6), AnimationUtils.lerp(fArr[5], fArr2[5], f6), AnimationUtils.lerp(fArr[6], fArr2[6], f6), AnimationUtils.lerp(fArr[7], fArr2[7], f6)};
    }

    private void resetInitialValues() {
        this.initialTouchY = 0.0f;
        this.initialHideToClipBounds = null;
        this.initialHideFromClipBounds = null;
    }

    public void cancelBackProgress(View view) {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet createResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view);
        V v5 = this.view;
        if (v5 instanceof ClippableRoundedCornerLayout) {
            createResetScaleAndTranslationAnimator.playTogether(createCornerAnimator((ClippableRoundedCornerLayout) v5));
        }
        createResetScaleAndTranslationAnimator.setDuration(this.cancelDuration);
        createResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    public void clearExpandedCornerRadii() {
        this.expandedCornerRadii = null;
    }

    public void finishBackProgress(long j, View view) {
        AnimatorSet createResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view);
        createResetScaleAndTranslationAnimator.setDuration(j);
        createResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    @NonNull
    public float[] getExpandedCornerRadii() {
        if (this.expandedCornerRadii == null) {
            this.expandedCornerRadii = calculateExpandedCornerRadii();
        }
        return this.expandedCornerRadii;
    }

    public Rect getInitialHideFromClipBounds() {
        return this.initialHideFromClipBounds;
    }

    public Rect getInitialHideToClipBounds() {
        return this.initialHideToClipBounds;
    }

    public void startBackProgress(@NonNull e.a aVar, View view) {
        super.onStartBackProgress(aVar);
        startBackProgress(aVar.f8389b, view);
    }

    public void updateBackProgress(@NonNull e.a aVar, View view, float f6) {
        if (super.onUpdateBackProgress(aVar) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        updateBackProgress(aVar.f8390c, aVar.f8391d == 0, aVar.f8389b, f6);
    }

    public void startBackProgress(float f6, View view) {
        this.initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.view);
        if (view != null) {
            this.initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.view, view);
        }
        this.initialTouchY = f6;
    }

    public void updateBackProgress(float f6, boolean z5, float f10, float f11) {
        float interpolateProgress = interpolateProgress(f6);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float lerp = AnimationUtils.lerp(1.0f, MIN_SCALE, interpolateProgress);
        float lerp2 = AnimationUtils.lerp(0.0f, Math.max(0.0f, e.d(width, MIN_SCALE, width, 2.0f) - this.minEdgeGap), interpolateProgress) * (z5 ? 1 : -1);
        float min = Math.min(Math.max(0.0f, e.d(lerp, height, height, 2.0f) - this.minEdgeGap), this.maxTranslationY);
        float f12 = f10 - this.initialTouchY;
        float lerp3 = AnimationUtils.lerp(0.0f, min, Math.abs(f12) / height) * Math.signum(f12);
        if (Float.isNaN(lerp) || Float.isNaN(lerp2) || Float.isNaN(lerp3)) {
            return;
        }
        this.view.setScaleX(lerp);
        this.view.setScaleY(lerp);
        this.view.setTranslationX(lerp2);
        this.view.setTranslationY(lerp3);
        V v5 = this.view;
        if (v5 instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) v5).updateCornerRadii(lerpCornerRadii(getExpandedCornerRadii(), f11, interpolateProgress));
        }
    }

    private static float[] lerpCornerRadii(float[] fArr, float f6, float f10) {
        return new float[]{AnimationUtils.lerp(fArr[0], f6, f10), AnimationUtils.lerp(fArr[1], f6, f10), AnimationUtils.lerp(fArr[2], f6, f10), AnimationUtils.lerp(fArr[3], f6, f10), AnimationUtils.lerp(fArr[4], f6, f10), AnimationUtils.lerp(fArr[5], f6, f10), AnimationUtils.lerp(fArr[6], f6, f10), AnimationUtils.lerp(fArr[7], f6, f10)};
    }
}
