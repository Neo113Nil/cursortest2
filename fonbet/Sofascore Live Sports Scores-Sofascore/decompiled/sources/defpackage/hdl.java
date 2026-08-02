package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class hdl {
    public static final /* synthetic */ int a = 0;

    static {
        rik.x("WorkerWrapper");
    }

    public static final Object a(ddb ddbVar, kdb kdbVar, hoi hoiVar) {
        Object obj;
        try {
            if (!ddbVar.isDone()) {
                lj2 lj2Var = new lj2(1, z9a.b(hoiVar));
                lj2Var.t();
                ddbVar.addListener(new vlo(ddbVar, lj2Var), e35.a);
                lj2Var.v(new wsd(19, kdbVar, ddbVar));
                Object q = lj2Var.q();
                lu3 lu3Var = lu3.a;
                return q;
            }
            boolean z = false;
            while (true) {
                try {
                    obj = ddbVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
