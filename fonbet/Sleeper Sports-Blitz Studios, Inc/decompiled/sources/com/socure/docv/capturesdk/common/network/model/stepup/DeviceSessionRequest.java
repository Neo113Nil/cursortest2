package com.socure.docv.capturesdk.common.network.model.stepup;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSessionRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSessionRequest;", "", "deviceSessionId", "", "(Ljava/lang/String;)V", "getDeviceSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DeviceSessionRequest {
    public static final int $stable = 0;
    private final String deviceSessionId;

    public static /* synthetic */ DeviceSessionRequest copy$default(DeviceSessionRequest deviceSessionRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceSessionRequest.deviceSessionId;
        }
        return deviceSessionRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceSessionId() {
        return this.deviceSessionId;
    }

    public final DeviceSessionRequest copy(String deviceSessionId) {
        Intrinsics.checkNotNullParameter(deviceSessionId, "deviceSessionId");
        return new DeviceSessionRequest(deviceSessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceSessionRequest) && Intrinsics.areEqual(this.deviceSessionId, ((DeviceSessionRequest) other).deviceSessionId);
    }

    public int hashCode() {
        return this.deviceSessionId.hashCode();
    }

    public String toString() {
        return "DeviceSessionRequest(deviceSessionId=" + this.deviceSessionId + ")";
    }

    public DeviceSessionRequest(String deviceSessionId) {
        Intrinsics.checkNotNullParameter(deviceSessionId, "deviceSessionId");
        this.deviceSessionId = deviceSessionId;
    }

    public final String getDeviceSessionId() {
        return this.deviceSessionId;
    }
}
