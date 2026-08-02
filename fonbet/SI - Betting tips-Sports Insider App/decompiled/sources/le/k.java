package le;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.sports.insider.ui.pays.LivePayFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LivePayFragment f19845c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Drawable f19846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(LivePayFragment livePayFragment, Drawable drawable, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19844b = i5;
        this.f19845c = livePayFragment;
        this.f19846d = drawable;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19844b) {
            case 0:
                return new k(this.f19845c, this.f19846d, continuation, 0);
            default:
                return new k(this.f19845c, this.f19846d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19844b) {
        }
        return ((k) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        int i5 = this.f19844b;
        Drawable drawable = this.f19846d;
        LivePayFragment livePayFragment = this.f19845c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.c0 c0Var = (ec.c0) livePayFragment.f22459a;
                if (c0Var != null && (appCompatImageView = c0Var.f8886b) != null) {
                    appCompatImageView.setImageDrawable(drawable);
                    break;
                }
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.c0 c0Var2 = (ec.c0) livePayFragment.f22459a;
                if (c0Var2 != null && (appCompatImageView2 = c0Var2.f8889e) != null) {
                    appCompatImageView2.setImageDrawable(drawable);
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}
