package com.margelo.nitro.nitrofetch;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlResponseInfo.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\u008a\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00068"}, d2 = {"Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "", "url", "", "httpStatusCode", "", "httpStatusText", "allHeaders", "", "allHeadersAsList", "", "Lcom/margelo/nitro/nitrofetch/HttpHeader;", "urlChain", "negotiatedProtocol", "proxyServer", "receivedByteCount", "wasCached", "", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/util/Map;[Lcom/margelo/nitro/nitrofetch/HttpHeader;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZ)V", "getUrl", "()Ljava/lang/String;", "getHttpStatusCode", "()D", "getHttpStatusText", "getAllHeaders", "()Ljava/util/Map;", "getAllHeadersAsList", "()[Lcom/margelo/nitro/nitrofetch/HttpHeader;", "[Lcom/margelo/nitro/nitrofetch/HttpHeader;", "getUrlChain", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getNegotiatedProtocol", "getProxyServer", "getReceivedByteCount", "getWasCached", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/util/Map;[Lcom/margelo/nitro/nitrofetch/HttpHeader;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZ)Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UrlResponseInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, String> allHeaders;
    private final HttpHeader[] allHeadersAsList;
    private final double httpStatusCode;
    private final String httpStatusText;
    private final String negotiatedProtocol;
    private final String proxyServer;
    private final double receivedByteCount;
    private final String url;
    private final String[] urlChain;
    private final boolean wasCached;

    public static /* synthetic */ UrlResponseInfo copy$default(UrlResponseInfo urlResponseInfo, String str, double d, String str2, Map map, HttpHeader[] httpHeaderArr, String[] strArr, String str3, String str4, double d2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlResponseInfo.url;
        }
        if ((i & 2) != 0) {
            d = urlResponseInfo.httpStatusCode;
        }
        if ((i & 4) != 0) {
            str2 = urlResponseInfo.httpStatusText;
        }
        if ((i & 8) != 0) {
            map = urlResponseInfo.allHeaders;
        }
        if ((i & 16) != 0) {
            httpHeaderArr = urlResponseInfo.allHeadersAsList;
        }
        if ((i & 32) != 0) {
            strArr = urlResponseInfo.urlChain;
        }
        if ((i & 64) != 0) {
            str3 = urlResponseInfo.negotiatedProtocol;
        }
        if ((i & 128) != 0) {
            str4 = urlResponseInfo.proxyServer;
        }
        if ((i & 256) != 0) {
            d2 = urlResponseInfo.receivedByteCount;
        }
        if ((i & 512) != 0) {
            z = urlResponseInfo.wasCached;
        }
        boolean z2 = z;
        double d3 = d2;
        String str5 = str3;
        String str6 = str4;
        return urlResponseInfo.copy(str, d, str2, map, httpHeaderArr, strArr, str5, str6, d3, z2);
    }

    @JvmStatic
    private static final UrlResponseInfo fromCpp(String str, double d, String str2, Map<String, String> map, HttpHeader[] httpHeaderArr, String[] strArr, String str3, String str4, double d2, boolean z) {
        return INSTANCE.fromCpp(str, d, str2, map, httpHeaderArr, strArr, str3, str4, d2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getWasCached() {
        return this.wasCached;
    }

    /* renamed from: component2, reason: from getter */
    public final double getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHttpStatusText() {
        return this.httpStatusText;
    }

    public final Map<String, String> component4() {
        return this.allHeaders;
    }

    /* renamed from: component5, reason: from getter */
    public final HttpHeader[] getAllHeadersAsList() {
        return this.allHeadersAsList;
    }

    /* renamed from: component6, reason: from getter */
    public final String[] getUrlChain() {
        return this.urlChain;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNegotiatedProtocol() {
        return this.negotiatedProtocol;
    }

    /* renamed from: component8, reason: from getter */
    public final String getProxyServer() {
        return this.proxyServer;
    }

    /* renamed from: component9, reason: from getter */
    public final double getReceivedByteCount() {
        return this.receivedByteCount;
    }

    public final UrlResponseInfo copy(String url, double httpStatusCode, String httpStatusText, Map<String, String> allHeaders, HttpHeader[] allHeadersAsList, String[] urlChain, String negotiatedProtocol, String proxyServer, double receivedByteCount, boolean wasCached) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpStatusText, "httpStatusText");
        Intrinsics.checkNotNullParameter(allHeaders, "allHeaders");
        Intrinsics.checkNotNullParameter(allHeadersAsList, "allHeadersAsList");
        Intrinsics.checkNotNullParameter(urlChain, "urlChain");
        Intrinsics.checkNotNullParameter(negotiatedProtocol, "negotiatedProtocol");
        Intrinsics.checkNotNullParameter(proxyServer, "proxyServer");
        return new UrlResponseInfo(url, httpStatusCode, httpStatusText, allHeaders, allHeadersAsList, urlChain, negotiatedProtocol, proxyServer, receivedByteCount, wasCached);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlResponseInfo)) {
            return false;
        }
        UrlResponseInfo urlResponseInfo = (UrlResponseInfo) other;
        return Intrinsics.areEqual(this.url, urlResponseInfo.url) && Double.compare(this.httpStatusCode, urlResponseInfo.httpStatusCode) == 0 && Intrinsics.areEqual(this.httpStatusText, urlResponseInfo.httpStatusText) && Intrinsics.areEqual(this.allHeaders, urlResponseInfo.allHeaders) && Intrinsics.areEqual(this.allHeadersAsList, urlResponseInfo.allHeadersAsList) && Intrinsics.areEqual(this.urlChain, urlResponseInfo.urlChain) && Intrinsics.areEqual(this.negotiatedProtocol, urlResponseInfo.negotiatedProtocol) && Intrinsics.areEqual(this.proxyServer, urlResponseInfo.proxyServer) && Double.compare(this.receivedByteCount, urlResponseInfo.receivedByteCount) == 0 && this.wasCached == urlResponseInfo.wasCached;
    }

    public int hashCode() {
        return (((((((((((((((((this.url.hashCode() * 31) + Double.hashCode(this.httpStatusCode)) * 31) + this.httpStatusText.hashCode()) * 31) + this.allHeaders.hashCode()) * 31) + Arrays.hashCode(this.allHeadersAsList)) * 31) + Arrays.hashCode(this.urlChain)) * 31) + this.negotiatedProtocol.hashCode()) * 31) + this.proxyServer.hashCode()) * 31) + Double.hashCode(this.receivedByteCount)) * 31) + Boolean.hashCode(this.wasCached);
    }

    public String toString() {
        return "UrlResponseInfo(url=" + this.url + ", httpStatusCode=" + this.httpStatusCode + ", httpStatusText=" + this.httpStatusText + ", allHeaders=" + this.allHeaders + ", allHeadersAsList=" + Arrays.toString(this.allHeadersAsList) + ", urlChain=" + Arrays.toString(this.urlChain) + ", negotiatedProtocol=" + this.negotiatedProtocol + ", proxyServer=" + this.proxyServer + ", receivedByteCount=" + this.receivedByteCount + ", wasCached=" + this.wasCached + ")";
    }

    public UrlResponseInfo(String url, double d, String httpStatusText, Map<String, String> allHeaders, HttpHeader[] allHeadersAsList, String[] urlChain, String negotiatedProtocol, String proxyServer, double d2, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpStatusText, "httpStatusText");
        Intrinsics.checkNotNullParameter(allHeaders, "allHeaders");
        Intrinsics.checkNotNullParameter(allHeadersAsList, "allHeadersAsList");
        Intrinsics.checkNotNullParameter(urlChain, "urlChain");
        Intrinsics.checkNotNullParameter(negotiatedProtocol, "negotiatedProtocol");
        Intrinsics.checkNotNullParameter(proxyServer, "proxyServer");
        this.url = url;
        this.httpStatusCode = d;
        this.httpStatusText = httpStatusText;
        this.allHeaders = allHeaders;
        this.allHeadersAsList = allHeadersAsList;
        this.urlChain = urlChain;
        this.negotiatedProtocol = negotiatedProtocol;
        this.proxyServer = proxyServer;
        this.receivedByteCount = d2;
        this.wasCached = z;
    }

    public final String getUrl() {
        return this.url;
    }

    public final double getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public final String getHttpStatusText() {
        return this.httpStatusText;
    }

    public final Map<String, String> getAllHeaders() {
        return this.allHeaders;
    }

    public final HttpHeader[] getAllHeadersAsList() {
        return this.allHeadersAsList;
    }

    public final String[] getUrlChain() {
        return this.urlChain;
    }

    public final String getNegotiatedProtocol() {
        return this.negotiatedProtocol;
    }

    public final String getProxyServer() {
        return this.proxyServer;
    }

    public final double getReceivedByteCount() {
        return this.receivedByteCount;
    }

    public final boolean getWasCached() {
        return this.wasCached;
    }

    /* compiled from: UrlResponseInfo.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ju\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/nitrofetch/UrlResponseInfo$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "url", "", "httpStatusCode", "", "httpStatusText", "allHeaders", "", "allHeadersAsList", "", "Lcom/margelo/nitro/nitrofetch/HttpHeader;", "urlChain", "negotiatedProtocol", "proxyServer", "receivedByteCount", "wasCached", "", "(Ljava/lang/String;DLjava/lang/String;Ljava/util/Map;[Lcom/margelo/nitro/nitrofetch/HttpHeader;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZ)Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final UrlResponseInfo fromCpp(String url, double httpStatusCode, String httpStatusText, Map<String, String> allHeaders, HttpHeader[] allHeadersAsList, String[] urlChain, String negotiatedProtocol, String proxyServer, double receivedByteCount, boolean wasCached) {
            return new UrlResponseInfo(url, httpStatusCode, httpStatusText, allHeaders, allHeadersAsList, urlChain, negotiatedProtocol, proxyServer, receivedByteCount, wasCached);
        }
    }
}
