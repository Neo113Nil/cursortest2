package s7;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p4;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e2 extends z {

    /* renamed from: c, reason: collision with root package name */
    public com.google.firebase.messaging.m f22696c;

    /* renamed from: d, reason: collision with root package name */
    public x5.h f22697d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f22698e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22699f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f22700g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f22701h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22702i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public u1 f22703k;

    /* renamed from: l, reason: collision with root package name */
    public u1 f22704l;

    /* renamed from: m, reason: collision with root package name */
    public PriorityQueue f22705m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22706n;

    /* renamed from: o, reason: collision with root package name */
    public q1 f22707o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicLong f22708p;
    public long q;

    /* renamed from: r, reason: collision with root package name */
    public final x0 f22709r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22710s;

    /* renamed from: t, reason: collision with root package name */
    public u1 f22711t;

    /* renamed from: u, reason: collision with root package name */
    public d2 f22712u;

    /* renamed from: v, reason: collision with root package name */
    public u1 f22713v;

    /* renamed from: w, reason: collision with root package name */
    public final r7.a f22714w;

    public e2(f1 f1Var) {
        super(f1Var);
        this.f22698e = new CopyOnWriteArraySet();
        this.f22701h = new Object();
        this.f22702i = false;
        this.j = 1;
        this.f22710s = true;
        this.f22714w = new r7.a(7, this);
        this.f22700g = new AtomicReference();
        this.f22707o = q1.f22964c;
        this.q = -1L;
        this.f22708p = new AtomicLong(0L);
        this.f22709r = new x0(f1Var, 3);
    }

    public final void A(Boolean bool, boolean z5) {
        j();
        k();
        f1 f1Var = (f1) this.f3328a;
        n0 n0Var = f1Var.f22745f;
        f1.m(n0Var);
        n0Var.f22909m.b(bool, "Setting app measurement enabled (FE)");
        v0 v0Var = f1Var.f22744e;
        f1.k(v0Var);
        v0Var.j();
        SharedPreferences.Editor edit = v0Var.n().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z5) {
            v0Var.j();
            SharedPreferences.Editor edit2 = v0Var.n().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        d1Var.j();
        if (f1Var.f22763z || !(bool == null || bool.booleanValue())) {
            B();
        }
    }

    public final void B() {
        j();
        f1 f1Var = (f1) this.f3328a;
        v0 v0Var = f1Var.f22744e;
        n0 n0Var = f1Var.f22745f;
        q6.a aVar = f1Var.f22749k;
        f1.k(v0Var);
        String h10 = v0Var.f23133m.h();
        if (h10 != null) {
            if ("unset".equals(h10)) {
                aVar.getClass();
                u(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(h10) ? 0L : 1L);
                aVar.getClass();
                u(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!f1Var.d() || !this.f22710s) {
            f1.m(n0Var);
            n0Var.f22909m.a("Updating Scion state (FE)");
            y2 p10 = f1Var.p();
            p10.j();
            p10.k();
            p10.x(new t2(p10, p10.z(true), 3));
            return;
        }
        f1.m(n0Var);
        n0Var.f22909m.a("Recording app launch after enabling measurement for the first time (FE)");
        v();
        f3 f3Var = f1Var.f22747h;
        f1.l(f3Var);
        f3Var.f22766e.j();
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        d1Var.s(new t1(this, 1));
    }

    public final void C() {
        f1 f1Var = (f1) this.f3328a;
        if (!(f1Var.f22740a.getApplicationContext() instanceof Application) || this.f22696c == null) {
            return;
        }
        ((Application) f1Var.f22740a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f22696c);
    }

    public final void D(Bundle bundle, int i5, long j) {
        Boolean bool;
        String str;
        n1 n1Var;
        f1 f1Var = (f1) this.f3328a;
        k();
        q1 q1Var = q1.f22964c;
        p1[] p1VarArr = o1.STORAGE.f22928a;
        int length = p1VarArr.length;
        int i10 = 0;
        while (true) {
            bool = null;
            if (i10 >= length) {
                str = null;
                break;
            }
            String str2 = p1VarArr[i10].f22944a;
            if (bundle.containsKey(str2) && (str = bundle.getString(str2)) != null) {
                if ((str.equals("granted") ? Boolean.TRUE : str.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i10++;
        }
        if (str != null) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22907k.b(str, "Ignoring invalid consent setting");
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22907k.a("Valid consent values are 'granted', 'denied'");
        }
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        boolean p10 = d1Var.p();
        q1 b10 = q1.b(i5, bundle);
        Iterator it = b10.f22965a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            n1Var = n1.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((n1) it.next()) != n1Var) {
                F(b10, p10);
                break;
            }
        }
        l c2 = l.c(i5, bundle);
        Iterator it2 = c2.f22865e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((n1) it2.next()) != n1Var) {
                E(c2, p10);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = q1.d(bundle.getString("ad_personalization")).ordinal();
            if (ordinal == 2) {
                bool = Boolean.FALSE;
            } else if (ordinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str3 = i5 == -30 ? "tcf" : "app";
            if (p10) {
                u(j, bool.toString(), str3, "allow_personalized_ads");
            } else {
                t(str3, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void E(l lVar, boolean z5) {
        w0 w0Var = new w0(5, this, lVar);
        if (z5) {
            j();
            w0Var.run();
        } else {
            d1 d1Var = ((f1) this.f3328a).f22746g;
            f1.m(d1Var);
            d1Var.s(w0Var);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:75:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void F(s7.q1 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.e2.F(s7.q1, boolean):void");
    }

    public final void G() {
        o8.a();
        f1 f1Var = (f1) this.f3328a;
        e eVar = f1Var.f22743d;
        d1 d1Var = f1Var.f22746g;
        n0 n0Var = f1Var.f22745f;
        if (eVar.t(null, x.R0)) {
            f1.m(d1Var);
            if (d1Var.p()) {
                f1.m(n0Var);
                n0Var.f22903f.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (md.o.f()) {
                f1.m(n0Var);
                n0Var.f22903f.a("Cannot get trigger URIs from main thread");
                return;
            }
            k();
            f1.m(n0Var);
            n0Var.f22910n.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            f1.m(d1Var);
            d1Var.t(atomicReference, 10000L, "get trigger URIs", new y1(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                f1.m(n0Var);
                n0Var.f22905h.a("Timed out waiting for get trigger URIs");
            } else {
                f1.m(d1Var);
                d1Var.s(new Runnable() { // from class: s7.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        e2 e2Var = e2.this;
                        e2Var.j();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        v0 v0Var = ((f1) e2Var.f3328a).f22744e;
                        f1.k(v0Var);
                        SparseArray p10 = v0Var.p();
                        for (zzoh zzohVar : list) {
                            int i5 = zzohVar.f5803c;
                            if (!p10.contains(i5) || ((Long) p10.get(i5)).longValue() < zzohVar.f5802b) {
                                e2Var.H().add(zzohVar);
                            }
                        }
                        e2Var.I();
                    }
                });
            }
        }
    }

    public final PriorityQueue H() {
        if (this.f22705m == null) {
            this.f22705m = new PriorityQueue(Comparator.CC.comparing(c2.f22673a, androidx.coordinatorlayout.widget.i.f1246b));
        }
        return this.f22705m;
    }

    public final void I() {
        zzoh zzohVar;
        j();
        this.f22706n = false;
        if (H().isEmpty() || this.f22702i || (zzohVar = (zzoh) H().poll()) == null) {
            return;
        }
        f1 f1Var = (f1) this.f3328a;
        v3 v3Var = f1Var.f22748i;
        f1.k(v3Var);
        g2.b E = v3Var.E();
        if (E != null) {
            this.f22702i = true;
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            l0 l0Var = n0Var.f22910n;
            String str = zzohVar.f5801a;
            l0Var.b(str, "Registering trigger URI");
            g8.b e7 = E.e(Uri.parse(str));
            if (e7 != null) {
                e7.a(new g8.a(0, e7, new io.sentry.internal.debugmeta.c(14, (Object) this, (Object) zzohVar, false)), new e5.p(3, this));
            } else {
                this.f22702i = false;
                H().add(zzohVar);
            }
        }
    }

    @Override // s7.z
    public final boolean m() {
        return false;
    }

    public final void n(q1 q1Var) {
        j();
        boolean z5 = (q1Var.i(p1.ANALYTICS_STORAGE) && q1Var.i(p1.AD_STORAGE)) || ((f1) this.f3328a).p().s();
        f1 f1Var = (f1) this.f3328a;
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        d1Var.j();
        if (z5 != f1Var.f22763z) {
            d1 d1Var2 = f1Var.f22746g;
            f1.m(d1Var2);
            d1Var2.j();
            f1Var.f22763z = z5;
            v0 v0Var = ((f1) this.f3328a).f22744e;
            f1.k(v0Var);
            v0Var.j();
            Boolean valueOf = v0Var.n().contains("measurement_enabled_from_api") ? Boolean.valueOf(v0Var.n().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z5 || valueOf == null || valueOf.booleanValue()) {
                A(Boolean.valueOf(z5), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(String str, String str2, Bundle bundle, boolean z5, boolean z7, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z10 = !z7 || this.f22697d == null || v3.J(str2);
            if (str == null) {
                str = "app";
            }
            String str3 = str;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i5 = 0; i5 < parcelableArr.length; i5++) {
                        Parcelable parcelable = parcelableArr[i5];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i5] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            d1 d1Var = ((f1) this.f3328a).f22746g;
            f1.m(d1Var);
            d1Var.s(new x1(this, str3, str2, j, bundle3, z7, z10, z5));
            return;
        }
        o2 o2Var = ((f1) this.f3328a).f22750l;
        f1.l(o2Var);
        synchronized (o2Var.f22937l) {
            try {
                if (!o2Var.f22936k) {
                    n0 n0Var = ((f1) o2Var.f3328a).f22745f;
                    f1.m(n0Var);
                    n0Var.f22907k.a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((f1) o2Var.f3328a).f22743d.getClass();
                    }
                    n0 n0Var2 = ((f1) o2Var.f3328a).f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22907k.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((f1) o2Var.f3328a).f22743d.getClass();
                    }
                    n0 n0Var3 = ((f1) o2Var.f3328a).f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22907k.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    zzdf zzdfVar = o2Var.f22933g;
                    string2 = zzdfVar != null ? o2Var.q(zzdfVar.f5389b) : "Activity";
                }
                String str5 = string2;
                l2 l2Var = o2Var.f22929c;
                if (o2Var.f22934h && l2Var != null) {
                    o2Var.f22934h = false;
                    boolean equals = Objects.equals(l2Var.f22872b, str5);
                    boolean equals2 = Objects.equals(l2Var.f22871a, string);
                    if (equals && equals2) {
                        n0 n0Var4 = ((f1) o2Var.f3328a).f22745f;
                        f1.m(n0Var4);
                        n0Var4.f22907k.a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                f1 f1Var = (f1) o2Var.f3328a;
                n0 n0Var5 = f1Var.f22745f;
                f1.m(n0Var5);
                n0Var5.f22910n.c(string == null ? "null" : string, str5 == null ? "null" : str5, "Logging screen view with name, class");
                l2 l2Var2 = o2Var.f22929c == null ? o2Var.f22930d : o2Var.f22929c;
                v3 v3Var = f1Var.f22748i;
                f1.k(v3Var);
                l2 l2Var3 = new l2(string, str5, v3Var.h0(), true, j);
                o2Var.f22929c = l2Var3;
                o2Var.f22930d = l2Var2;
                o2Var.f22935i = l2Var3;
                f1Var.f22749k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                d1 d1Var2 = f1Var.f22746g;
                f1.m(d1Var2);
                d1Var2.s(new h1(o2Var, bundle2, l2Var3, l2Var2, elapsedRealtime));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p() {
        n0 n0Var;
        String str;
        int i5;
        int i10;
        int i11;
        int i12;
        g3 g3Var;
        g3 g3Var2;
        e2 e2Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str2;
        p4 p4Var;
        f8.q a7;
        j();
        f1 f1Var = (f1) this.f3328a;
        n0 n0Var2 = f1Var.f22745f;
        q6.a aVar = f1Var.f22749k;
        f1.m(n0Var2);
        n0Var2.f22909m.a("Handle tcf update.");
        v0 v0Var = f1Var.f22744e;
        f1.k(v0Var);
        SharedPreferences o3 = v0Var.o();
        HashMap hashMap = new HashMap();
        w wVar = x.f23175a1;
        int i20 = 2;
        int i21 = 1;
        if (((Boolean) wVar.a(null)).booleanValue()) {
            f8.l lVar = i3.f22811a;
            o4 o4Var = o4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            n0Var = n0Var2;
            h3 h3Var = h3.f22796a;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(o4Var, h3Var);
            o4 o4Var2 = o4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            h3 h3Var2 = h3.f22797b;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(o4Var2, h3Var2);
            o4 o4Var3 = o4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(o4Var3, h3Var);
            o4 o4Var4 = o4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(o4Var4, h3Var);
            o4 o4Var5 = o4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List asList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(o4Var5, h3Var2), new AbstractMap.SimpleImmutableEntry(o4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, h3Var2), new AbstractMap.SimpleImmutableEntry(o4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, h3Var2));
            androidx.transition.n0 n0Var3 = new androidx.transition.n0(asList != null ? asList.size() : 4);
            n0Var3.g(asList);
            f8.q a10 = n0Var3.a();
            int i22 = f8.j.f9512c;
            f8.s sVar = new f8.s("CH");
            char[] cArr = new char[5];
            boolean contains = o3.contains("IABTCF_TCString");
            try {
                i13 = o3.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i13 = -1;
            }
            try {
                i14 = o3.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused2) {
                i14 = -1;
            }
            try {
                i15 = o3.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused3) {
                i15 = -1;
            }
            int i23 = i14;
            try {
                i16 = o3.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused4) {
                i16 = -1;
            }
            try {
                i17 = o3.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused5) {
                i17 = -1;
            }
            String a11 = i3.a(o3, "IABTCF_PublisherCC");
            int i24 = i13;
            androidx.transition.n0 n0Var4 = new androidx.transition.n0(4);
            f8.o oVar = a10.f9509b;
            if (oVar == null) {
                str2 = a11;
                i18 = i16;
                i19 = i17;
                f8.o oVar2 = new f8.o(a10, new f8.p(0, a10.f9531f, a10.f9530e));
                a10.f9509b = oVar2;
                oVar = oVar2;
            } else {
                i18 = i16;
                i19 = i17;
                str2 = a11;
            }
            f8.t it = oVar.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                p4Var = p4.PURPOSE_RESTRICTION_UNDEFINED;
                if (!hasNext) {
                    break;
                }
                o4 o4Var6 = (o4) it.next();
                int a12 = o4Var6.a();
                f8.t tVar = it;
                f8.q qVar = a10;
                StringBuilder sb2 = new StringBuilder(String.valueOf(a12).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(a12);
                String a13 = i3.a(o3, sb2.toString());
                if (!TextUtils.isEmpty(a13) && a13.length() >= 755) {
                    int digit = Character.digit(a13.charAt(754), 10);
                    p4 p4Var2 = p4.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    if (digit < 0 || digit > p4.values().length || digit == 0) {
                        p4Var = p4Var2;
                    } else if (digit == i21) {
                        p4Var = p4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    } else if (digit == i20) {
                        p4Var = p4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    }
                }
                n0Var4.f(o4Var6, p4Var);
                it = tVar;
                a10 = qVar;
                i20 = 2;
                i21 = 1;
            }
            f8.q qVar2 = a10;
            f8.q a14 = n0Var4.a();
            String a15 = i3.a(o3, "IABTCF_PurposeConsents");
            String a16 = i3.a(o3, "IABTCF_VendorConsents");
            boolean z5 = !TextUtils.isEmpty(a16) && a16.length() >= 755 && a16.charAt(754) == '1';
            String a17 = i3.a(o3, "IABTCF_PurposeLegitimateInterests");
            String a18 = i3.a(o3, "IABTCF_VendorLegitimateInterests");
            boolean z7 = !TextUtils.isEmpty(a18) && a18.length() >= 755 && a18.charAt(754) == '1';
            cArr[0] = '2';
            if (contains) {
                p4 p4Var3 = (p4) a14.get(o4Var);
                p4 p4Var4 = (p4) a14.get(o4Var3);
                p4 p4Var5 = (p4) a14.get(o4Var4);
                p4 p4Var6 = (p4) a14.get(o4Var5);
                androidx.transition.n0 n0Var5 = new androidx.transition.n0(4);
                n0Var5.f("Version", "2");
                boolean z10 = z5;
                n0Var5.f("VendorConsent", true != z5 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                boolean z11 = z7;
                n0Var5.f("VendorLegitimateInterest", true != z7 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                n0Var5.f("gdprApplies", i15 != 1 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                int i25 = i19;
                n0Var5.f("EnableAdvertiserConsentMode", i25 != 1 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                n0Var5.f("PolicyVersion", String.valueOf(i23));
                n0Var5.f("CmpSdkID", String.valueOf(i24));
                int i26 = i18;
                n0Var5.f("PurposeOneTreatment", i26 != 1 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                String str3 = str2;
                n0Var5.f("PublisherCC", str3);
                n0Var5.f("PublisherRestrictions1", String.valueOf(p4Var3 != null ? p4Var3.a() : p4Var.a()));
                n0Var5.f("PublisherRestrictions3", String.valueOf(p4Var4 != null ? p4Var4.a() : p4Var.a()));
                n0Var5.f("PublisherRestrictions4", String.valueOf(p4Var5 != null ? p4Var5.a() : p4Var.a()));
                n0Var5.f("PublisherRestrictions7", String.valueOf(p4Var6 != null ? p4Var6.a() : p4Var.a()));
                String d10 = i3.d(o4Var, a15, a17);
                String d11 = i3.d(o4Var3, a15, a17);
                String d12 = i3.d(o4Var4, a15, a17);
                String d13 = i3.d(o4Var5, a15, a17);
                k2.x.e("Purpose1", d10);
                k2.x.e("Purpose3", d11);
                k2.x.e("Purpose4", d12);
                k2.x.e("Purpose7", d13);
                n0Var5.g(f8.q.c(4, new Object[]{"Purpose1", d10, "Purpose3", d11, "Purpose4", d12, "Purpose7", d13}, null).entrySet());
                int i27 = i15;
                n0Var5.g(f8.q.c(5, new Object[]{"AuthorizePurpose1", true != i3.b(o4Var, qVar2, a14, sVar, cArr, i25, i27, i26, str3, a15, a17, z10, z11) ? CommonUrlParts.Values.FALSE_INTEGER : "1", "AuthorizePurpose3", true != i3.b(o4Var3, qVar2, a14, sVar, cArr, i25, i27, i26, str3, a15, a17, z10, z11) ? CommonUrlParts.Values.FALSE_INTEGER : "1", "AuthorizePurpose4", true != i3.b(o4Var4, qVar2, a14, sVar, cArr, i25, i27, i26, str3, a15, a17, z10, z11) ? CommonUrlParts.Values.FALSE_INTEGER : "1", "AuthorizePurpose7", true != i3.b(o4Var5, qVar2, a14, sVar, cArr, i25, i27, i26, str3, a15, a17, z10, z11) ? CommonUrlParts.Values.FALSE_INTEGER : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                a7 = n0Var5.a();
            } else {
                a7 = f8.q.f9528g;
            }
            g3Var = new g3(a7);
            str = "";
        } else {
            n0Var = n0Var2;
            String a19 = i3.a(o3, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(a19) && a19.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(a19.charAt(754)));
            }
            try {
                i5 = o3.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i5 = -1;
            }
            if (i5 != -1) {
                hashMap.put("gdprApplies", String.valueOf(i5));
            }
            try {
                i10 = o3.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i10 = -1;
            }
            if (i10 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(i10));
            }
            try {
                i11 = o3.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i11 = -1;
            }
            if (i11 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(i11));
            }
            String a20 = i3.a(o3, "IABTCF_PurposeConsents");
            if (!str.equals(a20)) {
                hashMap.put("PurposeConsents", a20);
            }
            try {
                i12 = o3.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i12 = -1;
            }
            if (i12 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(i12));
            }
            g3Var = new g3(hashMap);
        }
        f1.m(n0Var);
        n0 n0Var6 = n0Var;
        l0 l0Var = n0Var6.f22910n;
        l0Var.b(g3Var, "Tcf preferences read");
        if (!f1Var.f22743d.t(null, wVar)) {
            if (v0Var.r(g3Var)) {
                Bundle b10 = g3Var.b();
                f1.m(n0Var6);
                l0Var.b(b10, "Consent generated from Tcf");
                if (b10 != Bundle.EMPTY) {
                    aVar.getClass();
                    D(b10, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", g3Var.c());
                q("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        v0Var.j();
        String string = v0Var.n().getString("stored_tcf_param", str);
        HashMap hashMap2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            g3Var2 = new g3(hashMap2);
        } else {
            for (String str4 : string.split(";")) {
                String[] split = str4.split("=");
                if (split.length >= 2 && i3.f22811a.contains(split[0])) {
                    hashMap2.put(split[0], split[1]);
                }
            }
            g3Var2 = new g3(hashMap2);
        }
        if (v0Var.r(g3Var)) {
            Bundle b11 = g3Var.b();
            f1.m(n0Var6);
            l0Var.b(b11, "Consent generated from Tcf");
            if (b11 != Bundle.EMPTY) {
                aVar.getClass();
                e2Var = this;
                e2Var.D(b11, -30, System.currentTimeMillis());
            } else {
                e2Var = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap hashMap3 = g3Var2.f22782a;
            String str5 = (hashMap3.isEmpty() || ((String) hashMap3.get("Version")) != null) ? CommonUrlParts.Values.FALSE_INTEGER : "1";
            Bundle b12 = g3Var.b();
            Bundle b13 = g3Var2.b();
            bundle2.putString("_tcfm", str5.concat((b12.size() == b13.size() && Objects.equals(b12.getString("ad_storage"), b13.getString("ad_storage")) && Objects.equals(b12.getString("ad_personalization"), b13.getString("ad_personalization")) && Objects.equals(b12.getString("ad_user_data"), b13.getString("ad_user_data"))) ? CommonUrlParts.Values.FALSE_INTEGER : "1"));
            String str6 = (String) g3Var.f22782a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str6)) {
                str6 = "200000";
            }
            bundle2.putString("_tcfd2", str6);
            bundle2.putString("_tcfd", g3Var.c());
            e2Var.q("auto", "_tcf", bundle2);
        }
    }

    public final void q(String str, String str2, Bundle bundle) {
        j();
        ((f1) this.f3328a).f22749k.getClass();
        r(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void r(long j, Bundle bundle, String str, String str2) {
        j();
        boolean z5 = true;
        if (this.f22697d != null && !v3.J(str2)) {
            z5 = false;
        }
        s(str, str2, j, bundle, true, z5, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x052a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021f  */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(String str, String str2, long j, Bundle bundle, boolean z5, boolean z7, boolean z10) {
        boolean z11;
        v0 v0Var;
        q6.a aVar;
        v0 v0Var2;
        q6.a aVar2;
        n0 n0Var;
        e eVar;
        ?? r15;
        e2 e2Var;
        v3 v3Var;
        v3 v3Var2;
        v0 v0Var3;
        l2 p10;
        f1 f1Var;
        boolean z12;
        long j6;
        boolean a7;
        e2 e2Var2;
        long j10;
        long j11;
        String str3;
        String str4;
        o2 o2Var;
        v3 v3Var3;
        int size;
        int i5;
        int i10;
        boolean q;
        Iterator it;
        f1 f1Var2;
        com.google.android.gms.internal.measurement.q0 q0Var;
        Parcel O;
        Bundle[] bundleArr;
        int i11;
        int i12;
        g6.v.e(str);
        g6.v.h(bundle);
        j();
        k();
        f1 f1Var3 = (f1) this.f3328a;
        boolean d10 = f1Var3.d();
        f3 f3Var = f1Var3.f22747h;
        e eVar2 = f1Var3.f22743d;
        Context context = f1Var3.f22740a;
        v3 v3Var4 = f1Var3.f22748i;
        n0 n0Var2 = f1Var3.f22745f;
        if (!d10) {
            f1.m(n0Var2);
            n0Var2.f22909m.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = f1Var3.r().f22734k;
        if (list != null && !list.contains(str2)) {
            f1.m(n0Var2);
            n0Var2.f22909m.c(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (this.f22699f) {
            z11 = false;
        } else {
            this.f22699f = true;
            try {
                z11 = false;
                try {
                    try {
                        (!f1Var3.f22741b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                    } catch (Exception e7) {
                        f1.m(n0Var2);
                        n0Var2.f22906i.b(e7, "Failed to invoke Tag Manager's initialize() method");
                    }
                } catch (ClassNotFoundException unused) {
                    f1.m(n0Var2);
                    n0Var2.f22908l.a("Tag Manager is not found and thus will not be used");
                    i0 i0Var = f1Var3.j;
                    v0Var = f1Var3.f22744e;
                    aVar = f1Var3.f22749k;
                    if (eVar2.t(null, x.f23191g1)) {
                    }
                    v0Var2 = v0Var;
                    aVar2 = aVar;
                    n0Var = n0Var2;
                    eVar = eVar2;
                    r15 = z11;
                    e2Var = this;
                    v3Var = v3Var4;
                    if (z5) {
                    }
                    v3Var2 = v3Var;
                    v0Var3 = v0Var2;
                    r7.a aVar3 = e2Var.f22714w;
                    if (!z10) {
                        f1.k(v3Var2);
                        if (v3Var2.l0("event", str2)) {
                        }
                        i11 = 40;
                        if (i12 != 0) {
                        }
                    }
                    n0 n0Var3 = n0Var;
                    o2 o2Var2 = f1Var3.f22750l;
                    f1.l(o2Var2);
                    p10 = o2Var2.p(false);
                    if (p10 != null) {
                    }
                    f1Var = f1Var3;
                    v3.c0(p10, bundle, (z5 || z10) ? false : true);
                    boolean equals = "am".equals(str);
                    boolean J = v3.J(str2);
                    if (z5) {
                    }
                    if (f1Var.h()) {
                    }
                }
            } catch (ClassNotFoundException unused2) {
                z11 = false;
            }
        }
        i0 i0Var2 = f1Var3.j;
        v0Var = f1Var3.f22744e;
        aVar = f1Var3.f22749k;
        if (eVar2.t(null, x.f23191g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            aVar.getClass();
            n0Var = n0Var2;
            eVar = eVar2;
            r15 = z11;
            v3Var = v3Var4;
            aVar2 = aVar;
            v0Var2 = v0Var;
            e2Var = this;
            e2Var.u(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            v0Var2 = v0Var;
            aVar2 = aVar;
            n0Var = n0Var2;
            eVar = eVar2;
            r15 = z11;
            e2Var = this;
            v3Var = v3Var4;
        }
        if (z5 || v3.j[r15].equals(str2)) {
            v3Var2 = v3Var;
            v0Var3 = v0Var2;
        } else {
            f1.k(v3Var);
            f1.k(v0Var2);
            v0Var3 = v0Var2;
            v3Var2 = v3Var;
            v3Var2.u(bundle, v0Var3.f23144y.R());
        }
        r7.a aVar32 = e2Var.f22714w;
        if (!z10 && !"_iap".equals(str2)) {
            f1.k(v3Var2);
            if (v3Var2.l0("event", str2)) {
                i12 = 2;
            } else if (v3Var2.n0("event", r1.f22975a, r1.f22976b, str2)) {
                ((f1) v3Var2.f3328a).getClass();
                i11 = 40;
                i12 = !v3Var2.o0(40, "event", str2) ? 2 : 0;
                if (i12 != 0) {
                    f1.m(n0Var);
                    n0Var.f22905h.b(i0Var2.a(str2), "Invalid public event name. Event will not be logged (FE)");
                    f1.k(v3Var2);
                    v3.z(aVar32, null, i12, "_ev", v3.o(str2, i11, true), str2 != null ? str2.length() : 0);
                    return;
                }
            } else {
                i12 = 13;
            }
            i11 = 40;
            if (i12 != 0) {
            }
        }
        n0 n0Var32 = n0Var;
        o2 o2Var22 = f1Var3.f22750l;
        f1.l(o2Var22);
        p10 = o2Var22.p(false);
        if (p10 != null || bundle.containsKey("_sc")) {
            f1Var = f1Var3;
        } else {
            f1Var = f1Var3;
            p10.f22874d = true;
        }
        v3.c0(p10, bundle, (z5 || z10) ? false : true);
        boolean equals2 = "am".equals(str);
        boolean J2 = v3.J(str2);
        if (z5) {
            z12 = equals2;
        } else {
            z12 = equals2;
            if (e2Var.f22697d != null && !J2) {
                if (!z12) {
                    f1.m(n0Var32);
                    n0Var32.f22909m.c(i0Var2.a(str2), i0Var2.e(bundle), "Passing event to registered event handler (FE)");
                    g6.v.h(e2Var.f22697d);
                    x5.h hVar = e2Var.f22697d;
                    hVar.getClass();
                    try {
                        com.google.android.gms.internal.measurement.q0 q0Var2 = (com.google.android.gms.internal.measurement.q0) ((com.google.android.gms.internal.measurement.s0) hVar.f25409a);
                        Parcel O2 = q0Var2.O();
                        O2.writeString(str);
                        O2.writeString(str2);
                        com.google.android.gms.internal.measurement.z.b(O2, bundle);
                        O2.writeLong(j);
                        q0Var2.P(O2, 1);
                    } catch (RemoteException e9) {
                        f1 f1Var4 = ((AppMeasurementDynamiteService) hVar.f25410b).f5780a;
                        if (f1Var4 != null) {
                            n0 n0Var4 = f1Var4.f22745f;
                            f1.m(n0Var4);
                            n0Var4.f22906i.b(e9, "Event interceptor threw exception");
                        }
                    }
                }
                z12 = true;
            }
        }
        if (f1Var.h()) {
            f1.k(v3Var2);
            f1 f1Var5 = (f1) v3Var2.f3328a;
            int p02 = v3Var2.p0(str2);
            if (p02 != 0) {
                f1.m(n0Var32);
                n0Var32.f22905h.b(i0Var2.a(str2), "Invalid event name. Event will not be logged (FE)");
                String o3 = v3.o(str2, 40, true);
                int length = str2 != null ? str2.length() : 0;
                f1.k(v3Var2);
                v3.z(aVar32, null, p02, "_ev", o3, length);
                return;
            }
            Bundle r5 = v3Var2.r(str2, bundle, DesugarCollections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z10);
            g6.v.h(r5);
            f1.l(o2Var22);
            if (o2Var22.p(false) == null || !"_ae".equals(str2)) {
                j6 = 0;
            } else {
                f1.l(f3Var);
                io.sentry.android.replay.gestures.c cVar = f3Var.f22767f;
                j6 = 0;
                ((f1) ((f3) cVar.f16042a).f3328a).f22749k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = elapsedRealtime - cVar.f16044c;
                cVar.f16044c = elapsedRealtime;
                if (j12 > 0) {
                    v3Var2.S(r5, j12);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                String string2 = r5.getString("_ffr");
                int i13 = q6.e.f22050a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                v0 v0Var4 = f1Var5.f22744e;
                f1.k(v0Var4);
                if (Objects.equals(string2, v0Var4.f23141v.h())) {
                    n0 n0Var5 = f1Var5.f22745f;
                    f1.m(n0Var5);
                    n0Var5.f22909m.a("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    v0 v0Var5 = f1Var5.f22744e;
                    f1.k(v0Var5);
                    v0Var5.f23141v.i(string2);
                }
            } else if ("_ae".equals(str2)) {
                v0 v0Var6 = f1Var5.f22744e;
                f1.k(v0Var6);
                String h10 = v0Var6.f23141v.h();
                if (!TextUtils.isEmpty(h10)) {
                    r5.putString("_ffr", h10);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(r5);
            if (eVar.t(null, x.V0)) {
                f1.l(f3Var);
                f3Var.j();
                a7 = f3Var.f22765d;
            } else {
                f1.k(v0Var3);
                a7 = v0Var3.f23138s.a();
            }
            f1.k(v0Var3);
            if (v0Var3.f23136p.a() <= j6) {
                e2Var2 = this;
                j10 = j;
                j11 = j6;
                str3 = "_o";
                str4 = "_ae";
                o2Var = o2Var22;
            } else {
                if (v0Var3.t(j) && a7) {
                    f1.m(n0Var32);
                    n0Var32.f22910n.a("Current session is expired, remove the session number, ID, and engagement time");
                    aVar2.getClass();
                    j10 = j;
                    j11 = j6;
                    str4 = "_ae";
                    o2Var = o2Var22;
                    v3Var3 = v3Var2;
                    str3 = "_o";
                    u(System.currentTimeMillis(), null, "auto", "_sid");
                    aVar2.getClass();
                    u(System.currentTimeMillis(), null, "auto", "_sno");
                    aVar2.getClass();
                    u(System.currentTimeMillis(), null, "auto", "_se");
                    e2Var2 = this;
                    v0Var3.q.b(j11);
                    if (r5.getLong("extend_session", j11) == 1) {
                        f1.m(n0Var32);
                        n0Var32.f22910n.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        f1.l(f3Var);
                        f3Var.f22766e.l(j10);
                    }
                    ArrayList arrayList2 = new ArrayList(r5.keySet());
                    Collections.sort(arrayList2);
                    size = arrayList2.size();
                    for (i5 = 0; i5 < size; i5++) {
                        String str5 = (String) arrayList2.get(i5);
                        if (str5 != null) {
                            f1.k(v3Var3);
                            Object obj = r5.get(str5);
                            if (obj instanceof Bundle) {
                                bundleArr = new Bundle[]{(Bundle) obj};
                            } else if (obj instanceof Parcelable[]) {
                                Parcelable[] parcelableArr = (Parcelable[]) obj;
                                bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                            } else if (obj instanceof ArrayList) {
                                ArrayList arrayList3 = (ArrayList) obj;
                                bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                            } else {
                                bundleArr = null;
                            }
                            if (bundleArr != null) {
                                r5.putParcelableArray(str5, bundleArr);
                            }
                        }
                    }
                    i10 = 0;
                    while (i10 < arrayList.size()) {
                        Bundle bundle2 = (Bundle) arrayList.get(i10);
                        String str6 = i10 != 0 ? "_ep" : str2;
                        String str7 = str3;
                        bundle2.putString(str7, str);
                        if (z7) {
                            bundle2 = v3Var3.M(bundle2);
                        }
                        Bundle bundle3 = bundle2;
                        zzbg zzbgVar = new zzbg(str6, new zzbe(bundle3), str, j10);
                        y2 p11 = f1Var.p();
                        p11.getClass();
                        p11.j();
                        p11.k();
                        p11.v();
                        h0 o4 = ((f1) p11.f3328a).o();
                        o4.getClass();
                        Parcel obtain = Parcel.obtain();
                        q5.b.a(zzbgVar, obtain, 0);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        if (marshall.length > 131072) {
                            n0 n0Var6 = ((f1) o4.f3328a).f22745f;
                            f1.m(n0Var6);
                            n0Var6.f22904g.a("Event is too long for local database. Sending event directly to service");
                            q = false;
                        } else {
                            q = o4.q(0, marshall);
                        }
                        p11.x(new s2(p11, p11.z(true), q, zzbgVar, 1));
                        if (!z12) {
                            Iterator it2 = e2Var2.f22698e.iterator();
                            while (it2.hasNext()) {
                                w3 w3Var = (w3) it2.next();
                                Bundle bundle4 = new Bundle(bundle3);
                                w3Var.getClass();
                                try {
                                    q0Var = (com.google.android.gms.internal.measurement.q0) w3Var.f23171a;
                                    O = q0Var.O();
                                    O.writeString(str);
                                    try {
                                        O.writeString(str2);
                                        com.google.android.gms.internal.measurement.z.b(O, bundle4);
                                        O.writeLong(j10);
                                        it = it2;
                                    } catch (RemoteException e10) {
                                        e = e10;
                                        it = it2;
                                        f1Var2 = w3Var.f23172b.f5780a;
                                        if (f1Var2 == null) {
                                            n0 n0Var7 = f1Var2.f22745f;
                                            f1.m(n0Var7);
                                            n0Var7.f22906i.b(e, "Event listener threw exception");
                                        }
                                        it2 = it;
                                    }
                                } catch (RemoteException e11) {
                                    e = e11;
                                }
                                try {
                                    q0Var.P(O, 1);
                                } catch (RemoteException e12) {
                                    e = e12;
                                    f1Var2 = w3Var.f23172b.f5780a;
                                    if (f1Var2 == null) {
                                    }
                                    it2 = it;
                                }
                                it2 = it;
                            }
                        }
                        i10++;
                        str3 = str7;
                    }
                    f1.l(o2Var);
                    if (o2Var.p(false) == null && str4.equals(str2)) {
                        f1.l(f3Var);
                        aVar2.getClass();
                        f3Var.f22767f.e(SystemClock.elapsedRealtime(), true, true);
                        return;
                    }
                }
                j11 = j6;
                str3 = "_o";
                j10 = j;
                str4 = "_ae";
                o2Var = o2Var22;
                e2Var2 = this;
            }
            v3Var3 = v3Var2;
            if (r5.getLong("extend_session", j11) == 1) {
            }
            ArrayList arrayList22 = new ArrayList(r5.keySet());
            Collections.sort(arrayList22);
            size = arrayList22.size();
            while (i5 < size) {
            }
            i10 = 0;
            while (i10 < arrayList.size()) {
            }
            f1.l(o2Var);
            if (o2Var.p(false) == null) {
            }
        }
    }

    public final void t(String str, String str2, Object obj, boolean z5, long j) {
        int i5;
        int length;
        f1 f1Var = (f1) this.f3328a;
        if (z5) {
            v3 v3Var = f1Var.f22748i;
            f1.k(v3Var);
            i5 = v3Var.q0(str2);
        } else {
            v3 v3Var2 = f1Var.f22748i;
            f1.k(v3Var2);
            if (v3Var2.l0("user property", str2)) {
                if (v3Var2.n0("user property", r1.f22983i, null, str2)) {
                    ((f1) v3Var2.f3328a).getClass();
                    if (v3Var2.o0(24, "user property", str2)) {
                        i5 = 0;
                    }
                } else {
                    i5 = 15;
                }
            }
            i5 = 6;
        }
        r7.a aVar = this.f22714w;
        if (i5 != 0) {
            f1.k(f1Var.f22748i);
            String o3 = v3.o(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            f1.k(f1Var.f22748i);
            v3.z(aVar, null, i5, "_ev", o3, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            d1 d1Var = f1Var.f22746g;
            f1.m(d1Var);
            d1Var.s(new h1(this, str3, str2, null, j, 1));
            return;
        }
        v3 v3Var3 = f1Var.f22748i;
        f1.k(v3Var3);
        int w10 = v3Var3.w(obj, str2);
        if (w10 != 0) {
            f1.k(v3Var3);
            String o4 = v3.o(str2, 24, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            f1.k(f1Var.f22748i);
            v3.z(aVar, null, w10, "_ev", o4, length);
            return;
        }
        f1.k(v3Var3);
        Object x10 = v3Var3.x(obj, str2);
        if (x10 != null) {
            d1 d1Var2 = f1Var.f22746g;
            f1.m(d1Var2);
            d1Var2.s(new h1(this, str3, str2, x10, j, 1));
        }
    }

    public final void u(long j, Object obj, String str, String str2) {
        String str3;
        boolean q;
        Object obj2 = obj;
        f1 f1Var = (f1) this.f3328a;
        g6.v.e(str);
        g6.v.e(str2);
        j();
        k();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    long j6 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj2 = Long.valueOf(j6);
                    v0 v0Var = f1Var.f22744e;
                    f1.k(v0Var);
                    v0Var.f23133m.i(j6 == 1 ? "true" : "false");
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22910n.c("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                v0 v0Var2 = f1Var.f22744e;
                f1.k(v0Var2);
                v0Var2.f23133m.i("unset");
            } else {
                str4 = str2;
            }
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22910n.c("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!f1Var.d()) {
            n0 n0Var3 = f1Var.f22745f;
            f1.m(n0Var3);
            n0Var3.f22910n.a("User property not set since app measurement is disabled");
            return;
        }
        if (f1Var.h()) {
            zzpl zzplVar = new zzpl(j, obj3, str3, str);
            y2 p10 = f1Var.p();
            p10.j();
            p10.k();
            p10.v();
            h0 o3 = ((f1) p10.f3328a).o();
            o3.getClass();
            Parcel obtain = Parcel.obtain();
            q5.b.b(zzplVar, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                n0 n0Var4 = ((f1) o3.f3328a).f22745f;
                f1.m(n0Var4);
                n0Var4.f22904g.a("User property too long for local database. Sending directly to service");
                q = false;
            } else {
                q = o3.q(1, marshall);
            }
            p10.x(new s2(p10, p10.z(true), q, zzplVar, 0));
        }
    }

    public final void v() {
        j();
        k();
        f1 f1Var = (f1) this.f3328a;
        if (f1Var.h()) {
            e eVar = f1Var.f22743d;
            ((f1) eVar.f3328a).getClass();
            Boolean v5 = eVar.v("google_analytics_deferred_deep_link_enabled");
            if (v5 != null && v5.booleanValue()) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22909m.a("Deferred Deep Link feature enabled.");
                d1 d1Var = f1Var.f22746g;
                f1.m(d1Var);
                d1Var.s(new t1(this, 2));
            }
            y2 p10 = f1Var.p();
            p10.j();
            p10.k();
            zzr z5 = p10.z(true);
            p10.v();
            f1 f1Var2 = (f1) p10.f3328a;
            f1Var2.f22743d.t(null, x.f23181c1);
            f1Var2.o().q(3, new byte[0]);
            p10.x(new t2(p10, z5, 1));
            this.f22710s = false;
            v0 v0Var = f1Var.f22744e;
            f1.k(v0Var);
            v0Var.j();
            String string = v0Var.n().getString("previous_os_version", null);
            ((f1) v0Var.f3328a).q().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = v0Var.n().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f1Var.q().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            q("auto", "_ou", bundle);
        }
    }

    public final void w(Bundle bundle, long j) {
        f1 f1Var = (f1) this.f3328a;
        g6.v.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(CommonUrlParts.APP_ID))) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22906i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(CommonUrlParts.APP_ID);
        r1.e(bundle2, CommonUrlParts.APP_ID, String.class, null);
        r1.e(bundle2, "origin", String.class, null);
        r1.e(bundle2, "name", String.class, null);
        r1.e(bundle2, "value", Object.class, null);
        r1.e(bundle2, "trigger_event_name", String.class, null);
        r1.e(bundle2, "trigger_timeout", Long.class, 0L);
        r1.e(bundle2, "timed_out_event_name", String.class, null);
        r1.e(bundle2, "timed_out_event_params", Bundle.class, null);
        r1.e(bundle2, "triggered_event_name", String.class, null);
        r1.e(bundle2, "triggered_event_params", Bundle.class, null);
        r1.e(bundle2, "time_to_live", Long.class, 0L);
        r1.e(bundle2, "expired_event_name", String.class, null);
        r1.e(bundle2, "expired_event_params", Bundle.class, null);
        g6.v.e(bundle2.getString("name"));
        g6.v.e(bundle2.getString("origin"));
        g6.v.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        v3 v3Var = f1Var.f22748i;
        i0 i0Var = f1Var.j;
        n0 n0Var2 = f1Var.f22745f;
        f1.k(v3Var);
        if (v3Var.q0(string) != 0) {
            f1.m(n0Var2);
            n0Var2.f22903f.b(i0Var.c(string), "Invalid conditional user property name");
            return;
        }
        f1.k(v3Var);
        if (v3Var.w(obj, string) != 0) {
            f1.m(n0Var2);
            n0Var2.f22903f.c(i0Var.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object x10 = v3Var.x(obj, string);
        if (x10 == null) {
            f1.m(n0Var2);
            n0Var2.f22903f.c(i0Var.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        r1.c(bundle2, x10);
        long j6 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j6 > 15552000000L || j6 < 1)) {
            f1.m(n0Var2);
            n0Var2.f22903f.c(i0Var.c(string), Long.valueOf(j6), "Invalid conditional user property timeout");
            return;
        }
        long j10 = bundle2.getLong("time_to_live");
        if (j10 > 15552000000L || j10 < 1) {
            f1.m(n0Var2);
            n0Var2.f22903f.c(i0Var.c(string), Long.valueOf(j10), "Invalid conditional user property time to live");
        } else {
            d1 d1Var = f1Var.f22746g;
            f1.m(d1Var);
            d1Var.s(new z1(this, bundle2, 0));
        }
    }

    public final void x(String str, String str2, Bundle bundle) {
        f1 f1Var = (f1) this.f3328a;
        f1Var.f22749k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        g6.v.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        d1Var.s(new z1(this, bundle2, 1));
    }

    public final String y() {
        f1 f1Var = (f1) this.f3328a;
        try {
            return r1.b(f1Var.f22740a, f1Var.f22754p);
        } catch (IllegalStateException e7) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.b(e7, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void z(q1 q1Var, long j, boolean z5) {
        int i5 = q1Var.f22966b;
        j();
        k();
        f1 f1Var = (f1) this.f3328a;
        v0 v0Var = f1Var.f22744e;
        n0 n0Var = f1Var.f22745f;
        f1.k(v0Var);
        q1 q = v0Var.q();
        if (j <= this.q && q1.l(q.f22966b, i5)) {
            f1.m(n0Var);
            n0Var.f22908l.b(q1Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        v0 v0Var2 = f1Var.f22744e;
        f1.k(v0Var2);
        v0Var2.j();
        if (!q1.l(i5, v0Var2.n().getInt("consent_source", 100))) {
            f1.m(n0Var);
            n0Var.f22908l.b(Integer.valueOf(i5), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = v0Var2.n().edit();
        edit.putString("consent_settings", q1Var.g());
        edit.putInt("consent_source", i5);
        edit.apply();
        f1.m(n0Var);
        n0Var.f22910n.b(q1Var, "Setting storage consent(FE)");
        this.q = j;
        if (f1Var.p().t()) {
            y2 p10 = f1Var.p();
            p10.j();
            p10.k();
            p10.x(new w2(p10, 2));
        } else {
            y2 p11 = f1Var.p();
            p11.j();
            p11.k();
            if (p11.s()) {
                p11.x(new t2(p11, p11.z(false)));
            }
        }
        if (z5) {
            f1Var.p().n(new AtomicReference());
        }
    }
}
