package com.socure.idplus.device;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003JA\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/socure/idplus/device/SigmaDeviceOptions;", "", "", "component1", "", "component2", "component3", "component4", "component5", "omitLocationData", "advertisingID", "useSocureGov", "configBaseUrl", "customerSessionId", "copy", InAppPurchaseConstants.METHOD_TO_STRING, "", "hashCode", "other", "equals", "a", "Z", "getOmitLocationData", "()Z", "b", "Ljava/lang/String;", "getAdvertisingID", "()Ljava/lang/String;", "c", "getUseSocureGov", "d", "getConfigBaseUrl", JWKParameterNames.RSA_EXPONENT, "getCustomerSessionId", "setCustomerSessionId", "(Ljava/lang/String;)V", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class SigmaDeviceOptions {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean omitLocationData;

    /* renamed from: b, reason: from kotlin metadata */
    public final String advertisingID;

    /* renamed from: c, reason: from kotlin metadata */
    public final boolean useSocureGov;

    /* renamed from: d, reason: from kotlin metadata */
    public final String configBaseUrl;

    /* renamed from: e, reason: from kotlin metadata */
    public String customerSessionId;

    public SigmaDeviceOptions() {
        this(false, null, false, null, null, 31, null);
    }

    public static /* synthetic */ SigmaDeviceOptions copy$default(SigmaDeviceOptions sigmaDeviceOptions, boolean z, String str, boolean z2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sigmaDeviceOptions.omitLocationData;
        }
        if ((i & 2) != 0) {
            str = sigmaDeviceOptions.advertisingID;
        }
        if ((i & 4) != 0) {
            z2 = sigmaDeviceOptions.useSocureGov;
        }
        if ((i & 8) != 0) {
            str2 = sigmaDeviceOptions.configBaseUrl;
        }
        if ((i & 16) != 0) {
            str3 = sigmaDeviceOptions.customerSessionId;
        }
        String str4 = str3;
        boolean z3 = z2;
        return sigmaDeviceOptions.copy(z, str, z3, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getOmitLocationData() {
        return this.omitLocationData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdvertisingID() {
        return this.advertisingID;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUseSocureGov() {
        return this.useSocureGov;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConfigBaseUrl() {
        return this.configBaseUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomerSessionId() {
        return this.customerSessionId;
    }

    public final SigmaDeviceOptions copy(boolean omitLocationData, String advertisingID, boolean useSocureGov, String configBaseUrl, String customerSessionId) {
        return new SigmaDeviceOptions(omitLocationData, advertisingID, useSocureGov, configBaseUrl, customerSessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SigmaDeviceOptions)) {
            return false;
        }
        SigmaDeviceOptions sigmaDeviceOptions = (SigmaDeviceOptions) other;
        return this.omitLocationData == sigmaDeviceOptions.omitLocationData && Intrinsics.areEqual(this.advertisingID, sigmaDeviceOptions.advertisingID) && this.useSocureGov == sigmaDeviceOptions.useSocureGov && Intrinsics.areEqual(this.configBaseUrl, sigmaDeviceOptions.configBaseUrl) && Intrinsics.areEqual(this.customerSessionId, sigmaDeviceOptions.customerSessionId);
    }

    public final String getAdvertisingID() {
        return this.advertisingID;
    }

    public final String getConfigBaseUrl() {
        return this.configBaseUrl;
    }

    public final String getCustomerSessionId() {
        return this.customerSessionId;
    }

    public final boolean getOmitLocationData() {
        return this.omitLocationData;
    }

    public final boolean getUseSocureGov() {
        return this.useSocureGov;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.omitLocationData) * 31;
        String str = this.advertisingID;
        int hashCode2 = (Boolean.hashCode(this.useSocureGov) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.configBaseUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerSessionId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCustomerSessionId(String str) {
        this.customerSessionId = str;
    }

    public String toString() {
        return "SigmaDeviceOptions(omitLocationData=" + this.omitLocationData + ", advertisingID=" + this.advertisingID + ", useSocureGov=" + this.useSocureGov + ", configBaseUrl=" + this.configBaseUrl + ", customerSessionId=" + this.customerSessionId + ")";
    }

    public SigmaDeviceOptions(boolean z, String str, boolean z2, String str2, String str3) {
        this.omitLocationData = z;
        this.advertisingID = str;
        this.useSocureGov = z2;
        this.configBaseUrl = str2;
        this.customerSessionId = str3;
    }

    public /* synthetic */ SigmaDeviceOptions(boolean z, String str, boolean z2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
