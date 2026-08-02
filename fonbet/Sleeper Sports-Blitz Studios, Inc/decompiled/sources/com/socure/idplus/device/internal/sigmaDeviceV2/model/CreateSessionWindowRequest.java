package com.socure.idplus.device.internal.sigmaDeviceV2.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import com.socure.idplus.device.internal.behavior.model.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateSessionWindowRequest;", "", "deviceToken", "", "sessionWindowToken", "customerSessionId", "deviceMetadata", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/DeviceMetadata;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/DeviceMetadata;)V", "getCustomerSessionId", "()Ljava/lang/String;", "getDeviceMetadata", "()Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/DeviceMetadata;", "getDeviceToken", "getSessionWindowToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CreateSessionWindowRequest {

    @SerializedName("customerSessionId")
    private final String customerSessionId;

    @SerializedName("deviceMetadata")
    private final DeviceMetadata deviceMetadata;

    @SerializedName("deviceToken")
    private final String deviceToken;

    @SerializedName("sessionWindowToken")
    private final String sessionWindowToken;

    public CreateSessionWindowRequest(String deviceToken, String sessionWindowToken, String str, DeviceMetadata deviceMetadata) {
        Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
        Intrinsics.checkNotNullParameter(sessionWindowToken, "sessionWindowToken");
        Intrinsics.checkNotNullParameter(deviceMetadata, "deviceMetadata");
        this.deviceToken = deviceToken;
        this.sessionWindowToken = sessionWindowToken;
        this.customerSessionId = str;
        this.deviceMetadata = deviceMetadata;
    }

    public static /* synthetic */ CreateSessionWindowRequest copy$default(CreateSessionWindowRequest createSessionWindowRequest, String str, String str2, String str3, DeviceMetadata deviceMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSessionWindowRequest.deviceToken;
        }
        if ((i & 2) != 0) {
            str2 = createSessionWindowRequest.sessionWindowToken;
        }
        if ((i & 4) != 0) {
            str3 = createSessionWindowRequest.customerSessionId;
        }
        if ((i & 8) != 0) {
            deviceMetadata = createSessionWindowRequest.deviceMetadata;
        }
        return createSessionWindowRequest.copy(str, str2, str3, deviceMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceToken() {
        return this.deviceToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionWindowToken() {
        return this.sessionWindowToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCustomerSessionId() {
        return this.customerSessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final DeviceMetadata getDeviceMetadata() {
        return this.deviceMetadata;
    }

    public final CreateSessionWindowRequest copy(String deviceToken, String sessionWindowToken, String customerSessionId, DeviceMetadata deviceMetadata) {
        Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
        Intrinsics.checkNotNullParameter(sessionWindowToken, "sessionWindowToken");
        Intrinsics.checkNotNullParameter(deviceMetadata, "deviceMetadata");
        return new CreateSessionWindowRequest(deviceToken, sessionWindowToken, customerSessionId, deviceMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateSessionWindowRequest)) {
            return false;
        }
        CreateSessionWindowRequest createSessionWindowRequest = (CreateSessionWindowRequest) other;
        return Intrinsics.areEqual(this.deviceToken, createSessionWindowRequest.deviceToken) && Intrinsics.areEqual(this.sessionWindowToken, createSessionWindowRequest.sessionWindowToken) && Intrinsics.areEqual(this.customerSessionId, createSessionWindowRequest.customerSessionId) && Intrinsics.areEqual(this.deviceMetadata, createSessionWindowRequest.deviceMetadata);
    }

    public final String getCustomerSessionId() {
        return this.customerSessionId;
    }

    public final DeviceMetadata getDeviceMetadata() {
        return this.deviceMetadata;
    }

    public final String getDeviceToken() {
        return this.deviceToken;
    }

    public final String getSessionWindowToken() {
        return this.sessionWindowToken;
    }

    public int hashCode() {
        int a2 = a.a(this.sessionWindowToken, this.deviceToken.hashCode() * 31, 31);
        String str = this.customerSessionId;
        return this.deviceMetadata.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "CreateSessionWindowRequest(deviceToken=" + this.deviceToken + ", sessionWindowToken=" + this.sessionWindowToken + ", customerSessionId=" + this.customerSessionId + ", deviceMetadata=" + this.deviceMetadata + ")";
    }
}
