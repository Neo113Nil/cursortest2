package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import defpackage.ddb;
import defpackage.v35;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfbi implements zzfdi {
    public final zzhdi a;
    public final zzflw b;
    public final PackageInfo c;
    public final com.google.android.gms.ads.internal.util.zzg d;

    public zzfbi(zzhdi zzhdiVar, zzflw zzflwVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.a = zzhdiVar;
        this.b = zzflwVar;
        this.c = packageInfo;
        this.d = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.a.submit(new v35(this, 28));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 26;
    }
}
