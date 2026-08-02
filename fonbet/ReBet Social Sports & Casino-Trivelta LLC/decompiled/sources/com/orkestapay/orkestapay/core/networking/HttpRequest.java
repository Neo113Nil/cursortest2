package com.orkestapay.orkestapay.core.networking;

import com.twilio.voice.EventKeys;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/HttpRequest;", "", EventKeys.URL, "Ljava/net/URL;", "method", "Lcom/orkestapay/orkestapay/core/networking/HttpMethod;", "body", "", "headers", "", "(Ljava/net/URL;Lcom/orkestapay/orkestapay/core/networking/HttpMethod;Ljava/lang/String;Ljava/util/Map;)V", "getBody", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getMethod", "()Lcom/orkestapay/orkestapay/core/networking/HttpMethod;", "getUrl", "()Ljava/net/URL;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HttpRequest {

    @Nullable
    private final String body;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final HttpMethod method;

    @NotNull
    private final URL url;

    public HttpRequest(@NotNull URL url, @NotNull HttpMethod method, @Nullable String str, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.url = url;
        this.method = method;
        this.body = str;
        this.headers = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, URL url, HttpMethod httpMethod, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            url = httpRequest.url;
        }
        if ((i10 & 2) != 0) {
            httpMethod = httpRequest.method;
        }
        if ((i10 & 4) != 0) {
            str = httpRequest.body;
        }
        if ((i10 & 8) != 0) {
            map = httpRequest.headers;
        }
        return httpRequest.copy(url, httpMethod, str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final URL getUrl() {
        return this.url;
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
    public final Map<String, String> component4() {
        return this.headers;
    }

    @NotNull
    public final HttpRequest copy(@NotNull URL url, @NotNull HttpMethod method, @Nullable String body, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new HttpRequest(url, method, body, headers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) other;
        return Intrinsics.areEqual(this.url, httpRequest.url) && this.method == httpRequest.method && Intrinsics.areEqual(this.body, httpRequest.body) && Intrinsics.areEqual(this.headers, httpRequest.headers);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final HttpMethod getMethod() {
        return this.method;
    }

    @NotNull
    public final URL getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((this.url.hashCode() * 31) + this.method.hashCode()) * 31;
        String str = this.body;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.headers.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpRequest(url=" + this.url + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ')';
    }

    public /* synthetic */ HttpRequest(URL url, HttpMethod httpMethod, String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(url, (i10 & 2) != 0 ? HttpMethod.GET : httpMethod, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? new LinkedHashMap() : map);
    }
}
