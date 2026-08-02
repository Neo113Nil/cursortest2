package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.ClientInfoOuterClass;
import xsna.gzs;

/* compiled from: MediationRepository.kt */
/* loaded from: classes14.dex */
public interface MediationRepository {
    gzs<ClientInfoOuterClass.MediationProvider> getMediationProvider();

    String getName();

    String getVersion();
}
