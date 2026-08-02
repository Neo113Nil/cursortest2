package c1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.i implements vf.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3470b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f3471c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3472d;

    public /* synthetic */ r(int i5, Continuation continuation) {
        super(i5, continuation);
    }

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f3470b) {
            case 0:
                return new r((i0) this.f3472d, (Continuation) obj3).invokeSuspend(Unit.f19194a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, (Continuation) obj3);
                rVar.f3472d = (l0) obj;
                return rVar.invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3470b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f3471c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    i0 i0Var = (i0) this.f3472d;
                    this.f3471c = 1;
                    if (i0.a(i0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f3471c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                l0 l0Var = (l0) this.f3472d;
                this.f3471c = 1;
                if (l0Var.f3421b.get()) {
                    throw new IllegalStateException("This scope has already been closed.");
                }
                Object F = f3.x.F(l0Var.f3420a, new b0(l0Var, null, 1), this);
                return F == aVar2 ? aVar2 : F;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i0 i0Var, Continuation continuation) {
        super(3, continuation);
        this.f3472d = i0Var;
    }
}
