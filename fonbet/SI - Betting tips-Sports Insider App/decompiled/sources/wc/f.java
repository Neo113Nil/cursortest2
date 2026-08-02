package wc;

import eg.b2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25086b;

    /* renamed from: c, reason: collision with root package name */
    public int f25087c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f25088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f25086b = i5;
        this.f25088d = iVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f25086b) {
            case 0:
                return new f(this.f25088d, continuation, 0);
            case 1:
                return new f(this.f25088d, continuation, 1);
            case 2:
                return new f(this.f25088d, continuation, 2);
            case 3:
                return new f(this.f25088d, continuation, 3);
            case 4:
                return new f(this.f25088d, continuation, 4);
            case 5:
                return new f(this.f25088d, continuation, 5);
            case 6:
                return new f(this.f25088d, continuation, 6);
            case 7:
                return new f(this.f25088d, continuation, 7);
            case 8:
                return new f(this.f25088d, continuation, 8);
            case 9:
                return new f(this.f25088d, continuation, 9);
            case 10:
                return new f(this.f25088d, continuation, 10);
            case 11:
                return new f(this.f25088d, continuation, 11);
            case 12:
                return new f(this.f25088d, continuation, 12);
            case 13:
                return new f(this.f25088d, continuation, 13);
            case 14:
                return new f(this.f25088d, continuation, 14);
            default:
                return new f(this.f25088d, continuation, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f25086b) {
        }
        return ((f) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0313  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i5 = 5;
        int i10 = 3;
        int i11 = 2;
        boolean z5 = false;
        r4 = false;
        boolean z7 = false;
        r4 = false;
        boolean z10 = false;
        z5 = false;
        Continuation continuation = null;
        switch (this.f25086b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i12 = this.f25087c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f25088d.getClass();
                pc.u a7 = i.a();
                this.f25087c = 1;
                Object j = a7.j(this);
                return j == aVar ? aVar : j;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f25087c;
                try {
                    if (i13 == 0) {
                        h8.b.B(obj);
                        f fVar = new f(this.f25088d, continuation, z5 ? 1 : 0);
                        this.f25087c = 1;
                        obj = b2.b(5000L, fVar, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (String) obj;
                } catch (Exception unused) {
                    return null;
                }
            case 2:
                i iVar = this.f25088d;
                lf.a aVar3 = lf.a.f20034a;
                int i14 = this.f25087c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    this.f25087c = 1;
                    obj = iVar.e(this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            z5 = true;
                        }
                        return Boolean.valueOf(z5);
                    }
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f25087c = 2;
                    iVar.getClass();
                    lg.e eVar = eg.m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new f(iVar, continuation, i5), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                return Boolean.valueOf(z5);
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i15 = this.f25087c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    rc.r rVar = this.f25088d.f25111b;
                    this.f25087c = 1;
                    obj = rVar.a(this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                int intValue = ((Number) obj).intValue();
                if (1 <= intValue && intValue < 3) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 4:
                i iVar2 = this.f25088d;
                lf.a aVar5 = lf.a.f20034a;
                int i16 = this.f25087c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    this.f25087c = 1;
                    obj = iVar2.e(this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        if (((Boolean) obj).booleanValue()) {
                            z7 = true;
                        }
                        return Boolean.valueOf(z7);
                    }
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f25087c = 2;
                    lg.e eVar2 = eg.m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new f(iVar2, continuation, i5), this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return Boolean.valueOf(z7);
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i17 = this.f25087c;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                rc.r rVar2 = this.f25088d.f25111b;
                this.f25087c = 1;
                Object b10 = rVar2.b(this);
                return b10 == aVar6 ? aVar6 : b10;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                int i18 = this.f25087c;
                if (i18 == 0 || i18 == 1) {
                    h8.b.B(obj);
                    this.f25088d.getClass();
                    pc.u a10 = i.a();
                    this.f25087c = 2;
                    if (d9.e.c(a10, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                int i19 = this.f25087c;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                s7.u uVar = this.f25088d.f25112c;
                this.f25087c = 1;
                uVar.getClass();
                s7.u.g().getClass();
                y8.d dVar = new y8.d();
                lg.e eVar3 = eg.m0.f9201a;
                Object A = eg.c0.A(lg.d.f20063c, new eb.o(dVar, continuation, z5 ? 1 : 0), this);
                return A == aVar8 ? aVar8 : A;
            case 8:
                lf.a aVar9 = lf.a.f20034a;
                int i20 = this.f25087c;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                s7.u uVar2 = this.f25088d.f25112c;
                this.f25087c = 1;
                uVar2.getClass();
                s7.u.g().getClass();
                y8.d dVar2 = new y8.d();
                lg.e eVar4 = eg.m0.f9201a;
                Object A2 = eg.c0.A(lg.d.f20063c, new eb.o(dVar2, continuation, i11), this);
                return A2 == aVar9 ? aVar9 : A2;
            case 9:
                lf.a aVar10 = lf.a.f20034a;
                int i21 = this.f25087c;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                s7.u uVar3 = this.f25088d.f25112c;
                this.f25087c = 1;
                uVar3.getClass();
                s7.u.g().getClass();
                y8.d dVar3 = new y8.d();
                lg.e eVar5 = eg.m0.f9201a;
                Object A3 = eg.c0.A(lg.d.f20063c, new eb.o(dVar3, continuation, i10), this);
                return A3 == aVar10 ? aVar10 : A3;
            case 10:
                lf.a aVar11 = lf.a.f20034a;
                int i22 = this.f25087c;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                s7.u uVar4 = this.f25088d.f25112c;
                this.f25087c = 1;
                uVar4.getClass();
                s7.u.g().getClass();
                y8.d dVar4 = new y8.d();
                lg.e eVar6 = eg.m0.f9201a;
                Object A4 = eg.c0.A(lg.d.f20063c, new eb.o(dVar4, continuation, 4), this);
                return A4 == aVar11 ? aVar11 : A4;
            case 11:
                lf.a aVar12 = lf.a.f20034a;
                int i23 = this.f25087c;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                s7.u uVar5 = this.f25088d.f25112c;
                this.f25087c = 1;
                uVar5.getClass();
                s7.u.g().getClass();
                y8.d dVar5 = new y8.d();
                lg.e eVar7 = eg.m0.f9201a;
                Object A5 = eg.c0.A(lg.d.f20063c, new eb.o(dVar5, continuation, 6), this);
                return A5 == aVar12 ? aVar12 : A5;
            case 12:
                lf.a aVar13 = lf.a.f20034a;
                int i24 = this.f25087c;
                if (i24 == 0) {
                    h8.b.B(obj);
                    this.f25088d.getClass();
                    ic.h0 h0Var = (ic.h0) i.a().q.getValue();
                    this.f25087c = 1;
                    if (i.i(h0Var, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 13:
                lf.a aVar14 = lf.a.f20034a;
                int i25 = this.f25087c;
                if (i25 == 0) {
                    h8.b.B(obj);
                    this.f25088d.getClass();
                    ic.h0 h0Var2 = (ic.h0) i.a().f21714o.getValue();
                    this.f25087c = 1;
                    if (i.i(h0Var2, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 14:
                lf.a aVar15 = lf.a.f20034a;
                int i26 = this.f25087c;
                if (i26 == 0) {
                    h8.b.B(obj);
                    ic.h0 h0Var3 = (ic.h0) i.a().f21716r.getValue();
                    this.f25087c = 1;
                    if (i.i(h0Var3, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar16 = lf.a.f20034a;
                int i27 = this.f25087c;
                if (i27 == 0) {
                    h8.b.B(obj);
                    this.f25088d.getClass();
                    ic.h0 h0Var4 = (ic.h0) i.a().f21715p.getValue();
                    this.f25087c = 1;
                    if (i.i(h0Var4, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
