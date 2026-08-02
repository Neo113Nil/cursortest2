package f3;

import eg.g1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9366b;

    /* renamed from: c, reason: collision with root package name */
    public int f9367c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f9368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(j0 j0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f9366b = i5;
        this.f9368d = j0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f9366b) {
            case 0:
                return new h0(this.f9368d, continuation, 0);
            default:
                return new h0(this.f9368d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f9366b) {
        }
        return ((h0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Object d0Var;
        switch (this.f9366b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f9367c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f9367c = 1;
                Object a7 = j0.a(this.f9368d, this);
                return a7 == aVar ? aVar : a7;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f9367c;
                j0 j0Var = this.f9368d;
                try {
                    if (i10 == 0) {
                        h8.b.B(obj);
                        g1 g1Var = j0Var.f9388m;
                        h0 h0Var = new h0(j0Var, null, 0);
                        this.f9367c = 1;
                        obj = eg.c0.A(g1Var, h0Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    d0Var = (g0) obj;
                } catch (y e7) {
                    d0Var = new f0(e7.f9436a);
                } catch (CancellationException unused) {
                    d0Var = new d0();
                } catch (Throwable th2) {
                    e3.x.e().d(l0.f9396a, "Unexpected error in WorkerWrapper", th2);
                    d0Var = new d0();
                }
                Object o3 = j0Var.f9384h.o(new com.google.firebase.messaging.i(1, d0Var, j0Var));
                Intrinsics.checkNotNullExpressionValue(o3, "runInTransaction(...)");
                return o3;
        }
    }
}
