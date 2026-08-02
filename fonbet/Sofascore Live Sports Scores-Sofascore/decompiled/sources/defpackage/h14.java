package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelGraphView;
import com.sofascore.results.manager.details.view.ManagerHistoryChartGraph;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class h14 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ h14(View view, int i, int i2) {
        this.a = i2;
        this.c = view;
        this.b = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        int i2 = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                CricketWagonWheelGraphView cricketWagonWheelGraphView = (CricketWagonWheelGraphView) view;
                int i3 = CricketWagonWheelGraphView.B;
                valueAnimator.getClass();
                LinkedHashMap linkedHashMap = cricketWagonWheelGraphView.w;
                Integer valueOf = Integer.valueOf(i2);
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                linkedHashMap.put(valueOf, (Float) animatedValue);
                cricketWagonWheelGraphView.invalidate();
                break;
            default:
                ManagerHistoryChartGraph managerHistoryChartGraph = (ManagerHistoryChartGraph) view;
                int i4 = ManagerHistoryChartGraph.A;
                valueAnimator.getClass();
                LinkedHashMap linkedHashMap2 = managerHistoryChartGraph.y;
                Integer valueOf2 = Integer.valueOf(i2);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                linkedHashMap2.put(valueOf2, (Float) animatedValue2);
                managerHistoryChartGraph.invalidate();
                break;
        }
    }
}
