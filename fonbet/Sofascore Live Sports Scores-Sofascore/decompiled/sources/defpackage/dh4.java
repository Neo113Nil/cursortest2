package defpackage;

import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import com.sofascore.results.main.matches.redesign.livematches.LiveMatchesFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dh4 implements rq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6b b;
    public final /* synthetic */ AbstractFragment c;

    public /* synthetic */ dh4(g6b g6bVar, AbstractFragment abstractFragment, int i) {
        this.a = i;
        this.b = g6bVar;
        this.c = abstractFragment;
    }

    @Override // defpackage.rq4
    public final void onStart(u6b u6bVar) {
        int i = this.a;
        AbstractFragment abstractFragment = this.c;
        g6b g6bVar = this.b;
        u6bVar.getClass();
        switch (i) {
            case 0:
                g6bVar.d(this);
                DateMatchesFragment dateMatchesFragment = (DateMatchesFragment) abstractFragment;
                krk krkVar = dateMatchesFragment.l;
                krkVar.getClass();
                dateMatchesFragment.t(((do8) krkVar).c, new oi(dateMatchesFragment, 4));
                break;
            default:
                g6bVar.d(this);
                LiveMatchesFragment liveMatchesFragment = (LiveMatchesFragment) abstractFragment;
                krk krkVar2 = liveMatchesFragment.l;
                krkVar2.getClass();
                liveMatchesFragment.t(((ro8) krkVar2).d, new oi(liveMatchesFragment, 9));
                break;
        }
    }
}
