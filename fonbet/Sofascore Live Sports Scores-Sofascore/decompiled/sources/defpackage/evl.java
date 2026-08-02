package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.util.Property;
import android.util.Size;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class evl {
    public static final int a(Context context, int i) {
        context.getClass();
        return wzb.b(i * context.getResources().getDisplayMetrics().density);
    }

    public static void animateAndVibrate$default(View view, boolean z, float f, float f2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = 1.05f;
        }
        if ((i & 4) != 0) {
            f2 = 1.05f;
        }
        if ((i & 8) != 0) {
            j = 300;
        }
        view.getClass();
        lz.t(view, f, f2, j);
        if (z) {
            Context context = view.getContext();
            context.getClass();
            cnb.triggerHapticFeedback$default(context, null, 1, null);
        }
    }

    public static void animateGrowth$default(View view, float f, float f2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.05f;
        }
        if ((i & 2) != 0) {
            f2 = 1.05f;
        }
        if ((i & 4) != 0) {
            j = 300;
        }
        lz.t(view, f, f2, j);
    }

    public static void animateGrowthAndTranslation$default(View view, float f, float f2, float f3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.05f;
        }
        if ((i & 2) != 0) {
            f2 = 1.05f;
        }
        if ((i & 4) != 0) {
            f3 = -30.0f;
        }
        if ((i & 8) != 0) {
            j = 300;
        }
        view.getClass();
        lz.t(view, f, f2, j);
        lz.u(view, f3, j);
    }

    public static void animateTranslation$default(View view, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            f = -30.0f;
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        lz.u(view, f, j);
    }

    public static void animateWiggle$default(View view, float f, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 20.0f;
        }
        if ((i2 & 2) != 0) {
            j = 1000;
        }
        if ((i2 & 4) != 0) {
            j2 = 500;
        }
        if ((i2 & 8) != 0) {
            i = 2;
        }
        view.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i; i3++) {
            Property property = View.ROTATION;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, -f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat.setDuration(j);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            arrayList.add(ofFloat);
            if (i3 < i - 1) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat2.setDuration(j2);
                arrayList.add(ofFloat2);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(new Animator[0]);
        animatorSet.playSequentially((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
        animatorSet.start();
    }

    public static void applyGradient$default(View view, List list, GradientDrawable.Orientation orientation, Float f, int i, Object obj) {
        if ((i & 2) != 0) {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        }
        if ((i & 4) != 0) {
            f = null;
        }
        lz.x(view, list, orientation, f);
    }

    public static final Object b(Function1 function1, BlazeResult.Error error, rq3 rq3Var) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(rob.a, new qqm(function1, error, null), rq3Var);
        return R == lu3.a ? R : Unit.a;
    }

    public static final Object c(Function1 function1, BlazeResult.Success success, hoi hoiVar) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(rob.a, new lpm(function1, success, null), hoiVar);
        return R == lu3.a ? R : Unit.a;
    }

    public static ku3 coroutineContextOnIO$default(BlazeSDK blazeSDK, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            hs4 hs4Var = z45.a;
            coroutineContext = hq4.c.plus(new gu3(blazeSDK.getClass().getSimpleName())).plus(new gzl(bu3.a));
        }
        blazeSDK.getClass();
        coroutineContext.getClass();
        return s9a.c(coroutineContext);
    }

    public static ku3 coroutineContextOnMain$default(BlazeSDK blazeSDK, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            hs4 hs4Var = z45.a;
            coroutineContext = rob.a.plus(new gu3(blazeSDK.getClass().getSimpleName())).plus(new a3m(bu3.a));
        }
        blazeSDK.getClass();
        coroutineContext.getClass();
        return s9a.c(coroutineContext);
    }

    public static final Object d(Function1 function1, gfm gfmVar, hoi hoiVar) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(rob.a, new prm(function1, gfmVar, null), hoiVar);
        return R == lu3.a ? R : Unit.a;
    }

    public static yda dispatchOnIO$default(BlazeSDK blazeSDK, CoroutineContext coroutineContext, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            hs4 hs4Var = z45.a;
            coroutineContext = hq4.c.plus(new gu3(blazeSDK.getClass().getSimpleName())).plus(new ygm(bu3.a));
        }
        blazeSDK.getClass();
        coroutineContext.getClass();
        function1.getClass();
        return xw3.L(s9a.c(coroutineContext), null, null, new sbm(function1, null), 3);
    }

    public static yda dispatchOnLifecycle$default(u6b u6bVar, CoroutineContext coroutineContext, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = new gu3(u6bVar.getClass().getSimpleName()).plus(new mkm(bu3.a));
        }
        u6bVar.getClass();
        coroutineContext.getClass();
        function1.getClass();
        return xw3.L(wca.x(u6bVar.getLifecycle()), coroutineContext, null, new xim(function1, null), 2);
    }

    public static yda dispatchOnMain$default(BlazeSDK blazeSDK, CoroutineContext coroutineContext, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            hs4 hs4Var = z45.a;
            coroutineContext = rob.a.plus(new gu3(blazeSDK.getClass().getSimpleName())).plus(new wnm(bu3.a, blazeSDK));
        }
        blazeSDK.getClass();
        coroutineContext.getClass();
        function1.getClass();
        return xw3.L(s9a.c(coroutineContext), null, null, new jmm(function1, null), 3);
    }

    public static final String e(Date date) {
        long currentTimeMillis = (System.currentTimeMillis() - date.getTime()) / 1000;
        if (currentTimeMillis < 60) {
            return "Now";
        }
        if (currentTimeMillis < 3600) {
            return fn0.n(new StringBuilder(), currentTimeMillis / 60, 'm');
        }
        if (currentTimeMillis < 86400) {
            return fn0.n(new StringBuilder(), currentTimeMillis / 3600, 'h');
        }
        if (currentTimeMillis < TelemetryConfig.DEFAULT_EVENT_TTL_SEC) {
            return fn0.n(new StringBuilder(), currentTimeMillis / 86400, 'd');
        }
        if (currentTimeMillis < 2592000) {
            return fn0.n(new StringBuilder(), currentTimeMillis / TelemetryConfig.DEFAULT_EVENT_TTL_SEC, 'w');
        }
        if (currentTimeMillis < 31104000) {
            return lnb.l(Math.max(1L, currentTimeMillis / 2592000), "mo", new StringBuilder());
        }
        if (currentTimeMillis > 31104000) {
            return fn0.n(new StringBuilder(), currentTimeMillis / 31104000, 'y');
        }
        return null;
    }

    public static Enum enumByValueIgnoreCase$default(String str, Enum r1, int i, Object obj) {
        str.getClass();
        Intrinsics.h();
        throw null;
    }

    public static final void f(View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.t = -1;
        tl3Var.s = -1;
        tl3Var.u = -1;
        tl3Var.v = -1;
        tl3Var.i = -1;
        tl3Var.j = -1;
        tl3Var.k = -1;
        tl3Var.l = -1;
        tl3Var.m = -1;
        tl3Var.e = -1;
        tl3Var.f = -1;
        tl3Var.g = -1;
        tl3Var.h = -1;
        tl3Var.p = -1;
        view.setLayoutParams(tl3Var);
    }

    public static Object fadeInCancellable$default(View view, long j, Interpolator interpolator, Function0 function0, Function0 function02, rq3 rq3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            interpolator = new AccelerateDecelerateInterpolator();
        }
        Object r = lz.r(view, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, j2, interpolator, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function02, rq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    public static /* synthetic */ void fadeInOrOut$default(View view, boolean z, long j, Interpolator interpolator, m2d m2dVar, int i, Object obj) {
        if ((i & 4) != 0) {
            interpolator = new AccelerateDecelerateInterpolator();
        }
        Interpolator interpolator2 = interpolator;
        if ((i & 8) != 0) {
            m2dVar = m2d.GONE;
        }
        j(view, z, j, interpolator2, m2dVar);
    }

    public static Object fadeOutCancellable$default(View view, long j, Interpolator interpolator, int i, Function0 function0, Function0 function02, rq3 rq3Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = 300;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            interpolator = new AccelerateDecelerateInterpolator();
        }
        Object r = lz.r(view, i, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, interpolator, (i2 & 8) != 0 ? null : function0, (i2 & 16) != 0 ? null : function02, rq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    public static final void g(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.l = i;
        view.setLayoutParams(tl3Var);
    }

    public static PackageInfo getPackageInfoCompat$default(PackageManager packageManager, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return wsm.a(packageManager, str, i);
    }

    public static final void h(View view, BlazeInsets blazeInsets) {
        view.getClass();
        blazeInsets.getClass();
        lz.z(blazeInsets.getStart().getToPx$blazesdk_release(), view);
        lz.v(view, blazeInsets.getEnd().getToPx$blazesdk_release());
        v(blazeInsets.getTop().getToPx$blazesdk_release(), view);
        t(blazeInsets.getBottom().getToPx$blazesdk_release(), view);
    }

    public static final void i(View view, BlazeObjectPositioning blazeObjectPositioning, CardView cardView) {
        view.getClass();
        blazeObjectPositioning.getClass();
        cardView.getClass();
        f(view);
        switch (vvm.a[blazeObjectPositioning.getXPosition().ordinal()]) {
            case 1:
                w(cardView.getId(), view);
                break;
            case 2:
                int id = cardView.getId();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                tl3 tl3Var = (tl3) layoutParams;
                tl3Var.s = id;
                view.setLayoutParams(tl3Var);
                break;
            case 3:
                int id2 = cardView.getId();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                tl3 tl3Var2 = (tl3) layoutParams2;
                tl3Var2.u = id2;
                view.setLayoutParams(tl3Var2);
                break;
            case 4:
                p(cardView.getId(), view);
                break;
            case 5:
                w(cardView.getId(), view);
                int id3 = cardView.getId();
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                tl3 tl3Var3 = (tl3) layoutParams3;
                tl3Var3.u = id3;
                view.setLayoutParams(tl3Var3);
                break;
            case 6:
                w(cardView.getId(), view);
                p(cardView.getId(), view);
                break;
            case 7:
                int id4 = cardView.getId();
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (layoutParams4 == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                tl3 tl3Var4 = (tl3) layoutParams4;
                tl3Var4.s = id4;
                view.setLayoutParams(tl3Var4);
                p(cardView.getId(), view);
                break;
            default:
                zzl.b();
        }
        switch (vvm.b[blazeObjectPositioning.getYPosition().ordinal()]) {
            case 1:
                g(view, cardView.getId());
                break;
            case 2:
                int id5 = cardView.getId();
                ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                if (layoutParams5 == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    break;
                } else {
                    tl3 tl3Var5 = (tl3) layoutParams5;
                    tl3Var5.k = id5;
                    view.setLayoutParams(tl3Var5);
                    break;
                }
            case 3:
                x(cardView.getId(), view);
                break;
            case 4:
                y(cardView.getId(), view);
                break;
            case 5:
                y(cardView.getId(), view);
                int id6 = cardView.getId();
                ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                if (layoutParams6 == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    break;
                } else {
                    tl3 tl3Var6 = (tl3) layoutParams6;
                    tl3Var6.k = id6;
                    view.setLayoutParams(tl3Var6);
                    break;
                }
            case 6:
                y(cardView.getId(), view);
                g(view, cardView.getId());
                break;
            case 7:
                g(view, cardView.getId());
                x(cardView.getId(), view);
                break;
            default:
                zzl.b();
                break;
        }
    }

    public static final void j(View view, boolean z, long j, Interpolator interpolator, m2d m2dVar) {
        view.getClass();
        interpolator.getClass();
        m2dVar.getClass();
        if (z) {
            view.getClass();
            interpolator.getClass();
            view.animate().alpha(1.0f).setDuration(j).setInterpolator(interpolator).setListener(new dx0(view));
        } else {
            view.getClass();
            interpolator.getClass();
            m2dVar.getClass();
            view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j).setInterpolator(interpolator).setListener(new rc2(m2dVar, view));
        }
    }

    public static final void k(ViewPager2 viewPager2, tml tmlVar) {
        viewPager2.getClass();
        tmlVar.getClass();
        float f = 10.0f * tmlVar.a;
        on6 on6Var = viewPager2.n;
        ztg ztgVar = on6Var.b;
        if (ztgVar.f != 1) {
            on6Var.g = 0;
            on6Var.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            on6Var.h = SystemClock.uptimeMillis();
            VelocityTracker velocityTracker = on6Var.d;
            if (velocityTracker == null) {
                on6Var.d = VelocityTracker.obtain();
                on6Var.e = ViewConfiguration.get(on6Var.a.getContext()).getScaledMaximumFlingVelocity();
            } else {
                velocityTracker.clear();
            }
            ztgVar.e = 4;
            ztgVar.g(true);
            if (ztgVar.f != 0) {
                on6Var.c.stopScroll();
            }
            long j = on6Var.h;
            MotionEvent obtain = MotionEvent.obtain(j, j, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            on6Var.d.addMovement(obtain);
            obtain.recycle();
        }
        int i = 1;
        while (true) {
            on6 on6Var2 = viewPager2.n;
            if (on6Var2.b.m) {
                float f2 = on6Var2.f - f;
                on6Var2.f = f2;
                int round = Math.round(f2 - on6Var2.g);
                on6Var2.g += round;
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z = on6Var2.a.getOrientation() == 0;
                int i2 = z ? round : 0;
                if (z) {
                    round = 0;
                }
                float f3 = z ? on6Var2.f : 0.0f;
                float f4 = z ? 0.0f : on6Var2.f;
                on6Var2.c.scrollBy(i2, round);
                MotionEvent obtain2 = MotionEvent.obtain(on6Var2.h, uptimeMillis, 2, f3, f4, 0);
                on6Var2.d.addMovement(obtain2);
                obtain2.recycle();
            }
            Thread.sleep(20L);
            if (i == 10) {
                break;
            } else {
                i++;
            }
        }
        on6 on6Var3 = viewPager2.n;
        ztg ztgVar2 = on6Var3.b;
        boolean z2 = ztgVar2.m;
        if (z2) {
            if (ztgVar2.f != 1 || z2) {
                ztgVar2.m = false;
                ztgVar2.h();
                ytg ytgVar = ztgVar2.g;
                if (ytgVar.c == 0) {
                    int i3 = ytgVar.b;
                    if (i3 != ztgVar2.h) {
                        ztgVar2.b(i3);
                    }
                    ztgVar2.d(0);
                    ztgVar2.f();
                } else {
                    ztgVar2.d(2);
                }
            }
            VelocityTracker velocityTracker2 = on6Var3.d;
            velocityTracker2.computeCurrentVelocity(1000, on6Var3.e);
            if (on6Var3.c.fling((int) velocityTracker2.getXVelocity(), (int) velocityTracker2.getYVelocity())) {
                return;
            }
            ViewPager2 viewPager22 = on6Var3.a;
            View findSnapView = viewPager22.k.findSnapView(viewPager22.g);
            if (findSnapView == null) {
                return;
            }
            int[] calculateDistanceToFinalSnap = viewPager22.k.calculateDistanceToFinalSnap(viewPager22.g, findSnapView);
            int i4 = calculateDistanceToFinalSnap[0];
            if (i4 == 0 && calculateDistanceToFinalSnap[1] == 0) {
                return;
            }
            viewPager22.j.smoothScrollBy(i4, calculateDistanceToFinalSnap[1]);
        }
    }

    public static final void l(BlazeResult blazeResult, Function1 function1) {
        function1.getClass();
        dispatchOnMain$default(BlazeSDK.INSTANCE, null, new f6m(function1, blazeResult, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l55 loadAndCacheImage$default(ImageView imageView, String str, Drawable drawable, Drawable drawable2, Drawable drawable3, boolean z, Size size, List list, Function1 function1, Function2 function2, Function1 function12, Function1 function13, int i, Object obj) {
        String str2 = (i & 1) != 0 ? null : str;
        String str3 = (i & 2) != 0 ? null : drawable;
        Drawable drawable4 = (i & 4) != 0 ? null : drawable2;
        Drawable drawable5 = (i & 8) != 0 ? null : drawable3;
        boolean z2 = (i & 16) != 0 ? true : z;
        Size size2 = (i & 32) != 0 ? null : size;
        List list2 = (i & 64) != 0 ? null : list;
        Function1 ol8Var = (i & 128) != 0 ? new ol8(11) : function1;
        Function2 nl8Var = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new nl8(25) : function2;
        Function1 ol8Var2 = (i & 512) != 0 ? new ol8(12) : function12;
        Function1 ol8Var3 = (i & 1024) != 0 ? new ol8(13) : function13;
        imageView.getClass();
        ol8Var.getClass();
        nl8Var.getClass();
        ol8Var2.getClass();
        ol8Var3.getClass();
        if (str3 != null) {
            str2 = str3;
        } else if (str2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Either contentDrawable or contentUrl must be provided.");
            Context context = imageView.getContext();
            context.getClass();
            it9 it9Var = new it9(context);
            it9Var.c = null;
            ol8Var.invoke(new gq5(null, it9Var.a(), illegalArgumentException));
            return null;
        }
        Context context2 = imageView.getContext();
        context2.getClass();
        it9 it9Var2 = new it9(context2);
        it9Var2.c = str2;
        it9Var2.w = 1;
        it9Var2.x = 1;
        int i2 = z2 ? 100 : 0;
        it9Var2.g = i2 > 0 ? new h24(i2) : rwj.a;
        it9Var2.p = drawable5;
        it9Var2.o = 0;
        it9Var2.r = drawable4;
        it9Var2.q = 0;
        it9Var2.d = new ku9(imageView);
        it9Var2.b();
        it9Var2.e = new va4(ol8Var2, ol8Var3, ol8Var, nl8Var);
        if (list2 != null) {
            it9Var2.f = oyn.R(list2);
        }
        if (size2 != null) {
            it9Var2.s = new kpf(new jjh(new u25(size2.getWidth()), new u25(size2.getHeight())));
            it9Var2.b();
        }
        ot9 a = it9Var2.a();
        bpf a2 = zlm.a.a();
        if (a2 != null) {
            return a2.a(a);
        }
        return null;
    }

    public static final void m(Object obj) {
        obj.getClass();
        obj.getClass().getSimpleName().concat("TAG");
    }

    public static final boolean n(ViewPager2 viewPager2) {
        viewPager2.getClass();
        return viewPager2.getScrollState() == 0;
    }

    public static final RecyclerView o(ViewPager2 viewPager2) {
        viewPager2.getClass();
        View childAt = viewPager2.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    public static final void p(int i, View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.v = i;
        view.setLayoutParams(tl3Var);
    }

    public static final void q(View view) {
        view.getClass();
        view.setVisibility(8);
    }

    public static final ViewGroup r(int i, View view) {
        view.getClass();
        if (view.getId() != i) {
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                return r(i, view2);
            }
        } else if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public static final void s(View view) {
        view.getClass();
        view.setVisibility(4);
    }

    public static void setDebouncedOnClickListener$default(final View view, long j, ku3 ku3Var, final Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        final long j2 = j;
        if ((i & 2) != 0) {
            hs4 hs4Var = z45.a;
            ku3Var = s9a.c(rob.a);
        }
        final ku3 ku3Var2 = ku3Var;
        view.getClass();
        ku3Var2.getClass();
        function1.getClass();
        view.setOnClickListener(new View.OnClickListener() { // from class: yt8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                View view3 = view;
                view3.setClickable(false);
                xw3.L(ku3Var2, null, null, new jf5(j2, view3, null), 3);
                function1.invoke(view3);
            }
        });
    }

    public static void setTouchGestureListenerWithStartAndEnd$default(final View view, int i, int i2, int i3, final float f, final float f2, final boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function2 function2, Function0 function08, Function0 function09, Function0 function010, Function0 function011, Function0 function012, int i4, Object obj) {
        int i5 = (i4 & 2) != 0 ? 0 : i2;
        int i6 = (i4 & 4) != 0 ? 1000 : i3;
        Function0 xt8Var = (i4 & 64) != 0 ? new xt8(4) : function0;
        Function0 xt8Var2 = (i4 & 128) != 0 ? new xt8(8) : function02;
        Function0 xt8Var3 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new xt8(9) : function03;
        Function0 xt8Var4 = (i4 & 512) != 0 ? new xt8(10) : function04;
        Function0 zl8Var = (i4 & 1024) != 0 ? new zl8(20) : function05;
        Function0 zl8Var2 = (i4 & a.o) != 0 ? new zl8(21) : function06;
        Function0 zl8Var3 = (i4 & 4096) != 0 ? new zl8(22) : function07;
        Function2 nl8Var = (i4 & 8192) != 0 ? new nl8(23) : function2;
        Function0 zl8Var4 = (i4 & 16384) != 0 ? new zl8(23) : function08;
        Function0 zl8Var5 = (32768 & i4) != 0 ? new zl8(24) : function09;
        Function0 xt8Var5 = (65536 & i4) != 0 ? new xt8(5) : function010;
        Function0 xt8Var6 = (131072 & i4) != 0 ? new xt8(6) : function011;
        Function0 xt8Var7 = (i4 & 262144) != 0 ? new xt8(7) : function012;
        view.getClass();
        xt8Var.getClass();
        xt8Var2.getClass();
        xt8Var3.getClass();
        xt8Var4.getClass();
        zl8Var.getClass();
        zl8Var2.getClass();
        zl8Var3.getClass();
        nl8Var.getClass();
        zl8Var4.getClass();
        zl8Var5.getClass();
        xt8Var5.getClass();
        xt8Var6.getClass();
        xt8Var7.getClass();
        final Function0 function013 = xt8Var;
        final Function0 function014 = xt8Var2;
        final Function0 function015 = xt8Var3;
        lz.w(view, i, i5, i6, new Function1() { // from class: au8
            /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
            
                r2 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
            
                if (r9.getX() > ((1.0f - r6) * r1)) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
            
                r3 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
            
                if (r9.getX() < (r1 * r6)) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
            
                r2 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
            
                if (r9.getX() > ((1.0f - r2) * r1)) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
            
                if (r9.getX() < (r1 * r2)) goto L16;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj2) {
                boolean z2;
                MotionEvent motionEvent = (MotionEvent) obj2;
                motionEvent.getClass();
                View view2 = view;
                int width = view2.getWidth();
                boolean z3 = true;
                boolean z4 = z || !lz.A(view2);
                float f3 = f;
                if (z4) {
                }
                float f4 = f2;
                if (z4) {
                }
                if (z2) {
                    function013.invoke();
                } else if (z3) {
                    function015.invoke();
                } else {
                    function014.invoke();
                }
                return Unit.a;
            }
        }, xt8Var4, zl8Var, zl8Var2, zl8Var3, nl8Var, zl8Var4, zl8Var5, xt8Var5, xt8Var6, xt8Var7);
    }

    public static final void t(int i, View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void u(View view) {
        view.getClass();
        view.setVisibility(0);
    }

    public static final void v(int i, View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void w(int i, View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.t = i;
        view.setLayoutParams(tl3Var);
    }

    public static final void x(int i, View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.j = i;
        view.setLayoutParams(tl3Var);
    }

    public static final void y(int i, View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.i = i;
        view.setLayoutParams(tl3Var);
    }
}
