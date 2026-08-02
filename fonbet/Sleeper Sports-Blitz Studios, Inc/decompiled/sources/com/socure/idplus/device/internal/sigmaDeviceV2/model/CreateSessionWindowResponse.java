package com.socure.idplus.device.internal.sigmaDeviceV2.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import com.socure.idplus.device.internal.sigmaDeviceConfig.model.SigmaDeviceConfigResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateSessionWindowResponse;", "", "sessionMetadata", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/SessionMetadata;", "sigmaDeviceConfigResponse", "Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/SigmaDeviceConfigResponse;", "(Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/SessionMetadata;Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/SigmaDeviceConfigResponse;)V", "getSessionMetadata", "()Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/SessionMetadata;", "getSigmaDeviceConfigResponse", "()Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/SigmaDeviceConfigResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CreateSessionWindowResponse {

    @SerializedName("sessionMetadata")
    private final SessionMetadata sessionMetadata;

    @SerializedName("configuration")
    private final SigmaDeviceConfigResponse sigmaDeviceConfigResponse;

    public CreateSessionWindowResponse(SessionMetadata sessionMetadata, SigmaDeviceConfigResponse sigmaDeviceConfigResponse) {
        Intrinsics.checkNotNullParameter(sessionMetadata, "sessionMetadata");
        Intrinsics.checkNotNullParameter(sigmaDeviceConfigResponse, "sigmaDeviceConfigResponse");
        this.sessionMetadata = sessionMetadata;
        this.sigmaDeviceConfigResponse = sigmaDeviceConfigResponse;
    }

    public static /* synthetic */ CreateSessionWindowResponse copy$default(CreateSessionWindowResponse createSessionWindowResponse, SessionMetadata sessionMetadata, SigmaDeviceConfigResponse sigmaDeviceConfigResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            sessionMetadata = createSessionWindowResponse.sessionMetadata;
        }
        if ((i & 2) != 0) {
            sigmaDeviceConfigResponse = createSessionWindowResponse.sigmaDeviceConfigResponse;
        }
        return createSessionWindowResponse.copy(sessionMetadata, sigmaDeviceConfigResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final SessionMetadata getSessionMetadata() {
        return this.sessionMetadata;
    }

    /* renamed from: component2, reason: from getter */
    public final SigmaDeviceConfigResponse getSigmaDeviceConfigResponse() {
        return this.sigmaDeviceConfigResponse;
    }

    public final CreateSessionWindowResponse copy(SessionMetadata sessionMetadata, SigmaDeviceConfigResponse sigmaDeviceConfigResponse) {
        Intrinsics.checkNotNullParameter(sessionMetadata, "sessionMetadata");
        Intrinsics.checkNotNullParameter(sigmaDeviceConfigResponse, "sigmaDeviceConfigResponse");
        return new CreateSessionWindowResponse(sessionMetadata, sigmaDeviceConfigResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateSessionWindowResponse)) {
            return false;
        }
        CreateSessionWindowResponse createSessionWindowResponse = (CreateSessionWindowResponse) other;
        return Intrinsics.areEqual(this.sessionMetadata, createSessionWindowResponse.sessionMetadata) && Intrinsics.areEqual(this.sigmaDeviceConfigResponse, createSessionWindowResponse.sigmaDeviceConfigResponse);
    }

    public final SessionMetadata getSessionMetadata() {
        return this.sessionMetadata;
    }

    public final SigmaDeviceConfigResponse getSigmaDeviceConfigResponse() {
        return this.sigmaDeviceConfigResponse;
    }

    public int hashCode() {
        return this.sigmaDeviceConfigResponse.hashCode() + (this.sessionMetadata.hashCode() * 31);
    }

    public String toString() {
        return "CreateSessionWindowResponse(sessionMetadata=" + this.sessionMetadata + ", sigmaDeviceConfigResponse=" + this.sigmaDeviceConfigResponse + ")";
    }
}
