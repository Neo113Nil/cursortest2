package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import okio.Segment;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class I2 implements Da {

    /* renamed from: n, reason: collision with root package name */
    public static final HashSet f12334n = new HashSet(Arrays.asList(1, 13));

    /* renamed from: o, reason: collision with root package name */
    public static final G2 f12335o = new G2();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f12336a;

    /* renamed from: b, reason: collision with root package name */
    protected final Fh f12337b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    protected final PublicLogger f12338c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    protected final Rn f12339d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    protected final Eg f12340e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    protected final C0548v6 f12341f;

    /* renamed from: g, reason: collision with root package name */
    public final C0088d0 f12342g;

    /* renamed from: h, reason: collision with root package name */
    protected final C0585wi f12343h;

    /* renamed from: i, reason: collision with root package name */
    public C0379ob f12344i;
    public final Cf j;

    /* renamed from: k, reason: collision with root package name */
    public final M9 f12345k;

    /* renamed from: l, reason: collision with root package name */
    public final Je f12346l;

    /* renamed from: m, reason: collision with root package name */
    public final C0162fn f12347m;

    public I2(Context context, C0585wi c0585wi, Fh fh2, M9 m92, C0448r6 c0448r6, Rn rn, Eg eg2, C0548v6 c0548v6, C0088d0 c0088d0, Je je2) {
        Context applicationContext = context.getApplicationContext();
        this.f12336a = applicationContext;
        this.f12343h = c0585wi;
        this.f12337b = fh2;
        this.f12345k = m92;
        this.f12339d = rn;
        this.f12340e = eg2;
        this.f12341f = c0548v6;
        this.f12342g = c0088d0;
        this.f12346l = je2;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(fh2.b().getApiKey());
        this.f12338c = orCreatePublicLogger;
        if (Y2.a(fh2.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.j = c0448r6;
        this.f12347m = new C0162fn(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f12338c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f12338c.info("Put error environment pair <%s, %s>", str, str2);
        Fh fh2 = this.f12337b;
        synchronized (fh2) {
            D8 d82 = fh2.f12226c;
            d82.f12137b.b(d82.f12136a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (lo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str) {
        if (this.f12337b.f()) {
            return;
        }
        this.f12343h.f14847d.c();
        C0379ob c0379ob = this.f12344i;
        c0379ob.f14406a.removeCallbacks(c0379ob.f14408c, c0379ob.f14407b.f12337b.f12301b.getApiKey());
        this.f12337b.f12228e = true;
        C0585wi c0585wi = this.f12343h;
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3("", str, 3, 0, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f12338c.info("Clear app environment", new Object[0]);
        C0585wi c0585wi = this.f12343h;
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        P5 n9 = M3.n();
        Bf bf2 = new Bf(fh2.f12300a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh2.f12301b);
        D8 d82 = fh2.f12226c;
        synchronized (fh2) {
            str = fh2.f12229f;
        }
        c0585wi.a(new C0559vh(n9, false, 1, null, new Fh(bf2, counterConfiguration, d82, str)));
    }

    public final void d(String str) {
        this.f12343h.f14847d.b();
        C0379ob c0379ob = this.f12344i;
        C0379ob.a(c0379ob.f14406a, c0379ob.f14407b, c0379ob.f14408c);
        C0585wi c0585wi = this.f12343h;
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3("", str, 6400, 0, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
        this.f12337b.f12228e = false;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        C0433qf c0433qf;
        C0585wi c0585wi = this.f12343h;
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        C0532uf c0532uf = fh2.f12227d;
        synchronized (fh2) {
            str = fh2.f12229f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(fh2.f12301b.getApiKey());
        Set set = AbstractC0576w9.f14825a;
        JSONObject jSONObject = new JSONObject();
        if (c0532uf != null && (c0433qf = c0532uf.f14728a) != null) {
            try {
                jSONObject.put("preloadInfo", c0433qf.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        m32.c(str);
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f12338c.info("Pause session", new Object[0]);
        c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f12338c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f12338c.info("Put app environment: <%s, %s>", str, str2);
        C0585wi c0585wi = this.f12343h;
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        P5 b10 = M3.b(str, str2);
        Bf bf2 = new Bf(fh2.f12300a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh2.f12301b);
        D8 d82 = fh2.f12226c;
        synchronized (fh2) {
            str3 = fh2.f12229f;
        }
        c0585wi.a(new C0559vh(b10, false, 1, null, new Fh(bf2, counterConfiguration, d82, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C0113e0 c0113e0 = new C0113e0(new C0139f0(this, map));
        C0303la c0303la = new C0303la();
        C0448r6 c0448r6 = C0040b4.l().f13372a;
        Thread a7 = c0113e0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c0113e0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a7.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        C0590wn c0590wn = (C0590wn) c0303la.apply(a7, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Bn());
        try {
            map2 = c0113e0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a7 && thread != null) {
                arrayList.add((C0590wn) c0303la.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(c0590wn, arrayList, c0448r6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        String str;
        this.f12338c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        C0585wi c0585wi = this.f12343h;
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        for (Di di2 : eCommerceEvent.toProto()) {
            M3 m32 = new M3(LoggerStorage.getOrCreatePublicLogger(fh2.f12301b.getApiKey()));
            EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
            m32.f12730d = 41000;
            m32.f12728b = m32.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) di2.f12148a)));
            m32.f12733g = di2.f12149b.getBytesTruncated();
            Bf bf2 = new Bf(fh2.f12300a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(fh2.f12301b);
            D8 d82 = fh2.f12226c;
            synchronized (fh2) {
                str = fh2.f12229f;
            }
            c0585wi.a(new C0559vh(m32, false, 1, null, new Fh(bf2, counterConfiguration, d82, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, Throwable th2) {
        Dg dg2 = new Dg(str, a(th2));
        C0585wi c0585wi = this.f12343h;
        byte[] byteArray = MessageNano.toByteArray(this.f12340e.fromModel(dg2));
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, str, 5892, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
        this.f12338c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f12338c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        C0585wi c0585wi = this.f12343h;
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3("", str, 1, 0, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        String str;
        Ni ni2 = H2.f12299a;
        ni2.getClass();
        qo a7 = ni2.a(revenue);
        if (!a7.f14527a) {
            this.f12338c.warning("Passed revenue is not valid. Reason: " + a7.f14528b, new Object[0]);
            return;
        }
        C0585wi c0585wi = this.f12343h;
        Oi oi2 = new Oi(revenue, this.f12338c);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        M3 a10 = M3.a(LoggerStorage.getOrCreatePublicLogger(fh2.f12301b.getApiKey()), oi2);
        Bf bf2 = new Bf(fh2.f12300a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh2.f12301b);
        D8 d82 = fh2.f12226c;
        synchronized (fh2) {
            str = fh2.f12229f;
        }
        c0585wi.a(new C0559vh(a10, false, 1, null, new Fh(bf2, counterConfiguration, d82, str)));
        this.f12338c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        Qn a7 = Tn.a(th2, new V(null, null, this.j.a()), null, (String) this.f12345k.f12577b.a(), (Boolean) this.f12345k.f12578c.a());
        C0585wi c0585wi = this.f12343h;
        c0585wi.a(c0585wi.a(a7, this.f12337b));
        this.f12338c.info("Unhandled exception received: " + a7, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        String str;
        Cdo cdo = new Cdo(Cdo.f13621c);
        Iterator<UserProfileUpdate<? extends InterfaceC0137eo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC0137eo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.f12338c);
            userProfileUpdatePatcher.a(cdo);
        }
        C0240io c0240io = new C0240io();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < cdo.f13622a.size(); i5++) {
            SparseArray sparseArray = cdo.f13622a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i5))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C0163fo) it2.next());
            }
        }
        c0240io.f13985a = (C0163fo[]) arrayList.toArray(new C0163fo[arrayList.size()]);
        qo a7 = f12335o.a(c0240io);
        if (!a7.f14527a) {
            this.f12338c.warning("UserInfo wasn't sent because " + a7.f14528b, new Object[0]);
            return;
        }
        C0585wi c0585wi = this.f12343h;
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        P5 a10 = M3.a(c0240io);
        Bf bf2 = new Bf(fh2.f12300a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh2.f12301b);
        D8 d82 = fh2.f12226c;
        synchronized (fh2) {
            str = fh2.f12229f;
        }
        c0585wi.a(new C0559vh(a10, false, 1, null, new Fh(bf2, counterConfiguration, d82, str)));
        this.f12338c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        d(null);
        this.f12338c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f12338c.info("Send event buffer", new Object[0]);
        C0585wi c0585wi = this.f12343h;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        M3 m32 = new M3("", "", 256, 0, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z5) {
        this.f12337b.f12301b.setDataSendingEnabled(z5);
        this.f12338c.info("Updated data sending enabled: %s", Boolean.valueOf(z5));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, byte[] bArr) {
        C0585wi c0585wi = this.f12343h;
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        m32.f12741p = Collections.singletonMap(str, bArr);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        C0585wi c0585wi = this.f12343h;
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        M3 m32 = new M3(LoggerStorage.getOrCreatePublicLogger(fh2.f12301b.getApiKey()));
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        m32.f12730d = 40962;
        m32.c(str);
        m32.f12728b = m32.e(str);
        Bf bf2 = new Bf(fh2.f12300a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh2.f12301b);
        D8 d82 = fh2.f12226c;
        synchronized (fh2) {
            str2 = fh2.f12229f;
        }
        c0585wi.a(new C0559vh(m32, false, 1, null, new Fh(bf2, counterConfiguration, d82, str2)));
        this.f12338c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z5) {
        String str;
        C0585wi c0585wi = this.f12343h;
        E e7 = new E(adRevenue, z5, this.f12347m, this.f12338c);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        M3 a7 = M3.a(LoggerStorage.getOrCreatePublicLogger(fh2.f12301b.getApiKey()), e7);
        Bf bf2 = new Bf(fh2.f12300a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh2.f12301b);
        D8 d82 = fh2.f12226c;
        synchronized (fh2) {
            str = fh2.f12229f;
        }
        c0585wi.a(new C0559vh(a7, false, 1, null, new Fh(bf2, counterConfiguration, d82, str)));
        this.f12338c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC0176gb.b(adRevenue.payload) + ", autoCollected=" + z5 + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void b(@NonNull String str, String str2) {
        this.f12338c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C0585wi c0585wi = this.f12343h;
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(str2, str, 1, 0, publicLogger);
        m32.f12737l = EnumC0327m9.JS;
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (lo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.f12338c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C0585wi c0585wi = this.f12343h;
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(str2, str, 1, 0, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
    }

    public final Qn a(Throwable th2) {
        Throwable th3;
        StackTraceElement[] stackTraceElementArr;
        if (th2 == null) {
            stackTraceElementArr = null;
            th3 = null;
        } else if (th2 instanceof N1) {
            stackTraceElementArr = th2.getStackTrace();
            th3 = null;
        } else {
            th3 = th2;
            stackTraceElementArr = null;
        }
        return Tn.a(th3, new V(null, null, this.j.a()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.f12345k.f12577b.a(), (Boolean) this.f12345k.f12578c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2, Throwable th2) {
        C0523u6 c0523u6 = new C0523u6(new Dg(str2, a(th2)), str);
        C0585wi c0585wi = this.f12343h;
        byte[] byteArray = MessageNano.toByteArray(this.f12341f.fromModel(c0523u6));
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, str2, 5896, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
        this.f12338c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        Qn a7 = this.f12346l.a(pluginErrorDetails);
        C0585wi c0585wi = this.f12343h;
        Gn gn = a7.f12784a;
        String str = gn != null ? (String) WrapUtils.getOrDefault(gn.f12286a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f12339d.fromModel(a7));
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, str, 5891, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
        this.f12338c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void b(@NonNull String str) {
        C0585wi c0585wi = this.f12343h;
        P5 a7 = P5.a(str);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(a7, fh2), fh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final boolean b() {
        return this.f12337b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, Map<String, Object> map) {
        C0585wi c0585wi = this.f12343h;
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        c0585wi.a(new M3("", str, 1, 0, publicLogger), this.f12337b, 1, map);
        PublicLogger publicLogger2 = this.f12338c;
        StringBuilder sb2 = new StringBuilder("Event received: ");
        sb2.append(WrapUtils.wrapToTag(str));
        sb2.append(". With value: ");
        sb2.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb2.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.Ua
    public final void a(@NonNull Qn qn) {
        C0585wi c0585wi = this.f12343h;
        C0559vh a7 = c0585wi.a(qn, this.f12337b);
        Fh fh2 = a7.f14798e;
        Pl pl = c0585wi.f14848e;
        if (pl != null) {
            fh2.f12301b.setUuid(((Ol) pl).g());
        } else {
            fh2.getClass();
        }
        c0585wi.f14846c.b(a7);
        this.f12338c.info("Unhandled exception received: " + qn, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str) {
        Qn qn;
        Je je2 = this.f12346l;
        if (pluginErrorDetails != null) {
            qn = je2.a(pluginErrorDetails);
        } else {
            je2.getClass();
            qn = null;
        }
        Dg dg2 = new Dg(str, qn);
        C0585wi c0585wi = this.f12343h;
        byte[] byteArray = MessageNano.toByteArray(this.f12340e.fromModel(dg2));
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, str, 5896, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
        this.f12338c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.InterfaceC0165g0
    public final void a(@NonNull V v5) {
        C0062c0 c0062c0 = new C0062c0(v5, (String) this.f12345k.f12577b.a(), (Boolean) this.f12345k.f12578c.a());
        C0585wi c0585wi = this.f12343h;
        byte[] byteArray = MessageNano.toByteArray(this.f12342g.fromModel(c0062c0));
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, "", 5968, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        String str = null;
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
        PublicLogger publicLogger2 = this.f12338c;
        StringBuilder sb2 = new StringBuilder("ANR was reported ");
        C0590wn c0590wn = v5.f12994a;
        if (c0590wn != null) {
            str = "Thread[name=" + c0590wn.f14876a + ",tid={" + c0590wn.f14878c + ", priority=" + c0590wn.f14877b + ", group=" + c0590wn.f14879d + "}] at " + CollectionsKt.J(c0590wn.f14881f, "\n", null, null, null, 62);
        }
        sb2.append(str);
        publicLogger2.info(sb2.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        EnumC0327m9 enumC0327m9;
        if (f12334n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(value, name, Segment.SIZE, moduleEvent.getType(), publicLogger);
        int i5 = E8.f12191a[moduleEvent.getCategory().ordinal()];
        if (i5 == 1) {
            enumC0327m9 = EnumC0327m9.NATIVE;
        } else if (i5 == 2) {
            enumC0327m9 = EnumC0327m9.SYSTEM;
        } else {
            throw new gf.m();
        }
        m32.f12737l = enumC0327m9;
        m32.f12729c = AbstractC0176gb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            m32.f12741p = moduleEvent.getExtras();
        }
        this.f12343h.a(m32, this.f12337b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Qn qn;
        Je je2 = this.f12346l;
        if (pluginErrorDetails != null) {
            qn = je2.a(pluginErrorDetails);
        } else {
            je2.getClass();
            qn = null;
        }
        C0523u6 c0523u6 = new C0523u6(new Dg(str2, qn), str);
        C0585wi c0585wi = this.f12343h;
        byte[] byteArray = MessageNano.toByteArray(this.f12341f.fromModel(c0523u6));
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(byteArray, str2, 5896, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
        this.f12338c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}
