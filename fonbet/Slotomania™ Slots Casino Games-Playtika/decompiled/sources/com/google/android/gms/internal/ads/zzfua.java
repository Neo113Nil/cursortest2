package com.google.android.gms.internal.ads;

import org.apache.cordova.networkinformation.NetworkManager;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public enum zzfua {
    CTV("ctv"),
    MOBILE(NetworkManager.MOBILE),
    OTHER("other");

    private final String zzd;

    zzfua(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
