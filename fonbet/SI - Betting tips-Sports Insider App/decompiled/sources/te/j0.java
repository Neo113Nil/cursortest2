package te;

import eg.m0;
import j$.time.Instant;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23890b;

    /* renamed from: c, reason: collision with root package name */
    public int f23891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f23892d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(l0 l0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23890b = i5;
        this.f23892d = l0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23890b) {
            case 0:
                return new j0(this.f23892d, continuation, 0);
            default:
                return new j0(this.f23892d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23890b) {
        }
        return ((j0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f23890b;
        l0 l0Var = this.f23892d;
        int i10 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f23891c;
                Continuation continuation = null;
                if (i11 == 0) {
                    h8.b.B(obj);
                    md.m mVar = l0Var.f23900d;
                    this.f23891c = 1;
                    mVar.getClass();
                    lg.e eVar = m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new je.a(mVar, continuation, i10), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                l0Var.f23909n = Instant.now().getEpochSecond();
                l0Var.f23907l.set(false);
                lg.e eVar2 = m0.f9201a;
                fg.e eVar3 = jg.q.f18523a;
                f3.n nVar = new f3.n(l0Var, booleanValue, continuation, 4);
                this.f23891c = 2;
                if (eg.c0.A(eVar3, nVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f23891c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    md.m mVar2 = l0Var.f23900d;
                    this.f23891c = 1;
                    obj = mVar2.i(100, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                l0Var.j.j((List) obj);
                return Unit.f19194a;
        }
    }
}
