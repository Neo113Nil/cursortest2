package com.usercentrics.sdk.services.api.http;

import com.usercentrics.sdk.domain.api.http.HttpClient;
import com.usercentrics.sdk.domain.api.http.HttpDisposable;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: AndroidHttpClient.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0002J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0016JL\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J2\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001a0\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J,\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u001f\u001a\u00020\nH\u0016J$\u0010 \u001a\u00020\u00162\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010!\u001a\u00020\fH\u0002J\u001a\u0010\"\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\f\u0010%\u001a\u00020&*\u00020\fH\u0002J\f\u0010'\u001a\u00020\u0011*\u00020\fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/usercentrics/sdk/services/api/http/AndroidHttpClient;", "Lcom/usercentrics/sdk/domain/api/http/HttpClient;", "timeoutMillis", "", "dispatcher", "Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;", "(JLcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;)V", "defaultCharset", "Ljava/nio/charset/Charset;", "jsonUtf8", "", "createConnection", "Ljava/net/HttpURLConnection;", "rawUrl", "headers", "", "get", "Lcom/usercentrics/sdk/domain/api/http/HttpResponse;", "url", "Lcom/usercentrics/sdk/domain/api/http/HttpDisposable;", "onSuccess", "Lkotlin/Function1;", "", "onError", "", "mapResponseHeaders", "", "parseResponseBody", "responseBody", "", "post", "bodyData", "setHeaders", "connection", "writeStream", "outputStream", "Ljava/io/OutputStream;", "inputStreamOrErrorStream", "Ljava/io/InputStream;", "use", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidHttpClient implements HttpClient {
    private final Charset defaultCharset;
    private final Dispatcher dispatcher;
    private final String jsonUtf8;
    private final long timeoutMillis;

    public AndroidHttpClient(long j, Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.timeoutMillis = j;
        this.dispatcher = dispatcher;
        Charset charset = Charsets.UTF_8;
        this.defaultCharset = charset;
        this.jsonUtf8 = "application/json; charset=" + charset.name();
    }

    public /* synthetic */ AndroidHttpClient(long j, Dispatcher dispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 10000L : j, dispatcher);
    }

    @Override // com.usercentrics.sdk.domain.api.http.HttpClient
    public HttpResponse get(String url, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        HttpURLConnection createConnection = createConnection(url, headers);
        createConnection.setRequestMethod("GET");
        return use(createConnection);
    }

    @Override // com.usercentrics.sdk.domain.api.http.HttpClient
    public HttpDisposable get(String url, Map<String, String> headers, Function1<? super HttpResponse, Unit> onSuccess, final Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        final HttpURLConnection createConnection = createConnection(url, headers);
        createConnection.setRequestMethod("GET");
        this.dispatcher.dispatch(new AndroidHttpClient$get$2(onSuccess, this, createConnection, null)).onFailure(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.services.api.http.AndroidHttpClient$get$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                onError.invoke(it);
            }
        });
        return new HttpDisposable(new Function0<Unit>() { // from class: com.usercentrics.sdk.services.api.http.AndroidHttpClient$get$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                createConnection.disconnect();
            }
        });
    }

    @Override // com.usercentrics.sdk.domain.api.http.HttpClient
    public String post(String url, Map<String, String> headers, String bodyData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(bodyData, "bodyData");
        HttpURLConnection createConnection = createConnection(url, headers);
        createConnection.setDoOutput(true);
        createConnection.setRequestMethod("POST");
        createConnection.setRequestProperty("Content-Type", this.jsonUtf8);
        writeStream(bodyData, createConnection.getOutputStream());
        return use(createConnection).getBody();
    }

    private final HttpURLConnection createConnection(String rawUrl, Map<String, String> headers) {
        URLConnection openConnection = new URL(rawUrl).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout((int) this.timeoutMillis);
        httpURLConnection.setReadTimeout((int) this.timeoutMillis);
        setHeaders(headers, httpURLConnection);
        httpURLConnection.setRequestProperty("Accept", this.jsonUtf8);
        return httpURLConnection;
    }

    private final void setHeaders(Map<String, String> headers, HttpURLConnection connection) {
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            connection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Unit] */
    public final HttpResponse use(HttpURLConnection httpURLConnection) {
        HttpURLConnection httpURLConnection2;
        HttpResponse httpResponse;
        try {
            try {
                httpURLConnection.connect();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
                httpResponse = new HttpResponse(mapResponseHeaders(headerFields), parseResponseBody(ByteStreamsKt.readBytes(inputStreamOrErrorStream(httpURLConnection))), httpURLConnection.getResponseCode());
                try {
                    Result.Companion companion = Result.INSTANCE;
                    inputStreamOrErrorStream(httpURLConnection).close();
                    Result.m11180constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m11180constructorimpl(ResultKt.createFailure(th));
                }
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    httpURLConnection.disconnect();
                    ?? r8 = Unit.INSTANCE;
                    Result.m11180constructorimpl(r8);
                    httpURLConnection = r8;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    ?? createFailure = ResultKt.createFailure(th2);
                    Result.m11180constructorimpl(createFailure);
                    httpURLConnection = createFailure;
                }
            } finally {
            }
        } catch (FileNotFoundException unused) {
            HttpResponse httpResponse2 = new HttpResponse(null, null, 403, 3, null);
            try {
                Result.Companion companion5 = Result.INSTANCE;
                inputStreamOrErrorStream(httpURLConnection).close();
                Result.m11180constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m11180constructorimpl(ResultKt.createFailure(th3));
            }
            try {
                Result.Companion companion7 = Result.INSTANCE;
                httpURLConnection.disconnect();
                ?? r82 = Unit.INSTANCE;
                Result.m11180constructorimpl(r82);
                httpURLConnection2 = r82;
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                ?? createFailure2 = ResultKt.createFailure(th4);
                Result.m11180constructorimpl(createFailure2);
                httpURLConnection2 = createFailure2;
            }
            httpResponse = httpResponse2;
            httpURLConnection = httpURLConnection2;
        }
        return httpResponse;
    }

    private final InputStream inputStreamOrErrorStream(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        String str;
        if (httpURLConnection.getResponseCode() < 400) {
            errorStream = httpURLConnection.getInputStream();
            str = "getInputStream(...)";
        } else {
            errorStream = httpURLConnection.getErrorStream();
            str = "getErrorStream(...)";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, str);
        return errorStream;
    }

    private final String parseResponseBody(byte[] responseBody) {
        return new String(responseBody, Charsets.UTF_8);
    }

    private final void writeStream(String bodyData, OutputStream outputStream) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bytes = bodyData.getBytes(this.defaultCharset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        if (outputStream != null) {
            outputStream.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r2 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Map<String, String> mapResponseHeaders(Map<String, ? extends List<String>> headers) {
        String str;
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, ? extends List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            String str2 = "";
            if (key != null) {
                str = key.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            str = "";
            String str3 = (String) CollectionsKt.firstOrNull((List) entry.getValue());
            if (str3 != null) {
                str2 = str3;
            }
            arrayList.add(TuplesKt.to(str, str2));
        }
        return MapsKt.toMap(arrayList);
    }
}
