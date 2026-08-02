package r1;

import D1.k;
import D1.m;
import H1.C1181n;
import H1.O;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.source.B;
import androidx.media3.exoplayer.source.C2223y;
import androidx.media3.exoplayer.source.L;
import androidx.media3.exoplayer.source.b0;
import androidx.media3.exoplayer.source.c0;
import androidx.media3.exoplayer.source.d0;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.E;
import androidx.media3.exoplayer.trackselection.y;
import b1.AbstractC2335D;
import b1.C2334C;
import b1.C2338G;
import b1.InterfaceC2358l;
import b1.P;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.I;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.J;
import e1.Z;
import h1.C4428x;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m1.O0;
import m1.o1;
import q1.t;
import r1.f;
import r1.s;

/* loaded from: classes.dex */
public final class s implements m.b, m.f, d0, H1.r, b0.d {

    /* renamed from: Y, reason: collision with root package name */
    public static final Set f63851Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A, reason: collision with root package name */
    public boolean f63852A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f63853B;

    /* renamed from: C, reason: collision with root package name */
    public int f63854C;

    /* renamed from: D, reason: collision with root package name */
    public androidx.media3.common.a f63855D;

    /* renamed from: E, reason: collision with root package name */
    public androidx.media3.common.a f63856E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f63857F;

    /* renamed from: G, reason: collision with root package name */
    public m0 f63858G;

    /* renamed from: H, reason: collision with root package name */
    public Set f63859H;

    /* renamed from: I, reason: collision with root package name */
    public int f63860I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f63861J;

    /* renamed from: K, reason: collision with root package name */
    public long f63862K;

    /* renamed from: L, reason: collision with root package name */
    public long f63863L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f63864O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f63865P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f63866R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f63867T;

    /* renamed from: V, reason: collision with root package name */
    public long f63868V;

    /* renamed from: W, reason: collision with root package name */
    public DrmInitData f63869W;

    /* renamed from: X, reason: collision with root package name */
    public j f63870X;

    /* renamed from: a, reason: collision with root package name */
    public final String f63871a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63872b;

    /* renamed from: c, reason: collision with root package name */
    public final b f63873c;

    /* renamed from: d, reason: collision with root package name */
    public final f f63874d;

    /* renamed from: e, reason: collision with root package name */
    public final D1.b f63875e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.a f63876f;

    /* renamed from: g, reason: collision with root package name */
    public final q1.u f63877g;

    /* renamed from: h, reason: collision with root package name */
    public final t.a f63878h;

    /* renamed from: i, reason: collision with root package name */
    public final D1.k f63879i;

    /* renamed from: k, reason: collision with root package name */
    public final L.a f63881k;

    /* renamed from: l, reason: collision with root package name */
    public final int f63882l;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f63884n;

    /* renamed from: o, reason: collision with root package name */
    public final List f63885o;

    /* renamed from: p, reason: collision with root package name */
    public final Runnable f63886p;

    /* renamed from: q, reason: collision with root package name */
    public final Runnable f63887q;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f63888r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f63889s;
    private boolean[] sampleQueueIsAudioVideoFlags;
    private d[] sampleQueues;
    private boolean[] sampleQueuesEnabledStates;

    /* renamed from: t, reason: collision with root package name */
    public final Map f63890t;
    private int[] trackGroupToSampleQueueIndex;

    /* renamed from: u, reason: collision with root package name */
    public B1.e f63891u;

    /* renamed from: v, reason: collision with root package name */
    public Set f63892v;

    /* renamed from: w, reason: collision with root package name */
    public SparseIntArray f63893w;

    /* renamed from: x, reason: collision with root package name */
    public O f63894x;

    /* renamed from: y, reason: collision with root package name */
    public int f63895y;

    /* renamed from: z, reason: collision with root package name */
    public int f63896z;

    /* renamed from: j, reason: collision with root package name */
    public final D1.m f63880j = new D1.m("Loader:HlsSampleStreamWrapper");

    /* renamed from: m, reason: collision with root package name */
    public final f.b f63883m = new f.b();
    private int[] sampleQueueTrackIds = new int[0];

    public interface b extends d0.a {
        void c();

        void l(Uri uri);
    }

    public static class c implements O {

        /* renamed from: f, reason: collision with root package name */
        public static final androidx.media3.common.a f63897f = new a.b().y0("application/id3").P();

        /* renamed from: g, reason: collision with root package name */
        public static final androidx.media3.common.a f63898g = new a.b().y0("application/x-emsg").P();

        /* renamed from: a, reason: collision with root package name */
        public final S1.b f63899a = new S1.b();

        /* renamed from: b, reason: collision with root package name */
        public final O f63900b;
        private byte[] buffer;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.a f63901c;

        /* renamed from: d, reason: collision with root package name */
        public androidx.media3.common.a f63902d;

        /* renamed from: e, reason: collision with root package name */
        public int f63903e;

        public c(O o10, int i10) {
            this.f63900b = o10;
            if (i10 == 1) {
                this.f63901c = f63897f;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                this.f63901c = f63898g;
            }
            this.buffer = new byte[0];
            this.f63903e = 0;
        }

