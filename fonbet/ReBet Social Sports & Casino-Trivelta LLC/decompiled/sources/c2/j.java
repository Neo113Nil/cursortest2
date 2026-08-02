package c2;

import H1.S;
import androidx.media3.common.a;
import b1.C2338G;
import c2.i;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.J;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: n, reason: collision with root package name */
    public a f26901n;

    /* renamed from: o, reason: collision with root package name */
    public int f26902o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f26903p;

    /* renamed from: q, reason: collision with root package name */
    public S.c f26904q;

    /* renamed from: r, reason: collision with root package name */
    public S.a f26905r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final S.c f26906a;

        /* renamed from: b, reason: collision with root package name */
        public final S.a f26907b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26908c;
        public final S.b[] modes;
        public final byte[] setupHeaderData;

        public a(S.c cVar, S.a aVar, byte[] bArr, S.b[] bVarArr, int i10) {
            this.f26906a = cVar;
            this.f26907b = aVar;
            this.setupHeaderData = bArr;
            this.modes = bVarArr;
            this.f26908c = i10;
        }
    }

    public static void n(J j10, long j11) {
        if (j10.b() < j10.j() + 4) {
            j10.Y(Arrays.copyOf(j10.f(), j10.j() + 4));
        } else {
            j10.a0(j10.j() + 4);
        }
        byte[] f10 = j10.f();
        f10[j10.j() - 4] = (byte) (j11 & 255);
        f10[j10.j() - 3] = (byte) ((j11 >>> 8) & 255);
        f10[j10.j() - 2] = (byte) ((j11 >>> 16) & 255);
        f10[j10.j() - 1] = (byte) ((j11 >>> 24) & 255);
    }

    public static int o(byte b10, a aVar) {
        return !aVar.modes[p(b10, aVar.f26908c, 1)].f4364a ? aVar.f26906a.f4374g : aVar.f26906a.f4375h;
    }

    public static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(J j10) {
        try {
            return S.o(1, j10, true);
        } catch (C2338G unused) {
            return false;
        }
    }

    @Override // c2.i
    public void e(long j10) {
        super.e(j10);
        this.f26903p = j10 != 0;
        S.c cVar = this.f26904q;
        this.f26902o = cVar != null ? cVar.f4374g : 0;
    }

    @Override // c2.i
    public long f(J j10) {
        if ((j10.f()[0] & 1) == 1) {
            return -1L;
        }
        int o10 = o(j10.f()[0], (a) AbstractC4134a.i(this.f26901n));
        long j11 = this.f26903p ? (this.f26902o + o10) / 4 : 0;
        n(j10, j11);
        this.f26903p = true;
        this.f26902o = o10;
        return j11;
    }

    @Override // c2.i
    public boolean i(J j10, long j11, i.b bVar) {
        if (this.f26901n != null) {
            AbstractC4134a.e(bVar.f26899a);
            return false;
        }
        a q10 = q(j10);
        this.f26901n = q10;
        if (q10 == null) {
            return true;
        }
        S.c cVar = q10.f26906a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.data);
        arrayList.add(q10.setupHeaderData);
        bVar.f26899a = new a.b().W("audio/ogg").y0("audio/vorbis").S(cVar.f4372e).t0(cVar.f4371d).T(cVar.f4369b).z0(cVar.f4370c).k0(arrayList).r0(S.d(AbstractC3445z.q(q10.f26907b.comments))).P();
        return true;
    }

    @Override // c2.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f26901n = null;
            this.f26904q = null;
            this.f26905r = null;
        }
        this.f26902o = 0;
        this.f26903p = false;
    }

    public a q(J j10) {
        S.c cVar = this.f26904q;
        if (cVar == null) {
            this.f26904q = S.l(j10);
            return null;
        }
        S.a aVar = this.f26905r;
        if (aVar == null) {
            this.f26905r = S.j(j10);
            return null;
        }
        byte[] bArr = new byte[j10.j()];
        System.arraycopy(j10.f(), 0, bArr, 0, j10.j());
        return new a(cVar, aVar, bArr, S.m(j10, cVar.f4369b), S.b(r4.length - 1));
    }
}
