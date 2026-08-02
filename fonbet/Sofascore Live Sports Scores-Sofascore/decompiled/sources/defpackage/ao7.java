package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.e;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyTransferPostModel;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayer;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lao7;", "Lq8;", "Lmk7;", "yn7", "vn7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ao7 extends q8 implements mk7 {
    public final wi7 e;
    public final ho7 f;
    public final ev6 g;
    public final List h;
    public final int i;
    public final double j;
    public final boolean k;
    public final boolean l;
    public final jof m;
    public final fdi n;
    public final jof o;
    public final aeh p;
    public final hof q;
    public final ArrayList r;
    public FantasyRoundPlayerUiModel s;
    public FantasyRoundPlayerUiModel t;
    public Boolean u;
    public Boolean v;
    public final e1d w;
    public final FantasyCompetitionType x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao7(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        jof u;
        il8 il8Var;
        fqgVar.getClass();
        wi7Var.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("gameweek");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = (ho7) a;
        Object a2 = fqgVar.a("competition");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        ev6 ev6Var = (ev6) a2;
        FantasyCompetitionType fantasyCompetitionType = ev6Var.d;
        this.g = ev6Var;
        Object a3 = fqgVar.a("squad");
        if (a3 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.h = (List) a3;
        Object a4 = fqgVar.a("joinedInRoundId");
        if (a4 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.i = ((Number) a4).intValue();
        Object a5 = fqgVar.a("balance");
        if (a5 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.j = ((Number) a5).doubleValue();
        Object a6 = fqgVar.a("freeHit");
        if (a6 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.k = ((Boolean) a6).booleanValue();
        Object a7 = fqgVar.a("wildcard");
        if (a7 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.l = ((Boolean) a7).booleanValue();
        p03 p03Var = fqgVar.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) p03Var.e;
        boolean containsKey = linkedHashMap.containsKey("transferOutId");
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) p03Var.b;
        if (containsKey) {
            Object obj = linkedHashMap.get("transferOutId");
            if (obj == null) {
                if (!linkedHashMap2.containsKey("transferOutId")) {
                    linkedHashMap2.put("transferOutId", null);
                }
                obj = gdi.a(linkedHashMap2.get("transferOutId"));
                linkedHashMap.put("transferOutId", obj);
            }
            u = un0.u((f1d) obj);
        } else {
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) p03Var.d;
            Object obj2 = linkedHashMap3.get("transferOutId");
            if (obj2 == null) {
                if (!linkedHashMap2.containsKey("transferOutId")) {
                    linkedHashMap2.put("transferOutId", null);
                }
                obj2 = gdi.a(linkedHashMap2.get("transferOutId"));
                linkedHashMap3.put("transferOutId", obj2);
            }
            u = un0.u((f1d) obj2);
        }
        this.m = u;
        fdi a8 = gdi.a(k());
        this.n = a8;
        this.o = un0.u(a8);
        aeh b = beh.b(0, 0, null, 7);
        this.p = b;
        this.q = un0.t(b);
        this.r = new ArrayList();
        this.w = e.f(null);
        this.x = fantasyCompetitionType;
        o();
        int i = zn7.a[fantasyCompetitionType.ordinal()];
        if (i == 1) {
            il8Var = il8.h;
        } else {
            if (i != 2) {
                zzl.b();
                throw null;
            }
            il8Var = il8.i;
        }
        il8Var.getClass();
        q(il8Var);
    }

    public final void A(vl7 vl7Var) {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.n;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, vn7.a((vn7) value, null, null, 0.0d, 0, null, null, false, false, false, false, 0, 0, null, vl7Var, 8191)));
    }

    public final vn7 k() {
        gv9 W = l6g.W(this.h);
        double s = yid.s(this.j, 1);
        boolean v = v();
        ho7 ho7Var = this.f;
        return new vn7(this.f, W, s, (v || ho7Var.g()) ? Integer.MAX_VALUE : ho7Var.c, x(ho7Var, this.k), y(ho7Var, this.l), ho7Var.g(), false, false, false, 0, 0, rlh.b, null);
    }

    public final int l(boolean z) {
        if (v() || z || this.g.d == FantasyCompetitionType.WEEKLY) {
            return 0;
        }
        int size = this.r.size() - this.f.c;
        return (size >= 0 ? size : 0) * (-5);
    }

    public final double m(ArrayList arrayList) {
        Iterator it = this.h.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((FantasyRoundPlayerUiModel) it.next()).p != null ? r5.floatValue() : 0.0d;
        }
        double s = yid.s(d, 1);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((FantasyRoundPlayerUiModel) next).c != yy6.REMOVED) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        double d2 = 0.0d;
        while (it3.hasNext()) {
            d2 += ((FantasyRoundPlayerUiModel) it3.next()).p != null ? r7.floatValue() : 0.0d;
        }
        double s2 = yid.s((this.j + s) - yid.s(d2, 1), 1);
        if (s2 == -0.0d) {
            return 0.0d;
        }
        return s2;
    }

    public final int n(boolean z) {
        if (v() || z) {
            return Integer.MAX_VALUE;
        }
        int size = this.f.c - this.r.size();
        if (size < 0) {
            return 0;
        }
        return size;
    }

    public final void o() {
        ho7 ho7Var;
        Object value;
        vn7 vn7Var;
        boolean z;
        gv9 W;
        boolean z2;
        fdi fdiVar = this.n;
        boolean z3 = Double.compare(((vn7) fdiVar.getValue()).c, 0.0d) < 0;
        Map a = h49.a(new sz8(((vn7) fdiVar.getValue()).b, 24));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = a.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ho7Var = this.f;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Number) entry.getValue()).intValue() > ho7Var.a.l) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((Pair) ((Map.Entry) it2.next()).getKey());
        }
        xbb b = a.b();
        if (z3) {
            b.add(new wn7(((vn7) fdiVar.getValue()).k));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            b.add(new xn7((String) ((Pair) it3.next()).b, ho7Var.a.l));
        }
        xbb a2 = a.a(b);
        do {
            value = fdiVar.getValue();
            vn7Var = (vn7) value;
            gv9 gv9Var = vn7Var.b;
            if (gv9Var == null || !gv9Var.isEmpty()) {
                Iterator<E> it4 = gv9Var.iterator();
                while (it4.hasNext()) {
                    if (((FantasyRoundPlayerUiModel) it4.next()).c != null) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            W = l6g.W(a2);
            if (z && a2.isEmpty()) {
                gv9 gv9Var2 = vn7Var.b;
                if (gv9Var2 == null || !gv9Var2.isEmpty()) {
                    Iterator<E> it5 = gv9Var2.iterator();
                    while (it5.hasNext()) {
                        if (((FantasyRoundPlayerUiModel) it5.next()).c == yy6.REMOVED) {
                        }
                    }
                }
                z2 = true;
            }
            z2 = false;
        } while (!fdiVar.k(value, vn7.a(vn7Var, null, null, 0.0d, 0, null, null, false, false, z2, z, 0, 0, W, null, 11519)));
    }

    @Override // defpackage.mk7
    /* renamed from: p, reason: from getter */
    public final FantasyCompetitionType getX() {
        return this.x;
    }

    @Override // defpackage.mk7
    public final void q(il8 il8Var) {
        this.w.setValue(il8Var);
    }

    @Override // defpackage.mk7
    public final il8 r() {
        return (il8) ((eoh) this.w).getValue();
    }

    public final void t() {
        ArrayList arrayList = this.r;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zz6 zz6Var = (zz6) it.next();
            arrayList2.add(new FantasyTransferPostModel(zz6Var.b.a, zz6Var.a.a));
        }
        xw3.L(un0.z(this), null, null, new hs6(this, arrayList2, (rq3) null, 28), 3);
    }

    public final gv9 u() {
        ArrayList arrayList = this.r;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zz6 zz6Var = (zz6) it.next();
            zz6Var.getClass();
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = zz6Var.a;
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = zz6Var.b;
            FantasyPlayerUiModel fantasyPlayerUiModel = fantasyRoundPlayerUiModel.g;
            String str = fantasyPlayerUiModel.g;
            if (str == null) {
                str = fantasyPlayerUiModel.f;
            }
            int i = fantasyPlayerUiModel.b;
            int i2 = fantasyRoundPlayerUiModel.a;
            int i3 = fantasyRoundPlayerUiModel.h;
            String str2 = fantasyRoundPlayerUiModel.j;
            Float f = fantasyRoundPlayerUiModel.p;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            FantasyTransferPlayer fantasyTransferPlayer = new FantasyTransferPlayer(str, i, i2, i3, str2, f != null ? f.floatValue() : 0.0f, fantasyRoundPlayerUiModel.b, fantasyRoundPlayerUiModel.q);
            FantasyPlayerUiModel fantasyPlayerUiModel2 = fantasyRoundPlayerUiModel2.g;
            String str3 = fantasyPlayerUiModel2.g;
            if (str3 == null) {
                str3 = fantasyPlayerUiModel2.f;
            }
            String str4 = str3;
            int i4 = fantasyPlayerUiModel2.b;
            int i5 = fantasyRoundPlayerUiModel2.a;
            int i6 = fantasyRoundPlayerUiModel2.h;
            String str5 = fantasyRoundPlayerUiModel2.j;
            Float f3 = fantasyRoundPlayerUiModel2.p;
            if (f3 != null) {
                f2 = f3.floatValue();
            }
            arrayList2.add(new FantasyTransferPlayers(new FantasyTransferPlayer(str4, i4, i5, i6, str5, f2, fantasyRoundPlayerUiModel2.b, fantasyRoundPlayerUiModel2.q), fantasyTransferPlayer));
        }
        return l6g.W(arrayList2);
    }

    public final boolean v() {
        return this.f.a.a == this.i;
    }

    public final void w(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        rq3 rq3Var;
        int i;
        FantasyRoundPlayerUiModel b;
        SharedPreferences d;
        SharedPreferences d2;
        Object obj;
        fantasyRoundPlayerUiModel.getClass();
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = this.t;
        if (fantasyRoundPlayerUiModel2 == null) {
            return;
        }
        ArrayList arrayList = this.r;
        zz6 zz6Var = new zz6(fantasyRoundPlayerUiModel, fantasyRoundPlayerUiModel2);
        while (true) {
            rq3Var = null;
            if (zz6Var == null) {
                break;
            }
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = zz6Var.b;
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4 = zz6Var.a;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                zz6 zz6Var2 = (zz6) obj;
                if (zz6Var2.b.a == fantasyRoundPlayerUiModel4.a || zz6Var2.a.a == fantasyRoundPlayerUiModel3.a) {
                    break;
                }
            }
            zz6 zz6Var3 = (zz6) obj;
            if (zz6Var3 == null) {
                arrayList.add(zz6Var);
                break;
            }
            arrayList.remove(zz6Var3);
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel5 = zz6Var3.a;
            boolean z = fantasyRoundPlayerUiModel5.a == fantasyRoundPlayerUiModel3.a;
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel6 = zz6Var3.b;
            boolean z2 = fantasyRoundPlayerUiModel6.a == fantasyRoundPlayerUiModel4.a;
            if (!z || !z2) {
                if (z) {
                    zz6Var = new zz6(fantasyRoundPlayerUiModel4, fantasyRoundPlayerUiModel6);
                } else if (z2) {
                    zz6Var = new zz6(fantasyRoundPlayerUiModel5, fantasyRoundPlayerUiModel3);
                }
            }
            zz6Var = null;
        }
        Application application = this.b;
        application.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = application.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        boolean z3 = sharedPreferences.getBoolean("PREF_FREE_TRANSFER_WARNING_SHOWN", false);
        int n = n(((vn7) this.n.getValue()).g);
        int l = l(((vn7) this.n.getValue()).g);
        int i2 = this.f.c;
        int size = this.r.size();
        if (!z3 && size > 0 && n == 0 && i2 != 0) {
            Application application2 = this.b;
            application2.getClass();
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = application2.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext2);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences2 = d;
            }
            SharedPreferences.Editor i3 = dmi.i(sharedPreferences2, "PREF_FREE_TRANSFER_WARNING_SHOWN", true);
            Unit unit = Unit.a;
            i3.apply();
            xw3.L(un0.z(this), null, null, new d17(this, rq3Var, 12), 3);
        }
        fdi fdiVar = this.n;
        while (true) {
            Object value = fdiVar.getValue();
            fdi fdiVar2 = fdiVar;
            vn7 vn7Var = (vn7) value;
            gv9<FantasyRoundPlayerUiModel> gv9Var = vn7Var.b;
            int i4 = 10;
            ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, 10));
            for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel7 : gv9Var) {
                if (fantasyRoundPlayerUiModel7.a == fantasyRoundPlayerUiModel.a) {
                    List list = this.h;
                    ArrayList arrayList3 = new ArrayList(k13.r(list, i4));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Integer.valueOf(((FantasyRoundPlayerUiModel) it2.next()).a));
                    }
                    i = i4;
                    b = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel2, arrayList3.contains(Integer.valueOf(fantasyRoundPlayerUiModel2.a)) ? null : yy6.TRANSFERRING_IN, fantasyRoundPlayerUiModel.d, false, fantasyRoundPlayerUiModel.k, fantasyRoundPlayerUiModel.m, null, null, 536865763);
                } else {
                    i = i4;
                    yy6 yy6Var = fantasyRoundPlayerUiModel7.c;
                    b = yy6Var == yy6.AVAILABLE_REMOVED ? FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel7, yy6.REMOVED, 0, false, false, false, null, null, 536870891) : (yy6Var == yy6.TRANSFERRING_IN || yy6Var == yy6.REMOVED) ? FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel7, null, 0, false, false, false, null, null, 536870895) : FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel7, null, 0, false, false, false, null, null, 536870891);
                }
                arrayList2.add(b);
                i4 = i;
            }
            if (fdiVar2.k(value, vn7.a(vn7Var, null, l6g.W(arrayList2), m(arrayList2), n, null, null, false, false, false, false, size, l, null, null, 13169))) {
                this.t = null;
                this.s = null;
                o();
                return;
            }
            fdiVar = fdiVar2;
        }
    }

    public final vl7 x(ho7 ho7Var, boolean z) {
        boolean z2;
        ev6 ev6Var = this.g;
        if (!ev6Var.G) {
            return null;
        }
        tl7 tl7Var = tl7.h;
        boolean z3 = ev6Var.I;
        boolean d = ho7Var.d();
        boolean z4 = false;
        if (v() || ho7Var.a.p) {
            z2 = false;
            z4 = true;
        } else {
            z2 = false;
        }
        boolean z5 = ho7Var.f;
        return hz8.H(tl7Var, z, z3, d, z4, z5, false, (z5 || ho7Var.e) ? z2 : true, false);
    }

    public final vl7 y(ho7 ho7Var, boolean z) {
        boolean z2;
        ev6 ev6Var = this.g;
        if (!ev6Var.F) {
            return null;
        }
        tl7 tl7Var = tl7.g;
        boolean z3 = ev6Var.J;
        boolean d = ho7Var.d();
        boolean z4 = false;
        if (v() || ho7Var.a.p) {
            z2 = false;
            z4 = true;
        } else {
            z2 = false;
        }
        boolean z5 = ho7Var.e;
        return hz8.H(tl7Var, z, z3, d, z4, z5, false, (ho7Var.f || z5) ? z2 : true, false);
    }

    public final void z(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, boolean z) {
        fdi fdiVar;
        Object value;
        vn7 vn7Var;
        ArrayList arrayList;
        fantasyRoundPlayerUiModel.getClass();
        do {
            fdiVar = this.n;
            value = fdiVar.getValue();
            vn7Var = (vn7) value;
            gv9<FantasyRoundPlayerUiModel> gv9Var = vn7Var.b;
            arrayList = new ArrayList(k13.r(gv9Var, 10));
            for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 : gv9Var) {
                if (fantasyRoundPlayerUiModel2.a == fantasyRoundPlayerUiModel.a) {
                    fantasyRoundPlayerUiModel2 = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel2, yy6.REMOVED, 0, false, false, false, null, null, 536870907);
                }
                arrayList.add(fantasyRoundPlayerUiModel2);
            }
        } while (!fdiVar.k(value, vn7.a(vn7Var, null, l6g.W(arrayList), m(arrayList), 0, null, null, false, false, false, false, 0, 0, null, null, 16377)));
        if (z) {
            this.s = fantasyRoundPlayerUiModel;
        }
        o();
    }
}
