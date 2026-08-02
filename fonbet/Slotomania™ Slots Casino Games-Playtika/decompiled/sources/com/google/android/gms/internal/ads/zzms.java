package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzms extends zziq {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbf[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzms(Collection collection, zzyx zzyxVar) {
        this(r0, r1, zzyxVar);
        zzbf[] zzbfVarArr = new zzbf[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzbfVarArr[i2] = ((zzma) it.next()).zzb();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzma) it2.next()).zza();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final int zzp(int i) {
        return zzfk.zzn(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final int zzq(int i) {
        return zzfk.zzn(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final int zzr(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final zzbf zzs(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final int zzt(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final int zzu(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final Object zzv(int i) {
        return this.zzh[i];
    }

    final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzms zzx(zzyx zzyxVar) {
        zzbf[] zzbfVarArr = this.zzg;
        zzbf[] zzbfVarArr2 = new zzbf[zzbfVarArr.length];
        for (int i = 0; i < zzbfVarArr.length; i++) {
            zzbfVarArr2[i] = new zzmr(this, zzbfVarArr[i]);
        }
        return new zzms(zzbfVarArr2, this.zzh, zzyxVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzms(zzbf[] zzbfVarArr, Object[] objArr, zzyx zzyxVar) {
        super(false, zzyxVar);
        int i = 0;
        this.zzg = zzbfVarArr;
        int length = zzbfVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < zzbfVarArr.length) {
            zzbf zzbfVar = zzbfVarArr[i];
            this.zzg[i4] = zzbfVar;
            this.zzf[i4] = i2;
            this.zze[i4] = i3;
            i2 += zzbfVar.zza();
            i3 += this.zzg[i4].zzc();
            this.zzi.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.zzc = i2;
        this.zzd = i3;
    }
}
