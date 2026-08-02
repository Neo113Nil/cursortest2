package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MediationBannerAdConfiguration extends MediationAdConfiguration {
    public final AdSize j;

    public MediationBannerAdConfiguration(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle, @NonNull Bundle bundle2, boolean z, @Nullable Location location, int i, int i2, @NonNull String str2, @NonNull AdSize adSize, @NonNull String str3) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.j = adSize;
    }

    @NonNull
    public AdSize getAdSize() {
        return this.j;
    }
}
