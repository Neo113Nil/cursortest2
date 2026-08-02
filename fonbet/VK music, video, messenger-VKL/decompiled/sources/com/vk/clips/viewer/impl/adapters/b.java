package com.vk.clips.viewer.impl.adapters;

import com.vk.clips.sdk.shared.api.deps.dtos.SdkGood;
import com.vk.dto.common.Good;

/* compiled from: GoodAdapter.kt */
/* loaded from: classes17.dex */
public final class b {
    public static final Good a(SdkGood sdkGood) {
        Good good;
        GoodWrapper goodWrapper = sdkGood instanceof GoodWrapper ? (GoodWrapper) sdkGood : null;
        if (goodWrapper == null || (good = goodWrapper.b) == null) {
            throw new IllegalStateException("SdkGood is not a GoodWrapper");
        }
        return good;
    }
}
