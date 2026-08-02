package com.unity3d.ads.core.domain.adquality;

import com.google.protobuf.ByteString;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import defpackage.lnb;
import defpackage.o40;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/adquality/AndroidUpdateAdQualitySessionToken;", "Lcom/unity3d/ads/core/domain/adquality/UpdateAdQualitySessionToken;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "adQualityVersionDataSource", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "<init>", "(Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;)V", "invoke", "", "sessionToken", "Lcom/google/protobuf/ByteString;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidUpdateAdQualitySessionToken implements UpdateAdQualitySessionToken {

    @NotNull
    private final AdQualityVersionDataSource adQualityVersionDataSource;

    @NotNull
    private final Logger logger;

    public AndroidUpdateAdQualitySessionToken(@NotNull Logger logger, @NotNull AdQualityVersionDataSource adQualityVersionDataSource) {
        logger.getClass();
        adQualityVersionDataSource.getClass();
        this.logger = logger;
        this.adQualityVersionDataSource = adQualityVersionDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$0(String str) {
        return lnb.o("Ad Quality SDK version ", str, " is below minimum 9.5.1, skipping session token update");
    }

    @Override // com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken
    public void invoke(@NotNull ByteString sessionToken) {
        sessionToken.getClass();
        String invoke = this.adQualityVersionDataSource.invoke();
        if (invoke == null) {
            return;
        }
        int i = 0;
        if (StringExtensionsKt.compareVersion(invoke, "9.5.1") < 0) {
            this.logger.debug(new o40(invoke, i));
            return;
        }
        try {
            IronSourceAdQuality.getInstance().setMetaData(AdQualityConstants.SESSION_TOKEN_METADATA_KEY, ProtobufExtensionsKt.toBase64$default(sessionToken, false, 1, null));
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK setMetaData failed", th);
        }
    }
}
