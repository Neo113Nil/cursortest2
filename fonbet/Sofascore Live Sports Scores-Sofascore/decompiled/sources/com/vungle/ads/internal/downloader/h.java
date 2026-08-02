package com.vungle.ads.internal.downloader;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.d2g;
import defpackage.hpf;
import defpackage.i2g;
import defpackage.joa;
import defpackage.jod;
import defpackage.kof;
import defpackage.l62;
import defpackage.lnb;
import defpackage.lof;
import defpackage.pij;
import defpackage.pof;
import defpackage.pzf;
import defpackage.q89;
import defpackage.qzf;
import defpackage.vxd;
import defpackage.wk0;
import defpackage.ypa;
import defpackage.z49;
import defpackage.zol;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h implements m {
    public final com.vungle.ads.internal.executor.j a;
    public final PathProvider b;
    public final joa c;
    public final CopyOnWriteArrayList d;

    public h(com.vungle.ads.internal.executor.j jVar, PathProvider pathProvider) {
        jVar.getClass();
        pathProvider.getClass();
        this.a = jVar;
        this.b = pathProvider;
        this.c = ypa.b(new g(this));
        this.d = new CopyOnWriteArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x043f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b a(k kVar, d dVar) {
        kof kofVar;
        pof pofVar;
        k kVar2;
        com.vungle.ads.internal.model.b bVar;
        d2g d2gVar;
        l62 l62Var;
        i2g i2gVar;
        b bVar2;
        int b;
        i2g i2gVar2;
        long contentLength;
        long j;
        kof kofVar2;
        com.vungle.ads.internal.model.b bVar3;
        long j2;
        String str;
        long j3;
        com.vungle.ads.internal.model.b a = kVar.a();
        boolean z = u.a;
        StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("launch request in thread: ");
        a2.append(Thread.currentThread().getId());
        a2.append(" request: ");
        a2.append(a.h());
        t.a("AssetDownloader", a2.toString());
        if (kVar.e()) {
            StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Request ");
            a3.append(a.h());
            a3.append(" is cancelled before starting");
            t.a("AssetDownloader", a3.toString());
            new c().b(3);
            return null;
        }
        c cVar = new c();
        cVar.c(System.currentTimeMillis());
        String h = a.h();
        String c = a.c();
        int i = -1;
        if (h.length() == 0 || !n.a(h)) {
            return new b(-1, new InvalidAssetUrlError(com.iab.omid.library.vungle.d.a("invalid url: ", h)).setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 4);
        }
        if (c.length() == 0) {
            return new b(-1, new AssetWriteError(com.iab.omid.library.vungle.d.a("invalid path: ", c)).setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 3);
        }
        String absolutePath = this.b.c().getAbsolutePath();
        absolutePath.getClass();
        long a4 = PathProvider.a(absolutePath);
        if (a4 < ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            new NoSpaceError(vxd.l(a4, "Insufficient space ")).setLogEntry$vungle_ads_release(kVar.c()).logErrorNoReturnValue$vungle_ads_release();
            return new b(-1, new NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 2);
        }
        File file = new File(c);
        if (file.exists()) {
            StringBuilder a5 = com.iab.omid.library.vungle.internal.l.a("Deleting existing file before download: ");
            a5.append(file.getAbsolutePath());
            t.a("AssetDownloader", a5.toString());
            if (!file.delete()) {
                return new b(-1, new AssetWriteError("Cannot delete partial file for restart").setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 2);
            }
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                try {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                } catch (Exception e) {
                    e = e;
                    kVar2 = kVar;
                    bVar = a;
                    kofVar = null;
                    pofVar = null;
                    d2gVar = null;
                    l62Var = null;
                    boolean z2 = u.a;
                    t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                    cVar.b(7);
                    bVar2 = new b(i, e, 1);
                    if ((d2gVar != null ? d2gVar.g : null) != null) {
                    }
                    if (pofVar != null) {
                    }
                    n.a(kofVar);
                    n.a(l62Var);
                    t.a("AssetDownloader", "download status: " + cVar.b());
                    b = cVar.b();
                    if (b == 7) {
                    }
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    kofVar = null;
                    pofVar = null;
                    d2gVar = null;
                    l62Var = null;
                    if ((d2gVar != null ? d2gVar.g : null) != null) {
                    }
                    if (pofVar != null) {
                    }
                    n.a(kofVar);
                    n.a(l62Var);
                    boolean z3 = u.a;
                    StringBuilder a6 = com.iab.omid.library.vungle.internal.l.a("download status: ");
                    a6.append(cVar.b());
                    t.a("AssetDownloader", a6.toString());
                    throw th;
                }
            }
            pzf pzfVar = new pzf();
            pzfVar.f(h);
            jod jodVar = (jod) this.c.getValue();
            qzf qzfVar = new qzf(pzfVar);
            jodVar.getClass();
            pofVar = new pof(jodVar, qzfVar);
        } catch (Exception e2) {
            e = e2;
            kVar2 = kVar;
            bVar = a;
            kofVar = null;
            pofVar = null;
        } catch (Throwable th2) {
            th = th2;
            kofVar = null;
            pofVar = null;
        }
        try {
            d2gVar = FirebasePerfOkHttpClient.execute(pofVar);
            try {
                try {
                    i = d2gVar.d;
                } catch (Throwable th3) {
                    th = th3;
                    kofVar = null;
                    l62Var = null;
                    if ((d2gVar != null ? d2gVar.g : null) != null && (i2gVar = d2gVar.g) != null) {
                        i2gVar.close();
                        Unit unit = Unit.a;
                    }
                    if (pofVar != null) {
                        pofVar.cancel();
                        Unit unit2 = Unit.a;
                    }
                    n.a(kofVar);
                    n.a(l62Var);
                    boolean z32 = u.a;
                    StringBuilder a62 = com.iab.omid.library.vungle.internal.l.a("download status: ");
                    a62.append(cVar.b());
                    t.a("AssetDownloader", a62.toString());
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                kVar2 = kVar;
                bVar = a;
            }
        } catch (Exception e4) {
            e = e4;
            kVar2 = kVar;
            bVar = a;
            kofVar = null;
            d2gVar = null;
            l62Var = null;
            boolean z22 = u.a;
            t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
            cVar.b(7);
            bVar2 = new b(i, e, 1);
            if ((d2gVar != null ? d2gVar.g : null) != null) {
            }
            if (pofVar != null) {
            }
            n.a(kofVar);
            n.a(l62Var);
            t.a("AssetDownloader", "download status: " + cVar.b());
            b = cVar.b();
            if (b == 7) {
            }
            return bVar2;
        } catch (Throwable th4) {
            th = th4;
            kofVar = null;
            d2gVar = null;
            l62Var = null;
            if ((d2gVar != null ? d2gVar.g : null) != null) {
            }
            if (pofVar != null) {
            }
            n.a(kofVar);
            n.a(l62Var);
            boolean z322 = u.a;
            StringBuilder a622 = com.iab.omid.library.vungle.internal.l.a("download status: ");
            a622.append(cVar.b());
            t.a("AssetDownloader", a622.toString());
            throw th;
        }
        if (!d2gVar.q) {
            kVar2 = kVar;
            bVar = a;
            try {
                throw new l(d2gVar.c);
            } catch (Exception e5) {
                e = e5;
                kofVar = null;
                l62Var = null;
                boolean z222 = u.a;
                t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                cVar.b(7);
                bVar2 = new b(i, e, 1);
                if ((d2gVar != null ? d2gVar.g : null) != null) {
                }
                if (pofVar != null) {
                }
                n.a(kofVar);
                n.a(l62Var);
                t.a("AssetDownloader", "download status: " + cVar.b());
                b = cVar.b();
                if (b == 7) {
                }
                return bVar2;
            }
        }
        if (d2gVar.j != null) {
            AnalyticsClient.INSTANCE.a(new m2(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), kVar.c(), h);
            Unit unit3 = Unit.a;
        }
        i2g a7 = a(d2gVar);
        String a8 = d2gVar.f.a("Content-Type");
        if (a8 == null) {
            a8 = null;
        }
        if (a8 != null) {
            kVar.a().a(a8);
            Unit unit4 = Unit.a;
        }
        l62Var = a7 != null ? a7.source() : null;
        try {
            t.a("AssetDownloader", "Start download from url: " + h + " mimeType=" + a8);
            kofVar = new kof(new wk0(new FileOutputStream(file, false), new pij()));
            String str2 = h;
            if (a7 != null) {
                try {
                    try {
                        contentLength = a7.contentLength();
                    } catch (Exception e6) {
                        e = e6;
                        kVar2 = kVar;
                        bVar = a;
                        boolean z2222 = u.a;
                        t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                        cVar.b(7);
                        bVar2 = new b(i, e, 1);
                        if ((d2gVar != null ? d2gVar.g : null) != null && (i2gVar2 = d2gVar.g) != null) {
                            i2gVar2.close();
                            Unit unit5 = Unit.a;
                        }
                        if (pofVar != null) {
                            pofVar.cancel();
                            Unit unit6 = Unit.a;
                        }
                        n.a(kofVar);
                        n.a(l62Var);
                        t.a("AssetDownloader", "download status: " + cVar.b());
                        b = cVar.b();
                        if (b == 7) {
                            if (b != 3) {
                            }
                            return null;
                        }
                        return bVar2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if ((d2gVar != null ? d2gVar.g : null) != null) {
                        i2gVar.close();
                        Unit unit7 = Unit.a;
                    }
                    if (pofVar != null) {
                    }
                    n.a(kofVar);
                    n.a(l62Var);
                    boolean z3222 = u.a;
                    StringBuilder a6222 = com.iab.omid.library.vungle.internal.l.a("download status: ");
                    a6222.append(cVar.b());
                    t.a("AssetDownloader", a6222.toString());
                    throw th;
                }
            } else {
                contentLength = 0;
            }
            try {
                try {
                    cVar.b(0);
                    cVar.b(contentLength);
                    cVar.a(0L);
                    cVar.a(0);
                    a.a(contentLength);
                    if (dVar != null) {
                        kVar2 = kVar;
                        try {
                            ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar2);
                        } catch (Exception e7) {
                            e = e7;
                            bVar = a;
                            boolean z22222 = u.a;
                            t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                            cVar.b(7);
                            bVar2 = new b(i, e, 1);
                            if ((d2gVar != null ? d2gVar.g : null) != null) {
                                i2gVar2.close();
                                Unit unit52 = Unit.a;
                            }
                            if (pofVar != null) {
                            }
                            n.a(kofVar);
                            n.a(l62Var);
                            t.a("AssetDownloader", "download status: " + cVar.b());
                            b = cVar.b();
                            if (b == 7) {
                            }
                            return bVar2;
                        }
                    } else {
                        kVar2 = kVar;
                    }
                    int i2 = 0;
                    long j4 = 0;
                    while (true) {
                        if (l62Var != null) {
                            j = j4;
                            try {
                                kofVar2 = kofVar;
                                bVar3 = a;
                                try {
                                    try {
                                        j2 = l62Var.read(kofVar.b, 8192L);
                                    } catch (Exception e8) {
                                        e = e8;
                                        kofVar = kofVar2;
                                        bVar = bVar3;
                                        boolean z222222 = u.a;
                                        t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                                        cVar.b(7);
                                        bVar2 = new b(i, e, 1);
                                        if ((d2gVar != null ? d2gVar.g : null) != null) {
                                        }
                                        if (pofVar != null) {
                                        }
                                        n.a(kofVar);
                                        n.a(l62Var);
                                        t.a("AssetDownloader", "download status: " + cVar.b());
                                        b = cVar.b();
                                        if (b == 7) {
                                        }
                                        return bVar2;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    kofVar = kofVar2;
                                    if ((d2gVar != null ? d2gVar.g : null) != null) {
                                    }
                                    if (pofVar != null) {
                                    }
                                    n.a(kofVar);
                                    n.a(l62Var);
                                    boolean z32222 = u.a;
                                    StringBuilder a62222 = com.iab.omid.library.vungle.internal.l.a("download status: ");
                                    a62222.append(cVar.b());
                                    t.a("AssetDownloader", a62222.toString());
                                    throw th;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                bVar3 = a;
                            }
                        } else {
                            j = j4;
                            kofVar2 = kofVar;
                            bVar3 = a;
                            j2 = -1;
                        }
                        try {
                            Unit unit8 = Unit.a;
                            if (j2 <= 0) {
                                break;
                            }
                            if (kVar2.e()) {
                                cVar.b(3);
                                break;
                            }
                            try {
                                bVar = bVar3;
                                if (!file.exists()) {
                                    new AssetWriteError("Asset save error " + str2).setLogEntry$vungle_ads_release(kVar2.c()).logErrorNoReturnValue$vungle_ads_release();
                                    throw new l("File is not existing");
                                }
                                cVar.b(1);
                                kofVar2.h();
                                kofVar2.flush();
                                j4 = j + j2;
                                cVar.a(j4);
                                Long f = bVar.f();
                                long longValue = f != null ? f.longValue() : bVar.g();
                                if (!bVar.o() || j4 < longValue) {
                                    str = str2;
                                    j3 = contentLength;
                                } else {
                                    boolean z4 = u.a;
                                    str = str2;
                                    StringBuilder sb = new StringBuilder();
                                    j3 = contentLength;
                                    sb.append("Downloader totalRead=");
                                    sb.append(j4);
                                    sb.append(" requiredBytes=");
                                    sb.append(longValue);
                                    t.b("AssetDownloader", sb.toString());
                                    bVar.p();
                                }
                                int i3 = j3 > 0 ? (int) ((100 * j4) / j3) : i2;
                                while (cVar.a() + 1 <= Math.min(i3, 100)) {
                                    cVar.b(1);
                                    cVar.a(cVar.a() + 1);
                                    if (cVar.a() >= 100) {
                                        cVar.b(4);
                                    }
                                    if (dVar != null) {
                                        ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar2);
                                    }
                                }
                                i2 = i3;
                                str2 = str;
                                a = bVar;
                                contentLength = j3;
                                kofVar = kofVar2;
                            } catch (Exception e10) {
                                e = e10;
                                kofVar = kofVar2;
                                boolean z2222222 = u.a;
                                t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                                cVar.b(7);
                                bVar2 = new b(i, e, 1);
                                if ((d2gVar != null ? d2gVar.g : null) != null) {
                                }
                                if (pofVar != null) {
                                }
                                n.a(kofVar);
                                n.a(l62Var);
                                t.a("AssetDownloader", "download status: " + cVar.b());
                                b = cVar.b();
                                if (b == 7) {
                                }
                                return bVar2;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            bVar = bVar3;
                        }
                    }
                    kofVar2.flush();
                    if (cVar.b() == 1) {
                        cVar.b(4);
                        if (dVar != null) {
                            ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar2);
                        }
                    }
                    i2g i2gVar3 = d2gVar.g;
                    if (i2gVar3 != null) {
                        i2gVar3.close();
                    }
                    pofVar.cancel();
                    n.a(kofVar2);
                    n.a(l62Var);
                    boolean z5 = u.a;
                    StringBuilder a9 = com.iab.omid.library.vungle.internal.l.a("download status: ");
                    a9.append(cVar.b());
                    t.a("AssetDownloader", a9.toString());
                    bVar2 = null;
                } catch (Exception e12) {
                    e = e12;
                    kVar2 = kVar;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e13) {
            e = e13;
            kVar2 = kVar;
            bVar = a;
            kofVar = null;
        } catch (Throwable th8) {
            th = th8;
            kofVar = null;
        }
        b = cVar.b();
        if (b == 7 || b == 0) {
            return bVar2;
        }
        if (b != 3) {
            t.a("AssetDownloader", "On cancel " + kVar2);
            if (dVar != null) {
                ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar2);
            }
        } else {
            t.a("AssetDownloader", "On success " + kVar2);
            if (dVar != null) {
                ((com.vungle.ads.internal.load.c) dVar).a(file, kVar2);
            }
            int b2 = kVar2.b();
            if (b2 > 0) {
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS;
                s c2 = kVar2.c();
                StringBuilder t = lnb.t(b2, "retryCount=", " url=");
                t.append(kVar2.a().h());
                analyticsClient.c(sDKMetricType, 1L, c2, t.toString());
            }
        }
        return null;
    }

    public static final void a(k kVar, h hVar, d dVar) {
        hVar.getClass();
        b bVar = new b(-1, new OutOfMemory("Failed to execute download request: " + kVar.a().h()), 4);
        hVar.getClass();
        if (dVar != null) {
            ((com.vungle.ads.internal.load.c) dVar).a(bVar, kVar);
        }
    }

    public final void a(k kVar, com.vungle.ads.internal.load.c cVar) {
        this.d.add(kVar);
        this.a.a(new f(kVar, this, cVar), new zol(5, kVar, this, cVar));
    }

    public static i2g a(d2g d2gVar) {
        i2g i2gVar = d2gVar.g;
        q89 q89Var = d2gVar.f;
        String a = q89Var.a("Content-Encoding");
        if (a == null) {
            a = null;
        }
        if (!"gzip".equalsIgnoreCase(a) || i2gVar == null) {
            return i2gVar;
        }
        z49 z49Var = new z49(i2gVar.source());
        String a2 = q89Var.a("Content-Type");
        return new hpf(a2 != null ? a2 : null, -1L, new lof(z49Var));
    }
}
