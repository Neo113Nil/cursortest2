package com.orkestapay.orkestapay.core.networking;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/RestRequest;", "", "path", "", "method", "Lcom/orkestapay/orkestapay/core/networking/HttpMethod;", "body", "(Ljava/lang/String;Lcom/orkestapay/orkestapay/core/networking/HttpMethod;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getMethod", "()Lcom/orkestapay/orkestapay/core/networking/HttpMethod;", "getPath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RestRequest {

    @Nullable
    private final String body;

    @NotNull
    private final HttpMethod method;

    @NotNull
    private final String path;

    public RestRequest(@NotNull String path, @NotNull HttpMethod method, @Nullable String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        this.path = path;
        this.method = method;
        this.body = str;
    }

    public static /* synthetic */ RestRequest copy$default(RestRequest restRequest, String str, HttpMethod httpMethod, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = restRequest.path;
        }
        if ((i10 & 2) != 0) {
            httpMethod = restRequest.method;
        }
        if ((i10 & 4) != 0) {
            str2 = restRequest.body;
        }
        return restRequest.copy(str, httpMethod, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final HttpMethod getMethod() {
        return this.method;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final RestRequest copy(@NotNull String path, @NotNull HttpMethod method, @Nullable String body) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        return new RestRequest(path, method, body);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestRequest)) {
            return false;
        }
        RestRequest restRequest = (RestRequest) other;
        return Intrinsics.areEqual(this.path, restRequest.path) && this.method == restRequest.method && Intrinsics.areEqual(this.body, restRequest.body);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final HttpMethod getMethod() {
        return this.method;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int hashCode = ((this.path.hashCode() * 31) + this.method.hashCode()) * 31;
        String str = this.body;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "RestRequest(path=" + this.path + ", method=" + this.method + ", body=" + this.body + ')';
    }

    public /* synthetic */ RestRequest(String str, HttpMethod httpMethod, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, httpMethod, (i10 & 4) != 0 ? null : str2);
    }
}
