package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.download.Command;
import defpackage.bea;
import defpackage.d2g;
import defpackage.i2g;
import defpackage.iod;
import defpackage.jod;
import defpackage.ogj;
import defpackage.pof;
import defpackage.pzf;
import defpackage.q89;
import defpackage.qzf;
import defpackage.vha;
import defpackage.yzf;
import defpackage.zdc;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p1 extends i implements h {
    public final jod a = new jod(new jod().a());

    public static HashMap b(d2g d2gVar) {
        HashMap hashMap = new HashMap();
        if (d2gVar != null) {
            q89 q89Var = d2gVar.f;
            for (int i = 0; i < q89Var.size(); i++) {
                String j = vha.j(q89Var, i);
                hashMap.put(j, Collections.singletonList(q89Var.a(j)));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r10.m() == com.fyber.inneractive.sdk.network.m0.PUT) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.text.Regex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(String str, t0 t0Var, ArrayList arrayList, String str2, String str3) {
        t0 t0Var2;
        Throwable th;
        Exception exc;
        t0 t0Var3;
        int i;
        l1 p = t0Var.p();
        pzf pzfVar = new pzf();
        ?? r4 = "gzip";
        a(pzfVar, "Accept-Encoding", "gzip");
        a(pzfVar, Command.HTTP_HEADER_USER_AGENT, str2);
        a(pzfVar, "If-Modified-Since", str3);
        Map l = t0Var.l();
        if (l != null) {
            r4 = l.keySet().iterator();
            while (r4.hasNext()) {
                String str4 = (String) r4.next();
                a(pzfVar, str4, (String) l.get(str4));
            }
        }
        pzfVar.f(str);
        if (t0Var.m() != m0.POST) {
            t0Var2 = r4;
        }
        byte[] f = t0Var.f();
        if (f == null) {
            ogj.k("Could not create ok http request. post payload is null");
            return null;
        }
        String n = t0Var.n();
        ?? r42 = zdc.e;
        yzf create = yzf.create(f, bea.H(n));
        create.getClass();
        pzfVar.e(C4094gc.b, create);
        t0Var2 = r42;
        qzf qzfVar = new qzf(pzfVar);
        iod a = this.a.a();
        boolean z = !(t0Var instanceof h1);
        a.i = z;
        a.j = z;
        long j = p.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a.c(j, timeUnit);
        a.d(p.b, timeUnit);
        jod jodVar = new jod(a);
        t0Var.c(System.currentTimeMillis());
        IAlog.a("OkHttpExecutorImpl: start connection timestamp: %s", t0Var.g);
        try {
            try {
                d2g e = new pof(jodVar, qzfVar).e();
                try {
                    if (!(t0Var instanceof h1) || (((i = e.d) <= 300 || i >= 304) && i != 307 && i != 308)) {
                        Pair pair = new Pair(arrayList, e);
                        t0Var.a(System.currentTimeMillis());
                        IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
                        return pair;
                    }
                    String str5 = "";
                    String a2 = e.f.a("Location");
                    if (a2 != null) {
                        str5 = a2;
                    }
                    if (!str5.startsWith("http")) {
                        try {
                            if (!str5.contains("://") && arrayList.size() > 0) {
                                Uri parse = Uri.parse((String) arrayList.get(arrayList.size() - 1));
                                str5 = String.format(str5.startsWith("/") ? "%s://%s%s" : "%s://%s/%s", parse.getScheme(), parse.getHost(), str5);
                            }
                        } catch (Exception e2) {
                            exc = e2;
                            throw new b(exc);
                        } catch (Throwable th2) {
                            th = th2;
                            t0Var3 = t0Var;
                            t0Var3.a(System.currentTimeMillis());
                            IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var3.g);
                            throw th;
                        }
                    }
                    String str6 = str5;
                    arrayList.add(str6);
                    if (arrayList.size() > 5) {
                        throw new b("Url chain too big for us");
                    }
                    Pair a3 = a(str6, t0Var, arrayList, str2, str3);
                    t0Var.a(System.currentTimeMillis());
                    IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
                    return a3;
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    throw new b(exc);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                t0Var3 = t0Var2;
                t0Var3.a(System.currentTimeMillis());
                IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var3.g);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th4) {
            th = th4;
            t0Var2 = t0Var;
            th = th;
            t0Var3 = t0Var2;
            t0Var3.a(System.currentTimeMillis());
            IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var3.g);
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.h
    public final l a(t0 t0Var, String str, String str2) {
        String str3;
        IAlog.a("%s okhttp network stack is in use", "OkHttpExecutorImpl");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(t0Var.r());
            Pair a = a(t0Var.r(), t0Var, arrayList, str, str2);
            Object obj = a.second;
            if (obj != null) {
                str3 = ((d2g) obj).c;
            } else {
                str3 = "";
            }
            FilterInputStream a2 = a((d2g) obj);
            Object obj2 = a.second;
            int i = obj2 == null ? -1 : ((d2g) obj2).d;
            HashMap b = b((d2g) obj2);
            d2g d2gVar = (d2g) a.second;
            o1 o1Var = new o1(i.a(a2, i, str3, b, d2gVar != null ? d2gVar.f.a("Last-Modified") : null), (d2g) a.second);
            Iterator it = ((List) a.first).iterator();
            while (it.hasNext()) {
                o1Var.f.add((String) it.next());
            }
            return o1Var;
        } catch (b e) {
            IAlog.b("%s cannot connect exception: %s", "OkHttpExecutorImpl", e.getMessage());
            throw e;
        } catch (Exception e2) {
            IAlog.b("%s exception: %s", "OkHttpExecutorImpl", e2.getMessage());
            throw e2;
        }
    }

    public static FilterInputStream a(d2g d2gVar) {
        if (d2gVar == null) {
            return null;
        }
        try {
            i2g i2gVar = d2gVar.g;
            if (i2gVar == null) {
                return null;
            }
            return i.a(i2gVar.byteStream(), TextUtils.equals("gzip", d2gVar.f.a("content-encoding")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(pzf pzfVar, String str, String str2) {
        IAlog.d("%s %s : %s", "REQUEST_HEADER", str, str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        pzfVar.a(str, str2);
    }
}
