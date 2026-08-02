package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vwc implements kl6 {
    public final vd5 e;
    public ol6 f;
    public usj g;
    public usj h;
    public int i;
    public Metadata j;
    public long l;
    public long m;
    public int n;
    public r0h o;
    public boolean p;
    public boolean q;
    public long r;
    public final nkk a = new nkk(10);
    public final lxc b = new lxc(0);
    public final gv8 c = new gv8();
    public long k = C.TIME_UNSET;
    public final sz8 d = new sz8(29);

    public vwc() {
        vd5 vd5Var = new vd5();
        this.e = vd5Var;
        this.h = vd5Var;
    }

    public final cl3 a(ml6 ml6Var, boolean z) {
        nkk nkkVar = this.a;
        ml6Var.peekFully(nkkVar.a, 0, 4);
        nkkVar.E(0);
        int f = nkkVar.f();
        lxc lxcVar = this.b;
        lxcVar.a(f);
        return new cl3(ml6Var.getLength(), ml6Var.getPosition(), lxcVar.g, lxcVar.d, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (r3 != 1231971951) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a7  */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(ml6 ml6Var, b78 b78Var) {
        lxc lxcVar;
        int i;
        int i2;
        long j;
        nkk nkkVar;
        Throwable th;
        int i3;
        gv8 gv8Var;
        ap4 ap4Var;
        int f;
        r0h r0hVar;
        int i4;
        int i5;
        int v;
        uml umlVar;
        Metadata metadata;
        alc alcVar;
        r0h a;
        long j2;
        int s;
        vwc vwcVar = this;
        ml6 ml6Var2 = ml6Var;
        qx9.u(vwcVar.g);
        int i6 = lik.a;
        int i7 = vwcVar.i;
        lxc lxcVar2 = vwcVar.b;
        if (i7 == 0) {
            try {
                vwcVar.f(ml6Var2, false);
            } catch (EOFException unused) {
                lxcVar = lxcVar2;
                i = -1;
                i2 = -1;
                j = 1000000;
            }
        }
        r0h r0hVar2 = vwcVar.o;
        nkk nkkVar2 = vwcVar.a;
        if (r0hVar2 == null) {
            nkk nkkVar3 = new nkk(lxcVar2.d);
            j = 1000000;
            ((ap4) ml6Var2).peekFully(nkkVar3.a, 0, lxcVar2.d, false);
            int i8 = lxcVar2.b & 1;
            int i9 = lxcVar2.f;
            int i10 = 21;
            if (i8 != 0) {
                if (i9 != 1) {
                    i10 = 36;
                }
            } else if (i9 == 1) {
                i10 = 13;
            }
            th = null;
            if (nkkVar3.c >= i10 + 4) {
                nkkVar3.E(i10);
                i3 = nkkVar3.f();
                if (i3 != 1483304551) {
                }
                gv8Var = vwcVar.c;
                if (i3 != 1483304551 || i3 == 1231971951) {
                    lxcVar = lxcVar2;
                    ap4Var = (ap4) ml6Var;
                    long j3 = ap4Var.c;
                    long j4 = ap4Var.d;
                    int i11 = lxcVar.h;
                    int i12 = lxcVar.e;
                    f = nkkVar3.f();
                    if ((f & 1) == 1 || (v = nkkVar3.v()) == 0) {
                        r0hVar = null;
                    } else {
                        long D = lik.D(v, i11 * 1000000, i12);
                        if ((f & 6) != 6) {
                            umlVar = new uml(j4, lxcVar.d, D, -1L, null);
                        } else {
                            long t = nkkVar3.t();
                            long[] jArr = new long[100];
                            for (int i13 = 0; i13 < 100; i13++) {
                                jArr[i13] = nkkVar3.s();
                            }
                            if (j3 != -1 && j3 != j4 + t) {
                                m6k.f0();
                            }
                            umlVar = new uml(j4, lxcVar.d, D, t, jArr);
                        }
                        r0hVar = umlVar;
                    }
                    if (r0hVar != null && (gv8Var.a == -1 || gv8Var.b == -1)) {
                        ap4Var.f = 0;
                        ap4Var.b(i10 + 141, false);
                        ap4Var.peekFully(nkkVar2.a, 0, 3, false);
                        nkkVar2.E(0);
                        int u = nkkVar2.u();
                        i4 = u >> 12;
                        i5 = u & 4095;
                        if (i4 <= 0 || i5 > 0) {
                            gv8Var.a = i4;
                            gv8Var.b = i5;
                        }
                    }
                    ap4Var.skipFully(lxcVar.d);
                    if (r0hVar != null && !r0hVar.isSeekable() && i3 == 1231971951) {
                        vwcVar = this;
                        ml6Var2 = ml6Var;
                        r0hVar = vwcVar.a(ml6Var2, false);
                        metadata = vwcVar.j;
                        ap4 ap4Var2 = (ap4) ml6Var2;
                        long j5 = ap4Var2.d;
                        if (metadata != null) {
                            for (Metadata.Entry entry : metadata.a) {
                                if (entry instanceof MlltFrame) {
                                    int[] iArr = ((MlltFrame) entry).e;
                                    if (metadata != null) {
                                        for (Metadata.Entry entry2 : metadata.a) {
                                            if (entry2 instanceof TextInformationFrame) {
                                                TextInformationFrame textInformationFrame = (TextInformationFrame) entry2;
                                                if (textInformationFrame.a.equals("TLEN")) {
                                                    j2 = lik.y(Long.parseLong(textInformationFrame.c));
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    j2 = C.TIME_UNSET;
                                    int length = iArr.length;
                                    int i14 = length + 1;
                                    long[] jArr2 = new long[i14];
                                    long[] jArr3 = new long[i14];
                                    jArr2[0] = j5;
                                    jArr3[0] = 0;
                                    long j6 = 0;
                                    long j7 = j5;
                                    int i15 = 1;
                                    while (i15 <= length) {
                                        int i16 = i15 - 1;
                                        j7 += r10.c + iArr[i16];
                                        j6 += r10.d + r10.f[i16];
                                        jArr2[i15] = j7;
                                        jArr3[i15] = j6;
                                        i15++;
                                        nkkVar2 = nkkVar2;
                                    }
                                    nkkVar = nkkVar2;
                                    alcVar = new alc(jArr2, jArr3, j2);
                                    if (vwcVar.p) {
                                        if (alcVar != null) {
                                            r0hVar = alcVar;
                                        } else if (r0hVar == null) {
                                            r0hVar = null;
                                        }
                                        if (r0hVar != null) {
                                            r0hVar.isSeekable();
                                            a = r0hVar;
                                        } else {
                                            a = vwcVar.a(ml6Var2, false);
                                        }
                                    } else {
                                        a = new p0h(C.TIME_UNSET);
                                    }
                                    vwcVar.o = a;
                                    vwcVar.f.d(a);
                                    usj usjVar = vwcVar.h;
                                    pm8 pm8Var = new pm8();
                                    pm8Var.k = lxcVar.c;
                                    pm8Var.l = 4096;
                                    pm8Var.x = lxcVar.f;
                                    pm8Var.y = lxcVar.e;
                                    pm8Var.A = gv8Var.a;
                                    pm8Var.B = gv8Var.b;
                                    pm8Var.i = vwcVar.j;
                                    usjVar.a(new sm8(pm8Var));
                                    vwcVar.m = ap4Var2.d;
                                }
                            }
                        }
                        nkkVar = nkkVar2;
                        alcVar = null;
                        if (vwcVar.p) {
                        }
                        vwcVar.o = a;
                        vwcVar.f.d(a);
                        usj usjVar2 = vwcVar.h;
                        pm8 pm8Var2 = new pm8();
                        pm8Var2.k = lxcVar.c;
                        pm8Var2.l = 4096;
                        pm8Var2.x = lxcVar.f;
                        pm8Var2.y = lxcVar.e;
                        pm8Var2.A = gv8Var.a;
                        pm8Var2.B = gv8Var.b;
                        pm8Var2.i = vwcVar.j;
                        usjVar2.a(new sm8(pm8Var2));
                        vwcVar.m = ap4Var2.d;
                    }
                    vwcVar = this;
                    ml6Var2 = ml6Var;
                    metadata = vwcVar.j;
                    ap4 ap4Var22 = (ap4) ml6Var2;
                    long j52 = ap4Var22.d;
                    if (metadata != null) {
                    }
                    nkkVar = nkkVar2;
                    alcVar = null;
                    if (vwcVar.p) {
                    }
                    vwcVar.o = a;
                    vwcVar.f.d(a);
                    usj usjVar22 = vwcVar.h;
                    pm8 pm8Var22 = new pm8();
                    pm8Var22.k = lxcVar.c;
                    pm8Var22.l = 4096;
                    pm8Var22.x = lxcVar.f;
                    pm8Var22.y = lxcVar.e;
                    pm8Var22.A = gv8Var.a;
                    pm8Var22.B = gv8Var.b;
                    pm8Var22.i = vwcVar.j;
                    usjVar22.a(new sm8(pm8Var22));
                    vwcVar.m = ap4Var22.d;
                } else if (i3 == 1447187017) {
                    ap4 ap4Var3 = (ap4) ml6Var2;
                    long j8 = ap4Var3.c;
                    long j9 = ap4Var3.d;
                    nkkVar3.F(10);
                    int f2 = nkkVar3.f();
                    if (f2 <= 0) {
                        r0hVar = null;
                        lxcVar = lxcVar2;
                    } else {
                        int i17 = lxcVar2.e;
                        long D2 = lik.D(f2, (i17 >= 32000 ? 1152 : 576) * 1000000, i17);
                        int x = nkkVar3.x();
                        int x2 = nkkVar3.x();
                        int x3 = nkkVar3.x();
                        nkkVar3.F(2);
                        long j10 = lxcVar2.d + j9;
                        long[] jArr4 = new long[x];
                        long[] jArr5 = new long[x];
                        int i18 = 0;
                        while (true) {
                            if (i18 < x) {
                                jArr4[i18] = (i18 * D2) / x;
                                jArr5[i18] = Math.max(j9, j10);
                                if (x3 == 1) {
                                    s = nkkVar3.s();
                                } else if (x3 == 2) {
                                    s = nkkVar3.x();
                                } else if (x3 == 3) {
                                    s = nkkVar3.u();
                                } else {
                                    if (x3 != 4) {
                                        r0hVar = null;
                                        break;
                                    }
                                    s = nkkVar3.v();
                                }
                                j9 += x2 * s;
                                i18++;
                            } else {
                                if (j8 != -1 && j8 != j9) {
                                    m6k.f0();
                                }
                                r0hVar = new slk(jArr4, jArr5, D2, j9);
                            }
                        }
                        lxcVar = lxcVar2;
                    }
                    ap4Var3.skipFully(lxcVar.d);
                    vwcVar = this;
                    ml6Var2 = ml6Var;
                    metadata = vwcVar.j;
                    ap4 ap4Var222 = (ap4) ml6Var2;
                    long j522 = ap4Var222.d;
                    if (metadata != null) {
                    }
                    nkkVar = nkkVar2;
                    alcVar = null;
                    if (vwcVar.p) {
                    }
                    vwcVar.o = a;
                    vwcVar.f.d(a);
                    usj usjVar222 = vwcVar.h;
                    pm8 pm8Var222 = new pm8();
                    pm8Var222.k = lxcVar.c;
                    pm8Var222.l = 4096;
                    pm8Var222.x = lxcVar.f;
                    pm8Var222.y = lxcVar.e;
                    pm8Var222.A = gv8Var.a;
                    pm8Var222.B = gv8Var.b;
                    pm8Var222.i = vwcVar.j;
                    usjVar222.a(new sm8(pm8Var222));
                    vwcVar.m = ap4Var222.d;
                } else {
                    lxcVar = lxcVar2;
                    ((ap4) ml6Var).f = 0;
                    vwcVar = this;
                    ml6Var2 = ml6Var;
                    r0hVar = null;
                    metadata = vwcVar.j;
                    ap4 ap4Var2222 = (ap4) ml6Var2;
                    long j5222 = ap4Var2222.d;
                    if (metadata != null) {
                    }
                    nkkVar = nkkVar2;
                    alcVar = null;
                    if (vwcVar.p) {
                    }
                    vwcVar.o = a;
                    vwcVar.f.d(a);
                    usj usjVar2222 = vwcVar.h;
                    pm8 pm8Var2222 = new pm8();
                    pm8Var2222.k = lxcVar.c;
                    pm8Var2222.l = 4096;
                    pm8Var2222.x = lxcVar.f;
                    pm8Var2222.y = lxcVar.e;
                    pm8Var2222.A = gv8Var.a;
                    pm8Var2222.B = gv8Var.b;
                    pm8Var2222.i = vwcVar.j;
                    usjVar2222.a(new sm8(pm8Var2222));
                    vwcVar.m = ap4Var2222.d;
                }
            }
            if (nkkVar3.c >= 40) {
                nkkVar3.E(36);
                if (nkkVar3.f() == 1447187017) {
                    i3 = 1447187017;
                    gv8Var = vwcVar.c;
                    if (i3 != 1483304551) {
                    }
                    lxcVar = lxcVar2;
                    ap4Var = (ap4) ml6Var;
                    long j32 = ap4Var.c;
                    long j42 = ap4Var.d;
                    int i112 = lxcVar.h;
                    int i122 = lxcVar.e;
                    f = nkkVar3.f();
                    if ((f & 1) == 1) {
                    }
                    r0hVar = null;
                    if (r0hVar != null) {
                        ap4Var.f = 0;
                        ap4Var.b(i10 + 141, false);
                        ap4Var.peekFully(nkkVar2.a, 0, 3, false);
                        nkkVar2.E(0);
                        int u2 = nkkVar2.u();
                        i4 = u2 >> 12;
                        i5 = u2 & 4095;
                        if (i4 <= 0) {
                        }
                        gv8Var.a = i4;
                        gv8Var.b = i5;
                    }
                    ap4Var.skipFully(lxcVar.d);
                    if (r0hVar != null) {
                        vwcVar = this;
                        ml6Var2 = ml6Var;
                        r0hVar = vwcVar.a(ml6Var2, false);
                        metadata = vwcVar.j;
                        ap4 ap4Var22222 = (ap4) ml6Var2;
                        long j52222 = ap4Var22222.d;
                        if (metadata != null) {
                        }
                        nkkVar = nkkVar2;
                        alcVar = null;
                        if (vwcVar.p) {
                        }
                        vwcVar.o = a;
                        vwcVar.f.d(a);
                        usj usjVar22222 = vwcVar.h;
                        pm8 pm8Var22222 = new pm8();
                        pm8Var22222.k = lxcVar.c;
                        pm8Var22222.l = 4096;
                        pm8Var22222.x = lxcVar.f;
                        pm8Var22222.y = lxcVar.e;
                        pm8Var22222.A = gv8Var.a;
                        pm8Var22222.B = gv8Var.b;
                        pm8Var22222.i = vwcVar.j;
                        usjVar22222.a(new sm8(pm8Var22222));
                        vwcVar.m = ap4Var22222.d;
                    }
                    vwcVar = this;
                    ml6Var2 = ml6Var;
                    metadata = vwcVar.j;
                    ap4 ap4Var222222 = (ap4) ml6Var2;
                    long j522222 = ap4Var222222.d;
                    if (metadata != null) {
                    }
                    nkkVar = nkkVar2;
                    alcVar = null;
                    if (vwcVar.p) {
                    }
                    vwcVar.o = a;
                    vwcVar.f.d(a);
                    usj usjVar222222 = vwcVar.h;
                    pm8 pm8Var222222 = new pm8();
                    pm8Var222222.k = lxcVar.c;
                    pm8Var222222.l = 4096;
                    pm8Var222222.x = lxcVar.f;
                    pm8Var222222.y = lxcVar.e;
                    pm8Var222222.A = gv8Var.a;
                    pm8Var222222.B = gv8Var.b;
                    pm8Var222222.i = vwcVar.j;
                    usjVar222222.a(new sm8(pm8Var222222));
                    vwcVar.m = ap4Var222222.d;
                }
            }
            i3 = 0;
            gv8Var = vwcVar.c;
            if (i3 != 1483304551) {
            }
            lxcVar = lxcVar2;
            ap4Var = (ap4) ml6Var;
            long j322 = ap4Var.c;
            long j422 = ap4Var.d;
            int i1122 = lxcVar.h;
            int i1222 = lxcVar.e;
            f = nkkVar3.f();
            if ((f & 1) == 1) {
            }
            r0hVar = null;
            if (r0hVar != null) {
            }
            ap4Var.skipFully(lxcVar.d);
            if (r0hVar != null) {
            }
            vwcVar = this;
            ml6Var2 = ml6Var;
            metadata = vwcVar.j;
            ap4 ap4Var2222222 = (ap4) ml6Var2;
            long j5222222 = ap4Var2222222.d;
            if (metadata != null) {
            }
            nkkVar = nkkVar2;
            alcVar = null;
            if (vwcVar.p) {
            }
            vwcVar.o = a;
            vwcVar.f.d(a);
            usj usjVar2222222 = vwcVar.h;
            pm8 pm8Var2222222 = new pm8();
            pm8Var2222222.k = lxcVar.c;
            pm8Var2222222.l = 4096;
            pm8Var2222222.x = lxcVar.f;
            pm8Var2222222.y = lxcVar.e;
            pm8Var2222222.A = gv8Var.a;
            pm8Var2222222.B = gv8Var.b;
            pm8Var2222222.i = vwcVar.j;
            usjVar2222222.a(new sm8(pm8Var2222222));
            vwcVar.m = ap4Var2222222.d;
        } else {
            lxcVar = lxcVar2;
            nkkVar = nkkVar2;
            th = null;
            j = 1000000;
            long j11 = vwcVar.m;
            if (j11 != 0) {
                long j12 = ((ap4) ml6Var2).d;
                if (j12 < j11) {
                    ((ap4) ml6Var2).skipFully((int) (j11 - j12));
                }
            }
        }
        if (vwcVar.n == 0) {
            ((ap4) ml6Var2).f = 0;
            if (!e(ml6Var)) {
                nkk nkkVar4 = nkkVar;
                nkkVar4.E(0);
                int f3 = nkkVar4.f();
                if (((-128000) & f3) != (vwcVar.i & (-128000)) || yso.B(f3) == -1) {
                    ((ap4) ml6Var2).skipFully(1);
                    vwcVar.i = 0;
                    i = -1;
                    i2 = 0;
                    if (i2 == i) {
                        r0h r0hVar3 = vwcVar.o;
                        if (r0hVar3 instanceof y0a) {
                            if (r0hVar3.getDurationUs() != ((vwcVar.l * j) / lxcVar.e) + vwcVar.k) {
                                r0h r0hVar4 = vwcVar.o;
                                ((y0a) r0hVar4).getClass();
                                vwcVar.f.d(r0hVar4);
                            }
                        }
                    }
                    return i2;
                }
                lxcVar.a(f3);
                long j13 = vwcVar.k;
                if (j13 == C.TIME_UNSET) {
                    j13 = vwcVar.o.getTimeUs(((ap4) ml6Var2).d);
                    vwcVar.k = j13;
                }
                vwcVar.n = lxcVar.d;
                r0h r0hVar5 = vwcVar.o;
                if (r0hVar5 instanceof y0a) {
                    y0a y0aVar = (y0a) r0hVar5;
                    if (!y0aVar.b((((vwcVar.l + lxcVar.h) * j) / lxcVar.e) + j13)) {
                        throw th;
                    }
                    if (vwcVar.q && y0aVar.b(vwcVar.r)) {
                        vwcVar.q = false;
                        vwcVar.h = vwcVar.g;
                    }
                }
            }
            i = -1;
            i2 = -1;
            if (i2 == i) {
            }
            return i2;
        }
        int b = vwcVar.h.b(ml6Var2, vwcVar.n, true);
        if (b != -1) {
            int i19 = vwcVar.n - b;
            vwcVar.n = i19;
            if (i19 <= 0) {
                vwcVar.h.c(vwcVar.k + ((vwcVar.l * j) / lxcVar.e), 1, lxcVar.d, 0, null);
                vwcVar.l += lxcVar.h;
                vwcVar.n = 0;
                i2 = 0;
                i = -1;
                if (i2 == i) {
                }
                return i2;
            }
            i = -1;
            i2 = 0;
            if (i2 == i) {
            }
            return i2;
        }
        i = -1;
        i2 = -1;
        if (i2 == i) {
        }
        return i2;
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.f = ol6Var;
        usj track = ol6Var.track(0, 1);
        this.g = track;
        this.h = track;
        this.f.endTracks();
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        return f(ml6Var, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.getPeekPosition() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(ml6 ml6Var) {
        r0h r0hVar = this.o;
        if (r0hVar != null) {
            long a = r0hVar.a();
            if (a != -1) {
            }
        }
        try {
            return !ml6Var.peekFully(this.a.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d8, code lost:
    
        if (r19 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        r18.skipFully(r3 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
    
        r17.i = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e4, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00df, code lost:
    
        r18.resetPeekPosition();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(ml6 ml6Var, boolean z) {
        int i;
        int i2;
        int B;
        int i3 = z ? 32768 : 131072;
        ml6Var.resetPeekPosition();
        if (ml6Var.getPosition() == 0) {
            nkk nkkVar = (nkk) this.d.b;
            Metadata metadata = null;
            int i4 = 0;
            while (true) {
                try {
                    ml6Var.peekFully(nkkVar.a, 0, 10);
                    nkkVar.E(0);
                    if (nkkVar.u() != 4801587) {
                        break;
                    }
                    nkkVar.F(3);
                    int r = nkkVar.r();
                    int i5 = r + 10;
                    if (metadata == null) {
                        byte[] bArr = new byte[i5];
                        System.arraycopy(nkkVar.a, 0, bArr, 0, 10);
                        ml6Var.peekFully(bArr, 10, r);
                        metadata = new wq9(null).G(i5, bArr);
                    } else {
                        ml6Var.advancePeekPosition(r);
                    }
                    i4 += i5;
                } catch (EOFException unused) {
                }
            }
            ml6Var.resetPeekPosition();
            ml6Var.advancePeekPosition(i4);
            this.j = metadata;
            if (metadata != null) {
                this.c.b(metadata);
            }
            i = (int) ml6Var.getPeekPosition();
            if (!z) {
                ml6Var.skipFully(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i6 = i2;
        int i7 = i6;
        while (true) {
            if (!e(ml6Var)) {
                nkk nkkVar2 = this.a;
                nkkVar2.E(0);
                int f = nkkVar2.f();
                if ((i2 == 0 || ((-128000) & f) == (i2 & (-128000))) && (B = yso.B(f)) != -1) {
                    i6++;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            break;
                        }
                    } else {
                        this.b.a(f);
                        i2 = f;
                    }
                    ml6Var.advancePeekPosition(B - 4);
                } else {
                    int i8 = i7 + 1;
                    if (i7 == i3) {
                        if (z) {
                            return false;
                        }
                        throw r9e.a("Searched too many bytes.", null);
                    }
                    if (z) {
                        ml6Var.resetPeekPosition();
                        ml6Var.advancePeekPosition(i + i8);
                    } else {
                        ml6Var.skipFully(1);
                    }
                    i6 = 0;
                    i7 = i8;
                    i2 = 0;
                }
            } else if (i6 <= 0) {
                a70.q();
                return false;
            }
        }
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        this.i = 0;
        this.k = C.TIME_UNSET;
        this.l = 0L;
        this.n = 0;
        this.r = j2;
        r0h r0hVar = this.o;
        if (!(r0hVar instanceof y0a) || ((y0a) r0hVar).b(j2)) {
            return;
        }
        this.q = true;
        this.h = this.e;
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
