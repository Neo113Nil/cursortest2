package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class er8 implements ll6 {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final b P;
    public long A;
    public long B;
    public cr8 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public pl6 I;
    public vsj[] J;
    public vsj[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final xli a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final j9e i;
    public final djj j;
    public final jy0 o;
    public final vsj p;
    public final j0l q;
    public vvf r;
    public int s;
    public int t;
    public long u;
    public int v;
    public j9e w;
    public long x;
    public int y;
    public long z;
    public final u36 k = new u36(1);
    public final j9e l = new j9e(16);
    public final j9e e = new j9e(kik.l);
    public final j9e f = new j9e(6);
    public final j9e g = new j9e();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        qm8 qm8Var = new qm8();
        qm8Var.n = sjc.p(MimeTypes.APPLICATION_EMSG);
        P = new b(qm8Var);
    }

    public er8(xli xliVar, int i, djj djjVar, List list, uoe uoeVar) {
        this.a = xliVar;
        this.b = i;
        this.j = djjVar;
        this.c = Collections.unmodifiableList(list);
        this.p = uoeVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new j9e(bArr);
        av9 av9Var = hv9.b;
        this.r = vvf.e;
        this.A = C.TIME_UNSET;
        this.z = C.TIME_UNSET;
        this.B = C.TIME_UNSET;
        this.I = pl6.p7;
        this.J = new vsj[0];
        this.K = new vsj[0];
        this.o = new jy0(new kt4(this, 26));
        this.q = new j0l(11);
        this.N = -1L;
    }

    public static int f(int i) {
        int i2 = (i & 1) != 0 ? 64 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    public static DrmInitData h(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            bxc bxcVar = (bxc) arrayList.get(i);
            if (bxcVar.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bxcVar.g.a;
                axn z = d2a.z(bArr);
                UUID uuid = z == null ? null : (UUID) z.b;
                if (uuid == null) {
                    tgj.d0("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, null, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void i(j9e j9eVar, int i, msj msjVar) {
        j9eVar.N(i + 8);
        int m = j9eVar.m();
        byte[] bArr = l12.a;
        if ((m & 1) != 0) {
            throw s9e.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m & 2) != 0;
        int E = j9eVar.E();
        if (E == 0) {
            Arrays.fill(msjVar.k, 0, msjVar.d, false);
            return;
        }
        int i2 = msjVar.d;
        j9e j9eVar2 = (j9e) msjVar.q;
        if (E != i2) {
            StringBuilder t = lnb.t(E, "Senc sample count ", " is different from fragment sample count");
            t.append(msjVar.d);
            throw s9e.a(null, t.toString());
        }
        Arrays.fill(msjVar.k, 0, E, z);
        j9eVar2.K(j9eVar.a());
        msjVar.j = true;
        msjVar.l = true;
        j9eVar.k(j9eVar2.a, 0, j9eVar2.c);
        j9eVar2.N(0);
        msjVar.l = false;
    }

    public static Pair j(long j, j9e j9eVar) {
        long G;
        long G2;
        j9e j9eVar2 = j9eVar;
        j9eVar2.N(8);
        int e = l12.e(j9eVar2.m());
        j9eVar2.O(4);
        long C = j9eVar2.C();
        if (e == 0) {
            G = j9eVar2.C();
            G2 = j9eVar2.C();
        } else {
            G = j9eVar2.G();
            G2 = j9eVar2.G();
        }
        long j2 = G2 + j;
        String str = nik.a;
        long b0 = nik.b0(G, 1000000L, C, RoundingMode.DOWN);
        j9eVar2.O(2);
        int H = j9eVar2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j3 = j2;
        long j4 = b0;
        int i = 0;
        while (i < H) {
            int m = j9eVar2.m();
            if ((Integer.MIN_VALUE & m) != 0) {
                throw s9e.a(null, "Unhandled indirect reference");
            }
            long C2 = j9eVar2.C();
            iArr[i] = m & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            G += C2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long b02 = nik.b0(G, 1000000L, C, RoundingMode.DOWN);
            jArr4[i] = b02 - jArr5[i];
            j9eVar2.O(4);
            j3 += iArr[i];
            i++;
            H = H;
            j9eVar2 = j9eVar;
            j4 = b02;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(b0), new ou2(iArr, jArr, jArr2, jArr3));
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        vvf vvfVar;
        moh K = ok3.K(nl6Var, true, false);
        if (K != null) {
            vvfVar = hv9.z(K);
        } else {
            av9 av9Var = hv9.b;
            vvfVar = vvf.e;
        }
        this.r = vvfVar;
        return K == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x066a, code lost:
    
        throw defpackage.s9e.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x00c8, code lost:
    
        r9 = r2.a;
        r5 = r2.b;
        r11 = "video/hevc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x00d5, code lost:
    
        if (r32.s != 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x00d9, code lost:
    
        if (r2.m != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x00db, code lost:
    
        r10 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x00ea, code lost:
    
        r32.D = r10;
        r10 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x00f8, code lost:
    
        if (java.util.Objects.equals(r10.o, "video/avc") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x00fc, code lost:
    
        if ((r4 & 64) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x00fe, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0111, code lost:
    
        r32.G = r4 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0119, code lost:
    
        if (r2.f >= r2.i) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x011b, code lost:
    
        r33.skipFully(r32.D);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0124, code lost:
    
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0127, code lost:
    
        r3 = (defpackage.j9e) r5.q;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x012d, code lost:
    
        if (r1 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x012f, code lost:
    
        r3.O(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0132, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0136, code lost:
    
        if (r5.j == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x013c, code lost:
    
        if (r5.k[r1] == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x013e, code lost:
    
        r3.O(r3.H() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x014a, code lost:
    
        if (r2.c() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x014c, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x014f, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0152, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x015b, code lost:
    
        if (r2.d.a.h != r22) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x015d, code lost:
    
        r32.D -= 8;
        r33.skipFully(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0168, code lost:
    
        r4 = "audio/ac4".equals(r2.d.a.g.o);
        r10 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0178, code lost:
    
        if (r4 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x017a, code lost:
    
        r32.E = r2.d(r10, 7);
        defpackage.s02.I(r32.D, r8);
        r9.g(7, r8);
        r8 = r32.E + 7;
        r32.E = r8;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0199, code lost:
    
        r32.D += r8;
        r32.s = 4;
        r32.F = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0191, code lost:
    
        r4 = r21;
        r8 = r2.d(r10, r4);
        r32.E = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0101, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x010a, code lost:
    
        if (java.util.Objects.equals(r10.o, "video/hevc") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x010e, code lost:
    
        if ((r4 & 128) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x00e4, code lost:
    
        r10 = r5.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01a2, code lost:
    
        r4 = r2.d;
        r8 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x01a8, code lost:
    
        if (r2.m != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01aa, code lost:
    
        r15 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01b0, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01b9, code lost:
    
        if (r6 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01bb, code lost:
    
        r4 = r6.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01bf, code lost:
    
        r10 = r8.k;
        r8 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01c3, code lost:
    
        if (r10 == 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01c5, code lost:
    
        r15 = r32.f;
        r13 = r15.a;
        r13[0] = 0;
        r13[1] = 0;
        r13[r19] = 0;
        r14 = 4 - r10;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x01d7, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01dd, code lost:
    
        if (r32.E >= r32.D) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01df, code lost:
    
        r2 = r32.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01e1, code lost:
    
        if (r2 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01e6, code lost:
    
        if (r32.K.length > 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01ea, code lost:
    
        if (r32.G != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0201, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0202, code lost:
    
        r33.readFully(r13, r14, r20 + r2);
        r15.N(0);
        r21 = r15.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x020f, code lost:
    
        if (r21 < 0) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0211, code lost:
    
        r32.F = r21 - r2;
        r10 = r32.e;
        r26 = r14;
        r10.N(0);
        r9.g(4, r10);
        r32.E += 4;
        r32.D += r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x022f, code lost:
    
        if (r32.K.length <= 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0231, code lost:
    
        if (r2 <= 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0233, code lost:
    
        r10 = defpackage.kik.w(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0237, code lost:
    
        if (r10 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x023e, code lost:
    
        switch(r10.hashCode()) {
            case -1662541442: goto L128;
            case 1331836730: goto L124;
            case 1331856911: goto L120;
            default: goto L119;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0241, code lost:
    
        r10 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0260, code lost:
    
        switch(r10) {
            case 0: goto L140;
            case 1: goto L137;
            case 2: goto L134;
            default: goto L143;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x026f, code lost:
    
        if (((r13[5] & 248) >> 3) != 23) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x028b, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x028e, code lost:
    
        r32.H = r10;
        r9.g(r2, r15);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0298, code lost:
    
        if (r2 <= 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x029c, code lost:
    
        if (r32.G != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x02a2, code lost:
    
        if (defpackage.kik.H(r13, r2, r8) == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x02a4, code lost:
    
        r32.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x02a7, code lost:
    
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x02a9, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0279, code lost:
    
        if ((r13[4] & 31) != 6) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0289, code lost:
    
        if (((r13[4] & 126) >> 1) != 39) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0249, code lost:
    
        if (r10.equals("video/vvc") != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x024c, code lost:
    
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0253, code lost:
    
        if (r10.equals("video/avc") != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0256, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x025c, code lost:
    
        if (r10.equals(r11) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x025f, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x028d, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x02b4, code lost:
    
        throw defpackage.s9e.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x01ec, code lost:
    
        r2 = defpackage.kik.K(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x01fc, code lost:
    
        if ((r20 + r2) > (r32.D - r32.E)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x01fe, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x02b5, code lost:
    
        r26 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x02b9, code lost:
    
        if (r32.H == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x02bb, code lost:
    
        r10 = r32.g;
        r10.K(r2);
        r25 = r11;
        r33.readFully(r10.a, 0, r32.F);
        r9.g(r32.F, r10);
        r2 = r32.F;
        r2 = defpackage.kik.d0(r10.a, r10.c);
        r10.N(0);
        r10.M(r2);
        r2 = r8.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x02e4, code lost:
    
        if (r2 != (-1)) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x02e8, code lost:
    
        if (r7.a == 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x02ea, code lost:
    
        r7.f(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x02f5, code lost:
    
        r7.b(r4, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0301, code lost:
    
        if ((r17.a() & 4) == 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0303, code lost:
    
        r7.d(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0306, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0312, code lost:
    
        r32.E += r2;
        r32.F -= r2;
        r10 = r20;
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x02f0, code lost:
    
        if (r7.a == r2) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x02f2, code lost:
    
        r7.f(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0309, code lost:
    
        r25 = r11;
        r2 = r9.c(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0335, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x033b, code lost:
    
        if (r32.G != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x033d, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0340, code lost:
    
        r12 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0345, code lost:
    
        if (r1 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0347, code lost:
    
        r15 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x034c, code lost:
    
        r10 = r4;
        r9.a(r10, r12, r32.D, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0357, code lost:
    
        if (r3.isEmpty() != false) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0359, code lost:
    
        r1 = (defpackage.ar8) r3.removeFirst();
        r32.y -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x036a, code lost:
    
        if (r1.b == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x036c, code lost:
    
        r4 = r4 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x036d, code lost:
    
        if (r6 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x036f, code lost:
    
        r4 = r6.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0373, code lost:
    
        r26 = r4;
        r2 = r32.J;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0379, code lost:
    
        if (r5 >= r4) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x037b, code lost:
    
        r2[r5].a(r26, 1, r1.c, r32.y, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0393, code lost:
    
        if (r17.c() != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0395, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0398, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x039d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x034b, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0321, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0323, code lost:
    
        r2 = r32.E;
        r7 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0327, code lost:
    
        if (r2 >= r7) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0329, code lost:
    
        r32.E += r9.c(r33, r7 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x01b2, code lost:
    
        r15 = r5.h[r2.f];
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        char c;
        int i;
        int i2;
        int i3;
        String v;
        String v2;
        long b0;
        long j;
        long b02;
        long C;
        int i4;
        while (true) {
            int i5 = this.s;
            ArrayDeque arrayDeque = this.m;
            jy0 jy0Var = this.o;
            j9e j9eVar = this.i;
            j0l j0lVar = this.q;
            SparseArray sparseArray = this.d;
            int i6 = 1;
            if (i5 != 0) {
                ArrayDeque arrayDeque2 = this.n;
                int i7 = this.b;
                djj djjVar = this.j;
                if (i5 != 1) {
                    long j2 = Long.MAX_VALUE;
                    if (i5 != 2) {
                        cr8 cr8Var = this.C;
                        if (cr8Var != null) {
                            c = 2;
                            i = 1;
                            i2 = 8;
                            i3 = 0;
                            break;
                        }
                        int size = sparseArray.size();
                        c = 2;
                        cr8 cr8Var2 = null;
                        int i8 = 0;
                        while (i8 < size) {
                            cr8 cr8Var3 = (cr8) sparseArray.valueAt(i8);
                            boolean z = cr8Var3.m;
                            int i9 = i6;
                            msj msjVar = cr8Var3.b;
                            if ((z || cr8Var3.f != cr8Var3.d.b) && (!z || cr8Var3.h != msjVar.c)) {
                                long j3 = !z ? cr8Var3.d.c[cr8Var3.f] : msjVar.e[cr8Var3.h];
                                if (j3 < j2) {
                                    j2 = j3;
                                    cr8Var2 = cr8Var3;
                                }
                            }
                            i8++;
                            i6 = i9;
                        }
                        i = i6;
                        i2 = 8;
                        i3 = 0;
                        if (cr8Var2 == null) {
                            int position = (int) (this.x - nl6Var.getPosition());
                            if (position < 0) {
                                throw s9e.a(null, "Offset to end of mdat was negative.");
                            }
                            nl6Var.skipFully(position);
                            g();
                        } else {
                            int position2 = (int) ((!cr8Var2.m ? cr8Var2.d.c[cr8Var2.f] : cr8Var2.b.e[cr8Var2.h]) - nl6Var.getPosition());
                            if (position2 < 0) {
                                tgj.d0("Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            nl6Var.skipFully(position2);
                            this.C = cr8Var2;
                            cr8Var = cr8Var2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        cr8 cr8Var4 = null;
                        for (int i10 = 0; i10 < size2; i10++) {
                            msj msjVar2 = ((cr8) sparseArray.valueAt(i10)).b;
                            if (msjVar2.l) {
                                long j4 = msjVar2.b;
                                if (j4 < j2) {
                                    cr8Var4 = (cr8) sparseArray.valueAt(i10);
                                    j2 = j4;
                                }
                            }
                        }
                        if (cr8Var4 == null) {
                            this.s = 3;
                        } else {
                            int position3 = (int) (j2 - nl6Var.getPosition());
                            if (position3 < 0) {
                                throw s9e.a(null, "Offset to encryption data was negative.");
                            }
                            nl6Var.skipFully(position3);
                            msj msjVar3 = cr8Var4.b;
                            j9e j9eVar2 = (j9e) msjVar3.q;
                            nl6Var.readFully(j9eVar2.a, 0, j9eVar2.c);
                            j9eVar2.N(0);
                            msjVar3.l = false;
                        }
                    }
                } else {
                    int i11 = (int) (this.u - this.v);
                    j9e j9eVar3 = this.w;
                    if (j9eVar3 != null) {
                        nl6Var.readFully(j9eVar3.a, 8, i11);
                        int i12 = this.t;
                        bxc bxcVar = new bxc(i12, j9eVar3);
                        if (!arrayDeque.isEmpty()) {
                            ((axc) arrayDeque.peek()).h.add(bxcVar);
                        } else if (i12 == 1936286840) {
                            Pair j5 = j(nl6Var.getPosition(), j9eVar3);
                            j0lVar.f((ou2) j5.second);
                            LinkedHashMap linkedHashMap = (LinkedHashMap) j0lVar.b;
                            this.B = ((Long) j5.first).longValue();
                            if (this.M) {
                                i4 = 1;
                            } else {
                                i4 = 1;
                                this.I.m(linkedHashMap.size() == 1 ? (b0h) j5.second : j0lVar.q());
                                this.L = true;
                            }
                            if ((i7 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && !this.M && linkedHashMap.size() > i4) {
                                this.N = nl6Var.getPosition();
                            }
                        } else if (i12 == 1701671783 && this.J.length != 0) {
                            j9eVar3.N(8);
                            int e = l12.e(j9eVar3.m());
                            long j6 = C.TIME_UNSET;
                            if (e == 0) {
                                v = j9eVar3.v();
                                v.getClass();
                                v2 = j9eVar3.v();
                                v2.getClass();
                                long C2 = j9eVar3.C();
                                long C3 = j9eVar3.C();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                b0 = nik.b0(C3, 1000000L, C2, roundingMode);
                                long j7 = this.B;
                                j = j7 != C.TIME_UNSET ? j7 + b0 : -9223372036854775807L;
                                b02 = nik.b0(j9eVar3.C(), 1000L, C2, roundingMode);
                                C = j9eVar3.C();
                            } else if (e != 1) {
                                fn0.r(e, "Skipping unsupported emsg version: ");
                            } else {
                                long C4 = j9eVar3.C();
                                long G = j9eVar3.G();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long b03 = nik.b0(G, 1000000L, C4, roundingMode2);
                                long b04 = nik.b0(j9eVar3.C(), 1000L, C4, roundingMode2);
                                long C5 = j9eVar3.C();
                                v = j9eVar3.v();
                                v.getClass();
                                v2 = j9eVar3.v();
                                v2.getClass();
                                b02 = b04;
                                C = C5;
                                j = b03;
                                b0 = -9223372036854775807L;
                            }
                            String str = v;
                            String str2 = v2;
                            byte[] bArr = new byte[j9eVar3.a()];
                            j9eVar3.k(bArr, 0, j9eVar3.a());
                            j9e j9eVar4 = new j9e(this.k.a(new s36(str, str2, b02, C, bArr)));
                            int a = j9eVar4.a();
                            vsj[] vsjVarArr = this.J;
                            int length = vsjVarArr.length;
                            int i13 = 0;
                            while (i13 < length) {
                                vsj vsjVar = vsjVarArr[i13];
                                j9eVar4.N(0);
                                vsjVar.g(a, j9eVar4);
                                i13++;
                                j6 = j6;
                            }
                            if (j == j6) {
                                arrayDeque2.addLast(new ar8(b0, a, true));
                                this.y += a;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new ar8(j, a, false));
                                this.y += a;
                            } else if (djjVar == null || djjVar.e()) {
                                if (djjVar != null) {
                                    j = djjVar.a(j);
                                }
                                long j8 = j;
                                for (vsj vsjVar2 : this.J) {
                                    vsjVar2.a(j8, 1, a, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new ar8(j, a, false));
                                this.y += a;
                            }
                        }
                    } else {
                        nl6Var.skipFully(i11);
                    }
                    k(nl6Var.getPosition());
                }
            } else {
                int i14 = this.v;
                j9e j9eVar5 = this.l;
                if (i14 == 0) {
                    if (!nl6Var.readFully(j9eVar5.a, 0, 8, true)) {
                        long j9 = this.N;
                        if (j9 == -1) {
                            jy0Var.d(0);
                            return -1;
                        }
                        b78Var.a = j9;
                        this.N = -1L;
                        this.I.m(j0lVar.q());
                        this.M = true;
                        return 1;
                    }
                    this.v = 8;
                    j9eVar5.N(0);
                    this.u = j9eVar5.C();
                    this.t = j9eVar5.m();
                }
                long j10 = this.u;
                if (j10 == 1) {
                    nl6Var.readFully(j9eVar5.a, 8, 8);
                    this.v += 8;
                    this.u = j9eVar5.G();
                } else if (j10 == 0) {
                    long length2 = nl6Var.getLength();
                    if (length2 == -1 && !arrayDeque.isEmpty()) {
                        length2 = ((axc) arrayDeque.peek()).g;
                    }
                    if (length2 != -1) {
                        this.u = (length2 - nl6Var.getPosition()) + this.v;
                    }
                }
                long j11 = this.u;
                int i15 = this.v;
                long j12 = i15;
                if (j11 < j12) {
                    if (this.t != 1718773093 || i15 != 8) {
                        break;
                    }
                    this.u = j12;
                    j11 = j12;
                }
                if (this.N != -1) {
                    if (this.t == 1936286840) {
                        j9eVar.K((int) j11);
                        System.arraycopy(j9eVar5.a, 0, j9eVar.a, 0, 8);
                        nl6Var.readFully(j9eVar.a, 8, (int) (this.u - this.v));
                        j0lVar.f((ou2) j(nl6Var.getPeekPosition(), j9eVar).second);
                    } else {
                        nl6Var.skipFully((int) (j11 - j12), true);
                    }
                    g();
                } else {
                    long position4 = nl6Var.getPosition() - this.v;
                    int i16 = this.t;
                    if ((i16 == 1836019558 || i16 == 1835295092) && !this.L) {
                        this.I.m(new bw0(this.A, position4));
                        this.L = true;
                    }
                    if (this.t == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            msj msjVar4 = ((cr8) sparseArray.valueAt(i17)).b;
                            msjVar4.getClass();
                            msjVar4.b = position4;
                            msjVar4.a = position4;
                        }
                    }
                    int i18 = this.t;
                    if (i18 == 1835295092) {
                        this.C = null;
                        this.x = position4 + this.u;
                        this.s = 2;
                    } else if (i18 == 1836019574 || i18 == 1953653099 || i18 == 1835297121 || i18 == 1835626086 || i18 == 1937007212 || i18 == 1836019558 || i18 == 1953653094 || i18 == 1836475768 || i18 == 1701082227 || i18 == 1835365473) {
                        long position5 = nl6Var.getPosition();
                        long j13 = this.u;
                        long j14 = (position5 + j13) - 8;
                        if (j13 != this.v && this.t == 1835365473) {
                            j9eVar.K(8);
                            nl6Var.peekFully(j9eVar.a, 0, 8);
                            l12.a(j9eVar);
                            nl6Var.skipFully(j9eVar.b);
                            nl6Var.resetPeekPosition();
                        }
                        arrayDeque.push(new axc(this.t, j14));
                        if (this.u == this.v) {
                            k(j14);
                        } else {
                            g();
                        }
                    } else if (i18 == 1751411826 || i18 == 1835296868 || i18 == 1836476516 || i18 == 1936286840 || i18 == 1937011556 || i18 == 1937011827 || i18 == 1668576371 || i18 == 1937011555 || i18 == 1937011578 || i18 == 1937013298 || i18 == 1937007471 || i18 == 1668232756 || i18 == 1937011571 || i18 == 1952867444 || i18 == 1952868452 || i18 == 1953196132 || i18 == 1953654136 || i18 == 1953658222 || i18 == 1886614376 || i18 == 1935763834 || i18 == 1935763823 || i18 == 1936027235 || i18 == 1970628964 || i18 == 1935828848 || i18 == 1936158820 || i18 == 1701606260 || i18 == 1835362404 || i18 == 1701671783 || i18 == 1969517665 || i18 == 1801812339 || i18 == 1768715124) {
                        if (this.v != 8) {
                            throw s9e.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.u > 2147483647L) {
                            throw s9e.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        j9e j9eVar6 = new j9e((int) this.u);
                        System.arraycopy(j9eVar5.a, 0, j9eVar6.a, 0, 8);
                        this.w = j9eVar6;
                        this.s = 1;
                    } else {
                        if (this.u > 2147483647L) {
                            throw s9e.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.w = null;
                        this.s = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.ll6
    public final List d() {
        return this.r;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            pl6Var = new en0(pl6Var, this.a);
        }
        this.I = pl6Var;
        g();
        vsj[] vsjVarArr = new vsj[2];
        this.J = vsjVarArr;
        int i3 = 0;
        vsj vsjVar = this.p;
        if (vsjVar != null) {
            vsjVarArr[0] = vsjVar;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            vsjVarArr[i] = this.I.mo2track(100, 5);
            i4 = 101;
            i++;
        }
        vsj[] vsjVarArr2 = (vsj[]) nik.V(this.J, i);
        this.J = vsjVarArr2;
        for (vsj vsjVar2 : vsjVarArr2) {
            vsjVar2.d(P);
        }
        List list = this.c;
        this.K = new vsj[list.size()];
        while (i3 < this.K.length) {
            vsj mo2track = this.I.mo2track(i4, 3);
            mo2track.d((b) list.get(i3));
            this.K[i3] = mo2track;
            i3++;
            i4++;
        }
    }

    public final void g() {
        this.s = 0;
        this.v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0437, code lost:
    
        if ((defpackage.nik.b0(r40, 1000000, r7, r46) + defpackage.nik.b0(r7[0], 1000000, r2.c, r46)) >= r2.e) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x080c, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x080f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0720  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(long j) {
        ric ricVar;
        int i;
        long j2;
        gs4 gs4Var;
        int i2;
        gs4 gs4Var2;
        ArrayList arrayList;
        int i3;
        int i4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i5;
        int i6;
        int i7;
        int size;
        int i8;
        byte[] bArr;
        int i9;
        boolean z;
        int i10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        int i13;
        int i14;
        int i15;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((axc) arrayDeque.peek()).g != j) {
                break;
            }
            axc axcVar = (axc) arrayDeque.pop();
            int i16 = axcVar.b;
            ArrayList arrayList6 = axcVar.i;
            ArrayList arrayList7 = axcVar.h;
            int i17 = this.b;
            int i18 = 12;
            SparseArray sparseArray = this.d;
            if (i16 == 1836019574) {
                DrmInitData h = h(arrayList7);
                axc A = axcVar.A(1836475768);
                A.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList8 = A.h;
                int size2 = arrayList8.size();
                int i19 = 0;
                long j3 = C.TIME_UNSET;
                while (i19 < size2) {
                    bxc bxcVar = (bxc) arrayList8.get(i19);
                    int i20 = bxcVar.b;
                    j9e j9eVar = bxcVar.g;
                    if (i20 == 1953654136) {
                        j9eVar.N(i18);
                        arrayList = arrayList8;
                        Pair create = Pair.create(Integer.valueOf(j9eVar.m()), new gs4(j9eVar.m() - 1, j9eVar.m(), j9eVar.m(), j9eVar.m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (gs4) create.second);
                    } else {
                        arrayList = arrayList8;
                        if (i20 == 1835362404) {
                            j9eVar.N(8);
                            j3 = l12.e(j9eVar.m()) == 0 ? j9eVar.C() : j9eVar.G();
                        }
                    }
                    i19++;
                    arrayList8 = arrayList;
                    i18 = 12;
                }
                int i21 = 0;
                axc A2 = axcVar.A(1835365473);
                ric f = A2 != null ? l12.f(A2) : null;
                hv8 hv8Var = new hv8();
                bxc B = axcVar.B(1969517665);
                if (B != null) {
                    ric k = l12.k(B);
                    hv8Var.b(k);
                    ricVar = k;
                } else {
                    ricVar = null;
                }
                bxc B2 = axcVar.B(1836476516);
                B2.getClass();
                ric ricVar2 = new ric(l12.g(B2.g));
                ArrayList j4 = l12.j(axcVar, hv8Var, j3, h, (i17 & 16) != 0, false, new m72(this, 10), false);
                int size3 = j4.size();
                if (sparseArray.size() == 0) {
                    String p = mha.p(j4);
                    int i22 = 0;
                    while (i22 < size3) {
                        xsj xsjVar = (xsj) j4.get(i22);
                        jsj jsjVar = xsjVar.a;
                        pl6 pl6Var = this.I;
                        int i23 = jsjVar.b;
                        int i24 = jsjVar.a;
                        String str = p;
                        b bVar = jsjVar.g;
                        long j5 = jsjVar.e;
                        vsj mo2track = pl6Var.mo2track(i22, i23);
                        mo2track.f(j5);
                        int i25 = i22;
                        qm8 a = bVar.a();
                        ArrayList arrayList9 = j4;
                        a.m = sjc.p(str);
                        if (i23 == 1) {
                            int i26 = hv8Var.a;
                            i = size3;
                            j2 = j5;
                            if (i26 != -1 && (i2 = hv8Var.b) != -1) {
                                a.I = i26;
                                a.J = i2;
                            }
                        } else {
                            i = size3;
                            j2 = j5;
                        }
                        yfa.H(i23, f, a, bVar.l, ricVar, ricVar2);
                        if (sparseArray2.size() == 1) {
                            gs4Var = (gs4) sparseArray2.valueAt(i21);
                        } else {
                            gs4Var = (gs4) sparseArray2.get(i24);
                            gs4Var.getClass();
                        }
                        sparseArray.put(i24, new cr8(mo2track, xsjVar, gs4Var, new b(a)));
                        this.A = Math.max(this.A, j2);
                        i22 = i25 + 1;
                        p = str;
                        j4 = arrayList9;
                        size3 = i;
                        i21 = 0;
                    }
                    this.I.endTracks();
                } else {
                    ArrayList arrayList10 = j4;
                    z1a.E(sparseArray.size() == size3);
                    int i27 = 0;
                    while (i27 < size3) {
                        ArrayList arrayList11 = arrayList10;
                        xsj xsjVar2 = (xsj) arrayList11.get(i27);
                        int i28 = xsjVar2.a.a;
                        cr8 cr8Var = (cr8) sparseArray.get(i28);
                        if (sparseArray2.size() == 1) {
                            gs4Var2 = (gs4) sparseArray2.valueAt(0);
                        } else {
                            gs4Var2 = (gs4) sparseArray2.get(i28);
                            gs4Var2.getClass();
                        }
                        cr8Var.d = xsjVar2;
                        cr8Var.e = gs4Var2;
                        cr8Var.a.d(cr8Var.j);
                        cr8Var.e();
                        i27++;
                        arrayList10 = arrayList11;
                    }
                }
            } else if (i16 == 1836019558) {
                int size4 = arrayList6.size();
                int i29 = 0;
                while (i29 < size4) {
                    axc axcVar2 = (axc) arrayList6.get(i29);
                    if (axcVar2.b == 1953653094) {
                        bxc B3 = axcVar2.B(1952868452);
                        ArrayList arrayList12 = axcVar2.h;
                        B3.getClass();
                        j9e j9eVar2 = B3.g;
                        j9eVar2.N(8);
                        int m = j9eVar2.m();
                        byte[] bArr2 = l12.a;
                        cr8 cr8Var2 = (cr8) sparseArray.get(j9eVar2.m());
                        if (cr8Var2 == null) {
                            i3 = size4;
                            cr8Var2 = null;
                        } else {
                            msj msjVar = cr8Var2.b;
                            if ((m & 1) != 0) {
                                long G = j9eVar2.G();
                                msjVar.a = G;
                                msjVar.b = G;
                            }
                            gs4 gs4Var3 = cr8Var2.e;
                            int m2 = (m & 2) != 0 ? j9eVar2.m() - 1 : gs4Var3.a;
                            int m3 = (m & 8) != 0 ? j9eVar2.m() : gs4Var3.b;
                            if ((m & 16) != 0) {
                                i3 = size4;
                                i6 = j9eVar2.m();
                            } else {
                                i3 = size4;
                                i6 = gs4Var3.c;
                            }
                            msjVar.o = new gs4(m2, m3, i6, (m & 32) != 0 ? j9eVar2.m() : gs4Var3.d);
                        }
                        if (cr8Var2 == null) {
                            i4 = i29;
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            i5 = i17;
                        } else {
                            msj msjVar2 = cr8Var2.b;
                            long j6 = msjVar2.m;
                            boolean z4 = msjVar2.n;
                            cr8Var2.e();
                            cr8Var2.m = true;
                            bxc B4 = axcVar2.B(1952867444);
                            if (B4 == null || (i17 & 2) != 0) {
                                msjVar2.m = j6;
                                msjVar2.n = z4;
                            } else {
                                j9e j9eVar3 = B4.g;
                                j9eVar3.N(8);
                                msjVar2.m = l12.e(j9eVar3.m()) == 1 ? j9eVar3.G() : j9eVar3.C();
                                msjVar2.n = true;
                            }
                            int size5 = arrayList12.size();
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                i7 = 1953658222;
                                if (i30 >= size5) {
                                    break;
                                }
                                bxc bxcVar2 = (bxc) arrayList12.get(i30);
                                int i33 = i29;
                                if (bxcVar2.b == 1953658222) {
                                    j9e j9eVar4 = bxcVar2.g;
                                    j9eVar4.N(12);
                                    int E = j9eVar4.E();
                                    if (E > 0) {
                                        i32 += E;
                                        i31++;
                                    }
                                }
                                i30++;
                                i29 = i33;
                            }
                            i4 = i29;
                            cr8Var2.h = 0;
                            cr8Var2.g = 0;
                            cr8Var2.f = 0;
                            msjVar2.c = i31;
                            msjVar2.d = i32;
                            if (msjVar2.f.length < i31) {
                                msjVar2.e = new long[i31];
                                msjVar2.f = new int[i31];
                            }
                            if (msjVar2.g.length < i32) {
                                int i34 = (i32 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                msjVar2.g = new int[i34];
                                msjVar2.h = new long[i34];
                                msjVar2.i = new boolean[i34];
                                msjVar2.k = new boolean[i34];
                            }
                            int i35 = 0;
                            int i36 = 0;
                            int i37 = 0;
                            while (true) {
                                long j7 = 0;
                                if (i35 < size5) {
                                    bxc bxcVar3 = (bxc) arrayList12.get(i35);
                                    if (bxcVar3.b == i7) {
                                        int i38 = i36 + 1;
                                        j9e j9eVar5 = bxcVar3.g;
                                        j9eVar5.N(8);
                                        int m4 = j9eVar5.m();
                                        byte[] bArr3 = l12.a;
                                        i10 = i35;
                                        jsj jsjVar2 = cr8Var2.d.a;
                                        arrayList4 = arrayList6;
                                        gs4 gs4Var4 = (gs4) msjVar2.o;
                                        String str2 = nik.a;
                                        arrayList5 = arrayList7;
                                        msjVar2.f[i36] = j9eVar5.E();
                                        long[] jArr = msjVar2.e;
                                        i11 = size5;
                                        i12 = i17;
                                        long j8 = msjVar2.a;
                                        jArr[i36] = j8;
                                        if ((m4 & 1) != 0) {
                                            jArr[i36] = j8 + j9eVar5.m();
                                        }
                                        boolean z5 = (m4 & 4) != 0;
                                        int i39 = gs4Var4.d;
                                        if (z5) {
                                            i39 = j9eVar5.m();
                                        }
                                        boolean z6 = (m4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
                                        boolean z7 = z5;
                                        boolean z8 = (m4 & 512) != 0;
                                        boolean z9 = (m4 & 1024) != 0;
                                        boolean z10 = (m4 & a.o) != 0;
                                        boolean z11 = z9;
                                        long[] jArr2 = jsjVar2.i;
                                        int i40 = i39;
                                        long[] jArr3 = jsjVar2.j;
                                        if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                            z2 = z6;
                                        } else {
                                            long j9 = jArr2[0];
                                            if (j9 == 0) {
                                                z2 = z6;
                                            } else {
                                                z2 = z6;
                                                long j10 = jsjVar2.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                            }
                                            j7 = jArr3[0];
                                        }
                                        int[] iArr = msjVar2.g;
                                        long[] jArr4 = msjVar2.h;
                                        boolean z12 = z2;
                                        boolean[] zArr = msjVar2.i;
                                        boolean z13 = jsjVar2.b == 2 && (i12 & 1) != 0;
                                        int i41 = msjVar2.f[i36] + i37;
                                        int i42 = i37;
                                        long j11 = jsjVar2.c;
                                        boolean z14 = z10;
                                        long j12 = msjVar2.m;
                                        int i43 = i42;
                                        while (i43 < i41) {
                                            int m5 = z12 ? j9eVar5.m() : gs4Var4.b;
                                            boolean z15 = z14;
                                            if (m5 < 0) {
                                                throw s9e.a(null, "Unexpected negative value: " + m5);
                                            }
                                            if (z8) {
                                                z3 = z13;
                                                i13 = j9eVar5.m();
                                            } else {
                                                z3 = z13;
                                                i13 = gs4Var4.c;
                                            }
                                            if (i13 < 0) {
                                                throw s9e.a(null, "Unexpected negative value: " + i13);
                                            }
                                            int m6 = z11 ? j9eVar5.m() : (i43 == 0 && z7) ? i40 : gs4Var4.d;
                                            if (z15) {
                                                i14 = m6;
                                                i15 = j9eVar5.m();
                                            } else {
                                                i14 = m6;
                                                i15 = 0;
                                            }
                                            int i44 = i41;
                                            long[] jArr5 = jArr4;
                                            long b0 = nik.b0((i15 + j12) - j7, 1000000L, j11, RoundingMode.DOWN);
                                            jArr5[i43] = b0;
                                            if (!msjVar2.n) {
                                                jArr5[i43] = b0 + cr8Var2.d.i;
                                            }
                                            iArr[i43] = i13;
                                            zArr[i43] = ((i14 >> 16) & 1) == 0 && (!z3 || i43 == 0);
                                            j12 += m5;
                                            i43++;
                                            z14 = z15;
                                            z13 = z3;
                                            jArr4 = jArr5;
                                            i41 = i44;
                                        }
                                        msjVar2.m = j12;
                                        i36 = i38;
                                        i37 = i41;
                                    } else {
                                        i10 = i35;
                                        arrayList4 = arrayList6;
                                        arrayList5 = arrayList7;
                                        i11 = size5;
                                        i12 = i17;
                                    }
                                    i35 = i10 + 1;
                                    arrayList6 = arrayList4;
                                    arrayList7 = arrayList5;
                                    i17 = i12;
                                    size5 = i11;
                                    i7 = 1953658222;
                                } else {
                                    arrayList2 = arrayList6;
                                    arrayList3 = arrayList7;
                                    i5 = i17;
                                    jsj jsjVar3 = cr8Var2.d.a;
                                    gs4 gs4Var5 = (gs4) msjVar2.o;
                                    gs4Var5.getClass();
                                    lsj lsjVar = jsjVar3.l[gs4Var5.a];
                                    bxc B5 = axcVar2.B(1935763834);
                                    if (B5 != null) {
                                        lsjVar.getClass();
                                        j9e j9eVar6 = B5.g;
                                        int i45 = lsjVar.d;
                                        j9eVar6.N(8);
                                        int m7 = j9eVar6.m();
                                        byte[] bArr4 = l12.a;
                                        if ((m7 & 1) == 1) {
                                            j9eVar6.O(8);
                                        }
                                        int A3 = j9eVar6.A();
                                        int E2 = j9eVar6.E();
                                        if (E2 > msjVar2.d) {
                                            StringBuilder t = lnb.t(E2, "Saiz sample count ", " is greater than fragment sample count");
                                            t.append(msjVar2.d);
                                            throw s9e.a(null, t.toString());
                                        }
                                        if (A3 == 0) {
                                            boolean[] zArr2 = msjVar2.k;
                                            i9 = 0;
                                            for (int i46 = 0; i46 < E2; i46++) {
                                                int A4 = j9eVar6.A();
                                                i9 += A4;
                                                zArr2[i46] = A4 > i45;
                                            }
                                            z = false;
                                        } else {
                                            boolean z16 = A3 > i45;
                                            i9 = A3 * E2;
                                            z = false;
                                            Arrays.fill(msjVar2.k, 0, E2, z16);
                                        }
                                        Arrays.fill(msjVar2.k, E2, msjVar2.d, z);
                                        if (i9 > 0) {
                                            ((j9e) msjVar2.q).K(i9);
                                            msjVar2.j = true;
                                            msjVar2.l = true;
                                        }
                                    }
                                    bxc B6 = axcVar2.B(1935763823);
                                    if (B6 != null) {
                                        j9e j9eVar7 = B6.g;
                                        j9eVar7.N(8);
                                        int m8 = j9eVar7.m();
                                        byte[] bArr5 = l12.a;
                                        if ((m8 & 1) == 1) {
                                            j9eVar7.O(8);
                                        }
                                        int E3 = j9eVar7.E();
                                        if (E3 != 1) {
                                            throw s9e.a(null, "Unexpected saio entry count: " + E3);
                                        }
                                        msjVar2.b += l12.e(m8) == 0 ? j9eVar7.C() : j9eVar7.G();
                                    }
                                    bxc B7 = axcVar2.B(1936027235);
                                    if (B7 != null) {
                                        i(B7.g, 0, msjVar2);
                                    }
                                    String str3 = lsjVar != null ? lsjVar.b : null;
                                    j9e j9eVar8 = null;
                                    j9e j9eVar9 = null;
                                    for (int i47 = 0; i47 < arrayList12.size(); i47++) {
                                        bxc bxcVar4 = (bxc) arrayList12.get(i47);
                                        j9e j9eVar10 = bxcVar4.g;
                                        int i48 = bxcVar4.b;
                                        if (i48 == 1935828848) {
                                            j9eVar10.N(12);
                                            if (j9eVar10.m() == 1936025959) {
                                                j9eVar8 = j9eVar10;
                                            }
                                        } else if (i48 == 1936158820) {
                                            j9eVar10.N(12);
                                            if (j9eVar10.m() == 1936025959) {
                                                j9eVar9 = j9eVar10;
                                            }
                                        }
                                    }
                                    if (j9eVar8 != null && j9eVar9 != null) {
                                        j9eVar8.N(8);
                                        int e = l12.e(j9eVar8.m());
                                        j9eVar8.O(4);
                                        if (e == 1) {
                                            j9eVar8.O(4);
                                        }
                                        if (j9eVar8.m() != 1) {
                                            throw s9e.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        j9eVar9.N(8);
                                        int e2 = l12.e(j9eVar9.m());
                                        j9eVar9.O(4);
                                        if (e2 == 1) {
                                            if (j9eVar9.C() == 0) {
                                                throw s9e.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (e2 >= 2) {
                                            j9eVar9.O(4);
                                        }
                                        if (j9eVar9.C() != 1) {
                                            throw s9e.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        j9eVar9.O(1);
                                        int A5 = j9eVar9.A();
                                        int i49 = (A5 & 240) >> 4;
                                        int i50 = A5 & 15;
                                        boolean z17 = j9eVar9.A() == 1;
                                        if (z17) {
                                            int A6 = j9eVar9.A();
                                            byte[] bArr6 = new byte[16];
                                            j9eVar9.k(bArr6, 0, 16);
                                            if (A6 == 0) {
                                                int A7 = j9eVar9.A();
                                                byte[] bArr7 = new byte[A7];
                                                j9eVar9.k(bArr7, 0, A7);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            msjVar2.j = true;
                                            msjVar2.p = new lsj(z17, str3, A6, bArr6, i49, i50, bArr);
                                            size = arrayList12.size();
                                            for (i8 = 0; i8 < size; i8++) {
                                                bxc bxcVar5 = (bxc) arrayList12.get(i8);
                                                if (bxcVar5.b == 1970628964) {
                                                    j9e j9eVar11 = bxcVar5.g;
                                                    j9eVar11.N(8);
                                                    byte[] bArr8 = this.h;
                                                    j9eVar11.k(bArr8, 0, 16);
                                                    if (Arrays.equals(bArr8, O)) {
                                                        i(j9eVar11, 16, msjVar2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList12.size();
                                    while (i8 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i3 = size4;
                        i4 = i29;
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i5 = i17;
                    }
                    i29 = i4 + 1;
                    size4 = i3;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    i17 = i5;
                }
                DrmInitData h2 = h(arrayList7);
                if (h2 != null) {
                    int size6 = sparseArray.size();
                    for (int i51 = 0; i51 < size6; i51++) {
                        cr8 cr8Var3 = (cr8) sparseArray.valueAt(i51);
                        jsj jsjVar4 = cr8Var3.d.a;
                        gs4 gs4Var6 = (gs4) cr8Var3.b.o;
                        String str4 = nik.a;
                        lsj lsjVar2 = jsjVar4.l[gs4Var6.a];
                        DrmInitData a2 = h2.a(lsjVar2 != null ? lsjVar2.b : null);
                        qm8 a3 = cr8Var3.j.a();
                        a3.r = a2;
                        cr8Var3.a.d(new b(a3));
                    }
                }
                if (this.z != C.TIME_UNSET) {
                    int size7 = sparseArray.size();
                    for (int i52 = 0; i52 < size7; i52++) {
                        cr8 cr8Var4 = (cr8) sparseArray.valueAt(i52);
                        long j13 = this.z;
                        int i53 = cr8Var4.f;
                        while (true) {
                            msj msjVar3 = cr8Var4.b;
                            if (i53 < msjVar3.d && msjVar3.h[i53] <= j13) {
                                if (msjVar3.i[i53]) {
                                    cr8Var4.i = i53;
                                }
                                i53++;
                            }
                        }
                    }
                    this.z = C.TIME_UNSET;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((axc) arrayDeque.peek()).i.add(axcVar);
            }
        }
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((cr8) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j2;
        this.m.clear();
        g();
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
