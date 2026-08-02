package com.margelo.nitro.nitrofetch;

import android.webkit.CookieManager;
import com.google.common.net.HttpHeaders;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: NitroCookieSync.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007J\u001b\u0010\u000b\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J0\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0017J\u001e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007J\u001e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroCookieSync;", "", "<init>", "()V", "LOG_TAG", "", "enabled", "", "enableCookieSync", "", "isCookieSyncEnabled", "hasCookieHeaderInNitroRequest", "headers", "", "Lcom/margelo/nitro/nitrofetch/NitroHeader;", "([Lcom/margelo/nitro/nitrofetch/NitroHeader;)Z", "hasCookieHeaderInJson", "reqHeaders", "Lorg/json/JSONObject;", "attachCookieFromManagerIfMissing", "url", "hasCookieHeader", "addHeader", "Lkotlin/Function2;", "storeSetCookieFromUrlResponseInfo", "responseUrl", "info", "Lorg/chromium/net/UrlResponseInfo;", "flush", "storeSetCookieFromHttpURLConnection", "urlStr", "conn", "Ljava/net/HttpURLConnection;", "flushCookieManager", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroCookieSync {
    public static final NitroCookieSync INSTANCE = new NitroCookieSync();
    private static final String LOG_TAG = "NitroCookieSync";
    private static volatile boolean enabled;

    private NitroCookieSync() {
    }

    @JvmStatic
    public static final void enableCookieSync() {
        enabled = true;
    }

    @JvmStatic
    public static final boolean isCookieSyncEnabled() {
        return enabled;
    }

    public final boolean hasCookieHeaderInJson(JSONObject reqHeaders) {
        if (reqHeaders == null) {
            return false;
        }
        Iterator<String> keys = reqHeaders.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        Iterator it = SequencesKt.asSequence(keys).iterator();
        while (it.hasNext()) {
            if (StringsKt.equals((String) it.next(), "Cookie", true)) {
                return true;
            }
        }
        return false;
    }

    public final void attachCookieFromManagerIfMissing(String url, boolean hasCookieHeader, Function2<? super String, ? super String, Unit> addHeader) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(addHeader, "addHeader");
        if (enabled && !hasCookieHeader) {
            try {
                String cookie = CookieManager.getInstance().getCookie(url);
                String str = cookie;
                if (str != null && str.length() != 0) {
                    addHeader.invoke("Cookie", cookie);
                }
            } catch (Exception e) {
                NitroLogger.INSTANCE.w(LOG_TAG, "Failed to attach cookie header", e);
            }
        }
    }

    public final boolean storeSetCookieFromUrlResponseInfo(String responseUrl, org.chromium.net.UrlResponseInfo info, boolean flush) {
        Intrinsics.checkNotNullParameter(responseUrl, "responseUrl");
        Intrinsics.checkNotNullParameter(info, "info");
        if (!enabled) {
            return false;
        }
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            List<Map.Entry<String, String>> allHeadersAsList = info.getAllHeadersAsList();
            Intrinsics.checkNotNullExpressionValue(allHeadersAsList, "getAllHeadersAsList(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : allHeadersAsList) {
                if (StringsKt.equals((String) ((Map.Entry) obj).getKey(), HttpHeaders.SET_COOKIE, true)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                return false;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                cookieManager.setCookie(responseUrl, (String) ((Map.Entry) it.next()).getValue());
            }
            if (flush) {
                cookieManager.flush();
            }
            return true;
        } catch (Exception e) {
            NitroLogger.INSTANCE.w(LOG_TAG, "Failed to store response cookies", e);
            return false;
        }
    }

    public final boolean storeSetCookieFromHttpURLConnection(String urlStr, HttpURLConnection conn, boolean flush) {
        boolean z;
        Intrinsics.checkNotNullParameter(urlStr, "urlStr");
        Intrinsics.checkNotNullParameter(conn, "conn");
        if (!enabled) {
            return false;
        }
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            Map<String, List<String>> headerFields = conn.getHeaderFields();
            if (headerFields != null) {
                z = false;
                for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                    String key = entry.getKey();
                    List<String> value = entry.getValue();
                    if (key != null && StringsKt.equals(key, HttpHeaders.SET_COOKIE, true)) {
                        Intrinsics.checkNotNull(value);
                        Iterator<T> it = value.iterator();
                        while (it.hasNext()) {
                            cookieManager.setCookie(urlStr, (String) it.next());
                            z = true;
                        }
                    }
                }
            } else {
                z = false;
            }
            if (z && flush) {
                cookieManager.flush();
            }
            return z;
        } catch (Exception e) {
            NitroLogger.INSTANCE.w(LOG_TAG, "Failed to store response cookies (HttpURLConnection)", e);
            return false;
        }
    }

    public final void flushCookieManager() {
        if (enabled) {
            try {
                CookieManager.getInstance().flush();
            } catch (Exception e) {
                NitroLogger.INSTANCE.w(LOG_TAG, "Failed to flush CookieManager", e);
            }
        }
    }

    public final boolean hasCookieHeaderInNitroRequest(NitroHeader[] headers) {
        if (headers != null) {
            for (NitroHeader nitroHeader : headers) {
                if (StringsKt.equals(nitroHeader.getKey(), "Cookie", true)) {
                    return true;
                }
            }
        }
        return false;
    }
}
