package le;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.sports.insider.ui.pays.VipAccessFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k2 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VipAccessFragment f19857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Drawable f19858d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(VipAccessFragment vipAccessFragment, Drawable drawable, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19856b = i5;
        this.f19857c = vipAccessFragment;
        this.f19858d = drawable;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19856b) {
            case 0:
                return new k2(this.f19857c, this.f19858d, continuation, 0);
            case 1:
                return new k2(this.f19857c, this.f19858d, continuation, 1);
            case 2:
                return new k2(this.f19857c, this.f19858d, continuation, 2);
            default:
                return new k2(this.f19857c, this.f19858d, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19856b) {
        }
        return ((k2) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        int i5 = this.f19856b;
        Drawable drawable = this.f19858d;
        VipAccessFragment vipAccessFragment = this.f19857c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.d0 d0Var = (ec.d0) vipAccessFragment.f22459a;
                if (d0Var != null && (appCompatImageView = d0Var.f8922e) != null) {
                    appCompatImageView.setImageDrawable(drawable);
                    break;
                }
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.d0 d0Var2 = (ec.d0) vipAccessFragment.f22459a;
                if (d0Var2 != null && (appCompatImageView2 = d0Var2.f8924g) != null) {
                    appCompatImageView2.setImageDrawable(drawable);
                    break;
                }
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ec.d0 d0Var3 = (ec.d0) vipAccessFragment.f22459a;
                if (d0Var3 != null && (appCompatImageView3 = d0Var3.f8919b) != null) {
                    appCompatImageView3.setImageDrawable(drawable);
                    break;
                }
                break;
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                ec.d0 d0Var4 = (ec.d0) vipAccessFragment.f22459a;
                if (d0Var4 != null && (appCompatImageView4 = d0Var4.f8926i) != null) {
                    appCompatImageView4.setImageDrawable(drawable);
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}
