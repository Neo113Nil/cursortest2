package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import io.sentry.protocol.DebugImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final d7 G;
    private final boolean H;
    private final String I;
    private final Map J;
    private final com.applovin.impl.sdk.l a;
    private final a b;
    private int c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final String p;
    private final String q;
    private String r;
    private String s;
    private final String t;
    private final String u;
    private final String v;
    private final String w;
    private final int x;
    private final List y;
    private final List z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");

        private final String a;

        a(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.a;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");

        private final String a;
        private final int b;
        private final String c;

        b(String str, int i2, String str2) {
            this.a = str;
            this.b = i2;
            this.c = str2;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.a;
        }

        public int d() {
            return this.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0283  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g3(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        String str3;
        boolean z3;
        boolean z4;
        Integer a2;
        JSONObject jSONObject2;
        String string;
        boolean z5;
        this.a = lVar;
        String string2 = JsonUtils.getString(jSONObject, "name", "");
        this.p = string2;
        this.q = JsonUtils.getString(jSONObject, "display_name", "");
        this.r = JsonUtils.getString(jSONObject, "adapter_class", "");
        this.u = JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.B = a(jSONObject);
        Boolean bool = Boolean.FALSE;
        this.k = JsonUtils.getBoolean(jSONObject, "hide_if_missing", bool).booleanValue();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, com.safedk.android.utils.j.c, new JSONObject());
        this.z = a(jSONObject3, lVar);
        this.o = JsonUtils.getBoolean(jSONObject3, "java_8_required", bool).booleanValue();
        this.F = JsonUtils.getBoolean(jSONObject3, "hide_initialization_status", bool).booleanValue();
        this.n = JsonUtils.getBoolean(jSONObject3, "check_sdk_adapter_version_mismatch", Boolean.TRUE).booleanValue();
        this.C = JsonUtils.getList(jSONObject3, "live_network_filtering_names", null);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "test_mode", new JSONObject());
        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "network_names", (JSONObject) null);
        boolean z6 = false;
        if (jSONObject5 == null || jSONObject5.length() <= 0) {
            z = 0;
            this.D = Arrays.asList(string2);
            this.E = null;
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(string2));
            HashMap hashMap = new HashMap(jSONObject5.length());
            Iterator<String> keys = jSONObject5.keys();
            while (keys.hasNext()) {
                boolean z7 = z6;
                String next = keys.next();
                MaxAdFormat formatFromString = MaxAdFormat.formatFromString(next);
                String string3 = JsonUtils.getString(jSONObject5, next, null);
                if (formatFromString != null && !TextUtils.isEmpty(string3)) {
                    arrayList.add(string3);
                    hashMap.put(formatFromString, string3);
                }
                z6 = z7;
            }
            z = z6;
            this.D = arrayList;
            this.E = hashMap;
        }
        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject, "test_mode", new JSONObject());
        Boolean bool2 = Boolean.TRUE;
        this.i = JsonUtils.getBoolean(jSONObject6, "supported", bool2).booleanValue();
        this.j = JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", Boolean.FALSE).booleanValue();
        this.v = JsonUtils.getString(jSONObject6, "message", null);
        this.G = new d7(JsonUtils.getJSONObject(jSONObject3, "tcf_config"), this.q);
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.d = q7.a(list);
        } else {
            this.d = q7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
        List emptyList = Collections.emptyList();
        String str4 = this.r;
        String string4 = JsonUtils.getString(jSONObject3, "init_adapter_class", null);
        if (string4 != null) {
            this.r = string4;
        }
        MaxAdapter a3 = y3.a(str4, lVar);
        if (a3 != null) {
            this.e = true;
            try {
                str = a3.getAdapterVersion();
                try {
                    str2 = y3.a(a3);
                    try {
                        this.h = y3.a(a3, this.r);
                        emptyList = a(a3, JsonUtils.getBoolean(jSONObject4, "is_mrec_supported", bool2).booleanValue());
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject3, "native_ad_view_config", (JSONObject) null);
                        if (jSONObject7 != null) {
                            String string5 = JsonUtils.getString(jSONObject7, "min_adapter_version", null);
                            try {
                                if (string5 != null) {
                                    if (q7.a(str, string5) < 0) {
                                        z5 = z;
                                        str3 = JsonUtils.getString(jSONObject7, BrandSafetyEvent.ad, null);
                                    }
                                }
                                str3 = JsonUtils.getString(jSONObject7, BrandSafetyEvent.ad, null);
                            } catch (Throwable th) {
                                th = th;
                                str3 = null;
                                com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                z4 = z5;
                                z3 = z;
                                Class<?> cls = Class.forName(this.r);
                                Class<?>[] clsArr = new Class[3];
                                clsArr[z] = MaxAdapterResponseParameters.class;
                                clsArr[1] = Activity.class;
                                clsArr[2] = MaxNativeAdAdapterListener.class;
                                z2 = cls.getMethod("loadNativeAd", clsArr).getDeclaringClass().equals(cls);
                                this.t = str;
                                this.s = str2;
                                this.y = emptyList;
                                this.l = z2;
                                this.m = z4;
                                this.w = str3;
                                this.A = a(jSONObject3, str, lVar);
                                this.g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                                this.b = a();
                                this.f = str.equals(this.u) && !z3;
                                Context p = com.applovin.impl.sdk.l.p();
                                int lastIndexOf = this.p.lastIndexOf("_");
                                this.x = p.getResources().getIdentifier("applovin_ic_mediation_" + (lastIndexOf == -1 ? this.p.toLowerCase().substring(0, lastIndexOf) : this.p.toLowerCase()), "drawable", p.getPackageName());
                                this.c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                                AppLovinCommunicator.getInstance(p).subscribe(this, "adapter_initialization_status");
                                a2 = lVar.U().a(this.r);
                                if (a2 != null) {
                                }
                                jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                                if (jSONObject2 != null) {
                                }
                                this.H = false;
                                this.I = null;
                                this.J = null;
                                return;
                            }
                            z5 = true;
                        } else {
                            str3 = null;
                            z5 = z;
                        }
                        try {
                            z4 = z5;
                            z3 = a3.isBeta();
                        } catch (Throwable th2) {
                            th = th2;
                            com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                            z4 = z5;
                            z3 = z;
                            Class<?> cls2 = Class.forName(this.r);
                            Class<?>[] clsArr2 = new Class[3];
                            clsArr2[z] = MaxAdapterResponseParameters.class;
                            clsArr2[1] = Activity.class;
                            clsArr2[2] = MaxNativeAdAdapterListener.class;
                            z2 = cls2.getMethod("loadNativeAd", clsArr2).getDeclaringClass().equals(cls2);
                            this.t = str;
                            this.s = str2;
                            this.y = emptyList;
                            this.l = z2;
                            this.m = z4;
                            this.w = str3;
                            this.A = a(jSONObject3, str, lVar);
                            this.g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                            this.b = a();
                            this.f = str.equals(this.u) && !z3;
                            Context p2 = com.applovin.impl.sdk.l.p();
                            int lastIndexOf2 = this.p.lastIndexOf("_");
                            this.x = p2.getResources().getIdentifier("applovin_ic_mediation_" + (lastIndexOf2 == -1 ? this.p.toLowerCase().substring(0, lastIndexOf2) : this.p.toLowerCase()), "drawable", p2.getPackageName());
                            this.c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                            AppLovinCommunicator.getInstance(p2).subscribe(this, "adapter_initialization_status");
                            a2 = lVar.U().a(this.r);
                            if (a2 != null) {
                            }
                            jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                            if (jSONObject2 != null) {
                            }
                            this.H = false;
                            this.I = null;
                            this.J = null;
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str3 = null;
                        z5 = z;
                        com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        z4 = z5;
                        z3 = z;
                        Class<?> cls22 = Class.forName(this.r);
                        Class<?>[] clsArr22 = new Class[3];
                        clsArr22[z] = MaxAdapterResponseParameters.class;
                        clsArr22[1] = Activity.class;
                        clsArr22[2] = MaxNativeAdAdapterListener.class;
                        z2 = cls22.getMethod("loadNativeAd", clsArr22).getDeclaringClass().equals(cls22);
                        this.t = str;
                        this.s = str2;
                        this.y = emptyList;
                        this.l = z2;
                        this.m = z4;
                        this.w = str3;
                        this.A = a(jSONObject3, str, lVar);
                        this.g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                        this.b = a();
                        this.f = str.equals(this.u) && !z3;
                        Context p22 = com.applovin.impl.sdk.l.p();
                        int lastIndexOf22 = this.p.lastIndexOf("_");
                        this.x = p22.getResources().getIdentifier("applovin_ic_mediation_" + (lastIndexOf22 == -1 ? this.p.toLowerCase().substring(0, lastIndexOf22) : this.p.toLowerCase()), "drawable", p22.getPackageName());
                        this.c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                        AppLovinCommunicator.getInstance(p22).subscribe(this, "adapter_initialization_status");
                        a2 = lVar.U().a(this.r);
                        if (a2 != null) {
                        }
                        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                        if (jSONObject2 != null) {
                        }
                        this.H = false;
                        this.I = null;
                        this.J = null;
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str2 = "";
                }
            } catch (Throwable th5) {
                th = th5;
                str = "";
                str2 = str;
            }
            try {
                Class<?> cls222 = Class.forName(this.r);
                Class<?>[] clsArr222 = new Class[3];
                clsArr222[z] = MaxAdapterResponseParameters.class;
                clsArr222[1] = Activity.class;
                clsArr222[2] = MaxNativeAdAdapterListener.class;
                z2 = cls222.getMethod("loadNativeAd", clsArr222).getDeclaringClass().equals(cls222);
            } catch (Throwable th6) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th6);
                }
                z2 = z;
            }
        } else {
            this.e = z;
            str = "";
            str2 = str;
            z2 = false;
            str3 = null;
            z3 = false;
            z4 = false;
        }
        this.t = str;
        this.s = str2;
        this.y = emptyList;
        this.l = z2;
        this.m = z4;
        this.w = str3;
        this.A = a(jSONObject3, str, lVar);
        this.g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
        this.b = a();
        this.f = str.equals(this.u) && !z3;
        Context p222 = com.applovin.impl.sdk.l.p();
        int lastIndexOf222 = this.p.lastIndexOf("_");
        this.x = p222.getResources().getIdentifier("applovin_ic_mediation_" + (lastIndexOf222 == -1 ? this.p.toLowerCase().substring(0, lastIndexOf222) : this.p.toLowerCase()), "drawable", p222.getPackageName());
        this.c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        AppLovinCommunicator.getInstance(p222).subscribe(this, "adapter_initialization_status");
        a2 = lVar.U().a(this.r);
        if (a2 != null) {
            this.c = a2.intValue();
        }
        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
        if (jSONObject2 != null || !this.d) {
            this.H = false;
            this.I = null;
            this.J = null;
            return;
        }
        this.H = true;
        this.I = JsonUtils.getString(jSONObject2, "test_mode_app_id", null);
        JSONObject jSONObject8 = JsonUtils.getJSONObject(jSONObject2, "test_mode_slot_ids", new JSONObject());
        HashMap hashMap2 = new HashMap(jSONObject8.length());
        Iterator<String> keys2 = jSONObject8.keys();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            MaxAdFormat formatFromString2 = MaxAdFormat.formatFromString(next2);
            JSONObject jSONObject9 = JsonUtils.getJSONObject(jSONObject8, next2, (JSONObject) null);
            if (formatFromString2 != null && jSONObject9 != null && (string = JsonUtils.getString(jSONObject9, DebugImage.JsonKeys.UUID, null)) != null) {
                hashMap2.put(formatFromString2, new x(string, jSONObject9, formatFromString2));
            }
        }
        this.J = hashMap2;
    }

    private a a() {
        a aVar = this.d ? this.e ? a.COMPLETE : this.g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            if (!((r4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((l1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.o || com.applovin.impl.sdk.l.H0()) ? E() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f;
    }

    public boolean B() {
        return this.h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.o;
    }

    public boolean E() {
        if (!this.n || !StringUtils.isValidString(this.s)) {
            return false;
        }
        return !q7.d(this.s).equals(q7.a(this.t, this.s.split("\\.").length));
    }

    public boolean F() {
        return this.d;
    }

    public boolean G() {
        return this.b == a.MISSING && this.k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.l;
    }

    public boolean J() {
        return this.m;
    }

    public String b() {
        return this.r;
    }

    public String c() {
        return this.t;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.x;
    }

    public int i() {
        return this.c;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder("\n---------- ");
        String str = "UNAVAILABLE";
        StringBuilder append = sb.append(this.p).append(" ----------\nStatus  - ").append(this.b.b()).append("\nSDK     - ").append((!this.d || TextUtils.isEmpty(this.s)) ? "UNAVAILABLE" : this.s).append("\nAdapter - ");
        if (this.e && !TextUtils.isEmpty(this.t)) {
            str = this.t;
        }
        append.append(str);
        for (r4 r4Var : n()) {
            if (!r4Var.c()) {
                sb.append("\n* MISSING ").append(r4Var.b()).append(": ").append(r4Var.a());
            }
        }
        for (l1 l1Var : f()) {
            if (!l1Var.c()) {
                sb.append("\n* MISSING ").append(l1Var.b()).append(": ").append(l1Var.a());
            }
        }
        return sb.toString();
    }

    public String k() {
        return this.u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.p;
    }

    public List n() {
        return this.z;
    }

    public final com.applovin.impl.sdk.l o() {
        return this.a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.r.equals(string)) {
            this.c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter a2 = y3.a(string, this.a);
            if (a2 != null) {
                String a3 = y3.a(a2);
                if (this.s.equals(a3)) {
                    return;
                }
                this.s = a3;
                this.a.u().a(this.s, string);
            }
        }
    }

    public String p() {
        return this.s;
    }

    public a q() {
        return this.b;
    }

    public List r() {
        return this.y;
    }

    public List s() {
        return this.B;
    }

    public d7 t() {
        return this.G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.p + ", displayName=" + this.q + ", sdkAvailable=" + this.d + ", sdkVersion=" + this.s + ", adapterAvailable=" + this.e + ", adapterVersion=" + this.t + "}";
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.v;
    }

    public String w() {
        return this.w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && F() && z())) ? !this.a.u0().c() ? b.DISABLED : (this.j && (this.c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.e;
    }

    private List a(MaxAdapter maxAdapter, boolean z) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        ArrayList arrayList = new ArrayList();
        if (this.r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            r4 r4Var = new r4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.l.p());
            if (r4Var.c()) {
                arrayList.add(r4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new r4(next, jSONObject2.getString(next), com.applovin.impl.sdk.l.p()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.l lVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new l1(jSONObject2, lVar));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && l1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new l1(jSONObject3, lVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(g3 g3Var) {
        return this.q.compareToIgnoreCase(g3Var.q);
    }
}
