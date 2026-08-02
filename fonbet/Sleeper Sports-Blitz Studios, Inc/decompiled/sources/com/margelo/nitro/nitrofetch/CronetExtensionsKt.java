package com.margelo.nitro.nitrofetch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetException;

/* compiled from: CronetExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"toNitro", "Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "Lorg/chromium/net/UrlResponseInfo;", "Lcom/margelo/nitro/nitrofetch/RequestException;", "Lorg/chromium/net/CronetException;", "react-native-nitro-fetch_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CronetExtensionsKt {
    public static final UrlResponseInfo toNitro(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        Intrinsics.checkNotNullParameter(urlResponseInfo, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        List<Map.Entry<String, String>> allHeadersAsList = urlResponseInfo.getAllHeadersAsList();
        Intrinsics.checkNotNullExpressionValue(allHeadersAsList, "getAllHeadersAsList(...)");
        Iterator<T> it = allHeadersAsList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            arrayList.add(new HttpHeader((String) key, (String) value));
        }
        String url = urlResponseInfo.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        double httpStatusCode = urlResponseInfo.getHttpStatusCode();
        String httpStatusText = urlResponseInfo.getHttpStatusText();
        if (httpStatusText == null) {
            httpStatusText = "";
        }
        HttpHeader[] httpHeaderArr = (HttpHeader[]) arrayList.toArray(new HttpHeader[0]);
        List<String> urlChain = urlResponseInfo.getUrlChain();
        Intrinsics.checkNotNullExpressionValue(urlChain, "getUrlChain(...)");
        String[] strArr = (String[]) urlChain.toArray(new String[0]);
        String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
        Intrinsics.checkNotNullExpressionValue(negotiatedProtocol, "getNegotiatedProtocol(...)");
        String proxyServer = urlResponseInfo.getProxyServer();
        Intrinsics.checkNotNullExpressionValue(proxyServer, "getProxyServer(...)");
        return new UrlResponseInfo(url, httpStatusCode, httpStatusText, linkedHashMap, httpHeaderArr, strArr, negotiatedProtocol, proxyServer, urlResponseInfo.getReceivedByteCount(), urlResponseInfo.wasCached());
    }

    public static final RequestException toNitro(CronetException cronetException) {
        Intrinsics.checkNotNullParameter(cronetException, "<this>");
        String message = cronetException.getMessage();
        if (message == null) {
            message = "Unknown Cronet error";
        }
        return new RequestException(message);
    }
}
