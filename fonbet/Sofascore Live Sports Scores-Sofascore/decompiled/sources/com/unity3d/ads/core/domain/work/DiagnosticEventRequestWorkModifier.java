package com.unity3d.ads.core.domain.work;

import com.google.protobuf.kotlin.DslList;
import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.k13;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "universalRequest", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiagnosticEventRequestWorkModifier {

    @NotNull
    private final SessionRepository sessionRepository;

    public DiagnosticEventRequestWorkModifier(@NotNull SessionRepository sessionRepository) {
        sessionRepository.getClass();
        this.sessionRepository = sessionRepository;
    }

    @NotNull
    public final UniversalRequestOuterClass.UniversalRequest invoke(@NotNull UniversalRequestOuterClass.UniversalRequest universalRequest) {
        universalRequest.getClass();
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Builder builder = universalRequest.toBuilder();
        builder.getClass();
        UniversalRequestKt.Dsl _create = companion._create(builder);
        UniversalRequestOuterClass.UniversalRequest.Payload payload = _create.getPayload();
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder2 = payload.toBuilder();
        builder2.getClass();
        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(builder2);
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = _create2.getDiagnosticEventRequest();
        DiagnosticEventRequestKt.Dsl.Companion companion3 = DiagnosticEventRequestKt.Dsl.INSTANCE;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder3 = diagnosticEventRequest.toBuilder();
        builder3.getClass();
        DiagnosticEventRequestKt.Dsl _create3 = companion3._create(builder3);
        DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent> batch = _create3.getBatch();
        ArrayList arrayList = new ArrayList(k13.r(batch, 10));
        for (DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent : batch) {
            DiagnosticEventKt.Dsl.Companion companion4 = DiagnosticEventKt.Dsl.INSTANCE;
            DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder4 = diagnosticEvent.toBuilder();
            builder4.getClass();
            DiagnosticEventKt.Dsl _create4 = companion4._create(builder4);
            _create4.putStringTags(_create4.getStringTagsMap(), "same_session", String.valueOf(Intrinsics.c(universalRequest.getSharedData().getSessionToken(), this.sessionRepository.getSessionToken())));
            arrayList.add(_create4._build());
        }
        _create3.clearBatch(_create3.getBatch());
        _create3.addAllBatch(_create3.getBatch(), arrayList);
        _create2.setDiagnosticEventRequest(_create3._build());
        _create.setPayload(_create2._build());
        return _create._build();
    }
}
