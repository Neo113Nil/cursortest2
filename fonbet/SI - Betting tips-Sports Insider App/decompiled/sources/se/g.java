package se;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f23532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f23533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic.a f23534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i5, ic.a aVar, ic.a aVar2, Continuation continuation, p pVar) {
        super(2, continuation);
        this.f23531b = i5;
        this.f23532c = pVar;
        this.f23533d = aVar;
        this.f23534e = aVar2;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23531b) {
            case 0:
                return new g(0, this.f23533d, this.f23534e, continuation, this.f23532c);
            case 1:
                return new g(1, this.f23533d, this.f23534e, continuation, this.f23532c);
            case 2:
                return new g(2, this.f23533d, this.f23534e, continuation, this.f23532c);
            case 3:
                return new g(3, this.f23533d, this.f23534e, continuation, this.f23532c);
            default:
                return new g(4, this.f23533d, this.f23534e, continuation, this.f23532c);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23531b) {
        }
        return ((g) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f23531b;
        ic.a aVar = this.f23534e;
        ic.a aVar2 = this.f23533d;
        p pVar = this.f23532c;
        switch (i5) {
            case 0:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                pVar.f23592t = aVar2;
                pVar.f23593u = aVar;
                break;
            case 1:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                pVar.f23590r = aVar2;
                pVar.f23591s = aVar;
                break;
            case 2:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                pVar.f23587n = aVar2;
                pVar.f23588o = aVar;
                break;
            case 3:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                pVar.f23589p = aVar2;
                pVar.q = aVar;
                break;
            default:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                pVar.f23585l = aVar2;
                pVar.f23586m = aVar;
                break;
        }
        return Unit.f19194a;
    }
}
