package sd;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f23486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23485b = i5;
        this.f23486c = lVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23485b) {
            case 0:
                return new j(this.f23486c, continuation, 0);
            case 1:
                return new j(this.f23486c, continuation, 1);
            case 2:
                return new j(this.f23486c, continuation, 2);
            case 3:
                return new j(this.f23486c, continuation, 3);
            case 4:
                return new j(this.f23486c, continuation, 4);
            case 5:
                return new j(this.f23486c, continuation, 5);
            default:
                return new j(this.f23486c, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23485b) {
        }
        return ((j) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f23485b;
        l lVar = this.f23486c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                l.a(lVar, n.q);
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                l.a(lVar, n.f23510s);
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                l.a(lVar, n.f23506n);
                break;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                l.a(lVar, n.f23508p);
                break;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                l.a(lVar, n.f23509r);
                break;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                l.a(lVar, n.f23507o);
                break;
            default:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                l.a(lVar, n.f23496c);
                break;
        }
        return Unit.f19194a;
    }
}
