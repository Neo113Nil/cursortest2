package cd;

import com.google.android.material.textview.MaterialTextView;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.views.CustomGradientButton;
import ec.w;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3818b;

    /* renamed from: c, reason: collision with root package name */
    public int f3819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d dVar, int i5, int i10, Continuation continuation) {
        super(2, continuation);
        this.f3818b = 0;
        this.f3822f = dVar;
        this.f3820d = i5;
        this.f3821e = i10;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3818b) {
            case 0:
                return new v((d) this.f3822f, this.f3820d, this.f3821e, continuation);
            case 1:
                return new v((PayExpressFragment) this.f3822f, this.f3819c, this.f3820d, this.f3821e, continuation, 1);
            default:
                return new v((PayPremiumFragment) this.f3822f, this.f3819c, this.f3820d, this.f3821e, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3818b) {
        }
        return ((v) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        CustomGradientButton customGradientButton;
        MaterialTextView materialTextView;
        CustomGradientButton customGradientButton2;
        MaterialTextView materialTextView2;
        int i5 = this.f3818b;
        int i10 = this.f3821e;
        int i11 = this.f3820d;
        Object obj2 = this.f3822f;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i12 = this.f3819c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    JSONObject put = new JSONObject().put("AppUpdate", "start").put("AvailableVersionCode", i11).put("MODE", i10);
                    Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                    this.f3819c = 1;
                    if (((d) obj2).d(put, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                PayExpressFragment payExpressFragment = (PayExpressFragment) obj2;
                ec.v vVar = (ec.v) payExpressFragment.f22459a;
                if (vVar != null && (materialTextView = vVar.f9027k) != null) {
                    materialTextView.setTextColor(this.f3819c);
                }
                ec.v vVar2 = (ec.v) payExpressFragment.f22459a;
                if (vVar2 == null || (customGradientButton = vVar2.f9020c) == null) {
                    return null;
                }
                customGradientButton.d(i11, i10);
                return Unit.f19194a;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                PayPremiumFragment payPremiumFragment = (PayPremiumFragment) obj2;
                w wVar = (w) payPremiumFragment.f22459a;
                if (wVar != null && (materialTextView2 = wVar.f9038k) != null) {
                    materialTextView2.setTextColor(this.f3819c);
                }
                w wVar2 = (w) payPremiumFragment.f22459a;
                if (wVar2 == null || (customGradientButton2 = wVar2.f9031c) == null) {
                    return null;
                }
                customGradientButton2.d(i11, i10);
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(rd.a aVar, int i5, int i10, int i11, Continuation continuation, int i12) {
        super(2, continuation);
        this.f3818b = i12;
        this.f3822f = aVar;
        this.f3819c = i5;
        this.f3820d = i10;
        this.f3821e = i11;
    }
}
