package i4;

import N3.C3659j;
import j3.v;
import java.io.EOFException;
import java.io.IOException;
import m3.C8050C;

/* loaded from: classes8.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f65822a;

    /* renamed from: b, reason: collision with root package name */
    public long f65823b;

    /* renamed from: c, reason: collision with root package name */
    public int f65824c;

    /* renamed from: d, reason: collision with root package name */
    public int f65825d;

    /* renamed from: e, reason: collision with root package name */
    public int f65826e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f65827f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    private final C8050C f65828g = new C8050C(255);

    f() {
    }

    public final boolean a(C3659j c3659j, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        this.f65822a = 0;
        this.f65823b = 0L;
        this.f65824c = 0;
        this.f65825d = 0;
        this.f65826e = 0;
        C8050C c8050c = this.f65828g;
        c8050c.O(27);
        try {
            z12 = c3659j.d(c8050c.e(), 0, 27, z11);
        } catch (EOFException e11) {
            if (!z11) {
                throw e11;
            }
            z12 = false;
        }
        if (z12 && c8050c.G() == 1332176723) {
            if (c8050c.E() == 0) {
                this.f65822a = c8050c.E();
                this.f65823b = c8050c.t();
                c8050c.v();
                c8050c.v();
                c8050c.v();
                int E11 = c8050c.E();
                this.f65824c = E11;
                this.f65825d = E11 + 27;
                c8050c.O(E11);
                try {
                    z13 = c3659j.d(c8050c.e(), 0, this.f65824c, z11);
                } catch (EOFException e12) {
                    if (!z11) {
                        throw e12;
                    }
                    z13 = false;
                }
                if (z13) {
                    for (int i11 = 0; i11 < this.f65824c; i11++) {
                        int E12 = c8050c.E();
                        this.f65827f[i11] = E12;
                        this.f65826e += E12;
                    }
                    return true;
                }
            } else if (!z11) {
                throw v.e("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(C3659j c3659j, long j11) throws IOException {
        boolean z11;
        G10.a.c(c3659j.getPosition() == c3659j.f());
        C8050C c8050c = this.f65828g;
        c8050c.O(4);
        while (true) {
            if (j11 != -1 && c3659j.getPosition() + 4 >= j11) {
                break;
            }
            try {
                z11 = c3659j.d(c8050c.e(), 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            c8050c.R(0);
            if (c8050c.G() == 1332176723) {
                c3659j.e();
                return true;
            }
            c3659j.m(1, false);
        }
        do {
            if (j11 != -1 && c3659j.getPosition() >= j11) {
                break;
            }
        } while (c3659j.c(1) != -1);
        return false;
    }
}
