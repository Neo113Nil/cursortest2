package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.CallingAppDataSource;
import com.vk.push.core.domain.repository.CallingAppRepository;

/* compiled from: CallingAppRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class CallingAppRepositoryImpl implements CallingAppRepository {
    public final CallingAppDataSource a;

    public CallingAppRepositoryImpl(CallingAppDataSource callingAppDataSource) {
        this.a = callingAppDataSource;
    }

    @Override // com.vk.push.core.domain.repository.CallingAppRepository
    public String getPackageNameForPid(int i) {
        return this.a.getPackageNameForPid(i);
    }

    @Override // com.vk.push.core.domain.repository.CallingAppRepository
    public String getPackageNameForUid(int i) {
        return this.a.getPackageNameForUid(i);
    }

    @Override // com.vk.push.core.domain.repository.CallingAppRepository
    public String getSignatureForPackageName(String str) {
        return this.a.getSignatureForPackageName(str);
    }
}
