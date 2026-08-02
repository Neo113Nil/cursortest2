package ke;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.sports.insider.ui.onboarding.NoEthernetFragment;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NoEthernetFragment f19056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Drawable f19057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(NoEthernetFragment noEthernetFragment, Drawable drawable, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19055b = i5;
        this.f19056c = noEthernetFragment;
        this.f19057d = drawable;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19055b) {
            case 0:
                return new r(this.f19056c, this.f19057d, continuation, 0);
            case 1:
                return new r(this.f19056c, this.f19057d, continuation, 1);
            case 2:
                return new r(this.f19056c, this.f19057d, continuation, 2);
            case 3:
                return new r(this.f19056c, this.f19057d, continuation, 3);
            default:
                return new r(this.f19056c, this.f19057d, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19055b) {
        }
        return ((r) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        AppCompatImageView appCompatImageView;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        int i5 = this.f19055b;
        Drawable drawable = this.f19057d;
        NoEthernetFragment noEthernetFragment = this.f19056c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.u uVar = (ec.u) noEthernetFragment.f22459a;
                if (uVar != null && (appCompatImageView = uVar.f9012f) != null) {
                    appCompatImageView.setImageDrawable(drawable);
                    break;
                }
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.u uVar2 = (ec.u) noEthernetFragment.f22459a;
                if (uVar2 != null && (frameLayout = uVar2.f9010d) != null) {
                    frameLayout.setBackground(drawable);
                }
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ec.u uVar3 = (ec.u) noEthernetFragment.f22459a;
                if (uVar3 != null && (frameLayout2 = uVar3.f9011e) != null) {
                    frameLayout2.setBackground(drawable);
                }
                break;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                ec.u uVar4 = (ec.u) noEthernetFragment.f22459a;
                if (uVar4 != null && (frameLayout3 = uVar4.f9008b) != null) {
                    frameLayout3.setBackground(drawable);
                }
                break;
            default:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                ec.u uVar5 = (ec.u) noEthernetFragment.f22459a;
                if (uVar5 != null && (frameLayout4 = uVar5.f9009c) != null) {
                    frameLayout4.setBackground(drawable);
                }
                break;
        }
        return Unit.f19194a;
    }
}
