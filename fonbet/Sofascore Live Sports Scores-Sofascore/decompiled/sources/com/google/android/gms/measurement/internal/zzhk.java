package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhk {
    public final zzic a;

    public zzhk(zzpg zzpgVar) {
        this.a = zzpgVar.l;
    }

    public final boolean a() {
        zzic zzicVar = this.a;
        try {
            return Wrappers.a(zzicVar.a).b(128, "com.android.vending").versionCode >= 80837300;
        } catch (Exception e) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.o.b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
