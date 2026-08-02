package io.sentry.okhttp;

import com.google.android.gms.internal.measurement.d5;
import com.google.firebase.messaging.w;
import gh.i0;
import gh.o0;
import gh.y;
import io.sentry.d4;
import io.sentry.h0;
import io.sentry.i1;
import io.sentry.k4;
import io.sentry.n6;
import io.sentry.util.h;
import io.sentry.y3;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f16689a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f16690b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.e f16691c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f16692d;

    /* renamed from: e, reason: collision with root package name */
    public o0 f16693e;

    /* renamed from: f, reason: collision with root package name */
    public o0 f16694f;

    /* renamed from: g, reason: collision with root package name */
    public io.sentry.util.network.f f16695g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f16696h;

    /* renamed from: i, reason: collision with root package name */
    public String f16697i;
    public String j;

    public a(i0 request) {
        y3 scopes = y3.f17255a;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f16689a = request;
        this.f16690b = new ConcurrentHashMap();
        this.f16696h = new AtomicBoolean(false);
        w E = d5.E(request.f10206a.f10337i);
        Intrinsics.checkNotNullExpressionValue(E, "parse(...)");
        String str = E.f6175a;
        str = str == null ? "unknown" : str;
        Intrinsics.checkNotNullExpressionValue(str, "getUrlOrFallback(...)");
        this.f16697i = str;
        this.j = request.f10207b;
        i1 n9 = h.f17164a ? scopes.n() : scopes.i();
        i1 r5 = n9 != null ? n9.r("http.client") : null;
        this.f16692d = r5;
        n6 v5 = r5 != null ? r5.v() : null;
        if (v5 != null) {
            v5.f16675i = "auto.http.okhttp";
        }
        io.sentry.e eVar = new io.sentry.e();
        eVar.f16334e = "http";
        eVar.f16336g = "http";
        eVar.c(Long.valueOf(System.currentTimeMillis()), "http.start_timestamp");
        this.f16691c = eVar;
        e(request);
    }

    public final void a(b bVar) {
        if (this.f16696h.getAndSet(true)) {
            return;
        }
        this.f16690b.clear();
        h0 h0Var = new h0();
        h0Var.d(this.f16689a, "okHttp:request");
        o0 o0Var = this.f16693e;
        if (o0Var != null) {
            h0Var.d(o0Var, "okHttp:response");
        }
        io.sentry.util.network.f fVar = this.f16695g;
        if (fVar != null) {
            h0Var.d(fVar, "sentry:replayNetworkDetails");
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        io.sentry.e eVar = this.f16691c;
        eVar.c(valueOf, "http.end_timestamp");
        y3 y3Var = y3.f17255a;
        y3Var.h(eVar, h0Var);
        i1 i1Var = this.f16692d;
        if (i1Var != null && bVar != null) {
            bVar.invoke(i1Var);
        }
        o0 o0Var2 = this.f16694f;
        if (o0Var2 != null) {
            ci.c.h(y3Var, o0Var2.f10273a, o0Var2);
        }
        if (i1Var != null) {
            i1Var.l();
        }
    }

    public final void b(String event, Function1 function1) {
        i1 i1Var;
        Intrinsics.checkNotNullParameter(event, "event");
        k4 k4Var = (k4) this.f16690b.remove(event);
        if (k4Var == null || (i1Var = this.f16692d) == null) {
            return;
        }
        if (function1 != null) {
            function1.invoke(i1Var);
        }
        i1Var.m(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(d4.d().m().getDateProvider().a().b(k4Var))), event);
    }

    public final void c(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f16692d == null) {
            return;
        }
        k4 a7 = d4.d().m().getDateProvider().a();
        Intrinsics.checkNotNullExpressionValue(a7, "now(...)");
        this.f16690b.put(event, a7);
    }

    public final void d(String str) {
        if (str != null) {
            this.f16691c.c(str, "error_message");
            i1 i1Var = this.f16692d;
            if (i1Var != null) {
                i1Var.m(str, "error_message");
            }
        }
    }

    public final void e(i0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        w E = d5.E(request.f10206a.f10337i);
        String str = E.f6177c;
        String str2 = E.f6176b;
        Intrinsics.checkNotNullExpressionValue(E, "parse(...)");
        String str3 = E.f6175a;
        String str4 = str3 == null ? "unknown" : str3;
        Intrinsics.checkNotNullExpressionValue(str4, "getUrlOrFallback(...)");
        this.f16697i = str4;
        y yVar = request.f10206a;
        String str5 = yVar.f10332d;
        String b10 = yVar.b();
        this.j = request.f10207b;
        i1 i1Var = this.f16692d;
        if (i1Var != null) {
            i1Var.p(this.j + ' ' + this.f16697i);
        }
        if (i1Var != null) {
            if (str2 != null) {
                i1Var.m(str2, "http.query");
            }
            if (str != null) {
                i1Var.m(str, "http.fragment");
            }
        }
        io.sentry.e eVar = this.f16691c;
        eVar.c(str5, "host");
        eVar.c(b10, "path");
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            eVar.c(str3, "url");
        }
        String str6 = this.j;
        Locale locale = Locale.ROOT;
        String upperCase = str6.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        eVar.c(upperCase, "method");
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            eVar.c(str2, "http.query");
        }
        if (str != null) {
            Intrinsics.checkNotNull(str);
            eVar.c(str, "http.fragment");
        }
        if (i1Var != null) {
            i1Var.m(this.f16697i, "url");
        }
        if (i1Var != null) {
            i1Var.m(str5, "host");
        }
        if (i1Var != null) {
            i1Var.m(b10, "path");
        }
        if (i1Var != null) {
            String upperCase2 = this.j.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            i1Var.m(upperCase2, "http.request.method");
        }
    }
}
