package j;

import k.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public boolean f53614c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53616e;

    /* renamed from: f, reason: collision with root package name */
    public long f53617f;

    /* renamed from: a, reason: collision with root package name */
    public f.InterfaceC0781f f53612a = f.c.f54001a;

    /* renamed from: b, reason: collision with root package name */
    public int f53613b = k.d.f53996e.a();

    /* renamed from: d, reason: collision with root package name */
    public f.b f53615d = f.b.a.f53999a;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public boolean f53620c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f53622e;

        /* renamed from: f, reason: collision with root package name */
        public long f53623f;

        /* renamed from: a, reason: collision with root package name */
        public f.InterfaceC0781f f53618a = f.c.f54001a;

        /* renamed from: b, reason: collision with root package name */
        public int f53619b = k.d.f53996e.a();

        /* renamed from: d, reason: collision with root package name */
        public f.b f53621d = f.b.a.f53999a;

        public final f a() {
            f fVar = new f();
            fVar.k(this.f53618a);
            fVar.j(this.f53619b);
            fVar.l(this.f53620c);
            fVar.i(this.f53621d);
            fVar.h(this.f53622e);
            fVar.g(this.f53623f);
            return fVar;
        }

        public final a b(long j10) {
            this.f53623f = j10;
            this.f53622e = true;
            return this;
        }

        public final a c(f.b defaultTab) {
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            this.f53621d = defaultTab;
            return this;
        }

        public final a d(int i10) {
            this.f53619b = i10;
            return this;
        }

        public final a e(f.InterfaceC0781f mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.f53618a = mediaType;
            return this;
        }

        public final a f(boolean z10) {
            this.f53620c = z10;
            return this;
        }
    }

    public final long a() {
        return this.f53617f;
    }

    public final f.b b() {
        return this.f53615d;
    }

    public final int c() {
        return this.f53613b;
    }

    public final f.InterfaceC0781f d() {
        return this.f53612a;
    }

    public final boolean e() {
        return this.f53616e;
    }

    public final boolean f() {
        return this.f53614c;
    }

    public final void g(long j10) {
        this.f53617f = j10;
    }

    public final void h(boolean z10) {
        this.f53616e = z10;
    }

    public final void i(f.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f53615d = bVar;
    }

    public final void j(int i10) {
        this.f53613b = i10;
    }

    public final void k(f.InterfaceC0781f interfaceC0781f) {
        Intrinsics.checkNotNullParameter(interfaceC0781f, "<set-?>");
        this.f53612a = interfaceC0781f;
    }

    public final void l(boolean z10) {
        this.f53614c = z10;
    }
}
