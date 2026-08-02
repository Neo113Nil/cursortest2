package com.inmobi.ads.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes4.dex */
public abstract class AdEventListener<T> {
    public void onAdImpression(@NonNull T t) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(@NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdClicked(@NonNull T t, Map<Object, Object> map) {
    }

    public void onAdFetchSuccessful(@NonNull T t, @NonNull AdMetaInfo adMetaInfo) {
    }

    public void onAdLoadFailed(@NonNull T t, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdLoadSucceeded(@NonNull T t, @NonNull AdMetaInfo adMetaInfo) {
    }
}
