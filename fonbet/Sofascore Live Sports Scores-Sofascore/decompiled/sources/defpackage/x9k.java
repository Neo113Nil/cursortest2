package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class x9k extends btg {
    public final ThreadLocal f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x9k(rq3 rq3Var, CoroutineContext coroutineContext) {
        super(rq3Var, coroutineContext.get(r0) == null ? coroutineContext.plus(r0) : coroutineContext);
        y9k y9kVar = y9k.a;
        this.f = new ThreadLocal();
        if (rq3Var.getContext().get(d.Q7) instanceof au3) {
            return;
        }
        Object c = yfj.c(coroutineContext, null);
        yfj.a(coroutineContext, c);
        p0(coroutineContext, c);
    }

    @Override // defpackage.btg
    public final void m0() {
        o0();
    }

    public final boolean n0() {
        boolean z = this.threadLocalIsSet && this.f.get() == null;
        this.f.remove();
        return !z;
    }

    public final void o0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f.get();
            if (pair != null) {
                yfj.a((CoroutineContext) pair.a, pair.b);
            }
            this.f.remove();
        }
    }

    public final void p0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new Pair(coroutineContext, obj));
    }

    @Override // defpackage.btg, defpackage.kea
    public final void v(Object obj) {
        o0();
        Object H = s9a.H(obj);
        rq3 rq3Var = this.e;
        CoroutineContext context = rq3Var.getContext();
        Object c = yfj.c(context, null);
        x9k c2 = c != yfj.a ? yt3.c(rq3Var, context, c) : null;
        try {
            rq3Var.resumeWith(H);
            Unit unit = Unit.a;
            if (c2 == null || c2.n0()) {
                yfj.a(context, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.n0()) {
                yfj.a(context, c);
            }
            throw th;
        }
    }
}
