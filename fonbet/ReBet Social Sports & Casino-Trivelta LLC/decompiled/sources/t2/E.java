package t2;

import b1.InterfaceC2362p;
import b1.z;
import e1.AbstractC4134a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final b1.z f65013a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65014b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65015c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65016d;

    /* renamed from: e, reason: collision with root package name */
    public final long f65017e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65018f;

    /* renamed from: g, reason: collision with root package name */
    public final C6406l0 f65019g;

    /* renamed from: h, reason: collision with root package name */
    public long f65020h;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public b1.z f65021a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f65022b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f65023c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f65024d;

        /* renamed from: e, reason: collision with root package name */
        public long f65025e;

        /* renamed from: f, reason: collision with root package name */
        public int f65026f;

        /* renamed from: g, reason: collision with root package name */
        public C6406l0 f65027g;

        public E a() {
            return new E(this.f65021a, this.f65022b, this.f65023c, this.f65024d, this.f65025e, this.f65026f, this.f65027g);
        }

        public b b(long j10) {
            AbstractC4134a.a(j10 > 0);
            this.f65025e = j10;
            return this;
        }

        public b c(C6406l0 c6406l0) {
            this.f65027g = c6406l0;
            return this;
        }

        public b d(b1.z zVar) {
            this.f65021a = zVar;
            return this;
        }

        public b e(boolean z10) {
            this.f65022b = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f65023c = z10;
            return this;
        }

        public b(b1.z zVar) {
            this.f65021a = zVar;
            z.h hVar = zVar.f24655b;
            this.f65025e = hVar == null ? -9223372036854775807L : e1.Z.a1(hVar.f24758j);
            this.f65026f = -2147483647;
            this.f65027g = C6406l0.f65395c;
        }

        public b(E e10) {
            this.f65021a = e10.f65013a;
            this.f65022b = e10.f65014b;
            this.f65023c = e10.f65015c;
            this.f65024d = e10.f65016d;
            this.f65025e = e10.f65017e;
            this.f65026f = e10.f65018f;
            this.f65027g = e10.f65019g;
        }
    }

    public static boolean d(b1.z zVar) {
        return Objects.equals(zVar.f24654a, "androidx-media3-GapMediaItem");
    }

    public b a() {
        return new b();
    }

    public long b(long j10) {
        long j11;
        long j12 = -9223372036854775807L;
        if (this.f65014b) {
            j11 = -9223372036854775807L;
        } else {
            com.google.common.collect.m0 it = this.f65019g.f65396a.iterator();
            j11 = j10;
            while (it.hasNext()) {
                j11 = ((c1.p) it.next()).f(j11);
            }
        }
        if (!this.f65015c) {
            com.google.common.collect.m0 it2 = this.f65019g.f65397b.iterator();
            while (it2.hasNext()) {
                j10 = ((InterfaceC2362p) it2.next()).e(j10);
            }
            j12 = j10;
        }
        return Math.max(j11, j12);
    }

    public boolean c() {
        return d(this.f65013a);
    }

    public E(b1.z zVar, boolean z10, boolean z11, boolean z12, long j10, int i10, C6406l0 c6406l0) {
        AbstractC4134a.h((z10 && z11) ? false : true, "Audio and video cannot both be removed");
        if (d(zVar)) {
            AbstractC4134a.a(j10 != -9223372036854775807L);
            AbstractC4134a.a((z10 || z12 || !c6406l0.f65396a.isEmpty()) ? false : true);
        }
        this.f65013a = zVar;
        this.f65014b = z10;
        this.f65015c = z11;
        this.f65016d = z12;
        this.f65017e = j10;
        this.f65018f = i10;
        this.f65019g = c6406l0;
        this.f65020h = -9223372036854775807L;
    }
}
