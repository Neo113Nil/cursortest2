package com.google.android.gms.internal.ads;

import android.util.LongSparseArray;
import android.util.SparseArray;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.d4a;
import defpackage.fn0;
import defpackage.ilg;
import defpackage.ljg;
import defpackage.nkk;
import defpackage.vo4;
import defpackage.x5n;
import defpackage.yz1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzakt implements zzagh {
    public static final byte[] m0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] n0;
    public static final byte[] o0;
    public static final byte[] p0;
    public static final UUID q0;
    public static final Map r0;
    public boolean A;
    public int B;
    public long C;
    public final SparseArray D;
    public boolean E;
    public long F;
    public int G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public long L;
    public long M;
    public long N;
    public boolean O;
    public int P;
    public long Q;
    public long R;
    public int S;
    public int T;
    public int[] U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public final nkk a;
    public long a0;
    public final SparseArray b;
    public int b0;
    public final LongSparseArray c;
    public int c0;
    public final boolean d;
    public int d0;
    public final boolean e;
    public boolean e0;
    public final zzanx f;
    public boolean f0;
    public final zzeu g;
    public boolean g0;
    public final zzeu h;
    public int h0;
    public final zzeu i;
    public byte i0;
    public final zzeu j;
    public boolean j0;
    public final zzeu k;
    public zzagk k0;
    public final zzeu l;
    public final vo4 l0;
    public final zzeu m;
    public final zzeu n;
    public final zzeu o;
    public final zzeu p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public zzakn y;
    public zzaks z;

    static {
        String str = zzfm.a;
        n0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        o0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        p0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        q0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        ljg.s(0, 90, "htc_video_rotA-000", "htc_video_rotA-090", hashMap);
        ljg.s(180, 270, "htc_video_rotA-180", "htc_video_rotA-270", hashMap);
        r0 = Collections.unmodifiableMap(hashMap);
    }

    public zzakt(vo4 vo4Var, int i, zzanx zzanxVar) {
        this.s = -1L;
        this.t = C.TIME_UNSET;
        this.u = C.TIME_UNSET;
        this.v = C.TIME_UNSET;
        this.F = C.TIME_UNSET;
        this.G = -1;
        this.H = -1L;
        this.I = -1L;
        this.J = -1;
        this.L = -1L;
        this.M = -1L;
        this.N = C.TIME_UNSET;
        this.l0 = vo4Var;
        vo4Var.g = new d4a(this, 29);
        this.f = zzanxVar;
        this.D = new SparseArray();
        this.d = true;
        this.e = (i & 2) == 0;
        this.a = new nkk(2, false);
        this.c = new LongSparseArray();
        this.b = new SparseArray();
        this.i = new zzeu(4);
        this.j = new zzeu(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new zzeu(4);
        this.g = new zzeu(zzgr.a);
        this.h = new zzeu(4);
        this.l = new zzeu();
        this.m = new zzeu();
        this.n = new zzeu(8);
        this.o = new zzeu();
        this.p = new zzeu();
        this.U = new int[1];
        this.x = true;
    }

    public static byte[] p(long j, long j2, String str) {
        zzguk.a(j != C.TIME_UNSET);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = zzfm.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        this.N = C.TIME_UNSET;
        this.P = 0;
        vo4 vo4Var = this.l0;
        vo4Var.c = 0;
        vo4Var.b.clear();
        nkk nkkVar = (nkk) vo4Var.f;
        nkkVar.b = 0;
        nkkVar.c = 0;
        nkk nkkVar2 = this.a;
        nkkVar2.b = 0;
        nkkVar2.c = 0;
        n();
        this.E = false;
        this.F = C.TIME_UNSET;
        this.G = -1;
        this.H = -1L;
        this.I = -1L;
        if (!this.A) {
            this.D.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            zzahu zzahuVar = ((zzaks) sparseArray.valueAt(i)).W;
            if (zzahuVar != null) {
                zzahuVar.b = false;
                zzahuVar.c = 0;
            }
            i++;
        }
    }

    public final long b(long j) {
        long j2 = this.t;
        if (j2 != C.TIME_UNSET) {
            return zzfm.w(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzat.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        yz1 yz1Var = new yz1(19);
        zzafy zzafyVar = (zzafy) zzagiVar;
        long j = zzafyVar.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        zzeu zzeuVar = (zzeu) yz1Var.c;
        zzafyVar.f(zzeuVar.a, 0, 4, false);
        long N = zzeuVar.N();
        yz1Var.b = 4;
        while (true) {
            if (N != 440786851) {
                int i = (int) j2;
                int i2 = yz1Var.b + 1;
                yz1Var.b = i2;
                if (i2 == i) {
                    break;
                }
                zzafyVar.f(zzeuVar.a, 0, 1, false);
                N = ((N << 8) & (-256)) | (zzeuVar.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            } else {
                long h = yz1Var.h(zzafyVar);
                long j3 = yz1Var.b;
                if (h != Long.MIN_VALUE) {
                    long j4 = j3 + h;
                    if (j == -1 || j4 < j) {
                        while (true) {
                            long j5 = yz1Var.b;
                            if (j5 < j4) {
                                if (yz1Var.h(zzafyVar) != Long.MIN_VALUE) {
                                    long h2 = yz1Var.h(zzafyVar);
                                    if (h2 < 0) {
                                        break;
                                    }
                                    if (h2 != 0) {
                                        int i3 = (int) h2;
                                        zzafyVar.k(i3, false);
                                        yz1Var.b += i3;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j5 == j4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        if (this.e) {
            zzagkVar = new zzaoa(zzagkVar, this.f);
        }
        this.k0 = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        int i = 0;
        this.O = false;
        while (!this.O) {
            boolean c = this.l0.c(zzagiVar);
            if (c) {
                long zzn = zzagiVar.zzn();
                if (this.K) {
                    this.M = zzn;
                    zzahhVar.a = this.L;
                    this.K = false;
                    return 1;
                }
                if (this.A) {
                    long j = this.M;
                    if (j != -1) {
                        zzahhVar.a = j;
                        this.M = -1L;
                        return 1;
                    }
                }
            }
            if (!c) {
                while (true) {
                    SparseArray sparseArray = this.b;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzaks zzaksVar = (zzaks) sparseArray.valueAt(i);
                    zzaksVar.b0.getClass();
                    zzahu zzahuVar = zzaksVar.W;
                    if (zzahuVar != null) {
                        zzahuVar.c(zzaksVar.b0, zzaksVar.l);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    public final void f() {
        if (!this.x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                zzagk zzagkVar = this.k0;
                zzagkVar.getClass();
                zzagkVar.zzv();
                this.x = false;
                return;
            }
            if (((zzaks) sparseArray.valueAt(i)).X) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void g(int i, long j) {
        boolean z;
        if (i == 136) {
            z = j == 1;
            i(i);
            this.z.Z = z;
            return;
        }
        if (i == 137) {
            h(i);
            this.y.e = j;
            return;
        }
        if (i == 145) {
            h(i);
            this.y.b = j;
            return;
        }
        if (i == 146) {
            h(i);
            this.y.c = j;
            return;
        }
        if (i == 240) {
            if (this.A) {
                return;
            }
            j(i);
            if (this.I == -1) {
                this.I = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.A) {
                return;
            }
            j(i);
            if (this.H == -1) {
                this.H = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(x5n.f(35, j));
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw zzat.a(null, sb.toString());
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(x5n.f(35, j));
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzat.a(null, sb2.toString());
        }
        if (i == 29636) {
            h(i);
            this.y.a = j;
            return;
        }
        if (i == 29637) {
            i(i);
            this.z.e = j;
            return;
        }
        switch (i) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i2 = (int) j;
                if (i2 == 1) {
                    i(i);
                    this.z.f = 2;
                    return;
                }
                if (i2 == 2) {
                    i(i);
                    this.z.f = 1;
                    return;
                } else if (i2 == 17) {
                    i(i);
                    this.z.f = 3;
                    return;
                } else if (i2 != 33) {
                    i(i);
                    this.z.f = -1;
                    return;
                } else {
                    i(i);
                    this.z.f = 5;
                    return;
                }
            case 152:
                z = j == 1;
                h(i);
                this.y.d = z;
                return;
            case 155:
                this.R = b(j);
                return;
            case 159:
                i(i);
                this.z.Q = (int) j;
                return;
            case 176:
                i(i);
                this.z.o = (int) j;
                return;
            case 179:
                if (this.A) {
                    return;
                }
                j(i);
                this.F = b(j);
                return;
            case 186:
                i(i);
                this.z.p = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                i(i);
                this.z.d = (int) j;
                return;
            case 231:
                this.N = b(j);
                return;
            case 238:
                this.Y = (int) j;
                return;
            case 247:
                if (this.A) {
                    return;
                }
                j(i);
                this.G = (int) j;
                return;
            case 251:
                this.Z = true;
                return;
            case 16871:
                i(i);
                this.z.i = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(x5n.f(30, j));
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw zzat.a(null, sb3.toString());
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzat.a(null, fn0.l(j, "DocTypeReadVersion ", " not supported", new StringBuilder(String.valueOf(j).length() + 33)));
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(x5n.f(30, j));
                sb4.append("EBMLReadVersion ");
                sb4.append(j);
                sb4.append(" not supported");
                throw zzat.a(null, sb4.toString());
            case 18401:
                if (j != 5) {
                    throw zzat.a(null, fn0.l(j, "ContentEncAlgo ", " not supported", new StringBuilder(String.valueOf(j).length() + 29)));
                }
                return;
            case 18408:
                if (j != 1) {
                    throw zzat.a(null, fn0.l(j, "AESSettingsCipherMode ", " not supported", new StringBuilder(String.valueOf(j).length() + 36)));
                }
                return;
            case 21420:
                this.C = j + this.s;
                return;
            case 21432:
                int i3 = (int) j;
                i(i);
                if (i3 == 0) {
                    this.z.z = 0;
                    return;
                }
                if (i3 == 1) {
                    this.z.z = 2;
                    return;
                } else if (i3 == 3) {
                    this.z.z = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.z.z = 3;
                    return;
                }
            case 21680:
                i(i);
                this.z.r = (int) j;
                return;
            case 21682:
                i(i);
                this.z.t = (int) j;
                return;
            case 21690:
                i(i);
                this.z.s = (int) j;
                return;
            case 21930:
                z = j == 1;
                i(i);
                this.z.Y = z;
                return;
            case 21938:
                i(i);
                this.z.q = (int) j;
                return;
            case 21998:
                i(i);
                this.z.h = (int) j;
                return;
            case 22186:
                i(i);
                this.z.U = j;
                return;
            case 22203:
                i(i);
                this.z.V = j;
                return;
            case 25188:
                i(i);
                this.z.R = (int) j;
                return;
            case 30114:
                this.a0 = j;
                return;
            case 30321:
                int i4 = (int) j;
                i(i);
                if (i4 == 0) {
                    this.z.u = 0;
                    return;
                }
                if (i4 == 1) {
                    this.z.u = 1;
                    return;
                } else if (i4 == 2) {
                    this.z.u = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.z.u = 3;
                    return;
                }
            case 2352003:
                i(i);
                this.z.g = (int) j;
                return;
            case 2807729:
                this.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i5 = (int) j;
                        i(i);
                        if (i5 == 1) {
                            this.z.C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.z.C = 1;
                            return;
                        }
                    case 21946:
                        i(i);
                        int c = zzi.c((int) j);
                        if (c != -1) {
                            this.z.B = c;
                            return;
                        }
                        return;
                    case 21947:
                        i(i);
                        int b = zzi.b((int) j);
                        if (b != -1) {
                            this.z.A = b;
                            return;
                        }
                        return;
                    case 21948:
                        i(i);
                        this.z.D = (int) j;
                        return;
                    case 21949:
                        i(i);
                        this.z.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void h(int i) {
        if (this.y != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in an EditionEntry");
        throw zzat.a(null, sb.toString());
    }

    public final void i(int i) {
        if (this.z != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw zzat.a(null, sb.toString());
    }

    public final void j(int i) {
        if (this.E) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw zzat.a(null, sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0096, code lost:
    
        r2 = p(r10, com.ironsource.Ua.s, "%01d:%02d:%02d:%02d");
        r3 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0094, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(zzaks zzaksVar, long j, int i, int i2, int i3) {
        byte[] p;
        int i4;
        int i5;
        int i6;
        zzahu zzahuVar = zzaksVar.W;
        if (zzahuVar != null) {
            zzahuVar.b(zzaksVar.b0, j, i, i2, i3, zzaksVar.l);
        } else {
            String str = zzaksVar.c;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.T > 1) {
                    zzeh.c("Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.R;
                    if (j2 != C.TIME_UNSET) {
                        zzeu zzeuVar = this.m;
                        byte[] bArr = zzeuVar.a;
                        switch (str.hashCode()) {
                            case 738597099:
                                break;
                            case 738614379:
                                break;
                            case 1045209816:
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    p = p(j2, 1000L, "%02d:%02d:%02d.%03d");
                                    i4 = 25;
                                    System.arraycopy(p, 0, bArr, i4, p.length);
                                    i5 = zzeuVar.b;
                                    while (true) {
                                        if (i5 < zzeuVar.c) {
                                            if (zzeuVar.a[i5] == 0) {
                                                zzeuVar.C(i5);
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                    zzaksVar.b0.b(zzeuVar.c, zzeuVar);
                                    i6 = i2 + zzeuVar.c;
                                    if ((i & 268435456) != 0) {
                                        int i7 = this.T;
                                        zzeu zzeuVar2 = this.p;
                                        if (i7 > 1) {
                                            zzeuVar2.y(0);
                                        } else {
                                            int i8 = zzeuVar2.c;
                                            zzaksVar.b0.g(zzeuVar2, i8, 2);
                                            i6 += i8;
                                        }
                                    }
                                    zzaksVar.b0.f(j, i, i6, i3, zzaksVar.l);
                                    break;
                                }
                                ilg.c();
                                break;
                            case 1422270023:
                                if (str.equals("S_TEXT/UTF8")) {
                                    p = p(j2, 1000L, "%02d:%02d:%02d,%03d");
                                    i4 = 19;
                                    System.arraycopy(p, 0, bArr, i4, p.length);
                                    i5 = zzeuVar.b;
                                    while (true) {
                                        if (i5 < zzeuVar.c) {
                                        }
                                        i5++;
                                    }
                                    zzaksVar.b0.b(zzeuVar.c, zzeuVar);
                                    i6 = i2 + zzeuVar.c;
                                    if ((i & 268435456) != 0) {
                                    }
                                    zzaksVar.b0.f(j, i, i6, i3, zzaksVar.l);
                                    break;
                                }
                                ilg.c();
                                break;
                            default:
                                ilg.c();
                                break;
                        }
                    }
                    zzeh.c("Skipping subtitle sample with no duration.");
                }
            }
            i6 = i2;
            if ((i & 268435456) != 0) {
            }
            zzaksVar.b0.f(j, i, i6, i3, zzaksVar.l);
        }
        this.O = true;
    }

    public final void l(zzagi zzagiVar, int i) {
        zzeu zzeuVar = this.i;
        if (zzeuVar.c >= i) {
            return;
        }
        byte[] bArr = zzeuVar.a;
        if (bArr.length < i) {
            int length = bArr.length;
            zzeuVar.A(Math.max(length + length, i));
        }
        byte[] bArr2 = zzeuVar.a;
        int i2 = zzeuVar.c;
        zzagiVar.g(i2, i - i2, bArr2);
        zzeuVar.C(i);
    }

    public final int m(zzagi zzagiVar, zzaks zzaksVar, int i, boolean z) {
        int d;
        int d2;
        int i2;
        int i3;
        String str = zzaksVar.c;
        if ("S_TEXT/UTF8".equals(str)) {
            o(zzagiVar, m0, i);
            int i4 = this.c0;
            n();
            return i4;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            o(zzagiVar, o0, i);
            int i5 = this.c0;
            n();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            o(zzagiVar, p0, i);
            int i6 = this.c0;
            n();
            return i6;
        }
        if (zzaksVar.X) {
            zzv zzvVar = zzaksVar.c0;
            zzvVar.getClass();
            zzv e = zzagg.e(zzagiVar, i, zzvVar);
            zzaksVar.c0 = e;
            zzaksVar.b0.e(e);
            zzaksVar.X = false;
            f();
        }
        zzaht zzahtVar = zzaksVar.b0;
        boolean z2 = this.e0;
        zzeu zzeuVar = this.l;
        int i7 = 2;
        if (!z2) {
            boolean z3 = zzaksVar.j;
            zzeu zzeuVar2 = this.i;
            if (z3) {
                this.X &= -1073741825;
                if (!this.f0) {
                    zzagiVar.g(0, 1, zzeuVar2.a);
                    this.b0++;
                    byte b = zzeuVar2.a[0];
                    if ((b & 128) == 128) {
                        throw zzat.a(null, "Extension bit is set in signal byte");
                    }
                    this.i0 = b;
                    this.f0 = true;
                }
                byte b2 = this.i0;
                if ((b2 & 1) == 1) {
                    int i8 = b2 & 2;
                    this.X |= 1073741824;
                    if (!this.j0) {
                        zzeu zzeuVar3 = this.n;
                        zzagiVar.g(0, 8, zzeuVar3.a);
                        this.b0 += 8;
                        this.j0 = true;
                        zzeuVar2.a[0] = (byte) ((i8 != 2 ? 0 : 128) | 8);
                        zzeuVar2.D(0);
                        zzahtVar.g(zzeuVar2, 1, 1);
                        this.c0++;
                        zzeuVar3.D(0);
                        zzahtVar.g(zzeuVar3, 8, 1);
                        this.c0 += 8;
                    }
                    if (i8 == 2) {
                        if (!this.g0) {
                            zzagiVar.g(0, 1, zzeuVar2.a);
                            this.b0++;
                            zzeuVar2.D(0);
                            this.h0 = zzeuVar2.I();
                            this.g0 = true;
                        }
                        int i9 = this.h0 * 4;
                        zzeuVar2.y(i9);
                        zzagiVar.g(0, i9, zzeuVar2.a);
                        this.b0 += i9;
                        int i10 = (this.h0 >> 1) + 1;
                        int i11 = (i10 * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i11) {
                            this.q = ByteBuffer.allocate(i11);
                        }
                        this.q.position(0);
                        this.q.putShort((short) i10);
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i3 = this.h0;
                            if (i12 >= i3) {
                                break;
                            }
                            int h = zzeuVar2.h();
                            int i14 = h - i13;
                            int i15 = i12 % 2;
                            int i16 = i7;
                            ByteBuffer byteBuffer2 = this.q;
                            if (i15 == 0) {
                                byteBuffer2.putShort((short) i14);
                            } else {
                                byteBuffer2.putInt(i14);
                            }
                            i12++;
                            i13 = h;
                            i7 = i16;
                        }
                        i2 = i7;
                        int i17 = (i - this.b0) - i13;
                        int i18 = i3 & 1;
                        ByteBuffer byteBuffer3 = this.q;
                        if (i18 == 1) {
                            byteBuffer3.putInt(i17);
                        } else {
                            byteBuffer3.putShort((short) i17);
                            this.q.putInt(0);
                        }
                        byte[] array = this.q.array();
                        zzeu zzeuVar4 = this.o;
                        zzeuVar4.z(i11, array);
                        zzahtVar.g(zzeuVar4, i11, 1);
                        this.c0 += i11;
                    }
                }
                i2 = 2;
            } else {
                i2 = 2;
                byte[] bArr = zzaksVar.k;
                if (bArr != null) {
                    zzeuVar.z(bArr.length, bArr);
                }
            }
            if (!"A_OPUS".equals(zzaksVar.c) ? zzaksVar.h > 0 : z) {
                this.X |= 268435456;
                this.p.y(0);
                int i19 = (zzeuVar.c + i) - this.b0;
                zzeuVar2.y(4);
                byte[] bArr2 = zzeuVar2.a;
                bArr2[0] = (byte) ((i19 >> 24) & 255);
                bArr2[1] = (byte) ((i19 >> 16) & 255);
                bArr2[i2] = (byte) ((i19 >> 8) & 255);
                bArr2[3] = (byte) (i19 & 255);
                zzahtVar.g(zzeuVar2, 4, i2);
                this.c0 += 4;
            }
            this.e0 = true;
        }
        int i20 = i + zzeuVar.c;
        String str2 = zzaksVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzaksVar.W != null) {
                zzguk.f(zzeuVar.c == 0);
                zzaksVar.W.a(zzagiVar);
            }
            while (true) {
                int i21 = this.b0;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int B = zzeuVar.B();
                if (B > 0) {
                    d2 = Math.min(i22, B);
                    zzahtVar.b(d2, zzeuVar);
                } else {
                    d2 = zzahtVar.d(zzagiVar, i22, false);
                }
                this.b0 += d2;
                this.c0 += d2;
            }
        } else {
            zzeu zzeuVar5 = this.h;
            byte[] bArr3 = zzeuVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i23 = zzaksVar.d0;
            int i24 = 4 - i23;
            while (this.b0 < i20) {
                int i25 = this.d0;
                if (i25 == 0) {
                    int min = Math.min(i23, zzeuVar.B());
                    zzagiVar.g(i24 + min, i23 - min, bArr3);
                    if (min > 0) {
                        zzeuVar.F(i24, min, bArr3);
                    }
                    this.b0 += i23;
                    zzeuVar5.D(0);
                    this.d0 = zzeuVar5.h();
                    zzeu zzeuVar6 = this.g;
                    zzeuVar6.D(0);
                    zzahtVar.b(4, zzeuVar6);
                    this.c0 += 4;
                } else {
                    int B2 = zzeuVar.B();
                    if (B2 > 0) {
                        d = Math.min(i25, B2);
                        zzahtVar.b(d, zzeuVar);
                    } else {
                        d = zzahtVar.d(zzagiVar, i25, false);
                    }
                    this.b0 += d;
                    this.c0 += d;
                    this.d0 -= d;
                }
            }
        }
        if ("A_VORBIS".equals(zzaksVar.c)) {
            zzeu zzeuVar7 = this.j;
            zzeuVar7.D(0);
            zzahtVar.b(4, zzeuVar7);
            this.c0 += 4;
        }
        int i26 = this.c0;
        n();
        return i26;
    }

    public final void n() {
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = false;
        this.f0 = false;
        this.g0 = false;
        this.h0 = 0;
        this.i0 = (byte) 0;
        this.j0 = false;
        this.l.y(0);
    }

    public final void o(zzagi zzagiVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        zzeu zzeuVar = this.m;
        byte[] bArr2 = zzeuVar.a;
        if (bArr2.length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzeuVar.z(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        zzagiVar.g(length, i, zzeuVar.a);
        zzeuVar.D(0);
        zzeuVar.C(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Deprecated
    public zzakt() {
        this(new vo4(2), 2, zzanx.G7);
    }
}
