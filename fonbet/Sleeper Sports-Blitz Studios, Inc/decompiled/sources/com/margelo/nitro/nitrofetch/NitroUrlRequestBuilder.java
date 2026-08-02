package com.margelo.nitro.nitrofetch;

import com.margelo.nitro.core.ArrayBuffer;
import com.margelo.nitro.nitrofetch.Variant_ArrayBuffer_String;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UrlRequest;

/* compiled from: NitroUrlRequestBuilder.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010/\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0005H\u0016J\u0018\u00100\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H\u0016J\u0010\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u0011H\u0016J\b\u00106\u001a\u00020\u0011H\u0016J+\u00107\u001a\u00020\u00112!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00110\u0013H\u0016JB\u00109\u001a\u00020\u001128\u00108\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00110\u000bH\u0016J-\u0010:\u001a\u00020\u00112#\u00108\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J@\u0010;\u001a\u00020\u001126\u00108\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000bH\u0016J+\u0010<\u001a\u00020\u00112!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00110\u0013H\u0016JU\u0010=\u001a\u00020\u00112K\u00108\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00110\u0015H\u0016J\b\u0010>\u001a\u00020?H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\n\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000RU\u0010\u0014\u001aI\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000RB\u0010\u001b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R-\u0010\u001e\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050*j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroUrlRequestBuilder;", "Lcom/margelo/nitro/nitrofetch/HybridUrlRequestBuilderSpec;", "engine", "Lorg/chromium/net/CronetEngine;", "url", "", "executor", "Ljava/util/concurrent/Executor;", "<init>", "(Lorg/chromium/net/CronetEngine;Ljava/lang/String;Ljava/util/concurrent/Executor;)V", "onRedirectReceivedCallback", "Lkotlin/Function2;", "Lcom/margelo/nitro/nitrofetch/UrlResponseInfo;", "Lkotlin/ParameterName;", "name", "info", "newLocationUrl", "", "onResponseStartedCallback", "Lkotlin/Function1;", "onReadCompletedCallback", "Lkotlin/Function3;", "Lcom/margelo/nitro/core/ArrayBuffer;", "byteBuffer", "", "bytesRead", "onSucceededCallback", "onFailedCallback", "Lcom/margelo/nitro/nitrofetch/RequestException;", "error", "onCanceledCallback", "builder", "Lorg/chromium/net/UrlRequest$Builder;", "Ljava/nio/ByteBuffer;", "devToolsEnabled", "", "devToolsRequestId", "devToolsBytes", "", "devToolsTextual", "httpMethod", "requestHeaders", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "uploadBodyString", "uploadBodyLength", "", "setHttpMethod", "addHeader", "value", "setUploadBody", "body", "Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String;", "disableCache", "disableCookies", "onSucceeded", "callback", "onFailed", "onCanceled", "onRedirectReceived", "onResponseStarted", "onReadCompleted", "build", "Lcom/margelo/nitro/nitrofetch/HybridUrlRequestSpec;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroUrlRequestBuilder extends HybridUrlRequestBuilderSpec {
    private final UrlRequest.Builder builder;
    private final ByteBuffer byteBuffer;
    private int devToolsBytes;
    private final boolean devToolsEnabled;
    private final String devToolsRequestId;
    private boolean devToolsTextual;
    private final CronetEngine engine;
    private final Executor executor;
    private String httpMethod;
    private Function1<? super UrlResponseInfo, Unit> onCanceledCallback;
    private Function2<? super UrlResponseInfo, ? super RequestException, Unit> onFailedCallback;
    private Function3<? super UrlResponseInfo, ? super ArrayBuffer, ? super Double, Unit> onReadCompletedCallback;
    private Function2<? super UrlResponseInfo, ? super String, Unit> onRedirectReceivedCallback;
    private Function1<? super UrlResponseInfo, Unit> onResponseStartedCallback;
    private Function1<? super UrlResponseInfo, Unit> onSucceededCallback;
    private final LinkedHashMap<String, String> requestHeaders;
    private long uploadBodyLength;
    private String uploadBodyString;
    private final String url;

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void disableCookies() {
    }

    public NitroUrlRequestBuilder(CronetEngine engine, String url, Executor executor) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.engine = engine;
        this.url = url;
        this.executor = executor;
        this.devToolsEnabled = false;
        this.devToolsRequestId = "";
        this.httpMethod = "GET";
        this.requestHeaders = new LinkedHashMap<>();
        this.uploadBodyString = "";
        final ArrayBuffer allocate = ArrayBuffer.INSTANCE.allocate(65536);
        this.byteBuffer = allocate.getBuffer(false);
        UrlRequest.Builder newUrlRequestBuilder = engine.newUrlRequestBuilder(url, new UrlRequest.Callback() { // from class: com.margelo.nitro.nitrofetch.NitroUrlRequestBuilder$cronetCallback$1
            @Override // org.chromium.net.UrlRequest.Callback
            public void onRedirectReceived(UrlRequest request, org.chromium.net.UrlResponseInfo info, String newLocationUrl) {
                Function2 function2;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(info, "info");
                Intrinsics.checkNotNullParameter(newLocationUrl, "newLocationUrl");
                function2 = NitroUrlRequestBuilder.this.onRedirectReceivedCallback;
                if (function2 != null) {
                    function2.invoke(CronetExtensionsKt.toNitro(info), newLocationUrl);
                }
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onResponseStarted(UrlRequest request, org.chromium.net.UrlResponseInfo info) {
                boolean z;
                Function1 function1;
                String str;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(info, "info");
                z = NitroUrlRequestBuilder.this.devToolsEnabled;
                if (z) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    List<Map.Entry<String, String>> allHeadersAsList = info.getAllHeadersAsList();
                    Intrinsics.checkNotNullExpressionValue(allHeadersAsList, "getAllHeadersAsList(...)");
                    Iterator<T> it = allHeadersAsList.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                    String str2 = (String) linkedHashMap.get("Content-Type");
                    if (str2 == null) {
                        str2 = (String) linkedHashMap.get(ApiConstant.HEADER_CONTENT_TYPE);
                    }
                    NitroUrlRequestBuilder.this.devToolsTextual = DevToolsReporter.INSTANCE.isTextualContentType(str2);
                    DevToolsReporter devToolsReporter = DevToolsReporter.INSTANCE;
                    str = NitroUrlRequestBuilder.this.devToolsRequestId;
                    String url2 = info.getUrl();
                    Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                    devToolsReporter.reportResponseStart(str, url2, info.getHttpStatusCode(), linkedHashMap, -1L);
                }
                function1 = NitroUrlRequestBuilder.this.onResponseStartedCallback;
                if (function1 != null) {
                    function1.invoke(CronetExtensionsKt.toNitro(info));
                }
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onReadCompleted(UrlRequest request, org.chromium.net.UrlResponseInfo info, ByteBuffer receivedBuffer) {
                boolean z;
                Function3 function3;
                int i;
                String str;
                boolean z2;
                String str2;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(info, "info");
                Intrinsics.checkNotNullParameter(receivedBuffer, "receivedBuffer");
                int position = receivedBuffer.position();
                z = NitroUrlRequestBuilder.this.devToolsEnabled;
                if (z && position > 0) {
                    NitroUrlRequestBuilder nitroUrlRequestBuilder = NitroUrlRequestBuilder.this;
                    i = nitroUrlRequestBuilder.devToolsBytes;
                    nitroUrlRequestBuilder.devToolsBytes = i + position;
                    DevToolsReporter devToolsReporter = DevToolsReporter.INSTANCE;
                    str = NitroUrlRequestBuilder.this.devToolsRequestId;
                    devToolsReporter.reportDataReceived(str, position);
                    z2 = NitroUrlRequestBuilder.this.devToolsTextual;
                    if (z2) {
                        ByteBuffer duplicate = receivedBuffer.duplicate();
                        duplicate.flip();
                        byte[] bArr = new byte[duplicate.remaining()];
                        duplicate.get(bArr);
                        DevToolsReporter devToolsReporter2 = DevToolsReporter.INSTANCE;
                        str2 = NitroUrlRequestBuilder.this.devToolsRequestId;
                        devToolsReporter2.storeResponseBodyIncremental(str2, new String(bArr, Charsets.UTF_8));
                    }
                }
                function3 = NitroUrlRequestBuilder.this.onReadCompletedCallback;
                if (function3 != null) {
                    function3.invoke(CronetExtensionsKt.toNitro(info), allocate, Double.valueOf(position));
                }
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onSucceeded(UrlRequest request, org.chromium.net.UrlResponseInfo info) {
                boolean z;
                Function1 function1;
                String str;
                int i;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(info, "info");
                z = NitroUrlRequestBuilder.this.devToolsEnabled;
                if (z) {
                    DevToolsReporter devToolsReporter = DevToolsReporter.INSTANCE;
                    str = NitroUrlRequestBuilder.this.devToolsRequestId;
                    i = NitroUrlRequestBuilder.this.devToolsBytes;
                    devToolsReporter.reportResponseEnd(str, i);
                }
                function1 = NitroUrlRequestBuilder.this.onSucceededCallback;
                if (function1 != null) {
                    function1.invoke(CronetExtensionsKt.toNitro(info));
                }
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest request, org.chromium.net.UrlResponseInfo info, CronetException error) {
                boolean z;
                Function2 function2;
                String str;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(error, "error");
                z = NitroUrlRequestBuilder.this.devToolsEnabled;
                if (z) {
                    DevToolsReporter devToolsReporter = DevToolsReporter.INSTANCE;
                    str = NitroUrlRequestBuilder.this.devToolsRequestId;
                    devToolsReporter.reportRequestFailed(str, false);
                }
                function2 = NitroUrlRequestBuilder.this.onFailedCallback;
                if (function2 != null) {
                    function2.invoke(info != null ? CronetExtensionsKt.toNitro(info) : null, CronetExtensionsKt.toNitro(error));
                }
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest request, org.chromium.net.UrlResponseInfo info) {
                boolean z;
                Function1 function1;
                String str;
                Intrinsics.checkNotNullParameter(request, "request");
                z = NitroUrlRequestBuilder.this.devToolsEnabled;
                if (z) {
                    DevToolsReporter devToolsReporter = DevToolsReporter.INSTANCE;
                    str = NitroUrlRequestBuilder.this.devToolsRequestId;
                    devToolsReporter.reportRequestFailed(str, true);
                }
                function1 = NitroUrlRequestBuilder.this.onCanceledCallback;
                if (function1 != null) {
                    function1.invoke(info != null ? CronetExtensionsKt.toNitro(info) : null);
                }
            }
        }, executor);
        Intrinsics.checkNotNullExpressionValue(newUrlRequestBuilder, "newUrlRequestBuilder(...)");
        this.builder = newUrlRequestBuilder;
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void setHttpMethod(String httpMethod) {
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.httpMethod = httpMethod;
        this.builder.setHttpMethod(httpMethod);
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void addHeader(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.requestHeaders.put(name, value);
        this.builder.addHeader(name, value);
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void setUploadBody(Variant_ArrayBuffer_String body) {
        final byte[] bytes;
        Intrinsics.checkNotNullParameter(body, "body");
        if (body instanceof Variant_ArrayBuffer_String.First) {
            ByteBuffer buffer = ((Variant_ArrayBuffer_String.First) body).getValue().getBuffer(true);
            bytes = new byte[buffer.remaining()];
            buffer.get(bytes);
        } else {
            if (!(body instanceof Variant_ArrayBuffer_String.Second)) {
                throw new NoWhenBranchMatchedException();
            }
            Variant_ArrayBuffer_String.Second second = (Variant_ArrayBuffer_String.Second) body;
            this.uploadBodyString = second.getValue();
            bytes = second.getValue().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        }
        this.uploadBodyLength = bytes.length;
        this.builder.setUploadDataProvider(new UploadDataProvider() { // from class: com.margelo.nitro.nitrofetch.NitroUrlRequestBuilder$setUploadBody$provider$1
            private int position;

            @Override // org.chromium.net.UploadDataProvider
            public long getLength() {
                return bytes.length;
            }

            @Override // org.chromium.net.UploadDataProvider
            public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
                Intrinsics.checkNotNullParameter(uploadDataSink, "uploadDataSink");
                Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                int min = Math.min(byteBuffer.remaining(), bytes.length - this.position);
                if (min > 0) {
                    byteBuffer.put(bytes, this.position, min);
                    this.position += min;
                }
                uploadDataSink.onReadSucceeded(false);
            }

            @Override // org.chromium.net.UploadDataProvider
            public void rewind(UploadDataSink uploadDataSink) {
                Intrinsics.checkNotNullParameter(uploadDataSink, "uploadDataSink");
                this.position = 0;
                uploadDataSink.onRewindSucceeded();
            }
        }, this.executor);
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void disableCache() {
        this.builder.disableCache();
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void onSucceeded(Function1<? super UrlResponseInfo, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onSucceededCallback = callback;
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void onFailed(Function2<? super UrlResponseInfo, ? super RequestException, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onFailedCallback = callback;
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void onCanceled(Function1<? super UrlResponseInfo, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onCanceledCallback = callback;
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void onRedirectReceived(Function2<? super UrlResponseInfo, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onRedirectReceivedCallback = callback;
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void onResponseStarted(Function1<? super UrlResponseInfo, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onResponseStartedCallback = callback;
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public void onReadCompleted(Function3<? super UrlResponseInfo, ? super ArrayBuffer, ? super Double, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onReadCompletedCallback = callback;
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestBuilderSpec
    public HybridUrlRequestSpec build() {
        UrlRequest build = this.builder.build();
        if (this.devToolsEnabled) {
            DevToolsReporter.INSTANCE.reportRequestStart(this.devToolsRequestId, this.url, this.httpMethod, this.requestHeaders, this.uploadBodyString, this.uploadBodyLength);
        }
        Intrinsics.checkNotNull(build);
        return new NitroUrlRequest(build, this.byteBuffer);
    }
}
