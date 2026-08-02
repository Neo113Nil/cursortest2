package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.CallingAppDataSource;
import com.vk.push.core.domain.repository.CallingAppRepository;

/* compiled from: CallingAppRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class CallingAppRepositoryImplKt {
    public static final CallingAppRepository CallingAppRepository(CallingAppDataSource callingAppDataSource) {
        return new CallingAppRepositoryImpl(callingAppDataSource);
    }
}
