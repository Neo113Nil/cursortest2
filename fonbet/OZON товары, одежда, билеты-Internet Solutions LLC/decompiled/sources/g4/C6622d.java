package g4;

import N3.B;
import N3.C3658i;
import N3.C3659j;
import N3.C3663n;
import N3.D;
import N3.F;
import N3.G;
import N3.InterfaceC3665p;
import N3.M;
import N3.q;
import N3.r;
import b4.C5535k;
import b4.C5537m;
import g4.InterfaceC6623e;
import j3.C7272n;
import j3.t;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import m3.C8050C;
import m3.N;
import m3.s;

/* renamed from: g4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6622d implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private final long f63758a;

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f63759b;

    /* renamed from: c, reason: collision with root package name */
    private final F.a f63760c;

    /* renamed from: d, reason: collision with root package name */
    private final B f63761d;

    /* renamed from: e, reason: collision with root package name */
    private final D f63762e;

    /* renamed from: f, reason: collision with root package name */
    private final C3663n f63763f;

    /* renamed from: g, reason: collision with root package name */
    private r f63764g;

    /* renamed from: h, reason: collision with root package name */
    private M f63765h;

    /* renamed from: i, reason: collision with root package name */
    private M f63766i;

    /* renamed from: j, reason: collision with root package name */
    private int f63767j;

    /* renamed from: k, reason: collision with root package name */
    private t f63768k;

    /* renamed from: l, reason: collision with root package name */
    private long f63769l;

    /* renamed from: m, reason: collision with root package name */
    private long f63770m;

    /* renamed from: n, reason: collision with root package name */
    private long f63771n;

    /* renamed from: o, reason: collision with root package name */
    private long f63772o;

    /* renamed from: p, reason: collision with root package name */
    private int f63773p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC6623e f63774q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f63775r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f63776s;

    /* renamed from: t, reason: collision with root package name */
    private long f63777t;

    public C6622d() {
        this(0);
    }

    private void h() {
        Object obj = this.f63774q;
        if ((obj instanceof C6619a) && ((C3658i) obj).isSeekable()) {
            long j11 = this.f63772o;
            if (j11 == -1 || j11 == this.f63774q.g()) {
                return;
            }
            this.f63774q = ((C6619a) this.f63774q).b(this.f63772o);
            r rVar = this.f63764g;
            rVar.getClass();
            rVar.seekMap(this.f63774q);
            this.f63765h.getClass();
            this.f63774q.getDurationUs();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.f() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean i(C3659j c3659j) throws IOException {
        InterfaceC6623e interfaceC6623e = this.f63774q;
        if (interfaceC6623e != null) {
            long g10 = interfaceC6623e.g();
            if (g10 != -1) {
            }
        }
        try {
            return !c3659j.d(this.f63759b.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        if (r18 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        r17.m(r3 + r7, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        r16.f63767j = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
    
        r17.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean j(C3659j c3659j, boolean z11) throws IOException {
        int i11;
        int i12;
        int h11;
        int i13 = z11 ? 32768 : 131072;
        c3659j.e();
        if (c3659j.getPosition() == 0) {
            t a11 = this.f63762e.a(c3659j, null);
            this.f63768k = a11;
            if (a11 != null) {
                this.f63761d.b(a11);
            }
            i11 = (int) c3659j.f();
            if (!z11) {
                c3659j.m(i11, false);
            }
            i12 = 0;
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i14 = i12;
        int i15 = i14;
        while (true) {
            if (!i(c3659j)) {
                C8050C c8050c = this.f63759b;
                c8050c.R(0);
                int p11 = c8050c.p();
                if ((i12 == 0 || ((-128000) & p11) == (i12 & (-128000))) && (h11 = F.h(p11)) != -1) {
                    i14++;
                    if (i14 != 1) {
                        if (i14 == 4) {
                            break;
                        }
                    } else {
                        this.f63760c.a(p11);
                        i12 = p11;
                    }
                    c3659j.i(h11 - 4, false);
                } else {
                    int i16 = i15 + 1;
                    if (i15 == i13) {
                        if (z11) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z11) {
                        c3659j.e();
                        c3659j.i(i11 + i16, false);
                    } else {
                        c3659j.m(1, false);
                    }
                    i14 = 0;
                    i15 = i16;
                    i12 = 0;
                }
            } else if (i14 <= 0) {
                h();
                throw new EOFException();
            }
        }
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f63767j = 0;
        this.f63769l = -9223372036854775807L;
        this.f63770m = 0L;
        this.f63773p = 0;
        this.f63777t = j12;
        InterfaceC6623e interfaceC6623e = this.f63774q;
        if (!(interfaceC6623e instanceof C6620b) || ((C6620b) interfaceC6623e).a(j12)) {
            return;
        }
        this.f63776s = true;
        this.f63766i = this.f63763f;
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f63764g = rVar;
        M track = rVar.track(0, 1);
        this.f63765h = track;
        this.f63766i = track;
        this.f63764g.endTracks();
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        return j((C3659j) qVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (r3 != 1231971951) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v17, types: [N3.j, N3.q] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r43v0, types: [g4.d] */
    @Override // N3.InterfaceC3665p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(q qVar, G g10) throws IOException {
        int i11;
        int i12;
        long j11;
        boolean z11;
        long j12;
        long j13;
        ?? r102;
        ?? r32;
        int i13;
        B b11;
        int i14;
        int i15;
        long length;
        B b12;
        int i16;
        long j14;
        g gVar;
        long j15;
        InterfaceC6623e c6619a;
        t tVar;
        InterfaceC6623e interfaceC6623e;
        InterfaceC6623e c6619a2;
        long j16;
        G10.a.i(this.f63765h);
        int i17 = N.f74289a;
        int i18 = this.f63767j;
        F.a aVar = this.f63760c;
        if (i18 == 0) {
            try {
                j((C3659j) qVar, false);
            } catch (EOFException unused) {
                i11 = -1;
                i12 = -1;
                j11 = 1000000;
            }
        }
        InterfaceC6623e interfaceC6623e2 = this.f63774q;
        C8050C c8050c = this.f63759b;
        if (interfaceC6623e2 == null) {
            C8050C c8050c2 = new C8050C(aVar.f18496c);
            j12 = -9223372036854775807L;
            ((C3659j) qVar).d(c8050c2.e(), 0, aVar.f18496c, false);
            int i19 = 21;
            if ((aVar.f18494a & 1) != 0) {
                if (aVar.f18498e != 1) {
                    i19 = 36;
                }
            } else if (aVar.f18498e == 1) {
                i19 = 13;
            }
            j11 = 1000000;
            z11 = true;
            j13 = 0;
            if (c8050c2.i() >= i19 + 4) {
                c8050c2.R(i19);
                i13 = c8050c2.p();
                if (i13 != 1483304551) {
                }
                b11 = this.f63761d;
                if (i13 != 1231971951) {
                    if (i13 == 1447187017) {
                        C3659j c3659j = (C3659j) qVar;
                        c6619a = C6624f.a(c3659j.getLength(), c3659j.getPosition(), this.f63760c, c8050c2);
                        c3659j.m(aVar.f18496c, false);
                        b12 = b11;
                        tVar = this.f63768k;
                        C3659j c3659j2 = (C3659j) qVar;
                        long position = c3659j2.getPosition();
                        if (tVar != null) {
                        }
                        interfaceC6623e = null;
                        if (this.f63775r) {
                        }
                        this.f63774q = c6619a2;
                        this.f63764g.seekMap(c6619a2);
                        C7272n.a aVar2 = new C7272n.a();
                        aVar2.W("audio/mpeg");
                        aVar2.y0(aVar.f18495b);
                        aVar2.o0(4096);
                        aVar2.T(aVar.f18498e);
                        aVar2.z0(aVar.f18497d);
                        B b13 = b12;
                        aVar2.d0(b13.f18466a);
                        aVar2.e0(b13.f18467b);
                        aVar2.r0(this.f63768k);
                        if (this.f63774q.i() != -2147483647) {
                        }
                        this.f63766i.a(aVar2.P());
                        this.f63771n = c3659j2.getPosition();
                    } else if (i13 != 1483304551) {
                        ((C3659j) qVar).e();
                        b12 = b11;
                        c6619a = null;
                        tVar = this.f63768k;
                        C3659j c3659j22 = (C3659j) qVar;
                        long position2 = c3659j22.getPosition();
                        if (tVar != null) {
                            int e11 = tVar.e();
                            for (int i21 = 0; i21 < e11; i21++) {
                                t.a d11 = tVar.d(i21);
                                if (d11 instanceof C5535k) {
                                    C5535k c5535k = (C5535k) d11;
                                    if (tVar != null) {
                                        int e12 = tVar.e();
                                        for (int i22 = 0; i22 < e12; i22++) {
                                            t.a d12 = tVar.d(i22);
                                            if (d12 instanceof C5537m) {
                                                C5537m c5537m = (C5537m) d12;
                                                if (c5537m.f55512a.equals("TLEN")) {
                                                    j16 = N.Q(Long.parseLong(c5537m.f55525c.get(0)));
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    j16 = -9223372036854775807L;
                                    interfaceC6623e = C6621c.a(position2, c5535k, j16);
                                    if (this.f63775r) {
                                        c6619a2 = new InterfaceC6623e.a();
                                    } else {
                                        InterfaceC6623e interfaceC6623e3 = interfaceC6623e != null ? interfaceC6623e : c6619a != null ? c6619a : null;
                                        if (interfaceC6623e3 != null) {
                                            interfaceC6623e3.isSeekable();
                                        }
                                        if (interfaceC6623e3 != null) {
                                            interfaceC6623e3.isSeekable();
                                            c6619a2 = interfaceC6623e3;
                                        } else {
                                            c3659j22.d(c8050c.e(), 0, 4, false);
                                            c8050c.R(0);
                                            aVar.a(c8050c.p());
                                            c6619a2 = new C6619a(c3659j22.getLength(), c3659j22.getPosition(), this.f63760c, false);
                                        }
                                        M m11 = this.f63765h;
                                        c6619a2.getDurationUs();
                                        m11.getClass();
                                    }
                                    this.f63774q = c6619a2;
                                    this.f63764g.seekMap(c6619a2);
                                    C7272n.a aVar22 = new C7272n.a();
                                    aVar22.W("audio/mpeg");
                                    aVar22.y0(aVar.f18495b);
                                    aVar22.o0(4096);
                                    aVar22.T(aVar.f18498e);
                                    aVar22.z0(aVar.f18497d);
                                    B b132 = b12;
                                    aVar22.d0(b132.f18466a);
                                    aVar22.e0(b132.f18467b);
                                    aVar22.r0(this.f63768k);
                                    if (this.f63774q.i() != -2147483647) {
                                        aVar22.S(this.f63774q.i());
                                    }
                                    this.f63766i.a(aVar22.P());
                                    this.f63771n = c3659j22.getPosition();
                                }
                            }
                        }
                        interfaceC6623e = null;
                        if (this.f63775r) {
                        }
                        this.f63774q = c6619a2;
                        this.f63764g.seekMap(c6619a2);
                        C7272n.a aVar222 = new C7272n.a();
                        aVar222.W("audio/mpeg");
                        aVar222.y0(aVar.f18495b);
                        aVar222.o0(4096);
                        aVar222.T(aVar.f18498e);
                        aVar222.z0(aVar.f18497d);
                        B b1322 = b12;
                        aVar222.d0(b1322.f18466a);
                        aVar222.e0(b1322.f18467b);
                        aVar222.r0(this.f63768k);
                        if (this.f63774q.i() != -2147483647) {
                        }
                        this.f63766i.a(aVar222.P());
                        this.f63771n = c3659j22.getPosition();
                    }
                }
                g b14 = g.b(aVar, c8050c2);
                if ((b11.f18466a != -1 || b11.f18467b == -1) && (i14 = b14.f63786d) != -1 && (i15 = b14.f63787e) != -1) {
                    b11.f18466a = i14;
                    b11.f18467b = i15;
                }
                C3659j c3659j3 = (C3659j) qVar;
                long position3 = c3659j3.getPosition();
                length = c3659j3.getLength();
                b12 = b11;
                long j17 = b14.f63785c;
                if (length != -1 || j17 == -1) {
                    i16 = i13;
                } else {
                    i16 = i13;
                    long j18 = position3 + j17;
                    if (c3659j3.getLength() != j18) {
                        StringBuilder sb2 = new StringBuilder("Data size mismatch between stream (");
                        j14 = position3;
                        sb2.append(c3659j3.getLength());
                        sb2.append(") and Xing frame (");
                        sb2.append(j18);
                        sb2.append("), using Xing value.");
                        s.e("Mp3Extractor", sb2.toString());
                        c3659j3.m(aVar.f18496c, false);
                        if (i16 != 1483304551) {
                            c6619a = h.a(b14, j14);
                        } else {
                            long j19 = j14;
                            long length2 = c3659j3.getLength();
                            long a11 = b14.a();
                            if (a11 != -9223372036854775807L) {
                                F.a aVar3 = b14.f63783a;
                                if (j17 != -1) {
                                    length2 = j19 + j17;
                                    gVar = b14;
                                    j15 = j17 - aVar3.f18496c;
                                } else {
                                    gVar = b14;
                                    if (length2 != -1) {
                                        j15 = (length2 - j19) - aVar3.f18496c;
                                    }
                                }
                                long j21 = j15;
                                long j22 = length2;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                c6619a = new C6619a(com.google.common.primitives.b.c(N.Z(j21, 8000000L, a11, roundingMode)), com.google.common.primitives.b.c(Q7.d.b(j21, gVar.f63784b, roundingMode)), j22, j19 + aVar3.f18496c, false);
                            }
                            c6619a = null;
                        }
                        tVar = this.f63768k;
                        C3659j c3659j222 = (C3659j) qVar;
                        long position22 = c3659j222.getPosition();
                        if (tVar != null) {
                        }
                        interfaceC6623e = null;
                        if (this.f63775r) {
                        }
                        this.f63774q = c6619a2;
                        this.f63764g.seekMap(c6619a2);
                        C7272n.a aVar2222 = new C7272n.a();
                        aVar2222.W("audio/mpeg");
                        aVar2222.y0(aVar.f18495b);
                        aVar2222.o0(4096);
                        aVar2222.T(aVar.f18498e);
                        aVar2222.z0(aVar.f18497d);
                        B b13222 = b12;
                        aVar2222.d0(b13222.f18466a);
                        aVar2222.e0(b13222.f18467b);
                        aVar2222.r0(this.f63768k);
                        if (this.f63774q.i() != -2147483647) {
                        }
                        this.f63766i.a(aVar2222.P());
                        this.f63771n = c3659j222.getPosition();
                    }
                }
                j14 = position3;
                c3659j3.m(aVar.f18496c, false);
                if (i16 != 1483304551) {
                }
                tVar = this.f63768k;
                C3659j c3659j2222 = (C3659j) qVar;
                long position222 = c3659j2222.getPosition();
                if (tVar != null) {
                }
                interfaceC6623e = null;
                if (this.f63775r) {
                }
                this.f63774q = c6619a2;
                this.f63764g.seekMap(c6619a2);
                C7272n.a aVar22222 = new C7272n.a();
                aVar22222.W("audio/mpeg");
                aVar22222.y0(aVar.f18495b);
                aVar22222.o0(4096);
                aVar22222.T(aVar.f18498e);
                aVar22222.z0(aVar.f18497d);
                B b132222 = b12;
                aVar22222.d0(b132222.f18466a);
                aVar22222.e0(b132222.f18467b);
                aVar22222.r0(this.f63768k);
                if (this.f63774q.i() != -2147483647) {
                }
                this.f63766i.a(aVar22222.P());
                this.f63771n = c3659j2222.getPosition();
            }
            if (c8050c2.i() >= 40) {
                c8050c2.R(36);
                if (c8050c2.p() == 1447187017) {
                    i13 = 1447187017;
                    b11 = this.f63761d;
                    if (i13 != 1231971951) {
                    }
                    g b142 = g.b(aVar, c8050c2);
                    if (b11.f18466a != -1) {
                    }
                    b11.f18466a = i14;
                    b11.f18467b = i15;
                    C3659j c3659j32 = (C3659j) qVar;
                    long position32 = c3659j32.getPosition();
                    length = c3659j32.getLength();
                    b12 = b11;
                    long j172 = b142.f63785c;
                    if (length != -1) {
                    }
                    i16 = i13;
                    j14 = position32;
                    c3659j32.m(aVar.f18496c, false);
                    if (i16 != 1483304551) {
                    }
                    tVar = this.f63768k;
                    C3659j c3659j22222 = (C3659j) qVar;
                    long position2222 = c3659j22222.getPosition();
                    if (tVar != null) {
                    }
                    interfaceC6623e = null;
                    if (this.f63775r) {
                    }
                    this.f63774q = c6619a2;
                    this.f63764g.seekMap(c6619a2);
                    C7272n.a aVar222222 = new C7272n.a();
                    aVar222222.W("audio/mpeg");
                    aVar222222.y0(aVar.f18495b);
                    aVar222222.o0(4096);
                    aVar222222.T(aVar.f18498e);
                    aVar222222.z0(aVar.f18497d);
                    B b1322222 = b12;
                    aVar222222.d0(b1322222.f18466a);
                    aVar222222.e0(b1322222.f18467b);
                    aVar222222.r0(this.f63768k);
                    if (this.f63774q.i() != -2147483647) {
                    }
                    this.f63766i.a(aVar222222.P());
                    this.f63771n = c3659j22222.getPosition();
                }
            }
            i13 = 0;
            b11 = this.f63761d;
            if (i13 != 1231971951) {
            }
            g b1422 = g.b(aVar, c8050c2);
            if (b11.f18466a != -1) {
            }
            b11.f18466a = i14;
            b11.f18467b = i15;
            C3659j c3659j322 = (C3659j) qVar;
            long position322 = c3659j322.getPosition();
            length = c3659j322.getLength();
            b12 = b11;
            long j1722 = b1422.f63785c;
            if (length != -1) {
            }
            i16 = i13;
            j14 = position322;
            c3659j322.m(aVar.f18496c, false);
            if (i16 != 1483304551) {
            }
            tVar = this.f63768k;
            C3659j c3659j222222 = (C3659j) qVar;
            long position22222 = c3659j222222.getPosition();
            if (tVar != null) {
            }
            interfaceC6623e = null;
            if (this.f63775r) {
            }
            this.f63774q = c6619a2;
            this.f63764g.seekMap(c6619a2);
            C7272n.a aVar2222222 = new C7272n.a();
            aVar2222222.W("audio/mpeg");
            aVar2222222.y0(aVar.f18495b);
            aVar2222222.o0(4096);
            aVar2222222.T(aVar.f18498e);
            aVar2222222.z0(aVar.f18497d);
            B b13222222 = b12;
            aVar2222222.d0(b13222222.f18466a);
            aVar2222222.e0(b13222222.f18467b);
            aVar2222222.r0(this.f63768k);
            if (this.f63774q.i() != -2147483647) {
            }
            this.f63766i.a(aVar2222222.P());
            this.f63771n = c3659j222222.getPosition();
        } else {
            z11 = true;
            j12 = -9223372036854775807L;
            j11 = 1000000;
            j13 = 0;
            if (this.f63771n != 0) {
                C3659j c3659j4 = (C3659j) qVar;
                long position4 = c3659j4.getPosition();
                long j23 = this.f63771n;
                if (position4 < j23) {
                    c3659j4.m((int) (j23 - position4), false);
                }
            }
        }
        if (this.f63773p == 0) {
            ?? r22 = (C3659j) qVar;
            r22.e();
            if (!i(r22)) {
                c8050c.R(0);
                int p11 = c8050c.p();
                if (((-128000) & p11) != (this.f63767j & (-128000))) {
                    r102 = 0;
                    r32 = z11;
                } else if (F.h(p11) == -1) {
                    r32 = z11;
                    r102 = 0;
                } else {
                    aVar.a(p11);
                    if (this.f63769l == j12) {
                        this.f63769l = this.f63774q.h(r22.getPosition());
                        long j24 = this.f63758a;
                        if (j24 != j12) {
                            this.f63769l = (j24 - this.f63774q.h(j13)) + this.f63769l;
                        }
                    }
                    this.f63773p = aVar.f18496c;
                    long position5 = r22.getPosition() + aVar.f18496c;
                    this.f63772o = position5;
                    InterfaceC6623e interfaceC6623e4 = this.f63774q;
                    if (interfaceC6623e4 instanceof C6620b) {
                        C6620b c6620b = (C6620b) interfaceC6623e4;
                        c6620b.b((((this.f63770m + aVar.f18500g) * j11) / aVar.f18497d) + this.f63769l, position5);
                        if (this.f63776s && c6620b.a(this.f63777t)) {
                            this.f63776s = false;
                            this.f63766i = this.f63765h;
                        }
                    }
                }
                r22.m(r32, r102);
                this.f63767j = r102;
                i11 = -1;
                i12 = 0;
                if (i12 == i11) {
                    InterfaceC6623e interfaceC6623e5 = this.f63774q;
                    if (interfaceC6623e5 instanceof C6620b) {
                        long j25 = ((this.f63770m * j11) / aVar.f18497d) + this.f63769l;
                        if (interfaceC6623e5.getDurationUs() != j25) {
                            ((C6620b) this.f63774q).c(j25);
                            this.f63764g.seekMap(this.f63774q);
                            M m12 = this.f63765h;
                            this.f63774q.getDurationUs();
                            m12.getClass();
                        }
                    }
                }
                return i12;
            }
            i11 = -1;
            i12 = -1;
            if (i12 == i11) {
            }
            return i12;
        }
        int d13 = this.f63766i.d(qVar, this.f63773p, z11);
        if (d13 != -1) {
            int i23 = this.f63773p - d13;
            this.f63773p = i23;
            if (i23 <= 0) {
                this.f63766i.b(this.f63769l + ((this.f63770m * j11) / aVar.f18497d), 1, aVar.f18496c, 0, null);
                this.f63770m += aVar.f18500g;
                this.f63773p = 0;
                i12 = 0;
                i11 = -1;
                if (i12 == i11) {
                }
                return i12;
            }
            i11 = -1;
            i12 = 0;
            if (i12 == i11) {
            }
            return i12;
        }
        i11 = -1;
        i12 = -1;
        if (i12 == i11) {
        }
        return i12;
    }

    public final void g() {
        this.f63775r = true;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }

    public C6622d(int i11) {
        this(-9223372036854775807L);
    }

    public C6622d(long j11) {
        this.f63758a = j11;
        this.f63759b = new C8050C(10);
        this.f63760c = new F.a();
        this.f63761d = new B();
        this.f63769l = -9223372036854775807L;
        this.f63762e = new D();
        C3663n c3663n = new C3663n();
        this.f63763f = c3663n;
        this.f63766i = c3663n;
        this.f63772o = -1L;
    }
}
