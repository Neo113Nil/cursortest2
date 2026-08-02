package le;

import android.graphics.Typeface;
import android.widget.TextView;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.views.CustomGradientButton;
import com.sports.insider.ui.views.ProfitViewV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LivePayFragment f19894c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Typeface f19895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(LivePayFragment livePayFragment, Typeface typeface, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19893b = i5;
        this.f19894c = livePayFragment;
        this.f19895d = typeface;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19893b) {
            case 0:
                return new o(this.f19894c, this.f19895d, continuation, 0);
            default:
                return new o(this.f19894c, this.f19895d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19893b) {
        }
        return ((o) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        TextView textView2;
        CustomGradientButton customGradientButton;
        ProfitViewV2 profitViewV2;
        int i5 = this.f19893b;
        Typeface typeface = this.f19895d;
        LivePayFragment livePayFragment = this.f19894c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.c0 c0Var = (ec.c0) livePayFragment.f22459a;
                if (c0Var != null && (customGradientButton = c0Var.f8888d) != null) {
                    customGradientButton.setButtonTypeface(typeface);
                }
                ec.c0 c0Var2 = (ec.c0) livePayFragment.f22459a;
                if (c0Var2 != null && (textView2 = c0Var2.f8893i) != null) {
                    textView2.setTypeface(typeface);
                }
                ec.c0 c0Var3 = (ec.c0) livePayFragment.f22459a;
                if (c0Var3 != null && (textView = c0Var3.j) != null) {
                    textView.setTypeface(typeface);
                }
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.c0 c0Var4 = (ec.c0) livePayFragment.f22459a;
                if (c0Var4 != null && (profitViewV2 = c0Var4.f8891g) != null) {
                    profitViewV2.setFont(typeface);
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}
