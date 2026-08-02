package Og;

import Ph.A;
import Ph.G0;
import ah.InterfaceC2019k;
import ah.u;
import ah.v;
import eh.C4207b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends Xg.c {

    /* renamed from: a, reason: collision with root package name */
    public final e f8653a;

    /* renamed from: b, reason: collision with root package name */
    public final A f8654b;

    /* renamed from: c, reason: collision with root package name */
    public final v f8655c;

    /* renamed from: d, reason: collision with root package name */
    public final u f8656d;

    /* renamed from: e, reason: collision with root package name */
    public final C4207b f8657e;

    /* renamed from: f, reason: collision with root package name */
    public final C4207b f8658f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2019k f8659g;

    /* renamed from: h, reason: collision with root package name */
    public final CoroutineContext f8660h;

    /* renamed from: i, reason: collision with root package name */
    public final io.ktor.utils.io.f f8661i;

    public g(e call, byte[] body, Xg.c origin) {
        A b10;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f8653a = call;
        b10 = G0.b(null, 1, null);
        this.f8654b = b10;
        this.f8655c = origin.f();
        this.f8656d = origin.g();
        this.f8657e = origin.c();
        this.f8658f = origin.e();
        this.f8659g = origin.a();
        this.f8660h = origin.getCoroutineContext().plus(b10);
        this.f8661i = io.ktor.utils.io.d.a(body);
    }

    @Override // ah.InterfaceC2025q
    public InterfaceC2019k a() {
        return this.f8659g;
    }

    @Override // Xg.c
    public io.ktor.utils.io.f b() {
        return this.f8661i;
    }

    @Override // Xg.c
    public C4207b c() {
        return this.f8657e;
    }

    @Override // Xg.c
    public C4207b e() {
        return this.f8658f;
    }

    @Override // Xg.c
    public v f() {
        return this.f8655c;
    }

    @Override // Xg.c
    public u g() {
        return this.f8656d;
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f8660h;
    }

    @Override // Xg.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e r() {
        return this.f8653a;
    }
}
