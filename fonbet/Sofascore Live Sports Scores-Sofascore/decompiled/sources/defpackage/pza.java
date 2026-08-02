package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.league.fragment.standings.LeagueStandingsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class pza implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueStandingsFragment b;

    public /* synthetic */ pza(LeagueStandingsFragment leagueStandingsFragment, int i) {
        this.a = i;
        this.b = leagueStandingsFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        int i2 = 2;
        LeagueStandingsFragment leagueStandingsFragment = this.b;
        switch (i) {
            case 0:
                leagueStandingsFragment.u();
                break;
            case 1:
                List list = (List) obj;
                leagueStandingsFragment.n();
                if (list != null) {
                    if (!list.isEmpty()) {
                        for (Object obj2 : list) {
                            if ((obj2 instanceof tai) && ((tai) obj2).f) {
                                z = true;
                                leagueStandingsFragment.D().F(list);
                                if (z) {
                                    krk krkVar = leagueStandingsFragment.l;
                                    krkVar.getClass();
                                    RecyclerView recyclerView = ((oo8) krkVar).d;
                                    recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), 0, recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                                }
                                if (leagueStandingsFragment.w) {
                                    leagueStandingsFragment.w = false;
                                    krk krkVar2 = leagueStandingsFragment.l;
                                    krkVar2.getClass();
                                    leagueStandingsFragment.t(((oo8) krkVar2).d, new pza(leagueStandingsFragment, i2));
                                }
                            }
                        }
                    }
                    z = false;
                    leagueStandingsFragment.D().F(list);
                    if (z) {
                    }
                    if (leagueStandingsFragment.w) {
                    }
                }
                break;
            case 2:
                ((View) obj).getClass();
                xw3.L(wca.x(leagueStandingsFragment.getLifecycle()), null, null, new ppa(leagueStandingsFragment, null, 2), 3);
                break;
            default:
                r9i r9iVar = (r9i) obj;
                r9iVar.getClass();
                leagueStandingsFragment.F().j = r9iVar;
                if (r9iVar instanceof q9i) {
                    leagueStandingsFragment.u();
                } else {
                    leagueStandingsFragment.F().n();
                }
                break;
        }
        return Unit.a;
    }
}
