package com.vk.stories.design.view.viewer;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bwt0;
import xsna.e43;
import xsna.j5g;
import xsna.sim0;
import xsna.x0n0;
import xsna.zx0;

/* compiled from: AnimatedSubtitleView.kt */
/* loaded from: classes6.dex */
public final class AnimatedSubtitleView extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final ArrayList b;
    public final ArrayList c;
    public final Handler d;
    public a e;

    /* compiled from: AnimatedSubtitleView.kt */
    public final class a implements Runnable {
        public int b;
        public boolean c = true;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.b;
            AnimatedSubtitleView animatedSubtitleView = AnimatedSubtitleView.this;
            ArrayList arrayList = animatedSubtitleView.c;
            ArrayList arrayList2 = animatedSubtitleView.c;
            if (i < arrayList.size()) {
                AnimatorSet animatorSet = (AnimatorSet) arrayList2.get(this.b);
                animatorSet.start();
                if (this.c) {
                    ((Animator) j5g.Y(animatorSet.getChildAnimations())).end();
                    this.c = false;
                }
                int i2 = this.b + 1;
                this.b = i2;
                if (i2 == arrayList2.size()) {
                    this.b = 0;
                }
                animatedSubtitleView.d.postDelayed(this, 2560L);
            }
        }
    }

    public AnimatedSubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new Handler(Looper.getMainLooper());
        setClipToPadding(false);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.e;
        if (aVar != null) {
            this.d.removeCallbacks(aVar);
            this.e = null;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((AnimatorSet) it.next()).cancel();
        }
    }

    public final void setItems(List<x0n0> list) {
        a aVar = this.e;
        if (aVar != null) {
            this.d.removeCallbacks(aVar);
            this.e = null;
        }
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AnimatorSet) it.next()).cancel();
        }
        arrayList.clear();
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        arrayList2.addAll(list);
        removeAllViews();
        Iterator it2 = arrayList2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            x0n0 x0n0Var = (x0n0) next;
            sim0 sim0Var = new sim0(getContext(), null, 0);
            if (x0n0Var.i && x0n0Var.h != null) {
                bwt0.i0(sim0Var, new zx0(x0n0Var, 2));
            }
            if (i != 0) {
                sim0Var.setVisibility(8);
                sim0Var.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            sim0Var.setData(x0n0Var);
            addView(sim0Var);
            i = i2;
        }
    }
}
