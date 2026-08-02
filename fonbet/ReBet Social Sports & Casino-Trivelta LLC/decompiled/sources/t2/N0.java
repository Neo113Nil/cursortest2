package t2;

import W1.c;
import b1.C2334C;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import f1.AbstractC4230h;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int f65098k = AbstractC4230h.NAL_START_CODE.length;

    /* renamed from: a, reason: collision with root package name */
    public final W1.c f65099a;

    /* renamed from: b, reason: collision with root package name */
    public final String f65100b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f65101c;

    /* renamed from: d, reason: collision with root package name */
    public final float f65102d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65103e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65104f;

    /* renamed from: g, reason: collision with root package name */
    public b f65105g;

    /* renamed from: h, reason: collision with root package name */
    public b f65106h;

    /* renamed from: i, reason: collision with root package name */
    public long f65107i;
    private final byte[] scratch = new byte[f65098k];

    /* renamed from: j, reason: collision with root package name */
    public long f65108j = -9223372036854775807L;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public float f65109a = -3.4028235E38f;

        /* renamed from: b, reason: collision with root package name */
        public int f65110b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f65111c = -1;

        /* renamed from: d, reason: collision with root package name */
        public W1.c f65112d;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f65113a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65114b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65115c;

        /* renamed from: d, reason: collision with root package name */
        public final int f65116d;

        public b(c.a aVar, int i10, int i11) {
            this.f65113a = e1.Z.a1(aVar.f12970a);
            this.f65114b = e1.Z.a1(aVar.f12971b);
            int i12 = aVar.f12972c;
            this.f65115c = i12;
            this.f65116d = a(i12, i10, i11);
        }

        public static int a(int i10, int i11, int i12) {
            int i13 = i10;
            while (true) {
                if (i13 <= 0) {
                    break;
                }
                if ((i13 & 1) == 1) {
                    AbstractC4134a.h((i13 >> 1) == 0, "Invalid speed divisor: " + i10);
                } else {
                    i12++;
                    i13 >>= 1;
                }
            }
            return Math.min(i12, i11);
        }
    }

    public N0(androidx.media3.common.a aVar) {
        a d10 = d(aVar.f20540l);
        W1.c cVar = d10.f65112d;
        this.f65099a = cVar;
        String str = (String) AbstractC4134a.e(aVar.f20543o);
        this.f65100b = str;
        if (cVar != null) {
            AbstractC4134a.b(str.equals("video/avc") || str.equals("video/hevc"), "Unsupported MIME type for SEF slow motion video track: " + str);
        }
        Iterator it = (cVar != null ? cVar.f12968a : AbstractC3445z.t()).iterator();
        this.f65101c = it;
        this.f65102d = d10.f65109a;
        int i10 = d10.f65110b;
        this.f65103e = i10;
        int i11 = d10.f65111c;
        this.f65104f = i11;
        this.f65106h = it.hasNext() ? new b((c.a) it.next(), i10, i11) : null;
    }

    public static a d(C2334C c2334c) {
        a aVar = new a();
        if (c2334c != null) {
            for (int i10 = 0; i10 < c2334c.e(); i10++) {
                C2334C.a d10 = c2334c.d(i10);
                if (d10 instanceof W1.d) {
                    W1.d dVar = (W1.d) d10;
                    aVar.f65109a = dVar.f12973a;
                    aVar.f65110b = dVar.f12974b - 1;
                } else if (d10 instanceof W1.c) {
                    aVar.f65112d = (W1.c) d10;
                }
            }
            if (aVar.f65112d != null) {
                AbstractC4134a.h(aVar.f65110b != -1, "SVC temporal layer count not found.");
                AbstractC4134a.h(aVar.f65109a != -3.4028235E38f, "Capture frame rate not found.");
                float f10 = aVar.f65109a;
                AbstractC4134a.h(f10 % 1.0f == 0.0f && f10 % 30.0f == 0.0f, "Invalid capture frame rate: " + aVar.f65109a);
                int i11 = ((int) aVar.f65109a) / 30;
                for (int i12 = aVar.f65110b; i12 >= 0; i12--) {
                    if ((i11 & 1) == 1) {
                        AbstractC4134a.h((i11 >> 1) == 0, "Could not compute normal speed max SVC layer for capture frame rate  " + aVar.f65109a);
                        aVar.f65111c = i12;
                        return aVar;
                    }
                    i11 >>= 1;
                }
            }
        }
        return aVar;
    }

    public boolean a(ByteBuffer byteBuffer, long j10) {
        int i10;
        if (this.f65099a == null) {
            this.f65108j = j10;
            return false;
        }
        int position = byteBuffer.position();
        byteBuffer.position(f65098k + position);
        byteBuffer.get(this.scratch, 0, 4);
        if (this.f65100b.equals("video/avc")) {
            byte[] bArr = this.scratch;
            AbstractC4134a.h((bArr[0] & 31) == 14 && (((bArr[1] & UByte.MAX_VALUE) >> 7) == 1), "Missing SVC extension prefix NAL unit.");
            i10 = (this.scratch[3] & UByte.MAX_VALUE) >> 5;
        } else {
            if (!this.f65100b.equals("video/hevc")) {
                throw new IllegalStateException();
            }
            i10 = (this.scratch[1] & 7) - 1;
        }
        boolean g10 = g(i10, j10);
        this.f65108j = c(j10);
        if (!g10) {
            return true;
        }
        byteBuffer.position(position);
        return false;
    }

    public final void b() {
        if (this.f65105g != null) {
            f();
        }
        this.f65105g = this.f65106h;
        this.f65106h = this.f65101c.hasNext() ? new b((c.a) this.f65101c.next(), this.f65103e, this.f65104f) : null;
    }

    public long c(long j10) {
        long j11 = this.f65107i + j10;
        b bVar = this.f65105g;
        if (bVar != null) {
            j11 += (j10 - bVar.f65113a) * (bVar.f65115c - 1);
        }
        return Math.round((j11 * 30) / this.f65102d);
    }

    public long e() {
        AbstractC4134a.g(this.f65108j != -9223372036854775807L);
        return this.f65108j;
    }

    public final void f() {
        long j10 = this.f65107i;
        b bVar = this.f65105g;
        this.f65107i = j10 + ((bVar.f65114b - bVar.f65113a) * (bVar.f65115c - 1));
        this.f65105g = null;
    }

    public boolean g(int i10, long j10) {
        b bVar;
        while (true) {
            bVar = this.f65106h;
            if (bVar == null || j10 < bVar.f65114b) {
                break;
            }
            b();
        }
        if (bVar == null || j10 < bVar.f65113a) {
            b bVar2 = this.f65105g;
            if (bVar2 != null && j10 >= bVar2.f65114b) {
                f();
            }
        } else {
            b();
        }
        b bVar3 = this.f65105g;
        return i10 <= (bVar3 != null ? bVar3.f65116d : this.f65104f) || h(i10, j10);
    }

    public final boolean h(int i10, long j10) {
        int i11;
        b bVar = this.f65106h;
        if (bVar != null && i10 < (i11 = bVar.f65116d)) {
            long j11 = ((bVar.f65113a - j10) * 30) / 1000000;
            float f10 = (-(1 << (this.f65103e - i11))) + 0.45f;
            for (int i12 = 1; i12 < this.f65106h.f65116d && j11 < (1 << (this.f65103e - i12)) + f10; i12++) {
                if (i10 <= i12) {
                    return true;
                }
            }
        }
        return false;
    }
}
