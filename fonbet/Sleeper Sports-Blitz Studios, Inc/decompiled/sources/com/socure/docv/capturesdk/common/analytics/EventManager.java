package com.socure.docv.capturesdk.common.analytics;

import com.braze.ui.actions.brazeactions.steps.StepData;
import com.socure.docv.capturesdk.common.analytics.AnalyticsAgent;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.repository.RepoHolder;
import com.socure.docv.capturesdk.common.session.SessionManager;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: EventManager.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J!\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ?\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00112*\u0010\u0016\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00180\u0017\"\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0011JG\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\u00112\b\u0010$\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "", "repoHolder", "Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "(Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;Lkotlinx/coroutines/CoroutineExceptionHandler;)V", "getExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "setExceptionHandler", "(Lkotlinx/coroutines/CoroutineExceptionHandler;)V", "mixPanel", "Lcom/socure/docv/capturesdk/common/analytics/MixPanelAgent;", "addLateAttrs", "", "lateAttrs", "", "", "addLateAttrs$capturesdk_productionRelease", "cancel", "sendEvent", "eventName", StepData.ARGS, "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)V", "updatePublicKey", "publicKey", "updateSessionData", "transactionToken", "eventId", "isInternal", "", "accountId", "", "environment", "language", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EventManager {
    private CoroutineExceptionHandler exceptionHandler;
    private final MixPanelAgent mixPanel;

    public EventManager(RepoHolder repoHolder, CoroutineExceptionHandler coroutineExceptionHandler) {
        Intrinsics.checkNotNullParameter(repoHolder, "repoHolder");
        this.exceptionHandler = coroutineExceptionHandler;
        this.mixPanel = new MixPanelAgent(repoHolder.getMixPanelRepository(), this.exceptionHandler);
    }

    public /* synthetic */ EventManager(RepoHolder repoHolder, CoroutineExceptionHandler coroutineExceptionHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(repoHolder, (i & 2) != 0 ? null : coroutineExceptionHandler);
    }

    public final CoroutineExceptionHandler getExceptionHandler() {
        return this.exceptionHandler;
    }

    public final void setExceptionHandler(CoroutineExceptionHandler coroutineExceptionHandler) {
        this.exceptionHandler = coroutineExceptionHandler;
    }

    public final void sendEvent(String eventName, Pair<String, String>... args) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(args, "args");
        LoggerKt.logD("SDLT_EM", "Sending event: " + eventName);
        try {
            this.mixPanel.sendEvent(eventName, (Pair[]) Arrays.copyOf(args, args.length));
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_EM", "Ex in sendEvent: " + th.getLocalizedMessage(), null, 4, null);
        }
    }

    public final void addLateAttrs$capturesdk_productionRelease(Map<String, String> lateAttrs) {
        Intrinsics.checkNotNullParameter(lateAttrs, "lateAttrs");
        this.mixPanel.addLateAttrs$capturesdk_productionRelease(lateAttrs);
    }

    public final void updateSessionData(String transactionToken, String eventId, Boolean isInternal, Integer accountId, String environment, String language) {
        LoggerKt.logD("SDLT_EM", "updateSessionData called");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String sessionToken = SessionManager.INSTANCE.getSessionToken();
        if (sessionToken != null) {
            linkedHashMap.put(AnalyticsConstantsKt.KEY_DISTINCT_ID, sessionToken);
        }
        if (transactionToken != null) {
            linkedHashMap.put(AnalyticsConstantsKt.KEY_REFERENCE_ID, transactionToken);
        }
        if (eventId != null) {
            linkedHashMap.put("event_id", eventId);
        }
        if (isInternal != null) {
            isInternal.booleanValue();
            linkedHashMap.put(AnalyticsConstantsKt.KEY_IS_INTERNAL, isInternal.toString());
        }
        if (accountId != null) {
            accountId.intValue();
            linkedHashMap.put(AnalyticsConstantsKt.KEY_ACCOUNT_ID, accountId.toString());
        }
        if (environment != null) {
            linkedHashMap.put("environment", environment);
        }
        if (language != null) {
            linkedHashMap.put("language", language);
        }
        this.mixPanel.updateParams(linkedHashMap);
    }

    public final void updatePublicKey(String publicKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        LoggerKt.logD("SDLT_EM", "updatePublicKey called");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("public_key", publicKey);
        this.mixPanel.updateParams(linkedHashMap);
    }

    public final void cancel() {
        AnalyticsAgent.DefaultImpls.cancel$default(this.mixPanel, null, 1, null);
    }
}
