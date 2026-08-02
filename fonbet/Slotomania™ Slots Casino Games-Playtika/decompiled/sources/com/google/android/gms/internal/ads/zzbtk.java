package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbtk implements zzbsb, zzbtj {
    private final zzbtj zza;
    private final HashSet zzb = new HashSet();

    public zzbtk(zzbtj zzbtjVar) {
        this.zza = zzbtjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsb, com.google.android.gms.internal.ads.zzbsm
    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzf() {
        HashSet hashSet = this.zzb;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            String obj = ((zzbpe) simpleEntry.getValue()).toString();
            String.valueOf(obj);
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(obj)));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbpe) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzm(String str, zzbpe zzbpeVar) {
        this.zza.zzm(str, zzbpeVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbpeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzn(String str, zzbpe zzbpeVar) {
        this.zza.zzn(str, zzbpeVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbpeVar));
    }
}
