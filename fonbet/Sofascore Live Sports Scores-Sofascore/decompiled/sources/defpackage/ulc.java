package defpackage;

import androidx.fragment.app.Fragment;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.results.mma.mainScreen.MmaEventsFragment;
import com.sofascore.results.mma.mainScreen.MmaEventsWeekFragment;
import com.unity3d.services.UnityAdsConstants;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ulc extends ouk {
    public int a;
    public final LinkedHashSet b;
    public final /* synthetic */ MmaEventsFragment c;

    public ulc(MmaEventsFragment mmaEventsFragment) {
        this.c = mmaEventsFragment;
        krk krkVar = mmaEventsFragment.l;
        krkVar.getClass();
        this.a = ((wq8) krkVar).g.getCurrentItem();
        this.b = new LinkedHashSet();
    }

    @Override // defpackage.ouk
    public final void a(int i) {
        MmaEventsFragment mmaEventsFragment = this.c;
        if (i == 0) {
            mmaEventsFragment.A().m();
            g9i g9iVar = mmaEventsFragment.v;
            if (g9iVar != null) {
                g9iVar.e(null);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        mmaEventsFragment.A().h0.j(Boolean.FALSE);
        g9i g9iVar2 = mmaEventsFragment.v;
        if (g9iVar2 != null) {
            g9iVar2.e(null);
        }
        mmaEventsFragment.v = xw3.L(wca.x(mmaEventsFragment.getLifecycle()), null, null, new ppa(mmaEventsFragment, null, 14), 3);
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
        MmaEventsWeekFragment mmaEventsWeekFragment = F instanceof MmaEventsWeekFragment ? (MmaEventsWeekFragment) F : null;
        if (mmaEventsWeekFragment != null) {
            ad2 ad2Var = qv5.a;
            String fragment = mmaEventsWeekFragment.toString();
            fragment.getClass();
            qv5.a(new i42(fragment));
        }
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        this.a = i;
        MmaEventsFragment mmaEventsFragment = this.c;
        LocalDate plusWeeks = ((omc) mmaEventsFragment.u.getValue()).k.plusWeeks(i - 1073741823);
        plusWeeks.getClass();
        krk krkVar = mmaEventsFragment.l;
        krkVar.getClass();
        ((wq8) krkVar).f.setText(mmaEventsFragment.D(plusWeeks));
        Calendar calendar = ke0.a;
        calendar.set(1, plusWeeks.getYear());
        calendar.set(2, plusWeeks.getMonthValue() - 1);
        calendar.set(5, plusWeeks.getDayOfMonth());
    }
}
