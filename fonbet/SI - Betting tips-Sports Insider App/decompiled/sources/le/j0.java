package le;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.sports.insider.ui.pays.PayExpressFragment;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19834b;

    /* renamed from: c, reason: collision with root package name */
    public int f19835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PayExpressFragment f19836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19837e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(PayExpressFragment payExpressFragment, int i5, int i10, Continuation continuation) {
        super(2, continuation);
        this.f19834b = 2;
        this.f19836d = payExpressFragment;
        this.f19835c = i5;
        this.f19837e = i10;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19834b) {
            case 0:
                return new j0(this.f19836d, this.f19837e, continuation, 0);
            case 1:
                return new j0(this.f19836d, this.f19837e, continuation, 1);
            default:
                return new j0(this.f19836d, this.f19835c, this.f19837e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19834b) {
        }
        return ((j0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        ImageView imageView;
        ImageView imageView2;
        int i5 = this.f19834b;
        Continuation continuation = null;
        int i10 = this.f19837e;
        PayExpressFragment payExpressFragment = this.f19836d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f19835c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                d1 H = payExpressFragment.H();
                this.f19835c = 1;
                Serializable k6 = H.f19730f.f25205g.k(i10, 3, this);
                return k6 == aVar ? aVar : k6;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f19835c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = eg.m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    j0 j0Var = new j0(payExpressFragment, i10, continuation, 0);
                    this.f19835c = 1;
                    obj = eg.c0.A(dVar, j0Var, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Pair<? extends List<? extends CharSequence>, ? extends List<? extends CharSequence>> pair = (Pair) obj;
                ec.v vVar = (ec.v) payExpressFragment.f22459a;
                if (vVar != null) {
                    vVar.f9025h.setListProfit(pair);
                }
                return Unit.f19194a;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ec.v vVar2 = (ec.v) payExpressFragment.f22459a;
                ViewGroup.LayoutParams layoutParams = (vVar2 == null || (imageView2 = vVar2.f9022e) == null) ? null : imageView2.getLayoutParams();
                androidx.constraintlayout.widget.d dVar2 = layoutParams instanceof androidx.constraintlayout.widget.d ? (androidx.constraintlayout.widget.d) layoutParams : null;
                if (dVar2 != null) {
                    int i13 = this.f19835c;
                    ec.v vVar3 = (ec.v) payExpressFragment.f22459a;
                    if (vVar3 != null && (imageView = vVar3.f9022e) != null) {
                        ((ViewGroup.MarginLayoutParams) dVar2).height = i13;
                        imageView.setLayoutParams(dVar2);
                    }
                }
                ec.v vVar4 = (ec.v) payExpressFragment.f22459a;
                ViewGroup.LayoutParams layoutParams2 = (vVar4 == null || (frameLayout2 = vVar4.j) == null) ? null : frameLayout2.getLayoutParams();
                androidx.constraintlayout.widget.d dVar3 = layoutParams2 instanceof androidx.constraintlayout.widget.d ? (androidx.constraintlayout.widget.d) layoutParams2 : null;
                if (dVar3 == null) {
                    return null;
                }
                ec.v vVar5 = (ec.v) payExpressFragment.f22459a;
                if (vVar5 != null && (frameLayout = vVar5.j) != null) {
                    ((ViewGroup.MarginLayoutParams) dVar3).height = i10;
                    frameLayout.setLayoutParams(dVar3);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(PayExpressFragment payExpressFragment, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f19834b = i10;
        this.f19836d = payExpressFragment;
        this.f19837e = i5;
    }
}
