package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xy extends ViewGroup implements ryd, t6g, rq4, owd, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, vd8 {
    public static Class N0;
    public static Method O0;
    public static Method P0;
    public static final l0d Q0 = new l0d();
    public static x R0;
    public static Method S0;
    public tz A;
    public float A0;
    public final mx B;
    public float B0;
    public final z00 C;
    public final b8 C0;
    public final ov0 D;
    public final hy D0;
    public final l0d E;
    public boolean E0;
    public l0d F;
    public final a02 F0;
    public boolean G;
    public final oy G0;
    public boolean H;
    public final ag2 H0;
    public final svc I;
    public boolean I0;
    public final n72 J;
    public boolean J0;
    public final e1d K;
    public final xo3 K0;
    public final ay4 L;
    public View L0;
    public final ujg M;
    public final ty M0;
    public final tx N;
    public boolean O;
    public final gy P;
    public final fy Q;
    public final uyd R;
    public boolean S;
    public i50 T;
    public an3 U;
    public boolean V;
    public final ux4 W;
    public final e1d a;
    public long a0;
    public long b;
    public final int[] b0;
    public final boolean c;
    public final float[] c0;
    public p1a d;
    public final float[] d0;
    public final yma e;
    public final float[] e0;
    public b7b f;
    public long f0;
    public c7b g;
    public boolean g0;
    public e3g h;
    public long h0;
    public final vg0 i;
    public final e1d i0;
    public final hy j;
    public final ay4 j0;
    public final e1d k;
    public Function1 k0;
    public final View l;
    public idj l0;
    public final yd8 m;
    public gdj m0;
    public CoroutineContext n;
    public final AtomicReference n0;
    public final j00 o;
    public lw4 o0;
    public final ata p;
    public final nf8 p0;
    public final e1d q;
    public final e1d q0;
    public final ay4 r;
    public final e1d r0;
    public final xj2 s;
    public final z69 s0;
    public final s40 t;
    public final j4a t0;
    public final y4a u;
    public final ytc u0;
    public final wma v;
    public final g40 v0;
    public final uzc w;
    public MotionEvent w0;
    public final qqf x;
    public long x0;
    public final v3h y;
    public final c0l y0;
    public final dz z;
    public final l0d z0;

    public xy(Context context, lf3 lf3Var) {
        super(context);
        this.a = e.f(lf3Var);
        this.b = 9205357640488583168L;
        int i = 1;
        this.c = true;
        this.e = lf3Var.r;
        this.h = ccd.d;
        this.i = new vg0();
        int i2 = 0;
        this.j = new hy(this, i2);
        this.k = e.e(wnn.e(context), p4h.g);
        this.m = new yd8(this, this);
        this.n = lf3Var.b.k();
        int i3 = 0;
        this.o = new j00(new py(3, this, xy.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0, i3));
        this.p = new ata();
        this.q = e.f(Boolean.FALSE);
        this.r = goh.b(new oy(this, i2));
        this.s = lf3Var.t;
        this.t = lf3Var.q;
        this.u = new y4a();
        int i4 = 3;
        wma wmaVar = new wma(3);
        wmaVar.d0(u6g.c);
        wmaVar.a0(getDensity());
        wmaVar.f0(getViewConfiguration());
        wmaVar.e0(new vy(this).z(((yd8) getFocusOwner()).e).z(getDragAndDropManager().c));
        this.v = wmaVar;
        uzc uzcVar = q6a.a;
        this.w = new uzc();
        getLayoutNodes();
        this.x = new qqf(this);
        this.y = new v3h(getRoot(), new pm5(), getLayoutNodes());
        dz dzVar = new dz(this);
        this.z = dzVar;
        this.A = new tz(this, new ny(0, this, lz.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, i3));
        this.B = lf3Var.j;
        this.C = new z00(this);
        this.D = new ov0();
        this.E = new l0d();
        this.I = new svc();
        wma root = getRoot();
        n72 n72Var = new n72();
        n72Var.b = root;
        n72Var.c = new gc9((z3a) root.F.d);
        n72Var.d = new bka(11);
        n72Var.e = new jc9();
        this.J = n72Var;
        this.K = e.f(new Configuration(context.getResources().getConfiguration()));
        this.L = goh.b(new oy(this, i));
        this.M = new ujg(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw wt3.j("Autofill service could not be located.");
        }
        this.N = new tx(new cqa(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.P = lf3Var.l;
        this.Q = lf3Var.m;
        this.R = new uyd(new sy(this, i));
        this.W = new ux4(getRoot());
        this.a0 = 9223372034707292159L;
        this.b0 = new int[]{0, 0};
        float[] a = xzb.a();
        this.c0 = a;
        this.d0 = xzb.a();
        this.e0 = xzb.a();
        this.f0 = -1L;
        this.h0 = 9187343241974906880L;
        this.i0 = e.f(null);
        this.j0 = goh.b(new oy(this, i4));
        this.n0 = new AtomicReference(null);
        this.p0 = lf3Var.n;
        this.q0 = lf3Var.o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = td8.a;
        ema emaVar = layoutDirection != 0 ? layoutDirection != 1 ? null : ema.b : ema.a;
        this.r0 = e.f(emaVar == null ? ema.a : emaVar);
        this.s0 = lf3Var.p;
        int i5 = 2;
        this.t0 = new j4a(isInTouchMode() ? 1 : 2);
        ytc ytcVar = new ytc();
        new i1d(new bz0[16], 0);
        new i1d(new hq3[16], 0);
        new i1d(new wma[16], 0);
        new i1d(new hq3[16], 0);
        this.u0 = ytcVar;
        g40 g40Var = new g40();
        new p03(new w1(g40Var, 4));
        hfj[] hfjVarArr = hfj.a;
        this.v0 = g40Var;
        this.y0 = new c0l(0);
        this.z0 = new l0d();
        this.C0 = new b8(this, i5);
        this.D0 = new hy(this, i);
        this.F0 = new a02(context, new sy(this, i2));
        this.G0 = new oy(this, i5);
        int i6 = Build.VERSION.SDK_INT;
        this.H0 = i6 < 29 ? new bg2(a) : new cg2();
        addOnAttachStateChangeListener(this.A);
        setWillNotDraw(false);
        setFocusable(true);
        kz.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        bsk.q(this, dzVar);
        setOnDragListener(getDragAndDropManager());
        getRoot().c(this);
        if (i6 >= 29) {
            fz.a.a(this);
        }
        if (t()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.l = view;
            addView(view, -1);
        }
        this.K0 = i6 >= 31 ? new xo3() : null;
        this.M0 = new ty(this);
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    private final idj getLegacyTextInputServiceAndroid() {
        idj idjVar = this.l0;
        if (idjVar != null) {
            return idjVar;
        }
        idj idjVar2 = new idj(getView(), this);
        this.l0 = idjVar2;
        return idjVar2;
    }

    private final lf3 get_composeViewContext() {
        return (lf3) ((eoh) this.a).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ly get_viewTreeOwners() {
        wt3.z(((eoh) this.i0).getValue());
        return null;
    }

    public static void j(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof xy) {
                ((xy) childAt).C();
            } else if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt);
            }
        }
    }

    public static long l(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            d8k d8kVar = e8k.b;
            return size;
        }
        if (mode == 0) {
            d8k d8kVar2 = e8k.b;
            return 2147483647L;
        }
        if (mode != 1073741824) {
            zzl.s();
            return 0L;
        }
        long j = size;
        d8k d8kVar3 = e8k.b;
        return j | (j << 32);
    }

    public static View o(int i, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.c(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View o = o(i, viewGroup.getChildAt(i2));
                    if (o != null) {
                        return o;
                    }
                }
            }
        }
        return null;
    }

    public static void r(wma wmaVar) {
        wmaVar.D();
        i1d z = wmaVar.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            r((wma) objArr[i2]);
        }
    }

    private final void setAttached(boolean z) {
        ((eoh) this.q).setValue(Boolean.valueOf(z));
    }

    private void setDensity(kx4 kx4Var) {
        ((eoh) this.k).setValue(kx4Var);
    }

    private void setFontFamilyResolver(sf8 sf8Var) {
        this.q0.setValue(sf8Var);
    }

    private void setLayoutDirection(ema emaVar) {
        ((eoh) this.r0).setValue(emaVar);
    }

    private final void set_composeViewContext(lf3 lf3Var) {
        ((eoh) this.a).setValue(lf3Var);
    }

    private final void set_viewTreeOwners(ly lyVar) {
        ((eoh) this.i0).setValue(lyVar);
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean u(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !tvc.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public final void A(wma wmaVar, long j) {
        ux4 ux4Var = this.W;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            ux4Var.s(wmaVar, j);
            if (!((hcc) ux4Var.e).S()) {
                ux4Var.f(false);
                getRectManager().a();
                if (this.H) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.H = false;
                }
            }
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    public final boolean B(int i) {
        if (i != 7 && i != 8) {
            Integer c = td8.c(i);
            if (c == null) {
                throw wt3.j("Invalid focus direction");
            }
            int intValue = c.intValue();
            ne8 g = ((yd8) getFocusOwner()).g();
            if (g == null) {
                a70.r("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer c2 = td8.c(i);
            if (c2 == null) {
                throw wt3.j("Invalid focus direction");
            }
            int intValue2 = c2.intValue();
            rsk rskVar = c6o.c0(g).o;
            View interopView = rskVar != null ? rskVar.getInteropView() : null;
            View findFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue2);
            if (findNextFocus == null || interopView == null || !lz.E(interopView, findNextFocus)) {
                findNextFocus = null;
            }
            if (findNextFocus != null) {
                return td8.b(findNextFocus, Integer.valueOf(intValue), null);
            }
        }
        return false;
    }

    public final void C() {
        l0d l0dVar;
        Object[] objArr;
        if (this.O) {
            a5f a5fVar = getSnapshotObserver().a;
            synchronized (a5fVar.h) {
                try {
                    i1d i1dVar = (i1d) a5fVar.g;
                    int i = i1dVar.c;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = i1dVar.a;
                        if (i2 >= i) {
                            break;
                        }
                        loh lohVar = (loh) objArr[i2];
                        lohVar.d();
                        if (!lohVar.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = i1dVar.a;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    i1dVar.c = i4;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.O = false;
        }
        i50 i50Var = this.T;
        if (i50Var != null) {
            j(i50Var);
        }
        tx txVar = this.N;
        if (txVar != null) {
            vzc vzcVar = txVar.h;
            if (vzcVar.d == 0 && txVar.i) {
                ((AutofillManager) txVar.a.a).commit();
                txVar.i = false;
            }
            if (vzcVar.d != 0) {
                txVar.i = true;
            }
        }
        while (this.z0.i() && this.z0.f(0) != null) {
            int i5 = this.z0.b;
            int i6 = 0;
            while (true) {
                l0dVar = this.z0;
                if (i6 < i5) {
                    Function0 function0 = (Function0) l0dVar.f(i6);
                    this.z0.n(i6, null);
                    if (function0 != null) {
                        function0.invoke();
                    }
                    i6++;
                }
            }
            l0dVar.l(0, i5);
        }
    }

    public final void D(wma wmaVar) {
        dz dzVar = this.z;
        dzVar.x = true;
        if (dzVar.v()) {
            dzVar.w(wmaVar);
        }
        tz tzVar = this.A;
        tzVar.f = true;
        if (tzVar.f()) {
            tzVar.g.d(Unit.a);
        }
    }

    public final void E(wma wmaVar, boolean z, boolean z2, boolean z3) {
        wma v;
        wma v2;
        ux4 ux4Var = this.W;
        if (!z) {
            if (ux4Var.z(wmaVar, z2) && z3) {
                K(wmaVar);
                return;
            }
            return;
        }
        hcc hccVar = (hcc) ux4Var.e;
        wma wmaVar2 = wmaVar.h;
        ana anaVar = wmaVar.G;
        if (wmaVar2 == null) {
            r3a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = anaVar.d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    zzl.b();
                    return;
                }
                if (!anaVar.e || z2) {
                    anaVar.e = true;
                    anaVar.p.v = true;
                    if (wmaVar.Q) {
                        return;
                    }
                    if ((Intrinsics.c(wmaVar.J(), Boolean.TRUE) || ux4.n(wmaVar)) && ((v = wmaVar.v()) == null || !v.G.e)) {
                        hccVar.a(wmaVar, paa.a);
                    } else if ((wmaVar.I() || ux4.o(wmaVar)) && ((v2 = wmaVar.v()) == null || !v2.r())) {
                        hccVar.a(wmaVar, paa.c);
                    }
                    if (ux4Var.c || !z3) {
                        return;
                    }
                    K(wmaVar);
                    return;
                }
                return;
            }
        }
        ((i1d) ux4Var.h).b(new h1c(wmaVar, true, z2));
    }

    public final void F(wma wmaVar, boolean z, boolean z2) {
        ana anaVar = wmaVar.G;
        ux4 ux4Var = this.W;
        if (!z) {
            ux4Var.getClass();
            int ordinal = anaVar.d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                zzl.b();
                return;
            }
            wma v = wmaVar.v();
            boolean z3 = v == null || v.I();
            if (!z2) {
                if (wmaVar.r()) {
                    return;
                }
                if (wmaVar.q() && wmaVar.I() == z3 && wmaVar.I() == anaVar.p.u) {
                    return;
                }
            }
            j1c j1cVar = anaVar.p;
            j1cVar.w = true;
            j1cVar.x = true;
            if (!wmaVar.Q && j1cVar.u && z3) {
                if ((v == null || !v.q()) && (v == null || !v.r())) {
                    ((hcc) ux4Var.e).a(wmaVar, paa.d);
                }
                if (ux4Var.c) {
                    return;
                }
                K(null);
                return;
            }
            return;
        }
        hcc hccVar = (hcc) ux4Var.e;
        int ordinal2 = anaVar.d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    zzl.b();
                    return;
                }
            }
        }
        if ((anaVar.e || anaVar.f) && !z2) {
            return;
        }
        anaVar.f = true;
        anaVar.g = true;
        j1c j1cVar2 = anaVar.p;
        j1cVar2.w = true;
        j1cVar2.x = true;
        if (wmaVar.Q) {
            return;
        }
        wma v2 = wmaVar.v();
        if (Intrinsics.c(wmaVar.J(), Boolean.TRUE) && ((v2 == null || !v2.G.e) && (v2 == null || !v2.G.f))) {
            hccVar.a(wmaVar, paa.b);
        } else if (wmaVar.I() && ((v2 == null || !v2.q()) && (v2 == null || !v2.r()))) {
            hccVar.a(wmaVar, paa.d);
        }
        if (ux4Var.c) {
            return;
        }
        K(null);
    }

    public final void G() {
        dz dzVar = this.z;
        dzVar.x = true;
        Handler handler = dzVar.d.getHandler();
        if (dzVar.v() && !dzVar.I && handler != null) {
            dzVar.I = true;
            handler.post(dzVar.K);
        }
        tz tzVar = this.A;
        tzVar.f = true;
        Handler handler2 = tzVar.a.getHandler();
        if (!tzVar.f() || tzVar.l || handler2 == null) {
            return;
        }
        tzVar.l = true;
        handler2.post(tzVar.m);
    }

    public final void H() {
        if (this.g0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f0) {
            this.f0 = currentAnimationTimeMillis;
            ag2 ag2Var = this.H0;
            float[] fArr = this.d0;
            ag2Var.a(this, fArr);
            uaa.s(fArr, this.e0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.b0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.h0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void I(MotionEvent motionEvent) {
        this.f0 = AnimationUtils.currentAnimationTimeMillis();
        ag2 ag2Var = this.H0;
        float[] fArr = this.d0;
        ag2Var.a(this, fArr);
        uaa.s(fArr, this.e0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long b = xzb.b((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (b & 4294967295L));
        this.h0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean J() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void K(wma wmaVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (wmaVar != null) {
            while (wmaVar != null && wmaVar.s() == uma.a) {
                if (!this.V) {
                    wma v = wmaVar.v();
                    if (v == null) {
                        break;
                    }
                    long j = ((z3a) v.F.d).d;
                    if (an3.f(j) && an3.e(j)) {
                        break;
                    }
                }
                wmaVar = wmaVar.v();
            }
            if (wmaVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long L(long j) {
        H();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.h0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.h0 & 4294967295L));
        return xzb.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.e0);
    }

    public final int M(MotionEvent motionEvent) {
        Object obj;
        if (this.I0) {
            this.I0 = false;
            ata ataVar = getComposeViewContext().s;
            ((eoh) t8l.a).setValue(new uze(motionEvent.getMetaState()));
        }
        svc svcVar = this.I;
        k1d c = svcVar.c(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        n72 n72Var = this.J;
        if (c == null) {
            if (!n72Var.a) {
                ((nkb) ((bka) n72Var.d).b).a();
                ((gc9) n72Var.c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) c.b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = arrayList.get(size);
                if (((oze) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        oze ozeVar = (oze) obj;
        if (ozeVar != null) {
            this.b = ozeVar.d;
        }
        int l = n72Var.l(c, this, v(motionEvent));
        c.c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (l & 1) != 0) {
            return l;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        svcVar.c.delete(pointerId);
        svcVar.b.delete(pointerId);
        return l;
    }

    public final void N(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long y = y((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (y >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (y & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        k1d c = this.I.c(this, obtain);
        c.getClass();
        this.J.l(c, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(Function2 function2, sq3 sq3Var) {
        wy wyVar;
        int i;
        if (sq3Var instanceof wy) {
            wyVar = (wy) sq3Var;
            int i2 = wyVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wyVar.t = i2 - Integer.MIN_VALUE;
                Object obj = wyVar.r;
                lu3 lu3Var = lu3.a;
                i = wyVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    sy syVar = new sy(this, 2);
                    wyVar.t = 1;
                    if (s9a.r(new cce(syVar, this.n0, function2, (rq3) null, 14), wyVar) == lu3Var) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    y6a.M(obj);
                }
                pvd.x();
            }
        }
        wyVar = new wy(this, sq3Var);
        Object obj2 = wyVar.r;
        lu3 lu3Var2 = lu3.a;
        i = wyVar.t;
        if (i != 0) {
        }
        pvd.x();
    }

    public final void P(Configuration configuration) {
        e1d e1dVar;
        Configuration configuration2 = getConfiguration();
        if (Intrinsics.c(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(wnn.e(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (e1dVar = this.p.b) == null) {
            return;
        }
        ((eoh) e1dVar).setValue(rd0.s(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        boolean z;
        View view;
        float[] fArr;
        int i;
        int[] iArr = this.b0;
        getLocationOnScreen(iArr);
        long j = this.a0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.f0 < 0) {
            this.a0 = (4294967295L & iArr[1]) | (i4 << 32);
            if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                i1d z2 = getRoot().z();
                Object[] objArr = z2.a;
                int i5 = z2.c;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((wma) objArr[i6]).G.p.z0();
                }
                z = true;
                H();
                view = this.L0;
                if (view == null) {
                    view = getRootView();
                    this.L0 = view;
                }
                qqf rectManager = getRectManager();
                long j2 = this.a0;
                long L = s6a.L(this.h0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.d0;
                if (fArr.length >= 16) {
                    i = 0;
                } else {
                    i = (((fArr[0] == 1.0f && fArr[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[2] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[4] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[5] == 1.0f && fArr[6] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[8] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[9] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[13] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[14] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[15] == 1.0f) ? 1 : 0);
                }
                lgj lgjVar = rectManager.c;
                if ((i & 2) != 0) {
                    fArr = null;
                }
                rectManager.f = !lgjVar.b(j2, L, fArr, width, height) || rectManager.f;
                this.W.f(z);
                getRectManager().a();
            }
        }
        z = false;
        H();
        view = this.L0;
        if (view == null) {
        }
        qqf rectManager2 = getRectManager();
        long j22 = this.a0;
        long L2 = s6a.L(this.h0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.d0;
        if (fArr.length >= 16) {
        }
        lgj lgjVar2 = rectManager2.c;
        if ((i & 2) != 0) {
        }
        rectManager2.f = !lgjVar2.b(j22, L2, fArr, width2, height2) || rectManager2.f;
        this.W.f(z);
        getRectManager().a();
    }

    public final void R(float f) {
        if (t()) {
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (Float.isNaN(this.A0) || f > this.A0) {
                    this.A0 = f;
                    return;
                }
                return;
            }
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (Float.isNaN(this.B0) || f < this.B0) {
                    this.B0 = f;
                }
            }
        }
    }

    @Override // defpackage.vd8
    public final void a(ne8 ne8Var, ne8 ne8Var2) {
        c40 c40Var;
        boolean z;
        c40 c40Var2;
        boolean z2;
        if (ne8Var != null) {
            ne8 ne8Var3 = ne8Var;
            if (!ne8Var3.a.n) {
                r3a.b("visitAncestors called on an unattached node");
            }
            wtc wtcVar = ne8Var3.a;
            wma c0 = c6o.c0(ne8Var);
            y0d y0dVar = null;
            ArrayList arrayList = null;
            while (c0 != null) {
                if ((((wtc) c0.F.g).d & 2097152) != 0) {
                    while (wtcVar != null) {
                        if ((wtcVar.c & 2097152) != 0) {
                            wtc wtcVar2 = wtcVar;
                            i1d i1dVar = null;
                            while (wtcVar2 != null) {
                                if (wtcVar2 instanceof a2a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(wtcVar2);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (wtcVar2.c & 2097152) != 0 && (wtcVar2 instanceof bw4)) {
                                    int i = 0;
                                    for (wtc wtcVar3 = ((bw4) wtcVar2).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                        if ((wtcVar3.c & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                wtcVar2 = wtcVar3;
                                            } else {
                                                if (i1dVar == null) {
                                                    i1dVar = new i1d(new wtc[16], 0);
                                                }
                                                if (wtcVar2 != null) {
                                                    i1dVar.b(wtcVar2);
                                                    wtcVar2 = null;
                                                }
                                                i1dVar.b(wtcVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                wtcVar2 = c6o.X(i1dVar);
                            }
                        }
                        wtcVar = wtcVar.e;
                    }
                }
                c0 = c0.v();
                wtcVar = (c0 == null || (c40Var2 = c0.F) == null) ? null : (hti) c40Var2.f;
            }
            if (arrayList == null) {
                return;
            }
            if (ne8Var2 != null) {
                if (!ne8Var2.a.n) {
                    r3a.b("visitAncestors called on an unattached node");
                }
                wtc wtcVar4 = ne8Var2.a;
                wma c02 = c6o.c0(ne8Var2);
                y0d y0dVar2 = null;
                while (c02 != null) {
                    if ((((wtc) c02.F.g).d & 2097152) != 0) {
                        while (wtcVar4 != null) {
                            if ((wtcVar4.c & 2097152) != 0) {
                                wtc wtcVar5 = wtcVar4;
                                i1d i1dVar2 = null;
                                while (wtcVar5 != null) {
                                    if (wtcVar5 instanceof a2a) {
                                        if (y0dVar2 == null) {
                                            y0d y0dVar3 = rrg.a;
                                            y0dVar2 = new y0d();
                                        }
                                        y0dVar2.a(wtcVar5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (wtcVar5.c & 2097152) != 0 && (wtcVar5 instanceof bw4)) {
                                        int i2 = 0;
                                        for (wtc wtcVar6 = ((bw4) wtcVar5).p; wtcVar6 != null; wtcVar6 = wtcVar6.f) {
                                            if ((wtcVar6.c & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    wtcVar5 = wtcVar6;
                                                } else {
                                                    if (i1dVar2 == null) {
                                                        i1dVar2 = new i1d(new wtc[16], 0);
                                                    }
                                                    if (wtcVar5 != null) {
                                                        i1dVar2.b(wtcVar5);
                                                        wtcVar5 = null;
                                                    }
                                                    i1dVar2.b(wtcVar6);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    wtcVar5 = c6o.X(i1dVar2);
                                }
                            }
                            wtcVar4 = wtcVar4.e;
                        }
                    }
                    c02 = c02.v();
                    wtcVar4 = (c02 == null || (c40Var = c02.F) == null) ? null : (hti) c40Var.f;
                }
                y0dVar = y0dVar2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                a2a a2aVar = (a2a) arrayList.get(i3);
                if (!(y0dVar != null ? y0dVar.c(a2aVar) : false)) {
                    a2aVar.K0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ne8 ne8Var = ((yd8) getFocusOwner()).c;
        if (!ne8Var.n) {
            return;
        }
        if (!ne8Var.a.n) {
            r3a.b("visitSubtreeIf called on an unattached node");
        }
        i1d i1dVar = new i1d(new wtc[16], 0);
        wtc wtcVar = ne8Var.a;
        wtc wtcVar2 = wtcVar.f;
        if (wtcVar2 == null) {
            c6o.x(i1dVar, wtcVar);
        } else {
            i1dVar.b(wtcVar2);
        }
        while (true) {
            int i3 = i1dVar.c;
            if (i3 == 0) {
                return;
            }
            wtc wtcVar3 = (wtc) i1dVar.r(i3 - 1);
            if ((wtcVar3.d & 1024) != 0) {
                for (wtc wtcVar4 = wtcVar3; wtcVar4 != null && wtcVar4.n; wtcVar4 = wtcVar4.f) {
                    if ((wtcVar4.c & 1024) != 0) {
                        wtc wtcVar5 = wtcVar4;
                        i1d i1dVar2 = null;
                        while (wtcVar5 != null) {
                            if (wtcVar5 instanceof ne8) {
                                ne8 ne8Var2 = (ne8) wtcVar5;
                                if (ne8Var2.n && ne8Var2.m1().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    ne8 ne8Var3 = ((yd8) getFocusOwner()).c;
                                    if (ne8Var3.n) {
                                        if (!ne8Var3.a.n) {
                                            r3a.b("visitSubtreeIf called on an unattached node");
                                        }
                                        i1d i1dVar3 = new i1d(new wtc[16], 0);
                                        wtc wtcVar6 = ne8Var3.a;
                                        wtc wtcVar7 = wtcVar6.f;
                                        if (wtcVar7 == null) {
                                            c6o.x(i1dVar3, wtcVar6);
                                        } else {
                                            i1dVar3.b(wtcVar7);
                                        }
                                        while (true) {
                                            int i4 = i1dVar3.c;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            wtc wtcVar8 = (wtc) i1dVar3.r(i4 - 1);
                                            if ((wtcVar8.d & 1024) != 0) {
                                                for (wtc wtcVar9 = wtcVar8; wtcVar9 != null && wtcVar9.n; wtcVar9 = wtcVar9.f) {
                                                    if ((wtcVar9.c & 1024) != 0) {
                                                        wtc wtcVar10 = wtcVar9;
                                                        i1d i1dVar4 = null;
                                                        while (wtcVar10 != null) {
                                                            if (wtcVar10 instanceof ne8) {
                                                                ne8 ne8Var4 = (ne8) wtcVar10;
                                                                if (ne8Var4.n) {
                                                                    ae8 m1 = ne8Var4.m1();
                                                                    if (ne8Var4.n && !ne8Var4.o && m1.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((wtcVar10.c & 1024) != 0 && (wtcVar10 instanceof bw4)) {
                                                                int i5 = 0;
                                                                for (wtc wtcVar11 = ((bw4) wtcVar10).p; wtcVar11 != null; wtcVar11 = wtcVar11.f) {
                                                                    if ((wtcVar11.c & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            wtcVar10 = wtcVar11;
                                                                        } else {
                                                                            if (i1dVar4 == null) {
                                                                                i1dVar4 = new i1d(new wtc[16], 0);
                                                                            }
                                                                            if (wtcVar10 != null) {
                                                                                i1dVar4.b(wtcVar10);
                                                                                wtcVar10 = null;
                                                                            }
                                                                            i1dVar4.b(wtcVar11);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            wtcVar10 = c6o.X(i1dVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            c6o.x(i1dVar3, wtcVar8);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((wtcVar5.c & 1024) != 0 && (wtcVar5 instanceof bw4)) {
                                int i6 = 0;
                                for (wtc wtcVar12 = ((bw4) wtcVar5).p; wtcVar12 != null; wtcVar12 = wtcVar12.f) {
                                    if ((wtcVar12.c & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            wtcVar5 = wtcVar12;
                                        } else {
                                            if (i1dVar2 == null) {
                                                i1dVar2 = new i1d(new wtc[16], 0);
                                            }
                                            if (wtcVar5 != null) {
                                                i1dVar2.b(wtcVar5);
                                                wtcVar5 = null;
                                            }
                                            i1dVar2.b(wtcVar12);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            wtcVar5 = c6o.X(i1dVar2);
                        }
                    }
                }
            }
            c6o.x(i1dVar, wtcVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        l3h x;
        Function1 function1;
        Function1 function12;
        tx txVar = this.N;
        if (txVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                wma wmaVar = (wma) txVar.b.c.b(keyAt);
                if (wmaVar != null && (x = wmaVar.x()) != null) {
                    x0d x0dVar = x.a;
                    Object g = x0dVar.g(k3h.g);
                    if (g == null) {
                        g = null;
                    }
                    m9 m9Var = (m9) g;
                    if (m9Var != null && (function12 = (Function1) m9Var.b) != null) {
                    }
                    Object g2 = x0dVar.g(k3h.h);
                    m9 m9Var2 = (m9) (g2 != null ? g2 : null);
                    if (m9Var2 != null && (function1 = (Function1) m9Var2.b) != null) {
                    }
                }
            }
        }
        ujg ujgVar = this.M;
        if (ujgVar != null) {
            ov0 ov0Var = (ov0) ujgVar.c;
            if (ov0Var.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int keyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(keyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (ov0Var.a.get(Integer.valueOf(keyAt2)) != null) {
                        pvd.j();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new ped("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new ped("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new ped("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.z.m(this.b, i, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.z.m(this.b, i, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l0d l0dVar = this.E;
        if (!isAttachedToWindow()) {
            r(getRoot());
        }
        z(true);
        snh.h().m();
        this.G = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            xj2 xj2Var = this.s;
            wx wxVar = xj2Var.a;
            Canvas canvas2 = wxVar.a;
            wxVar.a = canvas;
            getRoot().j(wxVar, null);
            xj2Var.a.a = canvas2;
            if (l0dVar.i()) {
                int i = l0dVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((q29) ((qyd) l0dVar.f(i2))).g();
                }
            }
            int i3 = htk.a;
            l0dVar.d();
            this.G = false;
            Unit unit = Unit.a;
            Trace.endSection();
            l0d l0dVar2 = this.F;
            if (l0dVar2 != null) {
                l0dVar.b(l0dVar2);
                l0dVar2.d();
            }
            if (t()) {
                l90.a(this, this.A0);
                View view = this.l;
                if (view != null) {
                    l90.a(view, this.B0);
                    if (!Float.isNaN(this.B0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.A0 = Float.NaN;
                this.B0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:653:0x044b, code lost:
    
        if ((r3 / r4) >= 5.0f) goto L252;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [wtc] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57, types: [wtc] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v75 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        String str;
        int i2;
        b10 b10Var;
        p1a p1aVar;
        long j;
        ArrayList arrayList;
        String str2;
        long j2;
        int i3;
        char c;
        long j3;
        a2a a2aVar;
        c40 c40Var;
        boolean z;
        bw4 bw4Var;
        c40 c40Var2;
        wtc X;
        a2a a2aVar2;
        boolean z2;
        int size;
        int size2;
        c40 c40Var3;
        boolean z3;
        bw4 bw4Var2;
        c40 c40Var4;
        wtc X2;
        boolean z4;
        ky kyVar;
        c40 c40Var5;
        boolean z5;
        wtc wtcVar;
        c40 c40Var6;
        if (this.E0) {
            hy hyVar = this.D0;
            removeCallbacks(hyVar);
            if (motionEvent.getActionMasked() == 8) {
                this.E0 = false;
            } else {
                hyVar.run();
            }
        }
        if (u(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int i4 = 3;
        String str3 = "visitAncestors called on an unattached node";
        int i5 = -1;
        int i6 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (q(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            viewConfiguration.getScaledVerticalScrollFactor();
            getContext();
            viewConfiguration.getScaledHorizontalScrollFactor();
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            wd8 focusOwner = getFocusOwner();
            y1 y1Var = new y1(i4, this, motionEvent);
            yd8 yd8Var = (yd8) focusOwner;
            if (yd8Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            ne8 R = l98.R(yd8Var.c);
            if (R != null) {
                if (!R.a.n) {
                    r3a.b("visitAncestors called on an unattached node");
                }
                wtc wtcVar2 = R.a;
                wma c0 = c6o.c0(R);
                loop0: while (true) {
                    if (c0 == null) {
                        wtcVar = null;
                        break;
                    }
                    if ((((wtc) c0.F.g).d & 16384) != 0) {
                        while (wtcVar2 != null) {
                            if ((wtcVar2.c & 16384) != 0) {
                                wtcVar = wtcVar2;
                                i1d i1dVar = null;
                                while (wtcVar != null) {
                                    if (wtcVar instanceof ky) {
                                        break loop0;
                                    }
                                    if ((wtcVar.c & 16384) != 0 && (wtcVar instanceof bw4)) {
                                        int i7 = 0;
                                        for (wtc wtcVar3 = ((bw4) wtcVar).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                            if ((wtcVar3.c & 16384) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    Unit unit = Unit.a;
                                                    wtcVar = wtcVar3;
                                                } else {
                                                    if (i1dVar == null) {
                                                        i1dVar = new i1d(new wtc[16], 0);
                                                    }
                                                    if (wtcVar != null) {
                                                        i1dVar.b(wtcVar);
                                                        wtcVar = null;
                                                    }
                                                    i1dVar.b(wtcVar3);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    wtcVar = c6o.X(i1dVar);
                                }
                            }
                            wtcVar2 = wtcVar2.e;
                        }
                    }
                    c0 = c0.v();
                    wtcVar2 = (c0 == null || (c40Var6 = c0.F) == null) ? null : (hti) c40Var6.f;
                }
                kyVar = (ky) wtcVar;
            } else {
                kyVar = null;
            }
            if (kyVar != null) {
                if (!kyVar.a.n) {
                    r3a.b("visitAncestors called on an unattached node");
                }
                wtc wtcVar4 = kyVar.a.e;
                wma c02 = c6o.c0(kyVar);
                ArrayList arrayList2 = null;
                while (c02 != null) {
                    if ((((wtc) c02.F.g).d & 16384) != 0) {
                        while (wtcVar4 != null) {
                            if ((wtcVar4.c & 16384) != 0) {
                                wtc wtcVar5 = wtcVar4;
                                i1d i1dVar2 = null;
                                while (wtcVar5 != null) {
                                    if (wtcVar5 instanceof ky) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(wtcVar5);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (wtcVar5.c & 16384) != 0 && (wtcVar5 instanceof bw4)) {
                                        int i8 = 0;
                                        for (wtc wtcVar6 = ((bw4) wtcVar5).p; wtcVar6 != null; wtcVar6 = wtcVar6.f) {
                                            if ((wtcVar6.c & 16384) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    Unit unit2 = Unit.a;
                                                    wtcVar5 = wtcVar6;
                                                } else {
                                                    if (i1dVar2 == null) {
                                                        i1dVar2 = new i1d(new wtc[16], 0);
                                                    }
                                                    if (wtcVar5 != null) {
                                                        i1dVar2.b(wtcVar5);
                                                        wtcVar5 = null;
                                                    }
                                                    i1dVar2.b(wtcVar6);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    wtcVar5 = c6o.X(i1dVar2);
                                }
                            }
                            wtcVar4 = wtcVar4.e;
                        }
                    }
                    c02 = c02.v();
                    wtcVar4 = (c02 == null || (c40Var5 = c02.F) == null) ? null : (hti) c40Var5.f;
                }
                if (arrayList2 != null) {
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i9 = size3 - 1;
                            ((ky) arrayList2.get(size3)).getClass();
                            if (i9 < 0) {
                                break;
                            }
                            size3 = i9;
                        }
                    }
                    Unit unit3 = Unit.a;
                }
                wtc wtcVar7 = kyVar.a;
                i1d i1dVar3 = null;
                while (wtcVar7 != null) {
                    if (!(wtcVar7 instanceof ky) && (wtcVar7.c & 16384) != 0 && (wtcVar7 instanceof bw4)) {
                        int i10 = 0;
                        for (wtc wtcVar8 = ((bw4) wtcVar7).p; wtcVar8 != null; wtcVar8 = wtcVar8.f) {
                            if ((wtcVar8.c & 16384) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    Unit unit4 = Unit.a;
                                    wtcVar7 = wtcVar8;
                                } else {
                                    if (i1dVar3 == null) {
                                        i1dVar3 = new i1d(new wtc[16], 0);
                                    }
                                    if (wtcVar7 != null) {
                                        i1dVar3.b(wtcVar7);
                                        wtcVar7 = null;
                                    }
                                    i1dVar3.b(wtcVar8);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    wtcVar7 = c6o.X(i1dVar3);
                }
                if (!((Boolean) y1Var.invoke()).booleanValue()) {
                    wtc wtcVar9 = kyVar.a;
                    i1d i1dVar4 = null;
                    while (wtcVar9 != null) {
                        if (!(wtcVar9 instanceof ky) && (wtcVar9.c & 16384) != 0 && (wtcVar9 instanceof bw4)) {
                            int i11 = 0;
                            for (wtc wtcVar10 = ((bw4) wtcVar9).p; wtcVar10 != null; wtcVar10 = wtcVar10.f) {
                                if ((wtcVar10.c & 16384) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        Unit unit5 = Unit.a;
                                        wtcVar9 = wtcVar10;
                                    } else {
                                        if (i1dVar4 == null) {
                                            i1dVar4 = new i1d(new wtc[16], 0);
                                        }
                                        if (wtcVar9 != null) {
                                            i1dVar4.b(wtcVar9);
                                            wtcVar9 = null;
                                        }
                                        i1dVar4.b(wtcVar10);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        wtcVar9 = c6o.X(i1dVar4);
                    }
                    if (arrayList2 != null) {
                        int size4 = arrayList2.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            ((ky) arrayList2.get(i12)).getClass();
                        }
                        Unit unit6 = Unit.a;
                    }
                    Unit unit7 = Unit.a;
                    return false;
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        p1a p1aVar2 = this.d;
        svc svcVar = this.I;
        nkb nkbVar = svcVar.e;
        SparseLongArray sparseLongArray = svcVar.b;
        int actionMasked = motionEvent.getActionMasked();
        svcVar.b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            svcVar.c.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            b10Var = null;
        } else {
            svcVar.a(motionEvent);
            if (actionMasked == 1) {
                i5 = 0;
            } else if (actionMasked == 6) {
                i5 = motionEvent.getActionIndex();
            }
            boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            i = 16;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList3 = new ArrayList(pointerCount);
            int i13 = 0;
            while (i13 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i13);
                int i14 = i6;
                int indexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (indexOfKey >= 0) {
                    p1aVar = p1aVar2;
                    j = sparseLongArray.valueAt(indexOfKey);
                    arrayList = arrayList3;
                } else {
                    p1aVar = p1aVar2;
                    j = svcVar.a;
                    arrayList = arrayList3;
                    svcVar.a = j + 1;
                    sparseLongArray.put(pointerId, j);
                }
                svc svcVar2 = svcVar;
                long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX(i13)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i13)) & 4294967295L);
                ?? r32 = i13 != i5 ? i14 : 0;
                rvc rvcVar = (rvc) nkbVar.c(j);
                if (i13 == i5) {
                    nkbVar.h(j);
                    str2 = str3;
                    j2 = 2147483647L;
                    c = ' ';
                    i3 = 65535;
                } else {
                    if (z6) {
                        str2 = str3;
                        i3 = 65535;
                        j2 = 2147483647L;
                        nkbVar.g(new rvc(1 | ((motionEvent.getEventTime() & 2147483647L) << i14) | (((((short) Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) << 16) | (((short) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) & 65535)) << 32)), j);
                    } else {
                        str2 = str3;
                        j2 = 2147483647L;
                        i3 = 65535;
                    }
                    c = ' ';
                }
                long eventTime = motionEvent.getEventTime();
                int i15 = i3;
                float pressure = motionEvent.getPressure(i13);
                long eventTime2 = rvcVar != null ? (rvcVar.a >> i14) & j2 : motionEvent.getEventTime();
                if (rvcVar != null) {
                    int i16 = (int) (rvcVar.a >>> c);
                    j3 = (Float.floatToRawIntBits((short) (i15 & i16)) & 4294967295L) | (Float.floatToRawIntBits((short) (i16 >>> 16)) << c);
                } else {
                    j3 = floatToRawIntBits;
                }
                ArrayList arrayList4 = arrayList;
                arrayList4.add(new q1a(j, eventTime, floatToRawIntBits, r32, pressure, eventTime2, j3, rvcVar != null ? (rvcVar.a & 1) != 0 ? i14 : 0 : 0));
                i13++;
                arrayList3 = arrayList4;
                svcVar = svcVar2;
                i6 = i14;
                p1aVar2 = p1aVar;
                str3 = str2;
            }
            p1a p1aVar3 = p1aVar2;
            ArrayList arrayList5 = arrayList3;
            str = str3;
            int i17 = i6;
            svcVar.e(motionEvent);
            if (p1aVar3 != null) {
                i2 = p1aVar3.a;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    a70.p("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i17);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range <= range2 || (range2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && range / range2 < 5.0f)) {
                                    if (range2 > range) {
                                        if (range != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        }
                                    }
                                }
                            }
                        }
                        i2 = 2;
                    }
                    i2 = 1;
                }
                i2 = 0;
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            b10Var = new b10(arrayList5, i2, motionEvent);
        }
        a02 a02Var = this.F0;
        if (b10Var == null) {
            ne8 g = ((yd8) getFocusOwner()).g();
            if (g != null) {
                if (!g.a.n) {
                    r3a.b(str);
                }
                wtc wtcVar11 = g.a;
                wma c03 = c6o.c0(g);
                loop26: while (true) {
                    if (c03 == null) {
                        bw4Var = 0;
                        break;
                    }
                    int i18 = 2097152;
                    if ((((wtc) c03.F.g).d & 2097152) != 0) {
                        while (wtcVar11 != null) {
                            if ((wtcVar11.c & i18) != 0) {
                                bw4Var = wtcVar11;
                                i1d i1dVar5 = null;
                                while (bw4Var != 0) {
                                    if (bw4Var instanceof a2a) {
                                        break loop26;
                                    }
                                    i1d i1dVar6 = i1dVar5;
                                    if ((bw4Var.c & i18) != 0) {
                                        i1dVar6 = i1dVar5;
                                        if (bw4Var instanceof bw4) {
                                            wtc wtcVar12 = bw4Var.p;
                                            int i19 = 0;
                                            X = bw4Var;
                                            i1dVar6 = i1dVar5;
                                            while (wtcVar12 != null) {
                                                if ((wtcVar12.c & i18) != 0) {
                                                    i19++;
                                                    i1dVar6 = i1dVar6;
                                                    if (i19 == 1) {
                                                        X = wtcVar12;
                                                    } else {
                                                        if (i1dVar6 == null) {
                                                            i1dVar6 = new i1d(new wtc[16], 0);
                                                        }
                                                        if (X != null) {
                                                            i1dVar6.b(X);
                                                            X = null;
                                                        }
                                                        i1dVar6.b(wtcVar12);
                                                    }
                                                }
                                                wtcVar12 = wtcVar12.f;
                                                i18 = 2097152;
                                                X = X;
                                                i1dVar6 = i1dVar6;
                                            }
                                            i1dVar6 = i1dVar6;
                                            if (i19 == 1) {
                                                i18 = 2097152;
                                                bw4Var = X;
                                                i1dVar5 = i1dVar6;
                                            }
                                        }
                                    }
                                    X = c6o.X(i1dVar6);
                                    i18 = 2097152;
                                    bw4Var = X;
                                    i1dVar5 = i1dVar6;
                                }
                            }
                            wtcVar11 = wtcVar11.e;
                            i18 = 2097152;
                        }
                    }
                    c03 = c03.v();
                    wtcVar11 = (c03 == null || (c40Var2 = c03.F) == null) ? null : (hti) c40Var2.f;
                }
                a2aVar = (a2a) bw4Var;
            } else {
                a2aVar = null;
            }
            if (a2aVar != null) {
                wtc wtcVar13 = (wtc) a2aVar;
                if (!wtcVar13.a.n) {
                    r3a.b(str);
                }
                wtc wtcVar14 = wtcVar13.a.e;
                wma c04 = c6o.c0(a2aVar);
                ArrayList arrayList6 = null;
                while (c04 != null) {
                    int i20 = 2097152;
                    if ((((wtc) c04.F.g).d & 2097152) != 0) {
                        while (wtcVar14 != null) {
                            if ((wtcVar14.c & i20) != 0) {
                                wtc wtcVar15 = wtcVar14;
                                i1d i1dVar7 = null;
                                while (wtcVar15 != null) {
                                    if (wtcVar15 instanceof a2a) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList6.add(wtcVar15);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (wtcVar15.c & 2097152) != 0 && (wtcVar15 instanceof bw4)) {
                                        i1d i1dVar8 = i1dVar7;
                                        wtc wtcVar16 = wtcVar15;
                                        int i21 = 0;
                                        for (wtc wtcVar17 = ((bw4) wtcVar15).p; wtcVar17 != null; wtcVar17 = wtcVar17.f) {
                                            if ((wtcVar17.c & 2097152) != 0) {
                                                i21++;
                                                if (i21 == 1) {
                                                    wtcVar16 = wtcVar17;
                                                } else {
                                                    if (i1dVar8 == null) {
                                                        i1dVar8 = new i1d(new wtc[16], 0);
                                                    }
                                                    if (wtcVar16 != null) {
                                                        i1dVar8.b(wtcVar16);
                                                        wtcVar16 = null;
                                                    }
                                                    i1dVar8.b(wtcVar17);
                                                }
                                            }
                                        }
                                        if (i21 == 1) {
                                            wtcVar15 = wtcVar16;
                                            i1dVar7 = i1dVar8;
                                        } else {
                                            i1dVar7 = i1dVar8;
                                            wtcVar15 = c6o.X(i1dVar7);
                                        }
                                    }
                                    wtcVar15 = c6o.X(i1dVar7);
                                }
                            }
                            i20 = 2097152;
                            wtcVar14 = wtcVar14.e;
                        }
                    }
                    c04 = c04.v();
                    wtcVar14 = (c04 == null || (c40Var = c04.F) == null) ? null : (hti) c40Var.f;
                }
                a2aVar.K0();
                if (arrayList6 != null) {
                    int size5 = arrayList6.size();
                    for (int i22 = 0; i22 < size5; i22++) {
                        ((a2a) arrayList6.get(i22)).K0();
                    }
                }
            }
            a02Var.b = 0;
            a02Var.c = true;
            return true;
        }
        yd8 yd8Var2 = (yd8) getFocusOwner();
        if (yd8Var2.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            ne8 g2 = yd8Var2.g();
            if (g2 != null) {
                if (!g2.a.n) {
                    r3a.b(str);
                }
                wtc wtcVar18 = g2.a;
                wma c05 = c6o.c0(g2);
                loop14: while (true) {
                    if (c05 == null) {
                        bw4Var2 = 0;
                        break;
                    }
                    int i23 = 2097152;
                    if ((((wtc) c05.F.g).d & 2097152) != 0) {
                        while (wtcVar18 != null) {
                            if ((wtcVar18.c & i23) != 0) {
                                bw4Var2 = wtcVar18;
                                i1d i1dVar9 = null;
                                while (bw4Var2 != 0) {
                                    if (bw4Var2 instanceof a2a) {
                                        break loop14;
                                    }
                                    i1d i1dVar10 = i1dVar9;
                                    if ((bw4Var2.c & i23) != 0) {
                                        i1dVar10 = i1dVar9;
                                        if (bw4Var2 instanceof bw4) {
                                            wtc wtcVar19 = bw4Var2.p;
                                            int i24 = 0;
                                            X2 = bw4Var2;
                                            i1dVar10 = i1dVar9;
                                            while (wtcVar19 != null) {
                                                if ((wtcVar19.c & i23) != 0) {
                                                    i24++;
                                                    i1dVar10 = i1dVar10;
                                                    if (i24 == 1) {
                                                        X2 = wtcVar19;
                                                    } else {
                                                        if (i1dVar10 == null) {
                                                            i1dVar10 = new i1d(new wtc[i], 0);
                                                        }
                                                        if (X2 != null) {
                                                            i1dVar10.b(X2);
                                                            X2 = null;
                                                        }
                                                        i1dVar10.b(wtcVar19);
                                                    }
                                                }
                                                wtcVar19 = wtcVar19.f;
                                                i23 = 2097152;
                                                i = 16;
                                                X2 = X2;
                                                i1dVar10 = i1dVar10;
                                            }
                                            i1dVar10 = i1dVar10;
                                            if (i24 == 1) {
                                                i23 = 2097152;
                                                i = 16;
                                                bw4Var2 = X2;
                                                i1dVar9 = i1dVar10;
                                            }
                                        }
                                    }
                                    X2 = c6o.X(i1dVar10);
                                    i23 = 2097152;
                                    i = 16;
                                    bw4Var2 = X2;
                                    i1dVar9 = i1dVar10;
                                }
                            }
                            wtcVar18 = wtcVar18.e;
                            i23 = 2097152;
                            i = 16;
                        }
                    }
                    c05 = c05.v();
                    wtcVar18 = (c05 == null || (c40Var4 = c05.F) == null) ? null : (hti) c40Var4.f;
                    i = 16;
                }
                a2aVar2 = (a2a) bw4Var2;
            } else {
                a2aVar2 = null;
            }
            if (a2aVar2 != null) {
                wtc wtcVar20 = (wtc) a2aVar2;
                if (!wtcVar20.a.n) {
                    r3a.b(str);
                }
                wtc wtcVar21 = wtcVar20.a.e;
                wma c06 = c6o.c0(a2aVar2);
                ArrayList arrayList7 = null;
                while (c06 != null) {
                    int i25 = 2097152;
                    if ((((wtc) c06.F.g).d & 2097152) != 0) {
                        while (wtcVar21 != null) {
                            if ((wtcVar21.c & i25) != 0) {
                                wtc wtcVar22 = wtcVar21;
                                i1d i1dVar11 = null;
                                while (wtcVar22 != null) {
                                    if (wtcVar22 instanceof a2a) {
                                        if (arrayList7 == null) {
                                            arrayList7 = new ArrayList();
                                        }
                                        arrayList7.add(wtcVar22);
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        int i26 = 2097152;
                                        if ((wtcVar22.c & 2097152) != 0 && (wtcVar22 instanceof bw4)) {
                                            wtc wtcVar23 = ((bw4) wtcVar22).p;
                                            int i27 = 0;
                                            while (wtcVar23 != null) {
                                                if ((wtcVar23.c & i26) != 0) {
                                                    i27++;
                                                    if (i27 == 1) {
                                                        wtcVar22 = wtcVar23;
                                                    } else {
                                                        if (i1dVar11 == null) {
                                                            i1dVar11 = new i1d(new wtc[16], 0);
                                                        }
                                                        if (wtcVar22 != null) {
                                                            i1dVar11.b(wtcVar22);
                                                            wtcVar22 = null;
                                                        }
                                                        i1dVar11.b(wtcVar23);
                                                    }
                                                }
                                                wtcVar23 = wtcVar23.f;
                                                i26 = 2097152;
                                            }
                                            if (i27 == 1) {
                                            }
                                        }
                                    }
                                    wtcVar22 = c6o.X(i1dVar11);
                                }
                            }
                            wtcVar21 = wtcVar21.e;
                            i25 = 2097152;
                        }
                    }
                    c06 = c06.v();
                    wtcVar21 = (c06 == null || (c40Var3 = c06.F) == null) ? null : (hti) c40Var3.f;
                }
                if (arrayList7 != null && arrayList7.size() - 1 >= 0) {
                    while (true) {
                        int i28 = size2 - 1;
                        ((a2a) arrayList7.get(size2)).y(b10Var, gze.a);
                        if (i28 < 0) {
                            break;
                        }
                        size2 = i28;
                    }
                }
                a2aVar2.y(b10Var, gze.a);
                a2aVar2.y(b10Var, gze.b);
                if (arrayList7 != null) {
                    int size6 = arrayList7.size();
                    for (int i29 = 0; i29 < size6; i29++) {
                        ((a2a) arrayList7.get(i29)).y(b10Var, gze.b);
                    }
                }
                if (arrayList7 != null && arrayList7.size() - 1 >= 0) {
                    while (true) {
                        int i30 = size - 1;
                        ((a2a) arrayList7.get(size)).y(b10Var, gze.c);
                        if (i30 < 0) {
                            break;
                        }
                        size = i30;
                    }
                }
                a2aVar2.y(b10Var, gze.c);
            }
            ArrayList arrayList8 = (ArrayList) b10Var.c;
            int size7 = arrayList8.size();
            for (int i31 = 0; i31 < size7; i31++) {
                if (((q1a) arrayList8.get(i31)).i) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        a02Var.getClass();
        MotionEvent motionEvent2 = (MotionEvent) b10Var.d;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z4 = true;
            if ((action == 1 || action == 2) && z2) {
                a02Var.b = 0;
                a02Var.c = true;
            }
        } else {
            z4 = true;
            a02Var.b = b10Var.b;
            a02Var.c = false;
        }
        ((GestureDetector) a02Var.e).onTouchEvent(motionEvent2);
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0156, code lost:
    
        if (w(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.E0;
        hy hyVar = this.D0;
        if (z) {
            removeCallbacks(hyVar);
            hyVar.run();
        }
        if (!u(motionEvent) && isAttachedToWindow()) {
            dz dzVar = this.z;
            xy xyVar = dzVar.d;
            AccessibilityManager accessibilityManager = dzVar.g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    xyVar.z(true);
                    jc9 jc9Var = new jc9();
                    c40 c40Var = xyVar.getRoot().F;
                    wdd wddVar = (wdd) c40Var.e;
                    f4g f4gVar = wdd.N;
                    ((wdd) c40Var.e).j1(wdd.R, wddVar.b1((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), jc9Var, 1, true);
                    l0d l0dVar = jc9Var.a;
                    for (int i2 = l0dVar.b - 1; -1 < i2; i2--) {
                        Object f = l0dVar.f(i2);
                        f.getClass();
                        wma c0 = c6o.c0((wtc) f);
                        if (xyVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c0) != null) {
                            break;
                        }
                        if (c0.F.n(8)) {
                            int A = dzVar.A(c0.b);
                            s3h e = ufa.e(c0, false);
                            if (rd0.K(e)) {
                                if (!e.k().a.c(w3h.B)) {
                                    i = A;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    xyVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = dzVar.e;
                    if (i3 != i) {
                        dzVar.e = i;
                        dz.E(dzVar, i, 128, null, 12);
                        dz.E(dzVar, i3, NotificationCompat.FLAG_LOCAL_ONLY, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = dzVar.e;
                    if (i4 == Integer.MIN_VALUE) {
                        xyVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        dzVar.e = Integer.MIN_VALUE;
                        dz.E(dzVar, Integer.MIN_VALUE, 128, null, 12);
                        dz.E(dzVar, i4, NotificationCompat.FLAG_LOCAL_ONLY, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && v(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.w0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.w0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.E0 = true;
                        postDelayed(hyVar, 8L);
                        return false;
                    }
                }
                if ((q(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((yd8) getFocusOwner()).e(keyEvent, new y1(2, this, keyEvent));
        }
        ata ataVar = getComposeViewContext().s;
        ((eoh) t8l.a).setValue(new uze(keyEvent.getMetaState()));
        return ((yd8) getFocusOwner()).e(keyEvent, zg3.q) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        c40 c40Var;
        if (isFocused()) {
            yd8 yd8Var = (yd8) getFocusOwner();
            if (yd8Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                ne8 R = l98.R(yd8Var.c);
                if (R != null) {
                    if (!R.a.n) {
                        r3a.b("visitAncestors called on an unattached node");
                    }
                    wtc wtcVar = R.a;
                    wma c0 = c6o.c0(R);
                    while (c0 != null) {
                        if ((((wtc) c0.F.g).d & 131072) != 0) {
                            while (wtcVar != null) {
                                if ((wtcVar.c & 131072) != 0) {
                                    wtc wtcVar2 = wtcVar;
                                    i1d i1dVar = null;
                                    while (wtcVar2 != null) {
                                        if ((wtcVar2.c & 131072) != 0 && (wtcVar2 instanceof bw4)) {
                                            int i = 0;
                                            for (wtc wtcVar3 = ((bw4) wtcVar2).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                                if ((wtcVar3.c & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        Unit unit = Unit.a;
                                                        wtcVar2 = wtcVar3;
                                                    } else {
                                                        if (i1dVar == null) {
                                                            i1dVar = new i1d(new wtc[16], 0);
                                                        }
                                                        if (wtcVar2 != null) {
                                                            i1dVar.b(wtcVar2);
                                                            wtcVar2 = null;
                                                        }
                                                        i1dVar.b(wtcVar3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        wtcVar2 = c6o.X(i1dVar);
                                    }
                                }
                                wtcVar = wtcVar.e;
                            }
                        }
                        c0 = c0.v();
                        wtcVar = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            ez.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object bq0Var;
        ne8 g;
        if (this.E0) {
            hy hyVar = this.D0;
            removeCallbacks(hyVar);
            MotionEvent motionEvent2 = this.w0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.E0 = false;
            } else {
                hyVar.run();
            }
        }
        if (!u(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || w(motionEvent))) {
            int q = q(motionEvent);
            if ((q & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (bq0Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    bq0Var = new bq0(1);
                }
                if (bq0Var.equals(new bq0(1)) && (g = ((yd8) getFocusOwner()).g()) != null) {
                    wdd b0 = c6o.b0(g);
                    if (!o6a.y(b0).p(b0, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        wd8.a(getFocusOwner());
                    }
                }
            }
            if ((q & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        qj2 qj2Var;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(ktm.w());
        }
        c7b c7bVar = this.g;
        if (c7bVar != null) {
            b7b b7bVar = this.f;
            b7bVar.getClass();
            r45 r45Var = (r45) c7bVar.a.b;
            if (!r45Var.a || r45Var.c) {
                return;
            }
            try {
                qj2Var = ((zll) b7bVar).a.v(new hv7(c7bVar, 19));
            } catch (CancellationException unused) {
                if (!r45Var.b) {
                    if (r45Var.c) {
                        i3f.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    r45Var.b();
                    r45Var.c = true;
                }
                qj2Var = null;
            }
            qj2 qj2Var2 = c7bVar.d;
            if (qj2Var2 != null) {
                qj2Var2.cancel();
            }
            c7bVar.d = qj2Var;
        }
    }

    public final void f(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d;
        dz dzVar = this.z;
        if (Intrinsics.c(str, dzVar.D)) {
            int d2 = dzVar.B.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        if (!Intrinsics.c(str, dzVar.E) || (d = dzVar.C.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, d);
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return o(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        oqf a;
        if (view == null || this.W.b) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (findNextFocus == null || !lz.E(this, findNextFocus)) {
            findNextFocus = null;
        }
        if (view == this) {
            ne8 R = l98.R(((yd8) getFocusOwner()).c);
            a = R != null ? l98.S(R) : null;
            if (a == null) {
                a = td8.a(view, this);
            }
        } else {
            a = td8.a(view, this);
        }
        md8 d = td8.d(i);
        int i2 = d != null ? d.a : 6;
        fsf fsfVar = new fsf();
        if (((yd8) getFocusOwner()).f(i2, a, new qy(fsfVar, 0)) == null) {
            return view;
        }
        Object obj = fsfVar.a;
        if (obj == null) {
            if (findNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (findNextFocus == null || i2 == 1 || i2 == 2 || w3a.E(l98.S((ne8) obj), td8.a(findNextFocus, this), a, i2)) {
            return this;
        }
        return findNextFocus;
    }

    @NotNull
    public final i50 getAndroidViewsHandler$ui() {
        if (this.T == null) {
            i50 i50Var = new i50(getContext());
            this.T = i50Var;
            addView(i50Var, -1);
            requestLayout();
        }
        i50 i50Var2 = this.T;
        i50Var2.getClass();
        return i50Var2;
    }

    @Nullable
    public kv0 getAutofill() {
        return this.M;
    }

    @Nullable
    public nv0 getAutofillManager() {
        return this.N;
    }

    @NotNull
    public ov0 getAutofillTree() {
        return this.D;
    }

    @NotNull
    public final lf3 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.J0;
    }

    @NotNull
    public final Configuration getConfiguration() {
        return (Configuration) ((eoh) this.K).getValue();
    }

    @NotNull
    public final tz getContentCaptureManager$ui() {
        return this.A;
    }

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.n;
    }

    @NotNull
    public kx4 getDensity() {
        return (kx4) ((eoh) this.k).getValue();
    }

    @Nullable
    public oqf getEmbeddedViewFocusRect() {
        if (isFocused()) {
            ne8 R = l98.R(((yd8) getFocusOwner()).c);
            if (R != null) {
                return l98.S(R);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return td8.a(findFocus, this);
        }
        return null;
    }

    @NotNull
    public wd8 getFocusOwner() {
        return this.m;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        oqf embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (Intrinsics.c(((yd8) getFocusOwner()).f(6, null, ry.j), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @NotNull
    public sf8 getFontFamilyResolver() {
        return (sf8) this.q0.getValue();
    }

    @NotNull
    public nf8 getFontLoader() {
        return this.p0;
    }

    @Nullable
    public final b7b getFrameEndScheduler$ui() {
        return this.f;
    }

    @NotNull
    public k29 getGraphicsContext() {
        return this.C;
    }

    @NotNull
    public z69 getHapticFeedBack() {
        return this.s0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return ((hcc) this.W.e).S() || !this.i.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @NotNull
    public i4a getInputModeManager() {
        return this.t0;
    }

    @NotNull
    public final y4a getInsetsListener() {
        return this.u;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f0;
    }

    @Override // android.view.View, android.view.ViewParent
    @NotNull
    public ema getLayoutDirection() {
        return (ema) ((eoh) this.r0).getValue();
    }

    @NotNull
    public eib getLocaleList() {
        return (eib) this.L.getValue();
    }

    public long getMeasureIteration() {
        if (this.W.b) {
            return 1L;
        }
        r3a.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    @NotNull
    public ytc getModifierLocalManager() {
        return this.u0;
    }

    @Nullable
    public xy getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @NotNull
    public phe getPlacementScope() {
        int i = rhe.b;
        return new ukb(this, 1);
    }

    @NotNull
    public lze getPointerIconService() {
        return this.M0;
    }

    @Nullable
    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final p1a m916getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.d;
    }

    @NotNull
    public qqf getRectManager() {
        return this.x;
    }

    @NotNull
    public e3g getRetainedValuesStore() {
        return this.h;
    }

    @NotNull
    public wma getRoot() {
        return this.v;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        xo3 xo3Var;
        if (Build.VERSION.SDK_INT < 31 || (xo3Var = this.K0) == null) {
            return false;
        }
        return ((Boolean) ((eoh) ((e1d) xo3Var.b)).getValue()).booleanValue();
    }

    @NotNull
    public v3h getSemanticsOwner() {
        return this.y;
    }

    @NotNull
    public yma getSharedDrawScope() {
        return this.e;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? f90.a.a(this) : this.S;
    }

    @NotNull
    public uyd getSnapshotObserver() {
        return this.R;
    }

    @NotNull
    public mvh getSoftwareKeyboardController() {
        lw4 lw4Var = this.o0;
        if (lw4Var != null) {
            return lw4Var;
        }
        lw4 lw4Var2 = new lw4(getTextInputService());
        this.o0 = lw4Var2;
        return lw4Var2;
    }

    @NotNull
    public gdj getTextInputService() {
        gdj gdjVar = this.m0;
        if (gdjVar != null) {
            return gdjVar;
        }
        gdj gdjVar2 = new gdj(getLegacyTextInputServiceAndroid());
        this.m0 = gdjVar2;
        return gdjVar2;
    }

    @NotNull
    public efj getTextToolbar() {
        return this.v0;
    }

    @Nullable
    public final s6g getUncaughtExceptionHandler$ui() {
        return null;
    }

    @NotNull
    public hsk getViewConfiguration() {
        return this.t;
    }

    @Nullable
    public final ly getViewTreeOwners() {
        wt3.z(this.j0.getValue());
        return null;
    }

    @NotNull
    public s8l getWindowInfo() {
        return getComposeViewContext().s;
    }

    @Nullable
    public final tx get_autofillManager$ui() {
        return this.N;
    }

    public final qyd n(Function2 function2, tdd tddVar, n29 n29Var) {
        i1d i1dVar;
        Reference poll;
        Object obj;
        if (n29Var != null) {
            return new q29(n29Var, null, this, function2, tddVar);
        }
        do {
            c0l c0lVar = this.y0;
            ReferenceQueue referenceQueue = (ReferenceQueue) c0lVar.c;
            i1dVar = (i1d) c0lVar.b;
            poll = referenceQueue.poll();
            if (poll != null) {
                i1dVar.q(poll);
            }
        } while (poll != null);
        while (true) {
            int i = i1dVar.c;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) i1dVar.r(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        qyd qydVar = (qyd) obj;
        if (qydVar == null) {
            return new q29(getGraphicsContext().b(), getGraphicsContext(), this, function2, tddVar);
        }
        q29 q29Var = (q29) qydVar;
        k29 k29Var = q29Var.b;
        if (k29Var == null) {
            throw wt3.j("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!q29Var.a.s) {
            r3a.a("layer should have been released before reuse");
        }
        q29Var.a = k29Var.b();
        q29Var.g = false;
        q29Var.d = function2;
        q29Var.e = tddVar;
        q29Var.q = false;
        q29Var.r = false;
        q29Var.s = true;
        xzb.d(q29Var.h);
        float[] fArr = q29Var.i;
        if (fArr != null) {
            xzb.d(fArr);
        }
        q29Var.o = xvj.b;
        q29Var.t = false;
        q29Var.f = 9223372034707292159L;
        q29Var.p = null;
        q29Var.n = 0;
        return qydVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        e3g e3gVar;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(ktm.w());
        }
        this.u.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (R0 == null) {
                x xVar = new x(5);
                R0 = xVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (N0 == null) {
                        N0 = Class.forName("android.os.SystemProperties");
                    }
                    Method method = P0;
                    if (method == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = N0;
                        method = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        P0 = method;
                    }
                    if (method != null) {
                        method.invoke(null, xVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            l0d l0dVar = Q0;
            synchronized (l0dVar) {
                l0dVar.a(this);
                Unit unit = Unit.a;
            }
        }
        if (!this.J0) {
            getComposeViewContext().c();
        }
        this.J0 = false;
        s(getRoot());
        r(getRoot());
        getSnapshotObserver().a.j();
        ujg ujgVar = this.M;
        if (ujgVar != null) {
            lv0 lv0Var = lv0.a;
            lv0Var.getClass();
            ((AutofillManager) ujgVar.d).registerCallback(lv0Var);
        }
        u6b u6bVar = getComposeViewContext().c;
        ttk ttkVar = getComposeViewContext().e;
        b7b b7bVar = this.f;
        if (u6bVar == null || ttkVar == null || b7bVar == null) {
            e3gVar = null;
        } else {
            stk viewModelStore = ttkVar.getViewModelStore();
            rtk rtkVar = new rtk();
            jy3 jy3Var = jy3.b;
            viewModelStore.getClass();
            jy3Var.getClass();
            g7h g7hVar = new g7h(viewModelStore, rtkVar, jy3Var);
            KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(d7b.class);
            orCreateKotlinClass.getClass();
            String t = kik.t(orCreateKotlinClass);
            if (t == null) {
                a70.p("Local and anonymous classes can not be ViewModels");
                return;
            }
            d7b d7bVar = (d7b) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t), orCreateKotlinClass);
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            uzc uzcVar = d7bVar.b;
            Object b = uzcVar.b(id);
            if (b == null) {
                b = new l0d(1);
                uzcVar.i(id, b);
            }
            l0d l0dVar2 = (l0d) b;
            Object[] objArr = l0dVar2.a;
            int i3 = l0dVar2.b;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((c7b) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            c7b c7bVar = (c7b) obj;
            if (c7bVar == null) {
                c7bVar = new c7b();
                l0dVar2.a(c7bVar);
            }
            c7bVar.c = true;
            this.g = c7bVar;
            e3gVar = c7bVar.b;
        }
        if (e3gVar == null) {
            e3gVar = ccd.d;
        }
        this.h = e3gVar;
        Function1 function1 = this.k0;
        if (function1 != null) {
            function1.invoke(getComposeViewContext());
            this.k0 = null;
        }
        g6b lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.A);
        ((eoh) this.t0.a).setValue(new h4a(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            iz.a.b(this);
        }
        tx txVar = this.N;
        if (txVar != null) {
            ((yd8) getFocusOwner()).g.a(txVar);
            getSemanticsOwner().d.a(txVar);
        }
        ((yd8) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        n8h n8hVar = (n8h) this.n0.get();
        j20 j20Var = (j20) (n8hVar != null ? n8hVar.b : null);
        if (j20Var == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        n8h n8hVar2 = (n8h) j20Var.d.get();
        g4a g4aVar = (g4a) (n8hVar2 != null ? n8hVar2.b : null);
        return g4aVar != null && (g4aVar.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        P(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i2;
        int i3;
        int i4;
        n8h n8hVar = (n8h) this.n0.get();
        j20 j20Var = (j20) (n8hVar != null ? n8hVar.b : null);
        if (j20Var == null) {
            idj legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.d) {
                qu9 qu9Var = legacyTextInputServiceAndroid.h;
                wcj wcjVar = legacyTextInputServiceAndroid.g;
                int i5 = qu9Var.e;
                boolean z = qu9Var.a;
                if (i5 != 1) {
                    if (i5 == 0) {
                        i = 1;
                    } else if (i5 == 2) {
                        i = 2;
                    } else if (i5 == 6) {
                        i = 5;
                    } else if (i5 == 5) {
                        i = 7;
                    } else if (i5 == 3) {
                        i = 3;
                    } else if (i5 == 4) {
                        i = 4;
                    } else {
                        if (i5 != 7) {
                            a70.r("invalid ImeAction");
                            return null;
                        }
                        i = 6;
                    }
                    editorInfo.imeOptions = i;
                    i2 = qu9Var.d;
                    if (i2 == 1) {
                    }
                    i3 = 1;
                    i4 = i3;
                    if (!z) {
                    }
                    if ((i4 & 1) == 1) {
                    }
                    long j = wcjVar.b;
                    int i6 = pej.c;
                    editorInfo.initialSelStart = (int) (j >> 32);
                    editorInfo.initialSelEnd = (int) (j & 4294967295L);
                    lz.M(editorInfo, wcjVar.a.b);
                    editorInfo.imeOptions |= 33554432;
                    if (cl5.d()) {
                    }
                    lqf lqfVar = new lqf(legacyTextInputServiceAndroid.g, new yia(legacyTextInputServiceAndroid, 22), legacyTextInputServiceAndroid.h.c);
                    legacyTextInputServiceAndroid.i.add(new WeakReference(lqfVar));
                    return lqfVar;
                }
                if (!z) {
                    i = 0;
                    editorInfo.imeOptions = i;
                    i2 = qu9Var.d;
                    if (i2 == 1) {
                        editorInfo.inputType = 1;
                    } else {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                editorInfo.inputType = 2;
                                i3 = 2;
                            } else if (i2 == 4) {
                                editorInfo.inputType = 3;
                                i3 = 3;
                            } else if (i2 == 5) {
                                i3 = 17;
                                editorInfo.inputType = 17;
                            } else if (i2 == 6) {
                                i3 = 33;
                                editorInfo.inputType = 33;
                            } else if (i2 == 7) {
                                i3 = 129;
                                editorInfo.inputType = 129;
                            } else if (i2 == 8) {
                                i3 = 18;
                                editorInfo.inputType = 18;
                            } else {
                                if (i2 != 9) {
                                    a70.r("Invalid Keyboard Type");
                                    return null;
                                }
                                i3 = 8194;
                                editorInfo.inputType = 8194;
                            }
                            i4 = i3;
                            if (!z && (i3 & 1) == 1) {
                                i4 |= 131072;
                                editorInfo.inputType = i4;
                                if (i5 == 1) {
                                    editorInfo.imeOptions = 1073741824 | i;
                                }
                            }
                            if ((i4 & 1) == 1) {
                                int i7 = qu9Var.b;
                                if (i7 == 1) {
                                    i4 |= 4096;
                                    editorInfo.inputType = i4;
                                } else if (i7 == 2) {
                                    i4 |= 8192;
                                    editorInfo.inputType = i4;
                                } else if (i7 == 3) {
                                    i4 |= 16384;
                                    editorInfo.inputType = i4;
                                }
                                if (qu9Var.c) {
                                    editorInfo.inputType = 32768 | i4;
                                }
                            }
                            long j2 = wcjVar.b;
                            int i62 = pej.c;
                            editorInfo.initialSelStart = (int) (j2 >> 32);
                            editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
                            lz.M(editorInfo, wcjVar.a.b);
                            editorInfo.imeOptions |= 33554432;
                            if (cl5.d()) {
                                cl5.a().i(editorInfo);
                            }
                            lqf lqfVar2 = new lqf(legacyTextInputServiceAndroid.g, new yia(legacyTextInputServiceAndroid, 22), legacyTextInputServiceAndroid.h.c);
                            legacyTextInputServiceAndroid.i.add(new WeakReference(lqfVar2));
                            return lqfVar2;
                        }
                        editorInfo.inputType = 1;
                        i |= Integer.MIN_VALUE;
                        editorInfo.imeOptions = i;
                    }
                    i3 = 1;
                    i4 = i3;
                    if (!z) {
                        i4 |= 131072;
                        editorInfo.inputType = i4;
                        if (i5 == 1) {
                        }
                    }
                    if ((i4 & 1) == 1) {
                    }
                    long j22 = wcjVar.b;
                    int i622 = pej.c;
                    editorInfo.initialSelStart = (int) (j22 >> 32);
                    editorInfo.initialSelEnd = (int) (j22 & 4294967295L);
                    lz.M(editorInfo, wcjVar.a.b);
                    editorInfo.imeOptions |= 33554432;
                    if (cl5.d()) {
                    }
                    lqf lqfVar22 = new lqf(legacyTextInputServiceAndroid.g, new yia(legacyTextInputServiceAndroid, 22), legacyTextInputServiceAndroid.h.c);
                    legacyTextInputServiceAndroid.i.add(new WeakReference(lqfVar22));
                    return lqfVar22;
                }
                i = 6;
                editorInfo.imeOptions = i;
                i2 = qu9Var.d;
                if (i2 == 1) {
                }
                i3 = 1;
                i4 = i3;
                if (!z) {
                }
                if ((i4 & 1) == 1) {
                }
                long j222 = wcjVar.b;
                int i6222 = pej.c;
                editorInfo.initialSelStart = (int) (j222 >> 32);
                editorInfo.initialSelEnd = (int) (j222 & 4294967295L);
                lz.M(editorInfo, wcjVar.a.b);
                editorInfo.imeOptions |= 33554432;
                if (cl5.d()) {
                }
                lqf lqfVar222 = new lqf(legacyTextInputServiceAndroid.g, new yia(legacyTextInputServiceAndroid, 22), legacyTextInputServiceAndroid.h.c);
                legacyTextInputServiceAndroid.i.add(new WeakReference(lqfVar222));
                return lqfVar222;
            }
        } else {
            n8h n8hVar2 = (n8h) j20Var.d.get();
            g4a g4aVar = (g4a) (n8hVar2 != null ? n8hVar2.b : null);
            if (g4aVar != null) {
                synchronized (g4aVar.c) {
                    if (g4aVar.e) {
                        return null;
                    }
                    InputConnection a = g4aVar.a.a(editorInfo);
                    oo ooVar = new oo(g4aVar, 24);
                    InputConnection tidVar = Build.VERSION.SDK_INT >= 34 ? new tid(a, ooVar) : new sid(a, ooVar);
                    g4aVar.d.b(new e0l(tidVar));
                    return tidVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        tz tzVar = this.A;
        tzVar.getClass();
        qz.s(tzVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.u.onViewDetachedFromWindow(this);
        View view = this.l;
        if (t() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            l0d l0dVar = Q0;
            synchronized (l0dVar) {
                l0dVar.j(this);
                Unit unit = Unit.a;
            }
        }
        getComposeViewContext().b();
        a5f a5fVar = getSnapshotObserver().a;
        imf imfVar = (imf) a5fVar.i;
        if (imfVar != null) {
            imfVar.f();
        }
        a5fVar.a();
        g6b lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.d(this.A);
        lifecycle.d(this);
        ujg ujgVar = this.M;
        if (ujgVar != null) {
            lv0 lv0Var = lv0.a;
            lv0Var.getClass();
            ((AutofillManager) ujgVar.d).unregisterCallback(lv0Var);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        c7b c7bVar = this.g;
        if (c7bVar != null) {
            c7bVar.c = false;
        }
        this.g = null;
        if (i >= 31) {
            iz.a.a(this);
        }
        tx txVar = this.N;
        if (txVar != null) {
            getSemanticsOwner().d.j(txVar);
            ((yd8) getFocusOwner()).g.j(txVar);
        }
        qqf rectManager = getRectManager();
        rectManager.f = rectManager.c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        qqf rectManager2 = getRectManager();
        iy iyVar = rectManager2.h;
        if (iyVar != null) {
            rectManager2.a.removeCallbacks(iyVar);
            rectManager2.h = null;
        }
        ((yd8) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        yd8 yd8Var = (yd8) getFocusOwner();
        ml4.M(yd8Var.c, true);
        if (yd8Var.g() != null) {
            ne8 g = yd8Var.g();
            yd8Var.j(null);
            if (g != null) {
                g.l1(ie8.a, ie8.d);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f0 = 0L;
        Q();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        P(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f0 = 0L;
            this.W.r(this.G0);
            this.U = null;
            Q();
            if (this.T != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Unit unit = Unit.a;
                Trace.endSection();
            }
            Unit unit2 = Unit.a;
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ux4 ux4Var = this.W;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                s(getRoot());
            }
            long l = l(i);
            d8k d8kVar = e8k.b;
            long l2 = l(i2);
            long D = pco.D((int) (l >>> 32), (int) (l & 4294967295L), (int) (l2 >>> 32), (int) (4294967295L & l2));
            an3 an3Var = this.U;
            if (an3Var == null) {
                this.U = new an3(D);
                this.V = false;
            } else if (!an3.b(an3Var.a, D)) {
                this.V = true;
            }
            ux4Var.A(D);
            ux4Var.t();
            setMeasuredDimension(getRoot().G.p.a, getRoot().G.p.b);
            if (this.T != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().G.p.a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().G.p.b, 1073741824));
                Unit unit = Unit.a;
                Trace.endSection();
            }
            Unit unit2 = Unit.a;
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            tx txVar = this.N;
            if (txVar != null) {
                wma wmaVar = txVar.b.a;
                AutofillId autofillId = txVar.g;
                String str = txVar.e;
                qqf qqfVar = txVar.d;
                sha.K(viewStructure, wmaVar, autofillId, str, qqfVar);
                Object[] objArr = yjd.a;
                l0d l0dVar = new l0d(2);
                l0dVar.a(wmaVar);
                l0dVar.a(viewStructure);
                while (l0dVar.i()) {
                    Object k = l0dVar.k(l0dVar.b - 1);
                    k.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) k;
                    Object k2 = l0dVar.k(l0dVar.b - 1);
                    k2.getClass();
                    j0d j0dVar = (j0d) ((wma) k2).o();
                    int i2 = ((i1d) j0dVar.b).c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        wma wmaVar2 = (wma) j0dVar.get(i3);
                        if (!wmaVar2.Q && wmaVar2.H() && wmaVar2.I()) {
                            l3h x = wmaVar2.x();
                            if (x != null) {
                                x0d x0dVar = x.a;
                                if (x0dVar.b(k3h.g) || x0dVar.b(k3h.h) || x0dVar.b(w3h.r) || x0dVar.b(w3h.s)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    sha.K(newChild, wmaVar2, autofillId, str, qqfVar);
                                    l0dVar.a(wmaVar2);
                                    l0dVar.a(newChild);
                                }
                            }
                            l0dVar.a(wmaVar2);
                            l0dVar.a(viewStructure2);
                        }
                    }
                }
            }
            ujg ujgVar = this.M;
            if (ujgVar != null) {
                ov0 ov0Var = (ov0) ujgVar.c;
                LinkedHashMap linkedHashMap = ov0Var.a;
                LinkedHashMap linkedHashMap2 = ov0Var.a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int intValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        pvd.j();
                        return;
                    }
                    ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                    newChild2.setAutofillId((AutofillId) ujgVar.e, intValue);
                    newChild2.setId(intValue, ((xy) ujgVar.b).getContext().getPackageName(), null, null);
                    newChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        kze kzeVar;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (kzeVar = ((ty) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return kzeVar instanceof k20 ? PointerIcon.getSystemIcon(context, ((k20) kzeVar).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.c) {
            int[] iArr = td8.a;
            ema emaVar = i != 0 ? i != 1 ? null : ema.b : ema.a;
            if (emaVar == null) {
                emaVar = ema.a;
            }
            setLayoutDirection(emaVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        xo3 xo3Var;
        if (Build.VERSION.SDK_INT < 31 || (xo3Var = this.K0) == null) {
            return;
        }
        xo3Var.f(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        Q();
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        c7b c7bVar = this.g;
        if (c7bVar != null) {
            r45 r45Var = (r45) c7bVar.a.b;
            if (r45Var.a && !r45Var.c) {
                qj2 qj2Var = c7bVar.d;
                if (qj2Var != null) {
                    qj2Var.cancel();
                }
                c7bVar.d = null;
                return;
            }
            if (r45Var.b) {
                return;
            }
            if (!r45Var.c) {
                i3f.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!((x0d) r45Var.d).i()) {
                i3f.a("Attempted to start retaining exited values with pending exited values");
            }
            r45Var.c = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        ((eoh) this.t0.a).setValue(new h4a(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        tz tzVar = this.A;
        tzVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            qz.f(tzVar, longSparseArray);
        } else {
            tzVar.a.post(new r0(8, tzVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean w;
        this.I0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (w = ktm.w())) {
            return;
        }
        setShowLayoutBounds(w);
        r(getRoot());
    }

    public final void p(wma wmaVar, boolean z) {
        this.W.l(wmaVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:103:0x0056, B:109:0x0062, B:112:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int q(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        xy xyVar;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        gc9 gc9Var;
        removeCallbacks(this.C0);
        try {
            I(motionEvent);
            this.g0 = true;
            z(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.w0;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                n72 n72Var = this.J;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!n72Var.a) {
                                        ((nkb) ((bka) n72Var.d).b).a();
                                        ((gc9) n72Var.c).c();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    N(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && v(motionEvent)) {
                                    xyVar = this;
                                    xyVar.N(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    xyVar = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = xyVar.w0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = xyVar.w0;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    svc svcVar = xyVar.I;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = xyVar.w0;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = xyVar.w0;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = xyVar.w0;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    svcVar.c.delete(pointerId);
                                                    svcVar.b.delete(pointerId);
                                                }
                                                gc9Var = (gc9) n72Var.c;
                                                if (gc9Var.d) {
                                                    gc9Var.g.a.n();
                                                } else {
                                                    gc9Var.d = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        svcVar.c.delete(pointerId);
                                        svcVar.b.delete(pointerId);
                                    }
                                }
                                xyVar.w0 = MotionEvent.obtainNoHistory(motionEvent);
                                int M = M(motionEvent);
                                Trace.endSection();
                                xyVar.g0 = false;
                                return M;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent4;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z3) {
                }
                xyVar = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = xyVar.w0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = xyVar.w0;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    svc svcVar2 = xyVar.I;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = xyVar.w0;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = xyVar.w0;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = xyVar.w0;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        gc9Var = (gc9) n72Var.c;
                        if (gc9Var.d) {
                        }
                    }
                }
                xyVar.w0 = MotionEvent.obtainNoHistory(motionEvent);
                int M2 = M(motionEvent);
                Trace.endSection();
                xyVar.g0 = false;
                return M2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.g0 = false;
            throw th3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            md8 d = td8.d(i);
            int i2 = d != null ? d.a : 7;
            Boolean f = ((yd8) getFocusOwner()).f(i2, rect != null ? wba.O(rect) : null, new uy(i2, 0));
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.c(f, bool)) {
                if (!Intrinsics.c(((yd8) getFocusOwner()).f(i2, null, new uy(i2, 1)), bool)) {
                    if (hasFocus() && (i2 == 1 || i2 == 2)) {
                        return ((yd8) getFocusOwner()).i(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(wma wmaVar) {
        this.W.z(wmaVar, false);
        i1d z = wmaVar.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            s((wma) objArr[i2]);
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.z.h = j;
    }

    public final void setComposeViewContext(@NotNull lf3 lf3Var) {
        if (getCoroutineContext() != lf3Var.b.k() && !((j0d) getRoot().o()).isEmpty()) {
            r3a.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            lf3 lf3Var2 = get_composeViewContext();
            if (lf3Var != lf3Var2) {
                if (isAttachedToWindow()) {
                    lf3Var2.b();
                    lf3Var.c();
                }
                set_composeViewContext(lf3Var);
                setCoroutineContext(lf3Var.b.k());
            }
        } finally {
            bea.K(w, C, e);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.J0 = z;
    }

    public final void setConfiguration(@NotNull Configuration configuration) {
        ((eoh) this.K).setValue(configuration);
    }

    public final void setContentCaptureManager$ui(@NotNull tz tzVar) {
        this.A = tzVar;
    }

    public void setCoroutineContext(@NotNull CoroutineContext coroutineContext) {
        this.n = coroutineContext;
    }

    public final void setFrameEndScheduler$ui(@Nullable b7b b7bVar) {
        this.f = b7bVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f0 = j;
    }

    public final void setOnReadyForComposition(@NotNull Function1<? super lf3, Unit> function1) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.J0) {
            function1.invoke(getComposeViewContext());
        } else {
            this.k0 = function1;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m917setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(@Nullable p1a p1aVar) {
        this.d = p1aVar;
    }

    public void setShowLayoutBounds(boolean z) {
        this.S = z;
    }

    public void setUncaughtExceptionHandler(@Nullable s6g s6gVar) {
        this.W.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean v(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= x && x <= ((float) getWidth()) && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= y && y <= ((float) getHeight());
    }

    public final boolean w(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.w0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void x(float[] fArr) {
        H();
        xzb.f(fArr, this.d0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.h0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.h0 & 4294967295L));
        float[] fArr2 = this.c0;
        xzb.d(fArr2);
        xzb.g(fArr2, intBitsToFloat, intBitsToFloat2);
        lz.L(fArr, fArr2);
    }

    public final long y(long j) {
        H();
        long b = xzb.b(j, this.d0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.h0 >> 32)) + Float.intBitsToFloat((int) (b >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.h0 & 4294967295L)) + Float.intBitsToFloat((int) (b & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final void z(boolean z) {
        oy oyVar;
        ux4 ux4Var = this.W;
        if (((hcc) ux4Var.e).S() || ((i1d) ((k1d) ux4Var.f).b).c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    oyVar = this.G0;
                } finally {
                    Trace.endSection();
                }
            } else {
                oyVar = null;
            }
            if (ux4Var.r(oyVar)) {
                requestLayout();
            }
            ux4Var.f(false);
            getRectManager().a();
            if (this.H) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.H = false;
            }
            Unit unit = Unit.a;
        }
    }

    @NotNull
    /* renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public mx m918getAccessibilityManager() {
        return this.B;
    }

    @NotNull
    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public fy m919getClipboard() {
        return this.Q;
    }

    @NotNull
    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public gy m920getClipboardManager() {
        return this.P;
    }

    @NotNull
    public j00 getDragAndDropManager() {
        return this.o;
    }

    @NotNull
    public uzc getLayoutNodes() {
        return this.w;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        Unit unit = Unit.a;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @wx4
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m915getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @wx4
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    @NotNull
    public t6g getRootForTest() {
        return this;
    }

    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(@Nullable s6g s6gVar) {
    }
}
