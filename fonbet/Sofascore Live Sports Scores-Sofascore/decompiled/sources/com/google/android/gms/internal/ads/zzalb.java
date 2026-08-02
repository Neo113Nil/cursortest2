package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.fn0;
import defpackage.qgn;
import defpackage.rgn;
import defpackage.vgn;
import defpackage.wgn;
import defpackage.xgn;
import java.io.EOFException;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzalb implements zzagh {
    public final zzeu a;
    public final zzahe b;
    public final zzaha c;
    public final zzahc d;
    public zzagk e;
    public zzaht f;
    public zzaht g;
    public int h;
    public zzap i;
    public zzap j;
    public long k;
    public long l;
    public long m;
    public long n;
    public int o;
    public vgn p;
    public boolean q;

    public zzalb(int i) {
        this.a = new zzeu(10);
        this.b = new zzahe();
        this.c = new zzaha();
        this.k = C.TIME_UNSET;
        this.d = new zzahc();
        this.g = new zzage();
        this.n = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        this.h = 0;
        this.k = C.TIME_UNSET;
        this.l = 0L;
        this.o = 0;
        this.n = -1L;
    }

    public final boolean b(zzagi zzagiVar, boolean z) {
        int i;
        int i2;
        int a;
        zzagiVar.zzl();
        if (zzagiVar.zzn() == 0) {
            zzap a2 = this.d.a(zzagiVar, null, 131072);
            this.i = a2;
            if (a2 != null) {
                this.c.a(a2);
            }
            i = (int) zzagiVar.zzm();
            if (!z) {
                zzagiVar.zzf(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!f(zzagiVar)) {
                zzeu zzeuVar = this.a;
                zzeuVar.D(0);
                int b = zzeuVar.b();
                if ((i2 == 0 || ((-128000) & b) == (i2 & (-128000))) && (a = zzahf.a(b)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.b.a(b);
                        i2 = b;
                    }
                    zzagiVar.d(a - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == 131072) {
                        if (z) {
                            return false;
                        }
                        g();
                        a70.q();
                        return false;
                    }
                    if (z) {
                        zzagiVar.zzl();
                        zzagiVar.d(i + i5);
                    } else {
                        zzagiVar.zzf(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i2 = 0;
                }
            } else if (i3 <= 0) {
                g();
                a70.q();
                return false;
            }
        }
        if (z) {
            zzagiVar.zzf(i + i4);
        } else {
            zzagiVar.zzl();
        }
        this.h = i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        return b(zzagiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.e = zzagkVar;
        zzaht b = zzagkVar.b(0, 1);
        this.f = b;
        this.g = b;
        this.e.zzv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0390, code lost:
    
        if (defpackage.dho.a.zza(r10) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03c6, code lost:
    
        if (((com.google.android.gms.internal.ads.zzake) r9).a.equals("TLEN") != false) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x036f  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        long j;
        int i;
        zzaha zzahaVar;
        int i2;
        int b;
        long[] jArr;
        int i3;
        int i4;
        int i5;
        zzald zzaldVar;
        int i6;
        vgn qgnVar;
        zzap zzapVar;
        zzao zzaoVar;
        zzao zzaoVar2;
        int i7;
        long u;
        vgn rgnVar;
        vgn vgnVar;
        zzap zzapVar2;
        int I;
        this.f.getClass();
        String str = zzfm.a;
        if (this.h == 0) {
            try {
                b(zzagiVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        vgn vgnVar2 = this.p;
        zzeu zzeuVar = this.a;
        zzahe zzaheVar = this.b;
        if (vgnVar2 == null) {
            zzeu zzeuVar2 = new zzeu(zzaheVar.c);
            zzagiVar.h(0, zzaheVar.c, zzeuVar2.a);
            int i8 = zzaheVar.a & 1;
            int i9 = zzaheVar.e;
            int i10 = 21;
            if (i8 != 0) {
                if (i9 != 1) {
                    i10 = 36;
                }
            } else if (i9 == 1) {
                i10 = 13;
            }
            int i11 = zzeuVar2.c;
            int i12 = i10 + 4;
            long j2 = 0;
            j = C.TIME_UNSET;
            if (i11 >= i12) {
                zzeuVar2.D(i10);
                i = zzeuVar2.b();
                if (i != 1483304551) {
                    if (i == 1231971951) {
                        i = 1231971951;
                    }
                }
                zzahaVar = this.c;
                if (i != 1231971951) {
                    if (i == 1447187017) {
                        long zzo = zzagiVar.zzo();
                        long zzn = zzagiVar.zzn();
                        zzeuVar2.E(6);
                        int b2 = zzeuVar2.b();
                        i2 = 0;
                        long j3 = zzaheVar.c;
                        long j4 = b2;
                        if (zzeuVar2.b() > 0) {
                            long v = zzfm.v(zzaheVar.d, (r11 * zzaheVar.g) - 1);
                            int J = zzeuVar2.J();
                            int J2 = zzeuVar2.J();
                            int J3 = zzeuVar2.J();
                            zzeuVar2.E(2);
                            long j5 = zzn + zzaheVar.c;
                            long[] jArr2 = new long[J];
                            long[] jArr3 = new long[J];
                            long j6 = j5;
                            int i13 = 0;
                            while (i13 < J) {
                                long j7 = j4;
                                int i14 = i13;
                                jArr2[i14] = (i13 * v) / J;
                                jArr3[i14] = j6;
                                if (J3 == 1) {
                                    I = zzeuVar2.I();
                                } else if (J3 == 2) {
                                    I = zzeuVar2.J();
                                } else if (J3 == 3) {
                                    I = zzeuVar2.M();
                                } else if (J3 == 4) {
                                    I = zzeuVar2.h();
                                }
                                j6 += I * J2;
                                i13 = i14 + 1;
                                j4 = j7;
                                J = J;
                                J2 = J2;
                            }
                            long j8 = zzn + j3 + j4;
                            if (zzo != -1 && zzo != j8) {
                                StringBuilder sb = new StringBuilder(String.valueOf(zzo).length() + 27 + String.valueOf(j8).length());
                                fn0.t(zzo, "VBRI data size mismatch: ", ", ", sb);
                                sb.append(j8);
                                zzeh.c(sb.toString());
                            }
                            if (j8 != j6) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + String.valueOf(j8).length() + 43 + 28);
                                fn0.t(j8, "VBRI bytes and ToC mismatch (using max): ", ", ", sb2);
                                sb2.append(j6);
                                sb2.append("\nSeeking will be inaccurate.");
                                zzeh.c(sb2.toString());
                                j8 = Math.max(j8, j6);
                            }
                            qgnVar = new wgn(jArr2, jArr3, v, j8, zzaheVar.f);
                            zzagiVar.zzf(zzaheVar.c);
                            zzapVar = this.i;
                            long zzn2 = zzagiVar.zzn();
                            if (zzapVar != null) {
                            }
                            rgnVar = null;
                            if (this.q) {
                            }
                            this.p = vgnVar;
                            this.e.c(vgnVar);
                            zzapVar2 = this.i;
                            zzap zzapVar3 = this.j;
                            if (zzapVar2 != null) {
                            }
                            zzt zztVar = new zzt();
                            zztVar.c(MimeTypes.AUDIO_MPEG);
                            zztVar.d(zzaheVar.b);
                            zztVar.o = 4096;
                            zztVar.G = zzaheVar.e;
                            zztVar.I = zzaheVar.d;
                            zztVar.K = zzahaVar.a;
                            zztVar.L = zzahaVar.b;
                            zztVar.k = zzapVar2;
                            if (this.p.zzh() != -2147483647) {
                            }
                            this.g.e(new zzv(zztVar));
                            this.m = zzagiVar.zzn();
                        }
                        qgnVar = null;
                        zzagiVar.zzf(zzaheVar.c);
                        zzapVar = this.i;
                        long zzn22 = zzagiVar.zzn();
                        if (zzapVar != null) {
                        }
                        rgnVar = null;
                        if (this.q) {
                        }
                        this.p = vgnVar;
                        this.e.c(vgnVar);
                        zzapVar2 = this.i;
                        zzap zzapVar32 = this.j;
                        if (zzapVar2 != null) {
                        }
                        zzt zztVar2 = new zzt();
                        zztVar2.c(MimeTypes.AUDIO_MPEG);
                        zztVar2.d(zzaheVar.b);
                        zztVar2.o = 4096;
                        zztVar2.G = zzaheVar.e;
                        zztVar2.I = zzaheVar.d;
                        zztVar2.K = zzahaVar.a;
                        zztVar2.L = zzahaVar.b;
                        zztVar2.k = zzapVar2;
                        if (this.p.zzh() != -2147483647) {
                        }
                        this.g.e(new zzv(zztVar2));
                        this.m = zzagiVar.zzn();
                    } else if (i != 1483304551) {
                        zzagiVar.zzl();
                        i2 = 0;
                        qgnVar = null;
                        zzapVar = this.i;
                        long zzn222 = zzagiVar.zzn();
                        if (zzapVar != null) {
                            zzao[] zzaoVarArr = zzapVar.a;
                            int length = zzaoVarArr.length;
                            int i15 = i2;
                            while (true) {
                                if (i15 >= length) {
                                    zzaoVar = null;
                                    break;
                                }
                                zzao zzaoVar3 = zzaoVarArr[i15];
                                if (zzakc.class.isAssignableFrom(zzaoVar3.getClass())) {
                                    zzaoVar = (zzao) zzakc.class.cast(zzaoVar3);
                                }
                                zzaoVar = null;
                                if (zzaoVar != null) {
                                    break;
                                }
                                i15++;
                            }
                            zzakc zzakcVar = (zzakc) zzaoVar;
                            if (zzakcVar != null) {
                                zzao[] zzaoVarArr2 = zzapVar.a;
                                int length2 = zzaoVarArr2.length;
                                int i16 = i2;
                                while (true) {
                                    if (i16 >= length2) {
                                        zzaoVar2 = null;
                                        break;
                                    }
                                    zzao zzaoVar4 = zzaoVarArr2[i16];
                                    if (zzake.class.isAssignableFrom(zzaoVar4.getClass())) {
                                        zzaoVar2 = (zzao) zzake.class.cast(zzaoVar4);
                                    }
                                    zzaoVar2 = null;
                                    if (zzaoVar2 != null) {
                                        break;
                                    }
                                    i16++;
                                }
                                zzake zzakeVar = (zzake) zzaoVar2;
                                if (zzakeVar == null) {
                                    u = -9223372036854775807L;
                                    i7 = i2;
                                } else {
                                    i7 = i2;
                                    u = zzfm.u(Long.parseLong((String) zzakeVar.c.get(i7)));
                                }
                                int[] iArr = zzakcVar.e;
                                int length3 = iArr.length;
                                int i17 = length3 + 1;
                                long[] jArr4 = new long[i17];
                                long[] jArr5 = new long[i17];
                                jArr4[i7] = zzn222;
                                jArr5[i7] = 0;
                                int i18 = 1;
                                while (i18 <= length3) {
                                    int i19 = i18 - 1;
                                    long j9 = zzn222 + zzakcVar.c + iArr[i19];
                                    j2 += zzakcVar.d + zzakcVar.f[i19];
                                    jArr4[i18] = j9;
                                    jArr5[i18] = j2;
                                    i18++;
                                    iArr = iArr;
                                    zzn222 = j9;
                                }
                                rgnVar = new rgn(jArr4, jArr5, u);
                                if (this.q) {
                                    vgn vgnVar3 = rgnVar != null ? rgnVar : qgnVar == null ? null : qgnVar;
                                    if (vgnVar3 == null) {
                                        zzagiVar.h(0, 4, zzeuVar.a);
                                        zzeuVar.D(0);
                                        zzaheVar.a(zzeuVar.b());
                                        vgnVar = new qgn(zzagiVar.zzo(), zzagiVar.zzn(), zzaheVar.f, zzaheVar.c, true);
                                    } else {
                                        vgnVar = vgnVar3;
                                    }
                                    zzaht zzahtVar = this.f;
                                    vgnVar.zza();
                                    zzahtVar.getClass();
                                } else {
                                    vgnVar = new zzale();
                                }
                                this.p = vgnVar;
                                this.e.c(vgnVar);
                                zzapVar2 = this.i;
                                zzap zzapVar322 = this.j;
                                if (zzapVar2 != null) {
                                    zzapVar2 = zzapVar322;
                                } else if (zzapVar322 != null) {
                                    zzapVar2 = zzapVar2.a(zzapVar322);
                                }
                                zzt zztVar22 = new zzt();
                                zztVar22.c(MimeTypes.AUDIO_MPEG);
                                zztVar22.d(zzaheVar.b);
                                zztVar22.o = 4096;
                                zztVar22.G = zzaheVar.e;
                                zztVar22.I = zzaheVar.d;
                                zztVar22.K = zzahaVar.a;
                                zztVar22.L = zzahaVar.b;
                                zztVar22.k = zzapVar2;
                                if (this.p.zzh() != -2147483647) {
                                    zztVar22.h = this.p.zzh();
                                }
                                this.g.e(new zzv(zztVar22));
                                this.m = zzagiVar.zzn();
                            }
                        }
                        rgnVar = null;
                        if (this.q) {
                        }
                        this.p = vgnVar;
                        this.e.c(vgnVar);
                        zzapVar2 = this.i;
                        zzap zzapVar3222 = this.j;
                        if (zzapVar2 != null) {
                        }
                        zzt zztVar222 = new zzt();
                        zztVar222.c(MimeTypes.AUDIO_MPEG);
                        zztVar222.d(zzaheVar.b);
                        zztVar222.o = 4096;
                        zztVar222.G = zzaheVar.e;
                        zztVar222.I = zzaheVar.d;
                        zztVar222.K = zzahaVar.a;
                        zztVar222.L = zzahaVar.b;
                        zztVar222.k = zzapVar2;
                        if (this.p.zzh() != -2147483647) {
                        }
                        this.g.e(new zzv(zztVar222));
                        this.m = zzagiVar.zzn();
                    }
                }
                i2 = 0;
                b = zzeuVar2.b();
                int h = (b & 1) != 0 ? zzeuVar2.h() : -1;
                long N = (b & 2) != 0 ? zzeuVar2.N() : -1L;
                if ((b & 4) == 4) {
                    long[] jArr6 = new long[100];
                    int i20 = 0;
                    while (i20 < 100) {
                        jArr6[i20] = zzeuVar2.I();
                        i20++;
                        i = i;
                    }
                    jArr = jArr6;
                } else {
                    jArr = null;
                }
                i3 = i;
                if ((b & 8) != 0) {
                    zzeuVar2.E(4);
                }
                if (zzeuVar2.B() >= 24) {
                    zzeuVar2.E(11);
                    float intBitsToFloat = Float.intBitsToFloat(zzeuVar2.b());
                    int J4 = zzeuVar2.J();
                    int J5 = zzeuVar2.J();
                    zzalc a = zzalc.a(J4);
                    zzalc a2 = zzalc.a(J5);
                    zzaldVar = (intBitsToFloat <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a == null && a2 == null) ? null : new zzald(intBitsToFloat, a, a2);
                    zzeuVar2.E(2);
                    int M = zzeuVar2.M();
                    i5 = M >> 12;
                    i4 = M & 4095;
                } else {
                    i4 = -1;
                    i5 = -1;
                    zzaldVar = null;
                }
                long j10 = h;
                zzahe zzaheVar2 = new zzahe();
                zzaheVar2.a = zzaheVar.a;
                zzaheVar2.b = zzaheVar.b;
                zzaheVar2.c = zzaheVar.c;
                zzaheVar2.d = zzaheVar.d;
                zzaheVar2.e = zzaheVar.e;
                zzaheVar2.f = zzaheVar.f;
                zzaheVar2.g = zzaheVar.g;
                if ((zzahaVar.a != -1 || zzahaVar.b == -1) && i5 != -1 && i4 != -1) {
                    zzahaVar.a = i5;
                    zzahaVar.b = i4;
                }
                this.j = zzaldVar != null ? new zzap(zzaldVar) : null;
                long zzn3 = zzagiVar.zzn();
                zzagiVar.zzf(zzaheVar.c);
                if (i3 == 1483304551) {
                    long zzo2 = zzagiVar.zzo();
                    long v2 = (j10 == -1 || j10 == 0) ? -9223372036854775807L : zzfm.v(zzaheVar2.d, (j10 * zzaheVar2.g) - 1);
                    if (v2 != C.TIME_UNSET) {
                        if (N != -1 && zzo2 != -1 && zzn3 + N != zzo2) {
                            long j11 = zzo2 - zzn3;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(N).length() + String.valueOf(j11).length() + 53 + 23);
                            fn0.t(j11, "Data size mismatch between stream (", ") and Xing frame (", sb3);
                            sb3.append(N);
                            sb3.append("), using smaller value.");
                            zzeh.b(sb3.toString());
                            N = Math.min(N, j11);
                        }
                        qgnVar = new xgn(zzn3, zzaheVar2.c, v2, zzaheVar2.f, N, jArr);
                        zzapVar = this.i;
                        long zzn2222 = zzagiVar.zzn();
                        if (zzapVar != null) {
                        }
                        rgnVar = null;
                        if (this.q) {
                        }
                        this.p = vgnVar;
                        this.e.c(vgnVar);
                        zzapVar2 = this.i;
                        zzap zzapVar32222 = this.j;
                        if (zzapVar2 != null) {
                        }
                        zzt zztVar2222 = new zzt();
                        zztVar2222.c(MimeTypes.AUDIO_MPEG);
                        zztVar2222.d(zzaheVar.b);
                        zztVar2222.o = 4096;
                        zztVar2222.G = zzaheVar.e;
                        zztVar2222.I = zzaheVar.d;
                        zztVar2222.K = zzahaVar.a;
                        zztVar2222.L = zzahaVar.b;
                        zztVar2222.k = zzapVar2;
                        if (this.p.zzh() != -2147483647) {
                        }
                        this.g.e(new zzv(zztVar2222));
                        this.m = zzagiVar.zzn();
                    }
                    qgnVar = null;
                    zzapVar = this.i;
                    long zzn22222 = zzagiVar.zzn();
                    if (zzapVar != null) {
                    }
                    rgnVar = null;
                    if (this.q) {
                    }
                    this.p = vgnVar;
                    this.e.c(vgnVar);
                    zzapVar2 = this.i;
                    zzap zzapVar322222 = this.j;
                    if (zzapVar2 != null) {
                    }
                    zzt zztVar22222 = new zzt();
                    zztVar22222.c(MimeTypes.AUDIO_MPEG);
                    zztVar22222.d(zzaheVar.b);
                    zztVar22222.o = 4096;
                    zztVar22222.G = zzaheVar.e;
                    zztVar22222.I = zzaheVar.d;
                    zztVar22222.K = zzahaVar.a;
                    zztVar22222.L = zzahaVar.b;
                    zztVar22222.k = zzapVar2;
                    if (this.p.zzh() != -2147483647) {
                    }
                    this.g.e(new zzv(zztVar22222));
                    this.m = zzagiVar.zzn();
                } else {
                    long zzo3 = zzagiVar.zzo();
                    long v3 = (j10 == -1 || j10 == 0) ? -9223372036854775807L : zzfm.v(zzaheVar2.d, (zzaheVar2.g * j10) - 1);
                    if (v3 != C.TIME_UNSET) {
                        if (N != -1) {
                            zzo3 = zzn3 + N;
                            i6 = zzaheVar2.c;
                        } else if (zzo3 != -1) {
                            N = zzo3 - zzn3;
                            i6 = zzaheVar2.c;
                        }
                        long j12 = N - i6;
                        long j13 = zzo3;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        qgnVar = new qgn(j13, zzn3 + zzaheVar2.c, zzhbj.a(zzfm.w(j12, 8000000L, v3, roundingMode)), zzhbj.a(zzhbb.a(j12, j10, roundingMode)), true);
                        zzapVar = this.i;
                        long zzn222222 = zzagiVar.zzn();
                        if (zzapVar != null) {
                        }
                        rgnVar = null;
                        if (this.q) {
                        }
                        this.p = vgnVar;
                        this.e.c(vgnVar);
                        zzapVar2 = this.i;
                        zzap zzapVar3222222 = this.j;
                        if (zzapVar2 != null) {
                        }
                        zzt zztVar222222 = new zzt();
                        zztVar222222.c(MimeTypes.AUDIO_MPEG);
                        zztVar222222.d(zzaheVar.b);
                        zztVar222222.o = 4096;
                        zztVar222222.G = zzaheVar.e;
                        zztVar222222.I = zzaheVar.d;
                        zztVar222222.K = zzahaVar.a;
                        zztVar222222.L = zzahaVar.b;
                        zztVar222222.k = zzapVar2;
                        if (this.p.zzh() != -2147483647) {
                        }
                        this.g.e(new zzv(zztVar222222));
                        this.m = zzagiVar.zzn();
                    }
                    qgnVar = null;
                    zzapVar = this.i;
                    long zzn2222222 = zzagiVar.zzn();
                    if (zzapVar != null) {
                    }
                    rgnVar = null;
                    if (this.q) {
                    }
                    this.p = vgnVar;
                    this.e.c(vgnVar);
                    zzapVar2 = this.i;
                    zzap zzapVar32222222 = this.j;
                    if (zzapVar2 != null) {
                    }
                    zzt zztVar2222222 = new zzt();
                    zztVar2222222.c(MimeTypes.AUDIO_MPEG);
                    zztVar2222222.d(zzaheVar.b);
                    zztVar2222222.o = 4096;
                    zztVar2222222.G = zzaheVar.e;
                    zztVar2222222.I = zzaheVar.d;
                    zztVar2222222.K = zzahaVar.a;
                    zztVar2222222.L = zzahaVar.b;
                    zztVar2222222.k = zzapVar2;
                    if (this.p.zzh() != -2147483647) {
                    }
                    this.g.e(new zzv(zztVar2222222));
                    this.m = zzagiVar.zzn();
                }
            }
            if (zzeuVar2.c >= 40) {
                zzeuVar2.D(36);
                if (zzeuVar2.b() == 1447187017) {
                    i = 1447187017;
                    zzahaVar = this.c;
                    if (i != 1231971951) {
                    }
                    i2 = 0;
                    b = zzeuVar2.b();
                    if ((b & 1) != 0) {
                    }
                    if ((b & 2) != 0) {
                    }
                    if ((b & 4) == 4) {
                    }
                    i3 = i;
                    if ((b & 8) != 0) {
                    }
                    if (zzeuVar2.B() >= 24) {
                    }
                    long j102 = h;
                    zzahe zzaheVar22 = new zzahe();
                    zzaheVar22.a = zzaheVar.a;
                    zzaheVar22.b = zzaheVar.b;
                    zzaheVar22.c = zzaheVar.c;
                    zzaheVar22.d = zzaheVar.d;
                    zzaheVar22.e = zzaheVar.e;
                    zzaheVar22.f = zzaheVar.f;
                    zzaheVar22.g = zzaheVar.g;
                    if (zzahaVar.a != -1) {
                    }
                    zzahaVar.a = i5;
                    zzahaVar.b = i4;
                    this.j = zzaldVar != null ? new zzap(zzaldVar) : null;
                    long zzn32 = zzagiVar.zzn();
                    zzagiVar.zzf(zzaheVar.c);
                    if (i3 == 1483304551) {
                    }
                }
            }
            i = 0;
            zzahaVar = this.c;
            if (i != 1231971951) {
            }
            i2 = 0;
            b = zzeuVar2.b();
            if ((b & 1) != 0) {
            }
            if ((b & 2) != 0) {
            }
            if ((b & 4) == 4) {
            }
            i3 = i;
            if ((b & 8) != 0) {
            }
            if (zzeuVar2.B() >= 24) {
            }
            long j1022 = h;
            zzahe zzaheVar222 = new zzahe();
            zzaheVar222.a = zzaheVar.a;
            zzaheVar222.b = zzaheVar.b;
            zzaheVar222.c = zzaheVar.c;
            zzaheVar222.d = zzaheVar.d;
            zzaheVar222.e = zzaheVar.e;
            zzaheVar222.f = zzaheVar.f;
            zzaheVar222.g = zzaheVar.g;
            if (zzahaVar.a != -1) {
            }
            zzahaVar.a = i5;
            zzahaVar.b = i4;
            this.j = zzaldVar != null ? new zzap(zzaldVar) : null;
            long zzn322 = zzagiVar.zzn();
            zzagiVar.zzf(zzaheVar.c);
            if (i3 == 1483304551) {
            }
        } else {
            j = C.TIME_UNSET;
            long j14 = this.m;
            if (j14 != 0) {
                long zzn4 = zzagiVar.zzn();
                if (zzn4 < j14) {
                    zzagiVar.zzf((int) (j14 - zzn4));
                }
            }
        }
        int i21 = this.o;
        if (i21 == 0) {
            zzagiVar.zzl();
            if (f(zzagiVar)) {
                return -1;
            }
            zzeuVar.D(0);
            int b3 = zzeuVar.b();
            if (((-128000) & b3) != (this.h & (-128000)) || zzahf.a(b3) == -1) {
                zzagiVar.zzf(1);
                this.h = 0;
                return 0;
            }
            zzaheVar.a(b3);
            if (this.k == j) {
                this.k = this.p.a(zzagiVar.zzn());
            }
            i21 = zzaheVar.c;
            this.o = i21;
            this.n = zzagiVar.zzn() + i21;
        }
        int d = this.g.d(zzagiVar, i21, true);
        if (d == -1) {
            return -1;
        }
        int i22 = this.o - d;
        this.o = i22;
        if (i22 > 0) {
            return 0;
        }
        this.g.f(((this.l * 1000000) / zzaheVar.d) + this.k, 1, zzaheVar.c, 0, null);
        this.l += zzaheVar.g;
        this.o = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.zzm() > (r2 - 4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(zzagi zzagiVar) {
        vgn vgnVar = this.p;
        if (vgnVar != null) {
            long zzg = vgnVar.zzg();
            if (zzg != -1) {
            }
        }
        return !zzagiVar.f(this.a.a, 0, 4, true);
    }

    public final void g() {
        zzahk zzahkVar = this.p;
        if ((zzahkVar instanceof qgn) && ((zzafx) zzahkVar).zzb()) {
            long j = this.n;
            if (j == -1 || j == this.p.zzg()) {
                return;
            }
            qgn qgnVar = (qgn) this.p;
            this.p = new qgn(this.n, qgnVar.h, qgnVar.i, qgnVar.j, false);
            zzagk zzagkVar = this.e;
            zzagkVar.getClass();
            zzagkVar.c(this.p);
            this.f.getClass();
            this.p.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    public zzalb() {
        throw null;
    }
}
