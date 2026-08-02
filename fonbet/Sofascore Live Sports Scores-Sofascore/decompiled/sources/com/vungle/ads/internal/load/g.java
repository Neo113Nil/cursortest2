package com.vungle.ads.internal.load;

import android.content.Context;
import android.webkit.URLUtil;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdPayloadError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.InvalidEventIdError;
import com.vungle.ads.InvalidTemplateURLError;
import com.vungle.ads.NativeAssetError;
import com.vungle.ads.OmSdkJsError;
import com.vungle.ads.PlacementMismatchError;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.o;
import com.vungle.ads.internal.model.v;
import com.vungle.ads.internal.model.v2;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.p;
import com.vungle.ads.internal.network.r;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.joa;
import defpackage.lnb;
import defpackage.wv8;
import defpackage.xtl;
import defpackage.ypa;
import defpackage.ysa;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class g {
    public final Context a;
    public final VungleApiClient b;
    public final com.vungle.ads.internal.executor.a c;
    public final com.vungle.ads.internal.omsdk.c d;
    public final com.vungle.ads.internal.downloader.m e;
    public final PathProvider f;
    public final b g;
    public final AtomicLong h;
    public final LinkedHashSet i;
    public a j;
    public AtomicBoolean k;
    public AtomicBoolean l;
    public final ArrayList m;
    public h0 n;
    public AtomicBoolean o;
    public AtomicBoolean p;
    public final n2 q;
    public m2 r;
    public m2 s;
    public n2 t;
    public n2 u;
    public n2 v;
    public n2 w;
    public s x;
    public long y;

    public g(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d dVar, com.vungle.ads.internal.omsdk.c cVar, com.vungle.ads.internal.downloader.m mVar, PathProvider pathProvider, b bVar) {
        context.getClass();
        vungleApiClient.getClass();
        dVar.getClass();
        cVar.getClass();
        mVar.getClass();
        pathProvider.getClass();
        bVar.getClass();
        this.a = context;
        this.b = vungleApiClient;
        this.c = dVar;
        this.d = cVar;
        this.e = mVar;
        this.f = pathProvider;
        this.g = bVar;
        this.h = new AtomicLong(0L);
        this.i = new LinkedHashSet();
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new ArrayList();
        this.o = new AtomicBoolean(true);
        this.p = new AtomicBoolean(true);
        this.q = new n2(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.r = new m2(Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.s = new m2(Sdk.SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE);
        this.t = new n2(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
        this.u = new n2(Sdk.SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.v = new n2(Sdk.SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.w = new n2(Sdk.SDKMetric.SDKMetricType.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    public static final void g(g gVar) {
        gVar.u.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, gVar.u, gVar.x, 4);
        gVar.j();
    }

    public static final void h(g gVar) {
        gVar.getClass();
        gVar.q.e();
        gVar.k();
    }

    public final void a(h0 h0Var, m2 m2Var) {
        com.vungle.ads.internal.model.i c;
        Integer f;
        List e;
        h0Var.getClass();
        this.n = h0Var;
        if (h0Var != null) {
            h0Var.E();
        }
        h0Var.a(this.x);
        s sVar = this.x;
        if (sVar != null) {
            sVar.d(h0Var.h());
        }
        s sVar2 = this.x;
        if (sVar2 != null) {
            sVar2.c(h0Var.n());
        }
        s sVar3 = this.x;
        if (sVar3 != null) {
            sVar3.b(h0Var.l());
        }
        s sVar4 = this.x;
        if (sVar4 != null) {
            sVar4.f(h0Var.t());
        }
        s sVar5 = this.x;
        if (sVar5 != null) {
            sVar5.h(h0Var.u());
        }
        s sVar6 = this.x;
        if (sVar6 != null) {
            sVar6.c(Boolean.valueOf(h0Var.B()));
        }
        s sVar7 = this.x;
        if (sVar7 != null) {
            sVar7.b(Boolean.valueOf(h0Var.b()));
        }
        s sVar8 = this.x;
        if (sVar8 != null) {
            sVar8.a(Boolean.valueOf(h0Var.y()));
        }
        s sVar9 = this.x;
        if (sVar9 != null) {
            sVar9.e(h0Var.o());
        }
        this.q.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.q, this.x, 4);
        v2 f2 = h0Var.f();
        int i = 0;
        if (f2 != null) {
            ConfigManager.INSTANCE.a(this.a, f2, false, m2Var);
        }
        VungleError a = a(h0Var);
        if (a != null) {
            a(a.setLogEntry$vungle_ads_release(this.x).logError$vungle_ads_release());
            return;
        }
        File b = this.f.b(h0Var.h());
        if (b == null || !b.isDirectory() || !b.exists()) {
            a(new AssetWriteError(fc6.k(b, "Invalid directory. ")).setLogEntry$vungle_ads_release(this.x).logError$vungle_ads_release());
            return;
        }
        h0 h0Var2 = this.n;
        if (h0Var2 != null && h0Var2.C()) {
            try {
                this.d.b();
                this.d.a(this.f.getVmDir());
            } catch (Exception e2) {
                boolean z = u.a;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Failed to inject OMSDK: ");
                a2.append(e2.getMessage());
                t.b("BaseAdLoader", a2.toString());
                new OmSdkJsError(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED, bf3.j(e2, com.iab.omid.library.vungle.internal.l.a("Failed to inject OMSDK: "))).setLogEntry$vungle_ads_release(this.x).logErrorNoReturnValue$vungle_ads_release();
            }
        }
        joa a3 = ypa.a(ysa.a, new d(this.a));
        com.vungle.ads.internal.model.i c2 = h0Var.c();
        if (c2 != null && (e = c2.e()) != null) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                ((r) a3.getValue()).a(new p((String) it.next()).b("load_ad").a(this.x).a(), false);
            }
        }
        if (!this.m.isEmpty()) {
            this.m.clear();
        }
        this.m.addAll(h0Var.a(b));
        if (this.m.isEmpty()) {
            j();
            return;
        }
        this.t.e();
        this.u.e();
        this.v.e();
        this.h.set(this.m.size());
        h0 h0Var3 = this.n;
        if (h0Var3 != null && (c = h0Var3.c()) != null && (f = c.f()) != null) {
            i = f.intValue();
        }
        if (i > 5) {
            i = 5;
        }
        Iterator it2 = this.m.iterator();
        while (it2.hasNext()) {
            com.vungle.ads.internal.model.b bVar = (com.vungle.ads.internal.model.b) it2.next();
            com.vungle.ads.internal.downloader.k kVar = new com.vungle.ads.internal.downloader.k(bVar.d ? com.vungle.ads.internal.downloader.j.CRITICAL : com.vungle.ads.internal.downloader.j.HIGHEST, bVar, this.x, i);
            if (bVar.j()) {
                kVar.g();
            }
            if (bVar.n()) {
                this.i.add(bVar.h());
            }
            ((com.vungle.ads.internal.downloader.h) this.e).a(kVar, new c(this));
        }
    }

    public abstract void i();

    public final void j() {
        h0 h0Var = this.n;
        if (h0Var == null || this.l.get() || !this.k.compareAndSet(false, true)) {
            return;
        }
        if (h0Var.G()) {
            this.w.e();
            String valueOf = String.valueOf(h0Var.p());
            boolean z = u.a;
            t.c("BaseAdLoader", "start preloading");
            long currentTimeMillis = System.currentTimeMillis() - this.y;
            ReentrantLock reentrantLock = e0.a;
            e0.a(this.a, h0Var, this.g.c(), valueOf, h0Var.v(), new e(this, h0Var), Long.valueOf(currentTimeMillis));
        } else {
            i();
            a aVar = this.j;
            if (aVar != null) {
                aVar.onSuccess(h0Var);
            }
        }
        ((com.vungle.ads.internal.task.s) ((com.vungle.ads.internal.task.h) ypa.a(ysa.a, new f(this.a)).getValue())).a(com.vungle.ads.internal.task.k.a());
    }

    public abstract void k();

    public final b b() {
        return this.g;
    }

    public final h0 c() {
        return this.n;
    }

    public final Context d() {
        return this.a;
    }

    public final s e() {
        return this.x;
    }

    public final PathProvider f() {
        return this.f;
    }

    public final VungleApiClient h() {
        return this.b;
    }

    public final com.vungle.ads.internal.executor.a g() {
        return this.c;
    }

    public static final void a(g gVar, b bVar) {
        gVar.getClass();
        boolean z = u.a;
        t.a("BaseAdLoader", "All download completed " + bVar);
        h0 h0Var = gVar.n;
        if (h0Var != null) {
            h0Var.f = true;
        }
        gVar.j();
        gVar.t.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, gVar.t, gVar.x, 4);
        gVar.v.d();
        AnalyticsClient.a(analyticsClient, gVar.v, gVar.x, 4);
    }

    public static final boolean a(g gVar, com.vungle.ads.internal.model.b bVar, h0 h0Var) {
        gVar.getClass();
        if (h0Var != null && bVar.i() && bVar.c.length() != 0) {
            File file = new File(bVar.c);
            if (file.exists() && file.length() == bVar.h) {
                File b = gVar.f.b(h0Var.h());
                if (b != null && b.isDirectory()) {
                    com.vungle.ads.internal.util.m mVar = com.vungle.ads.internal.util.n.a;
                    return true;
                }
                boolean z = u.a;
                t.b("BaseAdLoader", "Unable to access Destination Directory");
            }
        }
        return false;
    }

    public final void a(s sVar) {
        this.x = sVar;
    }

    public final void a(com.vungle.ads.internal.s sVar) {
        sVar.getClass();
        this.j = sVar;
        this.y = System.currentTimeMillis();
        ((com.vungle.ads.internal.executor.d) this.c).b().execute(new xtl(this, 9));
    }

    public final void a() {
        com.vungle.ads.internal.downloader.h hVar = (com.vungle.ads.internal.downloader.h) this.e;
        Iterator it = hVar.d.iterator();
        while (it.hasNext()) {
            com.vungle.ads.internal.downloader.k kVar = (com.vungle.ads.internal.downloader.k) it.next();
            if (kVar != null && !kVar.e.get()) {
                kVar.e.set(true);
            }
        }
        hVar.d.clear();
    }

    public final void a(VungleError vungleError) {
        boolean z;
        vungleError.getClass();
        if (this.k.get()) {
            return;
        }
        boolean z2 = true;
        if (this.l.compareAndSet(false, true)) {
            h0 h0Var = this.n;
            if (h0Var != null && h0Var.A()) {
                ArrayList arrayList = this.m;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((com.vungle.ads.internal.model.b) next).k()) {
                        arrayList2.add(next);
                    } else {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = arrayList2;
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        if (((com.vungle.ads.internal.model.b) it2.next()).i()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!arrayList5.isEmpty()) {
                    Iterator it3 = arrayList5.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (!((com.vungle.ads.internal.model.b) it3.next()).i()) {
                            z2 = false;
                            break;
                        }
                    }
                }
                if (z && z2) {
                    this.l.set(false);
                    j();
                    return;
                }
            }
            a aVar = this.j;
            if (aVar != null) {
                aVar.onFailure(vungleError);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VungleError a(h0 h0Var) {
        VungleError invalidTemplateURLError;
        o oVar;
        o oVar2;
        h0Var.getClass();
        com.vungle.ads.internal.model.i c = h0Var.c();
        if (c != null && c.i() != null) {
            com.vungle.ads.internal.model.i c2 = h0Var.c();
            Integer b = c2 != null ? c2.b() : null;
            com.vungle.ads.internal.model.i c3 = h0Var.c();
            Integer i = c3 != null ? c3.i() : null;
            com.vungle.ads.internal.model.i c4 = h0Var.c();
            String d = c4 != null ? c4.d() : null;
            StringBuilder k = wv8.k(i, "Response error: ", ", Request failed with error: ", ", ", b);
            k.append(d);
            String sb = k.toString();
            if ((b != null && b.intValue() == 10001) || ((b != null && b.intValue() == 10002) || ((b != null && b.intValue() == 20001) || ((b != null && b.intValue() == 30001) || (b != null && b.intValue() == 30002))))) {
                Sdk.SDKError.Reason forNumber = Sdk.SDKError.Reason.forNumber(b.intValue());
                forNumber.getClass();
                return new AdPayloadError(forNumber, sb);
            }
            return new AdPayloadError(Sdk.SDKError.Reason.PLACEMENT_SLEEP, sb);
        }
        String b2 = this.g.c().b();
        h0 h0Var2 = this.n;
        if (!Intrinsics.c(b2, h0Var2 != null ? h0Var2.D() : null)) {
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Waterfall request and responses placement don't match ");
            h0 h0Var3 = this.n;
            return new PlacementMismatchError(lnb.q(a, h0Var3 != null ? h0Var3.D() : null, '.'));
        }
        com.vungle.ads.internal.model.i k2 = h0Var.k();
        v vVar = k2 != null ? k2.u : null;
        if (vVar == null) {
            invalidTemplateURLError = new AdResponseEmptyError("Missing template settings");
        } else {
            Map map = vVar.b;
            if (h0Var.A()) {
                if (((map == null || (oVar2 = (o) map.get("MAIN_IMAGE")) == null) ? null : oVar2.a) == null) {
                    if (((map == null || (oVar = (o) map.get("MAIN_VIDEO")) == null) ? null : oVar.a) == null) {
                        invalidTemplateURLError = new NativeAssetError("Unable to load null main asset.");
                    }
                }
                o oVar3 = (o) map.get("VUNGLE_PRIVACY_ICON_URL");
                if ((oVar3 != null ? oVar3.a : null) == null) {
                    invalidTemplateURLError = new NativeAssetError("Unable to load null privacy image.");
                }
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = ((o) entry.getValue()).a;
                        if (str != null && str.length() != 0) {
                            if (str == null || str.length() == 0 || (!URLUtil.isHttpsUrl(str) && !URLUtil.isHttpUrl(str))) {
                                invalidTemplateURLError = new InvalidAssetUrlError(com.iab.omid.library.vungle.d.a("Invalid asset URL ", str));
                                break;
                            }
                        } else {
                            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("None asset URL for ");
                            a2.append((String) entry.getKey());
                            invalidTemplateURLError = new InvalidAssetUrlError(a2.toString());
                            break;
                        }
                    }
                }
                invalidTemplateURLError = null;
            } else {
                com.vungle.ads.internal.model.i k3 = h0Var.k();
                String str2 = k3 != null ? k3.n : null;
                if (str2 != null && str2.length() != 0) {
                    if (str2 == null || str2.length() == 0 || (!URLUtil.isHttpsUrl(str2) && !URLUtil.isHttpUrl(str2))) {
                        invalidTemplateURLError = new InvalidTemplateURLError(com.iab.omid.library.vungle.d.a("Failed to load vm url: ", str2));
                    }
                    if (map != null) {
                    }
                    invalidTemplateURLError = null;
                } else {
                    invalidTemplateURLError = new InvalidTemplateURLError("Failed to prepare null vmURL for downloading.");
                }
            }
        }
        if (invalidTemplateURLError != null) {
            return invalidTemplateURLError;
        }
        if (h0Var.x()) {
            StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("The ad markup has expired for playback. Ad expiry: ");
            com.vungle.ads.internal.model.i c5 = h0Var.c();
            a3.append(c5 != null ? c5.c() : null);
            a3.append(", device: ");
            a3.append(System.currentTimeMillis());
            return new AdExpiredError(a3.toString());
        }
        String h = h0Var.h();
        if (h == null || h.length() == 0) {
            return new InvalidEventIdError("Event id is invalid.");
        }
        return null;
    }
}
