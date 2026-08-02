package le;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20003b;

    /* renamed from: c, reason: collision with root package name */
    public int f20004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2 f20005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(int i5, f2 f2Var, Continuation continuation) {
        super(2, continuation);
        this.f20003b = 11;
        this.f20004c = i5;
        this.f20005d = f2Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20003b) {
            case 0:
                return new y1(this.f20005d, continuation, 0);
            case 1:
                return new y1(this.f20005d, continuation, 1);
            case 2:
                return new y1(this.f20005d, continuation, 2);
            case 3:
                y1 y1Var = new y1(this.f20005d, continuation, 3);
                y1Var.f20004c = ((Number) obj).intValue();
                return y1Var;
            case 4:
                return new y1(this.f20005d, continuation, 4);
            case 5:
                return new y1(this.f20005d, continuation, 5);
            case 6:
                return new y1(this.f20005d, continuation, 6);
            case 7:
                return new y1(this.f20005d, continuation, 7);
            case 8:
                return new y1(this.f20005d, continuation, 8);
            case 9:
                return new y1(this.f20005d, continuation, 9);
            case 10:
                return new y1(this.f20005d, continuation, 10);
            default:
                return new y1(this.f20004c, this.f20005d, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20003b) {
            case 3:
                break;
            case 4:
                ((y1) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
                break;
            case 5:
                ((y1) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
                break;
        }
        return ((y1) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f20003b;
        Object[] objArr = 0;
        Continuation continuation = null;
        f2 f2Var = this.f20005d;
        int i10 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f20004c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    wc.j0 j0Var = f2Var.f19769f;
                    int i12 = f2Var.j;
                    this.f20004c = 1;
                    obj = j0Var.o(i12, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                int intValue = ((Number) obj).intValue();
                if (intValue == 200 || intValue == 201 || intValue == 204) {
                    f2.s(f2Var, f2Var.j);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f20004c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    wc.j0 j0Var2 = f2Var.f19769f;
                    this.f20004c = 1;
                    if (j0Var2.h(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i14 = this.f20004c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    wc.j0 j0Var3 = f2Var.f19769f;
                    this.f20004c = 1;
                    if (j0Var3.h(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 3:
                int i15 = this.f20004c;
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                AtomicBoolean atomicBoolean = f2Var.f19771h;
                atomicBoolean.set(i15 > 0);
                f2Var.f19786y.h(Boolean.valueOf(atomicBoolean.get()));
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i16 = this.f20004c;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                f2Var.f19769f.getClass();
                hg.t0 t0Var = wc.d0.b().f21706f;
                c2 c2Var = new c2(f2Var, 0);
                this.f20004c = 1;
                t0Var.a(c2Var, this);
                return aVar5;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i17 = this.f20004c;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                f2Var.f19769f.getClass();
                hg.t0 t0Var2 = wc.d0.b().f21707g;
                c2 c2Var2 = new c2(f2Var, 1);
                this.f20004c = 1;
                t0Var2.a(c2Var2, this);
                return aVar6;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                int i18 = this.f20004c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    f2Var.f19769f.getClass();
                    hg.d1 d1Var = wc.d0.b().f21709i;
                    c1.a1 a1Var = new c1.a1(2, continuation, 6);
                    this.f20004c = 1;
                    if (hg.u0.g(d1Var, a1Var, this) == aVar7) {
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
                int i19 = this.f20004c;
                if (i19 == 0) {
                    h8.b.B(obj);
                    f2Var.f19769f.getClass();
                    hg.d1 d1Var2 = da.r.f8346d;
                    e2 e2Var = new e2(f2Var, continuation, objArr == true ? 1 : 0);
                    this.f20004c = 1;
                    if (hg.u0.g(d1Var2, e2Var, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 8:
                lf.a aVar9 = lf.a.f20034a;
                int i20 = this.f20004c;
                if (i20 == 0) {
                    h8.b.B(obj);
                    f2Var.f19769f.getClass();
                    hg.d1 d1Var3 = da.r.f8348f;
                    e2 e2Var2 = new e2(f2Var, continuation, i10);
                    this.f20004c = 1;
                    if (hg.u0.g(d1Var3, e2Var2, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 9:
                lf.a aVar10 = lf.a.f20034a;
                int i21 = this.f20004c;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                wc.j0 j0Var4 = f2Var.f19769f;
                this.f20004c = 1;
                Object d10 = j0Var4.d(this);
                return d10 == aVar10 ? aVar10 : d10;
            case 10:
                lf.a aVar11 = lf.a.f20034a;
                int i22 = this.f20004c;
                if (i22 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = eg.m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    y1 y1Var = new y1(f2Var, continuation, 9);
                    this.f20004c = 1;
                    obj = eg.c0.A(dVar, y1Var, this);
                    if (obj == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                f2Var.f19775m.h(bool);
                return Unit.f19194a;
            default:
                lf.a aVar12 = lf.a.f20034a;
                h8.b.B(obj);
                r1 r1Var = new r1();
                r1Var.f19927a.put("id", Integer.valueOf(this.f20004c));
                Intrinsics.checkNotNullExpressionValue(r1Var, "setId(...)");
                f2Var.j(r1Var);
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(f2 f2Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20003b = i5;
        this.f20005d = f2Var;
    }
}
