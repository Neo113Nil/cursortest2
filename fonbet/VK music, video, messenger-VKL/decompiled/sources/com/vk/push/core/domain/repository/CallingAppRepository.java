package com.vk.push.core.domain.repository;

/* compiled from: CallingAppRepository.kt */
/* loaded from: classes5.dex */
public interface CallingAppRepository {
    String getPackageNameForPid(int i);

    String getPackageNameForUid(int i);

    String getSignatureForPackageName(String str);
}
