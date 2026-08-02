package pd;

import androidx.lifecycle.d1;
import com.sports.insider.MyApp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21756b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f21757c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.sports.insider.ui.activities.a f21758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.appupdate.a f21759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.sports.insider.ui.activities.a aVar, com.google.android.play.core.appupdate.a aVar2, int i5, int i10, Continuation continuation) {
        super(2, continuation);
        this.f21758d = aVar;
        this.f21759e = aVar2;
        this.f21757c = i5;
        this.f21760f = i10;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21756b) {
            case 0:
                return new e0(this.f21758d, this.f21759e, this.f21757c, this.f21760f, continuation);
            default:
                return new e0(this.f21758d, this.f21759e, this.f21760f, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21756b) {
        }
        return ((e0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f21756b;
        Continuation continuation = null;
        com.google.android.play.core.appupdate.a aVar = this.f21759e;
        switch (i5) {
            case 0:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                Integer num = aVar.f5990c;
                int intValue = num != null ? num.intValue() : -1;
                int i10 = this.f21757c;
                int i11 = com.sports.insider.ui.activities.a.G;
                cd.d dVar = new cd.d();
                jg.d dVar2 = MyApp.f6830c;
                eg.c0.t(dVar2, rc.b0.b(), null, new cd.u(dVar, i10, intValue, this.f21760f, null), 2);
                if (intValue > 60) {
                    io.sentry.util.network.b bVar = new io.sentry.util.network.b(7);
                    eg.c0.t(dVar2, (eg.y) bVar.f17176b, null, new ad.a(bVar, continuation, 18), 2);
                }
                return Unit.f19194a;
            default:
                Object obj2 = lf.a.f20034a;
                int i12 = this.f21757c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    androidx.lifecycle.x xVar = androidx.lifecycle.x.f2256d;
                    int i13 = this.f21760f;
                    com.sports.insider.ui.activities.a aVar3 = this.f21758d;
                    oe.j jVar = new oe.j(aVar3, aVar, i13, (Continuation) null);
                    this.f21757c = 1;
                    Object j = d1.j(aVar3.f3250a, xVar, jVar, this);
                    if (j != obj2) {
                        j = Unit.f19194a;
                    }
                    if (j == obj2) {
                        return obj2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.sports.insider.ui.activities.a aVar, com.google.android.play.core.appupdate.a aVar2, int i5, Continuation continuation) {
        super(2, continuation);
        this.f21758d = aVar;
        this.f21759e = aVar2;
        this.f21760f = i5;
    }
}
