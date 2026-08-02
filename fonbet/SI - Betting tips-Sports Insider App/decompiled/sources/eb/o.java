package eb;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y8.d f8835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(y8.d dVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f8834b = i5;
        this.f8835c = dVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f8834b) {
            case 0:
                return new o(this.f8835c, continuation, 0);
            case 1:
                return new o(this.f8835c, continuation, 1);
            case 2:
                return new o(this.f8835c, continuation, 2);
            case 3:
                return new o(this.f8835c, continuation, 3);
            case 4:
                return new o(this.f8835c, continuation, 4);
            case 5:
                return new o(this.f8835c, continuation, 5);
            default:
                return new o(this.f8835c, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f8834b) {
        }
        return ((o) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f8834b;
        y8.d dVar = this.f8835c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return y8.d.d(dVar).f8830a.b(5);
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return y8.d.d(dVar).f8830a.b(2);
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return y8.d.d(dVar).f8830a.b(4);
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                return y8.d.d(dVar).f8830a.b(7);
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                return y8.d.d(dVar).f8830a.b(6);
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                return y8.d.d(dVar).f8830a.b(1);
            default:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                return y8.d.d(dVar).f8830a.b(3);
        }
    }
}
