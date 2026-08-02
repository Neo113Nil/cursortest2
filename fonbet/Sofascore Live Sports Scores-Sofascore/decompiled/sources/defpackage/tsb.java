package defpackage;

import android.view.View;
import com.sofascore.results.manager.details.view.ManagerHistoryChartGraph;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tsb implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ManagerHistoryChartGraph b;
    public final /* synthetic */ float c;
    public final /* synthetic */ List d;

    public tsb(View view, ManagerHistoryChartGraph managerHistoryChartGraph, float f, List list) {
        this.a = view;
        this.b = managerHistoryChartGraph;
        this.c = f;
        this.d = list;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.a.removeOnAttachStateChangeListener(this);
        ManagerHistoryChartGraph managerHistoryChartGraph = this.b;
        g6b t = qea.t(managerHistoryChartGraph);
        if (t != null) {
            xw3.L(wca.x(t), null, null, new ip4(managerHistoryChartGraph, this.c, this.d, (rq3) null), 3);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
