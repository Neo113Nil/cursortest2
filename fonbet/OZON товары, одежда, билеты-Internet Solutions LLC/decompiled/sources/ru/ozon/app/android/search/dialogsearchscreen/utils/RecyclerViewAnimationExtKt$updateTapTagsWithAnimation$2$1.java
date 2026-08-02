package ru.ozon.app.android.search.dialogsearchscreen.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.dialogsearchscreen.utils.RecyclerViewAnimationExtKt$updateTapTagsWithAnimation$2$1;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"ru/ozon/app/android/search/dialogsearchscreen/utils/RecyclerViewAnimationExtKt$updateTapTagsWithAnimation$2$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RecyclerViewAnimationExtKt$updateTapTagsWithAnimation$2$1 implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ int $animationTag;
    final /* synthetic */ int $oldHeight;
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener $tagListMarginListener;
    final /* synthetic */ Function0<View> $tagListProvider;
    final /* synthetic */ RecyclerView $this_updateTapTagsWithAnimation;

    /* JADX WARN: Multi-variable type inference failed */
    RecyclerViewAnimationExtKt$updateTapTagsWithAnimation$2$1(RecyclerView recyclerView, int i11, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, Function0<? extends View> function0, int i12) {
        this.$this_updateTapTagsWithAnimation = recyclerView;
        this.$oldHeight = i11;
        this.$tagListMarginListener = onGlobalLayoutListener;
        this.$tagListProvider = function0;
        this.$animationTag = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPreDraw$lambda$5$lambda$4(int i11, RecyclerView recyclerView, View view, int i12, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        if (num != null) {
            int intValue = num.intValue();
            int i13 = intValue - i11;
            recyclerView.getLayoutParams().height = intValue;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = i12 + i13;
                }
                view.requestLayout();
            }
            recyclerView.requestLayout();
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        final int i11;
        this.$this_updateTapTagsWithAnimation.getViewTreeObserver().removeOnPreDrawListener(this);
        int measuredHeight = this.$this_updateTapTagsWithAnimation.getMeasuredHeight();
        int i12 = this.$oldHeight;
        if (measuredHeight - i12 == 0 || i12 <= 0) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.$tagListMarginListener;
            if (onGlobalLayoutListener == null) {
                return true;
            }
            this.$this_updateTapTagsWithAnimation.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            return true;
        }
        this.$this_updateTapTagsWithAnimation.getLayoutParams().height = this.$oldHeight;
        this.$this_updateTapTagsWithAnimation.requestLayout();
        final View invoke = this.$tagListProvider.invoke();
        if (invoke != null) {
            ViewGroup.LayoutParams layoutParams = invoke.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                i11 = marginLayoutParams.topMargin;
                ValueAnimator ofInt = ValueAnimator.ofInt(this.$oldHeight, measuredHeight);
                final int i13 = this.$oldHeight;
                final RecyclerView recyclerView = this.$this_updateTapTagsWithAnimation;
                final int i14 = this.$animationTag;
                final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.$tagListMarginListener;
                ofInt.setDuration(200L);
                ofInt.setInterpolator(new DecelerateInterpolator());
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dI.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        RecyclerViewAnimationExtKt$updateTapTagsWithAnimation$2$1.onPreDraw$lambda$5$lambda$4(i13, recyclerView, invoke, i11, valueAnimator);
                    }
                });
                ofInt.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.search.dialogsearchscreen.utils.RecyclerViewAnimationExtKt$updateTapTagsWithAnimation$2$1$onPreDraw$animator$1$2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        RecyclerViewAnimationExtKt.onAnimationEnd(RecyclerView.this, i14, onGlobalLayoutListener2);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        RecyclerViewAnimationExtKt.onAnimationEnd(RecyclerView.this, i14, onGlobalLayoutListener2);
                    }
                });
                this.$this_updateTapTagsWithAnimation.setTag(this.$animationTag, ofInt);
                ofInt.start();
                return false;
            }
        }
        i11 = 0;
        ValueAnimator ofInt2 = ValueAnimator.ofInt(this.$oldHeight, measuredHeight);
        final int i132 = this.$oldHeight;
        final RecyclerView recyclerView2 = this.$this_updateTapTagsWithAnimation;
        final int i142 = this.$animationTag;
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener22 = this.$tagListMarginListener;
        ofInt2.setDuration(200L);
        ofInt2.setInterpolator(new DecelerateInterpolator());
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dI.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RecyclerViewAnimationExtKt$updateTapTagsWithAnimation$2$1.onPreDraw$lambda$5$lambda$4(i132, recyclerView2, invoke, i11, valueAnimator);
            }
        });
        ofInt2.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.search.dialogsearchscreen.utils.RecyclerViewAnimationExtKt$updateTapTagsWithAnimation$2$1$onPreDraw$animator$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                RecyclerViewAnimationExtKt.onAnimationEnd(RecyclerView.this, i142, onGlobalLayoutListener22);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                RecyclerViewAnimationExtKt.onAnimationEnd(RecyclerView.this, i142, onGlobalLayoutListener22);
            }
        });
        this.$this_updateTapTagsWithAnimation.setTag(this.$animationTag, ofInt2);
        ofInt2.start();
        return false;
    }
}
