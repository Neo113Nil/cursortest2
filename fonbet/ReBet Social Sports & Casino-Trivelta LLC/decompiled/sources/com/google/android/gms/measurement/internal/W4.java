package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.hermes.intl.Constants;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzkq;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.B;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import w2.AbstractC6699a;
import z.C6900a;

/* loaded from: classes2.dex */
public final class W4 extends AbstractC3225c2 {

    /* renamed from: c, reason: collision with root package name */
    public I4 f33720c;

    /* renamed from: d, reason: collision with root package name */
    public Z3 f33721d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f33722e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33723f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f33724g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f33725h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33726i;

    /* renamed from: j, reason: collision with root package name */
    public int f33727j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC3381w f33728k;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC3381w f33729l;

    /* renamed from: m, reason: collision with root package name */
    public PriorityQueue f33730m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33731n;

    /* renamed from: o, reason: collision with root package name */
    public V3 f33732o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicLong f33733p;

    /* renamed from: q, reason: collision with root package name */
    public long f33734q;

    /* renamed from: r, reason: collision with root package name */
    public final i7 f33735r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33736s;

    /* renamed from: t, reason: collision with root package name */
    public AbstractC3381w f33737t;

    /* renamed from: u, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f33738u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC3381w f33739v;

    /* renamed from: w, reason: collision with root package name */
    public final a7 f33740w;

    public W4(C3298l3 c3298l3) {
        super(c3298l3);
        this.f33722e = new CopyOnWriteArraySet();
        this.f33725h = new Object();
        this.f33726i = false;
        this.f33727j = 1;
        this.f33736s = true;
        this.f33740w = new C3394x4(this);
        this.f33724g = new AtomicReference();
        this.f33732o = V3.f33699c;
        this.f33734q = -1L;
        this.f33733p = new AtomicLong(0L);
        this.f33735r = new i7(c3298l3);
    }

    public final void A(String str, String str2, long j10, Object obj) {
        this.f33578a.b().t(new RunnableC3323o4(this, str, str2, obj, j10));
    }

