package rc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f22422c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(r rVar, boolean z5, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22421b = i5;
        this.f22422c = rVar;
        this.f22423d = z5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22421b) {
            case 0:
                return new l(this.f22422c, this.f22423d, continuation, 0);
            default:
                return new l(this.f22422c, this.f22423d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22421b) {
        }
        return ((l) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f22421b;
        boolean z5 = this.f22423d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                r.d().b("alternativePaymentPriority", z5);
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                r.d().b("push_on_channel", z5);
                new cd.b(6).n("is_push_enabled", String.valueOf(z5 ? 1 : 0));
                break;
        }
        return Unit.f19194a;
    }
}
