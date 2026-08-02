package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class s45 extends v45 implements mu3, rq3 {
    public static final /* synthetic */ long h = rh0.a.objectFieldOffset(s45.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final au3 d;
    public final sq3 e;
    public Object f;
    public final Object g;

    public s45(au3 au3Var, sq3 sq3Var) {
        super(-1);
        this.d = au3Var;
        this.e = sq3Var;
        this.f = t45.a;
        this.g = yfj.b(sq3Var.getContext());
    }

    @Override // defpackage.mu3
    public final mu3 getCallerFrame() {
        return this.e;
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.v45
    public final Object j() {
        Object obj = this.f;
        this.f = t45.a;
        return obj;
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        Throwable a = w2g.a(obj);
        Object eb3Var = a == null ? obj : new eb3(a, false);
        sq3 sq3Var = this.e;
        CoroutineContext context = sq3Var.getContext();
        au3 au3Var = this.d;
        if (t45.c(au3Var, context)) {
            this.f = eb3Var;
            this.c = 0;
            t45.b(au3Var, sq3Var.getContext(), this);
            return;
        }
        g26 a2 = cgj.a();
        if (a2.c >= 4294967296L) {
            this.f = eb3Var;
            this.c = 0;
            a2.j0(this);
            return;
        }
        a2.n0(true);
        try {
            CoroutineContext context2 = sq3Var.getContext();
            Object c = yfj.c(context2, this.g);
            try {
                sq3Var.resumeWith(obj);
                Unit unit = Unit.a;
                while (a2.u0()) {
                }
            } finally {
                yfj.a(context2, c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + ml4.s0(this.e) + ']';
    }

    @Override // defpackage.v45
    public final rq3 e() {
        return this;
    }
}
