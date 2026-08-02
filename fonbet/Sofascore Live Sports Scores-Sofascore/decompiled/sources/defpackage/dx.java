package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import java.text.NumberFormat;
import java.util.LongSummaryStatistics;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dx {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public dx() {
        this.a = 2;
        new ReentrantLock();
        new ReentrantLock();
        new LongSummaryStatistics();
        new LongSummaryStatistics();
        this.i = new AtomicLong();
        this.j = new AtomicLong();
        this.k = new AtomicLong();
        this.b = new AtomicLong();
        new AtomicLong();
        new AtomicLong();
        this.l = new AtomicLong();
        this.m = new AtomicLong();
        this.c = new AtomicLong();
        this.d = new AtomicLong();
        this.h = new AtomicLong();
        this.e = new AtomicLong();
        this.n = new AtomicLong();
        this.f = new AtomicLong();
        this.g = new AtomicLong();
        this.o = new AtomicLong();
    }

    public static void d(long j, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(NumberFormat.getNumberInstance().format(j));
        sb.append("\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(m1d m1dVar, bx bxVar, sq3 sq3Var) {
        vw vwVar;
        int i;
        Object a;
        Function1 function1 = (Function1) this.b;
        xnh xnhVar = (xnh) this.f;
        try {
            if (sq3Var instanceof vw) {
                vwVar = (vw) sq3Var;
                int i2 = vwVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vwVar.t = i2 - Integer.MIN_VALUE;
                    Object obj = vwVar.r;
                    lu3 lu3Var = lu3.a;
                    i = vwVar.t;
                    int i3 = 1;
                    if (i != 0) {
                        y6a.M(obj);
                        j8a j8aVar = (j8a) this.l;
                        rq3 rq3Var = null;
                        cl clVar = new cl(this, bxVar, rq3Var, i3);
                        vwVar.t = 1;
                        j8aVar.getClass();
                        if (s9a.r(new ts2(m1dVar, j8aVar, clVar, rq3Var, 9), vwVar) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    a = g().a(xnhVar.h());
                    if (a != null && Math.abs(xnhVar.h() - g().d(a)) <= 0.5f && ((Boolean) function1.invoke(a)).booleanValue()) {
                        l(a);
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            a = g().a(xnhVar.h());
            if (a != null) {
                l(a);
            }
            return Unit.a;
        } finally {
        }
        vwVar = new vw(this, sq3Var);
        Object obj2 = vwVar.r;
        lu3 lu3Var2 = lu3.a;
        i = vwVar.t;
        int i32 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Object obj, m1d m1dVar, hw hwVar, sq3 sq3Var) {
        xw xwVar;
        int i;
        e1d e1dVar = (e1d) this.h;
        try {
            if (sq3Var instanceof xw) {
                xwVar = (xw) sq3Var;
                int i2 = xwVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xwVar.t = i2 - Integer.MIN_VALUE;
                    Object obj2 = xwVar.r;
                    lu3 lu3Var = lu3.a;
                    i = xwVar.t;
                    rq3 rq3Var = null;
                    if (i != 0) {
                        y6a.M(obj2);
                        if (f().a.indexOf(obj) == -1) {
                            if (((Boolean) ((Function1) this.b).invoke(obj)).booleanValue()) {
                                ((eoh) ((e1d) this.d)).setValue(obj);
                                ((eoh) ((e1d) this.c)).setValue(obj);
                            }
                            return Unit.a;
                        }
                        q1d q1dVar = (q1d) this.m;
                        yw ywVar = new yw(this, obj, hwVar, rq3Var, 1);
                        xwVar.t = 1;
                        q1dVar.getClass();
                        if (s9a.r(new ts2(m1dVar, q1dVar, ywVar, rq3Var, 11), xwVar) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj2);
                    }
                    e1dVar = (eoh) e1dVar;
                    e1dVar.setValue(null);
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            e1dVar = (eoh) e1dVar;
            e1dVar.setValue(null);
            return Unit.a;
        } catch (Throwable th) {
            ((eoh) e1dVar).setValue(null);
            throw th;
        }
        xwVar = new xw(this, sq3Var);
        Object obj22 = xwVar.r;
        lu3 lu3Var2 = lu3.a;
        i = xwVar.t;
        rq3 rq3Var2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Object obj, m1d m1dVar, et8 et8Var, sq3 sq3Var) {
        ww wwVar;
        int i;
        rq3 rq3Var;
        Object a;
        Function1 function1 = (Function1) this.b;
        xnh xnhVar = (xnh) this.f;
        try {
            if (sq3Var instanceof ww) {
                wwVar = (ww) sq3Var;
                int i2 = wwVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wwVar.t = i2 - Integer.MIN_VALUE;
                    ww wwVar2 = wwVar;
                    Object obj2 = wwVar2.r;
                    lu3 lu3Var = lu3.a;
                    i = wwVar2.t;
                    rq3 rq3Var2 = null;
                    if (i != 0) {
                        y6a.M(obj2);
                        if (!g().a.containsKey(obj)) {
                            l(obj);
                            return Unit.a;
                        }
                        j8a j8aVar = (j8a) this.l;
                        rq3Var = null;
                        try {
                            yw ywVar = new yw(this, obj, et8Var, rq3Var, 0);
                            wwVar2.t = 1;
                            j8aVar.getClass();
                            rq3Var = null;
                            if (s9a.r(new ts2(m1dVar, j8aVar, ywVar, rq3Var2, 9), wwVar2) == lu3Var) {
                                return lu3Var;
                            }
                        } catch (Throwable th) {
                            th = th;
                            m(rq3Var);
                            Object a2 = g().a(xnhVar.h());
                            if (a2 != null && Math.abs(xnhVar.h() - g().d(a2)) <= 0.5f && ((Boolean) function1.invoke(a2)).booleanValue()) {
                                l(a2);
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj2);
                        rq3Var = null;
                    }
                    m(rq3Var);
                    a = g().a(xnhVar.h());
                    if (a != null && Math.abs(xnhVar.h() - g().d(a)) <= 0.5f && ((Boolean) function1.invoke(a)).booleanValue()) {
                        l(a);
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            m(rq3Var);
            a = g().a(xnhVar.h());
            if (a != null) {
                l(a);
            }
            return Unit.a;
        } catch (Throwable th2) {
            th = th2;
            rq3Var = null;
        }
        wwVar = new ww(this, sq3Var);
        ww wwVar22 = wwVar;
        Object obj22 = wwVar22.r;
        lu3 lu3Var2 = lu3.a;
        i = wwVar22.t;
        rq3 rq3Var22 = null;
    }

    public Object e(float f, float f2, Object obj) {
        ma0 ma0Var = (ma0) this.i;
        ptb g = g();
        float d = g.d(obj);
        float floatValue = ((Number) ((Function0) this.j).invoke()).floatValue();
        if (d != f && !Float.isNaN(d)) {
            if (d < f) {
                if (f2 >= floatValue) {
                    Object b = g.b(f, true);
                    b.getClass();
                    return b;
                }
                Object b2 = g.b(f, true);
                b2.getClass();
                if (f >= Math.abs(Math.abs(((Number) ma0Var.invoke(Float.valueOf(Math.abs(g.d(b2) - d)))).floatValue()) + d)) {
                    return b2;
                }
            } else {
                if (f2 <= (-floatValue)) {
                    Object b3 = g.b(f, false);
                    b3.getClass();
                    return b3;
                }
                Object b4 = g.b(f, false);
                b4.getClass();
                float abs = Math.abs(d - Math.abs(((Number) ma0Var.invoke(Float.valueOf(Math.abs(d - g.d(b4))))).floatValue()));
                if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f <= abs : Math.abs(f) >= abs) {
                    return b4;
                }
            }
        }
        return obj;
    }

    public lo4 f() {
        return (lo4) ((eoh) ((e1d) this.n)).getValue();
    }

    public ptb g() {
        return (ptb) ((eoh) ((e1d) this.h)).getValue();
    }

    public boolean h() {
        return (((Function1) this.i) == null || ((cw) this.j) == null || ((c80) this.k) == null || ((ol4) this.l) == null) ? false : true;
    }

    public float i(float f) {
        float f2;
        xnh xnhVar = (xnh) this.f;
        float h = (Float.isNaN(xnhVar.h()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : xnhVar.h()) + f;
        float[] fArr = f().b;
        float f3 = Float.NaN;
        int i = 1;
        if (fArr.length == 0) {
            f2 = Float.NaN;
        } else {
            f2 = fArr[0];
            int length = fArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    f2 = Math.min(f2, fArr[i2]);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        float[] fArr2 = f().b;
        if (fArr2.length != 0) {
            f3 = fArr2[0];
            int length2 = fArr2.length - 1;
            if (1 <= length2) {
                while (true) {
                    f3 = Math.max(f3, fArr2[i]);
                    if (i == length2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return llf.b(h, f2, f3);
    }

    public float j(float f) {
        xnh xnhVar = (xnh) this.f;
        float h = (Float.isNaN(xnhVar.h()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : xnhVar.h()) + f;
        float c = g().c();
        Float m0 = CollectionsKt.m0(g().a.values());
        return llf.b(h, c, m0 != null ? m0.floatValue() : Float.NaN);
    }

    public float k() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                xnh xnhVar = (xnh) obj;
                if (!Float.isNaN(xnhVar.h())) {
                    return xnhVar.h();
                }
                a70.r("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            default:
                xnh xnhVar2 = (xnh) obj;
                if (Float.isNaN(xnhVar2.h())) {
                    u3a.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                }
                return xnhVar2.h();
        }
    }

    public void l(Object obj) {
        ((eoh) ((e1d) this.c)).setValue(obj);
    }

    public void m(Object obj) {
        ((eoh) ((e1d) this.d)).setValue(obj);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder q = fc6.q("### Connection ###\n");
                d(((AtomicLong) this.l).get(), "Reconnects:                      ", q);
                d(((AtomicLong) this.k).get(), "Requests Sent:                   ", q);
                d(((AtomicLong) this.b).get(), "Replies Received:                ", q);
                d(((AtomicLong) this.e).get(), "Pings Sent:                      ", q);
                d(((AtomicLong) this.n).get(), "+OKs Received:                   ", q);
                d(((AtomicLong) this.f).get(), "-Errs Received:                  ", q);
                d(((AtomicLong) this.g).get(), "Handled Exceptions:              ", q);
                d(((AtomicLong) this.i).get(), "Successful Flush Calls:          ", q);
                d(((AtomicLong) this.j).get(), "Outstanding Request Futures:     ", q);
                d(((AtomicLong) this.o).get(), "Dropped Messages:                ", q);
                q.append("\n");
                q.append("### Reader ###\n");
                d(((AtomicLong) this.m).get(), "Messages in:                     ", q);
                d(((AtomicLong) this.d).get(), "Bytes in:                        ", q);
                q.append("\n");
                q.append("\n");
                q.append("### Writer ###\n");
                d(((AtomicLong) this.c).get(), "Messages out:                    ", q);
                d(((AtomicLong) this.h).get(), "Bytes out:                       ", q);
                q.append("\n");
                return q.toString();
            default:
                return super.toString();
        }
    }

    public dx(efh efhVar, ma0 ma0Var, Function0 function0, e6g e6gVar, Function1 function1) {
        this.a = 0;
        this.i = ma0Var;
        this.j = function0;
        this.k = e6gVar;
        this.b = function1;
        this.l = new j8a();
        this.m = new f4a(this);
        this.c = e.f(efhVar);
        this.e = goh.b(new tw(this, 0));
        this.n = goh.b(new tw(this, 1));
        this.f = e.b(Float.NaN);
        goh.c(new tw(this, 2));
        this.g = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d = e.f(null);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.h = e.f(new ptb(lm5Var));
        this.o = new zw(this);
    }

    public dx(fpi fpiVar, Function1 function1) {
        this.a = 1;
        this.b = new dt(11);
        this.m = new q1d();
        this.c = e.f(fpiVar);
        this.d = e.f(fpiVar);
        this.e = goh.b(new uw(this, 0));
        this.f = e.b(Float.NaN);
        goh.c(new uw(this, 1));
        this.g = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.h = e.f(null);
        this.n = e.f(new lo4(km5.a, new float[0]));
        this.o = new ax(this);
        this.b = function1;
    }
}
