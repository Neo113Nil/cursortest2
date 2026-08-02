package J1;

import H1.InterfaceC1184q;
import H1.J;
import H1.K;
import H1.O;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f5908a;

    /* renamed from: b, reason: collision with root package name */
    public final O f5909b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5910c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5911d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5912e;

    /* renamed from: f, reason: collision with root package name */
    public int f5913f;

    /* renamed from: g, reason: collision with root package name */
    public int f5914g;

    /* renamed from: h, reason: collision with root package name */
    public int f5915h;

    /* renamed from: i, reason: collision with root package name */
    public int f5916i;

    /* renamed from: j, reason: collision with root package name */
    public int f5917j;

    /* renamed from: k, reason: collision with root package name */
    public int f5918k;
    private int[] keyFrameIndices;
    private long[] keyFrameOffsets;

    /* renamed from: l, reason: collision with root package name */
    public long f5919l;

    public e(int i10, d dVar, O o10) {
        this.f5908a = dVar;
        int b10 = dVar.b();
        boolean z10 = true;
        if (b10 != 1 && b10 != 2) {
            z10 = false;
        }
        AbstractC4134a.a(z10);
        this.f5910c = d(i10, b10 == 2 ? 1667497984 : 1651965952);
        this.f5912e = dVar.a();
        this.f5909b = o10;
        this.f5911d = b10 == 2 ? d(i10, 1650720768) : -1;
        this.f5919l = -1L;
        this.keyFrameOffsets = new long[512];
        this.keyFrameIndices = new int[512];
        this.f5913f = dVar.f5905e;
    }

    public static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    public void a() {
        this.f5916i++;
    }

    public void b(long j10, boolean z10) {
        if (this.f5919l == -1) {
            this.f5919l = j10;
        }
        if (z10) {
            if (this.f5918k == this.keyFrameIndices.length) {
                long[] jArr = this.keyFrameOffsets;
                this.keyFrameOffsets = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.keyFrameIndices;
                this.keyFrameIndices = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.keyFrameOffsets;
            int i10 = this.f5918k;
            jArr2[i10] = j10;
            this.keyFrameIndices[i10] = this.f5917j;
            this.f5918k = i10 + 1;
        }
        this.f5917j++;
    }

    public void c() {
        int i10;
        this.keyFrameOffsets = Arrays.copyOf(this.keyFrameOffsets, this.f5918k);
        this.keyFrameIndices = Arrays.copyOf(this.keyFrameIndices, this.f5918k);
        if (!k() || this.f5908a.f5907g == 0 || (i10 = this.f5918k) <= 0) {
            return;
        }
        this.f5913f = i10;
    }

    public final long e(int i10) {
        return (this.f5912e * i10) / this.f5913f;
    }

    public long f() {
        return e(this.f5916i);
    }

    public long g() {
        return e(1);
    }

    public final K h(int i10) {
        return new K(this.keyFrameIndices[i10] * g(), this.keyFrameOffsets[i10]);
    }

    public J.a i(long j10) {
        if (this.f5918k == 0) {
            return new J.a(new K(0L, this.f5919l));
        }
        int g10 = (int) (j10 / g());
        int g11 = Z.g(this.keyFrameIndices, g10, true, true);
        if (this.keyFrameIndices[g11] == g10) {
            return new J.a(h(g11));
        }
        K h10 = h(g11);
        int i10 = g11 + 1;
        return i10 < this.keyFrameOffsets.length ? new J.a(h10, h(i10)) : new J.a(h10);
    }

    public boolean j(int i10) {
        return this.f5910c == i10 || this.f5911d == i10;
    }

    public boolean k() {
        return (this.f5910c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.keyFrameIndices, this.f5916i) >= 0;
    }

    public boolean m(InterfaceC1184q interfaceC1184q) {
        int i10 = this.f5915h;
        int e10 = i10 - this.f5909b.e(interfaceC1184q, i10, false);
        this.f5915h = e10;
        boolean z10 = e10 == 0;
        if (z10) {
            if (this.f5914g > 0) {
                this.f5909b.g(f(), l() ? 1 : 0, this.f5914g, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f5914g = i10;
        this.f5915h = i10;
    }

    public void o(long j10) {
        if (this.f5918k == 0) {
            this.f5916i = 0;
        } else {
            this.f5916i = this.keyFrameIndices[Z.h(this.keyFrameOffsets, j10, true, true)];
        }
    }
}
