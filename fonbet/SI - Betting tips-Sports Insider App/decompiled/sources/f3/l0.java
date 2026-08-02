package f3;

import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9396a;

    static {
        String g10 = e3.x.g("WorkerWrapper");
        Intrinsics.checkNotNullExpressionValue(g10, "tagWithPrefix(...)");
        f9396a = g10;
    }

    public static final Object a(g8.b bVar, e3.w wVar, mf.i frame) {
        Object obj;
        try {
            if (!bVar.isDone()) {
                eg.l lVar = new eg.l(1, lf.d.b(frame));
                lVar.s();
                bVar.a(new l(bVar, lVar, 0), e3.m.f8543a);
                lVar.u(new k0(0, wVar, bVar));
                Object r5 = lVar.r();
                if (r5 == lf.a.f20034a) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return r5;
            }
            boolean z5 = false;
            while (true) {
                try {
                    obj = bVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z5 = true;
                } catch (Throwable th2) {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            Intrinsics.checkNotNull(cause);
            throw cause;
        }
    }
}
