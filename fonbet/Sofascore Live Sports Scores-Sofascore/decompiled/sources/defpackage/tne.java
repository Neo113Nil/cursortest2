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
/* loaded from: classes.dex */
public final class tne {
    public boolean B;
    public boolean C;
    public final one a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final ViewGroup j;
    public final View k;
    public final View l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final AnimatorSet q;
    public final ValueAnimator r;
    public final ValueAnimator s;
    public final pne t;
    public final pne u;
    public final pne v = new pne(this, 4);
    public final pne w = new pne(this, 5);
    public final pne x = new pne(this, 6);
    public final r8 y = new r8(this, 7);
    public boolean D = true;
    public int A = 0;
    public final ArrayList z = new ArrayList();

    public tne(one oneVar) {
        this.a = oneVar;
        final int i = 0;
        this.t = new pne(this, i);
        final int i2 = 3;
        this.u = new pne(this, i2);
        final int i3 = 1;
        this.c = (ViewGroup) oneVar.findViewById(R.id.exo_top_controls);
        this.b = oneVar.findViewById(R.id.exo_controls_background);
        this.d = (ViewGroup) oneVar.findViewById(R.id.exo_center_controls);
        this.f = (ViewGroup) oneVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) oneVar.findViewById(R.id.exo_bottom_bar);
        this.e = viewGroup;
        this.j = (ViewGroup) oneVar.findViewById(R.id.exo_time);
        View findViewById = oneVar.findViewById(R.id.exo_progress);
        this.k = findViewById;
        this.g = (ViewGroup) oneVar.findViewById(R.id.exo_basic_controls);
        this.h = (ViewGroup) oneVar.findViewById(R.id.exo_extra_controls);
        this.i = (ViewGroup) oneVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = oneVar.findViewById(R.id.exo_overflow_show);
        this.l = findViewById2;
        View findViewById3 = oneVar.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new cne(this, i2));
            findViewById3.setOnClickListener(new cne(this, i2));
        }
        final int i4 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qne
            public final /* synthetic */ tne b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i2;
                tne tneVar = this.b;
                switch (i5) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = tneVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = tneVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = tneVar.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup4 = tneVar.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        tneVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        tneVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = tneVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = tneVar.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup6 = tneVar.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup7 = tneVar.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat.addListener(new rne(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qne
            public final /* synthetic */ tne b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i;
                tne tneVar = this.b;
                switch (i5) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = tneVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = tneVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = tneVar.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup4 = tneVar.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        tneVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        tneVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = tneVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = tneVar.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup6 = tneVar.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup7 = tneVar.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat2.addListener(new rne(this, 1));
        Resources resources = oneVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new sne(this, oneVar, i));
        animatorSet.play(ofFloat).with(d(findViewById, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension)).with(d(viewGroup, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new sne(this, oneVar, i3));
        animatorSet2.play(d(findViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.o = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new sne(this, oneVar, i4));
        animatorSet3.play(ofFloat).with(d(findViewById, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension2)).with(d(viewGroup, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.p = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new rne(this, 2));
        animatorSet4.play(ofFloat2).with(d(findViewById, dimension, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).with(d(viewGroup, dimension, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.q = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new rne(this, 3));
        animatorSet5.play(ofFloat2).with(d(findViewById, dimension2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).with(d(viewGroup, dimension2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.r = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qne
            public final /* synthetic */ tne b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i3;
                tne tneVar = this.b;
                switch (i5) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = tneVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = tneVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = tneVar.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup4 = tneVar.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        tneVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        tneVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = tneVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = tneVar.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup6 = tneVar.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup7 = tneVar.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat3.addListener(new rne(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.s = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qne
            public final /* synthetic */ tne b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i4;
                tne tneVar = this.b;
                switch (i5) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = tneVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = tneVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = tneVar.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup4 = tneVar.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue);
                            break;
                        }
                        break;
                    case 1:
                        tneVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        tneVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = tneVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = tneVar.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup6 = tneVar.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup7 = tneVar.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(floatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        ofFloat4.addListener(new rne(this, 5));
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
        return id == R.id.exo_bottom_bar || id == R.id.exo_media_route_button_placeholder || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.j;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.g;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean b(View view) {
        return view != null && this.z.contains(view);
    }

    public final void e(long j, Runnable runnable) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        pne pneVar = this.x;
        one oneVar = this.a;
        oneVar.removeCallbacks(pneVar);
        oneVar.removeCallbacks(this.u);
        oneVar.removeCallbacks(this.w);
        oneVar.removeCallbacks(this.v);
    }

    public final void g() {
        if (this.A == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.D) {
                e(showTimeoutMs, this.x);
            } else if (this.A == 1) {
                e(2000L, this.v);
            } else {
                e(showTimeoutMs, this.w);
            }
        }
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.z;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.B && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i) {
        int i2 = this.A;
        this.A = i;
        one oneVar = this.a;
        if (i == 2) {
            oneVar.setVisibility(8);
        } else if (i2 == 2) {
            oneVar.setVisibility(0);
        }
        if (i2 != i) {
            Iterator it = oneVar.k.iterator();
            while (it.hasNext()) {
                nne nneVar = (nne) it.next();
                oneVar.getVisibility();
                ((qxe) nneVar).c.l();
            }
        }
    }

    public final void k() {
        if (!this.D) {
            i(0);
            g();
            return;
        }
        int i = this.A;
        if (i == 1) {
            this.p.start();
        } else if (i == 2) {
            this.q.start();
        } else if (i == 3) {
            this.C = true;
        } else if (i == 4) {
            return;
        }
        g();
    }
}
