package com.unity3d.ads.network.model;

import defpackage.dmi;
import defpackage.lm5;
import defpackage.lnb;
import defpackage.wv8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/network/model/HttpResponse;", "", "body", "statusCode", "", "headers", "", "", "urlString", "<init>", "(Ljava/lang/Object;ILjava/util/Map;Ljava/lang/String;)V", "getBody", "()Ljava/lang/Object;", "getStatusCode", "()I", "getHeaders", "()Ljava/util/Map;", "getUrlString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HttpResponse {

    @NotNull
    private final Object body;

    @NotNull
    private final Map<String, Object> headers;
    private final int statusCode;

    @NotNull
    private final String urlString;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpResponse(Object obj, int i, Map map, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, i, map, (i2 & 8) != 0 ? "" : str);
        i = (i2 & 2) != 0 ? 200 : i;
        if ((i2 & 4) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.statusCode;
        }
        if ((i2 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i2 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i, map, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getBody() {
        return this.body;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.headers;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUrlString() {
        return this.urlString;
    }

    @NotNull
    public final HttpResponse copy(@NotNull Object body, int statusCode, @NotNull Map<String, ? extends Object> headers, @NotNull String urlString) {
        body.getClass();
        headers.getClass();
        urlString.getClass();
        return new HttpResponse(body, statusCode, headers, urlString);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return Intrinsics.c(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && Intrinsics.c(this.headers, httpResponse.headers) && Intrinsics.c(this.urlString, httpResponse.urlString);
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return this.urlString.hashCode() + dmi.g(this.headers, wv8.a(this.statusCode, this.body.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse(body=");
        sb.append(this.body);
        sb.append(", statusCode=");
        sb.append(this.statusCode);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", urlString=");
        return lnb.q(sb, this.urlString, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object obj, int i) {
        this(obj, i, null, null, 12, null);
        obj.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object obj, int i, @NotNull Map<String, ? extends Object> map) {
        this(obj, i, map, null, 8, null);
        obj.getClass();
        map.getClass();
    }

    public HttpResponse(@NotNull Object obj, int i, @NotNull Map<String, ? extends Object> map, @NotNull String str) {
        obj.getClass();
        map.getClass();
        str.getClass();
        this.body = obj;
        this.statusCode = i;
        this.headers = map;
        this.urlString = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object obj) {
        this(obj, 0, null, null, 14, null);
        obj.getClass();
    }
}
