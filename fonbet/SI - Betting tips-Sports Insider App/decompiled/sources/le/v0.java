package le;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19970b;

    /* renamed from: c, reason: collision with root package name */
    public int f19971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f19972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i5, d1 d1Var, Continuation continuation) {
        super(2, continuation);
        this.f19970b = 9;
        this.f19971c = i5;
        this.f19972d = d1Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19970b) {
            case 0:
                return new v0(this.f19972d, continuation, 0);
            case 1:
                return new v0(this.f19972d, continuation, 1);
            case 2:
                return new v0(this.f19972d, continuation, 2);
            case 3:
                v0 v0Var = new v0(this.f19972d, continuation, 3);
                v0Var.f19971c = ((Number) obj).intValue();
                return v0Var;
            case 4:
                return new v0(this.f19972d, continuation, 4);
            case 5:
                return new v0(this.f19972d, continuation, 5);
            case 6:
                return new v0(this.f19972d, continuation, 6);
            case 7:
                return new v0(this.f19972d, continuation, 7);
            case 8:
                return new v0(this.f19972d, continuation, 8);
            default:
                return new v0(this.f19971c, this.f19972d, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19970b) {
            case 3:
                break;
            case 4:
                ((v0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
                break;
            case 5:
                ((v0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
                break;
        }
        return ((v0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19970b;
        Object[] objArr = 0;
        Continuation continuation = null;
        d1 d1Var = this.f19972d;
        int i10 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f19971c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    wc.v vVar = d1Var.f19730f;
                    int i12 = d1Var.j;
                    this.f19971c = 1;
                    obj = vVar.o(i12, this);
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
                    d1.s(d1Var, d1Var.j);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f19971c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    wc.v vVar2 = d1Var.f19730f;
                    this.f19971c = 1;
                    if (vVar2.h(this) == aVar2) {
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
                int i14 = this.f19971c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    wc.v vVar3 = d1Var.f19730f;
                    this.f19971c = 1;
                    if (vVar3.h(this) == aVar3) {
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
                int i15 = this.f19971c;
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                AtomicBoolean atomicBoolean = d1Var.f19732h;
                atomicBoolean.set(i15 > 0);
                d1Var.f19746x.h(Boolean.valueOf(atomicBoolean.get()));
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i16 = this.f19971c;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                d1Var.f19730f.getClass();
                hg.t0 t0Var = wc.d0.b().f21706f;
                z0 z0Var = new z0(d1Var, 0);
                this.f19971c = 1;
                t0Var.a(z0Var, this);
                return aVar5;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i17 = this.f19971c;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                d1Var.f19730f.getClass();
                hg.t0 t0Var2 = wc.d0.b().f21707g;
                z0 z0Var2 = new z0(d1Var, 1);
                this.f19971c = 1;
                t0Var2.a(z0Var2, this);
                return aVar6;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                int i18 = this.f19971c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    d1Var.f19730f.getClass();
                    hg.d1 d1Var2 = wc.d0.b().j;
                    c1.a1 a1Var = new c1.a1(2, continuation, 5);
                    this.f19971c = 1;
                    if (hg.u0.g(d1Var2, a1Var, this) == aVar7) {
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
                int i19 = this.f19971c;
                if (i19 == 0) {
                    h8.b.B(obj);
                    d1Var.f19730f.getClass();
                    hg.d1 d1Var3 = da.r.f8346d;
                    b1 b1Var = new b1(d1Var, continuation, objArr == true ? 1 : 0);
                    this.f19971c = 1;
                    if (hg.u0.g(d1Var3, b1Var, this) == aVar8) {
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
                int i20 = this.f19971c;
                if (i20 == 0) {
                    h8.b.B(obj);
                    d1Var.f19730f.getClass();
                    hg.d1 d1Var4 = da.r.f8347e;
                    b1 b1Var2 = new b1(d1Var, continuation, i10);
                    this.f19971c = 1;
                    if (hg.u0.g(d1Var4, b1Var2, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar10 = lf.a.f20034a;
                h8.b.B(obj);
                o0 o0Var = new o0();
                o0Var.f19896a.put("id", Integer.valueOf(this.f19971c));
                Intrinsics.checkNotNullExpressionValue(o0Var, "setId(...)");
                d1Var.j(o0Var);
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(d1 d1Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19970b = i5;
        this.f19972d = d1Var;
    }
}
