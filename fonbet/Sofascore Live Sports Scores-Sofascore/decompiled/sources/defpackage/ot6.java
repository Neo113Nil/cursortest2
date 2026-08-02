package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.fantasy.competition.managerprofile.FantasyManagerProfileActivity;
import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ot6 implements rq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6b b;
    public final /* synthetic */ zrh c;
    public final /* synthetic */ WeakReference d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ot6(g6b g6bVar, Object obj, zrh zrhVar, WeakReference weakReference, int i) {
        this.a = i;
        this.b = g6bVar;
        this.e = obj;
        this.c = zrhVar;
        this.d = weakReference;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        int i = this.a;
        WeakReference weakReference = this.d;
        zrh zrhVar = this.c;
        Object obj = this.e;
        g6b g6bVar = this.b;
        u6bVar.getClass();
        switch (i) {
            case 0:
                g6bVar.d(this);
                ((g9a) ((FantasyCompetitionMyTeamFragment) obj).t.getValue()).n(zrhVar, null);
                FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
                if (fragmentActivity != null) {
                    zrhVar.f(fragmentActivity);
                    break;
                }
                break;
            default:
                g6bVar.d(this);
                FantasyManagerProfileActivity fantasyManagerProfileActivity = (FantasyManagerProfileActivity) obj;
                int i2 = FantasyManagerProfileActivity.N;
                ((g9a) fantasyManagerProfileActivity.M.getValue()).n(zrhVar, new e77(fantasyManagerProfileActivity, 0));
                FantasyManagerProfileActivity fantasyManagerProfileActivity2 = (FantasyManagerProfileActivity) weakReference.get();
                if (fantasyManagerProfileActivity2 != null) {
                    zrhVar.f(fantasyManagerProfileActivity2);
                    break;
                }
                break;
        }
    }
}
