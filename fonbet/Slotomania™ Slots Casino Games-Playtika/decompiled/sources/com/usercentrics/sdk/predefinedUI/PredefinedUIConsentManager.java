package com.usercentrics.sdk.predefinedUI;

import com.usercentrics.sdk.models.settings.PredefinedUIDecision;
import com.usercentrics.sdk.services.tcf.TCFDecisionUILayer;
import com.usercentrics.sdk.ui.PredefinedUIResponse;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PredefinedUIConsentManager.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, d2 = {"Lcom/usercentrics/sdk/predefinedUI/PredefinedUIConsentManager;", "", "acceptAll", "Lcom/usercentrics/sdk/ui/PredefinedUIResponse;", "fromLayer", "Lcom/usercentrics/sdk/services/tcf/TCFDecisionUILayer;", "close", "denyAll", "save", "userDecisions", "", "Lcom/usercentrics/sdk/models/settings/PredefinedUIDecision;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface PredefinedUIConsentManager {
    PredefinedUIResponse acceptAll(TCFDecisionUILayer fromLayer);

    PredefinedUIResponse close();

    PredefinedUIResponse denyAll(TCFDecisionUILayer fromLayer);

    PredefinedUIResponse save(TCFDecisionUILayer fromLayer, List<PredefinedUIDecision> userDecisions);
}
