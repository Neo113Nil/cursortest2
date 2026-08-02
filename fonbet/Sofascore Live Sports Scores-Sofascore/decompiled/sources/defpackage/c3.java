package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class c3 extends kea implements rq3, ku3 {
    public final CoroutineContext d;

    public c3(CoroutineContext coroutineContext, boolean z) {
        super(z);
        R((yda) coroutineContext.get(uic.g));
        this.d = coroutineContext.plus(this);
    }

    @Override // defpackage.kea
    public final String A() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.kea
    public final void Q(fb3 fb3Var) {
        qx9.A(this.d, fb3Var);
    }

    @Override // defpackage.kea
    public final void b0(Object obj) {
        if (!(obj instanceof eb3)) {
            k0(obj);
        } else {
            eb3 eb3Var = (eb3) obj;
            j0(eb3Var.a, rh0.a.getIntVolatile(eb3Var, eb3.b) == 1);
        }
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return this.d;
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.d;
    }

    public final void l0(nu3 nu3Var, c3 c3Var, Function2 function2) {
        Object invoke;
        int ordinal = nu3Var.ordinal();
        if (ordinal == 0) {
            hkg.r0(function2, c3Var, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                function2.getClass();
                rq3 b = z9a.b(z9a.a(c3Var, this, function2));
                Unit unit = Unit.a;
                p2g p2gVar = w2g.b;
                b.resumeWith(unit);
                return;
            }
            if (ordinal != 3) {
                zzl.b();
                return;
            }
            try {
                CoroutineContext coroutineContext = this.d;
                Object c = yfj.c(coroutineContext, null);
                try {
                    if (function2 instanceof h21) {
                        i5k.e(2, function2);
                        invoke = function2.invoke(c3Var, this);
                    } else {
                        invoke = z9a.c(function2, c3Var, this);
                    }
                    yfj.a(coroutineContext, c);
                    if (invoke != lu3.a) {
                        p2g p2gVar2 = w2g.b;
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    yfj.a(coroutineContext, c);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof q45) {
                    th = ((q45) th).a;
                }
                p2g p2gVar3 = w2g.b;
                resumeWith(new u2g(th));
            }
        }
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        Throwable a = w2g.a(obj);
        if (a != null) {
            obj = new eb3(a, false);
        }
        Object W = W(obj);
        if (W == lea.b) {
            return;
        }
        v(W);
    }

    public void k0(Object obj) {
    }

    public void j0(Throwable th, boolean z) {
    }
}
