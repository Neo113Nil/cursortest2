package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.bgn;
import defpackage.cgn;
import defpackage.dgn;
import defpackage.me4;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzais implements zzagh {
    public final zzeu a = new zzeu(4);
    public final zzeu b = new zzeu(9);
    public final zzeu c = new zzeu(11);
    public final zzeu d = new zzeu();
    public final cgn e;
    public zzagk f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public bgn o;
    public dgn p;

    public zzais() {
        cgn cgnVar = new cgn(new zzage(), 12);
        cgnVar.c = C.TIME_UNSET;
        cgnVar.d = new long[0];
        cgnVar.e = new long[0];
        this.e = cgnVar;
        this.g = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    public final zzeu b(zzagi zzagiVar) {
        int i = this.l;
        zzeu zzeuVar = this.d;
        byte[] bArr = zzeuVar.a;
        if (i > bArr.length) {
            int length = bArr.length;
            zzeuVar.z(0, new byte[Math.max(length + length, i)]);
        } else {
            zzeuVar.D(0);
        }
        zzeuVar.C(this.l);
        zzagiVar.g(0, this.l, zzeuVar.a);
        return zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        zzeu zzeuVar = this.a;
        zzafy zzafyVar = (zzafy) zzagiVar;
        zzafyVar.f(zzeuVar.a, 0, 3, false);
        zzeuVar.D(0);
        if (zzeuVar.M() == 4607062) {
            zzafyVar.f(zzeuVar.a, 0, 2, false);
            zzeuVar.D(0);
            if ((zzeuVar.J() & 250) == 0) {
                zzafyVar.f(zzeuVar.a, 0, 4, false);
                zzeuVar.D(0);
                int b = zzeuVar.b();
                zzafyVar.f = 0;
                zzafyVar.k(b, false);
                zzafyVar.f(zzeuVar.a, 0, 4, false);
                zzeuVar.D(0);
                if (zzeuVar.b() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.f = zzagkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x039c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        int i;
        long j;
        long j2;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        this.f.getClass();
        while (true) {
            int i3 = this.g;
            if (i3 == 1) {
                zzeu zzeuVar = this.b;
                if (!zzagiVar.i(zzeuVar.a, 0, 9, true)) {
                    return -1;
                }
                zzeuVar.D(0);
                zzeuVar.E(4);
                int I = zzeuVar.I();
                int i4 = I & 4;
                int i5 = I & 1;
                if (i4 != 0 && this.o == null) {
                    this.o = new bgn(this.f.b(8, 1), 12);
                }
                if (i5 != 0 && this.p == null) {
                    this.p = new dgn(this.f.b(9, 2));
                }
                this.f.zzv();
                this.j = zzeuVar.b() - 5;
                this.g = 2;
            } else if (i3 == 2) {
                zzagiVar.zzf(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                zzeu zzeuVar2 = this.c;
                if (!zzagiVar.i(zzeuVar2.a, 0, 11, true)) {
                    return -1;
                }
                zzeuVar2.D(0);
                this.k = zzeuVar2.I();
                this.l = zzeuVar2.M();
                this.m = zzeuVar2.M();
                this.m = (this.m | (zzeuVar2.I() << 24)) * 1000;
                zzeuVar2.E(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    defpackage.zzl.s();
                    return 0;
                }
                boolean z4 = this.h;
                cgn cgnVar = this.e;
                if (z4) {
                    i = 4;
                    j = this.i + this.m;
                } else {
                    i = 4;
                    j = cgnVar.c == C.TIME_UNSET ? 0L : this.m;
                }
                long j3 = j;
                int i6 = this.k;
                if (i6 == 8) {
                    if (this.o != null) {
                        if (!this.n) {
                            this.f.c(new zzahj(C.TIME_UNSET, 0L));
                            this.n = true;
                        }
                        bgn bgnVar = this.o;
                        zzeu b = b(zzagiVar);
                        zzaht zzahtVar = (zzaht) bgnVar.b;
                        if (bgnVar.c) {
                            b.E(1);
                        } else {
                            int I2 = b.I();
                            int i7 = I2 >> 4;
                            bgnVar.e = i7;
                            if (i7 == 2) {
                                int i8 = bgn.f[(I2 >> 2) & 3];
                                zzt zztVar = new zzt();
                                zztVar.c("video/x-flv");
                                zztVar.d(MimeTypes.AUDIO_MPEG);
                                zztVar.G = 1;
                                zztVar.I = i8;
                                zzahtVar.e(new zzv(zztVar));
                                bgnVar.d = true;
                            } else if (i7 == 7 || i7 == 8) {
                                zzt zztVar2 = new zzt();
                                zztVar2.c("video/x-flv");
                                zztVar2.d(i7 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW);
                                zztVar2.G = 1;
                                zztVar2.I = 8000;
                                zzahtVar.e(new zzv(zztVar2));
                                bgnVar.d = true;
                            } else if (i7 != 10) {
                                throw new zzaiu(me4.g(i7, "Audio format not supported: ", new StringBuilder(String.valueOf(i7).length() + 28)));
                            }
                            bgnVar.c = true;
                        }
                        zzaht zzahtVar2 = (zzaht) bgnVar.b;
                        if (bgnVar.e == 2) {
                            int B = b.B();
                            zzahtVar2.b(B, b);
                            zzahtVar2.f(j3, 1, B, 0, null);
                        } else {
                            int I3 = b.I();
                            if (I3 == 0 && !bgnVar.d) {
                                int B2 = b.B();
                                byte[] bArr = new byte[B2];
                                b.F(0, B2, bArr);
                                zzafe a = zzaff.a(new zzet(bArr, B2), false);
                                zzt zztVar3 = new zzt();
                                zztVar3.c("video/x-flv");
                                zztVar3.d(MimeTypes.AUDIO_AAC);
                                zztVar3.j = a.c;
                                zztVar3.G = a.b;
                                zztVar3.I = a.a;
                                zztVar3.q = Collections.singletonList(bArr);
                                zzahtVar2.e(new zzv(zztVar3));
                                bgnVar.d = true;
                            } else if (bgnVar.e != 10 || I3 == 1) {
                                int B3 = b.B();
                                zzahtVar2.b(B3, b);
                                zzahtVar2.f(j3, 1, B3, 0, null);
                            }
                            z2 = false;
                            z = true;
                            j2 = -9223372036854775807L;
                            if (!this.h && z2) {
                                this.h = true;
                                this.i = cgnVar.c != j2 ? -this.m : 0L;
                            }
                            this.j = 4;
                            this.g = 2;
                            if (z) {
                                return 0;
                            }
                        }
                        z2 = true;
                        z = true;
                        j2 = -9223372036854775807L;
                        if (!this.h) {
                            this.h = true;
                            this.i = cgnVar.c != j2 ? -this.m : 0L;
                        }
                        this.j = 4;
                        this.g = 2;
                        if (z) {
                        }
                    } else {
                        i6 = 8;
                    }
                }
                if (i6 != 9) {
                    j2 = -9223372036854775807L;
                    if (i6 == 18 && !this.n) {
                        zzeu b2 = b(zzagiVar);
                        cgnVar.getClass();
                        if (b2.I() == 2 && "onMetaData".equals(cgn.R(b2)) && b2.B() != 0 && b2.I() == 8) {
                            HashMap S = cgn.S(b2);
                            Object obj = S.get(IronSourceConstants.EVENTS_DURATION);
                            if (obj instanceof Double) {
                                double doubleValue = ((Double) obj).doubleValue();
                                if (doubleValue > 0.0d) {
                                    cgnVar.c = (long) (doubleValue * 1000000.0d);
                                }
                            }
                            Object obj2 = S.get("keyframes");
                            if (obj2 instanceof Map) {
                                Map map = (Map) obj2;
                                Object obj3 = map.get("filepositions");
                                Object obj4 = map.get("times");
                                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                    List list = (List) obj3;
                                    List list2 = (List) obj4;
                                    int size = list2.size();
                                    cgnVar.d = new long[size];
                                    cgnVar.e = new long[size];
                                    int i9 = 0;
                                    while (i9 < size) {
                                        Object obj5 = list.get(i9);
                                        Object obj6 = list2.get(i9);
                                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                            cgnVar.d = new long[0];
                                            cgnVar.e = new long[0];
                                            break;
                                        }
                                        cgnVar.d[i9] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                        cgnVar.e[i9] = ((Double) obj5).longValue();
                                        i9++;
                                        list2 = list2;
                                    }
                                }
                            }
                        }
                        long j4 = cgnVar.c;
                        if (j4 != C.TIME_UNSET) {
                            this.f.c(new zzahd(cgnVar.e, cgnVar.d, j4));
                            this.n = true;
                        }
                        z = true;
                        z2 = false;
                        if (!this.h) {
                        }
                        this.j = 4;
                        this.g = 2;
                        if (z) {
                        }
                    }
                    zzagiVar.zzf(this.l);
                    z2 = false;
                    z = false;
                    if (!this.h) {
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z) {
                    }
                } else if (this.p != null) {
                    if (!this.n) {
                        this.f.c(new zzahj(C.TIME_UNSET, 0L));
                        this.n = true;
                    }
                    dgn dgnVar = this.p;
                    zzeu b3 = b(zzagiVar);
                    dgnVar.getClass();
                    int I4 = b3.I();
                    int i10 = I4 >> 4;
                    int i11 = I4 & 15;
                    if (i11 != 7) {
                        throw new zzaiu(me4.g(i11, "Video format not supported: ", new StringBuilder(String.valueOf(i11).length() + 28)));
                    }
                    dgnVar.h = i10;
                    if (i10 != 5) {
                        zzaht zzahtVar3 = (zzaht) dgnVar.b;
                        int I5 = b3.I();
                        b3.v(3);
                        byte[] bArr2 = b3.a;
                        int i12 = b3.b;
                        int i13 = i12 + 1;
                        b3.b = i13;
                        j2 = -9223372036854775807L;
                        int i14 = bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        int i15 = i12 + 2;
                        b3.b = i15;
                        int i16 = bArr2[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        b3.b = i12 + 3;
                        long j5 = (bArr2[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i16 << 8) | ((i14 << 24) >> 8);
                        if (I5 == 0) {
                            if (!dgnVar.f) {
                                byte[] bArr3 = new byte[b3.B()];
                                zzeu zzeuVar3 = new zzeu(bArr3);
                                b3.F(0, b3.B(), bArr3);
                                zzafm a2 = zzafm.a(zzeuVar3);
                                dgnVar.e = a2.b;
                                zzt zztVar4 = new zzt();
                                zztVar4.c("video/x-flv");
                                zztVar4.d("video/avc");
                                zztVar4.j = a2.l;
                                zztVar4.u = a2.c;
                                zztVar4.v = a2.d;
                                zztVar4.B = a2.k;
                                zztVar4.q = a2.a;
                                zzahtVar3.e(new zzv(zztVar4));
                                dgnVar.f = true;
                            }
                        } else if (I5 == 1 && dgnVar.f) {
                            int i17 = dgnVar.h == 1 ? 1 : 0;
                            if (dgnVar.g) {
                                i2 = i17;
                            } else if (i17 != 0) {
                                i2 = 1;
                            }
                            zzeu zzeuVar4 = dgnVar.d;
                            byte[] bArr4 = zzeuVar4.a;
                            int i18 = 0;
                            bArr4[0] = 0;
                            bArr4[1] = 0;
                            bArr4[2] = 0;
                            int i19 = 4 - dgnVar.e;
                            int i20 = 0;
                            while (b3.B() > 0) {
                                b3.F(i19, dgnVar.e, zzeuVar4.a);
                                zzeuVar4.D(i18);
                                zzeu zzeuVar5 = dgnVar.c;
                                int h = zzeuVar4.h();
                                zzeuVar5.D(i18);
                                zzahtVar3.b(i, zzeuVar5);
                                zzahtVar3.b(h, b3);
                                i20 = i20 + 4 + h;
                                i = 4;
                                i18 = 0;
                            }
                            ((zzaht) dgnVar.b).f((j5 * 1000) + j3, i2, i20, 0, null);
                            dgnVar.g = true;
                            z3 = true;
                            if (z3) {
                                z2 = true;
                                z = true;
                                if (!this.h) {
                                }
                                this.j = 4;
                                this.g = 2;
                                if (z) {
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    } else {
                        j2 = -9223372036854775807L;
                    }
                    z2 = false;
                    z = true;
                    if (!this.h) {
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z) {
                    }
                } else {
                    j2 = -9223372036854775807L;
                    zzagiVar.zzf(this.l);
                    z2 = false;
                    z = false;
                    if (!this.h) {
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
