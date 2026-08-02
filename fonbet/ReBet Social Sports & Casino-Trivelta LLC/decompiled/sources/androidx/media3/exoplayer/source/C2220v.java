package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.D;
import b1.z;
import e1.AbstractC4134a;
import h1.InterfaceC4403F;

/* renamed from: androidx.media3.exoplayer.source.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2220v extends AbstractC2200a {

    /* renamed from: h, reason: collision with root package name */
    public final long f21879h;

    /* renamed from: i, reason: collision with root package name */
    public b1.z f21880i;

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void D(InterfaceC4403F interfaceC4403F) {
        E(new f0(this.f21879h, true, false, false, null, d()));
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void F() {
    }

    @Override // androidx.media3.exoplayer.source.D
    public C c(D.b bVar, D1.b bVar2, long j10) {
        b1.z d10 = d();
        AbstractC4134a.e(d10.f24655b);
        AbstractC4134a.f(d10.f24655b.f24750b, "Externally loaded mediaItems require a MIME type.");
        z.h hVar = d10.f24655b;
        return new C2219u(hVar.f24749a, hVar.f24750b, null);
    }

    @Override // androidx.media3.exoplayer.source.D
    public synchronized b1.z d() {
        return this.f21880i;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void f(C c10) {
        ((C2219u) c10).l();
    }

    @Override // androidx.media3.exoplayer.source.D
    public synchronized void n(b1.z zVar) {
        this.f21880i = zVar;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void q() {
    }

    public C2220v(b1.z zVar, long j10, InterfaceC2218t interfaceC2218t) {
        this.f21880i = zVar;
        this.f21879h = j10;
    }

    /* renamed from: androidx.media3.exoplayer.source.v$b */
    public static final class b implements D.a {

        /* renamed from: c, reason: collision with root package name */
        public final long f21881c;

        public b(long j10, InterfaceC2218t interfaceC2218t) {
            this.f21881c = j10;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C2220v e(b1.z zVar) {
            return new C2220v(zVar, this.f21881c, null);
        }

        @Override // androidx.media3.exoplayer.source.D.a
        public D.a d(q1.w wVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        public D.a g(D1.k kVar) {
            return this;
        }
    }
}
