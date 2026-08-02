package com.vk.feed.design.view.newsfeed.reactionstack;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedReactionsStack;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.bwt0;
import xsna.cn70;
import xsna.f4m;
import xsna.krh;
import xsna.ldl;
import xsna.msy;
import xsna.pkk;

/* compiled from: FeedReactionsStack.kt */
/* loaded from: classes18.dex */
public final class FeedReactionsStack extends FluidHorizontalLayout {
    public static final int r = cn70.b(20);
    public final LinearLayout g;
    public final FeedMiniReactionsStack h;
    public final VkText i;
    public AnimatorSet j;
    public AnimatorSet k;
    public final Object l;
    public final Object m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;

    public FeedReactionsStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        krh krhVar = new krh(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, krhVar);
        this.m = msy.a(lazyThreadSafetyMode, new ldl(this, 11));
        LayoutInflater.from(context).inflate(R.layout.feed_reactions_stack, (ViewGroup) this, true);
        this.g = (LinearLayout) findViewById(R.id.reactions_stack_container);
        this.h = (FeedMiniReactionsStack) findViewById(R.id.reactions_stack);
        this.i = (VkText) findViewById(R.id.reactions_text);
    }

    private final int getHideFrom() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Integer valueOf = layoutParams != null ? Integer.valueOf(layoutParams.height) : null;
        return (valueOf != null && valueOf.intValue() == -2) ? getHeight() > 0 ? getHeight() : getMinimumHeight() : valueOf != null ? valueOf.intValue() : getHeight();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Runnable getHideRunnable() {
        return (Runnable) this.m.getValue();
    }

    private final Animator getShowCounterAnimator() {
        VkText vkText = this.i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) View.ALPHA, vkText.getAlpha(), 1.0f);
        ofFloat.setStartDelay(5L);
        ofFloat.setInterpolator(new pkk(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f));
        ofFloat.setDuration(145L);
        return ofFloat;
    }

    private final Animator getShowReactionAnimator() {
        FeedMiniReactionsStack feedMiniReactionsStack = this.h;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(feedMiniReactionsStack, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, feedMiniReactionsStack.getScaleX(), 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, feedMiniReactionsStack.getScaleY(), 1.0f));
        ofPropertyValuesHolder.setStartDelay(5L);
        ofPropertyValuesHolder.setInterpolator(new pkk(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f));
        ofPropertyValuesHolder.setDuration(145L);
        return ofPropertyValuesHolder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Runnable getShowRunnable() {
        return (Runnable) this.l.getValue();
    }

    public final boolean getHideAnimatorSetRunning() {
        return this.o;
    }

    public final int getInsetBottom() {
        return this.q;
    }

    public final int getInsetTop() {
        return this.p;
    }

    public final boolean getShowAnimatorSetRunning() {
        return this.n;
    }

    public final void h() {
        removeCallbacks(getShowRunnable());
        removeCallbacks(getHideRunnable());
        AnimatorSet animatorSet = this.j;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.k;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.j = null;
        this.k = null;
        this.n = false;
        this.o = false;
    }

    public final void i(final RecyclerView recyclerView) {
        h();
        int hideFrom = getHideFrom();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight < 0) {
            minimumHeight = 0;
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = hideFrom;
        ValueAnimator ofInt = ValueAnimator.ofInt(hideFrom, minimumHeight);
        ofInt.setInterpolator(new pkk(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.o3r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = FeedReactionsStack.r;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                int i2 = intValue - ref$IntRef2.element;
                ref$IntRef2.element = intValue;
                RecyclerView recyclerView2 = recyclerView;
                if (recyclerView2 != null) {
                    FeedReactionsStack feedReactionsStack = this;
                    feedReactionsStack.getClass();
                    recyclerView2.post(new p3r(recyclerView2, i2, feedReactionsStack, intValue));
                }
            }
        });
        ofInt.setDuration(150L);
        FeedMiniReactionsStack feedMiniReactionsStack = this.h;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(feedMiniReactionsStack, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, feedMiniReactionsStack.getScaleX(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, feedMiniReactionsStack.getScaleY(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        ofPropertyValuesHolder.setInterpolator(new pkk(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f));
        ofPropertyValuesHolder.setDuration(145L);
        VkText vkText = this.i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) View.ALPHA, vkText.getAlpha(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setInterpolator(new pkk(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f));
        ofFloat.setDuration(145L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofPropertyValuesHolder, ofFloat);
        this.k = animatorSet;
        this.o = true;
        animatorSet.start();
        postOnAnimationDelayed(getHideRunnable(), 150L);
    }

    public final void j(final RecyclerView recyclerView) {
        h();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Integer valueOf = layoutParams != null ? Integer.valueOf(layoutParams.height) : null;
        int height = (valueOf != null && valueOf.intValue() == -2) ? getHeight() > 0 ? getHeight() : getMinimumHeight() : valueOf != null ? valueOf.intValue() : getHeight();
        int i = r + this.p + this.q;
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = height;
        ValueAnimator ofInt = ValueAnimator.ofInt(height, i);
        ofInt.setInterpolator(new pkk(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.n3r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = FeedReactionsStack.r;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                int i3 = intValue - ref$IntRef2.element;
                ref$IntRef2.element = intValue;
                RecyclerView recyclerView2 = recyclerView;
                if (recyclerView2 != null) {
                    FeedReactionsStack feedReactionsStack = this;
                    feedReactionsStack.getClass();
                    recyclerView2.post(new p3r(recyclerView2, i3, feedReactionsStack, intValue));
                }
            }
        });
        ofInt.setDuration(150L);
        bwt0.p0(this, true);
        bwt0.p0(this.g, true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, getShowReactionAnimator(), getShowCounterAnimator());
        this.j = animatorSet;
        this.n = true;
        animatorSet.start();
        postOnAnimationDelayed(getShowRunnable(), 150L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h();
        super.onDetachedFromWindow();
    }

    public final void setHideAnimatorSetRunning(boolean z) {
        this.o = z;
    }

    public final void setInsetBottom(int i) {
        f4m.v(i, this);
        this.q = i;
    }

    public final void setInsetTop(int i) {
        f4m.y(i, this);
        this.p = i;
    }

    public final void setOnStackClickListener(View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.g;
        linearLayout.setBackgroundResource(R.drawable.highlight);
        linearLayout.setOnClickListener(onClickListener);
    }

    public final void setReactionsUrl(List<String> list) {
        this.h.setReactions(list);
    }

    public final void setShowAnimatorSetRunning(boolean z) {
        this.n = z;
    }

    public final void setStackContentDescription(String str) {
        LinearLayout linearLayout = this.g;
        if (str == null) {
            linearLayout.setContentDescription(null);
            linearLayout.setImportantForAccessibility(2);
        } else {
            linearLayout.setContentDescription(str);
            linearLayout.setImportantForAccessibility(1);
        }
    }

    public final void setText(String str) {
        this.i.setText(str);
    }
}
