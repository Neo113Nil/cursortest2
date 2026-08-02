package cd;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3787b;

    /* renamed from: c, reason: collision with root package name */
    public int f3788c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f3789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f3791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3792g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i5, String str, int i10, Continuation continuation, int i11) {
        super(2, continuation);
        this.f3787b = i11;
        this.f3789d = nVar;
        this.f3790e = i5;
        this.f3791f = str;
        this.f3792g = i10;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3787b) {
            case 0:
                return new m(this.f3789d, this.f3790e, this.f3791f, this.f3792g, continuation, 0);
            default:
                return new m(this.f3789d, this.f3790e, this.f3791f, this.f3792g, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3787b) {
        }
        return ((m) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3787b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f3788c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    n nVar = this.f3789d;
                    int i10 = this.f3790e;
                    String str = gc.d.f9945a;
                    JSONObject f6 = n.f(nVar, i10, d2.i.c(), this.f3791f, this.f3792g);
                    this.f3788c = 1;
                    if (nVar.e("show_forecast_express", f6, this) == aVar) {
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
                int i11 = this.f3788c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    n nVar2 = this.f3789d;
                    int i12 = this.f3790e;
                    String str2 = gc.d.f9945a;
                    JSONObject f10 = n.f(nVar2, i12, d2.i.c(), this.f3791f, this.f3792g);
                    this.f3788c = 1;
                    if (nVar2.e("show_forecast_premium", f10, this) == aVar2) {
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
