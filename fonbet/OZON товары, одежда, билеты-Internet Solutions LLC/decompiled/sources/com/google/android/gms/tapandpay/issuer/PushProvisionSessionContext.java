package com.google.android.gms.tapandpay.issuer;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes9.dex */
public final class PushProvisionSessionContext {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public PushProvisionSessionContext(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @RecentlyNonNull
    public String getDeviceId() {
        return this.zzb;
    }

    @RecentlyNonNull
    public String getServerSessionId() {
        return this.zza;
    }

    @RecentlyNonNull
    public String getWalletId() {
        return this.zzc;
    }
}
