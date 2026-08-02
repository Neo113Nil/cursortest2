package com.vk.clips.design.view.recording;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.igl0;
import xsna.jgl0;

/* compiled from: StopwatchView.kt */
/* loaded from: classes.dex */
public final class StopwatchView extends TextSwitcher {
    public static final /* synthetic */ int l = 0;
    public int b;
    public final ArrayList<a> c;
    public final igl0 d;
    public final jgl0 e;
    public final long f;
    public int g;
    public float h;
    public long i;
    public boolean j;
    public boolean k;

    /* compiled from: StopwatchView.kt */
    public interface a {
        void a(StopwatchView stopwatchView);

        void b(StopwatchView stopwatchView);

        void c();

        void d(StopwatchView stopwatchView);

        void e();

        void f(StopwatchView stopwatchView);
    }

    public StopwatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 3;
        this.c = new ArrayList<>();
        this.d = new igl0(this, 0);
        this.e = new jgl0(this, 0);
        this.g = -1;
        this.h = TypedValue.applyDimension(2, 256.0f, getResources().getDisplayMetrics());
        this.f = getResources().getInteger(R.integer.config_shortAnimTime);
    }

    private final long getElapsedSec() {
        return this.b - this.i;
    }

    public final void a(boolean z) {
        ArrayList<a> arrayList = this.c;
        if (z) {
            this.k = true;
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
            return;
        }
        c();
        Iterator<a> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f(this);
        }
        this.k = false;
    }

    public final void b() {
        if (this.k) {
            long currentTimeMillis = System.currentTimeMillis();
            c();
            this.i = this.b;
            int childCount = getChildCount();
            long j = this.f;
            if (childCount == 0) {
                TextView textView = new TextView(getContext());
                TextView textView2 = new TextView(getContext());
                textView.setIncludeFontPadding(false);
                textView.setTextSize(0, this.h);
                textView.setTextColor(this.g);
                textView2.setIncludeFontPadding(false);
                textView2.setTextSize(0, this.h);
                textView2.setTextColor(this.g);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                addView(textView, layoutParams);
                addView(textView2, layoutParams);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.setDuration(j);
                animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                long j2 = 4;
                alphaAnimation.setDuration(animationSet.getDuration() / j2);
                animationSet.addAnimation(alphaAnimation);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 3.0f, 1.0f, 3.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(animationSet.getDuration() / j2);
                animationSet.addAnimation(scaleAnimation);
                AnimationSet animationSet2 = new AnimationSet(true);
                animationSet2.setDuration(j);
                animationSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                alphaAnimation2.setDuration(animationSet2.getDuration() / j2);
                animationSet2.addAnimation(alphaAnimation2);
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(animationSet2.getDuration() / j2);
                animationSet2.addAnimation(scaleAnimation2);
                setInAnimation(animationSet2);
                setOutAnimation(animationSet);
            }
            reset();
            setText(String.valueOf(this.b));
            postDelayed(this.e, ((1000 - System.currentTimeMillis()) + currentTimeMillis) - j);
            this.j = true;
            System.currentTimeMillis();
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().d(this);
            }
        }
    }

    public final void c() {
        removeCallbacks(this.e);
        removeCallbacks(this.d);
        if (this.j) {
            this.j = false;
            System.currentTimeMillis();
            getElapsedSec();
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.k;
    }

    public final void setDuration(int i) {
        this.b = i;
    }

    public final void setTextColor(int i) {
        if (this.g != i) {
            this.g = i;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ((TextView) getChildAt(i2)).setTextColor(i);
            }
        }
    }

    public final void setTextSizePix(float f) {
        if (this.h == f) {
            return;
        }
        this.h = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((TextView) getChildAt(i)).setTextSize(0, f);
        }
    }
}
