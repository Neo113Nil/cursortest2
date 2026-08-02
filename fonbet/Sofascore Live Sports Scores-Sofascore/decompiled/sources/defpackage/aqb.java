package defpackage;

import android.content.Context;
import com.sofascore.results.main.matches.redesign.datematches.MainMatchesFragment;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class aqb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainMatchesFragment b;

    public /* synthetic */ aqb(MainMatchesFragment mainMatchesFragment, int i) {
        this.a = i;
        this.b = mainMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MainMatchesFragment mainMatchesFragment = this.b;
        switch (i) {
            case 0:
                r4a.M(mainMatchesFragment.C().K);
                return Unit.a;
            case 1:
                r4a.M(mainMatchesFragment.C().M);
                return Unit.a;
            case 2:
                r4a.M(mainMatchesFragment.C().I);
                return Unit.a;
            case 3:
                Calendar calendar = ke0.a;
                Context requireContext = mainMatchesFragment.requireContext();
                requireContext.getClass();
                return ke0.b(requireContext);
            default:
                krk krkVar = mainMatchesFragment.l;
                krkVar.getClass();
                return new vc4(mainMatchesFragment, ((so8) krkVar).d);
        }
    }
}
