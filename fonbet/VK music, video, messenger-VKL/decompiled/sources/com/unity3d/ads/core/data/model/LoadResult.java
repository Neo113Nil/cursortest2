package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.ErrorOuterClass;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* compiled from: LoadResult.kt */
/* loaded from: classes14.dex */
public abstract class LoadResult {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";
    public static final String MSG_NO_FILL = "[UnityAds] No fill";
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    /* compiled from: LoadResult.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: LoadResult.kt */
    public static final class Failure extends LoadResult {
        private final ErrorOuterClass.PublicErrorCode error;
        private final ByteString errorToken;
        private final String message;
        private final String reason;
        private final String reasonDebug;
        private final Throwable throwable;

        public /* synthetic */ Failure(ErrorOuterClass.PublicErrorCode publicErrorCode, String str, Throwable th, String str2, String str3, ByteString byteString, int i, zcl zclVar) {
            this(publicErrorCode, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : byteString);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, ErrorOuterClass.PublicErrorCode publicErrorCode, String str, Throwable th, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                publicErrorCode = failure.error;
            }
            if ((i & 2) != 0) {
                str = failure.message;
            }
            if ((i & 4) != 0) {
                th = failure.throwable;
            }
            if ((i & 8) != 0) {
                str2 = failure.reason;
            }
            if ((i & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            if ((i & 32) != 0) {
                byteString = failure.errorToken;
            }
            String str4 = str3;
            ByteString byteString2 = byteString;
            return failure.copy(publicErrorCode, str, th, str2, str4, byteString2);
        }

        public final ErrorOuterClass.PublicErrorCode component1() {
            return this.error;
        }

        public final String component2() {
            return this.message;
        }

        public final Throwable component3() {
            return this.throwable;
        }

        public final String component4() {
            return this.reason;
        }

        public final String component5() {
            return this.reasonDebug;
        }

        public final ByteString component6() {
            return this.errorToken;
        }

        public final Failure copy(ErrorOuterClass.PublicErrorCode publicErrorCode, String str, Throwable th, String str2, String str3, ByteString byteString) {
            return new Failure(publicErrorCode, str, th, str2, str3, byteString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && epx.f(this.message, failure.message) && epx.f(this.throwable, failure.throwable) && epx.f(this.reason, failure.reason) && epx.f(this.reasonDebug, failure.reasonDebug) && epx.f(this.errorToken, failure.errorToken);
        }

        public final ErrorOuterClass.PublicErrorCode getError() {
            return this.error;
        }

        public final ByteString getErrorToken() {
            return this.errorToken;
        }

        public final String getMessage() {
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
            int hashCode = this.error.hashCode() * 31;
            String str = this.message;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.throwable;
            int a = urd0.a((hashCode2 + (th == null ? 0 : th.hashCode())) * 31, 31, this.reason);
            String str2 = this.reasonDebug;
            int hashCode3 = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
            ByteString byteString = this.errorToken;
            return hashCode3 + (byteString != null ? byteString.hashCode() : 0);
        }

        public String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", errorToken=" + this.errorToken + ')';
        }

        public Failure(ErrorOuterClass.PublicErrorCode publicErrorCode, String str, Throwable th, String str2, String str3, ByteString byteString) {
            super(null);
            this.error = publicErrorCode;
            this.message = str;
            this.throwable = th;
            this.reason = str2;
            this.reasonDebug = str3;
            this.errorToken = byteString;
        }
    }

    /* compiled from: LoadResult.kt */
    public static final class Success extends LoadResult {
        private final AdObject adObject;

        public Success(AdObject adObject) {
            super(null);
            this.adObject = adObject;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject, int i, Object obj) {
            if ((i & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        public final AdObject component1() {
            return this.adObject;
        }

        public final Success copy(AdObject adObject) {
            return new Success(adObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && epx.f(this.adObject, ((Success) obj).adObject);
        }

        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    public /* synthetic */ LoadResult(zcl zclVar) {
        this();
    }

    private LoadResult() {
    }
}