        @Override // H1.O
        public int b(InterfaceC2358l interfaceC2358l, int i10, boolean z10, int i11) {
            i(this.f63903e + i10);
            int read = interfaceC2358l.read(this.buffer, this.f63903e, i10);
            if (read != -1) {
                this.f63903e += read;
                return read;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // H1.O
        public void c(androidx.media3.common.a aVar) {
            this.f63902d = aVar;
            this.f63900b.c(this.f63901c);
        }

        @Override // H1.O
        public void f(J j10, int i10, int i11) {
            i(this.f63903e + i10);
            j10.q(this.buffer, this.f63903e, i10);
            this.f63903e += i10;
        }

        @Override // H1.O
        public void g(long j10, int i10, int i11, int i12, O.a aVar) {
            AbstractC4134a.e(this.f63902d);
            J j11 = j(i11, i12);
            if (!Objects.equals(this.f63902d.f20543o, this.f63901c.f20543o)) {
                if (!"application/x-emsg".equals(this.f63902d.f20543o)) {
                    AbstractC4156x.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f63902d.f20543o);
                    return;
                }
                S1.a c10 = this.f63899a.c(j11);
                if (!h(c10)) {
                    AbstractC4156x.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f63901c.f20543o, c10.a()));
                    return;
                }
                j11 = new J((byte[]) AbstractC4134a.e(c10.c()));
            }
            int a10 = j11.a();
            this.f63900b.a(j11, a10);
            this.f63900b.g(j10, i10, a10, 0, aVar);
        }

        public final boolean h(S1.a aVar) {
            androidx.media3.common.a a10 = aVar.a();
            return a10 != null && Objects.equals(this.f63901c.f20543o, a10.f20543o);
        }

        public final void i(int i10) {
            byte[] bArr = this.buffer;
            if (bArr.length < i10) {
                this.buffer = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        public final J j(int i10, int i11) {
            int i12 = this.f63903e - i11;
            J j10 = new J(Arrays.copyOfRange(this.buffer, i12 - i10, i12));
            byte[] bArr = this.buffer;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f63903e = i11;
            return j10;
        }
    }

    public static final class d extends b0 {

        /* renamed from: B, reason: collision with root package name */
        public final Map f63904B;

        /* renamed from: C, reason: collision with root package name */
        public DrmInitData f63905C;

        @Override // androidx.media3.exoplayer.source.b0, H1.O
        public void g(long j10, int i10, int i11, int i12, O.a aVar) {
            super.g(j10, i10, i11, i12, aVar);
        }

        public final C2334C j0(C2334C c2334c) {
            if (c2334c == null) {
                return null;
            }
            int e10 = c2334c.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= e10) {
                    i11 = -1;
                    break;
                }
                C2334C.a d10 = c2334c.d(i11);
                if ((d10 instanceof V1.m) && "com.apple.streaming.transportStreamTimestamp".equals(((V1.m) d10).f12361b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return c2334c;
            }
            if (e10 == 1) {
                return null;
            }
            C2334C.a[] aVarArr = new C2334C.a[e10 - 1];
            while (i10 < e10) {
                if (i10 != i11) {
                    aVarArr[i10 < i11 ? i10 : i10 - 1] = c2334c.d(i10);
                }
                i10++;
            }
            return new C2334C(aVarArr);
        }

        public void k0(DrmInitData drmInitData) {
            this.f63905C = drmInitData;
            L();
        }

        public void l0(j jVar) {
            h0(jVar.f63801k);
        }

        @Override // androidx.media3.exoplayer.source.b0
        public androidx.media3.common.a z(androidx.media3.common.a aVar) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.f63905C;
            if (drmInitData2 == null) {
                drmInitData2 = aVar.f20547s;
            }
            if (drmInitData2 != null && (drmInitData = (DrmInitData) this.f63904B.get(drmInitData2.f20463b)) != null) {
                drmInitData2 = drmInitData;
            }
            C2334C j02 = j0(aVar.f20540l);
            if (drmInitData2 != aVar.f20547s || j02 != aVar.f20540l) {
                aVar = aVar.b().c0(drmInitData2).r0(j02).P();
            }
            return super.z(aVar);
        }

        public d(D1.b bVar, q1.u uVar, t.a aVar, Map map) {
            super(bVar, uVar, aVar);
            this.f63904B = map;
        }
    }

