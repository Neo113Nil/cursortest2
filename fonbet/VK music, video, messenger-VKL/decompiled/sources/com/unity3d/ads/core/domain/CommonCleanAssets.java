package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;

/* compiled from: CommonCleanAssets.kt */
/* loaded from: classes14.dex */
public final class CommonCleanAssets implements CleanAssets {
    private final CacheRepository cacheRepository;

    public CommonCleanAssets(CacheRepository cacheRepository) {
        this.cacheRepository = cacheRepository;
    }

    @Override // com.unity3d.ads.core.domain.CleanAssets
    public Object invoke(spj<? super s3q0> spjVar) {
        Object clearCache = this.cacheRepository.clearCache(spjVar);
        return clearCache == CoroutineSingletons.COROUTINE_SUSPENDED ? clearCache : s3q0.a;
    }
}
