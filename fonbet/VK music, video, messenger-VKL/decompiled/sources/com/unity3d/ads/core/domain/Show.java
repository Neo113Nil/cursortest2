package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import xsna.ksr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: Show.kt */
/* loaded from: classes14.dex */
public interface Show {
    ksr<ShowEvent> invoke(AdObject adObject, UnityAdsShowOptions unityAdsShowOptions);

    Object terminate(AdObject adObject, spj<? super s3q0> spjVar);
}
