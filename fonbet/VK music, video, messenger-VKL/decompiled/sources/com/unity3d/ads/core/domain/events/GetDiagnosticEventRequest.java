package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticTagKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.vtk0;
import xsna.xh50;

/* compiled from: GetDiagnosticEventRequest.kt */
/* loaded from: classes14.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final xh50<Integer> uniqueId = vtk0.a(-1);

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        this.getSharedDataTimestamps = getSharedDataTimestamps;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DiagnosticEventRequestOuterClass.DiagnosticTagType getTag(String str) {
        switch (str.hashCode()) {
            case -2140823688:
                if (str.equals("cache_source")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CACHE;
                }
                break;
            case -989163880:
                if (str.equals("protocol")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_PROTOCOL;
                }
                break;
            case -896505829:
                if (str.equals("source")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_SOURCE;
                }
                break;
            case 116079:
                if (str.equals("url")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_HOST;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_STATE;
                }
                break;
            case 123374419:
                if (str.equals("is_retry")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_IS_RETRY;
                }
                break;
            case 1439091211:
                if (str.equals("complete_state")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_COMPLETE_STATE;
                }
                break;
            case 2105542229:
                if (str.equals("size_kb")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_SIZE_KB;
                }
                break;
        }
        return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM;
    }

    private final List<DiagnosticEventRequestOuterClass.DiagnosticTag> getTags(Map<String, String> map, Map<String, Integer> map2) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                DiagnosticTagKt.Dsl _create = DiagnosticTagKt.Dsl.Companion._create(DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder());
                DiagnosticEventRequestOuterClass.DiagnosticTagType tag = getTag(entry.getKey());
                _create.setType(tag);
                if (tag == DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM) {
                    _create.setCustomTagType(entry.getKey());
                }
                _create.setStringValue(entry.getValue());
                arrayList2.add(_create._build());
            }
            arrayList.addAll(arrayList2);
        }
        if (map2 != null) {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Map.Entry<String, Integer> entry2 : map2.entrySet()) {
                DiagnosticTagKt.Dsl _create2 = DiagnosticTagKt.Dsl.Companion._create(DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder());
                DiagnosticEventRequestOuterClass.DiagnosticTagType tag2 = getTag(entry2.getKey());
                _create2.setType(tag2);
                if (tag2 == DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM) {
                    _create2.setCustomTagType(entry2.getKey());
                }
                _create2.setIntValue(entry2.getValue().intValue());
                arrayList3.add(_create2._build());
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String str, Map<String, String> map, Map<String, Integer> map2, Double d, Boolean bool, ByteString byteString, String str2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, Integer num, ByteString byteString2) {
        Integer value;
        Integer valueOf;
        DiagnosticEventKt.Dsl _create = DiagnosticEventKt.Dsl.Companion._create(DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder());
        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : null;
        String remove = linkedHashMap != null ? linkedHashMap.remove("reason") : null;
        String remove2 = linkedHashMap != null ? linkedHashMap.remove("reason_debug") : null;
        xh50<Integer> xh50Var = this.uniqueId;
        do {
            value = xh50Var.getValue();
            valueOf = Integer.valueOf(value.intValue() + 1);
        } while (!xh50Var.compareAndSet(value, valueOf));
        _create.setEventId(valueOf.intValue());
        _create.setEventType(diagnosticEventType);
        if (str != null) {
            _create.setCustomEventType(str);
        }
        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
        if (d != null) {
            _create.setTimeValue(d.doubleValue());
        }
        if (bool != null) {
            _create.setIsHeaderBidding(bool.booleanValue());
        }
        if (byteString != null) {
            _create.setImpressionOpportunityId(byteString);
        }
        if (str2 != null) {
            _create.setPlacementId(str2);
        }
        if (diagnosticAdType != null) {
            _create.setAdType(diagnosticAdType);
        }
        if (num != null) {
            _create.setHeaderBiddingTokenNumber(num.intValue());
        }
        if (remove != null) {
            _create.setReason(remove);
        }
        if (remove2 != null) {
            _create.setReasonDebug(remove2);
        }
        if (byteString2 != null) {
            _create.setErrorToken(byteString2);
        }
        _create.plusAssignAllTags(_create.getTags(), getTags(linkedHashMap, map2));
        return _create._build();
    }
}
