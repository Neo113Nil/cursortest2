package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.ManifestDataSource;
import com.vk.push.core.domain.repository.MetadataRepository;

/* compiled from: MetadataRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class MetadataRepositoryImpl implements MetadataRepository {
    public final ManifestDataSource a;

    public MetadataRepositoryImpl(ManifestDataSource manifestDataSource) {
        this.a = manifestDataSource;
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public Integer getInt(String str) {
        return this.a.getInt(str);
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public int getNotificationColor() {
        return this.a.getNotificationColor();
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public int getNotificationIcon() {
        return this.a.getNotificationIcon();
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public String getServiceProcessName() {
        return getString(MetadataConsts.PROCESS_NAME_KEY);
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public String getString(String str) {
        return this.a.getString(str);
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public int getInt(String str, int i) {
        return this.a.getInt(str, i);
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public String getString(String str, String str2) {
        return this.a.getString(str, str2);
    }
}
