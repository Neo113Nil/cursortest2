package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;

/* compiled from: GetDiagnosticEventBatchRequest.kt */
/* loaded from: classes14.dex */
public final class GetDiagnosticEventBatchRequest {
    public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest invoke(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list) {
        DiagnosticEventRequestKt.Dsl _create = DiagnosticEventRequestKt.Dsl.Companion._create(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder());
        _create.plusAssignAllBatch(_create.getBatch(), list);
        return _create._build();
    }
}
