package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.e0;
import com.applovin.impl.n5;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z7;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class p5 extends n5 {
    private final r7 r;

    class a implements e0.a {
        final /* synthetic */ z7 a;

        a(z7 z7Var) {
            this.a = z7Var;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                this.a.a(uri);
                p5.this.r.b(true);
                return;
            }
            com.applovin.impl.sdk.p pVar = p5.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                p5 p5Var = p5.this;
                p5Var.c.b(p5Var.b, "Failed to cache static companion ad");
            }
        }
    }

    class b implements n5.c {
        final /* synthetic */ z7 a;

        b(z7 z7Var) {
            this.a = z7Var;
        }

        @Override // com.applovin.impl.n5.c
        public void a(String str) {
            this.a.a(str);
            p5.this.r.b(true);
        }
    }

    class c implements n5.c {
        final /* synthetic */ z7 a;

        c(z7 z7Var) {
            this.a = z7Var;
        }

        @Override // com.applovin.impl.n5.c
        public void a(String str) {
            this.a.a(str);
            p5.this.r.b(true);
        }
    }

    class d implements e0.a {
        final /* synthetic */ f8 a;

        d(f8 f8Var) {
            this.a = f8Var;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.p pVar = p5.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    p5 p5Var = p5.this;
                    p5Var.c.a(p5Var.b, "Video file successfully cached into: " + uri);
                }
                this.a.a(uri);
                return;
            }
            com.applovin.impl.sdk.p pVar2 = p5.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                p5 p5Var2 = p5.this;
                p5Var2.c.b(p5Var2.b, "Failed to cache video file: " + this.a);
            }
        }
    }

    class e implements n5.c {
        e() {
        }

        @Override // com.applovin.impl.n5.c
        public void a(String str) {
            if (p5.this.r.isOpenMeasurementEnabled()) {
                str = p5.this.a.g0().a(str, h2.a((AppLovinAdImpl) p5.this.g));
            }
            p5.this.r.d(str);
            com.applovin.impl.sdk.p pVar = p5.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                p5 p5Var = p5.this;
                p5Var.c.a(p5Var.b, "Finish caching HTML template " + p5.this.r.i1() + " for ad #" + p5.this.r.getAdIdNumber());
            }
        }
    }

    public p5(r7 r7Var, com.applovin.impl.sdk.l lVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", r7Var, lVar, appLovinAdLoadListener);
        this.r = r7Var;
    }

    private String c(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.a.a(z4.m5)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri a2 = a(str2, Collections.emptyList(), false);
                if (a2 != null) {
                    str = str.replace(str2, a2.toString());
                    this.g.a(a2.toString(), str2);
                } else if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    private void j() {
        if (i()) {
            return;
        }
        if (!this.r.u1()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Companion ad caching disabled. Skipping...");
                return;
            }
            return;
        }
        u7 g1 = this.r.g1();
        if (g1 == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        z7 e2 = g1.e();
        if (e2 == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                return;
            }
            return;
        }
        Uri c2 = e2.c();
        String uri = c2 != null ? c2.toString() : "";
        String b2 = e2.b();
        if (!URLUtil.isValidUrl(uri) && !StringUtils.isValidString(b2)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.k(this.b, "Companion ad does not have any resources attached. Skipping...");
                return;
            }
            return;
        }
        if (e2.d() == z7.a.STATIC) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Caching static companion ad at " + uri + "...");
            }
            Uri a2 = a(uri, Collections.emptyList(), false);
            if (a2 != null) {
                e2.a(a2);
                this.r.b(true);
                return;
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Failed to cache static companion ad");
                    return;
                }
                return;
            }
        }
        if (e2.d() != z7.a.HTML) {
            if (e2.d() == z7.a.IFRAME && com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Skip caching of iFrame resource...");
                return;
            }
            return;
        }
        if (!StringUtils.isValidString(uri)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Caching provided HTML for companion ad. No fetch required. HTML: " + b2);
            }
            if (((Boolean) this.a.a(z4.l5)).booleanValue()) {
                b2 = c(b2);
            }
            e2.a(a(b2, Collections.emptyList(), this.r));
            this.r.b(true);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Begin caching HTML companion ad. Fetching from " + uri + "...");
        }
        String c3 = c(uri, (List) null, false);
        if (!StringUtils.isValidString(c3)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Unable to load companion ad resources from " + uri);
            }
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "HTML fetched. Caching HTML now...");
            }
            e2.a(a(c3, Collections.emptyList(), this.r));
            this.r.b(true);
        }
    }

    private void k() {
        if (i() || !d8.a(this.r)) {
            return;
        }
        String i1 = this.r.i1();
        if (!StringUtils.isValidString(i1)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Unable to load HTML template");
                return;
            }
            return;
        }
        String a2 = a(i1, this.r.V(), this.g);
        if (this.r.isOpenMeasurementEnabled()) {
            a2 = this.a.g0().a(a2, h2.a((AppLovinAdImpl) this.g));
        }
        this.r.d(a2);
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Finish caching HTML template " + this.r.i1() + " for ad #" + this.r.getAdIdNumber());
        }
    }

    private void l() {
        f8 q1;
        Uri e2;
        if (i()) {
            return;
        }
        if (!this.r.v1()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Video caching disabled. Skipping...");
            }
        } else {
            if (this.r.p1() == null || (q1 = this.r.q1()) == null || (e2 = q1.e()) == null) {
                return;
            }
            Uri b2 = b(e2.toString(), Collections.emptyList(), false);
            if (b2 != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "Video file successfully cached into: " + b2);
                }
                q1.a(b2);
            } else if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Failed to cache video file: " + q1);
            }
        }
    }

    private c0 m() {
        if (!this.r.u1()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        u7 g1 = this.r.g1();
        if (g1 == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        z7 e2 = g1.e();
        if (e2 == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri c2 = e2.c();
        String uri = c2 != null ? c2.toString() : "";
        String b2 = e2.b();
        if (URLUtil.isValidUrl(uri) || StringUtils.isValidString(b2)) {
            if (e2.d() == z7.a.STATIC) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "Caching static companion ad at " + uri + "...");
                }
                return new e0(uri, this.r, Collections.emptyList(), false, this.i, this.a, new a(e2));
            }
            if (e2.d() == z7.a.HTML) {
                if (!StringUtils.isValidString(uri)) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.a(this.b, "Caching provided HTML for companion ad. No fetch required. HTML: " + b2);
                    }
                    return a(b2, Collections.emptyList(), new c(e2));
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "Begin caching HTML companion ad. Fetching from " + uri + "...");
                }
                String c3 = c(uri, (List) null, false);
                if (StringUtils.isValidString(c3)) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.a(this.b, "HTML fetched. Caching HTML now...");
                    }
                    return a(c3, Collections.emptyList(), new b(e2));
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Unable to load companion ad resources from " + uri);
                }
            } else if (e2.d() == z7.a.IFRAME && com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Skip caching of iFrame resource...");
            }
        } else if (com.applovin.impl.sdk.p.a()) {
            this.c.k(this.b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    @Override // com.applovin.impl.n5
    void e() {
        this.r.getAdEventTracker().h();
        super.e();
    }

    protected d0 n() {
        if (!TextUtils.isEmpty(this.r.i1())) {
            return a(this.r.i1(), this.r.V(), new e());
        }
        if (!com.applovin.impl.sdk.p.a()) {
            return null;
        }
        this.c.a(this.b, "Unable to load HTML template");
        return null;
    }

    protected e0 o() {
        f8 q1;
        Uri e2;
        if (!this.r.v1()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.r.p1() == null || (q1 = this.r.q1()) == null || (e2 = q1.e()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Caching video file " + q1 + " creative...");
        }
        return a(e2.toString(), Collections.emptyList(), false, new d(q1));
    }

    @Override // com.applovin.impl.n5, java.lang.Runnable
    public void run() {
        super.run();
        boolean D0 = this.r.D0();
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Begin caching for VAST " + (D0 ? "streaming " : "") + "ad #" + this.g.getAdIdNumber() + "...");
        }
        if (D0) {
            if (!((Boolean) this.a.a(z4.J0)).booleanValue()) {
                if (this.r.s1()) {
                    e();
                }
                r7.c j1 = this.r.j1();
                r7.c cVar = r7.c.COMPANION_AD;
                if (j1 == cVar) {
                    j();
                    k();
                } else {
                    l();
                }
                if (!this.r.s1()) {
                    e();
                }
                if (this.r.j1() == cVar) {
                    l();
                } else {
                    j();
                    k();
                }
            } else if (this.r.s1()) {
                e();
                ArrayList arrayList = new ArrayList();
                c0 m = m();
                if (m != null) {
                    arrayList.add(m);
                }
                d0 n = n();
                if (n != null) {
                    arrayList.add(n);
                }
                e0 o = o();
                if (o != null) {
                    arrayList.add(o);
                }
                a(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (this.r.j1() == r7.c.COMPANION_AD) {
                    c0 m2 = m();
                    if (m2 != null) {
                        arrayList2.add(m2);
                    }
                    d0 n2 = n();
                    if (n2 != null) {
                        arrayList2.add(n2);
                    }
                    a(arrayList2);
                    e();
                    e0 o2 = o();
                    if (o2 != null) {
                        arrayList3.add(o2);
                    }
                    a(arrayList3);
                } else {
                    e0 o3 = o();
                    if (o3 != null) {
                        arrayList2.add(o3);
                    }
                    a(arrayList2);
                    e();
                    c0 m3 = m();
                    if (m3 != null) {
                        arrayList3.add(m3);
                    }
                    d0 n3 = n();
                    if (n3 != null) {
                        arrayList3.add(n3);
                    }
                    a(arrayList3);
                }
            }
        } else if (((Boolean) this.a.a(z4.J0)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            c0 m4 = m();
            if (m4 != null) {
                arrayList4.add(m4);
            }
            e0 o4 = o();
            if (o4 != null) {
                arrayList4.add(o4);
            }
            d0 n4 = n();
            if (n4 != null) {
                arrayList4.add(n4);
            }
            a(arrayList4);
            e();
        } else {
            j();
            l();
            k();
            e();
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Finished caching VAST ad #" + this.r.getAdIdNumber());
        }
        this.r.t1();
        h();
    }

    @Override // com.applovin.impl.n5
    void a(int i) {
        this.r.getAdEventTracker().f();
        super.a(i);
    }
}
