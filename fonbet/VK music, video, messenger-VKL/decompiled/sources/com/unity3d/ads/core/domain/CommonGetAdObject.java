package com.unity3d.ads.core.domain;

import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import xsna.ozl;

/* compiled from: CommonGetAdObject.kt */
@ozl
/* loaded from: classes14.dex */
public final class CommonGetAdObject implements GetAdObject {
    private final AdRepository adRepository;

    public CommonGetAdObject(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetAdObject
    public AdObject invoke(String str) {
        return this.adRepository.getAd(ByteStringsKt.toByteStringUtf8(str));
    }
}
