package spay.sdk.domain.model.request;

import C.o0;
import Lf.a;
import M1.b;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001'Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jm\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006("}, d2 = {"Lspay/sdk/domain/model/request/SdkAuthRequestBody;", "", "redirectUri", "", "authCode", "sessionId", "state", "deviceInfo", "orderId", "merchantLogin", "resourceName", "authMethod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthCode", "()Ljava/lang/String;", "getAuthMethod", "getDeviceInfo", "getMerchantLogin", "getOrderId", "getRedirectUri", "getResourceName", "getSessionId", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "AuthMethod", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SdkAuthRequestBody {
    private final String authCode;
    private final String authMethod;

    @NotNull
    private final String deviceInfo;
    private final String merchantLogin;

    @NotNull
    private final String orderId;
    private final String redirectUri;

    @NotNull
    private final String resourceName;

    @NotNull
    private final String sessionId;
    private final String state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lspay/sdk/domain/model/request/SdkAuthRequestBody$AuthMethod;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PHONE", "SBAPP", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AuthMethod {
        PHONE("phone"),
        SBAPP(b.m("c2JvbA=="));


        @NotNull
        private final String value;

        AuthMethod(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public SdkAuthRequestBody(String str, String str2, @NotNull String sessionId, String str3, @NotNull String deviceInfo, @NotNull String orderId, String str4, @NotNull String resourceName, String str5) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        this.redirectUri = str;
        this.authCode = str2;
        this.sessionId = sessionId;
        this.state = str3;
        this.deviceInfo = deviceInfo;
        this.orderId = orderId;
        this.merchantLogin = str4;
        this.resourceName = resourceName;
        this.authMethod = str5;
    }

    public static /* synthetic */ SdkAuthRequestBody copy$default(SdkAuthRequestBody sdkAuthRequestBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sdkAuthRequestBody.redirectUri;
        }
        if ((i11 & 2) != 0) {
            str2 = sdkAuthRequestBody.authCode;
        }
        if ((i11 & 4) != 0) {
            str3 = sdkAuthRequestBody.sessionId;
        }
        if ((i11 & 8) != 0) {
            str4 = sdkAuthRequestBody.state;
        }
        if ((i11 & 16) != 0) {
            str5 = sdkAuthRequestBody.deviceInfo;
        }
        if ((i11 & 32) != 0) {
            str6 = sdkAuthRequestBody.orderId;
        }
        if ((i11 & 64) != 0) {
            str7 = sdkAuthRequestBody.merchantLogin;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str8 = sdkAuthRequestBody.resourceName;
        }
        if ((i11 & 256) != 0) {
            str9 = sdkAuthRequestBody.authMethod;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return sdkAuthRequestBody.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getResourceName() {
        return this.resourceName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAuthMethod() {
        return this.authMethod;
    }

    @NotNull
    public final SdkAuthRequestBody copy(String redirectUri, String authCode, @NotNull String sessionId, String state, @NotNull String deviceInfo, @NotNull String orderId, String merchantLogin, @NotNull String resourceName, String authMethod) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        return new SdkAuthRequestBody(redirectUri, authCode, sessionId, state, deviceInfo, orderId, merchantLogin, resourceName, authMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkAuthRequestBody)) {
            return false;
        }
        SdkAuthRequestBody sdkAuthRequestBody = (SdkAuthRequestBody) other;
        return Intrinsics.d(this.redirectUri, sdkAuthRequestBody.redirectUri) && Intrinsics.d(this.authCode, sdkAuthRequestBody.authCode) && Intrinsics.d(this.sessionId, sdkAuthRequestBody.sessionId) && Intrinsics.d(this.state, sdkAuthRequestBody.state) && Intrinsics.d(this.deviceInfo, sdkAuthRequestBody.deviceInfo) && Intrinsics.d(this.orderId, sdkAuthRequestBody.orderId) && Intrinsics.d(this.merchantLogin, sdkAuthRequestBody.merchantLogin) && Intrinsics.d(this.resourceName, sdkAuthRequestBody.resourceName) && Intrinsics.d(this.authMethod, sdkAuthRequestBody.authMethod);
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final String getAuthMethod() {
        return this.authMethod;
    }

    @NotNull
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    @NotNull
    public final String getResourceName() {
        return this.resourceName;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.redirectUri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authCode;
        int b02 = a.b0((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.sessionId);
        String str3 = this.state;
        int b03 = a.b0(a.b0((b02 + (str3 == null ? 0 : str3.hashCode())) * 31, this.deviceInfo), this.orderId);
        String str4 = this.merchantLogin;
        int b04 = a.b0((b03 + (str4 == null ? 0 : str4.hashCode())) * 31, this.resourceName);
        String str5 = this.authMethod;
        return b04 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.redirectUri;
        String str2 = this.authCode;
        String str3 = this.sessionId;
        String str4 = this.state;
        String str5 = this.deviceInfo;
        String str6 = this.orderId;
        String str7 = this.merchantLogin;
        String str8 = this.resourceName;
        String str9 = this.authMethod;
        StringBuilder d11 = C3660k.d("SdkAuthRequestBody(redirectUri=", str, ", authCode=", str2, ", sessionId=");
        Nh.a.h(d11, str3, ", state=", str4, ", deviceInfo=");
        Nh.a.h(d11, str5, ", orderId=", str6, ", merchantLogin=");
        Nh.a.h(d11, str7, ", resourceName=", str8, ", authMethod=");
        return o0.c(d11, str9, ")");
    }

    public /* synthetic */ SdkAuthRequestBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, str3, (i11 & 8) != 0 ? null : str4, str5, str6, (i11 & 64) != 0 ? null : str7, str8, (i11 & 256) != 0 ? null : str9);
    }
}
