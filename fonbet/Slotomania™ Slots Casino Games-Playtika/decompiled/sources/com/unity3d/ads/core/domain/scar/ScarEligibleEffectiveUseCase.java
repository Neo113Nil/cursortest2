package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.TokenConfiguration;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ScarEligibleEffectiveUseCase.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H¦\u0002¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "", "invoke", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScarEligibleEffectiveUseCase {
    List<AdFormatOuterClass.AdFormat> invoke(TokenConfiguration tokenConfiguration);
}
