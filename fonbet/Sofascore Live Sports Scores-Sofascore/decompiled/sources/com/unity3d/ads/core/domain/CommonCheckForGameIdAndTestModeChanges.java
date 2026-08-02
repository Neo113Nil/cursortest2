package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.tub;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002J,\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCheckForGameIdAndTestModeChanges;", "Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "getGameId", "Lcom/unity3d/ads/core/domain/GetGameId;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "legacy", "", "sendDiagnostic", "event", "", "tags", "", "isLegacy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {

    @NotNull
    private final GetGameId getGameId;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(@NotNull GetGameId getGameId, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        getGameId.getClass();
        sendDiagnosticEvent.getClass();
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String event, Map<String, String> tags, boolean isLegacy) {
        if (isLegacy) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, event, (Double) null, tags, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean legacy) {
        String invoke = this.getGameId.invoke();
        if (invoke == null) {
            invoke = "null";
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = "null";
        }
        Map<String, String> h = tub.h(new Pair("previous_game_id", previousGameId), new Pair("game_id", invoke));
        if (previousGameId.equals("null")) {
            return;
        }
        if (invoke.equals(previousGameId)) {
            sendDiagnostic("native_initialize_game_id_same", h, legacy);
        } else {
            sendDiagnostic("native_initialize_game_id_changed", h, legacy);
        }
        boolean isTestMode = SdkProperties.isTestMode();
        boolean previousTestMode = SdkProperties.getPreviousTestMode();
        Map<String, String> h2 = tub.h(new Pair("previous_test_mode", String.valueOf(previousTestMode)), new Pair("test_mode", String.valueOf(isTestMode)));
        if (isTestMode != previousTestMode) {
            sendDiagnostic("native_initialize_test_mode_changed", h2, legacy);
        } else {
            sendDiagnostic("native_initialize_test_mode_same", h2, legacy);
        }
    }
}
