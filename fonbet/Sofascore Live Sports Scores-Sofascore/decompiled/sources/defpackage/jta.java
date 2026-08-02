package defpackage;

import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class jta implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueActivity b;

    public /* synthetic */ jta(LeagueActivity leagueActivity, int i) {
        this.a = i;
        this.b = leagueActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        LeagueActivity leagueActivity = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                a99 a99Var = LeagueActivity.h0;
                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = leagueActivity.S().d;
                bool.getClass();
                toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                break;
            case 1:
                ((Integer) obj).getClass();
                a99 a99Var2 = LeagueActivity.h0;
                leagueActivity.W();
                break;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a99 a99Var3 = LeagueActivity.h0;
                if (booleanValue) {
                    p1f z = leagueActivity.z();
                    int T = leagueActivity.T();
                    qef qefVar = qef.LEAGUE;
                    if (z.a(new y0f(T, qefVar))) {
                        yta R = leagueActivity.R();
                        R.f.b(R.i, qefVar);
                    }
                }
                break;
            default:
                a99 a99Var4 = LeagueActivity.h0;
                ((Unit) obj).getClass();
                leagueActivity.R().h.getClass();
                kgl.e(leagueActivity);
                break;
        }
        return Unit.a;
    }
}
