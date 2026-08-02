package com.playtika.sharedsdk.shaded.okhttp3;

import com.android.volley.toolbox.HttpClientStack;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import com.playtika.sharedsdk.shaded.okhttp3.Headers;
import com.playtika.sharedsdk.shaded.okhttp3.HttpUrl;
import com.playtika.sharedsdk.shaded.okhttp3.internal.EmptyTags;
import com.playtika.sharedsdk.shaded.okhttp3.internal.IsProbablyUtf8Kt;
import com.playtika.sharedsdk.shaded.okhttp3.internal.Tags;
import com.playtika.sharedsdk.shaded.okhttp3.internal._UtilCommonKt;
import com.playtika.sharedsdk.shaded.okhttp3.internal.http.GzipRequestBody;
import com.playtika.sharedsdk.shaded.okhttp3.internal.http.HttpMethod;
import com.playtika.sharedsdk.shaded.okio.Buffer;
import com.safedk.android.a.g;
import io.sentry.protocol.OperatingSystem;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: Request.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u00015B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0004\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001e\u001a\u00020\u000bJ\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\u0006\u0010\u001e\u001a\u00020\u000bJ\u001e\u0010 \u001a\u0004\u0018\u0001H!\"\n\b\u0000\u0010!\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b\"\u0010#J%\u0010 \u001a\u0004\u0018\u0001H!\"\b\b\u0000\u0010!*\u00020\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H!0%¢\u0006\u0002\u0010&J\b\u0010 \u001a\u0004\u0018\u00010\u0001J#\u0010 \u001a\u0004\u0018\u0001H!\"\u0004\b\u0000\u0010!2\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u0002H!0'¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\u0003J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b,J\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b-J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b.J\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\b/J\r\u0010*\u001a\u00020\u0019H\u0007¢\u0006\u0002\b0J\b\u00101\u001a\u00020\u000bH\u0016J\u0012\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u001bH\u0007J\f\u00104\u001a\u00020\u000b*\u00020\u000bH\u0002R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\n\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0010R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0011\u0010*\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00066"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/Request;", "", "builder", "Lcom/playtika/sharedsdk/shaded/okhttp3/Request$Builder;", "<init>", "(Lokhttp3/Request$Builder;)V", "url", "Lcom/playtika/sharedsdk/shaded/okhttp3/HttpUrl;", "headers", "Lcom/playtika/sharedsdk/shaded/okhttp3/Headers;", "method", "", "body", "Lcom/playtika/sharedsdk/shaded/okhttp3/RequestBody;", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;Ljava/lang/String;Lokhttp3/RequestBody;)V", "()Lokhttp3/HttpUrl;", "()Ljava/lang/String;", "()Lokhttp3/Headers;", "()Lokhttp3/RequestBody;", "cacheUrlOverride", "tags", "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "lazyCacheControl", "Lcom/playtika/sharedsdk/shaded/okhttp3/CacheControl;", "isHttps", "", "()Z", "header", "name", "", "tag", "T", "reifiedTag", "()Ljava/lang/Object;", "type", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "newBuilder", "cacheControl", "()Lokhttp3/CacheControl;", "-deprecated_url", "-deprecated_method", "-deprecated_headers", "-deprecated_body", "-deprecated_cacheControl", "toString", "toCurl", "includeBody", "shellEscape", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Request {
    private final RequestBody body;
    private final HttpUrl cacheUrlOverride;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Tags tags;
    private final HttpUrl url;

    public final String toCurl() {
        return toCurl$default(this, false, 1, null);
    }

    public Request(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        HttpUrl url = builder.getUrl();
        if (url == null) {
            throw new IllegalStateException("url == null".toString());
        }
        this.url = url;
        this.method = builder.getMethod();
        this.headers = builder.getHeaders().build();
        this.body = builder.getBody();
        this.cacheUrlOverride = builder.getCacheUrlOverride();
        this.tags = builder.getTags();
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final String method() {
        return this.method;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final RequestBody body() {
        return this.body;
    }

    /* renamed from: cacheUrlOverride, reason: from getter */
    public final HttpUrl getCacheUrlOverride() {
        return this.cacheUrlOverride;
    }

    /* renamed from: getTags$okhttp, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public /* synthetic */ Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrl, (i & 2) != 0 ? Headers.INSTANCE.of(new String[0]) : headers, (i & 4) != 0 ? WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR : str, (i & 8) != 0 ? null : requestBody);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Request(HttpUrl url, Headers headers, String method, RequestBody requestBody) {
        this(r2.method(method, requestBody));
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        Builder headers2 = new Builder().url(url).headers(headers);
        if (Intrinsics.areEqual(method, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            if (requestBody != null) {
                method = "POST";
            } else {
                method = "GET";
            }
        }
    }

    public final String header(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.get(name);
    }

    public final List<String> headers(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    public final /* synthetic */ <T> T reifiedTag() {
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) tag(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final <T> T tag(KClass<T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) JvmClassMappingKt.getJavaClass((KClass) type).cast(this.tags.get(type));
    }

    public final <T> T tag(Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) tag(JvmClassMappingKt.getKotlinClass(type));
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    /* renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "method", imports = {}))
    /* renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final String getMethod() {
        return this.method;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    /* renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m10455deprecated_cacheControl() {
        return cacheControl();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String component1 = pair2.component1();
                String component2 = pair2.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(component1);
                sb.append(AbstractJsonLexerKt.COLON);
                if (_UtilCommonKt.isSensitiveHeader(component1)) {
                    component2 = "██";
                }
                sb.append(component2);
                i = i2;
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        if (!Intrinsics.areEqual(this.tags, EmptyTags.INSTANCE)) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    /* compiled from: Request.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000eH\u0016J\u0018\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000eH\u0016J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0000H\u0016J\b\u00103\u001a\u00020\u0000H\u0016J\u0010\u00104\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0014\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017J\u0010\u00106\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u00107\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u00108\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u00109\u001a\u00020\u0000\"\n\b\u0000\u0010:\u0018\u0001*\u00020\u00012\b\u00109\u001a\u0004\u0018\u0001H:H\u0087\b¢\u0006\u0004\b;\u0010<J-\u00109\u001a\u00020\u0000\"\b\b\u0000\u0010:*\u00020\u00012\f\u0010=\u001a\b\u0012\u0004\u0012\u0002H:0>2\b\u00109\u001a\u0004\u0018\u0001H:¢\u0006\u0002\u0010?J\u0012\u00109\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0016J-\u00109\u001a\u00020\u0000\"\u0004\b\u0000\u0010:2\u000e\u0010=\u001a\n\u0012\u0006\b\u0000\u0012\u0002H:0@2\b\u00109\u001a\u0004\u0018\u0001H:H\u0016¢\u0006\u0002\u0010AJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\bJ\u0006\u0010B\u001a\u00020\u0000J\b\u0010C\u001a\u00020\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001a\u0010\"\u001a\u00020#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006D"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/Request$Builder;", "", "<init>", "()V", "request", "Lcom/playtika/sharedsdk/shaded/okhttp3/Request;", "(Lokhttp3/Request;)V", "url", "Lcom/playtika/sharedsdk/shaded/okhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "method", "", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "headers", "Lcom/playtika/sharedsdk/shaded/okhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "body", "Lcom/playtika/sharedsdk/shaded/okhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "cacheUrlOverride", "getCacheUrlOverride$okhttp", "setCacheUrlOverride$okhttp", "tags", "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "setTags$okhttp", "(Lokhttp3/internal/Tags;)V", "canonicalUrl", "Ljava/net/URL;", "header", "name", "value", "addHeader", "removeHeader", "Lcom/playtika/sharedsdk/shaded/okhttp3/Headers;", "cacheControl", "Lcom/playtika/sharedsdk/shaded/okhttp3/CacheControl;", "get", TtmlNode.TAG_HEAD, "post", "delete", "put", "patch", "query", "tag", "T", "reifiedTag", "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", "type", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "gzip", OperatingSystem.JsonKeys.BUILD, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class Builder {
        private RequestBody body;
        private HttpUrl cacheUrlOverride;
        private Headers.Builder headers;
        private String method;
        private Tags tags;
        private HttpUrl url;

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        /* renamed from: getUrl$okhttp, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        /* renamed from: getMethod$okhttp, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        public final void setMethod$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.method = str;
        }

        /* renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        /* renamed from: getBody$okhttp, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        /* renamed from: getCacheUrlOverride$okhttp, reason: from getter */
        public final HttpUrl getCacheUrlOverride() {
            return this.cacheUrlOverride;
        }

        public final void setCacheUrlOverride$okhttp(HttpUrl httpUrl) {
            this.cacheUrlOverride = httpUrl;
        }

        /* renamed from: getTags$okhttp, reason: from getter */
        public final Tags getTags() {
            return this.tags;
        }

        public final void setTags$okhttp(Tags tags) {
            Intrinsics.checkNotNullParameter(tags, "<set-?>");
            this.tags = tags;
        }

        public Builder() {
            this.tags = EmptyTags.INSTANCE;
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public Builder(Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.tags = EmptyTags.INSTANCE;
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags();
            this.headers = request.headers().newBuilder();
            this.cacheUrlOverride = request.getCacheUrlOverride();
        }

        public Builder url(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        public Builder url(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return url(HttpUrl.INSTANCE.get(canonicalUrl(url)));
        }

        private final String canonicalUrl(String url) {
            if (StringsKt.startsWith(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder("http:");
                String substring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                return sb.append(substring).toString();
            }
            if (!StringsKt.startsWith(url, "wss:", true)) {
                return url;
            }
            StringBuilder sb2 = new StringBuilder("https:");
            String substring2 = url.substring(4);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            return sb2.append(substring2).toString();
        }

        public Builder url(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String url2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
            return url(companion.get(url2));
        }

        public Builder header(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.set(name, value);
            return this;
        }

        public Builder addHeader(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public Builder removeHeader(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public Builder headers(Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder cacheControl(CacheControl cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.length() == 0 ? removeHeader(HttpHeaders.CACHE_CONTROL) : header(HttpHeaders.CACHE_CONTROL, cacheControl2);
        }

        public Builder get() {
            return method("GET", null);
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder post(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("POST", body);
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                requestBody = RequestBody.EMPTY;
            }
            return builder.delete(requestBody);
        }

        public Builder delete(RequestBody body) {
            return method("DELETE", body);
        }

        public Builder put(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method(g.f, body);
        }

        public Builder patch(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method(HttpClientStack.HttpPatch.METHOD_NAME, body);
        }

        public Builder query(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("QUERY", body);
        }

        public Builder method(String method, RequestBody body) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (body == null) {
                if (HttpMethod.requiresRequestBody(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        public final /* synthetic */ <T> Builder reifiedTag(T t) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return tag((KClass<KClass<T>>) Reflection.getOrCreateKotlinClass(Object.class), (KClass<T>) t);
        }

        public final <T> Builder tag(KClass<T> type, T t) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.tags = this.tags.plus(type, t);
            return this;
        }

        public Builder tag(Object tag) {
            return tag((KClass<KClass>) Reflection.getOrCreateKotlinClass(Object.class), (KClass) tag);
        }

        public <T> Builder tag(Class<? super T> type, T t) {
            Intrinsics.checkNotNullParameter(type, "type");
            return tag((KClass<KClass<T>>) JvmClassMappingKt.getKotlinClass(type), (KClass<T>) t);
        }

        public final Builder cacheUrlOverride(HttpUrl cacheUrlOverride) {
            this.cacheUrlOverride = cacheUrlOverride;
            return this;
        }

        public final Builder gzip() {
            RequestBody requestBody = this.body;
            if (requestBody == null) {
                throw new IllegalStateException("cannot gzip a request that has no body");
            }
            String str = this.headers.get(HttpHeaders.CONTENT_ENCODING);
            if (str != null) {
                throw new IllegalStateException(("Content-Encoding already set: " + str).toString());
            }
            this.headers.add(HttpHeaders.CONTENT_ENCODING, "gzip");
            this.body = new GzipRequestBody(requestBody);
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }

    public static /* synthetic */ String toCurl$default(Request request, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return request.toCurl(z);
    }

    public final String toCurl(boolean includeBody) {
        MediaType contentType;
        StringBuilder sb = new StringBuilder();
        sb.append("curl " + shellEscape(this.url.getUrl()));
        RequestBody requestBody = this.body;
        String mediaType = (requestBody == null || (contentType = requestBody.contentType()) == null) ? null : contentType.toString();
        if (!Intrinsics.areEqual(this.method, (!includeBody || this.body == null) ? "GET" : "POST")) {
            sb.append(" \\\n  -X " + shellEscape(this.method));
        }
        Iterator<Pair<? extends String, ? extends String>> it = this.headers.iterator();
        while (it.hasNext()) {
            Pair<? extends String, ? extends String> next = it.next();
            String component1 = next.component1();
            String component2 = next.component2();
            if (mediaType == null || !StringsKt.equals(component1, "Content-Type", true)) {
                sb.append(" \\\n  -H " + shellEscape(component1 + ": " + component2));
            }
        }
        if (mediaType != null) {
            sb.append(" \\\n  -H " + shellEscape("Content-Type: " + mediaType));
        }
        if (includeBody && this.body != null) {
            Buffer buffer = new Buffer();
            this.body.writeTo(buffer);
            if (IsProbablyUtf8Kt.isProbablyUtf8$default(buffer, 0L, 1, null)) {
                sb.append(" \\\n  --data " + shellEscape(buffer.readUtf8()));
            } else {
                sb.append(" \\\n  --data-binary " + shellEscape(buffer.readByteString().hex()));
            }
        }
        return sb.toString();
    }

    private final String shellEscape(String str) {
        return "'" + StringsKt.replace$default(str, "'", "'\\''", false, 4, (Object) null) + '\'';
    }

    public final Object tag() {
        return tag(Reflection.getOrCreateKotlinClass(Object.class));
    }
}
