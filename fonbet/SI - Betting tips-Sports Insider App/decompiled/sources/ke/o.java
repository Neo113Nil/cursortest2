package ke;

import android.widget.TextView;
import com.sports.insider.ui.onboarding.NoEthernetFragment;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NoEthernetFragment f19047c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(NoEthernetFragment noEthernetFragment, String str, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19046b = i5;
        this.f19047c = noEthernetFragment;
        this.f19048d = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19046b) {
            case 0:
                return new o(this.f19047c, this.f19048d, continuation, 0);
            case 1:
                return new o(this.f19047c, this.f19048d, continuation, 1);
            case 2:
                return new o(this.f19047c, this.f19048d, continuation, 2);
            case 3:
                return new o(this.f19047c, this.f19048d, continuation, 3);
            default:
                return new o(this.f19047c, this.f19048d, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19046b) {
        }
        return ((o) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        int i5 = this.f19046b;
        String str = this.f19048d;
        NoEthernetFragment noEthernetFragment = this.f19047c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.u uVar = (ec.u) noEthernetFragment.f22459a;
                if (uVar != null && (textView = uVar.f9014h) != null) {
                    textView.setText(str);
                }
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.u uVar2 = (ec.u) noEthernetFragment.f22459a;
                if (uVar2 != null && (textView2 = uVar2.f9016k) != null) {
                    textView2.setText(str);
                }
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ec.u uVar3 = (ec.u) noEthernetFragment.f22459a;
                if (uVar3 != null && (textView3 = uVar3.f9017l) != null) {
                    textView3.setText(str);
                }
                break;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                ec.u uVar4 = (ec.u) noEthernetFragment.f22459a;
                if (uVar4 != null && (textView4 = uVar4.f9013g) != null) {
                    textView4.setText(str);
                }
                break;
            default:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                ec.u uVar5 = (ec.u) noEthernetFragment.f22459a;
                if (uVar5 != null && (textView5 = uVar5.j) != null) {
                    textView5.setText(str);
                }
                break;
        }
        return Unit.f19194a;
    }
}
