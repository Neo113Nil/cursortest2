package rc;

import eg.c0;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22439b;

    /* renamed from: c, reason: collision with root package name */
    public int f22440c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m7.b f22441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(m7.b bVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22439b = i5;
        this.f22441d = bVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22439b) {
            case 0:
                return new s(this.f22441d, continuation, 0);
            case 1:
                return new s(this.f22441d, continuation, 1);
            default:
                return new s(this.f22441d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22439b) {
        }
        return ((s) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22439b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f22440c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                r rVar = new r();
                this.f22440c = 1;
                Object a7 = rVar.a(this);
                return a7 == aVar ? aVar : a7;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f22440c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                r rVar2 = new r();
                this.f22440c = 1;
                Object b10 = rVar2.b(this);
                return b10 == aVar2 ? aVar2 : b10;
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f22440c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                r rVar3 = new r();
                this.f22440c = 1;
                lg.e eVar = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new m(rVar3, null, 3), this);
                return A == aVar3 ? aVar3 : A;
        }
    }
}
