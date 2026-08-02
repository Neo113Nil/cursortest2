package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzewd implements zzfby {
    private final zzhbs zza;
    private final Context zzb;

    zzewd(zzhbs zzhbsVar, Context context) {
        this.zza = zzhbsVar;
        this.zzb = context;
    }

    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzms)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzewc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzewd.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 14;
    }

    final /* synthetic */ zzewe zzc() {
        double intExtra;
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznv)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            z = batteryManager != null ? batteryManager.isCharging() : zze(zzd());
        } else {
            Intent zzd = zzd();
            boolean zze = zze(zzd);
            intExtra = zzd != null ? zzd.getIntExtra("level", -1) / zzd.getIntExtra("scale", -1) : -1.0d;
            z = zze;
        }
        return new zzewe(intExtra, z);
    }
}
