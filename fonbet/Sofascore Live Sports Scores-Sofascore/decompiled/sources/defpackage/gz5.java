package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.R;
import com.sofascore.results.event.games.EventEsportsGamesFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gz5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventEsportsGamesFragment b;

    public /* synthetic */ gz5(EventEsportsGamesFragment eventEsportsGamesFragment, int i) {
        this.a = i;
        this.b = eventEsportsGamesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        EventEsportsGamesFragment eventEsportsGamesFragment = this.b;
        switch (i) {
            case 0:
                LayoutInflater layoutInflater = eventEsportsGamesFragment.getLayoutInflater();
                krk krkVar = eventEsportsGamesFragment.l;
                krkVar.getClass();
                View inflate = layoutInflater.inflate(R.layout.esport_games_empty_state, (ViewGroup) ((oo8) krkVar).d, false);
                if (inflate != null) {
                    return (GraphicLarge) inflate;
                }
                yhk.s("rootView");
                return null;
            case 1:
                eventEsportsGamesFragment.n();
                return Unit.a;
            case 2:
                Context requireContext = eventEsportsGamesFragment.requireContext();
                requireContext.getClass();
                return new fz5(requireContext);
            case 3:
                Context requireContext2 = eventEsportsGamesFragment.requireContext();
                requireContext2.getClass();
                return new SegmentedButtonsView(requireContext2, null, 6);
            case 4:
                Context requireContext3 = eventEsportsGamesFragment.requireContext();
                requireContext3.getClass();
                return new fg5(requireContext3);
            case 5:
                Context requireContext4 = eventEsportsGamesFragment.requireContext();
                requireContext4.getClass();
                return new nd2(requireContext4);
            case 6:
                Context requireContext5 = eventEsportsGamesFragment.requireContext();
                requireContext5.getClass();
                return new dg5(requireContext5);
            default:
                Context requireContext6 = eventEsportsGamesFragment.requireContext();
                requireContext6.getClass();
                return new cg5(requireContext6);
        }
    }
}
