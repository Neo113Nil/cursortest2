package com.unity3d.ads.core.domain.privacy;

import com.unity3d.services.core.misc.JsonFlattenerRules;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collections;
import xsna.e43;

/* compiled from: LegacyUserConsentFlattenerRulesUseCase.kt */
/* loaded from: classes14.dex */
public final class LegacyUserConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(e43.o("privacy", PluginErrorDetails.Platform.UNITY, "pipl"), Collections.singletonList("value"), e43.o("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
