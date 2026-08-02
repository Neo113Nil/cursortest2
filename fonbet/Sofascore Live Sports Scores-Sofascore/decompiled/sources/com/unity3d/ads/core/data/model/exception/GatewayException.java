package com.unity3d.ads.core.data.model.exception;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/GatewayException;", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", PglCryptUtils.KEY_MESSAGE, "", "throwable", "", "reason", "reasonDebug", IronSourceConstants.EVENTS_ERROR_CODE, "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "errorToken", "Lcom/google/protobuf/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;Lcom/google/protobuf/ByteString;)V", "getMessage", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "getReason", "getReasonDebug", "getErrorCode", "()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "getErrorToken", "()Lcom/google/protobuf/ByteString;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GatewayException extends UnityAdsNetworkException {

    @NotNull
    public static final String GATEWAY_RESPONSE_DEPTH_INITIALIZATION = "initialization";

    @NotNull
    public static final String GATEWAY_RESPONSE_DEPTH_UNIVERSAL = "universal";

    @Nullable
    private final ErrorOuterClass.PublicErrorCode errorCode;

    @Nullable
    private final ByteString errorToken;

    @NotNull
    private final String message;

    @NotNull
    private final String reason;

    @Nullable
    private final String reasonDebug;

    @Nullable
    private final Throwable throwable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayException(@NotNull String str, @Nullable Throwable th, @NotNull String str2, @Nullable String str3, @Nullable ErrorOuterClass.PublicErrorCode publicErrorCode, @Nullable ByteString byteString) {
        super(str, null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
        str.getClass();
        str2.getClass();
        this.message = str;
        this.throwable = th;
        this.reason = str2;
        this.reasonDebug = str3;
        this.errorCode = publicErrorCode;
        this.errorToken = byteString;
    }

    public static /* synthetic */ GatewayException copy$default(GatewayException gatewayException, String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gatewayException.message;
        }
        if ((i & 2) != 0) {
            th = gatewayException.throwable;
        }
        if ((i & 4) != 0) {
            str2 = gatewayException.reason;
        }
        if ((i & 8) != 0) {
            str3 = gatewayException.reasonDebug;
        }
        if ((i & 16) != 0) {
            publicErrorCode = gatewayException.errorCode;
        }
        if ((i & 32) != 0) {
            byteString = gatewayException.errorToken;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode2 = publicErrorCode;
        ByteString byteString2 = byteString;
        return gatewayException.copy(str, th, str2, str3, publicErrorCode2, byteString2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final ErrorOuterClass.PublicErrorCode getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ByteString getErrorToken() {
        return this.errorToken;
    }

    @NotNull
    public final GatewayException copy(@NotNull String message, @Nullable Throwable throwable, @NotNull String reason, @Nullable String reasonDebug, @Nullable ErrorOuterClass.PublicErrorCode errorCode, @Nullable ByteString errorToken) {
        message.getClass();
        reason.getClass();
        return new GatewayException(message, throwable, reason, reasonDebug, errorCode, errorToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GatewayException)) {
            return false;
        }
        GatewayException gatewayException = (GatewayException) other;
        return Intrinsics.c(this.message, gatewayException.message) && Intrinsics.c(this.throwable, gatewayException.throwable) && Intrinsics.c(this.reason, gatewayException.reason) && Intrinsics.c(this.reasonDebug, gatewayException.reasonDebug) && this.errorCode == gatewayException.errorCode && Intrinsics.c(this.errorToken, gatewayException.errorToken);
    }

    @Nullable
    public final ErrorOuterClass.PublicErrorCode getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final ByteString getErrorToken() {
        return this.errorToken;
    }

    @Override // com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException, java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        Throwable th = this.throwable;
        int c = dmi.c((hashCode + (th == null ? 0 : th.hashCode())) * 31, 31, this.reason);
        String str = this.reasonDebug;
        int hashCode2 = (c + (str == null ? 0 : str.hashCode())) * 31;
        ErrorOuterClass.PublicErrorCode publicErrorCode = this.errorCode;
        int hashCode3 = (hashCode2 + (publicErrorCode == null ? 0 : publicErrorCode.hashCode())) * 31;
        ByteString byteString = this.errorToken;
        return hashCode3 + (byteString != null ? byteString.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "GatewayException(message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", errorCode=" + this.errorCode + ", errorToken=" + this.errorToken + ')';
    }

    public /* synthetic */ GatewayException(String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : publicErrorCode, (i & 32) != 0 ? null : byteString);
    }
}
