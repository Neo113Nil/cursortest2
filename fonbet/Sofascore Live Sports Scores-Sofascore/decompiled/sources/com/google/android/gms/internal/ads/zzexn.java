package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import defpackage.ddb;
import defpackage.v35;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzexn implements zzfdi {
    public final zzhdi a;
    public final Context b;

    public zzexn(Context context, zzhdi zzhdiVar) {
        this.a = zzhdiVar;
        this.b = context;
    }

    public final Intent a() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Fc)).booleanValue();
        Context context = this.b;
        return (!booleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.a.submit(new v35(this, 21));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 14;
    }
}
