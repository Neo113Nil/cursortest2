package defpackage;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.equativ.displaysdk.adadapter.SASParallaxBannerAdapter;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fcg extends FrameLayout {
    public static final /* synthetic */ int p = 0;
    public bcg a;
    public FrameLayout b;
    public hbg c;
    public agg d;
    public final long e;
    public final Function1 f;
    public final ct8 g;
    public yda h;
    public xbg i;
    public xag j;
    public Handler k;
    public final RelativeLayout l;
    public boolean m;
    public final wib n;
    public final d4a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcg(Context context) {
        super(context, null);
        context.getClass();
        vt vtVar = new vt(context, 10);
        wib wibVar = wib.f;
        ybg ybgVar = new ybg(wibVar, context, 0);
        this.d = new agg(0, 0, 0, 0);
        this.e = 300L;
        Looper myLooper = Looper.myLooper();
        this.k = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.l = relativeLayout;
        this.o = new d4a(this, 15);
        this.f = vtVar;
        this.g = ybgVar;
        this.n = wibVar;
        addView(relativeLayout, new ViewGroup.LayoutParams(-1, -2));
    }

    public static AnimatorSet b(final RelativeLayout relativeLayout, float f, float f2, int i, int i2, float f3, float f4, int i3, int i4, long j) {
        final int i5 = 0;
        final int i6 = 1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "x", f, f3);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout, "y", f2, f4);
        final ValueAnimator ofInt = ValueAnimator.ofInt(i2, i4);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: acg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = i5;
                ValueAnimator valueAnimator2 = ofInt;
                ViewGroup viewGroup = relativeLayout;
                switch (i7) {
                    case 0:
                        valueAnimator.getClass();
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        animatedValue.getClass();
                        jca.S(viewGroup, null, (Integer) animatedValue);
                        break;
                    default:
                        valueAnimator.getClass();
                        Object animatedValue2 = valueAnimator2.getAnimatedValue();
                        animatedValue2.getClass();
                        jca.S(viewGroup, (Integer) animatedValue2, null);
                        break;
                }
            }
        });
        final ValueAnimator ofInt2 = ValueAnimator.ofInt(i, i3);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: acg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = i6;
                ValueAnimator valueAnimator2 = ofInt2;
                ViewGroup viewGroup = relativeLayout;
                switch (i7) {
                    case 0:
                        valueAnimator.getClass();
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        animatedValue.getClass();
                        jca.S(viewGroup, null, (Integer) animatedValue);
                        break;
                    default:
                        valueAnimator.getClass();
                        Object animatedValue2 = valueAnimator2.getAnimatedValue();
                        animatedValue2.getClass();
                        jca.S(viewGroup, (Integer) animatedValue2, null);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofInt).with(ofInt2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getExpandParentView() {
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            View rootView = !Intrinsics.c(getRootView(), this) ? getRootView() : null;
            frameLayout = rootView instanceof FrameLayout ? (FrameLayout) rootView : null;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = rootView != null ? (FrameLayout) rootView.findViewById(R.id.content) : null;
                if (frameLayout2 != null) {
                    return frameLayout2;
                }
                return null;
            }
        }
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(fr7 fr7Var, sq3 sq3Var) {
        ccg ccgVar;
        Object obj;
        int i;
        fcg fcgVar;
        zag zagVar;
        r69 r69Var;
        k50 k50Var;
        xbg xbgVar;
        if (sq3Var instanceof ccg) {
            ccgVar = (ccg) sq3Var;
            int i2 = ccgVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ccgVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = ccgVar.t;
                obj = lu3.a;
                i = ccgVar.v;
                if (i != 0) {
                    y6a.M(obj2);
                    ejg p2 = ejg.p();
                    p2.getClass();
                    Context context = getContext();
                    wib wibVar = this.n;
                    wibVar.getClass();
                    qcg qcgVar = new qcg(p2, new b10(context), fig.c(getContext()), qha.B());
                    Object qggVar = new qgg(rag.BANNER, qcgVar, wibVar);
                    zag zagVar2 = (zag) ((xag) this.f.invoke(qggVar));
                    zagVar2.getClass();
                    d4a d4aVar = this.o;
                    d4aVar.getClass();
                    zagVar2.j = d4aVar;
                    ccgVar.r = this;
                    ccgVar.s = zagVar2;
                    ccgVar.v = 1;
                    obj2 = fr7Var.invoke(qcgVar, zagVar2, qggVar, ccgVar);
                    if (obj2 != obj) {
                        fcgVar = this;
                        zagVar = zagVar2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xbgVar = (xbg) ccgVar.r;
                    y6a.M(obj2);
                    return xbgVar.getAdInfo();
                }
                zag zagVar3 = ccgVar.s;
                fcg fcgVar2 = (fcg) ccgVar.r;
                y6a.M(obj2);
                zagVar = zagVar3;
                fcgVar = fcgVar2;
                xbg xbgVar2 = (xbg) obj2;
                hs4 hs4Var = z45.a;
                r69Var = rob.a;
                k50Var = new k50(xbgVar2, fcgVar, zagVar, null, 19);
                ccgVar.r = xbgVar2;
                ccgVar.s = null;
                ccgVar.v = 2;
                if (xw3.R(r69Var, k50Var, ccgVar) != obj) {
                    xbgVar = xbgVar2;
                    return xbgVar.getAdInfo();
                }
                return obj;
            }
        }
        ccgVar = new ccg(this, sq3Var);
        Object obj22 = ccgVar.t;
        obj = lu3.a;
        i = ccgVar.v;
        if (i != 0) {
        }
        xbg xbgVar22 = (xbg) obj22;
        hs4 hs4Var2 = z45.a;
        r69Var = rob.a;
        k50Var = new k50(xbgVar22, fcgVar, zagVar, null, 19);
        ccgVar.r = xbgVar22;
        ccgVar.s = null;
        ccgVar.v = 2;
        if (xw3.R(r69Var, k50Var, ccgVar) != obj) {
        }
        return obj;
    }

    public final void d() {
        yda ydaVar = this.h;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        xbg xbgVar = this.i;
        if (xbgVar != null) {
            xbgVar.onDestroy();
        }
        this.i = null;
        xag xagVar = this.j;
        if (xagVar != null) {
            ((zag) xagVar).m(true);
        }
        this.j = null;
        this.l.removeAllViews();
        this.m = false;
        this.c = null;
    }

    @Nullable
    public final hbg getAdPlacement() {
        return this.c;
    }

    @Nullable
    public final bcg getBannerListener() {
        return this.a;
    }

    @Nullable
    public final FrameLayout getExpandParentContainer() {
        return this.b;
    }

    @NotNull
    public final agg getParallaxMargins() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        xag xagVar;
        super.onAttachedToWindow();
        if (!this.m && (xagVar = this.j) != null) {
            ((zag) xagVar).k(this.l);
            this.m = true;
        }
        xag xagVar2 = this.j;
        if (xagVar2 != null) {
            ((zag) xagVar2).l();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xag xagVar = this.j;
        if (xagVar != null) {
            ((zag) xagVar).f(configuration != null ? configuration.orientation : getContext().getResources().getConfiguration().orientation);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xag xagVar = this.j;
        if (xagVar != null) {
            ((zag) xagVar).m(true);
        }
    }

    public final void setBannerListener(@Nullable bcg bcgVar) {
        this.a = bcgVar;
    }

    public final void setExpandParentContainer(@Nullable FrameLayout frameLayout) {
        this.b = frameLayout;
    }

    public final void setParallaxMargins(@NotNull agg aggVar) {
        aggVar.getClass();
        this.d = aggVar;
        xbg xbgVar = this.i;
        if (xbgVar != null) {
            xbgVar.onRuntimeInfoChange(sub.d(new Pair(SASParallaxBannerAdapter.PARALLAX_MARGINS, aggVar)));
        }
    }
}
