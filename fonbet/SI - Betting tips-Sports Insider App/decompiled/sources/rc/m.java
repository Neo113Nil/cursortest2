package rc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f22425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(r rVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22424b = i5;
        this.f22425c = rVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22424b) {
            case 0:
                return new m(this.f22425c, continuation, 0);
            case 1:
                return new m(this.f22425c, continuation, 1);
            case 2:
                return new m(this.f22425c, continuation, 2);
            default:
                return new m(this.f22425c, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22424b) {
        }
        return ((m) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22424b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                fa.a d10 = r.d();
                d10.getClass();
                Intrinsics.checkNotNullParameter("alternativePaymentPriority", "key");
                return Boolean.valueOf(d10.f9542b.getBoolean("alternativePaymentPriority", false));
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                fa.a d11 = r.d();
                d11.getClass();
                Intrinsics.checkNotNullParameter("ExpiredForecastsOrder", "key");
                return new Long(d11.f9542b.getLong("ExpiredForecastsOrder", 0L));
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return r.d().a("keyIdLogRocket");
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                fa.a d12 = r.d();
                d12.getClass();
                Intrinsics.checkNotNullParameter("push_on_channel", "key");
                return Boolean.valueOf(d12.f9542b.getBoolean("push_on_channel", true));
        }
    }
}
