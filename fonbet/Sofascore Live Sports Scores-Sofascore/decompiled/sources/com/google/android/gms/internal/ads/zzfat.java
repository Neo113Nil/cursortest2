package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import defpackage.ddb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfat implements zzfdi {
    public final Context a;
    public final Intent b;

    public zzfat(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ye)).booleanValue()) {
            return zzhcy.a(new zzfau(null));
        }
        boolean z = false;
        try {
            if (this.b.resolveActivity(this.a.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z = true;
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("HsdpMigrationSignal.isHsdpMigrationSupported", e);
        }
        return zzhcy.a(new zzfau(Boolean.valueOf(z)));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 60;
    }
}
