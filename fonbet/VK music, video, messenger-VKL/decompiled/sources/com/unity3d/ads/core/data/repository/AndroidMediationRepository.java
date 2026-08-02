package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.domain.MediationProviderParser;
import gatewayprotocol.v1.ClientInfoOuterClass;
import xsna.gzs;
import xsna.in0;

/* compiled from: AndroidMediationRepository.kt */
/* loaded from: classes14.dex */
public final class AndroidMediationRepository implements MediationRepository {
    private final MediationDataSource mediationDataSource;
    private final MediationProviderParser mediationProviderParser;

    public AndroidMediationRepository(MediationDataSource mediationDataSource, MediationProviderParser mediationProviderParser) {
        this.mediationDataSource = mediationDataSource;
        this.mediationProviderParser = mediationProviderParser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClientInfoOuterClass.MediationProvider _get_mediationProvider_$lambda$0(AndroidMediationRepository androidMediationRepository) {
        return androidMediationRepository.mediationProviderParser.invoke(androidMediationRepository.getName());
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public gzs<ClientInfoOuterClass.MediationProvider> getMediationProvider() {
        return new in0(this, 3);
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
