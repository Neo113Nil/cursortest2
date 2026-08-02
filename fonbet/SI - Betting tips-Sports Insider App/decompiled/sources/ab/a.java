package ab;

import eg.z;
import f3.x;
import k2.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f117b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(x xVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f117b = i5;
        this.f118c = xVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f117b) {
            case 0:
                return new a(this.f118c, continuation, 0);
            case 1:
                return new a(this.f118c, continuation, 1);
            default:
                return new a(this.f118c, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f117b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f117b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return (String) x.n0(x.e0().f23426a.f23832a, true, false, new d0(23));
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                x.e0().c(null);
                return Unit.f19194a;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return (String) x.n0(x.e0().f23426a.f23832a, true, false, new d0(26));
        }
    }
}
