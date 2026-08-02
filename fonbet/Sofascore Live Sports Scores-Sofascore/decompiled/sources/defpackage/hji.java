package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hji {
    public boolean A;
    public boolean B;
    public final cji a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final dji s;
    public final dji t;
    public final dji u;
    public final dji v = new dji(this, 5);
    public final dji w = new dji(this, 6);
    public final r8 x = new r8(this, 10);
    public boolean C = true;
    public int z = 0;
    public final ArrayList y = new ArrayList();

    public hji(cji cjiVar) {
        this.a = cjiVar;
        final int i = 0;
        this.s = new dji(this, i);
        final int i2 = 3;
        this.t = new dji(this, i2);
        int i3 = 4;
        this.u = new dji(this, i3);
        final int i4 = 1;
        this.b = cjiVar.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) cjiVar.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) cjiVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) cjiVar.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) cjiVar.findViewById(R.id.exo_time);
        View findViewById = cjiVar.findViewById(R.id.exo_progress);
        this.j = findViewById;
        this.f = (ViewGroup) cjiVar.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) cjiVar.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) cjiVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = cjiVar.findViewById(R.id.exo_overflow_show);
        this.k = findViewById2;
        View findViewById3 = cjiVar.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new tii(this, i3));
            findViewById3.setOnClickListener(new tii(this, i3));
        }
        final int i5 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: eji
            public final /* synthetic */ hji b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i2;
                hji hjiVar = this.b;
                switch (i6) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = hjiVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = hjiVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = hjiVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        hjiVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        hjiVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = hjiVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = hjiVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = hjiVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat.addListener(new fji(this, i));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: eji
            public final /* synthetic */ hji b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i;
                hji hjiVar = this.b;
                switch (i6) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = hjiVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = hjiVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = hjiVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        hjiVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        hjiVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = hjiVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = hjiVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = hjiVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat2.addListener(new fji(this, i4));
        Resources resources = cjiVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new gji(this, cjiVar, i));
        animatorSet.play(ofFloat).with(d(findViewById, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension)).with(d(viewGroup, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new gji(this, cjiVar, i4));
        animatorSet2.play(d(findViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new gji(this, cjiVar, i5));
        animatorSet3.play(ofFloat).with(d(findViewById, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension2)).with(d(viewGroup, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new fji(this, i5));
        animatorSet4.play(ofFloat2).with(d(findViewById, dimension, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).with(d(viewGroup, dimension, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new fji(this, i2));
        animatorSet5.play(ofFloat2).with(d(findViewById, dimension2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).with(d(viewGroup, dimension2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: eji
            public final /* synthetic */ hji b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i4;
                hji hjiVar = this.b;
                switch (i6) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = hjiVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = hjiVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = hjiVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        hjiVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        hjiVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = hjiVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = hjiVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = hjiVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat3.addListener(new fji(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: eji
            public final /* synthetic */ hji b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i5;
                hji hjiVar = this.b;
                switch (i6) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = hjiVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = hjiVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = hjiVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        hjiVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        hjiVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = hjiVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = hjiVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = hjiVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat4.addListener(new fji(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public static boolean j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean b(View view) {
        return view != null && this.y.contains(view);
    }

    public final void e(long j, Runnable runnable) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        dji djiVar = this.w;
        cji cjiVar = this.a;
        cjiVar.removeCallbacks(djiVar);
        cjiVar.removeCallbacks(this.t);
        cjiVar.removeCallbacks(this.v);
        cjiVar.removeCallbacks(this.u);
    }

    public final void g() {
        if (this.z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                e(showTimeoutMs, this.w);
            } else if (this.z == 1) {
                e(2000L, this.u);
            } else {
                e(showTimeoutMs, this.v);
            }
        }
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.y;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i) {
        int i2 = this.z;
        this.z = i;
        cji cjiVar = this.a;
        if (i == 2) {
            cjiVar.setVisibility(8);
        } else if (i2 == 2) {
            cjiVar.setVisibility(0);
        }
        if (i2 != i) {
            Iterator it = cjiVar.d.iterator();
            while (it.hasNext()) {
                bji bjiVar = (bji) it.next();
                cjiVar.getVisibility();
                ((iji) bjiVar).c.j();
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i = this.z;
        if (i == 1) {
            this.o.start();
        } else if (i == 2) {
            this.p.start();
        } else if (i == 3) {
            this.B = true;
        } else if (i == 4) {
            return;
        }
        g();
    }
}
