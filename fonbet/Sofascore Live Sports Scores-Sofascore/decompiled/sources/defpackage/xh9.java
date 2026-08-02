package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class xh9 implements ku3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final pm0 e;
    public static final /* synthetic */ long f;
    public final vh9 a;
    public xj9 b;
    public aq4 c;

    @NotNull
    private volatile /* synthetic */ int received = 0;

    static {
        KType kType;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Object.class);
        try {
            kType = duf.b(Object.class);
        } catch (Throwable unused) {
            kType = null;
        }
        e = new pm0("CustomResponse", new h5k(orCreateKotlinClass, kType));
        d = AtomicIntegerFieldUpdater.newUpdater(xh9.class, "received");
        f = rh0.a.objectFieldOffset(xh9.class.getDeclaredField("received"));
    }

    public xh9(vh9 vh9Var) {
        this.a = vh9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
    
        if (r14 != r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c0 A[Catch: all -> 0x009c, TryCatch #7 {all -> 0x009c, blocks: (B:14:0x00df, B:18:0x00ee, B:24:0x00fe, B:26:0x0108, B:27:0x0113, B:43:0x00cb, B:70:0x0096, B:71:0x009b, B:72:0x00b4, B:74:0x00c0), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(h5k h5kVar, sq3 sq3Var) {
        wh9 wh9Var;
        int i;
        Throwable th;
        xh9 xh9Var;
        try {
            try {
                if (sq3Var instanceof wh9) {
                    wh9Var = (wh9) sq3Var;
                    int i2 = wh9Var.u;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        wh9Var.u = i2 - Integer.MIN_VALUE;
                        Object obj = wh9Var.s;
                        lu3 lu3Var = lu3.a;
                        i = wh9Var.u;
                        if (i != 0) {
                            y6a.M(obj);
                            try {
                                aq4 d2 = d();
                                KClass kClass = h5kVar.a;
                                try {
                                    kClass.getClass();
                                    try {
                                        if (sha.x(kClass).isInstance(d2)) {
                                            return d();
                                        }
                                        if (!b()) {
                                            aq4 d3 = d();
                                            pm0 pm0Var = g75.a;
                                            xh3 attributes = d3.b().getAttributes();
                                            pm0 pm0Var2 = g75.b;
                                            attributes.getClass();
                                            pm0Var2.getClass();
                                            if (!attributes.c().containsKey(pm0Var2)) {
                                                d.getClass();
                                                try {
                                                    xh9Var = this;
                                                    try {
                                                        if (!rh0.a.compareAndSwapInt(xh9Var, f, 0, 1)) {
                                                            throw new em4(xh9Var);
                                                        }
                                                        obj = xh9Var.getAttributes().d(e);
                                                        if (obj == null) {
                                                            wh9Var.r = h5kVar;
                                                            wh9Var.u = 1;
                                                            obj = xh9Var.e();
                                                            if (obj == lu3Var) {
                                                                return lu3Var;
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        th = th;
                                                        s9a.o(xh9Var.d(), ml4.e("Receive failed", th));
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    xh9Var = this;
                                                }
                                            }
                                        }
                                        xh9Var = this;
                                        obj = xh9Var.getAttributes().d(e);
                                        if (obj == null) {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        xh9Var = this;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    xh9Var = this;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                xh9Var = this;
                                th = th;
                                s9a.o(xh9Var.d(), ml4.e("Receive failed", th));
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                h5kVar = wh9Var.r;
                                y6a.M(obj);
                                xh9Var = this;
                                Object obj2 = ((ik9) obj).b;
                                Object obj3 = Intrinsics.c(obj2, kid.a) ? null : obj2;
                                if (obj3 != null) {
                                    KClass kClass2 = h5kVar.a;
                                    try {
                                        kClass2.getClass();
                                    } catch (Throwable th7) {
                                        th = th7;
                                    }
                                    try {
                                        if (!sha.x(kClass2).isInstance(obj3)) {
                                            throw new kdd(xh9Var.d(), duf.a.getOrCreateKotlinClass(obj3.getClass()), h5kVar.a);
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        th = th;
                                        s9a.o(xh9Var.d(), ml4.e("Receive failed", th));
                                        throw th;
                                    }
                                }
                                return obj3;
                            }
                            h5kVar = wh9Var.r;
                            y6a.M(obj);
                            xh9Var = this;
                        }
                        ik9 ik9Var = new ik9(h5kVar, obj);
                        rj9 rj9Var = xh9Var.a.f;
                        wh9Var.r = h5kVar;
                        wh9Var.u = 2;
                        obj = rj9Var.a(xh9Var, ik9Var, wh9Var);
                    }
                }
                if (i != 0) {
                }
                ik9 ik9Var2 = new ik9(h5kVar, obj);
                rj9 rj9Var2 = xh9Var.a.f;
                wh9Var.r = h5kVar;
                wh9Var.u = 2;
                obj = rj9Var2.a(xh9Var, ik9Var2, wh9Var);
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            xh9Var = this;
        }
        wh9Var = new wh9(this, sq3Var);
        Object obj4 = wh9Var.s;
        lu3 lu3Var2 = lu3.a;
        i = wh9Var.u;
    }

    public boolean b() {
        return false;
    }

    public final xj9 c() {
        xj9 xj9Var = this.b;
        if (xj9Var != null) {
            return xj9Var;
        }
        Intrinsics.i("request");
        throw null;
    }

    public final aq4 d() {
        aq4 aq4Var = this.c;
        if (aq4Var != null) {
            return aq4Var;
        }
        Intrinsics.i("response");
        throw null;
    }

    public Object e() {
        return d().c();
    }

    public final xh3 getAttributes() {
        return c().getAttributes();
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return d().getCoroutineContext();
    }

    public final String toString() {
        return "HttpClientCall[" + c().getUrl() + ", " + d().d() + ']';
    }
}
