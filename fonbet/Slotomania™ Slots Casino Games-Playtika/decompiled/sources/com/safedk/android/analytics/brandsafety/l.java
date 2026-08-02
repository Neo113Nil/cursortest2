package com.safedk.android.analytics.brandsafety;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public class l {
    public static final String b = "text:";
    private static final String z = "ImpressionInfo";
    private CreativeInfo A;
    private String B;
    private List<String> C;
    String a;
    k c;
    String d;
    RedirectData e;
    int f;
    public HashSet<String> g;
    final m h;
    public String i;
    public BrandSafetyUtils.AdType j;
    boolean k;
    public boolean l;
    public Boolean m;
    public SimpleConcurrentHashSet<String> n;
    public SimpleConcurrentHashSet<String> o;
    public SimpleConcurrentHashSet<String> p;
    public SimpleConcurrentHashSet<String> q;
    public SimpleConcurrentHashSet<String> r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public Boolean x;
    boolean y;

    public boolean a() {
        return this.y;
    }

    public void a(boolean z2) {
        this.y = z2;
        Logger.d(z, "setIsClicked invoked, clicked : ", Boolean.valueOf(z2));
    }

    public String b() {
        return this.B;
    }

    public boolean c() {
        CreativeInfo creativeInfo = this.A;
        return creativeInfo != null && creativeInfo.v();
    }

    public boolean d() {
        CreativeInfo creativeInfo = this.A;
        return creativeInfo != null && creativeInfo.w();
    }

    public void a(String str) {
        this.B = str;
        if (str != null && !this.C.contains(str)) {
            this.C.add(str);
        }
    }

    public List<String> e() {
        return this.C;
    }

    public l(String str, String str2) {
        this(str, null, null, null);
        this.B = str2;
    }

    public l(String str, k kVar, String str2, BrandSafetyUtils.AdType adType) {
        this.d = null;
        this.f = 0;
        this.g = new HashSet<>();
        this.h = new m();
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = new SimpleConcurrentHashSet<>();
        this.o = new SimpleConcurrentHashSet<>();
        this.p = new SimpleConcurrentHashSet<>();
        this.q = new SimpleConcurrentHashSet<>();
        this.r = new SimpleConcurrentHashSet<>();
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = null;
        this.y = false;
        this.C = new ArrayList();
        this.a = str == null ? UUID.randomUUID().toString() : str;
        this.c = kVar;
        this.A = null;
        this.i = str2;
        this.j = adType;
    }

    public l(RedirectData redirectData) {
        this(null, null, null, null);
        this.e = redirectData;
    }

    public boolean f() {
        RedirectData redirectData = this.e;
        return redirectData != null && redirectData.i;
    }

    public boolean g() {
        RedirectData redirectData = this.e;
        return redirectData != null && redirectData.j;
    }

    public boolean h() {
        RedirectData redirectData = this.e;
        return redirectData != null && redirectData.k;
    }

    public void a(RedirectData redirectData) {
        this.e = redirectData;
        this.f++;
        if ((redirectData.j || redirectData.k) && this.A != null) {
            m();
        }
    }

    public void i() {
        k kVar;
        CreativeInfo creativeInfo = this.A;
        if (creativeInfo == null) {
            return;
        }
        boolean a = CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
        if (this.A.an() && (kVar = this.c) != null && !a) {
            Logger.d(z, "removing image taken for multi-ad ", kVar.b);
            BrandSafetyUtils.d(this.c.b);
            this.c = null;
        }
    }

    public void a(CreativeInfo creativeInfo) {
        k kVar;
        if (this.A == null && creativeInfo != null) {
            a(m.m, new m.a[0]);
        }
        this.A = creativeInfo;
        if (creativeInfo != null) {
            creativeInfo.q().addAll(this.g);
            this.g = new HashSet<>();
            i();
            if (creativeInfo.aq() && (kVar = this.c) != null) {
                Logger.d(z, "set creative info, removing image taken for website endcard: ", kVar.b);
                BrandSafetyUtils.d(this.c.b);
                this.c = null;
            }
        }
    }

    public CreativeInfo j() {
        return this.A;
    }

    public String k() {
        return this.a;
    }

    public void l() {
        this.c = null;
    }

    public void a(String str, m.a... aVarArr) {
        this.h.a(str, aVarArr);
    }

    public void b(String str, m.a... aVarArr) {
        this.h.b(str, aVarArr);
    }

    public void m() {
        Logger.d(z, Logger.FeatureTag.NW_RESOURCES, "start collecting expand resources...");
        this.v = true;
    }

    public void b(String str) {
        String str2;
        if (str.startsWith("text:")) {
            str2 = str;
        } else {
            str2 = d(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            CreativeInfo creativeInfo = this.A;
            if (creativeInfo != null && creativeInfo.c(str2)) {
                Logger.d(z, Logger.FeatureTag.NW_RESOURCES, "add resource url: avoid adding a recommendation resource: ", str2);
                this.A.d();
                return;
            }
            CreativeInfo creativeInfo2 = this.A;
            if (creativeInfo2 != null && creativeInfo2.d(str2)) {
                Logger.d(z, Logger.FeatureTag.NW_RESOURCES, "add resource url: Url is in the WebView urls exclusion list, will not be added : ", str2);
                return;
            }
            if (this.v) {
                if (!str.startsWith("text:")) {
                    synchronized (this.q) {
                        this.q.a((SimpleConcurrentHashSet<String>) str2);
                    }
                    Logger.d(z, Logger.FeatureTag.NW_RESOURCES, "Resource was added successfully to impression expanded list, resource: ", str2);
                    return;
                }
                return;
            }
            synchronized (this.o) {
                this.o.a((SimpleConcurrentHashSet<String>) str2);
            }
        }
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.g.add(str);
        }
    }

    public static String d(String str) {
        return TextUtils.isEmpty(str) ? str : com.safedk.android.utils.k.g(com.safedk.android.utils.n.z(str));
    }

    public String toString() {
        return "Impression: id=" + this.a + ", image is: " + this.c + ", CI is: " + this.A;
    }
}
