package i4;

import N3.C3659j;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import m3.C8050C;

/* loaded from: classes8.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f65817a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f65818b = new C8050C(0, new byte[65025]);

    /* renamed from: c, reason: collision with root package name */
    private int f65819c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f65820d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f65821e;

    e() {
    }

    private int a(int i11) {
        int i12;
        int i13 = 0;
        this.f65820d = 0;
        do {
            int i14 = this.f65820d;
            int i15 = i11 + i14;
            f fVar = this.f65817a;
            if (i15 >= fVar.f65824c) {
                break;
            }
            int[] iArr = fVar.f65827f;
            this.f65820d = i14 + 1;
            i12 = iArr[i14 + i11];
            i13 += i12;
        } while (i12 == 255);
        return i13;
    }

    public final f b() {
        return this.f65817a;
    }

    public final C8050C c() {
        return this.f65818b;
    }

    public final boolean d(C3659j c3659j) throws IOException {
        int i11;
        G10.a.h(c3659j != null);
        boolean z11 = this.f65821e;
        C8050C c8050c = this.f65818b;
        if (z11) {
            this.f65821e = false;
            c8050c.O(0);
        }
        while (!this.f65821e) {
            int i12 = this.f65819c;
            f fVar = this.f65817a;
            if (i12 < 0) {
                if (fVar.b(c3659j, -1L) && fVar.a(c3659j, true)) {
                    int i13 = fVar.f65825d;
                    if ((fVar.f65822a & 1) == 1 && c8050c.i() == 0) {
                        i13 += a(0);
                        i11 = this.f65820d;
                    } else {
                        i11 = 0;
                    }
                    try {
                        c3659j.m(i13, false);
                        this.f65819c = i11;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a11 = a(this.f65819c);
            int i14 = this.f65819c + this.f65820d;
            if (a11 > 0) {
                c8050c.d(c8050c.i() + a11);
                c3659j.b(c8050c.e(), c8050c.i(), a11, false);
                c8050c.Q(c8050c.i() + a11);
                this.f65821e = fVar.f65827f[i14 + (-1)] != 255;
            }
            if (i14 == fVar.f65824c) {
                i14 = -1;
            }
            this.f65819c = i14;
        }
        return true;
    }

    public final void e() {
        f fVar = this.f65817a;
        fVar.f65822a = 0;
        fVar.f65823b = 0L;
        fVar.f65824c = 0;
        fVar.f65825d = 0;
        fVar.f65826e = 0;
        this.f65818b.O(0);
        this.f65819c = -1;
        this.f65821e = false;
    }

    public final void f() {
        C8050C c8050c = this.f65818b;
        if (c8050c.e().length == 65025) {
            return;
        }
        c8050c.P(c8050c.i(), Arrays.copyOf(c8050c.e(), Math.max(65025, c8050c.i())));
    }
}
