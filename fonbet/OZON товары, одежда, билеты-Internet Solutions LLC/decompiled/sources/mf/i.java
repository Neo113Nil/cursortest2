package mf;

import T7.E;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.C9684j;
import sf.InterfaceC9682h;

/* loaded from: classes10.dex */
public final class i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final C9681g f74819a;

    /* renamed from: b, reason: collision with root package name */
    private final C9681g f74820b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f74821c;

    /* renamed from: d, reason: collision with root package name */
    private C8138a f74822d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f74823e;

    /* renamed from: f, reason: collision with root package name */
    private final C9681g.a f74824f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f74825g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC9682h f74826h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Random f74827i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f74828j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f74829k;

    /* renamed from: l, reason: collision with root package name */
    private final long f74830l;

    public i(boolean z11, @NotNull InterfaceC9682h sink, @NotNull Random random, boolean z12, boolean z13, long j11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f74825g = z11;
        this.f74826h = sink;
        this.f74827i = random;
        this.f74828j = z12;
        this.f74829k = z13;
        this.f74830l = j11;
        this.f74819a = new C9681g();
        this.f74820b = sink.f();
        this.f74823e = z11 ? new byte[4] : null;
        this.f74824f = z11 ? new C9681g.a() : null;
    }

    private final void d(int i11, C9684j c9684j) throws IOException {
        if (this.f74821c) {
            throw new IOException("closed");
        }
        int g10 = c9684j.g();
        if (g10 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        int i12 = i11 | UserVerificationMethods.USER_VERIFY_PATTERN;
        C9681g c9681g = this.f74820b;
        c9681g.d0(i12);
        if (this.f74825g) {
            c9681g.d0(g10 | UserVerificationMethods.USER_VERIFY_PATTERN);
            byte[] bArr = this.f74823e;
            Intrinsics.f(bArr);
            this.f74827i.nextBytes(bArr);
            c9681g.Z(bArr);
            if (g10 > 0) {
                long size = c9681g.size();
                c9681g.X(c9684j);
                C9681g.a aVar = this.f74824f;
                Intrinsics.f(aVar);
                c9681g.t(aVar);
                aVar.d(size);
                g.a(aVar, bArr);
                aVar.close();
            }
        } else {
            c9681g.d0(g10);
            c9681g.X(c9684j);
        }
        this.f74826h.flush();
    }

    public final void c(int i11, C9684j c9684j) throws IOException {
        C9684j c9684j2 = C9684j.f98719d;
        if (i11 != 0 || c9684j != null) {
            if (i11 != 0) {
                String a11 = (i11 < 1000 || i11 >= 5000) ? Ej.b.a(i11, "Code must be in range [1000,5000): ") : ((1004 > i11 || 1006 < i11) && (1015 > i11 || 2999 < i11)) ? null : E.a(i11, "Code ", " is reserved and may not be used.");
                if (a11 != null) {
                    throw new IllegalArgumentException(a11.toString());
                }
            }
            C9681g c9681g = new C9681g();
            c9681g.u0(i11);
            if (c9684j != null) {
                c9681g.X(c9684j);
            }
            c9684j2 = c9681g.v0();
        }
        try {
            d(8, c9684j2);
        } finally {
            this.f74821c = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C8138a c8138a = this.f74822d;
        if (c8138a != null) {
            c8138a.close();
        }
    }

    public final void j(int i11, @NotNull C9684j data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f74821c) {
            throw new IOException("closed");
        }
        C9681g c9681g = this.f74819a;
        c9681g.X(data);
        int i12 = i11 | UserVerificationMethods.USER_VERIFY_PATTERN;
        if (this.f74828j && data.g() >= this.f74830l) {
            C8138a c8138a = this.f74822d;
            if (c8138a == null) {
                c8138a = new C8138a(this.f74829k);
                this.f74822d = c8138a;
            }
            c8138a.c(c9681g);
            i12 = i11 | 192;
        }
        long size = c9681g.size();
        C9681g c9681g2 = this.f74820b;
        c9681g2.d0(i12);
        boolean z11 = this.f74825g;
        int i13 = z11 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0;
        if (size <= 125) {
            c9681g2.d0(i13 | ((int) size));
        } else if (size <= 65535) {
            c9681g2.d0(i13 | 126);
            c9681g2.u0((int) size);
        } else {
            c9681g2.d0(i13 | 127);
            c9681g2.s0(size);
        }
        if (z11) {
            byte[] bArr = this.f74823e;
            Intrinsics.f(bArr);
            this.f74827i.nextBytes(bArr);
            c9681g2.Z(bArr);
            if (size > 0) {
                C9681g.a aVar = this.f74824f;
                Intrinsics.f(aVar);
                c9681g.t(aVar);
                aVar.d(0L);
                g.a(aVar, bArr);
                aVar.close();
            }
        }
        c9681g2.z0(c9681g, size);
        this.f74826h.P0();
    }

    public final void k(@NotNull C9684j payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        d(9, payload);
    }

    public final void m(@NotNull C9684j payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        d(10, payload);
    }
}
