package defpackage;

import android.app.Application;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import com.sofascore.results.fantasy.onboarding.steps.a;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb7;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class wb7 extends q8 {
    public static final long n;
    public static final /* synthetic */ int o = 0;
    public final bfk e;
    public final wi7 f;
    public final ky6 g;
    public final boolean h;
    public final boolean i;
    public final fdi j;
    public final jof k;
    public final aeh l;
    public final hof m;

    static {
        wd5 wd5Var = xd5.b;
        n = wkn.R(5, be5.SECONDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb7(Application application, fqg fqgVar, bfk bfkVar, wi7 wi7Var, ky6 ky6Var) {
        super(application);
        Object value;
        fqgVar.getClass();
        bfkVar.getClass();
        wi7Var.getClass();
        ky6Var.getClass();
        this.e = bfkVar;
        this.f = wi7Var;
        this.g = ky6Var;
        Integer num = (Integer) fqgVar.a("competitionId");
        Boolean bool = (Boolean) fqgVar.a("finishWithResult");
        Boolean bool2 = Boolean.TRUE;
        this.h = Intrinsics.c(bool, bool2);
        this.i = Intrinsics.c((Boolean) fqgVar.a("skipLeagueStep"), bool2);
        uj7 uj7Var = uj7.a;
        FantasyOnboardingStepsNavigation.Companion.getClass();
        fdi a = gdi.a(new pb7(uj7Var, FantasyOnboardingStepsNavigation.SelectCompetition.INSTANCE, a.a(false, false).size(), 0, null, null, null, null, null, l6g.W(qp7.j), 0, 100.0d, 0.0d, false, rlh.b, false, null, false, false, null, false, null, null));
        this.j = a;
        this.k = un0.u(a);
        rq3 rq3Var = null;
        aeh b = beh.b(0, 0, null, 7);
        this.l = b;
        this.m = un0.t(b);
        if (num != null) {
            int intValue = num.intValue();
            do {
                value = a.getValue();
                FantasyOnboardingStepsNavigation.Companion.getClass();
            } while (!a.k(value, pb7.a((pb7) value, null, FantasyOnboardingStepsNavigation.CreateTeam.INSTANCE, a.a(true, this.i).size(), 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, null, 8388601)));
            n(intValue);
        }
        fcp.m0(new v98(hkg.I(this.j, new e87(9), hkg.q), new vb7(this, null), 3), un0.z(this));
        yea yeaVar = j58.a;
        nxf[] nxfVarArr = nxf.a;
        fcp.m0(new v98(yso.q(new i58(null)), new ip1(this, rq3Var, 19), 3), un0.z(this));
    }

    public static double o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof FantasyRoundPlayerUiModel) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        double d = 0.0d;
        while (it2.hasNext()) {
            d += ((FantasyRoundPlayerUiModel) it2.next()).p != null ? r4.floatValue() : 0.0d;
        }
        double s = yid.s(100.0d - yid.s(d, 1), 1);
        if (s == -0.0d) {
            return 0.0d;
        }
        return s;
    }

    public final void k() {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.j;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, pb7.a((pb7) value, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, null, 8323071)));
    }

    public final void l() {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.j;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, pb7.a((pb7) value, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, null, 7864319)));
    }

    public final FantasyRemoteAnnouncement m() {
        yea yeaVar = j58.a;
        List e = j58.e();
        FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation = FantasyRemoteAnnouncementLocation.ONBOARDING;
        ia0 ia0Var = ia0.q;
        String e2 = fc6.e();
        String c = dv3.c();
        ev6 ev6Var = ((pb7) this.k.a.getValue()).f;
        return rfo.B(e, fantasyRemoteAnnouncementLocation, ev6Var != null ? Integer.valueOf(ev6Var.c) : null, c, e2);
    }

    public final void n(int i) {
        xw3.L(un0.z(this), null, null, new z23(this, i, (rq3) null, 6), 3);
    }

    public final void t() {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.j;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, pb7.a((pb7) value, null, null, 0, 0, null, null, null, null, null, l6g.W(qp7.j), 0, 100.0d, 0.0d, false, rlh.b, false, null, false, null, false, null, null, 8356095)));
    }

    public final void u(boolean z) {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.j;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, pb7.a((pb7) value, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, z, null, null, 7340031)));
    }

    public final void v(oz6 oz6Var) {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.j;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, pb7.a((pb7) value, null, null, 0, 0, null, null, null, null, oz6Var, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, null, 8388351)));
    }

    public final void w() {
        fdi fdiVar;
        Object value;
        pb7 pb7Var;
        boolean z;
        xbb a;
        do {
            fdiVar = this.j;
            value = fdiVar.getValue();
            pb7Var = (pb7) value;
            ev6 ev6Var = pb7Var.f;
            int i = ev6Var != null ? ev6Var.p : Integer.MAX_VALUE;
            z = pb7Var.l < 0.0d;
            gv9 gv9Var = pb7Var.j;
            ArrayList arrayList = new ArrayList();
            for (Object obj : gv9Var) {
                if (obj instanceof FantasyRoundPlayerUiModel) {
                    arrayList.add(obj);
                }
            }
            Map a2 = h49.a(new xl1(arrayList, 2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : a2.entrySet()) {
                if (((Number) entry.getValue()).intValue() > i) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Pair) ((Map.Entry) it.next()).getKey()).b);
            }
            xbb b = kotlin.collections.a.b();
            if (z) {
                b.add(rp7.b);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                b.add(new sp7((String) it2.next(), i));
            }
            a = kotlin.collections.a.a(b);
        } while (!fdiVar.k(value, pb7.a(pb7Var, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, a.isEmpty() && pb7Var.k == 15 && !z, l6g.W(a), false, null, false, null, false, null, null, 8364031)));
    }
}
