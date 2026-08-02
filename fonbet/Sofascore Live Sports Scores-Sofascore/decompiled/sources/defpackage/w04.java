package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.cricket.runsperover.CricketRunsPerOverGraphView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w04 extends o8 {
    public final z82 d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w04(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.graph;
        CricketRunsPerOverGraphView cricketRunsPerOverGraphView = (CricketRunsPerOverGraphView) nq8.B(R.id.graph, root);
        if (cricketRunsPerOverGraphView != null) {
            i = R.id.innings_selector;
            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.innings_selector, root);
            if (typeHeaderView != null) {
                i = R.id.legend_away;
                View B = nq8.B(R.id.legend_away, root);
                if (B != null) {
                    pu1 b = pu1.b(B);
                    i = R.id.legend_home;
                    View B2 = nq8.B(R.id.legend_home, root);
                    if (B2 != null) {
                        pu1 b2 = pu1.b(B2);
                        i = R.id.title_header;
                        View B3 = nq8.B(R.id.title_header, root);
                        if (B3 != null) {
                            this.d = new z82((LinearLayout) root, cricketRunsPerOverGraphView, typeHeaderView, b, b2, lqb.a(B3), 5);
                            this.e = true;
                            o8.d(this, 0, 7);
                            setVisibility(8);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.cricket_runs_per_over_graph_view;
    }

    public final void j(Event event, v04 v04Var) {
        if (v04Var == null) {
            return;
        }
        List list = v04Var.a;
        if (event instanceof CricketEvent) {
            int i = 0;
            setVisibility(0);
            IntRange h = b.h(list);
            ArrayList arrayList = new ArrayList(k13.r(h, 10));
            v6a it = h.iterator();
            while (true) {
                if (!it.c) {
                    break;
                } else {
                    arrayList.add(String.valueOf(it.nextInt() + 1));
                }
            }
            boolean z = this.e;
            z82 z82Var = this.d;
            if (z || arrayList.size() != ((TypeHeaderView) z82Var.d).getHeaderTypes().size()) {
                g5k g5kVar = new g5k((TypeHeaderView) z82Var.d);
                g5kVar.a = arrayList;
                g5kVar.j = true;
                g5kVar.a();
                g5kVar.d = new kz3(this, 2);
                g5kVar.m = new u04(i, this, event, v04Var);
                g5kVar.b();
            } else {
                int selectedIndex = ((TypeHeaderView) z82Var.d).getSelectedIndex();
                ((CricketRunsPerOverGraphView) z82Var.f).f((CricketEvent) event, (Pair) list.get(selectedIndex), list.size() - 1 == selectedIndex, false);
            }
            this.e = false;
        }
    }
}
