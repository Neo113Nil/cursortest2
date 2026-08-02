package com.unity3d.ads.core.domain;

import com.unity3d.ads.MediationInfo;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "", "invoke", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoData", "Lcom/unity3d/ads/MediationInfo;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MediationInfoConverter {
    @NotNull
    MediationInfoOuterClass.MediationInfo invoke(@NotNull MediationInfo mediationInfoData);
}
