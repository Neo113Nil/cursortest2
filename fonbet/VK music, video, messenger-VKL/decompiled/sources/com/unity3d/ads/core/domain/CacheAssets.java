package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import java.util.List;
import xsna.spj;

/* compiled from: CacheAssets.kt */
/* loaded from: classes14.dex */
public interface CacheAssets {
    Object invoke(AdObject adObject, List<CampaignMetadataOuterClass.CampaignAsset> list, spj<? super CacheAssetsEvent> spjVar);
}
