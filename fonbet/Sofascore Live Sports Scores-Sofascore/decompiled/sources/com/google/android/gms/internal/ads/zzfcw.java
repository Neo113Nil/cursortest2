package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ddb;
import defpackage.q7o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfcw implements zzfdi {
    public final zzhdi a;
    public final Context b;
    public final VersionInfoParcel c;
    public final String d;

    public zzfcw(zzhdi zzhdiVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.a = zzhdiVar;
        this.b = context;
        this.c = versionInfoParcel;
        this.d = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.a.submit(new q7o(this, 2));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 35;
    }
}
