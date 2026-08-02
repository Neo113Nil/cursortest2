package com.vk.clips.design.view.component.video.seekbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.Slider;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.clips.design.view.component.video.seekbar.model.SeekBarUpdateMode;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.cut0;
import xsna.d3i0;
import xsna.d3m;
import xsna.epx;
import xsna.f4m;
import xsna.icd;
import xsna.k3i0;
import xsna.kcd;
import xsna.kdx0;
import xsna.l3i0;
import xsna.l7s;
import xsna.lcd;
import xsna.mcd;
import xsna.msy;
import xsna.ncd;
import xsna.o4;
import xsna.q86;
import xsna.rn2;
import xsna.swe0;
import xsna.vut0;
import xsna.wut0;

/* compiled from: ClipSeekBarView.kt */
/* loaded from: classes16.dex */
public final class ClipSeekBarView extends LinearLayout {
    public static final /* synthetic */ int q = 0;
    public d3i0 b;
    public l3i0 c;
    public boolean d;
    public SeekBarUpdateMode e;
    public final Slider f;
    public final Object g;
    public final Object h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public ValueAnimator k;
    public ValueAnimator l;
    public vut0 m;
    public boolean n;
    public l3i0 o;
    public boolean p;

    public ClipSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = d3i0.c;
        this.c = l3i0.a.a;
        this.d = true;
        this.e = SeekBarUpdateMode.MANUAL;
        Slider slider = new Slider(new l7s(getContext(), R$style.Theme_MaterialComponents), null);
        slider.setId(R.id.clip_seekbar);
        slider.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        slider.setEnabled(false);
        slider.setLabelBehavior(2);
        slider.setHaloRadius(0);
        int i = -slider.getResources().getDimensionPixelSize(R$dimen.mtrl_slider_track_side_padding);
        ViewGroup.LayoutParams layoutParams = slider.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = slider.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        f4m.u(slider, i, i2, i, marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        slider.setValueFrom(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f = slider;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, new mcd(0, this, ClipSeekBarView.class, "createPreviewContainer", "createPreviewContainer()Landroid/widget/FrameLayout;", 0, 0));
        this.h = msy.a(lazyThreadSafetyMode, lcd.b);
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        setOrientation(1);
        setClipChildren(false);
        addView(slider);
        slider.a(new Slider.a() { // from class: xsna.jcd
            @Override // xsna.ti6
            public final void F0(BaseSlider baseSlider, float f, boolean z) {
                ClipSeekBarView.a(ClipSeekBarView.this, (Slider) baseSlider, f, z);
            }
        });
        slider.o.add(new ncd(this));
    }

