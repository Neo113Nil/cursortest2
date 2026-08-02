package cd;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3808b;

    /* renamed from: c, reason: collision with root package name */
    public int f3809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f3810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(d dVar, String str, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3808b = i5;
        this.f3810d = dVar;
        this.f3811e = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3808b) {
            case 0:
                return new t(this.f3810d, this.f3811e, continuation, 0);
            default:
                return new t(this.f3810d, this.f3811e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3808b) {
        }
        return ((t) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3808b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f3809c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    JSONObject put = new JSONObject().put("funcName", new JSONObject().put("invoke_func_context_menu", this.f3811e));
                    this.f3809c = 1;
                    if (this.f3810d.e("SUPPORT_FUNC_USES", put, this) == aVar) {
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
                int i10 = this.f3809c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    JSONObject put2 = new JSONObject().put("referrer", this.f3811e);
                    this.f3809c = 1;
                    if (this.f3810d.e("SUPPORT_CLICK", put2, this) == aVar2) {
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
