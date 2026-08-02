package le;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sports.insider.ui.pays.PayPremiumFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayPremiumFragment f19891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Drawable f19892d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(PayPremiumFragment payPremiumFragment, Drawable drawable, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19890b = i5;
        this.f19891c = payPremiumFragment;
        this.f19892d = drawable;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19890b) {
            case 0:
                return new n1(this.f19891c, this.f19892d, continuation, 0);
            case 1:
                return new n1(this.f19891c, this.f19892d, continuation, 1);
            default:
                return new n1(this.f19891c, this.f19892d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19890b) {
        }
        return ((n1) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        AppCompatImageView appCompatImageView;
        ImageView imageView;
        AppCompatImageView appCompatImageView2;
        int i5 = this.f19890b;
        Drawable drawable = this.f19892d;
        PayPremiumFragment payPremiumFragment = this.f19891c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.w wVar = (ec.w) payPremiumFragment.f22459a;
                if (wVar != null && (appCompatImageView = wVar.f9034f) != null) {
                    appCompatImageView.setImageDrawable(drawable);
                    break;
                }
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.w wVar2 = (ec.w) payPremiumFragment.f22459a;
                if (wVar2 != null && (imageView = wVar2.f9033e) != null) {
                    imageView.setImageDrawable(drawable);
                    break;
                }
                break;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ec.w wVar3 = (ec.w) payPremiumFragment.f22459a;
                if (wVar3 != null && (appCompatImageView2 = wVar3.f9037i) != null) {
                    appCompatImageView2.setImageDrawable(drawable);
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}