    public static void a(ClipSeekBarView clipSeekBarView, Slider slider, float f, boolean z) {
        if (z) {
            if (slider.getWidth() != 0 && clipSeekBarView.n) {
                int width = slider.getWidth();
                ViewGroup.LayoutParams layoutParams = slider.getLayoutParams();
                float abs = width - Math.abs((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) * 2);
                clipSeekBarView.getSeekbarPreviewContainer().setTranslationX(swe0.f((((f - slider.getValueFrom()) / (slider.getValueTo() - slider.getValueFrom())) * abs) - (clipSeekBarView.getSeekbarPreviewContainer().getWidth() / 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, abs - clipSeekBarView.getSeekbarPreviewContainer().getWidth()));
            }
            vut0 vut0Var = clipSeekBarView.m;
            if (vut0Var != null) {
                vut0Var.c(new kcd(f));
            }
        }
        Iterator it = clipSeekBarView.i.iterator();
        while (it.hasNext()) {
            ((k3i0) it.next()).a(f, z);
        }
    }

    public static final void b(ClipSeekBarView clipSeekBarView, Slider slider, boolean z) {
        LinkedHashSet linkedHashSet = clipSeekBarView.i;
        if (clipSeekBarView.d) {
            float value = slider.getValue();
            clipSeekBarView.setSeeking(z);
            clipSeekBarView.c(z);
            if (clipSeekBarView.n) {
                if (z) {
                    d3m.c(clipSeekBarView.getSeekbarPreviewContainer(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new o4(clipSeekBarView, 5), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    d3m.e(clipSeekBarView.getSeekbarPreviewContainer(), (r15 & 1) != 0 ? 300L : 300L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new q86(clipSeekBarView, 3), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                }
            }
            if (z) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((k3i0) it.next()).c(value);
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    ((k3i0) it2.next()).b(value);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final kdx0 getClipLoaderDrawable() {
        return (kdx0) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getSeekbarPreviewContainer() {
        return (FrameLayout) this.g.getValue();
    }

    private final void setSeekBarLiftAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.l;
        if (valueAnimator2 != null) {
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimator3 = this.l;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator4 = this.l;
            if (valueAnimator4 != null) {
                valueAnimator4.removeAllListeners();
            }
        }
        this.l = valueAnimator;
    }

    private final void setSeekBarValueAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.k;
        if (valueAnimator2 != null) {
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimator3 = this.k;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator4 = this.k;
            if (valueAnimator4 != null) {
                valueAnimator4.removeAllListeners();
            }
        }
        this.k = valueAnimator;
    }

    private final void setSeeking(boolean z) {
        l3i0 l3i0Var;
        if (this.p != z) {
            this.p = z;
            if (z || (l3i0Var = this.o) == null) {
                return;
            }
            this.o = null;
            d(l3i0Var);
        }
    }

    public final void c(boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f.getTranslationY(), z ? (-r0.getThumbRadius()) * 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new rn2(this, 1));
        ofFloat.start();
        setSeekBarLiftAnimator(ofFloat);
    }

    public final void d(l3i0 l3i0Var) {
        kdx0 kdx0Var;
        boolean z = this.p;
        this.o = z ? l3i0Var : null;
        if (z) {
            return;
        }
        boolean z2 = l3i0Var instanceof l3i0.d;
        int i = 0;
        boolean z3 = (z2 || epx.f(l3i0Var, l3i0.c.a)) ? this.d : false;
        Slider slider = this.f;
        slider.setEnabled(z3);
        boolean z4 = l3i0Var instanceof l3i0.b;
        if (z4) {
            kdx0Var = getClipLoaderDrawable();
            kdx0 kdx0Var2 = !kdx0Var.isRunning() ? kdx0Var : null;
            if (kdx0Var2 != null) {
                kdx0Var2.start();
            }
        } else {
            kdx0 clipLoaderDrawable = getClipLoaderDrawable();
            if (!clipLoaderDrawable.isRunning()) {
                clipLoaderDrawable = null;
            }
            if (clipLoaderDrawable != null) {
                clipLoaderDrawable.stop();
            }
            kdx0Var = null;
        }
        slider.setBackground(kdx0Var);
        if (l3i0Var instanceof l3i0.a) {
            c(false);
            setSeekBarValueAnimator(null);
            slider.setValue(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if ((l3i0Var instanceof l3i0.c) || z4) {
            c(false);
            setSeekBarValueAnimator(null);
            return;
        }
        if (!z2) {
            throw new NoWhenBranchMatchedException();
        }
        l3i0.d dVar = (l3i0.d) l3i0Var;
        float f = dVar.b;
        float f2 = dVar.a;
        slider.setValueTo(f);
        if (this.e != SeekBarUpdateMode.ANIMATED) {
            slider.setValue(swe0.f(f2, slider.getValueFrom(), slider.getValueTo()));
            return;
        }
        float f3 = dVar.b;
        if (f2 > f3) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        ofFloat.addUpdateListener(new icd(this, i));
        ofFloat.setDuration((long) (f3 - f2));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
        setSeekBarValueAnimator(ofFloat);
    }

    public final d3i0 getSeekBarAppearance() {
        return this.b;
    }

    public final l3i0 getSeekBarState() {
        return this.c;
    }

    public final SeekBarUpdateMode getSeekBarUpdateMode() {
        return this.e;
    }

    public final boolean getSeekingEnabled() {
        return this.d;
    }

    public final void setPreviewControllerFactory(wut0 wut0Var) {
        getSeekbarPreviewContainer().removeAllViews();
        this.m = null;
        if (wut0Var == null) {
            return;
        }
        vut0 create = wut0Var.create(getContext());
        View view = create.getView();
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        if (!this.n) {
            addView(getSeekbarPreviewContainer(), 0);
            this.n = true;
        }
        getSeekbarPreviewContainer().addView(view);
        this.m = create;
    }

    public final void setSeekBarAppearance(d3i0 d3i0Var) {
        ColorStateList valueOf;
        ColorStateList valueOf2;
        ColorStateList valueOf3;
        if (epx.f(this.b, d3i0Var)) {
            return;
        }
        this.b = d3i0Var;
        d3i0.b bVar = d3i0Var.a;
        int i = bVar.a;
        Slider slider = this.f;
        slider.setTrackHeight(i);
        cut0 cut0Var = bVar.b;
        if (cut0Var == null || (valueOf = ColorStateList.valueOf(cut0Var.b(slider.getContext()))) == null) {
            valueOf = ColorStateList.valueOf(0);
        }
        slider.setTrackActiveTintList(valueOf);
        cut0 cut0Var2 = bVar.c;
        if (cut0Var2 == null || (valueOf2 = ColorStateList.valueOf(cut0Var2.b(slider.getContext()))) == null) {
            valueOf2 = ColorStateList.valueOf(0);
        }
        slider.setTrackInactiveTintList(valueOf2);
        d3i0.a aVar = d3i0Var.b;
        slider.setThumbRadius(aVar.a);
        slider.setThumbStrokeWidth(aVar.b);
        cut0 cut0Var3 = aVar.c;
        if (cut0Var3 == null || (valueOf3 = ColorStateList.valueOf(cut0Var3.b(slider.getContext()))) == null) {
            valueOf3 = ColorStateList.valueOf(0);
        }
        slider.setThumbTintList(valueOf3);
    }

    public final void setSeekBarState(l3i0 l3i0Var) {
        if (epx.f(this.c, l3i0Var)) {
            return;
        }
        this.c = l3i0Var;
        d(l3i0Var);
    }

    public final void setSeekBarUpdateMode(SeekBarUpdateMode seekBarUpdateMode) {
        if (this.e != seekBarUpdateMode) {
            this.e = seekBarUpdateMode;
            if (seekBarUpdateMode == SeekBarUpdateMode.ANIMATED) {
                setSeekBarValueAnimator(null);
                setSeekBarLiftAnimator(null);
            }
        }
    }

    public final void setSeekingEnabled(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.f.setEnabled(z);
        }
    }
}
