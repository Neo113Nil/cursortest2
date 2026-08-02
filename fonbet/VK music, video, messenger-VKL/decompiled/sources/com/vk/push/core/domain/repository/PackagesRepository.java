package com.vk.push.core.domain.repository;

import java.util.List;

/* compiled from: PackagesRepository.kt */
/* loaded from: classes5.dex */
public interface PackagesRepository {
    boolean checkAppInstalled(String str);

    List<String> getInitializedClientPackages();

    List<String> getInitializedHostPackages();

    String getPackageName();

    boolean isIgnoringBatteryOptimizations();
}
