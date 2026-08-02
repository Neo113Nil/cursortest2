package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* compiled from: CommonGetInitializationState.kt */
/* loaded from: classes14.dex */
public final class CommonGetInitializationState implements GetInitializationState {
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(SessionRepository sessionRepository, SDKPropertiesManager sDKPropertiesManager) {
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sDKPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.GetInitializationState
    public InitializationState invoke(boolean z) {
        return z ? InitializationStateKt.toBold(this.sdkPropertiesManager.getCurrentInitializationState()) : this.sessionRepository.getInitializationState();
    }
}
