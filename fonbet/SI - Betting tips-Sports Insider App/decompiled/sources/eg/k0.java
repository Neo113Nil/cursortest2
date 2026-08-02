package eg;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class k0 extends lg.i {

    /* renamed from: c, reason: collision with root package name */
    public int f9185c;

    public k0(int i5) {
        super(false, 0L);
        this.f9185c = i5;
    }

    public abstract Continuation d();

    public Throwable e(Object obj) {
        t tVar = obj instanceof t ? (t) obj : null;
        if (tVar != null) {
            return tVar.f9223a;
        }
        return null;
    }

    public final void h(Throwable th2) {
        c0.q(new b0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), d().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r4 = (eg.e1) r5.r(eg.x.f9237b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            Continuation d10 = d();
            Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            jg.g gVar = (jg.g) d10;
            mf.c cVar = gVar.f18499e;
            Object obj = gVar.f18501g;
            CoroutineContext context = cVar.getContext();
            Object c2 = jg.y.c(context, obj);
            e1 e1Var = null;
            d2 c8 = c2 != jg.y.f18531a ? u.c(cVar, context, c2) : null;
            try {
                CoroutineContext context2 = cVar.getContext();
                Object j = j();
                Throwable e7 = e(j);
                if (e7 == null) {
                    int i5 = this.f9185c;
                    boolean z5 = true;
                    if (i5 != 1 && i5 != 2) {
                        z5 = false;
                    }
                }
                if (e1Var != null && !e1Var.c()) {
                    CancellationException y5 = e1Var.y();
                    c(y5);
                    gf.o oVar = gf.q.f10031a;
                    cVar.resumeWith(h8.b.h(y5));
                } else if (e7 != null) {
                    gf.o oVar2 = gf.q.f10031a;
                    cVar.resumeWith(h8.b.h(e7));
                } else {
                    gf.o oVar3 = gf.q.f10031a;
                    cVar.resumeWith(g(j));
                }
                Unit unit = Unit.f19194a;
                if (c8 == null || c8.l0()) {
                    jg.y.a(context, c2);
                }
            } catch (Throwable th2) {
                if (c8 == null || c8.l0()) {
                    jg.y.a(context, c2);
                }
                throw th2;
            }
        } catch (i0 e9) {
            c0.q(e9.f9179a, d().getContext());
        } catch (Throwable th3) {
            h(th3);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
