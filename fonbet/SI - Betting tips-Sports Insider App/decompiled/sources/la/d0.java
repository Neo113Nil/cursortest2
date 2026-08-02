package la;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19429b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f19430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f19432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f19433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f19434g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f19435h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f19436i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i5, long j, String str, String str2, String str3, String str4, Continuation continuation, g0 g0Var) {
        super(2, continuation);
        this.j = g0Var;
        this.f19432e = str;
        this.f19431d = i5;
        this.f19433f = str2;
        this.f19435h = j;
        this.f19434g = str3;
        this.f19436i = str4;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19429b) {
            case 0:
                g0 g0Var = (g0) this.j;
                return new d0(this.f19431d, this.f19435h, this.f19432e, this.f19433f, this.f19434g, this.f19436i, continuation, g0Var);
            default:
                return new d0((rc.g) this.j, this.f19431d, this.f19432e, this.f19433f, this.f19434g, this.f19435h, this.f19436i, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19429b) {
        }
        return ((d0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19429b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f19430c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                na.b bVar = new na.b();
                String str = this.f19432e;
                int i10 = this.f19431d;
                String str2 = this.f19433f;
                long j = this.f19435h;
                String str3 = this.f19434g;
                String str4 = this.f19436i;
                String str5 = gc.d.f9945a;
                String c2 = d2.i.c();
                String d10 = d2.i.d();
                this.f19430c = 1;
                Object s02 = bVar.s0(str, i10, str2, j, str3, str4, c2, d10, this);
                return s02 == aVar ? aVar : s02;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f19430c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    rc.g gVar = (rc.g) this.j;
                    JSONObject jSONObject = new JSONObject();
                    int i12 = this.f19431d;
                    String str6 = this.f19432e;
                    String str7 = this.f19433f;
                    String str8 = this.f19434g;
                    long j6 = this.f19435h;
                    String str9 = this.f19436i;
                    jSONObject.put("forecastId", i12);
                    jSONObject.put("purchaseToken", str6);
                    jSONObject.put("productId", str7);
                    jSONObject.put("orderId", str8);
                    jSONObject.put("purchaseTime", j6);
                    jSONObject.put("purchaseDate", io.sentry.config.a.u(j6));
                    jSONObject.put("currency", str9);
                    Unit unit = Unit.f19194a;
                    this.f19430c = 1;
                    if (gVar.e("purchased_bet", jSONObject, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(rc.g gVar, int i5, String str, String str2, String str3, long j, String str4, Continuation continuation) {
        super(2, continuation);
        this.j = gVar;
        this.f19431d = i5;
        this.f19432e = str;
        this.f19433f = str2;
        this.f19434g = str3;
        this.f19435h = j;
        this.f19436i = str4;
    }
}
