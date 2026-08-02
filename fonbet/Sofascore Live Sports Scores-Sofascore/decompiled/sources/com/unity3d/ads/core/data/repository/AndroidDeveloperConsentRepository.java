package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDeveloperConsentRepository;", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "developerConsentDataSource", "Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;", "<init>", "(Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;)V", "developerConsent", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsent", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidDeveloperConsentRepository implements DeveloperConsentRepository {

    @NotNull
    private final DeveloperConsentDataSource developerConsentDataSource;

    public AndroidDeveloperConsentRepository(@NotNull DeveloperConsentDataSource developerConsentDataSource) {
        developerConsentDataSource.getClass();
        this.developerConsentDataSource = developerConsentDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.DeveloperConsentRepository
    @NotNull
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        return this.developerConsentDataSource.getDeveloperConsent();
    }
}
