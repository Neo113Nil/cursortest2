package rc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22394b;

    /* renamed from: c, reason: collision with root package name */
    public int f22395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f22396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f22397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, String str, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22394b = i5;
        this.f22396d = gVar;
        this.f22397e = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22394b) {
            case 0:
                return new d(this.f22396d, this.f22397e, continuation, 0);
            default:
                return new d(this.f22396d, this.f22397e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22394b) {
        }
        return ((d) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f22394b;
        String str = this.f22397e;
        g gVar = this.f22396d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f22395c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    JSONObject put = new JSONObject().put("IsNotAtLeastStateStarted", str);
                    Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                    this.f22395c = 1;
                    if (gVar.d(put, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f22395c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    JSONObject put2 = new JSONObject().put("NoEtherNetActivity", 123);
                    if (str != null) {
                        put2.put("Cause", str);
                    }
                    Unit unit = Unit.f19194a;
                    JSONObject put3 = put2.put("google", "1.2.44.123");
                    this.f22395c = 1;
                    if (gVar.e("onView", put3, this) == aVar2) {
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
}
