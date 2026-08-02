package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class v45 extends yti {
    public int c;

    public v45(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract rq3 e();

    public Throwable f(Object obj) {
        eb3 eb3Var = obj instanceof eb3 ? (eb3) obj : null;
        if (eb3Var != null) {
            return eb3Var.a;
        }
        return null;
    }

    public final void h(Throwable th) {
        qx9.A(e().getContext(), new qu3("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r4 = (defpackage.yda) r5.get(defpackage.uic.g);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            rq3 e = e();
            e.getClass();
            s45 s45Var = (s45) e;
            sq3 sq3Var = s45Var.e;
            Object obj = s45Var.g;
            CoroutineContext context = sq3Var.getContext();
            Object c = yfj.c(context, obj);
            yda ydaVar = null;
            x9k c2 = c != yfj.a ? yt3.c(sq3Var, context, c) : null;
            try {
                CoroutineContext context2 = sq3Var.getContext();
                Object j = j();
                Throwable f = f(j);
                if (f == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (ydaVar != null && !ydaVar.isActive()) {
                    CancellationException k = ydaVar.k();
                    d(k);
                    p2g p2gVar = w2g.b;
                    sq3Var.resumeWith(y6a.x(k));
                } else if (f != null) {
                    p2g p2gVar2 = w2g.b;
                    sq3Var.resumeWith(new u2g(f));
                } else {
                    p2g p2gVar3 = w2g.b;
                    sq3Var.resumeWith(g(j));
                }
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
        } catch (q45 e2) {
            qx9.A(e().getContext(), e2.a);
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void d(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
