package com.zoho.livechat.android.modules.common.data.remote.responses;

import Gb.c;
import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\b\u0007\u0018\u0000 ,*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002-.B?\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJu\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010$\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u0017\u0010+\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b+\u0010!¨\u0006/"}, d2 = {"Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse;", "ResponseType", "", EventKeys.DATA, "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error;", "error", "", "responseCode", "", "", "headers", "<init>", "(Ljava/lang/Object;Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error;ILjava/util/Map;)V", "NewResponseType", "", "moreDataAvailable", "", "syncTime", "duration", "copy", "(Ljava/lang/Object;Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error;IZLjava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse;", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error;", "getError", "()Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error;", "I", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "Z", "getMoreDataAvailable", "()Z", "setMoreDataAvailable", "(Z)V", "Ljava/lang/Long;", "getSyncTime", "()Ljava/lang/Long;", "setSyncTime", "(Ljava/lang/Long;)V", "getDuration", "setDuration", "isSuccess", "Companion", "a", "Error", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SalesIQResponse<ResponseType> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final ResponseType data;

    @Nullable
    private Long duration;

    @Nullable
    private final Error error;

    @Nullable
    private final Map<String, String> headers;
    private final boolean isSuccess;
    private boolean moreDataAvailable;
    private final int responseCode;

    @Nullable
    private Long syncTime;

    /* renamed from: com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SalesIQResponse c(Companion companion, Error error, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = -1;
            }
            return companion.a(error, i10);
        }

        public static /* synthetic */ SalesIQResponse e(Companion companion, Object obj, int i10, boolean z10, Long l10, Map map, Long l11, int i11, Object obj2) {
            if ((i11 & 2) != 0) {
                i10 = -1;
            }
            int i12 = i10;
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return companion.d(obj, i12, z10, (i11 & 8) != 0 ? null : l10, (i11 & 16) != 0 ? null : map, (i11 & 32) != 0 ? null : l11);
        }

        public final SalesIQResponse a(Error error, int i10) {
            Intrinsics.checkNotNullParameter(error, "error");
            LiveChatUtil.log(error.a());
            return new SalesIQResponse(null, error, i10, null, 8, null);
        }

        public final SalesIQResponse b(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            LiveChatUtil.log(throwable);
            String message = throwable.getMessage();
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new SalesIQResponse(null, new Error(null, new Error.ErrorResponse(new Error.ErrorResponse.Error(-1, message != null ? StringsKt.trim((CharSequence) message).toString() : null)), throwable, 1, defaultConstructorMarker), 0, null, 12, defaultConstructorMarker);
        }

        public final SalesIQResponse d(Object obj, int i10, boolean z10, Long l10, Map map, Long l11) {
            SalesIQResponse salesIQResponse = new SalesIQResponse(obj, null, i10, map, null);
            salesIQResponse.setMoreDataAvailable(z10);
            salesIQResponse.setSyncTime(l10);
            salesIQResponse.setDuration(l11);
            return salesIQResponse;
        }

        public Companion() {
        }
    }

    public /* synthetic */ SalesIQResponse(Object obj, Error error, int i10, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, error, i10, map);
    }

    public static /* synthetic */ SalesIQResponse copy$default(SalesIQResponse salesIQResponse, Object obj, Error error, int i10, boolean z10, Long l10, Long l11, Map map, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = salesIQResponse.data;
        }
        if ((i11 & 2) != 0) {
            error = salesIQResponse.error;
        }
        if ((i11 & 4) != 0) {
            i10 = salesIQResponse.responseCode;
        }
        if ((i11 & 8) != 0) {
            z10 = salesIQResponse.moreDataAvailable;
        }
        if ((i11 & 16) != 0) {
            l10 = salesIQResponse.syncTime;
        }
        if ((i11 & 32) != 0) {
            l11 = salesIQResponse.duration;
        }
        if ((i11 & 64) != 0) {
            map = salesIQResponse.headers;
        }
        Long l12 = l11;
        Map map2 = map;
        Long l13 = l10;
        int i12 = i10;
        return salesIQResponse.copy(obj, error, i12, z10, l13, l12, map2);
    }

    @NotNull
    public final <NewResponseType> SalesIQResponse<NewResponseType> copy(@Nullable NewResponseType data, @Nullable Error error, int responseCode, boolean moreDataAvailable, @Nullable Long syncTime, @Nullable Long duration, @Nullable Map<String, String> headers) {
        SalesIQResponse<NewResponseType> salesIQResponse = new SalesIQResponse<>(data, error, responseCode, headers);
        salesIQResponse.moreDataAvailable = moreDataAvailable;
        salesIQResponse.syncTime = syncTime;
        salesIQResponse.duration = duration;
        return salesIQResponse;
    }

    @Nullable
    public final ResponseType getData() {
        return this.data;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    public final Error getError() {
        return this.error;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final boolean getMoreDataAvailable() {
        return this.moreDataAvailable;
    }

    @Nullable
    public final Long getSyncTime() {
        return this.syncTime;
    }

    /* renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final void setDuration(@Nullable Long l10) {
        this.duration = l10;
    }

    public final void setMoreDataAvailable(boolean z10) {
        this.moreDataAvailable = z10;
    }

    public final void setSyncTime(@Nullable Long l10) {
        this.syncTime = l10;
    }

    private SalesIQResponse(ResponseType responsetype, Error error, int i10, Map<String, String> map) {
        this.data = responsetype;
        this.error = error;
        this.responseCode = i10;
        this.headers = map;
        boolean z10 = false;
        if (200 <= i10 && i10 < 300) {
            z10 = true;
        }
        this.isSuccess = z10;
    }

    public static final class Error {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f42601a;

        /* renamed from: b, reason: collision with root package name */
        public final ErrorResponse f42602b;

        /* renamed from: c, reason: collision with root package name */
        public final Throwable f42603c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f42604d;

        /* renamed from: e, reason: collision with root package name */
        public final String f42605e;

        @Keep
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error$ErrorResponse;", "", "error", "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error$ErrorResponse$Error;", "(Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error$ErrorResponse$Error;)V", "getError", "()Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error$ErrorResponse$Error;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Error", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ErrorResponse {

            @c("error")
            @NotNull
            private final Error error;

            @Keep
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error$ErrorResponse$Error;", "", EventKeys.ERROR_CODE, "", "message", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQResponse$Error$ErrorResponse$Error;", "equals", "", "other", "hashCode", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Error {

                @c(EventKeys.ERROR_CODE)
                @Nullable
                private final Integer code;

                @c("message")
                @Nullable
                private final String message;

                public Error(@Nullable Integer num, @Nullable String str) {
                    this.code = num;
                    this.message = str;
                }

                public static /* synthetic */ Error copy$default(Error error, Integer num, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        num = error.code;
                    }
                    if ((i10 & 2) != 0) {
                        str = error.message;
                    }
                    return error.copy(num, str);
                }

                @Nullable
                /* renamed from: component1, reason: from getter */
                public final Integer getCode() {
                    return this.code;
                }

                @Nullable
                /* renamed from: component2, reason: from getter */
                public final String getMessage() {
                    return this.message;
                }

                @NotNull
                public final Error copy(@Nullable Integer code, @Nullable String message) {
                    return new Error(code, message);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Error)) {
                        return false;
                    }
                    Error error = (Error) other;
                    return Intrinsics.areEqual(this.code, error.code) && Intrinsics.areEqual(this.message, error.message);
                }

                @Nullable
                public final Integer getCode() {
                    return this.code;
                }

                @Nullable
                public final String getMessage() {
                    return this.message;
                }

                public int hashCode() {
                    Integer num = this.code;
                    int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                    String str = this.message;
                    return hashCode + (str != null ? str.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "Error(code=" + this.code + ", message=" + this.message + ')';
                }
            }

            public ErrorResponse(@NotNull Error error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, Error error, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    error = errorResponse.error;
                }
                return errorResponse.copy(error);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Error getError() {
                return this.error;
            }

            @NotNull
            public final ErrorResponse copy(@NotNull Error error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new ErrorResponse(error);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ErrorResponse) && Intrinsics.areEqual(this.error, ((ErrorResponse) other).error);
            }

            @NotNull
            public final Error getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return "ErrorResponse(error=" + this.error + ')';
            }
        }

        public Error(Integer num, ErrorResponse errorResponse, Throwable th2) {
            ErrorResponse.Error error;
            ErrorResponse.Error error2;
            this.f42601a = num;
            this.f42602b = errorResponse;
            this.f42603c = th2;
            String str = null;
            this.f42604d = (errorResponse == null || (error2 = errorResponse.getError()) == null) ? null : error2.getCode();
            if (errorResponse != null && (error = errorResponse.getError()) != null) {
                str = error.getMessage();
            }
            this.f42605e = str;
        }

        public final Throwable a() {
            return this.f42603c;
        }

        public final Integer b() {
            return this.f42604d;
        }

        public final ErrorResponse c() {
            return this.f42602b;
        }

        public final String d() {
            return this.f42605e;
        }

        public final Integer e() {
            return this.f42601a;
        }

        public /* synthetic */ Error(Integer num, ErrorResponse errorResponse, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num, errorResponse, (i10 & 4) != 0 ? null : th2);
        }
    }

    public /* synthetic */ SalesIQResponse(Object obj, Error error, int i10, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, error, (i11 & 4) != 0 ? -1 : i10, (i11 & 8) != 0 ? null : map);
    }
}
