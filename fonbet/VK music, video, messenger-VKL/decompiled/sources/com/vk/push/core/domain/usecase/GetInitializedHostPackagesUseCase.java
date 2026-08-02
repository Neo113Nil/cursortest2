package com.vk.push.core.domain.usecase;

import com.vk.push.core.domain.repository.PackagesRepository;
import java.util.List;

/* compiled from: GetInitializedHostPackagesUseCase.kt */
/* loaded from: classes5.dex */
public final class GetInitializedHostPackagesUseCase {
    public final PackagesRepository a;

    public GetInitializedHostPackagesUseCase(PackagesRepository packagesRepository) {
        this.a = packagesRepository;
    }

    public final List<String> invoke() {
        return this.a.getInitializedHostPackages();
    }
}
