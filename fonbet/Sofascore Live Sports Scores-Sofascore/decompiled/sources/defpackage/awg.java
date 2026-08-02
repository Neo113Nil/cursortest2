package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.results.main.search.SearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class awg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchActivity b;

    public /* synthetic */ awg(SearchActivity searchActivity, int i) {
        this.a = i;
        this.b = searchActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        SearchActivity searchActivity = this.b;
        switch (i) {
            case 0:
                p33 p33Var = (p33) obj;
                int i2 = SearchActivity.Q;
                p33Var.getClass();
                qfb qfbVar = p33Var.a;
                boolean z = qfbVar instanceof ofb ? true : p33Var.c instanceof ofb ? false : searchActivity.P;
                searchActivity.P = z;
                if (z && (qfbVar instanceof pfb)) {
                    n layoutManager = searchActivity.Q().b.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.scrollToPositionWithOffset(0, 0);
                    }
                }
                break;
            default:
                f6e f6eVar = (f6e) obj;
                int i3 = SearchActivity.Q;
                if (Intrinsics.c(searchActivity.S().g.getValue(), " ")) {
                    searchActivity.R().r(searchActivity.getLifecycle(), new f6e(new wf2(new d4e(km5.a), 6), f6e.e, f6e.f, new t2e(2)));
                } else {
                    qwg R = searchActivity.R();
                    g6b lifecycle = searchActivity.getLifecycle();
                    f6eVar.getClass();
                    R.r(lifecycle, f6eVar);
                }
                break;
        }
        return Unit.a;
    }
}
