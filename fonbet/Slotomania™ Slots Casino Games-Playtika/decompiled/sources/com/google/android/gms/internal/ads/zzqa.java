package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import com.ironsource.X3;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzqa {
    public static final zzqa zza;
    public final int zzb;
    public final int zzc;
    private final zzgwj zzd;

    static {
        zzqa zzqaVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgwi zzgwiVar = new zzgwi();
            for (int i = 1; i <= 10; i++) {
                zzgwiVar.zzf(Integer.valueOf(zzfk.zzD(i)));
            }
            zzqaVar = new zzqa(2, zzgwiVar.zzh());
        } else {
            zzqaVar = new zzqa(2, 10);
        }
        zza = zzqaVar;
    }

    public zzqa(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzqa(int i, Set set) {
        this.zzb = i;
        zzgwj zzp = zzgwj.zzp(set);
        this.zzd = zzp;
        zzgyn it = zzp.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqa)) {
            return false;
        }
        zzqa zzqaVar = (zzqa) obj;
        return this.zzb == zzqaVar.zzb && this.zzc == zzqaVar.zzc && Objects.equals(this.zzd, zzqaVar.zzd);
    }

    public final int hashCode() {
        zzgwj zzgwjVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgwjVar == null ? 0 : zzgwjVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i2).length() + 15 + String.valueOf(valueOf).length() + 1);
        sb.append("AudioProfile[format=");
        sb.append(i);
        sb.append(", maxChannelCount=");
        sb.append(i2);
        sb.append(", channelMasks=");
        sb.append(valueOf);
        sb.append(X3.j.e);
        return sb.toString();
    }

    public final boolean zza(int i) {
        zzgwj zzgwjVar = this.zzd;
        if (zzgwjVar == null) {
            return i <= this.zzc;
        }
        int zzD = zzfk.zzD(i);
        if (zzD == 0) {
            return false;
        }
        return zzgwjVar.contains(Integer.valueOf(zzD));
    }

    public final int zzb(int i, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzqb.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i2 = this.zzb;
        for (int i3 = 10; i3 > 0; i3--) {
            int zzD = zzfk.zzD(i3);
            if (zzD != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(zzD).build(), zzdVar.zza())) {
                return i3;
            }
        }
        return 0;
    }
}
