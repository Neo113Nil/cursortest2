package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.Closeable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gh2 {
    public final yg2 a;

    public /* synthetic */ gh2(yg2 yg2Var) {
        this.a = yg2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0062, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(yg2 yg2Var, mad madVar, Function2 function2, sq3 sq3Var) {
        fh2 fh2Var;
        Object obj;
        lu3 lu3Var;
        int i;
        Function2 function22;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (sq3Var instanceof fh2) {
            fh2Var = (fh2) sq3Var;
            int i2 = fh2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fh2Var.u = i2 - Integer.MIN_VALUE;
                obj = fh2Var.t;
                lu3Var = lu3.a;
                i = fh2Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    fh2Var.r = function2;
                    fh2Var.s = yg2Var;
                    fh2Var.u = 1;
                    obj = yso.K(madVar, fh2Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            closeable2 = (Closeable) fh2Var.s;
                            Function2 function23 = fh2Var.r;
                            try {
                                y6a.M(obj);
                                n4o.x(closeable2, null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    n4o.x(closeable2, th);
                                    throw th3;
                                }
                            }
                        }
                        function22 = fh2Var.r;
                        y6a.M(obj);
                        closeable = (Closeable) obj;
                        try {
                            zad J = yso.J((d2g) closeable);
                            fh2Var.r = null;
                            fh2Var.s = closeable;
                            fh2Var.u = 3;
                            obj = function22.invoke(J, fh2Var);
                            if (obj != lu3Var) {
                                closeable2 = closeable;
                                n4o.x(closeable2, null);
                                return obj;
                            }
                            return lu3Var;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable2 = closeable;
                            throw th;
                        }
                    }
                    yg2Var = (yg2) fh2Var.s;
                    function2 = fh2Var.r;
                    y6a.M(obj);
                }
                pof b = ((jod) yg2Var).b((qzf) obj);
                fh2Var.r = function2;
                fh2Var.s = null;
                fh2Var.u = 2;
                lj2 lj2Var = new lj2(1, z9a.b(fh2Var));
                lj2Var.t();
                int i3 = 0;
                lj2Var.v(new yh2(b, i3));
                FirebasePerfOkHttpClient.enqueue(b, new ai2(lj2Var, i3));
                obj = lj2Var.q();
                if (obj != lu3Var) {
                    function22 = function2;
                    closeable = (Closeable) obj;
                    zad J2 = yso.J((d2g) closeable);
                    fh2Var.r = null;
                    fh2Var.s = closeable;
                    fh2Var.u = 3;
                    obj = function22.invoke(J2, fh2Var);
                    if (obj != lu3Var) {
                    }
                }
                return lu3Var;
            }
        }
        fh2Var = new fh2(sq3Var);
        obj = fh2Var.t;
        lu3Var = lu3.a;
        i = fh2Var.u;
        if (i != 0) {
        }
        pof b2 = ((jod) yg2Var).b((qzf) obj);
        fh2Var.r = function2;
        fh2Var.s = null;
        fh2Var.u = 2;
        lj2 lj2Var2 = new lj2(1, z9a.b(fh2Var));
        lj2Var2.t();
        int i32 = 0;
        lj2Var2.v(new yh2(b2, i32));
        FirebasePerfOkHttpClient.enqueue(b2, new ai2(lj2Var2, i32));
        obj = lj2Var2.q();
        if (obj != lu3Var) {
        }
        return lu3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gh2) {
            return Intrinsics.c(this.a, ((gh2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ")";
    }
}
