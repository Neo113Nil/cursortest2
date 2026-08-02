package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzfu implements zzao {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzfu(String str, byte[] bArr, int i, int i2) {
        char c;
        byte b;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            if (i2 == 23) {
                if (bArr.length == 4) {
                    i2 = 23;
                    zzgsw.zza(r4);
                } else {
                    i2 = 23;
                }
            }
            r4 = false;
            zzgsw.zza(r4);
        } else if (c == 1 || c == 2) {
            if (i2 == 78) {
                if (bArr.length == 8) {
                    i2 = 78;
                    zzgsw.zza(r4);
                } else {
                    i2 = 78;
                }
            }
            r4 = false;
            zzgsw.zza(r4);
        } else if (c == 3) {
            zzgsw.zza(i2 == 0);
        } else if (c == 4) {
            if (i2 == 75) {
                if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    i2 = 75;
                    zzgsw.zza(r4);
                } else {
                    i2 = 75;
                }
            }
            r4 = false;
            zzgsw.zza(r4);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzfu zzfuVar = (zzfu) obj;
            if (this.zza.equals(zzfuVar.zza) && Arrays.equals(this.zzb, zzfuVar.zzb) && this.zzc == zzfuVar.zzc && this.zzd == zzfuVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final List zzb() {
        zzgsw.zzj(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final String toString() {
        String sb;
        int i = this.zzd;
        if (i == 0) {
            if (this.zza.equals("auxiliary.tracks.map")) {
                List zzb = zzb();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("track types = ");
                zzgsq.zzb(sb2, zzb, ",");
                sb = sb2.toString();
            }
            byte[] bArr = this.zzb;
            String str = zzfk.zza;
            sb = zzgyu.zzn().zzi().zzj(bArr, 0, bArr.length);
        } else if (i == 1) {
            sb = zzfk.zzj(this.zzb);
        } else if (i == 23) {
            sb = String.valueOf(Float.intBitsToFloat(zzgzt.zzd(this.zzb)));
        } else if (i == 67) {
            sb = String.valueOf(zzgzt.zzd(this.zzb));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new zzes(this.zzb).zzJ());
            }
            byte[] bArr2 = this.zzb;
            String str2 = zzfk.zza;
            sb = zzgyu.zzn().zzi().zzj(bArr2, 0, bArr2.length);
        } else {
            sb = String.valueOf(zzes$$ExternalSyntheticBackport0.m(this.zzb[0]));
        }
        String str3 = this.zza;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(sb).length());
        sb3.append("mdta: key=");
        sb3.append(str3);
        sb3.append(", value=");
        sb3.append(sb);
        return sb3.toString();
    }
}
