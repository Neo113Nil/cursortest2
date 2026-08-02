package wc;

import eg.b2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25211b;

    /* renamed from: c, reason: collision with root package name */
    public int f25212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f25213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(d0 d0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f25211b = i5;
        this.f25213d = d0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f25211b) {
            case 0:
                return new w(this.f25213d, continuation, 0);
            case 1:
                return new w(this.f25213d, continuation, 1);
            case 2:
                return new w(this.f25213d, continuation, 2);
            case 3:
                return new w(this.f25213d, continuation, 3);
            case 4:
                return new w(this.f25213d, continuation, 4);
            case 5:
                return new w(this.f25213d, continuation, 5);
            default:
                return new w(this.f25213d, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f25211b) {
        }
        return ((w) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Continuation continuation = null;
        switch (this.f25211b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f25212c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f25213d.getClass();
                pc.u b10 = d0.b();
                this.f25212c = 1;
                Object j = b10.j(this);
                return j == aVar ? aVar : j;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f25212c;
                try {
                    if (i10 == 0) {
                        h8.b.B(obj);
                        w wVar = new w(this.f25213d, continuation, 0);
                        this.f25212c = 1;
                        obj = b2.b(5000L, wVar, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (String) obj;
                } catch (Exception unused) {
                    return null;
                }
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f25212c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    pc.u b11 = d0.b();
                    this.f25212c = 1;
                    if (d9.e.c(b11, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 3:
                Object obj2 = lf.a.f20034a;
                int i12 = this.f25212c;
                int i13 = 2;
                if (i12 == 0 || i12 == 1) {
                    h8.b.B(obj);
                    d0 d0Var = this.f25213d;
                    this.f25212c = 2;
                    d0Var.getClass();
                    lg.e eVar = eg.m0.f9201a;
                    Object A = eg.c0.A(lg.d.f20063c, new w(d0Var, continuation, i13), this);
                    if (A != obj2) {
                        A = Unit.f19194a;
                    }
                    if (A == obj2) {
                        return obj2;
                    }
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar4 = lf.a.f20034a;
                int i14 = this.f25212c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    ic.h0 h0Var = (ic.h0) d0.b().q.getValue();
                    this.f25212c = 1;
                    if (d0.m(h0Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 5:
                lf.a aVar5 = lf.a.f20034a;
                int i15 = this.f25212c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    this.f25213d.getClass();
                    ic.h0 h0Var2 = (ic.h0) d0.b().f21714o.getValue();
                    this.f25212c = 1;
                    if (d0.m(h0Var2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar6 = lf.a.f20034a;
                int i16 = this.f25212c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    this.f25213d.getClass();
                    ic.h0 h0Var3 = (ic.h0) d0.b().f21715p.getValue();
                    this.f25212c = 1;
                    if (d0.m(h0Var3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
