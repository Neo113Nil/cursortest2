package o2;

import H1.InterfaceC1184q;
import ai.verisoul.sdk.helpers.webview.VerisoulWebViewImplKt;
import e1.Q;
import e1.Z;
import kotlin.UByte;

/* renamed from: o2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5774A {

    /* renamed from: c, reason: collision with root package name */
    public boolean f58902c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f58903d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f58904e;

    /* renamed from: a, reason: collision with root package name */
    public final Q f58900a = new Q(0);

    /* renamed from: f, reason: collision with root package name */
    public long f58905f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f58906g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f58907h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final e1.J f58901b = new e1.J();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(e1.J j10) {
        int g10 = j10.g();
        if (j10.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        j10.q(bArr, 0, 9);
        j10.b0(g10);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    public static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((b10 & 56) >> 3) << 30) | ((b10 & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((b11 & 248) >> 3) << 15) | ((b11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final int b(InterfaceC1184q interfaceC1184q) {
        this.f58901b.Y(Z.EMPTY_BYTE_ARRAY);
        this.f58902c = true;
        interfaceC1184q.g();
        return 0;
    }

    public long c() {
        return this.f58907h;
    }

    public Q d() {
        return this.f58900a;
    }

    public boolean e() {
        return this.f58902c;
    }

    public final int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }

    public int g(InterfaceC1184q interfaceC1184q, H1.I i10) {
        if (!this.f58904e) {
            return j(interfaceC1184q, i10);
        }
        if (this.f58906g == -9223372036854775807L) {
            return b(interfaceC1184q);
        }
        if (!this.f58903d) {
            return h(interfaceC1184q, i10);
        }
        long j10 = this.f58905f;
        if (j10 == -9223372036854775807L) {
            return b(interfaceC1184q);
        }
        this.f58907h = this.f58900a.c(this.f58906g) - this.f58900a.b(j10);
        return b(interfaceC1184q);
    }

    public final int h(InterfaceC1184q interfaceC1184q, H1.I i10) {
        int min = (int) Math.min(VerisoulWebViewImplKt.WEBVIEW_TIMEOUT, interfaceC1184q.getLength());
        long j10 = 0;
        if (interfaceC1184q.getPosition() != j10) {
            i10.f4333a = j10;
            return 1;
        }
        this.f58901b.X(min);
        interfaceC1184q.g();
        interfaceC1184q.n(this.f58901b.f(), 0, min);
        this.f58905f = i(this.f58901b);
        this.f58903d = true;
        return 0;
    }

    public final long i(e1.J j10) {
        int j11 = j10.j();
        for (int g10 = j10.g(); g10 < j11 - 3; g10++) {
            if (f(j10.f(), g10) == 442) {
                j10.b0(g10 + 4);
                long l10 = l(j10);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(InterfaceC1184q interfaceC1184q, H1.I i10) {
        long length = interfaceC1184q.getLength();
        int min = (int) Math.min(VerisoulWebViewImplKt.WEBVIEW_TIMEOUT, length);
        long j10 = length - min;
        if (interfaceC1184q.getPosition() != j10) {
            i10.f4333a = j10;
            return 1;
        }
        this.f58901b.X(min);
        interfaceC1184q.g();
        interfaceC1184q.n(this.f58901b.f(), 0, min);
        this.f58906g = k(this.f58901b);
        this.f58904e = true;
        return 0;
    }

    public final long k(e1.J j10) {
        int g10 = j10.g();
        for (int j11 = j10.j() - 4; j11 >= g10; j11--) {
            if (f(j10.f(), j11) == 442) {
                j10.b0(j11 + 4);
                long l10 = l(j10);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }
}
