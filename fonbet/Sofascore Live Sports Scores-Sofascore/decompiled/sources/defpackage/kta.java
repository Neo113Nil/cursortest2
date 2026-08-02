package defpackage;

import android.view.KeyEvent;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.team.TeamActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kta implements gsi {
    public final /* synthetic */ int a;
    public final KeyEvent.Callback b;

    public /* synthetic */ kta(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // defpackage.fsi
    public final void a(jsi jsiVar) {
        int i = this.a;
    }

    @Override // defpackage.fsi
    public final void b(jsi jsiVar) {
        int i = this.a;
    }

    @Override // defpackage.fsi
    public final void c(jsi jsiVar) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                LeagueActivity leagueActivity = (LeagueActivity) callback;
                if (jsiVar.b == 0) {
                    a99 a99Var = LeagueActivity.h0;
                    if (leagueActivity.R().m) {
                        leagueActivity.S().f.y(0);
                        break;
                    }
                }
                a99 a99Var2 = LeagueActivity.h0;
                leagueActivity.S().f.y(1);
                break;
            case 1:
                ((suk) callback).setCurrentItem(jsiVar.b);
                break;
            case 2:
                ((ViewPager2) callback).c(jsiVar.b, true);
                break;
            default:
                int i2 = jsiVar.b;
                int i3 = TeamActivity.Z;
                ((TeamActivity) callback).e0(i2);
                break;
        }
    }

    private final void d(jsi jsiVar) {
    }

    private final void e(jsi jsiVar) {
    }

    private final void f(jsi jsiVar) {
    }

    private final void g(jsi jsiVar) {
    }

    private final void h(jsi jsiVar) {
    }

    private final void i(jsi jsiVar) {
    }

    private final void j(jsi jsiVar) {
    }

    private final void k(jsi jsiVar) {
    }
}
