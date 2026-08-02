package se;

import eg.c0;
import eg.m0;
import eg.z;
import hg.d1;
import hg.t0;
import hg.u0;
import ic.i0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23550b;

    /* renamed from: c, reason: collision with root package name */
    public int f23551c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f23552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(p pVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23550b = i5;
        this.f23552d = pVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23550b) {
            case 0:
                return new j(this.f23552d, continuation, 0);
            case 1:
                return new j(this.f23552d, continuation, 1);
            case 2:
                return new j(this.f23552d, continuation, 2);
            case 3:
                return new j(this.f23552d, continuation, 3);
            case 4:
                return new j(this.f23552d, continuation, 4);
            case 5:
                return new j(this.f23552d, continuation, 5);
            case 6:
                return new j(this.f23552d, continuation, 6);
            case 7:
                return new j(this.f23552d, continuation, 7);
            case 8:
                return new j(this.f23552d, continuation, 8);
            default:
                return new j(this.f23552d, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23550b) {
            case 1:
                ((j) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
                break;
            case 2:
                ((j) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
                break;
        }
        return ((j) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f23550b;
        int i10 = 0;
        Continuation continuation = null;
        p pVar = this.f23552d;
        int i11 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i12 = this.f23551c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    wc.i iVar = pVar.A;
                    this.f23551c = 1;
                    if (iVar.g(this) == aVar) {
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
                int i13 = this.f23551c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                pVar.A.getClass();
                t0 t0Var = wc.i.a().f21706f;
                n nVar = new n(pVar, i10);
                this.f23551c = 1;
                t0Var.a(nVar, this);
                return aVar2;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i14 = this.f23551c;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                pVar.A.getClass();
                t0 t0Var2 = wc.i.a().f21707g;
                n nVar2 = new n(pVar, i11);
                this.f23551c = 1;
                t0Var2.a(nVar2, this);
                return aVar3;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i15 = this.f23551c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    pVar.A.getClass();
                    d1 d1Var = wc.i.a().f21708h;
                    o oVar = new o(pVar, continuation, i10);
                    this.f23551c = 1;
                    if (u0.g(d1Var, oVar, this) == aVar4) {
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
                int i16 = this.f23551c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    pVar.A.getClass();
                    d1 d1Var2 = wc.i.a().j;
                    o oVar2 = new o(pVar, continuation, i11);
                    this.f23551c = 1;
                    if (u0.g(d1Var2, oVar2, this) == aVar5) {
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
                int i17 = this.f23551c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    pVar.A.getClass();
                    d1 d1Var3 = wc.i.a().f21709i;
                    o oVar3 = new o(pVar, continuation, 2);
                    this.f23551c = 1;
                    if (u0.g(d1Var3, oVar3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                int i18 = this.f23551c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    pVar.A.getClass();
                    d1 d1Var4 = wc.i.a().f21710k;
                    o oVar4 = new o(pVar, continuation, 3);
                    this.f23551c = 1;
                    if (u0.g(d1Var4, oVar4, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                int i19 = this.f23551c;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                wc.i iVar2 = pVar.A;
                this.f23551c = 1;
                iVar2.getClass();
                lg.e eVar = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new wc.f(iVar2, continuation, 4), this);
                return A == aVar8 ? aVar8 : A;
            case 8:
                lf.a aVar9 = lf.a.f20034a;
                int i20 = this.f23551c;
                if (i20 == 0) {
                    h8.b.B(obj);
                    lg.e eVar2 = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    j jVar = new j(pVar, continuation, 7);
                    this.f23551c = 1;
                    obj = c0.A(dVar, jVar, this);
                    if (obj == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                pVar.K.h(bool);
                return Unit.f19194a;
            default:
                lf.a aVar10 = lf.a.f20034a;
                int i21 = this.f23551c;
                try {
                    if (i21 == 0) {
                        h8.b.B(obj);
                        this.f23551c = 1;
                        obj = p.e(pVar, this);
                        if (obj == aVar10) {
                            return aVar10;
                        }
                    } else {
                        if (i21 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    y1.c0 c0Var = (y1.c0) obj;
                    if (c0Var != null) {
                        pVar.B.h(new i0(new ic.f(c0Var)));
                    }
                } catch (Exception unused) {
                }
                return Unit.f19194a;
        }
    }
}
