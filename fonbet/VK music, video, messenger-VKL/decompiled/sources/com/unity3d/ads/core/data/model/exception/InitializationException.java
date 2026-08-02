package com.unity3d.ads.core.data.model.exception;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* compiled from: InitializationException.kt */
/* loaded from: classes14.dex */
public final class InitializationException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final ErrorOuterClass.PublicErrorCode errorCode;
    private final ByteString errorToken;
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    /* compiled from: InitializationException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final InitializationException parseFrom(Exception exc) {
            String str;
            if ((exc instanceof TimeoutCancellationException) || (exc instanceof NetworkTimeoutException)) {
                return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_TIMEOUT, exc, "timeout", exc.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT, null, 32, null);
            }
            if (exc instanceof GatewayException) {
                GatewayException gatewayException = (GatewayException) exc;
                return new InitializationException(gatewayException.getMessage(), gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug(), gatewayException.getErrorCode(), gatewayException.getErrorToken());
            }
            if (!(exc instanceof UnityAdsNetworkException)) {
                if (exc instanceof InitializationException) {
                    return (InitializationException) exc;
                }
                return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_UNKNOWN_ERROR, exc, "unknown", exc.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN, null, 32, null);
            }
            UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) exc;
            if (unityAdsNetworkException.getCode() == null) {
                str = "network";
            } else {
                str = "network." + unityAdsNetworkException.getCode();
            }
            return new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_NETWORK_ERROR, exc, str, unityAdsNetworkException.getMessage(), ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_NETWORK, null, 32, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString, int i, zcl zclVar) {
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

    public final String component1() {
        return this.message;
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final ErrorOuterClass.PublicErrorCode component5() {
        return this.errorCode;
    }

    public final ByteString component6() {
        return this.errorToken;
    }

    public final InitializationException copy(String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString) {
        return new InitializationException(str, th, str2, str3, publicErrorCode, byteString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return epx.f(this.message, initializationException.message) && epx.f(this.throwable, initializationException.throwable) && epx.f(this.reason, initializationException.reason) && epx.f(this.reasonDebug, initializationException.reasonDebug) && this.errorCode == initializationException.errorCode && epx.f(this.errorToken, initializationException.errorToken);
    }

    public final ErrorOuterClass.PublicErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final ByteString getErrorToken() {
        return this.errorToken;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        Throwable th = this.throwable;
        int a = urd0.a((hashCode + (th == null ? 0 : th.hashCode())) * 31, 31, this.reason);
        String str = this.reasonDebug;
        int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
        ErrorOuterClass.PublicErrorCode publicErrorCode = this.errorCode;
        int hashCode3 = (hashCode2 + (publicErrorCode == null ? 0 : publicErrorCode.hashCode())) * 31;
        ByteString byteString = this.errorToken;
        return hashCode3 + (byteString != null ? byteString.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "InitializationException(message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", errorCode=" + this.errorCode + ", errorToken=" + this.errorToken + ')';
    }

    public InitializationException(String str, Throwable th, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, ByteString byteString) {
        super(str);
        this.message = str;
        this.throwable = th;
        this.reason = str2;
        this.reasonDebug = str3;
        this.errorCode = publicErrorCode;
        this.errorToken = byteString;
    }
}
