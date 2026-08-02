package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public enum zzftx {
    HTML(CreativeInfo.al),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String zzd;

    zzftx(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
