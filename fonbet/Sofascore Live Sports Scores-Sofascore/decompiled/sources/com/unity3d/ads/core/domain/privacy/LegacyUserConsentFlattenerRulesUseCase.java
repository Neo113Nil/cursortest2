package com.unity3d.ads.core.domain.privacy;

import com.ironsource.U3;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/privacy/LegacyUserConsentFlattenerRulesUseCase;", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "<init>", "()V", "invoke", "Lcom/unity3d/services/core/misc/JsonFlattenerRules;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyUserConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    @NotNull
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(b.l("privacy", "unity", "pipl"), a.c(U3.i.X), b.l("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