    public s(String str, int i10, b bVar, f fVar, Map map, D1.b bVar2, long j10, androidx.media3.common.a aVar, q1.u uVar, t.a aVar2, D1.k kVar, L.a aVar3, int i11) {
        this.f63871a = str;
        this.f63872b = i10;
        this.f63873c = bVar;
        this.f63874d = fVar;
        this.f63890t = map;
        this.f63875e = bVar2;
        this.f63876f = aVar;
        this.f63877g = uVar;
        this.f63878h = aVar2;
        this.f63879i = kVar;
        this.f63881k = aVar3;
        this.f63882l = i11;
        Set set = f63851Y;
        this.f63892v = new HashSet(set.size());
        this.f63893w = new SparseIntArray(set.size());
        this.sampleQueues = new d[0];
        this.sampleQueueIsAudioVideoFlags = new boolean[0];
        this.sampleQueuesEnabledStates = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f63884n = arrayList;
        this.f63885o = Collections.unmodifiableList(arrayList);
        this.f63889s = new ArrayList();
        this.f63886p = new Runnable() { // from class: r1.p
            @Override // java.lang.Runnable
            public final void run() {
                s.this.W();
            }
        };
        this.f63887q = new Runnable() { // from class: r1.q
            @Override // java.lang.Runnable
            public final void run() {
                s.this.g0();
            }
        };
        this.f63888r = Z.z();
        this.f63862K = j10;
        this.f63863L = j10;
    }

    public static C1181n E(int i10, int i11) {
        AbstractC4156x.i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new C1181n();
    }

    public static androidx.media3.common.a H(androidx.media3.common.a aVar, androidx.media3.common.a aVar2, boolean z10) {
        String d10;
        String str;
        if (aVar == null) {
            return aVar2;
        }
        int k10 = AbstractC2335D.k(aVar2.f20543o);
        if (Z.U(aVar.f20539k, k10) == 1) {
            d10 = Z.V(aVar.f20539k, k10);
            str = AbstractC2335D.g(d10);
        } else {
            d10 = AbstractC2335D.d(aVar.f20539k, aVar2.f20543o);
            str = aVar2.f20543o;
        }
        a.b U10 = aVar2.b().j0(aVar.f20529a).l0(aVar.f20530b).m0(aVar.f20531c).n0(aVar.f20532d).A0(aVar.f20533e).w0(aVar.f20534f).S(z10 ? aVar.f20536h : -1).t0(z10 ? aVar.f20537i : -1).U(d10);
        if (k10 == 2) {
            U10.F0(aVar.f20550v).h0(aVar.f20551w).f0(aVar.f20554z);
        }
        if (str != null) {
            U10.y0(str);
        }
        int i10 = aVar.f20518F;
        if (i10 != -1 && k10 == 1) {
            U10.T(i10);
        }
        C2334C c2334c = aVar.f20540l;
        if (c2334c != null) {
            C2334C c2334c2 = aVar2.f20540l;
            if (c2334c2 != null) {
                c2334c = c2334c2.b(c2334c);
            }
            U10.r0(c2334c);
        }
        return U10.P();
    }

