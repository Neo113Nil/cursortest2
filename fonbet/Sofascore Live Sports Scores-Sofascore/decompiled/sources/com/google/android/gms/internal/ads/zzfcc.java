package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ddb;
import defpackage.q7o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfcc implements zzfdi {
    public final Context a;
    public final zzhdi b;
    public final zzflw c;
    public final VersionInfoParcel d;

    public zzfcc(Context context, zzhdi zzhdiVar, zzflw zzflwVar, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = zzhdiVar;
        this.c = zzflwVar;
        this.d = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.b.submit(new q7o(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 53;
    }
}
