package com.margelo.nitro.nitrofetch;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.margelo.nitro.core.ArrayBuffer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroRequest.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0001DB\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0016\u00103\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0016\u00107\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010:\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¨\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00122\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR \u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b/\u0010(R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001a¨\u0006E"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroRequest;", "", "url", "", "method", "Lcom/margelo/nitro/nitrofetch/NitroRequestMethod;", "headers", "", "Lcom/margelo/nitro/nitrofetch/NitroHeader;", "bodyString", "bodyBytes", "Lcom/margelo/nitro/core/ArrayBuffer;", "bodyBytesBase64", "bodyFormData", "Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;", "timeoutMs", "", "followRedirects", "", "credentials", "Lcom/margelo/nitro/nitrofetch/NitroRequestCredentials;", "prefetchCacheTtlMs", "requestId", "<init>", "(Ljava/lang/String;Lcom/margelo/nitro/nitrofetch/NitroRequestMethod;[Lcom/margelo/nitro/nitrofetch/NitroHeader;Ljava/lang/String;Lcom/margelo/nitro/core/ArrayBuffer;Ljava/lang/String;[Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/margelo/nitro/nitrofetch/NitroRequestCredentials;Ljava/lang/Double;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getMethod", "()Lcom/margelo/nitro/nitrofetch/NitroRequestMethod;", "getHeaders", "()[Lcom/margelo/nitro/nitrofetch/NitroHeader;", "[Lcom/margelo/nitro/nitrofetch/NitroHeader;", "getBodyString", "getBodyBytes", "()Lcom/margelo/nitro/core/ArrayBuffer;", "getBodyBytesBase64", "getBodyFormData", "()[Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;", "[Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;", "getTimeoutMs", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFollowRedirects", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCredentials", "()Lcom/margelo/nitro/nitrofetch/NitroRequestCredentials;", "getPrefetchCacheTtlMs", "getRequestId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Lcom/margelo/nitro/nitrofetch/NitroRequestMethod;[Lcom/margelo/nitro/nitrofetch/NitroHeader;Ljava/lang/String;Lcom/margelo/nitro/core/ArrayBuffer;Ljava/lang/String;[Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/margelo/nitro/nitrofetch/NitroRequestCredentials;Ljava/lang/Double;Ljava/lang/String;)Lcom/margelo/nitro/nitrofetch/NitroRequest;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NitroRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ArrayBuffer bodyBytes;
    private final String bodyBytesBase64;
    private final NitroFormDataPart[] bodyFormData;
    private final String bodyString;
    private final NitroRequestCredentials credentials;
    private final Boolean followRedirects;
    private final NitroHeader[] headers;
    private final NitroRequestMethod method;
    private final Double prefetchCacheTtlMs;
    private final String requestId;
    private final Double timeoutMs;
    private final String url;

    public static /* synthetic */ NitroRequest copy$default(NitroRequest nitroRequest, String str, NitroRequestMethod nitroRequestMethod, NitroHeader[] nitroHeaderArr, String str2, ArrayBuffer arrayBuffer, String str3, NitroFormDataPart[] nitroFormDataPartArr, Double d, Boolean bool, NitroRequestCredentials nitroRequestCredentials, Double d2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroRequest.url;
        }
        if ((i & 2) != 0) {
            nitroRequestMethod = nitroRequest.method;
        }
        if ((i & 4) != 0) {
            nitroHeaderArr = nitroRequest.headers;
        }
        if ((i & 8) != 0) {
            str2 = nitroRequest.bodyString;
        }
        if ((i & 16) != 0) {
            arrayBuffer = nitroRequest.bodyBytes;
        }
        if ((i & 32) != 0) {
            str3 = nitroRequest.bodyBytesBase64;
        }
        if ((i & 64) != 0) {
            nitroFormDataPartArr = nitroRequest.bodyFormData;
        }
        if ((i & 128) != 0) {
            d = nitroRequest.timeoutMs;
        }
        if ((i & 256) != 0) {
            bool = nitroRequest.followRedirects;
        }
        if ((i & 512) != 0) {
            nitroRequestCredentials = nitroRequest.credentials;
        }
        if ((i & 1024) != 0) {
            d2 = nitroRequest.prefetchCacheTtlMs;
        }
        if ((i & 2048) != 0) {
            str4 = nitroRequest.requestId;
        }
        Double d3 = d2;
        String str5 = str4;
        Boolean bool2 = bool;
        NitroRequestCredentials nitroRequestCredentials2 = nitroRequestCredentials;
        NitroFormDataPart[] nitroFormDataPartArr2 = nitroFormDataPartArr;
        Double d4 = d;
        ArrayBuffer arrayBuffer2 = arrayBuffer;
        String str6 = str3;
        return nitroRequest.copy(str, nitroRequestMethod, nitroHeaderArr, str2, arrayBuffer2, str6, nitroFormDataPartArr2, d4, bool2, nitroRequestCredentials2, d3, str5);
    }

    @JvmStatic
    private static final NitroRequest fromCpp(String str, NitroRequestMethod nitroRequestMethod, NitroHeader[] nitroHeaderArr, String str2, ArrayBuffer arrayBuffer, String str3, NitroFormDataPart[] nitroFormDataPartArr, Double d, Boolean bool, NitroRequestCredentials nitroRequestCredentials, Double d2, String str4) {
        return INSTANCE.fromCpp(str, nitroRequestMethod, nitroHeaderArr, str2, arrayBuffer, str3, nitroFormDataPartArr, d, bool, nitroRequestCredentials, d2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component10, reason: from getter */
    public final NitroRequestCredentials getCredentials() {
        return this.credentials;
    }

    /* renamed from: component11, reason: from getter */
    public final Double getPrefetchCacheTtlMs() {
        return this.prefetchCacheTtlMs;
    }

    /* renamed from: component12, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final NitroRequestMethod getMethod() {
        return this.method;
    }

    /* renamed from: component3, reason: from getter */
    public final NitroHeader[] getHeaders() {
        return this.headers;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBodyString() {
        return this.bodyString;
    }

    /* renamed from: component5, reason: from getter */
    public final ArrayBuffer getBodyBytes() {
        return this.bodyBytes;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBodyBytesBase64() {
        return this.bodyBytesBase64;
    }

    /* renamed from: component7, reason: from getter */
    public final NitroFormDataPart[] getBodyFormData() {
        return this.bodyFormData;
    }

    /* renamed from: component8, reason: from getter */
    public final Double getTimeoutMs() {
        return this.timeoutMs;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public final NitroRequest copy(String url, NitroRequestMethod method, NitroHeader[] headers, String bodyString, ArrayBuffer bodyBytes, String bodyBytesBase64, NitroFormDataPart[] bodyFormData, Double timeoutMs, Boolean followRedirects, NitroRequestCredentials credentials, Double prefetchCacheTtlMs, String requestId) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new NitroRequest(url, method, headers, bodyString, bodyBytes, bodyBytesBase64, bodyFormData, timeoutMs, followRedirects, credentials, prefetchCacheTtlMs, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroRequest)) {
            return false;
        }
        NitroRequest nitroRequest = (NitroRequest) other;
        return Intrinsics.areEqual(this.url, nitroRequest.url) && this.method == nitroRequest.method && Intrinsics.areEqual(this.headers, nitroRequest.headers) && Intrinsics.areEqual(this.bodyString, nitroRequest.bodyString) && Intrinsics.areEqual(this.bodyBytes, nitroRequest.bodyBytes) && Intrinsics.areEqual(this.bodyBytesBase64, nitroRequest.bodyBytesBase64) && Intrinsics.areEqual(this.bodyFormData, nitroRequest.bodyFormData) && Intrinsics.areEqual((Object) this.timeoutMs, (Object) nitroRequest.timeoutMs) && Intrinsics.areEqual(this.followRedirects, nitroRequest.followRedirects) && this.credentials == nitroRequest.credentials && Intrinsics.areEqual((Object) this.prefetchCacheTtlMs, (Object) nitroRequest.prefetchCacheTtlMs) && Intrinsics.areEqual(this.requestId, nitroRequest.requestId);
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        NitroRequestMethod nitroRequestMethod = this.method;
        int hashCode2 = (hashCode + (nitroRequestMethod == null ? 0 : nitroRequestMethod.hashCode())) * 31;
        NitroHeader[] nitroHeaderArr = this.headers;
        int hashCode3 = (hashCode2 + (nitroHeaderArr == null ? 0 : Arrays.hashCode(nitroHeaderArr))) * 31;
        String str = this.bodyString;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ArrayBuffer arrayBuffer = this.bodyBytes;
        int hashCode5 = (hashCode4 + (arrayBuffer == null ? 0 : arrayBuffer.hashCode())) * 31;
        String str2 = this.bodyBytesBase64;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NitroFormDataPart[] nitroFormDataPartArr = this.bodyFormData;
        int hashCode7 = (hashCode6 + (nitroFormDataPartArr == null ? 0 : Arrays.hashCode(nitroFormDataPartArr))) * 31;
        Double d = this.timeoutMs;
        int hashCode8 = (hashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.followRedirects;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        NitroRequestCredentials nitroRequestCredentials = this.credentials;
        int hashCode10 = (hashCode9 + (nitroRequestCredentials == null ? 0 : nitroRequestCredentials.hashCode())) * 31;
        Double d2 = this.prefetchCacheTtlMs;
        int hashCode11 = (hashCode10 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.requestId;
        return hashCode11 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "NitroRequest(url=" + this.url + ", method=" + this.method + ", headers=" + Arrays.toString(this.headers) + ", bodyString=" + this.bodyString + ", bodyBytes=" + this.bodyBytes + ", bodyBytesBase64=" + this.bodyBytesBase64 + ", bodyFormData=" + Arrays.toString(this.bodyFormData) + ", timeoutMs=" + this.timeoutMs + ", followRedirects=" + this.followRedirects + ", credentials=" + this.credentials + ", prefetchCacheTtlMs=" + this.prefetchCacheTtlMs + ", requestId=" + this.requestId + ")";
    }

    public NitroRequest(String url, NitroRequestMethod nitroRequestMethod, NitroHeader[] nitroHeaderArr, String str, ArrayBuffer arrayBuffer, String str2, NitroFormDataPart[] nitroFormDataPartArr, Double d, Boolean bool, NitroRequestCredentials nitroRequestCredentials, Double d2, String str3) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.method = nitroRequestMethod;
        this.headers = nitroHeaderArr;
        this.bodyString = str;
        this.bodyBytes = arrayBuffer;
        this.bodyBytesBase64 = str2;
        this.bodyFormData = nitroFormDataPartArr;
        this.timeoutMs = d;
        this.followRedirects = bool;
        this.credentials = nitroRequestCredentials;
        this.prefetchCacheTtlMs = d2;
        this.requestId = str3;
    }

    public final String getUrl() {
        return this.url;
    }

    public final NitroRequestMethod getMethod() {
        return this.method;
    }

    public final NitroHeader[] getHeaders() {
        return this.headers;
    }

    public final String getBodyString() {
        return this.bodyString;
    }

    public final ArrayBuffer getBodyBytes() {
        return this.bodyBytes;
    }

    public final String getBodyBytesBase64() {
        return this.bodyBytesBase64;
    }

    public final NitroFormDataPart[] getBodyFormData() {
        return this.bodyFormData;
    }

    public final Double getTimeoutMs() {
        return this.timeoutMs;
    }

    public final Boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public final NitroRequestCredentials getCredentials() {
        return this.credentials;
    }

    public final Double getPrefetchCacheTtlMs() {
        return this.prefetchCacheTtlMs;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    /* compiled from: NitroRequest.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008f\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroRequest$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/nitrofetch/NitroRequest;", "url", "", "method", "Lcom/margelo/nitro/nitrofetch/NitroRequestMethod;", "headers", "", "Lcom/margelo/nitro/nitrofetch/NitroHeader;", "bodyString", "bodyBytes", "Lcom/margelo/nitro/core/ArrayBuffer;", "bodyBytesBase64", "bodyFormData", "Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;", "timeoutMs", "", "followRedirects", "", "credentials", "Lcom/margelo/nitro/nitrofetch/NitroRequestCredentials;", "prefetchCacheTtlMs", "requestId", "(Ljava/lang/String;Lcom/margelo/nitro/nitrofetch/NitroRequestMethod;[Lcom/margelo/nitro/nitrofetch/NitroHeader;Ljava/lang/String;Lcom/margelo/nitro/core/ArrayBuffer;Ljava/lang/String;[Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/margelo/nitro/nitrofetch/NitroRequestCredentials;Ljava/lang/Double;Ljava/lang/String;)Lcom/margelo/nitro/nitrofetch/NitroRequest;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroRequest fromCpp(String url, NitroRequestMethod method, NitroHeader[] headers, String bodyString, ArrayBuffer bodyBytes, String bodyBytesBase64, NitroFormDataPart[] bodyFormData, Double timeoutMs, Boolean followRedirects, NitroRequestCredentials credentials, Double prefetchCacheTtlMs, String requestId) {
            return new NitroRequest(url, method, headers, bodyString, bodyBytes, bodyBytesBase64, bodyFormData, timeoutMs, followRedirects, credentials, prefetchCacheTtlMs, requestId);
        }
    }
}
