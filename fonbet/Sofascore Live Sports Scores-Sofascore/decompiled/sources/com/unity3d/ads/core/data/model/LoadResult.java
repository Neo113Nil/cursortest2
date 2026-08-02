package com.unity3d.ads.core.data.model;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.protobuf.ByteString;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.dmi;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadResult;", "", "<init>", "()V", InitializationStatus.SUCCESS, "Failure", "Companion", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "Lcom/unity3d/ads/core/data/model/LoadResult$Success;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LoadResult {

    @NotNull
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";

    @NotNull
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";

    @NotNull
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";

    @NotNull
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";

    @NotNull
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";

    @NotNull
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";

    @NotNull
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";

    @NotNull
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";

    @NotNull
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";

    @NotNull
    public static final String MSG_NO_FILL = "[UnityAds] No fill";

    @NotNull
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";

    @NotNull
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";

    @NotNull
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadResult$Success;", "Lcom/unity3d/ads/core/data/model/LoadResult;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "<init>", "(Lcom/unity3d/ads/core/data/model/AdObject;)V", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends LoadResult {

        @NotNull
        private final AdObject adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull AdObject adObject) {
            super(null);
            adObject.getClass();
            this.adObject = adObject;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject, int i, Object obj) {
            if ((i & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AdObject getAdObject() {
            return this.adObject;
        }

        @NotNull
        public final Success copy(@NotNull AdObject adObject) {
            adObject.getClass();
            return new Success(adObject);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.c(this.adObject, ((Success) other).adObject);
        }

        @NotNull
        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    public /* synthetic */ LoadResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LoadResult() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "Lcom/unity3d/ads/core/data/model/LoadResult;", "error", "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", PglCryptUtils.KEY_MESSAGE, "", "throwable", "", "reason", "reasonDebug", "errorToken", "Lcom/google/protobuf/ByteString;", "<init>", "(Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/ByteString;)V", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "getMessage", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "getReason", "getReasonDebug", "getErrorToken", "()Lcom/google/protobuf/ByteString;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure extends LoadResult {

        @NotNull
        private final ErrorOuterClass.PublicErrorCode error;

        @Nullable
        private final ByteString errorToken;

        @Nullable
        private final String message;

        @NotNull
        private final String reason;

        @Nullable
        private final String reasonDebug;

        @Nullable
        private final Throwable throwable;

        public /* synthetic */ Failure(ErrorOuterClass.PublicErrorCode publicErrorCode, String str, Throwable th, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ErrorOuterClass.PublicErrorCode getError() {
            return this.error;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final ByteString getErrorToken() {
            return this.errorToken;
        }

        @NotNull
        public final Failure copy(@NotNull ErrorOuterClass.PublicErrorCode error, @Nullable String message, @Nullable Throwable throwable, @NotNull String reason, @Nullable String reasonDebug, @Nullable ByteString errorToken) {
            error.getClass();
            reason.getClass();
            return new Failure(error, message, throwable, reason, reasonDebug, errorToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this.error == failure.error && Intrinsics.c(this.message, failure.message) && Intrinsics.c(this.throwable, failure.throwable) && Intrinsics.c(this.reason, failure.reason) && Intrinsics.c(this.reasonDebug, failure.reasonDebug) && Intrinsics.c(this.errorToken, failure.errorToken);
        }

        @NotNull
        public final ErrorOuterClass.PublicErrorCode getError() {
            return this.error;
        }

        @Nullable
        public final ByteString getErrorToken() {
            return this.errorToken;
        }

        @Nullable
        public final String getMessage() {
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
            int hashCode = this.error.hashCode() * 31;
            String str = this.message;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.throwable;
            int c = dmi.c((hashCode2 + (th == null ? 0 : th.hashCode())) * 31, 31, this.reason);
            String str2 = this.reasonDebug;
            int hashCode3 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
            ByteString byteString = this.errorToken;
            return hashCode3 + (byteString != null ? byteString.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", errorToken=" + this.errorToken + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull ErrorOuterClass.PublicErrorCode publicErrorCode, @Nullable String str, @Nullable Throwable th, @NotNull String str2, @Nullable String str3, @Nullable ByteString byteString) {
            super(null);
            publicErrorCode.getClass();
            str2.getClass();
            this.error = publicErrorCode;
            this.message = str;
            this.throwable = th;
            this.reason = str2;
            this.reasonDebug = str3;
            this.errorToken = byteString;
        }
    }
}
