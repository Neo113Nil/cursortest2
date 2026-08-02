package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonSetInitializationState;", "Lcom/unity3d/ads/core/domain/SetInitializationState;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sdkPropertiesManager", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;)V", "invoke", "", "state", "Lcom/unity3d/ads/core/data/model/InitializationState;", "legacy", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonSetInitializationState implements SetInitializationState {

    @NotNull
    private final SDKPropertiesManager sdkPropertiesManager;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonSetInitializationState(@NotNull SessionRepository sessionRepository, @NotNull SDKPropertiesManager sDKPropertiesManager) {
        sessionRepository.getClass();
        sDKPropertiesManager.getClass();
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sDKPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.SetInitializationState
    public void invoke(@NotNull InitializationState state, boolean legacy) {
        state.getClass();
        if (legacy) {
            this.sdkPropertiesManager.setInitializeState(InitializationStateKt.toLegacy(state));
        } else {
            this.sessionRepository.setInitializationState(state);
        }
    }
}
