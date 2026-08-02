package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.manager.details.view.ManagerHistoryChartGraph;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class usb extends o8 {
    public static final /* synthetic */ int f = 0;
    public final e92 d;
    public float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usb(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.history_chart;
        ManagerHistoryChartGraph managerHistoryChartGraph = (ManagerHistoryChartGraph) nq8.B(R.id.history_chart, root);
        if (managerHistoryChartGraph != null) {
            i = R.id.history_chart_title;
            View B = nq8.B(R.id.history_chart_title, root);
            if (B != null) {
                kqb a = kqb.a(B);
                i = R.id.labels_layout;
                if (((LinearLayout) nq8.B(R.id.labels_layout, root)) != null) {
                    i = R.id.legend_row_1;
                    View B2 = nq8.B(R.id.legend_row_1, root);
                    if (B2 != null) {
                        pu1 b = pu1.b(B2);
                        i = R.id.legend_row_2;
                        View B3 = nq8.B(R.id.legend_row_2, root);
                        if (B3 != null) {
                            this.d = new e92((ConstraintLayout) root, managerHistoryChartGraph, a, b, pu1.b(B3), 12);
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
        return R.layout.manager_history_chart_layout;
    }
}
