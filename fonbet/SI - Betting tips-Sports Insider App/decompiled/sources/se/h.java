package se;

import da.r;
import eg.c0;
import eg.m0;
import eg.z;
import jg.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import me.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23535b;

    /* renamed from: c, reason: collision with root package name */
    public int f23536c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f23537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f23538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.a f23539f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i5, ic.a aVar, ic.a aVar2, Continuation continuation, p pVar) {
        super(2, continuation);
        this.f23535b = i5;
        this.f23537d = aVar;
        this.f23538e = pVar;
        this.f23539f = aVar2;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23535b) {
            case 0:
                return new h(0, this.f23537d, this.f23539f, continuation, this.f23538e);
            case 1:
                return new h(1, this.f23537d, this.f23539f, continuation, this.f23538e);
            case 2:
                return new h(2, this.f23537d, this.f23539f, continuation, this.f23538e);
            case 3:
                return new h(3, this.f23537d, this.f23539f, continuation, this.f23538e);
            default:
                return new h(4, this.f23537d, this.f23539f, continuation, this.f23538e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23535b) {
        }
        return ((h) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5;
        Object A;
        int i10;
        Object A2;
        int i11;
        Object A3;
        int i12;
        Object A4;
        int i13;
        Object A5;
        int i14 = this.f23535b;
        p pVar = this.f23538e;
        wc.i iVar = pVar.A;
        switch (i14) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i15 = this.f23536c;
                ic.a aVar2 = this.f23537d;
                if (i15 == 0) {
                    h8.b.B(obj);
                    if (aVar2 == null) {
                        return Unit.f19194a;
                    }
                    iVar.getClass();
                    if (r.c()) {
                        i5 = 2;
                    } else {
                        iVar.getClass();
                        i5 = ((Boolean) wc.i.a().f21708h.getValue()).booleanValue() ? 1 : 0;
                    }
                    this.f23536c = 1;
                    lg.e eVar = m0.f9201a;
                    A = c0.A(lg.d.f20063c, new x(iVar, aVar2, false, this.f23539f, i5, null), this);
                    if (A == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A = obj;
                }
                pVar.H.j((ic.g) A);
                lg.e eVar2 = m0.f9201a;
                fg.e eVar3 = q.f18523a;
                g gVar = new g(0, aVar2, this.f23539f, null, pVar);
                this.f23536c = 2;
                if (c0.A(eVar3, gVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar3 = lf.a.f20034a;
                int i16 = this.f23536c;
                ic.a aVar4 = this.f23537d;
                if (i16 == 0) {
                    h8.b.B(obj);
                    if (aVar4 == null) {
                        return Unit.f19194a;
                    }
                    iVar.getClass();
                    if (r.d()) {
                        i10 = 2;
                    } else {
                        iVar.getClass();
                        i10 = ((Boolean) wc.i.a().j.getValue()).booleanValue() ? 1 : 0;
                    }
                    this.f23536c = 1;
                    lg.e eVar4 = m0.f9201a;
                    A2 = c0.A(lg.d.f20063c, new x(iVar, aVar4, false, this.f23539f, i10, null), this);
                    if (A2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A2 = obj;
                }
                pVar.G.j((ic.g) A2);
                lg.e eVar5 = m0.f9201a;
                fg.e eVar6 = q.f18523a;
                g gVar2 = new g(1, aVar4, this.f23539f, null, pVar);
                this.f23536c = 2;
                if (c0.A(eVar6, gVar2, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar5 = lf.a.f20034a;
                int i17 = this.f23536c;
                ic.a aVar6 = this.f23537d;
                if (i17 == 0) {
                    h8.b.B(obj);
                    if (aVar6 == null) {
                        return Unit.f19194a;
                    }
                    iVar.getClass();
                    if (r.e()) {
                        i11 = 2;
                    } else {
                        iVar.getClass();
                        i11 = wc.i.c() ? 1 : 0;
                    }
                    this.f23536c = 1;
                    lg.e eVar7 = m0.f9201a;
                    A3 = c0.A(lg.d.f20063c, new x(iVar, aVar6, false, this.f23539f, i11, null), this);
                    if (A3 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A3 = obj;
                }
                pVar.E.j((ic.g) A3);
                lg.e eVar8 = m0.f9201a;
                fg.e eVar9 = q.f18523a;
                g gVar3 = new g(2, aVar6, this.f23539f, null, pVar);
                this.f23536c = 2;
                if (c0.A(eVar9, gVar3, this) == aVar5) {
                    return aVar5;
                }
                return Unit.f19194a;
            case 3:
                lf.a aVar7 = lf.a.f20034a;
                int i18 = this.f23536c;
                ic.a aVar8 = this.f23537d;
                if (i18 == 0) {
                    h8.b.B(obj);
                    if (aVar8 == null) {
                        return Unit.f19194a;
                    }
                    iVar.getClass();
                    if (r.f()) {
                        i12 = 2;
                    } else {
                        iVar.getClass();
                        i12 = ((Boolean) wc.i.a().f21709i.getValue()).booleanValue() ? 1 : 0;
                    }
                    this.f23536c = 1;
                    lg.e eVar10 = m0.f9201a;
                    A4 = c0.A(lg.d.f20063c, new x(iVar, aVar8, true, this.f23539f, i12, null), this);
                    if (A4 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A4 = obj;
                }
                pVar.F.j((ic.g) A4);
                lg.e eVar11 = m0.f9201a;
                fg.e eVar12 = q.f18523a;
                g gVar4 = new g(3, aVar8, this.f23539f, null, pVar);
                this.f23536c = 2;
                if (c0.A(eVar12, gVar4, this) == aVar7) {
                    return aVar7;
                }
                return Unit.f19194a;
            default:
                lf.a aVar9 = lf.a.f20034a;
                int i19 = this.f23536c;
                ic.a aVar10 = this.f23537d;
                if (i19 == 0) {
                    h8.b.B(obj);
                    if (aVar10 == null) {
                        return Unit.f19194a;
                    }
                    iVar.getClass();
                    if (r.e()) {
                        i13 = 2;
                    } else {
                        iVar.getClass();
                        i13 = wc.i.c() ? 1 : 0;
                    }
                    this.f23536c = 1;
                    lg.e eVar13 = m0.f9201a;
                    A5 = c0.A(lg.d.f20063c, new x(iVar, aVar10, true, this.f23539f, i13, null), this);
                    if (A5 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A5 = obj;
                }
                pVar.D.j((ic.g) A5);
                lg.e eVar14 = m0.f9201a;
                fg.e eVar15 = q.f18523a;
                g gVar5 = new g(4, aVar10, this.f23539f, null, pVar);
                this.f23536c = 2;
                if (c0.A(eVar15, gVar5, this) == aVar9) {
                    return aVar9;
                }
                return Unit.f19194a;
        }
    }
}
