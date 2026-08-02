package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgwi extends zzgvt {
    Object[] zzd;
    private int zze;

    public zzgwi() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt, com.google.android.gms.internal.ads.zzgvu
    public final /* bridge */ /* synthetic */ zzgvu zzd(Object obj) {
        zzf(obj);
        return this;
    }

    zzgwi(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzgwj.zzo(i)];
    }

    public final zzgwi zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            super.zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgwj zzh() {
        zzgwj zzw;
        boolean zzx;
        int i = this.zzb;
        if (i == 0) {
            return zzgya.zza;
        }
        if (i == 1) {
            return new zzgyk(Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || zzgwj.zzo(i) != this.zzd.length) {
            zzw = zzgwj.zzw(this.zzb, this.zza);
            this.zzb = zzw.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            zzx = zzgwj.zzx(i2, objArr.length);
            if (zzx) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            zzw = new zzgya(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzw;
    }

    public final zzgwi zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzo = zzgwj.zzo(this.zzb);
            Object[] objArr = this.zzd;
            if (zzo <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzgvs.zza(hashCode);
                while (true) {
                    int i = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    zza = i + 1;
                }
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
