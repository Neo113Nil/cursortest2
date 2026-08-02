package io.appmetrica.analytics.networkapi;

import d9.e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001'J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lio/appmetrica/analytics/networkapi/Response;", "", "", "toString", "", "a", "Z", "isCompleted", "()Z", "", "b", "I", "getCode", "()I", "code", "", "c", "[B", "getResponseData", "()[B", "responseData", "", "", "d", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "", "e", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "exception", "f", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "Builder", "network-api_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Response {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isCompleted;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final byte[] responseData;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map headers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Throwable exception;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String url;

    public /* synthetic */ Response(boolean z5, int i5, byte[] bArr, Map map, Throwable th2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, i5, bArr, map, th2, str);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Throwable getException() {
        return this.exception;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final byte[] getResponseData() {
        return this.responseData;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: isCompleted, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Response(isCompleted=");
        sb2.append(this.isCompleted);
        sb2.append(", code=");
        sb2.append(this.code);
        sb2.append(", responseDataLength=");
        sb2.append(this.responseData.length);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", exception=");
        sb2.append(this.exception);
        sb2.append(", url=");
        return e.k(sb2, this.url, ')');
    }

    private Response(boolean z5, int i5, byte[] bArr, Map map, Throwable th2, String str) {
        this.isCompleted = z5;
        this.code = i5;
        this.responseData = bArr;
        this.headers = map;
        this.exception = th2;
        this.url = str;
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\r\u0010\u0015J \u0010\u0006\u001a\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\t¨\u0006\u0016"}, d2 = {"Lio/appmetrica/analytics/networkapi/Response$Builder;", "", "", "", "", "headers", "withHeaders", "url", "withUrl", "Lio/appmetrica/analytics/networkapi/Response;", "build", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "", "isCompleted", "", "code", "", "responseData", "(ZI[B)V", "network-api_release"}, k = 1, mv = {1, 6, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f15165a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15166b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f15167c;

        /* renamed from: d, reason: collision with root package name */
        private final Throwable f15168d;

        /* renamed from: e, reason: collision with root package name */
        private Map f15169e;

        /* renamed from: f, reason: collision with root package name */
        private String f15170f;

        private Builder(boolean z5, int i5, byte[] bArr, Throwable th2) {
            this.f15165a = z5;
            this.f15166b = i5;
            this.f15167c = bArr;
            this.f15168d = th2;
            this.f15169e = n0.c();
        }

        @NotNull
        public final Response build() {
            return new Response(this.f15165a, this.f15166b, this.f15167c, this.f15169e, this.f15168d, this.f15170f, null);
        }

        @NotNull
        public final Builder withHeaders(@NotNull Map<String, ? extends List<String>> headers) {
            this.f15169e = n0.i(headers);
            return this;
        }

        @NotNull
        public final Builder withUrl(@NotNull String url) {
            this.f15170f = url;
            return this;
        }

        public Builder(@Nullable Throwable th2) {
            this(false, 0, new byte[0], th2);
        }

        public Builder(boolean z5, int i5, @NotNull byte[] bArr) {
            this(z5, i5, bArr, null);
        }
    }
}
