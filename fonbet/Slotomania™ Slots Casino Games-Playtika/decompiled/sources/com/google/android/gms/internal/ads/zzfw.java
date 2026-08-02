package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzfw extends zzfy {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfw(int i, long j) {
        super(i, null);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final String toString() {
        List list = this.zzb;
        String zze = zze(this.zzd);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        int length = zze.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        sb.append(zze);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(zzfx zzfxVar) {
        this.zzb.add(zzfxVar);
    }

    public final void zzb(zzfw zzfwVar) {
        this.zzc.add(zzfwVar);
    }

    public final zzfx zzc(int i) {
        List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfx zzfxVar = (zzfx) list.get(i2);
            if (zzfxVar.zzd == i) {
                return zzfxVar;
            }
        }
        return null;
    }

    public final zzfw zzd(int i) {
        List list = this.zzc;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfw zzfwVar = (zzfw) list.get(i2);
            if (zzfwVar.zzd == i) {
                return zzfwVar;
            }
        }
        return null;
    }
}
