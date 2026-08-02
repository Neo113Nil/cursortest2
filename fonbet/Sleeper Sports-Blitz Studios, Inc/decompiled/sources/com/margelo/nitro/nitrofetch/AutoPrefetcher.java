package com.margelo.nitro.nitrofetch;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.GraphRequest;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.device.yearclass.YearClass;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.common.net.HttpHeaders;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.turboimage.events.FailureEvent;
import io.sentry.protocol.App;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AutoPrefetcher.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001IB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J£\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u001e\b\u0002\u0010\u0016\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u008d\u0001\u0010%\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u001c\u0010\u0016\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010'J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020&2\b\b\u0002\u0010#\u001a\u00020$H\u0002J\u0010\u0010+\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010$2\u0006\u0010-\u001a\u00020&H\u0002J \u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u0010-\u001a\u00020&H\u0002J6\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020&2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u00103\u001a\u00020\u00072\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000705H\u0002J\u001a\u00106\u001a\u0004\u0018\u00010\u00072\u0006\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020\u0007H\u0002J \u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020&2\u0006\u00108\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0002J(\u0010<\u001a\u0004\u0018\u00010\u00072\b\u0010=\u001a\u0004\u0018\u00010\u00072\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0012H\u0002J2\u0010?\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u00172\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00172\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0012H\u0002J\u001c\u0010B\u001a\u00020&2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0012H\u0002J\u001e\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00122\b\u00107\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020$H\u0002J\u0012\u0010G\u001a\u00020$2\b\u0010H\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/margelo/nitro/nitrofetch/AutoPrefetcher;", "", "<init>", "()V", "initialized", "", "KEY_QUEUE", "", "KEY_TOKEN_REFRESH", "KEY_TOKEN_CACHE", "PREFS_NAME", "registerPrefetch", "", "context", "Landroid/content/Context;", "url", "prefetchKey", "headers", "", "method", "bodyString", "bodyBytesBase64", "bodyFormData", "", "timeoutMs", "", "followRedirects", "prefetchCacheTtlMs", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V", "prefetchOnStart", App.TYPE, "Landroid/app/Application;", "startPrefetches", "arr", "Lorg/json/JSONArray;", "tokens", "Lcom/margelo/nitro/nitrofetch/AutoPrefetcher$TokenRefreshResult;", "buildEntryJson", "Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)Lorg/json/JSONObject;", "buildNitroRequestFromEntry", "Lcom/margelo/nitro/nitrofetch/NitroRequest;", "entry", "logTokens", "callTokenRefreshSync", AnalyticsConstantsKt.KEY_CONFIG, "parseTokenResponse", "body", "responseType", "collectMappings", "json", "destKey", "into", "", "getNestedField", "obj", "dotPath", "setNestedField", "root", "value", "injectBodyFields", "rawBody", GraphRequest.FIELDS_PARAM, "injectFormFields", "Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;", "parts", "mapToJson", "map", "jsonToMap", "serializeCache", "result", "deserializeCache", "raw", "TokenRefreshResult", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoPrefetcher {
    public static final AutoPrefetcher INSTANCE = new AutoPrefetcher();
    private static final String KEY_QUEUE = "nitrofetch_autoprefetch_queue";
    private static final String KEY_TOKEN_CACHE = "nitro_token_refresh_fetch_cache";
    private static final String KEY_TOKEN_REFRESH = "nitro_token_refresh_fetch";
    private static final String PREFS_NAME = "nitro_fetch_storage";
    private static volatile boolean initialized;

    @JvmStatic
    public static final void registerPrefetch(Context context, String url, String prefetchKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefetchKey, "prefetchKey");
        registerPrefetch$default(context, url, prefetchKey, null, null, null, null, null, null, null, null, 2040, null);
    }

    @JvmStatic
    public static final void registerPrefetch(Context context, String url, String prefetchKey, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefetchKey, "prefetchKey");
        Intrinsics.checkNotNullParameter(headers, "headers");
        registerPrefetch$default(context, url, prefetchKey, headers, null, null, null, null, null, null, null, 2032, null);
    }

    @JvmStatic
    public static final void registerPrefetch(Context context, String url, String prefetchKey, Map<String, String> headers, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefetchKey, "prefetchKey");
        Intrinsics.checkNotNullParameter(headers, "headers");
        registerPrefetch$default(context, url, prefetchKey, headers, str, null, null, null, null, null, null, YearClass.CLASS_2016, null);
    }

    @JvmStatic
    public static final void registerPrefetch(Context context, String url, String prefetchKey, Map<String, String> headers, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefetchKey, "prefetchKey");
        Intrinsics.checkNotNullParameter(headers, "headers");
        registerPrefetch$default(context, url, prefetchKey, headers, str, str2, null, null, null, null, null, 1984, null);
    }

    @JvmStatic
    public static final void registerPrefetch(Context context, String url, String prefetchKey, Map<String, String> headers, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefetchKey, "prefetchKey");
        Intrinsics.checkNotNullParameter(headers, "headers");
        registerPrefetch$default(context, url, prefetchKey, headers, str, str2, str3, null, null, null, null, 1920, null);
    }

    @JvmStatic
    public static final void registerPrefetch(Context context, String url, String prefetchKey, Map<String, String> headers, String str, String str2, String str3, List<? extends Map<String, String>> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefetchKey, "prefetchKey");
        Intrinsics.checkNotNullParameter(headers, "headers");
        registerPrefetch$default(context, url, prefetchKey, headers, str, str2, str3, list, null, null, null, 1792, null);
    }

    @JvmStatic
    public static final void registerPrefetch(Context context, String url, String prefetchKey, Map<String, String> headers, String str, String str2, String str3, List<? extends Map<String, String>> list, Double d) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefetchKey, "prefetchKey");
        Intrinsics.checkNotNullParameter(headers, "headers");
        registerPrefetch$default(context, url, prefetchKey, headers, str, str2, str3, list, d, null, null, 1536, null);
    }

    @JvmStatic
    public static final void registerPrefetch(Context context, String url, String prefetchKey, Map<String, String> headers, String str, String str2, String str3, List<? extends Map<String, String>> list, Double d, Boolean bool) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefetchKey, "prefetchKey");
        Intrinsics.checkNotNullParameter(headers, "headers");
        registerPrefetch$default(context, url, prefetchKey, headers, str, str2, str3, list, d, bool, null, 1024, null);
    }

    private AutoPrefetcher() {
    }

    public static /* synthetic */ void registerPrefetch$default(Context context, String str, String str2, Map map, String str3, String str4, String str5, List list, Double d, Boolean bool, Double d2, int i, Object obj) {
        Double d3;
        Context context2;
        String str6;
        String str7;
        Map emptyMap = (i & 8) != 0 ? MapsKt.emptyMap() : map;
        String str8 = (i & 16) != 0 ? null : str3;
        String str9 = (i & 32) != 0 ? null : str4;
        String str10 = (i & 64) != 0 ? null : str5;
        List list2 = (i & 128) != 0 ? null : list;
        Double d4 = (i & 256) != 0 ? null : d;
        Boolean bool2 = (i & 512) != 0 ? null : bool;
        if ((i & 1024) != 0) {
            d3 = null;
            str6 = str;
            str7 = str2;
            context2 = context;
        } else {
            d3 = d2;
            context2 = context;
            str6 = str;
            str7 = str2;
        }
        registerPrefetch(context2, str6, str7, emptyMap, str8, str9, str10, list2, d4, bool2, d3);
    }

    @JvmStatic
    public static final void registerPrefetch(Context context, String url, String prefetchKey, Map<String, String> headers, String method, String bodyString, String bodyBytesBase64, List<? extends Map<String, String>> bodyFormData, Double timeoutMs, Boolean followRedirects, Double prefetchCacheTtlMs) {
        JSONArray jSONArray;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prefetchKey, "prefetchKey");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (url.length() == 0 || prefetchKey.length() == 0) {
            return;
        }
        JSONObject buildEntryJson = INSTANCE.buildEntryJson(url, prefetchKey, headers, method, bodyString, bodyBytesBase64, bodyFormData, timeoutMs, followRedirects, prefetchCacheTtlMs);
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("nitro_fetch_storage", 0);
            String string = sharedPreferences.getString(KEY_QUEUE, null);
            if (string == null) {
                string = "";
            }
            if (string.length() == 0) {
                jSONArray = new JSONArray();
            } else {
                try {
                    jSONArray = new JSONArray(string);
                } catch (Throwable unused) {
                    jSONArray = new JSONArray();
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && !Intrinsics.areEqual(optJSONObject.optString("prefetchKey", ""), prefetchKey)) {
                    jSONArray2.put(optJSONObject);
                }
            }
            jSONArray2.put(buildEntryJson);
            sharedPreferences.edit().putString(KEY_QUEUE, jSONArray2.toString()).apply();
        } catch (Throwable unused2) {
        }
        if (initialized) {
            try {
                SharedPreferences sharedPreferences2 = context.getApplicationContext().getSharedPreferences("nitro_fetch_storage", 0);
                AutoPrefetcher autoPrefetcher = INSTANCE;
                NitroFetchSecureAtRest nitroFetchSecureAtRest = NitroFetchSecureAtRest.INSTANCE;
                Intrinsics.checkNotNull(sharedPreferences2);
                TokenRefreshResult deserializeCache = autoPrefetcher.deserializeCache(nitroFetchSecureAtRest.getDecryptedForPrefs(sharedPreferences2, KEY_TOKEN_CACHE));
                JSONArray jSONArray3 = new JSONArray();
                jSONArray3.put(buildEntryJson);
                autoPrefetcher.startPrefetches(jSONArray3, deserializeCache);
            } catch (Throwable unused3) {
            }
        }
    }

    public final void prefetchOnStart(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        if (initialized) {
            return;
        }
        initialized = true;
        try {
            final SharedPreferences sharedPreferences = app.getSharedPreferences("nitro_fetch_storage", 0);
            String string = sharedPreferences.getString(KEY_QUEUE, null);
            if (string == null) {
                string = "";
            }
            if (string.length() == 0) {
                return;
            }
            final JSONArray jSONArray = new JSONArray(string);
            NitroFetchSecureAtRest nitroFetchSecureAtRest = NitroFetchSecureAtRest.INSTANCE;
            Intrinsics.checkNotNull(sharedPreferences);
            final String decryptedForPrefs = nitroFetchSecureAtRest.getDecryptedForPrefs(sharedPreferences, KEY_TOKEN_REFRESH);
            String str = decryptedForPrefs;
            if (str != null && str.length() != 0) {
                new Thread(new Runnable() { // from class: com.margelo.nitro.nitrofetch.AutoPrefetcher$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        AutoPrefetcher.prefetchOnStart$lambda$1(decryptedForPrefs, sharedPreferences, jSONArray);
                    }
                }).start();
                return;
            }
            startPrefetches(jSONArray, TokenRefreshResult.INSTANCE.getEMPTY());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prefetchOnStart$lambda$1(String str, SharedPreferences sharedPreferences, JSONArray jSONArray) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(FailureEvent.EVENT_NAME, "useStoredHeaders");
            String optString2 = jSONObject.optString("url", "(unknown)");
            NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh] Calling refresh endpoint: " + optString2);
            AutoPrefetcher autoPrefetcher = INSTANCE;
            TokenRefreshResult callTokenRefreshSync = autoPrefetcher.callTokenRefreshSync(jSONObject);
            if (callTokenRefreshSync != null) {
                NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh] ✅ Success — got " + callTokenRefreshSync.getHeaders().size() + " header(s), " + callTokenRefreshSync.getBodyFields().size() + " body field(s), " + callTokenRefreshSync.getFormFields().size() + " form field(s)");
                autoPrefetcher.logTokens(callTokenRefreshSync);
                NitroFetchSecureAtRest nitroFetchSecureAtRest = NitroFetchSecureAtRest.INSTANCE;
                Intrinsics.checkNotNull(sharedPreferences);
                nitroFetchSecureAtRest.putEncrypted(sharedPreferences, KEY_TOKEN_CACHE, autoPrefetcher.serializeCache(callTokenRefreshSync));
            } else {
                NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh] ❌ Refresh failed — onFailure: " + optString);
                if (Intrinsics.areEqual(optString, "skip")) {
                    NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh] Skipping all prefetches");
                    return;
                }
                NitroFetchSecureAtRest nitroFetchSecureAtRest2 = NitroFetchSecureAtRest.INSTANCE;
                Intrinsics.checkNotNull(sharedPreferences);
                callTokenRefreshSync = autoPrefetcher.deserializeCache(nitroFetchSecureAtRest2.getDecryptedForPrefs(sharedPreferences, KEY_TOKEN_CACHE));
                NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh] Using cached tokens (" + callTokenRefreshSync.getHeaders().size() + " header(s), " + callTokenRefreshSync.getBodyFields().size() + " body field(s), " + callTokenRefreshSync.getFormFields().size() + " form field(s))");
            }
            NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh] Injecting tokens into " + jSONArray.length() + " prefetch URL(s)");
            autoPrefetcher.startPrefetches(jSONArray, callTokenRefreshSync);
        } catch (Throwable unused) {
        }
    }

    private final void startPrefetches(JSONArray arr, TokenRefreshResult tokens) {
        String optString;
        final String optString2;
        int length = arr.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = arr.optJSONObject(i);
            if (optJSONObject != null && (optString = optJSONObject.optString("url", null)) != null && (optString2 = optJSONObject.optString("prefetchKey", null)) != null) {
                NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh] Prefetching " + optString);
                logTokens(tokens);
                NitroRequest buildNitroRequestFromEntry = buildNitroRequestFromEntry(optJSONObject, tokens);
                if (FetchCache.INSTANCE.getPending(optString2) == null) {
                    if (!FetchCache.INSTANCE.hasFreshResult(optString2, (!optJSONObject.has("prefetchCacheTtlMs") || optJSONObject.isNull("prefetchCacheTtlMs")) ? 5000L : (long) optJSONObject.optDouble("prefetchCacheTtlMs"))) {
                        final CompletableFuture<NitroResponse> completableFuture = new CompletableFuture<>();
                        FetchCache.INSTANCE.setPending(optString2, completableFuture);
                        NitroFetchClient.INSTANCE.fetch(buildNitroRequestFromEntry, new Function1() { // from class: com.margelo.nitro.nitrofetch.AutoPrefetcher$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit startPrefetches$lambda$2;
                                startPrefetches$lambda$2 = AutoPrefetcher.startPrefetches$lambda$2(optString2, completableFuture, (NitroResponse) obj);
                                return startPrefetches$lambda$2;
                            }
                        }, new Function1() { // from class: com.margelo.nitro.nitrofetch.AutoPrefetcher$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit startPrefetches$lambda$3;
                                startPrefetches$lambda$3 = AutoPrefetcher.startPrefetches$lambda$3(optString2, completableFuture, (Throwable) obj);
                                return startPrefetches$lambda$3;
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startPrefetches$lambda$2(String str, CompletableFuture completableFuture, NitroResponse res) {
        Intrinsics.checkNotNullParameter(res, "res");
        try {
            FetchCache.INSTANCE.complete(str, res);
            completableFuture.complete(res);
        } catch (Throwable th) {
            FetchCache.INSTANCE.completeExceptionally(str, th);
            completableFuture.completeExceptionally(th);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startPrefetches$lambda$3(String str, CompletableFuture completableFuture, Throwable err) {
        Intrinsics.checkNotNullParameter(err, "err");
        FetchCache.INSTANCE.completeExceptionally(str, err);
        completableFuture.completeExceptionally(err);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject buildEntryJson(String url, String prefetchKey, Map<String, String> headers, String method, String bodyString, String bodyBytesBase64, List<? extends Map<String, String>> bodyFormData, Double timeoutMs, Boolean followRedirects, Double prefetchCacheTtlMs) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", url);
        jSONObject2.put("prefetchKey", prefetchKey);
        jSONObject2.put("headers", jSONObject);
        if (method != null && method.length() > 0 && !Intrinsics.areEqual(method, "GET")) {
            jSONObject2.put("method", method);
        }
        if (bodyString != null) {
            jSONObject2.put("bodyString", bodyString);
        }
        if (bodyBytesBase64 != null) {
            jSONObject2.put("bodyBytesBase64", bodyBytesBase64);
        }
        List<? extends Map<String, String>> list = bodyFormData;
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = bodyFormData.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                JSONObject jSONObject3 = new JSONObject();
                String str = (String) map.get("name");
                if (str != null) {
                    jSONObject3.put("name", str);
                }
                String str2 = (String) map.get("value");
                if (str2 != null) {
                    jSONObject3.put("value", str2);
                }
                String str3 = (String) map.get("fileUri");
                if (str3 != null) {
                    jSONObject3.put("fileUri", str3);
                }
                String str4 = (String) map.get("fileName");
                if (str4 != null) {
                    jSONObject3.put("fileName", str4);
                }
                String str5 = (String) map.get("mimeType");
                if (str5 != null) {
                    jSONObject3.put("mimeType", str5);
                }
                jSONArray.put(jSONObject3);
            }
            jSONObject2.put("bodyFormData", jSONArray);
        }
        if (timeoutMs != null) {
            jSONObject2.put("timeoutMs", timeoutMs.doubleValue());
        }
        if (Intrinsics.areEqual((Object) followRedirects, (Object) false)) {
            jSONObject2.put("followRedirects", false);
        }
        if (prefetchCacheTtlMs != null) {
            jSONObject2.put("prefetchCacheTtlMs", prefetchCacheTtlMs.doubleValue());
        }
        return jSONObject2;
    }

    static /* synthetic */ NitroRequest buildNitroRequestFromEntry$default(AutoPrefetcher autoPrefetcher, JSONObject jSONObject, TokenRefreshResult tokenRefreshResult, int i, Object obj) {
        if ((i & 2) != 0) {
            tokenRefreshResult = TokenRefreshResult.INSTANCE.getEMPTY();
        }
        return autoPrefetcher.buildNitroRequestFromEntry(jSONObject, tokenRefreshResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final NitroRequest buildNitroRequestFromEntry(JSONObject entry, TokenRefreshResult tokens) {
        Object m13470constructorimpl;
        NitroRequestMethod nitroRequestMethod;
        NitroRequestCredentials nitroRequestCredentials;
        JSONArray optJSONArray;
        String str;
        ArrayList emptyList;
        NitroRequestCredentials nitroRequestCredentials2;
        String optString = entry.optString("url", "");
        String optString2 = entry.optString("prefetchKey", "");
        final JSONObject optJSONObject = entry.optJSONObject("headers");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = optJSONObject.keys();
        final Function1 function1 = new Function1() { // from class: com.margelo.nitro.nitrofetch.AutoPrefetcher$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit buildNitroRequestFromEntry$lambda$12;
                buildNitroRequestFromEntry$lambda$12 = AutoPrefetcher.buildNitroRequestFromEntry$lambda$12(linkedHashMap, optJSONObject, (String) obj);
                return buildNitroRequestFromEntry$lambda$12;
            }
        };
        keys.forEachRemaining(new Consumer() { // from class: com.margelo.nitro.nitrofetch.AutoPrefetcher$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Function1.this.invoke(obj);
            }
        });
        for (Map.Entry<String, String> entry2 : tokens.getHeaders().entrySet()) {
            linkedHashMap.put(entry2.getKey(), entry2.getValue());
        }
        linkedHashMap.put("prefetchKey", optString2);
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            arrayList.add(new NitroHeader((String) entry3.getKey(), (String) entry3.getValue()));
        }
        NitroHeader[] nitroHeaderArr = (NitroHeader[]) arrayList.toArray(new NitroHeader[0]);
        String optString3 = entry.optString("method", "");
        Intrinsics.checkNotNull(optString3);
        if (optString3.length() <= 0) {
            optString3 = null;
        }
        if (optString3 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(NitroRequestMethod.valueOf(optString3));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            nitroRequestMethod = (NitroRequestMethod) m13470constructorimpl;
        } else {
            nitroRequestMethod = null;
        }
        JSONObject jSONObject = (!entry.has("bodyString") || entry.isNull("bodyString")) ? null : entry;
        String injectBodyFields = injectBodyFields(jSONObject != null ? jSONObject.optString("bodyString") : null, tokens.getBodyFields());
        JSONObject jSONObject2 = (!entry.has("bodyBytesBase64") || entry.isNull("bodyBytesBase64")) ? null : entry;
        String optString4 = jSONObject2 != null ? jSONObject2.optString("bodyBytesBase64") : null;
        JSONObject jSONObject3 = (!entry.has("timeoutMs") || entry.isNull("timeoutMs")) ? null : entry;
        Double valueOf = jSONObject3 != null ? Double.valueOf(jSONObject3.optDouble("timeoutMs")) : null;
        JSONObject jSONObject4 = (!entry.has("followRedirects") || entry.isNull("followRedirects")) ? null : entry;
        Boolean valueOf2 = jSONObject4 != null ? Boolean.valueOf(jSONObject4.optBoolean("followRedirects")) : null;
        String optString5 = entry != null ? entry.optString("credentials", "") : null;
        if (optString5 != null) {
            int hashCode = optString5.hashCode();
            if (hashCode != -1612432787) {
                if (hashCode != 3414921) {
                    if (hashCode == 1942574248 && optString5.equals("include")) {
                        nitroRequestCredentials2 = NitroRequestCredentials.INCLUDE;
                        nitroRequestCredentials = nitroRequestCredentials2;
                    }
                } else if (optString5.equals("omit")) {
                    nitroRequestCredentials2 = NitroRequestCredentials.OMIT;
                    nitroRequestCredentials = nitroRequestCredentials2;
                }
            } else if (optString5.equals(HttpHeaders.ReferrerPolicyValues.SAME_ORIGIN)) {
                nitroRequestCredentials2 = NitroRequestCredentials.SAME_ORIGIN;
                nitroRequestCredentials = nitroRequestCredentials2;
            }
            JSONObject jSONObject5 = (entry.has("prefetchCacheTtlMs") || entry.isNull("prefetchCacheTtlMs")) ? null : entry;
            Double valueOf3 = jSONObject5 == null ? Double.valueOf(jSONObject5.optDouble("prefetchCacheTtlMs")) : null;
            optJSONArray = entry.optJSONArray("bodyFormData");
            if (optJSONArray == null) {
                int length = optJSONArray.length();
                ArrayList arrayList2 = new ArrayList(length);
                int i = 0;
                while (i < length) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 == null) {
                        optJSONObject2 = new JSONObject();
                    }
                    JSONObject jSONObject6 = optJSONObject2;
                    String str2 = injectBodyFields;
                    String optString6 = jSONObject6.optString("name", "");
                    JSONArray jSONArray = optJSONArray;
                    Intrinsics.checkNotNullExpressionValue(optString6, "optString(...)");
                    arrayList2.add(new NitroFormDataPart(optString6, (!jSONObject6.has("value") || jSONObject6.isNull("value")) ? null : jSONObject6.optString("value"), (!jSONObject6.has("fileUri") || jSONObject6.isNull("fileUri")) ? null : jSONObject6.optString("fileUri"), (!jSONObject6.has("fileName") || jSONObject6.isNull("fileName")) ? null : jSONObject6.optString("fileName"), (!jSONObject6.has("mimeType") || jSONObject6.isNull("mimeType")) ? null : jSONObject6.optString("mimeType")));
                    i++;
                    optJSONArray = jSONArray;
                    injectBodyFields = str2;
                }
                str = injectBodyFields;
                emptyList = arrayList2;
            } else {
                str = injectBodyFields;
                emptyList = CollectionsKt.emptyList();
            }
            List<NitroFormDataPart> injectFormFields = injectFormFields(emptyList, tokens.getFormFields());
            NitroFormDataPart[] nitroFormDataPartArr = injectFormFields == null ? (NitroFormDataPart[]) injectFormFields.toArray(new NitroFormDataPart[0]) : null;
            Intrinsics.checkNotNull(optString);
            return new NitroRequest(optString, nitroRequestMethod, nitroHeaderArr, str, null, optString4, nitroFormDataPartArr, valueOf, valueOf2, nitroRequestCredentials, valueOf3, null);
        }
        nitroRequestCredentials = null;
        if (entry.has("prefetchCacheTtlMs")) {
        }
        if (jSONObject5 == null) {
        }
        optJSONArray = entry.optJSONArray("bodyFormData");
        if (optJSONArray == null) {
        }
        List<NitroFormDataPart> injectFormFields2 = injectFormFields(emptyList, tokens.getFormFields());
        if (injectFormFields2 == null) {
        }
        Intrinsics.checkNotNull(optString);
        return new NitroRequest(optString, nitroRequestMethod, nitroHeaderArr, str, null, optString4, nitroFormDataPartArr, valueOf, valueOf2, nitroRequestCredentials, valueOf3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildNitroRequestFromEntry$lambda$12(Map map, JSONObject jSONObject, String str) {
        map.put(str, jSONObject.optString(str, ""));
        return Unit.INSTANCE;
    }

    private final void logTokens(TokenRefreshResult tokens) {
        if (!tokens.getHeaders().isEmpty()) {
            NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh]   headers:");
            for (Map.Entry<String, String> entry : tokens.getHeaders().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh]     " + key + ": " + value);
            }
        }
        if (!tokens.getBodyFields().isEmpty()) {
            NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh]   body fields:");
            for (Map.Entry<String, String> entry2 : tokens.getBodyFields().entrySet()) {
                String key2 = entry2.getKey();
                String value2 = entry2.getValue();
                NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh]     " + key2 + ": " + value2);
            }
        }
        if (tokens.getFormFields().isEmpty()) {
            return;
        }
        NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh]   form fields:");
        for (Map.Entry<String, String> entry3 : tokens.getFormFields().entrySet()) {
            String key3 = entry3.getKey();
            String value3 = entry3.getValue();
            NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh]     " + key3 + ": " + value3);
        }
    }

    /* compiled from: AutoPrefetcher.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BC\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JK\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/margelo/nitro/nitrofetch/AutoPrefetcher$TokenRefreshResult;", "", "headers", "", "", "bodyFields", "formFields", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getHeaders", "()Ljava/util/Map;", "getBodyFields", "getFormFields", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class TokenRefreshResult {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final TokenRefreshResult EMPTY = new TokenRefreshResult(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap());
        private final Map<String, String> bodyFields;
        private final Map<String, String> formFields;
        private final Map<String, String> headers;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TokenRefreshResult copy$default(TokenRefreshResult tokenRefreshResult, Map map, Map map2, Map map3, int i, Object obj) {
            if ((i & 1) != 0) {
                map = tokenRefreshResult.headers;
            }
            if ((i & 2) != 0) {
                map2 = tokenRefreshResult.bodyFields;
            }
            if ((i & 4) != 0) {
                map3 = tokenRefreshResult.formFields;
            }
            return tokenRefreshResult.copy(map, map2, map3);
        }

        public final Map<String, String> component1() {
            return this.headers;
        }

        public final Map<String, String> component2() {
            return this.bodyFields;
        }

        public final Map<String, String> component3() {
            return this.formFields;
        }

        public final TokenRefreshResult copy(Map<String, String> headers, Map<String, String> bodyFields, Map<String, String> formFields) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(bodyFields, "bodyFields");
            Intrinsics.checkNotNullParameter(formFields, "formFields");
            return new TokenRefreshResult(headers, bodyFields, formFields);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenRefreshResult)) {
                return false;
            }
            TokenRefreshResult tokenRefreshResult = (TokenRefreshResult) other;
            return Intrinsics.areEqual(this.headers, tokenRefreshResult.headers) && Intrinsics.areEqual(this.bodyFields, tokenRefreshResult.bodyFields) && Intrinsics.areEqual(this.formFields, tokenRefreshResult.formFields);
        }

        public int hashCode() {
            return (((this.headers.hashCode() * 31) + this.bodyFields.hashCode()) * 31) + this.formFields.hashCode();
        }

        public String toString() {
            return "TokenRefreshResult(headers=" + this.headers + ", bodyFields=" + this.bodyFields + ", formFields=" + this.formFields + ")";
        }

        public TokenRefreshResult(Map<String, String> headers, Map<String, String> bodyFields, Map<String, String> formFields) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(bodyFields, "bodyFields");
            Intrinsics.checkNotNullParameter(formFields, "formFields");
            this.headers = headers;
            this.bodyFields = bodyFields;
            this.formFields = formFields;
        }

        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public final Map<String, String> getBodyFields() {
            return this.bodyFields;
        }

        public final Map<String, String> getFormFields() {
            return this.formFields;
        }

        /* compiled from: AutoPrefetcher.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/nitrofetch/AutoPrefetcher$TokenRefreshResult$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/margelo/nitro/nitrofetch/AutoPrefetcher$TokenRefreshResult;", "getEMPTY", "()Lcom/margelo/nitro/nitrofetch/AutoPrefetcher$TokenRefreshResult;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final TokenRefreshResult getEMPTY() {
                return TokenRefreshResult.EMPTY;
            }
        }
    }

    private final TokenRefreshResult callTokenRefreshSync(JSONObject config) {
        String optString;
        InputStream inputStream;
        Iterator<String> keys;
        try {
            optString = config.optString("url", null);
        } catch (Throwable unused) {
        }
        if (optString == null) {
            return null;
        }
        String optString2 = config.optString("method", "POST");
        final JSONObject optJSONObject = config.optJSONObject("headers");
        String optString3 = config.optString("body", null);
        String optString4 = config.optString("responseType", "json");
        URLConnection openConnection = new URL(optString).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        final HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(optString2);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoInput(true);
        if (optString3 != null) {
            httpURLConnection.setDoOutput(true);
        }
        if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
            final Function1 function1 = new Function1() { // from class: com.margelo.nitro.nitrofetch.AutoPrefetcher$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit callTokenRefreshSync$lambda$29;
                    callTokenRefreshSync$lambda$29 = AutoPrefetcher.callTokenRefreshSync$lambda$29(httpURLConnection, optJSONObject, (String) obj);
                    return callTokenRefreshSync$lambda$29;
                }
            };
            keys.forEachRemaining(new Consumer() { // from class: com.margelo.nitro.nitrofetch.AutoPrefetcher$$ExternalSyntheticLambda3
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Function1.this.invoke(obj);
                }
            });
        }
        NitroCookieSync.INSTANCE.attachCookieFromManagerIfMissing(optString, NitroCookieSync.INSTANCE.hasCookieHeaderInJson(optJSONObject), new Function2() { // from class: com.margelo.nitro.nitrofetch.AutoPrefetcher$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit callTokenRefreshSync$lambda$31;
                callTokenRefreshSync$lambda$31 = AutoPrefetcher.callTokenRefreshSync$lambda$31(httpURLConnection, (String) obj, (String) obj2);
                return callTokenRefreshSync$lambda$31;
            }
        });
        if (optString3 != null) {
            inputStream = httpURLConnection.getOutputStream();
            try {
                byte[] bytes = optString3.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                inputStream.write(bytes);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStream, null);
            } finally {
            }
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (200 > responseCode || responseCode >= 300) {
            NitroLogger.INSTANCE.d("NitroFetch", "[TokenRefresh] Refresh endpoint returned HTTP " + responseCode);
            return null;
        }
        NitroCookieSync nitroCookieSync = NitroCookieSync.INSTANCE;
        String url = httpURLConnection.getURL().toString();
        Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
        nitroCookieSync.storeSetCookieFromHttpURLConnection(url, httpURLConnection, true);
        inputStream = httpURLConnection.getInputStream();
        try {
            InputStream inputStream2 = inputStream;
            Intrinsics.checkNotNull(inputStream2);
            Reader inputStreamReader = new InputStreamReader(inputStream2, Charsets.UTF_8);
            String readText = TextStreamsKt.readText(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
            CloseableKt.closeFinally(inputStream, null);
            Intrinsics.checkNotNull(optString4);
            return parseTokenResponse(readText, optString4, config);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit callTokenRefreshSync$lambda$29(HttpURLConnection httpURLConnection, JSONObject jSONObject, String str) {
        httpURLConnection.setRequestProperty(str, jSONObject.optString(str, ""));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit callTokenRefreshSync$lambda$31(HttpURLConnection httpURLConnection, String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        httpURLConnection.setRequestProperty(key, value);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r12 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final TokenRefreshResult parseTokenResponse(String body, String responseType, JSONObject config) {
        String optString;
        ?? optString2;
        final JSONObject optJSONObject;
        String str;
        String str2;
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> linkedHashMap2 = new LinkedHashMap<>();
        Map<String, String> linkedHashMap3 = new LinkedHashMap<>();
        if (Intrinsics.areEqual(responseType, "text")) {
            String optString3 = config.optString("textHeader", null);
            if (optString3 != null) {
                String optString4 = config.optString("textTemplate", null);
                if (optString4 != null) {
                    str = body;
                    str2 = StringsKt.replace$default(optString4, "{{value}}", str, false, 4, (Object) null);
                } else {
                    str = body;
                }
                str2 = str;
                linkedHashMap.put(optString3, str2);
            } else {
                str = body;
            }
            String optString5 = config.optString("bodyTextPath", null);
            if (optString5 != null) {
                linkedHashMap2.put(optString5, str);
            }
            String optString6 = config.optString("formDataTextField", null);
            if (optString6 != null) {
                linkedHashMap3.put(optString6, str);
            }
            return new TokenRefreshResult(linkedHashMap, linkedHashMap2, linkedHashMap3);
        }
        try {
            final JSONObject jSONObject = new JSONObject(body);
            collectMappings(jSONObject, config.optJSONArray("mappings"), "header", linkedHashMap);
            collectMappings(jSONObject, config.optJSONArray("bodyMappings"), "bodyPath", linkedHashMap2);
            collectMappings(jSONObject, config.optJSONArray("formDataMappings"), "field", linkedHashMap3);
            JSONArray optJSONArray = config.optJSONArray("compositeHeaders");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null && (optString = optJSONObject2.optString("header", null)) != null && (optString2 = optJSONObject2.optString(SDKConstants.PARAM_UPDATE_TEMPLATE, null)) != 0 && (optJSONObject = optJSONObject2.optJSONObject("paths")) != null) {
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = optString2;
                        Iterator<String> keys = optJSONObject.keys();
                        final Function1 function1 = new Function1() { // from class: com.margelo.nitro.nitrofetch.AutoPrefetcher$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit parseTokenResponse$lambda$36;
                                parseTokenResponse$lambda$36 = AutoPrefetcher.parseTokenResponse$lambda$36(jSONObject, optJSONObject, objectRef, (String) obj);
                                return parseTokenResponse$lambda$36;
                            }
                        };
                        keys.forEachRemaining(new Consumer() { // from class: com.margelo.nitro.nitrofetch.AutoPrefetcher$$ExternalSyntheticLambda6
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                Function1.this.invoke(obj);
                            }
                        });
                        linkedHashMap.put(optString, objectRef.element);
                    }
                }
            }
            return new TokenRefreshResult(linkedHashMap, linkedHashMap2, linkedHashMap3);
        } catch (Throwable unused) {
            return new TokenRefreshResult(linkedHashMap, linkedHashMap2, linkedHashMap3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.String] */
    public static final Unit parseTokenResponse$lambda$36(JSONObject jSONObject, JSONObject jSONObject2, Ref.ObjectRef objectRef, String str) {
        AutoPrefetcher autoPrefetcher = INSTANCE;
        String optString = jSONObject2.optString(str, "");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String nestedField = autoPrefetcher.getNestedField(jSONObject, optString);
        objectRef.element = StringsKt.replace$default((String) objectRef.element, "{{" + str + "}}", nestedField == null ? "" : nestedField, false, 4, (Object) null);
        return Unit.INSTANCE;
    }

    private final void collectMappings(JSONObject json, JSONArray arr, String destKey, Map<String, String> into) {
        String optString;
        String nestedField;
        String replace$default;
        if (arr != null) {
            int length = arr.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = arr.optJSONObject(i);
                if (optJSONObject != null && (optString = optJSONObject.optString("jsonPath", null)) != null) {
                    String optString2 = optJSONObject.optString(destKey, null);
                    if (optString2 != null && (nestedField = getNestedField(json, optString)) != null) {
                        String optString3 = optJSONObject.optString("valueTemplate", null);
                        if (optString3 != null && (replace$default = StringsKt.replace$default(optString3, "{{value}}", nestedField, false, 4, (Object) null)) != null) {
                            nestedField = replace$default;
                        }
                        into.put(optString2, nestedField);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    private final String getNestedField(JSONObject obj, String dotPath) {
        for (String str : StringsKt.split$default((CharSequence) dotPath, new String[]{"."}, false, 0, 6, (Object) null)) {
            if (!(obj instanceof JSONObject) || (obj = ((JSONObject) obj).opt(str)) == 0) {
                return null;
            }
        }
        return obj.toString();
    }

    private final void setNestedField(JSONObject root, String dotPath, String value) {
        List split$default = StringsKt.split$default((CharSequence) dotPath, new String[]{"."}, false, 0, 6, (Object) null);
        int size = split$default.size() - 1;
        for (int i = 0; i < size; i++) {
            String str = (String) split$default.get(i);
            JSONObject optJSONObject = root.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                root.put(str, optJSONObject);
            }
            root = optJSONObject;
        }
        root.put((String) CollectionsKt.last(split$default), value);
    }

    private final String injectBodyFields(String rawBody, Map<String, String> fields) {
        String str;
        if (fields.isEmpty() || (str = rawBody) == null || str.length() == 0) {
            return rawBody;
        }
        try {
            JSONObject jSONObject = new JSONObject(rawBody);
            for (Map.Entry<String, String> entry : fields.entrySet()) {
                INSTANCE.setNestedField(jSONObject, entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return rawBody;
        }
    }

    private final List<NitroFormDataPart> injectFormFields(List<NitroFormDataPart> parts, Map<String, String> fields) {
        if (fields.isEmpty()) {
            List<NitroFormDataPart> list = parts;
            return list.isEmpty() ? null : list;
        }
        if (parts.isEmpty()) {
            return null;
        }
        List<NitroFormDataPart> mutableList = CollectionsKt.toMutableList((Collection) parts);
        for (Map.Entry<String, String> entry : fields.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Iterator<NitroFormDataPart> it = mutableList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().getName(), key)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                NitroFormDataPart nitroFormDataPart = mutableList.get(i);
                mutableList.set(i, new NitroFormDataPart(nitroFormDataPart.getName(), value, null, nitroFormDataPart.getFileName(), nitroFormDataPart.getMimeType()));
            } else {
                mutableList.add(new NitroFormDataPart(key, value, null, null, null));
            }
        }
        return mutableList;
    }

    private final JSONObject mapToJson(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    private final Map<String, String> jsonToMap(JSONObject obj) {
        if (obj == null) {
            return MapsKt.emptyMap();
        }
        Iterator<String> keys = obj.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        Sequence asSequence = SequencesKt.asSequence(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : asSequence) {
            linkedHashMap.put(obj2, obj.optString((String) obj2, ""));
        }
        return linkedHashMap;
    }

    private final String serializeCache(TokenRefreshResult result) {
        JSONObject jSONObject = new JSONObject();
        AutoPrefetcher autoPrefetcher = INSTANCE;
        jSONObject.put("headers", autoPrefetcher.mapToJson(result.getHeaders()));
        jSONObject.put("bodyFields", autoPrefetcher.mapToJson(result.getBodyFields()));
        jSONObject.put("formFields", autoPrefetcher.mapToJson(result.getFormFields()));
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    private final TokenRefreshResult deserializeCache(String raw) {
        String str = raw;
        if (str == null || str.length() == 0) {
            return TokenRefreshResult.INSTANCE.getEMPTY();
        }
        try {
            JSONObject jSONObject = new JSONObject(raw);
            if (!jSONObject.has("headers") && !jSONObject.has("bodyFields") && !jSONObject.has("formFields")) {
                return new TokenRefreshResult(jsonToMap(jSONObject), MapsKt.emptyMap(), MapsKt.emptyMap());
            }
            return new TokenRefreshResult(jsonToMap(jSONObject.optJSONObject("headers")), jsonToMap(jSONObject.optJSONObject("bodyFields")), jsonToMap(jSONObject.optJSONObject("formFields")));
        } catch (Throwable unused) {
            return TokenRefreshResult.INSTANCE.getEMPTY();
        }
    }
}
