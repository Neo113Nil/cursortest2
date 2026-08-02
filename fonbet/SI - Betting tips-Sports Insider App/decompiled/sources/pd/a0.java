package pd;

import com.sports.insider.MyApp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21724b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.sports.insider.ui.activities.a f21725c;

    /* renamed from: d, reason: collision with root package name */
    public int f21726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i5, com.sports.insider.ui.activities.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f21725c = aVar;
        this.f21727e = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21724b) {
            case 0:
                return new a0(this.f21727e, this.f21725c, continuation);
            default:
                return new a0(this.f21725c, this.f21726d, this.f21727e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21724b) {
        }
        return ((a0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f21724b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f21726d;
                if (i5 == 0) {
                    h8.b.B(obj);
                    int i10 = com.sports.insider.ui.activities.a.G;
                    io.sentry.util.network.b bVar = new io.sentry.util.network.b(7);
                    this.f21726d = 1;
                    obj = bVar.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = com.sports.insider.ui.activities.a.G;
                cd.d dVar = new cd.d();
                Integer num = new Integer(booleanValue ? 1 : 0);
                eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new bd.i(dVar, this.f21727e, num, (Continuation) null, 2), 2);
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                int i12 = com.sports.insider.ui.activities.a.G;
                eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.v(new cd.d(), this.f21727e, this.f21726d, null), 2);
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.sports.insider.ui.activities.a aVar, int i5, int i10, Continuation continuation) {
        super(2, continuation);
        this.f21725c = aVar;
        this.f21726d = i5;
        this.f21727e = i10;
    }
}
