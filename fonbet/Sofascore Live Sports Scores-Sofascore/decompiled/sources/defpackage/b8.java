package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.h;
import androidx.fragment.app.s;
import androidx.preference.EditTextPreferenceDialogFragmentCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.sofascore.results.buzzer.BuzzerActivity;
import com.sofascore.results.chat.view.ChatConnectingView;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.net.Socket;
import java.util.Date;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public b8(RecyclerView recyclerView, BuzzerActivity buzzerActivity) {
        this.a = 7;
        this.b = buzzerActivity;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fc  */
    /* JADX WARN: Type inference failed for: r14v4, types: [bca] */
    /* JADX WARN: Type inference failed for: r17v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r3v63, types: [int] */
    /* JADX WARN: Type inference failed for: r3v70, types: [int] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int actionMasked;
        boolean a;
        int i;
        int i2;
        ?? k;
        u uVar;
        Object obj;
        boolean z = false;
        z = false;
        z = false;
        switch (this.a) {
            case 0:
                kod kodVar = (kod) this.b;
                try {
                    jde.c();
                    try {
                        bw9 bw9Var = jde.a;
                        bw9Var.getClass();
                        tgc tgcVar = kodVar.a;
                        if (!tgcVar.isClosed()) {
                            tgcVar.m += 2;
                            tgcVar.h();
                        }
                        bw9Var.getClass();
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    kodVar.d(th);
                    return;
                }
            case 1:
                ujg ujgVar = (ujg) this.b;
                while (true) {
                    try {
                        ujgVar.L((rc) ((ReferenceQueue) ujgVar.d).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 2:
                xy xyVar = (xy) this.b;
                xyVar.removeCallbacks(this);
                MotionEvent motionEvent = xyVar.w0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                xyVar.N(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, xyVar.x0, false);
                return;
            case 3:
                AppStartTrace appStartTrace = (AppStartTrace) this.b;
                if (appStartTrace.i == null) {
                    appStartTrace.j = new Timer();
                    return;
                }
                return;
            case 4:
                tk0 tk0Var = (tk0) this.b;
                ood oodVar = tk0Var.d;
                try {
                    wk0 wk0Var = tk0Var.h;
                    if (wk0Var != null) {
                        x52 x52Var = tk0Var.b;
                        long j = x52Var.b;
                        if (j > 0) {
                            wk0Var.W(x52Var, j);
                        }
                    }
                } catch (IOException e) {
                    oodVar.m(e);
                }
                try {
                    wk0 wk0Var2 = tk0Var.h;
                    if (wk0Var2 != null) {
                        wk0Var2.close();
                    }
                } catch (IOException e2) {
                    oodVar.m(e2);
                }
                try {
                    Socket socket = tk0Var.i;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    oodVar.m(e3);
                    return;
                }
            case 5:
                zcb zcbVar = (zcb) this.b;
                qc5 qc5Var = zcbVar.c;
                xr0 xr0Var = zcbVar.a;
                if (zcbVar.n) {
                    if (zcbVar.l) {
                        zcbVar.l = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        xr0Var.e = currentAnimationTimeMillis;
                        xr0Var.g = -1L;
                        xr0Var.f = currentAnimationTimeMillis;
                        xr0Var.h = 0.5f;
                    }
                    if ((xr0Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > xr0Var.g + xr0Var.i) || !zcbVar.e()) {
                        zcbVar.n = false;
                        return;
                    }
                    if (zcbVar.m) {
                        zcbVar.m = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                        qc5Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (xr0Var.f == 0) {
                        cp4.h("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = xr0Var.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - xr0Var.f;
                    xr0Var.f = currentAnimationTimeMillis2;
                    zcbVar.p.scrollListBy((int) (j2 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * xr0Var.d));
                    WeakHashMap weakHashMap = bsk.a;
                    qc5Var.postOnAnimation(this);
                    return;
                }
                return;
            case 6:
                a02 a02Var = (a02) this.b;
                a02Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) a02Var.e;
                jsk jskVar = bottomSheetBehavior.Q;
                if (jskVar != null && jskVar.f()) {
                    a02Var.b(a02Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.N(a02Var.b);
                        return;
                    }
                    return;
                }
            case 7:
                BuzzerActivity buzzerActivity = (BuzzerActivity) this.b;
                int i3 = BuzzerActivity.O;
                RecyclerView recyclerView = buzzerActivity.Q().b;
                int measuredWidth = buzzerActivity.Q().b.getMeasuredWidth();
                mqi mqiVar = buzzerActivity.N;
                recyclerView.setLayoutManager(new GridLayoutManager(Math.max(1, measuredWidth / ((((p82) mqiVar.getValue()).m * 2) + ((p82) mqiVar.getValue()).n))));
                buzzerActivity.M = new q82(buzzerActivity.Q().b, "buzzer_feed");
                return;
            case 8:
                ChatConnectingView chatConnectingView = (ChatConnectingView) this.b;
                if (chatConnectingView.k) {
                    return;
                }
                int i4 = chatConnectingView.l + 2;
                chatConnectingView.l = i4;
                if (i4 > 7) {
                    chatConnectingView.l = 7;
                }
                chatConnectingView.l();
                Function0<Unit> connectCallback = chatConnectingView.getConnectCallback();
                if (connectCallback != null) {
                    connectCallback.invoke();
                }
                chatConnectingView.d.postDelayed(this, chatConnectingView.l * 1000);
                return;
            case 9:
                ni3 ni3Var = (ni3) this.b;
                synchronized (ni3Var) {
                    a = ni3Var.a();
                    if (a) {
                        synchronized (ni3Var) {
                            ni3Var.b = true;
                        }
                    }
                }
                if (a) {
                    pi3 c = ni3Var.p.c();
                    ni3Var.o.getClass();
                    if (new Date(System.currentTimeMillis()).before(c.b)) {
                        ni3Var.h();
                        return;
                    }
                    k48 k48Var = (k48) ni3Var.j;
                    Task d = k48Var.d();
                    Task c2 = k48Var.c();
                    Task continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{d, c2}).continueWithTask(ni3Var.g, new li3(z ? 1 : 0, ni3Var, d, c2));
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{continueWithTask}).continueWith(ni3Var.g, new o3(8, ni3Var, continueWithTask));
                    return;
                }
                return;
            case 10:
                ((ay2) ((vv4) this.b).b).B();
                return;
            case 11:
                DialogFragment dialogFragment = (DialogFragment) this.b;
                dialogFragment.d.onDismiss(dialogFragment.l);
                return;
            case 12:
                qc5 qc5Var2 = (qc5) this.b;
                qc5Var2.l = null;
                qc5Var2.drawableStateChanged();
                return;
            case 13:
                ((EditTextPreferenceDialogFragmentCompat) this.b).u();
                return;
            case 14:
                d dVar = (d) this.b;
                ValueAnimator valueAnimator = dVar.z;
                int i5 = dVar.A;
                if (i5 == 1) {
                    valueAnimator.cancel();
                } else if (i5 != 2) {
                    return;
                }
                dVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 15:
                z38 z38Var = (z38) this.b;
                b48 b48Var = z38Var.f;
                kz7 kz7Var = b48Var.f;
                y0 y0Var = z38Var.c;
                Activity activity = z38Var.d;
                y0 y0Var2 = kz7Var.a;
                if (!(y0Var2 == null ? false : y0Var2.i().isShown()) && !activity.isFinishing() && !activity.isDestroyed()) {
                    mw9 e4 = y0Var.e();
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(e4.g.intValue(), e4.h.intValue(), 1003, e4.e.intValue(), -3);
                    Rect a3 = kz7.a(activity);
                    if ((e4.f.intValue() & 48) == 48) {
                        layoutParams.y = a3.top;
                    }
                    layoutParams.dimAmount = 0.3f;
                    layoutParams.gravity = e4.f.intValue();
                    layoutParams.windowAnimations = 0;
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    windowManager.addView(y0Var.i(), layoutParams);
                    kz7.a(activity);
                    if (y0Var instanceof uz0) {
                        hpo hpoVar = new hpo(y0Var);
                        ((uz0) y0Var).e.setOnTouchListener(e4.g.intValue() == -1 ? new zoi(((uz0) y0Var).e, hpoVar) : new jz7(((uz0) y0Var).e, hpoVar, layoutParams, windowManager, y0Var));
                    }
                    kz7Var.a = y0Var;
                }
                if (y0Var.e().j.booleanValue()) {
                    gz7 gz7Var = b48Var.i;
                    Application application = b48Var.h;
                    ViewGroup i6 = y0Var.i();
                    gz7Var.getClass();
                    i6.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i6.measure(-2, -2);
                    Point point = new Point(0, i6.getMeasuredHeight() * (-1));
                    i6.animate().translationX(point.x).translationY(point.y).setDuration(1L).setListener(new fz7(z ? 1 : 0, i6, application));
                    return;
                }
                return;
            case 16:
                h hVar = (h) this.b;
                if (hVar.b.isEmpty()) {
                    return;
                }
                hVar.e();
                return;
            case 17:
                ((s) this.b).z(true);
                return;
            case 18:
                wp8 wp8Var = (wp8) this.b;
                wp8Var.h = false;
                wp8Var.r();
                return;
            case 19:
                t8a t8aVar = (t8a) ((a8p) this.b).c;
                asb asbVar = t8aVar.r;
                t8aVar.q = null;
                t8aVar.r = null;
                asbVar.a(xei.m.h("InternalSubchannel closed transport due to address change"));
                return;
            case 20:
                eca ecaVar = (eca) this.b;
                if (ecaVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = ecaVar.B;
                    long j4 = j3 != Long.MIN_VALUE ? currentTimeMillis - j3 : 0L;
                    n layoutManager = ecaVar.r.getLayoutManager();
                    Rect rect = ecaVar.A;
                    if (rect == null) {
                        rect = new Rect();
                        ecaVar.A = rect;
                    }
                    layoutManager.calculateItemDecorationsForChild(ecaVar.c.itemView, rect);
                    if (layoutManager.canScrollHorizontally()) {
                        int i7 = (int) (ecaVar.j + ecaVar.h);
                        int paddingLeft = (i7 - ecaVar.A.left) - ecaVar.r.getPaddingLeft();
                        float f = ecaVar.h;
                        if ((f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && paddingLeft < 0) || (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (paddingLeft = ((ecaVar.c.itemView.getWidth() + i7) + ecaVar.A.right) - (ecaVar.r.getWidth() - ecaVar.r.getPaddingRight())) > 0)) {
                            i = paddingLeft;
                            if (layoutManager.canScrollVertically()) {
                                int i8 = (int) (ecaVar.k + ecaVar.i);
                                ?? paddingTop = (i8 - ecaVar.A.top) - ecaVar.r.getPaddingTop();
                                float f2 = ecaVar.i;
                                if ((f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && paddingTop < 0) || (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (paddingTop = ((ecaVar.c.itemView.getHeight() + i8) + ecaVar.A.bottom) - (ecaVar.r.getHeight() - ecaVar.r.getPaddingBottom())) > 0)) {
                                    z = paddingTop;
                                }
                            }
                            if (i != 0) {
                                i = ecaVar.m.k(ecaVar.r, ecaVar.c.itemView.getWidth(), i, ecaVar.r.getWidth(), j4);
                            }
                            i2 = i;
                            k = !z ? ecaVar.m.k(ecaVar.r, ecaVar.c.itemView.getHeight(), z, ecaVar.r.getHeight(), j4) : z;
                            if (i2 != 0 && k == 0) {
                                ecaVar.B = Long.MIN_VALUE;
                                return;
                            }
                            if (ecaVar.B == Long.MIN_VALUE) {
                                ecaVar.B = currentTimeMillis;
                            }
                            ecaVar.r.scrollBy(i2, k);
                            uVar = ecaVar.c;
                            if (uVar != null) {
                                ecaVar.n(uVar);
                            }
                            ecaVar.r.removeCallbacks(ecaVar.s);
                            RecyclerView recyclerView2 = ecaVar.r;
                            WeakHashMap weakHashMap2 = bsk.a;
                            recyclerView2.postOnAnimation(this);
                            return;
                        }
                    }
                    i = 0;
                    if (layoutManager.canScrollVertically()) {
                    }
                    if (i != 0) {
                    }
                    i2 = i;
                    if (!z) {
                    }
                    if (i2 != 0) {
                    }
                    if (ecaVar.B == Long.MIN_VALUE) {
                    }
                    ecaVar.r.scrollBy(i2, k);
                    uVar = ecaVar.c;
                    if (uVar != null) {
                    }
                    ecaVar.r.removeCallbacks(ecaVar.s);
                    RecyclerView recyclerView22 = ecaVar.r;
                    WeakHashMap weakHashMap22 = bsk.a;
                    recyclerView22.postOnAnimation(this);
                    return;
                }
                return;
            case 21:
                synchronized (((keb) this.b).a) {
                    obj = ((keb) this.b).f;
                    ((keb) this.b).f = keb.k;
                }
                ((keb) this.b).j(obj);
                return;
            case 22:
                cdf cdfVar = (cdf) ((zfb) this.b);
                for (gpg gpgVar : cdfVar.r) {
                    gpgVar.l(true);
                    hpo hpoVar2 = gpgVar.h;
                    if (hpoVar2 != null) {
                        hpoVar2.D(gpgVar.e);
                        gpgVar.h = null;
                        gpgVar.g = null;
                    }
                }
                l2a l2aVar = cdfVar.k;
                kl6 kl6Var = (kl6) l2aVar.c;
                if (kl6Var != null) {
                    kl6Var.release();
                    l2aVar.c = null;
                }
                l2aVar.d = null;
                return;
            case 23:
                ((agb) this.b).onLoaderReleased();
                return;
            case 24:
                ((qrb) ((ggf) this.b).a).g();
                return;
            case 25:
                qrb qrbVar = (qrb) this.b;
                if (qrbVar.x == null) {
                    return;
                }
                qrbVar.k(true);
                sv4 sv4Var = qrbVar.E;
                sv4Var.g(null);
                qrbVar.N.D(2, "Entering IDLE state");
                qrbVar.r.f(rk3.d);
                m8a m8aVar = qrbVar.Y;
                Object[] objArr = {qrbVar.C, sv4Var};
                m8aVar.getClass();
                for (int i9 = 0; i9 < 2; i9++) {
                    if (((Set) m8aVar.b).contains(objArr[i9])) {
                        qrbVar.g();
                        return;
                    }
                }
                return;
            case 26:
                qrb qrbVar2 = ((jrb) this.b).i;
                Logger logger = qrb.c0;
                qrbVar2.m.i();
                if (qrbVar2.w) {
                    qrbVar2.v.W();
                    return;
                }
                return;
            case 27:
                ((nrb) this.b).d.g();
                return;
            case 28:
                t8a t8aVar2 = ((prb) this.b).l;
                t8aVar2.k.execute(new pyn(t8aVar2, qrb.f0, z, 12));
                return;
            default:
                androidx.mediarouter.app.d dVar2 = (androidx.mediarouter.app.d) this.b;
                dVar2.j(true);
                dVar2.G.requestLayout();
                dVar2.G.getViewTreeObserver().addOnGlobalLayoutListener(new jc0(dVar2, 4));
                return;
        }
    }

    public /* synthetic */ b8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
