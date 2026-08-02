package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.b0;
import com.applovin.impl.d7;
import com.applovin.impl.g3;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.C2321a2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* loaded from: classes3.dex */
public class q3 extends u2 implements AppLovinCommunicatorSubscriber, b0.a {
    private List A;
    private List B;
    private List C;
    private List D;
    private com.applovin.impl.sdk.l e;
    private List f;
    private List g;
    private List h;
    private List i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private final StringBuilder n;
    private final AtomicBoolean o;
    private boolean p;
    private List q;
    private List r;
    private List s;
    private List t;
    private List u;
    private List v;
    private List w;
    private List x;
    private List y;
    private List z;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b0.b.values().length];
            a = iArr;
            try {
                iArr[b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    private enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        EVENTS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public q3(Context context) {
        super(context);
        this.n = new StringBuilder("");
        this.o = new AtomicBoolean();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    private void A() {
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + q7.c(this.e));
        sb.append("\nTest Mode - ".concat(this.e.u0().c() ? "enabled" : C2321a2.e));
        sb.append("\nTarget SDK - " + this.e.B().G().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.e.a(z4.R3);
        String b2 = j.b();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb2 = new StringBuilder("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb.append(sb2.append(str2).toString());
        StringBuilder sb3 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(b2)) {
            b2 = "Disabled";
        }
        sb.append(sb3.append(b2).toString());
        if (this.e.J0()) {
            String a2 = q7.a(this.e.p0());
            sb.append("\nUnity Version - " + (StringUtils.isValidString(a2) ? a2 : "None"));
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(q0.a(this.a));
        sb.append(this.e.y().e());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.e.t0().i());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb.append(((d7) it.next()).e());
        }
        sb.append("\n========== NETWORKS ==========");
        Iterator it2 = this.r.iterator();
        while (it2.hasNext()) {
            a(sb, ((g3) it2.next()).j());
        }
        Iterator it3 = this.q.iterator();
        while (it3.hasNext()) {
            a(sb, ((g3) it3.next()).j());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator it4 = this.g.iterator();
        while (it4.hasNext()) {
            a(sb, ((n) it4.next()).e());
        }
        sb.append("\n========== END ==========");
        com.applovin.impl.sdk.p.g("MediationDebuggerListAdapter", sb.toString());
        this.n.append(sb.toString());
    }

    private List g() {
        boolean c2 = this.e.u0().c();
        List b2 = this.e.u0().b();
        return c2 ? a((String) null, a(b2, false)) : a(a(b2, true), (String) null);
    }

    private List j() {
        ArrayList arrayList = new ArrayList(7);
        PackageInfo a2 = q7.a(this.a, 0);
        String str = a2 != null ? a2.versionName : null;
        arrayList.add(t2.a().d("Package Name").c(this.a.getPackageName()).a());
        t2.b d2 = t2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(d2.c(str).a());
        arrayList.add(t2.a().d(com.moloco.sdk.acm.b.d).c(q7.d()).a());
        arrayList.add(t2.a().d("Account").c(StringUtils.isValidString(this.l) ? this.l : "None").a());
        arrayList.add(t2.a().d("Mediation Provider").c(StringUtils.isValidString(this.e.X()) ? this.e.X() : "None").a());
        arrayList.add(t2.a().d("OM SDK Version").c(this.e.g0().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.l.H0()));
        return arrayList;
    }

    private t2 l() {
        String d2 = this.e.t0().d();
        boolean isValidString = StringUtils.isValidString(d2);
        boolean isValidString2 = StringUtils.isValidString(this.e.t0().j());
        t2.b d3 = t2.a(t2.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!isValidString) {
            d2 = isValidString2 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "None";
        }
        t2.b c2 = d3.c(d2);
        if (this.m) {
            c2.a(true);
            if (isValidString2) {
                c2.a(this.a);
            } else {
                c2.b("TC Data Not Found");
                c2.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z = this.e.w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                c2.a(z ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                c2.b(this.a.getColor(z ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor));
            }
        }
        return c2.a();
    }

    private t2 m() {
        return t2.a().d("MAX Terms and Privacy Policy Flow").a(this.a).a(true).a();
    }

    private List n() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(t2.a().d("View Axon Events").a(this.a).a(true).a());
        return arrayList;
    }

    private t2 o() {
        boolean hasSupportedCmp = this.e.t().hasSupportedCmp();
        return t2.a().d("Google UMP SDK").a(hasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(this.a.getColor(hasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow").a(!hasSupportedCmp).a();
    }

    private List r() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(t2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.e.a(z4.R3);
        t2.b d2 = t2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(d2.c(str).a());
        arrayList.add(e());
        if (this.e.J0()) {
            String a2 = q7.a(this.e.p0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(a2) ? a2 : "None"));
        }
        if (this.e.y().j()) {
            arrayList.add(m());
            arrayList.add(o());
            return arrayList;
        }
        if (this.e.y().l()) {
            arrayList.add(v());
        }
        return arrayList;
    }

    private t2 s() {
        return t2.a().d("Network Consent Statuses").a(this.a).a(true).a();
    }

    private List t() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.e.t0().j())) {
            arrayList.add(s());
        } else {
            arrayList.add(new t4(q0.b(), false, this.a));
        }
        arrayList.add(new t4(q0.a(), true, this.a));
        return arrayList;
    }

    private t2 v() {
        return t2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(this.a.getColor(R.color.applovin_sdk_xmarkColor)).b("Terms Flow has been replaced").a(this.e.y().g()).a(true).a();
    }

    public boolean a(t2 t2Var) {
        if (t2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(t2Var.k().toString());
    }

    public void b(boolean z) {
        this.p = z;
    }

    @Override // com.applovin.impl.u2
    protected List c(int i) {
        return i == e.APP_INFO.ordinal() ? this.w : i == e.MAX.ordinal() ? this.x : i == e.PRIVACY.ordinal() ? this.y : i == e.ADS.ordinal() ? this.z : i == e.EVENTS.ordinal() ? this.A : i == e.INCOMPLETE_NETWORKS.ordinal() ? this.B : i == e.COMPLETED_NETWORKS.ordinal() ? this.C : this.D;
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            arrayList.add(((g3) it.next()).t());
        }
        String k = this.e.t0().k();
        if (k != null) {
            String c2 = this.e.t0().c();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                d7 d7Var = (d7) it2.next();
                if (d7Var.f() == d7.a.TCF_VENDOR && d7Var.d() != null) {
                    d7Var.a(Boolean.valueOf(f7.a(k, d7Var.d().intValue() - 1)));
                } else if (d7Var.f() == d7.a.ATP_NETWORK && d7Var.d() != null) {
                    d7Var.a(f7.a(d7Var.d().intValue(), c2));
                }
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((d7) it3.next()).a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.u2
    protected t2 e(int i) {
        return i == e.APP_INFO.ordinal() ? new x4("APP INFO") : i == e.MAX.ordinal() ? new x4("MAX") : i == e.PRIVACY.ordinal() ? new x4("PRIVACY") : i == e.ADS.ordinal() ? new x4("ADS") : i == e.EVENTS.ordinal() ? new x4("EVENTS") : i == e.INCOMPLETE_NETWORKS.ordinal() ? new x4("INCOMPLETE SDK INTEGRATIONS") : i == e.COMPLETED_NETWORKS.ordinal() ? new x4("COMPLETED SDK INTEGRATIONS") : new x4("MISSING SDK INTEGRATIONS");
    }

    public List f() {
        return this.g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.k;
    }

    public String i() {
        return this.j;
    }

    public List k() {
        return this.t;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.y = t();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(this.q);
            this.C = a(this.r);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.z = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.z = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public List p() {
        return this.h;
    }

    public String q() {
        return this.n.toString();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.o.get() + "}";
    }

    public com.applovin.impl.sdk.l u() {
        return this.e;
    }

    public List w() {
        return this.v;
    }

    public List x() {
        return this.u;
    }

    public boolean y() {
        return this.p;
    }

    public boolean z() {
        return this.o.get();
    }

    @Override // com.applovin.impl.u2
    protected int b() {
        return e.COUNT.ordinal();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o f = ((n) it.next()).f();
            Iterator it2 = f.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((k8) it2.next()).b());
            }
            Iterator it3 = f.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((k8) it3.next()).b());
            }
        }
        this.t = new ArrayList(hashSet);
        this.u = new ArrayList(hashSet2);
        Collections.sort(this.t);
        Collections.sort(this.u);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z, com.applovin.impl.sdk.l lVar) {
        this.e = lVar;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = z;
        if (list != null && this.o.compareAndSet(false, true)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.r);
            this.w.addAll(j());
            this.x.addAll(r());
            this.y.addAll(t());
            this.z.addAll(g());
            this.A.addAll(n());
            this.B = a(this.q);
            this.C = a(this.r);
            this.D = a(this.s);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.a).subscribe(this, arrayList);
            A();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.q3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                q3.this.notifyDataSetChanged();
            }
        });
    }

    private t2 b(String str, String str2) {
        t2.b d2 = t2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            d2.c(str2);
        } else {
            d2.a(R.drawable.applovin_ic_x_mark);
            d2.b(this.a.getColor(R.color.applovin_sdk_xmarkColor));
        }
        return d2.a();
    }

    @Override // com.applovin.impl.u2
    protected int d(int i) {
        if (i == e.APP_INFO.ordinal()) {
            return this.w.size();
        }
        if (i == e.MAX.ordinal()) {
            return this.x.size();
        }
        if (i == e.PRIVACY.ordinal()) {
            return this.y.size();
        }
        if (i == e.ADS.ordinal()) {
            return this.z.size();
        }
        if (i == e.EVENTS.ordinal()) {
            if (this.e.G().isAxonEventTracked()) {
                return this.A.size();
            }
            return 0;
        }
        if (i == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B.size();
        }
        if (i == e.COMPLETED_NETWORKS.ordinal()) {
            return this.C.size();
        }
        return this.D.size();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            if (!g3Var.G()) {
                if (g3Var.q() != g3.a.INCOMPLETE_INTEGRATION && g3Var.q() != g3.a.INVALID_INTEGRATION) {
                    if (g3Var.q() == g3.a.COMPLETE) {
                        this.r.add(g3Var);
                    } else if (g3Var.q() == g3.a.MISSING) {
                        this.s.add(g3Var);
                    }
                } else {
                    this.q.add(g3Var);
                }
            }
        }
    }

    private t2 e() {
        String str;
        t2.b d2 = t2.a().d("Ad Review Version");
        String b2 = j.b();
        if (StringUtils.isValidString(b2)) {
            String a2 = j.a();
            if (!StringUtils.isValidString(a2) || a2.equals(this.e.k0())) {
                str = null;
            } else {
                str = "MAX Ad Review integrated with wrong SDK key. Please check that your " + (this.e.J0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated") + " from the correct account.";
            }
        } else {
            str = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (str != null) {
            d2.b("MAX Ad Review").a(str).a(R.drawable.applovin_ic_x_mark).b(this.a.getColor(R.color.applovin_sdk_xmarkColor)).a(true);
        } else {
            d2.c(b2);
        }
        return d2.a();
    }

    private t2 b(String str) {
        t2.b a2 = t2.a();
        if (this.e.u0().c()) {
            a2.a(this.a);
        }
        t2.b d2 = a2.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.e.u0().c()) {
            str = "Enable";
        }
        return d2.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    @Override // com.applovin.impl.b0.a
    public void a(z zVar, String str) {
        String a2;
        c a3;
        c cVar;
        String str2;
        List<a0> a4 = b0.a(zVar, this.i);
        if (a4.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = c.SUCCESS;
        } else {
            a0 a0Var = null;
            for (a0 a0Var2 : a4) {
                this.e.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.e.Q().b("MediationDebuggerListAdapter", str + " is missing a required entry: " + a0Var2.d());
                }
                if (a0Var2.g()) {
                    a0Var = a0Var2;
                }
            }
            if (a0Var != null) {
                b0.b bVar = b0.b.MISSING_APPLOVIN_ENTRIES;
                a2 = a(bVar, str, a0Var.d());
                a3 = a(bVar);
            } else {
                b0.b bVar2 = b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                a2 = a(bVar2, str, null);
                a3 = a(bVar2);
            }
            String str3 = a2;
            cVar = a3;
            str2 = str3;
        }
        this.x.add(a(str2, cVar));
        c();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            if (g3Var.y() == g3.b.READY) {
                this.v.add(g3Var);
            }
        }
    }

    @Override // com.applovin.impl.b0.a
    public void a(b0.b bVar, String str) {
        if (bVar == b0.b.APP_DETAILS_NOT_FOUND) {
            this.e.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.e.Q().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.x.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (sb2.length() + str.length() >= ((Integer) this.e.a(z4.r)).intValue()) {
            com.applovin.impl.sdk.p.g("MediationDebuggerListAdapter", sb2);
            this.n.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(t2.a().d("View Ad Units (" + this.g.size() + ")").a(this.a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.h.isEmpty()) {
            arrayList.add(t2.a().d("Selective Init Ad Units (" + this.h.size() + ")").a(this.a).a(true).a());
        }
        arrayList.add(t2.a().d("Test Mode Enabled").c(String.valueOf(this.e.u0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b4((g3) it.next(), this.a));
        }
        return arrayList;
    }

    private t2 a(String str) {
        t2.b a2 = t2.a();
        if (!this.e.u0().c()) {
            a2.a(this.a);
        }
        t2.b d2 = a2.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.e.u0().c()) {
            str = "Enable";
        }
        return d2.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private t2 a(boolean z) {
        return t2.a().d("Java 8").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(this.a.getColor(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://support.axon.ai/en/max/android/overview/integration").a(!z).a();
    }

    private t2 a(String str, c cVar) {
        int i;
        int color;
        if (cVar == c.SUCCESS) {
            i = R.drawable.applovin_ic_check_mark_bordered;
            color = this.a.getColor(R.color.applovin_sdk_checkmarkColor);
        } else if (cVar == c.WARNING) {
            i = R.drawable.applovin_ic_warning;
            color = this.a.getColor(R.color.applovin_sdk_warningColor);
        } else {
            i = R.drawable.applovin_ic_x_mark;
            color = this.a.getColor(R.color.applovin_sdk_xmarkColor);
        }
        return t2.a().d("app-ads.txt").a(i).b(color).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i == 3) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        if (i == 4) {
            return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        if (i != 5) {
            return "";
        }
        return "Text file at " + str + " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
    }

    private c a(b0.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return c.ERROR;
        }
        if (i != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z) {
            for (w2 w2Var : this.t) {
                if (list.equals(w2Var.b())) {
                    return w2Var.a();
                }
            }
            for (w2 w2Var2 : this.u) {
                if (list.equals(w2Var2.b())) {
                    return w2Var2.a();
                }
            }
        } else {
            for (g3 g3Var : this.v) {
                if (list.equals(g3Var.u())) {
                    return g3Var.g();
                }
            }
        }
        return UByte$$ExternalSyntheticBackport0.m(",", list);
    }
}
