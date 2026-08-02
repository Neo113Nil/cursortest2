package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dr8 implements kl6 {
    public static final byte[] E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final sm8 F;
    public boolean D;
    public final byte[] f;
    public final nkk g;
    public int l;
    public int m;
    public long n;
    public int o;
    public nkk p;
    public long q;
    public int r;
    public br8 v;
    public int w;
    public int x;
    public int y;
    public boolean z;
    public final List a = Collections.unmodifiableList(Collections.EMPTY_LIST);
    public final u36 h = new u36(0);
    public final nkk i = new nkk(16);
    public final nkk c = new nkk(hkg.r);
    public final nkk d = new nkk(5);
    public final nkk e = new nkk(4, false);
    public final ArrayDeque j = new ArrayDeque();
    public final ArrayDeque k = new ArrayDeque();
    public final SparseArray b = new SparseArray();
    public long t = C.TIME_UNSET;
    public long s = C.TIME_UNSET;
    public long u = C.TIME_UNSET;
    public ol6 A = ol6.o7;
    public usj[] B = new usj[0];
    public usj[] C = new usj[0];

    static {
        pm8 pm8Var = new pm8();
        pm8Var.k = MimeTypes.APPLICATION_EMSG;
        F = new sm8(pm8Var);
    }

    public dr8() {
        byte[] bArr = new byte[16];
        this.f = bArr;
        this.g = new nkk(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DrmInitData a(ArrayList arrayList) {
        by9 by9Var;
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            sl0 sl0Var = (sl0) arrayList.get(i);
            if (sl0Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = sl0Var.g.a;
                nkk nkkVar = new nkk(bArr);
                if (nkkVar.c >= 32) {
                    nkkVar.E(0);
                    if (nkkVar.f() == nkkVar.c() + 4 && nkkVar.f() == 1886614376) {
                        int x = ffb.x(nkkVar.f());
                        if (x > 1) {
                            m6k.f0();
                        } else {
                            UUID uuid2 = new UUID(nkkVar.m(), nkkVar.m());
                            if (x == 1) {
                                nkkVar.F(nkkVar.v() * 16);
                            }
                            int v = nkkVar.v();
                            if (v == nkkVar.c()) {
                                nkkVar.e(new byte[v], 0, v);
                                by9Var = new by9();
                                by9Var.a = uuid2;
                                uuid = by9Var != null ? null : (UUID) by9Var.a;
                                if (uuid != null) {
                                    m6k.f0();
                                } else {
                                    arrayList2.add(new DrmInitData.SchemeData(uuid, null, MimeTypes.VIDEO_MP4, bArr));
                                }
                            }
                        }
                    }
                }
                by9Var = null;
                if (by9Var != null) {
                }
                if (uuid != null) {
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void e(nkk nkkVar, int i, msj msjVar) {
        nkkVar.E(i + 8);
        int f = nkkVar.f();
        if ((f & 1) != 0) {
            throw r9e.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (f & 2) != 0;
        int v = nkkVar.v();
        if (v == 0) {
            Arrays.fill(msjVar.k, 0, msjVar.d, false);
            return;
        }
        int i2 = msjVar.d;
        nkk nkkVar2 = (nkk) msjVar.q;
        if (v != i2) {
            StringBuilder t = lnb.t(v, "Senc sample count ", " is different from fragment sample count");
            t.append(msjVar.d);
            throw r9e.a(t.toString(), null);
        }
        Arrays.fill(msjVar.k, 0, v, z);
        nkkVar2.B(nkkVar.c());
        msjVar.j = true;
        msjVar.l = true;
        nkkVar.e(nkkVar2.a, 0, nkkVar2.c);
        nkkVar2.E(0);
        msjVar.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0122, code lost:
    
        if (r2.d.a.g != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0124, code lost:
    
        r30.w = r4 - 8;
        ((defpackage.ap4) r31).skipFully(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0130, code lost:
    
        r4 = "audio/ac4".equals(r2.d.a.f.l);
        r6 = r30.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0140, code lost:
    
        if (r4 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0142, code lost:
    
        r30.x = r2.c(r6, 7);
        r6 = r30.w;
        r7 = r30.g;
        defpackage.o02.Q(r6, r7);
        r2.a.d(7, r7);
        r6 = r30.x + 7;
        r30.x = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0161, code lost:
    
        r30.w += r6;
        r30.l = 4;
        r30.y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x015b, code lost:
    
        r6 = r2.c(r6, 0);
        r30.x = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00d8, code lost:
    
        r4 = r3.g;
        r6 = r2.f;
        r4 = r4[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x016b, code lost:
    
        r4 = r2.d;
        r6 = r4.a;
        r7 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0173, code lost:
    
        if (r2.l != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0175, code lost:
    
        r13 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0182, code lost:
    
        r4 = r6.j;
        r6 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0186, code lost:
    
        if (r4 == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0188, code lost:
    
        r9 = r30.d;
        r11 = r9.a;
        r11[0] = 0;
        r11[1] = 0;
        r11[r32] = 0;
        r15 = r4 + 1;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x019e, code lost:
    
        if (r30.x >= r30.w) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a0, code lost:
    
        r5 = r30.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a4, code lost:
    
        if (r5 != 0) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0215, code lost:
    
        r32 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x021a, code lost:
    
        if (r30.z == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021c, code lost:
    
        r10 = r30.e;
        r10.B(r5);
        r20 = r9;
        r21 = r11;
        ((defpackage.ap4) r31).readFully(r10.a, 0, r30.y, false);
        r7.d(r30.y, r10);
        r4 = r30.y;
        r5 = defpackage.hkg.t0(r10.a, r10.c);
        r10.E("video/hevc".equals(r6.l) ? 1 : 0);
        r10.D(r5);
        defpackage.zm2.q(r13, r10, r30.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025a, code lost:
    
        r30.x += r4;
        r30.y -= r4;
        r4 = r32;
        r9 = r20;
        r11 = r21;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0251, code lost:
    
        r20 = r9;
        r21 = r11;
        r4 = r7.b(r31, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a6, code lost:
    
        ((defpackage.ap4) r31).readFully(r11, r4, r15, r10);
        r9.E(r10);
        r5 = r9.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01b4, code lost:
    
        if (r5 < 1) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01b6, code lost:
    
        r30.y = r5 - 1;
        r5 = r30.c;
        r5.E(0);
        r7.d(4, r5);
        r7.d(1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01cb, code lost:
    
        if (r30.C.length <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01cd, code lost:
    
        r5 = r6.l;
        r20 = r11[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d7, code lost:
    
        if ("video/avc".equals(r5) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01d9, code lost:
    
        r32 = r4;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01de, code lost:
    
        if ((r20 & 31) == 6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01f4, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fa, code lost:
    
        r30.z = r5;
        r30.x += 5;
        r30.w += r32;
        r10 = 0;
        r4 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01e8, code lost:
    
        if ("video/hevc".equals(r5) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01f2, code lost:
    
        if (((r20 & 126) >> 1) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01f9, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01e1, code lost:
    
        r32 = r4;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01f6, code lost:
    
        r32 = r4;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0214, code lost:
    
        throw defpackage.r9e.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0282, code lost:
    
        if (r2.l != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0284, code lost:
    
        r11 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029c, code lost:
    
        if (r2.a() == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x029e, code lost:
    
        r11 = r11 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a1, code lost:
    
        r23 = r11;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02a7, code lost:
    
        if (r1 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02a9, code lost:
    
        r26 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02b0, code lost:
    
        r21 = r13;
        r7.c(r21, r23, r30.w, 0, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02c1, code lost:
    
        if (r12.isEmpty() != false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02c3, code lost:
    
        r1 = (defpackage.zq8) r12.removeFirst();
        r30.r -= r1.c;
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02d4, code lost:
    
        if (r1.b == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d6, code lost:
    
        r3 = r3 + r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02d8, code lost:
    
        r6 = r3;
        r3 = r30.B;
        r4 = r3.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02dd, code lost:
    
        if (r13 >= r4) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02df, code lost:
    
        r3[r13].c(r6, 1, r1.c, r30.r, null);
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02f1, code lost:
    
        if (r2.b() != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02f3, code lost:
    
        r30.v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02f6, code lost:
    
        r30.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02f9, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02ae, code lost:
    
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0293, code lost:
    
        if (r3.i[r2.f] == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0295, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0297, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x026e, code lost:
    
        r4 = r30.x;
        r5 = r30.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0272, code lost:
    
        if (r4 >= r5) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0274, code lost:
    
        r30.x += r7.b(r31, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x017c, code lost:
    
        r13 = r3.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
    
        r3 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
    
        if (r30.l != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00cd, code lost:
    
        if (r2.l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00cf, code lost:
    
        r4 = r2.d.d;
        r6 = r2.f;
        r4 = r4[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00de, code lost:
    
        r30.w = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e2, code lost:
    
        if (r6 >= r2.i) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e4, code lost:
    
        ((defpackage.ap4) r31).skipFully(r4);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ed, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f0, code lost:
    
        r4 = (defpackage.nkk) r3.q;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f6, code lost:
    
        if (r1 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f8, code lost:
    
        r4.F(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00fb, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ff, code lost:
    
        if (r3.j == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0105, code lost:
    
        if (r3.k[r1] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0107, code lost:
    
        r4.F(r4.x() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0113, code lost:
    
        if (r2.b() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0115, code lost:
    
        r30.v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0117, code lost:
    
        r30.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x011a, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r5v19, types: [ap4] */
    /* JADX WARN: Type inference failed for: r7v32, types: [usj] */
    /* JADX WARN: Type inference failed for: r9v25, types: [nkk] */
    /* JADX WARN: Type inference failed for: r9v26, types: [nkk] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(ml6 ml6Var, b78 b78Var) {
        String n;
        String n2;
        long D;
        long t;
        long j;
        long j2;
        long w;
        long w2;
        char c;
        int i;
        loop0: while (true) {
            while (true) {
                int i2 = this.l;
                ArrayDeque arrayDeque = this.j;
                SparseArray sparseArray = this.b;
                char c2 = 2;
                ?? r10 = 0;
                if (i2 != 0) {
                    ArrayDeque arrayDeque2 = this.k;
                    if (i2 != 1) {
                        long j3 = Long.MAX_VALUE;
                        if (i2 != 2) {
                            br8 br8Var = this.v;
                            if (br8Var != null) {
                                c = 2;
                                i = 8;
                                break loop0;
                            }
                            int size = sparseArray.size();
                            long j4 = Long.MAX_VALUE;
                            br8 br8Var2 = null;
                            int i3 = 0;
                            while (i3 < size) {
                                char c3 = c2;
                                br8 br8Var3 = (br8) sparseArray.valueAt(i3);
                                boolean z = br8Var3.l;
                                msj msjVar = br8Var3.b;
                                if ((z || br8Var3.f != br8Var3.d.b) && (!z || br8Var3.h != msjVar.c)) {
                                    long j5 = !z ? br8Var3.d.c[br8Var3.f] : msjVar.e[br8Var3.h];
                                    if (j5 < j4) {
                                        br8Var2 = br8Var3;
                                        j4 = j5;
                                    }
                                }
                                i3++;
                                c2 = c3;
                            }
                            c = c2;
                            i = 8;
                            if (br8Var2 == null) {
                                int i4 = (int) (this.q - ((ap4) ml6Var).d);
                                if (i4 < 0) {
                                    throw r9e.a("Offset to end of mdat was negative.", null);
                                }
                                ((ap4) ml6Var).skipFully(i4);
                                this.l = 0;
                                this.o = 0;
                            } else {
                                int i5 = (int) ((!br8Var2.l ? br8Var2.d.c[br8Var2.f] : br8Var2.b.e[br8Var2.h]) - ((ap4) ml6Var).d);
                                if (i5 < 0) {
                                    m6k.f0();
                                    i5 = 0;
                                }
                                ((ap4) ml6Var).skipFully(i5);
                                this.v = br8Var2;
                                br8Var = br8Var2;
                            }
                        } else {
                            int size2 = sparseArray.size();
                            br8 br8Var4 = null;
                            for (int i6 = 0; i6 < size2; i6++) {
                                msj msjVar2 = ((br8) sparseArray.valueAt(i6)).b;
                                if (msjVar2.l) {
                                    long j6 = msjVar2.b;
                                    if (j6 < j3) {
                                        br8Var4 = (br8) sparseArray.valueAt(i6);
                                        j3 = j6;
                                    }
                                }
                            }
                            if (br8Var4 == null) {
                                this.l = 3;
                            } else {
                                int i7 = (int) (j3 - ((ap4) ml6Var).d);
                                if (i7 < 0) {
                                    throw r9e.a("Offset to encryption data was negative.", null);
                                }
                                ap4 ap4Var = (ap4) ml6Var;
                                ap4Var.skipFully(i7);
                                msj msjVar3 = br8Var4.b;
                                nkk nkkVar = (nkk) msjVar3.q;
                                ap4Var.readFully(nkkVar.a, 0, nkkVar.c, false);
                                nkkVar.E(0);
                                msjVar3.l = false;
                            }
                        }
                    } else {
                        int i8 = ((int) this.n) - this.o;
                        nkk nkkVar2 = this.p;
                        if (nkkVar2 != null) {
                            ((ap4) ml6Var).readFully(nkkVar2.a, 8, i8, false);
                            int i9 = this.m;
                            sl0 sl0Var = new sl0(i9, nkkVar2);
                            long j7 = ((ap4) ml6Var).d;
                            if (!arrayDeque.isEmpty()) {
                                ((rl0) arrayDeque.peek()).h.add(sl0Var);
                            } else if (i9 == 1936286840) {
                                nkkVar2.E(8);
                                int x = ffb.x(nkkVar2.f());
                                nkkVar2.F(4);
                                long t2 = nkkVar2.t();
                                if (x == 0) {
                                    w = nkkVar2.t();
                                    w2 = nkkVar2.t();
                                } else {
                                    w = nkkVar2.w();
                                    w2 = nkkVar2.w();
                                }
                                long j8 = w2 + j7;
                                long j9 = w;
                                long D2 = lik.D(j9, 1000000L, t2);
                                nkkVar2.F(2);
                                int x2 = nkkVar2.x();
                                int[] iArr = new int[x2];
                                long[] jArr = new long[x2];
                                long[] jArr2 = new long[x2];
                                long[] jArr3 = new long[x2];
                                long j10 = D2;
                                long j11 = j9;
                                int i10 = 0;
                                while (i10 < x2) {
                                    int f = nkkVar2.f();
                                    if ((f & Integer.MIN_VALUE) != 0) {
                                        throw r9e.a("Unhandled indirect reference", null);
                                    }
                                    long t3 = nkkVar2.t();
                                    iArr[i10] = f & Integer.MAX_VALUE;
                                    jArr[i10] = j8;
                                    jArr3[i10] = j10;
                                    long j12 = j11 + t3;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int i11 = i10;
                                    j10 = lik.D(j12, 1000000L, t2);
                                    jArr4[i11] = j10 - jArr5[i11];
                                    nkkVar2.F(4);
                                    j8 += iArr[i11];
                                    jArr3 = jArr5;
                                    D2 = D2;
                                    j11 = j12;
                                    i10 = i11 + 1;
                                    jArr2 = jArr4;
                                }
                                Pair create = Pair.create(Long.valueOf(D2), new nu2(iArr, jArr, jArr2, jArr3));
                                this.u = ((Long) create.first).longValue();
                                this.A.d((a0h) create.second);
                                this.D = true;
                            } else if (i9 == 1701671783 && this.B.length != 0) {
                                nkkVar2.E(8);
                                int x3 = ffb.x(nkkVar2.f());
                                if (x3 == 0) {
                                    n = nkkVar2.n();
                                    n.getClass();
                                    n2 = nkkVar2.n();
                                    n2.getClass();
                                    long t4 = nkkVar2.t();
                                    long D3 = lik.D(nkkVar2.t(), 1000000L, t4);
                                    long j13 = this.u;
                                    long j14 = j13 != C.TIME_UNSET ? j13 + D3 : -9223372036854775807L;
                                    D = lik.D(nkkVar2.t(), 1000L, t4);
                                    t = nkkVar2.t();
                                    long j15 = j14;
                                    j = D3;
                                    j2 = j15;
                                } else if (x3 != 1) {
                                    m6k.f0();
                                } else {
                                    long t5 = nkkVar2.t();
                                    j2 = lik.D(nkkVar2.w(), 1000000L, t5);
                                    long D4 = lik.D(nkkVar2.t(), 1000L, t5);
                                    long t6 = nkkVar2.t();
                                    n = nkkVar2.n();
                                    n.getClass();
                                    n2 = nkkVar2.n();
                                    n2.getClass();
                                    t = t6;
                                    D = D4;
                                    j = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[nkkVar2.c()];
                                nkkVar2.e(bArr, 0, nkkVar2.c());
                                u36 u36Var = this.h;
                                DataOutputStream dataOutputStream = u36Var.b;
                                ByteArrayOutputStream byteArrayOutputStream = u36Var.a;
                                byteArrayOutputStream.reset();
                                try {
                                    dataOutputStream.writeBytes(n);
                                    dataOutputStream.writeByte(0);
                                    dataOutputStream.writeBytes(n2);
                                    dataOutputStream.writeByte(0);
                                    dataOutputStream.writeLong(D);
                                    dataOutputStream.writeLong(t);
                                    dataOutputStream.write(bArr);
                                    dataOutputStream.flush();
                                    nkk nkkVar3 = new nkk(byteArrayOutputStream.toByteArray());
                                    int c4 = nkkVar3.c();
                                    for (usj usjVar : this.B) {
                                        nkkVar3.E(0);
                                        usjVar.d(c4, nkkVar3);
                                    }
                                    if (j2 == C.TIME_UNSET) {
                                        arrayDeque2.addLast(new zq8(j, c4, true));
                                        this.r += c4;
                                    } else if (arrayDeque2.isEmpty()) {
                                        for (usj usjVar2 : this.B) {
                                            usjVar2.c(j2, 1, c4, 0, null);
                                        }
                                    } else {
                                        arrayDeque2.addLast(new zq8(j2, c4, false));
                                        this.r += c4;
                                    }
                                } catch (IOException e) {
                                    is8.h(e);
                                    return 0;
                                }
                            }
                        } else {
                            ((ap4) ml6Var).skipFully(i8);
                        }
                        f(((ap4) ml6Var).d);
                    }
                } else {
                    int i12 = this.o;
                    nkk nkkVar4 = this.i;
                    if (i12 == 0) {
                        if (!((ap4) ml6Var).readFully(nkkVar4.a, 0, 8, true)) {
                            return -1;
                        }
                        this.o = 8;
                        nkkVar4.E(0);
                        this.n = nkkVar4.t();
                        this.m = nkkVar4.f();
                    }
                    long j16 = this.n;
                    if (j16 == 1) {
                        ((ap4) ml6Var).readFully(nkkVar4.a, 8, 8, false);
                        this.o += 8;
                        this.n = nkkVar4.w();
                    } else if (j16 == 0) {
                        long j17 = ((ap4) ml6Var).c;
                        if (j17 == -1 && !arrayDeque.isEmpty()) {
                            j17 = ((rl0) arrayDeque.peek()).g;
                        }
                        if (j17 != -1) {
                            this.n = (j17 - ((ap4) ml6Var).d) + this.o;
                        }
                    }
                    long j18 = this.n;
                    int i13 = this.o;
                    if (j18 < i13) {
                        throw r9e.b("Atom size less than header length (unsupported).");
                    }
                    long j19 = ((ap4) ml6Var).d - i13;
                    int i14 = this.m;
                    if ((i14 == 1836019558 || i14 == 1835295092) && !this.D) {
                        this.A.d(new aw0(this.t, j19));
                        this.D = true;
                    }
                    if (this.m == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            msj msjVar4 = ((br8) sparseArray.valueAt(i15)).b;
                            msjVar4.getClass();
                            msjVar4.b = j19;
                            msjVar4.a = j19;
                        }
                    }
                    int i16 = this.m;
                    if (i16 == 1835295092) {
                        this.v = null;
                        this.q = j19 + this.n;
                        this.l = 2;
                    } else if (i16 == 1836019574 || i16 == 1953653099 || i16 == 1835297121 || i16 == 1835626086 || i16 == 1937007212 || i16 == 1836019558 || i16 == 1953653094 || i16 == 1836475768 || i16 == 1701082227) {
                        long j20 = (((ap4) ml6Var).d + this.n) - 8;
                        arrayDeque.push(new rl0(i16, j20));
                        if (this.n == this.o) {
                            f(j20);
                        } else {
                            this.l = 0;
                            this.o = 0;
                        }
                    } else if (i16 == 1751411826 || i16 == 1835296868 || i16 == 1836476516 || i16 == 1936286840 || i16 == 1937011556 || i16 == 1937011827 || i16 == 1668576371 || i16 == 1937011555 || i16 == 1937011578 || i16 == 1937013298 || i16 == 1937007471 || i16 == 1668232756 || i16 == 1937011571 || i16 == 1952867444 || i16 == 1952868452 || i16 == 1953196132 || i16 == 1953654136 || i16 == 1953658222 || i16 == 1886614376 || i16 == 1935763834 || i16 == 1935763823 || i16 == 1936027235 || i16 == 1970628964 || i16 == 1935828848 || i16 == 1936158820 || i16 == 1701606260 || i16 == 1835362404 || i16 == 1701671783) {
                        if (this.o != 8) {
                            throw r9e.b("Leaf atom defines extended atom size (unsupported).");
                        }
                        long j21 = this.n;
                        if (j21 > 2147483647L) {
                            throw r9e.b("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        nkk nkkVar5 = new nkk((int) j21);
                        System.arraycopy(nkkVar4.a, 0, nkkVar5.a, 0, 8);
                        this.p = nkkVar5;
                        this.l = 1;
                    } else {
                        if (this.n > 2147483647L) {
                            throw r9e.b("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.p = null;
                        this.l = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.A = ol6Var;
        int i = 0;
        this.l = 0;
        this.o = 0;
        usj[] usjVarArr = new usj[2];
        this.B = usjVarArr;
        usj[] usjVarArr2 = (usj[]) lik.A(usjVarArr, 0);
        this.B = usjVarArr2;
        for (usj usjVar : usjVarArr2) {
            usjVar.a(F);
        }
        List list = this.a;
        this.C = new usj[list.size()];
        int i2 = 100;
        while (i < this.C.length) {
            int i3 = i2 + 1;
            usj track = this.A.track(i2, 3);
            track.a((sm8) list.get(i));
            this.C[i] = track;
            i++;
            i2 = i3;
        }
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        return xw3.P(ml6Var, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:371:0x06e3, code lost:
    
        r47.l = 0;
        r47.o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x06e8, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j) {
        fs4 fs4Var;
        fs4 fs4Var2;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        int i3;
        int size;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i8;
        long[] jArr;
        int i9;
        fs4 fs4Var3;
        int i10;
        while (true) {
            ArrayDeque arrayDeque = this.j;
            if (arrayDeque.isEmpty() || ((rl0) arrayDeque.peek()).g != j) {
                break;
            }
            rl0 rl0Var = (rl0) arrayDeque.pop();
            int i11 = rl0Var.b;
            ArrayList arrayList5 = rl0Var.i;
            ArrayList arrayList6 = rl0Var.h;
            int i12 = 1;
            int i13 = 12;
            SparseArray sparseArray = this.b;
            if (i11 == 1836019574) {
                DrmInitData a = a(arrayList6);
                rl0 A = rl0Var.A(1836475768);
                A.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList7 = A.h;
                int size2 = arrayList7.size();
                long j2 = C.TIME_UNSET;
                int i14 = 0;
                while (i14 < size2) {
                    sl0 sl0Var = (sl0) arrayList7.get(i14);
                    int i15 = sl0Var.b;
                    nkk nkkVar = sl0Var.g;
                    if (i15 == 1953654136) {
                        nkkVar.E(i13);
                        Pair create = Pair.create(Integer.valueOf(nkkVar.f()), new fs4(nkkVar.f() - i12, nkkVar.f(), nkkVar.f(), nkkVar.f()));
                        sparseArray2.put(((Integer) create.first).intValue(), (fs4) create.second);
                    } else if (i15 == 1835362404) {
                        nkkVar.E(8);
                        j2 = ffb.x(nkkVar.f()) == 0 ? nkkVar.t() : nkkVar.w();
                    }
                    i14++;
                    i13 = 12;
                    i12 = 1;
                }
                ArrayList e = yl0.e(rl0Var, new gv8(), j2, a, false, false, new m72(this, 9));
                int size3 = e.size();
                if (sparseArray.size() == 0) {
                    for (int i16 = 0; i16 < size3; i16++) {
                        wsj wsjVar = (wsj) e.get(i16);
                        isj isjVar = wsjVar.a;
                        ol6 ol6Var = this.A;
                        int i17 = isjVar.b;
                        int i18 = isjVar.a;
                        usj track = ol6Var.track(i16, i17);
                        if (sparseArray2.size() == 1) {
                            fs4Var = (fs4) sparseArray2.valueAt(0);
                        } else {
                            fs4Var = (fs4) sparseArray2.get(i18);
                            fs4Var.getClass();
                        }
                        sparseArray.put(i18, new br8(track, wsjVar, fs4Var));
                        this.t = Math.max(this.t, isjVar.e);
                    }
                    this.A.endTracks();
                } else {
                    qx9.t(sparseArray.size() == size3);
                    for (int i19 = 0; i19 < size3; i19++) {
                        wsj wsjVar2 = (wsj) e.get(i19);
                        isj isjVar2 = wsjVar2.a;
                        br8 br8Var = (br8) sparseArray.get(isjVar2.a);
                        int i20 = isjVar2.a;
                        if (sparseArray2.size() == 1) {
                            fs4Var2 = (fs4) sparseArray2.valueAt(0);
                        } else {
                            fs4Var2 = (fs4) sparseArray2.get(i20);
                            fs4Var2.getClass();
                        }
                        br8Var.d = wsjVar2;
                        br8Var.e = fs4Var2;
                        br8Var.a.a(wsjVar2.a.f);
                        br8Var.d();
                    }
                }
            } else if (i11 == 1836019558) {
                int size4 = arrayList5.size();
                int i21 = 0;
                while (i21 < size4) {
                    rl0 rl0Var2 = (rl0) arrayList5.get(i21);
                    if (rl0Var2.b == 1953653094) {
                        sl0 B = rl0Var2.B(1952868452);
                        ArrayList arrayList8 = rl0Var2.h;
                        B.getClass();
                        nkk nkkVar2 = B.g;
                        nkkVar2.E(8);
                        int f = nkkVar2.f();
                        br8 br8Var2 = (br8) sparseArray.get(nkkVar2.f());
                        if (br8Var2 == null) {
                            br8Var2 = null;
                        } else {
                            msj msjVar = br8Var2.b;
                            if ((f & 1) != 0) {
                                long w = nkkVar2.w();
                                msjVar.a = w;
                                msjVar.b = w;
                            }
                            fs4 fs4Var4 = br8Var2.e;
                            msjVar.o = new fs4((f & 2) != 0 ? nkkVar2.f() - 1 : fs4Var4.a, (f & 8) != 0 ? nkkVar2.f() : fs4Var4.b, (f & 16) != 0 ? nkkVar2.f() : fs4Var4.c, (f & 32) != 0 ? nkkVar2.f() : fs4Var4.d);
                        }
                        if (br8Var2 == null) {
                            i = size4;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            i2 = i21;
                        } else {
                            msj msjVar2 = br8Var2.b;
                            long j3 = msjVar2.m;
                            boolean z2 = msjVar2.n;
                            br8Var2.d();
                            br8Var2.l = true;
                            sl0 B2 = rl0Var2.B(1952867444);
                            if (B2 != null) {
                                nkk nkkVar3 = B2.g;
                                nkkVar3.E(8);
                                msjVar2.m = ffb.x(nkkVar3.f()) == 1 ? nkkVar3.w() : nkkVar3.t();
                                msjVar2.n = true;
                            } else {
                                msjVar2.m = j3;
                                msjVar2.n = z2;
                            }
                            int size5 = arrayList8.size();
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                i3 = 1953658222;
                                if (i22 >= size5) {
                                    break;
                                }
                                sl0 sl0Var2 = (sl0) arrayList8.get(i22);
                                int i25 = size4;
                                if (sl0Var2.b == 1953658222) {
                                    nkk nkkVar4 = sl0Var2.g;
                                    nkkVar4.E(12);
                                    int v = nkkVar4.v();
                                    if (v > 0) {
                                        i24 += v;
                                        i23++;
                                    }
                                }
                                i22++;
                                size4 = i25;
                            }
                            i = size4;
                            br8Var2.h = 0;
                            br8Var2.g = 0;
                            br8Var2.f = 0;
                            msjVar2.c = i23;
                            msjVar2.d = i24;
                            if (msjVar2.f.length < i23) {
                                msjVar2.e = new long[i23];
                                msjVar2.f = new int[i23];
                            }
                            if (msjVar2.g.length < i24) {
                                int i26 = (i24 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                msjVar2.g = new int[i26];
                                msjVar2.h = new long[i26];
                                msjVar2.i = new boolean[i26];
                                msjVar2.k = new boolean[i26];
                            }
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                long j4 = 0;
                                if (i27 < size5) {
                                    sl0 sl0Var3 = (sl0) arrayList8.get(i27);
                                    if (sl0Var3.b == i3) {
                                        int i30 = i28 + 1;
                                        nkk nkkVar5 = sl0Var3.g;
                                        nkkVar5.E(8);
                                        int f2 = nkkVar5.f();
                                        i6 = i27;
                                        isj isjVar3 = br8Var2.d.a;
                                        i7 = size5;
                                        fs4 fs4Var5 = (fs4) msjVar2.o;
                                        int i31 = lik.a;
                                        arrayList3 = arrayList5;
                                        msjVar2.f[i28] = nkkVar5.v();
                                        long[] jArr2 = msjVar2.e;
                                        arrayList4 = arrayList6;
                                        long j5 = msjVar2.a;
                                        jArr2[i28] = j5;
                                        if ((f2 & 1) != 0) {
                                            jArr2[i28] = j5 + nkkVar5.f();
                                        }
                                        boolean z3 = (f2 & 4) != 0;
                                        int i32 = fs4Var5.d;
                                        if (z3) {
                                            i32 = nkkVar5.f();
                                        }
                                        boolean z4 = z3;
                                        boolean z5 = (f2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
                                        boolean z6 = (f2 & 512) != 0;
                                        boolean z7 = (f2 & 1024) != 0;
                                        boolean z8 = (f2 & a.o) != 0;
                                        boolean z9 = z7;
                                        long[] jArr3 = isjVar3.h;
                                        int i33 = i32;
                                        if (jArr3 != null && jArr3.length == 1 && jArr3[0] == 0) {
                                            j4 = isjVar3.i[0];
                                        }
                                        int[] iArr = msjVar2.g;
                                        long[] jArr4 = msjVar2.h;
                                        boolean[] zArr = msjVar2.i;
                                        int i34 = msjVar2.f[i28] + i29;
                                        i8 = i21;
                                        long j6 = isjVar3.c;
                                        long j7 = msjVar2.m;
                                        while (i29 < i34) {
                                            int f3 = z5 ? nkkVar5.f() : fs4Var5.b;
                                            int i35 = i34;
                                            if (f3 < 0) {
                                                throw r9e.a("Unexpected negative value: " + f3, null);
                                            }
                                            if (z6) {
                                                jArr = jArr4;
                                                i9 = nkkVar5.f();
                                            } else {
                                                jArr = jArr4;
                                                i9 = fs4Var5.c;
                                            }
                                            if (i9 < 0) {
                                                throw r9e.a("Unexpected negative value: " + i9, null);
                                            }
                                            int f4 = z9 ? nkkVar5.f() : (i29 == 0 && z4) ? i33 : fs4Var5.d;
                                            if (z8) {
                                                fs4Var3 = fs4Var5;
                                                i10 = nkkVar5.f();
                                            } else {
                                                fs4Var3 = fs4Var5;
                                                i10 = 0;
                                            }
                                            int i36 = f4;
                                            long D = lik.D((i10 + j7) - j4, 1000000L, j6);
                                            jArr[i29] = D;
                                            if (!msjVar2.n) {
                                                jArr[i29] = D + br8Var2.d.h;
                                            }
                                            iArr[i29] = i9;
                                            zArr[i29] = ((i36 >> 16) & 1) == 0;
                                            j7 += f3;
                                            i29++;
                                            i34 = i35;
                                            jArr4 = jArr;
                                            fs4Var5 = fs4Var3;
                                        }
                                        msjVar2.m = j7;
                                        i28 = i30;
                                        i29 = i34;
                                    } else {
                                        i6 = i27;
                                        i7 = size5;
                                        arrayList3 = arrayList5;
                                        arrayList4 = arrayList6;
                                        i8 = i21;
                                    }
                                    i27 = i6 + 1;
                                    size5 = i7;
                                    arrayList5 = arrayList3;
                                    arrayList6 = arrayList4;
                                    i21 = i8;
                                    i3 = 1953658222;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList2 = arrayList6;
                                    i2 = i21;
                                    isj isjVar4 = br8Var2.d.a;
                                    fs4 fs4Var6 = (fs4) msjVar2.o;
                                    fs4Var6.getClass();
                                    ksj ksjVar = isjVar4.k[fs4Var6.a];
                                    sl0 B3 = rl0Var2.B(1935763834);
                                    if (B3 != null) {
                                        ksjVar.getClass();
                                        nkk nkkVar6 = B3.g;
                                        int i37 = ksjVar.d;
                                        nkkVar6.E(8);
                                        if ((nkkVar6.f() & 1) == 1) {
                                            nkkVar6.F(8);
                                        }
                                        int s = nkkVar6.s();
                                        int v2 = nkkVar6.v();
                                        if (v2 > msjVar2.d) {
                                            StringBuilder t = lnb.t(v2, "Saiz sample count ", " is greater than fragment sample count");
                                            t.append(msjVar2.d);
                                            throw r9e.a(t.toString(), null);
                                        }
                                        if (s == 0) {
                                            boolean[] zArr2 = msjVar2.k;
                                            i5 = 0;
                                            for (int i38 = 0; i38 < v2; i38++) {
                                                int s2 = nkkVar6.s();
                                                i5 += s2;
                                                zArr2[i38] = s2 > i37;
                                            }
                                            z = false;
                                        } else {
                                            boolean z10 = s > i37;
                                            i5 = s * v2;
                                            z = false;
                                            Arrays.fill(msjVar2.k, 0, v2, z10);
                                        }
                                        Arrays.fill(msjVar2.k, v2, msjVar2.d, z);
                                        if (i5 > 0) {
                                            ((nkk) msjVar2.q).B(i5);
                                            msjVar2.j = true;
                                            msjVar2.l = true;
                                        }
                                    }
                                    sl0 B4 = rl0Var2.B(1935763823);
                                    if (B4 != null) {
                                        nkk nkkVar7 = B4.g;
                                        nkkVar7.E(8);
                                        int f5 = nkkVar7.f();
                                        if ((f5 & 1) == 1) {
                                            nkkVar7.F(8);
                                        }
                                        int v3 = nkkVar7.v();
                                        if (v3 != 1) {
                                            throw r9e.a("Unexpected saio entry count: " + v3, null);
                                        }
                                        msjVar2.b += ffb.x(f5) == 0 ? nkkVar7.t() : nkkVar7.w();
                                    }
                                    byte[] bArr = null;
                                    sl0 B5 = rl0Var2.B(1936027235);
                                    if (B5 != null) {
                                        e(B5.g, 0, msjVar2);
                                    }
                                    String str = ksjVar != null ? ksjVar.b : null;
                                    nkk nkkVar8 = null;
                                    nkk nkkVar9 = null;
                                    for (int i39 = 0; i39 < arrayList8.size(); i39++) {
                                        sl0 sl0Var4 = (sl0) arrayList8.get(i39);
                                        nkk nkkVar10 = sl0Var4.g;
                                        int i40 = sl0Var4.b;
                                        if (i40 == 1935828848) {
                                            nkkVar10.E(12);
                                            if (nkkVar10.f() == 1936025959) {
                                                nkkVar8 = nkkVar10;
                                            }
                                        } else if (i40 == 1936158820) {
                                            nkkVar10.E(12);
                                            if (nkkVar10.f() == 1936025959) {
                                                nkkVar9 = nkkVar10;
                                            }
                                        }
                                    }
                                    if (nkkVar8 != null && nkkVar9 != null) {
                                        nkkVar8.E(8);
                                        int x = ffb.x(nkkVar8.f());
                                        nkkVar8.F(4);
                                        if (x == 1) {
                                            nkkVar8.F(4);
                                        }
                                        if (nkkVar8.f() != 1) {
                                            throw r9e.b("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        nkkVar9.E(8);
                                        int x2 = ffb.x(nkkVar9.f());
                                        nkkVar9.F(4);
                                        if (x2 == 1) {
                                            if (nkkVar9.t() == 0) {
                                                throw r9e.b("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (x2 >= 2) {
                                            nkkVar9.F(4);
                                        }
                                        if (nkkVar9.t() != 1) {
                                            throw r9e.b("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        nkkVar9.F(1);
                                        int s3 = nkkVar9.s();
                                        int i41 = (s3 & 240) >> 4;
                                        int i42 = s3 & 15;
                                        boolean z11 = nkkVar9.s() == 1;
                                        if (z11) {
                                            int s4 = nkkVar9.s();
                                            byte[] bArr2 = new byte[16];
                                            nkkVar9.e(bArr2, 0, 16);
                                            if (s4 == 0) {
                                                int s5 = nkkVar9.s();
                                                bArr = new byte[s5];
                                                nkkVar9.e(bArr, 0, s5);
                                            }
                                            msjVar2.j = true;
                                            msjVar2.p = new ksj(z11, str, s4, bArr2, i41, i42, bArr);
                                            size = arrayList8.size();
                                            for (i4 = 0; i4 < size; i4++) {
                                                sl0 sl0Var5 = (sl0) arrayList8.get(i4);
                                                if (sl0Var5.b == 1970628964) {
                                                    nkk nkkVar11 = sl0Var5.g;
                                                    nkkVar11.E(8);
                                                    byte[] bArr3 = this.f;
                                                    nkkVar11.e(bArr3, 0, 16);
                                                    if (Arrays.equals(bArr3, E)) {
                                                        e(nkkVar11, 16, msjVar2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList8.size();
                                    while (i4 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i = size4;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        i2 = i21;
                    }
                    i21 = i2 + 1;
                    size4 = i;
                    arrayList5 = arrayList;
                    arrayList6 = arrayList2;
                }
                DrmInitData a2 = a(arrayList6);
                if (a2 != null) {
                    int size6 = sparseArray.size();
                    for (int i43 = 0; i43 < size6; i43++) {
                        br8 br8Var3 = (br8) sparseArray.valueAt(i43);
                        isj isjVar5 = br8Var3.d.a;
                        fs4 fs4Var7 = (fs4) br8Var3.b.o;
                        int i44 = lik.a;
                        ksj ksjVar2 = isjVar5.k[fs4Var7.a];
                        DrmInitData a3 = a2.a(ksjVar2 != null ? ksjVar2.b : null);
                        pm8 a4 = br8Var3.d.a.f.a();
                        a4.n = a3;
                        br8Var3.a.a(new sm8(a4));
                    }
                }
                if (this.s != C.TIME_UNSET) {
                    int size7 = sparseArray.size();
                    for (int i45 = 0; i45 < size7; i45++) {
                        br8 br8Var4 = (br8) sparseArray.valueAt(i45);
                        long j8 = this.s;
                        int i46 = br8Var4.f;
                        while (true) {
                            msj msjVar3 = br8Var4.b;
                            if (i46 < msjVar3.d && msjVar3.h[i46] < j8) {
                                if (msjVar3.i[i46]) {
                                    br8Var4.i = i46;
                                }
                                i46++;
                            }
                        }
                    }
                    this.s = C.TIME_UNSET;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((rl0) arrayDeque.peek()).i.add(rl0Var);
            }
        }
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((br8) sparseArray.valueAt(i)).d();
        }
        this.k.clear();
        this.r = 0;
        this.s = j2;
        this.j.clear();
        this.l = 0;
        this.o = 0;
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
