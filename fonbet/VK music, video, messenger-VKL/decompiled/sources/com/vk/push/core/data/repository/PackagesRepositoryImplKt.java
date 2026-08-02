package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.ContextDataSource;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.domain.repository.PackagesRepository;

/* compiled from: PackagesRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class PackagesRepositoryImplKt {
    public static final PackagesRepository PackagesRepository(PackageManagerDataSource packageManagerDataSource, ContextDataSource contextDataSource) {
        return new PackagesRepositoryImpl(packageManagerDataSource, contextDataSource);
    }
}
