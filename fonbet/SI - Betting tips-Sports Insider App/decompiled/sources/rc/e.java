package rc;

import androidx.appcompat.widget.c1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22398b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f22399c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f22401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22402f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i5, int i10, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f22400d = i5;
        this.f22402f = i10;
        this.f22401e = gVar;
    }

    public static final String c(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? c1.i(i5, "OFF ") : "SSL" : "OFF_LINE" : "SSLHandshake" : "ON" : "OFF";
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22398b) {
            case 0:
                return new e(this.f22400d, this.f22402f, this.f22401e, continuation);
            default:
                return new e(this.f22400d, this.f22401e, this.f22402f, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22398b) {
        }
        return ((e) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f22398b;
        int i10 = this.f22402f;
        g gVar = this.f22401e;
        int i11 = this.f22400d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i12 = this.f22399c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    JSONObject put = new JSONObject().put("PingTest", new JSONObject().put("google", "1.2.44.123").put("WithoutCA", c(i11)).put("WithCA", c(i10)).put("Version", 123));
                    Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                    this.f22399c = 1;
                    if (gVar.d(put, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f22399c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    String str = i11 == 3 ? "express" : "premium";
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", i10);
                    jSONObject.put("type_prediction", str);
                    Unit unit = Unit.f19194a;
                    this.f22399c = 1;
                    if (gVar.e("purchased_bet_bonus", jSONObject, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i5, g gVar, int i10, Continuation continuation) {
        super(2, continuation);
        this.f22400d = i5;
        this.f22401e = gVar;
        this.f22402f = i10;
    }
}
