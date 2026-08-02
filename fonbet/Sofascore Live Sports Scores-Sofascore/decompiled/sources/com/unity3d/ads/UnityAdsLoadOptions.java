package com.unity3d.ads;

import com.unity3d.ads.core.data.model.LoadConfigurationInternal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes6.dex */
public class UnityAdsLoadOptions extends UnityAdsBaseOptions {
    private String AD_MARKUP = "adMarkup";
    public LoadConfigurationInternal loadConfiguration = null;

    public void setAdMarkup(String str) {
        set(this.AD_MARKUP, str);
    }
}
