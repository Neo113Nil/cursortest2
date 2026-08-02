package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.players.models.H;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y8m extends ouk {
    public final /* synthetic */ obm a;

    public y8m(obm obmVar) {
        this.a = obmVar;
    }

    @Override // defpackage.ouk
    public final void a(int i) {
        obm obmVar = this.a;
        if (i == 0) {
            int i2 = obm.D;
            ilm ilmVar = (ilm) obmVar.getViewModel();
            xvl xvlVar = xvl.IDLE;
            ilmVar.getClass();
            xvlVar.getClass();
            ilmVar.z0 = xvlVar;
            obmVar.q.e.setUserInputEnabled(true);
            bk7 bk7Var = obmVar.y;
            if (bk7Var != null) {
                bk7Var.invoke();
                return;
            } else {
                ((ilm) obmVar.getViewModel()).B(true);
                return;
            }
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            obmVar.q.e.setUserInputEnabled(false);
            return;
        }
        int i3 = obm.D;
        ilm ilmVar2 = (ilm) obmVar.getViewModel();
        ilmVar2.getClass();
        xvl xvlVar2 = xvl.DRAGGING_VIEW_PAGER;
        xvlVar2.getClass();
        ilmVar2.z0 = xvlVar2;
        ilmVar2.B(false);
        obmVar.z = obmVar.q.e.n.b.m ? H.SKIP : H.SWIPE;
    }

    @Override // defpackage.ouk
    public final void b(int i, float f, int i2) {
        if (i2 > 0) {
            int i3 = obm.D;
            ilm ilmVar = (ilm) this.a.getViewModel();
            ilmVar.p0 = Integer.max(ilmVar.p0, i + 1);
        }
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        ViewPager2 viewPager2;
        int i2 = obm.D;
        obm obmVar = this.a;
        ilm ilmVar = (ilm) obmVar.getViewModel();
        ilmVar.p0 = Integer.max(ilmVar.p0, i);
        orm ormVar = obmVar.q;
        if (ormVar == null || (viewPager2 = ormVar.e) == null || !evl.n(viewPager2)) {
            obmVar.y = new bk7(obmVar, i, 8);
        } else {
            obmVar.C(i, obmVar.z);
        }
    }
}
