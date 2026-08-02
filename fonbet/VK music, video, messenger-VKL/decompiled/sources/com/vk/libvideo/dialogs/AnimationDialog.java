package com.vk.libvideo.dialogs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.preview.PreviewImageView;
import com.vk.libvideo.design.view.swipe.layout.a;
import com.vk.libvideo.dialogs.AnimationDialog;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import defpackage.j;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.awt0;
import xsna.d3m;
import xsna.eo2;
import xsna.f4m;
import xsna.go2;
import xsna.ho2;
import xsna.io2;
import xsna.msy;
import xsna.pn10;
import xsna.tn10;

/* compiled from: AnimationDialog.kt */
/* loaded from: classes.dex */
public abstract class AnimationDialog extends BaseAnimationDialog {
    public static final /* synthetic */ int g0 = 0;
    public boolean e0;
    public final Object f0 = msy.a(LazyThreadSafetyMode.NONE, new j(this, 8));

    /* compiled from: AnimationDialog.kt */
    /* loaded from: classes14.dex */
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AnimationDialog animationDialog = AnimationDialog.this;
            animationDialog.S = null;
            animationDialog.R = null;
            animationDialog.T = null;
            com.vk.libvideo.design.view.swipe.layout.a aVar = animationDialog.O;
            if (aVar == null) {
                aVar = null;
            }
            aVar.setBackgroundAlpha(255);
            com.vk.libvideo.design.view.swipe.layout.a aVar2 = animationDialog.O;
            (aVar2 != null ? aVar2 : null).setVolume(1.0f);
            Iterator<T> it = animationDialog.ho().iterator();
            while (it.hasNext()) {
                ((View) it.next()).animate().alpha(1.0f).setDuration(150L).start();
            }
            animationDialog.qo();
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public void W6() {
        b(false);
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public boolean Wh() {
        return !this.Q && this.U == null && this.S == null && this.R == null && !this.e0;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void Yb() {
        this.Q = true;
        oo();
        eo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fcn
    public void b(boolean z) {
        pn10 pn10Var;
        pn10 pn10Var2;
        View b;
        tn10 jo;
        this.Q = true;
        if (this.e0) {
            Yb();
            return;
        }
        io2 io2Var = this.X;
        int i = 0;
        pn10 pn10Var3 = null;
        if ((io2Var != null && !io2Var.G()) || z) {
            View io2 = io();
            io2.clearAnimation();
            io2.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            io2.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(io2, (Property<View, Float>) View.ALPHA, io2.getAlpha(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            com.vk.libvideo.design.view.swipe.layout.a aVar = this.O;
            com.vk.libvideo.design.view.swipe.layout.a aVar2 = aVar != null ? aVar : null;
            a.C1235a c1235a = com.vk.libvideo.design.view.swipe.layout.a.o;
            if (aVar == null) {
                aVar = null;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar2, c1235a, aVar.getVolume(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            com.vk.libvideo.design.view.swipe.layout.a aVar3 = this.O;
            com.vk.libvideo.design.view.swipe.layout.a aVar4 = aVar3 != null ? aVar3 : null;
            a.b bVar = com.vk.libvideo.design.view.swipe.layout.a.p;
            if (aVar3 == null) {
                aVar3 = null;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aVar4, bVar, aVar3.getVideoViewsAlpha(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            com.vk.libvideo.design.view.swipe.layout.a aVar5 = this.O;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofInt(aVar5 != null ? aVar5 : null, com.vk.libvideo.design.view.swipe.layout.a.q, (aVar5 != null ? aVar5 : null).getBackgroundAlpha(), 0));
            animatorSet.addListener(new ho2(this));
            animatorSet.setDuration(BaseAnimationDialog.a.a());
            animatorSet.setInterpolator(BaseAnimationDialog.a.b());
            animatorSet.start();
            io2 io2Var2 = this.X;
            if (io2Var2 != null) {
                io2Var2.J();
            }
            this.U = animatorSet;
            return;
        }
        AnimatorSet animatorSet2 = this.U;
        if (animatorSet2 == null && (pn10Var = this.S) == null && (pn10Var2 = this.R) == null && animatorSet2 == null && pn10Var == null && pn10Var2 == null) {
            fo();
            View io3 = io();
            tn10 lo = lo();
            tn10 jo2 = jo();
            tn10 lo2 = lo();
            if (lo2 != null && (b = lo2.b()) != null && f4m.f(b) && (jo = jo()) != null) {
                ((PreviewImageView) jo).setVisibility(0);
            }
            Iterator<T> it = ho().iterator();
            while (it.hasNext()) {
                d3m.b((View) it.next(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            }
            io3.clearAnimation();
            po();
            com.vk.libvideo.design.view.swipe.layout.a aVar6 = this.O;
            if (aVar6 == null) {
                aVar6 = null;
            }
            final int backgroundAlpha = aVar6.getBackgroundAlpha();
            com.vk.libvideo.design.view.swipe.layout.a aVar7 = this.O;
            if (aVar7 == null) {
                aVar7 = null;
            }
            final float volume = aVar7.getVolume();
            com.vk.libvideo.design.view.swipe.layout.a aVar8 = this.O;
            if (aVar8 == null) {
                aVar8 = null;
            }
            final float videoViewsAlpha = aVar8.getVideoViewsAlpha();
            pn10 so = so(lo, true, true);
            if (so != null) {
                so.start();
            } else {
                so = null;
            }
            this.S = so;
            pn10 so2 = so(jo2, true, true);
            if (so2 != null) {
                so2.start();
                pn10Var3 = so2;
            }
            this.R = pn10Var3;
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat4.setDuration(this.N ? BaseAnimationDialog.a.a() : 0L);
            ofFloat4.setInterpolator(BaseAnimationDialog.a.b());
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.do2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i2 = AnimationDialog.g0;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float min = Math.min(((Float) valueAnimator.getAnimatedValue()).floatValue(), videoViewsAlpha);
                    AnimationDialog animationDialog = this;
                    com.vk.libvideo.design.view.swipe.layout.a aVar9 = animationDialog.O;
                    if (aVar9 == null) {
                        aVar9 = null;
                    }
                    aVar9.setVideoViewsAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, min - 0.5f));
                    com.vk.libvideo.design.view.swipe.layout.a aVar10 = animationDialog.O;
                    if (aVar10 == null) {
                        aVar10 = null;
                    }
                    aVar10.setBackgroundAlpha((int) (backgroundAlpha * floatValue));
                    com.vk.libvideo.design.view.swipe.layout.a aVar11 = animationDialog.O;
                    (aVar11 != null ? aVar11 : null).setVolume(volume * floatValue);
                }
            });
            ofFloat4.addListener(new go2(this, i));
            ofFloat4.start();
            this.T = ofFloat4;
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public float getVolume() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r2.orientation == 1) goto L6;
     */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z = to();
        this.e0 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r2.orientation == 1) goto L14;
     */
    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        Resources resources;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity activity = getActivity();
        Configuration configuration = (activity == null || (resources = activity.getResources()) == null) ? null : resources.getConfiguration();
        if (to()) {
            z = true;
            if (configuration != null) {
            }
            this.e0 = z;
            return onCreateView;
        }
        z = false;
        this.e0 = z;
        return onCreateView;
    }

    public final void ro() {
        View b;
        io2 io2Var = this.X;
        if (io2Var != null) {
            io2Var.e0();
        }
        tn10 lo = lo();
        if (lo != null && (b = lo.b()) != null) {
            b.setHasTransientState(true);
        }
        fo();
        View io2 = io();
        tn10 lo2 = lo();
        tn10 jo = jo();
        com.vk.libvideo.design.view.swipe.layout.a aVar = this.O;
        if (aVar == null) {
            aVar = null;
        }
        aVar.setBackgroundAlpha(0);
        Iterator<T> it = ho().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        awt0.t(io2, new eo2(this, lo2, jo, 0));
    }

    public final pn10 so(tn10 tn10Var, boolean z, boolean z2) {
        io2 io2Var = this.X;
        if (io2Var == null || tn10Var == null || tn10Var.getContentWidth() == 0 || tn10Var.getContentHeight() == 0) {
            return null;
        }
        long a2 = z ? BaseAnimationDialog.a.a() : 0L;
        Rect rect = new Rect();
        VideoResizer.a.b(rect, tn10Var.b());
        pn10 pn10Var = new pn10(io2Var.t0(), io2Var.g0(), io2Var.getContentScaleType(), (int) io2Var.i0(), rect, tn10Var.getContentScaleType(), 0, z2, tn10Var, 0);
        pn10Var.setDuration(a2);
        pn10Var.setInterpolator(BaseAnimationDialog.Z);
        return pn10Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean to() {
        return ((Boolean) this.f0.getValue()).booleanValue();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public void Lg() {
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public void fm() {
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public void setVolume(float f) {
    }
}
