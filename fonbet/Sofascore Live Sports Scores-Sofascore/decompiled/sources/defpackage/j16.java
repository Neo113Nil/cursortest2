package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.event.hockeyplaybyplay.EventHockeyPlayByPlayFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class j16 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventHockeyPlayByPlayFragment b;

    public /* synthetic */ j16(EventHockeyPlayByPlayFragment eventHockeyPlayByPlayFragment, int i) {
        this.a = i;
        this.b = eventHockeyPlayByPlayFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        EventHockeyPlayByPlayFragment eventHockeyPlayByPlayFragment = this.b;
        switch (i) {
            case 0:
                eventHockeyPlayByPlayFragment.n();
                return Unit.a;
            case 1:
                Event G = eventHockeyPlayByPlayFragment.G();
                Context requireContext = eventHockeyPlayByPlayFragment.requireContext();
                requireContext.getClass();
                return new f16(G, requireContext, new g16(eventHockeyPlayByPlayFragment, i2));
            case 2:
                Context requireContext2 = eventHockeyPlayByPlayFragment.requireContext();
                requireContext2.getClass();
                return new pse(requireContext2);
            case 3:
                Context requireContext3 = eventHockeyPlayByPlayFragment.requireContext();
                requireContext3.getClass();
                return new SegmentedButtonsView(requireContext3, null, 6);
            case 4:
                Context requireContext4 = eventHockeyPlayByPlayFragment.requireContext();
                requireContext4.getClass();
                return new vd9(requireContext4, new h16(eventHockeyPlayByPlayFragment, 2));
            default:
                LinearLayout linearLayout = new LinearLayout(eventHockeyPlayByPlayFragment.requireContext());
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                linearLayout.addView((SegmentedButtonsView) eventHockeyPlayByPlayFragment.v.getValue());
                linearLayout.addView((vd9) eventHockeyPlayByPlayFragment.w.getValue());
                return linearLayout;
        }
    }
}
