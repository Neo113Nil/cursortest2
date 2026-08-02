package com.unity3d.services.core.extensions;

import com.unity3d.services.UnityAdsConstants;
import xsna.go9;

/* compiled from: StringExtensions.kt */
/* loaded from: classes14.dex */
public final class StringExtensionsKt {
    public static final String toUnityMessage(String str) {
        return (str == null || str.length() == 0) ? "[Unity Ads] Internal error" : go9.b(UnityAdsConstants.Messages.MSG_UNITY_BASE, str);
    }
}
