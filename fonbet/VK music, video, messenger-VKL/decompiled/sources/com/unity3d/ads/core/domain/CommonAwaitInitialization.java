package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import xsna.oxo0;
import xsna.spj;

/* compiled from: CommonAwaitInitialization.kt */
/* loaded from: classes14.dex */
public final class CommonAwaitInitialization implements AwaitInitialization {
    private final SessionRepository sessionRepository;

    public CommonAwaitInitialization(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.AwaitInitialization
    public Object invoke(long j, spj<? super InitializationState> spjVar) {
        return oxo0.c(j, new CommonAwaitInitialization$invoke$2(this, null), spjVar);
    }
}
