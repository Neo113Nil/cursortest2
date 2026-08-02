package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* compiled from: CommonCheckForGameIdAndTestModeChanges.kt */
/* loaded from: classes14.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {
    private final GetGameId getGameId;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(GetGameId getGameId, SendDiagnosticEvent sendDiagnosticEvent) {
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String str, Map<String, String> map, boolean z) {
        if (z) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, str, (Double) null, map, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean z) {
        String invoke = this.getGameId.invoke();
        if (invoke == null) {
            invoke = "null";
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = "null";
        }
        Map<String, String> k = pn00.k(new Pair("previous_game_id", previousGameId), new Pair("game_id", invoke));
        if (previousGameId.equals("null")) {
            return;
        }
        if (invoke.equals(previousGameId)) {
            sendDiagnostic("native_initialize_game_id_same", k, z);
        } else {
            sendDiagnostic("native_initialize_game_id_changed", k, z);
        }
        boolean isTestMode = SdkProperties.isTestMode();
        boolean previousTestMode = SdkProperties.getPreviousTestMode();
        Map<String, String> k2 = pn00.k(new Pair("previous_test_mode", String.valueOf(previousTestMode)), new Pair("test_mode", String.valueOf(isTestMode)));
        if (isTestMode != previousTestMode) {
            sendDiagnostic("native_initialize_test_mode_changed", k2, z);
        } else {
            sendDiagnostic("native_initialize_test_mode_same", k2, z);
        }
    }
}
