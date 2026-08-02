package io.radar.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.common.util.UriUtil;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiHelper;
import io.sentry.SentryEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RadarApiHelper.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002%&B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u008d\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0002\b\u001fJG\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u0004\u0018\u00010\u000f*\u00020$H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lio/radar/sdk/RadarApiHelper;", "", SentryEvent.JsonKeys.LOGGER, "Lio/radar/sdk/RadarLogger;", "(Lio/radar/sdk/RadarLogger;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "handler", "Landroid/os/Handler;", "request", "", "context", "Landroid/content/Context;", "method", "", "path", "headers", "", "params", "Lorg/json/JSONObject;", "sleep", "", "callback", "Lio/radar/sdk/RadarApiHelper$RadarApiCallback;", "extendedTimeout", "stream", "logPayload", "verified", "imageCallback", "Lio/radar/sdk/RadarApiHelper$RadarImageApiCallback;", "request$sdk_release", "requestImage", "urlString", "requestImage$sdk_release", "readAll", "Ljava/io/InputStream;", "RadarApiCallback", "RadarImageApiCallback", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public class RadarApiHelper {
    private final ExecutorService executor;
    private final Handler handler;
    private RadarLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    public RadarApiHelper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RadarApiHelper(RadarLogger radarLogger) {
        this.logger = radarLogger;
        this.executor = Executors.newSingleThreadExecutor();
        this.handler = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ RadarApiHelper(RadarLogger radarLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : radarLogger);
    }

    /* compiled from: RadarApiHelper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lio/radar/sdk/RadarApiHelper$RadarApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res);

        /* compiled from: RadarApiHelper.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarApiCallback radarApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                radarApiCallback.onComplete(radarStatus, jSONObject);
            }
        }
    }

    /* compiled from: RadarApiHelper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lio/radar/sdk/RadarApiHelper$RadarImageApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", "bitmap", "Landroid/graphics/Bitmap;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarImageApiCallback {
        void onComplete(Radar.RadarStatus status, Bitmap bitmap);

        /* compiled from: RadarApiHelper.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarImageApiCallback radarImageApiCallback, Radar.RadarStatus radarStatus, Bitmap bitmap, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    bitmap = null;
                }
                radarImageApiCallback.onComplete(radarStatus, bitmap);
            }
        }
    }

    public static /* synthetic */ void request$sdk_release$default(RadarApiHelper radarApiHelper, Context context, String str, String str2, Map map, JSONObject jSONObject, boolean z, RadarApiCallback radarApiCallback, boolean z2, boolean z3, boolean z4, boolean z5, RadarImageApiCallback radarImageApiCallback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        radarApiHelper.request$sdk_release(context, str, str2, map, jSONObject, z, (i & 64) != 0 ? null : radarApiCallback, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? true : z4, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? null : radarImageApiCallback);
    }

    public void request$sdk_release(Context context, final String method, String path, final Map<String, String> headers, JSONObject params, final boolean sleep, final RadarApiCallback callback, final boolean extendedTimeout, final boolean stream, boolean logPayload, boolean verified, final RadarImageApiCallback imageCallback) {
        String host$sdk_release;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(path, "path");
        if (verified) {
            host$sdk_release = RadarSettings.INSTANCE.getVerifiedHost$sdk_release(context);
        } else {
            host$sdk_release = RadarSettings.INSTANCE.getHost$sdk_release(context);
        }
        Uri parse = Uri.parse(host$sdk_release);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        final URL url = new URL(parse.buildUpon().appendEncodedPath(path).build().toString());
        if (logPayload) {
            RadarLogger radarLogger = this.logger;
            if (radarLogger != null) {
                StringBuilder sb = new StringBuilder("📍 Radar API request | method = ");
                sb.append(method);
                sb.append("; url = ");
                sb.append(url);
                sb.append("; headers = ");
                sb.append(headers);
                sb.append("; params = ");
                jSONObject = params;
                sb.append(jSONObject);
                RadarLogger.d$default(radarLogger, sb.toString(), null, null, 6, null);
            } else {
                jSONObject = params;
            }
        } else {
            jSONObject = params;
            RadarLogger radarLogger2 = this.logger;
            if (radarLogger2 != null) {
                RadarLogger.d$default(radarLogger2, "📍 Radar API request | method = " + method + "; url = " + url + "; headers = " + headers, null, null, 6, null);
            }
        }
        final JSONObject jSONObject2 = jSONObject;
        this.executor.execute(new Runnable() { // from class: io.radar.sdk.RadarApiHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RadarApiHelper.request$lambda$8(url, headers, this, method, extendedTimeout, stream, jSONObject2, callback, imageCallback, sleep);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$8(URL url, Map map, final RadarApiHelper this$0, String method, boolean z, boolean z2, JSONObject jSONObject, final RadarApiCallback radarApiCallback, final RadarImageApiCallback radarImageApiCallback, boolean z3) {
        final Radar.RadarStatus radarStatus;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(method, "$method");
        try {
            try {
                URLConnection openConnection = url.openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                if (map != null) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        try {
                            httpsURLConnection.setRequestProperty(str, str2);
                        } catch (Exception unused) {
                            RadarLogger radarLogger = this$0.logger;
                            if (radarLogger != null) {
                                RadarLogger.d$default(radarLogger, "Error setting request property | key = " + str + "; value = " + str2, null, null, 6, null);
                                it = it;
                            }
                        }
                    }
                }
                httpsURLConnection.setRequestMethod(method);
                httpsURLConnection.setConnectTimeout(10000);
                if (z) {
                    httpsURLConnection.setReadTimeout(25000);
                } else {
                    httpsURLConnection.setReadTimeout(10000);
                }
                if (z2) {
                    httpsURLConnection.setChunkedStreamingMode(1024);
                }
                if (jSONObject != null) {
                    long optLong = jSONObject.optLong("updatedAtMsDiff", -1L);
                    JSONArray optJSONArray = jSONObject.optJSONArray("replays");
                    if (optLong != -1 || optJSONArray != null) {
                        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000000;
                        long optLong2 = jSONObject.optLong("locationMs", -1L);
                        if (optLong != -1 && optLong2 != -1) {
                            jSONObject.put("updatedAtMsDiff", elapsedRealtimeNanos - optLong2);
                        }
                        if (optJSONArray != null) {
                            ArrayList arrayList = new ArrayList();
                            int length = optJSONArray.length();
                            int i3 = 0;
                            while (i3 < length) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                                if (optJSONObject != null) {
                                    i = length;
                                    i2 = i3;
                                    long optLong3 = optJSONObject.optLong("locationMs", -1L);
                                    if (optLong3 != -1) {
                                        optJSONObject.put("updatedAtMsDiff", elapsedRealtimeNanos - optLong3);
                                    }
                                    arrayList.add(optJSONObject);
                                } else {
                                    i = length;
                                    i2 = i3;
                                }
                                i3 = i2 + 1;
                                length = i;
                            }
                            jSONObject.put("replays", new JSONArray((Collection) arrayList));
                        }
                    }
                    httpsURLConnection.setDoOutput(true);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection.getOutputStream());
                    outputStreamWriter.write(jSONObject.toString());
                    outputStreamWriter.close();
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (200 > responseCode || responseCode >= 400) {
                    int responseCode2 = httpsURLConnection.getResponseCode();
                    if (responseCode2 == 400) {
                        radarStatus = Radar.RadarStatus.ERROR_BAD_REQUEST;
                    } else if (responseCode2 == 401) {
                        radarStatus = Radar.RadarStatus.ERROR_UNAUTHORIZED;
                    } else if (responseCode2 == 402) {
                        radarStatus = Radar.RadarStatus.ERROR_PAYMENT_REQUIRED;
                    } else if (responseCode2 == 403) {
                        radarStatus = Radar.RadarStatus.ERROR_FORBIDDEN;
                    } else if (responseCode2 == 404) {
                        radarStatus = Radar.RadarStatus.ERROR_NOT_FOUND;
                    } else if (responseCode2 == 429) {
                        radarStatus = Radar.RadarStatus.ERROR_RATE_LIMIT;
                    } else if (500 <= responseCode2 && responseCode2 < 600) {
                        radarStatus = Radar.RadarStatus.ERROR_SERVER;
                    } else {
                        radarStatus = Radar.RadarStatus.ERROR_UNKNOWN;
                    }
                    InputStream errorStream = httpsURLConnection.getErrorStream();
                    Intrinsics.checkNotNullExpressionValue(errorStream, "getErrorStream(...)");
                    String readAll = this$0.readAll(errorStream);
                    if (readAll == null) {
                        if (radarApiCallback != null) {
                            RadarApiCallback.DefaultImpls.onComplete$default(radarApiCallback, Radar.RadarStatus.ERROR_SERVER, null, 2, null);
                        }
                        if (radarImageApiCallback != null) {
                            RadarImageApiCallback.DefaultImpls.onComplete$default(radarImageApiCallback, Radar.RadarStatus.ERROR_SERVER, null, 2, null);
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(readAll);
                    RadarLogger radarLogger2 = this$0.logger;
                    if (radarLogger2 != null) {
                        RadarLogger.e$default(radarLogger2, "📍 Radar API response | method = " + method + "; url = " + url + "; responseCode = " + httpsURLConnection.getResponseCode() + "; res = " + jSONObject2, Radar.RadarLogType.SDK_ERROR, null, 4, null);
                    }
                    this$0.handler.post(new Runnable() { // from class: io.radar.sdk.RadarApiHelper$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            RadarApiHelper.request$lambda$8$lambda$4(RadarApiHelper.RadarApiCallback.this, radarStatus, radarImageApiCallback);
                        }
                    });
                } else {
                    if (radarApiCallback != null) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                        String readAll2 = this$0.readAll(inputStream);
                        if (readAll2 == null) {
                            this$0.handler.post(new Runnable() { // from class: io.radar.sdk.RadarApiHelper$$ExternalSyntheticLambda1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RadarApiHelper.request$lambda$8$lambda$1(RadarApiHelper.RadarApiCallback.this);
                                }
                            });
                            return;
                        }
                        final JSONObject jSONObject3 = new JSONObject(readAll2);
                        RadarLogger radarLogger3 = this$0.logger;
                        if (radarLogger3 != null) {
                            RadarLogger.d$default(radarLogger3, "📍 Radar API response | method = " + method + "; url = " + url + "; responseCode = " + httpsURLConnection.getResponseCode() + "; res = " + jSONObject3, null, null, 6, null);
                        }
                        this$0.handler.post(new Runnable() { // from class: io.radar.sdk.RadarApiHelper$$ExternalSyntheticLambda2
                            @Override // java.lang.Runnable
                            public final void run() {
                                RadarApiHelper.request$lambda$8$lambda$2(RadarApiHelper.RadarApiCallback.this, jSONObject3);
                            }
                        });
                    }
                    if (radarImageApiCallback != null) {
                        InputStream inputStream2 = httpsURLConnection.getInputStream();
                        final Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2);
                        inputStream2.close();
                        RadarLogger radarLogger4 = this$0.logger;
                        if (radarLogger4 != null) {
                            RadarLogger.d$default(radarLogger4, "📍 Radar API image response | method = " + method + "; url = " + url + "; responseCode = " + httpsURLConnection.getResponseCode(), null, null, 6, null);
                        }
                        this$0.handler.post(new Runnable() { // from class: io.radar.sdk.RadarApiHelper$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                RadarApiHelper.request$lambda$8$lambda$3(RadarApiHelper.RadarImageApiCallback.this, decodeStream);
                            }
                        });
                    }
                }
                httpsURLConnection.disconnect();
            } catch (Exception e) {
                RadarLogger radarLogger5 = this$0.logger;
                if (radarLogger5 != null) {
                    RadarLogger.d$default(radarLogger5, "Error calling API | e = " + e.getLocalizedMessage(), null, null, 6, null);
                }
                this$0.handler.post(new Runnable() { // from class: io.radar.sdk.RadarApiHelper$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        RadarApiHelper.request$lambda$8$lambda$7(RadarApiHelper.RadarApiCallback.this, radarImageApiCallback);
                    }
                });
            }
        } catch (IOException e2) {
            this$0.handler.post(new Runnable() { // from class: io.radar.sdk.RadarApiHelper$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    RadarApiHelper.request$lambda$8$lambda$5(RadarApiHelper.this, e2, radarApiCallback, radarImageApiCallback);
                }
            });
        } catch (JSONException e3) {
            RadarLogger radarLogger6 = this$0.logger;
            if (radarLogger6 != null) {
                RadarLogger.d$default(radarLogger6, "Error calling API | e = " + e3.getLocalizedMessage(), null, null, 6, null);
            }
            this$0.handler.post(new Runnable() { // from class: io.radar.sdk.RadarApiHelper$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    RadarApiHelper.request$lambda$8$lambda$6(RadarApiHelper.RadarApiCallback.this, radarImageApiCallback);
                }
            });
        }
        if (z3) {
            Thread.sleep(1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$8$lambda$1(RadarApiCallback radarApiCallback) {
        RadarApiCallback.DefaultImpls.onComplete$default(radarApiCallback, Radar.RadarStatus.ERROR_SERVER, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$8$lambda$2(RadarApiCallback radarApiCallback, JSONObject res) {
        Intrinsics.checkNotNullParameter(res, "$res");
        radarApiCallback.onComplete(Radar.RadarStatus.SUCCESS, res);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$8$lambda$3(RadarImageApiCallback radarImageApiCallback, Bitmap bitmap) {
        radarImageApiCallback.onComplete(Radar.RadarStatus.SUCCESS, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$8$lambda$4(RadarApiCallback radarApiCallback, Radar.RadarStatus status, RadarImageApiCallback radarImageApiCallback) {
        Intrinsics.checkNotNullParameter(status, "$status");
        if (radarApiCallback != null) {
            RadarApiCallback.DefaultImpls.onComplete$default(radarApiCallback, status, null, 2, null);
        }
        if (radarImageApiCallback != null) {
            RadarImageApiCallback.DefaultImpls.onComplete$default(radarImageApiCallback, status, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$8$lambda$5(RadarApiHelper this$0, IOException e, RadarApiCallback radarApiCallback, RadarImageApiCallback radarImageApiCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e, "$e");
        RadarLogger radarLogger = this$0.logger;
        if (radarLogger != null) {
            RadarLogger.d$default(radarLogger, "Error calling API | e = " + e.getLocalizedMessage(), null, null, 6, null);
        }
        if (radarApiCallback != null) {
            RadarApiCallback.DefaultImpls.onComplete$default(radarApiCallback, Radar.RadarStatus.ERROR_NETWORK, null, 2, null);
        }
        if (radarImageApiCallback != null) {
            RadarImageApiCallback.DefaultImpls.onComplete$default(radarImageApiCallback, Radar.RadarStatus.ERROR_NETWORK, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$8$lambda$6(RadarApiCallback radarApiCallback, RadarImageApiCallback radarImageApiCallback) {
        if (radarApiCallback != null) {
            RadarApiCallback.DefaultImpls.onComplete$default(radarApiCallback, Radar.RadarStatus.ERROR_SERVER, null, 2, null);
        }
        if (radarImageApiCallback != null) {
            RadarImageApiCallback.DefaultImpls.onComplete$default(radarImageApiCallback, Radar.RadarStatus.ERROR_SERVER, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$8$lambda$7(RadarApiCallback radarApiCallback, RadarImageApiCallback radarImageApiCallback) {
        if (radarApiCallback != null) {
            RadarApiCallback.DefaultImpls.onComplete$default(radarApiCallback, Radar.RadarStatus.ERROR_UNKNOWN, null, 2, null);
        }
        if (radarImageApiCallback != null) {
            RadarImageApiCallback.DefaultImpls.onComplete$default(radarImageApiCallback, Radar.RadarStatus.ERROR_UNKNOWN, null, 2, null);
        }
    }

    private final String readAll(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
        String next = useDelimiter.hasNext() ? useDelimiter.next() : null;
        inputStream.close();
        return next;
    }

    public static /* synthetic */ void requestImage$sdk_release$default(RadarApiHelper radarApiHelper, Context context, String str, String str2, Map map, RadarImageApiCallback radarImageApiCallback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestImage");
        }
        if ((i & 16) != 0) {
            radarImageApiCallback = null;
        }
        radarApiHelper.requestImage$sdk_release(context, str, str2, map, radarImageApiCallback);
    }

    public void requestImage$sdk_release(Context context, String method, String urlString, Map<String, String> headers, RadarImageApiCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        request$sdk_release$default(this, context, method, urlString, headers, null, false, null, false, false, false, false, callback, 1984, null);
    }
}
