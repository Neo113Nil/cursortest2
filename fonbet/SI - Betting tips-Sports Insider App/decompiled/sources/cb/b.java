package cb;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;
import y8.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f3723c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f3724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, Integer num, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3722b = i5;
        this.f3723c = dVar;
        this.f3724d = num;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3722b) {
            case 0:
                return new b(this.f3723c, this.f3724d, continuation, 0);
            case 1:
                return new b(this.f3723c, this.f3724d, continuation, 1);
            case 2:
                return new b(this.f3723c, this.f3724d, continuation, 2);
            case 3:
                return new b(this.f3723c, this.f3724d, continuation, 3);
            case 4:
                return new b(this.f3723c, this.f3724d, continuation, 4);
            default:
                return new b(this.f3723c, this.f3724d, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3722b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        int i5 = this.f3722b;
        Integer num2 = this.f3724d;
        d dVar = this.f3723c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    num = d.a(dVar).a("alternativePayment");
                } catch (Exception unused) {
                    num = null;
                }
                if (num != null && num.intValue() == 2 && num2 != null) {
                    break;
                } else {
                    try {
                        d.a(dVar).b(num2, "alternativePayment");
                    } catch (Exception unused2) {
                    }
                    break;
                }
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    d.a(dVar).b(num2, "CPBEnableParams");
                } catch (Exception unused3) {
                }
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    d.a(dVar).b(num2, "forecastsOrder");
                } catch (Exception unused4) {
                }
                break;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    d.a(dVar).b(num2, "lastUpdateEnSportCategory");
                } catch (Exception unused5) {
                }
                break;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    d.a(dVar).b(num2, "lastUpdateRuSportCategory");
                } catch (Exception unused6) {
                }
                break;
            default:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    d.a(dVar).b(num2, "needPlatformAuth");
                } catch (Exception unused7) {
                }
                break;
        }
        return Unit.f19194a;
    }
}
