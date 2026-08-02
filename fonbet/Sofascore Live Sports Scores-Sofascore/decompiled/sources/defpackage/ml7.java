package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.e;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lml7;", "Lq8;", "Lmk7;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ml7 extends q8 implements mk7 {
    public final wi7 e;
    public final ky6 f;
    public final ho7 g;
    public final ev6 h;
    public final List i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final fdi m;
    public final jof n;
    public final aeh o;
    public final hof p;
    public final e1d q;
    public final FantasyCompetitionType r;
    public FantasyRoundPlayerUiModel s;
    public FantasyRoundPlayerUiModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ml7(Application application, fqg fqgVar, wi7 wi7Var, ky6 ky6Var) {
        super(application);
        boolean z;
        Object obj;
        Object obj2;
        SharedPreferences d;
        fqgVar.getClass();
        wi7Var.getClass();
        ky6Var.getClass();
        this.e = wi7Var;
        this.f = ky6Var;
        Object a = fqgVar.a("gameweek");
        Object obj3 = null;
        Object[] objArr = 0;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        ho7 ho7Var = (ho7) a;
        this.g = ho7Var;
        Object a2 = fqgVar.a("competition");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        ev6 ev6Var = (ev6) a2;
        this.h = ev6Var;
        Object a3 = fqgVar.a("squad");
        if (a3 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        List list = (List) a3;
        this.i = list;
        this.j = (Integer) fqgVar.a("subOutId");
        this.k = (Integer) fqgVar.a("subInId");
        this.l = (Integer) fqgVar.a("captainId");
        gv9 W = l6g.W(list);
        if (ho7Var.a.g() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((FantasyRoundPlayerUiModel) it.next()).v) {
                    Application application2 = this.b;
                    application2.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = application2.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    if (!sharedPreferences.getBoolean("PREF_SUBSTITUTIONS_INFO_DISMISSED", false)) {
                        z = true;
                    }
                }
            }
        }
        z = false;
        fdi a4 = gdi.a(new ll7(ho7Var, ev6Var, W, uj7.a, rlh.b, false, false, z, false));
        this.m = a4;
        jof u = un0.u(a4);
        this.n = u;
        aeh b = beh.b(0, 0, null, 7);
        this.o = b;
        this.p = un0.t(b);
        this.q = e.f(fqgVar.a("squadInfoDisplayMode"));
        this.r = this.h.d;
        xw3.L(un0.z(this), null, null, new qu1((Object) this, this.g.a.a, (rq3) (objArr == true ? 1 : 0), 10), 3);
        if (r() == null) {
            s(this.g.a);
        }
        gv9 gv9Var = ((ll7) u.a.getValue()).c;
        if (this.j != null) {
            Iterator<E> it2 = gv9Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                int i = ((FantasyRoundPlayerUiModel) obj2).a;
                Integer num = this.j;
                if (num != null && i == num.intValue()) {
                    break;
                }
            }
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj2;
            if (fantasyRoundPlayerUiModel != null) {
                o(fantasyRoundPlayerUiModel);
            }
        }
        if (this.k != null) {
            Iterator<E> it3 = gv9Var.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                int i2 = ((FantasyRoundPlayerUiModel) obj).a;
                Integer num2 = this.k;
                if (num2 != null && i2 == num2.intValue()) {
                    break;
                }
            }
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) obj;
            if (fantasyRoundPlayerUiModel2 != null) {
                n(fantasyRoundPlayerUiModel2);
            }
        }
        if (this.l != null) {
            Iterator<E> it4 = gv9Var.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                int i3 = ((FantasyRoundPlayerUiModel) next).a;
                Integer num3 = this.l;
                if (num3 != null && i3 == num3.intValue()) {
                    obj3 = next;
                    break;
                }
            }
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = (FantasyRoundPlayerUiModel) obj3;
            if (fantasyRoundPlayerUiModel3 != null) {
                m(fantasyRoundPlayerUiModel3);
            }
        }
    }

    public final void k() {
        Object obj;
        Object obj2;
        fdi fdiVar;
        Object value;
        List list = this.i;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((FantasyRoundPlayerUiModel) obj2).m) {
                    break;
                }
            }
        }
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj2;
        jof jofVar = this.n;
        Iterator<E> it2 = ((ll7) jofVar.a.getValue()).c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((FantasyRoundPlayerUiModel) next).m) {
                obj = next;
                break;
            }
        }
        boolean z = !Intrinsics.c(fantasyRoundPlayerUiModel, (FantasyRoundPlayerUiModel) obj);
        cp cpVar = new cp(new se7(7), 16);
        List H0 = CollectionsKt.H0(list, cpVar);
        ArrayList arrayList = new ArrayList(k13.r(H0, 10));
        Iterator it3 = H0.iterator();
        while (it3.hasNext()) {
            arrayList.add(Integer.valueOf(((FantasyRoundPlayerUiModel) it3.next()).a));
        }
        List H02 = CollectionsKt.H0(((ll7) jofVar.a.getValue()).c, cpVar);
        ArrayList arrayList2 = new ArrayList(k13.r(H02, 10));
        Iterator it4 = H02.iterator();
        while (it4.hasNext()) {
            arrayList2.add(Integer.valueOf(((FantasyRoundPlayerUiModel) it4.next()).a));
        }
        boolean z2 = !arrayList.equals(arrayList2) ? true : z;
        do {
            fdiVar = this.m;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, ll7.a((ll7) value, null, null, null, false, z2, false, false, 447)));
    }

    public final void l() {
        fdi fdiVar;
        Object value;
        ll7 ll7Var;
        ArrayList arrayList;
        this.s = null;
        this.t = null;
        do {
            fdiVar = this.m;
            value = fdiVar.getValue();
            ll7Var = (ll7) value;
            gv9 gv9Var = ll7Var.c;
            arrayList = new ArrayList(k13.r(gv9Var, 10));
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                arrayList.add(hkg.A((FantasyRoundPlayerUiModel) it.next()));
            }
        } while (!fdiVar.k(value, ll7.a(ll7Var, null, l6g.W(arrayList), null, false, false, false, false, 475)));
    }

    public final void m(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        fdi fdiVar;
        Object value;
        ll7 ll7Var;
        ArrayList arrayList;
        fantasyRoundPlayerUiModel.getClass();
        do {
            fdiVar = this.m;
            value = fdiVar.getValue();
            ll7Var = (ll7) value;
            gv9<FantasyRoundPlayerUiModel> gv9Var = ll7Var.c;
            arrayList = new ArrayList(k13.r(gv9Var, 10));
            for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 : gv9Var) {
                arrayList.add(FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel2, null, 0, false, false, fantasyRoundPlayerUiModel2.a == fantasyRoundPlayerUiModel.a, null, null, 536866815));
            }
        } while (!fdiVar.k(value, ll7.a(ll7Var, null, l6g.W(arrayList), null, false, false, false, false, PglCryptUtils.UNKNOWN_ERR)));
        k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        int i;
        List list;
        int i2;
        fantasyRoundPlayerUiModel.getClass();
        this.s = fantasyRoundPlayerUiModel;
        Throwable th = null;
        this.t = null;
        while (true) {
            fdi fdiVar = this.m;
            Object value = fdiVar.getValue();
            ll7 ll7Var = (ll7) value;
            gv9 gv9Var = ll7Var.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : gv9Var) {
                if (!((FantasyRoundPlayerUiModel) obj).k) {
                    arrayList.add(obj);
                }
            }
            rz6 rz6Var = fantasyRoundPlayerUiModel.b;
            rz6 rz6Var2 = rz6.h;
            if (rz6Var == rz6Var2) {
                list = a.c(rz6Var2);
            } else {
                if (arrayList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = arrayList.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((FantasyRoundPlayerUiModel) it.next()).b == rz6Var && (i = i + 1) < 0) {
                            b.p();
                            throw th;
                        }
                    }
                }
                if (i + 1 > rz6Var.e) {
                    list = km5.a;
                } else {
                    kp5 kp5Var = rz6.m;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : kp5Var) {
                        if (((rz6) obj2) != rz6.h) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        rz6 rz6Var3 = (rz6) it2.next();
                        if (arrayList.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator it3 = arrayList.iterator();
                            i2 = 0;
                            while (it3.hasNext()) {
                                if (((FantasyRoundPlayerUiModel) it3.next()).b == rz6Var3 && (i2 = i2 + 1) < 0) {
                                    b.p();
                                    throw th;
                                }
                            }
                        }
                        int i3 = i2 - 1;
                        int i4 = rz6Var3.d;
                        Throwable th2 = rz6Var3;
                        if (i3 < i4) {
                            th2 = th;
                        }
                        if (th2 != null) {
                            arrayList3.add(th2);
                        }
                    }
                    list = arrayList3;
                }
            }
            gv9<FantasyRoundPlayerUiModel> gv9Var2 = ll7Var.c;
            ArrayList arrayList4 = new ArrayList(k13.r(gv9Var2, 10));
            for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 : gv9Var2) {
                rz6 rz6Var4 = fantasyRoundPlayerUiModel2.b;
                boolean z = fantasyRoundPlayerUiModel2.k;
                boolean contains = list.contains(rz6Var4);
                rz6 rz6Var5 = fantasyRoundPlayerUiModel2.b;
                arrayList4.add(fantasyRoundPlayerUiModel2.a == fantasyRoundPlayerUiModel.a ? FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel2, yy6.SUBSTITUTING_IN, 0, false, false, false, null, null, 536870907) : (contains || (rz6Var5 == rz6Var && !z) || (z && rz6Var5 != rz6.h)) ? FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel2, yy6.AVAILABLE, 0, false, false, false, null, null, 536870907) : FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel2, null, 0, true, false, false, null, null, 536870891));
            }
            if (fdiVar.k(value, ll7.a(ll7Var, null, l6g.W(arrayList4), null, true, false, false, false, 475))) {
                return;
            } else {
                th = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel) {
        int i;
        List list;
        int i2;
        fantasyRoundPlayerUiModel.getClass();
        this.t = fantasyRoundPlayerUiModel;
        Throwable th = null;
        this.s = null;
        while (true) {
            fdi fdiVar = this.m;
            Object value = fdiVar.getValue();
            ll7 ll7Var = (ll7) value;
            gv9 gv9Var = ll7Var.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : gv9Var) {
                if (!((FantasyRoundPlayerUiModel) obj).k) {
                    arrayList.add(obj);
                }
            }
            rz6 rz6Var = fantasyRoundPlayerUiModel.b;
            rz6 rz6Var2 = rz6.h;
            boolean z = true;
            if (rz6Var == rz6Var2) {
                list = a.c(rz6Var2);
            } else {
                if (arrayList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = arrayList.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((FantasyRoundPlayerUiModel) it.next()).b == rz6Var && (i = i + 1) < 0) {
                            b.p();
                            throw th;
                        }
                    }
                }
                if (i - 1 < rz6Var.d) {
                    list = km5.a;
                } else {
                    kp5 kp5Var = rz6.m;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : kp5Var) {
                        if (((rz6) obj2) != rz6.h) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        rz6 rz6Var3 = (rz6) it2.next();
                        if (arrayList.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator it3 = arrayList.iterator();
                            i2 = 0;
                            while (it3.hasNext()) {
                                if (((FantasyRoundPlayerUiModel) it3.next()).b == rz6Var3 && (i2 = i2 + 1) < 0) {
                                    b.p();
                                    throw th;
                                }
                            }
                        }
                        int i3 = i2 + 1;
                        int i4 = rz6Var3.e;
                        Throwable th2 = rz6Var3;
                        if (i3 > i4) {
                            th2 = th;
                        }
                        if (th2 != null) {
                            arrayList3.add(th2);
                        }
                    }
                    list = arrayList3;
                }
            }
            gv9<FantasyRoundPlayerUiModel> gv9Var2 = ll7Var.c;
            ArrayList arrayList4 = new ArrayList(k13.r(gv9Var2, 10));
            for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 : gv9Var2) {
                rz6 rz6Var4 = fantasyRoundPlayerUiModel2.b;
                boolean z2 = fantasyRoundPlayerUiModel2.v;
                arrayList4.add(fantasyRoundPlayerUiModel2.a == fantasyRoundPlayerUiModel.a ? FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel2, yy6.SUBSTITUTING_OUT, 0, false, false, false, null, null, 536870907) : (z2 || !(((!list.contains(rz6Var4) || !fantasyRoundPlayerUiModel2.k || z2) ? false : z) || (rz6Var4 == rz6Var ? z : false))) ? FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel2, null, 0, true, false, false, null, null, 536870891) : FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel2, yy6.AVAILABLE, 0, false, false, false, null, null, 536870907));
                z = true;
            }
            if (fdiVar.k(value, ll7.a(ll7Var, null, l6g.W(arrayList4), null, false, false, false, false, PglCryptUtils.UNKNOWN_ERR))) {
                return;
            } else {
                th = null;
            }
        }
    }

    @Override // defpackage.mk7
    /* renamed from: p, reason: from getter */
    public final FantasyCompetitionType getR() {
        return this.r;
    }

    @Override // defpackage.mk7
    public final void q(il8 il8Var) {
        this.q.setValue(il8Var);
    }

    @Override // defpackage.mk7
    public final il8 r() {
        return (il8) ((eoh) this.q).getValue();
    }
}
