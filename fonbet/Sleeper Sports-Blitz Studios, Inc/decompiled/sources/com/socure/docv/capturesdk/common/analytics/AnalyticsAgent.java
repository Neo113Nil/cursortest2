package com.socure.docv.capturesdk.common.analytics;

import com.braze.ui.actions.brazeactions.steps.StepData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: AnalyticsAgent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&JA\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n0\t\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nH&¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/AnalyticsAgent;", "", "cancel", "", "message", "", "sendEvent", "eventName", StepData.ARGS, "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)V", "updateParams", "params", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface AnalyticsAgent {
    void cancel(String message);

    void sendEvent(String eventName, Pair<String, String>... args);

    void updateParams(Map<String, String> params);

    /* compiled from: AnalyticsAgent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(AnalyticsAgent analyticsAgent, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            analyticsAgent.cancel(str);
        }
    }
}
