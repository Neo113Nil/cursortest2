package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzxt extends zzwk {
    private static final zzak zza;
    private final zzxe[] zzb;
    private final List zzc;
    private final zzbf[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzxr zzh;
    private final zzwn zzi;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    public zzxt(boolean z, boolean z2, zzwn zzwnVar, zzxe... zzxeVarArr) {
        this.zzb = zzxeVarArr;
        this.zzi = zzwnVar;
        this.zze = new ArrayList(Arrays.asList(zzxeVarArr));
        this.zzc = new ArrayList(zzxeVarArr.length);
        int i = 0;
        while (true) {
            int length = zzxeVarArr.length;
            if (i >= length) {
                this.zzd = new zzbf[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgxo.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzA(zzak zzakVar) {
        this.zzb[0].zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzD(zzxa zzxaVar) {
        zzxq zzxqVar = (zzxq) zzxaVar;
        int i = 0;
        while (true) {
            zzxe[] zzxeVarArr = this.zzb;
            if (i >= zzxeVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i);
            zzxa zza2 = zzxqVar.zza(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((zzxs) list.get(i2)).zzb().equals(zza2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            zzxeVarArr[i].zzD(zzxqVar.zza(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final zzxa zzG(zzxc zzxcVar, zzabd zzabdVar, long j) {
        zzbf[] zzbfVarArr = this.zzd;
        zzxe[] zzxeVarArr = this.zzb;
        int length = zzxeVarArr.length;
        zzxa[] zzxaVarArr = new zzxa[length];
        int zze = zzbfVarArr[0].zze(zzxcVar.zza);
        for (int i = 0; i < length; i++) {
            zzxc zza2 = zzxcVar.zza(zzbfVarArr[i].zzf(zze));
            zzxaVarArr[i] = zzxeVarArr[i].zzG(zza2, zzabdVar, j - this.zzg[zze][i]);
            ((List) this.zzc.get(i)).add(new zzxs(zza2, zzxaVarArr[i], null));
        }
        return new zzxq(this.zzi, this.zzg[zze], zzxaVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final zzak zzJ() {
        zzxe[] zzxeVarArr = this.zzb;
        return zzxeVarArr.length > 0 ? zzxeVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwk, com.google.android.gms.internal.ads.zzwb
    protected final void zza(zzih zzihVar) {
        super.zza(zzihVar);
        int i = 0;
        while (true) {
            zzxe[] zzxeVarArr = this.zzb;
            if (i >= zzxeVarArr.length) {
                return;
            }
            zzv(Integer.valueOf(i), zzxeVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwk, com.google.android.gms.internal.ads.zzwb
    protected final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwk, com.google.android.gms.internal.ads.zzxe
    public final void zzt() throws IOException {
        zzxr zzxrVar = this.zzh;
        if (zzxrVar != null) {
            throw zzxrVar;
        }
        super.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    protected final /* bridge */ /* synthetic */ void zzu(Object obj, zzxe zzxeVar, zzbf zzbfVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            i = zzbfVar.zzc();
            this.zzf = i;
        } else {
            int zzc = zzbfVar.zzc();
            int i2 = this.zzf;
            if (zzc != i2) {
                this.zzh = new zzxr(0);
                return;
            }
            i = i2;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzxeVar);
        zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    protected final /* bridge */ /* synthetic */ zzxc zzx(Object obj, zzxc zzxcVar) {
        int intValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(intValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((zzxs) list2.get(i)).zza().equals(zzxcVar)) {
                return ((zzxs) ((List) list.get(0)).get(i)).zza();
            }
        }
        return null;
    }
}
