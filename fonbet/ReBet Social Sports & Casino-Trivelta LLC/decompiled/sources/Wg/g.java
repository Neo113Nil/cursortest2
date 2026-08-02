package Wg;

import ah.InterfaceC2019k;
import ah.u;
import ah.v;
import eh.AbstractC4206a;
import eh.C4207b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final v f13267a;

    /* renamed from: b, reason: collision with root package name */
    public final C4207b f13268b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2019k f13269c;

    /* renamed from: d, reason: collision with root package name */
    public final u f13270d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13271e;

    /* renamed from: f, reason: collision with root package name */
    public final CoroutineContext f13272f;

    /* renamed from: g, reason: collision with root package name */
    public final C4207b f13273g;

    public g(v statusCode, C4207b requestTime, InterfaceC2019k headers, u version, Object body, CoroutineContext callContext) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(requestTime, "requestTime");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        this.f13267a = statusCode;
        this.f13268b = requestTime;
        this.f13269c = headers;
        this.f13270d = version;
        this.f13271e = body;
        this.f13272f = callContext;
        this.f13273g = AbstractC4206a.b(null, 1, null);
    }

    public final Object a() {
        return this.f13271e;
    }

    public final CoroutineContext b() {
        return this.f13272f;
    }

    public final InterfaceC2019k c() {
        return this.f13269c;
    }

    public final C4207b d() {
        return this.f13268b;
    }

    public final C4207b e() {
        return this.f13273g;
    }

    public final v f() {
        return this.f13267a;
    }

    public final u g() {
        return this.f13270d;
    }

    public String toString() {
        return "HttpResponseData=(statusCode=" + this.f13267a + ')';
    }
}
