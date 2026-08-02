package defpackage;

import android.content.Context;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pt5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventBoxScoreFragment b;

    public /* synthetic */ pt5(EventBoxScoreFragment eventBoxScoreFragment, int i) {
        this.a = i;
        this.b = eventBoxScoreFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        EventBoxScoreFragment eventBoxScoreFragment = this.b;
        switch (i) {
            case 0:
                eventBoxScoreFragment.n();
                return Unit.a;
            case 1:
                EventBoxScoreFragment eventBoxScoreFragment2 = this.b;
                Context requireContext = eventBoxScoreFragment2.requireContext();
                requireContext.getClass();
                return new o12(requireContext, ok3.s(eventBoxScoreFragment2.E()), eventBoxScoreFragment2.t, new mt5(eventBoxScoreFragment2, 0), new k43(1, eventBoxScoreFragment2, EventBoxScoreFragment.class, "showBoxScoreLegend", "showBoxScoreLegend(Ljava/lang/String;)V", 0, 16));
            default:
                Context requireContext2 = eventBoxScoreFragment.requireContext();
                requireContext2.getClass();
                return new xh(requireContext2);
        }
    }
}
