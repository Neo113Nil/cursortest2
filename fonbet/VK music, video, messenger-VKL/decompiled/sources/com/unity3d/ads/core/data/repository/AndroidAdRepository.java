package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xsna.g5g;
import xsna.pn00;

/* compiled from: AndroidAdRepository.kt */
/* loaded from: classes14.dex */
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<ByteString>> placementsLoadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void addAd(ByteString byteString, AdObject adObject) {
        this.loadedAds.put(byteString, adObject);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void enqueueOpportunityForPlacement(String str, ByteString byteString) {
        List<ByteString> putIfAbsent;
        ConcurrentHashMap<String, List<ByteString>> concurrentHashMap = this.placementsLoadedAds;
        List<ByteString> list = concurrentHashMap.get(str);
        if (list == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (list = new ArrayList<>()))) != null) {
            list = putIfAbsent;
        }
        list.add(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public AdObject getAd(ByteString byteString) {
        return this.loadedAds.get(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Map<ByteString, AdObject> getAllAds() {
        return pn00.t(this.loadedAds);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public boolean hasOpportunityId(ByteString byteString) {
        return this.loadedAds.containsKey(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public ByteString pollOpportunityIdForPlacement(String str) {
        List<ByteString> list = this.placementsLoadedAds.get(str);
        if (list != null) {
            return (ByteString) g5g.H(list);
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void removeAd(ByteString byteString) {
        this.loadedAds.remove(byteString);
    }
}
