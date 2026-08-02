package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyCreateLeagueBottomSheet;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyJoinLeagueBottomSheet;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.reorder.FantasyReorderLeaguesBottomSheet;
import com.sofascore.results.fantasy.league.FantasyLeagueActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class es6 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ is6 c;
    public final /* synthetic */ crb d;

    public /* synthetic */ es6(crb crbVar, Context context, is6 is6Var) {
        this.d = crbVar;
        this.b = context;
        this.c = is6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        crb crbVar = this.d;
        is6 is6Var = this.c;
        Context context = this.b;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                zr6 zr6Var = (zr6) obj;
                zr6Var.getClass();
                int i2 = FantasyLeagueActivity.N;
                crbVar.a(inb.y(context, zr6Var.a, is6Var.m().c, zr6Var.b), null);
                return Unit.a;
            default:
                yr6 yr6Var = (yr6) obj;
                yr6Var.getClass();
                int i3 = 3;
                if (yr6Var.equals(ur6.a)) {
                    FragmentActivity O = hkg.O(context);
                    if (O != null) {
                        ev6 ev6Var = is6Var.m().c;
                        FantasyCreateLeagueBottomSheet fantasyCreateLeagueBottomSheet = new FantasyCreateLeagueBottomSheet();
                        fantasyCreateLeagueBottomSheet.setArguments(fz8.C(fz8.G("FANTASY_COMPETITION_EXTRA", ev6Var)));
                        AppCompatActivity appCompatActivity = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                        if (appCompatActivity != null) {
                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyCreateLeagueBottomSheet, appCompatActivity, rq3Var, i3));
                        }
                    }
                } else if (yr6Var.equals(vr6.a)) {
                    FragmentActivity O2 = hkg.O(context);
                    if (O2 != null) {
                        ev6 ev6Var2 = is6Var.m().c;
                        int i4 = is6Var.l().f;
                        FantasyJoinLeagueBottomSheet fantasyJoinLeagueBottomSheet = new FantasyJoinLeagueBottomSheet();
                        fantasyJoinLeagueBottomSheet.setArguments(fz8.C(fz8.G("FANTASY_COMPETITION_EXTRA", ev6Var2), fz8.D(i4, "FANTASY_JOINED_RANDOM_LEAGUES_COUNT")));
                        AppCompatActivity appCompatActivity2 = O2 instanceof AppCompatActivity ? (AppCompatActivity) O2 : null;
                        if (appCompatActivity2 != null) {
                            wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasyJoinLeagueBottomSheet, appCompatActivity2, rq3Var, i3));
                        }
                    }
                } else if (yr6Var.equals(xr6.a)) {
                    FragmentActivity O3 = hkg.O(context);
                    if (O3 != null) {
                        FantasyReorderLeaguesBottomSheet fantasyReorderLeaguesBottomSheet = new FantasyReorderLeaguesBottomSheet();
                        AppCompatActivity appCompatActivity3 = O3 instanceof AppCompatActivity ? (AppCompatActivity) O3 : null;
                        if (appCompatActivity3 != null) {
                            wca.x(appCompatActivity3.getLifecycle()).b(new r1(fantasyReorderLeaguesBottomSheet, appCompatActivity3, rq3Var, i3));
                        }
                    }
                } else {
                    if (!(yr6Var instanceof wr6)) {
                        zzl.b();
                        return null;
                    }
                    int i5 = FantasyLeagueActivity.N;
                    crbVar.a(inb.y(context, ((wr6) yr6Var).a, is6Var.m().c, false), null);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ es6(Context context, is6 is6Var, crb crbVar) {
        this.b = context;
        this.c = is6Var;
        this.d = crbVar;
    }
}
