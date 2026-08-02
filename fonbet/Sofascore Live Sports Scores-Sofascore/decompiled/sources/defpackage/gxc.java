package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gxc implements ll6 {
    public long A;
    public pl6 B;
    public exc[] C;
    public long[][] D;
    public int E;
    public yvc F;
    public final xli a;
    public final int b;
    public final boolean c;
    public final j9e d;
    public final j9e e;
    public final j9e f;
    public final j9e g;
    public final ArrayDeque h;
    public final w0h i;
    public final ArrayList j;
    public vvf k;
    public int l;
    public int m;
    public long n;
    public int o;
    public j9e p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    public gxc(xli xliVar, int i) {
        this.a = xliVar;
        this.b = i;
        this.c = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        av9 av9Var = hv9.b;
        this.k = vvf.e;
        this.l = (i & 4) != 0 ? 3 : 0;
        this.i = new w0h();
        this.j = new ArrayList();
        this.g = new j9e(16);
        this.h = new ArrayDeque();
        this.d = new j9e(kik.l);
        this.e = new j9e(6);
        this.f = new j9e();
        this.q = -1;
        this.B = pl6.p7;
        this.C = new exc[0];
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        vvf vvfVar;
        moh K = ok3.K(nl6Var, false, (this.b & 2) != 0);
        if (K != null) {
            vvfVar = hv9.z(K);
        } else {
            av9 av9Var = hv9.b;
            vvfVar = vvf.e;
        }
        this.k = vvfVar;
        return K == null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x064d, code lost:
    
        throw defpackage.s9e.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0255  */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        long position;
        long j3;
        j9e j9eVar;
        int i6;
        char c3;
        boolean z;
        boolean z2;
        axc axcVar;
        if (!this.c || !this.z) {
            while (true) {
                int i7 = this.l;
                ArrayDeque arrayDeque = this.h;
                int i8 = this.b;
                j9e j9eVar2 = this.f;
                int i9 = 4;
                int i10 = 0;
                char c4 = 2;
                if (i7 == 0) {
                    int i11 = this.o;
                    j9e j9eVar3 = this.g;
                    if (i11 == 0) {
                        if (nl6Var.readFully(j9eVar3.a, 0, 8, true)) {
                            this.o = 8;
                            j9eVar3.N(0);
                            this.n = j9eVar3.C();
                            this.m = j9eVar3.m();
                        } else if (this.E == 2 && (i8 & 2) != 0) {
                            vsj mo2track = this.B.mo2track(0, 4);
                            yvc yvcVar = this.F;
                            ric ricVar = yvcVar == null ? null : new ric(yvcVar);
                            qm8 qm8Var = new qm8();
                            qm8Var.k = ricVar;
                            w1l.r(qm8Var, mo2track);
                            this.B.endTracks();
                            this.B.m(new bw0(C.TIME_UNSET));
                            return -1;
                        }
                    }
                    long j4 = this.n;
                    if (j4 == 1) {
                        nl6Var.readFully(j9eVar3.a, 8, 8);
                        this.o += 8;
                        this.n = j9eVar3.G();
                    } else if (j4 == 0) {
                        long length = nl6Var.getLength();
                        if (length == -1 && (axcVar = (axc) arrayDeque.peek()) != null) {
                            length = axcVar.g;
                        }
                        if (length != -1) {
                            this.n = (length - nl6Var.getPosition()) + this.o;
                        }
                    }
                    long j5 = this.n;
                    int i12 = this.o;
                    long j6 = i12;
                    if (j5 < j6) {
                        if (this.m != 1718773093 || i12 != 8) {
                            break;
                        }
                        this.n = j6;
                    }
                    int i13 = this.m;
                    if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1701082227 || i13 == 1835365473 || i13 == 1635284069) {
                        long position2 = nl6Var.getPosition();
                        long j7 = this.n;
                        long j8 = this.o;
                        long j9 = (position2 + j7) - j8;
                        if (j7 != j8 && this.m == 1835365473) {
                            j9eVar2.K(8);
                            nl6Var.peekFully(j9eVar2.a, 0, 8);
                            l12.a(j9eVar2);
                            nl6Var.skipFully(j9eVar2.b);
                            nl6Var.resetPeekPosition();
                        }
                        arrayDeque.push(new axc(this.m, j9));
                        if (this.n == this.o) {
                            f(j9);
                        } else {
                            this.l = 0;
                            this.o = 0;
                        }
                    } else if (i13 == 1835296868 || i13 == 1836476516 || i13 == 1751411826 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1937011571 || i13 == 1668576371 || i13 == 1701606260 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1953196132 || i13 == 1718909296 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124) {
                        z1a.E(i12 == 8);
                        z1a.E(this.n <= 2147483647L);
                        j9e j9eVar4 = new j9e((int) this.n);
                        System.arraycopy(j9eVar3.a, 0, j9eVar4.a, 0, 8);
                        this.p = j9eVar4;
                        this.l = 1;
                    } else {
                        long position3 = nl6Var.getPosition();
                        long j10 = this.o;
                        long j11 = position3 - j10;
                        if (this.m == 1836086884) {
                            this.F = new yvc(0L, j11, C.TIME_UNSET, j11 + j10, this.n - j10);
                        }
                        this.p = null;
                        this.l = 1;
                    }
                } else if (i7 == 1) {
                    long j12 = this.n - this.o;
                    long position4 = nl6Var.getPosition() + j12;
                    j9e j9eVar5 = this.p;
                    if (j9eVar5 != null) {
                        nl6Var.readFully(j9eVar5.a, this.o, (int) j12);
                        if (this.m == 1718909296) {
                            this.v = true;
                            j9eVar5.N(8);
                            int m = j9eVar5.m();
                            int i14 = m != 1751476579 ? m != 1903435808 ? 0 : 1 : 2;
                            if (i14 == 0) {
                                j9eVar5.O(4);
                                while (true) {
                                    if (j9eVar5.a() <= 0) {
                                        i14 = 0;
                                        break;
                                    }
                                    int m2 = j9eVar5.m();
                                    i14 = m2 != 1751476579 ? m2 != 1903435808 ? 0 : 1 : 2;
                                    if (i14 != 0) {
                                        break;
                                    }
                                }
                            }
                            this.E = i14;
                        } else if (!arrayDeque.isEmpty()) {
                            ((axc) arrayDeque.peek()).h.add(new bxc(this.m, j9eVar5));
                        }
                    } else {
                        if (!this.v && this.m == 1835295092) {
                            this.E = 1;
                        }
                        if (j12 < 262144) {
                            nl6Var.skipFully((int) j12);
                        } else {
                            b78Var.a = nl6Var.getPosition() + j12;
                            z = true;
                            f(position4);
                            if (this.w) {
                                z2 = z;
                            } else {
                                this.y = true;
                                b78Var.a = this.x;
                                this.w = false;
                                z2 = true;
                            }
                            if (z2 && this.l != 2) {
                                return 1;
                            }
                        }
                    }
                    z = false;
                    f(position4);
                    if (this.w) {
                    }
                    if (z2) {
                        return 1;
                    }
                    continue;
                } else {
                    if (i7 == 2) {
                        long position5 = nl6Var.getPosition();
                        int i15 = this.q;
                        if (i15 == -1) {
                            boolean z3 = true;
                            int i16 = 0;
                            int i17 = -1;
                            int i18 = -1;
                            boolean z4 = true;
                            long j13 = Long.MAX_VALUE;
                            long j14 = Long.MAX_VALUE;
                            long j15 = Long.MAX_VALUE;
                            while (true) {
                                exc[] excVarArr = this.C;
                                if (i16 >= excVarArr.length) {
                                    break;
                                }
                                exc excVar = excVarArr[i16];
                                int i19 = excVar.e;
                                xsj xsjVar = excVar.b;
                                char c5 = c4;
                                if (i19 != xsjVar.b) {
                                    long j16 = xsjVar.c[i19];
                                    long[][] jArr = this.D;
                                    jArr.getClass();
                                    long j17 = jArr[i16][i19];
                                    long j18 = j16 - position5;
                                    boolean z5 = j18 < 0 || j18 >= 262144;
                                    if ((!z5 && z3) || (z5 == z3 && j18 < j15)) {
                                        z3 = z5;
                                        i18 = i16;
                                        j15 = j18;
                                        j14 = j17;
                                    }
                                    if (j17 < j13) {
                                        z4 = z5;
                                        i17 = i16;
                                        j13 = j17;
                                    }
                                }
                                i16++;
                                c4 = c5;
                            }
                            c = c4;
                            i15 = (j13 == Long.MAX_VALUE || !z4 || j14 < j13 + 10485760) ? i18 : i17;
                            this.q = i15;
                            if (i15 == -1) {
                                return -1;
                            }
                        } else {
                            c = 2;
                        }
                        exc excVar2 = this.C[i15];
                        vsj vsjVar = excVar2.c;
                        xsj xsjVar2 = excVar2.b;
                        jsj jsjVar = excVar2.a;
                        int i20 = excVar2.e;
                        long[] jArr2 = xsjVar2.c;
                        int[] iArr = xsjVar2.d;
                        long j19 = jArr2[i20] + this.A;
                        int i21 = iArr[i20];
                        s1k s1kVar = excVar2.d;
                        long j20 = (j19 - position5) + this.r;
                        if (j20 < 0 || j20 >= 262144) {
                            b78Var.a = j19;
                            return 1;
                        }
                        int i22 = jsjVar.h;
                        int i23 = jsjVar.k;
                        b bVar = jsjVar.g;
                        if (i22 == 1) {
                            j20 += 8;
                            i21 -= 8;
                        }
                        int i24 = i21;
                        nl6Var.skipFully((int) j20);
                        String str = bVar.o;
                        String str2 = bVar.o;
                        if (!Objects.equals(str, "video/avc") ? !(!Objects.equals(str2, "video/hevc") || (i8 & 128) == 0) : (i8 & 32) != 0) {
                            c2 = 1;
                            this.u = true;
                        } else {
                            c2 = 1;
                        }
                        if (i23 != 0) {
                            j9e j9eVar6 = this.e;
                            byte[] bArr = j9eVar6.a;
                            bArr[0] = 0;
                            bArr[c2] = 0;
                            bArr[c] = 0;
                            int i25 = 4 - i23;
                            int i26 = i24 + i25;
                            while (this.s < i26) {
                                int i27 = this.t;
                                if (i27 == 0) {
                                    if (this.u || kik.K(bVar) + i23 > iArr[i20] - this.r) {
                                        i3 = i23;
                                        i4 = 0;
                                    } else {
                                        i4 = kik.K(bVar);
                                        i3 = i23 + i4;
                                    }
                                    nl6Var.readFully(bArr, i25, i3);
                                    i2 = i26;
                                    this.r += i3;
                                    j9eVar6.N(0);
                                    int m3 = j9eVar6.m();
                                    if (m3 < 0) {
                                        throw s9e.a(null, "Invalid NAL length");
                                    }
                                    this.t = m3 - i4;
                                    j9e j9eVar7 = this.d;
                                    j9eVar7.N(0);
                                    int i28 = i4;
                                    vsjVar.g(4, j9eVar7);
                                    this.s += 4;
                                    if (i28 > 0) {
                                        vsjVar.g(i28, j9eVar6);
                                        this.s += i28;
                                        if (kik.H(bArr, i28, bVar)) {
                                            this.u = true;
                                        }
                                    }
                                } else {
                                    i2 = i26;
                                    int c6 = vsjVar.c(nl6Var, i27, false);
                                    this.r += c6;
                                    this.s += c6;
                                    this.t -= c6;
                                }
                                i26 = i2;
                            }
                            i = i26;
                        } else {
                            if ("audio/ac4".equals(str2)) {
                                if (this.s == 0) {
                                    s02.I(i24, j9eVar2);
                                    vsjVar.g(7, j9eVar2);
                                    this.s += 7;
                                }
                                i24 += 7;
                            } else if (excVar2.f != null && Objects.equals(str2, MimeTypes.AUDIO_MPEG)) {
                                b bVar2 = excVar2.f;
                                j9eVar2.K(4);
                                nl6Var.peekFully(j9eVar2.a, 0, 4);
                                nl6Var.resetPeekPosition();
                                lxc lxcVar = new lxc(1);
                                vsj vsjVar2 = excVar2.c;
                                if (lxcVar.a(j9eVar2.m()) && !Objects.equals(bVar2.o, lxcVar.c)) {
                                    qm8 a = bVar2.a();
                                    String str3 = lxcVar.c;
                                    str3.getClass();
                                    a.n = sjc.p(str3);
                                    bVar2 = new b(a);
                                }
                                vsjVar2.d(bVar2);
                                excVar2.f = null;
                            } else if (s1kVar != null) {
                                s1kVar.f(nl6Var);
                            }
                            while (true) {
                                int i29 = this.s;
                                if (i29 >= i24) {
                                    break;
                                }
                                int c7 = vsjVar.c(nl6Var, i24 - i29, false);
                                this.r += c7;
                                this.s += c7;
                                this.t -= c7;
                            }
                            i = i24;
                        }
                        long j21 = xsjVar2.f[i20];
                        int i30 = xsjVar2.g[i20];
                        if (!this.u) {
                            i30 |= 67108864;
                        }
                        int i31 = i30;
                        if (s1kVar != null) {
                            s1kVar.d(vsjVar, j21, i31, i, 0, null);
                            if (i20 + 1 == xsjVar2.b) {
                                s1kVar.b(vsjVar, null);
                            }
                        } else {
                            vsjVar.a(j21, i31, i, 0, null);
                        }
                        excVar2.e++;
                        this.q = -1;
                        this.r = 0;
                        this.s = 0;
                        this.t = 0;
                        this.u = false;
                        return 0;
                    }
                    if (i7 != 3) {
                        zzl.s();
                        return 0;
                    }
                    w0h w0hVar = this.i;
                    ArrayList arrayList = w0hVar.a;
                    int i32 = w0hVar.b;
                    if (i32 != 0) {
                        if (i32 != 1) {
                            short s = 2817;
                            short s2 = 2816;
                            short s3 = 2192;
                            if (i32 != 2) {
                                if (i32 != 3) {
                                    zzl.s();
                                    return 0;
                                }
                                long position6 = nl6Var.getPosition();
                                int length2 = (int) ((nl6Var.getLength() - nl6Var.getPosition()) - w0hVar.c);
                                j9e j9eVar8 = new j9e(length2);
                                nl6Var.readFully(j9eVar8.a, 0, length2);
                                int i33 = 0;
                                while (i33 < arrayList.size()) {
                                    u0h u0hVar = (u0h) arrayList.get(i33);
                                    int i34 = i10;
                                    j9eVar8.N((int) (u0hVar.a - position6));
                                    j9eVar8.O(i9);
                                    int o = j9eVar8.o();
                                    Charset charset = StandardCharsets.UTF_8;
                                    int i35 = i34;
                                    String y = j9eVar8.y(o, charset);
                                    switch (y.hashCode()) {
                                        case -1711564334:
                                            if (y.equals("SlowMotion_Data")) {
                                                i6 = i35;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case -1332107749:
                                            if (y.equals("Super_SlowMotion_Edit_Data")) {
                                                i6 = 1;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case -1251387154:
                                            if (y.equals("Super_SlowMotion_Data")) {
                                                i6 = 2;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case -830665521:
                                            if (y.equals("Super_SlowMotion_Deflickering_On")) {
                                                i6 = 3;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 1760745220:
                                            if (y.equals("Super_SlowMotion_BGM")) {
                                                i6 = 4;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        default:
                                            i6 = -1;
                                            break;
                                    }
                                    switch (i6) {
                                        case 0:
                                            c3 = 2192;
                                            break;
                                        case 1:
                                            c3 = 2819;
                                            break;
                                        case 2:
                                            c3 = 2816;
                                            break;
                                        case 3:
                                            c3 = 2820;
                                            break;
                                        case 4:
                                            c3 = 2817;
                                            break;
                                        default:
                                            throw s9e.a(null, "Invalid SEF name");
                                    }
                                    int i36 = u0hVar.b - (o + 8);
                                    if (c3 == 2192) {
                                        ArrayList arrayList2 = new ArrayList();
                                        List e = w0h.e.e(j9eVar8.y(i36, charset));
                                        int i37 = i35;
                                        while (i37 < e.size()) {
                                            List e2 = w0h.d.e((CharSequence) e.get(i37));
                                            if (e2.size() != 3) {
                                                throw s9e.a(null, null);
                                            }
                                            try {
                                                arrayList2.add(new nlh(Long.parseLong((String) e2.get(i35)), Long.parseLong((String) e2.get(1)), 1 << (Integer.parseInt((String) e2.get(2)) - 1)));
                                                i37++;
                                                i35 = 0;
                                            } catch (NumberFormatException e3) {
                                                throw s9e.a(e3, null);
                                            }
                                        }
                                        this.j.add(new olh(arrayList2));
                                    } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                        zzl.s();
                                        return i35;
                                    }
                                    i33++;
                                    i10 = 0;
                                    i9 = 4;
                                }
                                b78Var.a = 0L;
                                i5 = 1;
                                j2 = 0;
                                j = 0;
                                if (j == j2) {
                                    return i5;
                                }
                                this.l = 0;
                                this.o = 0;
                                return i5;
                            }
                            long length3 = nl6Var.getLength();
                            int i38 = w0hVar.c - 20;
                            j9e j9eVar9 = new j9e(i38);
                            nl6Var.readFully(j9eVar9.a, 0, i38);
                            int i39 = 0;
                            while (i39 < i38 / 12) {
                                j9eVar9.O(2);
                                short q = j9eVar9.q();
                                if (q != s3 && q != s2 && q != s && q != 2819) {
                                    if (q != 2820) {
                                        j9eVar9.O(8);
                                        j9eVar = j9eVar9;
                                        i39++;
                                        j9eVar9 = j9eVar;
                                        s = 2817;
                                        s3 = 2192;
                                        s2 = 2816;
                                    }
                                }
                                j9eVar = j9eVar9;
                                arrayList.add(new u0h((length3 - w0hVar.c) - j9eVar9.o(), j9eVar.o()));
                                i39++;
                                j9eVar9 = j9eVar;
                                s = 2817;
                                s3 = 2192;
                                s2 = 2816;
                            }
                            if (arrayList.isEmpty()) {
                                b78Var.a = 0L;
                                j3 = 0;
                            } else {
                                w0hVar.b = 3;
                                j3 = ((u0h) arrayList.get(0)).a;
                                b78Var.a = j3;
                            }
                            j = j3;
                        } else {
                            j9e j9eVar10 = new j9e(8);
                            nl6Var.readFully(j9eVar10.a, 0, 8);
                            w0hVar.c = j9eVar10.o() + 8;
                            if (j9eVar10.m() != 1397048916) {
                                b78Var.a = 0L;
                                position = 0;
                            } else {
                                position = nl6Var.getPosition() - (w0hVar.c - 12);
                                b78Var.a = position;
                                w0hVar.b = 2;
                            }
                            j = position;
                        }
                        i5 = 1;
                    } else {
                        long length4 = nl6Var.getLength();
                        long j22 = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                        b78Var.a = j22;
                        i5 = 1;
                        w0hVar.b = 1;
                        j = j22;
                    }
                    j2 = 0;
                    if (j == j2) {
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.ll6
    public final List d() {
        return this.k;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        if ((this.b & 16) == 0) {
            pl6Var = new en0(pl6Var, this.a);
        }
        this.B = pl6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x011e, code lost:
    
        if (((defpackage.e1c) r13).a.equals("auxiliary.tracks.offset") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (((defpackage.e1c) r12).a.equals("auxiliary.tracks.interleaved") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (((defpackage.e1c) r12).a.equals("auxiliary.tracks.map") != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j) {
        int i;
        ArrayList arrayList;
        ric ricVar;
        boolean z;
        ArrayDeque arrayDeque;
        boolean z2;
        ric ricVar2;
        ric ricVar3;
        boolean z3;
        long[][] jArr;
        ArrayList arrayList2;
        String str;
        boolean z4;
        ArrayList arrayList3;
        int i2;
        long j2;
        int i3;
        ric ricVar4;
        ric ricVar5;
        ric ricVar6;
        ArrayList arrayList4;
        int i4;
        int i5;
        int i6;
        int i7;
        lic licVar;
        lic licVar2;
        lic licVar3;
        int i8;
        while (true) {
            ArrayDeque arrayDeque2 = this.h;
            int i9 = 0;
            if (arrayDeque2.isEmpty() || ((axc) arrayDeque2.peek()).g != j) {
                break;
            }
            axc axcVar = (axc) arrayDeque2.pop();
            if (axcVar.b == 1836019574) {
                axc A = axcVar.A(1835365473);
                ArrayList arrayList5 = new ArrayList();
                boolean z5 = this.c;
                long j3 = 0;
                int i10 = this.b;
                if (A != null) {
                    ricVar = l12.f(A);
                    if (this.y) {
                        ricVar.getClass();
                        lic[] licVarArr = ricVar.a;
                        int length = licVarArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                licVar2 = null;
                                break;
                            }
                            lic licVar4 = licVarArr[i11];
                            if (e1c.class.isAssignableFrom(licVar4.getClass())) {
                                licVar2 = (lic) e1c.class.cast(licVar4);
                            }
                            licVar2 = null;
                            if (licVar2 != null) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                        e1c e1cVar = (e1c) licVar2;
                        if (e1cVar != null && e1cVar.b[0] == 0) {
                            this.A = this.x + 16;
                        }
                        int length2 = licVarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length2) {
                                licVar3 = null;
                                break;
                            }
                            lic licVar5 = licVarArr[i12];
                            if (e1c.class.isAssignableFrom(licVar5.getClass())) {
                                licVar3 = (lic) e1c.class.cast(licVar5);
                            }
                            licVar3 = null;
                            if (licVar3 != null) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        e1c e1cVar2 = (e1c) licVar3;
                        e1cVar2.getClass();
                        ArrayList a = e1cVar2.a();
                        ArrayList arrayList6 = new ArrayList(a.size());
                        int i13 = 0;
                        while (i13 < a.size()) {
                            int intValue = ((Integer) a.get(i13)).intValue();
                            if (intValue == 0) {
                                i8 = 1;
                            } else if (intValue != 1) {
                                i8 = 3;
                                if (intValue != 2) {
                                    i8 = intValue != 3 ? 0 : 4;
                                }
                            } else {
                                i8 = 2;
                            }
                            i13 = lnb.f(i8, arrayList6, i13, 1);
                        }
                        i = 0;
                        arrayList = arrayList6;
                    } else {
                        if (ricVar == null || (i10 & 64) == 0) {
                            i = 0;
                        } else {
                            lic[] licVarArr2 = ricVar.a;
                            int length3 = licVarArr2.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length3) {
                                    i = i9;
                                    licVar = null;
                                    break;
                                }
                                lic licVar6 = licVarArr2[i14];
                                if (e1c.class.isAssignableFrom(licVar6.getClass())) {
                                    licVar = (lic) e1c.class.cast(licVar6);
                                    i = i9;
                                } else {
                                    i = i9;
                                }
                                licVar = null;
                                if (licVar != null) {
                                    break;
                                }
                                i14++;
                                i9 = i;
                            }
                            e1c e1cVar3 = (e1c) licVar;
                            if (e1cVar3 != null) {
                                long G = new j9e(e1cVar3.b).G();
                                if (G > 0) {
                                    this.x = G;
                                    this.w = true;
                                    arrayDeque = arrayDeque2;
                                    z2 = true;
                                    z = z5;
                                    arrayDeque.clear();
                                    this.z = z2;
                                    if (!this.w && !z) {
                                        this.l = 2;
                                    }
                                }
                            }
                        }
                        arrayList = arrayList5;
                    }
                } else {
                    i = 0;
                    arrayList = arrayList5;
                    ricVar = null;
                }
                ArrayList arrayList7 = new ArrayList();
                boolean z6 = this.E == 1 ? 1 : i;
                hv8 hv8Var = new hv8();
                bxc B = axcVar.B(1969517665);
                if (B != null) {
                    ricVar2 = l12.k(B);
                    hv8Var.b(ricVar2);
                } else {
                    ricVar2 = null;
                }
                bxc B2 = axcVar.B(1836476516);
                B2.getClass();
                lic[] licVarArr3 = new lic[1];
                licVarArr3[i] = l12.g(B2.g);
                ric ricVar7 = new ric(licVarArr3);
                if ((i10 & 1) != 0) {
                    ricVar3 = ricVar7;
                    z3 = 1;
                } else {
                    ricVar3 = ricVar7;
                    z3 = i;
                }
                ric ricVar8 = ricVar3;
                ric ricVar9 = ricVar2;
                ArrayList j4 = l12.j(axcVar, hv8Var, C.TIME_UNSET, null, z3, z6, new m72(18), this.c);
                if (this.y) {
                    boolean z7 = arrayList.size() == j4.size() ? 1 : i;
                    Locale locale = Locale.US;
                    z1a.D(lnb.j(arrayList.size(), j4.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")"), z7);
                }
                String p = mha.p(j4);
                int i15 = i;
                int i16 = i15;
                long j5 = C.TIME_UNSET;
                int i17 = -1;
                while (i15 < j4.size()) {
                    xsj xsjVar = (xsj) j4.get(i15);
                    int i18 = xsjVar.b;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    long[] jArr2 = xsjVar.f;
                    jsj jsjVar = xsjVar.a;
                    if (i18 == 0) {
                        arrayList3 = arrayList;
                        arrayList2 = j4;
                        str = p;
                        i2 = i15;
                        arrayList4 = arrayList7;
                        z4 = z5;
                        ricVar5 = ricVar9;
                        ricVar6 = ricVar8;
                    } else {
                        arrayList2 = j4;
                        str = p;
                        pl6 pl6Var = this.B;
                        int i19 = i16 + 1;
                        z4 = z5;
                        int i20 = jsjVar.b;
                        ArrayList arrayList8 = arrayList7;
                        b bVar = jsjVar.g;
                        vsj mo2track = pl6Var.mo2track(i16, i20);
                        exc excVar = new exc(jsjVar, xsjVar, mo2track);
                        long j6 = jsjVar.e;
                        if (j6 == C.TIME_UNSET) {
                            j6 = xsjVar.i;
                        }
                        mo2track.f(j6);
                        long max = Math.max(j5, j6);
                        String str2 = bVar.o;
                        String str3 = bVar.o;
                        boolean equals = MimeTypes.AUDIO_TRUEHD.equals(str2);
                        int i21 = xsjVar.e;
                        int i22 = equals ? i21 * 16 : i21 + 30;
                        qm8 a2 = bVar.a();
                        a2.o = i22;
                        if (i20 == 2) {
                            int i23 = bVar.f;
                            if ((i10 & 8) != 0) {
                                i23 |= i17 == -1 ? 1 : 2;
                            }
                            int i24 = i23;
                            if (this.y) {
                                i7 = i24 | 32768;
                                arrayList3 = arrayList;
                                a2.g = ((Integer) arrayList.get(i15)).intValue();
                            } else {
                                arrayList3 = arrayList;
                                i7 = i24;
                            }
                            a2.f = i7;
                        } else {
                            arrayList3 = arrayList;
                        }
                        int[] iArr = xsjVar.h;
                        boolean z8 = xsjVar.j;
                        if (!sjc.o(str3) || jArr2.length <= 0) {
                            i2 = i15;
                        } else {
                            int min = Math.min(z8 ? xsjVar.b : iArr.length, 20);
                            z1a.E(j6 != C.TIME_UNSET ? 1 : i);
                            i2 = i15;
                            long min2 = Math.min(j6, 10000000L);
                            int i25 = i;
                            int i26 = i25;
                            int i27 = -1;
                            while (i25 < min) {
                                int i28 = z8 ? i25 : iArr[i25];
                                long j7 = jArr2[i28];
                                if (j7 > min2) {
                                    break;
                                }
                                if (j7 >= 0) {
                                    i6 = min;
                                    int i29 = xsjVar.d[i28];
                                    if (i29 > i26) {
                                        i26 = i29;
                                        i27 = i28;
                                    }
                                } else {
                                    i6 = min;
                                }
                                i25++;
                                min = i6;
                            }
                            if (i27 != -1) {
                                j2 = jArr2[i27];
                                if (j2 == C.TIME_UNSET) {
                                    qgj qgjVar = new qgj(j2);
                                    i3 = 1;
                                    lic[] licVarArr4 = new lic[1];
                                    licVarArr4[i] = qgjVar;
                                    ricVar4 = new ric(licVarArr4);
                                } else {
                                    i3 = 1;
                                    ricVar4 = null;
                                }
                                if (i20 == i3 && (i4 = hv8Var.a) != -1 && (i5 = hv8Var.b) != -1) {
                                    a2.I = i4;
                                    a2.J = i5;
                                }
                                ric ricVar10 = bVar.l;
                                ArrayList arrayList9 = this.j;
                                ric ricVar11 = !arrayList9.isEmpty() ? null : new ric(arrayList9);
                                ricVar5 = ricVar9;
                                ricVar6 = ricVar8;
                                yfa.H(i20, ricVar, a2, ricVar10, ricVar11, ricVar5, ricVar6, ricVar4);
                                a2.m = sjc.p(str);
                                if (Objects.equals(str3, MimeTypes.AUDIO_MPEG)) {
                                    w1l.r(a2, excVar.c);
                                } else {
                                    excVar.f = new b(a2);
                                }
                                if (i20 == 2 && i17 == -1) {
                                    i17 = arrayList8.size();
                                }
                                arrayList4 = arrayList8;
                                arrayList4.add(excVar);
                                i16 = i19;
                                j5 = max;
                            }
                        }
                        j2 = -9223372036854775807L;
                        if (j2 == C.TIME_UNSET) {
                        }
                        if (i20 == i3) {
                            a2.I = i4;
                            a2.J = i5;
                        }
                        ric ricVar102 = bVar.l;
                        ArrayList arrayList92 = this.j;
                        if (!arrayList92.isEmpty()) {
                        }
                        ricVar5 = ricVar9;
                        ricVar6 = ricVar8;
                        yfa.H(i20, ricVar, a2, ricVar102, ricVar11, ricVar5, ricVar6, ricVar4);
                        a2.m = sjc.p(str);
                        if (Objects.equals(str3, MimeTypes.AUDIO_MPEG)) {
                        }
                        if (i20 == 2) {
                            i17 = arrayList8.size();
                        }
                        arrayList4 = arrayList8;
                        arrayList4.add(excVar);
                        i16 = i19;
                        j5 = max;
                    }
                    arrayList7 = arrayList4;
                    ricVar9 = ricVar5;
                    ricVar8 = ricVar6;
                    arrayDeque2 = arrayDeque3;
                    j4 = arrayList2;
                    z5 = z4;
                    arrayList = arrayList3;
                    i15 = i2 + 1;
                    p = str;
                }
                arrayDeque = arrayDeque2;
                z = z5;
                int i30 = -1;
                boolean z9 = true;
                exc[] excVarArr = (exc[]) arrayList7.toArray(new exc[i]);
                this.C = excVarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[excVarArr.length][];
                    int[] iArr2 = new int[excVarArr.length];
                    long[] jArr3 = new long[excVarArr.length];
                    boolean[] zArr = new boolean[excVarArr.length];
                    for (int i31 = 0; i31 < excVarArr.length; i31++) {
                        jArr[i31] = new long[excVarArr[i31].b.b];
                        jArr3[i31] = excVarArr[i31].b.f[0];
                    }
                    int i32 = 0;
                    while (i32 < excVarArr.length) {
                        long j8 = Long.MAX_VALUE;
                        int i33 = i30;
                        for (int i34 = 0; i34 < excVarArr.length; i34++) {
                            if (!zArr[i34]) {
                                long j9 = jArr3[i34];
                                if (j9 <= j8) {
                                    i33 = i34;
                                    j8 = j9;
                                }
                            }
                        }
                        int i35 = iArr2[i33];
                        long[] jArr4 = jArr[i33];
                        jArr4[i35] = j3;
                        xsj xsjVar2 = excVarArr[i33].b;
                        boolean z10 = z9;
                        int[] iArr3 = iArr2;
                        j3 += xsjVar2.d[i35];
                        int i36 = i35 + 1;
                        iArr3[i33] = i36;
                        if (i36 < jArr4.length) {
                            jArr3[i33] = xsjVar2.f[i36];
                        } else {
                            zArr[i33] = z10;
                            i32++;
                        }
                        iArr2 = iArr3;
                        z9 = z10;
                        i30 = -1;
                    }
                }
                z2 = z9;
                this.D = jArr;
                this.B.endTracks();
                this.B.m(new cxc(j5, this.C, i17));
                arrayDeque.clear();
                this.z = z2;
                if (!this.w) {
                    this.l = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((axc) arrayDeque2.peek()).i.add(axcVar);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.o = 0;
        }
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (j == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.o = 0;
                return;
            } else {
                w0h w0hVar = this.i;
                w0hVar.a.clear();
                w0hVar.b = 0;
                this.j.clear();
                return;
            }
        }
        for (exc excVar : this.C) {
            xsj xsjVar = excVar.b;
            int a = xsjVar.a(j2);
            if (a == -1) {
                a = xsjVar.b(j2);
            }
            excVar.e = a;
            s1k s1kVar = excVar.d;
            if (s1kVar != null) {
                s1kVar.b = false;
                s1kVar.c = 0;
            }
        }
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
