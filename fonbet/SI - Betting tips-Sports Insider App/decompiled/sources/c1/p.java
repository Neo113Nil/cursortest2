package c1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3457b;

    /* renamed from: c, reason: collision with root package name */
    public int f3458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f3459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(i0 i0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3457b = i5;
        this.f3459d = i0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3457b) {
            case 0:
                return new p(this.f3459d, continuation, 0);
            case 1:
                return new p(this.f3459d, continuation, 1);
            default:
                return new p(this.f3459d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3457b) {
        }
        return ((p) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3457b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f3458c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f3458c = 1;
                    if (i0.c(this.f3459d, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f3458c;
                i0 i0Var = this.f3459d;
                if (i10 == 0) {
                    h8.b.B(obj);
                    com.google.firebase.messaging.x xVar = i0Var.f3409i;
                    this.f3458c = 1;
                    Object m6 = ((eg.r) xVar.f6183b).m(this);
                    if (m6 != aVar2) {
                        m6 = Unit.f19194a;
                    }
                    if (m6 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                hg.g e7 = hg.u0.e(i0Var.g().f3341c, -1, gg.a.f10048a);
                y yVar = new y(0, i0Var);
                this.f3458c = 2;
                if (e7.a(yVar, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f19194a;
            default:
                i0 i0Var2 = this.f3459d;
                j0 j0Var = i0Var2.f3408h;
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f3458c;
                try {
                    if (i11 == 0) {
                        h8.b.B(obj);
                        if (j0Var.b() instanceof s0) {
                            return j0Var.b();
                        }
                        this.f3458c = 1;
                        if (i0.d(i0Var2, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return (c1) obj;
                        }
                        h8.b.B(obj);
                    }
                    this.f3458c = 2;
                    obj = i0.e(i0Var2, false, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    return (c1) obj;
                } catch (Throwable th2) {
                    return new w0(th2, -1);
                }
        }
    }
}
