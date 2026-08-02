package r4;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t4.C6442b;

/* renamed from: r4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6206b {

    /* renamed from: l, reason: collision with root package name */
    public static final a f63930l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f63931m = -1;

    /* renamed from: n, reason: collision with root package name */
    public static final double f63932n = -1.0d;

    /* renamed from: a, reason: collision with root package name */
    public int f63933a;

    /* renamed from: b, reason: collision with root package name */
    public int f63934b;

    /* renamed from: c, reason: collision with root package name */
    public int f63935c;

    /* renamed from: d, reason: collision with root package name */
    public int f63936d;

    /* renamed from: e, reason: collision with root package name */
    public int f63937e;

    /* renamed from: f, reason: collision with root package name */
    public int f63938f;

    /* renamed from: g, reason: collision with root package name */
    public double f63939g;

    /* renamed from: h, reason: collision with root package name */
    public double f63940h;

    /* renamed from: i, reason: collision with root package name */
    public double f63941i;

    /* renamed from: j, reason: collision with root package name */
    public int f63942j;

    /* renamed from: k, reason: collision with root package name */
    public C0887b f63943k;

    /* renamed from: r4.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final double a() {
            return C6206b.f63932n;
        }

        public final int b() {
            return C6206b.f63931m;
        }

        public final C6206b c(ReadableMap readableMap) {
            C6206b c6206b = new C6206b();
            if (readableMap != null) {
                c6206b.o(C6442b.e(readableMap, "cacheSizeMB", b()));
                c6206b.v(C6442b.e(readableMap, "minBufferMs", b()));
                c6206b.r(C6442b.e(readableMap, "maxBufferMs", b()));
                c6206b.n(C6442b.e(readableMap, "bufferForPlaybackMs", b()));
                c6206b.m(C6442b.e(readableMap, "bufferForPlaybackAfterRebufferMs", b()));
                c6206b.s(C6442b.c(readableMap, "maxHeapAllocationPercent", a()));
                c6206b.t(C6442b.c(readableMap, "minBackBufferMemoryReservePercent", a()));
                c6206b.u(C6442b.c(readableMap, "minBufferMemoryReservePercent", a()));
                c6206b.l(C6442b.e(readableMap, "backBufferDurationMs", b()));
                c6206b.p(C6442b.e(readableMap, "initialBitrate", b()));
                c6206b.q(C0887b.f63944f.a(readableMap.getMap("live")));
            }
            return c6206b;
        }

        public a() {
        }
    }

    /* renamed from: r4.b$b, reason: collision with other inner class name */
    public static final class C0887b {

        /* renamed from: f, reason: collision with root package name */
        public static final a f63944f = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public float f63945a;

        /* renamed from: b, reason: collision with root package name */
        public float f63946b;

        /* renamed from: c, reason: collision with root package name */
        public long f63947c;

        /* renamed from: d, reason: collision with root package name */
        public long f63948d;

        /* renamed from: e, reason: collision with root package name */
        public long f63949e;

        /* renamed from: r4.b$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C0887b a(ReadableMap readableMap) {
                C0887b c0887b = new C0887b();
                a aVar = C6206b.f63930l;
                c0887b.g(C6442b.d(readableMap, "maxPlaybackSpeed", (float) aVar.a()));
                c0887b.i(C6442b.d(readableMap, "minPlaybackSpeed", (float) aVar.a()));
                c0887b.f(C6442b.e(readableMap, "maxOffsetMs", aVar.b()));
                c0887b.h(C6442b.e(readableMap, "minOffsetMs", aVar.b()));
                c0887b.j(C6442b.e(readableMap, "targetOffsetMs", aVar.b()));
                return c0887b;
            }

            public a() {
            }
        }

        public C0887b() {
            a aVar = C6206b.f63930l;
            this.f63945a = (float) aVar.a();
            this.f63946b = (float) aVar.a();
            this.f63947c = aVar.b();
            this.f63948d = aVar.b();
            this.f63949e = aVar.b();
        }

        public final long a() {
            return this.f63947c;
        }

        public final float b() {
            return this.f63945a;
        }

        public final long c() {
            return this.f63948d;
        }

        public final float d() {
            return this.f63946b;
        }

        public final long e() {
            return this.f63949e;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof C0887b)) {
                C0887b c0887b = (C0887b) obj;
                if (this.f63945a == c0887b.f63945a && this.f63946b == c0887b.f63946b && this.f63947c == c0887b.f63947c && this.f63948d == c0887b.f63948d && this.f63949e == c0887b.f63949e) {
                    return true;
                }
            }
            return false;
        }

        public final void f(long j10) {
            this.f63947c = j10;
        }

        public final void g(float f10) {
            this.f63945a = f10;
        }

        public final void h(long j10) {
            this.f63948d = j10;
        }

        public final void i(float f10) {
            this.f63946b = f10;
        }

        public final void j(long j10) {
            this.f63949e = j10;
        }
    }

    public C6206b() {
        int i10 = f63931m;
        this.f63933a = i10;
        this.f63934b = i10;
        this.f63935c = i10;
        this.f63936d = i10;
        this.f63937e = i10;
        this.f63938f = i10;
        double d10 = f63932n;
        this.f63939g = d10;
        this.f63940h = d10;
        this.f63941i = d10;
        this.f63942j = i10;
        this.f63943k = new C0887b();
    }

    public final int c() {
        return this.f63938f;
    }

    public final int d() {
        return this.f63937e;
    }

    public final int e() {
        return this.f63936d;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C6206b)) {
            C6206b c6206b = (C6206b) obj;
            if (this.f63933a == c6206b.f63933a && this.f63934b == c6206b.f63934b && this.f63935c == c6206b.f63935c && this.f63936d == c6206b.f63936d && this.f63937e == c6206b.f63937e && this.f63938f == c6206b.f63938f && this.f63939g == c6206b.f63939g && this.f63940h == c6206b.f63940h && this.f63941i == c6206b.f63941i && this.f63942j == c6206b.f63942j && Intrinsics.areEqual(this.f63943k, c6206b.f63943k)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f63933a;
    }

    public final int g() {
        return this.f63942j;
    }

    public final C0887b h() {
        return this.f63943k;
    }

    public final int i() {
        return this.f63935c;
    }

    public final double j() {
        return this.f63939g;
    }

    public final int k() {
        return this.f63934b;
    }

    public final void l(int i10) {
        this.f63938f = i10;
    }

    public final void m(int i10) {
        this.f63937e = i10;
    }

    public final void n(int i10) {
        this.f63936d = i10;
    }

    public final void o(int i10) {
        this.f63933a = i10;
    }

    public final void p(int i10) {
        this.f63942j = i10;
    }

    public final void q(C0887b c0887b) {
        Intrinsics.checkNotNullParameter(c0887b, "<set-?>");
        this.f63943k = c0887b;
    }

    public final void r(int i10) {
        this.f63935c = i10;
    }

    public final void s(double d10) {
        this.f63939g = d10;
    }

    public final void t(double d10) {
        this.f63940h = d10;
    }

    public final void u(double d10) {
        this.f63941i = d10;
    }

    public final void v(int i10) {
        this.f63934b = i10;
    }
}
