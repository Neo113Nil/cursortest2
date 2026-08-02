package com.unity3d.ads.core.domain.adquality;

import com.google.protobuf.ByteString;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import xsna.qd2;
import xsna.zr;

/* compiled from: AndroidUpdateAdQualitySessionToken.kt */
/* loaded from: classes14.dex */
public final class AndroidUpdateAdQualitySessionToken implements UpdateAdQualitySessionToken {
    private final AdQualityVersionDataSource adQualityVersionDataSource;
    private final Logger logger;

    public AndroidUpdateAdQualitySessionToken(Logger logger, AdQualityVersionDataSource adQualityVersionDataSource) {
        this.logger = logger;
        this.adQualityVersionDataSource = adQualityVersionDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$0(String str) {
        return zr.a("Ad Quality SDK version ", str, " is below minimum 9.5.1, skipping session token update");
    }

    @Override // com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken
    public void invoke(ByteString byteString) {
        String invoke = this.adQualityVersionDataSource.invoke();
        if (invoke == null) {
            return;
        }
        if (StringExtensionsKt.compareVersion(invoke, "9.5.1") < 0) {
            this.logger.debug(new qd2(invoke, 0));
            return;
        }
        try {
            IronSourceAdQuality.getInstance().setMetaData(AdQualityConstants.SESSION_TOKEN_METADATA_KEY, ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK setMetaData failed", th);
        }
    }
}
