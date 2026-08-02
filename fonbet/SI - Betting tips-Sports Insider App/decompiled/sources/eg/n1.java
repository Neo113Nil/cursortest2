package eg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n1 extends t1 {

    /* renamed from: d, reason: collision with root package name */
    public final Continuation f9207d;

    public n1(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f9207d = lf.d.a(function2, this, this);
    }

    @Override // eg.m1
    public final void a0() {
        try {
            Continuation b10 = lf.d.b(this.f9207d);
            gf.o oVar = gf.q.f10031a;
            jg.h.f(Unit.f19194a, b10);
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof i0) {
                th = ((i0) th).f9179a;
            }
            gf.o oVar2 = gf.q.f10031a;
            resumeWith(h8.b.h(th));
            throw th;
        }
    }
}
