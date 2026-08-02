package com.orkestapay.orkestapay.core.networking;

import com.plaid.internal.EnumC3631g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u0000 !2\u00020\u0001:\u0001!B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/HttpResponse;", "", "status", "", "headers", "", "", "body", "error", "", "(ILjava/util/Map;Ljava/lang/String;Ljava/lang/Throwable;)V", "getBody", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "getHeaders", "()Ljava/util/Map;", "isSuccessful", "", "()Z", "setSuccessful", "(Z)V", "getStatus", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HttpResponse {
    public static final int SERVER_ERROR = -3;
    public static final int STATUS_UNDETERMINED = -1;
    public static final int STATUS_UNKNOWN_HOST = -2;

    @Nullable
    private final String body;

    @Nullable
    private final Throwable error;

    @NotNull
    private final Map<String, String> headers;
    private boolean isSuccessful;
    private final int status;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final IntRange SUCCESSFUL_STATUS_CODES = new IntRange(200, EnumC3631g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/HttpResponse$Companion;", "", "()V", "SERVER_ERROR", "", "STATUS_UNDETERMINED", "STATUS_UNKNOWN_HOST", "SUCCESSFUL_STATUS_CODES", "Lkotlin/ranges/IntRange;", "getSUCCESSFUL_STATUS_CODES", "()Lkotlin/ranges/IntRange;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntRange getSUCCESSFUL_STATUS_CODES() {
            return HttpResponse.SUCCESSFUL_STATUS_CODES;
        }

        private Companion() {
        }
    }

    public HttpResponse(int i10, @NotNull Map<String, String> headers, @Nullable String str, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.status = i10;
        this.headers = headers;
        this.body = str;
        this.error = th2;
        IntRange intRange = SUCCESSFUL_STATUS_CODES;
        int first = intRange.getFirst();
        int last = intRange.getLast();
        boolean z10 = false;
        if (first <= i10 && i10 <= last) {
            z10 = true;
        }
        this.isSuccessful = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, int i10, Map map, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = httpResponse.status;
        }
        if ((i11 & 2) != 0) {
            map = httpResponse.headers;
        }
        if ((i11 & 4) != 0) {
            str = httpResponse.body;
        }
        if ((i11 & 8) != 0) {
            th2 = httpResponse.error;
        }
        return httpResponse.copy(i10, map, str, th2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.headers;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    @NotNull
    public final HttpResponse copy(int status, @NotNull Map<String, String> headers, @Nullable String body, @Nullable Throwable error) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new HttpResponse(status, headers, body, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return this.status == httpResponse.status && Intrinsics.areEqual(this.headers, httpResponse.headers) && Intrinsics.areEqual(this.body, httpResponse.body) && Intrinsics.areEqual(this.error, httpResponse.error);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final Throwable getError() {
        return this.error;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.status) * 31) + this.headers.hashCode()) * 31;
        String str = this.body;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th2 = this.error;
        return hashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    /* renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    public final void setSuccessful(boolean z10) {
        this.isSuccessful = z10;
    }

    @NotNull
    public String toString() {
        return "HttpResponse(status=" + this.status + ", headers=" + this.headers + ", body=" + this.body + ", error=" + this.error + ')';
    }

    public /* synthetic */ HttpResponse(int i10, Map map, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? MapsKt.emptyMap() : map, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : th2);
    }
}
