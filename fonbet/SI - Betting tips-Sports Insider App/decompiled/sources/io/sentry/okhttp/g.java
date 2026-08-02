package io.sentry.okhttp;

import androidx.appcompat.app.v0;
import androidx.transition.i;
import com.google.android.gms.internal.measurement.d5;
import com.google.firebase.messaging.w;
import f3.x;
import gh.b0;
import gh.i0;
import gh.m0;
import gh.o0;
import gh.q0;
import gh.r0;
import gh.z;
import io.sentry.ILogger;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.g6;
import io.sentry.h0;
import io.sentry.i1;
import io.sentry.l0;
import io.sentry.n6;
import io.sentry.q6;
import io.sentry.util.k;
import io.sentry.y3;
import io.sentry.z4;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kh.p;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import lh.h;
import okhttp3.Headers;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements z {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f16710a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16711b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16712c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16713d;

    static {
        z4.d().b("maven:io.sentry:sentry-okhttp", "8.30.0");
    }

    public g(int i5, List failedRequestStatusCodes) {
        int i10 = i5 & 1;
        y3 scopes = y3.f17255a;
        if (i10 != 0) {
            Intrinsics.checkNotNullExpressionValue(scopes, "getInstance(...)");
        }
        failedRequestStatusCodes = (i5 & 8) != 0 ? t.c(new l0(500, 599)) : failedRequestStatusCodes;
        List failedRequestTargets = t.c(b6.DEFAULT_PROPAGATION_TARGETS);
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(failedRequestStatusCodes, "failedRequestStatusCodes");
        Intrinsics.checkNotNullParameter(failedRequestTargets, "failedRequestTargets");
        this.f16710a = scopes;
        this.f16711b = true;
        this.f16712c = failedRequestStatusCodes;
        this.f16713d = failedRequestTargets;
        rh.g.a("OkHttp");
    }

    public static io.sentry.util.network.b b(g gVar, o0 resp) {
        Charset a7;
        Intrinsics.checkNotNullParameter(resp, "resp");
        ILogger logger = gVar.f16710a.m().getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        r0 r0Var = resp.f10279g;
        if (r0Var != null) {
            try {
                b0 n9 = r0Var.n();
                String str = n9 != null ? n9.f10119a : null;
                long j = 153600 + 1;
                r0 r0Var2 = resp.f10279g;
                BufferedSource peek = r0Var2.m0().peek();
                Buffer buffer = new Buffer();
                peek.request(j);
                buffer.write((Source) peek, Math.min(j, peek.getBuffer().size()));
                q0 q0Var = r0.f10297b;
                b0 n10 = r0Var2.n();
                long size = buffer.size();
                Intrinsics.checkNotNullParameter(buffer, "<this>");
                byte[] c2 = new q0(n10, size, buffer).c();
                String name = (n9 == null || (a7 = n9.a(Charsets.UTF_8)) == null) ? null : a7.name();
                if (name == null) {
                    name = "UTF-8";
                } else {
                    Intrinsics.checkNotNull(name);
                }
                return com.google.android.play.core.appupdate.b.m(c2, str, name, logger);
            } catch (Exception e7) {
                logger.h(b5.ERROR, "Failed to read http response body for Network Details: " + e7.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    public static LinkedHashMap e(Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = headers.size();
        for (int i5 = 0; i5 < size; i5++) {
            String name = headers.name(i5);
            String value = headers.value(i5);
            String str = (String) linkedHashMap.get(name);
            if (str != null) {
                linkedHashMap.put(name, str + "; " + value);
            } else {
                linkedHashMap.put(name, value);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02bb A[Catch: all -> 0x01f5, TRY_ENTER, TryCatch #3 {all -> 0x01f5, blocks: (B:121:0x01ef, B:60:0x0213, B:61:0x021b, B:90:0x02bb, B:91:0x02c3), top: B:35:0x010d }] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, gh.i0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v6, types: [gh.o0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, gh.i0] */
    @Override // gh.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o0 a(h chain) {
        a aVar;
        i1 i1Var;
        io.sentry.util.network.f fVar;
        o0 o0Var;
        o0 o0Var2;
        Integer num = "getName(...)";
        o0 response = "baggage";
        Intrinsics.checkNotNullParameter(chain, "chain");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r6 = chain.f20093e;
        objectRef.element = r6;
        w E = d5.E(r6.f10206a.f10337i);
        Intrinsics.checkNotNullExpressionValue(E, "parse(...)");
        String str = E.f6175a;
        if (str == null) {
            str = "unknown";
        }
        Intrinsics.checkNotNullExpressionValue(str, "getUrlOrFallback(...)");
        String str2 = ((i0) objectRef.element).f10207b;
        ConcurrentHashMap concurrentHashMap = e.f16705d;
        p pVar = chain.f20089a;
        boolean containsKey = concurrentHashMap.containsKey(pVar);
        b1 b1Var = this.f16710a;
        if (containsKey) {
            aVar = (a) concurrentHashMap.get(pVar);
            i1Var = aVar != null ? aVar.f16692d : 0;
        } else {
            i1 n9 = io.sentry.util.h.f17164a ? b1Var.n() : b1Var.i();
            i1 y5 = n9 != null ? n9.y("http.client", str2 + ' ' + str) : null;
            aVar = null;
            i1Var = y5;
        }
        long currentTimeMillis = System.currentTimeMillis();
        n6 v5 = i1Var != 0 ? i1Var.v() : null;
        if (v5 != null) {
            v5.f16675i = "auto.http.okhttp";
        }
        if (i1Var != 0) {
            String str3 = E.f6176b;
            if (str3 != null) {
                i1Var.m(str3, "http.query");
            }
            String str4 = E.f6177c;
            if (str4 != null) {
                i1Var.m(str4, "http.fragment");
            }
        }
        boolean z5 = aVar != null;
        i0 i0Var = (i0) objectRef.element;
        String str5 = i0Var.f10206a.f10337i;
        String str6 = i0Var.f10207b;
        List<String> list = b1Var.m().getSessionReplay().f16412n;
        boolean z7 = z5;
        List list2 = b1Var.m().getSessionReplay().f16413o;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                String str7 = (String) it.next();
                if (str7 != null && str5.matches(str7)) {
                    break;
                }
                it = it2;
            }
        }
        if (list != null) {
            for (String str8 : list) {
                if (str8 != null && str5.matches(str8)) {
                    fVar = new io.sentry.util.network.f(str6);
                    break;
                }
            }
        }
        fVar = null;
        try {
            try {
                c4.d b10 = ((i0) objectRef.element).b();
                if (!k.a("auto.http.okhttp", b1Var.m().getIgnoredSpanOrigins())) {
                    T t3 = objectRef.element;
                    String str9 = ((i0) t3).f10206a.f10337i;
                    i0 i0Var2 = (i0) t3;
                    i0Var2.getClass();
                    Intrinsics.checkNotNullParameter("baggage", "name");
                    v0 C = com.google.android.gms.internal.measurement.y3.C(b1Var, str9, i0Var2.f10208c.values("baggage"), i1Var);
                    if (C != null) {
                        g6 g6Var = (g6) C.f364b;
                        g6Var.getClass();
                        Intrinsics.checkNotNullExpressionValue("sentry-trace", "getName(...)");
                        String a7 = g6Var.a();
                        Intrinsics.checkNotNullExpressionValue(a7, "getValue(...)");
                        b10.d("sentry-trace", a7);
                        com.android.billingclient.api.a aVar2 = (com.android.billingclient.api.a) C.f365c;
                        if (aVar2 != null) {
                            b10.n("baggage");
                            Intrinsics.checkNotNullExpressionValue("baggage", "getName(...)");
                            String str10 = aVar2.f3966b;
                            Intrinsics.checkNotNullExpressionValue(str10, "getValue(...)");
                            b10.d("baggage", str10);
                        }
                        v0 v0Var = (v0) C.f366d;
                        if (v0Var != null) {
                            Intrinsics.checkNotNullExpressionValue("traceparent", "getName(...)");
                            String R = v0Var.R();
                            Intrinsics.checkNotNullExpressionValue(R, "getValue(...)");
                            b10.d("traceparent", R);
                        }
                    }
                }
                m0 m0Var = ((i0) objectRef.element).f10209d;
                Long valueOf = m0Var != null ? Long.valueOf(m0Var.a()) : null;
                if (fVar != null) {
                    v0 R2 = x.R(objectRef.element, valueOf, b1Var.m().getSessionReplay().f16414p, new i(b10, objectRef, this, 8), b1Var.m().getSessionReplay().q, new io.sentry.clientreport.a(this, 1));
                    fVar.f17185e = R2;
                    fVar.f17183c = (Long) R2.f364b;
                }
                ?? i0Var3 = new i0(b10);
                objectRef.element = i0Var3;
                response = chain.b(i0Var3);
                try {
                    int i5 = response.f10276d;
                    num = Integer.valueOf(i5);
                    if (i1Var != 0) {
                        try {
                            i1Var.m(num, "http.response.status_code");
                        } catch (IOException e7) {
                            e = e7;
                            if (i1Var != 0) {
                                i1Var.g(e);
                                i1Var.a(q6.INTERNAL_ERROR);
                            }
                            throw e;
                        }
                    }
                    if (i1Var != 0) {
                        try {
                            i1Var.a(q6.fromHttpStatusCode(i5));
                        } catch (IOException e9) {
                            e = e9;
                            if (i1Var != 0) {
                            }
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            if (aVar != null) {
                                aVar.e((i0) objectRef.element);
                            }
                            if (response == 0 || fVar == null) {
                                o0Var = response;
                            } else {
                                int i10 = response.f10276d;
                                r0 r0Var = response.f10279g;
                                o0Var = response;
                                v0 R3 = x.R(o0Var, r0Var != null ? Long.valueOf(r0Var.k()) : null, b1Var.m().getSessionReplay().f16414p, new io.sentry.android.core.internal.gestures.c(6, this), b1Var.m().getSessionReplay().f16415r, new io.sentry.clientreport.a(this, 2));
                                fVar.f17182b = Integer.valueOf(i10);
                                fVar.f17186f = R3;
                                fVar.f17184d = (Long) R3.f364b;
                            }
                            if (aVar != null) {
                                aVar.f16695g = fVar;
                            }
                            if (i1Var != 0) {
                                if (!z7) {
                                    i1Var.l();
                                }
                                if (aVar != null) {
                                    aVar.a(null);
                                }
                            } else if (aVar != null) {
                                aVar.a(null);
                            }
                            if (!z7) {
                                c((i0) objectRef.element, num, o0Var, currentTimeMillis, fVar);
                            }
                            throw th;
                        }
                    }
                    if (d((i0) objectRef.element, response)) {
                        if (!z7 || aVar == null) {
                            ci.c.h(b1Var, (i0) objectRef.element, response);
                        } else {
                            Intrinsics.checkNotNullParameter(response, "response");
                            aVar.f16694f = response;
                        }
                    }
                    if (aVar != null) {
                        aVar.e((i0) objectRef.element);
                    }
                    if (fVar != null) {
                        r0 r0Var2 = response.f10279g;
                        o0Var2 = response;
                        v0 R4 = x.R(o0Var2, r0Var2 != null ? Long.valueOf(r0Var2.k()) : null, b1Var.m().getSessionReplay().f16414p, new io.sentry.android.core.internal.gestures.c(6, this), b1Var.m().getSessionReplay().f16415r, new io.sentry.clientreport.a(this, 2));
                        fVar.f17182b = Integer.valueOf(i5);
                        fVar.f17186f = R4;
                        fVar.f17184d = (Long) R4.f364b;
                    } else {
                        o0Var2 = response;
                    }
                    if (aVar != null) {
                        aVar.f16695g = fVar;
                    }
                    if (i1Var != 0) {
                        if (!z7) {
                            i1Var.l();
                        }
                        if (aVar != null) {
                            aVar.a(null);
                        }
                    } else if (aVar != null) {
                        aVar.a(null);
                    }
                    if (!z7) {
                        c((i0) objectRef.element, num, o0Var2, currentTimeMillis, fVar);
                    }
                    return o0Var2;
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th3) {
                    th = th3;
                    num = 0;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (Throwable th5) {
            th = th5;
            num = 0;
            response = 0;
        }
    }

    public final void c(i0 i0Var, Integer num, o0 o0Var, long j, io.sentry.util.network.f fVar) {
        r0 r0Var;
        b5 b5Var;
        String str = i0Var.f10206a.f10337i;
        String str2 = i0Var.f10207b;
        io.sentry.e eVar = new io.sentry.e();
        w E = d5.E(str);
        eVar.f16334e = "http";
        eVar.f16336g = "http";
        String str3 = E.f6175a;
        if (str3 != null) {
            eVar.c(str3, "url");
        }
        eVar.c(str2.toUpperCase(Locale.ROOT), "method");
        String str4 = E.f6176b;
        if (str4 != null) {
            eVar.c(str4, "http.query");
        }
        String str5 = E.f6177c;
        if (str5 != null) {
            eVar.c(str5, "http.fragment");
        }
        Long l6 = null;
        if (num != null) {
            eVar.c(num, "status_code");
            int intValue = num.intValue();
            l0 l0Var = io.sentry.util.b.f17155b;
            if (intValue < l0Var.f16605a || intValue > l0Var.f16606b) {
                int intValue2 = num.intValue();
                l0 l0Var2 = io.sentry.util.b.f17156c;
                b5Var = (intValue2 < l0Var2.f16605a || intValue2 > l0Var2.f16606b) ? null : b5.ERROR;
            } else {
                b5Var = b5.WARNING;
            }
            eVar.f16338i = b5Var;
        }
        Intrinsics.checkNotNullExpressionValue(eVar, "http(...)");
        m0 m0Var = i0Var.f10209d;
        Long valueOf = m0Var != null ? Long.valueOf(m0Var.a()) : null;
        f fVar2 = new f(eVar, 0);
        if (valueOf != null && valueOf.longValue() != -1) {
            fVar2.invoke(valueOf);
        }
        if (o0Var != null && (r0Var = o0Var.f10279g) != null) {
            l6 = Long.valueOf(r0Var.k());
        }
        f fVar3 = new f(eVar, 1);
        if (l6 != null && l6.longValue() != -1) {
            fVar3.invoke(l6);
        }
        h0 h0Var = new h0();
        h0Var.d(i0Var, "okHttp:request");
        if (o0Var != null) {
            h0Var.d(o0Var, "okHttp:response");
        }
        if (fVar != null) {
            h0Var.d(fVar, "sentry:replayNetworkDetails");
        }
        eVar.c(Long.valueOf(j), "http.start_timestamp");
        eVar.c(Long.valueOf(System.currentTimeMillis()), "http.end_timestamp");
        this.f16710a.h(eVar, h0Var);
    }

    public final boolean d(i0 i0Var, o0 o0Var) {
        if (!this.f16711b) {
            return false;
        }
        int i5 = o0Var.f10276d;
        for (l0 l0Var : this.f16712c) {
            if (i5 >= l0Var.f16605a && i5 <= l0Var.f16606b) {
                return a.a.g(i0Var.f10206a.f10337i, this.f16713d);
            }
        }
        return false;
    }
}
