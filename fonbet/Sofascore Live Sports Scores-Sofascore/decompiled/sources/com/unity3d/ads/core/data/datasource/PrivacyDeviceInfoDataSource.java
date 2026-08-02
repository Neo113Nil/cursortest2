package com.unity3d.ads.core.data.datasource;

import defpackage.a70;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "", "fetch", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "allowed", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PrivacyDeviceInfoDataSource {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ PiiOuterClass.Pii fetch$default(PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, AllowedPiiOuterClass.AllowedPii allowedPii, int i, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: fetch");
                return null;
            }
            if ((i & 1) != 0) {
                allowedPii = AllowedPiiOuterClass.AllowedPii.getDefaultInstance();
            }
            return privacyDeviceInfoDataSource.fetch(allowedPii);
        }
    }

    @NotNull
    PiiOuterClass.Pii fetch(@NotNull AllowedPiiOuterClass.AllowedPii allowed);
}
