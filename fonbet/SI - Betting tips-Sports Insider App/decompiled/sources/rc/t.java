package rc;

import eg.c0;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22442b;

    /* renamed from: c, reason: collision with root package name */
    public int f22443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m7.b f22444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(m7.b bVar, boolean z5, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22442b = i5;
        this.f22444d = bVar;
        this.f22445e = z5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22442b) {
            case 0:
                return new t(this.f22444d, this.f22445e, continuation, 0);
            case 1:
                return new t(this.f22444d, this.f22445e, continuation, 1);
            default:
                return new t(this.f22444d, this.f22445e, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22442b) {
        }
        return ((t) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f22442b;
        Continuation continuation = null;
        boolean z5 = this.f22445e;
        int i10 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f22443c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    r rVar = new r();
                    this.f22443c = 1;
                    if (rVar.c(z5, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f22443c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                r rVar2 = new r();
                this.f22443c = 1;
                lg.e eVar = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new je.a(rVar2, z5, continuation, 4), this);
                return A == aVar2 ? aVar2 : A;
            default:
                Object obj2 = lf.a.f20034a;
                int i13 = this.f22443c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    r rVar3 = new r();
                    this.f22443c = 1;
                    lg.e eVar2 = m0.f9201a;
                    Object A2 = c0.A(lg.d.f20063c, new l(rVar3, z5, continuation, i10), this);
                    if (A2 != obj2) {
                        A2 = Unit.f19194a;
                    }
                    if (A2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                s7.t tVar = new s7.t(16);
                this.f22443c = 2;
                e3.o oVar = e3.o.f8552b;
                lg.e eVar3 = m0.f9201a;
                Object A3 = c0.A(lg.d.f20063c, new me.y(tVar, oVar, continuation, 22), this);
                if (A3 != obj2) {
                    A3 = Unit.f19194a;
                }
                if (A3 != obj2) {
                    A3 = Unit.f19194a;
                }
                if (A3 == obj2) {
                    return obj2;
                }
                return Unit.f19194a;
        }
    }
}
