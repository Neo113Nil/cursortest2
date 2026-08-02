package b2;

import H1.AbstractC1170c;
import H1.AbstractC1173f;
import H1.B;
import H1.C1174g;
import H1.C1175h;
import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import H1.N;
import H1.O;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import b1.C2334C;
import b1.C2338G;
import com.google.common.collect.AbstractC3445z;
import com.plaid.internal.EnumC3631g;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.J;
import e1.Q;
import e1.Z;
import e2.s;
import f1.AbstractC4227e;
import f1.AbstractC4230h;
import f1.C4233k;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: b2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2378h implements InterfaceC1183p {

    /* renamed from: A, reason: collision with root package name */
    public long f24843A;

    /* renamed from: B, reason: collision with root package name */
    public long f24844B;

    /* renamed from: C, reason: collision with root package name */
    public b f24845C;

    /* renamed from: D, reason: collision with root package name */
    public int f24846D;

    /* renamed from: E, reason: collision with root package name */
    public int f24847E;

    /* renamed from: F, reason: collision with root package name */
    public int f24848F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f24849G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f24850H;

    /* renamed from: I, reason: collision with root package name */
    public H1.r f24851I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f24852J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f24853K;

    /* renamed from: L, reason: collision with root package name */
    public long f24854L;

    /* renamed from: a, reason: collision with root package name */
    public final s.a f24855a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24856b;

    /* renamed from: c, reason: collision with root package name */
    public final t f24857c;
    private O[] ceaTrackOutputs;

    /* renamed from: d, reason: collision with root package name */
    public final List f24858d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f24859e;
    private O[] emsgTrackOutputs;

    /* renamed from: f, reason: collision with root package name */
    public final J f24860f;

    /* renamed from: g, reason: collision with root package name */
    public final J f24861g;

    /* renamed from: h, reason: collision with root package name */
    public final J f24862h;

    /* renamed from: i, reason: collision with root package name */
    public final J f24863i;

    /* renamed from: j, reason: collision with root package name */
    public final Q f24864j;

    /* renamed from: k, reason: collision with root package name */
    public final S1.c f24865k;

    /* renamed from: l, reason: collision with root package name */
    public final J f24866l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f24867m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f24868n;

    /* renamed from: o, reason: collision with root package name */
    public final C4233k f24869o;

    /* renamed from: p, reason: collision with root package name */
    public final O f24870p;

    /* renamed from: q, reason: collision with root package name */
    public final C1175h f24871q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC3445z f24872r;

    /* renamed from: s, reason: collision with root package name */
    public int f24873s;
    private final byte[] scratchBytes;

    /* renamed from: t, reason: collision with root package name */
    public int f24874t;

    /* renamed from: u, reason: collision with root package name */
    public long f24875u;

    /* renamed from: v, reason: collision with root package name */
    public int f24876v;

    /* renamed from: w, reason: collision with root package name */
    public J f24877w;

    /* renamed from: x, reason: collision with root package name */
    public long f24878x;

    /* renamed from: y, reason: collision with root package name */
    public int f24879y;

    /* renamed from: z, reason: collision with root package name */
    public long f24880z;

    /* renamed from: M, reason: collision with root package name */
    public static final H1.u f24841M = new H1.u() { // from class: b2.f
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return C2378h.b();
        }
    };
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: N, reason: collision with root package name */
    public static final androidx.media3.common.a f24842N = new a.b().y0("application/x-emsg").P();

    /* renamed from: b2.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f24881a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24882b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24883c;

        public a(long j10, boolean z10, int i10) {
            this.f24881a = j10;
            this.f24882b = z10;
            this.f24883c = i10;
        }
    }

    /* renamed from: b2.h$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final O f24884a;

        /* renamed from: d, reason: collision with root package name */
        public w f24887d;

        /* renamed from: e, reason: collision with root package name */
        public C2373c f24888e;

        /* renamed from: f, reason: collision with root package name */
        public int f24889f;

        /* renamed from: g, reason: collision with root package name */
        public int f24890g;

        /* renamed from: h, reason: collision with root package name */
        public int f24891h;

        /* renamed from: i, reason: collision with root package name */
        public int f24892i;

        /* renamed from: j, reason: collision with root package name */
        public final androidx.media3.common.a f24893j;

        /* renamed from: m, reason: collision with root package name */
        public boolean f24896m;

        /* renamed from: b, reason: collision with root package name */
        public final v f24885b = new v();

        /* renamed from: c, reason: collision with root package name */
        public final J f24886c = new J();

        /* renamed from: k, reason: collision with root package name */
        public final J f24894k = new J(1);

        /* renamed from: l, reason: collision with root package name */
        public final J f24895l = new J();

        public b(O o10, w wVar, C2373c c2373c, androidx.media3.common.a aVar) {
            this.f24884a = o10;
            this.f24887d = wVar;
            this.f24888e = c2373c;
            this.f24893j = aVar;
            j(wVar, c2373c);
        }

        public int c() {
            int i10 = !this.f24896m ? this.f24887d.flags[this.f24889f] : this.f24885b.sampleIsSyncFrameTable[this.f24889f] ? 1 : 0;
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f24896m ? this.f24887d.offsets[this.f24889f] : this.f24885b.trunDataPosition[this.f24891h];
        }

        public long e() {
            return !this.f24896m ? this.f24887d.timestampsUs[this.f24889f] : this.f24885b.c(this.f24889f);
        }

        public int f() {
            return !this.f24896m ? this.f24887d.sizes[this.f24889f] : this.f24885b.sampleSizeTable[this.f24889f];
        }

        public u g() {
            if (!this.f24896m) {
                return null;
            }
            int i10 = ((C2373c) Z.i(this.f24885b.f24961a)).f24832a;
            u uVar = this.f24885b.f24968h;
            if (uVar == null) {
                uVar = this.f24887d.f24973a.b(i10);
            }
            if (uVar == null || !uVar.f24957a) {
                return null;
            }
            return uVar;
        }

        public boolean h() {
            this.f24889f++;
            if (!this.f24896m) {
                return false;
            }
            int i10 = this.f24890g + 1;
            this.f24890g = i10;
            int[] iArr = this.f24885b.trunLength;
            int i11 = this.f24891h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f24891h = i11 + 1;
            this.f24890g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            J j10;
            u g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i12 = g10.f24960d;
            if (i12 != 0) {
                j10 = this.f24885b.f24969i;
            } else {
                byte[] bArr = (byte[]) Z.i(g10.defaultInitializationVector);
                this.f24895l.Z(bArr, bArr.length);
                J j11 = this.f24895l;
                i12 = bArr.length;
                j10 = j11;
            }
            boolean g11 = this.f24885b.g(this.f24889f);
            boolean z10 = g11 || i11 != 0;
            this.f24894k.f()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f24894k.b0(0);
            this.f24884a.f(this.f24894k, 1, 1);
            this.f24884a.f(j10, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!g11) {
                this.f24886c.X(8);
                byte[] f10 = this.f24886c.f();
                f10[0] = 0;
                f10[1] = 1;
                f10[2] = (byte) ((i11 >> 8) & 255);
                f10[3] = (byte) (i11 & 255);
                f10[4] = (byte) ((i10 >> 24) & 255);
                f10[5] = (byte) ((i10 >> 16) & 255);
                f10[6] = (byte) ((i10 >> 8) & 255);
                f10[7] = (byte) (i10 & 255);
                this.f24884a.f(this.f24886c, 8, 1);
                return i12 + 9;
            }
            J j12 = this.f24885b.f24969i;
            int U10 = j12.U();
            j12.c0(-2);
            int i13 = (U10 * 6) + 2;
            if (i11 != 0) {
                this.f24886c.X(i13);
                byte[] f11 = this.f24886c.f();
                j12.q(f11, 0, i13);
                int i14 = (((f11[2] & UByte.MAX_VALUE) << 8) | (f11[3] & UByte.MAX_VALUE)) + i11;
                f11[2] = (byte) ((i14 >> 8) & 255);
                f11[3] = (byte) (i14 & 255);
                j12 = this.f24886c;
            }
            this.f24884a.f(j12, i13, 1);
            return i12 + 1 + i13;
        }

        public void j(w wVar, C2373c c2373c) {
            this.f24887d = wVar;
            this.f24888e = c2373c;
            this.f24884a.c(this.f24893j);
            k();
        }

        public void k() {
            this.f24885b.f();
            this.f24889f = 0;
            this.f24891h = 0;
            this.f24890g = 0;
            this.f24892i = 0;
            this.f24896m = false;
        }

        public void l(long j10) {
            int i10 = this.f24889f;
            while (true) {
                v vVar = this.f24885b;
                if (i10 >= vVar.f24966f || vVar.c(i10) > j10) {
                    return;
                }
                if (this.f24885b.sampleIsSyncFrameTable[i10]) {
                    this.f24892i = i10;
                }
                i10++;
            }
        }

        public void m() {
            u g10 = g();
            if (g10 == null) {
                return;
            }
            J j10 = this.f24885b.f24969i;
            int i10 = g10.f24960d;
            if (i10 != 0) {
                j10.c0(i10);
            }
            if (this.f24885b.g(this.f24889f)) {
                j10.c0(j10.U() * 6);
            }
        }

        public void n(DrmInitData drmInitData) {
            u b10 = this.f24887d.f24973a.b(((C2373c) Z.i(this.f24885b.f24961a)).f24832a);
            this.f24884a.c(this.f24893j.b().c0(drmInitData.e(b10 != null ? b10.f24958b : null)).P());
        }
    }

    public C2378h(s.a aVar, int i10) {
        this(aVar, i10, null, null, AbstractC3445z.t(), null);
    }

    public static long A(J j10) {
        j10.b0(8);
        return AbstractC2372b.q(j10.v()) == 0 ? j10.O() : j10.T();
    }

    public static void B(AbstractC4227e.b bVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = bVar.f46178d.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC4227e.b bVar2 = (AbstractC4227e.b) bVar.f46178d.get(i11);
            if (bVar2.f46175a == 1953653094) {
                K(bVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    public static void C(J j10, v vVar) {
        j10.b0(8);
        int v10 = j10.v();
        if ((AbstractC2372b.p(v10) & 1) == 1) {
            j10.c0(8);
        }
        int Q10 = j10.Q();
        if (Q10 == 1) {
            vVar.f24964d += AbstractC2372b.q(v10) == 0 ? j10.O() : j10.T();
        } else {
            throw C2338G.a("Unexpected saio entry count: " + Q10, null);
        }
    }

    public static void D(u uVar, J j10, v vVar) {
        int i10;
        int i11 = uVar.f24960d;
        j10.b0(8);
        if ((AbstractC2372b.p(j10.v()) & 1) == 1) {
            j10.c0(8);
        }
        int M10 = j10.M();
        int Q10 = j10.Q();
        if (Q10 > vVar.f24966f) {
            throw C2338G.a("Saiz sample count " + Q10 + " is greater than fragment sample count" + vVar.f24966f, null);
        }
        if (M10 == 0) {
            boolean[] zArr = vVar.sampleHasSubsampleEncryptionTable;
            i10 = 0;
            for (int i12 = 0; i12 < Q10; i12++) {
                int M11 = j10.M();
                i10 += M11;
                zArr[i12] = M11 > i11;
            }
        } else {
            i10 = M10 * Q10;
            Arrays.fill(vVar.sampleHasSubsampleEncryptionTable, 0, Q10, M10 > i11);
        }
        Arrays.fill(vVar.sampleHasSubsampleEncryptionTable, Q10, vVar.f24966f, false);
        if (i10 > 0) {
            vVar.d(i10);
        }
    }

    public static void E(AbstractC4227e.b bVar, String str, v vVar) {
        byte[] bArr = null;
        J j10 = null;
        J j11 = null;
        for (int i10 = 0; i10 < bVar.f46177c.size(); i10++) {
            AbstractC4227e.c cVar = (AbstractC4227e.c) bVar.f46177c.get(i10);
            J j12 = cVar.f46179b;
            int i11 = cVar.f46175a;
            if (i11 == 1935828848) {
                j12.b0(12);
                if (j12.v() == 1936025959) {
                    j10 = j12;
                }
            } else if (i11 == 1936158820) {
                j12.b0(12);
                if (j12.v() == 1936025959) {
                    j11 = j12;
                }
            }
        }
        if (j10 == null || j11 == null) {
            return;
        }
        j10.b0(8);
        int q10 = AbstractC2372b.q(j10.v());
        j10.c0(4);
        if (q10 == 1) {
            j10.c0(4);
        }
        if (j10.v() != 1) {
            throw C2338G.d("Entry count in sbgp != 1 (unsupported).");
        }
        j11.b0(8);
        int q11 = AbstractC2372b.q(j11.v());
        j11.c0(4);
        if (q11 == 1) {
            if (j11.O() == 0) {
                throw C2338G.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (q11 >= 2) {
            j11.c0(4);
        }
        if (j11.O() != 1) {
            throw C2338G.d("Entry count in sgpd != 1 (unsupported).");
        }
        j11.c0(1);
        int M10 = j11.M();
        int i12 = (M10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
        int i13 = M10 & 15;
        boolean z10 = j11.M() == 1;
        if (z10) {
            int M11 = j11.M();
            byte[] bArr2 = new byte[16];
            j11.q(bArr2, 0, 16);
            if (M11 == 0) {
                int M12 = j11.M();
                bArr = new byte[M12];
                j11.q(bArr, 0, M12);
            }
            vVar.f24967g = true;
            vVar.f24968h = new u(z10, str, M11, bArr2, i12, i13, bArr);
        }
    }

    public static void F(J j10, int i10, v vVar) {
        j10.b0(i10 + 8);
        int p10 = AbstractC2372b.p(j10.v());
        if ((p10 & 1) != 0) {
            throw C2338G.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (p10 & 2) != 0;
        int Q10 = j10.Q();
        if (Q10 == 0) {
            Arrays.fill(vVar.sampleHasSubsampleEncryptionTable, 0, vVar.f24966f, false);
            return;
        }
        if (Q10 == vVar.f24966f) {
            Arrays.fill(vVar.sampleHasSubsampleEncryptionTable, 0, Q10, z10);
            vVar.d(j10.a());
            vVar.b(j10);
        } else {
            throw C2338G.a("Senc sample count " + Q10 + " is different from fragment sample count" + vVar.f24966f, null);
        }
    }

    public static void G(J j10, v vVar) {
        F(j10, 0, vVar);
    }

    public static Pair H(J j10, long j11) {
        long T10;
        long T11;
        j10.b0(8);
        int q10 = AbstractC2372b.q(j10.v());
        j10.c0(4);
        long O10 = j10.O();
        if (q10 == 0) {
            T10 = j10.O();
            T11 = j10.O();
        } else {
            T10 = j10.T();
            T11 = j10.T();
        }
        long j12 = j11 + T11;
        long p12 = Z.p1(T10, 1000000L, O10);
        j10.c0(2);
        int U10 = j10.U();
        int[] iArr = new int[U10];
        long[] jArr = new long[U10];
        long[] jArr2 = new long[U10];
        long[] jArr3 = new long[U10];
        long j13 = j12;
        long j14 = p12;
        int i10 = 0;
        while (i10 < U10) {
            int v10 = j10.v();
            if ((Integer.MIN_VALUE & v10) != 0) {
                throw C2338G.a("Unhandled indirect reference", null);
            }
            long O11 = j10.O();
            iArr[i10] = v10 & Integer.MAX_VALUE;
            jArr[i10] = j13;
            jArr3[i10] = j14;
            T10 += O11;
            long[] jArr4 = jArr3;
            j14 = Z.p1(T10, 1000000L, O10);
            jArr2[i10] = j14 - jArr4[i10];
            j10.c0(4);
            j13 += iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(p12), new C1174g(iArr, jArr, jArr2, jArr3));
    }

    public static long I(J j10) {
        j10.b0(8);
        return AbstractC2372b.q(j10.v()) == 1 ? j10.T() : j10.O();
    }

    public static b J(J j10, SparseArray sparseArray, boolean z10) {
        j10.b0(8);
        int p10 = AbstractC2372b.p(j10.v());
        b bVar = (b) (z10 ? sparseArray.valueAt(0) : sparseArray.get(j10.v()));
        if (bVar == null) {
            return null;
        }
        if ((p10 & 1) != 0) {
            long T10 = j10.T();
            v vVar = bVar.f24885b;
            vVar.f24963c = T10;
            vVar.f24964d = T10;
        }
        C2373c c2373c = bVar.f24888e;
        bVar.f24885b.f24961a = new C2373c((p10 & 2) != 0 ? j10.v() - 1 : c2373c.f24832a, (p10 & 8) != 0 ? j10.v() : c2373c.f24833b, (p10 & 16) != 0 ? j10.v() : c2373c.f24834c, (p10 & 32) != 0 ? j10.v() : c2373c.f24835d);
        return bVar;
    }

    public static void K(AbstractC4227e.b bVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) {
        b J10 = J(((AbstractC4227e.c) AbstractC4134a.e(bVar.e(1952868452))).f46179b, sparseArray, z10);
        if (J10 == null) {
            return;
        }
        v vVar = J10.f24885b;
        long j10 = vVar.f24971k;
        boolean z11 = vVar.f24972l;
        J10.k();
        J10.f24896m = true;
        AbstractC4227e.c e10 = bVar.e(1952867444);
        if (e10 == null || (i10 & 2) != 0) {
            vVar.f24971k = j10;
            vVar.f24972l = z11;
        } else {
            vVar.f24971k = I(e10.f46179b);
            vVar.f24972l = true;
        }
        N(bVar, J10, i10);
        u b10 = J10.f24887d.f24973a.b(((C2373c) AbstractC4134a.e(vVar.f24961a)).f24832a);
        AbstractC4227e.c e11 = bVar.e(1935763834);
        if (e11 != null) {
            D((u) AbstractC4134a.e(b10), e11.f46179b, vVar);
        }
        AbstractC4227e.c e12 = bVar.e(1935763823);
        if (e12 != null) {
            C(e12.f46179b, vVar);
        }
        AbstractC4227e.c e13 = bVar.e(1936027235);
        if (e13 != null) {
            G(e13.f46179b, vVar);
        }
        E(bVar, b10 != null ? b10.f24958b : null, vVar);
        int size = bVar.f46177c.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC4227e.c cVar = (AbstractC4227e.c) bVar.f46177c.get(i11);
            if (cVar.f46175a == 1970628964) {
                O(cVar.f46179b, vVar, bArr);
            }
        }
    }

    public static Pair L(J j10) {
        j10.b0(12);
        return Pair.create(Integer.valueOf(j10.v()), new C2373c(j10.v() - 1, j10.v(), j10.v(), j10.v()));
    }

    public static int M(b bVar, int i10, int i11, J j10, int i12) {
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        j10.b0(8);
        int p10 = AbstractC2372b.p(j10.v());
        t tVar = bVar.f24887d.f24973a;
        v vVar = bVar.f24885b;
        C2373c c2373c = (C2373c) Z.i(vVar.f24961a);
        vVar.trunLength[i10] = j10.Q();
        long[] jArr = vVar.trunDataPosition;
        long j11 = vVar.f24963c;
        jArr[i10] = j11;
        if ((p10 & 1) != 0) {
            jArr[i10] = j11 + j10.v();
        }
        boolean z11 = (p10 & 4) != 0;
        int i20 = c2373c.f24835d;
        if (z11) {
            i20 = j10.v();
        }
        boolean z12 = (p10 & 256) != 0;
        boolean z13 = (p10 & 512) != 0;
        boolean z14 = (p10 & 1024) != 0;
        boolean z15 = (p10 & 2048) != 0;
        long j12 = r(tVar) ? ((long[]) Z.i(tVar.editListMediaTimes))[0] : 0L;
        int[] iArr = vVar.sampleSizeTable;
        long[] jArr2 = vVar.samplePresentationTimesUs;
        boolean[] zArr = vVar.sampleIsSyncFrameTable;
        boolean z16 = z15;
        boolean z17 = tVar.f24949b == 2 && (i11 & 1) != 0;
        int i21 = i12 + vVar.trunLength[i10];
        boolean z18 = z11;
        long j13 = tVar.f24950c;
        long j14 = vVar.f24971k;
        int i22 = i12;
        while (i22 < i21) {
            if (z12) {
                i13 = j10.v();
                z10 = z17;
            } else {
                z10 = z17;
                i13 = c2373c.f24833b;
            }
            int h10 = h(i13);
            if (z13) {
                i15 = j10.v();
                i14 = i21;
            } else {
                i14 = i21;
                i15 = c2373c.f24834c;
            }
            int h11 = h(i15);
            if (z14) {
                i16 = h11;
                i17 = j10.v();
            } else if (i22 == 0 && z18) {
                i16 = h11;
                i17 = i20;
            } else {
                i16 = h11;
                i17 = c2373c.f24835d;
            }
            if (z16) {
                i18 = i17;
                i19 = j10.v();
            } else {
                i18 = i17;
                i19 = 0;
            }
            int i23 = i22;
            long p12 = Z.p1((i19 + j14) - j12, 1000000L, j13);
            jArr2[i23] = p12;
            if (!vVar.f24972l) {
                jArr2[i23] = p12 + bVar.f24887d.f24976d;
            }
            iArr[i23] = i16;
            zArr[i23] = ((i18 >> 16) & 1) == 0 && (!z10 || i23 == 0);
            j14 += h10;
            i22 = i23 + 1;
            i21 = i14;
            z17 = z10;
        }
        int i24 = i21;
        vVar.f24971k = j14;
        return i24;
    }

    public static void N(AbstractC4227e.b bVar, b bVar2, int i10) {
        List list = bVar.f46177c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC4227e.c cVar = (AbstractC4227e.c) list.get(i13);
            if (cVar.f46175a == 1953658222) {
                J j10 = cVar.f46179b;
                j10.b0(12);
                int Q10 = j10.Q();
                if (Q10 > 0) {
                    i12 += Q10;
                    i11++;
                }
            }
        }
        bVar2.f24891h = 0;
        bVar2.f24890g = 0;
        bVar2.f24889f = 0;
        bVar2.f24885b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            AbstractC4227e.c cVar2 = (AbstractC4227e.c) list.get(i16);
            if (cVar2.f46175a == 1953658222) {
                i15 = M(bVar2, i14, i10, cVar2.f46179b, i15);
                i14++;
            }
        }
    }

    public static void O(J j10, v vVar, byte[] bArr) {
        j10.b0(8);
        j10.q(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            F(j10, 16, vVar);
        }
    }

    private void P(long j10) {
        while (!this.f24867m.isEmpty() && ((AbstractC4227e.b) this.f24867m.peek()).f46176b == j10) {
            u((AbstractC4227e.b) this.f24867m.pop());
        }
        l();
    }

    private boolean Q(InterfaceC1184q interfaceC1184q) {
        if (this.f24876v == 0) {
            if (!interfaceC1184q.h(this.f24866l.f(), 0, 8, true)) {
                return false;
            }
            this.f24876v = 8;
            this.f24866l.b0(0);
            this.f24875u = this.f24866l.O();
            this.f24874t = this.f24866l.v();
        }
        long j10 = this.f24875u;
        if (j10 == 1) {
            interfaceC1184q.readFully(this.f24866l.f(), 8, 8);
            this.f24876v += 8;
            this.f24875u = this.f24866l.T();
        } else if (j10 == 0) {
            long length = interfaceC1184q.getLength();
            if (length == -1 && !this.f24867m.isEmpty()) {
                length = ((AbstractC4227e.b) this.f24867m.peek()).f46176b;
            }
            if (length != -1) {
                this.f24875u = (length - interfaceC1184q.getPosition()) + this.f24876v;
            }
        }
        long j11 = this.f24875u;
        int i10 = this.f24876v;
        if (j11 < i10) {
            throw C2338G.d("Atom size less than header length (unsupported).");
        }
        if (this.f24854L != -1) {
            if (this.f24874t == 1936286840) {
                this.f24863i.X((int) j11);
                System.arraycopy(this.f24866l.f(), 0, this.f24863i.f(), 0, 8);
                interfaceC1184q.readFully(this.f24863i.f(), 8, (int) (this.f24875u - this.f24876v));
                this.f24871q.a((C1174g) H(new AbstractC4227e.c(1936286840, this.f24863i).f46179b, interfaceC1184q.i()).second);
            } else {
                interfaceC1184q.d((int) (j11 - i10), true);
            }
            l();
            return true;
        }
        long position = interfaceC1184q.getPosition() - this.f24876v;
        int i11 = this.f24874t;
        if ((i11 == 1836019558 || i11 == 1835295092) && !this.f24852J) {
            this.f24851I.q(new J.b(this.f24843A, position));
            this.f24852J = true;
        }
        if (this.f24874t == 1836019558) {
            int size = this.f24859e.size();
            for (int i12 = 0; i12 < size; i12++) {
                v vVar = ((b) this.f24859e.valueAt(i12)).f24885b;
                vVar.f24962b = position;
                vVar.f24964d = position;
                vVar.f24963c = position;
            }
        }
        int i13 = this.f24874t;
        if (i13 == 1835295092) {
            this.f24845C = null;
            this.f24878x = position + this.f24875u;
            this.f24873s = 2;
            return true;
        }
        if (U(i13)) {
            long position2 = interfaceC1184q.getPosition();
            long j12 = this.f24875u;
            long j13 = (position2 + j12) - 8;
            if (j12 != this.f24876v && this.f24874t == 1835365473) {
                s(interfaceC1184q);
            }
            this.f24867m.push(new AbstractC4227e.b(this.f24874t, j13));
            if (this.f24875u == this.f24876v) {
                P(j13);
            } else {
                l();
            }
        } else if (V(this.f24874t)) {
            if (this.f24876v != 8) {
                throw C2338G.d("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f24875u > 2147483647L) {
                throw C2338G.d("Leaf atom with length > 2147483647 (unsupported).");
            }
            e1.J j14 = new e1.J((int) this.f24875u);
            System.arraycopy(this.f24866l.f(), 0, j14.f(), 0, 8);
            this.f24877w = j14;
            this.f24873s = 1;
        } else {
            if (this.f24875u > 2147483647L) {
                throw C2338G.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f24877w = null;
            this.f24873s = 1;
        }
        return true;
    }

    private static boolean U(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean V(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new C2378h(s.a.f45617a, 32)};
    }

    private boolean e(androidx.media3.common.a aVar) {
        return Objects.equals(aVar.f20543o, "video/avc") ? (this.f24856b & 64) != 0 : Objects.equals(aVar.f20543o, "video/hevc") && (this.f24856b & 128) != 0;
    }

    public static int h(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw C2338G.a("Unexpected negative value: " + i10, null);
    }

    public static int i(int i10) {
        int i11 = (i10 & 1) != 0 ? 64 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void l() {
        this.f24873s = 0;
        this.f24876v = 0;
    }

    public static DrmInitData n(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC4227e.c cVar = (AbstractC4227e.c) list.get(i10);
            if (cVar.f46175a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] f10 = cVar.f46179b.f();
                UUID f11 = p.f(f10);
                if (f11 == null) {
                    AbstractC4156x.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(f11, "video/mp4", f10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    public static b o(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = LongCompanionObject.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f24896m || bVar2.f24889f != bVar2.f24887d.f24974b) && (!bVar2.f24896m || bVar2.f24891h != bVar2.f24885b.f24965e)) {
                long d10 = bVar2.d();
                if (d10 < j10) {
                    bVar = bVar2;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    public static boolean r(t tVar) {
        long[] jArr = tVar.editListDurations;
        if (jArr != null && jArr.length == 1 && tVar.editListMediaTimes != null) {
            long j10 = jArr[0];
            if (j10 == 0 || Z.p1(j10, 1000000L, tVar.f24951d) + Z.p1(tVar.editListMediaTimes[0], 1000000L, tVar.f24950c) >= tVar.f24952e) {
                return true;
            }
        }
        return false;
    }

    private void s(InterfaceC1184q interfaceC1184q) {
        this.f24863i.X(8);
        interfaceC1184q.n(this.f24863i.f(), 0, 8);
        AbstractC2372b.g(this.f24863i);
        interfaceC1184q.l(this.f24863i.g());
        interfaceC1184q.g();
    }

    public final void R(InterfaceC1184q interfaceC1184q) {
        int i10 = (int) (this.f24875u - this.f24876v);
        e1.J j10 = this.f24877w;
        if (j10 != null) {
            interfaceC1184q.readFully(j10.f(), 8, i10);
            w(new AbstractC4227e.c(this.f24874t, j10), interfaceC1184q);
        } else {
            interfaceC1184q.l(i10);
        }
        P(interfaceC1184q.getPosition());
    }

    public final void S(InterfaceC1184q interfaceC1184q) {
        int size = this.f24859e.size();
        long j10 = LongCompanionObject.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = ((b) this.f24859e.valueAt(i10)).f24885b;
            if (vVar.f24970j) {
                long j11 = vVar.f24964d;
                if (j11 < j10) {
                    bVar = (b) this.f24859e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f24873s = 3;
            return;
        }
        int position = (int) (j10 - interfaceC1184q.getPosition());
        if (position < 0) {
            throw C2338G.a("Offset to encryption data was negative.", null);
        }
        interfaceC1184q.l(position);
        bVar.f24885b.a(interfaceC1184q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0110, code lost:
    
        if ((r5.f24956i + r14) <= (r16.f24846D - r16.f24847E)) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T(InterfaceC1184q interfaceC1184q) {
        int e10;
        int o10;
        b bVar = this.f24845C;
        if (bVar == null) {
            bVar = o(this.f24859e);
            if (bVar == null) {
                int position = (int) (this.f24878x - interfaceC1184q.getPosition());
                if (position < 0) {
                    throw C2338G.a("Offset to end of mdat was negative.", null);
                }
                interfaceC1184q.l(position);
                l();
                return false;
            }
            int d10 = (int) (bVar.d() - interfaceC1184q.getPosition());
            if (d10 < 0) {
                AbstractC4156x.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d10 = 0;
            }
            interfaceC1184q.l(d10);
            this.f24845C = bVar;
        }
        if (this.f24873s == 3) {
            this.f24846D = bVar.f();
            this.f24849G = !e(bVar.f24887d.f24973a.f24954g);
            if (bVar.f24889f < bVar.f24892i) {
                interfaceC1184q.l(this.f24846D);
                bVar.m();
                if (!bVar.h()) {
                    this.f24845C = null;
                }
                this.f24873s = 3;
                return true;
            }
            if (bVar.f24887d.f24973a.f24955h == 1) {
                this.f24846D -= 8;
                interfaceC1184q.l(8);
            }
            if ("audio/ac4".equals(bVar.f24887d.f24973a.f24954g.f20543o)) {
                this.f24847E = bVar.i(this.f24846D, 7);
                AbstractC1170c.b(this.f24846D, this.f24863i);
                bVar.f24884a.a(this.f24863i, 7);
                this.f24847E += 7;
            } else {
                this.f24847E = bVar.i(this.f24846D, 0);
            }
            this.f24846D += this.f24847E;
            this.f24873s = 4;
            this.f24848F = 0;
        }
        t tVar = bVar.f24887d.f24973a;
        O o11 = bVar.f24884a;
        long e11 = bVar.e();
        Q q10 = this.f24864j;
        if (q10 != null) {
            e11 = q10.a(e11);
        }
        if (tVar.f24956i == 0) {
            while (true) {
                int i10 = this.f24847E;
                int i11 = this.f24846D;
                if (i10 >= i11) {
                    break;
                }
                this.f24847E += o11.e(interfaceC1184q, i11 - i10, false);
            }
        } else {
            byte[] f10 = this.f24861g.f();
            f10[0] = 0;
            f10[1] = 0;
            f10[2] = 0;
            int i12 = 4 - tVar.f24956i;
            while (this.f24847E < this.f24846D) {
                int i13 = this.f24848F;
                if (i13 == 0) {
                    if (this.ceaTrackOutputs.length > 0 || !this.f24849G) {
                        o10 = AbstractC4230h.o(tVar.f24954g);
                    }
                    o10 = 0;
                    interfaceC1184q.readFully(f10, i12, tVar.f24956i + o10);
                    this.f24861g.b0(0);
                    int v10 = this.f24861g.v();
                    if (v10 < 0) {
                        throw C2338G.a("Invalid NAL length", null);
                    }
                    this.f24848F = v10 - o10;
                    this.f24860f.b0(0);
                    o11.a(this.f24860f, 4);
                    this.f24847E += 4;
                    this.f24846D += i12;
                    this.f24850H = this.ceaTrackOutputs.length > 0 && o10 > 0 && AbstractC4230h.n(tVar.f24954g, f10[4]);
                    o11.a(this.f24861g, o10);
                    this.f24847E += o10;
                    if (o10 > 0 && !this.f24849G && AbstractC4230h.k(f10, 4, o10, tVar.f24954g)) {
                        this.f24849G = true;
                    }
                } else {
                    if (this.f24850H) {
                        this.f24862h.X(i13);
                        interfaceC1184q.readFully(this.f24862h.f(), 0, this.f24848F);
                        o11.a(this.f24862h, this.f24848F);
                        e10 = this.f24848F;
                        int L10 = AbstractC4230h.L(this.f24862h.f(), this.f24862h.j());
                        this.f24862h.b0(0);
                        this.f24862h.a0(L10);
                        if (tVar.f24954g.f20545q != -1) {
                            int f11 = this.f24869o.f();
                            int i14 = tVar.f24954g.f20545q;
                            if (f11 != i14) {
                                this.f24869o.g(i14);
                            }
                        } else if (this.f24869o.f() != 0) {
                            this.f24869o.g(0);
                        }
                        this.f24869o.a(e11, this.f24862h);
                        if ((bVar.c() & 4) != 0) {
                            this.f24869o.d();
                        }
                    } else {
                        e10 = o11.e(interfaceC1184q, i13, false);
                    }
                    this.f24847E += e10;
                    this.f24848F -= e10;
                }
            }
        }
        int c10 = bVar.c();
        if (!this.f24849G) {
            c10 |= AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        }
        int i15 = c10;
        u g10 = bVar.g();
        o11.g(e11, i15, this.f24846D, 0, g10 != null ? g10.f24959c : null);
        z(e11);
        if (!bVar.h()) {
            this.f24845C = null;
        }
        this.f24873s = 3;
        return true;
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        int size = this.f24859e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f24859e.valueAt(i10)).k();
        }
        this.f24868n.clear();
        this.f24879y = 0;
        this.f24869o.b();
        this.f24880z = j11;
        this.f24867m.clear();
        l();
    }

    @Override // H1.InterfaceC1183p
    public void c(H1.r rVar) {
        if ((this.f24856b & 32) == 0) {
            rVar = new e2.t(rVar, this.f24855a);
        }
        this.f24851I = rVar;
        l();
        q();
        t tVar = this.f24857c;
        if (tVar != null) {
            a.b b10 = tVar.f24954g.b();
            b10.W(AbstractC2381k.a(this.f24857c.f24954g));
            this.f24859e.put(0, new b(this.f24851I.c(0, this.f24857c.f24949b), new w(this.f24857c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C2373c(0, 0, 0, 0), b10.P()));
            this.f24851I.s();
        }
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        while (true) {
            int i11 = this.f24873s;
            if (i11 != 0) {
                if (i11 == 1) {
                    R(interfaceC1184q);
                } else if (i11 == 2) {
                    S(interfaceC1184q);
                } else if (T(interfaceC1184q)) {
                    return 0;
                }
            } else if (!Q(interfaceC1184q)) {
                long j10 = this.f24854L;
                if (j10 == -1) {
                    this.f24869o.d();
                    return -1;
                }
                i10.f4333a = j10;
                this.f24854L = -1L;
                this.f24851I.q(this.f24871q.b());
                this.f24853K = true;
                return 1;
            }
        }
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        N b10 = s.b(interfaceC1184q);
        this.f24872r = b10 != null ? AbstractC3445z.u(b10) : AbstractC3445z.t();
        return b10 == null;
    }

    public final C2373c m(SparseArray sparseArray, int i10) {
        return sparseArray.size() == 1 ? (C2373c) sparseArray.valueAt(0) : (C2373c) AbstractC4134a.e((C2373c) sparseArray.get(i10));
    }

    @Override // H1.InterfaceC1183p
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC3445z k() {
        return this.f24872r;
    }

    public final void q() {
        int i10;
        O[] oArr = new O[2];
        this.emsgTrackOutputs = oArr;
        O o10 = this.f24870p;
        int i11 = 0;
        if (o10 != null) {
            oArr[0] = o10;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f24856b & 4) != 0) {
            oArr[i10] = this.f24851I.c(100, 5);
            i12 = 101;
            i10++;
        }
        O[] oArr2 = (O[]) Z.g1(this.emsgTrackOutputs, i10);
        this.emsgTrackOutputs = oArr2;
        for (O o11 : oArr2) {
            o11.c(f24842N);
        }
        this.ceaTrackOutputs = new O[this.f24858d.size()];
        while (i11 < this.ceaTrackOutputs.length) {
            O c10 = this.f24851I.c(i12, 3);
            c10.c((androidx.media3.common.a) this.f24858d.get(i11));
            this.ceaTrackOutputs[i11] = c10;
            i11++;
            i12++;
        }
    }

    public final void u(AbstractC4227e.b bVar) {
        int i10 = bVar.f46175a;
        if (i10 == 1836019574) {
            y(bVar);
        } else if (i10 == 1836019558) {
            x(bVar);
        } else {
            if (this.f24867m.isEmpty()) {
                return;
            }
            ((AbstractC4227e.b) this.f24867m.peek()).b(bVar);
        }
    }

    public final void v(e1.J j10) {
        String str;
        String str2;
        long p12;
        long p13;
        long O10;
        long j11;
        if (this.emsgTrackOutputs.length == 0) {
            return;
        }
        j10.b0(8);
        int q10 = AbstractC2372b.q(j10.v());
        if (q10 == 0) {
            str = (String) AbstractC4134a.e(j10.G());
            str2 = (String) AbstractC4134a.e(j10.G());
            long O11 = j10.O();
            p12 = Z.p1(j10.O(), 1000000L, O11);
            long j12 = this.f24844B;
            long j13 = j12 != -9223372036854775807L ? j12 + p12 : -9223372036854775807L;
            p13 = Z.p1(j10.O(), 1000L, O11);
            O10 = j10.O();
            j11 = j13;
        } else {
            if (q10 != 1) {
                AbstractC4156x.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + q10);
                return;
            }
            long O12 = j10.O();
            j11 = Z.p1(j10.T(), 1000000L, O12);
            long p14 = Z.p1(j10.O(), 1000L, O12);
            long O13 = j10.O();
            str = (String) AbstractC4134a.e(j10.G());
            str2 = (String) AbstractC4134a.e(j10.G());
            p13 = p14;
            O10 = O13;
            p12 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[j10.a()];
        j10.q(bArr, 0, j10.a());
        e1.J j14 = new e1.J(this.f24865k.a(new S1.a(str3, str4, p13, O10, bArr)));
        int a10 = j14.a();
        for (O o10 : this.emsgTrackOutputs) {
            j14.b0(0);
            o10.a(j14, a10);
        }
        if (j11 == -9223372036854775807L) {
            this.f24868n.addLast(new a(p12, true, a10));
            this.f24879y += a10;
            return;
        }
        if (!this.f24868n.isEmpty()) {
            this.f24868n.addLast(new a(j11, false, a10));
            this.f24879y += a10;
            return;
        }
        Q q11 = this.f24864j;
        if (q11 != null && !q11.g()) {
            this.f24868n.addLast(new a(j11, false, a10));
            this.f24879y += a10;
            return;
        }
        Q q12 = this.f24864j;
        if (q12 != null) {
            j11 = q12.a(j11);
        }
        long j15 = j11;
        for (O o11 : this.emsgTrackOutputs) {
            o11.g(j15, 1, a10, 0, null);
        }
    }

    public final void w(AbstractC4227e.c cVar, InterfaceC1184q interfaceC1184q) {
        if (!this.f24867m.isEmpty()) {
            ((AbstractC4227e.b) this.f24867m.peek()).c(cVar);
            return;
        }
        int i10 = cVar.f46175a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                v(cVar.f46179b);
                return;
            }
            return;
        }
        Pair H10 = H(cVar.f46179b, interfaceC1184q.getPosition());
        this.f24871q.a((C1174g) H10.second);
        if (!this.f24852J) {
            this.f24844B = ((Long) H10.first).longValue();
            this.f24851I.q((H1.J) H10.second);
            this.f24852J = true;
        } else {
            if ((this.f24856b & 256) == 0 || this.f24853K || this.f24871q.c() <= 1) {
                return;
            }
            this.f24854L = interfaceC1184q.getPosition();
        }
    }

    public final void x(AbstractC4227e.b bVar) {
        B(bVar, this.f24859e, this.f24857c != null, this.f24856b, this.scratchBytes);
        DrmInitData n10 = n(bVar.f46177c);
        if (n10 != null) {
            int size = this.f24859e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f24859e.valueAt(i10)).n(n10);
            }
        }
        if (this.f24880z != -9223372036854775807L) {
            int size2 = this.f24859e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f24859e.valueAt(i11)).l(this.f24880z);
            }
            this.f24880z = -9223372036854775807L;
        }
    }

    public final void y(AbstractC4227e.b bVar) {
        long j10;
        boolean z10;
        int i10 = 0;
        AbstractC4134a.h(this.f24857c == null, "Unexpected moov box.");
        DrmInitData n10 = n(bVar.f46177c);
        AbstractC4227e.b bVar2 = (AbstractC4227e.b) AbstractC4134a.e(bVar.d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = bVar2.f46177c.size();
        long j11 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC4227e.c cVar = (AbstractC4227e.c) bVar2.f46177c.get(i11);
            int i12 = cVar.f46175a;
            if (i12 == 1953654136) {
                Pair L10 = L(cVar.f46179b);
                sparseArray.put(((Integer) L10.first).intValue(), (C2373c) L10.second);
            } else if (i12 == 1835362404) {
                j11 = A(cVar.f46179b);
            }
        }
        AbstractC4227e.b d10 = bVar.d(1835365473);
        C2334C c2334c = null;
        C2334C u10 = d10 != null ? AbstractC2372b.u(d10) : null;
        B b10 = new B();
        AbstractC4227e.c e10 = bVar.e(1969517665);
        if (e10 != null) {
            c2334c = AbstractC2372b.I(e10);
            b10.c(c2334c);
        }
        C2334C c2334c2 = c2334c;
        C2334C c2334c3 = new C2334C(AbstractC2372b.w(((AbstractC4227e.c) AbstractC4134a.e(bVar.e(1836476516))).f46179b));
        if ((this.f24856b & 16) != 0) {
            j10 = j11;
            z10 = true;
        } else {
            j10 = j11;
            z10 = false;
        }
        List H10 = AbstractC2372b.H(bVar, b10, j10, n10, z10, false, new Ra.f() { // from class: b2.e
            @Override // Ra.f
            public final Object apply(Object obj) {
                return C2378h.this.t((t) obj);
            }
        });
        int size2 = H10.size();
        if (this.f24859e.size() != 0) {
            AbstractC4134a.g(this.f24859e.size() == size2);
            while (i10 < size2) {
                w wVar = (w) H10.get(i10);
                t tVar = wVar.f24973a;
                ((b) this.f24859e.get(tVar.f24948a)).j(wVar, m(sparseArray, tVar.f24948a));
                i10++;
            }
            return;
        }
        String b11 = AbstractC2381k.b(H10);
        while (i10 < size2) {
            w wVar2 = (w) H10.get(i10);
            t tVar2 = wVar2.f24973a;
            O c10 = this.f24851I.c(i10, tVar2.f24949b);
            c10.d(tVar2.f24952e);
            a.b b12 = tVar2.f24954g.b();
            b12.W(b11);
            AbstractC2380j.l(tVar2.f24949b, b10, b12);
            AbstractC2380j.m(tVar2.f24949b, u10, b12, tVar2.f24954g.f20540l, c2334c2, c2334c3);
            this.f24859e.put(tVar2.f24948a, new b(c10, wVar2, m(sparseArray, tVar2.f24948a), b12.P()));
            this.f24843A = Math.max(this.f24843A, tVar2.f24952e);
            i10++;
            b10 = b10;
        }
        this.f24851I.s();
    }

    public final void z(long j10) {
        while (!this.f24868n.isEmpty()) {
            a aVar = (a) this.f24868n.removeFirst();
            this.f24879y -= aVar.f24883c;
            long j11 = aVar.f24881a;
            if (aVar.f24882b) {
                j11 += j10;
            }
            Q q10 = this.f24864j;
            if (q10 != null) {
                j11 = q10.a(j11);
            }
            long j12 = j11;
            for (O o10 : this.emsgTrackOutputs) {
                o10.g(j12, 1, aVar.f24883c, this.f24879y, null);
            }
        }
    }

    public C2378h(s.a aVar, int i10, Q q10, t tVar, List list, O o10) {
        this.f24855a = aVar;
        this.f24856b = i10;
        this.f24864j = q10;
        this.f24857c = tVar;
        this.f24858d = Collections.unmodifiableList(list);
        this.f24870p = o10;
        this.f24865k = new S1.c();
        this.f24866l = new e1.J(16);
        this.f24860f = new e1.J(AbstractC4230h.NAL_START_CODE);
        this.f24861g = new e1.J(6);
        this.f24862h = new e1.J();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.f24863i = new e1.J(bArr);
        this.f24867m = new ArrayDeque();
        this.f24868n = new ArrayDeque();
        this.f24859e = new SparseArray();
        this.f24872r = AbstractC3445z.t();
        this.f24843A = -9223372036854775807L;
        this.f24880z = -9223372036854775807L;
        this.f24844B = -9223372036854775807L;
        this.f24851I = H1.r.f4477Q;
        this.emsgTrackOutputs = new O[0];
        this.ceaTrackOutputs = new O[0];
        this.f24869o = new C4233k(new C4233k.b() { // from class: b2.g
            @Override // f1.C4233k.b
            public final void a(long j10, e1.J j11) {
                AbstractC1173f.a(j10, j11, C2378h.this.ceaTrackOutputs);
            }
        });
        this.f24871q = new C1175h();
        this.f24854L = -1L;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }

    public t t(t tVar) {
        return tVar;
    }
}
