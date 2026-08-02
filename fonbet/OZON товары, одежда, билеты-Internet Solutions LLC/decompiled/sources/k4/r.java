package k4;

import N3.M;
import j3.C7272n;
import j3.InterfaceC7268j;
import j3.u;
import java.io.EOFException;
import java.io.IOException;
import k4.o;
import m3.C8050C;
import m3.InterfaceC8068j;
import m3.N;
import m3.s;

/* loaded from: classes8.dex */
final class r implements M {

    /* renamed from: a, reason: collision with root package name */
    private final M f70485a;

    /* renamed from: b, reason: collision with root package name */
    private final o.a f70486b;

    /* renamed from: g, reason: collision with root package name */
    private o f70491g;

    /* renamed from: h, reason: collision with root package name */
    private C7272n f70492h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f70493i;

    /* renamed from: d, reason: collision with root package name */
    private int f70488d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f70489e = 0;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f70490f = N.f74291c;

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f70487c = new C8050C();

    public r(M m11, o.a aVar) {
        this.f70485a = m11;
        this.f70486b = aVar;
    }

    public static void g(r rVar, long j11, int i11, c cVar) {
        G10.a.i(rVar.f70492h);
        byte[] a11 = b.a(cVar.f70453c, cVar.f70451a);
        C8050C c8050c = rVar.f70487c;
        c8050c.getClass();
        c8050c.P(a11.length, a11);
        rVar.f70485a.e(a11.length, c8050c);
        long j12 = cVar.f70452b;
        if (j12 == -9223372036854775807L) {
            G10.a.h(rVar.f70492h.f69132t == Long.MAX_VALUE);
        } else {
            long j13 = rVar.f70492h.f69132t;
            j11 = j13 == Long.MAX_VALUE ? j11 + j12 : j12 + j13;
        }
        long j14 = j11;
        rVar.f70485a.b(j14, i11 | 1, a11.length, 0, null);
    }

    private void h(int i11) {
        int length = this.f70490f.length;
        int i12 = this.f70489e;
        if (length - i12 >= i11) {
            return;
        }
        int i13 = i12 - this.f70488d;
        int max = Math.max(i13 * 2, i11 + i13);
        byte[] bArr = this.f70490f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f70488d, bArr2, 0, i13);
        this.f70488d = 0;
        this.f70489e = i13;
        this.f70490f = bArr2;
    }

    @Override // N3.M
    public final void a(C7272n c7272n) {
        c7272n.f69127o.getClass();
        String str = c7272n.f69127o;
        G10.a.c(u.h(str) == 3);
        boolean equals = c7272n.equals(this.f70492h);
        o.a aVar = this.f70486b;
        if (!equals) {
            this.f70492h = c7272n;
            this.f70491g = aVar.e(c7272n) ? aVar.b(c7272n) : null;
        }
        o oVar = this.f70491g;
        M m11 = this.f70485a;
        if (oVar == null) {
            m11.a(c7272n);
            return;
        }
        C7272n.a a11 = c7272n.a();
        a11.y0("application/x-media3-cues");
        a11.U(str);
        a11.C0(Long.MAX_VALUE);
        a11.Y(aVar.a(c7272n));
        m11.a(a11.P());
    }

    @Override // N3.M
    public final void b(final long j11, final int i11, int i12, int i13, M.a aVar) {
        if (this.f70491g == null) {
            this.f70485a.b(j11, i11, i12, i13, aVar);
            return;
        }
        G10.a.b("DRM on subtitles is not supported", aVar == null);
        int i14 = (this.f70489e - i13) - i12;
        try {
            this.f70491g.a(this.f70490f, i14, i12, o.b.b(), new InterfaceC8068j() { // from class: k4.q
                @Override // m3.InterfaceC8068j
                public final void accept(Object obj) {
                    r.g(r.this, j11, i11, (c) obj);
                }
            });
        } catch (RuntimeException e11) {
            if (!this.f70493i) {
                throw e11;
            }
            s.g("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e11);
        }
        int i15 = i14 + i12;
        this.f70488d = i15;
        if (i15 == this.f70489e) {
            this.f70488d = 0;
            this.f70489e = 0;
        }
    }

    @Override // N3.M
    public final int c(InterfaceC7268j interfaceC7268j, int i11, boolean z11) throws IOException {
        if (this.f70491g == null) {
            return this.f70485a.c(interfaceC7268j, i11, z11);
        }
        h(i11);
        int read = interfaceC7268j.read(this.f70490f, this.f70489e, i11);
        if (read != -1) {
            this.f70489e += read;
            return read;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // N3.M
    public final void f(C8050C c8050c, int i11, int i12) {
        if (this.f70491g == null) {
            this.f70485a.f(c8050c, i11, i12);
            return;
        }
        h(i11);
        c8050c.n(this.f70489e, i11, this.f70490f);
        this.f70489e += i11;
    }

    public final void i() {
        this.f70493i = true;
    }
}
