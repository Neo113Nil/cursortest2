package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import q1.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean checkAbsoluteGravity(int i5, int i10) {
        return (Gravity.getAbsoluteGravity(i5, this.view.getLayoutDirection()) & i10) == i10;
    }

    private int getEdgeMargin(boolean z5) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z5 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v5 = this.view;
        if (v5 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v5;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i5), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(@NonNull e.a aVar, final int i5, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z5 = aVar.f8391d == 0;
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i5, 3);
        float scaleX = (this.view.getScaleX() * this.view.getWidth()) + getEdgeMargin(checkAbsoluteGravity);
        V v5 = this.view;
        Property property = View.TRANSLATION_X;
        if (checkAbsoluteGravity) {
            scaleX = -scaleX;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v5, (Property<V, Float>) property, scaleX);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new b());
        ofFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, aVar.f8390c));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z5, i5);
            }
        });
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void startBackProgress(@NonNull e.a aVar) {
        super.onStartBackProgress(aVar);
    }

    public void updateBackProgress(@NonNull e.a aVar, int i5) {
        if (super.onUpdateBackProgress(aVar) == null) {
            return;
        }
        updateBackProgress(aVar.f8390c, aVar.f8391d == 0, i5);
    }

    public void updateBackProgress(float f6, boolean z5, int i5) {
        float interpolateProgress = interpolateProgress(f6);
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i5, 3);
        boolean z7 = z5 == checkAbsoluteGravity;
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        float f10 = width;
        if (f10 > 0.0f) {
            float f11 = height;
            if (f11 <= 0.0f) {
                return;
            }
            float f12 = this.maxScaleXDistanceShrink / f10;
            float f13 = this.maxScaleXDistanceGrow / f10;
            float f14 = this.maxScaleYDistance / f11;
            V v5 = this.view;
            if (checkAbsoluteGravity) {
                f10 = 0.0f;
            }
            v5.setPivotX(f10);
            if (!z7) {
                f13 = -f12;
            }
            float lerp = AnimationUtils.lerp(0.0f, f13, interpolateProgress);
            float f15 = lerp + 1.0f;
            float lerp2 = 1.0f - AnimationUtils.lerp(0.0f, f14, interpolateProgress);
            if (Float.isNaN(f15) || Float.isNaN(lerp2)) {
                return;
            }
            this.view.setScaleX(f15);
            this.view.setScaleY(lerp2);
            V v10 = this.view;
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    childAt.setPivotX(checkAbsoluteGravity ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f16 = z7 ? 1.0f - lerp : 1.0f;
                    float f17 = lerp2 != 0.0f ? (f15 / lerp2) * f16 : 1.0f;
                    if (!Float.isNaN(f16) && !Float.isNaN(f17)) {
                        childAt.setScaleX(f16);
                        childAt.setScaleY(f17);
                    }
                }
            }
        }
    }
}
