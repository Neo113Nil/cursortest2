package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public class c {
    protected static final String S = "network_name";
    public static final String a = "AdInfo";
    public static final String b = "image_hash";
    public static final String c = "sdk_package";
    public static final String d = "sdk_uid";
    public static final String e = "type";
    public static final String f = "ad_format_type";
    public static final String g = "response_code";
    public static final String h = "image_url";
    public static final String i = "image_id";
    public static final String j = "image_orientation";
    public static final String k = "text";
    public static final String l = "safedk_version";
    public Bundle A;
    String B;
    String C;
    String D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    public boolean I;
    AdNetworkDiscovery.WebViewResourceMatchingMethod J;
    String K;
    String L;
    String M;
    boolean N;
    boolean O;
    String P;
    String Q;
    final m R;
    protected boolean T;
    public boolean U;
    protected boolean V;
    private final List<l> W;
    private int X;
    protected List<String> m;
    protected List<String> n;
    long o;
    public BrandSafetyUtils.AdType p;
    protected String q;
    long r;
    String s;
    String t;
    BrandSafetyUtils.ScreenShotOrientation u;
    String v;
    boolean w;
    String x;
    int y;
    int z;

    public c(String[] strArr, int i2, Bundle bundle, String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, BrandSafetyUtils.AdType adType) {
        this(str, str2, str3, screenShotOrientation, null, adType);
        if (strArr != null) {
            this.C = strArr[0];
            this.B = strArr[1];
        }
        this.A = bundle;
        this.z = i2;
    }

    public c(int i2, Bundle bundle, String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, BrandSafetyUtils.AdType adType) {
        this(str, str2, str3, screenShotOrientation, null, adType);
        this.A = bundle;
        this.z = i2;
    }

    public c(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, BrandSafetyUtils.AdType adType) {
        this.m = null;
        this.n = null;
        this.o = 0L;
        this.u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.w = false;
        this.x = null;
        this.y = 0;
        this.B = null;
        this.C = null;
        this.W = new ArrayList();
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.L = null;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = new m();
        this.U = false;
        this.X = 0;
        this.V = false;
        Object[] objArr = new Object[8];
        objArr[0] = "AdInfo ctor started, hashValue = ";
        objArr[1] = str;
        objArr[2] = ", fileName = ";
        objArr[3] = str4;
        objArr[4] = ", maxSdk = ";
        objArr[5] = str2;
        objArr[6] = ", adType = ";
        objArr[7] = adType != null ? adType.name() : "";
        Logger.d(a, objArr);
        this.v = str2;
        this.r = System.currentTimeMillis();
        this.p = adType;
        k kVar = new k(str, str4, screenShotOrientation);
        synchronized (this.W) {
            this.W.add(new l(str3, kVar, str2, adType));
        }
        if (str2 != null) {
            this.J = CreativeInfoManager.b(str2);
        }
    }

    public c(String str, long j2, BrandSafetyUtils.AdType adType) {
        this.m = null;
        this.n = null;
        this.o = 0L;
        this.u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.w = false;
        this.x = null;
        this.y = 0;
        this.B = null;
        this.C = null;
        this.W = new ArrayList();
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.L = null;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = new m();
        this.U = false;
        this.X = 0;
        this.V = false;
        Object[] objArr = new Object[6];
        objArr[0] = "AdInfo ctor started, maxSdk = ";
        objArr[1] = str;
        objArr[2] = ", timestamp = ";
        objArr[3] = Long.valueOf(this.r);
        objArr[4] = ", adType = ";
        objArr[5] = adType != null ? adType.name() : "";
        Logger.d(a, objArr);
        this.v = str;
        this.r = j2;
        this.p = adType;
    }

    public long a() {
        return this.r;
    }

    public String b() {
        return this.t;
    }

    public void a(String str) {
        this.t = str;
    }

    public String c() {
        return this.v;
    }

    public void b(String str) {
        this.v = str;
    }

    public boolean d() {
        return this.w;
    }

    public void a(boolean z) {
        this.w = z;
    }

    public String e() {
        return this.x;
    }

    protected boolean c(String str) {
        l i2 = i();
        if (this.x == null && i2 != null) {
            if (i2.j() == null || (TextUtils.isEmpty(i2.j().M()) && !i2.j().an())) {
                this.x = str;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean f() {
        return this.D != null;
    }

    public void b(boolean z) {
        this.O = z;
    }

    public void a(CreativeInfo creativeInfo) {
        if (creativeInfo != null) {
            if (CreativeInfoManager.a(this.v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false)) {
                if (this.D != null && !creativeInfo.an()) {
                    creativeInfo.ao();
                    String h2 = creativeInfo.h();
                    if (h2 != null) {
                        creativeInfo.e(h2 + CreativeInfo.aI);
                    }
                }
            } else if (creativeInfo.an()) {
                if (this.D == null) {
                    String uuid = UUID.randomUUID().toString();
                    this.D = uuid;
                    Logger.d(a, "set CI, generate multi ad UUID: ", uuid);
                } else {
                    l i2 = i();
                    if (i2 != null && i2.j() != null) {
                        l lVar = new l(UUID.randomUUID().toString(), i2.b());
                        lVar.h.a(i2.h);
                        lVar.o.a(i2.o.keySet());
                        lVar.q.a(i2.q.keySet());
                        lVar.n.a(i2.n.keySet());
                        lVar.p.a(i2.p.keySet());
                        lVar.r.a(i2.r.keySet());
                        synchronized (this.W) {
                            this.W.add(lVar);
                        }
                        Logger.d(a, "set CI, create new impression for multi ad, impression list: ", this.W);
                    }
                }
            }
            l i3 = i();
            Logger.d(a, "set CI, impression: ", i3);
            if (i3 != null) {
                if (!creativeInfo.an() && i3.j() != null && i3.j().L() != null && !i3.j().L().equals(creativeInfo.L())) {
                    Logger.d(a, "set CI, failed to set CI due to unmatched IDs: old: ", creativeInfo.L(), ", new: ", i3.j().L());
                    return;
                }
                if (i3.g() || i3.h()) {
                    i3.m();
                }
                i3.a(creativeInfo);
            }
            Logger.d(a, "set CI, number of CIs: ", Integer.valueOf(k().size()), ", impression IDs: ", H(), ", multi ad UUID: ", this.D);
        }
    }

    public List<l> g() {
        return this.W;
    }

    public List<l> h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.W) {
            for (l lVar : this.W) {
                if (lVar.j() != null && this.m != null && this.m.contains(lVar.j().ak())) {
                    arrayList.add(lVar);
                }
            }
        }
        return arrayList;
    }

    public l i() {
        if (this.m != null && this.D == null) {
            synchronized (this.W) {
                for (l lVar : this.W) {
                    if (lVar.j() != null && this.m.contains(lVar.j().ak())) {
                        return lVar;
                    }
                }
            }
        }
        if (!this.W.isEmpty()) {
            List<l> list = this.W;
            return list.get(list.size() - 1);
        }
        Logger.d(a, "Failed to get active impression, view hierarchy: ", this.m, ", impression IDs: ", H());
        return null;
    }

    public CreativeInfo j() {
        l i2 = i();
        if (i2 != null) {
            return i2.j();
        }
        return null;
    }

    public List<CreativeInfo> k() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.W) {
            for (l lVar : this.W) {
                if (lVar.j() != null) {
                    arrayList.add(lVar.j());
                }
            }
        }
        return arrayList;
    }

    public List<CreativeInfo> l() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.W) {
            for (l lVar : this.W) {
                boolean z = false;
                AdNetworkDiscovery j2 = CreativeInfoManager.j(c());
                if (j2 != null && j2.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                    z = true;
                }
                if (lVar.j() != null && this.m != null && (z || this.m.contains(lVar.j().ak()))) {
                    arrayList.add(lVar.j());
                }
            }
        }
        return arrayList;
    }

    public k m() {
        l i2 = i();
        if (i2 != null) {
            return i2.c;
        }
        return null;
    }

    public String n() {
        l i2 = i();
        if (i2 != null) {
            return i2.a;
        }
        return "";
    }

    private List<String> H() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.W) {
            Iterator<l> it = this.W.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
        }
        return arrayList;
    }

    public String o() {
        return this.B;
    }

    public String p() {
        return this.C;
    }

    public void a(String[] strArr) {
        this.C = strArr[0];
        this.B = strArr[1];
    }

    public int q() {
        return this.z;
    }

    public Bundle r() {
        return this.A;
    }

    public int s() {
        return this.y;
    }

    public void c(boolean z) {
        this.E = z;
    }

    public void d(boolean z) {
        this.F = z;
    }

    public void e(boolean z) {
        this.G = z;
    }

    public String t() {
        return this.q;
    }

    public void u() {
        l i2 = i();
        if (i2 != null && i2.j() != null) {
            List<String> Z = i2.j().Z();
            if (Z != null && !Z.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = Z.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append("\n");
                }
                this.q = sb.toString();
                return;
            }
            return;
        }
        Logger.d(a, "Cannot extract text as Creative info object is null");
    }

    public long v() {
        return this.o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" maxAdSdk: ");
        String str = this.v;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(" impression IDs: ");
        sb.append(H());
        sb.append(" clickUrl: ");
        String str2 = this.x;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(" viewAddress: ");
        String str3 = this.K;
        sb.append(str3 != null ? str3 : "");
        return sb.toString();
    }

    public String w() {
        return this.L;
    }

    public List<String> x() {
        return this.m;
    }

    public void a(List<String> list) {
        this.m = list;
    }

    public void b(List<WeakReference<WebView>> list) {
        StringBuilder sb = new StringBuilder("setViewsAddresses added [");
        this.n = new ArrayList();
        synchronized (list) {
            for (WeakReference<WebView> weakReference : list) {
                if (weakReference != null && weakReference.get() != null) {
                    String a2 = BrandSafetyUtils.a((Object) weakReference.get());
                    this.n.add(a2);
                    sb.append(a2 + ServerSentEventKt.SPACE);
                }
            }
            sb.append(X3.j.e);
            Logger.d(a, sb.toString());
        }
    }

    public String y() {
        Bundle bundle = this.A;
        if (bundle != null && bundle.containsKey(BrandSafetyEvent.k) && !TextUtils.isEmpty(this.A.getString(BrandSafetyEvent.k))) {
            return this.A.getString(BrandSafetyEvent.k);
        }
        return null;
    }

    public String z() {
        Bundle bundle = this.A;
        if (bundle != null && bundle.containsKey("creative_id") && !TextUtils.isEmpty(this.A.getString("creative_id"))) {
            return this.A.getString("creative_id");
        }
        return null;
    }

    public String A() {
        Bundle bundle = this.A;
        if (bundle != null && bundle.containsKey("network_name") && !TextUtils.isEmpty(this.A.getString("network_name"))) {
            return this.A.getString("network_name");
        }
        return null;
    }

    public String B() {
        return this.Q;
    }

    public void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.Q;
            if (str2 == null) {
                this.Q = str;
                return;
            }
            if (!str2.contains(str)) {
                this.Q += m.ac + str;
            }
        }
    }

    public void a(String str, m.a... aVarArr) {
        this.R.a(str, aVarArr);
    }

    public void a(Long l2, Long l3, String str, m.a... aVarArr) {
        this.R.a(l2, l3, str, aVarArr);
    }

    public void b(String str, m.a... aVarArr) {
        this.R.b(str, aVarArr);
    }

    public void a(m mVar) {
        this.R.a(mVar);
    }

    public void f(boolean z) {
        this.W.clear();
        this.m = null;
        this.o = 0L;
        this.q = null;
        this.r = System.currentTimeMillis();
        this.s = null;
        this.t = null;
        this.u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.v = null;
        this.w = false;
        this.x = null;
        this.y = 0;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        i().k = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.N = false;
        this.O = false;
        if (z) {
            this.P = null;
        }
        this.Q = null;
    }

    public void C() {
        this.L = null;
        this.K = null;
        if (i() != null && i().b() != null) {
            i().a((String) null);
        }
        this.A = null;
        this.z = 0;
        this.B = null;
        this.C = null;
    }

    public void D() {
        f(true);
        C();
    }

    public void a(d dVar, Bundle bundle, int i2) {
        this.L = dVar.c;
        this.K = dVar.g;
        if (i() != null) {
            i().a(dVar.g);
        }
        this.A = bundle;
        this.z = i2;
    }

    int E() {
        return this.X;
    }

    void F() {
        this.X++;
    }

    void G() {
        this.X = 0;
    }
}
