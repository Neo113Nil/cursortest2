package le;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19954b;

    /* renamed from: c, reason: collision with root package name */
    public int f19955c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f19956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(z zVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19954b = i5;
        this.f19956d = zVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19954b) {
            case 0:
                return new u(this.f19956d, continuation, 0);
            case 1:
                return new u(this.f19956d, continuation, 1);
            case 2:
                return new u(this.f19956d, continuation, 2);
            case 3:
                return new u(this.f19956d, continuation, 3);
            case 4:
                return new u(this.f19956d, continuation, 4);
            case 5:
                return new u(this.f19956d, continuation, 5);
            case 6:
                return new u(this.f19956d, continuation, 6);
            case 7:
                return new u(this.f19956d, continuation, 7);
            default:
                return new u(this.f19956d, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19954b) {
            case 1:
                ((u) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
                break;
            case 2:
                ((u) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
                break;
        }
        return ((u) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19954b;
        int i10 = 2;
        Continuation continuation = null;
        z zVar = this.f19956d;
        int i11 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i12 = this.f19955c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    com.google.firebase.messaging.x xVar = zVar.f20027y;
                    this.f19955c = 1;
                    if (xVar.G(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f19955c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                zVar.f20027y.getClass();
                hg.t0 t0Var = com.google.firebase.messaging.x.v().f21706f;
                x xVar2 = new x(zVar, 0);
                this.f19955c = 1;
                t0Var.a(xVar2, this);
                return aVar2;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i14 = this.f19955c;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                zVar.f20027y.getClass();
                hg.t0 t0Var2 = com.google.firebase.messaging.x.v().f21707g;
                x xVar3 = new x(zVar, i11);
                this.f19955c = 1;
                t0Var2.a(xVar3, this);
                return aVar3;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i15 = this.f19955c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    zVar.f20027y.getClass();
                    hg.d1 d1Var = da.r.f8345c;
                    g gVar = new g(zVar, continuation, i11);
                    this.f19955c = 1;
                    if (hg.u0.g(d1Var, gVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i16 = this.f19955c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    zVar.f20027y.getClass();
                    hg.d1 d1Var2 = com.google.firebase.messaging.x.v().f21710k;
                    c1.a1 a1Var = new c1.a1(i10, continuation, 4);
                    this.f19955c = 1;
                    if (hg.u0.g(d1Var2, a1Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i17 = this.f19955c;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                com.google.firebase.messaging.x xVar4 = zVar.f20027y;
                this.f19955c = 1;
                Object B = xVar4.B(this);
                return B == aVar6 ? aVar6 : B;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                int i18 = this.f19955c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = eg.m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    u uVar = new u(zVar, continuation, 5);
                    this.f19955c = 1;
                    obj = eg.c0.A(dVar, uVar, this);
                    if (obj == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                zVar.f20026x.h(bool);
                return Unit.f19194a;
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                int i19 = this.f19955c;
                try {
                    if (i19 == 0) {
                        h8.b.B(obj);
                        this.f19955c = 1;
                        obj = z.g(zVar, this);
                        if (obj == aVar8) {
                            return aVar8;
                        }
                    } else {
                        if (i19 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    y1.c0 c0Var = (y1.c0) obj;
                    if (c0Var != null) {
                        zVar.f20011g.h(new ic.i0(new ic.f(c0Var)));
                    }
                } catch (Exception unused) {
                }
                return Unit.f19194a;
            default:
                lf.a aVar9 = lf.a.f20034a;
                int i20 = this.f19955c;
                if (i20 == 0) {
                    h8.b.B(obj);
                    com.google.firebase.messaging.x xVar5 = zVar.f20027y;
                    this.f19955c = 1;
                    obj = xVar5.Q(this);
                    if (obj == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                int intValue = ((Number) obj).intValue();
                if (intValue == 200 || intValue == 204) {
                    u1.a i21 = androidx.lifecycle.d1.i(zVar);
                    lg.e eVar2 = eg.m0.f9201a;
                    eg.c0.t(i21, jg.q.f18523a, null, new y(zVar, continuation, i10), 2);
                }
                return Unit.f19194a;
        }
    }
}
