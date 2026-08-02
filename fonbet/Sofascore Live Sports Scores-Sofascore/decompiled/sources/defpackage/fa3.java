package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.results.R;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fa3 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ CompetitionsFragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa3(CompetitionsFragment competitionsFragment, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = competitionsFragment;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        CompetitionsFragment competitionsFragment = this.t;
        switch (i) {
            case 0:
                fa3 fa3Var = new fa3(competitionsFragment, rq3Var, 0);
                fa3Var.s = obj;
                return fa3Var;
            case 1:
                fa3 fa3Var2 = new fa3(competitionsFragment, rq3Var, 1);
                fa3Var2.s = obj;
                return fa3Var2;
            default:
                fa3 fa3Var3 = new fa3(competitionsFragment, rq3Var, 2);
                fa3Var3.s = obj;
                return fa3Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((fa3) create((ha3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((fa3) create((w93) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((fa3) create((ia3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        CompetitionsFragment competitionsFragment = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                ha3 ha3Var = (ha3) obj2;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (ha3Var.a) {
                    competitionsFragment.n();
                    krk krkVar = competitionsFragment.l;
                    krkVar.getClass();
                    tgj.G(((oo8) krkVar).c, 0L, 3);
                    ca3 C = competitionsFragment.C();
                    xbb b = a.b();
                    y93 y93Var = ha3Var.b;
                    if (y93Var != null) {
                        b.add(y93Var);
                    }
                    b.addAll(ha3Var.c);
                    C.F(a.a(b));
                }
                break;
            case 1:
                w93 w93Var = (w93) obj2;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                krk krkVar2 = competitionsFragment.l;
                krkVar2.getClass();
                RecyclerView recyclerView = ((oo8) krkVar2).d;
                competitionsFragment.C().A();
                if (w93Var.d) {
                    n layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    int findFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0;
                    ca3 C2 = competitionsFragment.C();
                    C2.getClass();
                    int indexOf = C2.i.indexOf(w93Var);
                    Integer valueOf = Integer.valueOf(indexOf);
                    if (indexOf < 0) {
                        valueOf = null;
                    }
                    int intValue = (valueOf != null ? valueOf.intValue() : 0) + w93Var.f;
                    if (Math.abs(findFirstVisibleItemPosition - intValue) > 10) {
                        Integer num = intValue > findFirstVisibleItemPosition ? new Integer(intValue - 10) : null;
                        recyclerView.scrollToPosition(num != null ? num.intValue() : intValue + 10);
                    }
                    recyclerView.smoothScrollToPosition(intValue);
                }
                break;
            default:
                ia3 ia3Var = (ia3) obj2;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                int i2 = l94.C;
                Context requireContext = competitionsFragment.requireContext();
                requireContext.getClass();
                krk krkVar3 = competitionsFragment.l;
                krkVar3.getClass();
                SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar3).a;
                swipeRefreshLayout.getClass();
                String string = competitionsFragment.getString(ia3Var.c ? R.string.toast_added_to_pinned : R.string.toast_removed_from_pinned);
                string.getClass();
                Integer num2 = new Integer(ia3Var.a);
                competitionsFragment.requireContext().getClass();
                l94 x = wxf.x(requireContext, swipeRefreshLayout, string, competitionsFragment.requireContext().getColor(R.color.surface_1), competitionsFragment.requireContext().getColor(R.color.surface_T), pco.I(0, num2, !hkg.b0(r14)), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, null, 1312);
                mi miVar = new mi(13, competitionsFragment, ia3Var, x);
                View childAt = x.i.getChildAt(0);
                n94 n94Var = childAt instanceof n94 ? (n94) childAt : null;
                if (n94Var != null) {
                    n94Var.setActionListener(miVar);
                }
                x.i();
                break;
        }
        return Unit.a;
    }
}