    public static boolean L(androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        String str = aVar.f20543o;
        String str2 = aVar2.f20543o;
        int k10 = AbstractC2335D.k(str);
        if (k10 != 3) {
            return k10 == AbstractC2335D.k(str2);
        }
        if (Objects.equals(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || aVar.f20523K == aVar2.f20523K;
        }
        return false;
    }

    public static int O(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static boolean Q(B1.e eVar) {
        return eVar instanceof j;
    }

    private boolean R() {
        return this.f63863L != -9223372036854775807L;
    }

    public int A(int i10) {
        z();
        AbstractC4134a.e(this.trackGroupToSampleQueueIndex);
        int i11 = this.trackGroupToSampleQueueIndex[i10];
        if (i11 == -1) {
            return this.f63859H.contains(this.f63858G.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.sampleQueuesEnabledStates;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    public final void B() {
        androidx.media3.common.a aVar;
        int length = this.sampleQueues.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String str = ((androidx.media3.common.a) AbstractC4134a.i(this.sampleQueues[i12].I())).f20543o;
            int i13 = AbstractC2335D.t(str) ? 2 : AbstractC2335D.o(str) ? 1 : AbstractC2335D.s(str) ? 3 : -2;
            if (O(i13) > O(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        P l10 = this.f63874d.l();
        int i14 = l10.f24395a;
        this.f63860I = -1;
        this.trackGroupToSampleQueueIndex = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.trackGroupToSampleQueueIndex[i15] = i15;
        }
        P[] pArr = new P[length];
        int i16 = 0;
        while (i16 < length) {
            androidx.media3.common.a aVar2 = (androidx.media3.common.a) AbstractC4134a.i(this.sampleQueues[i16].I());
            if (i16 == i11) {
                androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    androidx.media3.common.a a10 = l10.a(i17);
                    if (i10 == 1 && (aVar = this.f63876f) != null) {
                        a10 = a10.i(aVar);
                    }
                    aVarArr[i17] = i14 == 1 ? aVar2.i(a10) : H(a10, aVar2, true);
                }
                pArr[i16] = new P(this.f63871a, aVarArr);
                this.f63860I = i16;
            } else {
                androidx.media3.common.a aVar3 = (i10 == 2 && AbstractC2335D.o(aVar2.f20543o)) ? this.f63876f : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f63871a);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                pArr[i16] = new P(sb2.toString(), H(aVar3, aVar2, false));
            }
            i16++;
        }
        this.f63858G = G(pArr);
        AbstractC4134a.g(this.f63859H == null);
        this.f63859H = Collections.EMPTY_SET;
    }

    public final boolean C(int i10) {
        for (int i11 = i10; i11 < this.f63884n.size(); i11++) {
            if (((j) this.f63884n.get(i11)).x()) {
                return false;
            }
        }
        j jVar = (j) this.f63884n.get(i10);
        for (int i12 = 0; i12 < this.sampleQueues.length; i12++) {
            if (this.sampleQueues[i12].F() > jVar.n(i12)) {
                return false;
            }
        }
        return true;
    }

    public void D() {
        if (this.f63853B) {
            return;
        }
        b(new k.b().f(this.f63862K).d());
    }

    public final b0 F(int i10, int i11) {
        int length = this.sampleQueues.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f63875e, this.f63877g, this.f63878h, this.f63890t);
        dVar.d0(this.f63862K);
        if (z10) {
            dVar.k0(this.f63869W);
        }
        dVar.c0(this.f63868V);
        j jVar = this.f63870X;
        if (jVar != null) {
            dVar.l0(jVar);
        }
        dVar.f0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.sampleQueueTrackIds, i12);
        this.sampleQueueTrackIds = copyOf;
        copyOf[length] = i10;
        this.sampleQueues = (d[]) Z.e1(this.sampleQueues, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.sampleQueueIsAudioVideoFlags, i12);
        this.sampleQueueIsAudioVideoFlags = copyOf2;
        copyOf2[length] = z10;
        this.f63861J |= z10;
        this.f63892v.add(Integer.valueOf(i11));
        this.f63893w.append(i11, length);
        if (O(i11) > O(this.f63895y)) {
            this.f63896z = length;
            this.f63895y = i11;
        }
        this.sampleQueuesEnabledStates = Arrays.copyOf(this.sampleQueuesEnabledStates, i12);
        return dVar;
    }

    public final m0 G(P[] pArr) {
        for (int i10 = 0; i10 < pArr.length; i10++) {
            P p10 = pArr[i10];
            androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[p10.f24395a];
            for (int i11 = 0; i11 < p10.f24395a; i11++) {
                androidx.media3.common.a a10 = p10.a(i11);
                aVarArr[i11] = a10.c(this.f63877g.b(a10));
            }
            pArr[i10] = new P(p10.f24396b, aVarArr);
        }
        return new m0(pArr);
    }

    public final void I(int i10) {
        AbstractC4134a.g(!this.f63880j.j());
        while (true) {
            if (i10 >= this.f63884n.size()) {
                i10 = -1;
                break;
            } else if (C(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = M().f563h;
        j J10 = J(i10);
        if (this.f63884n.isEmpty()) {
            this.f63863L = this.f63862K;
        } else {
            ((j) I.f(this.f63884n)).q();
        }
        this.f63866R = false;
        this.f63881k.y(this.f63895y, J10.f562g, j10);
    }

    public final j J(int i10) {
        j jVar = (j) this.f63884n.get(i10);
        ArrayList arrayList = this.f63884n;
        Z.n1(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.sampleQueues.length; i11++) {
            this.sampleQueues[i11].w(jVar.n(i11));
        }
        return jVar;
    }

    public final boolean K(j jVar) {
        int i10 = jVar.f63801k;
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.sampleQueuesEnabledStates[i11] && this.sampleQueues[i11].S() == i10) {
                return false;
            }
        }
        return true;
    }

    public final j M() {
        return (j) this.f63884n.get(r0.size() - 1);
    }

    public final O N(int i10, int i11) {
        AbstractC4134a.a(f63851Y.contains(Integer.valueOf(i11)));
        int i12 = this.f63893w.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f63892v.add(Integer.valueOf(i11))) {
            this.sampleQueueTrackIds[i12] = i10;
        }
        return this.sampleQueueTrackIds[i12] == i10 ? this.sampleQueues[i12] : E(i10, i11);
    }

    public final void P(j jVar) {
        this.f63870X = jVar;
        this.f63855D = jVar.f559d;
        this.f63863L = -9223372036854775807L;
        this.f63884n.add(jVar);
        AbstractC3445z.a k10 = AbstractC3445z.k();
        for (d dVar : this.sampleQueues) {
            k10.a(Integer.valueOf(dVar.J()));
        }
        jVar.p(this, k10.m());
        for (d dVar2 : this.sampleQueues) {
            dVar2.l0(jVar);
            if (jVar.x()) {
                dVar2.i0();
            }
        }
    }

    public boolean S(int i10) {
        return !R() && this.sampleQueues[i10].N(this.f63866R);
    }

    public boolean T() {
        return this.f63895y == 2;
    }

    public final void U() {
        int i10 = this.f63858G.f21832a;
        int[] iArr = new int[i10];
        this.trackGroupToSampleQueueIndex = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.sampleQueues;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (L((androidx.media3.common.a) AbstractC4134a.i(dVarArr[i12].I()), this.f63858G.b(i11).a(0))) {
                    this.trackGroupToSampleQueueIndex[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator it = this.f63889s.iterator();
        while (it.hasNext()) {
            ((n) it.next()).b();
        }
    }

    public final void V(j jVar) {
        if (this.f63884n.isEmpty()) {
            return;
        }
        if (!M().r()) {
            I(this.f63884n.size() - 1);
        }
        if (jVar.f63804n && jVar.x()) {
            for (int size = this.f63884n.size() - 1; size >= 0; size--) {
                long j10 = ((j) this.f63884n.get(size)).f562g;
                long j11 = jVar.f562g;
                if (j10 < j11) {
                    return;
                }
                if (j10 == j11 && C(size)) {
                    I(size);
                    jVar.j();
                    return;
                }
            }
        }
    }

    public final void W() {
        if (!this.f63857F && this.trackGroupToSampleQueueIndex == null && this.f63852A) {
            for (d dVar : this.sampleQueues) {
                if (dVar.I() == null) {
                    return;
                }
            }
            if (this.f63858G != null) {
                U();
                return;
            }
            B();
            p0();
            this.f63873c.c();
        }
    }

    public void X() {
        this.f63880j.a();
        this.f63874d.r();
    }

    public void Y(int i10) {
        X();
        this.sampleQueues[i10].P();
    }

    @Override // D1.m.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void l(B1.e eVar, long j10, long j11, boolean z10) {
        this.f63891u = null;
        C2223y c2223y = new C2223y(eVar.f556a, eVar.f557b, eVar.f(), eVar.e(), j10, j11, eVar.b());
        this.f63879i.d(eVar.f556a);
        this.f63881k.m(c2223y, eVar.f558c, this.f63872b, eVar.f559d, eVar.f560e, eVar.f561f, eVar.f562g, eVar.f563h);
        if (z10) {
            return;
        }
        if (R() || this.f63854C == 0) {
            k0();
        }
        if (this.f63854C > 0) {
            this.f63873c.j(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.b0.d
    public void a(androidx.media3.common.a aVar) {
        this.f63888r.post(this.f63886p);
    }

    @Override // D1.m.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void i(B1.e eVar, long j10, long j11) {
        this.f63891u = null;
        this.f63874d.t(eVar);
        C2223y c2223y = new C2223y(eVar.f556a, eVar.f557b, eVar.f(), eVar.e(), j10, j11, eVar.b());
        this.f63879i.d(eVar.f556a);
        this.f63881k.p(c2223y, eVar.f558c, this.f63872b, eVar.f559d, eVar.f560e, eVar.f561f, eVar.f562g, eVar.f563h);
        if (this.f63853B) {
            this.f63873c.j(this);
        } else {
            b(new k.b().f(this.f63862K).d());
        }
    }

    @Override // androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        List list;
        long j10;
        long j11;
        if (this.f63866R || this.f63880j.j() || this.f63880j.i()) {
            return false;
        }
        if (R()) {
            List list2 = Collections.EMPTY_LIST;
            long j12 = this.f63863L;
            for (d dVar : this.sampleQueues) {
                dVar.d0(this.f63863L);
            }
            list = list2;
            j10 = j12;
            j11 = j10;
        } else {
            List list3 = this.f63885o;
            j M10 = M();
            long o10 = (M10.h() && M10.r()) ? M10.o() : Math.max(this.f63862K, M10.f562g);
            long j13 = this.f63862K;
            if (this.f63852A) {
                for (d dVar2 : this.sampleQueues) {
                    j13 = Math.max(j13, dVar2.D());
                }
            }
            list = list3;
            j10 = o10;
            j11 = j13;
        }
        this.f63883m.a();
        this.f63874d.f(kVar, j10, j11, list, this.f63853B || !list.isEmpty(), this.f63883m);
        f.b bVar = this.f63883m;
        boolean z10 = bVar.f63774b;
        B1.e eVar = bVar.f63773a;
        Uri uri = bVar.f63775c;
        if (z10) {
            this.f63863L = -9223372036854775807L;
            this.f63866R = true;
            return true;
        }
        if (eVar == null) {
            if (uri != null) {
                this.f63873c.l(uri);
            }
            return false;
        }
        if (Q(eVar)) {
            j jVar = (j) eVar;
            V(jVar);
            P(jVar);
        }
        this.f63891u = eVar;
        this.f63880j.n(eVar, this, this.f63879i.c(eVar.f558c));
        return true;
    }

    @Override // D1.m.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public m.c o(B1.e eVar, long j10, long j11, IOException iOException, int i10) {
        m.c h10;
        int i11;
        boolean Q10 = Q(eVar);
        if (Q10 && !((j) eVar).r() && (iOException instanceof C4428x) && ((i11 = ((C4428x) iOException).f47621d) == 410 || i11 == 404)) {
            return D1.m.f2454d;
        }
        long b10 = eVar.b();
        C2223y c2223y = new C2223y(eVar.f556a, eVar.f557b, eVar.f(), eVar.e(), j10, j11, b10);
        k.c cVar = new k.c(c2223y, new B(eVar.f558c, this.f63872b, eVar.f559d, eVar.f560e, eVar.f561f, Z.J1(eVar.f562g), Z.J1(eVar.f563h)), iOException, i10);
        k.b a10 = this.f63879i.a(E.c(this.f63874d.m()), cVar);
        boolean q10 = (a10 == null || a10.f2448a != 2) ? false : this.f63874d.q(eVar, a10.f2449b);
        if (q10) {
            if (Q10 && b10 == 0) {
                ArrayList arrayList = this.f63884n;
                AbstractC4134a.g(((j) arrayList.remove(arrayList.size() - 1)) == eVar);
                if (this.f63884n.isEmpty()) {
                    this.f63863L = this.f63862K;
                } else {
                    ((j) I.f(this.f63884n)).q();
                }
            }
            h10 = D1.m.f2456f;
        } else {
            long b11 = this.f63879i.b(cVar);
            h10 = b11 != -9223372036854775807L ? D1.m.h(false, b11) : D1.m.f2457g;
        }
        m.c cVar2 = h10;
        boolean c10 = cVar2.c();
        this.f63881k.r(c2223y, eVar.f558c, this.f63872b, eVar.f559d, eVar.f560e, eVar.f561f, eVar.f562g, eVar.f563h, iOException, !c10);
        if (!c10) {
            this.f63891u = null;
            this.f63879i.d(eVar.f556a);
        }
        if (q10) {
            if (!this.f63853B) {
                b(new k.b().f(this.f63862K).d());
                return cVar2;
            }
            this.f63873c.j(this);
        }
        return cVar2;
    }

    @Override // H1.r
    public O c(int i10, int i11) {
        O o10;
        if (!f63851Y.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                O[] oArr = this.sampleQueues;
                if (i12 >= oArr.length) {
                    o10 = null;
                    break;
                }
                if (this.sampleQueueTrackIds[i12] == i10) {
                    o10 = oArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            o10 = N(i10, i11);
        }
        if (o10 == null) {
            if (this.f63867T) {
                return E(i10, i11);
            }
            o10 = F(i10, i11);
        }
        if (i11 != 5) {
            return o10;
        }
        if (this.f63894x == null) {
            this.f63894x = new c(o10, this.f63882l);
        }
        return this.f63894x;
    }

    @Override // D1.m.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void j(B1.e eVar, long j10, long j11, int i10) {
        this.f63881k.v(i10 == 0 ? new C2223y(eVar.f556a, eVar.f557b, j10) : new C2223y(eVar.f556a, eVar.f557b, eVar.f(), eVar.e(), j10, j11, eVar.b()), eVar.f558c, this.f63872b, eVar.f559d, eVar.f560e, eVar.f561f, eVar.f562g, eVar.f563h, i10);
    }

    @Override // androidx.media3.exoplayer.source.d0
    public long d() {
        if (R()) {
            return this.f63863L;
        }
        if (this.f63866R) {
            return Long.MIN_VALUE;
        }
        return M().f563h;
    }

    public void d0() {
        this.f63892v.clear();
    }

    @Override // androidx.media3.exoplayer.source.d0
    public boolean e() {
        return this.f63880j.j();
    }

    public boolean e0(Uri uri, k.c cVar, boolean z10) {
        k.b a10;
        if (this.f63874d.s(uri)) {
            return this.f63874d.u(uri, (z10 || (a10 = this.f63879i.a(E.c(this.f63874d.m()), cVar)) == null || a10.f2448a != 2) ? -9223372036854775807L : a10.f2449b);
        }
        return true;
    }

    public long f(long j10, o1 o1Var) {
        return this.f63874d.c(j10, o1Var);
    }

    public void f0() {
        if (this.f63884n.isEmpty()) {
            return;
        }
        final j jVar = (j) I.f(this.f63884n);
        int d10 = this.f63874d.d(jVar);
        if (d10 == 1) {
            if (jVar.r()) {
                return;
            }
            jVar.w(this.f63874d.j(jVar));
        } else if (d10 == 0) {
            this.f63888r.post(new Runnable() { // from class: r1.o
                @Override // java.lang.Runnable
                public final void run() {
                    s.this.f63873c.l(jVar.f63803m);
                }
            });
        } else if (d10 == 2 && !this.f63866R && this.f63880j.j()) {
            this.f63880j.f();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // androidx.media3.exoplayer.source.d0
    public long g() {
        /*
            r7 = this;
            boolean r0 = r7.f63866R
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.R()
            if (r0 == 0) goto L10
            long r0 = r7.f63863L
            return r0
        L10:
            long r0 = r7.f63862K
            r1.j r2 = r7.M()
            boolean r3 = r2.h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList r2 = r7.f63884n
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList r2 = r7.f63884n
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            r1.j r2 = (r1.j) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f563h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.f63852A
            if (r2 == 0) goto L55
            r1.s$d[] r2 = r7.sampleQueues
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.C()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.s.g():long");
    }

    public final void g0() {
        this.f63852A = true;
        W();
    }

    @Override // androidx.media3.exoplayer.source.d0
    public void h(long j10) {
        if (this.f63880j.i() || R()) {
            return;
        }
        if (this.f63880j.j()) {
            AbstractC4134a.e(this.f63891u);
            if (this.f63874d.z(j10, this.f63891u, this.f63885o)) {
                this.f63880j.f();
                return;
            }
            return;
        }
        int size = this.f63885o.size();
        while (size > 0 && this.f63874d.d((j) this.f63885o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f63885o.size()) {
            I(size);
        }
        int i10 = this.f63874d.i(j10, this.f63885o);
        if (i10 < this.f63884n.size()) {
            I(i10);
        }
    }

    public void h0(P[] pArr, int i10, int... iArr) {
        this.f63858G = G(pArr);
        this.f63859H = new HashSet();
        for (int i11 : iArr) {
            this.f63859H.add(this.f63858G.b(i11));
        }
        this.f63860I = i10;
        Handler handler = this.f63888r;
        final b bVar = this.f63873c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: r1.r
            @Override // java.lang.Runnable
            public final void run() {
                s.b.this.c();
            }
        });
        p0();
    }

    public int i0(int i10, O0 o02, k1.f fVar, int i11) {
        if (R()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f63884n.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f63884n.size() - 1 && K((j) this.f63884n.get(i13))) {
                i13++;
            }
            Z.n1(this.f63884n, 0, i13);
            j jVar = (j) this.f63884n.get(0);
            androidx.media3.common.a aVar = jVar.f559d;
            if (!aVar.equals(this.f63856E)) {
                this.f63881k.j(this.f63872b, aVar, jVar.f560e, jVar.f561f, jVar.f562g);
            }
            this.f63856E = aVar;
        }
        if (!this.f63884n.isEmpty() && !((j) this.f63884n.get(0)).r()) {
            return -3;
        }
        int U10 = this.sampleQueues[i10].U(o02, fVar, i11, this.f63866R);
        if (U10 == -5) {
            androidx.media3.common.a aVar2 = (androidx.media3.common.a) AbstractC4134a.e(o02.f56121b);
            if (i10 == this.f63896z) {
                int e10 = com.google.common.primitives.f.e(this.sampleQueues[i10].S());
                while (i12 < this.f63884n.size() && ((j) this.f63884n.get(i12)).f63801k != e10) {
                    i12++;
                }
                aVar2 = aVar2.i(i12 < this.f63884n.size() ? ((j) this.f63884n.get(i12)).f559d : (androidx.media3.common.a) AbstractC4134a.e(this.f63855D));
            }
            o02.f56121b = aVar2;
        }
        return U10;
    }

    public void j0() {
        if (this.f63853B) {
            for (d dVar : this.sampleQueues) {
                dVar.T();
            }
        }
        this.f63874d.v();
        this.f63880j.m(this);
        this.f63888r.removeCallbacksAndMessages(null);
        this.f63857F = true;
        this.f63889s.clear();
    }

    public final void k0() {
        for (d dVar : this.sampleQueues) {
            dVar.Y(this.f63864O);
        }
        this.f63864O = false;
    }

    public final boolean l0(long j10, j jVar) {
        boolean b02;
        int length = this.sampleQueues.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                return true;
            }
            d dVar = this.sampleQueues[i10];
            if (jVar != null) {
                b02 = dVar.a0(jVar.n(i10));
            } else {
                long d10 = d();
                if (d10 != Long.MIN_VALUE && j10 >= d10) {
                    z10 = false;
                }
                b02 = dVar.b0(j10, z10);
            }
            if (b02 || (!this.sampleQueueIsAudioVideoFlags[i10] && this.f63861J)) {
                i10++;
            }
        }
        return false;
    }

    public boolean m0(long j10, boolean z10) {
        j jVar;
        this.f63862K = j10;
        if (R()) {
            this.f63863L = j10;
            return true;
        }
        if (this.f63874d.n()) {
            for (int i10 = 0; i10 < this.f63884n.size(); i10++) {
                jVar = (j) this.f63884n.get(i10);
                if (jVar.f562g == j10) {
                    break;
                }
            }
        }
        jVar = null;
        if (this.f63852A && !z10 && !this.f63884n.isEmpty() && l0(j10, jVar)) {
            return false;
        }
        this.f63863L = j10;
        this.f63866R = false;
        this.f63884n.clear();
        if (this.f63880j.j()) {
            if (this.f63852A) {
                for (d dVar : this.sampleQueues) {
                    dVar.s();
                }
            }
            this.f63880j.f();
        } else {
            this.f63880j.g();
            k0();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x010d, code lost:
    
        if (r1.q() != r13.f63874d.l().b(r14.f559d)) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n0(y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10, boolean z10) {
        boolean z11;
        z();
        int i10 = this.f63854C;
        int i11 = 0;
        for (int i12 = 0; i12 < yVarArr.length; i12++) {
            n nVar = (n) c0VarArr[i12];
            if (nVar != null && (yVarArr[i12] == null || !zArr[i12])) {
                this.f63854C--;
                nVar.e();
                c0VarArr[i12] = null;
            }
        }
        boolean z12 = z10 || (!this.f63865P ? j10 == this.f63862K : i10 != 0);
        y m10 = this.f63874d.m();
        boolean z13 = z12;
        y yVar = m10;
        for (int i13 = 0; i13 < yVarArr.length; i13++) {
            y yVar2 = yVarArr[i13];
            if (yVar2 != null) {
                int d10 = this.f63858G.d(yVar2.m());
                if (d10 == this.f63860I) {
                    this.f63874d.y(yVar2);
                    yVar = yVar2;
                }
                if (c0VarArr[i13] == null) {
                    this.f63854C++;
                    n nVar2 = new n(this, d10);
                    c0VarArr[i13] = nVar2;
                    zArr2[i13] = true;
                    if (this.trackGroupToSampleQueueIndex != null) {
                        nVar2.b();
                        if (!z13) {
                            d dVar = this.sampleQueues[this.trackGroupToSampleQueueIndex[d10]];
                            z13 = (dVar.F() == 0 || dVar.b0(j10, true)) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.f63854C == 0) {
            this.f63874d.v();
            this.f63856E = null;
            this.f63864O = true;
            this.f63884n.clear();
            if (this.f63880j.j()) {
                if (this.f63852A) {
                    d[] dVarArr = this.sampleQueues;
                    int length = dVarArr.length;
                    while (i11 < length) {
                        dVarArr[i11].s();
                        i11++;
                    }
                }
                this.f63880j.f();
            } else {
                k0();
            }
        } else {
            if (!this.f63884n.isEmpty() && !Objects.equals(yVar, m10)) {
                if (!this.f63865P) {
                    long j11 = j10 < 0 ? -j10 : 0L;
                    j M10 = M();
                    y yVar3 = yVar;
                    yVar3.n(j10, j11, -9223372036854775807L, this.f63885o, this.f63874d.a(M10, j10));
                }
                this.f63864O = true;
                z11 = true;
                z13 = true;
                if (z13) {
                    m0(j10, z11);
                    while (i11 < c0VarArr.length) {
                        if (c0VarArr[i11] != null) {
                            zArr2[i11] = true;
                        }
                        i11++;
                    }
                }
            }
            z11 = z10;
            if (z13) {
            }
        }
        u0(c0VarArr);
        this.f63865P = true;
        return z13;
    }

    public void o0(DrmInitData drmInitData) {
        if (Objects.equals(this.f63869W, drmInitData)) {
            return;
        }
        this.f63869W = drmInitData;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.sampleQueues;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.sampleQueueIsAudioVideoFlags[i10]) {
                dVarArr[i10].k0(drmInitData);
            }
            i10++;
        }
    }

    @Override // D1.m.f
    public void p() {
        for (d dVar : this.sampleQueues) {
            dVar.V();
        }
    }

    public final void p0() {
        this.f63853B = true;
    }

    public void q0(boolean z10) {
        this.f63874d.x(z10);
    }

    public void r() {
        X();
        if (this.f63866R && !this.f63853B) {
            throw C2338G.a("Loading finished before preparation is complete.", null);
        }
    }

    public void r0(long j10) {
        if (this.f63868V != j10) {
            this.f63868V = j10;
            for (d dVar : this.sampleQueues) {
                dVar.c0(j10);
            }
        }
    }

    @Override // H1.r
    public void s() {
        this.f63867T = true;
        this.f63888r.post(this.f63887q);
    }

    public int s0(int i10, long j10) {
        if (R()) {
            return 0;
        }
        d dVar = this.sampleQueues[i10];
        int H10 = dVar.H(j10, this.f63866R);
        j jVar = (j) I.g(this.f63884n, null);
        if (jVar != null && !jVar.r()) {
            H10 = Math.min(H10, jVar.n(i10) - dVar.F());
        }
        dVar.g0(H10);
        return H10;
    }

    public void t0(int i10) {
        z();
        AbstractC4134a.e(this.trackGroupToSampleQueueIndex);
        int i11 = this.trackGroupToSampleQueueIndex[i10];
        AbstractC4134a.g(this.sampleQueuesEnabledStates[i11]);
        this.sampleQueuesEnabledStates[i11] = false;
    }

    public m0 u() {
        z();
        return this.f63858G;
    }

    public final void u0(c0[] c0VarArr) {
        this.f63889s.clear();
        for (c0 c0Var : c0VarArr) {
            if (c0Var != null) {
                this.f63889s.add((n) c0Var);
            }
        }
    }

    public void v(long j10, boolean z10) {
        if (!this.f63852A || R()) {
            return;
        }
        int length = this.sampleQueues.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.sampleQueues[i10].r(j10, z10, this.sampleQueuesEnabledStates[i10]);
        }
    }

    public final void z() {
        AbstractC4134a.g(this.f63853B);
        AbstractC4134a.e(this.f63858G);
        AbstractC4134a.e(this.f63859H);
    }

    @Override // H1.r
    public void q(H1.J j10) {
    }
}
