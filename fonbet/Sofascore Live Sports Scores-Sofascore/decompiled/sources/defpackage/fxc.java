package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fxc implements kl6, a0h {
    public int i;
    public long j;
    public int k;
    public nkk l;
    public int n;
    public int o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final v0h f = new v0h();
    public final ArrayList g = new ArrayList();
    public final nkk d = new nkk(16);
    public final ArrayDeque e = new ArrayDeque();
    public final nkk a = new nkk(hkg.r);
    public final nkk b = new nkk(4);
    public final nkk c = new nkk(4, false);
    public int m = -1;
    public ol6 q = ol6.o7;
    public dxc[] r = new dxc[0];

    public fxc(int i) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.kl6
    public final int b(ml6 ml6Var, b78 b78Var) {
        int i;
        long j;
        long j2;
        long position;
        long j3;
        char c;
        char c2;
        boolean z;
        rl0 rl0Var;
        while (true) {
            int i2 = this.h;
            ArrayDeque arrayDeque = this.e;
            nkk nkkVar = this.c;
            int i3 = 4;
            if (i2 != 0) {
                int i4 = 2;
                if (i2 != 1) {
                    if (i2 == 2) {
                        long position2 = ml6Var.getPosition();
                        int i5 = this.m;
                        if (i5 == -1) {
                            int i6 = -1;
                            int i7 = -1;
                            boolean z2 = true;
                            boolean z3 = true;
                            int i8 = 0;
                            long j4 = Long.MAX_VALUE;
                            long j5 = Long.MAX_VALUE;
                            long j6 = Long.MAX_VALUE;
                            while (true) {
                                dxc[] dxcVarArr = this.r;
                                if (i8 >= dxcVarArr.length) {
                                    break;
                                }
                                dxc dxcVar = dxcVarArr[i8];
                                int i9 = dxcVar.e;
                                wsj wsjVar = dxcVar.b;
                                if (i9 != wsjVar.b) {
                                    long j7 = wsjVar.c[i9];
                                    long[][] jArr = this.s;
                                    int i10 = lik.a;
                                    long j8 = jArr[i8][i9];
                                    long j9 = j7 - position2;
                                    boolean z4 = j9 < 0 || j9 >= 262144;
                                    if ((!z4 && z3) || (z4 == z3 && j9 < j6)) {
                                        z3 = z4;
                                        i7 = i8;
                                        j6 = j9;
                                        j5 = j8;
                                    }
                                    if (j8 < j4) {
                                        z2 = z4;
                                        i6 = i8;
                                        j4 = j8;
                                    }
                                }
                                i8++;
                            }
                            i5 = (j4 == Long.MAX_VALUE || !z2 || j5 < j4 + 10485760) ? i7 : i6;
                            this.m = i5;
                            if (i5 == -1) {
                                return -1;
                            }
                        }
                        dxc dxcVar2 = this.r[i5];
                        usj usjVar = dxcVar2.c;
                        isj isjVar = dxcVar2.a;
                        wsj wsjVar2 = dxcVar2.b;
                        int i11 = dxcVar2.e;
                        long j10 = wsjVar2.c[i11];
                        int i12 = wsjVar2.d[i11];
                        s1k s1kVar = dxcVar2.d;
                        long j11 = (j10 - position2) + this.n;
                        if (j11 < 0 || j11 >= 262144) {
                            b78Var.a = j10;
                            return 1;
                        }
                        if (isjVar.g == 1) {
                            j11 += 8;
                            i12 -= 8;
                        }
                        ml6Var.skipFully((int) j11);
                        int i13 = isjVar.j;
                        if (i13 == 0) {
                            if ("audio/ac4".equals(isjVar.f.l)) {
                                if (this.o == 0) {
                                    o02.Q(i12, nkkVar);
                                    usjVar.d(7, nkkVar);
                                    this.o += 7;
                                }
                                i12 += 7;
                            } else if (s1kVar != null) {
                                s1kVar.e(ml6Var);
                            }
                            while (true) {
                                int i14 = this.o;
                                if (i14 >= i12) {
                                    break;
                                }
                                int b = usjVar.b(ml6Var, i12 - i14, false);
                                this.n += b;
                                this.o += b;
                                this.p -= b;
                            }
                        } else {
                            nkk nkkVar2 = this.b;
                            byte[] bArr = nkkVar2.a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i15 = 4 - i13;
                            while (this.o < i12) {
                                int i16 = this.p;
                                if (i16 == 0) {
                                    ml6Var.readFully(bArr, i15, i13);
                                    this.n += i13;
                                    nkkVar2.E(0);
                                    int f = nkkVar2.f();
                                    if (f < 0) {
                                        throw r9e.a("Invalid NAL length", null);
                                    }
                                    this.p = f;
                                    nkk nkkVar3 = this.a;
                                    nkkVar3.E(0);
                                    usjVar.d(4, nkkVar3);
                                    this.o += 4;
                                    i12 += i15;
                                } else {
                                    int b2 = usjVar.b(ml6Var, i16, false);
                                    this.n += b2;
                                    this.o += b2;
                                    this.p -= b2;
                                }
                            }
                        }
                        int i17 = i12;
                        long j12 = wsjVar2.f[i11];
                        int i18 = wsjVar2.g[i11];
                        if (s1kVar != null) {
                            s1kVar.c(usjVar, j12, i18, i17, 0, null);
                            if (i11 + 1 == wsjVar2.b) {
                                s1kVar.a(usjVar, null);
                            }
                        } else {
                            usjVar.c(j12, i18, i17, 0, null);
                        }
                        dxcVar2.e++;
                        this.m = -1;
                        this.n = 0;
                        this.o = 0;
                        this.p = 0;
                        return 0;
                    }
                    if (i2 != 3) {
                        zzl.s();
                        return 0;
                    }
                    v0h v0hVar = this.f;
                    ArrayList arrayList = v0hVar.a;
                    int i19 = v0hVar.b;
                    if (i19 != 0) {
                        if (i19 != 1) {
                            int i20 = 8;
                            short s = 2816;
                            short s2 = 2192;
                            if (i19 == 2) {
                                long length = ml6Var.getLength();
                                int i21 = v0hVar.c - 20;
                                nkk nkkVar4 = new nkk(i21);
                                ml6Var.readFully(nkkVar4.a, 0, i21);
                                int i22 = 0;
                                while (i22 < i21 / 12) {
                                    nkkVar4.F(i4);
                                    byte[] bArr2 = nkkVar4.a;
                                    int i23 = nkkVar4.b;
                                    int i24 = i4;
                                    int i25 = i23 + 1;
                                    nkkVar4.b = i25;
                                    int i26 = bArr2[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    nkkVar4.b = i23 + 2;
                                    short s3 = (short) (((bArr2[i25] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i26);
                                    if (s3 != s2 && s3 != s) {
                                        if (s3 != 2817) {
                                            if (s3 != 2819 && s3 != 2820) {
                                                nkkVar4.F(i20);
                                                i22++;
                                                i4 = i24;
                                                s2 = 2192;
                                                s = 2816;
                                                i20 = 8;
                                            }
                                            arrayList.add(new t0h((length - v0hVar.c) - nkkVar4.h(), nkkVar4.h()));
                                            i22++;
                                            i4 = i24;
                                            s2 = 2192;
                                            s = 2816;
                                            i20 = 8;
                                        }
                                    }
                                    arrayList.add(new t0h((length - v0hVar.c) - nkkVar4.h(), nkkVar4.h()));
                                    i22++;
                                    i4 = i24;
                                    s2 = 2192;
                                    s = 2816;
                                    i20 = 8;
                                }
                                if (arrayList.isEmpty()) {
                                    b78Var.a = 0L;
                                    j3 = 0;
                                } else {
                                    v0hVar.b = 3;
                                    j3 = ((t0h) arrayList.get(0)).a;
                                    b78Var.a = j3;
                                }
                                j = j3;
                            } else {
                                if (i19 != 3) {
                                    zzl.s();
                                    return 0;
                                }
                                long position3 = ml6Var.getPosition();
                                int length2 = (int) ((ml6Var.getLength() - ml6Var.getPosition()) - v0hVar.c);
                                nkk nkkVar5 = new nkk(length2);
                                ml6Var.readFully(nkkVar5.a, 0, length2);
                                int i27 = 0;
                                while (i27 < arrayList.size()) {
                                    t0h t0hVar = (t0h) arrayList.get(i27);
                                    nkkVar5.E((int) (t0hVar.a - position3));
                                    nkkVar5.F(i3);
                                    int h = nkkVar5.h();
                                    Charset charset = xp2.c;
                                    String q = nkkVar5.q(h, charset);
                                    switch (q.hashCode()) {
                                        case -1711564334:
                                            if (q.equals("SlowMotion_Data")) {
                                                c = 0;
                                                break;
                                            }
                                            break;
                                        case -1332107749:
                                            if (q.equals("Super_SlowMotion_Edit_Data")) {
                                                c = 1;
                                                break;
                                            }
                                            break;
                                        case -1251387154:
                                            if (q.equals("Super_SlowMotion_Data")) {
                                                c = 2;
                                                break;
                                            }
                                            break;
                                        case -830665521:
                                            if (q.equals("Super_SlowMotion_Deflickering_On")) {
                                                c = 3;
                                                break;
                                            }
                                            break;
                                        case 1760745220:
                                            if (q.equals("Super_SlowMotion_BGM")) {
                                                c = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    c = 65535;
                                    switch (c) {
                                        case 0:
                                            c2 = 2192;
                                            break;
                                        case 1:
                                            c2 = 2819;
                                            break;
                                        case 2:
                                            c2 = 2816;
                                            break;
                                        case 3:
                                            c2 = 2820;
                                            break;
                                        case 4:
                                            c2 = 2817;
                                            break;
                                        default:
                                            throw r9e.a("Invalid SEF name", null);
                                    }
                                    int i28 = t0hVar.b - (h + 8);
                                    if (c2 == 2192) {
                                        ArrayList arrayList2 = new ArrayList();
                                        List e = v0h.e.e(nkkVar5.q(i28, charset));
                                        for (int i29 = 0; i29 < e.size(); i29++) {
                                            List e2 = v0h.d.e((CharSequence) e.get(i29));
                                            if (e2.size() != 3) {
                                                throw r9e.a(null, null);
                                            }
                                            try {
                                                arrayList2.add(new SlowMotionData.Segment(Long.parseLong((String) e2.get(0)), Long.parseLong((String) e2.get(1)), 1 << (Integer.parseInt((String) e2.get(2)) - 1)));
                                            } catch (NumberFormatException e3) {
                                                throw r9e.a(null, e3);
                                            }
                                        }
                                        this.g.add(new SlowMotionData(arrayList2));
                                    } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                        zzl.s();
                                        return 0;
                                    }
                                    i27++;
                                    i3 = 4;
                                }
                                b78Var.a = 0L;
                                j2 = 0;
                                i = 1;
                                j = 0;
                            }
                        } else {
                            nkk nkkVar6 = new nkk(8);
                            ml6Var.readFully(nkkVar6.a, 0, 8);
                            v0hVar.c = nkkVar6.h() + 8;
                            if (nkkVar6.f() != 1397048916) {
                                b78Var.a = 0L;
                                position = 0;
                            } else {
                                position = ml6Var.getPosition() - (v0hVar.c - 12);
                                b78Var.a = position;
                                v0hVar.b = 2;
                            }
                            j = position;
                        }
                        j2 = 0;
                        i = 1;
                    } else {
                        long length3 = ml6Var.getLength();
                        long j13 = (length3 == -1 || length3 < 8) ? 0L : length3 - 8;
                        b78Var.a = j13;
                        i = 1;
                        v0hVar.b = 1;
                        j = j13;
                        j2 = 0;
                    }
                    if (j != j2) {
                        return i;
                    }
                    this.h = 0;
                    this.k = 0;
                    return i;
                }
                long j14 = this.j - this.k;
                long position4 = ml6Var.getPosition() + j14;
                nkk nkkVar7 = this.l;
                if (nkkVar7 != null) {
                    ml6Var.readFully(nkkVar7.a, this.k, (int) j14);
                    if (this.i == 1718909296) {
                        nkkVar7.E(8);
                        int f2 = nkkVar7.f();
                        int i30 = f2 != 1751476579 ? f2 != 1903435808 ? 0 : 1 : 2;
                        if (i30 == 0) {
                            nkkVar7.F(4);
                            while (true) {
                                if (nkkVar7.c() <= 0) {
                                    i30 = 0;
                                    break;
                                }
                                int f3 = nkkVar7.f();
                                i30 = f3 != 1751476579 ? f3 != 1903435808 ? 0 : 1 : 2;
                                if (i30 != 0) {
                                    break;
                                }
                            }
                        }
                        this.v = i30;
                    } else if (!arrayDeque.isEmpty()) {
                        ((rl0) arrayDeque.peek()).h.add(new sl0(this.i, nkkVar7));
                    }
                } else if (j14 < 262144) {
                    ml6Var.skipFully((int) j14);
                } else {
                    b78Var.a = ml6Var.getPosition() + j14;
                    z = true;
                    e(position4);
                    if (z && this.h != 2) {
                        return 1;
                    }
                }
                z = false;
                e(position4);
                if (z) {
                    return 1;
                }
                continue;
            } else {
                int i31 = this.k;
                nkk nkkVar8 = this.d;
                if (i31 == 0) {
                    if (!ml6Var.readFully(nkkVar8.a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    nkkVar8.E(0);
                    this.j = nkkVar8.t();
                    this.i = nkkVar8.f();
                }
                long j15 = this.j;
                if (j15 == 1) {
                    ml6Var.readFully(nkkVar8.a, 8, 8);
                    this.k += 8;
                    this.j = nkkVar8.w();
                } else if (j15 == 0) {
                    long length4 = ml6Var.getLength();
                    if (length4 == -1 && (rl0Var = (rl0) arrayDeque.peek()) != null) {
                        length4 = rl0Var.g;
                    }
                    if (length4 != -1) {
                        this.j = (length4 - ml6Var.getPosition()) + this.k;
                    }
                }
                long j16 = this.j;
                int i32 = this.k;
                if (j16 < i32) {
                    throw r9e.b("Atom size less than header length (unsupported).");
                }
                int i33 = this.i;
                if (i33 == 1836019574 || i33 == 1953653099 || i33 == 1835297121 || i33 == 1835626086 || i33 == 1937007212 || i33 == 1701082227 || i33 == 1835365473) {
                    long position5 = ml6Var.getPosition();
                    long j17 = this.j;
                    long j18 = this.k;
                    long j19 = (position5 + j17) - j18;
                    if (j17 != j18 && this.i == 1835365473) {
                        nkkVar.B(8);
                        ml6Var.peekFully(nkkVar.a, 0, 8);
                        byte[] bArr3 = yl0.a;
                        int i34 = nkkVar.b;
                        nkkVar.F(4);
                        if (nkkVar.f() != 1751411826) {
                            i34 += 4;
                        }
                        nkkVar.E(i34);
                        ml6Var.skipFully(nkkVar.b);
                        ml6Var.resetPeekPosition();
                    }
                    arrayDeque.push(new rl0(this.i, j19));
                    if (this.j == this.k) {
                        e(j19);
                    } else {
                        this.h = 0;
                        this.k = 0;
                    }
                } else if (i33 == 1835296868 || i33 == 1836476516 || i33 == 1751411826 || i33 == 1937011556 || i33 == 1937011827 || i33 == 1937011571 || i33 == 1668576371 || i33 == 1701606260 || i33 == 1937011555 || i33 == 1937011578 || i33 == 1937013298 || i33 == 1937007471 || i33 == 1668232756 || i33 == 1953196132 || i33 == 1718909296 || i33 == 1969517665 || i33 == 1801812339 || i33 == 1768715124) {
                    qx9.t(i32 == 8);
                    qx9.t(this.j <= 2147483647L);
                    nkk nkkVar9 = new nkk((int) this.j);
                    System.arraycopy(nkkVar8.a, 0, nkkVar9.a, 0, 8);
                    this.l = nkkVar9;
                    this.h = 1;
                } else {
                    ml6Var.getPosition();
                    this.l = null;
                    this.h = 1;
                }
            }
        }
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.q = ol6Var;
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        return xw3.P(ml6Var, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d2, code lost:
    
        if (r4 != 1920233063) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d4, code lost:
    
        r13 = defpackage.djc.c(r4, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e0, code lost:
    
        if (r4 != 1885823344) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e2, code lost:
    
        r4 = defpackage.djc.c(r4, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ef, code lost:
    
        if (r4 != 1936683886) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f1, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01fc, code lost:
    
        if (r4 != 1953919848) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01fe, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0209, code lost:
    
        if (r4 != 757935405) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020b, code lost:
    
        r4 = null;
        r13 = null;
        r12 = -1;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020f, code lost:
    
        r15 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0211, code lost:
    
        if (r15 >= r8) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0213, code lost:
    
        r19 = r7.f();
        r27 = r1;
        r1 = r7.f();
        r28 = r10;
        r7.F(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0226, code lost:
    
        if (r1 != 1835360622) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0228, code lost:
    
        r13 = r7.o(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024a, code lost:
    
        r1 = r27;
        r10 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0233, code lost:
    
        if (r1 != 1851878757) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0235, code lost:
    
        r4 = r7.o(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0240, code lost:
    
        if (r1 != 1684108385) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0242, code lost:
    
        r12 = r15;
        r14 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0245, code lost:
    
        r7.F(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x024f, code lost:
    
        r27 = r1;
        r28 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0253, code lost:
    
        if (r13 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0255, code lost:
    
        if (r4 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0258, code lost:
    
        if (r12 != (-1)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x025b, code lost:
    
        r7.E(r12);
        r7.F(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026e, code lost:
    
        r13 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r13, r4, r7.o(r14 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0271, code lost:
    
        r7.E(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0270, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0276, code lost:
    
        r27 = r1;
        r28 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x031f, code lost:
    
        "Skipped unknown metadata entry: ".concat(defpackage.ffb.g(r4));
        defpackage.m6k.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0329, code lost:
    
        r7.E(r8);
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00c8, code lost:
    
        r4 = defpackage.djc.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00cc, code lost:
    
        if (r4 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00ce, code lost:
    
        r12 = defpackage.djc.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00d2, code lost:
    
        if (r4 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00d4, code lost:
    
        r4 = r12[r4 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00da, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00dc, code lost:
    
        r12 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00e7, code lost:
    
        r7.E(r8);
        r27 = r1;
        r28 = r10;
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00e3, code lost:
    
        defpackage.m6k.f0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00e6, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00d9, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0105, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0350, code lost:
    
        r7.E(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0353, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00bd, code lost:
    
        r27 = r1;
        r28 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x027c, code lost:
    
        r1 = r4 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0281, code lost:
    
        if (r1 != 6516084) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0283, code lost:
    
        r1 = r7.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x028e, code lost:
    
        if (r7.f() != 1684108385) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0290, code lost:
    
        r7.F(8);
        r1 = r7.o(r1 - 16);
        r13 = new com.google.android.exoplayer2.metadata.id3.CommentFrame(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED, r1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02a5, code lost:
    
        "Failed to parse comment attribute: ".concat(defpackage.ffb.g(r4));
        defpackage.m6k.f0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02b5, code lost:
    
        if (r1 == 7233901) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ba, code lost:
    
        if (r1 != 7631467) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02c1, code lost:
    
        if (r1 == 6516589) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02c6, code lost:
    
        if (r1 != 7828084) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02cc, code lost:
    
        if (r1 != 6578553) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ce, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02d8, code lost:
    
        if (r1 != 4280916) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02da, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02e4, code lost:
    
        if (r1 != 7630703) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02e6, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02f0, code lost:
    
        if (r1 != 6384738) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02f2, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02fd, code lost:
    
        if (r1 != 7108978) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02ff, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x030a, code lost:
    
        if (r1 != 6776174) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x030c, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0315, code lost:
    
        if (r1 != 6779504) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0317, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x032e, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0336, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0354, code lost:
    
        r27 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x035a, code lost:
    
        if (r3.isEmpty() == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x035c, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0360, code lost:
    
        r19 = new com.google.android.exoplayer2.metadata.Metadata(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r7.E(r10);
        r10 = r10 + r12;
        r7.F(r15);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r8 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r8 >= r10) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        r8 = r7.f() + r8;
        r4 = r7.f();
        r15 = (r4 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if (r15 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        if (r15 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if (r4 != 1735291493) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        if (r4 != 1684632427) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        r13 = defpackage.djc.a(r4, r7, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
    
        r7.E(r8);
        r27 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
    
        r28 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x033e, code lost:
    
        if (r13 == null) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0340, code lost:
    
        r3.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0343, code lost:
    
        r1 = r27;
        r10 = r28;
        r16 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (r4 != 1953655662) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
    
        r13 = defpackage.djc.a(r4, r7, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0117, code lost:
    
        if (r4 != 1953329263) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
    
        r4 = defpackage.djc.c(r4, "TBPM", r7, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        r7.E(r8);
        r27 = r1;
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
    
        if (r4 != 1668311404) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012d, code lost:
    
        r4 = defpackage.djc.c(r4, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        if (r4 != 1668249202) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013a, code lost:
    
        r4 = r7.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0145, code lost:
    
        if (r7.f() != 1684108385) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0147, code lost:
    
        r12 = r7.f() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014f, code lost:
    
        if (r12 != 13) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0151, code lost:
    
        r13 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015c, code lost:
    
        if (r13 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015e, code lost:
    
        defpackage.m6k.f0();
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        r7.F(4);
        r4 = r4 - 16;
        r12 = new byte[r4];
        r7.e(r12, 0, r4);
        r13 = new com.google.android.exoplayer2.metadata.id3.ApicFrame(r13, null, 3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0156, code lost:
    
        if (r12 != 14) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0158, code lost:
    
        r13 = "image/png";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015b, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0179, code lost:
    
        defpackage.m6k.f0();
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0184, code lost:
    
        if (r4 != 1631670868) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0186, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0191, code lost:
    
        if (r4 != 1936682605) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0193, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019e, code lost:
    
        if (r4 != 1936679276) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a0, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ab, code lost:
    
        if (r4 != 1936679282) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ad, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b8, code lost:
    
        if (r4 != 1936679265) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ba, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c5, code lost:
    
        if (r4 != 1936679791) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c7, code lost:
    
        r13 = defpackage.djc.b(r4, r7, "TSOC");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0633 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x066a A[LOOP:12: B:355:0x0667->B:357:0x066a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0687  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j) {
        ArrayDeque arrayDeque;
        int i;
        Metadata metadata;
        Metadata metadata2;
        rl0 rl0Var;
        gv8 gv8Var;
        Metadata metadata3;
        int size;
        int i2;
        dxc[] dxcVarArr;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        Metadata metadata4;
        int i7;
        int i8;
        int i9;
        rl0 rl0Var2;
        gv8 gv8Var2;
        int i10;
        MdtaMetadataEntry mdtaMetadataEntry;
        ArrayDeque arrayDeque2;
        while (true) {
            ArrayDeque arrayDeque3 = this.e;
            if (arrayDeque3.isEmpty() || ((rl0) arrayDeque3.peek()).g != j) {
                break;
            }
            rl0 rl0Var3 = (rl0) arrayDeque3.pop();
            if (rl0Var3.b == 1836019574) {
                ArrayList arrayList2 = new ArrayList();
                boolean z = this.v == 1;
                gv8 gv8Var3 = new gv8();
                sl0 B = rl0Var3.B(1969517665);
                int i11 = 1751411826;
                int i12 = 4;
                int i13 = 1768715124;
                int i14 = 16;
                int i15 = 1835365473;
                int i16 = 8;
                if (B != null) {
                    byte[] bArr = yl0.a;
                    nkk nkkVar = B.g;
                    nkkVar.E(8);
                    Metadata metadata5 = null;
                    Metadata metadata6 = null;
                    while (nkkVar.c() >= i16) {
                        int i17 = nkkVar.b;
                        int f = nkkVar.f();
                        int f2 = nkkVar.f();
                        if (f2 == i15) {
                            nkkVar.E(i17);
                            int i18 = i17 + f;
                            nkkVar.F(i16);
                            int i19 = nkkVar.b;
                            nkkVar.F(i12);
                            if (nkkVar.f() != i11) {
                                i19 += 4;
                            }
                            nkkVar.E(i19);
                            while (true) {
                                int i20 = nkkVar.b;
                                if (i20 >= i18) {
                                    arrayDeque2 = arrayDeque3;
                                    break;
                                }
                                int f3 = nkkVar.f();
                                if (nkkVar.f() == i13) {
                                    break;
                                }
                                nkkVar.E(i20 + f3);
                                i13 = 1768715124;
                                i16 = 8;
                                i14 = 16;
                            }
                        } else {
                            arrayDeque2 = arrayDeque3;
                            if (f2 == 1936553057) {
                                nkkVar.E(i17);
                                int i21 = i17 + f;
                                nkkVar.F(12);
                                while (true) {
                                    int i22 = nkkVar.b;
                                    if (i22 >= i21) {
                                        break;
                                    }
                                    int f4 = nkkVar.f();
                                    if (nkkVar.f() != 1935766900) {
                                        nkkVar.E(i22 + f4);
                                    } else if (f4 >= 14) {
                                        nkkVar.F(5);
                                        int s = nkkVar.s();
                                        if (s == 12 || s == 13) {
                                            float f5 = s == 12 ? 240.0f : 120.0f;
                                            nkkVar.F(1);
                                            metadata6 = new Metadata(new SmtaMetadataEntry(f5, nkkVar.s()));
                                        }
                                    }
                                }
                                metadata6 = null;
                            }
                        }
                        nkkVar.E(i17 + f);
                        arrayDeque3 = arrayDeque2;
                        i13 = 1768715124;
                        i11 = 1751411826;
                        i15 = 1835365473;
                        i12 = 4;
                        i16 = 8;
                        i14 = 16;
                    }
                    arrayDeque = arrayDeque3;
                    Pair create = Pair.create(metadata5, metadata6);
                    metadata2 = (Metadata) create.first;
                    metadata = (Metadata) create.second;
                    if (metadata2 != null) {
                        gv8Var3.b(metadata2);
                    }
                    i = 1835365473;
                } else {
                    arrayDeque = arrayDeque3;
                    i = 1835365473;
                    metadata = null;
                    metadata2 = null;
                }
                rl0 A = rl0Var3.A(i);
                if (A != null) {
                    byte[] bArr2 = yl0.a;
                    sl0 B2 = A.B(1751411826);
                    sl0 B3 = A.B(1801812339);
                    sl0 B4 = A.B(1768715124);
                    if (B2 != null && B3 != null && B4 != null) {
                        nkk nkkVar2 = B2.g;
                        nkkVar2.E(16);
                        if (nkkVar2.f() == 1835299937) {
                            nkk nkkVar3 = B3.g;
                            nkkVar3.E(12);
                            int f6 = nkkVar3.f();
                            String[] strArr = new String[f6];
                            for (int i23 = 0; i23 < f6; i23++) {
                                int f7 = nkkVar3.f();
                                nkkVar3.F(4);
                                strArr[i23] = nkkVar3.q(f7 - 8, xp2.c);
                            }
                            nkk nkkVar4 = B4.g;
                            nkkVar4.E(8);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i24 = 8; nkkVar4.c() > i24; i24 = 8) {
                                int i25 = nkkVar4.b;
                                int f8 = nkkVar4.f();
                                int f9 = nkkVar4.f() - 1;
                                if (f9 < 0 || f9 >= f6) {
                                    rl0Var2 = rl0Var3;
                                    gv8Var2 = gv8Var3;
                                    i10 = f6;
                                    m6k.f0();
                                } else {
                                    String str = strArr[f9];
                                    int i26 = i25 + f8;
                                    while (true) {
                                        int i27 = nkkVar4.b;
                                        if (i27 >= i26) {
                                            rl0Var2 = rl0Var3;
                                            gv8Var2 = gv8Var3;
                                            i10 = f6;
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int f10 = nkkVar4.f();
                                        rl0Var2 = rl0Var3;
                                        gv8Var2 = gv8Var3;
                                        if (nkkVar4.f() == 1684108385) {
                                            int f11 = nkkVar4.f();
                                            int f12 = nkkVar4.f();
                                            int i28 = f10 - 16;
                                            byte[] bArr3 = new byte[i28];
                                            i10 = f6;
                                            nkkVar4.e(bArr3, 0, i28);
                                            mdtaMetadataEntry = new MdtaMetadataEntry(str, bArr3, f12, f11);
                                            break;
                                        }
                                        nkkVar4.E(i27 + f10);
                                        rl0Var3 = rl0Var2;
                                        gv8Var3 = gv8Var2;
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList3.add(mdtaMetadataEntry);
                                    }
                                }
                                nkkVar4.E(i25 + f8);
                                rl0Var3 = rl0Var2;
                                gv8Var3 = gv8Var2;
                                f6 = i10;
                            }
                            rl0Var = rl0Var3;
                            gv8Var = gv8Var3;
                            if (!arrayList3.isEmpty()) {
                                metadata3 = new Metadata(arrayList3);
                                gv8 gv8Var4 = gv8Var;
                                ArrayList e = yl0.e(rl0Var, gv8Var4, C.TIME_UNSET, null, false, z, new m72(17));
                                size = e.size();
                                int i29 = -1;
                                i2 = 0;
                                long j2 = C.TIME_UNSET;
                                while (i2 < size) {
                                    wsj wsjVar = (wsj) e.get(i2);
                                    if (wsjVar.b == 0) {
                                        metadata4 = metadata;
                                        arrayList = e;
                                        i5 = size;
                                    } else {
                                        isj isjVar = wsjVar.a;
                                        long j3 = isjVar.e;
                                        arrayList = e;
                                        sm8 sm8Var = isjVar.f;
                                        i5 = size;
                                        int i30 = isjVar.b;
                                        if (j3 == C.TIME_UNSET) {
                                            j3 = wsjVar.h;
                                        }
                                        long max = Math.max(j2, j3);
                                        dxc dxcVar = new dxc(isjVar, wsjVar, this.q.track(i2, i30));
                                        boolean equals = MimeTypes.AUDIO_TRUEHD.equals(sm8Var.l);
                                        int i31 = wsjVar.e;
                                        int i32 = equals ? i31 * 16 : i31 + 30;
                                        pm8 a = sm8Var.a();
                                        a.l = i32;
                                        if (i30 != 2 || j3 <= 0) {
                                            i6 = 1;
                                        } else {
                                            int i33 = wsjVar.b;
                                            i6 = 1;
                                            if (i33 > 1) {
                                                a.r = i33 / (j3 / 1000000.0f);
                                            }
                                        }
                                        if (i30 == i6 && (i8 = gv8Var4.a) != -1 && (i9 = gv8Var4.b) != -1) {
                                            a.A = i8;
                                            a.B = i9;
                                        }
                                        ArrayList arrayList4 = this.g;
                                        Metadata[] metadataArr = {metadata, arrayList4.isEmpty() ? null : new Metadata(arrayList4)};
                                        Metadata metadata7 = new Metadata(new Metadata.Entry[0]);
                                        if (i30 == 1) {
                                            if (metadata2 != null) {
                                                metadata4 = metadata;
                                                metadata7 = metadata2;
                                                for (i7 = 0; i7 < 2; i7++) {
                                                    Metadata metadata8 = metadataArr[i7];
                                                    if (metadata8 != null) {
                                                        metadata7 = metadata7.a(metadata8.a);
                                                    }
                                                }
                                                if (metadata7.a.length > 0) {
                                                    a.i = metadata7;
                                                }
                                                dxcVar.c.a(new sm8(a));
                                                if (i30 == 2 && i29 == -1) {
                                                    i29 = arrayList2.size();
                                                }
                                                arrayList2.add(dxcVar);
                                                j2 = max;
                                            }
                                            metadata4 = metadata;
                                            while (i7 < 2) {
                                            }
                                            if (metadata7.a.length > 0) {
                                            }
                                            dxcVar.c.a(new sm8(a));
                                            if (i30 == 2) {
                                                i29 = arrayList2.size();
                                            }
                                            arrayList2.add(dxcVar);
                                            j2 = max;
                                        } else {
                                            if (i30 == 2 && metadata3 != null) {
                                                int i34 = 0;
                                                while (true) {
                                                    Metadata.Entry[] entryArr = metadata3.a;
                                                    if (i34 >= entryArr.length) {
                                                        break;
                                                    }
                                                    Metadata.Entry entry = entryArr[i34];
                                                    if (entry instanceof MdtaMetadataEntry) {
                                                        MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry;
                                                        metadata4 = metadata;
                                                        if ("com.android.capture.fps".equals(mdtaMetadataEntry2.a)) {
                                                            metadata7 = new Metadata(mdtaMetadataEntry2);
                                                            break;
                                                        }
                                                    } else {
                                                        metadata4 = metadata;
                                                    }
                                                    i34++;
                                                    metadata = metadata4;
                                                }
                                                while (i7 < 2) {
                                                }
                                                if (metadata7.a.length > 0) {
                                                }
                                                dxcVar.c.a(new sm8(a));
                                                if (i30 == 2) {
                                                }
                                                arrayList2.add(dxcVar);
                                                j2 = max;
                                            }
                                            metadata4 = metadata;
                                            while (i7 < 2) {
                                            }
                                            if (metadata7.a.length > 0) {
                                            }
                                            dxcVar.c.a(new sm8(a));
                                            if (i30 == 2) {
                                            }
                                            arrayList2.add(dxcVar);
                                            j2 = max;
                                        }
                                    }
                                    i2++;
                                    e = arrayList;
                                    size = i5;
                                    metadata = metadata4;
                                }
                                long j4 = 0;
                                this.t = i29;
                                this.u = j2;
                                dxcVarArr = (dxc[]) arrayList2.toArray(new dxc[0]);
                                this.r = dxcVarArr;
                                long[][] jArr = new long[dxcVarArr.length][];
                                int[] iArr = new int[dxcVarArr.length];
                                long[] jArr2 = new long[dxcVarArr.length];
                                boolean[] zArr = new boolean[dxcVarArr.length];
                                for (i3 = 0; i3 < dxcVarArr.length; i3++) {
                                    jArr[i3] = new long[dxcVarArr[i3].b.b];
                                    jArr2[i3] = dxcVarArr[i3].b.f[0];
                                }
                                i4 = 0;
                                while (i4 < dxcVarArr.length) {
                                    long j5 = Long.MAX_VALUE;
                                    int i35 = -1;
                                    for (int i36 = 0; i36 < dxcVarArr.length; i36++) {
                                        if (!zArr[i36]) {
                                            long j6 = jArr2[i36];
                                            if (j6 <= j5) {
                                                i35 = i36;
                                                j5 = j6;
                                            }
                                        }
                                    }
                                    int i37 = iArr[i35];
                                    long[] jArr3 = jArr[i35];
                                    jArr3[i37] = j4;
                                    wsj wsjVar2 = dxcVarArr[i35].b;
                                    j4 += wsjVar2.d[i37];
                                    int i38 = i37 + 1;
                                    iArr[i35] = i38;
                                    if (i38 < jArr3.length) {
                                        jArr2[i35] = wsjVar2.f[i38];
                                    } else {
                                        zArr[i35] = true;
                                        i4++;
                                    }
                                }
                                this.s = jArr;
                                this.q.endTracks();
                                this.q.d(this);
                                arrayDeque.clear();
                                this.h = 2;
                            }
                            metadata3 = null;
                            gv8 gv8Var42 = gv8Var;
                            ArrayList e2 = yl0.e(rl0Var, gv8Var42, C.TIME_UNSET, null, false, z, new m72(17));
                            size = e2.size();
                            int i292 = -1;
                            i2 = 0;
                            long j22 = C.TIME_UNSET;
                            while (i2 < size) {
                            }
                            long j42 = 0;
                            this.t = i292;
                            this.u = j22;
                            dxcVarArr = (dxc[]) arrayList2.toArray(new dxc[0]);
                            this.r = dxcVarArr;
                            long[][] jArr4 = new long[dxcVarArr.length][];
                            int[] iArr2 = new int[dxcVarArr.length];
                            long[] jArr22 = new long[dxcVarArr.length];
                            boolean[] zArr2 = new boolean[dxcVarArr.length];
                            while (i3 < dxcVarArr.length) {
                            }
                            i4 = 0;
                            while (i4 < dxcVarArr.length) {
                            }
                            this.s = jArr4;
                            this.q.endTracks();
                            this.q.d(this);
                            arrayDeque.clear();
                            this.h = 2;
                        }
                    }
                }
                rl0Var = rl0Var3;
                gv8Var = gv8Var3;
                metadata3 = null;
                gv8 gv8Var422 = gv8Var;
                ArrayList e22 = yl0.e(rl0Var, gv8Var422, C.TIME_UNSET, null, false, z, new m72(17));
                size = e22.size();
                int i2922 = -1;
                i2 = 0;
                long j222 = C.TIME_UNSET;
                while (i2 < size) {
                }
                long j422 = 0;
                this.t = i2922;
                this.u = j222;
                dxcVarArr = (dxc[]) arrayList2.toArray(new dxc[0]);
                this.r = dxcVarArr;
                long[][] jArr42 = new long[dxcVarArr.length][];
                int[] iArr22 = new int[dxcVarArr.length];
                long[] jArr222 = new long[dxcVarArr.length];
                boolean[] zArr22 = new boolean[dxcVarArr.length];
                while (i3 < dxcVarArr.length) {
                }
                i4 = 0;
                while (i4 < dxcVarArr.length) {
                }
                this.s = jArr42;
                this.q.endTracks();
                this.q.d(this);
                arrayDeque.clear();
                this.h = 2;
            } else if (!arrayDeque3.isEmpty()) {
                ((rl0) arrayDeque3.peek()).i.add(rl0Var3);
            }
        }
        if (this.h != 2) {
            this.h = 0;
            this.k = 0;
        }
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        return this.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4 A[EDGE_INSN: B:70:0x00e4->B:71:0x00e4 BREAK  A[LOOP:1: B:29:0x006b->B:58:0x00e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    @Override // defpackage.a0h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yzg getSeekPoints(long j) {
        long j2;
        long j3;
        long j4;
        int i;
        dxc[] dxcVarArr;
        int i2;
        int i3;
        long j5;
        int a;
        dxc[] dxcVarArr2 = this.r;
        int length = dxcVarArr2.length;
        e0h e0hVar = e0h.c;
        if (length == 0) {
            return new yzg(e0hVar, e0hVar);
        }
        int i4 = this.t;
        boolean z = false;
        int i5 = -1;
        long j6 = -1;
        if (i4 != -1) {
            wsj wsjVar = dxcVarArr2[i4].b;
            long[] jArr = wsjVar.f;
            int e = lik.e(jArr, j, false);
            while (true) {
                if (e < 0) {
                    e = -1;
                    break;
                }
                if ((wsjVar.g[e] & 1) != 0) {
                    break;
                }
                e--;
            }
            if (e == -1) {
                e = wsjVar.a(j);
            }
            long[] jArr2 = wsjVar.c;
            if (e == -1) {
                return new yzg(e0hVar, e0hVar);
            }
            j3 = jArr[e];
            j2 = jArr2[e];
            if (j3 < j && e < wsjVar.b - 1 && (a = wsjVar.a(j)) != -1 && a != e) {
                j4 = jArr[a];
                j6 = jArr2[a];
                i = 0;
                long j7 = j2;
                while (true) {
                    dxcVarArr = this.r;
                    if (i < dxcVarArr.length) {
                        break;
                    }
                    if (i != this.t) {
                        wsj wsjVar2 = dxcVarArr[i].b;
                        long[] jArr3 = wsjVar2.c;
                        int[] iArr = wsjVar2.g;
                        long[] jArr4 = wsjVar2.f;
                        int e2 = lik.e(jArr4, j3, z);
                        while (true) {
                            if (e2 < 0) {
                                i3 = i5;
                                break;
                            }
                            if ((iArr[e2] & 1) != 0) {
                                i3 = e2;
                                break;
                            }
                            e2--;
                        }
                        if (i3 == i5) {
                            i3 = wsjVar2.a(j3);
                        }
                        if (i3 == i5) {
                            j5 = j6;
                        } else {
                            j5 = j6;
                            j7 = Math.min(jArr3[i3], j7);
                        }
                        if (j4 != C.TIME_UNSET) {
                            z = false;
                            int e3 = lik.e(jArr4, j4, false);
                            while (true) {
                                if (e3 < 0) {
                                    e3 = -1;
                                    break;
                                }
                                if ((iArr[e3] & 1) != 0) {
                                    break;
                                }
                                e3--;
                            }
                            i2 = -1;
                            if (e3 == -1) {
                                e3 = wsjVar2.a(j4);
                            }
                            j6 = e3 == -1 ? j5 : Math.min(jArr3[e3], j5);
                        } else {
                            j6 = j5;
                            z = false;
                            i2 = -1;
                        }
                    } else {
                        i2 = i5;
                    }
                    i++;
                    i5 = i2;
                }
                e0h e0hVar2 = new e0h(j3, j7);
                return j4 != C.TIME_UNSET ? new yzg(e0hVar2, e0hVar2) : new yzg(e0hVar2, new e0h(j4, j6));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = C.TIME_UNSET;
        i = 0;
        long j72 = j2;
        while (true) {
            dxcVarArr = this.r;
            if (i < dxcVarArr.length) {
            }
            i++;
            i5 = i2;
        }
        e0h e0hVar22 = new e0h(j3, j72);
        if (j4 != C.TIME_UNSET) {
        }
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        return true;
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.k = 0;
                return;
            } else {
                v0h v0hVar = this.f;
                v0hVar.a.clear();
                v0hVar.b = 0;
                this.g.clear();
                return;
            }
        }
        for (dxc dxcVar : this.r) {
            wsj wsjVar = dxcVar.b;
            int e = lik.e(wsjVar.f, j2, false);
            while (true) {
                if (e < 0) {
                    e = -1;
                    break;
                } else if ((wsjVar.g[e] & 1) != 0) {
                    break;
                } else {
                    e--;
                }
            }
            if (e == -1) {
                e = wsjVar.a(j2);
            }
            dxcVar.e = e;
            s1k s1kVar = dxcVar.d;
            if (s1kVar != null) {
                s1kVar.b = false;
                s1kVar.c = 0;
            }
        }
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
