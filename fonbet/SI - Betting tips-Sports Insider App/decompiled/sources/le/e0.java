package le;

import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.CustomGradientButton;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayExpressFragment f19756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Typeface f19757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(PayExpressFragment payExpressFragment, Typeface typeface, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19755b = i5;
        this.f19756c = payExpressFragment;
        this.f19757d = typeface;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19755b) {
            case 0:
                return new e0(this.f19756c, this.f19757d, continuation, 0);
            default:
                return new e0(this.f19756c, this.f19757d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19755b) {
        }
        return ((e0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        MaterialTextView materialTextView;
        CustomGradientButton customGradientButton;
        CustomButton customButton;
        TextView textView;
        int i5 = this.f19755b;
        PayExpressFragment payExpressFragment = this.f19756c;
        Typeface typeface = this.f19757d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.v vVar = (ec.v) payExpressFragment.f22459a;
                if (vVar != null && (materialTextView = vVar.f9027k) != null) {
                    materialTextView.setTypeface(typeface);
                }
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.v vVar2 = (ec.v) payExpressFragment.f22459a;
                if (vVar2 != null && (textView = vVar2.f9028l) != null) {
                    textView.setTypeface(typeface);
                }
                ec.v vVar3 = (ec.v) payExpressFragment.f22459a;
                if (vVar3 != null && (customButton = vVar3.f9021d) != null) {
                    customButton.setButtonTypeface(typeface);
                }
                ec.v vVar4 = (ec.v) payExpressFragment.f22459a;
                if (vVar4 != null && (customGradientButton = vVar4.f9020c) != null) {
                    customGradientButton.setButtonTypeface(typeface);
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}
