package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ep7 implements rq4 {
    public final /* synthetic */ g6b a;
    public final /* synthetic */ FantasyWalkthroughCreateTeamFragment b;
    public final /* synthetic */ zrh c;
    public final /* synthetic */ l97 d;
    public final /* synthetic */ WeakReference e;

    public ep7(g6b g6bVar, FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment, zrh zrhVar, l97 l97Var, WeakReference weakReference) {
        this.a = g6bVar;
        this.b = fantasyWalkthroughCreateTeamFragment;
        this.c = zrhVar;
        this.d = l97Var;
        this.e = weakReference;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        this.a.d(this);
        g9a g9aVar = (g9a) this.b.s.getValue();
        l97 l97Var = this.d;
        zrh zrhVar = this.c;
        g9aVar.n(zrhVar, l97Var);
        FragmentActivity fragmentActivity = (FragmentActivity) this.e.get();
        if (fragmentActivity != null) {
            zrhVar.f(fragmentActivity);
        }
    }
}
