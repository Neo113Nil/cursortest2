package com.vk.push.core.domain.usecase;

import com.vk.push.core.domain.repository.PackagesRepository;

/* compiled from: CheckHostsAvailabilityUseCase.kt */
/* loaded from: classes5.dex */
public final class CheckHostsAvailabilityUseCase {
    public final PackagesRepository a;

    public CheckHostsAvailabilityUseCase(PackagesRepository packagesRepository) {
        this.a = packagesRepository;
    }

    public final boolean invoke() {
        return !this.a.getInitializedHostPackages().isEmpty();
    }
}
