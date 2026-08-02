package defpackage;

import android.content.Context;
import com.sofascore.results.main.matches.redesign.livematches.LiveMatchesFragment;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class neb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LiveMatchesFragment b;

    public /* synthetic */ neb(LiveMatchesFragment liveMatchesFragment, int i) {
        this.a = i;
        this.b = liveMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        LiveMatchesFragment liveMatchesFragment = this.b;
        switch (i) {
            case 0:
                liveMatchesFragment.n();
                return Unit.a;
            case 1:
                Calendar calendar = ke0.a;
                Context requireContext = liveMatchesFragment.requireContext();
                requireContext.getClass();
                return ke0.b(requireContext);
            default:
                Context requireContext2 = liveMatchesFragment.requireContext();
                requireContext2.getClass();
                afb afbVar = new afb(requireContext2);
                afbVar.N(1);
                return afbVar;
        }
    }
}
