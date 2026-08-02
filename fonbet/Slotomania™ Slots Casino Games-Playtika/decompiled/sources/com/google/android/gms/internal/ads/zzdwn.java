package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdwn {
    private final Map zza = new HashMap();

    zzdwn() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zza(String str, @Nullable zzflk zzflkVar) {
        zzbxe zzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbxe zzbxeVar = null;
        if (zzflkVar != null) {
            try {
                zzB = zzflkVar.zzB();
            } catch (zzfkt unused) {
            }
            if (zzflkVar != null) {
                try {
                    zzbxeVar = zzflkVar.zzC();
                } catch (zzfkt unused2) {
                }
            }
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkJ)).booleanValue()) {
                if (zzflkVar != null) {
                    try {
                        zzflkVar.zzn();
                    } catch (zzfkt unused3) {
                    }
                }
                z = false;
            }
            this.zza.put(str, new zzdwm(str, zzB, zzbxeVar, z));
        }
        zzB = null;
        if (zzflkVar != null) {
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkJ)).booleanValue()) {
        }
        this.zza.put(str, new zzdwm(str, zzB, zzbxeVar, z2));
    }

    final synchronized void zzb(String str, zzbwp zzbwpVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdwm(str, zzbwpVar.zzf(), zzbwpVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzdwm zzc(String str) {
        return (zzdwm) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbxe zzbxeVar;
        zzdwm zzc = zzc(str);
        return (zzc == null || (zzbxeVar = zzc.zzb) == null) ? "" : zzbxeVar.toString();
    }
}
