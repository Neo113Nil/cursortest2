package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zij implements ku3 {
    public final /* synthetic */ ku3 a;
    public final AtomicReference b = new AtomicReference(null);
    public final /* synthetic */ ogj c;
    public final /* synthetic */ ku3 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ AtomicReference f;

    public zij(ku3 ku3Var, ogj ogjVar, ku3 ku3Var2, Function2 function2, AtomicReference atomicReference) {
        this.c = ogjVar;
        this.d = ku3Var2;
        this.e = function2;
        this.f = atomicReference;
        this.a = ku3Var;
    }

    public final long a() {
        Long l = (Long) this.b.get();
        if (l == null) {
            xd5.b.getClass();
            return xd5.c;
        }
        long longValue = l.longValue();
        this.c.getClass();
        long currentTimeMillis = longValue - System.currentTimeMillis();
        wd5 wd5Var = xd5.b;
        return wkn.S(currentTimeMillis, be5.MILLISECONDS);
    }

    public final void b(long j) {
        if (xd5.e(j) <= 0) {
            s9a.o(this.d, new rij("Timed out immediately", this.e.hashCode()));
            return;
        }
        if (xd5.c(a(), j) < 0) {
            return;
        }
        this.c.getClass();
        this.b.set(Long.valueOf(xd5.e(j) + System.currentTimeMillis()));
        ogj ogjVar = this.c;
        ku3 ku3Var = this.d;
        yda ydaVar = (yda) this.f.getAndSet(xw3.L(ku3Var, null, null, new cce(this, ogjVar, ku3Var, this.e, null, 29), 3));
        if (ydaVar != null) {
            ydaVar.e(null);
        }
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
