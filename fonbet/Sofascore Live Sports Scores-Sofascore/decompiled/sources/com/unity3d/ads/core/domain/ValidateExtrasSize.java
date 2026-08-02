package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.MapExtensionsKt;
import defpackage.tub;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", "source", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValidateExtrasSize {

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    public ValidateExtrasSize(@NotNull SessionRepository sessionRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        sessionRepository.getClass();
        sendDiagnosticEvent.getClass();
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public static /* synthetic */ void invoke$default(ValidateExtrasSize validateExtrasSize, Map map, String str, AdObject adObject, int i, Object obj) {
        if ((i & 4) != 0) {
            adObject = null;
        }
        validateExtrasSize.invoke(map, str, adObject);
    }

    public final void invoke(@NotNull Map<String, String> extras, @NotNull String source, @Nullable AdObject adObject) {
        int maxExtrasSizeKb;
        int sizeInKb;
        extras.getClass();
        source.getClass();
        if (!extras.isEmpty() && (maxExtrasSizeKb = this.sessionRepository.getNativeConfiguration().getMaxExtrasSizeKb()) > 0 && (sizeInKb = MapExtensionsKt.sizeInKb(extras)) >= maxExtrasSizeKb) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE, (Double) null, tub.h(new Pair("source", source), new Pair("size_kb", String.valueOf(sizeInKb))), (Map) null, adObject, (Integer) null, (ByteString) null, 106, (Object) null);
        }
    }
}
