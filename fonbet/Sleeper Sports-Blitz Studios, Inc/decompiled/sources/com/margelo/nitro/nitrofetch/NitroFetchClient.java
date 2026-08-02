package com.margelo.nitro.nitrofetch;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.common.util.UriUtil;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.margelo.nitro.NitroModules;
import com.margelo.nitro.core.ArrayBuffer;
import com.margelo.nitro.core.Promise;
import com.margelo.nitro.nitrofetch.NitroFetchClient;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.turboimage.events.SuccessEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UrlRequest;

/* compiled from: NitroFetchClient.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroFetchClient;", "Lcom/margelo/nitro/nitrofetch/HybridNitroFetchClientSpec;", "engine", "Lorg/chromium/net/CronetEngine;", "executor", "Ljava/util/concurrent/Executor;", "<init>", "(Lorg/chromium/net/CronetEngine;Ljava/util/concurrent/Executor;)V", "activeRequests", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lorg/chromium/net/UrlRequest;", "cancelRequest", "", "requestId", "findPrefetchKey", "req", "Lcom/margelo/nitro/nitrofetch/NitroRequest;", "withPrefetchedHeader", "Lcom/margelo/nitro/nitrofetch/NitroResponse;", UriUtil.LOCAL_RESOURCE_SCHEME, "requestSync", "request", "Lcom/margelo/nitro/core/Promise;", "prefetch", "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroFetchClient extends HybridNitroFetchClientSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ConcurrentHashMap<String, UrlRequest> activeRequests;
    private final CronetEngine engine;
    private final Executor executor;

    @JvmStatic
    public static final UrlRequest fetch(NitroRequest nitroRequest, Function1<? super NitroResponse, Unit> function1, Function1<? super Throwable, Unit> function12) {
        return INSTANCE.fetch(nitroRequest, function1, function12);
    }

    public NitroFetchClient(CronetEngine engine, Executor executor) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.engine = engine;
        this.executor = executor;
        this.activeRequests = new ConcurrentHashMap<>();
    }

    @Override // com.margelo.nitro.nitrofetch.HybridNitroFetchClientSpec
    public void cancelRequest(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        UrlRequest remove = this.activeRequests.remove(requestId);
        if (remove != null) {
            remove.cancel();
        }
    }

    private final String findPrefetchKey(NitroRequest req) {
        NitroHeader[] headers = req.getHeaders();
        if (headers == null) {
            return null;
        }
        for (NitroHeader nitroHeader : headers) {
            String key = nitroHeader.getKey();
            String value = nitroHeader.getValue();
            if (StringsKt.equals(key, "prefetchKey", true)) {
                return value;
            }
        }
        return null;
    }

    /* compiled from: NitroFetchClient.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0007JH\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J'\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001aH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001aH\u0002J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0002J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006&"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroFetchClient$Companion;", "", "<init>", "()V", RemoteConfigComponent.FETCH_FILE_NAME, "Lorg/chromium/net/UrlRequest;", "req", "Lcom/margelo/nitro/nitrofetch/NitroRequest;", SuccessEvent.EVENT_NAME, "Lkotlin/Function1;", "Lcom/margelo/nitro/nitrofetch/NitroResponse;", "", "onFail", "", "startCronet", "engine", "Lorg/chromium/net/CronetEngine;", "executor", "Ljava/util/concurrent/Executor;", "uploadBytes", "", "createUploadProvider", "Lorg/chromium/net/UploadDataProvider;", "body", "buildMultipartBody", "Lkotlin/Pair;", "", "parts", "", "Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;", "([Lcom/margelo/nitro/nitrofetch/NitroFormDataPart;)Lkotlin/Pair;", "readFileBytes", "uri", "isHttpURL", "", "url", "guessMime", "makeLocalFileResponse", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UrlRequest fetch(NitroRequest req, Function1<? super NitroResponse, Unit> onSuccess, Function1<? super Throwable, Unit> onFail) {
            Function1<? super Throwable, Unit> function1;
            Object obj;
            Intrinsics.checkNotNullParameter(req, "req");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            Intrinsics.checkNotNullParameter(onFail, "onFail");
            try {
                if (!isHttpURL(req.getUrl())) {
                    try {
                        onSuccess.invoke(makeLocalFileResponse(req));
                        return null;
                    } catch (Throwable th) {
                        obj = th;
                        function1 = onFail;
                        function1.invoke(obj);
                        return null;
                    }
                }
                function1 = onFail;
                try {
                    return startCronet(NitroFetch.INSTANCE.getEngine(), NitroFetch.INSTANCE.getIoExecutor(), req, onSuccess, function1);
                } catch (Throwable th2) {
                    th = th2;
                    obj = th;
                    function1.invoke(obj);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                function1 = onFail;
            }
        }

        private final UrlRequest startCronet(CronetEngine engine, Executor executor, NitroRequest req, final Function1<? super NitroResponse, Unit> onSuccess, final Function1<? super Throwable, Unit> onFail) {
            String str;
            final String url = req.getUrl();
            Boolean followRedirects = req.getFollowRedirects();
            final boolean booleanValue = followRedirects != null ? followRedirects.booleanValue() : true;
            final boolean z = req.getCredentials() == NitroRequestCredentials.OMIT;
            final boolean z2 = false;
            final String str2 = "";
            final String str3 = "";
            final int i = 0;
            final UrlRequest.Builder newUrlRequestBuilder = engine.newUrlRequestBuilder(url, new UrlRequest.Callback() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$Companion$startCronet$callback$1
                private int devToolsBytes;
                private boolean devToolsTextual;
                private boolean redirectStopped;
                private boolean setCookieAppliedOnRedirect;
                private final ByteBuffer buffer = ByteBuffer.allocateDirect(16384);
                private final ByteArrayOutputStream out = new ByteArrayOutputStream();

                @Override // org.chromium.net.UrlRequest.Callback
                public void onRedirectReceived(UrlRequest request, org.chromium.net.UrlResponseInfo info, String newLocationUrl) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(info, "info");
                    Intrinsics.checkNotNullParameter(newLocationUrl, "newLocationUrl");
                    if (booleanValue) {
                        if (!z) {
                            NitroCookieSync nitroCookieSync = NitroCookieSync.INSTANCE;
                            String url2 = info.getUrl();
                            Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                            if (nitroCookieSync.storeSetCookieFromUrlResponseInfo(url2, info, false)) {
                                this.setCookieAppliedOnRedirect = true;
                            }
                        }
                        request.followRedirect();
                        return;
                    }
                    this.redirectStopped = true;
                    request.cancel();
                    try {
                        List<Map.Entry<String, String>> allHeadersAsList = info.getAllHeadersAsList();
                        Intrinsics.checkNotNullExpressionValue(allHeadersAsList, "getAllHeadersAsList(...)");
                        List<Map.Entry<String, String>> list = allHeadersAsList;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                            Object value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                            arrayList.add(new NitroHeader((String) key, (String) value));
                        }
                        NitroHeader[] nitroHeaderArr = (NitroHeader[]) arrayList.toArray(new NitroHeader[0]);
                        int httpStatusCode = info.getHttpStatusCode();
                        String url3 = info.getUrl();
                        Intrinsics.checkNotNullExpressionValue(url3, "getUrl(...)");
                        double d = httpStatusCode;
                        String httpStatusText = info.getHttpStatusText();
                        if (httpStatusText == null) {
                            httpStatusText = "";
                        }
                        onSuccess.invoke(new NitroResponse(url3, d, httpStatusText, false, false, nitroHeaderArr, "", null));
                    } catch (Throwable th) {
                        onFail.invoke(th);
                    }
                }

                @Override // org.chromium.net.UrlRequest.Callback
                public void onResponseStarted(UrlRequest request, org.chromium.net.UrlResponseInfo info) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(info, "info");
                    if (z2) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        List<Map.Entry<String, String>> allHeadersAsList = info.getAllHeadersAsList();
                        Intrinsics.checkNotNullExpressionValue(allHeadersAsList, "getAllHeadersAsList(...)");
                        Iterator<T> it = allHeadersAsList.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                        String str4 = (String) linkedHashMap.get("Content-Type");
                        if (str4 == null) {
                            str4 = (String) linkedHashMap.get(ApiConstant.HEADER_CONTENT_TYPE);
                        }
                        this.devToolsTextual = DevToolsReporter.INSTANCE.isTextualContentType(str4);
                        DevToolsReporter devToolsReporter = DevToolsReporter.INSTANCE;
                        String str5 = str2;
                        String url2 = info.getUrl();
                        Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                        devToolsReporter.reportResponseStart(str5, url2, info.getHttpStatusCode(), linkedHashMap, -1L);
                    }
                    this.buffer.clear();
                    request.read(this.buffer);
                }

                @Override // org.chromium.net.UrlRequest.Callback
                public void onReadCompleted(UrlRequest request, org.chromium.net.UrlResponseInfo info, ByteBuffer byteBuffer) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(info, "info");
                    Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                    byteBuffer.flip();
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = new byte[remaining];
                    byteBuffer.get(bArr);
                    this.out.write(bArr);
                    if (z2) {
                        this.devToolsBytes += remaining;
                        DevToolsReporter.INSTANCE.reportDataReceived(str2, remaining);
                        if (this.devToolsTextual) {
                            DevToolsReporter.INSTANCE.storeResponseBodyIncremental(str2, new String(bArr, Charsets.UTF_8));
                        }
                    }
                    byteBuffer.clear();
                    request.read(byteBuffer);
                }

                /* JADX WARN: Code restructure failed: missing block: B:60:0x0031, code lost:
                
                    if (r12.setCookieAppliedOnRedirect != false) goto L13;
                 */
                @Override // org.chromium.net.UrlRequest.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onSucceeded(UrlRequest request, org.chromium.net.UrlResponseInfo info) {
                    Charset charset;
                    String str4;
                    CharsetDecoder strictDecoderFor;
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(info, "info");
                    if (z2) {
                        DevToolsReporter.INSTANCE.reportResponseEnd(str2, this.devToolsBytes);
                    }
                    try {
                        if (!z) {
                            NitroCookieSync nitroCookieSync = NitroCookieSync.INSTANCE;
                            String url2 = info.getUrl();
                            Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                            if (nitroCookieSync.storeSetCookieFromUrlResponseInfo(url2, info, false)) {
                                NitroCookieSync.INSTANCE.flushCookieManager();
                                List<Map.Entry<String, String>> allHeadersAsList = info.getAllHeadersAsList();
                                Intrinsics.checkNotNullExpressionValue(allHeadersAsList, "getAllHeadersAsList(...)");
                                List<Map.Entry<String, String>> list = allHeadersAsList;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    Object key = entry.getKey();
                                    Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                                    Object value = entry.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                                    arrayList.add(new NitroHeader((String) key, (String) value));
                                }
                                NitroHeader[] nitroHeaderArr = (NitroHeader[]) arrayList.toArray(new NitroHeader[0]);
                                int httpStatusCode = info.getHttpStatusCode();
                                byte[] byteArray = this.out.toByteArray();
                                Object obj = (List) info.getAllHeaders().get("Content-Type");
                                if (obj == null) {
                                    obj = (List) info.getAllHeaders().get(ApiConstant.HEADER_CONTENT_TYPE);
                                }
                                NitroFetchClient$Companion$startCronet$callback$1 nitroFetchClient$Companion$startCronet$callback$1 = this;
                                if (obj == null) {
                                    obj = "";
                                }
                                ArrayBuffer arrayBuffer = null;
                                MatchResult find$default = Regex.find$default(new Regex("charset=([A-Za-z0-9_\\-:.]+)", RegexOption.IGNORE_CASE), obj.toString(), 0, 2, null);
                                try {
                                    charset = find$default != null ? Charset.forName(find$default.getGroupValues().get(1)) : Charsets.UTF_8;
                                } catch (Throwable unused) {
                                    charset = Charsets.UTF_8;
                                }
                                try {
                                    Intrinsics.checkNotNull(charset);
                                    strictDecoderFor = NitroFetchClientKt.strictDecoderFor(charset);
                                    str4 = strictDecoderFor.decode(ByteBuffer.wrap(byteArray)).toString();
                                } catch (Throwable unused2) {
                                    str4 = null;
                                }
                                if (str4 == null) {
                                    Intrinsics.checkNotNull(byteArray);
                                    if (!(byteArray.length == 0)) {
                                        arrayBuffer = NitroFetchClientKt.toArrayBuffer(byteArray);
                                    }
                                }
                                ArrayBuffer arrayBuffer2 = arrayBuffer;
                                String url3 = info.getUrl();
                                Intrinsics.checkNotNullExpressionValue(url3, "getUrl(...)");
                                String str5 = "";
                                double d = httpStatusCode;
                                String httpStatusText = info.getHttpStatusText();
                                if (httpStatusText != null) {
                                    str5 = httpStatusText;
                                }
                                onSuccess.invoke(new NitroResponse(url3, d, str5, 200 <= httpStatusCode && httpStatusCode < 300, !Intrinsics.areEqual(info.getUrl(), url), nitroHeaderArr, str4, arrayBuffer2));
                            }
                        }
                    } catch (Throwable th) {
                        onFail.invoke(th);
                    }
                }

                @Override // org.chromium.net.UrlRequest.Callback
                public void onFailed(UrlRequest request, org.chromium.net.UrlResponseInfo info, CronetException error) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(error, "error");
                    if (z2) {
                        DevToolsReporter.INSTANCE.reportRequestFailed(str2, false);
                    }
                    onFail.invoke(new RuntimeException("Cronet failed: " + error.getMessage(), error));
                }

                @Override // org.chromium.net.UrlRequest.Callback
                public void onCanceled(UrlRequest request, org.chromium.net.UrlResponseInfo info) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    if (z2) {
                        DevToolsReporter.INSTANCE.reportRequestFailed(str2, true);
                    }
                    if (this.redirectStopped) {
                        return;
                    }
                    onFail.invoke(new RuntimeException("Cronet canceled"));
                }
            }, executor);
            NitroRequestMethod method = req.getMethod();
            if (method == null || (str = method.name()) == null) {
                str = "GET";
            }
            newUrlRequestBuilder.setHttpMethod(str);
            NitroHeader[] headers = req.getHeaders();
            if (headers != null) {
                for (NitroHeader nitroHeader : headers) {
                    newUrlRequestBuilder.addHeader(nitroHeader.getKey(), nitroHeader.getValue());
                }
            }
            if (!z) {
                NitroCookieSync.INSTANCE.attachCookieFromManagerIfMissing(url, NitroCookieSync.INSTANCE.hasCookieHeaderInNitroRequest(req.getHeaders()), new Function2() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit startCronet$lambda$1;
                        startCronet$lambda$1 = NitroFetchClient.Companion.startCronet$lambda$1(UrlRequest.Builder.this, (String) obj, (String) obj2);
                        return startCronet$lambda$1;
                    }
                });
            }
            NitroFormDataPart[] bodyFormData = req.getBodyFormData();
            if (bodyFormData != null) {
                if (!(bodyFormData.length == 0)) {
                    Pair<byte[], String> buildMultipartBody = buildMultipartBody(bodyFormData);
                    byte[] component1 = buildMultipartBody.component1();
                    newUrlRequestBuilder.addHeader("Content-Type", buildMultipartBody.component2());
                    newUrlRequestBuilder.setUploadDataProvider(createUploadProvider(component1), executor);
                    UrlRequest build = newUrlRequestBuilder.build();
                    build.start();
                    Intrinsics.checkNotNull(build);
                    return build;
                }
            }
            byte[] uploadBytes = uploadBytes(req);
            if (uploadBytes != null) {
                newUrlRequestBuilder.setUploadDataProvider(createUploadProvider(uploadBytes), executor);
            }
            UrlRequest build2 = newUrlRequestBuilder.build();
            build2.start();
            Intrinsics.checkNotNull(build2);
            return build2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit startCronet$lambda$1(UrlRequest.Builder builder, String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            builder.addHeader(key, value);
            return Unit.INSTANCE;
        }

        private final byte[] uploadBytes(NitroRequest req) {
            Object m13470constructorimpl;
            ArrayBuffer bodyBytes = req.getBodyBytes();
            if (bodyBytes != null) {
                ByteBuffer buffer = bodyBytes.getBuffer(false);
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                return bArr;
            }
            String bodyBytesBase64 = req.getBodyBytesBase64();
            if (bodyBytesBase64 != null) {
                if (bodyBytesBase64.length() <= 0) {
                    bodyBytesBase64 = null;
                }
                if (bodyBytesBase64 != null) {
                    Companion companion = NitroFetchClient.INSTANCE;
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(Base64.decode(bodyBytesBase64, 0));
                    } catch (Throwable th) {
                        Result.Companion companion3 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    }
                    return (byte[]) (Result.m13476isFailureimpl(m13470constructorimpl) ? null : m13470constructorimpl);
                }
            }
            String bodyString = req.getBodyString();
            if (bodyString != null) {
                if (bodyString.length() <= 0) {
                    bodyString = null;
                }
                if (bodyString != null) {
                    byte[] bytes = bodyString.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    return bytes;
                }
            }
            return null;
        }

        private final UploadDataProvider createUploadProvider(final byte[] body) {
            return new UploadDataProvider() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$Companion$createUploadProvider$1
                private int pos;

                @Override // org.chromium.net.UploadDataProvider
                public long getLength() {
                    return body.length;
                }

                @Override // org.chromium.net.UploadDataProvider
                public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
                    Intrinsics.checkNotNullParameter(uploadDataSink, "uploadDataSink");
                    Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                    int min = Math.min(byteBuffer.remaining(), body.length - this.pos);
                    byteBuffer.put(body, this.pos, min);
                    this.pos += min;
                    uploadDataSink.onReadSucceeded(false);
                }

                @Override // org.chromium.net.UploadDataProvider
                public void rewind(UploadDataSink uploadDataSink) {
                    Intrinsics.checkNotNullParameter(uploadDataSink, "uploadDataSink");
                    this.pos = 0;
                    uploadDataSink.onRewindSucceeded();
                }
            };
        }

        private final Pair<byte[], String> buildMultipartBody(NitroFormDataPart[] parts) {
            String str = "NitroFetch-" + UUID.randomUUID();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = IOUtils.LINE_SEPARATOR_WINDOWS.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            for (NitroFormDataPart nitroFormDataPart : parts) {
                byte[] bytes2 = ("--" + str + IOUtils.LINE_SEPARATOR_WINDOWS).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                byteArrayOutputStream.write(bytes2);
                String fileUri = nitroFormDataPart.getFileUri();
                if (fileUri != null) {
                    String fileName = nitroFormDataPart.getFileName();
                    if (fileName == null) {
                        fileName = "file";
                    }
                    String mimeType = nitroFormDataPart.getMimeType();
                    if (mimeType == null) {
                        mimeType = "application/octet-stream";
                    }
                    byte[] bytes3 = ("Content-Disposition: form-data; name=\"" + nitroFormDataPart.getName() + "\"; filename=\"" + fileName + "\"\r\n").getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
                    byteArrayOutputStream.write(bytes3);
                    byte[] bytes4 = ("Content-Type: " + mimeType + "\r\n\r\n").getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes4, "getBytes(...)");
                    byteArrayOutputStream.write(bytes4);
                    byteArrayOutputStream.write(readFileBytes(fileUri));
                } else {
                    String value = nitroFormDataPart.getValue();
                    if (value == null) {
                        value = "";
                    }
                    byte[] bytes5 = ("Content-Disposition: form-data; name=\"" + nitroFormDataPart.getName() + "\"\r\n\r\n").getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes5, "getBytes(...)");
                    byteArrayOutputStream.write(bytes5);
                    byte[] bytes6 = value.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes6, "getBytes(...)");
                    byteArrayOutputStream.write(bytes6);
                }
                byteArrayOutputStream.write(bytes);
            }
            byte[] bytes7 = ("--" + str + "--\r\n").getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes7, "getBytes(...)");
            byteArrayOutputStream.write(bytes7);
            return new Pair<>(byteArrayOutputStream.toByteArray(), "multipart/form-data; boundary=" + str);
        }

        private final byte[] readFileBytes(String uri) {
            InputStream openStream;
            if (StringsKt.startsWith$default(uri, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(uri, "https://", false, 2, (Object) null)) {
                openStream = new URL(uri).openStream();
                try {
                    InputStream inputStream = openStream;
                    Intrinsics.checkNotNull(inputStream);
                    byte[] readBytes = ByteStreamsKt.readBytes(inputStream);
                    CloseableKt.closeFinally(openStream, null);
                    return readBytes;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (StringsKt.startsWith$default(uri, "content://", false, 2, (Object) null)) {
                ReactApplicationContext applicationContext = NitroModules.INSTANCE.getApplicationContext();
                if (applicationContext == null) {
                    throw new IllegalStateException("Cannot read content:// URI - no Android Context");
                }
                InputStream openInputStream = applicationContext.getContentResolver().openInputStream(Uri.parse(uri));
                if (openInputStream == null) {
                    throw new IllegalArgumentException("Cannot open content URI: " + uri);
                }
                openStream = openInputStream;
                try {
                    byte[] readBytes2 = ByteStreamsKt.readBytes(openStream);
                    CloseableKt.closeFinally(openStream, null);
                    return readBytes2;
                } finally {
                }
            } else {
                if (StringsKt.startsWith$default(uri, "file://", false, 2, (Object) null)) {
                    uri = StringsKt.removePrefix(uri, (CharSequence) "file://");
                }
                return FilesKt.readBytes(new File(uri));
            }
        }

        private final boolean isHttpURL(String url) {
            return StringsKt.startsWith$default(url, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(url, "https://", false, 2, (Object) null);
        }

        private final String guessMime(String uri) {
            String mimeTypeFromExtension;
            ReactApplicationContext applicationContext;
            ContentResolver contentResolver;
            String type;
            if (StringsKt.startsWith$default(uri, "content://", false, 2, (Object) null) && (applicationContext = NitroModules.INSTANCE.getApplicationContext()) != null && (contentResolver = applicationContext.getContentResolver()) != null && (type = contentResolver.getType(Uri.parse(uri))) != null) {
                return type;
            }
            if (StringsKt.startsWith$default(uri, "file://", false, 2, (Object) null)) {
                uri = StringsKt.removePrefix(uri, (CharSequence) "file://");
            }
            String lowerCase = StringsKt.substringAfterLast(uri, '.', "").toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() > 0 && (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase)) != null) {
                return mimeTypeFromExtension;
            }
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(uri);
            return guessContentTypeFromName == null ? "application/octet-stream" : guessContentTypeFromName;
        }

        private final NitroResponse makeLocalFileResponse(NitroRequest req) {
            String str;
            CharsetDecoder strictDecoderFor;
            byte[] readFileBytes = readFileBytes(req.getUrl());
            String guessMime = guessMime(req.getUrl());
            ArrayBuffer arrayBuffer = null;
            try {
                strictDecoderFor = NitroFetchClientKt.strictDecoderFor(Charsets.UTF_8);
                str = strictDecoderFor.decode(ByteBuffer.wrap(readFileBytes)).toString();
            } catch (Throwable unused) {
                str = null;
            }
            if (str == null) {
                if (!(readFileBytes.length == 0)) {
                    arrayBuffer = NitroFetchClientKt.toArrayBuffer(readFileBytes);
                }
            }
            return new NitroResponse(req.getUrl(), 200.0d, "OK", true, false, new NitroHeader[]{new NitroHeader("Content-Type", guessMime), new NitroHeader("Content-Length", String.valueOf(readFileBytes.length))}, str, arrayBuffer);
        }
    }

    private final NitroResponse withPrefetchedHeader(NitroResponse res) {
        ArrayList arrayList;
        NitroHeader[] headers = res.getHeaders();
        if (headers == null || (arrayList = ArraysKt.toMutableList(headers)) == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(new NitroHeader("nitroPrefetched", "true"));
        return new NitroResponse(res.getUrl(), res.getStatus(), res.getStatusText(), res.getOk(), res.getRedirected(), (NitroHeader[]) arrayList.toArray(new NitroHeader[0]), res.getBodyString(), res.getBodyBytes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestSync$lambda$2(Ref.ObjectRef objectRef, CountDownLatch countDownLatch, NitroResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        objectRef.element = it;
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestSync$lambda$3(Ref.ObjectRef objectRef, CountDownLatch countDownLatch, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        objectRef.element = it;
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.margelo.nitro.nitrofetch.HybridNitroFetchClientSpec
    public NitroResponse requestSync(NitroRequest req) {
        Intrinsics.checkNotNullParameter(req, "req");
        String findPrefetchKey = findPrefetchKey(req);
        if (findPrefetchKey != null) {
            CompletableFuture<NitroResponse> pending = FetchCache.INSTANCE.getPending(findPrefetchKey);
            if (pending != null) {
                try {
                    NitroResponse nitroResponse = pending.get();
                    Intrinsics.checkNotNullExpressionValue(nitroResponse, "get(...)");
                    return withPrefetchedHeader(nitroResponse);
                } catch (Exception e) {
                    Throwable cause = e.getCause();
                    if (cause == null) {
                        throw e;
                    }
                    throw cause;
                }
            }
            FetchCache fetchCache = FetchCache.INSTANCE;
            Double prefetchCacheTtlMs = req.getPrefetchCacheTtlMs();
            NitroResponse resultIfFresh = fetchCache.getResultIfFresh(findPrefetchKey, prefetchCacheTtlMs != null ? (long) prefetchCacheTtlMs.doubleValue() : 5000L);
            if (resultIfFresh != null) {
                return withPrefetchedHeader(resultIfFresh);
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        INSTANCE.fetch(req, new Function1() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit requestSync$lambda$2;
                requestSync$lambda$2 = NitroFetchClient.requestSync$lambda$2(Ref.ObjectRef.this, countDownLatch, (NitroResponse) obj);
                return requestSync$lambda$2;
            }
        }, new Function1() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit requestSync$lambda$3;
                requestSync$lambda$3 = NitroFetchClient.requestSync$lambda$3(Ref.ObjectRef.this, countDownLatch, (Throwable) obj);
                return requestSync$lambda$3;
            }
        });
        countDownLatch.await();
        Throwable th = (Throwable) objectRef2.element;
        if (th != null) {
            throw th;
        }
        T t = objectRef.element;
        Intrinsics.checkNotNull(t);
        return (NitroResponse) t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit request$lambda$7$lambda$5(Promise promise, NitroFetchClient nitroFetchClient, NitroResponse nitroResponse, Throwable th) {
        if (th != null) {
            promise.reject(th);
        } else if (nitroResponse != null) {
            promise.resolve(nitroFetchClient.withPrefetchedHeader(nitroResponse));
        } else {
            promise.reject(new IllegalStateException("Prefetch pending returned null result"));
        }
        return Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.nitrofetch.HybridNitroFetchClientSpec
    public Promise<NitroResponse> request(NitroRequest req) {
        Intrinsics.checkNotNullParameter(req, "req");
        final Promise<NitroResponse> promise = new Promise<>();
        String findPrefetchKey = findPrefetchKey(req);
        if (findPrefetchKey != null) {
            CompletableFuture<NitroResponse> pending = FetchCache.INSTANCE.getPending(findPrefetchKey);
            if (pending != null) {
                final Function2 function2 = new Function2() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit request$lambda$7$lambda$5;
                        request$lambda$7$lambda$5 = NitroFetchClient.request$lambda$7$lambda$5(Promise.this, this, (NitroResponse) obj, (Throwable) obj2);
                        return request$lambda$7$lambda$5;
                    }
                };
                pending.whenComplete(new BiConsumer() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$$ExternalSyntheticLambda3
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        Function2.this.invoke(obj, obj2);
                    }
                });
                return promise;
            }
            FetchCache fetchCache = FetchCache.INSTANCE;
            Double prefetchCacheTtlMs = req.getPrefetchCacheTtlMs();
            NitroResponse resultIfFresh = fetchCache.getResultIfFresh(findPrefetchKey, prefetchCacheTtlMs != null ? (long) prefetchCacheTtlMs.doubleValue() : 5000L);
            if (resultIfFresh != null) {
                promise.resolve(withPrefetchedHeader(resultIfFresh));
                return promise;
            }
        }
        final String requestId = req.getRequestId();
        UrlRequest fetch = INSTANCE.fetch(req, new Function1() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit request$lambda$9;
                request$lambda$9 = NitroFetchClient.request$lambda$9(requestId, this, promise, (NitroResponse) obj);
                return request$lambda$9;
            }
        }, new Function1() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit request$lambda$10;
                request$lambda$10 = NitroFetchClient.request$lambda$10(requestId, this, promise, (Throwable) obj);
                return request$lambda$10;
            }
        });
        if (requestId != null && fetch != null) {
            this.activeRequests.put(requestId, fetch);
        }
        return promise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit request$lambda$9(String str, NitroFetchClient nitroFetchClient, Promise promise, NitroResponse res) {
        Intrinsics.checkNotNullParameter(res, "res");
        if (str != null) {
            nitroFetchClient.activeRequests.remove(str);
        }
        promise.resolve(res);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit request$lambda$10(String str, NitroFetchClient nitroFetchClient, Promise promise, Throwable err) {
        Intrinsics.checkNotNullParameter(err, "err");
        if (str != null) {
            nitroFetchClient.activeRequests.remove(str);
        }
        promise.reject(err);
        return Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.nitrofetch.HybridNitroFetchClientSpec
    public Promise<Unit> prefetch(NitroRequest req) {
        Intrinsics.checkNotNullParameter(req, "req");
        final Promise<Unit> promise = new Promise<>();
        final String findPrefetchKey = findPrefetchKey(req);
        String str = findPrefetchKey;
        if (str == null || str.length() == 0) {
            promise.reject(new IllegalArgumentException("prefetch: missing 'prefetchKey' header"));
            return promise;
        }
        FetchCache fetchCache = FetchCache.INSTANCE;
        Double prefetchCacheTtlMs = req.getPrefetchCacheTtlMs();
        if (fetchCache.hasFreshResult(findPrefetchKey, prefetchCacheTtlMs != null ? (long) prefetchCacheTtlMs.doubleValue() : 5000L)) {
            promise.resolve(Unit.INSTANCE);
            return promise;
        }
        CompletableFuture<NitroResponse> pending = FetchCache.INSTANCE.getPending(findPrefetchKey);
        if (pending != null) {
            final Function2 function2 = new Function2() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit prefetch$lambda$13$lambda$11;
                    prefetch$lambda$13$lambda$11 = NitroFetchClient.prefetch$lambda$13$lambda$11(Promise.this, (NitroResponse) obj, (Throwable) obj2);
                    return prefetch$lambda$13$lambda$11;
                }
            };
            pending.whenComplete(new BiConsumer() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$$ExternalSyntheticLambda7
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Function2.this.invoke(obj, obj2);
                }
            });
            return promise;
        }
        FetchCache.INSTANCE.setPending(findPrefetchKey, new CompletableFuture<>());
        INSTANCE.fetch(req, new Function1() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit prefetch$lambda$14;
                prefetch$lambda$14 = NitroFetchClient.prefetch$lambda$14(findPrefetchKey, promise, (NitroResponse) obj);
                return prefetch$lambda$14;
            }
        }, new Function1() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClient$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit prefetch$lambda$15;
                prefetch$lambda$15 = NitroFetchClient.prefetch$lambda$15(findPrefetchKey, promise, (Throwable) obj);
                return prefetch$lambda$15;
            }
        });
        return promise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prefetch$lambda$13$lambda$11(Promise promise, NitroResponse nitroResponse, Throwable th) {
        if (th != null) {
            promise.reject(th);
        } else {
            promise.resolve(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prefetch$lambda$14(String str, Promise promise, NitroResponse res) {
        Intrinsics.checkNotNullParameter(res, "res");
        try {
            FetchCache.INSTANCE.complete(str, res);
            promise.resolve(Unit.INSTANCE);
        } catch (Throwable th) {
            FetchCache.INSTANCE.completeExceptionally(str, th);
            promise.reject(th);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prefetch$lambda$15(String str, Promise promise, Throwable err) {
        Intrinsics.checkNotNullParameter(err, "err");
        FetchCache.INSTANCE.completeExceptionally(str, err);
        promise.reject(err);
        return Unit.INSTANCE;
    }
}
