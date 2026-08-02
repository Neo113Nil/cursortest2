package Wg;

import Ph.C0;
import ah.C2027t;
import ah.InterfaceC2019k;
import ah.P;
import bh.AbstractC2423b;
import ch.InterfaceC2925b;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final P f13253a;

    /* renamed from: b, reason: collision with root package name */
    public final C2027t f13254b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2019k f13255c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2423b f13256d;

    /* renamed from: e, reason: collision with root package name */
    public final C0 f13257e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2925b f13258f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f13259g;

    public d(P url, C2027t method, InterfaceC2019k headers, AbstractC2423b body, C0 executionContext, InterfaceC2925b attributes) {
        Set keySet;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f13253a = url;
        this.f13254b = method;
        this.f13255c = headers;
        this.f13256d = body;
        this.f13257e = executionContext;
        this.f13258f = attributes;
        Map map = (Map) attributes.f(Qg.f.a());
        this.f13259g = (map == null || (keySet = map.keySet()) == null) ? SetsKt.emptySet() : keySet;
    }

    public final InterfaceC2925b a() {
        return this.f13258f;
    }

    public final AbstractC2423b b() {
        return this.f13256d;
    }

    public final Object c(Qg.e key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f13258f.f(Qg.f.a());
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final C0 d() {
        return this.f13257e;
    }

    public final InterfaceC2019k e() {
        return this.f13255c;
    }

    public final C2027t f() {
        return this.f13254b;
    }

    public final Set g() {
        return this.f13259g;
    }

    public final P h() {
        return this.f13253a;
    }

    public String toString() {
        return "HttpRequestData(url=" + this.f13253a + ", method=" + this.f13254b + ')';
    }
}
