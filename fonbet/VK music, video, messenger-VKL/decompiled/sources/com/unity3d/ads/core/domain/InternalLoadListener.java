package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.core.data.model.AdObject;

/* compiled from: InternalLoadListener.kt */
/* loaded from: classes14.dex */
public interface InternalLoadListener {
    void onAdLoadFail(UnityAdsError unityAdsError);

    void onAdLoaded(AdObject adObject);
}
