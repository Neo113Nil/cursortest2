package defpackage;

import androidx.fragment.app.Fragment;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.results.main.matches.StageSeriesFragment;
import com.sofascore.results.main.matches.StageSeriesWeekFragment;
import com.unity3d.services.UnityAdsConstants;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a7i extends ouk {
    public int a;
    public final LinkedHashSet b;
    public final /* synthetic */ StageSeriesFragment c;

    public a7i(StageSeriesFragment stageSeriesFragment) {
        this.c = stageSeriesFragment;
        krk krkVar = stageSeriesFragment.l;
        krkVar.getClass();
        this.a = ((wq8) krkVar).g.getCurrentItem();
        this.b = new LinkedHashSet();
    }

    @Override // defpackage.ouk
    public final void a(int i) {
        StageSeriesFragment stageSeriesFragment = this.c;
        if (i == 0) {
            stageSeriesFragment.A().m();
            g9i g9iVar = stageSeriesFragment.u;
            if (g9iVar != null) {
                g9iVar.e(null);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        stageSeriesFragment.A().h0.j(Boolean.FALSE);
        g9i g9iVar2 = stageSeriesFragment.u;
        if (g9iVar2 != null) {
            g9iVar2.e(null);
        }
        stageSeriesFragment.u = xw3.L(wca.x(stageSeriesFragment.getLifecycle()), null, null, new w9g(stageSeriesFragment, null, 17), 3);
    }

    @Override // defpackage.ouk
    public final void b(int i, float f, int i2) {
        String j = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? i == this.a ? ljg.j(i + 1, InneractiveMediationDefs.GENDER_FEMALE) : ljg.j(i, InneractiveMediationDefs.GENDER_FEMALE) : ljg.j(i, InneractiveMediationDefs.GENDER_FEMALE);
        LinkedHashSet linkedHashSet = this.b;
        if (linkedHashSet.contains(j)) {
            return;
        }
        linkedHashSet.add(j);
        Fragment F = this.c.getChildFragmentManager().F(j);
        StageSeriesWeekFragment stageSeriesWeekFragment = F instanceof StageSeriesWeekFragment ? (StageSeriesWeekFragment) F : null;
        if (stageSeriesWeekFragment != null) {
            ad2 ad2Var = qv5.a;
            String fragment = stageSeriesWeekFragment.toString();
            fragment.getClass();
            qv5.a(new i42(fragment));
        }
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        this.a = i;
        StageSeriesFragment stageSeriesFragment = this.c;
        LocalDate plusWeeks = ((p7i) stageSeriesFragment.t.getValue()).k.plusWeeks(i - 1073741823);
        plusWeeks.getClass();
        krk krkVar = stageSeriesFragment.l;
        krkVar.getClass();
        ((wq8) krkVar).f.setText(stageSeriesFragment.D(plusWeeks));
        Calendar calendar = ke0.a;
        calendar.set(1, plusWeeks.getYear());
        calendar.set(2, plusWeeks.getMonthValue() - 1);
        calendar.set(5, plusWeeks.getDayOfMonth());
    }
}
