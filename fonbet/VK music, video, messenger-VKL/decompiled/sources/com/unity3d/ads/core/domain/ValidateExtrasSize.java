package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.MapExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* compiled from: ValidateExtrasSize.kt */
/* loaded from: classes14.dex */
public final class ValidateExtrasSize {
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public ValidateExtrasSize(SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public static /* synthetic */ void invoke$default(ValidateExtrasSize validateExtrasSize, Map map, String str, AdObject adObject, int i, Object obj) {
        if ((i & 4) != 0) {
            adObject = null;
        }
        validateExtrasSize.invoke(map, str, adObject);
    }

    public final void invoke(Map<String, String> map, String str, AdObject adObject) {
        int maxExtrasSizeKb;
        int sizeInKb;
        if (!map.isEmpty() && (maxExtrasSizeKb = this.sessionRepository.getNativeConfiguration().getMaxExtrasSizeKb()) > 0 && (sizeInKb = MapExtensionsKt.sizeInKb(map)) >= maxExtrasSizeKb) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE, (Double) null, pn00.k(new Pair("source", str), new Pair("size_kb", String.valueOf(sizeInKb))), (Map) null, adObject, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, (Object) null);
        }
    }
}
