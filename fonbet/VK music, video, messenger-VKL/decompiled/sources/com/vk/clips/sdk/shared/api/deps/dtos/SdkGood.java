package com.vk.clips.sdk.shared.api.deps.dtos;

import com.vk.clips.sdk.shared.api.deps.Price;
import com.vk.core.serialize.Serializer;
import xsna.bxx;

/* compiled from: SdkGood.kt */
/* loaded from: classes17.dex */
public interface SdkGood extends bxx, Serializer.StreamParcelable {
    boolean P3();

    Price getPrice();

    String getTitle();
}
