package t2;

import android.util.SparseArray;
import b1.AbstractC2335D;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import f1.AbstractC4230h;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import l1.AbstractC5366l;
import r2.C6198a;
import r2.C6200c;
import r2.InterfaceC6199b;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: u, reason: collision with root package name */
    public static final long f65066u = e1.Z.a1(500);

    /* renamed from: a, reason: collision with root package name */
    public final String f65067a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6199b.a f65068b;

    /* renamed from: c, reason: collision with root package name */
    public final b f65069c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65070d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f65071e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.a f65072f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f65073g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f65074h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f65075i;

    /* renamed from: j, reason: collision with root package name */
    public int f65076j;

    /* renamed from: k, reason: collision with root package name */
    public long f65077k;

    /* renamed from: l, reason: collision with root package name */
    public long f65078l;

    /* renamed from: m, reason: collision with root package name */
    public long f65079m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC6199b f65080n;

    /* renamed from: o, reason: collision with root package name */
    public int f65081o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65082p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f65083q;

    /* renamed from: r, reason: collision with root package name */
    public long f65084r;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f65085s;

    /* renamed from: t, reason: collision with root package name */
    public volatile int f65086t;

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public interface b {
        void a(int i10, androidx.media3.common.a aVar, int i11, int i12);

        void c();

        void e(long j10, long j11);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.a f65087a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65088b;

        /* renamed from: c, reason: collision with root package name */
        public long f65089c;

        /* renamed from: d, reason: collision with root package name */
        public long f65090d;

        /* renamed from: e, reason: collision with root package name */
        public int f65091e;

        /* renamed from: f, reason: collision with root package name */
        public long f65092f;

        public c(androidx.media3.common.a aVar, int i10) {
            this.f65087a = aVar;
            this.f65088b = i10;
        }

        public int a() {
            long j10 = this.f65092f;
            if (j10 <= 0) {
                return -2147483647;
            }
            long j11 = this.f65090d;
            if (j11 <= 0) {
                return -2147483647;
            }
            long j12 = this.f65089c;
            if (j10 == j12) {
                return -2147483647;
            }
            return (int) e1.Z.p1(j11, 8000000L, j10 - j12);
        }
    }

    public I0(String str, InterfaceC6199b.a aVar, b bVar, int i10, boolean z10, androidx.media3.common.a aVar2, boolean z11) {
        this.f65067a = str;
        this.f65068b = aVar;
        this.f65069c = bVar;
        boolean z12 = false;
        AbstractC4134a.a(i10 == 0 || i10 == 1);
        this.f65081o = i10;
        this.f65070d = z10;
        this.f65073g = z11;
        if ((i10 == 0 && aVar2 == null) || (i10 == 1 && aVar2 != null)) {
            z12 = true;
        }
        AbstractC4134a.b(z12, "appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.");
        this.f65072f = aVar2;
        this.f65071e = new SparseArray();
        this.f65076j = -2;
        this.f65084r = -9223372036854775807L;
        this.f65078l = LongCompanionObject.MAX_VALUE;
    }

    public static List h(androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        if (aVar.f(aVar2)) {
            return aVar.f20546r;
        }
        if (!Objects.equals(aVar2.f20543o, "video/avc") || !Objects.equals(aVar.f20543o, "video/avc") || aVar2.f20546r.size() != 2 || aVar.f20546r.size() != 2 || !Arrays.equals((byte[]) aVar2.f20546r.get(1), (byte[]) aVar.f20546r.get(1))) {
            return null;
        }
        int i10 = 0;
        byte[] bArr = (byte[]) aVar2.f20546r.get(0);
        byte[] bArr2 = (byte[]) aVar.f20546r.get(0);
        int length = AbstractC4230h.NAL_START_CODE.length + 3;
        if (length >= bArr.length || bArr.length != bArr2.length) {
            return null;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (i11 != length && bArr[i11] != bArr2[i11]) {
                return null;
            }
        }
        while (true) {
            byte[] bArr3 = AbstractC4230h.NAL_START_CODE;
            if (i10 >= bArr3.length) {
                if ((bArr[bArr3.length] & 31) == 7 && bArr[bArr3.length + 1] != 0) {
                    return bArr2[length] >= bArr[length] ? aVar.f20546r : aVar2.f20546r;
                }
                return null;
            }
            if (bArr[i10] != bArr3[i10]) {
                return null;
            }
            i10++;
        }
    }

    public static c j(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        c cVar = (c) sparseArray.valueAt(0);
        for (int i10 = 1; i10 < sparseArray.size(); i10++) {
            c cVar2 = (c) sparseArray.valueAt(i10);
            if (cVar2.f65092f < cVar.f65092f) {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    public void a(androidx.media3.common.a aVar) {
        String str = aVar.f20543o;
        int k10 = AbstractC2335D.k(str);
        AbstractC4134a.b(k10 == 1 || k10 == 2, "Unsupported track format: " + str);
        if (k10 == 2) {
            aVar = aVar.b().x0((aVar.f20513A + this.f65085s) % 360).P();
            if (this.f65081o == 1) {
                List h10 = h(aVar, (androidx.media3.common.a) AbstractC4134a.e(this.f65072f));
                if (h10 == null) {
                    throw new a("Switching to MUXER_MODE_APPEND will fail.");
                }
                aVar = aVar.b().k0(h10).P();
            }
        }
        if (this.f65081o != 2) {
            int i10 = this.f65086t;
            AbstractC4134a.h(i10 > 0, "The track count should be set before the formats are added.");
            AbstractC4134a.h(this.f65071e.size() < i10, "All track formats have already been added.");
            AbstractC4134a.h(!e1.Z.q(this.f65071e, k10), "There is already a track of type " + k10);
            e();
            this.f65071e.put(k10, new c(aVar, this.f65080n.I1(aVar)));
            AbstractC5366l.f("Muxer", "InputFormat", -9223372036854775807L, "%s:%s", e1.Z.z0(k10), aVar);
            if (aVar.f20540l != null) {
                for (int i11 = 0; i11 < aVar.f20540l.e(); i11++) {
                    this.f65080n.H(aVar.f20540l.d(i11));
                }
            }
            if (this.f65071e.size() == i10) {
                this.f65074h = true;
                return;
            }
            return;
        }
        if (k10 != 2) {
            if (k10 == 1) {
                AbstractC4134a.g(e1.Z.q(this.f65071e, 1));
                androidx.media3.common.a aVar2 = ((c) this.f65071e.get(1)).f65087a;
                if (!Objects.equals(aVar2.f20543o, aVar.f20543o)) {
                    throw new a("Audio format mismatch - sampleMimeType: " + aVar2.f20543o + " != " + aVar.f20543o);
                }
                if (aVar2.f20518F != aVar.f20518F) {
                    throw new a("Audio format mismatch - channelCount: " + aVar2.f20518F + " != " + aVar.f20518F);
                }
                if (aVar2.f20519G == aVar.f20519G) {
                    if (!aVar2.f(aVar)) {
                        throw new a("Audio format mismatch - initializationData.");
                    }
                    return;
                }
                throw new a("Audio format mismatch - sampleRate: " + aVar2.f20519G + " != " + aVar.f20519G);
            }
            return;
        }
        AbstractC4134a.g(e1.Z.q(this.f65071e, 2));
        androidx.media3.common.a aVar3 = ((c) this.f65071e.get(2)).f65087a;
        if (!Objects.equals(aVar3.f20543o, aVar.f20543o)) {
            throw new a("Video format mismatch - sampleMimeType: " + aVar3.f20543o + " != " + aVar.f20543o);
        }
        if (aVar3.f20550v != aVar.f20550v) {
            throw new a("Video format mismatch - width: " + aVar3.f20550v + " != " + aVar.f20550v);
        }
        if (aVar3.f20551w != aVar.f20551w) {
            throw new a("Video format mismatch - height: " + aVar3.f20551w + " != " + aVar.f20551w);
        }
        if (aVar3.f20513A == aVar.f20513A) {
            if (!aVar.f((androidx.media3.common.a) AbstractC4134a.e(this.f65072f))) {
                throw new a("The initialization data of the newly added track format doesn't match appendVideoFormat.");
            }
            return;
        }
        throw new a("Video format mismatch - rotationDegrees: " + aVar3.f20513A + " != " + aVar.f20513A);
    }

    public final boolean b(int i10, long j10) {
        if ((this.f65070d && i10 != 2 && e1.Z.q(this.f65071e, 2) && this.f65084r == -9223372036854775807L) || !this.f65074h) {
            return false;
        }
        if (this.f65071e.size() == 1) {
            return true;
        }
        long j11 = j10 - ((c) this.f65071e.get(i10)).f65092f;
        long j12 = f65066u;
        if (j11 > j12 && AbstractC2335D.k(((c) AbstractC4134a.e(j(this.f65071e))).f65087a.f20543o) == i10) {
            return true;
        }
        if (i10 != this.f65076j) {
            this.f65077k = ((c) AbstractC4134a.e(j(this.f65071e))).f65092f;
        }
        return j10 - this.f65077k <= j12;
    }

    public void c() {
        AbstractC4134a.g(this.f65081o == 1);
        this.f65081o = 2;
    }

    public void d(int i10) {
        if (this.f65074h && e1.Z.q(this.f65071e, i10)) {
            c cVar = (c) this.f65071e.get(i10);
            this.f65078l = Math.max(0L, Math.min(this.f65078l, cVar.f65089c));
            this.f65079m = Math.max(this.f65079m, cVar.f65092f);
            this.f65069c.a(i10, cVar.f65087a, cVar.a(), cVar.f65091e);
            AbstractC5366l.f("Muxer", "InputEnded", cVar.f65092f, "%s", e1.Z.z0(i10));
            if (this.f65081o != 1) {
                this.f65071e.delete(i10);
                if (this.f65071e.size() == 0) {
                    this.f65075i = true;
                    AbstractC5366l.e("Muxer", "OutputEnded", this.f65079m);
                }
            } else if (i10 == 2) {
                this.f65082p = true;
            } else if (i10 == 1) {
                this.f65083q = true;
            }
            long J12 = e1.Z.J1(this.f65079m - this.f65078l);
            if (this.f65081o == 1 && this.f65082p && (this.f65083q || this.f65086t == 1)) {
                this.f65069c.e(J12, g());
            } else if (this.f65075i) {
                this.f65069c.e(J12, g());
            }
        }
    }

    public final void e() {
        if (this.f65080n == null) {
            this.f65080n = this.f65068b.c(this.f65067a);
        }
    }

    public void f(int i10) {
        if (i10 == 0 && this.f65081o == 1) {
            return;
        }
        this.f65074h = false;
        InterfaceC6199b interfaceC6199b = this.f65080n;
        if (interfaceC6199b != null) {
            try {
                interfaceC6199b.close();
            } catch (C6200c e10) {
                if (i10 != 1 || !((String) AbstractC4134a.e(e10.getMessage())).equals("Failed to stop the MediaMuxer")) {
                    throw e10;
                }
            }
        }
    }

    public final long g() {
        long length = new File(this.f65067a).length();
        if (length > 0) {
            return length;
        }
        return -1L;
    }

    public AbstractC3445z i(int i10) {
        return this.f65068b.a(i10);
    }

    public boolean k() {
        if (!this.f65075i) {
            if (this.f65081o != 1 || !this.f65082p) {
                return false;
            }
            if (!this.f65083q && this.f65086t != 1) {
                return false;
            }
        }
        return true;
    }

    public void l(int i10) {
        AbstractC4134a.h(this.f65071e.size() == 0 || this.f65085s == i10, "The additional rotation cannot be changed after adding track formats.");
        this.f65085s = i10;
    }

    public void m(int i10) {
        if (this.f65081o == 2) {
            return;
        }
        AbstractC4134a.h(this.f65071e.size() == 0, "The track count cannot be changed after adding track formats.");
        this.f65086t = i10;
    }

    public boolean n(String str) {
        return i(AbstractC2335D.k(str)).contains(str);
    }

    public boolean o(int i10, ByteBuffer byteBuffer, boolean z10, long j10) {
        long j11;
        long j12;
        AbstractC4134a.a(e1.Z.q(this.f65071e, i10));
        c cVar = (c) this.f65071e.get(i10);
        boolean b10 = b(i10, j10);
        AbstractC5366l.f("Muxer", "CanWriteSample", j10, "%s:%s", e1.Z.z0(i10), Boolean.valueOf(b10));
        if (i10 == 2) {
            if (this.f65084r == -9223372036854775807L) {
                this.f65084r = j10;
            }
        } else if (i10 == 1 && this.f65070d && e1.Z.q(this.f65071e, 2)) {
            long j13 = this.f65084r;
            if (j13 != -9223372036854775807L && j10 < j13) {
                this.f65069c.c();
                return true;
            }
        }
        if (!b10) {
            return false;
        }
        if (cVar.f65091e == 0) {
            if (i10 != 2 || !e1.Z.q(this.f65071e, 1) || this.f65070d || (this.f65073g && j10 <= 0)) {
                j12 = j10;
            } else {
                AbstractC4134a.g(this.f65084r != -9223372036854775807L);
                AbstractC4156x.i("MuxerWrapper", "Applying workarounds for edit list: shifting only the first video timestamp to zero.");
                j12 = 0;
            }
            cVar.f65089c = j12;
            j11 = j12;
        } else {
            j11 = j10;
        }
        cVar.f65091e++;
        cVar.f65090d += byteBuffer.remaining();
        cVar.f65092f = Math.max(cVar.f65092f, j11);
        this.f65069c.c();
        AbstractC4134a.i(this.f65080n);
        this.f65080n.L(cVar.f65088b, byteBuffer, new C6198a(j11, byteBuffer.remaining(), z10 ? 1 : 0));
        AbstractC5366l.f("Muxer", "AcceptedInput", j11, "%s", e1.Z.z0(i10));
        this.f65076j = i10;
        return true;
    }
}
