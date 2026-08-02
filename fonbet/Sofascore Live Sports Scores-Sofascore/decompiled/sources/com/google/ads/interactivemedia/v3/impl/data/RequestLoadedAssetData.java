package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_RequestLoadedAssetData.class)
/* loaded from: classes2.dex */
public abstract class RequestLoadedAssetData {
    @NonNull
    public static RequestLoadedAssetData create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull Boolean bool) {
        return new AutoValue_RequestLoadedAssetData(str, str2, str3, bool);
    }

    @NonNull
    public abstract String context();

    @NonNull
    public abstract String requestData();

    @NonNull
    public abstract String responseData();

    @NonNull
    public abstract Boolean waitOnMonitoringWebview();
}
