package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.ContextDataSource;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.domain.repository.PackagesRepository;
import java.util.List;

/* compiled from: PackagesRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class PackagesRepositoryImpl implements PackagesRepository {
    public final PackageManagerDataSource a;
    public final ContextDataSource b;

    public PackagesRepositoryImpl(PackageManagerDataSource packageManagerDataSource, ContextDataSource contextDataSource) {
        this.a = packageManagerDataSource;
        this.b = contextDataSource;
    }

    @Override // com.vk.push.core.domain.repository.PackagesRepository
    public boolean checkAppInstalled(String str) {
        return this.a.checkPackageNameIsInstalled(str);
    }

    @Override // com.vk.push.core.domain.repository.PackagesRepository
    public List<String> getInitializedClientPackages() {
        return this.a.getInitializedClientPackages();
    }

    @Override // com.vk.push.core.domain.repository.PackagesRepository
    public List<String> getInitializedHostPackages() {
        return this.a.getInitializedHostPackages();
    }

    @Override // com.vk.push.core.domain.repository.PackagesRepository
    public String getPackageName() {
        return this.b.getPackageName();
    }

    @Override // com.vk.push.core.domain.repository.PackagesRepository
    public boolean isIgnoringBatteryOptimizations() {
        return this.b.isIgnoringBatteryOptimizations();
    }
}
