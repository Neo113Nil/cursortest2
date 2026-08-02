package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.fn0;
import defpackage.ijn;
import defpackage.jjn;
import defpackage.l6g;
import defpackage.me4;
import defpackage.r5a;
import defpackage.tzk;
import defpackage.wzk;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzase implements zzagh {
    public zzagk a;
    public zzaht b;
    public ijn e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        ijn ijnVar = this.e;
        if (ijnVar != null) {
            ijnVar.c(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        return l6g.d0(zzagiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.a = zzagkVar;
        this.b = zzagkVar.b(0, 1);
        zzagkVar.zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0264  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        byte[] bArr;
        int i;
        int i2;
        byte[] bArr2;
        int b;
        int i3;
        this.b.getClass();
        String str = zzfm.a;
        int i4 = this.c;
        if (i4 == 0) {
            zzguk.f(zzagiVar.zzn() == 0);
            int i5 = this.f;
            if (i5 != -1) {
                zzagiVar.zzf(i5);
                this.c = 4;
                return 0;
            }
            if (!l6g.d0(zzagiVar)) {
                throw zzat.a(null, "Unsupported or unrecognized wav file type.");
            }
            zzagiVar.zzf((int) (zzagiVar.zzm() - zzagiVar.zzn()));
            this.c = 1;
            return 0;
        }
        long j = -1;
        if (i4 == 1) {
            zzeu zzeuVar = new zzeu(8);
            r5a g = r5a.g(zzagiVar, zzeuVar);
            if (g.a != 1685272116) {
                zzagiVar.zzl();
            } else {
                zzagiVar.d(8);
                zzeuVar.D(0);
                zzagiVar.h(0, 8, zzeuVar.a);
                j = zzeuVar.e();
                zzagiVar.zzf(((int) g.b) + 8);
            }
            this.d = j;
            this.c = 2;
            return 0;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                zzguk.f(this.g != -1);
                long zzn = this.g - zzagiVar.zzn();
                ijn ijnVar = this.e;
                ijnVar.getClass();
                return ijnVar.e(zzagiVar, zzn) ? -1 : 0;
            }
            zzagiVar.zzl();
            r5a e0 = l6g.e0(1684108385, zzagiVar, new zzeu(8));
            zzagiVar.zzf(8);
            Pair create = Pair.create(Long.valueOf(zzagiVar.zzn()), Long.valueOf(e0.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j2 = this.d;
            if (j2 != -1 && longValue == 4294967295L) {
                longValue = j2;
            }
            long j3 = this.f + longValue;
            this.g = j3;
            long zzo = zzagiVar.zzo();
            if (zzo != -1 && j3 > zzo) {
                StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 29 + String.valueOf(zzo).length());
                fn0.t(j3, "Data exceeds input length: ", ", ", sb);
                sb.append(zzo);
                zzeh.c(sb.toString());
                this.g = zzo;
                j3 = zzo;
            }
            ijn ijnVar2 = this.e;
            ijnVar2.getClass();
            ijnVar2.d(this.f, j3);
            this.c = 4;
            return 0;
        }
        zzeu zzeuVar2 = new zzeu(16);
        long j4 = l6g.e0(1718449184, zzagiVar, zzeuVar2).b;
        zzguk.f(j4 >= 16);
        zzagiVar.h(0, 16, zzeuVar2.a);
        zzeuVar2.D(0);
        int K = zzeuVar2.K();
        int K2 = zzeuVar2.K();
        int i6 = zzeuVar2.i();
        zzeuVar2.i();
        int K3 = zzeuVar2.K();
        int K4 = zzeuVar2.K();
        int i7 = ((int) j4) - 16;
        if (i7 > 0) {
            bArr = new byte[i7];
            zzagiVar.h(0, i7, bArr);
            if (K == 65534) {
                if (i7 != 24) {
                    i2 = 0;
                    i = 65534;
                    bArr2 = bArr;
                    zzagiVar.zzf((int) (zzagiVar.zzm() - zzagiVar.zzn()));
                    jjn jjnVar = new jjn(i, K2, i6, K3, K4, i2, bArr2);
                    if (i == 17) {
                    }
                    this.c = 3;
                    return 0;
                }
                zzeu zzeuVar3 = new zzeu(bArr);
                zzeuVar3.K();
                int K5 = zzeuVar3.K();
                if (K5 != 0 && K5 != K4) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(K4).length() + String.valueOf(K5).length() + 33 + 19);
                    me4.r(sb2, "validBits ( ", K5, ")  != bitsPerSample( ", K4);
                    sb2.append(") are not supported");
                    throw zzat.b(sb2.toString());
                }
                int i8 = zzeuVar3.i();
                if ((i8 >> 18) != 0 || (i8 != 0 && Integer.bitCount(i8) != K2)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 57 + String.valueOf(K2).length());
                    sb3.append("Channel mask ");
                    sb3.append(i8);
                    sb3.append(" is invalid or does not match channel count ");
                    sb3.append(K2);
                    throw zzat.b(sb3.toString());
                }
                int K6 = zzeuVar3.K();
                byte[] bArr3 = new byte[14];
                zzeuVar3.F(0, 14, bArr3);
                if (!Arrays.equals(bArr3, l6g.j) && !Arrays.equals(bArr3, l6g.k)) {
                    throw zzat.b("invalid wav format extension guid");
                }
                i2 = i8;
                bArr2 = bArr;
                i = K6;
                zzagiVar.zzf((int) (zzagiVar.zzm() - zzagiVar.zzn()));
                jjn jjnVar2 = new jjn(i, K2, i6, K3, K4, i2, bArr2);
                if (i == 17) {
                    this.e = new tzk(this.a, this.b, jjnVar2);
                } else if (i == 6) {
                    this.e = new wzk(this.a, this.b, jjnVar2, MimeTypes.AUDIO_ALAW, -1);
                } else if (i == 7) {
                    this.e = new wzk(this.a, this.b, jjnVar2, MimeTypes.AUDIO_MLAW, -1);
                } else {
                    if (i != 1) {
                        if (i == 3) {
                            b = zzfm.c(K4, ByteOrder.LITTLE_ENDIAN);
                            i3 = b;
                            if (i3 == 0) {
                            }
                        } else if (i != 65534) {
                            i3 = 0;
                            if (i3 == 0) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i).length() + 29);
                                sb4.append("Unsupported WAV format type: ");
                                sb4.append(i);
                                throw zzat.b(sb4.toString());
                            }
                            this.e = new wzk(this.a, this.b, jjnVar2, MimeTypes.AUDIO_RAW, i3);
                        }
                    }
                    b = zzfm.b(K4, ByteOrder.LITTLE_ENDIAN);
                    i3 = b;
                    if (i3 == 0) {
                    }
                }
                this.c = 3;
                return 0;
            }
        } else {
            bArr = zzfm.b;
        }
        i = K;
        i2 = 0;
        bArr2 = bArr;
        zzagiVar.zzf((int) (zzagiVar.zzm() - zzagiVar.zzn()));
        jjn jjnVar22 = new jjn(i, K2, i6, K3, K4, i2, bArr2);
        if (i == 17) {
        }
        this.c = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
