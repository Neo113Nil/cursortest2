package androidx.media3.exoplayer.source;

import D1.b;
import H1.O;
import androidx.media3.exoplayer.source.b0;
import b1.InterfaceC2358l;
import e1.AbstractC4134a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public class Z {

    /* renamed from: a, reason: collision with root package name */
    public final D1.b f21663a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21664b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.J f21665c;

    /* renamed from: d, reason: collision with root package name */
    public a f21666d;

    /* renamed from: e, reason: collision with root package name */
    public a f21667e;

    /* renamed from: f, reason: collision with root package name */
    public a f21668f;

    /* renamed from: g, reason: collision with root package name */
    public long f21669g;

    public static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f21670a;

        /* renamed from: b, reason: collision with root package name */
        public long f21671b;

        /* renamed from: c, reason: collision with root package name */
        public D1.a f21672c;

        /* renamed from: d, reason: collision with root package name */
        public a f21673d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // D1.b.a
        public D1.a a() {
            return (D1.a) AbstractC4134a.e(this.f21672c);
        }

        public a b() {
            this.f21672c = null;
            a aVar = this.f21673d;
            this.f21673d = null;
            return aVar;
        }

        public void c(D1.a aVar, a aVar2) {
            this.f21672c = aVar;
            this.f21673d = aVar2;
        }

        public void d(long j10, int i10) {
            AbstractC4134a.g(this.f21672c == null);
            this.f21670a = j10;
            this.f21671b = j10 + i10;
        }

        public int e(long j10) {
            return ((int) (j10 - this.f21670a)) + this.f21672c.f2334a;
        }

        @Override // D1.b.a
        public b.a next() {
            a aVar = this.f21673d;
            if (aVar == null || aVar.f21672c == null) {
                return null;
            }
            return aVar;
        }
    }

    public Z(D1.b bVar) {
        this.f21663a = bVar;
        int e10 = bVar.e();
        this.f21664b = e10;
        this.f21665c = new e1.J(32);
        a aVar = new a(0L, e10);
        this.f21666d = aVar;
        this.f21667e = aVar;
        this.f21668f = aVar;
    }

    public static a d(a aVar, long j10) {
        while (j10 >= aVar.f21671b) {
            aVar = aVar.f21673d;
        }
        return aVar;
    }

    public static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a d10 = d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (d10.f21671b - j10));
            byteBuffer.put(d10.f21672c.data, d10.e(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == d10.f21671b) {
                d10 = d10.f21673d;
            }
        }
        return d10;
    }

    public static a j(a aVar, long j10, byte[] bArr, int i10) {
        a d10 = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (d10.f21671b - j10));
            System.arraycopy(d10.f21672c.data, d10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == d10.f21671b) {
                d10 = d10.f21673d;
            }
        }
        return d10;
    }

    public static a k(a aVar, k1.f fVar, b0.b bVar, e1.J j10) {
        long j11 = bVar.f21709b;
        int i10 = 1;
        j10.X(1);
        a j12 = j(aVar, j11, j10.f(), 1);
        long j13 = j11 + 1;
        byte b10 = j10.f()[0];
        boolean z10 = (b10 & ByteCompanionObject.MIN_VALUE) != 0;
        int i11 = b10 & ByteCompanionObject.MAX_VALUE;
        k1.c cVar = fVar.f54107c;
        byte[] bArr = cVar.iv;
        if (bArr == null) {
            cVar.iv = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j14 = j(j12, j13, cVar.iv, i11);
        long j15 = j13 + i11;
        if (z10) {
            j10.X(2);
            j14 = j(j14, j15, j10.f(), 2);
            j15 += 2;
            i10 = j10.U();
        }
        int i12 = i10;
        int[] iArr = cVar.numBytesOfClearData;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            j10.X(i13);
            j14 = j(j14, j15, j10.f(), i13);
            j15 += i13;
            j10.b0(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = j10.U();
                iArr4[i14] = j10.Q();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f21708a - ((int) (j15 - bVar.f21709b));
        }
        O.a aVar2 = (O.a) e1.Z.i(bVar.f21710c);
        cVar.c(i12, iArr2, iArr4, aVar2.encryptionKey, cVar.iv, aVar2.f4350a, aVar2.f4351b, aVar2.f4352c);
        long j16 = bVar.f21709b;
        int i15 = (int) (j15 - j16);
        bVar.f21709b = j16 + i15;
        bVar.f21708a -= i15;
        return j14;
    }

    public static a l(a aVar, k1.f fVar, b0.b bVar, e1.J j10) {
        if (fVar.r()) {
            aVar = k(aVar, fVar, bVar, j10);
        }
        if (!fVar.h()) {
            fVar.p(bVar.f21708a);
            return i(aVar, bVar.f21709b, fVar.f54108d, bVar.f21708a);
        }
        j10.X(4);
        a j11 = j(aVar, bVar.f21709b, j10.f(), 4);
        int Q10 = j10.Q();
        bVar.f21709b += 4;
        bVar.f21708a -= 4;
        fVar.p(Q10);
        a i10 = i(j11, bVar.f21709b, fVar.f54108d, Q10);
        bVar.f21709b += Q10;
        int i11 = bVar.f21708a - Q10;
        bVar.f21708a = i11;
        fVar.t(i11);
        return i(i10, bVar.f21709b, fVar.f54111g, bVar.f21708a);
    }

    public final void a(a aVar) {
        if (aVar.f21672c == null) {
            return;
        }
        this.f21663a.b(aVar);
        aVar.b();
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f21666d;
            if (j10 < aVar.f21671b) {
                break;
            }
            this.f21663a.c(aVar.f21672c);
            this.f21666d = this.f21666d.b();
        }
        if (this.f21667e.f21670a < aVar.f21670a) {
            this.f21667e = aVar;
        }
    }

    public void c(long j10) {
        AbstractC4134a.a(j10 <= this.f21669g);
        this.f21669g = j10;
        if (j10 != 0) {
            a aVar = this.f21666d;
            if (j10 != aVar.f21670a) {
                while (this.f21669g > aVar.f21671b) {
                    aVar = aVar.f21673d;
                }
                a aVar2 = (a) AbstractC4134a.e(aVar.f21673d);
                a(aVar2);
                a aVar3 = new a(aVar.f21671b, this.f21664b);
                aVar.f21673d = aVar3;
                if (this.f21669g == aVar.f21671b) {
                    aVar = aVar3;
                }
                this.f21668f = aVar;
                if (this.f21667e == aVar2) {
                    this.f21667e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f21666d);
        a aVar4 = new a(this.f21669g, this.f21664b);
        this.f21666d = aVar4;
        this.f21667e = aVar4;
        this.f21668f = aVar4;
    }

    public long e() {
        return this.f21669g;
    }

    public void f(k1.f fVar, b0.b bVar) {
        l(this.f21667e, fVar, bVar, this.f21665c);
    }

    public final void g(int i10) {
        long j10 = this.f21669g + i10;
        this.f21669g = j10;
        a aVar = this.f21668f;
        if (j10 == aVar.f21671b) {
            this.f21668f = aVar.f21673d;
        }
    }

    public final int h(int i10) {
        a aVar = this.f21668f;
        if (aVar.f21672c == null) {
            aVar.c(this.f21663a.a(), new a(this.f21668f.f21671b, this.f21664b));
        }
        return Math.min(i10, (int) (this.f21668f.f21671b - this.f21669g));
    }

    public void m(k1.f fVar, b0.b bVar) {
        this.f21667e = l(this.f21667e, fVar, bVar, this.f21665c);
    }

    public void n() {
        a(this.f21666d);
        this.f21666d.d(0L, this.f21664b);
        a aVar = this.f21666d;
        this.f21667e = aVar;
        this.f21668f = aVar;
        this.f21669g = 0L;
        this.f21663a.d();
    }

    public void o() {
        this.f21667e = this.f21666d;
    }

    public int p(InterfaceC2358l interfaceC2358l, int i10, boolean z10) {
        int h10 = h(i10);
        a aVar = this.f21668f;
        int read = interfaceC2358l.read(aVar.f21672c.data, aVar.e(this.f21669g), h10);
        if (read != -1) {
            g(read);
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(e1.J j10, int i10) {
        while (i10 > 0) {
            int h10 = h(i10);
            a aVar = this.f21668f;
            j10.q(aVar.f21672c.data, aVar.e(this.f21669g), h10);
            i10 -= h10;
            g(h10);
        }
    }
}
