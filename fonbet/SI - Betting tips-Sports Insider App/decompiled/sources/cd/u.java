package cd;

import eg.z;
import f3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import la.e1;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3812b;

    /* renamed from: c, reason: collision with root package name */
    public int f3813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3817g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d dVar, int i5, int i10, int i11, Continuation continuation) {
        super(2, continuation);
        this.f3812b = 0;
        this.f3817g = dVar;
        this.f3814d = i5;
        this.f3815e = i10;
        this.f3816f = i11;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3812b) {
            case 0:
                return new u((d) this.f3817g, this.f3814d, this.f3815e, this.f3816f, continuation);
            case 1:
                return new u((la.g) this.f3817g, this.f3813c, this.f3814d, this.f3815e, this.f3816f, continuation, 1);
            case 2:
                return new u((la.m) this.f3817g, this.f3813c, this.f3814d, this.f3815e, this.f3816f, continuation, 2);
            default:
                return new u((e1) this.f3817g, this.f3813c, this.f3814d, this.f3815e, this.f3816f, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3812b) {
        }
        return ((u) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3812b;
        Object obj2 = this.f3817g;
        int i10 = this.f3816f;
        int i11 = this.f3815e;
        int i12 = this.f3814d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i13 = this.f3813c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    JSONObject put = new JSONObject().put("AvailableVersionCode", i12).put("StalenessDays", i11).put("MODE", i10);
                    Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                    this.f3813c = 1;
                    if (((d) obj2).d(put, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                la.g.b((la.g) obj2).K0(new Integer(this.f3813c), new Integer(i12), new Integer(i11), new Integer(i10));
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ((la.m) obj2).getClass();
                new fb.b().K0(new Integer(this.f3813c), new Integer(i12), new Integer(i11), new Integer(i10));
                return Unit.f19194a;
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                ((Number) x.n0(x.e0().f23426a.f23832a, false, true, new b2.f(1, new Integer(this.f3813c), new Integer(i12), new Integer(i11), new Integer(i10)))).intValue();
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, int i5, int i10, int i11, int i12, Continuation continuation, int i13) {
        super(2, continuation);
        this.f3812b = i13;
        this.f3817g = obj;
        this.f3813c = i5;
        this.f3814d = i10;
        this.f3815e = i11;
        this.f3816f = i12;
    }
}
