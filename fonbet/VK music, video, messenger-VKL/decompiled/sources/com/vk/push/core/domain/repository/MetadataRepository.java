package com.vk.push.core.domain.repository;

/* compiled from: MetadataRepository.kt */
/* loaded from: classes.dex */
public interface MetadataRepository {
    int getInt(String str, int i);

    Integer getInt(String str);

    int getNotificationColor();

    int getNotificationIcon();

    String getServiceProcessName();

    String getString(String str);

    String getString(String str, String str2);
}
