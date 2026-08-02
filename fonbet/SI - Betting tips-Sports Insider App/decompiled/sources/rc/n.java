package rc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f22427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r rVar, long j, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22426b = i5;
        this.f22427c = rVar;
        this.f22428d = j;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22426b) {
            case 0:
                return new n(this.f22427c, this.f22428d, continuation, 0);
            default:
                return new n(this.f22427c, this.f22428d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22426b) {
        }
        return ((n) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f22426b;
        long j = this.f22428d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                r.d().c(j, "ExpiredForecastsOrder");
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                r.d().c(j, "firstStart");
                break;
        }
        return Unit.f19194a;
    }
}
