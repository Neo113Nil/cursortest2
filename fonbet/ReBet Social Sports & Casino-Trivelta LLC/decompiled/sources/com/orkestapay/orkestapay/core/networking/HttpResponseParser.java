package com.orkestapay.orkestapay.core.networking;

import com.twilio.voice.EventGroupType;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\u000e"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/HttpResponseParser;", "", "()V", "getErrorStream", "Ljava/io/InputStream;", EventGroupType.CONNECTION_EVENT_GROUP, "Ljava/net/HttpURLConnection;", "getInputStream", "parse", "Lcom/orkestapay/orkestapay/core/networking/HttpResponse;", "parseInputStream", "", "inputStream", "Companion", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHttpResponseParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpResponseParser.kt\ncom/orkestapay/orkestapay/core/networking/HttpResponseParser\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n453#2:76\n403#2:77\n1238#3,4:78\n*S KotlinDebug\n*F\n+ 1 HttpResponseParser.kt\ncom/orkestapay/orkestapay/core/networking/HttpResponseParser\n*L\n19#1:76\n19#1:77\n19#1:78,4\n*E\n"})
/* loaded from: classes3.dex */
public final class HttpResponseParser {
    private static final int BUFFER_SIZE = 1024;
    private static final int EOF = -1;

    private final InputStream getErrorStream(HttpURLConnection connection) {
        InputStream errorStream = connection.getErrorStream();
        if (errorStream != null) {
            return Intrinsics.areEqual(connection.getContentEncoding(), "gzip") ? new GZIPInputStream(errorStream) : errorStream;
        }
        return null;
    }

    private final InputStream getInputStream(HttpURLConnection connection) {
        InputStream inputStream = connection.getInputStream();
        if (inputStream != null) {
            return Intrinsics.areEqual(connection.getContentEncoding(), "gzip") ? new GZIPInputStream(inputStream) : inputStream;
        }
        return null;
    }

    private final String parseInputStream(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                return new String(byteArray, UTF_8);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @NotNull
    public final HttpResponse parse(@NotNull HttpURLConnection connection) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(connection, "connection");
        int responseCode = connection.getResponseCode();
        Map<String, List<String>> headerFields = connection.getHeaderFields();
        Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(headerFields.size()));
        Iterator<T> it = headerFields.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            linkedHashMap.put(key, CollectionsKt.joinToString$default((Iterable) value, ", ", null, null, 0, null, null, 62, null));
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(getInputStream(connection));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m150exceptionOrNullimpl(m147constructorimpl) != null) {
            m147constructorimpl = Result.m147constructorimpl(getErrorStream(connection));
        }
        String str = null;
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        InputStream inputStream = (InputStream) m147constructorimpl;
        if (inputStream != null) {
            str = parseInputStream(inputStream);
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
        return new HttpResponse(responseCode, linkedHashMap, str, null, 8, null);
    }
}
