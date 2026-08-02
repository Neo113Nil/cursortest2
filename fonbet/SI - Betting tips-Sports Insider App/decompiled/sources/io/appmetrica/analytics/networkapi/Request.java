package io.appmetrica.analytics.networkapi;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lio/appmetrica/analytics/networkapi/Request;", "", "", "toString", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "Lio/appmetrica/analytics/networkapi/Request$Method;", "b", "Lio/appmetrica/analytics/networkapi/Request$Method;", "getMethod", "()Lio/appmetrica/analytics/networkapi/Request$Method;", "method", "", "c", "[B", "getBody", "()[B", "body", "", "d", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "Builder", "Method", "network-api_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Method method;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final byte[] body;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map headers;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u0011"}, d2 = {"Lio/appmetrica/analytics/networkapi/Request$Builder;", "", "", "key", "value", "addHeader", "", "body", "withBody", "Lio/appmetrica/analytics/networkapi/Request$Method;", "method", "withMethod", "Lio/appmetrica/analytics/networkapi/Request;", "build", "url", "<init>", "(Ljava/lang/String;)V", "network-api_release"}, k = 1, mv = {1, 6, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f15153a;

        /* renamed from: b, reason: collision with root package name */
        private Method f15154b = Method.GET;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f15155c = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        private final LinkedHashMap f15156d = new LinkedHashMap();

        public Builder(@NotNull String str) {
            this.f15153a = str;
        }

        @NotNull
        public final Builder addHeader(@NotNull String key, @NotNull String value) {
            this.f15156d.put(key, value);
            return this;
        }

        @NotNull
        public final Request build() {
            return new Request(this.f15153a, this.f15154b, this.f15155c, n0.i(this.f15156d), null);
        }

        @NotNull
        public final Builder withBody(@NotNull byte[] body) {
            this.f15155c = body;
            return this;
        }

        @NotNull
        public final Builder withMethod(@NotNull Method method) {
            this.f15154b = method;
            return this;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/networkapi/Request$Method;", "", "", "a", "Ljava/lang/String;", "getMethodName", "()Ljava/lang/String;", "methodName", "GET", "POST", "network-api_release"}, k = 1, mv = {1, 6, 0})
    public enum Method {
        GET("GET"),
        POST("POST");


        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String methodName;

        Method(String str) {
            this.methodName = str;
        }

        @NotNull
        public final String getMethodName() {
            return this.methodName;
        }
    }

    public /* synthetic */ Request(String str, Method method, byte[] bArr, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, method, bArr, map);
    }

    @NotNull
    public final byte[] getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        return "Request(url='" + this.url + "', method='" + this.method + "', bodyLength=" + this.body.length + ", headers=" + this.headers + ')';
    }

    private Request(String str, Method method, byte[] bArr, Map map) {
        this.url = str;
        this.method = method;
        this.body = bArr;
        this.headers = map;
    }
}
