package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.ManifestDataSource;
import com.vk.push.core.domain.repository.MetadataRepository;

/* compiled from: MetadataRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class MetadataRepositoryImplKt {
    public static final MetadataRepository MetadataRepository(ManifestDataSource manifestDataSource) {
        return new MetadataRepositoryImpl(manifestDataSource);
    }
}
