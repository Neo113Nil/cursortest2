package com.unity3d.ads.core.domain.privacy;

import com.unity3d.services.core.misc.JsonFlattenerRules;
import java.util.Collections;
import xsna.e43;

/* compiled from: DeveloperConsentFlattenerRulesUseCase.kt */
/* loaded from: classes14.dex */
public final class DeveloperConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(e43.o("privacy", "gdpr", "pipl", "user"), Collections.singletonList("value"), e43.o("ts"));
    }
}
