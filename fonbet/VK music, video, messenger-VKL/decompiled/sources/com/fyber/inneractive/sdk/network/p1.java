package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.m;
import okhttp3.o;
import okhttp3.p;
import ru.ok.android.commons.http.Http;
import xsna.f8f0;

/* loaded from: classes12.dex */
public final class p1 extends i implements h {
    public final okhttp3.o a = new okhttp3.o(new okhttp3.o().e());

    public static HashMap b(okhttp3.u uVar) {
        HashMap hashMap = new HashMap();
        if (uVar != null) {
            okhttp3.k kVar = uVar.g;
            for (int i = 0; i < kVar.size(); i++) {
                String c = kVar.c(i);
                hashMap.put(c, Collections.singletonList(kVar.a(c)));
            }
        }
        return hashMap;
    }

    @Override // com.fyber.inneractive.sdk.network.h
    public final l a(t0 t0Var, String str, String str2) {
        IAlog.a("%s okhttp network stack is in use", "OkHttpExecutorImpl");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(t0Var.r());
            Pair a = a(t0Var.r(), t0Var, arrayList, str, str2);
            Object obj = a.second;
            String str3 = obj != null ? ((okhttp3.u) obj).d : "";
            FilterInputStream a2 = a((okhttp3.u) obj);
            Object obj2 = a.second;
            int i = obj2 == null ? -1 : ((okhttp3.u) obj2).e;
            HashMap b = b((okhttp3.u) obj2);
            okhttp3.u uVar = (okhttp3.u) a.second;
            o1 o1Var = new o1(i.a(a2, i, str3, b, uVar != null ? uVar.g.a("Last-Modified") : null), (okhttp3.u) a.second);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r10.m() == com.fyber.inneractive.sdk.network.m0.PUT) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.regex.Pattern] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(String str, t0 t0Var, ArrayList arrayList, String str2, String str3) {
        okhttp3.m mVar;
        t0 t0Var2;
        Throwable th;
        Exception exc;
        t0 t0Var3;
        int i;
        l1 p = t0Var.p();
        p.a aVar = new p.a();
        ?? r4 = Http.ContentEncoding.GZIP;
        a(aVar, "Accept-Encoding", Http.ContentEncoding.GZIP);
        a(aVar, "User-Agent", str2);
        a(aVar, "If-Modified-Since", str3);
        Map l = t0Var.l();
        if (l != null) {
            r4 = l.keySet().iterator();
            while (r4.hasNext()) {
                String str4 = (String) r4.next();
                a(aVar, str4, (String) l.get(str4));
            }
        }
        aVar.i(str);
        if (t0Var.m() != m0.POST) {
            t0Var2 = r4;
        }
        byte[] f = t0Var.f();
        if (f != null) {
            String n = t0Var.n();
            ?? r42 = okhttp3.m.e;
            try {
                mVar = m.a.a(n);
            } catch (IllegalArgumentException unused) {
                mVar = null;
            }
            aVar.f("POST", okhttp3.t.create(f, mVar));
            t0Var2 = r42;
            okhttp3.p b = aVar.b();
            o.a e = this.a.e();
            boolean z = !(t0Var instanceof h1);
            e.h = z;
            e.i = z;
            long j = p.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            e.c(j, timeUnit);
            e.e(p.b, timeUnit);
            okhttp3.o oVar = new okhttp3.o(e);
            t0Var.c(System.currentTimeMillis());
            IAlog.a("OkHttpExecutorImpl: start connection timestamp: %s", t0Var.g);
            try {
                try {
                    okhttp3.u execute = ((f8f0) oVar.a(b)).execute();
                    try {
                        if (!(t0Var instanceof h1) || (((i = execute.e) <= 300 || i >= 304) && i != 307 && i != 308)) {
                            Pair pair = new Pair(arrayList, execute);
                            t0Var.a(System.currentTimeMillis());
                            IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
                            return pair;
                        }
                        String str5 = "";
                        String a = execute.g.a("Location");
                        if (a != null) {
                            str5 = a;
                        }
                        if (!str5.startsWith("http")) {
                            try {
                                if (!str5.contains("://") && arrayList.size() > 0) {
                                    Uri parse = Uri.parse((String) arrayList.get(arrayList.size() - 1));
                                    str5 = String.format(str5.startsWith(DomExceptionUtils.SEPARATOR) ? "%s://%s%s" : "%s://%s/%s", parse.getScheme(), parse.getHost(), str5);
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
                        if (arrayList.size() <= 5) {
                            Pair a2 = a(str6, t0Var, arrayList, str2, str3);
                            t0Var.a(System.currentTimeMillis());
                            IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
                            return a2;
                        }
                        throw new b("Url chain too big for us");
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
        } else {
            throw new Exception("Could not create ok http request. post payload is null");
        }
    }

    public static FilterInputStream a(okhttp3.u uVar) {
        if (uVar == null) {
            return null;
        }
        try {
            okhttp3.v vVar = uVar.h;
            if (vVar == null) {
                return null;
            }
            return i.a(vVar.byteStream(), TextUtils.equals(Http.ContentEncoding.GZIP, uVar.g.a("content-encoding")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(p.a aVar, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        aVar.a(str, str2);
    }
}
