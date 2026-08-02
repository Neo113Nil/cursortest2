package eg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class a extends m1 implements Continuation, z {

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f9135c;

    public a(CoroutineContext coroutineContext, boolean z5) {
        super(z5);
        L((e1) coroutineContext.r(x.f9237b));
        this.f9135c = coroutineContext.t(this);
    }

    @Override // eg.z
    public final CoroutineContext C() {
        return this.f9135c;
    }

    @Override // eg.m1
    public final void I(androidx.fragment.app.i0 i0Var) {
        c0.q(i0Var, this.f9135c);
    }

    @Override // eg.m1
    public final void Z(Object obj) {
        if (!(obj instanceof t)) {
            i0(obj);
        } else {
            t tVar = (t) obj;
            h0(tVar.f9223a, t.f9222b.get(tVar) == 1);
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f9135c;
    }

    public final void j0(a0 a0Var, a aVar, Function2 function2) {
        int ordinal = a0Var.ordinal();
        if (ordinal == 0) {
            m4.g.z(function2, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                Intrinsics.checkNotNullParameter(function2, "<this>");
                Intrinsics.checkNotNullParameter(this, "completion");
                Continuation b10 = lf.d.b(lf.d.a(function2, aVar, this));
                Unit unit = Unit.f19194a;
                gf.o oVar = gf.q.f10031a;
                b10.resumeWith(unit);
                return;
            }
            if (ordinal != 3) {
                throw new gf.m();
            }
            Intrinsics.checkNotNullParameter(this, "completion");
            try {
                CoroutineContext coroutineContext = this.f9135c;
                Object c2 = jg.y.c(coroutineContext, null);
                try {
                    Intrinsics.checkNotNullParameter(this, "frame");
                    Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(aVar, this);
                    if (invoke != lf.a.f20034a) {
                        gf.o oVar2 = gf.q.f10031a;
                        resumeWith(invoke);
                    }
                } finally {
                    jg.y.a(coroutineContext, c2);
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof i0) {
                    th = ((i0) th).f9179a;
                }
                gf.o oVar3 = gf.q.f10031a;
                resumeWith(h8.b.h(th));
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable a7 = gf.q.a(obj);
        if (a7 != null) {
            obj = new t(a7, false);
        }
        Object S = S(obj);
        if (S == c0.f9154e) {
            return;
        }
        l(S);
    }

    @Override // eg.m1
    public final String s() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void i0(Object obj) {
    }

    public void h0(Throwable th2, boolean z5) {
    }
}
