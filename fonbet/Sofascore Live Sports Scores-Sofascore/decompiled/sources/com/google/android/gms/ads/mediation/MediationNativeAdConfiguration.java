package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbmk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    public final zzbmk j;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, @Nullable Location location, int i, int i2, @Nullable String str2, String str3, @Nullable zzbmk zzbmkVar) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.j = zzbmkVar;
    }

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return zzbmk.Y0(this.j);
    }
}
