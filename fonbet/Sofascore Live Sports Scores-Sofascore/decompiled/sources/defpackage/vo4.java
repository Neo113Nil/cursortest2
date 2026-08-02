package defpackage;

import android.util.LongSparseArray;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzahj;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajg;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzakt;
import com.google.android.gms.internal.ads.zzao;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzg;
import com.google.android.gms.internal.ads.zzp;
import com.google.android.gms.internal.ads.zzq;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzx;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vo4 {
    public final byte[] a;
    public final ArrayDeque b;
    public int c;
    public int d;
    public long e;
    public final Object f;
    public Object g;

    public vo4(int i) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new nkk(1, false);
                break;
            case 2:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new nkk(2, false);
                break;
            default:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new nkk(0, false);
                break;
        }
    }

    public long a(ml6 ml6Var, int i) {
        ml6Var.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j;
    }

    public long b(nl6 nl6Var, int i) {
        nl6Var.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x044e, code lost:
    
        if (r2.equals("A_OPUS") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x058e, code lost:
    
        r1.a(r1.d);
        r1.b0 = r0.k0.b(r1.d, r1.f);
        r4.put(r1.d, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0458, code lost:
    
        if (r2.equals("A_FLAC") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0462, code lost:
    
        if (r2.equals("A_EAC3") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x046c, code lost:
    
        if (r2.equals("V_MPEG2") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0476, code lost:
    
        if (r2.equals("S_TEXT/UTF8") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0480, code lost:
    
        if (r2.equals("S_TEXT/WEBVTT") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x048a, code lost:
    
        if (r2.equals("V_MPEGH/ISO/HEVC") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0494, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x049e, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04a8, code lost:
    
        if (r2.equals("A_PCM/INT/LIT") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04b2, code lost:
    
        if (r2.equals("A_PCM/INT/BIG") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04bc, code lost:
    
        if (r2.equals("A_PCM/FLOAT/IEEE") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04c6, code lost:
    
        if (r2.equals("A_DTS/EXPRESS") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x04d0, code lost:
    
        if (r2.equals("V_THEORA") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04da, code lost:
    
        if (r2.equals("S_HDMV/PGS") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04e2, code lost:
    
        if (r2.equals("V_VP9") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04ec, code lost:
    
        if (r2.equals("V_VP8") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x04f6, code lost:
    
        if (r2.equals("V_AV1") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0500, code lost:
    
        if (r2.equals("A_DTS") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x050a, code lost:
    
        if (r2.equals("A_AC3") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0514, code lost:
    
        if (r2.equals("A_AAC") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x051e, code lost:
    
        if (r2.equals("A_DTS/LOSSLESS") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0528, code lost:
    
        if (r2.equals("S_VOBSUB") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0532, code lost:
    
        if (r2.equals("V_MPEG4/ISO/AVC") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x053b, code lost:
    
        if (r2.equals("V_MPEG4/ISO/ASP") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0544, code lost:
    
        if (r2.equals("S_DVBSUB") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x054d, code lost:
    
        if (r2.equals("V_MS/VFW/FOURCC") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0556, code lost:
    
        if (r2.equals("A_MPEG/L3") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x055f, code lost:
    
        if (r2.equals("A_MPEG/L2") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0568, code lost:
    
        if (r2.equals("A_VORBIS") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0571, code lost:
    
        if (r2.equals("A_TRUEHD") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x057a, code lost:
    
        if (r2.equals("A_MS/ACM") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0583, code lost:
    
        if (r2.equals("V_MPEG4/ISO/SP") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x058c, code lost:
    
        if (r2.equals("V_MPEG4/ISO/AP") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0a4a, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.a(null, "EBML lacing sample size out of range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
    
        r0.k0.c(new com.google.android.gms.internal.ads.zzahj(r0.v, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x06da, code lost:
    
        if (r6 == 1) goto L403;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(zzagi zzagiVar) {
        boolean z;
        boolean z2;
        int i;
        String str;
        int i2;
        long j;
        int i3;
        boolean z3;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3;
        int i8;
        char c;
        int H;
        int i9;
        String str2;
        int i10;
        SparseArray sparseArray;
        List list;
        int i11;
        SparseArray sparseArray2;
        long j4;
        int i12;
        int i13;
        long j5;
        long j6;
        int i14;
        nkk nkkVar = (nkk) this.f;
        ((d4a) this.g).getClass();
        while (true) {
            ArrayDeque arrayDeque = this.b;
            ngn ngnVar = (ngn) arrayDeque.peek();
            int i15 = 8;
            if (ngnVar != null && zzagiVar.zzn() >= ngnVar.b) {
                d4a d4aVar = (d4a) this.g;
                int i16 = ((ngn) arrayDeque.pop()).a;
                zzakt zzaktVar = (zzakt) d4aVar.b;
                LongSparseArray longSparseArray = zzaktVar.c;
                SparseArray sparseArray3 = zzaktVar.D;
                SparseArray sparseArray4 = zzaktVar.b;
                zzaktVar.k0.getClass();
                if (i16 == 128) {
                    zzakn zzaknVar = zzaktVar.y;
                    zzaknVar.getClass();
                    if (zzaknVar.f == null && (str2 = zzaknVar.h) != null) {
                        zzaknVar.f = str2;
                        String str3 = zzaknVar.i;
                        if (str3 != null) {
                            zzaknVar.g = str3;
                            return true;
                        }
                    }
                } else if (i16 != 160) {
                    if (i16 == 174) {
                        zzaks zzaksVar = zzaktVar.z;
                        zzaksVar.getClass();
                        String str4 = zzaksVar.c;
                        if (str4 == null) {
                            throw zzat.a(null, "CodecId is missing in TrackEntry element");
                        }
                        switch (str4.hashCode()) {
                            case -2095576542:
                                break;
                            case -2095575984:
                                break;
                            case -1985379776:
                                break;
                            case -1784763192:
                                break;
                            case -1730367663:
                                break;
                            case -1482641358:
                                break;
                            case -1482641357:
                                break;
                            case -1373388978:
                                break;
                            case -933872740:
                                break;
                            case -538363189:
                                break;
                            case -538363109:
                                break;
                            case -425012669:
                                break;
                            case -356037306:
                                break;
                            case 62923557:
                                break;
                            case 62923603:
                                break;
                            case 62927045:
                                break;
                            case 82318131:
                                break;
                            case 82338133:
                                break;
                            case 82338134:
                                break;
                            case 99146302:
                                break;
                            case 444813526:
                                break;
                            case 542569478:
                                break;
                            case 635596514:
                                break;
                            case 725948237:
                                break;
                            case 725957860:
                                break;
                            case 738597099:
                                break;
                            case 738614379:
                                break;
                            case 855502857:
                                break;
                            case 1045209816:
                                break;
                            case 1422270023:
                                break;
                            case 1809237540:
                                break;
                            case 1950749482:
                                break;
                            case 1950789798:
                                break;
                            case 1951062397:
                                break;
                        }
                        zzaktVar.z = null;
                        return true;
                    }
                    if (i16 == 17849) {
                        for (int i17 = 0; i17 < sparseArray4.size(); i17++) {
                            zzaks zzaksVar2 = (zzaks) sparseArray4.valueAt(i17);
                            ArrayList arrayList = new ArrayList(longSparseArray.size());
                            for (int i18 = 0; i18 < longSparseArray.size(); i18++) {
                                zzakn zzaknVar2 = (zzakn) longSparseArray.valueAt(i18);
                                long j7 = zzaknVar2.e;
                                if (j7 == 0 || j7 == zzaksVar2.e) {
                                    zzajf zzajfVar = new zzajf();
                                    long j8 = zzaknVar2.b;
                                    String str5 = zzfm.a;
                                    if (j8 != C.TIME_UNSET && j8 != Long.MIN_VALUE) {
                                        j8 /= 1000000;
                                    }
                                    zzajfVar.a = j8;
                                    long j9 = zzaknVar2.c;
                                    if (j9 != C.TIME_UNSET && j9 != Long.MIN_VALUE) {
                                        j9 /= 1000000;
                                    }
                                    zzajfVar.b = j9;
                                    zzajfVar.c = zzaknVar2.d;
                                    if (zzaknVar2.f != null) {
                                        zzajfVar.d = new zzx(zzaknVar2.g, zzaknVar2.f);
                                    }
                                    arrayList.add(new jgn(zzajfVar.a, zzajfVar.b, zzajfVar.c, zzajfVar.d));
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                zzv zzvVar = zzaksVar2.c0;
                                zzvVar.getClass();
                                zzt a = zzvVar.a();
                                zzap zzapVar = zzvVar.l;
                                a.k = zzapVar != null ? zzapVar.b((zzao[]) arrayList.toArray(new zzajg[0])) : new zzap(arrayList);
                                zzaksVar2.c0 = new zzv(a);
                            }
                        }
                    } else {
                        if (i16 == 19899) {
                            int i19 = zzaktVar.B;
                            if (i19 != -1) {
                                long j10 = zzaktVar.C;
                                if (j10 != -1) {
                                    if (i19 == 475249515) {
                                        zzaktVar.L = j10;
                                        return true;
                                    }
                                }
                            }
                            throw zzat.a(null, "Mandatory element SeekID or SeekPosition not found");
                        }
                        if (i16 == 25152) {
                            zzaktVar.i(i16);
                            zzaks zzaksVar3 = zzaktVar.z;
                            if (zzaksVar3.j) {
                                zzahs zzahsVar = zzaksVar3.l;
                                if (zzahsVar == null) {
                                    throw zzat.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                }
                                zzaksVar3.n = new zzq(null, true, new zzp(zzg.a, "video/webm", zzahsVar.b));
                                return true;
                            }
                        } else if (i16 == 28032) {
                            zzaktVar.i(i16);
                            zzaks zzaksVar4 = zzaktVar.z;
                            if (zzaksVar4.j && zzaksVar4.k != null) {
                                throw zzat.a(null, "Combining encryption and compression is not supported");
                            }
                        } else if (i16 == 357149030) {
                            if (zzaktVar.t == C.TIME_UNSET) {
                                zzaktVar.t = 1000000L;
                            }
                            long j11 = zzaktVar.u;
                            if (j11 != C.TIME_UNSET) {
                                zzaktVar.v = zzaktVar.b(j11);
                                return true;
                            }
                        } else if (i16 != 374648427) {
                            if (i16 != 475249515) {
                                if (i16 == 182) {
                                    zzakn zzaknVar3 = zzaktVar.y;
                                    zzaknVar3.getClass();
                                    long j12 = zzaknVar3.a;
                                    if (j12 != 0) {
                                        longSparseArray.put(j12, zzaknVar3);
                                    }
                                    zzaktVar.y = null;
                                    return true;
                                }
                                if (i16 == 183 && !zzaktVar.A) {
                                    zzaktVar.j(i16);
                                    if (zzaktVar.F != C.TIME_UNSET && (i14 = zzaktVar.G) != -1 && zzaktVar.H != -1) {
                                        List list2 = (List) sparseArray3.get(i14);
                                        if (list2 == null) {
                                            list2 = new ArrayList();
                                            sparseArray3.put(zzaktVar.G, list2);
                                        }
                                        list2.add(new ogn(zzaktVar.F, zzaktVar.s + zzaktVar.H, zzaktVar.I));
                                        return true;
                                    }
                                }
                                return true;
                            }
                            if (!zzaktVar.A) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 < sparseArray3.size()) {
                                        if (((List) sparseArray3.valueAt(i20)).isEmpty()) {
                                            i20++;
                                        } else if (zzaktVar.v != C.TIME_UNSET) {
                                            for (int i21 = 0; i21 < sparseArray3.size(); i21++) {
                                                Collections.sort((List) sparseArray3.valueAt(i21));
                                            }
                                            sparseArray = sparseArray3;
                                            zzaktVar.k0.c(new pgn(sparseArray3, zzaktVar.v, zzaktVar.J, zzaktVar.s, zzaktVar.r));
                                        }
                                    }
                                }
                                zzaktVar.A = true;
                                zzaktVar.E = false;
                                int i22 = 0;
                                while (i22 < sparseArray4.size()) {
                                    zzaks zzaksVar5 = (zzaks) sparseArray4.valueAt(i22);
                                    long j13 = zzaktVar.v;
                                    long j14 = zzaktVar.s;
                                    long j15 = zzaktVar.r;
                                    if (zzaksVar5.f != 2 || (list = (List) sparseArray.get(zzaksVar5.d)) == null || list.isEmpty()) {
                                        i11 = i22;
                                        sparseArray2 = sparseArray;
                                    } else {
                                        if (list.isEmpty()) {
                                            i11 = i22;
                                            sparseArray2 = sparseArray;
                                        } else {
                                            int min = Math.min(list.size(), 20);
                                            double d = 0.0d;
                                            i11 = i22;
                                            int i23 = 0;
                                            int i24 = -1;
                                            while (true) {
                                                if (i23 < min) {
                                                    sparseArray2 = sparseArray;
                                                    ogn ognVar = (ogn) list.get(i23);
                                                    long j16 = j13;
                                                    long j17 = ognVar.a;
                                                    long j18 = ognVar.c;
                                                    long j19 = ognVar.b;
                                                    if (j17 <= 10000000) {
                                                        int i25 = i23 + 1;
                                                        if (i23 < list.size() - 1) {
                                                            ogn ognVar2 = (ogn) list.get(i25);
                                                            int i26 = i23;
                                                            i12 = i25;
                                                            j6 = ognVar2.a - j17;
                                                            i13 = i26;
                                                            j5 = (ognVar2.b + ognVar2.c) - (j19 + j18);
                                                        } else {
                                                            i12 = i25;
                                                            long j20 = j16 - j17;
                                                            i13 = i23;
                                                            j5 = (j14 + j15) - (j19 + j18);
                                                            j6 = j20;
                                                        }
                                                        if (j6 > 0) {
                                                            double d2 = j5 / j6;
                                                            if (d2 > d) {
                                                                i24 = i13;
                                                                d = d2;
                                                            }
                                                        }
                                                        i23 = i12;
                                                        j13 = j16;
                                                        sparseArray = sparseArray2;
                                                    }
                                                } else {
                                                    sparseArray2 = sparseArray;
                                                }
                                            }
                                            if (i24 != -1) {
                                                j4 = ((ogn) list.get(i24)).a;
                                                if (j4 != C.TIME_UNSET) {
                                                    zzv zzvVar2 = zzaksVar5.c0;
                                                    zzvVar2.getClass();
                                                    zzap zzapVar2 = zzvVar2.l;
                                                    zzajk zzajkVar = new zzajk(j4);
                                                    zzap zzapVar3 = zzapVar2 == null ? new zzap(zzajkVar) : zzapVar2.b(zzajkVar);
                                                    zzv zzvVar3 = zzaksVar5.c0;
                                                    zzvVar3.getClass();
                                                    zzt zztVar = new zzt(zzvVar3);
                                                    zztVar.k = zzapVar3;
                                                    zzaksVar5.c0 = new zzv(zztVar);
                                                }
                                            }
                                        }
                                        j4 = -9223372036854775807L;
                                        if (j4 != C.TIME_UNSET) {
                                        }
                                    }
                                    if (!zzaksVar5.X) {
                                        zzaksVar5.b0.getClass();
                                        zzaht zzahtVar = zzaksVar5.b0;
                                        zzv zzvVar4 = zzaksVar5.c0;
                                        zzvVar4.getClass();
                                        zzahtVar.e(zzvVar4);
                                    }
                                    i22 = i11 + 1;
                                    sparseArray = sparseArray2;
                                }
                                zzaktVar.f();
                                return true;
                            }
                        } else {
                            if (sparseArray4.size() == 0) {
                                throw zzat.a(null, "No valid tracks were found");
                            }
                            boolean z4 = !zzaktVar.d || zzaktVar.L == -1;
                            int i27 = -1;
                            int i28 = -1;
                            int i29 = -1;
                            int i30 = -1;
                            for (int i31 = 0; i31 < sparseArray4.size(); i31++) {
                                zzaks zzaksVar6 = (zzaks) sparseArray4.valueAt(i31);
                                int i32 = zzaksVar6.f;
                                if (i32 == 2) {
                                    if (zzaksVar6.Z) {
                                        i27 = zzaksVar6.d;
                                    }
                                    if (i28 == -1) {
                                        i28 = zzaksVar6.d;
                                    }
                                } else if (i32 == 1) {
                                    if (zzaksVar6.Z) {
                                        i29 = zzaksVar6.d;
                                    }
                                    if (i30 == -1) {
                                        i30 = zzaksVar6.d;
                                    }
                                }
                                if (z4) {
                                    zzaksVar6.b0.getClass();
                                    if (!zzaksVar6.X) {
                                        zzaht zzahtVar2 = zzaksVar6.b0;
                                        zzv zzvVar5 = zzaksVar6.c0;
                                        zzvVar5.getClass();
                                        zzahtVar2.e(zzvVar5);
                                    }
                                }
                            }
                            if (i27 != -1) {
                                zzaktVar.J = i27;
                            } else if (i28 != -1) {
                                zzaktVar.J = i28;
                            } else if (i29 != -1) {
                                zzaktVar.J = i29;
                            } else if (i30 != -1) {
                                zzaktVar.J = i30;
                            } else {
                                zzaktVar.J = sparseArray4.size() > 0 ? ((zzaks) sparseArray4.valueAt(0)).d : -1;
                            }
                            if (z4) {
                                zzaktVar.f();
                                return true;
                            }
                        }
                    }
                } else if (zzaktVar.P == 2) {
                    zzaks zzaksVar7 = (zzaks) sparseArray4.get(zzaktVar.V);
                    zzaksVar7.b0.getClass();
                    if (zzaktVar.a0 > 0 && "A_OPUS".equals(zzaksVar7.c)) {
                        zzeu zzeuVar = zzaktVar.p;
                        byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(zzaktVar.a0).array();
                        zzeuVar.z(array.length, array);
                    }
                    int i33 = 0;
                    for (int i34 = 0; i34 < zzaktVar.T; i34++) {
                        i33 += zzaktVar.U[i34];
                    }
                    int i35 = 0;
                    while (i35 < zzaktVar.T) {
                        long j21 = zzaktVar.Q + ((zzaksVar7.g * i35) / 1000);
                        int i36 = zzaktVar.X;
                        if (i35 == 0) {
                            if (!zzaktVar.Z) {
                                i36 |= 1;
                            }
                            i10 = i36;
                            i35 = 0;
                        } else {
                            i10 = i36;
                        }
                        int i37 = zzaktVar.U[i35];
                        int i38 = i33 - i37;
                        zzaktVar.k(zzaksVar7, j21, i10, i37, i38);
                        i35++;
                        i33 = i38;
                    }
                    zzaktVar.P = 0;
                    return true;
                }
                return true;
            }
            int i39 = this.c;
            int i40 = 4;
            if (i39 == 0) {
                int i41 = 0;
                long G = nkkVar.G(zzagiVar, true, false, 4);
                if (G == -2) {
                    zzagiVar.zzl();
                    while (true) {
                        byte[] bArr = this.a;
                        zzagiVar.h(i41, 4, bArr);
                        byte b = bArr[i41];
                        int i42 = i15;
                        int i43 = 0;
                        while (true) {
                            if (i43 < i42) {
                                i8 = i43 + 1;
                                if ((nkk.f[i43] & b) == 0) {
                                    i43 = i8;
                                    i42 = 8;
                                }
                            } else {
                                i8 = -1;
                            }
                        }
                        if (i8 == -1 || i8 > 4) {
                            c = 44651;
                        } else {
                            H = (int) nkk.H(bArr, i8, false);
                            Object obj = ((d4a) this.g).b;
                            if (H != 357149030 && H != 272869232 && H != 524531317 && H != 475249515) {
                                c = 44651;
                                if (H == 374648427) {
                                    i9 = 374648427;
                                }
                            }
                        }
                        zzagiVar.zzf(1);
                        i41 = 0;
                        i15 = 8;
                    }
                    i9 = H;
                    zzagiVar.zzf(i8);
                    j3 = i9;
                } else {
                    j3 = G;
                }
                z = true;
                z2 = false;
                if (j3 == -1) {
                    return false;
                }
                this.d = (int) j3;
                this.c = 1;
            } else {
                z = true;
                z2 = false;
            }
            this.e = nkkVar.G(zzagiVar, z2, z, 8);
            this.c = 2;
            d4a d4aVar2 = (d4a) this.g;
            int i44 = this.d;
            zzakt zzaktVar2 = (zzakt) d4aVar2.b;
            switch (i44) {
                case 128:
                case 143:
                case 160:
                case 166:
                case 174:
                case 182:
                case 183:
                case 187:
                case 224:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                case 16868:
                case 17849:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 272869232:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long zzn = zzagiVar.zzn();
                    arrayDeque.push(new ngn(i44, this.e + zzn));
                    d4a d4aVar3 = (d4a) this.g;
                    int i45 = this.d;
                    long j22 = this.e;
                    zzakt zzaktVar3 = (zzakt) d4aVar3.b;
                    zzagk zzagkVar = zzaktVar3.k0;
                    zzagkVar.getClass();
                    if (i45 == 128) {
                        i = 0;
                        zzaktVar3.h(i45);
                        zzaktVar3.y.h = null;
                        zzaktVar3.h(i45);
                        zzaktVar3.y.i = null;
                    } else if (i45 != 160) {
                        if (i45 == 174) {
                            zzaks zzaksVar8 = new zzaks();
                            zzaktVar3.z = zzaksVar8;
                            zzaksVar8.a = zzaktVar3.w;
                        } else if (i45 != 187) {
                            if (i45 == 19899) {
                                zzaktVar3.B = -1;
                                zzaktVar3.C = -1L;
                            } else if (i45 == 20533) {
                                zzaktVar3.i(i45);
                                zzaktVar3.z.j = true;
                            } else if (i45 == 408125543) {
                                long j23 = zzaktVar3.s;
                                if (j23 != -1 && j23 != zzn) {
                                    throw zzat.a(null, "Multiple Segment elements not supported");
                                }
                                zzaktVar3.s = zzn;
                                zzaktVar3.r = j22;
                            } else if (i45 != 475249515) {
                                if (i45 != 524531317) {
                                    if (i45 == 182) {
                                        zzaktVar3.y = new zzakn();
                                    } else if (i45 == 183 && !zzaktVar3.A) {
                                        zzaktVar3.j(i45);
                                        zzaktVar3.G = -1;
                                        zzaktVar3.H = -1L;
                                        zzaktVar3.I = -1L;
                                    }
                                } else if (!zzaktVar3.A) {
                                    if (!zzaktVar3.d || zzaktVar3.L == -1) {
                                        zzagkVar.c(new zzahj(zzaktVar3.v, 0L));
                                        zzaktVar3.A = true;
                                    } else {
                                        zzaktVar3.K = true;
                                    }
                                }
                            } else if (!zzaktVar3.A) {
                                zzaktVar3.E = true;
                            }
                        } else if (!zzaktVar3.A) {
                            zzaktVar3.j(i45);
                            zzaktVar3.F = C.TIME_UNSET;
                        }
                        i = 0;
                    } else {
                        i = 0;
                        zzaktVar3.Z = false;
                        zzaktVar3.a0 = 0L;
                    }
                    this.c = i;
                    return true;
                case MRAID_JS_WRITE_FAILED_VALUE:
                case PRIVACY_URL_ERROR_VALUE:
                case TPAT_RETRY_FAILED_VALUE:
                case 145:
                case 146:
                case 152:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case AD_RESPONSE_EMPTY_VALUE:
                case 231:
                case 238:
                case 240:
                case 241:
                case 247:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 29636:
                case 29637:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    long j24 = this.e;
                    if (j24 <= 8) {
                        zzaktVar2.g(i44, d(zzagiVar, (int) j24));
                        this.c = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(j24).length() + 22);
                    sb.append("Invalid integer size: ");
                    sb.append(j24);
                    throw zzat.a(null, sb.toString());
                case OMSDK_JS_WRITE_FAILED_VALUE:
                case 134:
                case 17026:
                case 17276:
                case 21358:
                case 2274716:
                    long j25 = this.e;
                    if (j25 > 2147483647L) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(j25).length() + 21);
                        sb2.append("String element size: ");
                        sb2.append(j25);
                        throw zzat.a(null, sb2.toString());
                    }
                    int i46 = (int) j25;
                    if (i46 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i46];
                        zzagiVar.g(0, i46, bArr2);
                        while (i46 > 0) {
                            int i47 = i46 - 1;
                            if (bArr2[i47] == 0) {
                                i46 = i47;
                            } else {
                                str = new String(bArr2, 0, i46);
                            }
                        }
                        str = new String(bArr2, 0, i46);
                    }
                    if (i44 == 133) {
                        zzaktVar2.h(i44);
                        zzaktVar2.y.h = str;
                    } else if (i44 == 134) {
                        zzaktVar2.i(i44);
                        zzaktVar2.z.c = str;
                    } else if (i44 == 17026) {
                        if (!"webm".equals(str) && !"matroska".equals(str)) {
                            StringBuilder sb3 = new StringBuilder(str.length() + 22);
                            sb3.append("DocType ");
                            sb3.append(str);
                            sb3.append(" not supported");
                            throw zzat.a(null, sb3.toString());
                        }
                        zzaktVar2.w = str.equals("webm");
                    } else if (i44 == 17276) {
                        zzaktVar2.h(i44);
                        zzaktVar2.y.i = str;
                    } else if (i44 == 21358) {
                        zzaktVar2.i(i44);
                        zzaktVar2.z.b = str;
                    } else if (i44 == 2274716) {
                        zzaktVar2.i(i44);
                        zzaktVar2.z.a0 = str;
                    }
                    this.c = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    int i48 = (int) this.e;
                    zzeu zzeuVar2 = zzaktVar2.i;
                    SparseArray sparseArray5 = zzaktVar2.b;
                    if (i44 == 161 || i44 == 163) {
                        i2 = 0;
                        if (zzaktVar2.P == 0) {
                            nkk nkkVar2 = zzaktVar2.a;
                            j = 2147483647L;
                            zzaktVar2.V = (int) nkkVar2.G(zzagiVar, false, true, 8);
                            zzaktVar2.W = nkkVar2.c;
                            zzaktVar2.R = C.TIME_UNSET;
                            zzaktVar2.P = 1;
                            zzeuVar2.y(0);
                        } else {
                            j = 2147483647L;
                        }
                        zzaks zzaksVar9 = (zzaks) sparseArray5.get(zzaktVar2.V);
                        if (zzaksVar9 == null) {
                            zzagiVar.zzf(i48 - zzaktVar2.W);
                            zzaktVar2.P = 0;
                            z3 = true;
                        } else {
                            zzaksVar9.b0.getClass();
                            if (zzaktVar2.P == 1) {
                                zzaktVar2.l(zzagiVar, 3);
                                int i49 = (zzeuVar2.a[2] & 6) >> 1;
                                byte b2 = AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                if (i49 == 0) {
                                    zzaktVar2.T = 1;
                                    int[] iArr = zzaktVar2.U;
                                    if (iArr == null) {
                                        iArr = new int[1];
                                    } else {
                                        int length = iArr.length;
                                        if (length < 1) {
                                            iArr = new int[Math.max(length + length, 1)];
                                        }
                                    }
                                    zzaktVar2.U = iArr;
                                    iArr[0] = (i48 - zzaktVar2.W) - 3;
                                } else {
                                    zzaktVar2.l(zzagiVar, 4);
                                    int i50 = (zzeuVar2.a[3] & 255) + 1;
                                    zzaktVar2.T = i50;
                                    int[] iArr2 = zzaktVar2.U;
                                    if (iArr2 == null) {
                                        iArr2 = new int[i50];
                                    } else {
                                        int length2 = iArr2.length;
                                        if (length2 < i50) {
                                            iArr2 = new int[Math.max(length2 + length2, i50)];
                                        }
                                    }
                                    zzaktVar2.U = iArr2;
                                    if (i49 == 2) {
                                        int i51 = (i48 - zzaktVar2.W) - 4;
                                        int i52 = zzaktVar2.T;
                                        Arrays.fill(iArr2, 0, i52, i51 / i52);
                                    } else {
                                        int i53 = 0;
                                        if (i49 == 1) {
                                            int i54 = 0;
                                            int i55 = 0;
                                            while (true) {
                                                int i56 = zzaktVar2.T - 1;
                                                int[] iArr3 = zzaktVar2.U;
                                                if (i54 < i56) {
                                                    iArr3[i54] = i53;
                                                    while (true) {
                                                        i4 = i40 + 1;
                                                        zzaktVar2.l(zzagiVar, i4);
                                                        int i57 = zzeuVar2.a[i40] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                        int[] iArr4 = zzaktVar2.U;
                                                        i5 = iArr4[i54] + i57;
                                                        iArr4[i54] = i5;
                                                        if (i57 != 255) {
                                                            break;
                                                        }
                                                        i40 = i4;
                                                    }
                                                    i55 += i5;
                                                    i54++;
                                                    i40 = i4;
                                                    i53 = 0;
                                                } else {
                                                    iArr3[i56] = ((i48 - zzaktVar2.W) - i40) - i55;
                                                }
                                            }
                                        } else {
                                            if (i49 != 3) {
                                                throw zzat.a(null, "Unexpected lacing value: 2");
                                            }
                                            int i58 = 0;
                                            int i59 = 0;
                                            while (true) {
                                                int i60 = zzaktVar2.T - 1;
                                                int[] iArr5 = zzaktVar2.U;
                                                if (i58 < i60) {
                                                    iArr5[i58] = 0;
                                                    int i61 = i40 + 1;
                                                    zzaktVar2.l(zzagiVar, i61);
                                                    if (zzeuVar2.a[i40] == 0) {
                                                        throw zzat.a(null, "No valid varint length mask found");
                                                    }
                                                    int i62 = 0;
                                                    while (true) {
                                                        if (i62 < 8) {
                                                            int i63 = 1 << (7 - i62);
                                                            if ((zzeuVar2.a[i40] & i63) != 0) {
                                                                int i64 = i61 + i62;
                                                                zzaktVar2.l(zzagiVar, i64);
                                                                long j26 = zzeuVar2.a[i40] & b2 & (~i63);
                                                                int i65 = i61;
                                                                while (i65 < i64) {
                                                                    int i66 = zzeuVar2.a[i65] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                                    i65++;
                                                                    j26 = (j26 << 8) | i66;
                                                                }
                                                                if (i58 > 0) {
                                                                    j2 = j26 - ((1 << ((i62 * 7) + 6)) - 1);
                                                                    i40 = i64;
                                                                } else {
                                                                    i40 = i64;
                                                                    j2 = j26;
                                                                }
                                                            } else {
                                                                i62++;
                                                                b2 = AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                            }
                                                        } else {
                                                            i40 = i61;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (j2 >= -2147483648L && j2 <= j) {
                                                        int[] iArr6 = zzaktVar2.U;
                                                        int i67 = (int) j2;
                                                        if (i58 != 0) {
                                                            i67 += iArr6[i58 - 1];
                                                        }
                                                        iArr6[i58] = i67;
                                                        i59 += i67;
                                                        i58++;
                                                        b2 = AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                    }
                                                } else {
                                                    iArr5[i60] = ((i48 - zzaktVar2.W) - i40) - i59;
                                                }
                                            }
                                        }
                                    }
                                }
                                byte[] bArr3 = zzeuVar2.a;
                                zzaktVar2.Q = zzaktVar2.b((bArr3[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr3[0] << 8)) + zzaktVar2.N;
                                if (zzaksVar9.f == 1) {
                                    i6 = 2;
                                    i7 = 1;
                                } else if (i44 == 163) {
                                    i6 = 2;
                                    i7 = (zzeuVar2.a[2] & 128) == 128 ? 1 : 0;
                                    i44 = 163;
                                } else {
                                    i6 = 2;
                                    i7 = 0;
                                }
                                zzaktVar2.X = i7;
                                zzaktVar2.P = i6;
                                zzaktVar2.S = 0;
                                i3 = 163;
                            } else {
                                i3 = 163;
                            }
                            if (i44 == i3) {
                                while (true) {
                                    int i68 = zzaktVar2.S;
                                    if (i68 < zzaktVar2.T) {
                                        zzaktVar2.k(zzaksVar9, zzaktVar2.Q + ((zzaktVar2.S * zzaksVar9.g) / 1000), zzaktVar2.X, zzaktVar2.m(zzagiVar, zzaksVar9, zzaktVar2.U[i68], false), 0);
                                        zzaktVar2.S++;
                                    } else {
                                        i2 = 0;
                                        z3 = true;
                                        zzaktVar2.P = 0;
                                    }
                                }
                            } else {
                                z3 = true;
                                while (true) {
                                    int i69 = zzaktVar2.S;
                                    if (i69 < zzaktVar2.T) {
                                        int[] iArr7 = zzaktVar2.U;
                                        iArr7[i69] = zzaktVar2.m(zzagiVar, zzaksVar9, iArr7[i69], true);
                                        zzaktVar2.S++;
                                    } else {
                                        i2 = 0;
                                    }
                                }
                            }
                        }
                    } else {
                        if (i44 != 165) {
                            if (i44 == 16877) {
                                zzaktVar2.i(i44);
                                zzaks zzaksVar10 = zzaktVar2.z;
                                int i70 = zzaksVar10.i;
                                if (i70 == 1685485123 || i70 == 1685480259) {
                                    byte[] bArr4 = new byte[i48];
                                    zzaksVar10.P = bArr4;
                                    i2 = 0;
                                    zzagiVar.g(0, i48, bArr4);
                                } else {
                                    zzagiVar.zzf(i48);
                                    i2 = 0;
                                }
                            } else if (i44 == 16981) {
                                i2 = 0;
                                zzaktVar2.i(i44);
                                zzaks zzaksVar11 = zzaktVar2.z;
                                byte[] bArr5 = new byte[i48];
                                zzaksVar11.k = bArr5;
                                zzagiVar.g(0, i48, bArr5);
                            } else if (i44 == 18402) {
                                i2 = 0;
                                byte[] bArr6 = new byte[i48];
                                zzagiVar.g(0, i48, bArr6);
                                zzaktVar2.i(i44);
                                zzaktVar2.z.l = new zzahs(1, bArr6, 0, 0);
                            } else if (i44 == 21419) {
                                i2 = 0;
                                zzeu zzeuVar3 = zzaktVar2.k;
                                Arrays.fill(zzeuVar3.a, (byte) 0);
                                zzagiVar.g(4 - i48, i48, zzeuVar3.a);
                                zzeuVar3.D(0);
                                zzaktVar2.B = (int) zzeuVar3.N();
                            } else if (i44 == 25506) {
                                zzaktVar2.i(i44);
                                zzaks zzaksVar12 = zzaktVar2.z;
                                byte[] bArr7 = new byte[i48];
                                zzaksVar12.m = bArr7;
                                i2 = 0;
                                zzagiVar.g(0, i48, bArr7);
                            } else {
                                if (i44 != 30322) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(i44).length() + 15);
                                    sb4.append("Unexpected id: ");
                                    sb4.append(i44);
                                    throw zzat.a(null, sb4.toString());
                                }
                                zzaktVar2.i(i44);
                                zzaks zzaksVar13 = zzaktVar2.z;
                                byte[] bArr8 = new byte[i48];
                                zzaksVar13.y = bArr8;
                                i2 = 0;
                                zzagiVar.g(0, i48, bArr8);
                            }
                        } else if (zzaktVar2.P != 2) {
                            z3 = true;
                            i2 = 0;
                        } else {
                            zzaks zzaksVar14 = (zzaks) sparseArray5.get(zzaktVar2.V);
                            if (zzaktVar2.Y == 4 && "V_VP9".equals(zzaksVar14.c)) {
                                zzeu zzeuVar4 = zzaktVar2.p;
                                zzeuVar4.y(i48);
                                i2 = 0;
                                zzagiVar.g(0, i48, zzeuVar4.a);
                            } else {
                                i2 = 0;
                                zzagiVar.zzf(i48);
                            }
                        }
                        z3 = true;
                    }
                    this.c = i2;
                    return z3;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    long j27 = this.e;
                    if (j27 != 4 && j27 != 8) {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(j27).length() + 20);
                        sb5.append("Invalid float size: ");
                        sb5.append(j27);
                        throw zzat.a(null, sb5.toString());
                    }
                    int i71 = (int) j27;
                    double intBitsToFloat = i71 == 4 ? Float.intBitsToFloat((int) r9) : Double.longBitsToDouble(d(zzagiVar, i71));
                    if (i44 == 181) {
                        zzaktVar2.i(i44);
                        zzaktVar2.z.T = (int) intBitsToFloat;
                    } else if (i44 != 17545) {
                        switch (i44) {
                            case 21969:
                                zzaktVar2.i(i44);
                                zzaktVar2.z.F = (float) intBitsToFloat;
                                break;
                            case 21970:
                                zzaktVar2.i(i44);
                                zzaktVar2.z.G = (float) intBitsToFloat;
                                break;
                            case 21971:
                                zzaktVar2.i(i44);
                                zzaktVar2.z.H = (float) intBitsToFloat;
                                break;
                            case 21972:
                                zzaktVar2.i(i44);
                                zzaktVar2.z.I = (float) intBitsToFloat;
                                break;
                            case 21973:
                                zzaktVar2.i(i44);
                                zzaktVar2.z.J = (float) intBitsToFloat;
                                break;
                            case 21974:
                                zzaktVar2.i(i44);
                                zzaktVar2.z.K = (float) intBitsToFloat;
                                break;
                            case 21975:
                                zzaktVar2.i(i44);
                                zzaktVar2.z.L = (float) intBitsToFloat;
                                break;
                            case 21976:
                                zzaktVar2.i(i44);
                                zzaktVar2.z.M = (float) intBitsToFloat;
                                break;
                            case 21977:
                                zzaktVar2.i(i44);
                                zzaktVar2.z.N = (float) intBitsToFloat;
                                break;
                            case 21978:
                                zzaktVar2.i(i44);
                                zzaktVar2.z.O = (float) intBitsToFloat;
                                break;
                            default:
                                switch (i44) {
                                    case 30323:
                                        zzaktVar2.i(i44);
                                        zzaktVar2.z.v = (float) intBitsToFloat;
                                        break;
                                    case 30324:
                                        zzaktVar2.i(i44);
                                        zzaktVar2.z.w = (float) intBitsToFloat;
                                        break;
                                    case 30325:
                                        zzaktVar2.i(i44);
                                        zzaktVar2.z.x = (float) intBitsToFloat;
                                        break;
                                }
                        }
                    } else {
                        zzaktVar2.u = (long) intBitsToFloat;
                    }
                    this.c = 0;
                    return true;
                default:
                    zzagiVar.zzf((int) this.e);
                    this.c = 0;
            }
        }
    }

    public long d(zzagi zzagiVar, int i) {
        zzagiVar.g(0, i, this.a);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j;
    }
}
