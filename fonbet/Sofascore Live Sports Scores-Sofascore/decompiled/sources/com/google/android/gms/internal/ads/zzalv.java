package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.b1l;
import defpackage.bf3;
import defpackage.d1l;
import defpackage.h12;
import defpackage.j12;
import defpackage.j9;
import defpackage.jgn;
import defpackage.lnb;
import defpackage.me4;
import defpackage.mio;
import defpackage.mz1;
import defpackage.ul0;
import defpackage.und;
import defpackage.vl0;
import defpackage.vn0;
import defpackage.wt3;
import defpackage.x5n;
import defpackage.xl0;
import defpackage.ygn;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzalv {
    public static final byte[] a;

    static {
        String str = zzfm.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        if (r29 == 0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x1143  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x116d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0f48  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0f4a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x10b3  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x10ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList b(zzfz zzfzVar, zzaha zzahaVar, long j, zzq zzqVar, boolean z, boolean z2, zzgub zzgubVar) {
        long j2;
        long j3;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        long j4;
        long w;
        long j5;
        int a2;
        int i6;
        boolean z5;
        int i7;
        long j6;
        long j7;
        int i8;
        int i9;
        String str;
        zzga b;
        ArrayList arrayList;
        int i10;
        zzfz zzfzVar2;
        int i11;
        zzhbh zzhbhVar;
        zzhbh zzhbhVar2;
        zzv zzvVar;
        boolean z6;
        zzamw zzamwVar;
        zzgub zzgubVar2;
        zzap zzapVar;
        zzfz c;
        Pair h;
        zzga b2;
        int i12;
        boolean z7;
        short s;
        int i13;
        long j8;
        int i14;
        char c2;
        int i15;
        int i16;
        short s2;
        zzq zzqVar2;
        String str2;
        ArrayList arrayList2;
        zzfz zzfzVar3;
        int i17;
        char c3;
        String str3;
        String str4;
        int i18;
        int i19;
        boolean z8;
        String str5;
        j12 j12Var;
        int i20;
        int i21;
        boolean z9;
        String str6;
        String str7;
        j12 j12Var2;
        int i22;
        zzgo zzgoVar;
        int i23;
        int i24;
        int i25;
        boolean z10;
        int i26;
        int i27;
        d1l d1lVar;
        int i28;
        boolean z11;
        String str8;
        int i29;
        boolean z12;
        boolean z13;
        String str9;
        boolean z14;
        zzq zzqVar3;
        int i30;
        boolean z15;
        int i31;
        zzeu zzeuVar;
        int i32;
        String str10;
        long j9;
        s sVar;
        int i33;
        boolean z16;
        boolean z17;
        zzamw zzamwVar2;
        ArrayList arrayList3;
        zzfz zzfzVar4 = zzfzVar;
        ArrayList arrayList4 = new ArrayList();
        int i34 = 0;
        while (true) {
            ArrayList arrayList5 = zzfzVar4.d;
            if (i34 >= arrayList5.size()) {
                return arrayList4;
            }
            zzfz zzfzVar5 = (zzfz) arrayList5.get(i34);
            if (zzfzVar5.a != 1953653099) {
                arrayList3 = arrayList4;
                i10 = i34;
            } else {
                zzga b3 = zzfzVar4.b(1836476516);
                b3.getClass();
                zzfz c4 = zzfzVar5.c(1835297121);
                c4.getClass();
                zzga b4 = c4.b(1751411826);
                b4.getClass();
                zzeu zzeuVar2 = b4.b;
                zzeuVar2.D(16);
                int b5 = zzeuVar2.b();
                int i35 = b5 == 1936684398 ? 1 : b5 == 1986618469 ? 2 : (b5 == 1952807028 || b5 == 1935832172 || b5 == 1937072756 || b5 == 1668047728 || b5 == 1937072752) ? 3 : b5 == 1835365473 ? 5 : -1;
                int i36 = 0;
                if (i35 != -1) {
                    zzga b6 = zzfzVar5.b(1953196132);
                    b6.getClass();
                    zzeu zzeuVar3 = b6.b;
                    zzeuVar3.D(8);
                    int a3 = a(zzeuVar3.b());
                    zzeuVar3.E(a3 == 0 ? 8 : 16);
                    int b7 = zzeuVar3.b();
                    zzeuVar3.E(4);
                    int i37 = zzeuVar3.b;
                    int i38 = 0;
                    while (true) {
                        int i39 = a3 == 0 ? 4 : 8;
                        j2 = C.TIME_UNSET;
                        if (i38 >= i39) {
                            zzeuVar3.E(i39);
                            break;
                        }
                        if (zzeuVar3.a[i37 + i38] != -1) {
                            j3 = a3 == 0 ? zzeuVar3.N() : zzeuVar3.j();
                        } else {
                            i38++;
                        }
                    }
                    j3 = -9223372036854775807L;
                    zzeuVar3.E(10);
                    int J = zzeuVar3.J();
                    zzeuVar3.E(4);
                    int b8 = zzeuVar3.b();
                    int b9 = zzeuVar3.b();
                    zzeuVar3.E(4);
                    int b10 = zzeuVar3.b();
                    int b11 = zzeuVar3.b();
                    int i40 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    if (b8 == 0) {
                        if (b9 == 65536) {
                            if (b10 != -65536) {
                                if (b10 == 65536) {
                                    z16 = b11 != 0;
                                    z17 = true;
                                    b10 = 65536;
                                }
                                b9 = 65536;
                            } else {
                                z16 = b11 != 0;
                                z17 = true;
                            }
                            if (z17 != z16) {
                                i4 = 90;
                                b8 = 0;
                                zzeuVar3.E(16);
                                short L = zzeuVar3.L();
                                zzeuVar3.E(2);
                                short L2 = zzeuVar3.L();
                                int i41 = i35;
                                z4 = (((long) b8) * ((long) b11)) - (((long) i40) * ((long) b10)) >= 0;
                                j4 = j != C.TIME_UNSET ? j3 : j;
                                long j10 = d(b3.b).c;
                                if (j4 != C.TIME_UNSET) {
                                    j5 = j10;
                                    w = -9223372036854775807L;
                                } else {
                                    w = zzfm.w(j4, 1000000L, j10, RoundingMode.DOWN);
                                    j5 = j10;
                                }
                                zzfz c5 = c4.c(1835626086);
                                c5.getClass();
                                zzfz c6 = c5.c(1937007212);
                                c6.getClass();
                                zzga b12 = c4.b(1835296868);
                                b12.getClass();
                                zzeu zzeuVar4 = b12.b;
                                zzeuVar4.D(8);
                                a2 = a(zzeuVar4.b());
                                zzeuVar4.E(a2 != 0 ? 8 : 16);
                                long N = zzeuVar4.N();
                                int i42 = zzeuVar4.b;
                                i6 = 0;
                                while (true) {
                                    if (a2 != 0) {
                                        z5 = z4;
                                        i7 = 4;
                                    } else {
                                        z5 = z4;
                                        i7 = 8;
                                    }
                                    if (i6 < i7) {
                                        j6 = N;
                                        zzeuVar4.E(i7);
                                        break;
                                    }
                                    i33 = i6;
                                    if (zzeuVar4.a[i42 + i6] != -1) {
                                        long N2 = a2 == 0 ? zzeuVar4.N() : zzeuVar4.j();
                                        if (N2 == 0) {
                                            j7 = -9223372036854775807L;
                                            j6 = N;
                                        } else {
                                            j2 = zzfm.w(N2, 1000000L, N, RoundingMode.DOWN);
                                            j6 = N;
                                        }
                                    } else {
                                        i6 = i33 + 1;
                                        z4 = z5;
                                    }
                                }
                                j7 = j2;
                                int J2 = zzeuVar4.J();
                                char c7 = 2;
                                char[] cArr = {(char) (((J2 >> 10) & 31) + 96), (char) (((J2 >> 5) & 31) + 96), (char) ((J2 & 31) + 96)};
                                i9 = 0;
                                for (i8 = 3; i9 < i8; i8 = 3) {
                                    char c8 = cArr[i9];
                                    if (c8 < 'a' || c8 > 'z') {
                                        str = null;
                                        break;
                                    }
                                    i9++;
                                }
                                str = new String(cArr);
                                b = c6.b(1937011556);
                                if (b != null) {
                                    zzeh.c("Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                                } else {
                                    zzeu zzeuVar5 = b.b;
                                    zzeuVar5.D(12);
                                    int b13 = zzeuVar5.b();
                                    long j11 = w;
                                    j12 j12Var3 = new j12(b13, 9);
                                    int i43 = 0;
                                    while (i43 < b13) {
                                        int i44 = zzeuVar5.b;
                                        int i45 = b13;
                                        int b14 = zzeuVar5.b();
                                        if (b14 > 0) {
                                            i12 = i44;
                                            z7 = 1;
                                        } else {
                                            i12 = i44;
                                            z7 = i36;
                                        }
                                        String str11 = "childAtomSize must be positive";
                                        zzagl.a("childAtomSize must be positive", z7);
                                        int b15 = zzeuVar5.b();
                                        int i46 = J;
                                        if (b15 == 1635148593 || b15 == 1635148595 || b15 == 1701733238 || b15 == 1831958048 || b15 == 1836070006 || b15 == 1752589105 || b15 == 1751479857 || b15 == 1987470129 || b15 == 1987471665 || b15 == 1932670515 || b15 == 1211250227 || b15 == 1748121139 || b15 == 1987063864 || b15 == 1987063865 || b15 == 1635135537 || b15 == 1685479798 || b15 == 1685479729 || b15 == 1685481573 || b15 == 1685481521 || b15 == 1634760241 || b15 == 1684108849) {
                                            s = L2;
                                            int i47 = b15;
                                            i13 = i41;
                                            int i48 = b7;
                                            j8 = j11;
                                            boolean z18 = z5;
                                            int i49 = i12;
                                            int i50 = b14;
                                            i14 = i46;
                                            c2 = '\t';
                                            String str12 = str;
                                            i15 = i43;
                                            zzeuVar5.D(i49 + 16);
                                            zzeuVar5.E(16);
                                            int J3 = zzeuVar5.J();
                                            int J4 = zzeuVar5.J();
                                            i16 = i34;
                                            zzeuVar5.E(50);
                                            int i51 = zzeuVar5.b;
                                            s2 = L;
                                            int i52 = 1701733238;
                                            if (i47 == 1701733238) {
                                                Pair k = k(zzeuVar5, i49, i50);
                                                if (k != null) {
                                                    i52 = ((Integer) k.first).intValue();
                                                    if (zzqVar == null) {
                                                        i12 = i49;
                                                        zzqVar2 = null;
                                                    } else {
                                                        i12 = i49;
                                                        zzqVar2 = zzqVar.a(((zzamx) k.second).b);
                                                    }
                                                    ((zzamx[]) j12Var3.d)[i15] = (zzamx) k.second;
                                                } else {
                                                    i12 = i49;
                                                    zzqVar2 = zzqVar;
                                                }
                                                zzeuVar5.D(i51);
                                                i47 = i52;
                                            } else {
                                                i12 = i49;
                                                zzqVar2 = zzqVar;
                                            }
                                            if (i47 == 1831958048) {
                                                str2 = MimeTypes.VIDEO_MPEG;
                                            } else if (i47 == 1211250227) {
                                                i47 = 1211250227;
                                                str2 = MimeTypes.VIDEO_H263;
                                            } else {
                                                str2 = null;
                                            }
                                            zzq zzqVar4 = zzqVar2;
                                            arrayList2 = arrayList4;
                                            int i53 = i4;
                                            int i54 = i51;
                                            zzfzVar3 = zzfzVar5;
                                            String str13 = str2;
                                            float f = 1.0f;
                                            int i55 = -1;
                                            int i56 = 8;
                                            zzgo zzgoVar2 = null;
                                            List list = null;
                                            int i57 = -1;
                                            int i58 = 8;
                                            int i59 = -1;
                                            int i60 = -1;
                                            ByteBuffer byteBuffer = null;
                                            String str14 = null;
                                            int i61 = -1;
                                            byte[] bArr = null;
                                            int i62 = -1;
                                            int i63 = -1;
                                            boolean z19 = false;
                                            zzfw zzfwVar = null;
                                            h12 h12Var = null;
                                            vl0 vl0Var = null;
                                            int i64 = -1;
                                            while (i54 - i12 < i50) {
                                                zzeuVar5.D(i54);
                                                int i65 = zzeuVar5.b;
                                                int b16 = zzeuVar5.b();
                                                int i66 = i54;
                                                if (b16 != 0) {
                                                    i20 = b16;
                                                } else {
                                                    if (zzeuVar5.b - i12 == i50) {
                                                        break;
                                                    }
                                                    i20 = 0;
                                                }
                                                if (i20 > 0) {
                                                    i21 = i50;
                                                    z9 = true;
                                                } else {
                                                    i21 = i50;
                                                    z9 = false;
                                                }
                                                zzagl.a(str11, z9);
                                                int b17 = zzeuVar5.b();
                                                if (b17 == 1635148611) {
                                                    int i67 = i65 + 8;
                                                    zzagl.a(null, str13 == null);
                                                    zzeuVar5.D(i67);
                                                    zzafm a4 = zzafm.a(zzeuVar5);
                                                    ArrayList arrayList6 = a4.a;
                                                    j12Var3.b = a4.b;
                                                    if (z19) {
                                                        z14 = true;
                                                    } else {
                                                        f = a4.k;
                                                        z14 = false;
                                                    }
                                                    str9 = a4.l;
                                                    int i68 = a4.j;
                                                    i57 = a4.g;
                                                    int i69 = a4.h;
                                                    int i70 = a4.i;
                                                    i56 = a4.e;
                                                    i58 = a4.f;
                                                    i55 = i70;
                                                    i59 = i69;
                                                    str6 = str11;
                                                    z19 = z14;
                                                    i23 = i47;
                                                    j12Var2 = j12Var3;
                                                    i61 = i68;
                                                    str13 = "video/avc";
                                                    list = arrayList6;
                                                } else if (b17 == 1752589123) {
                                                    int i71 = i65 + 8;
                                                    zzagl.a(null, str13 == null);
                                                    zzeuVar5.D(i71);
                                                    zzahb a5 = zzahb.a(zzeuVar5, false, null);
                                                    List list2 = a5.a;
                                                    j12Var3.b = a5.b;
                                                    if (z19) {
                                                        z13 = true;
                                                    } else {
                                                        f = a5.l;
                                                        z13 = false;
                                                    }
                                                    int i72 = a5.m;
                                                    int i73 = a5.c;
                                                    str9 = a5.n;
                                                    int i74 = a5.k;
                                                    if (i74 == -1) {
                                                        i74 = i60;
                                                    }
                                                    int i75 = a5.d;
                                                    int i76 = a5.e;
                                                    int i77 = a5.h;
                                                    int i78 = a5.i;
                                                    int i79 = a5.j;
                                                    int i80 = a5.f;
                                                    int i81 = a5.g;
                                                    z19 = z13;
                                                    str6 = str11;
                                                    i64 = i73;
                                                    i23 = i47;
                                                    j12Var2 = j12Var3;
                                                    i56 = i80;
                                                    zzgoVar2 = a5.o;
                                                    i62 = i76;
                                                    i55 = i79;
                                                    i61 = i72;
                                                    i59 = i78;
                                                    i57 = i77;
                                                    str13 = "video/hevc";
                                                    i60 = i74;
                                                    i63 = i75;
                                                    list = list2;
                                                    i58 = i81;
                                                } else {
                                                    if (b17 == 1818785347) {
                                                        int i82 = i65 + 8;
                                                        zzagl.a("lhvC must follow hvcC atom", "video/hevc".equals(str13));
                                                        if (zzgoVar2 != null) {
                                                            z12 = zzgoVar2.a.size() >= 2;
                                                        } else {
                                                            z12 = false;
                                                            zzgoVar2 = null;
                                                        }
                                                        zzagl.a("must have at least two layers", z12);
                                                        zzeuVar5.D(i82);
                                                        zzgoVar2.getClass();
                                                        zzahb a6 = zzahb.a(zzeuVar5, true, zzgoVar2);
                                                        zzagl.a("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", j12Var3.b == a6.b);
                                                        int i83 = a6.h;
                                                        if (i83 != -1) {
                                                            zzagl.a("colorSpace must be the same for both views", i57 == i83);
                                                        }
                                                        int i84 = a6.i;
                                                        if (i84 != -1) {
                                                            zzagl.a("colorRange must be the same for both views", i59 == i84);
                                                        }
                                                        int i85 = a6.j;
                                                        if (i85 != -1) {
                                                            zzagl.a("colorTransfer must be the same for both views", i55 == i85);
                                                        }
                                                        zzagl.a("bitdepthLuma must be the same for both views", i56 == a6.f);
                                                        zzagl.a("bitdepthChroma must be the same for both views", i58 == a6.g);
                                                        if (list != null) {
                                                            mio mioVar = zzgxm.b;
                                                            zzgxj zzgxjVar = new zzgxj();
                                                            zzgxjVar.d(list);
                                                            zzgxjVar.d(a6.a);
                                                            list = zzgxjVar.f();
                                                        } else {
                                                            zzagl.a("initializationData must be already set from hvcC atom", false);
                                                        }
                                                        String str15 = a6.n;
                                                        str13 = "video/mv-hevc";
                                                        str14 = str15;
                                                        str6 = str11;
                                                        i23 = i47;
                                                        j12Var2 = j12Var3;
                                                    } else {
                                                        if (b17 == 1987470147) {
                                                            int i86 = i65 + 8;
                                                            zzagl.a(null, str13 == null);
                                                            zzeuVar5.D(i86);
                                                            zzahw a7 = zzahw.a(zzeuVar5);
                                                            List list3 = a7.a;
                                                            j12Var3.b = a7.b;
                                                            String str16 = a7.c;
                                                            i58 = a7.d;
                                                            list = list3;
                                                            str6 = str11;
                                                            str14 = str16;
                                                            str13 = "video/vvc";
                                                            i23 = i47;
                                                            j12Var2 = j12Var3;
                                                            i61 = 16;
                                                            i56 = i58;
                                                        } else {
                                                            if (b17 == 1986361461) {
                                                                zzeuVar5.D(i65 + 8);
                                                                int i87 = zzeuVar5.b;
                                                                str7 = str13;
                                                                b1l b1lVar = null;
                                                                while (i87 - i65 < i20) {
                                                                    zzeuVar5.D(i87);
                                                                    int b18 = zzeuVar5.b();
                                                                    if (b18 > 0) {
                                                                        i28 = i87;
                                                                        z11 = true;
                                                                    } else {
                                                                        i28 = i87;
                                                                        z11 = false;
                                                                    }
                                                                    zzagl.a(str11, z11);
                                                                    j12 j12Var4 = j12Var3;
                                                                    if (zzeuVar5.b() == 1702454643) {
                                                                        zzeuVar5.D(i28 + 8);
                                                                        int i88 = zzeuVar5.b;
                                                                        while (i88 - i28 < b18) {
                                                                            zzeuVar5.D(i88);
                                                                            int b19 = zzeuVar5.b();
                                                                            zzagl.a(str11, b19 > 0);
                                                                            int i89 = i88;
                                                                            if (zzeuVar5.b() == 1937011305) {
                                                                                zzeuVar5.E(4);
                                                                                int I = zzeuVar5.I();
                                                                                str8 = str11;
                                                                                i29 = b18;
                                                                                b1lVar = new b1l(new vn0(1 == (I & 1), (I & 2) == 2, (I & 8) == 8), 4);
                                                                            } else {
                                                                                i88 = i89 + b19;
                                                                                str11 = str11;
                                                                            }
                                                                        }
                                                                        str8 = str11;
                                                                        i29 = b18;
                                                                        b1lVar = null;
                                                                        i87 = i28 + i29;
                                                                        j12Var3 = j12Var4;
                                                                        str11 = str8;
                                                                    } else {
                                                                        str8 = str11;
                                                                        i29 = b18;
                                                                    }
                                                                    i87 = i28 + i29;
                                                                    j12Var3 = j12Var4;
                                                                    str11 = str8;
                                                                }
                                                                str6 = str11;
                                                                j12Var2 = j12Var3;
                                                                if (b1lVar == null) {
                                                                    i27 = 5;
                                                                    d1lVar = null;
                                                                } else {
                                                                    i27 = 5;
                                                                    d1lVar = new d1l(b1lVar, i27);
                                                                }
                                                                if (d1lVar != null) {
                                                                    b1l b1lVar2 = (b1l) d1lVar.b;
                                                                    if (zzgoVar2 == null) {
                                                                        zzgoVar2 = null;
                                                                    } else if (zzgoVar2.a.size() >= 2) {
                                                                        vn0 vn0Var = (vn0) b1lVar2.b;
                                                                        zzagl.a("both eye views must be marked as available", vn0Var.a && vn0Var.b);
                                                                        zzagl.a("for MV-HEVC, eye_views_reversed must be set to false", !((vn0) b1lVar2.b).c);
                                                                    }
                                                                    if (i60 != -1) {
                                                                        i23 = i47;
                                                                        str13 = str7;
                                                                    } else if (true != ((vn0) b1lVar2.b).c) {
                                                                        i23 = i47;
                                                                        str13 = str7;
                                                                        i60 = 4;
                                                                    } else {
                                                                        i60 = i27;
                                                                        i23 = i47;
                                                                        str13 = str7;
                                                                    }
                                                                }
                                                                i22 = i56;
                                                                zzgoVar = zzgoVar2;
                                                                i23 = i47;
                                                                i24 = i58;
                                                                i25 = i59;
                                                            } else {
                                                                str6 = str11;
                                                                str7 = str13;
                                                                j12Var2 = j12Var3;
                                                                if (b17 == 1685480259 || b17 == 1685485123 || b17 == 1685485379) {
                                                                    i22 = i56;
                                                                    zzgoVar = zzgoVar2;
                                                                    i23 = i47;
                                                                    i24 = i58;
                                                                    i25 = i59;
                                                                    zzfwVar = zzfw.a(zzeuVar5);
                                                                } else if (b17 == 1987076931) {
                                                                    int i90 = i65 + 12;
                                                                    zzagl.a(null, str7 == null);
                                                                    zzeuVar5.D(i90);
                                                                    byte I2 = (byte) zzeuVar5.I();
                                                                    byte I3 = (byte) zzeuVar5.I();
                                                                    int I4 = zzeuVar5.I();
                                                                    int i91 = I4 >> 4;
                                                                    int i92 = I4 >> 1;
                                                                    String str17 = i47 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                                                    if (str17.equals(MimeTypes.VIDEO_VP9)) {
                                                                        byte b20 = (byte) (i92 & 7);
                                                                        byte[] bArr2 = zzdr.a;
                                                                        i26 = 1;
                                                                        list = zzgxm.t(new byte[]{1, 1, I2, 2, 1, I3, 3, 1, (byte) i91, 4, 1, b20});
                                                                    } else {
                                                                        i26 = 1;
                                                                    }
                                                                    int i93 = I4 & 1;
                                                                    int I5 = zzeuVar5.I();
                                                                    int I6 = zzeuVar5.I();
                                                                    int b21 = zzi.b(I5);
                                                                    int i94 = i26 != i93 ? 2 : 1;
                                                                    i55 = zzi.c(I6);
                                                                    i57 = b21;
                                                                    i56 = i91;
                                                                    i58 = i56;
                                                                    i23 = i47;
                                                                    str13 = str17;
                                                                    i59 = i94;
                                                                } else if (b17 == 1635135811) {
                                                                    int i95 = i20 - 8;
                                                                    byte[] bArr3 = new byte[i95];
                                                                    zzeuVar5.F(0, i95, bArr3);
                                                                    s t = zzgxm.t(bArr3);
                                                                    zzafl a8 = zzafl.a(bArr3);
                                                                    if (a8 != null) {
                                                                        String str18 = a8.e;
                                                                        int i96 = a8.d;
                                                                        i59 = a8.c;
                                                                        i57 = a8.b;
                                                                        str14 = str18;
                                                                        i55 = i96;
                                                                        i56 = a8.a;
                                                                        i58 = i56;
                                                                    }
                                                                    list = t;
                                                                    str13 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                                    i23 = i47;
                                                                } else if (b17 == 1668050025) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                    }
                                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                                    byteBuffer2.position(21);
                                                                    byteBuffer2.putShort(zzeuVar5.L());
                                                                    byteBuffer2.putShort(zzeuVar5.L());
                                                                    byteBuffer = byteBuffer2;
                                                                    i23 = i47;
                                                                    str13 = str7;
                                                                } else {
                                                                    if (b17 == 1835295606) {
                                                                        if (byteBuffer == null) {
                                                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                        }
                                                                        ByteBuffer byteBuffer3 = byteBuffer;
                                                                        short L3 = zzeuVar5.L();
                                                                        short L4 = zzeuVar5.L();
                                                                        short L5 = zzeuVar5.L();
                                                                        short L6 = zzeuVar5.L();
                                                                        zzgoVar = zzgoVar2;
                                                                        short L7 = zzeuVar5.L();
                                                                        i23 = i47;
                                                                        short L8 = zzeuVar5.L();
                                                                        i24 = i58;
                                                                        short L9 = zzeuVar5.L();
                                                                        i22 = i56;
                                                                        short L10 = zzeuVar5.L();
                                                                        long N3 = zzeuVar5.N();
                                                                        long N4 = zzeuVar5.N();
                                                                        i25 = i59;
                                                                        byteBuffer3.position(1);
                                                                        byteBuffer3.putShort(L7);
                                                                        byteBuffer3.putShort(L8);
                                                                        byteBuffer3.putShort(L3);
                                                                        byteBuffer3.putShort(L4);
                                                                        byteBuffer3.putShort(L5);
                                                                        byteBuffer3.putShort(L6);
                                                                        byteBuffer3.putShort(L9);
                                                                        byteBuffer3.putShort(L10);
                                                                        byteBuffer3.putShort((short) (N3 / Ua.s));
                                                                        byteBuffer3.putShort((short) (N4 / Ua.s));
                                                                        byteBuffer = byteBuffer3;
                                                                        str13 = str7;
                                                                    } else {
                                                                        i22 = i56;
                                                                        zzgoVar = zzgoVar2;
                                                                        i23 = i47;
                                                                        i24 = i58;
                                                                        i25 = i59;
                                                                        if (b17 == 1681012275) {
                                                                            zzagl.a(null, str7 == null);
                                                                            str13 = MimeTypes.VIDEO_H263;
                                                                        } else if (b17 == 1702061171) {
                                                                            zzagl.a(null, str7 == null);
                                                                            vl0 j12 = j(i65, zzeuVar5);
                                                                            String str19 = j12.a;
                                                                            byte[] bArr4 = j12.b;
                                                                            if (bArr4 != null) {
                                                                                vl0Var = j12;
                                                                                list = zzgxm.t(bArr4);
                                                                                zzgoVar2 = zzgoVar;
                                                                                i58 = i24;
                                                                                i56 = i22;
                                                                                i59 = i25;
                                                                                str13 = str19;
                                                                            } else {
                                                                                vl0Var = j12;
                                                                                str13 = str19;
                                                                                zzgoVar2 = zzgoVar;
                                                                                i58 = i24;
                                                                                i56 = i22;
                                                                                i59 = i25;
                                                                            }
                                                                        } else {
                                                                            if (b17 == 1651798644) {
                                                                                zzeuVar5.D(i65 + 8);
                                                                                zzeuVar5.E(4);
                                                                                h12Var = new h12(zzeuVar5.N(), zzeuVar5.N());
                                                                            } else if (b17 == 1885434736) {
                                                                                zzeuVar5.D(i65 + 8);
                                                                                f = zzeuVar5.h() / zzeuVar5.h();
                                                                                str13 = str7;
                                                                                zzgoVar2 = zzgoVar;
                                                                                i58 = i24;
                                                                                i56 = i22;
                                                                                i59 = i25;
                                                                                z19 = true;
                                                                            } else if (b17 == 1937126244) {
                                                                                int i97 = i65 + 8;
                                                                                while (true) {
                                                                                    if (i97 - i65 >= i20) {
                                                                                        bArr = null;
                                                                                        break;
                                                                                    }
                                                                                    zzeuVar5.D(i97);
                                                                                    int b22 = zzeuVar5.b() + i97;
                                                                                    if (zzeuVar5.b() == 1886547818) {
                                                                                        bArr = Arrays.copyOfRange(zzeuVar5.a, i97, b22);
                                                                                        break;
                                                                                    }
                                                                                    i97 = b22;
                                                                                }
                                                                            } else if (b17 == 1936995172) {
                                                                                int I7 = zzeuVar5.I();
                                                                                zzeuVar5.E(3);
                                                                                if (I7 == 0) {
                                                                                    int I8 = zzeuVar5.I();
                                                                                    if (I8 == 0) {
                                                                                        str13 = str7;
                                                                                        zzgoVar2 = zzgoVar;
                                                                                        i58 = i24;
                                                                                        i56 = i22;
                                                                                        i59 = i25;
                                                                                        i60 = 0;
                                                                                    } else if (I8 == 1) {
                                                                                        str13 = str7;
                                                                                        zzgoVar2 = zzgoVar;
                                                                                        i58 = i24;
                                                                                        i56 = i22;
                                                                                        i59 = i25;
                                                                                        i60 = 1;
                                                                                    } else if (I8 == 2) {
                                                                                        str13 = str7;
                                                                                        zzgoVar2 = zzgoVar;
                                                                                        i58 = i24;
                                                                                        i56 = i22;
                                                                                        i59 = i25;
                                                                                        i60 = 2;
                                                                                    } else if (I8 == 3) {
                                                                                        i60 = 3;
                                                                                    }
                                                                                }
                                                                            } else if (b17 == 1634760259) {
                                                                                int i98 = i20 - 12;
                                                                                byte[] bArr5 = new byte[i98];
                                                                                zzeuVar5.D(i65 + 12);
                                                                                zzeuVar5.F(0, i98, bArr5);
                                                                                byte[] bArr6 = zzdr.a;
                                                                                zzguk.c(i98, "Invalid APV CSD length: %s", i98 >= 17);
                                                                                byte b23 = bArr5[0];
                                                                                zzguk.c(b23, "Invalid APV CSD version: %s", b23 == 1);
                                                                                int unsignedInt = Byte.toUnsignedInt(bArr5[5]);
                                                                                int unsignedInt2 = Byte.toUnsignedInt(bArr5[6]);
                                                                                int unsignedInt3 = Byte.toUnsignedInt(bArr5[7]);
                                                                                String str20 = zzfm.a;
                                                                                Locale locale = Locale.US;
                                                                                StringBuilder s3 = lnb.s(unsignedInt, unsignedInt2, "apv1.apvf", ".apvl", ".apvb");
                                                                                s3.append(unsignedInt3);
                                                                                String sb = s3.toString();
                                                                                s t2 = zzgxm.t(bArr5);
                                                                                zzeu zzeuVar6 = new zzeu(bArr5);
                                                                                zzh zzhVar = new zzh();
                                                                                byte[] bArr7 = zzeuVar6.a;
                                                                                zzet zzetVar = new zzet(bArr7, bArr7.length);
                                                                                zzetVar.d(zzeuVar6.b * 8);
                                                                                int i99 = 1;
                                                                                zzetVar.l(1);
                                                                                int i100 = 8;
                                                                                int h2 = zzetVar.h(8);
                                                                                int i101 = 0;
                                                                                while (i101 < h2) {
                                                                                    zzetVar.l(i99);
                                                                                    int h3 = zzetVar.h(i100);
                                                                                    int i102 = 0;
                                                                                    while (i102 < h3) {
                                                                                        zzetVar.f(6);
                                                                                        boolean g = zzetVar.g();
                                                                                        zzetVar.e();
                                                                                        zzetVar.l(11);
                                                                                        zzetVar.f(4);
                                                                                        int h4 = zzetVar.h(4) + 8;
                                                                                        zzhVar.e = h4;
                                                                                        zzhVar.f = h4;
                                                                                        zzetVar.l(1);
                                                                                        if (g) {
                                                                                            int h5 = zzetVar.h(i100);
                                                                                            int h6 = zzetVar.h(i100);
                                                                                            zzetVar.l(1);
                                                                                            boolean g2 = zzetVar.g();
                                                                                            zzhVar.a = zzi.b(h5);
                                                                                            zzhVar.b = true != g2 ? 2 : 1;
                                                                                            zzhVar.c = zzi.c(h6);
                                                                                        }
                                                                                        i102++;
                                                                                        i100 = 8;
                                                                                    }
                                                                                    i101++;
                                                                                    i100 = 8;
                                                                                    i99 = 1;
                                                                                }
                                                                                zzi a9 = zzhVar.a();
                                                                                int i103 = a9.e;
                                                                                int i104 = a9.f;
                                                                                int i105 = a9.a;
                                                                                int i106 = a9.b;
                                                                                str14 = sb;
                                                                                list = t2;
                                                                                i55 = a9.c;
                                                                                i56 = i103;
                                                                                i58 = i104;
                                                                                i57 = i105;
                                                                                i59 = i106;
                                                                                str13 = "video/apv";
                                                                                zzgoVar2 = zzgoVar;
                                                                            } else if (b17 == 1668246642) {
                                                                                if (i57 == -1) {
                                                                                    if (i55 == -1) {
                                                                                        int b24 = zzeuVar5.b();
                                                                                        if (b24 == 1852009592 || b24 == 1852009571) {
                                                                                            int J5 = zzeuVar5.J();
                                                                                            int J6 = zzeuVar5.J();
                                                                                            zzeuVar5.E(2);
                                                                                            if (i20 == 19) {
                                                                                                if ((zzeuVar5.I() & 128) != 0) {
                                                                                                    i20 = 19;
                                                                                                    z10 = true;
                                                                                                    int b25 = zzi.b(J5);
                                                                                                    int i107 = true == z10 ? 2 : 1;
                                                                                                    i57 = b25;
                                                                                                    i55 = zzi.c(J6);
                                                                                                    i59 = i107;
                                                                                                    str13 = str7;
                                                                                                    zzgoVar2 = zzgoVar;
                                                                                                    i58 = i24;
                                                                                                    i56 = i22;
                                                                                                } else {
                                                                                                    i20 = 19;
                                                                                                }
                                                                                            }
                                                                                            z10 = false;
                                                                                            int b252 = zzi.b(J5);
                                                                                            if (true == z10) {
                                                                                            }
                                                                                            i57 = b252;
                                                                                            i55 = zzi.c(J6);
                                                                                            i59 = i107;
                                                                                            str13 = str7;
                                                                                            zzgoVar2 = zzgoVar;
                                                                                            i58 = i24;
                                                                                            i56 = i22;
                                                                                        } else {
                                                                                            zzeh.c("Unsupported color type: ".concat(zzgb.a(b24)));
                                                                                            i55 = -1;
                                                                                            i57 = -1;
                                                                                            str13 = str7;
                                                                                            zzgoVar2 = zzgoVar;
                                                                                            i58 = i24;
                                                                                            i56 = i22;
                                                                                            i59 = i25;
                                                                                        }
                                                                                    } else {
                                                                                        i57 = -1;
                                                                                    }
                                                                                }
                                                                            }
                                                                            str13 = str7;
                                                                            zzgoVar2 = zzgoVar;
                                                                            i58 = i24;
                                                                            i56 = i22;
                                                                            i59 = i25;
                                                                        }
                                                                    }
                                                                    zzgoVar2 = zzgoVar;
                                                                    i58 = i24;
                                                                    i56 = i22;
                                                                    i59 = i25;
                                                                }
                                                            }
                                                            str13 = str7;
                                                            zzgoVar2 = zzgoVar;
                                                            i58 = i24;
                                                            i56 = i22;
                                                            i59 = i25;
                                                        }
                                                        i54 = i66 + i20;
                                                        i50 = i21;
                                                        j12Var3 = j12Var2;
                                                        i47 = i23;
                                                        str11 = str6;
                                                    }
                                                    i54 = i66 + i20;
                                                    i50 = i21;
                                                    j12Var3 = j12Var2;
                                                    i47 = i23;
                                                    str11 = str6;
                                                }
                                                str14 = str9;
                                                i54 = i66 + i20;
                                                i50 = i21;
                                                j12Var3 = j12Var2;
                                                i47 = i23;
                                                str11 = str6;
                                            }
                                            int i108 = i56;
                                            String str21 = str13;
                                            i17 = i50;
                                            j12 j12Var5 = j12Var3;
                                            int i109 = i58;
                                            int i110 = i59;
                                            c3 = 2;
                                            if (zzfwVar != null) {
                                                str3 = zzfwVar.a;
                                                str4 = "video/dolby-vision";
                                            } else {
                                                str3 = str14;
                                                str4 = str21;
                                            }
                                            if (str4 == null) {
                                                str5 = str12;
                                                i19 = i53;
                                                i18 = i48;
                                                z8 = z18;
                                                j12Var = j12Var5;
                                            } else {
                                                zzt zztVar = new zzt();
                                                i18 = i48;
                                                zztVar.b(i18);
                                                zztVar.d(str4);
                                                zztVar.j = str3;
                                                zztVar.u = J3;
                                                zztVar.v = J4;
                                                zztVar.w = i63;
                                                zztVar.x = i62;
                                                zztVar.B = f;
                                                i19 = i53;
                                                zztVar.z = i19;
                                                z8 = z18;
                                                zztVar.A = z8;
                                                zztVar.C = bArr;
                                                zztVar.D = i60;
                                                zztVar.q = list;
                                                zztVar.p = i61;
                                                zztVar.F = i64;
                                                zztVar.r = zzqVar4;
                                                str5 = str12;
                                                zztVar.d = str5;
                                                zzh zzhVar2 = new zzh();
                                                zzhVar2.a = i57;
                                                zzhVar2.b = i110;
                                                zzhVar2.c = i55;
                                                zzhVar2.d = byteBuffer != null ? byteBuffer.array() : null;
                                                zzhVar2.e = i108;
                                                zzhVar2.f = i109;
                                                zztVar.E = zzhVar2.a();
                                                h12 h12Var2 = h12Var;
                                                if (h12Var2 != null) {
                                                    zztVar.h = zzhbj.b(h12Var2.a);
                                                    zztVar.i = zzhbj.b(h12Var2.b);
                                                } else {
                                                    vl0 vl0Var2 = vl0Var;
                                                    if (vl0Var2 != null) {
                                                        zztVar.h = zzhbj.b(vl0Var2.c);
                                                        zztVar.i = zzhbj.b(vl0Var2.d);
                                                    }
                                                }
                                                zzv zzvVar2 = new zzv(zztVar);
                                                j12Var = j12Var5;
                                                j12Var.e = zzvVar2;
                                            }
                                        } else {
                                            if (b15 == 1836069985 || b15 == 1701733217 || b15 == 1633889587 || b15 == 1700998451 || b15 == 1633889588 || b15 == 1835823201 || b15 == 1685353315 || b15 == 1685353317 || b15 == 1685353320 || b15 == 1685353324 || b15 == 1685353336 || b15 == 1935764850 || b15 == 1935767394 || b15 == 1819304813 || b15 == 1936684916 || b15 == 1953984371 || b15 == 778924082 || b15 == 778924083 || b15 == 1835557169 || b15 == 1835560241 || b15 == 1634492771 || b15 == 1634492791 || b15 == 1970037111 || b15 == 1332770163 || b15 == 1716281667 || b15 == 1767992678 || b15 == 1768973165) {
                                                zzqVar3 = zzqVar;
                                                s = L2;
                                                i13 = i41;
                                                i30 = b7;
                                                j8 = j11;
                                                z15 = z5;
                                                i31 = b14;
                                                i14 = i46;
                                            } else if (b15 == 1718641517) {
                                                zzqVar3 = zzqVar;
                                                s = L2;
                                                i13 = i41;
                                                i30 = b7;
                                                j8 = j11;
                                                z15 = z5;
                                                i31 = b14;
                                                i14 = i46;
                                            } else {
                                                if (b15 == 1414810956 || b15 == 1954034535 || b15 == 2004251764 || b15 == 1937010800 || b15 == 1664495672 || b15 == 1836070003 || b15 == 1952807028) {
                                                    zzeuVar5.D(i12 + 16);
                                                    if (b15 == 1414810956) {
                                                        zzeuVar = zzeuVar5;
                                                        str10 = MimeTypes.APPLICATION_TTML;
                                                    } else if (b15 == 1954034535) {
                                                        int i111 = b14 - 16;
                                                        byte[] bArr8 = new byte[i111];
                                                        zzeuVar5.F(0, i111, bArr8);
                                                        zzeuVar = zzeuVar5;
                                                        sVar = zzgxm.t(bArr8);
                                                        str10 = MimeTypes.APPLICATION_TX3G;
                                                        i32 = i41;
                                                        j9 = Long.MAX_VALUE;
                                                        if (str10 != null) {
                                                            zzt zztVar2 = new zzt();
                                                            zztVar2.b(b7);
                                                            zztVar2.d(str10);
                                                            zztVar2.d = str;
                                                            zztVar2.s = j9;
                                                            zztVar2.q = sVar;
                                                            j12Var3.e = new zzv(zztVar2);
                                                        }
                                                        s = L2;
                                                        str5 = str;
                                                        i18 = b7;
                                                        j12Var = j12Var3;
                                                        i15 = i43;
                                                        i19 = i4;
                                                        i16 = i34;
                                                        s2 = L;
                                                        c3 = c7;
                                                        j8 = j11;
                                                        z8 = z5;
                                                        i17 = b14;
                                                        i14 = i46;
                                                        zzeuVar5 = zzeuVar;
                                                        i13 = i32;
                                                        c2 = '\t';
                                                        arrayList2 = arrayList4;
                                                        zzfzVar3 = zzfzVar5;
                                                    } else {
                                                        if (b15 == 2004251764) {
                                                            str10 = MimeTypes.APPLICATION_MP4VTT;
                                                        } else if (b15 == 1937010800) {
                                                            zzeuVar = zzeuVar5;
                                                            str10 = MimeTypes.APPLICATION_TTML;
                                                            i32 = i41;
                                                            j9 = 0;
                                                            sVar = null;
                                                            if (str10 != null) {
                                                            }
                                                            s = L2;
                                                            str5 = str;
                                                            i18 = b7;
                                                            j12Var = j12Var3;
                                                            i15 = i43;
                                                            i19 = i4;
                                                            i16 = i34;
                                                            s2 = L;
                                                            c3 = c7;
                                                            j8 = j11;
                                                            z8 = z5;
                                                            i17 = b14;
                                                            i14 = i46;
                                                            zzeuVar5 = zzeuVar;
                                                            i13 = i32;
                                                            c2 = '\t';
                                                            arrayList2 = arrayList4;
                                                            zzfzVar3 = zzfzVar5;
                                                        } else if (b15 == 1664495672) {
                                                            j12Var3.c = 1;
                                                            str10 = MimeTypes.APPLICATION_MP4CEA608;
                                                        } else {
                                                            if (b15 == 1836070003) {
                                                                int i112 = zzeuVar5.b;
                                                                zzeuVar5.E(4);
                                                                if (zzeuVar5.b() == 1702061171) {
                                                                    byte[] bArr9 = j(i112, zzeuVar5).b;
                                                                    if (bArr9 != null && bArr9.length == 64) {
                                                                        zzguk.f(bArr9.length == 64);
                                                                        ArrayList arrayList7 = new ArrayList(16);
                                                                        int i113 = 0;
                                                                        while (i113 < bArr9.length - 3) {
                                                                            zzeu zzeuVar7 = zzeuVar5;
                                                                            byte[] bArr10 = bArr9;
                                                                            int c9 = zzhbj.c(bArr9[i113], bArr9[i113 + 1], bArr10[i113 + 2], bArr10[i113 + 3]);
                                                                            String str22 = zzfm.a;
                                                                            int i114 = ((c9 >> 8) & 255) - 128;
                                                                            int i115 = (c9 >> 16) & 255;
                                                                            int i116 = (c9 & 255) - 128;
                                                                            arrayList7.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i116 * 17790) / 10000) + i115, 255)) | (Math.max(0, Math.min(((i114 * 14075) / 10000) + i115, 255)) << 16) | (Math.max(0, Math.min((i115 - ((i116 * 3455) / 10000)) - ((i114 * 7169) / 10000), 255)) << 8))));
                                                                            i113 += 4;
                                                                            zzeuVar5 = zzeuVar7;
                                                                            bArr9 = bArr10;
                                                                            i41 = i41;
                                                                        }
                                                                        zzeuVar = zzeuVar5;
                                                                        i32 = i41;
                                                                        Iterator it = arrayList7.iterator();
                                                                        StringBuilder sb2 = new StringBuilder();
                                                                        zzgue.a(sb2, it, ", ");
                                                                        String sb3 = sb2.toString();
                                                                        StringBuilder sb4 = new StringBuilder(mz1.d(mz1.d(String.valueOf((int) L).length() + 7, 10, String.valueOf((int) L2)), 1, sb3));
                                                                        sb4.append("size: ");
                                                                        sb4.append((int) L);
                                                                        sb4.append("x");
                                                                        sb4.append((int) L2);
                                                                        String m = wt3.m("\npalette: ", sb3, sb4, "\n");
                                                                        String str23 = zzfm.a;
                                                                        sVar = zzgxm.t(m.getBytes(StandardCharsets.UTF_8));
                                                                        str10 = MimeTypes.APPLICATION_VOBSUB;
                                                                    }
                                                                } else {
                                                                    zzeuVar = zzeuVar5;
                                                                    i32 = i41;
                                                                    sVar = null;
                                                                    str10 = null;
                                                                }
                                                                j9 = Long.MAX_VALUE;
                                                            } else {
                                                                zzeuVar = zzeuVar5;
                                                                i32 = i41;
                                                                str10 = "text/x-unknown";
                                                                j9 = Long.MAX_VALUE;
                                                                sVar = null;
                                                            }
                                                            if (str10 != null) {
                                                            }
                                                            s = L2;
                                                            str5 = str;
                                                            i18 = b7;
                                                            j12Var = j12Var3;
                                                            i15 = i43;
                                                            i19 = i4;
                                                            i16 = i34;
                                                            s2 = L;
                                                            c3 = c7;
                                                            j8 = j11;
                                                            z8 = z5;
                                                            i17 = b14;
                                                            i14 = i46;
                                                            zzeuVar5 = zzeuVar;
                                                            i13 = i32;
                                                            c2 = '\t';
                                                            arrayList2 = arrayList4;
                                                            zzfzVar3 = zzfzVar5;
                                                        }
                                                        zzeuVar = zzeuVar5;
                                                    }
                                                    i32 = i41;
                                                    j9 = Long.MAX_VALUE;
                                                    sVar = null;
                                                    if (str10 != null) {
                                                    }
                                                    s = L2;
                                                    str5 = str;
                                                    i18 = b7;
                                                    j12Var = j12Var3;
                                                    i15 = i43;
                                                    i19 = i4;
                                                    i16 = i34;
                                                    s2 = L;
                                                    c3 = c7;
                                                    j8 = j11;
                                                    z8 = z5;
                                                    i17 = b14;
                                                    i14 = i46;
                                                    zzeuVar5 = zzeuVar;
                                                    i13 = i32;
                                                    c2 = '\t';
                                                    arrayList2 = arrayList4;
                                                    zzfzVar3 = zzfzVar5;
                                                } else if (b15 == 1835365492 || b15 == 1769222965) {
                                                    zzeuVar5.D(i12 + 16);
                                                    if (b15 == 1835365492) {
                                                        zzeuVar5.m();
                                                        String m2 = zzeuVar5.m();
                                                        if (m2 != null) {
                                                            zzt zztVar3 = new zzt();
                                                            zztVar3.b(b7);
                                                            zztVar3.d(m2);
                                                            j12Var3.e = new zzv(zztVar3);
                                                        }
                                                    } else if (b15 == 1769222965) {
                                                        int I9 = zzeuVar5.I();
                                                        byte[] bArr11 = new byte[I9];
                                                        zzeuVar5.F(i36, I9, bArr11);
                                                        zzt zztVar4 = new zzt();
                                                        zztVar4.b(b7);
                                                        zztVar4.d("application/x-itut-t35");
                                                        zztVar4.q = zzgxm.t(bArr11);
                                                        j12Var3.e = new zzv(zztVar4);
                                                    }
                                                } else {
                                                    if (b15 == 1667329389) {
                                                        zzt zztVar5 = new zzt();
                                                        zztVar5.b(b7);
                                                        zztVar5.d(MimeTypes.APPLICATION_CAMERA_MOTION);
                                                        j12Var3.e = new zzv(zztVar5);
                                                    }
                                                    s = L2;
                                                    i13 = i41;
                                                    i18 = b7;
                                                    j12Var = j12Var3;
                                                    i15 = i43;
                                                    i19 = i4;
                                                    i16 = i34;
                                                    s2 = L;
                                                    c3 = c7;
                                                    j8 = j11;
                                                    i17 = b14;
                                                    i14 = i46;
                                                    c2 = '\t';
                                                    str5 = str;
                                                    arrayList2 = arrayList4;
                                                    zzfzVar3 = zzfzVar5;
                                                    z8 = z5;
                                                }
                                                s = L2;
                                                i13 = i41;
                                                i18 = b7;
                                                j12Var = j12Var3;
                                                i15 = i43;
                                                i19 = i4;
                                                i16 = i34;
                                                s2 = L;
                                                c3 = c7;
                                                j8 = j11;
                                                i17 = b14;
                                                i14 = i46;
                                                c2 = '\t';
                                                str5 = str;
                                                arrayList2 = arrayList4;
                                                zzfzVar3 = zzfzVar5;
                                                z8 = z5;
                                            }
                                            c2 = '\t';
                                            str5 = str;
                                            zzeu zzeuVar8 = zzeuVar5;
                                            int i117 = i12;
                                            i(zzeuVar8, b15, i117, i31, i30, str5, z2, zzqVar3, j12Var3, i43);
                                            zzeuVar5 = zzeuVar8;
                                            i12 = i117;
                                            i17 = i31;
                                            i18 = i30;
                                            j12Var = j12Var3;
                                            i15 = i43;
                                            arrayList2 = arrayList4;
                                            i19 = i4;
                                            i16 = i34;
                                            zzfzVar3 = zzfzVar5;
                                            s2 = L;
                                            z8 = z15;
                                            c3 = 2;
                                        }
                                        zzeuVar5.D(i12 + i17);
                                        z5 = z8;
                                        b7 = i18;
                                        str = str5;
                                        i4 = i19;
                                        i34 = i16;
                                        L = s2;
                                        arrayList4 = arrayList2;
                                        zzfzVar5 = zzfzVar3;
                                        b13 = i45;
                                        i41 = i13;
                                        J = i14;
                                        j11 = j8;
                                        i36 = 0;
                                        i43 = i15 + 1;
                                        c7 = c3;
                                        L2 = s;
                                        j12Var3 = j12Var;
                                    }
                                    int i118 = J;
                                    int i119 = i41;
                                    int i120 = b7;
                                    j12 j12Var6 = j12Var3;
                                    arrayList = arrayList4;
                                    i10 = i34;
                                    long j13 = j11;
                                    zzfzVar2 = zzfzVar5;
                                    zzfz c10 = zzfzVar2.c(1953654118);
                                    if (c10 != null && (b2 = c10.b(1667785072)) != null) {
                                        zzeu zzeuVar9 = b2.b;
                                        zzeuVar9.D(8);
                                        if (zzeuVar9.B() >= 4) {
                                            i11 = zzeuVar9.b();
                                            if (!z || (c = zzfzVar2.c(1701082227)) == null || (h = h(c)) == null) {
                                                zzhbhVar = null;
                                                zzhbhVar2 = null;
                                            } else {
                                                zzhbhVar2 = (zzhbh) h.first;
                                                zzhbhVar = (zzhbh) h.second;
                                            }
                                            zzvVar = (zzv) j12Var6.e;
                                            if (zzvVar != null) {
                                                zzgubVar2 = zzgubVar;
                                                zzamwVar = null;
                                            } else {
                                                if (i118 != 0) {
                                                    zzfy zzfyVar = new zzfy(i118);
                                                    zzt zztVar6 = new zzt(zzvVar);
                                                    zzap zzapVar2 = zzvVar.l;
                                                    if (zzapVar2 != null) {
                                                        z6 = true;
                                                        zzapVar = zzapVar2.b(zzfyVar);
                                                    } else {
                                                        z6 = true;
                                                        zzapVar = new zzap(zzfyVar);
                                                    }
                                                    zztVar6.k = zzapVar;
                                                    zzvVar = new zzv(zztVar6);
                                                } else {
                                                    z6 = true;
                                                }
                                                boolean equals = Objects.equals(zzvVar.o, "text/x-unknown") ^ z6;
                                                zzamv zzamvVar = new zzamv();
                                                zzamvVar.a = i120;
                                                zzamvVar.b = i119;
                                                zzamvVar.c = j6;
                                                zzamvVar.d = j5;
                                                zzamvVar.e = j13;
                                                zzamvVar.f = j7;
                                                zzamvVar.g = zzvVar;
                                                zzamvVar.h = j12Var6.c;
                                                zzamvVar.i = (zzamx[]) ((zzamx[]) j12Var6.d).clone();
                                                zzamvVar.j = j12Var6.b;
                                                zzamvVar.k = zzhbhVar2;
                                                zzamvVar.l = zzhbhVar;
                                                zzamvVar.m = equals;
                                                zzamvVar.n = i11;
                                                zzamvVar.g.getClass();
                                                zzamwVar = new zzamw(zzamvVar);
                                                zzgubVar2 = zzgubVar;
                                            }
                                            zzamwVar2 = (zzamw) zzgubVar2.apply(zzamwVar);
                                            if (zzamwVar2 != null) {
                                                zzfz c11 = zzfzVar2.c(1835297121);
                                                c11.getClass();
                                                zzfz c12 = c11.c(1835626086);
                                                c12.getClass();
                                                zzfz c13 = c12.c(1937007212);
                                                c13.getClass();
                                                zzamz g3 = g(zzamwVar2, c13, zzahaVar);
                                                arrayList3 = arrayList;
                                                arrayList3.add(g3);
                                            } else {
                                                arrayList3 = arrayList;
                                            }
                                        }
                                    }
                                    i11 = -1;
                                    if (z) {
                                    }
                                    zzhbhVar = null;
                                    zzhbhVar2 = null;
                                    zzvVar = (zzv) j12Var6.e;
                                    if (zzvVar != null) {
                                    }
                                    zzamwVar2 = (zzamw) zzgubVar2.apply(zzamwVar);
                                    if (zzamwVar2 != null) {
                                    }
                                }
                            }
                            b9 = 65536;
                        }
                        b8 = 0;
                    }
                    if (b8 == 0) {
                        if (b9 == -65536) {
                            if (b10 == 65536) {
                                i = b10;
                                z3 = b11 != 0;
                                i5 = i;
                            } else if (b10 == -65536) {
                                z3 = b11 != 0;
                                i5 = -65536;
                                i = -65536;
                            } else {
                                i = b10;
                                i3 = -65536;
                                b9 = -65536;
                            }
                            if (true != z3) {
                                int i121 = b9;
                                i4 = 270;
                                i40 = i121;
                                b10 = i5;
                                zzeuVar3.E(16);
                                short L11 = zzeuVar3.L();
                                zzeuVar3.E(2);
                                short L22 = zzeuVar3.L();
                                int i412 = i35;
                                if ((((long) b8) * ((long) b11)) - (((long) i40) * ((long) b10)) >= 0) {
                                }
                                if (j != C.TIME_UNSET) {
                                }
                                long j102 = d(b3.b).c;
                                if (j4 != C.TIME_UNSET) {
                                }
                                zzfz c52 = c4.c(1835626086);
                                c52.getClass();
                                zzfz c62 = c52.c(1937007212);
                                c62.getClass();
                                zzga b122 = c4.b(1835296868);
                                b122.getClass();
                                zzeu zzeuVar42 = b122.b;
                                zzeuVar42.D(8);
                                a2 = a(zzeuVar42.b());
                                zzeuVar42.E(a2 != 0 ? 8 : 16);
                                long N5 = zzeuVar42.N();
                                int i422 = zzeuVar42.b;
                                i6 = 0;
                                while (true) {
                                    if (a2 != 0) {
                                    }
                                    if (i6 < i7) {
                                    }
                                    i6 = i33 + 1;
                                    z4 = z5;
                                }
                                j7 = j2;
                                int J22 = zzeuVar42.J();
                                char c72 = 2;
                                char[] cArr2 = {(char) (((J22 >> 10) & 31) + 96), (char) (((J22 >> 5) & 31) + 96), (char) ((J22 & 31) + 96)};
                                i9 = 0;
                                while (i9 < i8) {
                                }
                                str = new String(cArr2);
                                b = c62.b(1937011556);
                                if (b != null) {
                                }
                            } else {
                                i3 = -65536;
                                b9 = -65536;
                                b8 = 0;
                                b10 = i5;
                                i2 = b8;
                            }
                        } else {
                            i = b10;
                            i3 = b9;
                        }
                        b8 = 0;
                        i2 = b8;
                    } else {
                        i = b10;
                        i2 = b8;
                        i3 = b9;
                    }
                    if (b8 != -65536) {
                        if (b8 == 65536) {
                            b8 = 65536;
                        } else {
                            i40 = b9;
                            i4 = 0;
                            b8 = i2;
                            zzeuVar3.E(16);
                            short L112 = zzeuVar3.L();
                            zzeuVar3.E(2);
                            short L222 = zzeuVar3.L();
                            int i4122 = i35;
                            if ((((long) b8) * ((long) b11)) - (((long) i40) * ((long) b10)) >= 0) {
                            }
                            if (j != C.TIME_UNSET) {
                            }
                            long j1022 = d(b3.b).c;
                            if (j4 != C.TIME_UNSET) {
                            }
                            zzfz c522 = c4.c(1835626086);
                            c522.getClass();
                            zzfz c622 = c522.c(1937007212);
                            c622.getClass();
                            zzga b1222 = c4.b(1835296868);
                            b1222.getClass();
                            zzeu zzeuVar422 = b1222.b;
                            zzeuVar422.D(8);
                            a2 = a(zzeuVar422.b());
                            zzeuVar422.E(a2 != 0 ? 8 : 16);
                            long N52 = zzeuVar422.N();
                            int i4222 = zzeuVar422.b;
                            i6 = 0;
                            while (true) {
                                if (a2 != 0) {
                                }
                                if (i6 < i7) {
                                }
                                i6 = i33 + 1;
                                z4 = z5;
                            }
                            j7 = j2;
                            int J222 = zzeuVar422.J();
                            char c722 = 2;
                            char[] cArr22 = {(char) (((J222 >> 10) & 31) + 96), (char) (((J222 >> 5) & 31) + 96), (char) ((J222 & 31) + 96)};
                            i9 = 0;
                            while (i9 < i8) {
                            }
                            str = new String(cArr22);
                            b = c622.b(1937011556);
                            if (b != null) {
                            }
                        }
                    }
                    if (i3 == 0 && i == 0 && b11 == -65536) {
                        b11 = -65536;
                        i40 = b9;
                        i4 = 180;
                    } else {
                        i40 = b9;
                        i4 = 0;
                    }
                    zzeuVar3.E(16);
                    short L1122 = zzeuVar3.L();
                    zzeuVar3.E(2);
                    short L2222 = zzeuVar3.L();
                    int i41222 = i35;
                    if ((((long) b8) * ((long) b11)) - (((long) i40) * ((long) b10)) >= 0) {
                    }
                    if (j != C.TIME_UNSET) {
                    }
                    long j10222 = d(b3.b).c;
                    if (j4 != C.TIME_UNSET) {
                    }
                    zzfz c5222 = c4.c(1835626086);
                    c5222.getClass();
                    zzfz c6222 = c5222.c(1937007212);
                    c6222.getClass();
                    zzga b12222 = c4.b(1835296868);
                    b12222.getClass();
                    zzeu zzeuVar4222 = b12222.b;
                    zzeuVar4222.D(8);
                    a2 = a(zzeuVar4222.b());
                    zzeuVar4222.E(a2 != 0 ? 8 : 16);
                    long N522 = zzeuVar4222.N();
                    int i42222 = zzeuVar4222.b;
                    i6 = 0;
                    while (true) {
                        if (a2 != 0) {
                        }
                        if (i6 < i7) {
                        }
                        i6 = i33 + 1;
                        z4 = z5;
                    }
                    j7 = j2;
                    int J2222 = zzeuVar4222.J();
                    char c7222 = 2;
                    char[] cArr222 = {(char) (((J2222 >> 10) & 31) + 96), (char) (((J2222 >> 5) & 31) + 96), (char) ((J2222 & 31) + 96)};
                    i9 = 0;
                    while (i9 < i8) {
                    }
                    str = new String(cArr222);
                    b = c6222.b(1937011556);
                    if (b != null) {
                    }
                }
                zzgubVar2 = zzgubVar;
                arrayList = arrayList4;
                i10 = i34;
                zzfzVar2 = zzfzVar5;
                zzamwVar = null;
                zzamwVar2 = (zzamw) zzgubVar2.apply(zzamwVar);
                if (zzamwVar2 != null) {
                }
            }
            i34 = i10 + 1;
            zzfzVar4 = zzfzVar;
            arrayList4 = arrayList3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ec, code lost:
    
        r8 = r13;
        r10 = r8;
        r11 = -1;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f1, code lost:
    
        r15 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f3, code lost:
    
        if (r15 >= r7) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f5, code lost:
    
        r18 = r1.b();
        r13 = r1.b();
        r1.E(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0204, code lost:
    
        if (r13 != 1835360622) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0206, code lost:
    
        r8 = r1.l(r18 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0210, code lost:
    
        r9 = r18 - 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0215, code lost:
    
        if (r13 != 1851878757) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0217, code lost:
    
        r10 = r1.l(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021d, code lost:
    
        if (r13 != 1684108385) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x021f, code lost:
    
        r14 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0221, code lost:
    
        if (r13 != 1684108385) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0223, code lost:
    
        r11 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0224, code lost:
    
        r1.E(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0228, code lost:
    
        if (r8 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x022a, code lost:
    
        if (r10 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022e, code lost:
    
        if (r11 != (-1)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0233, code lost:
    
        r1.D(r11);
        r1.E(16);
        r8 = new com.google.android.gms.internal.ads.zzakb(r8, r10, r1.l(r14 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0230, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0302, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzgb.a(r14);
        r9 = new java.lang.StringBuilder(r0.length() + 32);
        r9.append("Skipped unknown metadata entry: ");
        r9.append(r0);
        com.google.android.gms.internal.ads.zzeh.a(r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0249, code lost:
    
        r3 = r14 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x024e, code lost:
    
        if (r3 != 6516084) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0250, code lost:
    
        r8 = r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x025a, code lost:
    
        if (r1.b() != 1684108385) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025c, code lost:
    
        r1.E(8);
        r0 = r1.l(r8 - 16);
        r8 = new com.google.android.gms.internal.ads.zzajt(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0270, code lost:
    
        com.google.android.gms.internal.ads.zzeh.c("Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.zzgb.a(r14)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027f, code lost:
    
        if (r3 == 7233901) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0284, code lost:
    
        if (r3 != 7631467) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028b, code lost:
    
        if (r3 == 6516589) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r1.D(r4);
        r1.E(r0);
        r4 = new java.util.ArrayList();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0290, code lost:
    
        if (r3 != 7828084) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0297, code lost:
    
        if (r3 != 6578553) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0299, code lost:
    
        r8 = defpackage.t6a.P(r14, "TDRC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02a4, code lost:
    
        if (r3 != 4280916) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02a6, code lost:
    
        r8 = defpackage.t6a.P(r14, "TPE1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b1, code lost:
    
        if (r3 != 7630703) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r7 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02b3, code lost:
    
        r8 = defpackage.t6a.P(r14, "TSSE", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02be, code lost:
    
        if (r3 != 6384738) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02c0, code lost:
    
        r8 = defpackage.t6a.P(r14, "TALB", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ca, code lost:
    
        if (r3 != 7108978) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02cc, code lost:
    
        r8 = defpackage.t6a.P(r14, "USLT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d6, code lost:
    
        if (r3 != 6776174) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02d8, code lost:
    
        r8 = defpackage.t6a.P(r14, "TCON", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 >= r6) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e0, code lost:
    
        if (r3 != 6779504) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e2, code lost:
    
        r8 = defpackage.t6a.P(r14, "TIT1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ec, code lost:
    
        if (r3 != 7173742) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02ee, code lost:
    
        r8 = defpackage.t6a.P(r14, "MVNM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f8, code lost:
    
        if (r3 != 7173737) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02fa, code lost:
    
        r8 = defpackage.t6a.Q(r14, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0320, code lost:
    
        r8 = defpackage.t6a.P(r14, "TCOM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r14 = r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0327, code lost:
    
        r8 = defpackage.t6a.P(r14, "TIT2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0095, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x033d, code lost:
    
        r1.D(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0340, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0345, code lost:
    
        if (r4.isEmpty() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r14 >= r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0349, code lost:
    
        r13 = new com.google.android.gms.internal.ads.zzap(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        com.google.android.gms.internal.ads.zzeh.c("Skipped empty metadata entry");
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0330, code lost:
    
        if (r8 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0332, code lost:
    
        r4.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0335, code lost:
    
        r0 = 8;
        r3 = 0;
        r9 = 13;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r7 = r7 + r14;
        r14 = r1.b();
        r11 = r14 >> 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if ((r7 - r1.b) >= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r8 = com.google.android.gms.internal.ads.zzgb.a(r14);
        r11 = new java.lang.StringBuilder(r8.length() + 30);
        r11.append("Skipped empty metadata entry: ");
        r11.append(r8);
        com.google.android.gms.internal.ads.zzeh.c(r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x032d, code lost:
    
        r1.D(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        r10 = r11 & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r10 == 169) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (r10 != 253) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r14 != 1735291493) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzaka.a(defpackage.t6a.R(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r8 = new com.google.android.gms.internal.ads.zzake("TCON", r13, com.google.android.gms.internal.ads.zzgxm.t(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        com.google.android.gms.internal.ads.zzeh.c("Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r14 != 1684632427) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        r8 = defpackage.t6a.S(1684632427, "TPOS", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        if (r14 != 1953655662) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        r8 = defpackage.t6a.S(1953655662, "TRCK", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
    
        if (r14 != 1953329263) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
    
        r8 = defpackage.t6a.Q(1953329263, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        if (r14 != 1668311404) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        r8 = defpackage.t6a.Q(1668311404, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
    
        if (r14 != 1668249202) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        r10 = r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r1.b() != 1684108385) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        r0 = r1.b() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
    
        if (r0 != r9) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        r11 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012b, code lost:
    
        if (r11 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
    
        r11 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 30);
        r11.append("Unrecognized cover art flags: ");
        r11.append(r0);
        com.google.android.gms.internal.ads.zzeh.c(r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        r1.E(4);
        r10 = r10 - 16;
        r0 = new byte[r10];
        r1.F(r3, r10, r0);
        r8 = new com.google.android.gms.internal.ads.zzajp(r11, r13, 3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        if (r0 != 14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0122, code lost:
    
        r11 = "image/png";
        r0 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
    
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015e, code lost:
    
        com.google.android.gms.internal.ads.zzeh.c("Failed to parse cover art attribute");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0168, code lost:
    
        if (r14 != 1631670868) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016a, code lost:
    
        r8 = defpackage.t6a.P(1631670868, "TPE2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0175, code lost:
    
        if (r14 != 1936682605) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0177, code lost:
    
        r8 = defpackage.t6a.P(1936682605, "TSOT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
    
        if (r14 != 1936679276) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0184, code lost:
    
        r8 = defpackage.t6a.P(1936679276, "TSOA", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018f, code lost:
    
        if (r14 != 1936679282) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0191, code lost:
    
        r8 = defpackage.t6a.P(1936679282, "TSOP", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019c, code lost:
    
        if (r14 != 1936679265) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019e, code lost:
    
        r8 = defpackage.t6a.P(1936679265, "TSO2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a9, code lost:
    
        if (r14 != 1936679791) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ab, code lost:
    
        r8 = defpackage.t6a.P(1936679791, "TSOC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b6, code lost:
    
        if (r14 != 1920233063) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r8 = defpackage.t6a.Q(1920233063, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c3, code lost:
    
        if (r14 != 1885823344) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c5, code lost:
    
        r8 = defpackage.t6a.Q(1885823344, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d0, code lost:
    
        if (r14 != 1936683886) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d2, code lost:
    
        r8 = defpackage.t6a.P(1936683886, "TVSHOWSORT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01dd, code lost:
    
        if (r14 != 1953919848) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        r8 = defpackage.t6a.P(1953919848, "TVSHOW", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ea, code lost:
    
        if (r14 != 757935405) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e5  */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzap c(zzga zzgaVar) {
        int i;
        boolean z;
        zzap zzapVar;
        zzap zzapVar2;
        zzap a2;
        ArrayList arrayList;
        zzap zzapVar3;
        zzgc zzgcVar;
        zzao[] zzaoVarArr;
        zzap zzapVar4;
        int i2;
        zzeu zzeuVar = zzgaVar.b;
        int i3 = 8;
        zzeuVar.D(8);
        boolean z2 = false;
        zzap zzapVar5 = new zzap(new zzao[0]);
        while (zzeuVar.B() >= i3) {
            int i4 = zzeuVar.b;
            int b = zzeuVar.b() + i4;
            int b2 = zzeuVar.b();
            int i5 = 13;
            String str = null;
            if (b2 == 1835365473) {
                zzeuVar.D(i4);
                zzeuVar.E(i3);
                f(zzeuVar);
                boolean z3 = z2;
                while (true) {
                    int i6 = zzeuVar.b;
                    if (i6 >= b) {
                        break;
                    }
                    int b3 = zzeuVar.b() + i6;
                    if (zzeuVar.b() == 1768715124) {
                        break;
                    }
                    zzeuVar.D(b3);
                    i3 = 8;
                    z3 = false;
                    i5 = 13;
                    str = null;
                }
                zzap zzapVar6 = null;
                zzapVar5 = zzapVar5.a(zzapVar6);
                i = 8;
            } else if (b2 == 1936553057) {
                zzeuVar.D(i4);
                zzeuVar.E(12);
                while (true) {
                    int i7 = zzeuVar.b;
                    if (i7 >= b) {
                        break;
                    }
                    int b4 = zzeuVar.b();
                    if (zzeuVar.b() != 1935766900) {
                        int i8 = i7 + b4;
                    } else if (b4 >= 16) {
                        zzeuVar.E(4);
                        int i9 = 0;
                        int i10 = -1;
                        for (int i11 = 0; i11 < 2; i11++) {
                            int I = zzeuVar.I();
                            int I2 = zzeuVar.I();
                            if (I == 0) {
                                i10 = I2;
                            } else if (I == 1) {
                                i9 = I2;
                            }
                        }
                        if (i10 == 12) {
                            i2 = 240;
                        } else if (i10 == 13) {
                            i2 = 120;
                        } else if (i10 != 21) {
                            i2 = -2147483647;
                        } else {
                            i = 8;
                            if (zzeuVar.B() >= 8 && zzeuVar.b + 8 <= b) {
                                int b5 = zzeuVar.b();
                                int b6 = zzeuVar.b();
                                if (b5 >= 12 && b6 == 1936877170) {
                                    i2 = zzeuVar.f();
                                    zzapVar4 = i2 != -2147483647 ? new zzap(new zzaki(i2, i9)) : null;
                                }
                            }
                            i2 = -2147483647;
                            if (i2 != -2147483647) {
                            }
                        }
                        i = 8;
                        if (i2 != -2147483647) {
                        }
                    }
                }
                i = 8;
                zzapVar5 = zzapVar5.a(zzapVar4);
            } else {
                i = 8;
                if (b2 == -1451722374) {
                    short L = zzeuVar.L();
                    zzeuVar.E(2);
                    String k = zzeuVar.k(L, StandardCharsets.UTF_8);
                    int max = Math.max(k.lastIndexOf(43), k.lastIndexOf(45));
                    try {
                        try {
                            zzgcVar = new zzgc(Float.parseFloat(k.substring(0, max)), Float.parseFloat(k.substring(max, k.length() - 1)));
                            zzaoVarArr = new zzao[1];
                            z = false;
                        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                            z = false;
                        }
                        try {
                            zzaoVarArr[0] = zzgcVar;
                            zzapVar3 = new zzap(zzaoVarArr);
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            zzapVar3 = null;
                            a2 = zzapVar5.a(zzapVar3);
                            zzapVar5 = a2;
                            zzeuVar.D(b);
                            i3 = i;
                            z2 = z;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z = false;
                    }
                    a2 = zzapVar5.a(zzapVar3);
                } else {
                    z = false;
                    if (b2 == 1667788908) {
                        try {
                            zzeuVar.E(5);
                            int b7 = zzeuVar.b();
                            arrayList = new ArrayList();
                            for (int i12 = 0; i12 < b7; i12++) {
                                long d = zzeuVar.d() / Ua.s;
                                if (d < 0) {
                                    d = C.TIME_UNSET;
                                }
                                String k2 = zzeuVar.k(zzeuVar.I(), StandardCharsets.UTF_8);
                                zzajf zzajfVar = new zzajf();
                                zzajfVar.a = d;
                                zzapVar = null;
                                try {
                                    zzx zzxVar = new zzx(null, k2);
                                    zzajfVar.d = zzxVar;
                                    arrayList.add(new jgn(zzajfVar.a, zzajfVar.b, zzajfVar.c, zzxVar));
                                } catch (IndexOutOfBoundsException unused4) {
                                }
                            }
                            zzapVar = null;
                        } catch (IndexOutOfBoundsException unused5) {
                            zzapVar = null;
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                            a2 = zzapVar5.a(zzapVar2);
                        }
                        zzapVar2 = zzapVar;
                        a2 = zzapVar5.a(zzapVar2);
                    } else {
                        zzeuVar.D(b);
                        i3 = i;
                        z2 = z;
                    }
                }
                zzapVar5 = a2;
                zzeuVar.D(b);
                i3 = i;
                z2 = z;
            }
            z = false;
            zzeuVar.D(b);
            i3 = i;
            z2 = z;
        }
        return zzapVar5;
    }

    public static zzgd d(zzeu zzeuVar) {
        long d;
        long d2;
        zzeuVar.D(8);
        if (a(zzeuVar.b()) == 0) {
            d = zzeuVar.N();
            d2 = zzeuVar.N();
        } else {
            d = zzeuVar.d();
            d2 = zzeuVar.d();
        }
        return new zzgd(d, d2, zzeuVar.N());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r8 = r12.b();
        r10 = r12.b();
        r9 = r9 - 16;
        r11 = new byte[r9];
        r12.F(0, r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r9 = new com.google.android.gms.internal.ads.zzfx(r6, r11, r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        defpackage.x5n.r(r6, "Failed to parse metadata entry with key: ");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzap e(zzfz zzfzVar) {
        zzga b = zzfzVar.b(1751411826);
        zzga b2 = zzfzVar.b(1801812339);
        zzga b3 = zzfzVar.b(1768715124);
        if (b != null && b2 != null && b3 != null) {
            zzeu zzeuVar = b.b;
            zzeuVar.D(16);
            if (zzeuVar.b() == 1835299937) {
                zzeu zzeuVar2 = b2.b;
                zzeuVar2.D(12);
                int b4 = zzeuVar2.b();
                String[] strArr = new String[b4];
                for (int i = 0; i < b4; i++) {
                    int b5 = zzeuVar2.b();
                    zzeuVar2.E(4);
                    strArr[i] = zzeuVar2.k(b5 - 8, StandardCharsets.UTF_8);
                }
                zzeu zzeuVar3 = b3.b;
                zzeuVar3.D(8);
                ArrayList arrayList = new ArrayList();
                while (zzeuVar3.B() > 8) {
                    int b6 = zzeuVar3.b() + zzeuVar3.b;
                    int b7 = zzeuVar3.b() - 1;
                    if (b7 < 0 || b7 >= b4) {
                        x5n.p(b7, "Skipped metadata with unknown key index: ", new StringBuilder(String.valueOf(b7).length() + 41));
                    } else {
                        String str = strArr[b7];
                        while (true) {
                            int i2 = zzeuVar3.b;
                            if (i2 >= b6) {
                                break;
                            }
                            int b8 = zzeuVar3.b();
                            if (zzeuVar3.b() == 1684108385) {
                                break;
                            }
                            zzeuVar3.D(i2 + b8);
                        }
                        zzfx zzfxVar = null;
                        if (zzfxVar != null) {
                            arrayList.add(zzfxVar);
                        }
                    }
                    zzeuVar3.D(b6);
                }
                if (!arrayList.isEmpty()) {
                    return new zzap(arrayList);
                }
            }
        }
        return null;
    }

    public static void f(zzeu zzeuVar) {
        int i = zzeuVar.b;
        zzeuVar.E(4);
        if (zzeuVar.b() != 1751411826) {
            i += 4;
        }
        zzeuVar.D(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x043d  */
    /* JADX WARN: Type inference failed for: r15v15, types: [int[]] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamz g(zzamw zzamwVar, zzfz zzfzVar, zzaha zzahaVar) {
        ygn xl0Var;
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int[] iArr;
        zzamw zzamwVar2;
        long[] jArr;
        int[] iArr2;
        int[] iArr3;
        boolean z5;
        long[] jArr2;
        boolean z6;
        int i4;
        int i5;
        int i6;
        zzamw zzamwVar3;
        int i7;
        int i8;
        long j;
        int i9;
        long[] jArr3;
        int i10;
        int i11;
        long j2;
        long[] jArr4;
        long j3;
        long[] jArr5;
        int i12;
        long j4;
        zzhbh zzhbhVar;
        zzamw zzamwVar4;
        long j5;
        int i13;
        long[] jArr6;
        boolean z7;
        int[] iArr4;
        int[] iArr5;
        int i14;
        ArrayList arrayList;
        int i15;
        int i16;
        int i17;
        boolean z8;
        long j6;
        long j7;
        zzamw zzamwVar5 = zzamwVar;
        zzv zzvVar = zzamwVar5.g;
        zzga b = zzfzVar.b(1937011578);
        if (b != null) {
            xl0Var = new und(b, zzvVar);
        } else {
            zzga b2 = zzfzVar.b(1937013298);
            if (b2 == null) {
                throw zzat.a(null, "Track has no sample table size information");
            }
            xl0Var = new xl0(b2);
        }
        int zza = xl0Var.zza();
        if (zza == 0) {
            return new zzamz(zzamwVar5, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzamwVar5.b == 2) {
            long j8 = zzamwVar5.f;
            if (j8 > 0) {
                zzvVar.getClass();
                zzt zztVar = new zzt(zzvVar);
                float f = zza / (j8 / 1000000.0f);
                zzguk.a(f == -1.0f || f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                zztVar.y = f;
                zzv zzvVar2 = new zzv(zztVar);
                zzamv zzamvVar = new zzamv(zzamwVar5);
                zzamvVar.g = zzvVar2;
                zzamwVar5 = new zzamw(zzamvVar);
            }
        }
        zzga b3 = zzfzVar.b(1937007471);
        if (b3 == null) {
            b3 = zzfzVar.b(1668232756);
            b3.getClass();
            z = true;
        } else {
            z = false;
        }
        zzga b4 = zzfzVar.b(1937011555);
        b4.getClass();
        zzeu zzeuVar = b4.b;
        zzga b5 = zzfzVar.b(1937011827);
        b5.getClass();
        zzeu zzeuVar2 = b5.b;
        zzga b6 = zzfzVar.b(1937011571);
        zzeu zzeuVar3 = b6 != null ? b6.b : null;
        zzga b7 = zzfzVar.b(1668576371);
        zzeu zzeuVar4 = b7 != null ? b7.b : null;
        ul0 ul0Var = new ul0(zzeuVar, b3.b, z);
        zzeuVar2.D(12);
        int h = zzeuVar2.h() - 1;
        int h2 = zzeuVar2.h();
        int h3 = zzeuVar2.h();
        if (zzeuVar4 != null) {
            zzeuVar4.D(12);
            i = zzeuVar4.h();
        } else {
            i = 0;
        }
        if (zzeuVar3 != null) {
            zzeuVar3.D(12);
            i2 = zzeuVar3.h();
            if (i2 > 0) {
                i3 = zzeuVar3.h() - 1;
            } else {
                i3 = -1;
                zzeuVar3 = null;
            }
        } else {
            i2 = 0;
            i3 = -1;
        }
        int zzb = xl0Var.zzb();
        zzv zzvVar3 = zzamwVar5.g;
        if (zzb != -1) {
            String str = zzvVar3.o;
            z2 = true;
            z2 = true;
            z3 = 1;
            z2 = true;
            if ((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && h == 0) {
                if (i == 0 && i2 == 0) {
                    z4 = true;
                    h = 0;
                    ArrayList arrayList2 = new ArrayList();
                    ?? r31 = zzeuVar3 != null ? z3 : 0;
                    if (z4) {
                        long[] jArr7 = new long[zza];
                        iArr = new int[zza];
                        zzeu zzeuVar5 = zzeuVar4;
                        long[] jArr8 = new long[zza];
                        int i18 = i2;
                        ?? r3 = new int[zza];
                        ygn ygnVar = xl0Var;
                        int i19 = h;
                        int i20 = i;
                        int i21 = i3;
                        long j9 = 0;
                        long j10 = 0;
                        long j11 = 0;
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 0;
                        while (true) {
                            if (i22 >= zza) {
                                zzamwVar2 = zzamwVar5;
                                jArr = jArr7;
                                iArr2 = r3;
                                break;
                            }
                            long j12 = j9;
                            boolean z9 = z3;
                            while (true) {
                                if (i25 != 0) {
                                    zzamwVar2 = zzamwVar5;
                                    i12 = i25;
                                    break;
                                }
                                z9 = ul0Var.b();
                                zzamwVar2 = zzamwVar5;
                                if (!z9) {
                                    i12 = 0;
                                    break;
                                }
                                j12 = ul0Var.e;
                                i25 = ul0Var.d;
                                zzamwVar5 = zzamwVar2;
                            }
                            if (!z9) {
                                zzeh.c("Unexpected end of chunk data");
                                long[] copyOf = Arrays.copyOf(jArr7, i22);
                                int[] copyOf2 = Arrays.copyOf(iArr, i22);
                                jArr8 = Arrays.copyOf(jArr8, i22);
                                jArr = copyOf;
                                iArr = copyOf2;
                                zza = i22;
                                iArr2 = Arrays.copyOf((int[]) r3, i22);
                                break;
                            }
                            if (zzeuVar5 != null) {
                                int i27 = i23;
                                int i28 = i20;
                                while (true) {
                                    if (i26 != 0) {
                                        break;
                                    }
                                    if (i28 <= 0) {
                                        i26 = 0;
                                        break;
                                    }
                                    i28--;
                                    i26 = zzeuVar5.h();
                                    i27 = zzeuVar5.b();
                                }
                                i26--;
                                i20 = i28;
                                i23 = i27;
                            }
                            int zzc = ygnVar.zzc();
                            long[] jArr9 = jArr8;
                            int i29 = i12;
                            long j13 = zzc;
                            j11 += j13;
                            if (zzc > i24) {
                                i24 = zzc;
                            }
                            jArr7[i22] = j12;
                            iArr[i22] = zzc;
                            jArr9[i22] = j10 + i23;
                            r3[i22] = r31;
                            if (i22 == i21) {
                                r3[i22] = z3;
                                arrayList2.add(Integer.valueOf(i22));
                            }
                            if (zzeuVar3 != null && i22 == i21 && i18 - 1 > 0) {
                                i21 = zzeuVar3.h() - 1;
                            }
                            j10 += h3;
                            h2--;
                            if (h2 == 0) {
                                if (i19 > 0) {
                                    i19--;
                                    h2 = zzeuVar2.h();
                                    h3 = zzeuVar2.b();
                                } else {
                                    h2 = 0;
                                }
                            }
                            long j14 = j12 + j13;
                            i25 = i29 - 1;
                            i22++;
                            jArr8 = jArr9;
                            zzamwVar5 = zzamwVar2;
                            j9 = j14;
                        }
                        iArr3 = iArr2;
                        long j15 = j10 + i23;
                        if (zzeuVar5 != null) {
                            for (int i30 = i20; i30 > 0; i30--) {
                                if (zzeuVar5.h() != 0) {
                                    z5 = false;
                                    break;
                                }
                                zzeuVar5.b();
                            }
                        }
                        z5 = z3;
                        if (i18 != 0) {
                            jArr2 = jArr8;
                            z6 = z5;
                            i4 = i25;
                            i5 = h2;
                            i6 = i18;
                            zzamwVar3 = zzamwVar2;
                            i7 = i19;
                            i8 = i26;
                        } else if (h2 != 0) {
                            jArr2 = jArr8;
                            z6 = z5;
                            i4 = i25;
                            i5 = h2;
                            zzamwVar3 = zzamwVar2;
                            i7 = i19;
                            i8 = i26;
                            i6 = 0;
                        } else if (i25 == 0) {
                            if (i19 != 0) {
                                jArr2 = jArr8;
                                j = j15;
                                z6 = z5;
                                zzamwVar3 = zzamwVar2;
                                i7 = i19;
                                i8 = i26;
                                i6 = 0;
                                i5 = 0;
                                i4 = 0;
                            } else if (i26 != 0) {
                                jArr2 = jArr8;
                                j = j15;
                                z6 = z5;
                                zzamwVar3 = zzamwVar2;
                                i8 = i26;
                                i6 = 0;
                                i5 = 0;
                                i4 = 0;
                                i7 = 0;
                            } else if (z5) {
                                jArr2 = jArr8;
                                j = j15;
                                i9 = zza;
                                jArr3 = jArr;
                                zzamwVar3 = zzamwVar2;
                                i10 = i9;
                                i11 = i24;
                                j2 = j;
                                jArr4 = jArr3;
                                j3 = j11;
                                jArr5 = jArr2;
                            } else {
                                jArr2 = jArr8;
                                j = j15;
                                zzamwVar3 = zzamwVar2;
                                i6 = 0;
                                i5 = 0;
                                i4 = 0;
                                i7 = 0;
                                i8 = 0;
                                z6 = false;
                            }
                            int i31 = zzamwVar3.a;
                            int length = String.valueOf(i7).length() + String.valueOf(i4).length() + String.valueOf(i5).length() + String.valueOf(i6).length() + String.valueOf(i31).length() + 66 + 35 + 26 + 33 + 36;
                            int length2 = String.valueOf(i8).length();
                            String str2 = z3 == z6 ? ", ctts invalid" : "";
                            i9 = zza;
                            StringBuilder sb = new StringBuilder(str2.length() + length + length2);
                            jArr3 = jArr;
                            me4.r(sb, "Inconsistent stbl box for track ", i31, ": remainingSynchronizationSamples ", i6);
                            me4.r(sb, ", remainingSamplesAtTimestampDelta ", i5, ", remainingSamplesInChunk ", i4);
                            me4.r(sb, ", remainingTimestampDeltaChanges ", i7, ", remainingSamplesAtTimestampOffset ", i8);
                            sb.append(str2);
                            zzeh.c(sb.toString());
                            i10 = i9;
                            i11 = i24;
                            j2 = j;
                            jArr4 = jArr3;
                            j3 = j11;
                            jArr5 = jArr2;
                        } else {
                            jArr2 = jArr8;
                            z6 = z5;
                            i4 = i25;
                            zzamwVar3 = zzamwVar2;
                            i7 = i19;
                            i8 = i26;
                            i6 = 0;
                            i5 = 0;
                        }
                        j = j15;
                        int i312 = zzamwVar3.a;
                        int length3 = String.valueOf(i7).length() + String.valueOf(i4).length() + String.valueOf(i5).length() + String.valueOf(i6).length() + String.valueOf(i312).length() + 66 + 35 + 26 + 33 + 36;
                        int length22 = String.valueOf(i8).length();
                        if (z3 == z6) {
                        }
                        i9 = zza;
                        StringBuilder sb2 = new StringBuilder(str2.length() + length3 + length22);
                        jArr3 = jArr;
                        me4.r(sb2, "Inconsistent stbl box for track ", i312, ": remainingSynchronizationSamples ", i6);
                        me4.r(sb2, ", remainingSamplesAtTimestampDelta ", i5, ", remainingSamplesInChunk ", i4);
                        me4.r(sb2, ", remainingTimestampDeltaChanges ", i7, ", remainingSamplesAtTimestampOffset ", i8);
                        sb2.append(str2);
                        zzeh.c(sb2.toString());
                        i10 = i9;
                        i11 = i24;
                        j2 = j;
                        jArr4 = jArr3;
                        j3 = j11;
                        jArr5 = jArr2;
                    } else {
                        int i32 = ul0Var.b;
                        long[] jArr10 = new long[i32];
                        int[] iArr6 = new int[i32];
                        while (ul0Var.b()) {
                            int i33 = ul0Var.c;
                            jArr10[i33] = ul0Var.e;
                            iArr6[i33] = ul0Var.d;
                        }
                        long j16 = h3;
                        int i34 = 8192 / zzb;
                        int i35 = 0;
                        for (int i36 = 0; i36 < i32; i36++) {
                            int i37 = iArr6[i36];
                            String str3 = zzfm.a;
                            i35 += ((i37 + i34) - 1) / i34;
                        }
                        long[] jArr11 = new long[i35];
                        iArr = new int[i35];
                        jArr5 = new long[i35];
                        ?? r15 = new int[i35];
                        int i38 = 0;
                        int i39 = 0;
                        int i40 = 0;
                        int i41 = 0;
                        int i42 = 0;
                        while (i38 < i32) {
                            int i43 = iArr6[i38];
                            long j17 = jArr10[i38];
                            int i44 = i32;
                            int i45 = i43;
                            while (i45 > 0) {
                                int min = Math.min(i34, i45);
                                jArr11[i42] = j17;
                                int i46 = i45;
                                int i47 = zzb * min;
                                iArr[i42] = i47;
                                int i48 = i40 + i47;
                                int max = Math.max(i41, i47);
                                jArr5[i42] = i39 * j16;
                                r15[i42] = z3;
                                j17 += iArr[i42];
                                i39 += min;
                                i42++;
                                i41 = max;
                                i45 = i46 - min;
                                i40 = i48;
                            }
                            i38++;
                            i32 = i44;
                        }
                        j3 = i40;
                        zzamwVar3 = zzamwVar5;
                        j2 = i39 * j16;
                        i11 = i41;
                        jArr4 = jArr11;
                        i10 = i35;
                        iArr3 = r15;
                    }
                    int[] iArr7 = iArr;
                    int[] iArr8 = iArr3;
                    j4 = zzamwVar3.f;
                    if (j4 > 0) {
                        long w = zzfm.w(j3 * 8, 1000000L, j4, RoundingMode.HALF_DOWN);
                        if (w > 0 && w < 2147483647L) {
                            zzvVar3.getClass();
                            zzt zztVar2 = new zzt(zzvVar3);
                            zztVar2.h = (int) w;
                            zzv zzvVar4 = new zzv(zztVar2);
                            zzamv zzamvVar2 = new zzamv(zzamwVar3);
                            zzamvVar2.g = zzvVar4;
                            zzamwVar3 = new zzamw(zzamvVar2);
                        }
                    }
                    zzamw zzamwVar6 = zzamwVar3;
                    int i49 = zzamwVar6.b;
                    zzv zzvVar5 = zzamwVar6.g;
                    zzhbh zzhbhVar2 = zzamwVar6.j;
                    long j18 = zzamwVar6.c;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    long w2 = zzfm.w(j2, 1000000L, j18, roundingMode);
                    int[] d = zzhbj.d(arrayList2);
                    zzhbhVar = zzamwVar6.i;
                    if (zzhbhVar != null) {
                        zzfm.x(jArr5, j18);
                        return new zzamz(zzamwVar6, jArr4, iArr7, i11, jArr5, iArr8, d, r31, w2, i10);
                    }
                    int i50 = zzhbhVar.b;
                    if (i50 == 1 && i49 == 1) {
                        int length4 = jArr5.length;
                        if (length4 >= 2) {
                            zzhbhVar2.getClass();
                            long a2 = zzhbhVar2.a(0);
                            long a3 = zzhbhVar.a(0);
                            long j19 = zzamwVar6.d;
                            long w3 = a2 + zzfm.w(a3, j18, j19, roundingMode);
                            int i51 = length4 - 1;
                            zzamwVar4 = zzamwVar6;
                            j5 = j2;
                            int max2 = Math.max(0, Math.min(4, i51));
                            int max3 = Math.max(0, Math.min(length4 - 4, i51));
                            if (jArr5[0] > a2 || a2 >= jArr5[max2] || jArr5[max3] >= w3 || w3 > j5 + 2) {
                                j18 = j18;
                            } else {
                                long max4 = Math.max(0L, j5 - w3);
                                long j20 = a2 - jArr5[0];
                                long j21 = zzvVar5.J;
                                long w4 = zzfm.w(j20, j21, j18, roundingMode);
                                long w5 = zzfm.w(max4, j21, j18, roundingMode);
                                j18 = j18;
                                if (w4 != 0) {
                                    j6 = j19;
                                    j7 = w4;
                                } else if (w5 != 0) {
                                    j6 = j19;
                                    j7 = 0;
                                }
                                if (j7 <= 2147483647L && w5 <= 2147483647L) {
                                    zzahaVar.a = (int) j7;
                                    zzahaVar.b = (int) w5;
                                    zzfm.x(jArr5, j18);
                                    return new zzamz(zzamwVar4, jArr4, iArr7, i11, jArr5, iArr8, d, r31, zzfm.w(zzhbhVar.a(0), 1000000L, j6, roundingMode), i10);
                                }
                            }
                        } else {
                            zzamwVar4 = zzamwVar6;
                            j5 = j2;
                        }
                        i13 = 1;
                    } else {
                        zzamwVar4 = zzamwVar6;
                        j5 = j2;
                        i13 = 1;
                    }
                    if (i50 == i13 && zzhbhVar.a(0) == 0) {
                        zzhbhVar2.getClass();
                        long a4 = zzhbhVar2.a(0);
                        for (int i52 = 0; i52 < jArr5.length; i52++) {
                            jArr5[i52] = zzfm.w(jArr5[i52] - a4, 1000000L, j18, RoundingMode.DOWN);
                        }
                        return new zzamz(zzamwVar4, jArr4, iArr7, i11, jArr5, iArr8, d, r31, zzfm.w(j5 - a4, 1000000L, j18, RoundingMode.DOWN), i10);
                    }
                    long j22 = j18;
                    zzamw zzamwVar7 = zzamwVar4;
                    long[] jArr12 = jArr4;
                    int[] iArr9 = iArr7;
                    int i53 = i10;
                    boolean z10 = i49 == 1;
                    int[] iArr10 = new int[i50];
                    int[] iArr11 = new int[i50];
                    zzhbhVar2.getClass();
                    boolean z11 = z10;
                    int i54 = 0;
                    int i55 = 0;
                    int i56 = 0;
                    boolean z12 = false;
                    while (i55 < i50) {
                        int[] iArr12 = iArr9;
                        int[] iArr13 = iArr10;
                        long a5 = zzhbhVar2.a(i55);
                        if (a5 != -1) {
                            iArr5 = iArr11;
                            i14 = i55;
                            long j23 = j22;
                            j22 = j23;
                            long w6 = zzfm.w(zzhbhVar.a(i55), j23, zzamwVar7.d, RoundingMode.DOWN) + a5;
                            arrayList = arrayList2;
                            iArr13[i14] = zzfm.s(jArr5, a5, true);
                            int binarySearch = Arrays.binarySearch(jArr5, w6);
                            if (binarySearch < 0) {
                                binarySearch = ~binarySearch;
                            } else {
                                while (true) {
                                    i15 = binarySearch + 1;
                                    if (i15 >= jArr5.length || jArr5[i15] != w6) {
                                        break;
                                    }
                                    binarySearch = i15;
                                }
                                if (!z11) {
                                    binarySearch = i15;
                                }
                            }
                            int i57 = binarySearch - 1;
                            int i58 = 0;
                            while (true) {
                                i16 = i57;
                                if (binarySearch >= jArr5.length) {
                                    break;
                                }
                                if (jArr5[binarySearch] < w6) {
                                    i57 = binarySearch;
                                } else {
                                    i58++;
                                    if (i58 > zzvVar5.q) {
                                        break;
                                    }
                                    i57 = i16;
                                }
                                binarySearch++;
                            }
                            iArr5[i14] = i16 + 1;
                            int i59 = iArr13[i14];
                            while (true) {
                                i17 = iArr13[i14];
                                if (i17 <= 0 || (iArr8[i17] & 1) != 0) {
                                    break;
                                }
                                iArr13[i14] = i17 - 1;
                            }
                            if (i17 == 0) {
                                z8 = false;
                                if ((iArr8[0] & 1) == 0) {
                                    iArr13[i14] = i59;
                                    while (true) {
                                        i17 = iArr13[i14];
                                        if (i17 >= iArr5[i14] || (iArr8[i17] & 1) != 0) {
                                            break;
                                        }
                                        iArr13[i14] = i17 + 1;
                                    }
                                }
                            } else {
                                z8 = false;
                            }
                            int i60 = iArr5[i14];
                            int i61 = (i60 - i17) + i56;
                            z12 |= i54 != i17 ? true : z8;
                            i54 = i60;
                            i56 = i61;
                        } else {
                            iArr5 = iArr11;
                            i14 = i55;
                            arrayList = arrayList2;
                        }
                        i55 = i14 + 1;
                        arrayList2 = arrayList;
                        iArr10 = iArr13;
                        iArr11 = iArr5;
                        iArr9 = iArr12;
                    }
                    int[] iArr14 = iArr9;
                    int[] iArr15 = iArr10;
                    int[] iArr16 = iArr11;
                    ArrayList arrayList3 = arrayList2;
                    boolean z13 = z12 | (i56 != i53);
                    long[] jArr13 = z13 ? new long[i56] : jArr12;
                    int[] iArr17 = z13 ? new int[i56] : iArr14;
                    if (true == z13) {
                        i11 = 0;
                    }
                    int[] iArr18 = z13 ? new int[i56] : iArr8;
                    ArrayList arrayList4 = z13 ? new ArrayList() : arrayList3;
                    long[] jArr14 = new long[i56];
                    int i62 = 0;
                    int i63 = 0;
                    boolean z14 = false;
                    long j24 = 0;
                    while (i63 < i50) {
                        long a6 = zzhbhVar2.a(i63);
                        int i64 = i50;
                        int i65 = iArr15[i63];
                        long[] jArr15 = jArr14;
                        int i66 = iArr16[i63];
                        if (z13) {
                            z7 = z14;
                            int i67 = i66 - i65;
                            System.arraycopy(jArr12, i65, jArr13, i62, i67);
                            jArr6 = jArr12;
                            iArr4 = iArr14;
                            System.arraycopy(iArr4, i65, iArr17, i62, i67);
                            System.arraycopy(iArr8, i65, iArr18, i62, i67);
                        } else {
                            jArr6 = jArr12;
                            z7 = z14;
                            iArr4 = iArr14;
                        }
                        z14 = z7;
                        int i68 = i62;
                        int i69 = i11;
                        while (i65 < i66) {
                            int i70 = i65;
                            int[] iArr19 = iArr18;
                            long j25 = zzamwVar7.d;
                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                            long w7 = zzfm.w(j24, 1000000L, j25, roundingMode2);
                            long w8 = zzfm.w(jArr5[i70] - a6, 1000000L, j22, roundingMode2);
                            z14 = (!(w8 >= 0)) | z14;
                            jArr15[i68] = w7 + w8;
                            if (z13 && iArr17[i68] > i69) {
                                i69 = iArr4[i70];
                            }
                            if (z13 && r31 == 0 && (iArr19[i68] & 1) != 0) {
                                arrayList4.add(Integer.valueOf(i68));
                            }
                            i68++;
                            i65 = i70 + 1;
                            iArr18 = iArr19;
                        }
                        j24 = zzhbhVar.a(i63) + j24;
                        i63++;
                        i11 = i69;
                        iArr14 = iArr4;
                        i50 = i64;
                        jArr12 = jArr6;
                        jArr14 = jArr15;
                        iArr18 = iArr18;
                        i62 = i68;
                    }
                    int[] iArr20 = iArr18;
                    long[] jArr16 = jArr14;
                    boolean z15 = z14;
                    long w9 = zzfm.w(j24, 1000000L, zzamwVar7.d, RoundingMode.DOWN);
                    if (z15) {
                        zzvVar5.getClass();
                        zzt zztVar3 = new zzt(zzvVar5);
                        zztVar3.t = true;
                        zzv zzvVar6 = new zzv(zztVar3);
                        zzamv zzamvVar3 = new zzamv(zzamwVar7);
                        zzamvVar3.g = zzvVar6;
                        zzamwVar7 = new zzamw(zzamvVar3);
                    }
                    return new zzamz(zzamwVar7, jArr13, iArr17, i11, jArr16, iArr20, zzhbj.d(arrayList4), r31, w9, jArr13.length);
                }
                h = 0;
            }
        } else {
            z2 = true;
        }
        z4 = false;
        z3 = z2;
        ArrayList arrayList22 = new ArrayList();
        if (zzeuVar3 != null) {
        }
        if (z4) {
        }
        int[] iArr72 = iArr;
        int[] iArr82 = iArr3;
        j4 = zzamwVar3.f;
        if (j4 > 0) {
        }
        zzamw zzamwVar62 = zzamwVar3;
        int i492 = zzamwVar62.b;
        zzv zzvVar52 = zzamwVar62.g;
        zzhbh zzhbhVar22 = zzamwVar62.j;
        long j182 = zzamwVar62.c;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        long w22 = zzfm.w(j2, 1000000L, j182, roundingMode3);
        int[] d2 = zzhbj.d(arrayList22);
        zzhbhVar = zzamwVar62.i;
        if (zzhbhVar != null) {
        }
    }

    public static Pair h(zzfz zzfzVar) {
        zzga b = zzfzVar.b(1701606260);
        if (b == null) {
            return null;
        }
        zzeu zzeuVar = b.b;
        zzeuVar.D(8);
        int a2 = a(zzeuVar.b());
        int h = zzeuVar.h();
        zzhbg zzhbgVar = new zzhbg();
        zzhbgVar.b = 0;
        zzhbgVar.a = new long[h];
        zzhbg zzhbgVar2 = new zzhbg();
        zzhbgVar2.b = 0;
        zzhbgVar2.a = new long[h];
        for (int i = 0; i < h; i++) {
            zzhbgVar.a(a2 == 1 ? zzeuVar.j() : zzeuVar.N());
            zzhbgVar2.a(a2 == 1 ? zzeuVar.d() : zzeuVar.b());
            if (zzeuVar.L() != 1) {
                a70.p("Unsupported media rate.");
                return null;
            }
            zzeuVar.E(2);
        }
        int i2 = zzhbgVar.b;
        zzhbh zzhbhVar = zzhbh.c;
        zzhbh zzhbhVar2 = i2 == 0 ? zzhbhVar : new zzhbh(zzhbgVar.a, i2);
        int i3 = zzhbgVar2.b;
        if (i3 != 0) {
            zzhbhVar = new zzhbh(zzhbgVar2.a, i3);
        }
        return Pair.create(zzhbhVar2, zzhbhVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:331:0x061a, code lost:
    
        if (r4 == 2) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x06cd, code lost:
    
        if (r3.g() != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x015b, code lost:
    
        if (r12 == (-1)) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:222:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0878 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x07e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(zzeu zzeuVar, int i, int i2, int i3, int i4, String str, boolean z, zzq zzqVar, j12 j12Var, int i5) {
        int i6;
        int i7;
        int b;
        int i8;
        int i9;
        int i10;
        String str2;
        String str3;
        int i11;
        String str4;
        zzeu zzeuVar2;
        String str5;
        int i12;
        List list;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str6;
        s sVar;
        String str7;
        vl0 vl0Var;
        int i18;
        int i19;
        String str8;
        int i20;
        int i21;
        int i22;
        int i23;
        int h;
        int i24;
        boolean z2;
        boolean z3;
        int h2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str9;
        zzeu zzeuVar3 = zzeuVar;
        int i30 = i;
        int i31 = i3;
        zzq zzqVar2 = zzqVar;
        zzeuVar3.D(i2 + 16);
        if (z) {
            i6 = zzeuVar3.J();
            zzeuVar3.E(6);
        } else {
            zzeuVar3.E(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            i7 = 2;
            int J = zzeuVar3.J();
            zzeuVar3.E(6);
            int f = zzeuVar3.f();
            zzeuVar3.D(zzeuVar3.b - 4);
            b = zzeuVar3.b();
            if (i6 == 1) {
                zzeuVar3.E(16);
            }
            i8 = f;
            i9 = J;
            i10 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            zzeuVar3.E(16);
            i7 = 2;
            i8 = (int) Math.round(Double.longBitsToDouble(zzeuVar3.d()));
            i9 = zzeuVar3.h();
            zzeuVar3.E(4);
            int h3 = zzeuVar3.h();
            int h4 = zzeuVar3.h();
            int i32 = h4 & 1;
            int i33 = h4 & 2;
            i10 = i32 != 0 ? zzfm.c(h3, i33 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN) : zzfm.b(h3, i33 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            if (i10 == 0) {
                i10 = -1;
            }
            zzeuVar3.E(8);
            b = 0;
        }
        if (i30 == 1767992678) {
            i8 = -1;
            i9 = -1;
        } else {
            if (i30 == 1935764850) {
                i8 = 8000;
            } else if (i30 == 1935767394) {
                i8 = 16000;
                i30 = 1935767394;
            }
            i9 = 1;
        }
        int i34 = zzeuVar3.b;
        int i35 = 1701733217;
        if (i30 == 1701733217) {
            Pair k = k(zzeuVar3, i2, i31);
            if (k != null) {
                i35 = ((Integer) k.first).intValue();
                zzqVar2 = zzqVar2 == null ? null : zzqVar2.a(((zzamx) k.second).b);
                ((zzamx[]) j12Var.d)[i5] = (zzamx) k.second;
            }
            i30 = i35;
            zzeuVar3.D(i34);
        }
        String str10 = "audio/mhm1";
        String str11 = MimeTypes.AUDIO_AC3;
        if (i30 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i30 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i30 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i30 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i30 == 1685353320 || i30 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (i30 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (i30 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i30 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (i30 == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else {
            if (i30 != 1936684916) {
                if (i30 == 1953984371) {
                    i10 = 268435456;
                } else if (i30 != 1819304813) {
                    if (i30 == 778924082 || i30 == 778924083) {
                        str2 = MimeTypes.AUDIO_MPEG;
                    } else if (i30 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i30 == 1835560241) {
                        str2 = "audio/mhm1";
                    } else if (i30 == 1634492771) {
                        str2 = MimeTypes.AUDIO_ALAC;
                    } else if (i30 == 1634492791) {
                        str2 = MimeTypes.AUDIO_ALAW;
                    } else if (i30 == 1970037111) {
                        str2 = MimeTypes.AUDIO_MLAW;
                    } else if (i30 == 1332770163) {
                        str2 = MimeTypes.AUDIO_OPUS;
                    } else if (i30 == 1716281667) {
                        str2 = MimeTypes.AUDIO_FLAC;
                    } else if (i30 == 1835823201) {
                        str2 = MimeTypes.AUDIO_TRUEHD;
                    } else if (i30 == 1767992678) {
                        str2 = "audio/iamf";
                        i30 = 1767992678;
                    } else {
                        str2 = null;
                    }
                }
                str2 = MimeTypes.AUDIO_RAW;
            }
            i10 = i7;
            str2 = MimeTypes.AUDIO_RAW;
        }
        int i36 = i8;
        int i37 = i10;
        List list2 = null;
        String str12 = null;
        vl0 vl0Var2 = null;
        h12 h12Var = null;
        while (i34 - i2 < i31) {
            zzeuVar3.D(i34);
            int b2 = zzeuVar3.b();
            int i38 = i9;
            zzagl.a("childAtomSize must be positive", b2 > 0);
            int b3 = zzeuVar3.b();
            if (b3 == 1835557187) {
                zzeuVar3.D(i34 + 8);
                zzeuVar3.E(1);
                int I = zzeuVar3.I();
                zzeuVar3.E(1);
                String format = Objects.equals(str2, str10) ? String.format("mhm1.%02X", Integer.valueOf(I)) : String.format("mha1.%02X", Integer.valueOf(I));
                int J2 = zzeuVar3.J();
                byte[] bArr = new byte[J2];
                str12 = format;
                zzeuVar3.F(0, J2, bArr);
                if (list2 == null) {
                    list2 = zzgxm.t(bArr);
                    i9 = i38;
                    i17 = i30;
                    str5 = str11;
                    str6 = str2;
                    str3 = str10;
                    i12 = b2;
                    i13 = i34;
                    zzeuVar2 = zzeuVar3;
                    i34 = i13 + i12;
                    i31 = i3;
                    zzeuVar3 = zzeuVar2;
                    str10 = str3;
                    str11 = str5;
                    str2 = str6;
                    i30 = i17;
                    i7 = 2;
                } else {
                    list2 = zzgxm.u(bArr, (byte[]) list2.get(0));
                    i9 = i38;
                    i17 = i30;
                    str5 = str11;
                    str6 = str2;
                    str3 = str10;
                    i12 = b2;
                    i13 = i34;
                }
            } else {
                if (b3 == 1835557200) {
                    zzeuVar3.D(i34 + 8);
                    int I2 = zzeuVar3.I();
                    if (I2 > 0) {
                        byte[] bArr2 = new byte[I2];
                        zzeuVar3.F(0, I2, bArr2);
                        if (list2 == null) {
                            list2 = zzgxm.t(bArr2);
                            i17 = i30;
                            str5 = str11;
                            str6 = str2;
                            str3 = str10;
                            i12 = b2;
                            i13 = i34;
                            i9 = i38;
                        } else {
                            list2 = zzgxm.u((byte[]) list2.get(0), bArr2);
                            i9 = i38;
                            i17 = i30;
                            str5 = str11;
                            str6 = str2;
                            str3 = str10;
                            i12 = b2;
                            i13 = i34;
                        }
                    } else {
                        i9 = i38;
                        i17 = i30;
                        str5 = str11;
                        str4 = str2;
                        str3 = str10;
                        i12 = b2;
                        list = list2;
                        i13 = i34;
                        i14 = i36;
                        zzeuVar2 = zzeuVar3;
                        str6 = str4;
                        i36 = i14;
                        list2 = list;
                    }
                } else {
                    str3 = str10;
                    if (b3 == 1702061171) {
                        String str13 = str2;
                        i11 = i30;
                        str4 = str13;
                        i9 = i38;
                        zzeuVar2 = zzeuVar3;
                        str5 = str11;
                        i12 = b2;
                        list = list2;
                        i13 = i34;
                        i14 = i36;
                        i15 = i13;
                        i16 = -1;
                    } else if (z && b3 == 2002876005) {
                        int i39 = zzeuVar3.b;
                        zzagl.a(null, i39 >= i34);
                        while (true) {
                            if (i39 - i34 < b2) {
                                zzeuVar3.D(i39);
                                int b4 = zzeuVar3.b();
                                zzagl.a("childAtomSize must be positive", b4 > 0);
                                int i40 = i39;
                                if (zzeuVar3.b() != 1702061171) {
                                    i39 = i40 + b4;
                                } else {
                                    String str14 = str2;
                                    i11 = i30;
                                    str4 = str14;
                                    i9 = i38;
                                    zzeuVar2 = zzeuVar3;
                                    str5 = str11;
                                    i12 = b2;
                                    list = list2;
                                    i13 = i34;
                                    i14 = i36;
                                    i15 = i40;
                                }
                            } else {
                                String str15 = str2;
                                i11 = i30;
                                str4 = str15;
                                i9 = i38;
                                zzeuVar2 = zzeuVar3;
                                str5 = str11;
                                i12 = b2;
                                list = list2;
                                i13 = i34;
                                i14 = i36;
                                i15 = -1;
                            }
                        }
                        i16 = -1;
                    } else if (b3 == 1651798644) {
                        zzeuVar3.D(i34 + 8);
                        zzeuVar3.E(4);
                        i12 = b2;
                        i17 = i30;
                        str5 = str11;
                        str6 = str2;
                        h12Var = new h12(zzeuVar3.N(), zzeuVar3.N());
                        list2 = list2;
                        i13 = i34;
                        i9 = i38;
                    } else {
                        i12 = b2;
                        List list3 = list2;
                        int[] iArr = zzafh.d;
                        int[] iArr2 = zzafh.b;
                        if (b3 == 1684103987) {
                            zzeuVar3.D(i34 + 8);
                            String num = Integer.toString(i4);
                            zzet zzetVar = new zzet();
                            zzetVar.a(zzeuVar3);
                            int i41 = iArr2[zzetVar.h(i7)];
                            zzetVar.f(8);
                            int i42 = iArr[zzetVar.h(3)];
                            if (zzetVar.h(1) != 0) {
                                i42++;
                            }
                            int i43 = zzafh.e[zzetVar.h(5)] * 1000;
                            zzetVar.k();
                            zzeuVar3.D(zzetVar.c());
                            zzt zztVar = new zzt();
                            zztVar.a = num;
                            zztVar.d(str11);
                            zztVar.G = i42;
                            zztVar.I = i41;
                            zztVar.r = zzqVar2;
                            zztVar.d = str;
                            zztVar.h = i43;
                            zztVar.i = i43;
                            j12Var.e = new zzv(zztVar);
                            zzeuVar2 = zzeuVar3;
                            i17 = i30;
                            str5 = str11;
                            str4 = str2;
                            list = list3;
                            i13 = i34;
                            i14 = i36;
                            i9 = i38;
                        } else if (b3 == 1684366131) {
                            zzeuVar3.D(i34 + 8);
                            String num2 = Integer.toString(i4);
                            zzet zzetVar2 = new zzet();
                            zzetVar2.a(zzeuVar3);
                            int h5 = zzetVar2.h(13) * 1000;
                            str5 = str11;
                            zzetVar2.f(3);
                            int i44 = iArr2[zzetVar2.h(2)];
                            zzetVar2.f(10);
                            int i45 = iArr[zzetVar2.h(3)];
                            if (zzetVar2.h(1) != 0) {
                                i45++;
                            }
                            zzetVar2.f(3);
                            int h6 = zzetVar2.h(4);
                            zzetVar2.f(1);
                            int i46 = i45;
                            if (h6 > 0) {
                                zzetVar2.f(6);
                                i45 = zzetVar2.h(1) != 0 ? i46 + 2 : i46;
                                zzetVar2.f(1);
                            }
                            list = list3;
                            if (zzetVar2.b() > 7) {
                                zzetVar2.f(7);
                                if (zzetVar2.h(1) != 0) {
                                    str9 = MimeTypes.AUDIO_E_AC3_JOC;
                                    zzetVar2.k();
                                    zzeuVar3.D(zzetVar2.c());
                                    zzt zztVar2 = new zzt();
                                    zztVar2.a = num2;
                                    zztVar2.d(str9);
                                    zztVar2.G = i45;
                                    zztVar2.I = i44;
                                    zztVar2.r = zzqVar2;
                                    zztVar2.d = str;
                                    zztVar2.i = h5;
                                    j12Var.e = new zzv(zztVar2);
                                    i9 = i38;
                                    zzeuVar2 = zzeuVar3;
                                    i17 = i30;
                                    str4 = str2;
                                    i13 = i34;
                                    i14 = i36;
                                }
                            }
                            str9 = MimeTypes.AUDIO_E_AC3;
                            zzetVar2.k();
                            zzeuVar3.D(zzetVar2.c());
                            zzt zztVar22 = new zzt();
                            zztVar22.a = num2;
                            zztVar22.d(str9);
                            zztVar22.G = i45;
                            zztVar22.I = i44;
                            zztVar22.r = zzqVar2;
                            zztVar22.d = str;
                            zztVar22.i = h5;
                            j12Var.e = new zzv(zztVar22);
                            i9 = i38;
                            zzeuVar2 = zzeuVar3;
                            i17 = i30;
                            str4 = str2;
                            i13 = i34;
                            i14 = i36;
                        } else {
                            str5 = str11;
                            list = list3;
                            if (b3 == 1684103988) {
                                zzeuVar3.D(i34 + 8);
                                String num3 = Integer.toString(i4);
                                zzet zzetVar3 = new zzet();
                                zzetVar3.a(zzeuVar3);
                                int b5 = zzetVar3.b();
                                int h7 = zzetVar3.h(3);
                                if (h7 > 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(h7).length() + 30);
                                    sb.append("Unsupported AC-4 DSI version: ");
                                    sb.append(h7);
                                    throw zzat.b(sb.toString());
                                }
                                int h8 = zzetVar3.h(7);
                                int i47 = true != zzetVar3.g() ? 44100 : 48000;
                                zzetVar3.f(4);
                                int h9 = zzetVar3.h(9);
                                if (h8 > 1) {
                                    if (h7 == 0) {
                                        throw zzat.b("Invalid AC-4 DSI version: 0");
                                    }
                                    if (zzetVar3.g()) {
                                        zzetVar3.f(16);
                                        if (zzetVar3.g()) {
                                            zzetVar3.f(128);
                                        }
                                    }
                                }
                                if (h7 == 1) {
                                    i19 = h8;
                                    if (zzetVar3.b() < 66) {
                                        throw zzat.b("Invalid AC-4 DSI bitrate.");
                                    }
                                    zzetVar3.f(66);
                                    zzetVar3.k();
                                } else {
                                    i19 = h8;
                                }
                                j9 j9Var = new j9();
                                j9Var.a = true;
                                j9Var.b = -1;
                                j9Var.c = -1;
                                j9Var.d = true;
                                i13 = i34;
                                j9Var.e = 2;
                                j9Var.f = 1;
                                j9Var.g = 0;
                                int i48 = 0;
                                while (i48 < h9) {
                                    if (h7 == 0) {
                                        boolean g = zzetVar3.g();
                                        i17 = i30;
                                        str8 = str2;
                                        h = zzetVar3.h(5);
                                        i24 = 0;
                                        z2 = false;
                                        z3 = g;
                                        h2 = zzetVar3.h(5);
                                        i25 = 0;
                                    } else {
                                        int i49 = h9;
                                        h2 = zzetVar3.h(8);
                                        str8 = str2;
                                        int h10 = zzetVar3.h(8);
                                        i17 = i30;
                                        int h11 = h10 == 255 ? zzetVar3.h(16) + 255 : h10;
                                        if (h2 > 2) {
                                            zzetVar3.f(h11 * 8);
                                            i48++;
                                            h9 = i49;
                                            str2 = str8;
                                            i30 = i17;
                                        } else {
                                            int b6 = (b5 - zzetVar3.b()) / 8;
                                            int i50 = h11;
                                            int h12 = zzetVar3.h(5);
                                            z2 = h12 == 31;
                                            i25 = b6;
                                            z3 = false;
                                            h = h12;
                                            i24 = i50;
                                        }
                                    }
                                    j9Var.f = h2;
                                    boolean z4 = z2;
                                    if (z3 || z4 || h != 6) {
                                        j9Var.g = zzetVar3.h(3);
                                        if (zzetVar3.g()) {
                                            zzetVar3.f(5);
                                        }
                                        zzetVar3.f(2);
                                        if (h7 == 1) {
                                            if (h2 != 1) {
                                                if (h2 == 2) {
                                                    h2 = 2;
                                                }
                                            }
                                            zzetVar3.f(2);
                                        }
                                        zzetVar3.f(5);
                                        zzetVar3.f(10);
                                        if (h7 == 1) {
                                            if (h2 > 0) {
                                                j9Var.a = zzetVar3.g();
                                            }
                                            if (j9Var.a) {
                                                if (h2 == 1) {
                                                    i29 = 1;
                                                } else if (h2 == 2) {
                                                    i29 = 2;
                                                } else {
                                                    i27 = h2;
                                                    zzetVar3.f(24);
                                                    i26 = 1;
                                                }
                                                int h13 = zzetVar3.h(5);
                                                if (h13 >= 0 && h13 <= 15) {
                                                    j9Var.b = h13;
                                                }
                                                if (h13 >= 11 && h13 <= 14) {
                                                    j9Var.d = zzetVar3.g();
                                                    j9Var.e = zzetVar3.h(2);
                                                }
                                                i27 = i29;
                                                zzetVar3.f(24);
                                                i26 = 1;
                                            } else {
                                                i26 = 1;
                                                i27 = h2;
                                            }
                                            int i51 = h2 != i26 ? 2 : 2;
                                            if (zzetVar3.g() && zzetVar3.g()) {
                                                zzetVar3.f(i51);
                                            }
                                            if (zzetVar3.g()) {
                                                zzetVar3.e();
                                                int i52 = 8;
                                                int h14 = zzetVar3.h(8);
                                                i28 = i27;
                                                int i53 = 0;
                                                while (i53 < h14) {
                                                    zzetVar3.f(i52);
                                                    i53++;
                                                    i52 = 8;
                                                }
                                                h2 = i28;
                                            }
                                            i28 = i27;
                                            h2 = i28;
                                        }
                                        if (!z3 && !z4) {
                                            zzetVar3.e();
                                            if (h == 0 || h == 1 || h == 2) {
                                                if (h2 == 0) {
                                                    for (int i54 = 0; i54 < 2; i54++) {
                                                        zzafk.c(zzetVar3, j9Var);
                                                    }
                                                    h2 = 0;
                                                    zzetVar3.e();
                                                } else {
                                                    for (int i55 = 0; i55 < 2; i55++) {
                                                        zzafk.d(zzetVar3, j9Var);
                                                    }
                                                    zzetVar3.e();
                                                }
                                            } else if (h != 3 && h != 4) {
                                                if (h != 5) {
                                                    int h15 = zzetVar3.h(7);
                                                    for (int i56 = 0; i56 < h15; i56++) {
                                                        zzetVar3.f(8);
                                                    }
                                                } else if (h2 == 0) {
                                                    zzafk.c(zzetVar3, j9Var);
                                                    h2 = 0;
                                                } else {
                                                    int h16 = zzetVar3.h(3);
                                                    for (int i57 = 0; i57 < h16 + 2; i57++) {
                                                        zzafk.d(zzetVar3, j9Var);
                                                    }
                                                }
                                                zzetVar3.e();
                                            } else if (h2 == 0) {
                                                for (int i58 = 0; i58 < 3; i58++) {
                                                    zzafk.c(zzetVar3, j9Var);
                                                }
                                                h2 = 0;
                                                zzetVar3.e();
                                            } else {
                                                for (int i59 = 0; i59 < 3; i59++) {
                                                    zzafk.d(zzetVar3, j9Var);
                                                }
                                                zzetVar3.e();
                                            }
                                        } else if (h2 == 0) {
                                            zzafk.c(zzetVar3, j9Var);
                                            h2 = 0;
                                            zzetVar3.e();
                                        } else {
                                            zzafk.d(zzetVar3, j9Var);
                                            zzetVar3.e();
                                        }
                                    }
                                    int h17 = zzetVar3.h(7);
                                    for (int i60 = 0; i60 < h17; i60++) {
                                        zzetVar3.f(15);
                                    }
                                    if (h2 > 0) {
                                        if (zzetVar3.g()) {
                                            if (zzetVar3.b() < 66) {
                                                throw zzat.b("Can't parse bitrate DSI.");
                                            }
                                            zzetVar3.f(66);
                                        }
                                        if (zzetVar3.g()) {
                                            zzetVar3.k();
                                            zzetVar3.l(zzetVar3.h(16));
                                            int h18 = zzetVar3.h(5);
                                            for (int i61 = 0; i61 < h18; i61++) {
                                                zzetVar3.f(3);
                                                zzetVar3.f(8);
                                            }
                                            i20 = 8;
                                            zzetVar3.k();
                                            if (h7 == 1) {
                                                int b7 = ((b5 - zzetVar3.b()) / 8) - i25;
                                                if (i24 < b7) {
                                                    throw zzat.b("pres_bytes is smaller than presentation bytes read.");
                                                }
                                                zzetVar3.l(i24 - b7);
                                            }
                                            if (j9Var.a && j9Var.b == -1) {
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(i48).length() + 45);
                                                sb2.append("Can't determine channel mode of presentation ");
                                                sb2.append(i48);
                                                throw zzat.b(sb2.toString());
                                            }
                                            if (j9Var.a) {
                                                int i62 = j9Var.b;
                                                boolean z5 = j9Var.d;
                                                int i63 = j9Var.e;
                                                switch (i62) {
                                                    case 0:
                                                        i22 = 11;
                                                        i23 = 1;
                                                        break;
                                                    case 1:
                                                        i22 = 11;
                                                        i23 = 2;
                                                        break;
                                                    case 2:
                                                        i22 = 11;
                                                        i23 = 3;
                                                        break;
                                                    case 3:
                                                        i22 = 11;
                                                        i23 = 5;
                                                        break;
                                                    case 4:
                                                        i22 = 11;
                                                        i23 = 6;
                                                        break;
                                                    case 5:
                                                    case 7:
                                                    case 9:
                                                        i22 = 11;
                                                        i23 = 7;
                                                        break;
                                                    case 6:
                                                    case 8:
                                                    case 10:
                                                        i23 = i20;
                                                        i22 = 11;
                                                        break;
                                                    case 11:
                                                        i22 = 11;
                                                        i23 = 11;
                                                        break;
                                                    case 12:
                                                        i23 = 12;
                                                        i22 = 11;
                                                        break;
                                                    case 13:
                                                        i22 = 11;
                                                        i23 = 13;
                                                        break;
                                                    case 14:
                                                        i22 = 11;
                                                        i23 = 14;
                                                        break;
                                                    case 15:
                                                        i22 = 11;
                                                        i23 = 24;
                                                        break;
                                                    default:
                                                        i22 = 11;
                                                        i23 = -1;
                                                        break;
                                                }
                                                if (i62 == i22 || i62 == 12 || i62 == 13 || i62 == 14) {
                                                    if (!z5) {
                                                        i23 -= 2;
                                                    }
                                                    if (i63 == 0) {
                                                        i21 = i23 - 4;
                                                    } else if (i63 == 1) {
                                                        i21 = i23 - 2;
                                                    }
                                                }
                                                i21 = i23;
                                            } else {
                                                int i64 = j9Var.c;
                                                int i65 = j9Var.g;
                                                if (i64 > 0) {
                                                    i21 = i64 + 1;
                                                    if (i65 == 4 && i21 == 17) {
                                                        i21 = 21;
                                                    }
                                                } else {
                                                    if (i65 != 0) {
                                                        if (i65 == 1) {
                                                            i21 = 6;
                                                        } else if (i65 == 2) {
                                                            i21 = i20;
                                                        } else if (i65 == 3) {
                                                            i21 = 10;
                                                        } else if (i65 != 4) {
                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i65).length() + 33);
                                                            sb3.append("AC-4 level ");
                                                            sb3.append(i65);
                                                            sb3.append(" has not been defined.");
                                                            zzeh.c(sb3.toString());
                                                        } else {
                                                            i21 = 12;
                                                        }
                                                    }
                                                    i21 = 2;
                                                }
                                            }
                                            if (i21 <= 0) {
                                                throw zzat.b("Cannot determine channel count of presentation.");
                                            }
                                            Object[] objArr = {Integer.valueOf(i19), Integer.valueOf(j9Var.f), Integer.valueOf(j9Var.g)};
                                            String str16 = zzfm.a;
                                            String format2 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                            zzt zztVar3 = new zzt();
                                            zztVar3.a = num3;
                                            zztVar3.d("audio/ac4");
                                            zztVar3.G = i21;
                                            zztVar3.I = i47;
                                            zztVar3.r = zzqVar2;
                                            zztVar3.d = str;
                                            zztVar3.j = format2;
                                            j12Var.e = new zzv(zztVar3);
                                            zzeuVar2 = zzeuVar;
                                            i9 = i38;
                                            i14 = i36;
                                            str4 = str8;
                                        }
                                    }
                                    i20 = 8;
                                    zzetVar3.k();
                                    if (h7 == 1) {
                                    }
                                    if (j9Var.a) {
                                        StringBuilder sb22 = new StringBuilder(String.valueOf(i48).length() + 45);
                                        sb22.append("Can't determine channel mode of presentation ");
                                        sb22.append(i48);
                                        throw zzat.b(sb22.toString());
                                    }
                                    if (j9Var.a) {
                                    }
                                    if (i21 <= 0) {
                                    }
                                }
                                i17 = i30;
                                str8 = str2;
                                i20 = 8;
                                if (j9Var.a) {
                                }
                                if (i21 <= 0) {
                                }
                            } else {
                                i17 = i30;
                                str6 = str2;
                                i13 = i34;
                                if (b3 == 1684892784) {
                                    if (b <= 0) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(b).length() + 49);
                                        sb4.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                        sb4.append(b);
                                        throw zzat.a(null, sb4.toString());
                                    }
                                    zzeuVar2 = zzeuVar;
                                    i36 = b;
                                    list2 = list;
                                    i9 = 2;
                                } else if (b3 == 1684305011 || b3 == 1969517683) {
                                    zzeuVar2 = zzeuVar;
                                    i11 = i17;
                                    zzt zztVar4 = new zzt();
                                    zztVar4.b(i4);
                                    str4 = str6;
                                    zztVar4.d(str4);
                                    i9 = i38;
                                    zztVar4.G = i9;
                                    i14 = i36;
                                    zztVar4.I = i14;
                                    zztVar4.r = zzqVar2;
                                    zztVar4.d = str;
                                    j12Var.e = new zzv(zztVar4);
                                    i17 = i11;
                                } else {
                                    if (b3 == 1682927731) {
                                        int i66 = i12 - 8;
                                        byte[] bArr3 = a;
                                        int length = bArr3.length;
                                        byte[] copyOf = Arrays.copyOf(bArr3, length + i66);
                                        zzeuVar2 = zzeuVar;
                                        zzeuVar2.D(i13 + 8);
                                        zzeuVar2.F(length, i66, copyOf);
                                        list2 = zzgy.a(copyOf);
                                    } else {
                                        zzeuVar2 = zzeuVar;
                                        if (b3 == 1684425825) {
                                            byte[] bArr4 = new byte[i12 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[2] = 97;
                                            bArr4[3] = 67;
                                            zzeuVar2.D(i13 + 12);
                                            zzeuVar2.F(4, i12 - 12, bArr4);
                                            list2 = zzgxm.t(bArr4);
                                        } else if (b3 == 1634492771) {
                                            int i67 = i12 - 12;
                                            byte[] bArr5 = new byte[i67];
                                            zzeuVar2.D(i13 + 12);
                                            zzeuVar2.F(0, i67, bArr5);
                                            byte[] bArr6 = zzdr.a;
                                            zzeu zzeuVar4 = new zzeu(bArr5);
                                            zzeuVar4.D(5);
                                            int I3 = zzeuVar4.I();
                                            zzeuVar4.D(9);
                                            int I4 = zzeuVar4.I();
                                            zzeuVar4.D(20);
                                            int[] iArr3 = {zzeuVar4.h(), I4, I3};
                                            int i68 = iArr3[0];
                                            int i69 = iArr3[1];
                                            int b8 = zzfm.b(I3, ByteOrder.LITTLE_ENDIAN);
                                            if (b8 == 0) {
                                                b8 = -1;
                                            }
                                            list2 = zzgxm.t(bArr5);
                                            i9 = i69;
                                            i37 = b8;
                                            i36 = i68;
                                        } else if (b3 == 1767990114) {
                                            zzeuVar2.D(i13 + 9);
                                            int a2 = zzhbj.a(zzeuVar2.p());
                                            byte[] bArr7 = new byte[a2];
                                            zzeuVar2.F(0, a2, bArr7);
                                            byte[] bArr8 = zzdr.a;
                                            zzeu zzeuVar5 = new zzeu(bArr7);
                                            String str17 = null;
                                            String str18 = null;
                                            while (zzeuVar5.B() > 0 && (str17 == null || str18 == null)) {
                                                int I5 = zzeuVar5.I();
                                                int i70 = I5 >> 3;
                                                int i71 = I5 & 2;
                                                int i72 = I5 & 1;
                                                int a3 = zzhbj.a(zzeuVar5.p());
                                                if (i70 > 4 && i70 < 24 && i71 != 0) {
                                                    do {
                                                    } while ((zzeuVar5.I() & 128) != 0);
                                                    for (i18 = 128; (zzeuVar5.I() & i18) != 0; i18 = 128) {
                                                    }
                                                }
                                                if (i72 != 0) {
                                                    zzeuVar5.E(zzhbj.a(zzeuVar5.p()));
                                                }
                                                int i73 = zzeuVar5.b + a3;
                                                if (i70 == 31) {
                                                    zzeuVar5.E(4);
                                                    Object[] objArr2 = {Integer.valueOf(zzeuVar5.I()), Integer.valueOf(zzeuVar5.I())};
                                                    String str19 = zzfm.a;
                                                    str17 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                                } else if (i70 == 0) {
                                                    while ((zzeuVar5.I() & 128) != 0) {
                                                    }
                                                    String k2 = zzeuVar5.k(4, StandardCharsets.UTF_8);
                                                    if (k2.equals("mp4a")) {
                                                        while ((zzeuVar5.I() & 128) != 0) {
                                                        }
                                                        zzeuVar5.E(2);
                                                        zzet zzetVar4 = new zzet();
                                                        zzetVar4.a(zzeuVar5);
                                                        int h19 = zzetVar4.h(5);
                                                        if (h19 == 31) {
                                                            h19 = zzetVar4.h(6) + 32;
                                                        }
                                                        k2 = bf3.h(h19, k2, ".40.", new StringBuilder(k2.length() + 4 + String.valueOf(h19).length()));
                                                    }
                                                    str18 = k2;
                                                    zzeuVar5.D(i73);
                                                }
                                                zzeuVar5.D(i73);
                                            }
                                            String m = (str17 == null || str18 == null) ? null : wt3.m(str17, ".", new StringBuilder(str17.length() + 1 + str18.length()), str18);
                                            sVar = zzgxm.t(bArr7);
                                            i9 = i38;
                                            str12 = m;
                                            list2 = sVar;
                                        } else if (b3 == 1885564227) {
                                            zzeuVar2.D(i13 + 12);
                                            ByteOrder byteOrder = (zzeuVar2.I() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int I6 = zzeuVar2.I();
                                            int b9 = i17 == 1768973165 ? zzfm.b(I6, byteOrder) : i17 == 1718641517 ? zzfm.c(I6, byteOrder) : i37;
                                            if (b9 == 0) {
                                                b9 = -1;
                                            }
                                            if (b9 != -1) {
                                                i9 = i38;
                                                i37 = b9;
                                                i17 = i17;
                                                str6 = MimeTypes.AUDIO_RAW;
                                            } else {
                                                i9 = i38;
                                                i37 = b9;
                                                i17 = i17;
                                            }
                                            list2 = list;
                                        } else {
                                            i9 = i38;
                                            i14 = i36;
                                            str4 = str6;
                                        }
                                    }
                                    i9 = i38;
                                }
                            }
                        }
                        str6 = str4;
                        i36 = i14;
                        list2 = list;
                    }
                    if (i15 != i16) {
                        vl0 j = j(i15, zzeuVar2);
                        str4 = j.a;
                        byte[] bArr9 = j.b;
                        if (bArr9 == null) {
                            i17 = i11;
                            vl0Var2 = j;
                            str6 = str4;
                            i36 = i14;
                            list2 = list;
                        } else if (MimeTypes.AUDIO_VORBIS.equals(str4)) {
                            zzhbf zzhbfVar = zzahv.a;
                            zzeu zzeuVar6 = new zzeu(bArr9);
                            int i74 = 1;
                            zzeuVar6.E(1);
                            int i75 = 0;
                            while (true) {
                                vl0Var = j;
                                if (zzeuVar6.B() > 0) {
                                    i17 = i11;
                                    if (zzeuVar6.G() == 255) {
                                        zzeuVar6.E(i74);
                                        i75 += 255;
                                        j = vl0Var;
                                        i11 = i17;
                                        i74 = 1;
                                    }
                                } else {
                                    i17 = i11;
                                }
                            }
                            int I7 = zzeuVar6.I() + i75;
                            int i76 = 0;
                            while (zzeuVar6.B() > 0 && zzeuVar6.G() == 255) {
                                zzeuVar6.E(1);
                                i76 += 255;
                            }
                            int I8 = zzeuVar6.I() + i76;
                            byte[] bArr10 = new byte[I7];
                            int i77 = zzeuVar6.b;
                            System.arraycopy(bArr9, i77, bArr10, 0, I7);
                            int i78 = i77 + I7 + I8;
                            int length2 = bArr9.length - i78;
                            byte[] bArr11 = new byte[length2];
                            System.arraycopy(bArr9, i78, bArr11, 0, length2);
                            list2 = zzgxm.u(bArr10, bArr11);
                            vl0Var2 = vl0Var;
                            str6 = str4;
                            i36 = i14;
                        } else {
                            i17 = i11;
                            if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                zzafe a4 = zzaff.a(new zzet(bArr9, bArr9.length), false);
                                i14 = a4.a;
                                i9 = a4.b;
                                str7 = a4.c;
                            } else {
                                str7 = str12;
                            }
                            sVar = zzgxm.t(bArr9);
                            vl0Var2 = j;
                            str6 = str4;
                            i36 = i14;
                            str12 = str7;
                            list2 = sVar;
                        }
                    }
                    i17 = i11;
                    str6 = str4;
                    i36 = i14;
                    list2 = list;
                }
                i34 = i13 + i12;
                i31 = i3;
                zzeuVar3 = zzeuVar2;
                str10 = str3;
                str11 = str5;
                str2 = str6;
                i30 = i17;
                i7 = 2;
            }
            zzeuVar2 = zzeuVar3;
            i34 = i13 + i12;
            i31 = i3;
            zzeuVar3 = zzeuVar2;
            str10 = str3;
            str11 = str5;
            str2 = str6;
            i30 = i17;
            i7 = 2;
        }
        String str20 = str2;
        List list4 = list2;
        int i79 = i36;
        if (((zzv) j12Var.e) != null || str20 == null) {
            return;
        }
        zzt zztVar5 = new zzt();
        zztVar5.b(i4);
        zztVar5.d(str20);
        zztVar5.j = str12;
        zztVar5.G = i9;
        zztVar5.I = i79;
        zztVar5.J = i37;
        zztVar5.q = list4;
        zztVar5.r = zzqVar2;
        zztVar5.d = str;
        vl0 vl0Var3 = vl0Var2;
        if (vl0Var3 != null) {
            zztVar5.h = zzhbj.b(vl0Var3.c);
            zztVar5.i = zzhbj.b(vl0Var3.d);
        } else {
            h12 h12Var2 = h12Var;
            if (h12Var2 != null) {
                zztVar5.h = zzhbj.b(h12Var2.a);
                zztVar5.i = zzhbj.b(h12Var2.b);
            }
        }
        j12Var.e = new zzv(zztVar5);
    }

    public static vl0 j(int i, zzeu zzeuVar) {
        zzeuVar.D(i + 12);
        zzeuVar.E(1);
        l(zzeuVar);
        zzeuVar.E(2);
        int I = zzeuVar.I();
        if ((I & 128) != 0) {
            zzeuVar.E(2);
        }
        if ((I & 64) != 0) {
            zzeuVar.E(zzeuVar.I());
        }
        if ((I & 32) != 0) {
            zzeuVar.E(2);
        }
        zzeuVar.E(1);
        l(zzeuVar);
        String e = zzas.e(zzeuVar.I());
        if (MimeTypes.AUDIO_MPEG.equals(e) || MimeTypes.AUDIO_DTS.equals(e) || MimeTypes.AUDIO_DTS_HD.equals(e)) {
            return new vl0(e, null, -1L, -1L);
        }
        zzeuVar.E(4);
        long N = zzeuVar.N();
        long N2 = zzeuVar.N();
        zzeuVar.E(1);
        int l = l(zzeuVar);
        long j = N2;
        byte[] bArr = new byte[l];
        zzeuVar.F(0, l, bArr);
        if (j <= 0) {
            j = -1;
        }
        return new vl0(e, bArr, j, N > 0 ? N : -1L);
    }

    public static Pair k(zzeu zzeuVar, int i, int i2) {
        Integer num;
        zzamx zzamxVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = zzeuVar.b;
        while (i5 - i < i2) {
            zzeuVar.D(i5);
            int b = zzeuVar.b();
            zzagl.a("childAtomSize must be positive", b > 0);
            if (zzeuVar.b() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < b) {
                    zzeuVar.D(i6);
                    int b2 = zzeuVar.b();
                    int b3 = zzeuVar.b();
                    if (b3 == 1718775137) {
                        num3 = Integer.valueOf(zzeuVar.b());
                    } else if (b3 == 1935894637) {
                        zzeuVar.E(4);
                        str = zzeuVar.k(4, StandardCharsets.UTF_8);
                    } else if (b3 == 1935894633) {
                        i8 = i6;
                        i7 = b2;
                    }
                    i6 += b2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(str) || C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) || C.CENC_TYPE_cbcs.equals(str)) {
                    zzagl.a("frma atom is mandatory", num3 != null);
                    zzagl.a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            zzamxVar = null;
                            break;
                        }
                        zzeuVar.D(i9);
                        int b4 = zzeuVar.b();
                        if (zzeuVar.b() == 1952804451) {
                            int a2 = a(zzeuVar.b());
                            zzeuVar.E(1);
                            if (a2 == 0) {
                                zzeuVar.E(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int I = zzeuVar.I();
                                i3 = I & 15;
                                i4 = (I & 240) >> 4;
                            }
                            if (zzeuVar.I() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int I2 = zzeuVar.I();
                            byte[] bArr2 = new byte[16];
                            zzeuVar.F(0, 16, bArr2);
                            if (z && I2 == 0) {
                                int I3 = zzeuVar.I();
                                byte[] bArr3 = new byte[I3];
                                zzeuVar.F(0, I3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzamxVar = new zzamx(z, str, I2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += b4;
                        }
                    }
                    zzagl.a("tenc atom is mandatory", zzamxVar != null);
                    String str2 = zzfm.a;
                    create = Pair.create(num, zzamxVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += b;
        }
        return null;
    }

    public static int l(zzeu zzeuVar) {
        int I = zzeuVar.I();
        int i = I & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while ((I & 128) == 128) {
            I = zzeuVar.I();
            i = (i << 7) | (I & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return i;
    }
}
