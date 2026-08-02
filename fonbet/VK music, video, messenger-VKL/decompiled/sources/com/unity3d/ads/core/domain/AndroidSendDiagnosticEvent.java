package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AndroidSendDiagnosticEvent.kt */
/* loaded from: classes14.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private final LifecycleDataSource lifecycleDataSource;

    public AndroidSendDiagnosticEvent(DiagnosticEventRepository diagnosticEventRepository, GetDiagnosticEventRequest getDiagnosticEventRequest, LifecycleDataSource lifecycleDataSource) {
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.lifecycleDataSource = lifecycleDataSource;
    }

    private final void sendEvent(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String str, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num, ByteString byteString) {
        Boolean valueOf = adObject != null ? Boolean.valueOf(adObject.isHeaderBidding()) : null;
        ByteString opportunityId = adObject != null ? adObject.getOpportunityId() : null;
        String placementId = adObject != null ? adObject.getPlacementId() : null;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = adObject != null ? adObject.getAdType() : null;
        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        if (adObject != null && adObject.isOfferwallAd()) {
            linkedHashMap.put("offerwall", "true");
        }
        if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null) {
            linkedHashMap.put("webviewless", "true");
        }
        linkedHashMap.put("app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(diagnosticEventType, str, linkedHashMap, map2, d, valueOf, opportunityId, placementId, adType, num, byteString));
    }

    public static /* synthetic */ void sendEvent$default(AndroidSendDiagnosticEvent androidSendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String str, Double d, Map map, Map map2, AdObject adObject, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        androidSendDiagnosticEvent.sendEvent(diagnosticEventType, str, d, map, map2, adObject, num, byteString);
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(String str, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num, ByteString byteString) {
        sendEvent(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM, str, d, map, map2, adObject, num, byteString);
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num, ByteString byteString) {
        sendEvent$default(this, diagnosticEventType, null, d, map, map2, adObject, num, byteString, 2, null);
    }
}
