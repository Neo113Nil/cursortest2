package defpackage;

import com.google.android.gms.internal.ads.zzahv;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzhd;
import com.google.android.gms.internal.ads.zzhe;
import com.google.android.gms.internal.ads.zzhf;
import com.google.android.gms.internal.ads.zzhg;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uhn extends qgi {
    public ujg o;
    public int p;
    public boolean q;
    public zzhg r;
    public zzhe s;

    @Override // defpackage.qgi
    public final void g(boolean z) {
        super.g(z);
        if (z) {
            this.o = null;
            this.r = null;
            this.s = null;
        }
        this.p = 0;
        this.q = false;
    }

    @Override // defpackage.qgi
    public final long h(zzeu zzeuVar) {
        if ((zzeuVar.a[0] & 1) == 1) {
            return -1L;
        }
        ujg ujgVar = this.o;
        ujgVar.getClass();
        byte b = zzeuVar.a[0];
        zzhg zzhgVar = (zzhg) ujgVar.b;
        zzhf[] zzhfVarArr = (zzhf[]) ujgVar.e;
        int i = zzhfVarArr[(b >> 1) & (255 >>> (8 - zzhh.a(zzhfVarArr.length + (-1))))].a ? zzhgVar.f : zzhgVar.e;
        int i2 = this.q ? (this.p + i) / 4 : 0;
        byte[] bArr = zzeuVar.a;
        int length = bArr.length;
        int i3 = zzeuVar.c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            zzeuVar.z(copyOf.length, copyOf);
        } else {
            zzeuVar.C(i3);
        }
        long j = i2;
        byte[] bArr2 = zzeuVar.a;
        int i4 = zzeuVar.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.q = true;
        this.p = i;
        return j;
    }

    @Override // defpackage.qgi
    public final boolean i(zzeu zzeuVar, long j, c0l c0lVar) {
        ujg ujgVar;
        int i;
        int i2;
        long j2;
        if (this.o != null) {
            ((zzv) c0lVar.b).getClass();
            return false;
        }
        zzhg zzhgVar = this.r;
        int i3 = 4;
        if (zzhgVar == null) {
            zzhh.c(1, zzeuVar, false);
            zzeuVar.i();
            int I = zzeuVar.I();
            int i4 = zzeuVar.i();
            int c = zzeuVar.c();
            int i5 = c <= 0 ? -1 : c;
            int c2 = zzeuVar.c();
            int i6 = c2 <= 0 ? -1 : c2;
            zzeuVar.c();
            int I2 = zzeuVar.I();
            int pow = (int) Math.pow(2.0d, I2 & 15);
            int pow2 = (int) Math.pow(2.0d, (I2 & 240) >> 4);
            zzeuVar.I();
            this.r = new zzhg(I, i4, i5, i6, pow, pow2, Arrays.copyOf(zzeuVar.a, zzeuVar.c));
        } else {
            zzhe zzheVar = this.s;
            if (zzheVar == null) {
                this.s = zzhh.b(zzeuVar, true, true);
            } else {
                int i7 = zzeuVar.c;
                byte[] bArr = new byte[i7];
                System.arraycopy(zzeuVar.a, 0, bArr, 0, i7);
                int i8 = zzhgVar.a;
                int i9 = 5;
                zzhh.c(5, zzeuVar, false);
                int I3 = zzeuVar.I() + 1;
                zzhd zzhdVar = new zzhd(zzeuVar.a);
                int i10 = 8;
                zzhdVar.c(zzeuVar.b * 8);
                int i11 = 0;
                while (true) {
                    int i12 = 2;
                    int i13 = i10;
                    int i14 = 16;
                    if (i11 >= I3) {
                        int i15 = 6;
                        int b = zzhdVar.b(6) + 1;
                        for (int i16 = 0; i16 < b; i16++) {
                            if (zzhdVar.b(16) != 0) {
                                throw zzat.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i17 = 1;
                        int b2 = zzhdVar.b(6) + 1;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 < b2) {
                                int b3 = zzhdVar.b(i14);
                                if (b3 == 0) {
                                    int i20 = i13;
                                    zzhdVar.c(i20);
                                    zzhdVar.c(16);
                                    zzhdVar.c(16);
                                    zzhdVar.c(6);
                                    zzhdVar.c(i20);
                                    int b4 = zzhdVar.b(4) + 1;
                                    int i21 = 0;
                                    while (i21 < b4) {
                                        zzhdVar.c(i20);
                                        i21++;
                                        i20 = 8;
                                    }
                                } else {
                                    if (b3 != i17) {
                                        StringBuilder sb = new StringBuilder(fn0.a(b3, 41));
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(b3);
                                        throw zzat.a(null, sb.toString());
                                    }
                                    int b5 = zzhdVar.b(5);
                                    int[] iArr = new int[b5];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < b5; i23++) {
                                        int b6 = zzhdVar.b(4);
                                        iArr[i23] = b6;
                                        if (b6 > i22) {
                                            i22 = b6;
                                        }
                                    }
                                    int i24 = i22 + 1;
                                    int[] iArr2 = new int[i24];
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        iArr2[i25] = zzhdVar.b(i19) + 1;
                                        int b7 = zzhdVar.b(2);
                                        if (b7 > 0) {
                                            i = i13;
                                            zzhdVar.c(i);
                                        } else {
                                            i = i13;
                                        }
                                        int i26 = i24;
                                        int i27 = 0;
                                        for (int i28 = 1; i27 < (i28 << b7); i28 = 1) {
                                            zzhdVar.c(i);
                                            i27++;
                                            i = 8;
                                        }
                                        i25++;
                                        i24 = i26;
                                        i13 = 8;
                                        i19 = 3;
                                    }
                                    zzhdVar.c(2);
                                    int b8 = zzhdVar.b(4);
                                    int i29 = 0;
                                    int i30 = 0;
                                    for (int i31 = 0; i31 < b5; i31++) {
                                        i29 += iArr2[iArr[i31]];
                                        while (i30 < i29) {
                                            zzhdVar.c(b8);
                                            i30++;
                                        }
                                    }
                                }
                                i18++;
                                i13 = 8;
                                i15 = 6;
                                i17 = 1;
                                i14 = 16;
                            } else {
                                int b9 = zzhdVar.b(i15) + 1;
                                int i32 = 0;
                                while (i32 < b9) {
                                    if (zzhdVar.b(16) > 2) {
                                        throw zzat.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    zzhdVar.c(24);
                                    zzhdVar.c(24);
                                    zzhdVar.c(24);
                                    int b10 = zzhdVar.b(i15) + 1;
                                    int i33 = 8;
                                    zzhdVar.c(8);
                                    int[] iArr3 = new int[b10];
                                    for (int i34 = 0; i34 < b10; i34++) {
                                        iArr3[i34] = ((zzhdVar.a() ? zzhdVar.b(5) : 0) * 8) + zzhdVar.b(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < b10) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                zzhdVar.c(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i15 = 6;
                                }
                                int b11 = zzhdVar.b(i15) + 1;
                                for (int i37 = 0; i37 < b11; i37++) {
                                    int b12 = zzhdVar.b(16);
                                    if (b12 != 0) {
                                        StringBuilder sb2 = new StringBuilder(fn0.a(b12, 41));
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(b12);
                                        zzeh.e(sb2.toString());
                                    } else {
                                        int b13 = zzhdVar.a() ? zzhdVar.b(4) + 1 : 1;
                                        if (zzhdVar.a()) {
                                            int b14 = zzhdVar.b(8) + 1;
                                            for (int i38 = 0; i38 < b14; i38++) {
                                                int i39 = i8 - 1;
                                                zzhdVar.c(zzhh.a(i39));
                                                zzhdVar.c(zzhh.a(i39));
                                            }
                                        }
                                        if (zzhdVar.b(2) != 0) {
                                            throw zzat.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (b13 > 1) {
                                            for (int i40 = 0; i40 < i8; i40++) {
                                                zzhdVar.c(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < b13; i41++) {
                                            zzhdVar.c(8);
                                            zzhdVar.c(8);
                                            zzhdVar.c(8);
                                        }
                                    }
                                }
                                int b15 = zzhdVar.b(6) + 1;
                                zzhf[] zzhfVarArr = new zzhf[b15];
                                for (int i42 = 0; i42 < b15; i42++) {
                                    boolean a = zzhdVar.a();
                                    zzhdVar.b(16);
                                    zzhdVar.b(16);
                                    zzhdVar.b(8);
                                    zzhfVarArr[i42] = new zzhf(a);
                                }
                                if (!zzhdVar.a()) {
                                    throw zzat.a(null, "framing bit after modes not set as expected");
                                }
                                ujgVar = new ujg(28, zzhgVar, zzheVar, bArr, zzhfVarArr, false);
                            }
                        }
                    } else {
                        if (zzhdVar.b(24) != 5653314) {
                            int i43 = (zzhdVar.c * 8) + zzhdVar.d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i43).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(i43);
                            throw zzat.a(null, sb3.toString());
                        }
                        int b16 = zzhdVar.b(16);
                        int b17 = zzhdVar.b(24);
                        if (zzhdVar.a()) {
                            zzhdVar.c(i9);
                            for (int i44 = 0; i44 < b17; i44 += zzhdVar.b(zzhh.a(b17 - i44))) {
                            }
                        } else {
                            boolean a2 = zzhdVar.a();
                            for (int i45 = 0; i45 < b17; i45++) {
                                if (!a2) {
                                    zzhdVar.c(i9);
                                } else if (zzhdVar.a()) {
                                    zzhdVar.c(i9);
                                }
                            }
                        }
                        int b18 = zzhdVar.b(i3);
                        if (b18 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(b18).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(b18);
                            throw zzat.a(null, sb4.toString());
                        }
                        if (b18 == 1) {
                            i12 = b18;
                        } else if (b18 != 2) {
                            i11++;
                            i10 = i13;
                            i3 = 4;
                            i9 = 5;
                        }
                        zzhdVar.c(32);
                        zzhdVar.c(32);
                        int b19 = zzhdVar.b(i3) + 1;
                        zzhdVar.c(1);
                        if (i12 == 1) {
                            j2 = b16 != 0 ? (long) Math.floor(Math.pow(b17, 1.0d / b16)) : 0L;
                            i2 = b19;
                        } else {
                            i2 = b19;
                            j2 = b17 * b16;
                        }
                        zzhdVar.c((int) (j2 * i2));
                        i11++;
                        i10 = i13;
                        i3 = 4;
                        i9 = 5;
                    }
                }
            }
        }
        ujgVar = null;
        this.o = ujgVar;
        if (ujgVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzhg zzhgVar2 = (zzhg) ujgVar.b;
        arrayList.add(zzhgVar2.g);
        arrayList.add((byte[]) ujgVar.d);
        zzap a3 = zzahv.a(zzgxm.y(((zzhe) ujgVar.c).a));
        zzt zztVar = new zzt();
        zztVar.c("audio/ogg");
        zztVar.d(MimeTypes.AUDIO_VORBIS);
        zztVar.h = zzhgVar2.d;
        zztVar.i = zzhgVar2.c;
        zztVar.G = zzhgVar2.a;
        zztVar.I = zzhgVar2.b;
        zztVar.q = arrayList;
        zztVar.k = a3;
        c0lVar.b = new zzv(zztVar);
        return true;
    }

    @Override // defpackage.qgi
    public final void j(long j) {
        this.d = j;
        this.q = j != 0;
        zzhg zzhgVar = this.r;
        this.p = zzhgVar != null ? zzhgVar.e : 0;
    }
}
