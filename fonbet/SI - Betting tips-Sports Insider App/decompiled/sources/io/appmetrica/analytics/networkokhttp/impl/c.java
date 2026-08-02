package io.appmetrica.analytics.networkokhttp.impl;

import gh.g0;
import gh.m0;
import gh.o;
import gh.o0;
import io.appmetrica.analytics.coreutils.internal.io.InputStreamUtils;
import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.p;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import zf.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends Call {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f15173a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f15174b;

    /* renamed from: c, reason: collision with root package name */
    public final NetworkClientSettings f15175c;

    public c(@NotNull g0 g0Var, @NotNull Request request, @NotNull NetworkClientSettings networkClientSettings) {
        this.f15173a = g0Var;
        this.f15174b = request;
        this.f15175c = networkClientSettings;
    }

    public static LinkedHashMap a(Headers headers) {
        IntRange d10 = j.d(0, headers.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = d10.iterator();
        while (((zf.b) it).f25972c) {
            int nextInt = ((i0) it).nextInt();
            String name = headers.name(nextInt);
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(headers.value(nextInt));
        }
        return linkedHashMap;
    }

    @Override // io.appmetrica.analytics.networkapi.Call
    @NotNull
    public final Response execute() {
        try {
            g0 g0Var = this.f15173a;
            gh.i0 request = a(this.f15174b);
            g0Var.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            o0 f6 = new p(g0Var, request).f();
            return new Response.Builder(true, f6.f10276d, InputStreamUtils.INSTANCE.readSafelyApprox(this.f15175c.getMaxResponseSize(), new b(f6))).withHeaders(a(f6.f10278f)).withUrl(f6.f10273a.f10206a.f10337i).build();
        } catch (Throwable th2) {
            return new Response.Builder(th2).build();
        }
    }

    public static gh.i0 a(Request request) {
        c4.d dVar = new c4.d(5);
        dVar.q(request.getUrl());
        int i5 = a.f15171a[request.getMethod().ordinal()];
        if (i5 == 1) {
            dVar.j("GET", null);
        } else if (i5 == 2) {
            String methodName = request.getMethod().getMethodName();
            int i10 = m0.f10243a;
            byte[] body = request.getBody();
            dVar.j(methodName, o.b(body.length, null, body));
        }
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            dVar.d(entry.getKey(), entry.getValue());
        }
        return new gh.i0(dVar);
    }
}
