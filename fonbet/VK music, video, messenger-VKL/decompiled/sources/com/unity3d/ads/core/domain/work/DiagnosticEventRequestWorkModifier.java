package com.unity3d.ads.core.domain.work;

import com.google.protobuf.kotlin.DslList;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.c5g;
import xsna.epx;

/* compiled from: DiagnosticEventRequestWorkModifier.kt */
/* loaded from: classes14.dex */
public final class DiagnosticEventRequestWorkModifier {
    private final SessionRepository sessionRepository;

    public DiagnosticEventRequestWorkModifier(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public final UniversalRequestOuterClass.UniversalRequest invoke(UniversalRequestOuterClass.UniversalRequest universalRequest) {
        UniversalRequestKt.Dsl _create = UniversalRequestKt.Dsl.Companion._create(universalRequest.toBuilder());
        UniversalRequestKt.PayloadKt.Dsl _create2 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(_create.getPayload().toBuilder());
        DiagnosticEventRequestKt.Dsl _create3 = DiagnosticEventRequestKt.Dsl.Companion._create(_create2.getDiagnosticEventRequest().toBuilder());
        DslList batch = _create3.getBatch();
        ArrayList arrayList = new ArrayList(c5g.u(batch, 10));
        Iterator<E> it = batch.iterator();
        while (it.hasNext()) {
            DiagnosticEventKt.Dsl _create4 = DiagnosticEventKt.Dsl.Companion._create(((DiagnosticEventRequestOuterClass.DiagnosticEvent) it.next()).toBuilder());
            _create4.setStringTags(_create4.getStringTagsMap(), "same_session", String.valueOf(epx.f(universalRequest.getSharedData().getSessionToken(), this.sessionRepository.getSessionToken())));
            arrayList.add(_create4._build());
        }
        _create3.clearBatch(_create3.getBatch());
        _create3.plusAssignAllBatch(_create3.getBatch(), arrayList);
        _create2.setDiagnosticEventRequest(_create3._build());
        _create.setPayload(_create2._build());
        return _create._build();
    }
}
