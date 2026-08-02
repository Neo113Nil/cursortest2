package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import com.sofascore.results.event.scorecard.EventScorecardFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class r66 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventScorecardFragment b;

    public /* synthetic */ r66(EventScorecardFragment eventScorecardFragment, int i) {
        this.a = i;
        this.b = eventScorecardFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        EventScorecardFragment eventScorecardFragment = this.b;
        switch (i) {
            case 0:
                eventScorecardFragment.n();
                return Unit.a;
            case 1:
                Context requireContext = eventScorecardFragment.requireContext();
                requireContext.getClass();
                return new p66(requireContext);
            case 2:
                LayoutInflater layoutInflater = eventScorecardFragment.getLayoutInflater();
                krk krkVar = eventScorecardFragment.l;
                krkVar.getClass();
                return xhh.a(layoutInflater, ((yq8) krkVar).c);
            default:
                Context requireContext2 = eventScorecardFragment.requireContext();
                requireContext2.getClass();
                return new pse(requireContext2);
        }
    }
}
