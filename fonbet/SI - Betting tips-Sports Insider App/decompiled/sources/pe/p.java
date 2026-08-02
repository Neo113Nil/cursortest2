package pe;

import eg.c0;
import eg.m0;
import eg.z;
import id.w;
import id.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21852b;

    /* renamed from: c, reason: collision with root package name */
    public int f21853c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f21855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(boolean z5, s sVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21852b = i5;
        this.f21854d = z5;
        this.f21855e = sVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21852b) {
            case 0:
                return new p(this.f21854d, this.f21855e, continuation, 0);
            default:
                return new p(this.f21854d, this.f21855e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21852b) {
        }
        return ((p) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Continuation continuation = null;
        int i5 = 2;
        switch (this.f21852b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f21853c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    if (s.G || !this.f21854d) {
                        return Unit.f19194a;
                    }
                    x xVar = this.f21855e.f21863b;
                    this.f21853c = 1;
                    xVar.getClass();
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new androidx.lifecycle.b(xVar, continuation, 7), this);
                    if (obj == aVar) {
                        return aVar;
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
                if (((Boolean) obj).booleanValue()) {
                    mc.a aVar2 = s.F;
                    s.G = true;
                }
                this.f21853c = 2;
                if (c0.j(500L, this) == aVar) {
                    return aVar;
                }
                return Unit.f19194a;
            default:
                boolean z5 = this.f21854d;
                Object obj2 = lf.a.f20034a;
                int i11 = this.f21853c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    if (z5) {
                        s7.t tVar = new s7.t(15);
                        this.f21853c = 1;
                        lg.e eVar2 = m0.f9201a;
                        if (c0.A(lg.d.f20063c, new q4.r(tVar, continuation, i5), this) == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                s sVar = this.f21855e;
                x xVar2 = sVar.f21863b;
                int i12 = sVar.f21874n.get();
                this.f21853c = 2;
                xVar2.getClass();
                lg.e eVar3 = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new w(z5, xVar2, i12, (Continuation) null), this);
                if (A != obj2) {
                    A = Unit.f19194a;
                }
                if (A == obj2) {
                    return obj2;
                }
                return Unit.f19194a;
        }
    }
}
