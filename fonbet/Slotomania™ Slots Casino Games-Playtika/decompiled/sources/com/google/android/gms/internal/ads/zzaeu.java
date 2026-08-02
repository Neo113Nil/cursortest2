package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzaeu {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzaeu(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    public static zzaeu zza(zzes zzesVar) throws zzat {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            zzesVar.zzk(4);
            int zzs = (zzesVar.zzs() & 3) + 1;
            if (zzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzs2 = zzesVar.zzs() & 31;
            for (int i9 = 0; i9 < zzs2; i9++) {
                arrayList.add(zzb(zzesVar));
            }
            int zzs3 = zzesVar.zzs();
            for (int i10 = 0; i10 < zzs3; i10++) {
                arrayList.add(zzb(zzesVar));
            }
            if (zzs2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = zzgo.zza;
                zzgn zze = zzgo.zze(bArr2, 5, bArr.length);
                int i11 = zze.zze;
                int i12 = zze.zzf;
                int i13 = zze.zzh + 8;
                int i14 = zze.zzi + 8;
                int i15 = zze.zzj;
                int i16 = zze.zzk;
                int i17 = zze.zzl;
                int i18 = zze.zzm;
                float f2 = zze.zzg;
                str = zzdp.zzb(zze.zza, zze.zzb, zze.zzc);
                i5 = i17;
                i6 = i18;
                f = f2;
                i4 = i14;
                i7 = i15;
                i8 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new zzaeu(arrayList, zzs, i, i2, i3, i4, i7, i8, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.zzb("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzes zzesVar) {
        int zzt = zzesVar.zzt();
        int zzg = zzesVar.zzg();
        zzesVar.zzk(zzt);
        return zzdp.zzg(zzesVar.zzi(), zzg, zzt);
    }
}
