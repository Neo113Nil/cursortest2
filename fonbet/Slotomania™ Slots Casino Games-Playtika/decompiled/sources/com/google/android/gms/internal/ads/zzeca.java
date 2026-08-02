package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzeca {
    private final zzebk zza;
    private final zzdwn zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzeca(zzebk zzebkVar, zzdwn zzdwnVar) {
        this.zza = zzebkVar;
        this.zzb = zzdwnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        String str;
        boolean z;
        zzdwm zzc;
        zzbxe zzbxeVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbrd zzbrdVar = (zzbrd) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkI)).booleanValue()) {
                    zzdwm zzc2 = this.zzb.zzc(zzbrdVar.zza);
                    if (zzc2 != null && (zzbxeVar = zzc2.zzc) != null) {
                        str = zzbxeVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkJ)).booleanValue() && (zzc = this.zzb.zzc(zzbrdVar.zza)) != null && zzc.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzbrdVar.zza;
                    list2.add(new zzebz(str3, str2, this.zzb.zzd(str3), zzbrdVar.zzb ? 1 : 0, zzbrdVar.zzd, zzbrdVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzbrdVar.zza;
                list22.add(new zzebz(str32, str2, this.zzb.zzd(str32), zzbrdVar.zzb ? 1 : 0, zzbrdVar.zzd, zzbrdVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzb(new zzeby(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                zzebk zzebkVar = this.zza;
                if (!zzebkVar.zze()) {
                    zza();
                    return jSONArray;
                }
                zzc(zzebkVar.zzd());
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzebz) it.next()).zza());
            }
            return jSONArray;
        }
    }
}
