package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AdRepository;", "", "addAd", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "getAd", "pollOpportunityIdForPlacement", "placementId", "", "enqueueOpportunityForPlacement", "removeAd", "hasOpportunityId", "", "getAllAds", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AdRepository {
    void addAd(@NotNull ByteString opportunityId, @NotNull AdObject adObject);

    void enqueueOpportunityForPlacement(@NotNull String placementId, @NotNull ByteString opportunityId);

    @Nullable
    AdObject getAd(@NotNull ByteString opportunityId);

    @NotNull
    Map<ByteString, AdObject> getAllAds();

    boolean hasOpportunityId(@NotNull ByteString opportunityId);

    @Nullable
    ByteString pollOpportunityIdForPlacement(@NotNull String placementId);

    void removeAd(@NotNull ByteString opportunityId);
}
