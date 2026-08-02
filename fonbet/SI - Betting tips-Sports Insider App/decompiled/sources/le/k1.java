package le;

import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.CustomGradientButton;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayPremiumFragment f19854c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Typeface f19855d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(PayPremiumFragment payPremiumFragment, Typeface typeface, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19853b = i5;
        this.f19854c = payPremiumFragment;
        this.f19855d = typeface;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19853b) {
            case 0:
                return new k1(this.f19854c, this.f19855d, continuation, 0);
            default:
                return new k1(this.f19854c, this.f19855d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19853b) {
        }
        return ((k1) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        MaterialTextView materialTextView;
        CustomButton customButton;
        CustomGradientButton customGradientButton;
        TextView textView;
        int i5 = this.f19853b;
        PayPremiumFragment payPremiumFragment = this.f19854c;
        Typeface typeface = this.f19855d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.w wVar = (ec.w) payPremiumFragment.f22459a;
                if (wVar != null && (materialTextView = wVar.f9038k) != null) {
                    materialTextView.setTypeface(typeface);
                }
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.w wVar2 = (ec.w) payPremiumFragment.f22459a;
                if (wVar2 != null && (textView = wVar2.f9039l) != null) {
                    textView.setTypeface(typeface);
                }
                ec.w wVar3 = (ec.w) payPremiumFragment.f22459a;
                if (wVar3 != null && (customGradientButton = wVar3.f9031c) != null) {
                    customGradientButton.setButtonTypeface(typeface);
                }
                ec.w wVar4 = (ec.w) payPremiumFragment.f22459a;
                if (wVar4 != null && (customButton = wVar4.f9032d) != null) {
                    customButton.setButtonTypeface(typeface);
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}
