package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.dof;

/* compiled from: CommonTokenNumberProvider.kt */
/* loaded from: classes14.dex */
public final class CommonTokenNumberProvider implements TokenNumberProvider {
    private final Lazy number$delegate;

    public CommonTokenNumberProvider(SessionRepository sessionRepository) {
        this.number$delegate = new bpn0(new dof(sessionRepository, 4));
    }

    private final int getNumber() {
        return ((Number) this.number$delegate.getValue()).intValue();
    }

    @Override // com.unity3d.ads.core.domain.TokenNumberProvider
    public int invoke() {
        return getNumber();
    }
}
