package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbld;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgm;
import defpackage.ddb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzd {
    public static void zza(Context context) {
        Object obj = com.google.android.gms.ads.internal.util.client.zzl.b;
        if (((Boolean) zzbld.a.c()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzi()) {
                    return;
                }
                ddb zzb = new zzc(context).zzb();
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Updating ad debug logging enablement.");
                zzcgm.a(zzb, "AdDebugLogUpdater.updateEnablement", zzcgj.h);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to determine debug setting.", e);
            }
        }
    }
}
