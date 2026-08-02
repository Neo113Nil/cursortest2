package com.vungle.ads.internal.network;

import com.vungle.ads.TpatError;
import com.vungle.ads.internal.model.c3;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.duf;
import defpackage.p2g;
import defpackage.p5c;
import defpackage.q12;
import defpackage.sha;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.xea;
import defpackage.yea;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r {
    public final VungleApiClient a;
    public final Executor b;
    public final com.vungle.ads.internal.signals.j c;
    public final FilePreferences d;
    public final Object e;

    public r(VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.j jVar, com.vungle.ads.internal.executor.j jVar2, PathProvider pathProvider, com.vungle.ads.internal.signals.j jVar3) {
        vungleApiClient.getClass();
        jVar.getClass();
        jVar2.getClass();
        pathProvider.getClass();
        this.a = vungleApiClient;
        this.b = jVar2;
        this.c = jVar3;
        this.d = FilePreferences.d.a(jVar, pathProvider, "vngFailedTpats");
        this.e = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (r3 < r11.e()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r0 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        r3 = com.iab.omid.library.vungle.internal.l.a("tpat key: ");
        r3.append(r11.i);
        r3.append(", error: ");
        r3.append(r12.a);
        r3.append(", errorIsTerminal: ");
        r3.append(r12.b);
        r3.append(" url: ");
        r3.append(r5);
        r3 = r3.toString();
        r4 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("TpatSender", r3);
        new com.vungle.ads.TpatError(r0, r3).setLogEntry$vungle_ads_release(r11.j).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        r0 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_ERROR;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, q qVar, String str, boolean z) {
        boolean z2;
        String str2;
        c3 a;
        rVar.getClass();
        qVar.getClass();
        str.getClass();
        rVar.getClass();
        Boolean bool = qVar.e;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            String str3 = qVar.i;
            z2 = Intrinsics.c(str3, "checkpoint.0") || Intrinsics.c(str3, "clickUrl") || Intrinsics.c(str3, "impression") || Intrinsics.c(str3, "load_ad");
        }
        int i = 0;
        while (true) {
            str2 = str;
            a = rVar.a.a(str2, qVar.b(), qVar.a(), qVar.d(), qVar.c());
            if (!z2 || a == null || !a.b() || (i = i + 1) >= qVar.e()) {
                break;
            } else {
                str = str2;
            }
        }
        if (qVar.f()) {
            if (a == null || !a.a()) {
                if (a != null || z) {
                    synchronized (rVar.e) {
                        try {
                            Map a2 = rVar.a();
                            d dVar = (d) a2.get(qVar.i());
                            int a3 = dVar != null ? dVar.a() : 0;
                            if (a == null && a3 > 0) {
                                a2.remove(qVar.i());
                                rVar.a(a2);
                            } else if (a != null && a3 >= qVar.g()) {
                                a2.remove(qVar.i());
                                rVar.a(a2);
                                Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.TPAT_RETRY_FAILED;
                                String str4 = "tpat key: " + qVar.i + ", error: " + a.a + ", errorIsTerminal: " + a.b + " url: " + str2;
                                boolean z3 = com.vungle.ads.internal.util.u.a;
                                com.vungle.ads.internal.util.t.b("TpatSender", str4);
                                new TpatError(reason, str4).setLogEntry$vungle_ads_release(qVar.j).logErrorNoReturnValue$vungle_ads_release();
                            } else if (a != null) {
                                d dVar2 = (d) a2.get(qVar.i());
                                a2.put(qVar.i(), dVar2 != null ? d.a(dVar2, a3 + 1) : new d(qVar.d(), qVar.b(), qVar.a(), 1, qVar.g(), qVar.h()));
                                rVar.a(a2);
                            }
                            Unit unit = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : a().entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            p pVar = new p(str);
            pVar.g = true;
            pVar.e = Boolean.FALSE;
            pVar.c = dVar.b;
            pVar.d = dVar.c;
            pVar.h = dVar.e;
            p a = pVar.a(dVar.a);
            a.i = dVar.f;
            a(a.a(), true);
        }
    }

    public final void a(q qVar, boolean z) {
        qVar.getClass();
        String i = qVar.i();
        i.getClass();
        com.vungle.ads.internal.signals.j jVar = this.c;
        String d = jVar != null ? jVar.d() : null;
        if (d == null) {
            d = "";
        }
        if (d.length() > 0) {
            String quote = Pattern.quote("{{{session_id}}}");
            quote.getClass();
            i = new Regex(quote).replace(i, d);
        }
        this.b.execute(new q12(this, qVar, i, z, 4));
    }

    public final Map a() {
        Object u2gVar;
        String string = this.d.getString("FAILED_TPATS");
        if (string != null) {
            try {
                p2g p2gVar = w2g.b;
                xea xeaVar = yea.d;
                p5c p5cVar = xeaVar.b;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                u2gVar = (Map) xeaVar.b(sha.Q(p5cVar, duf.a.mutableCollectionType(duf.e(companion.invariant(duf.b(String.class)), companion.invariant(duf.b(d.class))))), string);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Throwable a = w2g.a(u2gVar);
            if (a != null) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.b("TpatSender", "Failed to decode stored tpats: " + a);
            }
            if (w2g.a(u2gVar) != null) {
                u2gVar = new LinkedHashMap();
            }
            Map map = (Map) u2gVar;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    public final void a(Map map) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            FilePreferences filePreferences = this.d;
            xea xeaVar = yea.d;
            p5c p5cVar = xeaVar.b;
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            filePreferences.a("FAILED_TPATS", xeaVar.c(sha.Q(p5cVar, duf.a.mutableCollectionType(duf.e(companion.invariant(duf.b(String.class)), companion.invariant(duf.b(d.class))))), map)).b();
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (w2g.a(u2gVar) != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.b("TpatSender", "Failed to encode the about to storing tpats: " + map);
        }
    }
}
