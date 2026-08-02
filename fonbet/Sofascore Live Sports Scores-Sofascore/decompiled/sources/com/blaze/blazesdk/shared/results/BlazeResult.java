package com.blaze.blazesdk.shared.results;

import androidx.annotation.Keep;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.unification.sdk.InitializationStatus;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.dmi;
import defpackage.lm5;
import defpackage.lnb;
import defpackage.wt3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/blaze/blazesdk/shared/results/BlazeResult;", "T", "", "<init>", "()V", InitializationStatus.SUCCESS, "Error", "Lcom/blaze/blazesdk/shared/results/BlazeResult$Error;", "Lcom/blaze/blazesdk/shared/results/BlazeResult$Success;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BlazeResult<T> {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/shared/results/BlazeResult$Success;", PlayerKt.ICE_HOCKEY_RIGHT_WING, "Lcom/blaze/blazesdk/shared/results/BlazeResult;", U3.i.X, "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/blaze/blazesdk/shared/results/BlazeResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success<R> extends BlazeResult<R> {
        public static final int $stable = 0;
        private final R value;

        public Success(R r) {
            super(null);
            this.value = r;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final R component1() {
            return this.value;
        }

        @NotNull
        public final Success<R> copy(R value) {
            return new Success<>(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.c(this.value, ((Success) other).value);
        }

        public final R getValue() {
            return this.value;
        }

        public int hashCode() {
            R r = this.value;
            if (r == null) {
                return 0;
            }
            return r.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.p(new StringBuilder("Success(value="), this.value, ')');
        }
    }

    public /* synthetic */ BlazeResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BlazeResult() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\fHÆ\u0003J\u0011\u0010.\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fHÆ\u0003Jf\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0004HÖ\u0001J\t\u00106\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00067"}, d2 = {"Lcom/blaze/blazesdk/shared/results/BlazeResult$Error;", "Lcom/blaze/blazesdk/shared/results/BlazeResult;", "", "statusCode", "", U3.j.D, "Lcom/blaze/blazesdk/shared/results/ErrorDomain;", "reason", "Lcom/blaze/blazesdk/shared/results/ErrorReason;", PglCryptUtils.KEY_MESSAGE, "", TtmlNode.TAG_METADATA, "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Integer;Lcom/blaze/blazesdk/shared/results/ErrorDomain;Lcom/blaze/blazesdk/shared/results/ErrorReason;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Exception;)V", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDomain", "()Lcom/blaze/blazesdk/shared/results/ErrorDomain;", "setDomain", "(Lcom/blaze/blazesdk/shared/results/ErrorDomain;)V", "getReason", "()Lcom/blaze/blazesdk/shared/results/ErrorReason;", "setReason", "(Lcom/blaze/blazesdk/shared/results/ErrorReason;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "getCause", "()Ljava/lang/Exception;", "setCause", "(Ljava/lang/Exception;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Lcom/blaze/blazesdk/shared/results/ErrorDomain;Lcom/blaze/blazesdk/shared/results/ErrorReason;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Exception;)Lcom/blaze/blazesdk/shared/results/BlazeResult$Error;", "equals", "", "other", "", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends BlazeResult {
        public static final int $stable = 8;

        @Nullable
        private Exception cause;

        @Nullable
        private ErrorDomain domain;

        @Nullable
        private String message;

        @NotNull
        private Map<String, String> metadata;

        @Nullable
        private ErrorReason reason;

        @Nullable
        private final Integer statusCode;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Error(Integer num, ErrorDomain errorDomain, ErrorReason errorReason, String str, Map map, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, errorDomain, errorReason, str, map, (i & 32) != 0 ? null : exc);
            num = (i & 1) != 0 ? null : num;
            errorDomain = (i & 2) != 0 ? null : errorDomain;
            errorReason = (i & 4) != 0 ? null : errorReason;
            str = (i & 8) != 0 ? null : str;
            if ((i & 16) != 0) {
                map = lm5.a;
                map.getClass();
            }
        }

        public static /* synthetic */ Error copy$default(Error error, Integer num, ErrorDomain errorDomain, ErrorReason errorReason, String str, Map map, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                num = error.statusCode;
            }
            if ((i & 2) != 0) {
                errorDomain = error.domain;
            }
            if ((i & 4) != 0) {
                errorReason = error.reason;
            }
            if ((i & 8) != 0) {
                str = error.message;
            }
            if ((i & 16) != 0) {
                map = error.metadata;
            }
            if ((i & 32) != 0) {
                exc = error.cause;
            }
            Map map2 = map;
            Exception exc2 = exc;
            return error.copy(num, errorDomain, errorReason, str, map2, exc2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final ErrorDomain getDomain() {
            return this.domain;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final ErrorReason getReason() {
            return this.reason;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Map<String, String> component5() {
            return this.metadata;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Exception getCause() {
            return this.cause;
        }

        @NotNull
        public final Error copy(@Nullable Integer statusCode, @Nullable ErrorDomain domain, @Nullable ErrorReason reason, @Nullable String message, @NotNull Map<String, String> metadata, @Nullable Exception cause) {
            metadata.getClass();
            return new Error(statusCode, domain, reason, message, metadata, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.c(this.statusCode, error.statusCode) && this.domain == error.domain && this.reason == error.reason && Intrinsics.c(this.message, error.message) && Intrinsics.c(this.metadata, error.metadata) && Intrinsics.c(this.cause, error.cause);
        }

        @Nullable
        public final Exception getCause() {
            return this.cause;
        }

        @Nullable
        public final ErrorDomain getDomain() {
            return this.domain;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        @Nullable
        public final ErrorReason getReason() {
            return this.reason;
        }

        @Nullable
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            Integer num = this.statusCode;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            ErrorDomain errorDomain = this.domain;
            int hashCode2 = (hashCode + (errorDomain == null ? 0 : errorDomain.hashCode())) * 31;
            ErrorReason errorReason = this.reason;
            int hashCode3 = (hashCode2 + (errorReason == null ? 0 : errorReason.hashCode())) * 31;
            String str = this.message;
            int g = dmi.g(this.metadata, (hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
            Exception exc = this.cause;
            return g + (exc != null ? exc.hashCode() : 0);
        }

        public final void setCause(@Nullable Exception exc) {
            this.cause = exc;
        }

        public final void setDomain(@Nullable ErrorDomain errorDomain) {
            this.domain = errorDomain;
        }

        public final void setMessage(@Nullable String str) {
            this.message = str;
        }

        public final void setMetadata(@NotNull Map<String, String> map) {
            map.getClass();
            this.metadata = map;
        }

        public final void setReason(@Nullable ErrorReason errorReason) {
            this.reason = errorReason;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Error(statusCode=");
            sb.append(this.statusCode);
            sb.append(", domain=");
            sb.append(this.domain);
            sb.append(", reason=");
            sb.append(this.reason);
            sb.append(", message=");
            sb.append(this.message);
            sb.append(", metadata=");
            sb.append(this.metadata);
            sb.append(", cause=");
            return wt3.o(sb, this.cause, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@Nullable Integer num, @Nullable ErrorDomain errorDomain, @Nullable ErrorReason errorReason, @Nullable String str, @NotNull Map<String, String> map, @Nullable Exception exc) {
            super(null);
            map.getClass();
            this.statusCode = num;
            this.domain = errorDomain;
            this.reason = errorReason;
            this.message = str;
            this.metadata = map;
            this.cause = exc;
        }

        public Error() {
            this(null, null, null, null, null, null, 63, null);
        }
    }
}
