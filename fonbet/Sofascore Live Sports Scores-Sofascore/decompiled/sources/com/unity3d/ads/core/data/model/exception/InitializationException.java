package com.unity3d.ads.core.data.model.exception;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.UnityAdsErrorKt;
import defpackage.dmi;
import defpackage.qij;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 '2\u00060\u0001j\u0002`\u0002:\u0001'BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", PglCryptUtils.KEY_MESSAGE, "", "throwable", "", "reason", "reasonDebug", IronSourceConstants.EVENTS_ERROR_CODE, "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "errorToken", "Lcom/google/protobuf/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;Lcom/google/protobuf/ByteString;)V", "getMessage", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "getReason", "getReasonDebug", "getErrorCode", "()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "getErrorToken", "()Lcom/google/protobuf/ByteString;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InitializationException extends Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

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

    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : publicErrorCode, (i & 32) != 0 ? null : byteString);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationException.message;
        }
        if ((i & 2) != 0) {
            th = initializationException.throwable;
        }
        if ((i & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        if ((i & 16) != 0) {
            publicErrorCode = initializationException.errorCode;
        }
        if ((i & 32) != 0) {
            byteString = initializationException.errorToken;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode2 = publicErrorCode;
        ByteString byteString2 = byteString;
        return initializationException.copy(str, th, str2, str3, publicErrorCode2, byteString2);
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
    public final InitializationException copy(@NotNull String message, @Nullable Throwable throwable, @NotNull String reason, @Nullable String reasonDebug, @Nullable ErrorOuterClass.PublicErrorCode errorCode, @Nullable ByteString errorToken) {
        message.getClass();
        reason.getClass();
        return new InitializationException(message, throwable, reason, reasonDebug, errorCode, errorToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) other;
        return Intrinsics.c(this.message, initializationException.message) && Intrinsics.c(this.throwable, initializationException.throwable) && Intrinsics.c(this.reason, initializationException.reason) && Intrinsics.c(this.reasonDebug, initializationException.reasonDebug) && this.errorCode == initializationException.errorCode && Intrinsics.c(this.errorToken, initializationException.errorToken);
    }

    @Nullable
    public final ErrorOuterClass.PublicErrorCode getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final ByteString getErrorToken() {
        return this.errorToken;
    }

    @Override // java.lang.Throwable
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
        return "InitializationException(message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", errorCode=" + this.errorCode + ", errorToken=" + this.errorToken + ')';
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/InitializationException$Companion;", "", "<init>", "()V", "parseFrom", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InitializationException parseFrom(@NotNull Exception e) {
            String str;
            e.getClass();
            if ((e instanceof qij) || (e instanceof NetworkTimeoutException)) {
                return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_TIMEOUT, e, "timeout", e.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT, null, 32, null);
            }
            if (e instanceof GatewayException) {
                GatewayException gatewayException = (GatewayException) e;
                return new InitializationException(gatewayException.getMessage(), gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug(), gatewayException.getErrorCode(), gatewayException.getErrorToken());
            }
            if (!(e instanceof UnityAdsNetworkException)) {
                if (e instanceof InitializationException) {
                    return (InitializationException) e;
                }
                return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_UNKNOWN_ERROR, e, "unknown", e.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN, null, 32, null);
            }
            UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) e;
            if (unityAdsNetworkException.getCode() == null) {
                str = "network";
            } else {
                str = "network." + unityAdsNetworkException.getCode();
            }
            return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_NETWORK_ERROR, e, str, unityAdsNetworkException.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_NETWORK, null, 32, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(@NotNull String str, @Nullable Throwable th, @NotNull String str2, @Nullable String str3, @Nullable ErrorOuterClass.PublicErrorCode publicErrorCode, @Nullable ByteString byteString) {
        super(str);
        str.getClass();
        str2.getClass();
        this.message = str;
        this.throwable = th;
        this.reason = str2;
        this.reasonDebug = str3;
        this.errorCode = publicErrorCode;
        this.errorToken = byteString;
    }
}
