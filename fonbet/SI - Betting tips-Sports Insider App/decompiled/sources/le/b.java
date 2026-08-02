package le;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19700b;

    /* renamed from: c, reason: collision with root package name */
    public int f19701c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f19702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(h hVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19700b = i5;
        this.f19702d = hVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19700b) {
            case 0:
                return new b(this.f19702d, continuation, 0);
            case 1:
                return new b(this.f19702d, continuation, 1);
            case 2:
                return new b(this.f19702d, continuation, 2);
            case 3:
                return new b(this.f19702d, continuation, 3);
            case 4:
                return new b(this.f19702d, continuation, 4);
            default:
                return new b(this.f19702d, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19700b) {
            case 1:
                ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
                break;
            case 2:
                ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
                break;
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19700b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f19701c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    wc.e eVar = this.f19702d.f19797f;
                    this.f19701c = 1;
                    if (eVar.h(this) == aVar) {
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
                int i10 = this.f19701c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                h hVar = this.f19702d;
                hVar.f19797f.getClass();
                hg.t0 t0Var = wc.d0.b().f21706f;
                f fVar = new f(hVar, 0);
                this.f19701c = 1;
                t0Var.a(fVar, this);
                return aVar2;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f19701c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                h hVar2 = this.f19702d;
                hVar2.f19797f.getClass();
                hg.t0 t0Var2 = wc.d0.b().f21707g;
                f fVar2 = new f(hVar2, 1);
                this.f19701c = 1;
                t0Var2.a(fVar2, this);
                return aVar3;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i12 = this.f19701c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    h hVar3 = this.f19702d;
                    hVar3.f19797f.getClass();
                    hg.d1 d1Var = da.r.f8346d;
                    g gVar = new g(hVar3, null, 0);
                    this.f19701c = 1;
                    if (hg.u0.g(d1Var, gVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i13 = this.f19701c;
                h hVar4 = this.f19702d;
                try {
                    if (i13 == 0) {
                        h8.b.B(obj);
                        this.f19701c = 1;
                        obj = h.p(hVar4, this);
                        if (obj == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    y1.c0 c0Var = (y1.c0) obj;
                    if (c0Var != null) {
                        hVar4.j(c0Var);
                    }
                } catch (Exception unused) {
                }
                return Unit.f19194a;
            default:
                h hVar5 = this.f19702d;
                wc.e eVar2 = hVar5.f19797f;
                lf.a aVar6 = lf.a.f20034a;
                int i14 = this.f19701c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    this.f19701c = 1;
                    obj = eVar2.l(this);
                    if (obj == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        hVar5.n();
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                int intValue = ((Number) obj).intValue();
                if (intValue == 200 || intValue == 204) {
                    int i15 = hVar5.f19799h;
                    this.f19701c = 2;
                    eVar2.getClass();
                    if (wc.d0.k(i15, this) == aVar6) {
                        return aVar6;
                    }
                    hVar5.n();
                }
                return Unit.f19194a;
        }
    }
}
