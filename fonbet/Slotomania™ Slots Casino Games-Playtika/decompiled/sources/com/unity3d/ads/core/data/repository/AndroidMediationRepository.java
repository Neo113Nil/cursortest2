package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.domain.MediationProviderParser;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidMediationRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidMediationRepository;", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "mediationDataSource", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "mediationProviderParser", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "(Lcom/unity3d/ads/core/data/datasource/MediationDataSource;Lcom/unity3d/ads/core/domain/MediationProviderParser;)V", "mediationProvider", "Lkotlin/Function0;", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Lkotlin/jvm/functions/Function0;", "name", "", "getName", "()Ljava/lang/String;", "version", "getVersion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidMediationRepository implements MediationRepository {
    private final MediationDataSource mediationDataSource;
    private final MediationProviderParser mediationProviderParser;

    public AndroidMediationRepository(MediationDataSource mediationDataSource, MediationProviderParser mediationProviderParser) {
        Intrinsics.checkNotNullParameter(mediationDataSource, "mediationDataSource");
        Intrinsics.checkNotNullParameter(mediationProviderParser, "mediationProviderParser");
        this.mediationDataSource = mediationDataSource;
        this.mediationProviderParser = mediationProviderParser;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public Function0<ClientInfoOuterClass.MediationProvider> getMediationProvider() {
        return new Function0<ClientInfoOuterClass.MediationProvider>() { // from class: com.unity3d.ads.core.data.repository.AndroidMediationRepository$mediationProvider$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ClientInfoOuterClass.MediationProvider invoke() {
                MediationProviderParser mediationProviderParser;
                mediationProviderParser = AndroidMediationRepository.this.mediationProviderParser;
                return mediationProviderParser.invoke(AndroidMediationRepository.this.getName());
            }
        };
    }
}
