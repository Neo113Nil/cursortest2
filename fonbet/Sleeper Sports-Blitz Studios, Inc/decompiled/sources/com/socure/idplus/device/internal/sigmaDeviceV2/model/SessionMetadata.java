package com.socure.idplus.device.internal.sigmaDeviceV2.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/SessionMetadata;", "", "deviceToken", "", "sessionWindowToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceToken", "()Ljava/lang/String;", "getSessionWindowToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SessionMetadata {

    @SerializedName("deviceToken")
    private final String deviceToken;

    @SerializedName("sessionWindowToken")
    private final String sessionWindowToken;

    public SessionMetadata(String deviceToken, String sessionWindowToken) {
        Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
        Intrinsics.checkNotNullParameter(sessionWindowToken, "sessionWindowToken");
        this.deviceToken = deviceToken;
        this.sessionWindowToken = sessionWindowToken;
    }

    public static /* synthetic */ SessionMetadata copy$default(SessionMetadata sessionMetadata, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionMetadata.deviceToken;
        }
        if ((i & 2) != 0) {
            str2 = sessionMetadata.sessionWindowToken;
        }
        return sessionMetadata.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceToken() {
        return this.deviceToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionWindowToken() {
        return this.sessionWindowToken;
    }

    public final SessionMetadata copy(String deviceToken, String sessionWindowToken) {
        Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
        Intrinsics.checkNotNullParameter(sessionWindowToken, "sessionWindowToken");
        return new SessionMetadata(deviceToken, sessionWindowToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionMetadata)) {
            return false;
        }
        SessionMetadata sessionMetadata = (SessionMetadata) other;
        return Intrinsics.areEqual(this.deviceToken, sessionMetadata.deviceToken) && Intrinsics.areEqual(this.sessionWindowToken, sessionMetadata.sessionWindowToken);
    }

    public final String getDeviceToken() {
        return this.deviceToken;
    }

    public final String getSessionWindowToken() {
        return this.sessionWindowToken;
    }

    public int hashCode() {
        return this.sessionWindowToken.hashCode() + (this.deviceToken.hashCode() * 31);
    }

    public String toString() {
        return "SessionMetadata(deviceToken=" + this.deviceToken + ", sessionWindowToken=" + this.sessionWindowToken + ")";
    }
}
