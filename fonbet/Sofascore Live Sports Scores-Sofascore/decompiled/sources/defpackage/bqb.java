package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import com.sofascore.results.main.matches.redesign.datematches.MainMatchesFragment;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bqb extends ouk {
    public int a;
    public final HashMap b;
    public Integer c;
    public float d;
    public pug e;
    public final /* synthetic */ MainMatchesFragment f;

    public bqb(MainMatchesFragment mainMatchesFragment) {
        this.f = mainMatchesFragment;
        krk krkVar = mainMatchesFragment.l;
        krkVar.getClass();
        this.a = ((so8) krkVar).d.getCurrentItem();
        this.b = new HashMap();
        this.e = pug.a;
    }

    @Override // defpackage.ouk
    public final void a(int i) {
        Integer num;
        rq3 rq3Var = null;
        MainMatchesFragment mainMatchesFragment = this.f;
        if (i != 0) {
            if (i == 1) {
                mainMatchesFragment.C().h0.j(Boolean.FALSE);
                g9i g9iVar = mainMatchesFragment.u;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                mainMatchesFragment.u = xw3.L(wca.x(mainMatchesFragment.getLifecycle()), null, null, new ppa(mainMatchesFragment, rq3Var, 8), 3);
                return;
            }
            if (i == 2 && (num = this.c) != null) {
                int intValue = num.intValue();
                long w = mainMatchesFragment.D().w(intValue);
                krk krkVar = mainMatchesFragment.l;
                krkVar.getClass();
                ((so8) krkVar).e.setSelectedTimestamp(w);
                mainMatchesFragment.t = intValue;
                return;
            }
            return;
        }
        mainMatchesFragment.C().m();
        g9i g9iVar2 = mainMatchesFragment.u;
        if (g9iVar2 != null) {
            g9iVar2.e(null);
        }
        vc4 D = mainMatchesFragment.D();
        krk krkVar2 = mainMatchesFragment.l;
        krkVar2.getClass();
        long w2 = D.w(((so8) krkVar2).d.getCurrentItem());
        ke0.a.setTimeInMillis(1000 * w2);
        krk krkVar3 = mainMatchesFragment.l;
        krkVar3.getClass();
        ((so8) krkVar3).e.setSelectedTimestamp(w2);
        krk krkVar4 = mainMatchesFragment.l;
        krkVar4.getClass();
        ((so8) krkVar4).e.setSelectedTimestamp(w2);
        mainMatchesFragment.E(w2);
        qqb qqbVar = (qqb) mainMatchesFragment.C().m.d();
        if (qqbVar != null) {
            krk krkVar5 = mainMatchesFragment.l;
            krkVar5.getClass();
            ((so8) krkVar5).e.r(qqbVar);
        }
        krk krkVar6 = mainMatchesFragment.l;
        krkVar6.getClass();
        mainMatchesFragment.t = ((so8) krkVar6).d.getCurrentItem();
        this.c = null;
    }

    @Override // defpackage.ouk
    public final void b(int i, float f, int i2) {
        MainMatchesFragment mainMatchesFragment = this.f;
        if (mainMatchesFragment.t != i) {
            long w = mainMatchesFragment.D().w(i);
            krk krkVar = mainMatchesFragment.l;
            krkVar.getClass();
            ((so8) krkVar).e.setSelectedTimestamp(w);
            mainMatchesFragment.t = i;
        }
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            pug pugVar = f > 0.001f ? pug.b : pug.a;
            this.d = Math.abs(f);
            this.e = pugVar;
            krk krkVar2 = mainMatchesFragment.l;
            krkVar2.getClass();
            ((so8) krkVar2).e.t(this.d, this.e);
        } else {
            krk krkVar3 = mainMatchesFragment.l;
            krkVar3.getClass();
            ((so8) krkVar3).e.q();
        }
        String j = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? i == this.a ? ljg.j(i + 1, InneractiveMediationDefs.GENDER_FEMALE) : ljg.j(i, InneractiveMediationDefs.GENDER_FEMALE) : ljg.j(i, InneractiveMediationDefs.GENDER_FEMALE);
        HashMap hashMap = this.b;
        if (hashMap.containsKey(j)) {
            return;
        }
        hashMap.put(j, Boolean.TRUE);
        Fragment F = mainMatchesFragment.getChildFragmentManager().F(j);
        DateMatchesFragment dateMatchesFragment = F instanceof DateMatchesFragment ? (DateMatchesFragment) F : null;
        if (dateMatchesFragment != null) {
            ad2 ad2Var = qv5.a;
            String fragment = dateMatchesFragment.toString();
            fragment.getClass();
            qv5.a(new i42(fragment));
        }
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        MainMatchesFragment mainMatchesFragment = this.f;
        long w = mainMatchesFragment.D().w(i);
        ke0.a.setTimeInMillis(1000 * w);
        if (Math.abs(this.a - i) >= 2) {
            FragmentActivity requireActivity = mainMatchesFragment.requireActivity();
            requireActivity.getClass();
        } else if (this.a > i) {
            FragmentActivity requireActivity2 = mainMatchesFragment.requireActivity();
            requireActivity2.getClass();
        } else {
            FragmentActivity requireActivity3 = mainMatchesFragment.requireActivity();
            requireActivity3.getClass();
        }
        this.a = i;
        krk krkVar = mainMatchesFragment.l;
        krkVar.getClass();
        ViewPager2 viewPager2 = ((so8) krkVar).d;
        bi4 bi4Var = bi4.PATTERN_DDMMY;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(w));
        format.getClass();
        viewPager2.announceForAccessibility(format);
        krk krkVar2 = mainMatchesFragment.l;
        krkVar2.getClass();
        ((so8) krkVar2).d.setImportantForAccessibility(2);
        this.c = Integer.valueOf(i);
    }
}
