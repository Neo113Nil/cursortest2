package Ug;

import ah.InterfaceC2019k;
import ah.u;
import ah.v;
import eh.C4207b;
import io.ktor.utils.io.f;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends Xg.c {

    /* renamed from: a, reason: collision with root package name */
    public final Og.b f12247a;

    /* renamed from: b, reason: collision with root package name */
    public final f f12248b;

    /* renamed from: c, reason: collision with root package name */
    public final Xg.c f12249c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f12250d;

    public d(Og.b call, f content, Xg.c origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f12247a = call;
        this.f12248b = content;
        this.f12249c = origin;
        this.f12250d = origin.getCoroutineContext();
    }

    @Override // ah.InterfaceC2025q
    public InterfaceC2019k a() {
        return this.f12249c.a();
    }

    @Override // Xg.c
    public f b() {
        return this.f12248b;
    }

    @Override // Xg.c
    public C4207b c() {
        return this.f12249c.c();
    }

    @Override // Xg.c
    public C4207b e() {
        return this.f12249c.e();
    }

    @Override // Xg.c
    public v f() {
        return this.f12249c.f();
    }

    @Override // Xg.c
    public u g() {
        return this.f12249c.g();
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f12250d;
    }

    @Override // Xg.c
    public Og.b r() {
        return this.f12247a;
    }
}
