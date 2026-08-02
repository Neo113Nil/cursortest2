package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b41 implements rq4 {
    public final /* synthetic */ g6b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ d41 c;
    public final /* synthetic */ int d;

    public b41(g6b g6bVar, int i, d41 d41Var, int i2) {
        this.a = g6bVar;
        this.b = i;
        this.c = d41Var;
        this.d = i2;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        d41 d41Var = this.c;
        ArrayList arrayList = d41Var.l;
        u6bVar.getClass();
        this.a.d(this);
        int i = this.b;
        if (i >= 0 && i < arrayList.size()) {
            Fragment z = d41Var.z(i);
            AbstractFragment abstractFragment = z instanceof AbstractFragment ? (AbstractFragment) z : null;
            if (abstractFragment != null) {
                abstractFragment.q();
            }
        }
        int i2 = this.d;
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        Fragment z2 = d41Var.z(i2);
        AbstractFragment abstractFragment2 = z2 instanceof AbstractFragment ? (AbstractFragment) z2 : null;
        if (abstractFragment2 != null) {
            abstractFragment2.q();
        }
    }
}
