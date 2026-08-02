package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ahn;
import defpackage.ewm;
import defpackage.ghn;
import defpackage.hhn;
import defpackage.mio;
import defpackage.msj;
import defpackage.t6a;
import defpackage.x5n;
import defpackage.y6a;
import defpackage.zgn;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzamd implements zzagh {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final zzv O;
    public hhn A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public zzagk G;
    public zzaht[] H;
    public zzaht[] I;
    public boolean J;
    public boolean K;
    public long L;
    public long M;
    public final zzanx a;
    public final int b;
    public final List c;
    public final SparseArray d;
    public final zzeu e;
    public final zzeu f;
    public final zzeu g;
    public final byte[] h;
    public final zzeu i;
    public final zzajm j;
    public final zzeu k;
    public final ArrayDeque l;
    public final ArrayDeque m;
    public final zzhc n;
    public final zzafw o;
    public s p;
    public int q;
    public int r;
    public long s;
    public int t;
    public zzeu u;
    public long v;
    public int w;
    public long x;
    public long y;
    public long z;

    static {
        zzt zztVar = new zzt();
        zztVar.d(MimeTypes.APPLICATION_EMSG);
        O = new zzv(zztVar);
    }

    public zzamd(zzanx zzanxVar, int i, s sVar) {
        this.a = zzanxVar;
        this.b = i;
        this.c = Collections.unmodifiableList(sVar);
        this.j = new zzajm();
        this.k = new zzeu(16);
        this.e = new zzeu(zzgr.a);
        this.f = new zzeu(6);
        this.g = new zzeu();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new zzeu(bArr);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.d = new SparseArray();
        mio mioVar = zzgxm.b;
        this.p = s.e;
        this.y = C.TIME_UNSET;
        this.x = C.TIME_UNSET;
        this.z = C.TIME_UNSET;
        this.G = zzagk.F7;
        this.H = new zzaht[0];
        this.I = new zzaht[0];
        this.n = new zzhc(new ewm(this, 4));
        this.o = new zzafw();
        this.L = -1L;
        this.M = -1L;
    }

    public static void g(int i) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzat.a(null, sb.toString());
    }

    public static void h(zzeu zzeuVar, int i, msj msjVar) {
        zzeuVar.D(i + 8);
        int b = zzeuVar.b();
        byte[] bArr = zzalv.a;
        if ((b & 1) != 0) {
            throw zzat.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (b & 2) != 0;
        int h = zzeuVar.h();
        if (h == 0) {
            Arrays.fill(msjVar.k, 0, msjVar.d, false);
            return;
        }
        int i2 = msjVar.d;
        zzeu zzeuVar2 = (zzeu) msjVar.q;
        if (h != i2) {
            throw zzat.a(null, x5n.n(new StringBuilder(String.valueOf(h).length() + 58 + String.valueOf(i2).length()), h, "Senc sample count ", i2, " is different from fragment sample count"));
        }
        Arrays.fill(msjVar.k, 0, h, z);
        zzeuVar2.y(zzeuVar.B());
        msjVar.j = true;
        msjVar.l = true;
        zzeuVar.F(0, zzeuVar2.c, zzeuVar2.a);
        zzeuVar2.D(0);
        msjVar.l = false;
    }

    public static Pair i(long j, zzeu zzeuVar) {
        long j2;
        long j3;
        zzeu zzeuVar2 = zzeuVar;
        zzeuVar2.D(8);
        int a = zzalv.a(zzeuVar2.b());
        zzeuVar2.E(4);
        long N2 = zzeuVar2.N();
        if (a == 0) {
            j2 = zzeuVar2.N();
            j3 = zzeuVar2.N();
        } else {
            j2 = zzeuVar2.j();
            j3 = zzeuVar2.j();
        }
        long j4 = j3 + j;
        long w = zzfm.w(j2, 1000000L, N2, RoundingMode.DOWN);
        zzeuVar2.E(2);
        int J = zzeuVar2.J();
        int[] iArr = new int[J];
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        long[] jArr3 = new long[J];
        long j5 = j4;
        long j6 = w;
        int i = 0;
        while (i < J) {
            int b = zzeuVar2.b();
            if ((Integer.MIN_VALUE & b) != 0) {
                throw zzat.a(null, "Unhandled indirect reference");
            }
            long N3 = zzeuVar2.N();
            iArr[i] = b & Integer.MAX_VALUE;
            jArr[i] = j5;
            jArr3[i] = j6;
            j2 += N3;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long w2 = zzfm.w(j2, 1000000L, N2, RoundingMode.DOWN);
            jArr4[i] = w2 - jArr5[i];
            zzeuVar2.E(4);
            j5 += iArr[i];
            i++;
            J = J;
            zzeuVar2 = zzeuVar;
            j6 = w2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(w), new zzafv(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzq j(ArrayList arrayList) {
        int i;
        UUID uuid;
        zzamr zzamrVar;
        UUID uuid2;
        int size = arrayList.size();
        int i2 = 0;
        ArrayList arrayList2 = null;
        while (i2 < size) {
            zzga zzgaVar = (zzga) arrayList.get(i2);
            if (zzgaVar.a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = zzgaVar.b.a;
                zzeu zzeuVar = new zzeu(bArr);
                if (zzeuVar.c >= 32) {
                    zzeuVar.D(0);
                    int B = zzeuVar.B();
                    int b = zzeuVar.b();
                    if (b != B) {
                        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 52 + String.valueOf(B).length());
                        sb.append("Advertised atom size (");
                        sb.append(b);
                        sb.append(") does not match buffer size: ");
                        sb.append(B);
                        zzeh.c(sb.toString());
                    } else {
                        int b2 = zzeuVar.b();
                        if (b2 != 1886614376) {
                            x5n.p(b2, "Atom type is not pssh: ", new StringBuilder(String.valueOf(b2).length() + 23));
                        } else {
                            int a = zzalv.a(zzeuVar.b());
                            if (a > 1) {
                                x5n.p(a, "Unsupported pssh version: ", new StringBuilder(String.valueOf(a).length() + 26));
                            } else {
                                UUID uuid3 = new UUID(zzeuVar.d(), zzeuVar.d());
                                if (a == 1) {
                                    int h = zzeuVar.h();
                                    UUID[] uuidArr = new UUID[h];
                                    int i3 = 0;
                                    while (i3 < h) {
                                        uuidArr[i3] = new UUID(zzeuVar.d(), zzeuVar.d());
                                        i3++;
                                        i2 = i2;
                                    }
                                }
                                i = i2;
                                uuid = null;
                                int h2 = zzeuVar.h();
                                int B2 = zzeuVar.B();
                                if (h2 != B2) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(h2).length() + 49 + String.valueOf(B2).length());
                                    sb2.append("Atom data size (");
                                    sb2.append(h2);
                                    sb2.append(") does not match the bytes left: ");
                                    sb2.append(B2);
                                    zzeh.c(sb2.toString());
                                    zzamrVar = null;
                                } else {
                                    zzeuVar.F(0, h2, new byte[h2]);
                                    zzamrVar = new zzamr(uuid3);
                                }
                                uuid2 = zzamrVar != null ? uuid : zzamrVar.a;
                                if (uuid2 != null) {
                                    zzeh.c("Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList2.add(new zzp(uuid2, MimeTypes.VIDEO_MP4, bArr));
                                }
                            }
                        }
                    }
                }
                i = i2;
                zzamrVar = null;
                uuid = null;
                if (zzamrVar != null) {
                }
                if (uuid2 != null) {
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new zzq(null, false, (zzp[]) arrayList2.toArray(new zzp[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((hhn) sparseArray.valueAt(i)).a();
        }
        this.m.clear();
        this.w = 0;
        this.n.d.clear();
        this.x = j2;
        this.l.clear();
        this.M = -1L;
        b();
    }

    public final void b() {
        this.q = 0;
        this.t = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        s sVar;
        zzaho a = zzamu.a(zzagiVar, true);
        if (a != null) {
            sVar = zzgxm.t(a);
        } else {
            mio mioVar = zzgxm.b;
            sVar = s.e;
        }
        this.p = sVar;
        return a == null;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        if ((this.b & 32) == 0) {
            zzagkVar = new zzaoa(zzagkVar, this.a);
        }
        this.G = zzagkVar;
        b();
        zzaht[] zzahtVarArr = new zzaht[2];
        this.H = zzahtVarArr;
        int i = 0;
        zzaht[] zzahtVarArr2 = (zzaht[]) zzfm.o(0, zzahtVarArr);
        this.H = zzahtVarArr2;
        for (zzaht zzahtVar : zzahtVarArr2) {
            zzahtVar.e(O);
        }
        List list = this.c;
        this.I = new zzaht[list.size()];
        int i2 = 100;
        while (i < this.I.length) {
            int i3 = i2 + 1;
            zzaht b = this.G.b(i2, 3);
            b.e((zzv) list.get(i));
            this.I[i] = b;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x08f5, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x00d2, code lost:
    
        r15 = r3.a;
        r2 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x00dd, code lost:
    
        if (r41.q != 3) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x00e1, code lost:
    
        if (r3.n != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x00e3, code lost:
    
        r4 = r3.d.d[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x00f2, code lost:
    
        r41.B = r4;
        r4 = r3.d.a.g.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0100, code lost:
    
        if (java.util.Objects.equals(r4, "video/avc") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0104, code lost:
    
        if ((r5 & 64) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0106, code lost:
    
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0117, code lost:
    
        r41.E = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x011f, code lost:
    
        if (r3.f >= r3.i) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0121, code lost:
    
        r42.zzf(r41.B);
        r1 = r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x012a, code lost:
    
        if (r1 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x012d, code lost:
    
        r4 = (com.google.android.gms.internal.ads.zzeu) r2.q;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0133, code lost:
    
        if (r1 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0135, code lost:
    
        r4.E(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0138, code lost:
    
        r1 = r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x013c, code lost:
    
        if (r2.j == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0142, code lost:
    
        if (r2.k[r1] == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0144, code lost:
    
        r4.E(r4.J() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0151, code lost:
    
        if (r3.c() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0153, code lost:
    
        r41.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0156, code lost:
    
        r41.q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0159, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0162, code lost:
    
        if (r3.d.a.h != r30) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0164, code lost:
    
        r41.B -= 8;
        r42.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x016f, code lost:
    
        r4 = "audio/ac4".equals(r3.d.a.g.o);
        r5 = r41.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x017f, code lost:
    
        if (r4 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0181, code lost:
    
        r41.C = r3.d(r5, 7);
        com.google.android.gms.internal.ads.zzafk.b(r41.B, r6);
        r15.b(7, r6);
        r5 = r41.C + 7;
        r41.C = r5;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x01a0, code lost:
    
        r41.B += r5;
        r41.q = 4;
        r41.D = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0198, code lost:
    
        r4 = 0;
        r5 = r3.d(r5, 0);
        r41.C = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0109, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0110, code lost:
    
        if (java.util.Objects.equals(r4, "video/hevc") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0114, code lost:
    
        if ((r5 & 128) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x00ec, code lost:
    
        r4 = r2.g[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x01aa, code lost:
    
        r4 = r3.d;
        r5 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x01b0, code lost:
    
        if (r3.n != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x01b2, code lost:
    
        r9 = r4.f[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x01bf, code lost:
    
        r2 = r5.k;
        r4 = r5.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x01c3, code lost:
    
        if (r2 == 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x01c5, code lost:
    
        r5 = r41.f;
        r6 = r5.a;
        r6[0] = 0;
        r6[1] = 0;
        r6[2] = 0;
        r11 = 4 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x01d5, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x01db, code lost:
    
        if (r41.C >= r41.B) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x01dd, code lost:
    
        r2 = r41.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x01df, code lost:
    
        if (r2 != 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x01e4, code lost:
    
        if (r41.I.length > 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x01e8, code lost:
    
        if (r41.E != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x01eb, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0202, code lost:
    
        r42.g(r11, r16 + r2, r6);
        r5.D(0);
        r17 = r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x020f, code lost:
    
        if (r17 < 0) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0211, code lost:
    
        r41.D = r17 - r2;
        r13 = r41.e;
        r43 = r11;
        r13.D(0);
        r15.b(4, r13);
        r41.C += 4;
        r41.B += r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x022f, code lost:
    
        if (r41.I.length <= 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0231, code lost:
    
        if (r2 <= 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0233, code lost:
    
        r11 = com.google.android.gms.internal.ads.zzgr.l(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0237, code lost:
    
        if (r11 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x023a, code lost:
    
        r13 = r11.hashCode();
        r33 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0243, code lost:
    
        if (r13 == (-1662541442)) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0248, code lost:
    
        if (r13 == 1331836730) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x024d, code lost:
    
        if (r13 == 1331856911) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0256, code lost:
    
        if (r11.equals("video/vvc") == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0262, code lost:
    
        if (((r6[r27] & 248) >> 3) != 23) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x028a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0291, code lost:
    
        r41.F = r11;
        r15.b(r2, r5);
        r41.C += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x029b, code lost:
    
        if (r2 <= 0) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x029f, code lost:
    
        if (r41.E != false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x02a5, code lost:
    
        if (com.google.android.gms.internal.ads.zzgr.c(r6, r2, r4) == false) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x02a7, code lost:
    
        r41.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x02aa, code lost:
    
        r11 = r43;
        r2 = r16;
        r14 = r33;
        r28 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x028c, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x026b, code lost:
    
        if (r11.equals("video/avc") == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0273, code lost:
    
        if ((r6[4] & 31) != r28) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x027c, code lost:
    
        if (r11.equals("video/hevc") == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0288, code lost:
    
        if (((r6[4] & 126) >> 1) != 39) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x028e, code lost:
    
        r33 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x02bb, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x01ed, code lost:
    
        r2 = com.google.android.gms.internal.ads.zzgr.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x01fd, code lost:
    
        if ((r16 + r2) <= (r41.B - r41.C)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0200, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x02bc, code lost:
    
        r43 = r11;
        r33 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x02c2, code lost:
    
        if (r41.F == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x02c4, code lost:
    
        r11 = r41.g;
        r11.y(r2);
        r42.g(0, r41.D, r11.a);
        r15.b(r41.D, r11);
        r2 = r41.D;
        r2 = com.google.android.gms.internal.ads.zzgr.a(r11.c, r11.a);
        r11.D(0);
        r11.C(r2);
        r2 = r4.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x02eb, code lost:
    
        if (r2 != (-1)) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x02ef, code lost:
    
        if (r12.e == 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x02f1, code lost:
    
        r12.a(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x02fc, code lost:
    
        r12.b(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0308, code lost:
    
        if ((r3.b() & 4) == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x030a, code lost:
    
        r12.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x030d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0315, code lost:
    
        r41.C += r2;
        r41.D -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x02f7, code lost:
    
        if (r12.e == r2) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x02f9, code lost:
    
        r12.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0310, code lost:
    
        r2 = r15.d(r42, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0320, code lost:
    
        r33 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0365, code lost:
    
        r1 = r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x036b, code lost:
    
        if (r41.E != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x036d, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0370, code lost:
    
        r18 = r1;
        r1 = r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0376, code lost:
    
        if (r1 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0378, code lost:
    
        r21 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x037f, code lost:
    
        r16 = r9;
        r15.f(r16, r18, r41.B, 0, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x038e, code lost:
    
        if (r33.isEmpty() != false) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0390, code lost:
    
        r1 = (defpackage.fhn) r33.removeFirst();
        r2 = r41.w;
        r8 = r1.c;
        r41.w = r2 - r8;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x03a1, code lost:
    
        if (r1.b == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x03a3, code lost:
    
        r4 = r4 + r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x03a5, code lost:
    
        r5 = r4;
        r1 = r41.H;
        r2 = r1.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x03aa, code lost:
    
        if (r11 >= r2) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x03ac, code lost:
    
        r1[r11].f(r5, 1, r8, r41.w, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x03bc, code lost:
    
        if (r3.c() != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x03be, code lost:
    
        r41.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x03c1, code lost:
    
        r41.q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x03c5, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x037d, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0323, code lost:
    
        r33 = r14;
        r2 = r3.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0327, code lost:
    
        if (r2 != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0330, code lost:
    
        if (com.google.android.gms.internal.ads.zzagg.a(r4.o) == false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0332, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzagg.e(r42, r41.B, r3.m);
        r3.m = r4;
        r4.getClass();
        r5 = new com.google.android.gms.internal.ads.zzt(r4);
        r5.r = r2.s;
        r15.e(new com.google.android.gms.internal.ads.zzv(r5));
        r3.l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0353, code lost:
    
        r2 = r41.C;
        r4 = r41.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0357, code lost:
    
        if (r2 >= r4) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0359, code lost:
    
        r41.C += r15.d(r42, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x01b9, code lost:
    
        r9 = r2.h[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0686, code lost:
    
        r3 = r41.s - r41.t;
        r5 = r41.u;
        r3 = (int) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0691, code lost:
    
        if (r5 == null) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0693, code lost:
    
        r42.g(8, r3, r5.a);
        r4 = r41.r;
        r3 = new com.google.android.gms.internal.ads.zzga(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x06a5, code lost:
    
        if (r9.isEmpty() != false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x06a7, code lost:
    
        ((com.google.android.gms.internal.ads.zzfz) r9.peek()).c.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x06b7, code lost:
    
        if (r4 != 1936286840) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x06b9, code lost:
    
        r3 = i(r42.zzn(), r5);
        r7.a((com.google.android.gms.internal.ads.zzafv) r3.second);
        r41.z = ((java.lang.Long) r3.first).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x06d4, code lost:
    
        if (r41.K != false) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x06d6, code lost:
    
        r4 = r41.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x06df, code lost:
    
        if (r7.a.size() != 1) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x06e1, code lost:
    
        r3 = (com.google.android.gms.internal.ads.zzahk) r3.second;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x06ea, code lost:
    
        r4.c(r3);
        r41.J = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x06e6, code lost:
    
        r3 = r7.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x06f4, code lost:
    
        if (r4 != 1701671783) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x06f9, code lost:
    
        if (r41.H.length == 0) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x06fb, code lost:
    
        r5.D(8);
        r3 = com.google.android.gms.internal.ads.zzalv.a(r5.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x070d, code lost:
    
        if (r3 == 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0710, code lost:
    
        if (r3 == 1) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0712, code lost:
    
        defpackage.x5n.p(r3, "Skipping unsupported emsg version: ", new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 35));
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0728, code lost:
    
        r12 = r5.N();
        r8 = r5.j();
        r14 = java.math.RoundingMode.DOWN;
        r3 = com.google.android.gms.internal.ads.zzfm.w(r8, 1000000, r12, r14);
        r8 = com.google.android.gms.internal.ads.zzfm.w(r5.N(), 1000, r12, r14);
        r10 = r5.N();
        r12 = r5.m();
        r12.getClass();
        r13 = r5.m();
        r13.getClass();
        r16 = -9223372036854775807L;
        r14 = r10;
        r10 = r8;
        r8 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0799, code lost:
    
        r6 = new byte[r5.B()];
        r5.F(0, r5.B(), r6);
        r7 = r41.j;
        r2 = r7.a;
        r2.reset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x07b2, code lost:
    
        r7 = r7.b;
        r7.writeBytes(r12);
        r7.writeByte(0);
        r7.writeBytes(r13);
        r7.writeByte(0);
        r7.writeLong(r10);
        r7.writeLong(r14);
        r7.write(r6);
        r7.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x07d1, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzeu(r2.toByteArray());
        r2 = r5.B();
        r6 = r41.H;
        r7 = r6.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x07dc, code lost:
    
        if (r10 >= r7) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x07de, code lost:
    
        r11 = r6[r10];
        r5.D(0);
        r11.b(r2, r5);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x07ec, code lost:
    
        if (r3 != r16) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x07ee, code lost:
    
        r14.addLast(new defpackage.fhn(r8, r2, true));
        r41.w += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0805, code lost:
    
        if (r14.isEmpty() != false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0807, code lost:
    
        r14.addLast(new defpackage.fhn(r3, r2, false));
        r41.w += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0816, code lost:
    
        r5 = r41.H;
        r6 = r5.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x081a, code lost:
    
        if (r14 >= r6) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x081c, code lost:
    
        r5[r14].f(r3, 1, r2, 0, null);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x082e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x082f, code lost:
    
        defpackage.is8.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0834, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x075c, code lost:
    
        r12 = r5.m();
        r12.getClass();
        r13 = r5.m();
        r13.getClass();
        r18 = r5.N();
        r14 = r5.N();
        r20 = java.math.RoundingMode.DOWN;
        r3 = com.google.android.gms.internal.ads.zzfm.w(r14, 1000000, r18, r20);
        r8 = r41.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x077f, code lost:
    
        if (r8 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0781, code lost:
    
        r8 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0784, code lost:
    
        r10 = com.google.android.gms.internal.ads.zzfm.w(r5.N(), 1000, r18, r20);
        r14 = r5.N();
        r16 = r8;
        r8 = r3;
        r3 = r16;
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0783, code lost:
    
        r8 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0838, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0838, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0835, code lost:
    
        r42.zzf(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x05b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x093b  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        boolean z;
        char c;
        char c2;
        int i;
        int i2;
        long j;
        long j2;
        long N2;
        int i3;
        zzahh zzahhVar2;
        long j3;
        long j4;
        long j5;
        long j6;
        loop0: while (true) {
            zzahh zzahhVar3 = zzahhVar;
            while (true) {
                int i4 = this.q;
                zzafw zzafwVar = this.o;
                ArrayDeque arrayDeque = this.l;
                zzhc zzhcVar = this.n;
                int i5 = this.b;
                zzeu zzeuVar = this.i;
                SparseArray sparseArray = this.d;
                boolean z2 = true;
                if (i4 != 0) {
                    ArrayDeque arrayDeque2 = this.m;
                    if (i4 == 1) {
                        break;
                    }
                    long j7 = Long.MAX_VALUE;
                    if (i4 != 2) {
                        int i6 = 2;
                        if (i4 == 5) {
                            zzeuVar.y(16);
                            if (zzagiVar.i(zzeuVar.a, 0, 16, true)) {
                                zzeuVar.D(0);
                                int b = zzeuVar.b();
                                int b2 = zzeuVar.b();
                                if (b == 16 && b2 == 1835430511) {
                                    zzeuVar.E(4);
                                    long N3 = zzeuVar.N();
                                    long zzo = zzagiVar.zzo() - N3;
                                    if (N3 <= 0 || N3 > 2147483647L || zzo < 0 || zzo < this.M) {
                                        k(new zzahj(this.y, this.M), zzahhVar3);
                                    } else {
                                        zzahhVar3.a = zzo;
                                        this.q = 6;
                                    }
                                } else {
                                    k(new zzahj(this.y, this.M), zzahhVar3);
                                }
                            } else {
                                k(new zzahj(this.y, this.M), zzahhVar3);
                            }
                            int i7 = this.q;
                            if (i7 == 6 || i7 == 0) {
                                return 1;
                            }
                        } else if (i4 != 6) {
                            hhn hhnVar = this.A;
                            if (hhnVar != null) {
                                z = true;
                                c = 6;
                                c2 = 5;
                                break loop0;
                            }
                            int size = sparseArray.size();
                            c = 6;
                            c2 = 5;
                            int i8 = 0;
                            hhn hhnVar2 = null;
                            while (i8 < size) {
                                hhn hhnVar3 = (hhn) sparseArray.valueAt(i8);
                                boolean z3 = hhnVar3.n;
                                boolean z4 = z2;
                                msj msjVar = hhnVar3.b;
                                if ((z3 || hhnVar3.f != hhnVar3.d.b) && (!z3 || hhnVar3.h != msjVar.c)) {
                                    long j8 = !z3 ? hhnVar3.d.c[hhnVar3.f] : msjVar.e[hhnVar3.h];
                                    if (j8 < j7) {
                                        j7 = j8;
                                        hhnVar2 = hhnVar3;
                                    }
                                }
                                i8++;
                                z2 = z4;
                            }
                            z = z2;
                            if (hhnVar2 == null) {
                                int zzn = (int) (this.v - zzagiVar.zzn());
                                if (zzn < 0) {
                                    throw zzat.a(null, "Offset to end of mdat was negative.");
                                }
                                zzagiVar.zzf(zzn);
                                b();
                            } else {
                                int zzn2 = (int) ((!hhnVar2.n ? hhnVar2.d.c[hhnVar2.f] : hhnVar2.b.e[hhnVar2.h]) - zzagiVar.zzn());
                                if (zzn2 < 0) {
                                    zzeh.c("Ignoring negative offset to sample data.");
                                    zzn2 = 0;
                                }
                                zzagiVar.zzf(zzn2);
                                this.A = hhnVar2;
                                hhnVar = hhnVar2;
                            }
                        } else {
                            long zzo2 = zzagiVar.zzo() - zzagiVar.zzn();
                            zzeuVar.y(8);
                            if (zzagiVar.f(zzeuVar.a, 0, 8, true)) {
                                zzeuVar.D(0);
                                int b3 = zzeuVar.b();
                                if (zzeuVar.b() != 1835430497) {
                                    k(new zzahj(this.y, this.M), zzahhVar3);
                                } else {
                                    int i9 = (int) zzo2;
                                    zzeu zzeuVar2 = new zzeu(i9);
                                    zzagiVar.g(0, i9, zzeuVar2.a);
                                    zzeuVar2.D(b3 == 1 ? 16 : 8);
                                    SparseArray sparseArray2 = new SparseArray();
                                    SparseArray sparseArray3 = new SparseArray();
                                    while (zzeuVar2.B() >= 8) {
                                        int i10 = zzeuVar2.b;
                                        long N4 = zzeuVar2.N();
                                        int b4 = zzeuVar2.b();
                                        if (N4 == 1) {
                                            if (zzeuVar2.B() < 8) {
                                                break;
                                            }
                                            N4 = zzeuVar2.d();
                                        } else if (N4 == 0) {
                                            N4 = zzeuVar2.c - i10;
                                        }
                                        if (N4 < (N4 == 1 ? 16 : 8)) {
                                            break;
                                        }
                                        long j9 = i10;
                                        if (N4 > zzeuVar2.c - j9) {
                                            break;
                                        }
                                        if (b4 != 1952871009) {
                                            j = N4;
                                            j2 = j9;
                                        } else if (N4 < r7 + 16) {
                                            zzeuVar2.D((int) (j9 + N4));
                                        } else {
                                            int a = zzalv.a(zzeuVar2.b());
                                            int b5 = zzeuVar2.b();
                                            hhn hhnVar4 = (hhn) sparseArray.get(b5);
                                            if (hhnVar4 == null) {
                                                zzeuVar2.D((int) (j9 + N4));
                                            } else {
                                                long j10 = hhnVar4.d.a.c;
                                                int b6 = zzeuVar2.b();
                                                int i11 = b6 >> 4;
                                                int i12 = b6 >> 2;
                                                int i13 = b6 & 3;
                                                j = N4;
                                                long N5 = zzeuVar2.N();
                                                int i14 = (i11 & 3) + 1;
                                                j2 = j9;
                                                int i15 = (i12 & 3) + 1;
                                                int i16 = i13 + 1;
                                                if (((a == 1 ? 16L : 8L) + i14 + i15 + i16) * N5 > zzeuVar2.B()) {
                                                    zzeuVar2.D((int) (j2 + j));
                                                } else {
                                                    int i17 = (int) N5;
                                                    long[] jArr = new long[i17];
                                                    long[] jArr2 = new long[i17];
                                                    int i18 = 0;
                                                    while (i18 < i17) {
                                                        int i19 = i17;
                                                        if (a == 1) {
                                                            N2 = zzeuVar2.j();
                                                            i3 = a;
                                                            a = 1;
                                                        } else {
                                                            N2 = zzeuVar2.N();
                                                            i3 = a;
                                                        }
                                                        long j11 = N2;
                                                        long j12 = a == 1 ? zzeuVar2.j() : zzeuVar2.N();
                                                        zzeuVar2.E(i14 + i15 + i16);
                                                        jArr[i18] = zzfm.w(j11, 1000000L, j10, RoundingMode.DOWN);
                                                        jArr2[i18] = j12;
                                                        i18++;
                                                        i17 = i19;
                                                        a = i3;
                                                    }
                                                    sparseArray2.put(b5, jArr);
                                                    sparseArray3.put(b5, jArr2);
                                                }
                                            }
                                        }
                                        zzeuVar2.D((int) (j2 + j));
                                    }
                                    if (sparseArray2.size() == 0) {
                                        k(new zzahj(this.y, this.M), zzahhVar3);
                                    } else {
                                        int i20 = -1;
                                        int i21 = -1;
                                        int i22 = 0;
                                        while (i22 < sparseArray2.size()) {
                                            int keyAt = sparseArray2.keyAt(i22);
                                            hhn hhnVar5 = (hhn) sparseArray.get(keyAt);
                                            if (hhnVar5 != null) {
                                                int i23 = hhnVar5.d.a.b;
                                                if (i20 != -1) {
                                                    i2 = i20;
                                                } else if (i23 == i6) {
                                                    i20 = keyAt;
                                                } else {
                                                    i2 = -1;
                                                }
                                                if (i21 == -1) {
                                                    i21 = i23 == 1 ? keyAt : -1;
                                                }
                                                i20 = i2;
                                            }
                                            i22++;
                                            i6 = 2;
                                        }
                                        if (i20 == -1) {
                                            if (i21 != -1) {
                                                i = i21;
                                                k(new ghn(sparseArray2, sparseArray3, this.y, this.M, i), zzahhVar3);
                                            } else {
                                                i20 = sparseArray2.keyAt(0);
                                            }
                                        }
                                        i = i20;
                                        k(new ghn(sparseArray2, sparseArray3, this.y, this.M, i), zzahhVar3);
                                    }
                                }
                            } else {
                                k(new zzahj(this.y, this.M), zzahhVar3);
                            }
                            if (this.q == 0) {
                                return 1;
                            }
                        }
                    } else {
                        int size2 = sparseArray.size();
                        hhn hhnVar6 = null;
                        for (int i24 = 0; i24 < size2; i24++) {
                            msj msjVar2 = ((hhn) sparseArray.valueAt(i24)).b;
                            if (msjVar2.l) {
                                long j13 = msjVar2.b;
                                if (j13 < j7) {
                                    hhnVar6 = (hhn) sparseArray.valueAt(i24);
                                    j7 = j13;
                                }
                            }
                        }
                        if (hhnVar6 == null) {
                            this.q = 3;
                        } else {
                            int zzn3 = (int) (j7 - zzagiVar.zzn());
                            if (zzn3 < 0) {
                                throw zzat.a(null, "Offset to encryption data was negative.");
                            }
                            zzagiVar.zzf(zzn3);
                            msj msjVar3 = hhnVar6.b;
                            zzeu zzeuVar3 = (zzeu) msjVar3.q;
                            zzagiVar.g(0, zzeuVar3.c, zzeuVar3.a);
                            zzeuVar3.D(0);
                            msjVar3.l = false;
                        }
                    }
                } else {
                    int i25 = this.t;
                    zzeu zzeuVar4 = this.k;
                    if (i25 != 0) {
                        zzahhVar2 = zzahhVar;
                    } else {
                        if (!zzagiVar.i(zzeuVar4.a, 0, 8, true)) {
                            long j14 = this.L;
                            if (j14 == -1) {
                                zzhcVar.c(0);
                                return -1;
                            }
                            zzahhVar.a = j14;
                            this.L = -1L;
                            this.G.c(zzafwVar.b());
                            this.K = true;
                            return 1;
                        }
                        zzahhVar2 = zzahhVar;
                        this.t = 8;
                        zzeuVar4.D(0);
                        this.s = zzeuVar4.N();
                        this.r = zzeuVar4.b();
                    }
                    long j15 = this.s;
                    if (j15 == 1) {
                        zzagiVar.g(8, 8, zzeuVar4.a);
                        this.t += 8;
                        this.s = zzeuVar4.j();
                    } else if (j15 == 0) {
                        long zzo3 = zzagiVar.zzo();
                        if (zzo3 == -1) {
                            zzo3 = !arrayDeque.isEmpty() ? ((zzfz) arrayDeque.peek()).b : -1L;
                        }
                        if (zzo3 != -1) {
                            j3 = -1;
                            this.s = (zzo3 - zzagiVar.zzn()) + this.t;
                            j4 = this.s;
                            int i26 = this.t;
                            j5 = i26;
                            if (j4 < j5) {
                                j6 = j5;
                            } else {
                                if (this.r != 1718773093 || i26 != 8) {
                                    break loop0;
                                }
                                this.s = j5;
                                j4 = j5;
                                j6 = j4;
                            }
                            if (this.L == j3) {
                                if (this.r == 1936286840) {
                                    zzeuVar.y((int) j4);
                                    System.arraycopy(zzeuVar4.a, 0, zzeuVar.a, 0, 8);
                                    zzagiVar.g(8, (int) (this.s - this.t), zzeuVar.a);
                                    zzafwVar.a((zzafv) i(zzagiVar.zzm(), zzeuVar).second);
                                } else {
                                    zzagiVar.e((int) (j4 - j6), true);
                                }
                                b();
                            } else {
                                long zzn4 = zzagiVar.zzn() - j6;
                                int i27 = this.r;
                                if ((i27 == 1836019558 || i27 == 1835295092) && !this.J) {
                                    if (zzagiVar.zzo() == j3 || this.M != j3 || (i5 & 512) == 0) {
                                        this.G.c(new zzahj(this.y, zzn4));
                                        this.J = true;
                                    } else {
                                        this.M = zzn4;
                                        zzahhVar2.a = zzagiVar.zzo() - 16;
                                        this.q = 5;
                                    }
                                }
                                if (this.r == 1836019558) {
                                    int size3 = sparseArray.size();
                                    for (int i28 = 0; i28 < size3; i28++) {
                                        msj msjVar4 = ((hhn) sparseArray.valueAt(i28)).b;
                                        msjVar4.b = zzn4;
                                        msjVar4.a = zzn4;
                                    }
                                }
                                int i29 = this.r;
                                if (i29 == 1835295092) {
                                    this.A = null;
                                    this.v = zzn4 + this.s;
                                    this.q = 2;
                                } else if (i29 == 1836019574 || i29 == 1953653099 || i29 == 1835297121 || i29 == 1835626086 || i29 == 1937007212 || i29 == 1836019558 || i29 == 1953653094 || i29 == 1836475768 || i29 == 1701082227 || i29 == 1835365473) {
                                    long zzn5 = zzagiVar.zzn();
                                    long j16 = this.s;
                                    long j17 = zzn5 + j16;
                                    if (j16 != this.t && i29 == 1835365473) {
                                        zzeuVar.y(8);
                                        zzagiVar.h(0, 8, zzeuVar.a);
                                        zzalv.f(zzeuVar);
                                        zzagiVar.zzf(zzeuVar.b);
                                        zzagiVar.zzl();
                                    }
                                    long j18 = j17 - 8;
                                    arrayDeque.push(new zzfz(this.r, j18));
                                    if (this.s == this.t) {
                                        f(j18);
                                    } else {
                                        b();
                                    }
                                } else if (i29 == 1751411826 || i29 == 1835296868 || i29 == 1836476516 || i29 == 1936286840 || i29 == 1937011556 || i29 == 1937011827 || i29 == 1668576371 || i29 == 1937011555 || i29 == 1937011578 || i29 == 1937013298 || i29 == 1937007471 || i29 == 1668232756 || i29 == 1937011571 || i29 == 1952867444 || i29 == 1952868452 || i29 == 1953196132 || i29 == 1953654136 || i29 == 1953658222 || i29 == 1886614376 || i29 == 1935763834 || i29 == 1935763823 || i29 == 1936027235 || i29 == 1970628964 || i29 == 1935828848 || i29 == 1936158820 || i29 == 1701606260 || i29 == 1835362404 || i29 == 1701671783 || i29 == 1969517665 || i29 == 1801812339 || i29 == 1768715124) {
                                    if (this.t != 8) {
                                        throw zzat.b("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    if (this.s > 2147483647L) {
                                        throw zzat.b("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    zzeu zzeuVar5 = new zzeu((int) this.s);
                                    System.arraycopy(zzeuVar4.a, 0, zzeuVar5.a, 0, 8);
                                    this.u = zzeuVar5;
                                    this.q = 1;
                                } else {
                                    if (this.s > 2147483647L) {
                                        throw zzat.b("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    this.u = null;
                                    this.q = 1;
                                }
                            }
                            if (this.q != 5) {
                                return 1;
                            }
                            zzahhVar3 = zzahhVar2;
                        }
                    }
                    j3 = -1;
                    j4 = this.s;
                    int i262 = this.t;
                    j5 = i262;
                    if (j4 < j5) {
                    }
                    if (this.L == j3) {
                    }
                    if (this.q != 5) {
                    }
                }
            }
            f(zzagiVar.zzn());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:401:0x07ed, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x07f0, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0456  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j) {
        zzap zzapVar;
        ArrayList arrayList;
        int i;
        String str;
        int i2;
        long j2;
        zgn zgnVar;
        int i3;
        zgn zgnVar2;
        ArrayList arrayList2;
        int i4;
        ArrayList arrayList3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        int i8;
        boolean z;
        int i9;
        int i10;
        ArrayList arrayList4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean[] zArr;
        int i16;
        int i17;
        zgn zgnVar3;
        int i18;
        zzhbh zzhbhVar;
        zzhbh zzhbhVar2;
        int i19;
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty() || ((zzfz) arrayDeque.peek()).b != j) {
                break;
            }
            zzfz zzfzVar = (zzfz) arrayDeque.pop();
            int i20 = zzfzVar.a;
            ArrayList arrayList5 = zzfzVar.c;
            SparseArray sparseArray = this.d;
            int i21 = 12;
            int i22 = 8;
            if (i20 == 1836019574) {
                zzq j3 = j(arrayList5);
                zzfz c = zzfzVar.c(1836475768);
                c.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = c.c;
                int size = arrayList6.size();
                int i23 = 0;
                long j4 = C.TIME_UNSET;
                while (i23 < size) {
                    zzga zzgaVar = (zzga) arrayList6.get(i23);
                    int i24 = zzgaVar.a;
                    zzeu zzeuVar = zzgaVar.b;
                    if (i24 == 1953654136) {
                        zzeuVar.D(i21);
                        Pair create = Pair.create(Integer.valueOf(zzeuVar.b()), new zgn(zzeuVar.b() - 1, zzeuVar.b(), zzeuVar.b(), zzeuVar.b()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zgn) create.second);
                    } else if (i24 == 1835362404) {
                        zzeuVar.D(8);
                        j4 = zzalv.a(zzeuVar.b()) == 0 ? zzeuVar.N() : zzeuVar.j();
                    }
                    i23++;
                    i21 = 12;
                }
                int i25 = -1;
                int i26 = 0;
                zzfz c2 = zzfzVar.c(1835365473);
                zzap e = c2 != null ? zzalv.e(c2) : null;
                zzaha zzahaVar = new zzaha();
                zzga b = zzfzVar.b(1969517665);
                if (b != null) {
                    zzap c3 = zzalv.c(b);
                    zzahaVar.a(c3);
                    zzapVar = c3;
                } else {
                    zzapVar = null;
                }
                zzga b2 = zzfzVar.b(1836476516);
                b2.getClass();
                zzap zzapVar2 = new zzap(zzalv.d(b2.b));
                ArrayList b3 = zzalv.b(zzfzVar, zzahaVar, j4, j3, false, false, new ahn(i26));
                int size2 = b3.size();
                if (sparseArray.size() == 0) {
                    String Q = y6a.Q(b3);
                    int i27 = 0;
                    while (i27 < size2) {
                        zzamz zzamzVar = (zzamz) b3.get(i27);
                        zzamw zzamwVar = zzamzVar.a;
                        if (zzamwVar.m) {
                            zzagk zzagkVar = this.G;
                            int i28 = zzamwVar.b;
                            zzaht b4 = zzagkVar.b(i27, i28);
                            int i29 = i27;
                            long j5 = zzamwVar.e;
                            b4.getClass();
                            i2 = i29;
                            zzv zzvVar = zzamwVar.g;
                            zzvVar.getClass();
                            arrayList = b3;
                            zzt zztVar = new zzt(zzvVar);
                            zztVar.c(Q);
                            str = Q;
                            if (i28 == 1) {
                                int i30 = zzahaVar.a;
                                i = size2;
                                int i31 = i25;
                                j2 = j5;
                                if (i30 != i31 && (i3 = zzahaVar.b) != i31) {
                                    zztVar.K = i30;
                                    zztVar.L = i3;
                                }
                            } else {
                                i = size2;
                                j2 = j5;
                            }
                            t6a.N(i28, e, zztVar, zzvVar.l, zzapVar, zzapVar2);
                            int i32 = zzamwVar.a;
                            if (sparseArray2.size() == 1) {
                                zgnVar = (zgn) sparseArray2.valueAt(0);
                            } else {
                                zgnVar = (zgn) sparseArray2.get(i32);
                                zgnVar.getClass();
                            }
                            sparseArray.put(i32, new hhn(b4, zzamzVar, zgnVar, new zzv(zztVar)));
                            this.y = Math.max(this.y, j2);
                        } else {
                            arrayList = b3;
                            i = size2;
                            str = Q;
                            i2 = i27;
                        }
                        i27 = i2 + 1;
                        b3 = arrayList;
                        Q = str;
                        size2 = i;
                        i25 = -1;
                    }
                    this.G.zzv();
                } else {
                    ArrayList arrayList7 = b3;
                    int i33 = 0;
                    int i34 = 0;
                    while (i33 < size2) {
                        ArrayList arrayList8 = arrayList7;
                        if (((zzamz) arrayList8.get(i33)).a.m) {
                            i34++;
                        }
                        i33++;
                        arrayList7 = arrayList8;
                    }
                    ArrayList arrayList9 = arrayList7;
                    zzguk.f(sparseArray.size() == i34);
                    for (int i35 = 0; i35 < size2; i35++) {
                        zzamz zzamzVar2 = (zzamz) arrayList9.get(i35);
                        zzamw zzamwVar2 = zzamzVar2.a;
                        if (zzamwVar2.m) {
                            int i36 = zzamwVar2.a;
                            hhn hhnVar = (hhn) sparseArray.get(i36);
                            if (sparseArray2.size() == 1) {
                                zgnVar2 = (zgn) sparseArray2.valueAt(0);
                            } else {
                                zgnVar2 = (zgn) sparseArray2.get(i36);
                                zgnVar2.getClass();
                            }
                            hhnVar.d = zzamzVar2;
                            hhnVar.e = zgnVar2;
                            if (hhnVar.l == null) {
                                hhnVar.a.e(hhnVar.m);
                            }
                            hhnVar.a();
                        }
                    }
                }
            } else if (i20 == 1836019558) {
                ArrayList arrayList10 = zzfzVar.d;
                int size3 = arrayList10.size();
                int i37 = 0;
                while (i37 < size3) {
                    zzfz zzfzVar2 = (zzfz) arrayList10.get(i37);
                    if (zzfzVar2.a == 1953653094) {
                        zzga b5 = zzfzVar2.b(1952868452);
                        b5.getClass();
                        zzeu zzeuVar2 = b5.b;
                        zzeuVar2.D(i22);
                        int b6 = zzeuVar2.b();
                        byte[] bArr2 = zzalv.a;
                        hhn hhnVar2 = (hhn) sparseArray.get(zzeuVar2.b());
                        if (hhnVar2 == null) {
                            hhnVar2 = null;
                        } else {
                            msj msjVar = hhnVar2.b;
                            if ((b6 & 1) != 0) {
                                long j6 = zzeuVar2.j();
                                msjVar.a = j6;
                                msjVar.b = j6;
                            }
                            zgn zgnVar4 = hhnVar2.e;
                            msjVar.o = new zgn((b6 & 2) != 0 ? zzeuVar2.b() - 1 : zgnVar4.a, (b6 & 8) != 0 ? zzeuVar2.b() : zgnVar4.b, (b6 & 16) != 0 ? zzeuVar2.b() : zgnVar4.c, (b6 & 32) != 0 ? zzeuVar2.b() : zgnVar4.d);
                        }
                        if (hhnVar2 == null) {
                            arrayList2 = arrayList10;
                            i4 = size3;
                            arrayList3 = arrayList5;
                            i5 = i37;
                            i6 = i22;
                        } else {
                            msj msjVar2 = hhnVar2.b;
                            long j7 = msjVar2.m;
                            boolean z2 = msjVar2.n;
                            hhnVar2.a();
                            hhnVar2.n = true;
                            zzga b7 = zzfzVar2.b(1952867444);
                            if (b7 != null) {
                                zzeu zzeuVar3 = b7.b;
                                zzeuVar3.D(i22);
                                msjVar2.m = zzalv.a(zzeuVar3.b()) == 1 ? zzeuVar3.j() : zzeuVar3.N();
                                msjVar2.n = true;
                            } else {
                                msjVar2.m = j7;
                                msjVar2.n = z2;
                            }
                            ArrayList arrayList11 = zzfzVar2.c;
                            int size4 = arrayList11.size();
                            int i38 = 0;
                            int i39 = 0;
                            int i40 = 0;
                            while (true) {
                                i7 = 1953658222;
                                if (i38 >= size4) {
                                    break;
                                }
                                zzga zzgaVar2 = (zzga) arrayList11.get(i38);
                                ArrayList arrayList12 = arrayList10;
                                if (zzgaVar2.a == 1953658222) {
                                    zzeu zzeuVar4 = zzgaVar2.b;
                                    zzeuVar4.D(12);
                                    int h = zzeuVar4.h();
                                    if (h > 0) {
                                        i40 += h;
                                        i39++;
                                    }
                                }
                                i38++;
                                arrayList10 = arrayList12;
                            }
                            arrayList2 = arrayList10;
                            hhnVar2.h = 0;
                            hhnVar2.g = 0;
                            hhnVar2.f = 0;
                            msjVar2.c = i39;
                            msjVar2.d = i40;
                            if (msjVar2.f.length < i39) {
                                msjVar2.e = new long[i39];
                                msjVar2.f = new int[i39];
                            }
                            if (msjVar2.g.length < i40) {
                                int i41 = (i40 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                msjVar2.g = new int[i41];
                                msjVar2.h = new long[i41];
                                msjVar2.i = new boolean[i41];
                                msjVar2.k = new boolean[i41];
                            }
                            int i42 = 0;
                            int i43 = 0;
                            int i44 = 0;
                            while (true) {
                                long j8 = 0;
                                if (i42 >= size4) {
                                    break;
                                }
                                zzga zzgaVar3 = (zzga) arrayList11.get(i42);
                                if (zzgaVar3.a == i7) {
                                    int i45 = i43 + 1;
                                    zzeu zzeuVar5 = zzgaVar3.b;
                                    zzeuVar5.D(8);
                                    int b8 = zzeuVar5.b();
                                    i9 = i42;
                                    zzamw zzamwVar3 = hhnVar2.d.a;
                                    i10 = size3;
                                    zgn zgnVar5 = (zgn) msjVar2.o;
                                    String str2 = zzfm.a;
                                    arrayList4 = arrayList5;
                                    msjVar2.f[i43] = zzeuVar5.h();
                                    long[] jArr = msjVar2.e;
                                    i11 = i37;
                                    long j9 = msjVar2.a;
                                    jArr[i43] = j9;
                                    if ((b8 & 1) != 0) {
                                        jArr[i43] = j9 + zzeuVar5.b();
                                    }
                                    boolean z3 = (b8 & 4) != 0;
                                    int i46 = zgnVar5.d;
                                    int b9 = z3 ? zzeuVar5.b() : i46;
                                    boolean z4 = z3;
                                    int i47 = b8 & NotificationCompat.FLAG_LOCAL_ONLY;
                                    int i48 = b8 & 512;
                                    int i49 = b8 & 1024;
                                    int i50 = b8 & com.ironsource.mediationsdk.metadata.a.o;
                                    zzhbh zzhbhVar3 = zzamwVar3.i;
                                    if (zzhbhVar3 != null) {
                                        i13 = i46;
                                        i12 = size4;
                                        if (zzhbhVar3.b == 1 && (zzhbhVar = zzamwVar3.j) != null) {
                                            if (zzhbhVar3.a(0) == 0) {
                                                zzhbhVar2 = zzhbhVar;
                                                i19 = 0;
                                                i14 = i43;
                                            } else {
                                                long a = zzhbhVar3.a(0);
                                                long j10 = zzamwVar3.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                                long w = zzfm.w(a, 1000000L, j10, roundingMode);
                                                i14 = i43;
                                                if (w + zzfm.w(zzhbhVar.a(0), 1000000L, zzamwVar3.c, roundingMode) >= zzamwVar3.e) {
                                                    zzhbhVar2 = zzhbhVar;
                                                    i19 = 0;
                                                }
                                                int[] iArr = msjVar2.g;
                                                long[] jArr2 = msjVar2.h;
                                                boolean[] zArr2 = msjVar2.i;
                                                i15 = msjVar2.f[i14] + i44;
                                                long j11 = zzamwVar3.c;
                                                long j12 = msjVar2.m;
                                                while (i44 < i15) {
                                                    int b10 = i47 != 0 ? zzeuVar5.b() : zgnVar5.b;
                                                    g(b10);
                                                    if (i48 != 0) {
                                                        zArr = zArr2;
                                                        i16 = zzeuVar5.b();
                                                    } else {
                                                        zArr = zArr2;
                                                        i16 = zgnVar5.c;
                                                    }
                                                    g(i16);
                                                    if (i49 != 0) {
                                                        i17 = zzeuVar5.b();
                                                    } else {
                                                        if (i44 == 0) {
                                                            if (z4) {
                                                                i17 = b9;
                                                                i44 = 0;
                                                            } else {
                                                                i44 = 0;
                                                            }
                                                        }
                                                        i17 = i13;
                                                    }
                                                    if (i50 != 0) {
                                                        zgnVar3 = zgnVar5;
                                                        i18 = zzeuVar5.b();
                                                    } else {
                                                        zgnVar3 = zgnVar5;
                                                        i18 = 0;
                                                    }
                                                    int i51 = i16;
                                                    int i52 = i15;
                                                    long w2 = zzfm.w((i18 + j12) - j8, 1000000L, j11, RoundingMode.DOWN);
                                                    jArr2[i44] = w2;
                                                    if (!msjVar2.n) {
                                                        jArr2[i44] = w2 + hhnVar2.d.i;
                                                    }
                                                    iArr[i44] = i51;
                                                    zArr[i44] = ((i17 >> 16) & 1) == 0;
                                                    j12 += b10;
                                                    i44++;
                                                    zArr2 = zArr;
                                                    zgnVar5 = zgnVar3;
                                                    i15 = i52;
                                                }
                                                int i53 = i15;
                                                msjVar2.m = j12;
                                                i43 = i45;
                                                i44 = i53;
                                            }
                                            j8 = zzhbhVar2.a(i19);
                                            int[] iArr2 = msjVar2.g;
                                            long[] jArr22 = msjVar2.h;
                                            boolean[] zArr22 = msjVar2.i;
                                            i15 = msjVar2.f[i14] + i44;
                                            long j112 = zzamwVar3.c;
                                            long j122 = msjVar2.m;
                                            while (i44 < i15) {
                                            }
                                            int i532 = i15;
                                            msjVar2.m = j122;
                                            i43 = i45;
                                            i44 = i532;
                                        }
                                    } else {
                                        i13 = i46;
                                        i12 = size4;
                                    }
                                    i14 = i43;
                                    int[] iArr22 = msjVar2.g;
                                    long[] jArr222 = msjVar2.h;
                                    boolean[] zArr222 = msjVar2.i;
                                    i15 = msjVar2.f[i14] + i44;
                                    long j1122 = zzamwVar3.c;
                                    long j1222 = msjVar2.m;
                                    while (i44 < i15) {
                                    }
                                    int i5322 = i15;
                                    msjVar2.m = j1222;
                                    i43 = i45;
                                    i44 = i5322;
                                } else {
                                    i9 = i42;
                                    i10 = size3;
                                    arrayList4 = arrayList5;
                                    i11 = i37;
                                    i12 = size4;
                                }
                                i42 = i9 + 1;
                                size3 = i10;
                                arrayList5 = arrayList4;
                                i37 = i11;
                                size4 = i12;
                                i7 = 1953658222;
                            }
                            i4 = size3;
                            arrayList3 = arrayList5;
                            i5 = i37;
                            zzamw zzamwVar4 = hhnVar2.d.a;
                            zgn zgnVar6 = (zgn) msjVar2.o;
                            zgnVar6.getClass();
                            int i54 = zgnVar6.a;
                            zzamx[] zzamxVarArr = zzamwVar4.n;
                            zzamx zzamxVar = zzamxVarArr == null ? null : zzamxVarArr[i54];
                            zzga b11 = zzfzVar2.b(1935763834);
                            if (b11 != null) {
                                zzamxVar.getClass();
                                int i55 = zzamxVar.d;
                                zzeu zzeuVar6 = b11.b;
                                zzeuVar6.D(8);
                                if ((zzeuVar6.b() & 1) == 1) {
                                    zzeuVar6.E(8);
                                }
                                int I = zzeuVar6.I();
                                int h2 = zzeuVar6.h();
                                int i56 = msjVar2.d;
                                if (h2 > i56) {
                                    throw zzat.a(null, x5n.n(new StringBuilder(String.valueOf(h2).length() + 56 + String.valueOf(i56).length()), h2, "Saiz sample count ", i56, " is greater than fragment sample count"));
                                }
                                if (I == 0) {
                                    boolean[] zArr3 = msjVar2.k;
                                    i8 = 0;
                                    for (int i57 = 0; i57 < h2; i57++) {
                                        int I2 = zzeuVar6.I();
                                        i8 += I2;
                                        zArr3[i57] = I2 > i55;
                                    }
                                    z = false;
                                } else {
                                    boolean z5 = I > i55;
                                    i8 = I * h2;
                                    z = false;
                                    Arrays.fill(msjVar2.k, 0, h2, z5);
                                }
                                Arrays.fill(msjVar2.k, h2, msjVar2.d, z);
                                if (i8 > 0) {
                                    ((zzeu) msjVar2.q).y(i8);
                                    msjVar2.j = true;
                                    msjVar2.l = true;
                                }
                            }
                            zzga b12 = zzfzVar2.b(1935763823);
                            if (b12 != null) {
                                zzeu zzeuVar7 = b12.b;
                                zzeuVar7.D(8);
                                int b13 = zzeuVar7.b();
                                if ((b13 & 1) == 1) {
                                    zzeuVar7.E(8);
                                }
                                int h3 = zzeuVar7.h();
                                if (h3 != 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(h3).length() + 29);
                                    sb.append("Unexpected saio entry count: ");
                                    sb.append(h3);
                                    throw zzat.a(null, sb.toString());
                                }
                                msjVar2.b += zzalv.a(b13) == 0 ? zzeuVar7.N() : zzeuVar7.j();
                            }
                            zzga b14 = zzfzVar2.b(1936027235);
                            if (b14 != null) {
                                h(b14.b, 0, msjVar2);
                            }
                            String str3 = zzamxVar != null ? zzamxVar.b : null;
                            zzeu zzeuVar8 = null;
                            zzeu zzeuVar9 = null;
                            for (int i58 = 0; i58 < arrayList11.size(); i58++) {
                                zzga zzgaVar4 = (zzga) arrayList11.get(i58);
                                zzeu zzeuVar10 = zzgaVar4.b;
                                int i59 = zzgaVar4.a;
                                if (i59 == 1935828848) {
                                    zzeuVar10.D(12);
                                    if (zzeuVar10.b() == 1936025959) {
                                        zzeuVar8 = zzeuVar10;
                                    }
                                } else if (i59 == 1936158820) {
                                    zzeuVar10.D(12);
                                    if (zzeuVar10.b() == 1936025959) {
                                        zzeuVar9 = zzeuVar10;
                                    }
                                }
                            }
                            if (zzeuVar8 != null && zzeuVar9 != null) {
                                zzeuVar8.D(8);
                                int a2 = zzalv.a(zzeuVar8.b());
                                zzeuVar8.E(4);
                                if (a2 == 1) {
                                    zzeuVar8.E(4);
                                }
                                if (zzeuVar8.b() != 1) {
                                    throw zzat.b("Entry count in sbgp != 1 (unsupported).");
                                }
                                zzeuVar9.D(8);
                                int a3 = zzalv.a(zzeuVar9.b());
                                zzeuVar9.E(4);
                                if (a3 == 1) {
                                    if (zzeuVar9.N() == 0) {
                                        throw zzat.b("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (a3 >= 2) {
                                    zzeuVar9.E(4);
                                }
                                if (zzeuVar9.N() != 1) {
                                    throw zzat.b("Entry count in sgpd != 1 (unsupported).");
                                }
                                zzeuVar9.E(1);
                                int I3 = zzeuVar9.I();
                                int i60 = (I3 & 240) >> 4;
                                int i61 = I3 & 15;
                                if (zzeuVar9.I() == 1) {
                                    int I4 = zzeuVar9.I();
                                    byte[] bArr3 = new byte[16];
                                    zzeuVar9.F(0, 16, bArr3);
                                    if (I4 == 0) {
                                        int I5 = zzeuVar9.I();
                                        byte[] bArr4 = new byte[I5];
                                        zzeuVar9.F(0, I5, bArr4);
                                        bArr = bArr4;
                                    } else {
                                        bArr = null;
                                    }
                                    msjVar2.j = true;
                                    msjVar2.p = new zzamx(true, str3, I4, bArr3, i60, i61, bArr);
                                }
                            }
                            int size5 = arrayList11.size();
                            for (int i62 = 0; i62 < size5; i62++) {
                                zzga zzgaVar5 = (zzga) arrayList11.get(i62);
                                if (zzgaVar5.a == 1970628964) {
                                    zzeu zzeuVar11 = zzgaVar5.b;
                                    zzeuVar11.D(8);
                                    byte[] bArr5 = this.h;
                                    zzeuVar11.F(0, 16, bArr5);
                                    if (Arrays.equals(bArr5, N)) {
                                        h(zzeuVar11, 16, msjVar2);
                                    }
                                }
                            }
                            i6 = 8;
                        }
                    } else {
                        arrayList2 = arrayList10;
                        i4 = size3;
                        arrayList3 = arrayList5;
                        i5 = i37;
                        i6 = i22;
                    }
                    i37 = i5 + 1;
                    i22 = i6;
                    arrayList10 = arrayList2;
                    size3 = i4;
                    arrayList5 = arrayList3;
                }
                zzq j13 = j(arrayList5);
                if (j13 != null) {
                    int size6 = sparseArray.size();
                    for (int i63 = 0; i63 < size6; i63++) {
                        hhn hhnVar3 = (hhn) sparseArray.valueAt(i63);
                        zzamw zzamwVar5 = hhnVar3.d.a;
                        zgn zgnVar7 = (zgn) hhnVar3.b.o;
                        String str4 = zzfm.a;
                        int i64 = zgnVar7.a;
                        zzamx[] zzamxVarArr2 = zzamwVar5.n;
                        zzamx zzamxVar2 = zzamxVarArr2 == null ? null : zzamxVarArr2[i64];
                        zzq a4 = j13.a(zzamxVar2 != null ? zzamxVar2.b : null);
                        zzv zzvVar2 = hhnVar3.m;
                        zzvVar2.getClass();
                        zzt zztVar2 = new zzt(zzvVar2);
                        zztVar2.r = a4;
                        zzv zzvVar3 = new zzv(zztVar2);
                        if (hhnVar3.l != null) {
                            hhnVar3.l = zzvVar3;
                        } else {
                            hhnVar3.a.e(zzvVar3);
                        }
                    }
                }
                if (this.x != C.TIME_UNSET) {
                    int size7 = sparseArray.size();
                    for (int i65 = 0; i65 < size7; i65++) {
                        hhn hhnVar4 = (hhn) sparseArray.valueAt(i65);
                        long j14 = this.x;
                        int i66 = hhnVar4.f;
                        while (true) {
                            msj msjVar3 = hhnVar4.b;
                            if (i66 < msjVar3.d && msjVar3.h[i66] <= j14) {
                                if (msjVar3.i[i66]) {
                                    hhnVar4.i = i66;
                                }
                                i66++;
                            }
                        }
                    }
                    this.x = C.TIME_UNSET;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((zzfz) arrayDeque.peek()).d.add(zzfzVar);
            }
        }
    }

    public final void k(zzahk zzahkVar, zzahh zzahhVar) {
        this.G.c(zzahkVar);
        this.J = true;
        zzahhVar.a = this.M;
        b();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ List zzb() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public zzamd() {
        this(zzanx.G7, 32, s.e);
        mio mioVar = zzgxm.b;
    }
}
