package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class MarketAppInfo {
    @NonNull
    public static MarketAppInfo create(int i, @NonNull String str) {
        return new AutoValue_MarketAppInfo(i, str);
    }

    public abstract int appVersion();

    @NonNull
    public abstract String packageName();
}
