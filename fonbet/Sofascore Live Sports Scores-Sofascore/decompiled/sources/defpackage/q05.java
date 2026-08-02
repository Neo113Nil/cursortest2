package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.sofascore.localPersistence.database.AppDatabase;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.Country;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq05;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class q05 extends q8 {
    public final p1f e;
    public final bfk f;
    public final ti6 g;
    public final SharedPreferences h;
    public final AppDatabase i;
    public final NetworkCoroutineAPI j;
    public final joa k;
    public String l;
    public final fdi m;
    public final jof n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q05(Application application, p1f p1fVar, bfk bfkVar, ti6 ti6Var, SharedPreferences sharedPreferences, AppDatabase appDatabase, NetworkCoroutineAPI networkCoroutineAPI) {
        super(application);
        p1fVar.getClass();
        bfkVar.getClass();
        ti6Var.getClass();
        sharedPreferences.getClass();
        appDatabase.getClass();
        networkCoroutineAPI.getClass();
        this.e = p1fVar;
        this.f = bfkVar;
        this.g = ti6Var;
        this.h = sharedPreferences;
        this.i = appDatabase;
        this.j = networkCoroutineAPI;
        this.k = ypa.a(ysa.c, new wc4(12));
        fdi a = gdi.a(new j05(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, 268435455));
        this.m = a;
        this.n = un0.u(a);
        xw3.L(un0.z(this), null, null, new n05(this, null, 0), 3);
        Object obj = k48.l;
        ((k48) r38.c().b(l48.class)).c().addOnSuccessListener(new kt4(new kz3(this, 9), 1));
    }

    public final ArrayList k(mi6 mi6Var) {
        Collection collection;
        ri6 d = this.g.d(mi6Var);
        if (d == null || (collection = a.c(d)) == null) {
            collection = km5.a;
        }
        ArrayList arrayList = mi6Var.a;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zi6) it.next()).a);
        }
        ArrayList w0 = CollectionsKt.w0(arrayList2, collection);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = w0.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((ri6) next).a())) {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final void l() {
        Country country;
        Object obj;
        mi6 mi6Var;
        SharedPreferences d;
        ArrayList arrayList = dv3.a;
        List list = tv3.a;
        List H0 = CollectionsKt.H0(arrayList, tv3.b(i()));
        int i = ke0.c;
        Country country2 = new Country(0, "XX", "XXX", "None", "None");
        Iterator it = H0.iterator();
        while (true) {
            if (!it.hasNext()) {
                country = 0;
                break;
            } else {
                country = it.next();
                if (((Country) country).getMccList().contains(Integer.valueOf(i))) {
                    break;
                }
            }
        }
        Country country3 = country;
        Country country4 = country3 == null ? country2 : country3;
        List y = n9e.y(country4);
        Iterator it2 = y.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            String code = ((vuf) obj).getCode();
            Context i2 = i();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = i2.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            if (Intrinsics.c(code, sharedPreferences.getString("REGION_USER_LAST_REGION", null))) {
                break;
            }
        }
        vuf vufVar = (vuf) obj;
        if (vufVar == null) {
            vufVar = (vuf) CollectionsKt.firstOrNull(y);
        }
        vuf vufVar2 = vufVar;
        fdi fdiVar = this.m;
        while (true) {
            Object value = fdiVar.getValue();
            j05 j05Var = (j05) value;
            this.g.getClass();
            List list2 = l8f.b;
            mi6 mi6Var2 = (mi6) CollectionsKt.firstOrNull(list2 == null ? km5.a : list2);
            if (mi6Var2 != null) {
                m(mi6Var2);
            }
            String id = ((UserAccount) this.k.getValue()).getId();
            Calendar calendar = ke0.a;
            String d2 = ke0.d(i());
            String O = m6k.O(i());
            O.getClass();
            String str = this.l;
            if (str == null) {
                str = "";
            }
            List list3 = j05Var.q;
            String string = this.h.getString("DEV_NAME", Build.MODEL + " " + Build.MANUFACTURER);
            if (string == null) {
                string = "";
            }
            String str2 = string;
            this.g.getClass();
            if (list2 == null) {
                list2 = km5.a;
            }
            List list4 = list2;
            oo5 oo5Var = this.g.d;
            mi6 mi6Var3 = oo5Var != null ? oo5Var.a : null;
            ArrayList k = (oo5Var == null || (mi6Var = oo5Var.a) == null) ? null : k(mi6Var);
            oo5 oo5Var2 = this.g.d;
            ri6 ri6Var = oo5Var2 != null ? oo5Var2.b : null;
            ArrayList w0 = CollectionsKt.w0(H0, a.c(country2));
            xk b = pk.b(i(), true);
            kp5 kp5Var = tz4.g;
            List list5 = H0;
            int c = sub.c(k13.r(kp5Var, 10));
            Country country5 = country2;
            if (c < 16) {
                c = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(c);
            Iterator it3 = kp5Var.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                Iterator it4 = it3;
                Boolean bool = (Boolean) ((tz4) next).b.invoke(i());
                bool.getClass();
                linkedHashMap.put(next, bool);
                it3 = it4;
            }
            if (fdiVar.k(value, new j05(d2, id, O, str, str2, list4, mi6Var3, k, ri6Var, w0, y, b, country4, vufVar2, list3, linkedHashMap, !((UserAccount) this.k.getValue()).getHasServerAds() || ((UserAccount) this.k.getValue()).getPurchasedAds(), b.j("10FBB22F-30DD-417D-9AFA-69A544B3B46C", "12dd05bcd495e668", "69F29E47-298A-4B36-9860-415CBF03BDD7", "4ed25f3eee173ea2", "733C1F2B-6A39-4858-8583-331ADEF205FB", "0a118ced5be9cd67"), this.h.getString("DEV_MODE_SOFA_SEASON_ID", null), this.h.getBoolean("PREF_HAS_USED_ANALYST_TRIAL", false), 70647808))) {
                return;
            }
            H0 = list5;
            country2 = country5;
        }
    }

    public final void m(mi6 mi6Var) {
        fdi fdiVar;
        Object value;
        j05 j05Var;
        ArrayList k;
        oo5 oo5Var;
        do {
            fdiVar = this.m;
            value = fdiVar.getValue();
            j05Var = (j05) value;
            k = k(mi6Var);
            oo5Var = this.g.d;
        } while (!fdiVar.k(value, j05.a(j05Var, null, mi6Var, k, oo5Var != null ? mi6Var.equals(oo5Var.a) ? oo5Var.b : (ri6) CollectionsKt.firstOrNull(k) : null, null, null, null, null, null, null, false, null, null, false, false, null, false, 268434559)));
    }
}
