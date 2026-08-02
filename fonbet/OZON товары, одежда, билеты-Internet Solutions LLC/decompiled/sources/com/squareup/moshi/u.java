package com.squareup.moshi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.C9684j;
import sf.InterfaceC9683i;
import sf.M;
import sf.N;

/* loaded from: classes.dex */
public final class u implements M {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final C9684j f60452h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C9684j f60453i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final C9684j f60454j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final C9684j f60455k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final C9684j f60456l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final C9684j f60457m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f60458n = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9683i f60459a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9681g f60460b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private C9684j f60461c;

    /* renamed from: d, reason: collision with root package name */
    private int f60462d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9681g f60463e;

    /* renamed from: f, reason: collision with root package name */
    private long f60464f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f60465g;

    /* loaded from: classes9.dex */
    public static final class a {
        @NotNull
        public static C9684j a() {
            return u.f60454j;
        }

        @NotNull
        public static C9684j b() {
            return u.f60457m;
        }

        @NotNull
        public static C9684j c() {
            return u.f60452h;
        }

        @NotNull
        public static C9684j d() {
            return u.f60453i;
        }
    }

    static {
        C9684j c9684j = C9684j.f98719d;
        f60452h = C9684j.a.c("[]{}\"'/#");
        f60453i = C9684j.a.c("'\\");
        f60454j = C9684j.a.c("\"\\");
        f60455k = C9684j.a.c("\r\n");
        f60456l = C9684j.a.c("*");
        f60457m = C9684j.f98719d;
    }

    public u(@NotNull InterfaceC9683i source, @NotNull C9681g prefix, @NotNull C9684j state, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f60459a = source;
        this.f60460b = prefix;
        this.f60461c = state;
        this.f60462d = i11;
        this.f60463e = source.f();
    }

    private final void m(long j11) {
        while (true) {
            long j12 = this.f60464f;
            if (j12 >= j11) {
                return;
            }
            C9684j c9684j = this.f60461c;
            C9684j c9684j2 = f60457m;
            if (c9684j == c9684j2) {
                return;
            }
            C9681g c9681g = this.f60463e;
            long size = c9681g.size();
            InterfaceC9683i interfaceC9683i = this.f60459a;
            if (j12 == size) {
                if (this.f60464f > 0) {
                    return;
                } else {
                    interfaceC9683i.r1(1L);
                }
            }
            long q11 = c9681g.q(this.f60464f, this.f60461c);
            if (q11 == -1) {
                this.f60464f = c9681g.size();
            } else {
                byte o11 = c9681g.o(q11);
                C9684j c9684j3 = this.f60461c;
                C9684j c9684j4 = f60452h;
                C9684j c9684j5 = f60456l;
                C9684j c9684j6 = f60453i;
                C9684j c9684j7 = f60454j;
                C9684j c9684j8 = f60455k;
                if (c9684j3 == c9684j4) {
                    char c11 = (char) o11;
                    if (c11 == '[' || c11 == '{') {
                        this.f60462d++;
                        this.f60464f = q11 + 1;
                    } else if (c11 == ']' || c11 == '}') {
                        int i11 = this.f60462d - 1;
                        this.f60462d = i11;
                        if (i11 == 0) {
                            this.f60461c = c9684j2;
                        }
                        this.f60464f = q11 + 1;
                    } else if (c11 == '\"') {
                        this.f60461c = c9684j7;
                        this.f60464f = q11 + 1;
                    } else if (c11 == '\'') {
                        this.f60461c = c9684j6;
                        this.f60464f = q11 + 1;
                    } else if (c11 == '/') {
                        long j13 = 2 + q11;
                        interfaceC9683i.r1(j13);
                        long j14 = q11 + 1;
                        byte o12 = c9681g.o(j14);
                        if (o12 == ((byte) 47)) {
                            this.f60461c = c9684j8;
                            this.f60464f = j13;
                        } else if (o12 == ((byte) 42)) {
                            this.f60461c = c9684j5;
                            this.f60464f = j13;
                        } else {
                            this.f60464f = j14;
                        }
                    } else if (c11 == '#') {
                        this.f60461c = c9684j8;
                        this.f60464f = q11 + 1;
                    }
                } else if (c9684j3 == c9684j6 || c9684j3 == c9684j7) {
                    if (o11 == ((byte) 92)) {
                        long j15 = q11 + 2;
                        interfaceC9683i.r1(j15);
                        this.f60464f = j15;
                    } else {
                        if (this.f60462d > 0) {
                            c9684j2 = c9684j4;
                        }
                        this.f60461c = c9684j2;
                        this.f60464f = q11 + 1;
                    }
                } else if (c9684j3 == c9684j5) {
                    long j16 = 2 + q11;
                    interfaceC9683i.r1(j16);
                    long j17 = q11 + 1;
                    if (c9681g.o(j17) == ((byte) 47)) {
                        this.f60464f = j16;
                        this.f60461c = c9684j4;
                    } else {
                        this.f60464f = j17;
                    }
                } else {
                    if (c9684j3 != c9684j8) {
                        throw new AssertionError();
                    }
                    this.f60464f = q11 + 1;
                    this.f60461c = c9684j4;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f60465g = true;
    }

    public final void o() {
        this.f60465g = true;
        while (this.f60461c != f60457m) {
            m(8192L);
            this.f60459a.skip(this.f60464f);
        }
    }

    @Override // sf.M
    public final long read(@NotNull C9681g sink, long j11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f60465g) {
            throw new IllegalStateException("closed");
        }
        if (j11 == 0) {
            return 0L;
        }
        C9681g c9681g = this.f60460b;
        boolean m11 = c9681g.m();
        C9681g c9681g2 = this.f60463e;
        if (!m11) {
            long read = c9681g.read(sink, j11);
            long j12 = j11 - read;
            if (!c9681g2.m()) {
                long read2 = read(sink, j12);
                if (read2 != -1) {
                    return read2 + read;
                }
            }
            return read;
        }
        m(j11);
        long j13 = this.f60464f;
        if (j13 == 0) {
            if (this.f60461c == f60457m) {
                return -1L;
            }
            throw new AssertionError();
        }
        long min = Math.min(j11, j13);
        sink.z0(c9681g2, min);
        this.f60464f -= min;
        return min;
    }

    @Override // sf.M
    @NotNull
    public final N timeout() {
        return this.f60459a.timeout();
    }
}
