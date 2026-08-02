package se;

import android.widget.TextView;
import com.sports.insider.ui.subs.ListSubsFragment;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ListSubsFragment f23521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CharSequence f23522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ListSubsFragment listSubsFragment, CharSequence charSequence, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23520b = i5;
        this.f23521c = listSubsFragment;
        this.f23522d = charSequence;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23520b) {
            case 0:
                return new c(this.f23521c, this.f23522d, continuation, 0);
            case 1:
                return new c(this.f23521c, this.f23522d, continuation, 1);
            case 2:
                return new c(this.f23521c, this.f23522d, continuation, 2);
            case 3:
                return new c(this.f23521c, this.f23522d, continuation, 3);
            case 4:
                return new c(this.f23521c, this.f23522d, continuation, 4);
            default:
                return new c(this.f23521c, this.f23522d, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23520b) {
        }
        return ((c) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        int i5 = this.f23520b;
        ListSubsFragment listSubsFragment = this.f23521c;
        CharSequence charSequence = this.f23522d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ec.d dVar = (ec.d) listSubsFragment.f22459a;
                if (dVar != null && (textView = dVar.f8896c) != null) {
                    textView.setText(charSequence);
                }
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                ec.d dVar2 = (ec.d) listSubsFragment.f22459a;
                if (dVar2 != null && (textView2 = dVar2.j) != null) {
                    textView2.setText(charSequence);
                }
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ec.d dVar3 = (ec.d) listSubsFragment.f22459a;
                if (dVar3 != null && (textView3 = dVar3.H) != null) {
                    textView3.setText(charSequence);
                }
                break;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                ec.d dVar4 = (ec.d) listSubsFragment.f22459a;
                if (dVar4 != null && (textView4 = dVar4.f8913v) != null) {
                    textView4.setText(charSequence);
                }
                break;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                ec.d dVar5 = (ec.d) listSubsFragment.f22459a;
                if (dVar5 != null && (textView5 = dVar5.f8916y) != null) {
                    textView5.setText(charSequence);
                }
                break;
            default:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                ec.d dVar6 = (ec.d) listSubsFragment.f22459a;
                if (dVar6 != null && (textView10 = dVar6.q) != null) {
                    textView10.setText(charSequence);
                }
                ec.d dVar7 = (ec.d) listSubsFragment.f22459a;
                if (dVar7 != null && (textView9 = dVar7.f8912u) != null) {
                    textView9.setText(charSequence);
                }
                ec.d dVar8 = (ec.d) listSubsFragment.f22459a;
                if (dVar8 != null && (textView8 = dVar8.f8911t) != null) {
                    textView8.setText(charSequence);
                }
                ec.d dVar9 = (ec.d) listSubsFragment.f22459a;
                if (dVar9 != null && (textView7 = dVar9.f8910s) != null) {
                    textView7.setText(charSequence);
                }
                ec.d dVar10 = (ec.d) listSubsFragment.f22459a;
                if (dVar10 != null && (textView6 = dVar10.f8909r) != null) {
                    textView6.setText(charSequence);
                }
                break;
        }
        return Unit.f19194a;
    }
}
