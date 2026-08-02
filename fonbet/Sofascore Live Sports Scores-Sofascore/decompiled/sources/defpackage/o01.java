package defpackage;

import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import com.sofascore.results.main.start.StartActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o01 implements rq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6b b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o01(g6b g6bVar, Object obj, int i) {
        this.a = i;
        this.b = g6bVar;
        this.c = obj;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        int i = this.a;
        Object obj = this.c;
        g6b g6bVar = this.b;
        u6bVar.getClass();
        switch (i) {
            case 0:
                g6bVar.d(this);
                BaseActivity baseActivity = (BaseActivity) obj;
                j1f j1fVar = (j1f) baseActivity.z().d.d();
                if (j1fVar != null) {
                    baseActivity.L(j1fVar);
                    break;
                }
                break;
            case 1:
                g6bVar.d(this);
                DateMatchesFragment dateMatchesFragment = (DateMatchesFragment) obj;
                if (dateMatchesFragment.E().getItemCount() == 0) {
                    dateMatchesFragment.u();
                    if (!dateMatchesFragment.C()) {
                        dateMatchesFragment.l();
                        break;
                    }
                }
                break;
            default:
                g6bVar.d(this);
                int i2 = StartActivity.q;
                ((StartActivity) obj).t();
                break;
        }
    }
}