    public final void B(String str, String str2, Object obj, long j10) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        h();
        j();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String lowerCase = str3.toLowerCase(Locale.ENGLISH);
                    String str4 = Constants.CASEFIRST_FALSE;
                    long j11 = true != Constants.CASEFIRST_FALSE.equals(lowerCase) ? 0L : 1L;
                    C3298l3 c3298l3 = this.f33578a;
                    Long valueOf = Long.valueOf(j11);
                    K2 k22 = c3298l3.x().f33524n;
                    if (valueOf.longValue() == 1) {
                        str4 = "true";
                    }
                    k22.b(str4);
                    obj = valueOf;
                    str2 = "_npa";
                    this.f33578a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                    obj2 = obj;
                }
            }
            if (obj == null) {
                this.f33578a.x().f33524n.b("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.f33578a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str5 = str2;
        Object obj3 = obj2;
        C3298l3 c3298l32 = this.f33578a;
        if (!c3298l32.g()) {
            this.f33578a.a().w().a("User property not set since app measurement is disabled");
        } else if (c3298l32.m()) {
            this.f33578a.J().o(new zzpl(str5, j10, obj3, str));
        }
    }

    public final Map C(String str, String str2, boolean z10) {
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.b().p()) {
            c3298l3.a().o().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        c3298l3.c();
        if (C3246f.a()) {
            c3298l3.a().o().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f33578a.b().u(atomicReference, 5000L, "get user properties", new RunnableC3378v4(this, atomicReference, null, str, str2, z10));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            c3298l3.a().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        C6900a c6900a = new C6900a(list.size());
        for (zzpl zzplVar : list) {
            Object g10 = zzplVar.g();
            if (g10 != null) {
                c6900a.put(zzplVar.f34451b, g10);
            }
        }
        return c6900a;
    }

    public final String D() {
        return (String) this.f33724g.get();
    }

    public final void E(String str) {
        this.f33724g.set(str);
    }

    public final void F() {
        h();
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.x().f33531u.a()) {
            c3298l3.a().v().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a10 = c3298l3.x().f33532v.a();
        c3298l3.x().f33532v.b(1 + a10);
        c3298l3.w();
        if (a10 >= 5) {
            c3298l3.a().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            c3298l3.x().f33531u.b(true);
        } else {
            if (this.f33737t == null) {
                this.f33737t = new C3339q4(this, this.f33578a);
            }
            this.f33737t.b(0L);
        }
    }

    public final void G(long j10) {
        this.f33724g.set(null);
        this.f33578a.b().t(new RunnableC3346r4(this, j10));
    }

    public final void H() {
        h();
        j();
        if (this.f33578a.m()) {
            C3298l3 c3298l3 = this.f33578a;
            C3286k w10 = c3298l3.w();
            w10.f33578a.c();
            Boolean J10 = w10.J("google_analytics_deferred_deep_link_enabled");
            if (J10 != null && J10.booleanValue()) {
                c3298l3.a().v().a("Deferred Deep Link feature enabled.");
                c3298l3.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.T4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        W4.this.F();
                    }
                });
            }
            this.f33578a.J().s();
            this.f33736s = false;
            L2 x10 = c3298l3.x();
            x10.h();
            String string = x10.p().getString("previous_os_version", null);
            x10.f33578a.K().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = x10.p().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c3298l3.K().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    public final void I(Z3 z32) {
        Z3 z33;
        h();
        j();
        if (z32 != null && z32 != (z33 = this.f33721d)) {
            AbstractC3191o.q(z33 == null, "EventInterceptor already set.");
        }
        this.f33721d = z32;
    }

    public final void J(InterfaceC3211a4 interfaceC3211a4) {
        j();
        AbstractC3191o.m(interfaceC3211a4);
        if (this.f33722e.add(interfaceC3211a4)) {
            return;
        }
        this.f33578a.a().r().a("OnEventListener already registered");
    }

    public final void K(InterfaceC3211a4 interfaceC3211a4) {
        j();
        AbstractC3191o.m(interfaceC3211a4);
        if (this.f33722e.remove(interfaceC3211a4)) {
            return;
        }
        this.f33578a.a().r().a("OnEventListener had not been registered");
    }

    public final int L(String str) {
        AbstractC3191o.g(str);
        this.f33578a.w();
        return 25;
    }

    public final void M(Bundle bundle) {
        N(bundle, this.f33578a.e().a());
    }

    public final void N(Bundle bundle, long j10) {
        AbstractC3191o.m(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(PublisherMetadata.APP_ID))) {
            this.f33578a.a().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(PublisherMetadata.APP_ID);
        AbstractC3191o.m(bundle2);
        R3.b(bundle2, PublisherMetadata.APP_ID, String.class, null);
        R3.b(bundle2, "origin", String.class, null);
        R3.b(bundle2, "name", String.class, null);
        R3.b(bundle2, EventKeys.VALUE_KEY, Object.class, null);
        R3.b(bundle2, "trigger_event_name", String.class, null);
        R3.b(bundle2, "trigger_timeout", Long.class, 0L);
        R3.b(bundle2, "timed_out_event_name", String.class, null);
        R3.b(bundle2, "timed_out_event_params", Bundle.class, null);
        R3.b(bundle2, "triggered_event_name", String.class, null);
        R3.b(bundle2, "triggered_event_params", Bundle.class, null);
        R3.b(bundle2, "time_to_live", Long.class, 0L);
        R3.b(bundle2, "expired_event_name", String.class, null);
        R3.b(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC3191o.g(bundle2.getString("name"));
        AbstractC3191o.g(bundle2.getString("origin"));
        AbstractC3191o.m(bundle2.get(EventKeys.VALUE_KEY));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(EventKeys.VALUE_KEY);
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.C().y0(string) != 0) {
            c3298l3.a().o().b("Invalid conditional user property name", c3298l3.D().c(string));
            return;
        }
        if (c3298l3.C().y(string, obj) != 0) {
            c3298l3.a().o().c("Invalid conditional user property value", c3298l3.D().c(string), obj);
            return;
        }
        Object z10 = c3298l3.C().z(string, obj);
        if (z10 == null) {
            c3298l3.a().o().c("Unable to normalize conditional user property value", c3298l3.D().c(string), obj);
            return;
        }
        R3.a(bundle2, z10);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            c3298l3.w();
            if (j11 > 15552000000L || j11 < 1) {
                c3298l3.a().o().c("Invalid conditional user property timeout", c3298l3.D().c(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        c3298l3.w();
        if (j12 > 15552000000L || j12 < 1) {
            c3298l3.a().o().c("Invalid conditional user property time to live", c3298l3.D().c(string), Long.valueOf(j12));
        } else {
            c3298l3.b().t(new RunnableC3354s4(this, bundle2));
        }
    }

    public final void O(String str, String str2, Bundle bundle) {
        C3298l3 c3298l3 = this.f33578a;
        long a10 = c3298l3.e().a();
        AbstractC3191o.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a10);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        c3298l3.b().t(new RunnableC3362t4(this, bundle2));
    }

    public final ArrayList P(String str, String str2) {
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.b().p()) {
            c3298l3.a().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        c3298l3.c();
        if (C3246f.a()) {
            c3298l3.a().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f33578a.b().u(atomicReference, 5000L, "get conditional user properties", new RunnableC3370u4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return b7.h0(list);
        }
        c3298l3.a().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String Q() {
        C3268h5 u10 = this.f33578a.I().u();
        if (u10 != null) {
            return u10.f34035a;
        }
        return null;
    }

    public final String R() {
        C3268h5 u10 = this.f33578a.I().u();
        if (u10 != null) {
            return u10.f34036b;
        }
        return null;
    }

    public final String S() {
        try {
            return AbstractC3260g5.a(this.f33578a.d(), "google_app_id", this.f33578a.H());
        } catch (IllegalStateException e10) {
            this.f33578a.a().o().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final /* synthetic */ void T(SharedPreferences sharedPreferences, String str) {
        C3298l3 c3298l3 = this.f33578a;
        if (!c3298l3.w().H(null, AbstractC3209a2.f33854a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                c3298l3.a().w().a("IABTCF_TCString change picked up in listener.");
                ((AbstractC3381w) AbstractC3191o.m(this.f33739v)).b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            c3298l3.a().w().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC3381w) AbstractC3191o.m(this.f33739v)).b(500L);
        }
    }

    public final /* synthetic */ void U(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            C3298l3 c3298l3 = this.f33578a;
            bundle2 = new Bundle(c3298l3.x().f33536z.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (c3298l3.C().B0(obj)) {
                        c3298l3.C().B(this.f33740w, null, 27, null, null, 0);
                    }
                    c3298l3.a().t().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (b7.N(next)) {
                    c3298l3.a().t().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (c3298l3.C().C0("param", next, c3298l3.w().x(null, false), obj)) {
                    c3298l3.C().A(bundle2, next, obj);
                }
            }
            c3298l3.C();
            int v10 = c3298l3.w().v();
            if (bundle2.size() > v10) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > v10) {
                        bundle2.remove(str);
                    }
                }
                c3298l3.C().B(this.f33740w, null, 26, null, null, 0);
                c3298l3.a().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        C3298l3 c3298l32 = this.f33578a;
        c3298l32.x().f33536z.b(bundle2);
        if (!bundle.isEmpty() || c3298l32.w().H(null, AbstractC3209a2.f33847X0)) {
            this.f33578a.J().v(bundle2);
        }
    }

    public final /* synthetic */ void V(int i10) {
        if (this.f33728k == null) {
            this.f33728k = new C3267h4(this, this.f33578a);
        }
        this.f33728k.b(i10 * 1000);
    }

    public final /* synthetic */ void W(Boolean bool, boolean z10) {
        f0(bool, true);
    }

    public final /* synthetic */ void X(V3 v32, long j10, boolean z10, boolean z11) {
        h();
        j();
        C3298l3 c3298l3 = this.f33578a;
        V3 w10 = c3298l3.x().w();
        if (j10 <= this.f33734q && V3.u(w10.b(), v32.b())) {
            c3298l3.a().u().b("Dropped out-of-date consent setting, proposed settings", v32);
            return;
        }
        L2 x10 = c3298l3.x();
        C3298l3 c3298l32 = x10.f33578a;
        x10.h();
        int b10 = v32.b();
        if (!x10.v(b10)) {
            c3298l3.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(v32.b()));
            return;
        }
        C3298l3 c3298l33 = this.f33578a;
        SharedPreferences.Editor edit = x10.p().edit();
        edit.putString("consent_settings", v32.l());
        edit.putInt("consent_source", b10);
        edit.apply();
        c3298l3.a().w().b("Setting storage consent(FE)", v32);
        this.f33734q = j10;
        if (c3298l33.J().D()) {
            c3298l33.J().Z(z10);
        } else {
            c3298l33.J().Y(z10);
        }
        if (z11) {
            c3298l33.J().q(new AtomicReference());
        }
    }

    public final /* synthetic */ void Z(boolean z10) {
        this.f33726i = false;
    }

    public final /* synthetic */ int a0() {
        return this.f33727j;
    }

    public final /* synthetic */ void b0(int i10) {
        this.f33727j = i10;
    }

    public final /* synthetic */ AbstractC3381w c0() {
        return this.f33737t;
    }

    public final /* synthetic */ int d0(Throwable th2) {
        String message = th2.getMessage();
        this.f33731n = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f33731n = true;
        return 1;
    }

    public final EnumC3244e5 e0(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.f34443b).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String s10 = this.f33578a.L().s();
            C3298l3 c3298l3 = this.f33578a;
            C3376v2 w10 = c3298l3.a().w();
            Long valueOf = Long.valueOf(zzomVar.f34442a);
            w10.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, zzomVar.f34443b, Integer.valueOf(zzomVar.zzb.length));
            if (!TextUtils.isEmpty(zzomVar.f34447f)) {
                c3298l3.a().w().c("[sgtm] Uploading data from app. row_id", valueOf, zzomVar.f34447f);
            }
            HashMap hashMap = new HashMap();
            Bundle bundle = zzomVar.f34444c;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
            C3220b5 F10 = c3298l3.F();
            byte[] bArr = zzomVar.zzb;
            Y4 y42 = new Y4() { // from class: com.google.android.gms.measurement.internal.J4
                /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
                @Override // com.google.android.gms.measurement.internal.Y4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final /* synthetic */ void a(String str2, int i10, Throwable th2, byte[] bArr2, Map map) {
                    EnumC3244e5 enumC3244e5;
                    AtomicReference atomicReference2;
                    W4 w42 = W4.this;
                    w42.h();
                    zzom zzomVar2 = zzomVar;
                    if (i10 != 200 && i10 != 204) {
                        if (i10 == 304) {
                            i10 = 304;
                        }
                        w42.f33578a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f34442a), Integer.valueOf(i10), th2);
                        enumC3244e5 = !Arrays.asList(((String) AbstractC3209a2.f33904u.b(null)).split(",")).contains(String.valueOf(i10)) ? EnumC3244e5.BACKOFF : EnumC3244e5.FAILURE;
                        atomicReference2 = atomicReference;
                        Z5 J10 = w42.f33578a.J();
                        long j10 = zzomVar2.f34442a;
                        J10.k0(new zzaf(j10, enumC3244e5.zza(), zzomVar2.f34446e));
                        w42.f33578a.a().w().c("[sgtm] Updated status for row_id", Long.valueOf(j10), enumC3244e5);
                        synchronized (atomicReference2) {
                            atomicReference2.set(enumC3244e5);
                            atomicReference2.notifyAll();
                        }
                        return;
                    }
                    if (th2 == null) {
                        w42.f33578a.a().w().b("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.f34442a));
                        enumC3244e5 = EnumC3244e5.SUCCESS;
                        atomicReference2 = atomicReference;
                        Z5 J102 = w42.f33578a.J();
                        long j102 = zzomVar2.f34442a;
                        J102.k0(new zzaf(j102, enumC3244e5.zza(), zzomVar2.f34446e));
                        w42.f33578a.a().w().c("[sgtm] Updated status for row_id", Long.valueOf(j102), enumC3244e5);
                        synchronized (atomicReference2) {
                        }
                    }
                    w42.f33578a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f34442a), Integer.valueOf(i10), th2);
                    if (!Arrays.asList(((String) AbstractC3209a2.f33904u.b(null)).split(",")).contains(String.valueOf(i10))) {
                    }
                    atomicReference2 = atomicReference;
                    Z5 J1022 = w42.f33578a.J();
                    long j1022 = zzomVar2.f34442a;
                    J1022.k0(new zzaf(j1022, enumC3244e5.zza(), zzomVar2.f34446e));
                    w42.f33578a.a().w().c("[sgtm] Updated status for row_id", Long.valueOf(j1022), enumC3244e5);
                    synchronized (atomicReference2) {
                    }
                }
            };
            F10.l();
            AbstractC3191o.m(url);
            AbstractC3191o.m(bArr);
            AbstractC3191o.m(y42);
            F10.f33578a.b().w(new RunnableC3212a5(F10, s10, url, bArr, hashMap, y42));
            try {
                C3298l3 c3298l32 = c3298l3.C().f33578a;
                long a10 = c3298l32.e().a() + 60000;
                synchronized (atomicReference) {
                    for (long j10 = 60000; atomicReference.get() == null && j10 > 0; j10 = a10 - c3298l32.e().a()) {
                        try {
                            atomicReference.wait(j10);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f33578a.a().r().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? EnumC3244e5.UNKNOWN : (EnumC3244e5) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.f33578a.a().o().d("[sgtm] Bad upload url for row_id", zzomVar.f34443b, Long.valueOf(zzomVar.f34442a), e10);
            return EnumC3244e5.FAILURE;
        }
    }

    public final void f0(Boolean bool, boolean z10) {
        h();
        j();
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.a().v().b("Setting app measurement enabled (FE)", bool);
        c3298l3.x().s(bool);
        if (z10) {
            L2 x10 = c3298l3.x();
            C3298l3 c3298l32 = x10.f33578a;
            x10.h();
            SharedPreferences.Editor edit = x10.p().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f33578a.j() || !(bool == null || bool.booleanValue())) {
            Y();
        }
    }

    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void Y() {
        W4 w42;
        h();
        C3298l3 c3298l3 = this.f33578a;
        String a10 = c3298l3.x().f33524n.a();
        if (a10 == null) {
            w42 = this;
        } else if ("unset".equals(a10)) {
            w42 = this;
            w42.B("app", "_npa", null, c3298l3.e().a());
        } else {
            B("app", "_npa", Long.valueOf(true != "true".equals(a10) ? 0L : 1L), c3298l3.e().a());
            w42 = this;
        }
        if (!w42.f33578a.g() || !w42.f33736s) {
            c3298l3.a().v().a("Updating Scion state (FE)");
            w42.f33578a.J().X();
        } else {
            c3298l3.a().v().a("Recording app launch after enabling measurement for the first time (FE)");
            H();
            w42.f33578a.z().f34269e.a();
            c3298l3.b().t(new RunnableC3283j4(this));
        }
    }

    public final void h0() {
        C3298l3 c3298l3 = this.f33578a;
        if (!(c3298l3.d().getApplicationContext() instanceof Application) || this.f33720c == null) {
            return;
        }
        ((Application) c3298l3.d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f33720c);
    }

    public final Boolean i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f33578a.b().u(atomicReference, 15000L, "boolean test flag value", new RunnableC3331p4(this, atomicReference));
    }

    public final String j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f33578a.b().u(atomicReference, 15000L, "String test flag value", new RunnableC3402y4(this, atomicReference));
    }

    public final Long k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f33578a.b().u(atomicReference, 15000L, "long test flag value", new RunnableC3410z4(this, atomicReference));
    }

    public final Integer l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f33578a.b().u(atomicReference, 15000L, "int test flag value", new A4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3225c2
    public final boolean m() {
        return false;
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f33578a.b().u(atomicReference, 15000L, "double test flag value", new B4(this, atomicReference));
    }

    public final void n0(Boolean bool) {
        j();
        this.f33578a.b().t(new C4(this, bool));
    }

    public final void o(V3 v32) {
        h();
        boolean z10 = (v32.o(U3.ANALYTICS_STORAGE) && v32.o(U3.AD_STORAGE)) || this.f33578a.J().C();
        C3298l3 c3298l3 = this.f33578a;
        if (z10 != c3298l3.j()) {
            c3298l3.i(z10);
            L2 x10 = this.f33578a.x();
            C3298l3 c3298l32 = x10.f33578a;
            x10.h();
            Boolean valueOf = x10.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(x10.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                f0(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void o0(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        j();
        V3 v32 = V3.f33699c;
        U3[] b10 = T3.STORAGE.b();
        int length = b10.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = b10[i11].f33682a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            C3298l3 c3298l3 = this.f33578a;
            c3298l3.a().t().b("Ignoring invalid consent setting", obj);
            c3298l3.a().t().a("Valid consent values are 'granted', 'denied'");
        }
        boolean p10 = this.f33578a.b().p();
        V3 e10 = V3.e(bundle, i10);
        if (e10.c()) {
            q0(e10, p10);
        }
        C3389x h10 = C3389x.h(bundle, i10);
        if (h10.d()) {
            p0(h10, p10);
        }
        Boolean i12 = C3389x.i(bundle);
        if (i12 != null) {
            String str2 = i10 == -30 ? "tcf" : "app";
            if (p10) {
                B(str2, "allow_personalized_ads", i12.toString(), j10);
            } else {
                z(str2, "allow_personalized_ads", i12.toString(), false, j10);
            }
        }
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f33578a.e().a());
    }

    public final void p0(C3389x c3389x, boolean z10) {
        D4 d42 = new D4(this, c3389x);
        if (!z10) {
            this.f33578a.b().t(d42);
        } else {
            h();
            d42.run();
        }
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f33578a.I().s(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f33721d != null && !b7.N(str2)) {
            z12 = false;
        }
        boolean z13 = z12;
        if (str == null) {
            str = "app";
        }
        x(str, str2, j10, bundle2, z11, z13, z10, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void q0(com.google.android.gms.measurement.internal.V3 r10, boolean r11) {
        /*
            r9 = this;
            r9.j()
            int r0 = r10.b()
            r1 = -10
            if (r0 == r1) goto L2a
            com.google.android.gms.measurement.internal.S3 r2 = r10.p()
            com.google.android.gms.measurement.internal.S3 r3 = com.google.android.gms.measurement.internal.S3.UNINITIALIZED
            if (r2 != r3) goto L2a
            com.google.android.gms.measurement.internal.S3 r2 = r10.q()
            if (r2 == r3) goto L1a
            goto L2a
        L1a:
            com.google.android.gms.measurement.internal.l3 r10 = r9.f33578a
            com.google.android.gms.measurement.internal.x2 r10 = r10.a()
            com.google.android.gms.measurement.internal.v2 r10 = r10.t()
            java.lang.String r11 = "Ignoring empty consent settings"
            r10.a(r11)
            return
        L2a:
            java.lang.Object r2 = r9.f33725h
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.V3 r3 = r9.f33732o     // Catch: java.lang.Throwable -> Lcb
            int r3 = r3.b()     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.measurement.internal.V3.u(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            r4 = 0
            if (r3 == 0) goto L64
            com.google.android.gms.measurement.internal.V3 r3 = r9.f33732o     // Catch: java.lang.Throwable -> L53
            boolean r3 = r10.r(r3)     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.U3 r5 = com.google.android.gms.measurement.internal.U3.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L53
            boolean r6 = r10.o(r5)     // Catch: java.lang.Throwable -> L53
            r7 = 1
            if (r6 == 0) goto L58
            com.google.android.gms.measurement.internal.V3 r6 = r9.f33732o     // Catch: java.lang.Throwable -> L53
            boolean r5 = r6.o(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L58
            r4 = r7
            goto L58
        L53:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto Lce
        L58:
            com.google.android.gms.measurement.internal.V3 r5 = r9.f33732o     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.V3 r10 = r10.t(r5)     // Catch: java.lang.Throwable -> L53
            r9.f33732o = r10     // Catch: java.lang.Throwable -> L53
            r8 = r4
            r4 = r7
        L62:
            r5 = r10
            goto L67
        L64:
            r3 = r4
            r8 = r3
            goto L62
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcb
            if (r4 != 0) goto L7a
            com.google.android.gms.measurement.internal.l3 r10 = r9.f33578a
            com.google.android.gms.measurement.internal.x2 r10 = r10.a()
            com.google.android.gms.measurement.internal.v2 r10 = r10.u()
            java.lang.String r11 = "Ignoring lower-priority consent settings, proposed settings"
            r10.b(r11, r5)
            return
        L7a:
            java.util.concurrent.atomic.AtomicLong r10 = r9.f33733p
            long r6 = r10.getAndIncrement()
            if (r3 == 0) goto La1
            java.util.concurrent.atomic.AtomicReference r10 = r9.f33724g
            r0 = 0
            r10.set(r0)
            com.google.android.gms.measurement.internal.E4 r3 = new com.google.android.gms.measurement.internal.E4
            r4 = r9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto L97
            r9.h()
            r3.run()
            return
        L97:
            com.google.android.gms.measurement.internal.l3 r10 = r4.f33578a
            com.google.android.gms.measurement.internal.d3 r10 = r10.b()
            r10.v(r3)
            return
        La1:
            r4 = r9
            com.google.android.gms.measurement.internal.F4 r3 = new com.google.android.gms.measurement.internal.F4
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto Lb0
            r9.h()
            r3.run()
            return
        Lb0:
            r10 = 30
            if (r0 == r10) goto Lc1
            if (r0 != r1) goto Lb7
            goto Lc1
        Lb7:
            com.google.android.gms.measurement.internal.l3 r10 = r4.f33578a
            com.google.android.gms.measurement.internal.d3 r10 = r10.b()
            r10.t(r3)
            return
        Lc1:
            com.google.android.gms.measurement.internal.l3 r10 = r4.f33578a
            com.google.android.gms.measurement.internal.d3 r10 = r10.b()
            r10.v(r3)
            return
        Lcb:
            r0 = move-exception
            r4 = r9
        Lcd:
            r10 = r0
        Lce:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            throw r10
        Ld0:
            r0 = move-exception
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.W4.q0(com.google.android.gms.measurement.internal.V3, boolean):void");
    }

    public final void r() {
        C3298l3 c3298l3;
        C3356s6 c3356s6;
        C3356s6 c3356s62;
        zzkq zzkqVar;
        h();
        C3298l3 c3298l32 = this.f33578a;
        c3298l32.a().v().a("Handle tcf update.");
        SharedPreferences q10 = c3298l32.x().q();
        HashMap hashMap = new HashMap();
        Z1 z12 = AbstractC3209a2.f33854a1;
        if (((Boolean) z12.b(null)).booleanValue()) {
            AbstractC3445z abstractC3445z = AbstractC3372u6.f34326a;
            zzkp zzkpVar = zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            EnumC3364t6 enumC3364t6 = EnumC3364t6.CONSENT;
            Map.Entry a10 = V4.a(zzkpVar, enumC3364t6);
            int i10 = 2;
            zzkp zzkpVar2 = zzkp.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i11 = 1;
            EnumC3364t6 enumC3364t62 = EnumC3364t6.FLEXIBLE_LEGITIMATE_INTEREST;
            c3298l3 = c3298l32;
            com.google.common.collect.B p10 = com.google.common.collect.B.p(a10, V4.a(zzkpVar2, enumC3364t62), V4.a(zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, enumC3364t6), V4.a(zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, enumC3364t6), V4.a(zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, enumC3364t62), V4.a(zzkp.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, enumC3364t62), V4.a(zzkp.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, enumC3364t62));
            com.google.common.collect.E r10 = com.google.common.collect.E.r("CH");
            char[] cArr = new char[5];
            boolean contains = q10.contains("IABTCF_TCString");
            int b10 = AbstractC3372u6.b(q10, "IABTCF_CmpSdkID");
            int b11 = AbstractC3372u6.b(q10, "IABTCF_PolicyVersion");
            int b12 = AbstractC3372u6.b(q10, "IABTCF_gdprApplies");
            int b13 = AbstractC3372u6.b(q10, "IABTCF_PurposeOneTreatment");
            int b14 = AbstractC3372u6.b(q10, "IABTCF_EnableAdvertiserConsentMode");
            String a11 = AbstractC3372u6.a(q10, "IABTCF_PublisherCC");
            B.a a12 = com.google.common.collect.B.a();
            com.google.common.collect.m0 it = p10.keySet().iterator();
            while (it.hasNext()) {
                zzkp zzkpVar3 = (zzkp) it.next();
                int zza = zzkpVar3.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(zza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(zza);
                String a13 = AbstractC3372u6.a(q10, sb2.toString());
                if (TextUtils.isEmpty(a13) || a13.length() < 755) {
                    zzkqVar = zzkq.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int digit = Character.digit(a13.charAt(754), 10);
                    zzkqVar = (digit < 0 || digit > zzkq.values().length || digit == 0) ? zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED : digit != i11 ? digit != i10 ? zzkq.PURPOSE_RESTRICTION_UNDEFINED : zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                a12.f(zzkpVar3, zzkqVar);
                i10 = 2;
                i11 = 1;
            }
            com.google.common.collect.B c10 = a12.c();
            String a14 = AbstractC3372u6.a(q10, "IABTCF_PurposeConsents");
            String a15 = AbstractC3372u6.a(q10, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(a15) && a15.length() >= 755 && a15.charAt(754) == '1';
            String a16 = AbstractC3372u6.a(q10, "IABTCF_PurposeLegitimateInterests");
            String a17 = AbstractC3372u6.a(q10, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(a17) && a17.length() >= 755 && a17.charAt(754) == '1';
            cArr[0] = '2';
            c3356s6 = new C3356s6(AbstractC3372u6.d(p10, c10, r10, cArr, b10, b14, b12, b11, b13, a11, a14, a16, z10, z11, contains));
        } else {
            c3298l3 = c3298l32;
            String a18 = AbstractC3372u6.a(q10, "IABTCF_VendorConsents");
            if (!"".equals(a18) && a18.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(a18.charAt(754)));
            }
            int b15 = AbstractC3372u6.b(q10, "IABTCF_gdprApplies");
            if (b15 != -1) {
                hashMap.put("gdprApplies", String.valueOf(b15));
            }
            int b16 = AbstractC3372u6.b(q10, "IABTCF_EnableAdvertiserConsentMode");
            if (b16 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(b16));
            }
            int b17 = AbstractC3372u6.b(q10, "IABTCF_PolicyVersion");
            if (b17 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(b17));
            }
            String a19 = AbstractC3372u6.a(q10, "IABTCF_PurposeConsents");
            if (!"".equals(a19)) {
                hashMap.put("PurposeConsents", a19);
            }
            int b18 = AbstractC3372u6.b(q10, "IABTCF_CmpSdkID");
            if (b18 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(b18));
            }
            c3356s6 = new C3356s6(hashMap);
        }
        c3298l3.a().w().b("Tcf preferences read", c3356s6);
        if (!c3298l3.w().H(null, z12)) {
            if (c3298l3.x().x(c3356s6)) {
                Bundle b19 = c3356s6.b();
                c3298l3.a().w().b("Consent generated from Tcf", b19);
                if (b19 != Bundle.EMPTY) {
                    o0(b19, -30, c3298l3.e().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", c3356s6.e());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        L2 x10 = c3298l3.x();
        x10.h();
        String string = x10.p().getString("stored_tcf_param", "");
        HashMap hashMap2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            c3356s62 = new C3356s6(hashMap2);
        } else {
            for (String str : string.split(";")) {
                String[] split = str.split("=");
                if (split.length >= 2 && AbstractC3372u6.f34326a.contains(split[0])) {
                    hashMap2.put(split[0], split[1]);
                }
            }
            c3356s62 = new C3356s6(hashMap2);
        }
        if (c3298l3.x().x(c3356s6)) {
            Bundle b20 = c3356s6.b();
            c3298l3.a().w().b("Consent generated from Tcf", b20);
            if (b20 != Bundle.EMPTY) {
                o0(b20, -30, c3298l3.e().a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", c3356s6.d(c3356s62));
            bundle2.putString("_tcfd2", c3356s6.c());
            bundle2.putString("_tcfd", c3356s6.e());
            t("auto", "_tcf", bundle2);
        }
    }

    public final void r0(Runnable runnable) {
        j();
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.b().p()) {
            c3298l3.a().o().a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (c3298l3.b().q()) {
            c3298l3.a().o().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        c3298l3.c();
        if (C3246f.a()) {
            c3298l3.a().o().a("Cannot retrieve and upload batches from main thread");
            return;
        }
        c3298l3.a().w().a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (!z10) {
            c3298l3.a().w().a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c3298l3.b().u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.U4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    W4.this.f33578a.J().j0(atomicReference, zzoo.g(EnumC3252f5.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.f34449a;
            if (!list.isEmpty()) {
                c3298l3.a().w().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                i10 += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    EnumC3244e5 e02 = e0((zzom) it.next());
                    if (e02 == EnumC3244e5.SUCCESS) {
                        i11++;
                    } else if (e02 == EnumC3244e5.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        c3298l3.a().w().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i10), Integer.valueOf(i11));
        runnable.run();
    }

    public final void s() {
        h();
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.a().v().a("Register tcfPrefChangeListener.");
        if (this.f33738u == null) {
            this.f33739v = new C3307m4(this, this.f33578a);
            this.f33738u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.Q4
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    W4.this.T(sharedPreferences, str);
                }
            };
        }
        c3298l3.x().q().registerOnSharedPreferenceChangeListener(this.f33738u);
    }

    public final void s0(long j10) {
        h();
        if (this.f33729l == null) {
            this.f33729l = new C3243e4(this, this.f33578a);
        }
        this.f33729l.b(j10);
    }

    public final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.f33578a.e().a(), bundle);
    }

    public final void t0() {
        h();
        AbstractC3381w abstractC3381w = this.f33729l;
        if (abstractC3381w != null) {
            abstractC3381w.d();
        }
    }

    public final void u(String str, String str2, long j10, Bundle bundle) {
        h();
        boolean z10 = true;
        if (this.f33721d != null && !b7.N(str2)) {
            z10 = false;
        }
        v(str, str2, j10, bundle, true, z10, true, null);
    }

    public final void u0() {
        zzqp.zza();
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.w().H(null, AbstractC3209a2.f33835R0)) {
            if (c3298l3.b().p()) {
                c3298l3.a().o().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            c3298l3.c();
            if (C3246f.a()) {
                c3298l3.a().o().a("Cannot get trigger URIs from main thread");
                return;
            }
            j();
            c3298l3.a().w().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c3298l3.b().u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.L4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    W4 w42 = W4.this;
                    w42.f33578a.J().i0(atomicReference, w42.f33578a.x().f33525o.a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                c3298l3.a().q().a("Timed out waiting for get trigger URIs");
            } else {
                c3298l3.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.N4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        boolean contains;
                        W4 w42 = W4.this;
                        w42.h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray r10 = w42.f33578a.x().r();
                        for (zzoh zzohVar : list2) {
                            int i10 = zzohVar.f34441c;
                            contains = r10.contains(i10);
                            if (!contains || ((Long) r10.get(i10)).longValue() < zzohVar.f34440b) {
                                w42.w0().add(zzohVar);
                            }
                        }
                        w42.x0();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    public final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        boolean z14;
        C3298l3 c3298l3;
        long j11;
        long j12;
        String str4;
        long j13;
        Bundle[] bundleArr;
        String str5 = str;
        AbstractC3191o.g(str5);
        AbstractC3191o.m(bundle);
        h();
        j();
        C3298l3 c3298l32 = this.f33578a;
        if (!c3298l32.g()) {
            this.f33578a.a().v().a("Event not sent since app measurement is disabled");
            return;
        }
        List w10 = this.f33578a.L().w();
        if (w10 != null && !w10.contains(str2)) {
            this.f33578a.a().v().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f33723f) {
            this.f33723f = true;
            try {
                try {
                    (!c3298l32.G() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f33578a.d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f33578a.d());
                } catch (Exception e10) {
                    this.f33578a.a().r().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f33578a.a().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        C3298l3 c3298l33 = this.f33578a;
        if (!c3298l33.w().H(null, AbstractC3209a2.f33872g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            c3298l33.c();
            B("auto", "_lgclid", bundle.getString("gclid"), c3298l33.e().a());
        }
        W4 w42 = this;
        c3298l33.c();
        if (z10 && b7.U(str2)) {
            c3298l33.C().w(bundle, c3298l33.x().f33536z.a());
        }
        if (!z12) {
            c3298l33.c();
            if (!"_iap".equals(str2)) {
                C3298l3 c3298l34 = w42.f33578a;
                b7 C10 = c3298l34.C();
                int i10 = 2;
                if (C10.t0("event", str2)) {
                    if (C10.v0("event", W3.zza, W3.zzb, str2)) {
                        C10.f33578a.w();
                        if (C10.w0("event", 40, str2)) {
                            i10 = 0;
                        }
                    } else {
                        i10 = 13;
                    }
                }
                if (i10 != 0) {
                    c3298l33.a().q().b("Invalid public event name. Event will not be logged (FE)", c3298l33.D().a(str2));
                    b7 C11 = c3298l34.C();
                    c3298l34.w();
                    c3298l34.C().B(w42.f33740w, null, i10, "_ev", C11.q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        c3298l33.c();
        C3298l3 c3298l35 = w42.f33578a;
        C3268h5 q10 = c3298l35.I().q(false);
        if (q10 != null && !bundle.containsKey("_sc")) {
            q10.f34038d = true;
        }
        b7.k0(q10, bundle, z10 && !z12);
        boolean equals = "am".equals(str5);
        boolean N10 = b7.N(str2);
        if (!z10 || w42.f33721d == null || N10) {
            z13 = equals;
        } else {
            if (!equals) {
                c3298l33.a().v().c("Passing event to registered event handler (FE)", c3298l33.D().a(str2), c3298l33.D().e(bundle));
                AbstractC3191o.m(w42.f33721d);
                w42.f33721d.a(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        C3298l3 c3298l36 = w42.f33578a;
        if (c3298l36.m()) {
            int x02 = c3298l33.C().x0(str2);
            if (x02 != 0) {
                c3298l33.a().q().b("Invalid event name. Event will not be logged (FE)", c3298l33.D().a(str2));
                b7 C12 = c3298l33.C();
                c3298l33.w();
                c3298l36.C().B(w42.f33740w, str3, x02, "_ev", C12.q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle t10 = c3298l33.C().t(str3, str2, bundle, K9.f.b("_o", "_sn", "_sc", "_si"), z12);
            AbstractC3191o.m(t10);
            c3298l33.c();
            if (c3298l35.I().q(false) == null || !"_ae".equals(str2)) {
                z14 = 0;
                c3298l3 = c3298l35;
                j11 = 0;
            } else {
                C3333p6 c3333p6 = c3298l35.z().f34270f;
                j11 = 0;
                long b10 = c3333p6.f34235d.f33578a.e().b();
                boolean z15 = false;
                c3298l3 = c3298l35;
                long j14 = b10 - c3333p6.f34233b;
                c3333p6.f34233b = b10;
                z14 = z15;
                if (j14 > 0) {
                    c3298l33.C().Z(t10, j14);
                    z14 = z15;
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                b7 C13 = c3298l33.C();
                String string = t10.getString("_ffr");
                if (K9.r.b(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                C3298l3 c3298l37 = C13.f33578a;
                if (Objects.equals(string, c3298l37.x().f33533w.a())) {
                    c3298l37.a().v().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                c3298l37.x().f33533w.b(string);
            } else if ("_ae".equals(str2)) {
                String a10 = c3298l33.C().f33578a.x().f33533w.a();
                if (!TextUtils.isEmpty(a10)) {
                    t10.putString("_ffr", a10);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(t10);
            boolean p10 = c3298l33.w().H(null, AbstractC3209a2.f33843V0) ? c3298l3.z().p() : c3298l33.x().f33530t.a();
            if (c3298l33.x().f33527q.a() > j11 && c3298l33.x().A(j10) && p10) {
                c3298l33.a().w().a("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j12 = j11;
                B("auto", "_sid", null, c3298l33.e().a());
                B("auto", "_sno", null, c3298l33.e().a());
                B("auto", "_se", null, c3298l33.e().a());
                w42 = this;
                c3298l33.x().f33528r.b(j12);
            } else {
                j12 = j11;
                str4 = "_ae";
            }
            if (t10.getLong("extend_session", j12) == 1) {
                c3298l33.a().w().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j13 = j10;
                c3298l36.z().f34269e.b(j13, true);
            } else {
                j13 = j10;
            }
            ArrayList arrayList2 = new ArrayList(t10.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i11 = z14; i11 < size; i11++) {
                String str6 = (String) arrayList2.get(i11);
                if (str6 != null) {
                    c3298l33.C();
                    Object obj = t10.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[z14] = (Bundle) obj;
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
                        t10.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i12 = z14;
            while (i12 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i12);
                String str7 = i12 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str5);
                if (z11) {
                    bundle2 = c3298l33.C().Q(bundle2, null);
                }
                Bundle bundle3 = bundle2;
                c3298l3.J().c0(new zzbg(str7, new zzbe(bundle3), str5, j13), str3);
                if (!z13) {
                    Iterator it = w42.f33722e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3211a4) it.next()).a(str, str2, new Bundle(bundle3), j10);
                    }
                }
                i12++;
                str5 = str;
                j13 = j10;
            }
            c3298l33.c();
            if (c3298l3.I().q(z14) == null || !str4.equals(str2)) {
                return;
            }
            c3298l3.z().f34270f.d(true, true, c3298l33.e().b());
        }
    }

    public final boolean v0() {
        return this.f33731n;
    }

    public final void w(String str, String str2, Bundle bundle, String str3) {
        C3298l3.q();
        x("auto", str2, this.f33578a.e().a(), bundle, false, true, true, str3);
    }

    public final PriorityQueue w0() {
        if (this.f33730m == null) {
            this.f33730m = new PriorityQueue(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.O4
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return Long.valueOf(((zzoh) obj).f34440b);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.P4
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f33730m;
    }

    public final void x(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        int i10 = b7.f33942i;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i11 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i11 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i11];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i11] = new Bundle((Bundle) parcelable);
                        }
                        i11++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i11 < list.size()) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                        i11++;
                    }
                }
            }
        }
        this.f33578a.b().t(new RunnableC3315n4(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    public final void x0() {
        zzoh zzohVar;
        h();
        this.f33731n = false;
        if (w0().isEmpty() || this.f33726i || (zzohVar = (zzoh) w0().poll()) == null) {
            return;
        }
        C3298l3 c3298l3 = this.f33578a;
        AbstractC6699a H10 = c3298l3.C().H();
        if (H10 != null) {
            this.f33726i = true;
            C3376v2 w10 = c3298l3.a().w();
            String str = zzohVar.f34439a;
            w10.b("Registering trigger URI", str);
            Ta.o c10 = H10.c(Uri.parse(str));
            if (c10 != null) {
                Ta.i.a(c10, new C3259g4(this, zzohVar), new ExecutorC3251f4(this));
            } else {
                this.f33726i = false;
                w0().add(zzohVar);
            }
        }
    }

    public final void y(String str, String str2, Object obj, boolean z10) {
        z("auto", "_ldl", obj, true, this.f33578a.e().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        int i11;
        if (z10) {
            i11 = this.f33578a.C().y0(str2);
        } else {
            b7 C10 = this.f33578a.C();
            if (C10.t0("user property", str2)) {
                if (C10.v0("user property", Y3.zza, null, str2)) {
                    C10.f33578a.w();
                    if (C10.w0("user property", 24, str2)) {
                        i10 = 0;
                        if (i10 != 0) {
                            C3298l3 c3298l3 = this.f33578a;
                            b7 C11 = c3298l3.C();
                            c3298l3.w();
                            this.f33578a.C().B(this.f33740w, null, i10, "_ev", C11.q(str2, 24, true), str2 != null ? str2.length() : 0);
                            return;
                        }
                        String str3 = str == null ? "app" : str;
                        if (obj == null) {
                            A(str3, str2, j10, null);
                            return;
                        }
                        C3298l3 c3298l32 = this.f33578a;
                        int y10 = c3298l32.C().y(str2, obj);
                        if (y10 == 0) {
                            Object z11 = c3298l32.C().z(str2, obj);
                            if (z11 != null) {
                                A(str3, str2, j10, z11);
                                return;
                            }
                            return;
                        }
                        b7 C12 = c3298l32.C();
                        c3298l32.w();
                        this.f33578a.C().B(this.f33740w, null, y10, "_ev", C12.q(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                        return;
                    }
                } else {
                    i11 = 15;
                }
            }
            i10 = 6;
            if (i10 != 0) {
            }
        }
        i10 = i11;
        if (i10 != 0) {
        }
    }
}
