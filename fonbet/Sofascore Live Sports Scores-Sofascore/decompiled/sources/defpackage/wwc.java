package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wwc implements ll6 {
    public final long a;
    public final j9e b;
    public final lxc c;
    public final hv8 d;
    public final t9d e;
    public final q35 f;
    public pl6 g;
    public vsj h;
    public vsj i;
    public int j;
    public ric k;
    public ric l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public s0h r;
    public boolean s;
    public boolean t;
    public long u;

    public wwc(long j) {
        this.a = j;
        this.b = new j9e(10);
        this.c = new lxc(1);
        this.d = new hv8();
        this.m = C.TIME_UNSET;
        this.e = new t9d(26);
        q35 q35Var = new q35();
        this.f = q35Var;
        this.i = q35Var;
        this.p = -1L;
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        return h(nl6Var, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (r3 != 1231971951) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x034c, code lost:
    
        if (defpackage.u3f.a.apply(r9) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0385, code lost:
    
        if (((defpackage.cdj) r10).a.equals("TLEN") != false) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x032b  */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v50 */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        lxc lxcVar;
        Throwable th;
        int i;
        long j;
        j9e j9eVar;
        long j2;
        long j3;
        ?? r4;
        int i2;
        int i3;
        int i4;
        int i5;
        hv8 hv8Var;
        lxc lxcVar2;
        int i6;
        int m;
        long[] jArr;
        ywc ywcVar;
        int i7;
        int i8;
        long j4;
        long j5;
        long j6;
        long j7;
        s0h dl3Var;
        ric ricVar;
        lic licVar;
        lic licVar2;
        char c;
        long T;
        blc blcVar;
        hv8 hv8Var2;
        boolean z;
        s0h s0hVar;
        boolean z2;
        ric ricVar2;
        long j8;
        long j9;
        int A;
        this.h.getClass();
        String str = nik.a;
        int i9 = this.j;
        int i10 = 0;
        lxc lxcVar3 = this.c;
        if (i9 == 0) {
            try {
                h(nl6Var, false);
            } catch (EOFException unused) {
                lxcVar = lxcVar3;
                th = null;
                i = -1;
                i10 = -1;
                j = 1000000;
            }
        }
        s0h s0hVar2 = this.r;
        j9e j9eVar2 = this.b;
        if (s0hVar2 == null) {
            j9e j9eVar3 = new j9e(lxcVar3.d);
            th = null;
            nl6Var.peekFully(j9eVar3.a, 0, lxcVar3.d);
            int i11 = lxcVar3.b & 1;
            int i12 = lxcVar3.f;
            int i13 = 21;
            j = 1000000;
            if (i11 != 0) {
                if (i12 != 1) {
                    i2 = 36;
                    i3 = j9eVar3.c;
                    i4 = i2 + 4;
                    j2 = C.TIME_UNSET;
                    if (i3 >= i4) {
                        j9eVar3.N(i2);
                        i5 = j9eVar3.m();
                        if (i5 != 1483304551) {
                        }
                        hv8Var = this.d;
                        if (i5 != 1231971951) {
                            if (i5 == 1447187017) {
                                long length = nl6Var.getLength();
                                long position = nl6Var.getPosition();
                                j9eVar3.O(6);
                                i6 = 0;
                                long j10 = position + lxcVar3.d;
                                long m2 = j10 + j9eVar3.m();
                                int m3 = j9eVar3.m();
                                if (m3 <= 0) {
                                    dl3Var = null;
                                    lxcVar2 = lxcVar3;
                                } else {
                                    long Z = nik.Z(lxcVar3.e, (m3 * lxcVar3.h) - 1);
                                    int H = j9eVar3.H();
                                    int H2 = j9eVar3.H();
                                    int H3 = j9eVar3.H();
                                    j9eVar3.O(2);
                                    long[] jArr2 = new long[H];
                                    long[] jArr3 = new long[H];
                                    lxc lxcVar4 = lxcVar3;
                                    long j11 = position + lxcVar3.d;
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < H) {
                                            long[] jArr4 = jArr3;
                                            lxc lxcVar5 = lxcVar4;
                                            int i15 = i14;
                                            long[] jArr5 = jArr2;
                                            jArr5[i15] = (i14 * Z) / H;
                                            jArr4[i15] = j11;
                                            if (H3 == 1) {
                                                A = j9eVar3.A();
                                            } else if (H3 == 2) {
                                                A = j9eVar3.H();
                                            } else if (H3 == 3) {
                                                A = j9eVar3.D();
                                            } else {
                                                if (H3 != 4) {
                                                    dl3Var = null;
                                                    lxcVar2 = lxcVar5;
                                                    break;
                                                }
                                                A = j9eVar3.E();
                                            }
                                            j11 += A * H2;
                                            i14 = i15 + 1;
                                            jArr3 = jArr4;
                                            lxcVar4 = lxcVar5;
                                            jArr2 = jArr5;
                                        } else {
                                            long[] jArr6 = jArr2;
                                            long[] jArr7 = jArr3;
                                            lxc lxcVar6 = lxcVar4;
                                            if (length == -1 || length == m2) {
                                                j8 = m2;
                                            } else {
                                                StringBuilder o = ljg.o("VBRI data size mismatch: ", length, ", ");
                                                j8 = m2;
                                                o.append(j8);
                                                tgj.d0(o.toString());
                                            }
                                            if (j8 != j11) {
                                                StringBuilder o2 = ljg.o("VBRI bytes and ToC mismatch (using max): ", j8, ", ");
                                                o2.append(j11);
                                                o2.append("\nSeeking will be inaccurate.");
                                                tgj.d0(o2.toString());
                                                j9 = Math.max(j8, j11);
                                            } else {
                                                j9 = j8;
                                            }
                                            lxcVar2 = lxcVar6;
                                            dl3Var = new tlk(jArr6, jArr7, Z, j10, j9, lxcVar2.g);
                                        }
                                    }
                                }
                                nl6Var.skipFully(lxcVar2.d);
                            } else if (i5 != 1483304551) {
                                nl6Var.resetPeekPosition();
                                dl3Var = null;
                                lxcVar2 = lxcVar3;
                                i6 = 0;
                            }
                            ricVar = this.k;
                            long position2 = nl6Var.getPosition();
                            if (ricVar != null) {
                                lic[] licVarArr = ricVar.a;
                                int length2 = licVarArr.length;
                                int i16 = i6;
                                while (true) {
                                    if (i16 >= length2) {
                                        licVar = null;
                                        break;
                                    }
                                    lic licVar3 = licVarArr[i16];
                                    if (zkc.class.isAssignableFrom(licVar3.getClass())) {
                                        licVar = (lic) zkc.class.cast(licVar3);
                                    }
                                    licVar = null;
                                    if (licVar != null) {
                                        break;
                                    }
                                    i16++;
                                }
                                zkc zkcVar = (zkc) licVar;
                                if (zkcVar != null) {
                                    int[] iArr = zkcVar.e;
                                    lic[] licVarArr2 = ricVar.a;
                                    int length3 = licVarArr2.length;
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= length3) {
                                            licVar2 = null;
                                            break;
                                        }
                                        lic licVar4 = licVarArr2[i17];
                                        if (cdj.class.isAssignableFrom(licVar4.getClass())) {
                                            licVar2 = (lic) cdj.class.cast(licVar4);
                                        }
                                        licVar2 = null;
                                        if (licVar2 != null) {
                                            break;
                                        }
                                        i17++;
                                    }
                                    cdj cdjVar = (cdj) licVar2;
                                    if (cdjVar == null) {
                                        T = -9223372036854775807L;
                                        c = 0;
                                    } else {
                                        c = 0;
                                        T = nik.T(Long.parseLong((String) cdjVar.c.get(0)));
                                    }
                                    int length4 = iArr.length;
                                    int i18 = length4 + 1;
                                    long[] jArr8 = new long[i18];
                                    long[] jArr9 = new long[i18];
                                    jArr8[c] = position2;
                                    jArr9[c] = 0;
                                    long j12 = 0;
                                    int i19 = 1;
                                    while (i19 <= length4) {
                                        int i20 = i19 - 1;
                                        long j13 = position2 + zkcVar.c + iArr[i20];
                                        j12 += zkcVar.d + zkcVar.f[i20];
                                        jArr8[i19] = j13;
                                        jArr9[i19] = j12;
                                        i19++;
                                        length4 = length4;
                                        position2 = j13;
                                    }
                                    blcVar = new blc(jArr8, jArr9, T);
                                    if (this.s) {
                                        if (blcVar != null) {
                                            dl3Var = blcVar;
                                        } else if (dl3Var == null) {
                                            dl3Var = null;
                                        }
                                        if (dl3Var == null) {
                                            int i21 = i6;
                                            nl6Var.peekFully(j9eVar2.a, i21, 4);
                                            j9eVar2.N(i21);
                                            lxcVar2.a(j9eVar2.m());
                                            j9eVar = j9eVar2;
                                            hv8Var2 = hv8Var;
                                            j2 = -9223372036854775807L;
                                            lxcVar = lxcVar2;
                                            z = true;
                                            i10 = 0;
                                            dl3Var = new dl3(nl6Var.getLength(), nl6Var.getPosition(), lxcVar2.g, lxcVar2.d, false, true);
                                        } else {
                                            j2 = -9223372036854775807L;
                                            j9eVar = j9eVar2;
                                            hv8Var2 = hv8Var;
                                            lxcVar = lxcVar2;
                                            z = true;
                                            i10 = 0;
                                        }
                                        dl3Var.isSeekable();
                                        dl3Var.isSeekable();
                                        this.h.f(dl3Var.getDurationUs());
                                        s0hVar = dl3Var;
                                        z2 = z;
                                    } else {
                                        s0hVar = new q0h(C.TIME_UNSET);
                                        j9eVar = j9eVar2;
                                        hv8Var2 = hv8Var;
                                        lxcVar = lxcVar2;
                                        z2 = true;
                                        i10 = 0;
                                    }
                                    this.r = s0hVar;
                                    this.g.m(s0hVar);
                                    ricVar2 = this.k;
                                    ric ricVar3 = this.l;
                                    if (ricVar2 != null) {
                                        if (ricVar3 != null) {
                                            ricVar2 = ricVar2.b(ricVar3);
                                        }
                                        ricVar3 = ricVar2;
                                    }
                                    qm8 qm8Var = new qm8();
                                    qm8Var.m = sjc.p(MimeTypes.AUDIO_MPEG);
                                    qm8Var.n = sjc.p(lxcVar.c);
                                    qm8Var.o = 4096;
                                    qm8Var.F = lxcVar.f;
                                    qm8Var.G = lxcVar.e;
                                    qm8Var.I = hv8Var2.a;
                                    qm8Var.J = hv8Var2.b;
                                    qm8Var.k = ricVar3;
                                    if (this.r.c() != -2147483647) {
                                        qm8Var.h = this.r.c();
                                    }
                                    this.i.d(new b(qm8Var));
                                    this.o = nl6Var.getPosition();
                                    j3 = 0;
                                    r4 = z2;
                                }
                            }
                            blcVar = null;
                            if (this.s) {
                            }
                            this.r = s0hVar;
                            this.g.m(s0hVar);
                            ricVar2 = this.k;
                            ric ricVar32 = this.l;
                            if (ricVar2 != null) {
                            }
                            qm8 qm8Var2 = new qm8();
                            qm8Var2.m = sjc.p(MimeTypes.AUDIO_MPEG);
                            qm8Var2.n = sjc.p(lxcVar.c);
                            qm8Var2.o = 4096;
                            qm8Var2.F = lxcVar.f;
                            qm8Var2.G = lxcVar.e;
                            qm8Var2.I = hv8Var2.a;
                            qm8Var2.J = hv8Var2.b;
                            qm8Var2.k = ricVar32;
                            if (this.r.c() != -2147483647) {
                            }
                            this.i.d(new b(qm8Var2));
                            this.o = nl6Var.getPosition();
                            j3 = 0;
                            r4 = z2;
                        }
                        lxcVar2 = lxcVar3;
                        i6 = 0;
                        m = j9eVar3.m();
                        int E = (m & 1) == 0 ? j9eVar3.E() : -1;
                        long C = (m & 2) == 0 ? j9eVar3.C() : -1L;
                        if ((m & 4) != 4) {
                            long[] jArr10 = new long[100];
                            int i22 = 0;
                            for (int i23 = 100; i22 < i23; i23 = 100) {
                                jArr10[i22] = j9eVar3.A();
                                i22++;
                            }
                            jArr = jArr10;
                        } else {
                            jArr = null;
                        }
                        if ((m & 8) != 0) {
                            j9eVar3.O(4);
                        }
                        if (j9eVar3.a() < 24) {
                            j9eVar3.O(11);
                            float intBitsToFloat = Float.intBitsToFloat(j9eVar3.m());
                            int H4 = j9eVar3.H();
                            int H5 = j9eVar3.H();
                            xwc a = xwc.a(H4);
                            xwc a2 = xwc.a(H5);
                            ywcVar = (intBitsToFloat <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a == null && a2 == null) ? null : new ywc(intBitsToFloat, a, a2);
                            j9eVar3.O(2);
                            int D = j9eVar3.D();
                            i8 = (16773120 & D) >> 12;
                            i7 = D & 4095;
                        } else {
                            ywcVar = null;
                            i7 = -1;
                            i8 = -1;
                        }
                        long j14 = E;
                        int i24 = lxcVar2.d;
                        int i25 = lxcVar2.e;
                        int i26 = lxcVar2.g;
                        int i27 = lxcVar2.h;
                        ywc ywcVar2 = ywcVar;
                        if ((hv8Var.a != -1 || hv8Var.b == -1) && i8 != -1 && i7 != -1) {
                            hv8Var.a = i8;
                            hv8Var.b = i7;
                        }
                        this.l = ywcVar2 == null ? new ric(ywcVar2) : null;
                        long position3 = nl6Var.getPosition();
                        nl6Var.skipFully(lxcVar2.d);
                        if (i5 != 1483304551) {
                            long length5 = nl6Var.getLength();
                            long Z2 = (j14 == -1 || j14 == 0) ? -9223372036854775807L : nik.Z(i25, (j14 * i27) - 1);
                            if (Z2 != C.TIME_UNSET) {
                                if (C != -1 && length5 != -1 && position3 + C != length5) {
                                    long j15 = length5 - position3;
                                    StringBuilder o3 = ljg.o("Data size mismatch between stream (", j15, ") and Xing frame (");
                                    o3.append(C);
                                    o3.append("), using smaller value.");
                                    tgj.O(o3.toString());
                                    C = Math.min(C, j15);
                                }
                                dl3Var = new vml(position3, i24, Z2, i26, C, jArr);
                                ricVar = this.k;
                                long position22 = nl6Var.getPosition();
                                if (ricVar != null) {
                                }
                                blcVar = null;
                                if (this.s) {
                                }
                                this.r = s0hVar;
                                this.g.m(s0hVar);
                                ricVar2 = this.k;
                                ric ricVar322 = this.l;
                                if (ricVar2 != null) {
                                }
                                qm8 qm8Var22 = new qm8();
                                qm8Var22.m = sjc.p(MimeTypes.AUDIO_MPEG);
                                qm8Var22.n = sjc.p(lxcVar.c);
                                qm8Var22.o = 4096;
                                qm8Var22.F = lxcVar.f;
                                qm8Var22.G = lxcVar.e;
                                qm8Var22.I = hv8Var2.a;
                                qm8Var22.J = hv8Var2.b;
                                qm8Var22.k = ricVar322;
                                if (this.r.c() != -2147483647) {
                                }
                                this.i.d(new b(qm8Var22));
                                this.o = nl6Var.getPosition();
                                j3 = 0;
                                r4 = z2;
                            }
                            dl3Var = null;
                            ricVar = this.k;
                            long position222 = nl6Var.getPosition();
                            if (ricVar != null) {
                            }
                            blcVar = null;
                            if (this.s) {
                            }
                            this.r = s0hVar;
                            this.g.m(s0hVar);
                            ricVar2 = this.k;
                            ric ricVar3222 = this.l;
                            if (ricVar2 != null) {
                            }
                            qm8 qm8Var222 = new qm8();
                            qm8Var222.m = sjc.p(MimeTypes.AUDIO_MPEG);
                            qm8Var222.n = sjc.p(lxcVar.c);
                            qm8Var222.o = 4096;
                            qm8Var222.F = lxcVar.f;
                            qm8Var222.G = lxcVar.e;
                            qm8Var222.I = hv8Var2.a;
                            qm8Var222.J = hv8Var2.b;
                            qm8Var222.k = ricVar3222;
                            if (this.r.c() != -2147483647) {
                            }
                            this.i.d(new b(qm8Var222));
                            this.o = nl6Var.getPosition();
                            j3 = 0;
                            r4 = z2;
                        } else {
                            long length6 = nl6Var.getLength();
                            if (j14 == -1 || j14 == 0) {
                                j4 = length6;
                                j5 = -9223372036854775807L;
                            } else {
                                j4 = length6;
                                j5 = nik.Z(i25, (i27 * j14) - 1);
                            }
                            if (j5 != C.TIME_UNSET) {
                                if (C != -1) {
                                    long j16 = position3 + C;
                                    j6 = C - i24;
                                    j7 = j16;
                                } else if (j4 != -1) {
                                    j6 = (j4 - position3) - i24;
                                    j7 = j4;
                                }
                                long j17 = j6;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                dl3Var = new dl3(j7, position3 + i24, jaa.s(nik.b0(j17, 8000000L, j5, roundingMode)), jaa.s(i9a.x(j17, j14, roundingMode)), false, true);
                                ricVar = this.k;
                                long position2222 = nl6Var.getPosition();
                                if (ricVar != null) {
                                }
                                blcVar = null;
                                if (this.s) {
                                }
                                this.r = s0hVar;
                                this.g.m(s0hVar);
                                ricVar2 = this.k;
                                ric ricVar32222 = this.l;
                                if (ricVar2 != null) {
                                }
                                qm8 qm8Var2222 = new qm8();
                                qm8Var2222.m = sjc.p(MimeTypes.AUDIO_MPEG);
                                qm8Var2222.n = sjc.p(lxcVar.c);
                                qm8Var2222.o = 4096;
                                qm8Var2222.F = lxcVar.f;
                                qm8Var2222.G = lxcVar.e;
                                qm8Var2222.I = hv8Var2.a;
                                qm8Var2222.J = hv8Var2.b;
                                qm8Var2222.k = ricVar32222;
                                if (this.r.c() != -2147483647) {
                                }
                                this.i.d(new b(qm8Var2222));
                                this.o = nl6Var.getPosition();
                                j3 = 0;
                                r4 = z2;
                            }
                            dl3Var = null;
                            ricVar = this.k;
                            long position22222 = nl6Var.getPosition();
                            if (ricVar != null) {
                            }
                            blcVar = null;
                            if (this.s) {
                            }
                            this.r = s0hVar;
                            this.g.m(s0hVar);
                            ricVar2 = this.k;
                            ric ricVar322222 = this.l;
                            if (ricVar2 != null) {
                            }
                            qm8 qm8Var22222 = new qm8();
                            qm8Var22222.m = sjc.p(MimeTypes.AUDIO_MPEG);
                            qm8Var22222.n = sjc.p(lxcVar.c);
                            qm8Var22222.o = 4096;
                            qm8Var22222.F = lxcVar.f;
                            qm8Var22222.G = lxcVar.e;
                            qm8Var22222.I = hv8Var2.a;
                            qm8Var22222.J = hv8Var2.b;
                            qm8Var22222.k = ricVar322222;
                            if (this.r.c() != -2147483647) {
                            }
                            this.i.d(new b(qm8Var22222));
                            this.o = nl6Var.getPosition();
                            j3 = 0;
                            r4 = z2;
                        }
                    }
                    if (j9eVar3.c >= 40) {
                        j9eVar3.N(36);
                        if (j9eVar3.m() == 1447187017) {
                            i5 = 1447187017;
                            hv8Var = this.d;
                            if (i5 != 1231971951) {
                            }
                            lxcVar2 = lxcVar3;
                            i6 = 0;
                            m = j9eVar3.m();
                            if ((m & 1) == 0) {
                            }
                            if ((m & 2) == 0) {
                            }
                            if ((m & 4) != 4) {
                            }
                            if ((m & 8) != 0) {
                            }
                            if (j9eVar3.a() < 24) {
                            }
                            long j142 = E;
                            int i242 = lxcVar2.d;
                            int i252 = lxcVar2.e;
                            int i262 = lxcVar2.g;
                            int i272 = lxcVar2.h;
                            ywc ywcVar22 = ywcVar;
                            if (hv8Var.a != -1) {
                            }
                            hv8Var.a = i8;
                            hv8Var.b = i7;
                            this.l = ywcVar22 == null ? new ric(ywcVar22) : null;
                            long position32 = nl6Var.getPosition();
                            nl6Var.skipFully(lxcVar2.d);
                            if (i5 != 1483304551) {
                            }
                        }
                    }
                    i5 = 0;
                    hv8Var = this.d;
                    if (i5 != 1231971951) {
                    }
                    lxcVar2 = lxcVar3;
                    i6 = 0;
                    m = j9eVar3.m();
                    if ((m & 1) == 0) {
                    }
                    if ((m & 2) == 0) {
                    }
                    if ((m & 4) != 4) {
                    }
                    if ((m & 8) != 0) {
                    }
                    if (j9eVar3.a() < 24) {
                    }
                    long j1422 = E;
                    int i2422 = lxcVar2.d;
                    int i2522 = lxcVar2.e;
                    int i2622 = lxcVar2.g;
                    int i2722 = lxcVar2.h;
                    ywc ywcVar222 = ywcVar;
                    if (hv8Var.a != -1) {
                    }
                    hv8Var.a = i8;
                    hv8Var.b = i7;
                    this.l = ywcVar222 == null ? new ric(ywcVar222) : null;
                    long position322 = nl6Var.getPosition();
                    nl6Var.skipFully(lxcVar2.d);
                    if (i5 != 1483304551) {
                    }
                }
            } else if (i12 == 1) {
                i13 = 13;
            }
            i2 = i13;
            i3 = j9eVar3.c;
            i4 = i2 + 4;
            j2 = C.TIME_UNSET;
            if (i3 >= i4) {
            }
            if (j9eVar3.c >= 40) {
            }
            i5 = 0;
            hv8Var = this.d;
            if (i5 != 1231971951) {
            }
            lxcVar2 = lxcVar3;
            i6 = 0;
            m = j9eVar3.m();
            if ((m & 1) == 0) {
            }
            if ((m & 2) == 0) {
            }
            if ((m & 4) != 4) {
            }
            if ((m & 8) != 0) {
            }
            if (j9eVar3.a() < 24) {
            }
            long j14222 = E;
            int i24222 = lxcVar2.d;
            int i25222 = lxcVar2.e;
            int i26222 = lxcVar2.g;
            int i27222 = lxcVar2.h;
            ywc ywcVar2222 = ywcVar;
            if (hv8Var.a != -1) {
            }
            hv8Var.a = i8;
            hv8Var.b = i7;
            this.l = ywcVar2222 == null ? new ric(ywcVar2222) : null;
            long position3222 = nl6Var.getPosition();
            nl6Var.skipFully(lxcVar2.d);
            if (i5 != 1483304551) {
            }
        } else {
            lxcVar = lxcVar3;
            j9eVar = j9eVar2;
            boolean z3 = true;
            th = null;
            j = 1000000;
            j2 = C.TIME_UNSET;
            j3 = 0;
            r4 = z3;
            if (this.o != 0) {
                long position4 = nl6Var.getPosition();
                long j18 = this.o;
                r4 = z3;
                if (position4 < j18) {
                    nl6Var.skipFully((int) (j18 - position4));
                    r4 = z3;
                }
            }
        }
        if (this.q == 0) {
            nl6Var.resetPeekPosition();
            if (!g(nl6Var)) {
                j9eVar.N(i10);
                int m4 = j9eVar.m();
                if (((-128000) & m4) != (this.j & (-128000)) || f5p.z(m4) == -1) {
                    nl6Var.skipFully(r4);
                    this.j = i10;
                    i = -1;
                    if (i10 == i) {
                        s0h s0hVar3 = this.r;
                        if (s0hVar3 instanceof z0a) {
                            if (s0hVar3.getDurationUs() != ((this.n * j) / lxcVar.e) + this.m) {
                                ((z0a) this.r).getClass();
                                throw th;
                            }
                        }
                    }
                    return i10;
                }
                lxcVar.a(m4);
                if (this.m == j2) {
                    this.m = this.r.getTimeUs(nl6Var.getPosition());
                    long j19 = this.a;
                    if (j19 != j2) {
                        this.m = (j19 - this.r.getTimeUs(j3)) + this.m;
                    }
                }
                this.q = lxcVar.d;
                this.p = nl6Var.getPosition() + lxcVar.d;
                if (this.r instanceof z0a) {
                    long j20 = ((this.n + lxcVar.h) * j) / lxcVar.e;
                    throw th;
                }
            }
            i = -1;
            i10 = -1;
            if (i10 == i) {
            }
            return i10;
        }
        int c2 = this.i.c(nl6Var, this.q, r4);
        if (c2 != -1) {
            int i28 = this.q - c2;
            this.q = i28;
            if (i28 <= 0) {
                this.i.a(this.m + ((this.n * j) / lxcVar.e), 1, lxcVar.d, 0, null);
                this.n += lxcVar.h;
                this.q = i10;
            }
            i = -1;
            if (i10 == i) {
            }
            return i10;
        }
        i = -1;
        i10 = -1;
        if (i10 == i) {
        }
        return i10;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.g = pl6Var;
        vsj mo2track = pl6Var.mo2track(0, 1);
        this.h = mo2track;
        this.i = mo2track;
        this.g.endTracks();
    }

    public final void f() {
        s0h s0hVar = this.r;
        if ((s0hVar instanceof dl3) && ((dl3) s0hVar).isSeekable()) {
            long j = this.p;
            if (j == -1 || j == this.r.a()) {
                return;
            }
            dl3 dl3Var = (dl3) this.r;
            this.r = new dl3(this.p, dl3Var.i, dl3Var.j, dl3Var.k, dl3Var.l, false);
            pl6 pl6Var = this.g;
            pl6Var.getClass();
            pl6Var.m(this.r);
            vsj vsjVar = this.h;
            vsjVar.getClass();
            vsjVar.f(this.r.getDurationUs());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.getPeekPosition() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(nl6 nl6Var) {
        s0h s0hVar = this.r;
        if (s0hVar != null) {
            long a = s0hVar.a();
            if (a != -1) {
            }
        }
        try {
            return !nl6Var.peekFully(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean h(nl6 nl6Var, boolean z) {
        int i;
        int i2;
        int z2;
        nl6Var.resetPeekPosition();
        if (nl6Var.getPosition() == 0) {
            ric l = this.e.l(nl6Var, null, 131072);
            this.k = l;
            if (l != null) {
                this.d.b(l);
            }
            i = (int) nl6Var.getPeekPosition();
            if (!z) {
                nl6Var.skipFully(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!g(nl6Var)) {
                j9e j9eVar = this.b;
                j9eVar.N(0);
                int m = j9eVar.m();
                if ((i2 == 0 || ((-128000) & m) == (i2 & (-128000))) && (z2 = f5p.z(m)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(m);
                        i2 = m;
                    }
                    nl6Var.advancePeekPosition(z2 - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == 131072) {
                        if (z) {
                            return false;
                        }
                        f();
                        a70.q();
                        return false;
                    }
                    if (z) {
                        nl6Var.resetPeekPosition();
                        nl6Var.advancePeekPosition(i + i5);
                    } else {
                        nl6Var.skipFully(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i2 = 0;
                }
            } else if (i3 <= 0) {
                f();
                a70.q();
                return false;
            }
        }
        if (z) {
            nl6Var.skipFully(i + i4);
        } else {
            nl6Var.resetPeekPosition();
        }
        this.j = i2;
        return true;
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        this.j = 0;
        this.m = C.TIME_UNSET;
        this.n = 0L;
        this.q = 0;
        this.p = -1L;
        this.u = j2;
        if (this.r instanceof z0a) {
            throw null;
        }
    }

    @Override // defpackage.ll6
    public final void release() {
    }

    public wwc(int i) {
        this(C.TIME_UNSET);
    }
}
