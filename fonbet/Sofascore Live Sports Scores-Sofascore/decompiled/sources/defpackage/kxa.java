package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatFullPlayersBottomSheet;
import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatVoteBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kxa implements Function0 {
    public final /* synthetic */ boh a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;

    public kxa(boh bohVar, boolean z, Context context, int i) {
        this.a = bohVar;
        this.b = z;
        this.c = context;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long currentTimeMillis = System.currentTimeMillis();
        boh bohVar = this.a;
        if (currentTimeMillis - bohVar.h() >= 200) {
            bohVar.i(currentTimeMillis);
            int i = 3;
            rq3 rq3Var = null;
            boolean z = this.b;
            Context context = this.c;
            if (z) {
                LeagueGoatFullPlayersBottomSheet leagueGoatFullPlayersBottomSheet = new LeagueGoatFullPlayersBottomSheet();
                leagueGoatFullPlayersBottomSheet.setArguments(fz8.C(fz8.H("ANALYTICS_SOURCE", "click")));
                context.getClass();
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(leagueGoatFullPlayersBottomSheet, appCompatActivity, rq3Var, i));
                }
            } else {
                LeagueGoatVoteBottomSheet leagueGoatVoteBottomSheet = new LeagueGoatVoteBottomSheet();
                leagueGoatVoteBottomSheet.setArguments(fz8.C(fz8.D(this.d, "UNIQUE_TOURNAMENT_ID"), fz8.H("ANALYTICS_SOURCE", "click")));
                context.getClass();
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity2 = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity2 != null) {
                    wca.x(appCompatActivity2.getLifecycle()).b(new r1(leagueGoatVoteBottomSheet, appCompatActivity2, rq3Var, i));
                }
            }
        }
        return Unit.a;
    }
}
