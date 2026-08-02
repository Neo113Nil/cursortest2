package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.InterfaceC4299s3;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.j;
import com.ironsource.mediationsdk.o;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.main.MainActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ep1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ep1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c1d C;
        switch (this.a) {
            case 0:
                dfj dfjVar = (dfj) this.b;
                ema emaVar = (ema) this.c;
                List list = (List) this.d;
                q80 q80Var = (q80) this.e;
                kx4 kx4Var = (kx4) this.f;
                sf8 sf8Var = (sf8) this.g;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    nnh h = snh.h();
                    c1d c1dVar = h instanceof c1d ? (c1d) h : null;
                    if (c1dVar == null || (C = c1dVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        nnh j = C.j();
                        try {
                            dfj C2 = g7a.C(dfjVar, emaVar);
                            if (list == null) {
                                list = km5.a;
                            }
                            p03 p03Var = new p03(q80Var, C2, list, kx4Var, sf8Var);
                            p03Var.c();
                            p03Var.d();
                            Unit unit = Unit.a;
                            nnh.q(j);
                            C.w().i();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            nnh.q(j);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                MainActivity mainActivity = (MainActivity) this.b;
                jqb jqbVar = (jqb) this.c;
                dsf dsfVar = (dsf) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                asf asfVar = (asf) this.f;
                String str = (String) this.g;
                if (mainActivity.Z) {
                    if (jqbVar != null) {
                        MainActivity.n0 = jqbVar == jqb.m;
                        dsfVar.a = arrayList.indexOf(jqbVar);
                    } else {
                        String str2 = y6f.a;
                        if (y6f.c(mainActivity, z6f.c) || asfVar.a) {
                            asfVar.a = false;
                            dsfVar.a = arrayList.indexOf(jqb.m);
                        } else if (y6f.c(mainActivity, z6f.e)) {
                            MainActivity.n0 = false;
                            int indexOf = arrayList.indexOf(jqb.o);
                            Integer valueOf = Integer.valueOf(indexOf);
                            if (indexOf == -1) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                dsfVar.a = valueOf.intValue();
                            }
                        } else if (y6f.c(mainActivity, z6f.d)) {
                            MainActivity.n0 = false;
                            int indexOf2 = arrayList.indexOf(jqb.p);
                            Integer valueOf2 = Integer.valueOf(indexOf2);
                            if (indexOf2 == -1) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                dsfVar.a = valueOf2.intValue();
                            }
                        }
                    }
                }
                if (mainActivity.f0) {
                    mainActivity.f0 = false;
                    dsfVar.a = 0;
                }
                boolean z = mainActivity.Z;
                mainActivity.Z = false;
                int i = dsfVar.a;
                jqb jqbVar2 = (jqb) ((i < 0 || i >= arrayList.size()) ? (jqb) CollectionsKt.Y(arrayList) : arrayList.get(i));
                String string = mainActivity.A().getString("PREF_HOME_SPORT_V2", "");
                if (string == null) {
                    string = "";
                }
                if (string.length() > 0 && !str.equals(string)) {
                    FirebaseBundle firebaseBundle = new FirebaseBundle();
                    firebaseBundle.putString("name", str);
                    ia0 ia0Var = ia0.q;
                    ((f5d) me4.e()).c("change_sport", firebaseBundle);
                    FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(mainActivity);
                    firebaseAnalytics.getClass();
                    firebaseAnalytics.a.e(n9e.K(firebaseBundle), null, "change_sport", false);
                }
                s38 a = s38.a();
                String str3 = SearchResponseKt.SPORT_ENTITY;
                nw3 nw3Var = a.a;
                ((xx3) nw3Var.o.b).g(new p3(11, nw3Var, str3, str));
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = mainActivity.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putString("PREF_HOME_SPORT_V2", str);
                Unit unit2 = Unit.a;
                edit.apply();
                Calendar calendar = ke0.a;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.getClass();
                ke0.a = calendar2;
                mainActivity.a0();
                mainActivity.Q().c.setCalendarLogic(mainActivity.R());
                mainActivity.c0(jqbVar2);
                mainActivity.b0(jqbVar2);
                if (mainActivity.W().l.size() != arrayList.size()) {
                    mainActivity.Q().j.c(dsfVar.a, false);
                }
                if (z) {
                    iqb W = mainActivity.W();
                    W.getClass();
                    ArrayList arrayList2 = W.l;
                    int size = arrayList2.size();
                    W.p = str;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    long indexOf3 = (Sports.INSTANCE.getEntries().indexOf(str) + 1) * 1000;
                    int c = sub.c(k13.r(arrayList2, 10));
                    if (c < 16) {
                        c = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        linkedHashMap.put(next, Long.valueOf(r13.ordinal() + (((jqb) next).g ? indexOf3 : 0L)));
                    }
                    W.q = linkedHashMap;
                    W.notifyItemRangeChanged(0, size);
                    wrf.d(W.j, Math.max(1, W.l.size() - 1));
                }
                mainActivity.f0(arrayList);
                mainActivity.Q().b.setupWithViewPager(mainActivity.Q().j);
                mainActivity.Q().j.a(mainActivity.m0);
                mainActivity.W().G(true);
                mainActivity.a0 = true;
                jqb jqbVar3 = mainActivity.b0;
                if (jqbVar3 == null) {
                    mainActivity.Q().j.c(dsfVar.a, false);
                    return;
                } else {
                    mainActivity.b0 = null;
                    mainActivity.Q().j.c(mainActivity.W().D(jqbVar3), false);
                    return;
                }
            default:
                j.a((o) this.b, (View) this.c, (ISBannerSize) this.d, (Context) this.e, (FrameLayout.LayoutParams) this.f, (InterfaceC4299s3) this.g);
                return;
        }
    }
}
