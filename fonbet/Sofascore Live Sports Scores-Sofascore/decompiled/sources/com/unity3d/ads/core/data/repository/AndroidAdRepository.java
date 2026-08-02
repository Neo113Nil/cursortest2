package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.o13;
import defpackage.tub;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0017H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidAdRepository;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "<init>", "()V", "loadedAds", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/google/protobuf/ByteString;", "Lcom/unity3d/ads/core/data/model/AdObject;", "placementsLoadedAds", "", "", "addAd", "", "opportunityId", "adObject", "getAd", "pollOpportunityIdForPlacement", "placementId", "enqueueOpportunityForPlacement", "removeAd", "hasOpportunityId", "", "getAllAds", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAdRepository implements AdRepository {

    @NotNull
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();

    @NotNull
    private final ConcurrentHashMap<String, List<ByteString>> placementsLoadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void addAd(@NotNull ByteString opportunityId, @NotNull AdObject adObject) {
        opportunityId.getClass();
        adObject.getClass();
        this.loadedAds.put(opportunityId, adObject);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void enqueueOpportunityForPlacement(@NotNull String placementId, @NotNull ByteString opportunityId) {
        List<ByteString> putIfAbsent;
        placementId.getClass();
        opportunityId.getClass();
        ConcurrentHashMap<String, List<ByteString>> concurrentHashMap = this.placementsLoadedAds;
        List<ByteString> list = concurrentHashMap.get(placementId);
        if (list == null && (putIfAbsent = concurrentHashMap.putIfAbsent(placementId, (list = new ArrayList<>()))) != null) {
            list = putIfAbsent;
        }
        list.add(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    @Nullable
    public AdObject getAd(@NotNull ByteString opportunityId) {
        opportunityId.getClass();
        return this.loadedAds.get(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    @NotNull
    public Map<ByteString, AdObject> getAllAds() {
        return tub.p(this.loadedAds);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public boolean hasOpportunityId(@NotNull ByteString opportunityId) {
        opportunityId.getClass();
        return this.loadedAds.containsKey(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    @Nullable
    public ByteString pollOpportunityIdForPlacement(@NotNull String placementId) {
        placementId.getClass();
        List<ByteString> list = this.placementsLoadedAds.get(placementId);
        if (list != null) {
            return (ByteString) o13.C(list);
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void removeAd(@NotNull ByteString opportunityId) {
        opportunityId.getClass();
        this.loadedAds.remove(opportunityId);
    }
}
