package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.ironsource.U3;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJj\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0002\u0010\u0019Jj\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0002\u0010\u001bJu\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidSendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "getDiagnosticEventRequest", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "<init>", "(Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;)V", "invoke", "", "event", "", U3.i.X, "", "tags", "", "intTags", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "tokenNumber", "errorToken", "Lcom/google/protobuf/ByteString;", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;Lcom/google/protobuf/ByteString;)V", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;Lcom/google/protobuf/ByteString;)V", "sendEvent", "customEventName", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;Lcom/google/protobuf/ByteString;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {

    @NotNull
    private final DiagnosticEventRepository diagnosticEventRepository;

    @NotNull
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    public AndroidSendDiagnosticEvent(@NotNull DiagnosticEventRepository diagnosticEventRepository, @NotNull GetDiagnosticEventRequest getDiagnosticEventRequest, @NotNull LifecycleDataSource lifecycleDataSource) {
        diagnosticEventRepository.getClass();
        getDiagnosticEventRequest.getClass();
        lifecycleDataSource.getClass();
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.lifecycleDataSource = lifecycleDataSource;
    }

    private final void sendEvent(DiagnosticEventRequestOuterClass.DiagnosticEventType event, String customEventName, Double value, Map<String, String> tags, Map<String, Integer> intTags, AdObject adObject, Integer tokenNumber, ByteString errorToken) {
        Boolean valueOf = adObject != null ? Boolean.valueOf(adObject.isHeaderBidding()) : null;
        ByteString opportunityId = adObject != null ? adObject.getOpportunityId() : null;
        String placementId = adObject != null ? adObject.getPlacementId() : null;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = adObject != null ? adObject.getAdType() : null;
        LinkedHashMap linkedHashMap = tags != null ? new LinkedHashMap(tags) : new LinkedHashMap();
        if (adObject != null && adObject.isOfferwallAd()) {
            linkedHashMap.put("offerwall", "true");
        }
        if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null) {
            linkedHashMap.put("webviewless", "true");
        }
        linkedHashMap.put("app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(event, customEventName, linkedHashMap, intTags, value, valueOf, opportunityId, placementId, adType, tokenNumber, errorToken));
    }

    public static /* synthetic */ void sendEvent$default(AndroidSendDiagnosticEvent androidSendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String str, Double d, Map map, Map map2, AdObject adObject, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        androidSendDiagnosticEvent.sendEvent(diagnosticEventType, str, d, map, map2, adObject, num, byteString);
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEventType event, @Nullable Double value, @Nullable Map<String, String> tags, @Nullable Map<String, Integer> intTags, @Nullable AdObject adObject, @Nullable Integer tokenNumber, @Nullable ByteString errorToken) {
        event.getClass();
        sendEvent$default(this, event, null, value, tags, intTags, adObject, tokenNumber, errorToken, 2, null);
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(@NotNull String event, @Nullable Double value, @Nullable Map<String, String> tags, @Nullable Map<String, Integer> intTags, @Nullable AdObject adObject, @Nullable Integer tokenNumber, @Nullable ByteString errorToken) {
        event.getClass();
        sendEvent(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM, event, value, tags, intTags, adObject, tokenNumber, errorToken);
    }
}
