package cb;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;
import y8.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f3721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3720b = i5;
        this.f3721c = dVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3720b) {
            case 0:
                return new a(this.f3721c, continuation, 0);
            case 1:
                return new a(this.f3721c, continuation, 1);
            case 2:
                return new a(this.f3721c, continuation, 2);
            case 3:
                return new a(this.f3721c, continuation, 3);
            default:
                return new a(this.f3721c, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3720b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3720b;
        d dVar = this.f3721c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    return d.a(dVar).a("alternativePayment");
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    return d.a(dVar).a("forecastsOrder");
                } catch (Exception unused2) {
                    return null;
                }
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    return d.a(dVar).a("lastUpdateEnSportCategory");
                } catch (Exception unused3) {
                    return null;
                }
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    return d.a(dVar).a("lastUpdateRuSportCategory");
                } catch (Exception unused4) {
                    return null;
                }
            default:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    return d.a(dVar).a("needPlatformAuth");
                } catch (Exception unused5) {
                    return null;
                }
        }
    }
}
