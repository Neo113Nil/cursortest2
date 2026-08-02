package Bh;

import yh.InterfaceC6893b;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6893b f914a;

    /* renamed from: b, reason: collision with root package name */
    public final long f915b;

    /* renamed from: c, reason: collision with root package name */
    public final long f916c;

    public a(InterfaceC6893b interfaceC6893b, long j10, long j11) {
        this.f914a = interfaceC6893b;
        this.f915b = j10;
        this.f916c = j11;
    }

    public static a a(InterfaceC6893b interfaceC6893b) {
        return new a(interfaceC6893b, interfaceC6893b.now(), interfaceC6893b.nanoTime());
    }

    public long b() {
        return this.f915b + (this.f914a.nanoTime() - this.f916c);
    }

    public long c() {
        return this.f915b;
    }
}
