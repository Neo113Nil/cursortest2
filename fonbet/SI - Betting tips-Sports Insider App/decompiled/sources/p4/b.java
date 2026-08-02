package p4;

import eg.l;
import f3.k0;
import gh.g0;
import gh.i0;
import gh.o0;
import java.io.Closeable;
import kh.p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m4.q;
import m4.r;
import u6.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f21515a;

    public /* synthetic */ b(g0 g0Var) {
        this.f21515a = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x005b, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v6, types: [kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(g0 g0Var, q qVar, g1.b bVar, mf.c cVar) {
        a frame;
        Object obj;
        lf.a aVar;
        int i5;
        g1.b bVar2;
        Object obj2;
        Function2 function2;
        Closeable closeable;
        Throwable th2;
        Closeable closeable2;
        if (cVar instanceof a) {
            frame = (a) cVar;
            int i10 = frame.f21514d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                frame.f21514d = i10 - Integer.MIN_VALUE;
                obj = frame.f21513c;
                aVar = lf.a.f20034a;
                i5 = frame.f21514d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    frame.f21511a = bVar;
                    frame.f21512b = g0Var;
                    frame.f21514d = 1;
                    obj = h.c(qVar, frame);
                    obj2 = g0Var;
                    bVar2 = bVar;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            closeable2 = (Closeable) frame.f21512b;
                            try {
                                h8.b.B(obj);
                                com.google.android.play.core.appupdate.b.g(closeable2, null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                try {
                                    throw th2;
                                } catch (Throwable th4) {
                                    com.google.android.play.core.appupdate.b.g(closeable2, th2);
                                    throw th4;
                                }
                            }
                        }
                        function2 = frame.f21511a;
                        h8.b.B(obj);
                        closeable = (Closeable) obj;
                        try {
                            r b10 = h.b((o0) closeable);
                            frame.f21511a = null;
                            frame.f21512b = closeable;
                            frame.f21514d = 3;
                            obj = function2.invoke(b10, frame);
                            if (obj != aVar) {
                                closeable2 = closeable;
                                com.google.android.play.core.appupdate.b.g(closeable2, null);
                                return obj;
                            }
                            return aVar;
                        } catch (Throwable th5) {
                            th2 = th5;
                            closeable2 = closeable;
                            throw th2;
                        }
                    }
                    Object obj3 = (gh.d) frame.f21512b;
                    ?? r10 = frame.f21511a;
                    h8.b.B(obj);
                    obj2 = obj3;
                    bVar2 = r10;
                }
                i0 request = (i0) obj;
                g0 g0Var2 = (g0) obj2;
                g0Var2.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                p pVar = new p(g0Var2, request);
                frame.f21511a = bVar2;
                frame.f21512b = null;
                frame.f21514d = 2;
                l lVar = new l(1, lf.d.b(frame));
                lVar.s();
                k0 k0Var = new k0(1, pVar, lVar);
                pVar.e(k0Var);
                lVar.u(k0Var);
                obj = lVar.r();
                if (obj == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (obj != aVar) {
                    function2 = bVar2;
                    closeable = (Closeable) obj;
                    r b102 = h.b((o0) closeable);
                    frame.f21511a = null;
                    frame.f21512b = closeable;
                    frame.f21514d = 3;
                    obj = function2.invoke(b102, frame);
                    if (obj != aVar) {
                    }
                }
                return aVar;
            }
        }
        frame = new a(cVar);
        obj = frame.f21513c;
        aVar = lf.a.f20034a;
        i5 = frame.f21514d;
        if (i5 != 0) {
        }
        i0 request2 = (i0) obj;
        g0 g0Var22 = (g0) obj2;
        g0Var22.getClass();
        Intrinsics.checkNotNullParameter(request2, "request");
        p pVar2 = new p(g0Var22, request2);
        frame.f21511a = bVar2;
        frame.f21512b = null;
        frame.f21514d = 2;
        l lVar2 = new l(1, lf.d.b(frame));
        lVar2.s();
        k0 k0Var2 = new k0(1, pVar2, lVar2);
        pVar2.e(k0Var2);
        lVar2.u(k0Var2);
        obj = lVar2.r();
        if (obj == aVar) {
        }
        if (obj != aVar) {
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return Intrinsics.areEqual(this.f21515a, ((b) obj).f21515a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21515a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f21515a + ')';
    }
}
