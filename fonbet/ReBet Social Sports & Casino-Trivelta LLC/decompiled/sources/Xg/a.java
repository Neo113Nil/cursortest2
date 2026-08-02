package Xg;

import ah.InterfaceC2019k;
import ah.u;
import ah.v;
import eh.C4207b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Og.b f13826a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f13827b;

    /* renamed from: c, reason: collision with root package name */
    public final v f13828c;

    /* renamed from: d, reason: collision with root package name */
    public final u f13829d;

    /* renamed from: e, reason: collision with root package name */
    public final C4207b f13830e;

    /* renamed from: f, reason: collision with root package name */
    public final C4207b f13831f;

    /* renamed from: g, reason: collision with root package name */
    public final io.ktor.utils.io.f f13832g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2019k f13833h;

    public a(Og.b call, Wg.g responseData) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        this.f13826a = call;
        this.f13827b = responseData.b();
        this.f13828c = responseData.f();
        this.f13829d = responseData.g();
        this.f13830e = responseData.d();
        this.f13831f = responseData.e();
        Object a10 = responseData.a();
        io.ktor.utils.io.f fVar = a10 instanceof io.ktor.utils.io.f ? (io.ktor.utils.io.f) a10 : null;
        this.f13832g = fVar == null ? io.ktor.utils.io.f.f49437a.a() : fVar;
        this.f13833h = responseData.c();
    }

    @Override // ah.InterfaceC2025q
    public InterfaceC2019k a() {
        return this.f13833h;
    }

    @Override // Xg.c
    public io.ktor.utils.io.f b() {
        return this.f13832g;
    }

    @Override // Xg.c
    public C4207b c() {
        return this.f13830e;
    }

    @Override // Xg.c
    public C4207b e() {
        return this.f13831f;
    }

    @Override // Xg.c
    public v f() {
        return this.f13828c;
    }

    @Override // Xg.c
    public u g() {
        return this.f13829d;
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f13827b;
    }

    @Override // Xg.c
    public Og.b r() {
        return this.f13826a;
    }
}
