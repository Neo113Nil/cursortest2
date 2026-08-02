package cd;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3783b;

    /* renamed from: c, reason: collision with root package name */
    public int f3784c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f3785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f3786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Integer num, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3783b = i5;
        this.f3785d = nVar;
        this.f3786e = num;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3783b) {
            case 0:
                return new l(this.f3785d, this.f3786e, continuation, 0);
            default:
                return new l(this.f3785d, this.f3786e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3783b) {
        }
        return ((l) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.f3783b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f3784c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    Integer num = this.f3786e;
                    if (num != null) {
                        jSONObject = new JSONObject().put("type", num.intValue());
                    } else {
                        jSONObject = null;
                    }
                    this.f3784c = 1;
                    if (this.f3785d.e("open_push_click_close_sale", jSONObject, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f3784c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    Integer num2 = this.f3786e;
                    if (num2 != null) {
                        jSONObject2 = new JSONObject().put("type", num2.intValue());
                    } else {
                        jSONObject2 = null;
                    }
                    this.f3784c = 1;
                    if (this.f3785d.e("open_push_click_prediction", jSONObject2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
