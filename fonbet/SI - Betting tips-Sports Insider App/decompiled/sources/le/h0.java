package le;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sports.insider.ui.pays.PayExpressFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayExpressFragment f19814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Drawable f19815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(PayExpressFragment payExpressFragment, Drawable drawable, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19813b = i5;
        this.f19814c = payExpressFragment;
        this.f19815d = drawable;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19813b) {
            case 0:
                return new h0(this.f19814c, this.f19815d, continuation, 0);
            case 1:
                return new h0(this.f19814c, this.f19815d, continuation, 1);
            default:
                return new h0(this.f19814c, this.f19815d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19813b) {
        }
        return ((h0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        AppCompatImageView appCompatImageView;
        ImageView imageView;
        AppCompatImageView appCompatImageView2;
        int i5 = this.f19813b;
        Drawable drawable = this.f19815d;
        PayExpressFragment payExpressFragment = this.f19814c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.v vVar = (ec.v) payExpressFragment.f22459a;
                if (vVar != null && (appCompatImageView = vVar.f9023f) != null) {
                    appCompatImageView.setImageDrawable(drawable);
                    break;
                }
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.v vVar2 = (ec.v) payExpressFragment.f22459a;
                if (vVar2 != null && (imageView = vVar2.f9022e) != null) {
                    imageView.setImageDrawable(drawable);
                    break;
                }
                break;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ec.v vVar3 = (ec.v) payExpressFragment.f22459a;
                if (vVar3 != null && (appCompatImageView2 = vVar3.f9026i) != null) {
                    appCompatImageView2.setImageDrawable(drawable);
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}
