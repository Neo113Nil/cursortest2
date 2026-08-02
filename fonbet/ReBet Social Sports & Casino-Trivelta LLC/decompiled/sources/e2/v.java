package e2;

import H1.O;
import b1.AbstractC2335D;
import b1.InterfaceC2358l;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.InterfaceC4148o;
import e1.J;
import e1.Z;
import e2.s;
import java.io.EOFException;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class v implements O {

    /* renamed from: a, reason: collision with root package name */
    public final O f45628a;

    /* renamed from: b, reason: collision with root package name */
    public final s.a f45629b;

    /* renamed from: g, reason: collision with root package name */
    public s f45634g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.media3.common.a f45635h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45636i;

    /* renamed from: c, reason: collision with root package name */
    public final C4162d f45630c = new C4162d();

    /* renamed from: e, reason: collision with root package name */
    public int f45632e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f45633f = 0;
    private byte[] sampleData = Z.EMPTY_BYTE_ARRAY;

    /* renamed from: d, reason: collision with root package name */
    public final J f45631d = new J();

    public v(O o10, s.a aVar) {
        this.f45628a = o10;
        this.f45629b = aVar;
    }

    @Override // H1.O
    public int b(InterfaceC2358l interfaceC2358l, int i10, boolean z10, int i11) {
        if (this.f45634g == null) {
            return this.f45628a.b(interfaceC2358l, i10, z10, i11);
        }
        i(i10);
        int read = interfaceC2358l.read(this.sampleData, this.f45633f, i10);
        if (read != -1) {
            this.f45633f += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // H1.O
    public void c(androidx.media3.common.a aVar) {
        AbstractC4134a.e(aVar.f20543o);
        AbstractC4134a.a(AbstractC2335D.k(aVar.f20543o) == 3);
        if (!aVar.equals(this.f45635h)) {
            this.f45635h = aVar;
            this.f45634g = this.f45629b.a(aVar) ? this.f45629b.c(aVar) : null;
        }
        if (this.f45634g == null) {
            this.f45628a.c(aVar);
        } else {
            this.f45628a.c(aVar.b().y0("application/x-media3-cues").U(aVar.f20543o).C0(LongCompanionObject.MAX_VALUE).Y(this.f45629b.b(aVar)).P());
        }
    }

    @Override // H1.O
    public void f(J j10, int i10, int i11) {
        if (this.f45634g == null) {
            this.f45628a.f(j10, i10, i11);
            return;
        }
        i(i10);
        j10.q(this.sampleData, this.f45633f, i10);
        this.f45633f += i10;
    }

    @Override // H1.O
    public void g(final long j10, final int i10, int i11, int i12, O.a aVar) {
        if (this.f45634g == null) {
            this.f45628a.g(j10, i10, i11, i12, aVar);
            return;
        }
        AbstractC4134a.b(aVar == null, "DRM on subtitles is not supported");
        int i13 = (this.f45633f - i12) - i11;
        try {
            this.f45634g.a(this.sampleData, i13, i11, s.b.b(), new InterfaceC4148o() { // from class: e2.u
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    v.this.j((C4163e) obj, j10, i10);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.f45636i) {
                throw e10;
            }
            AbstractC4156x.j("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f45632e = i14;
        if (i14 == this.f45633f) {
            this.f45632e = 0;
            this.f45633f = 0;
        }
    }

    public final void i(int i10) {
        int length = this.sampleData.length;
        int i11 = this.f45633f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f45632e;
        int max = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.sampleData;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f45632e, bArr2, 0, i12);
        this.f45632e = 0;
        this.f45633f = i12;
        this.sampleData = bArr2;
    }

    public final void j(C4163e c4163e, long j10, int i10) {
        AbstractC4134a.i(this.f45635h);
        byte[] a10 = this.f45630c.a(c4163e.f45594a, c4163e.f45596c);
        this.f45631d.Y(a10);
        this.f45628a.a(this.f45631d, a10.length);
        long j11 = c4163e.f45595b;
        if (j11 == -9223372036854775807L) {
            AbstractC4134a.g(this.f45635h.f20548t == LongCompanionObject.MAX_VALUE);
        } else {
            long j12 = this.f45635h.f20548t;
            j10 = j12 == LongCompanionObject.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f45628a.g(j10, i10 | 1, a10.length, 0, null);
    }

    public void k(boolean z10) {
        this.f45636i = z10;
    }
}
