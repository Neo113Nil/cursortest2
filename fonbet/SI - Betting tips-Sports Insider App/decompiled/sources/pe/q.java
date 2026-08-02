package pe;

import eg.c0;
import eg.m0;
import eg.z;
import id.x;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import me.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21856b = 1;

    /* renamed from: c, reason: collision with root package name */
    public mc.a f21857c;

    /* renamed from: d, reason: collision with root package name */
    public int f21858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f21859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, Continuation continuation) {
        super(2, continuation);
        this.f21859e = sVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21856b) {
            case 0:
                return new q(this.f21859e, this.f21857c, continuation);
            default:
                return new q(this.f21859e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21856b) {
        }
        return ((q) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        mc.a aVar;
        int i5 = this.f21856b;
        s sVar = this.f21859e;
        switch (i5) {
            case 0:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f21858d;
                Continuation continuation = null;
                if (i10 == 0) {
                    h8.b.B(obj);
                    x xVar = sVar.f21863b;
                    int i11 = sVar.f21874n.get();
                    mc.a aVar3 = this.f21857c;
                    this.f21858d = 1;
                    xVar.getClass();
                    obj = c0.A(m0.f9201a, new bd.i(xVar, i11, aVar3, continuation, 4), this);
                    if (obj == aVar2) {
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
                this.f21858d = 2;
                mc.a aVar4 = s.F;
                lg.e eVar = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new y(sVar, (List) obj, null, 14), this);
                if (A != aVar2) {
                    A = Unit.f19194a;
                }
                if (A == aVar2) {
                    return aVar2;
                }
                return Unit.f19194a;
            default:
                lf.a aVar5 = lf.a.f20034a;
                int i12 = this.f21858d;
                if (i12 == 0) {
                    h8.b.B(obj);
                    mc.a aVar6 = s.F;
                    x xVar2 = sVar.f21863b;
                    this.f21857c = aVar6;
                    this.f21858d = 1;
                    xVar2.getClass();
                    lg.e eVar2 = m0.f9201a;
                    Object A2 = c0.A(lg.d.f20063c, new bd.b(2, null, 3), this);
                    if (A2 == aVar5) {
                        return aVar5;
                    }
                    aVar = aVar6;
                    obj = A2;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.f21857c;
                    h8.b.B(obj);
                }
                mc.a aVar7 = (mc.a) obj;
                s.F = aVar7;
                if (aVar != aVar7) {
                    sVar.g(aVar7);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, mc.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f21859e = sVar;
        this.f21857c = aVar;
    }
}
