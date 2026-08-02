package bo.app;

import android.net.TrafficStats;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.google.android.exoplayer2.C;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\bH\u0002JP\u0010\u000b\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\b0\u000f2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0014"}, d2 = {"Lbo/app/t1;", "Lbo/app/i2;", "Ljava/net/URL;", "url", "Lorg/json/JSONObject;", "payload", "", "", "Lcom/braze/communication/HttpHeaders;", "headers", "Ljava/net/HttpURLConnection;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/a5;", "requestTarget", "requestHeaders", "Lkotlin/Pair;", "", "socketTimeout", "<init>", "(I)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class t1 implements i2 {
    public static final a b = new a(null);
    private static final int c = (int) TimeUnit.SECONDS.toMillis(15);
    private final int a;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lbo/app/t1$a;", "", "Ljava/net/HttpURLConnection;", "connection", "Ljava/io/InputStream;", Constants.BRAZE_PUSH_CONTENT_KEY, "", "CONNECTION_ESTABLISHED_TIMEOUT_MS", "I", "getCONNECTION_ESTABLISHED_TIMEOUT_MS$annotations", "()V", "", "GZIP", "Ljava/lang/String;", "UTF_8", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InputStream a(HttpURLConnection connection) {
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode / 100 == 2) {
                return StringsKt.equals("gzip", connection.getContentEncoding(), true) ? new GZIPInputStream(connection.getInputStream()) : new BufferedInputStream(connection.getInputStream());
            }
            throw new o3("Bad HTTP response code from Braze: [" + responseCode + "] to url: " + connection.getURL());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ JSONException b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JSONException jSONException) {
            super(0);
            this.b = jSONException;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to parse json response from server. Response: [" + this.b + AbstractJsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ URL b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(URL url) {
            super(0);
            this.b = url;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get result from [" + this.b + "].";
        }
    }

    public t1(int i) {
        this.a = i;
    }

    @Override // bo.app.i2
    public Pair<JSONObject, Map<String, String>> a(a5 requestTarget, Map<String, String> requestHeaders, JSONObject payload) {
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        URL c2 = requestTarget.getC();
        try {
            HttpURLConnection a2 = a(c2, payload, requestHeaders);
            Reader inputStreamReader = new InputStreamReader(b.a(a2), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                JSONObject jSONObject = new JSONObject(readText);
                Map<String, List<String>> headerFields = a2.getHeaderFields();
                Intrinsics.checkNotNullExpressionValue(headerFields, "connection.headerFields");
                return new Pair<>(jSONObject, v1.a(headerFields));
            } finally {
            }
        } catch (IOException e) {
            throw new o3("Failed request to [" + c2 + "], with message: [" + ((Object) e.getMessage()) + AbstractJsonLexerKt.END_LIST, e);
        } catch (JSONException e2) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.E, (Throwable) null, new b(e2), 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new c(c2), 2, (Object) null);
            throw new RuntimeException("Failed to get result from [" + c2 + AbstractJsonLexerKt.END_LIST);
        }
    }

    private final HttpURLConnection a(URL url, JSONObject payload, Map<String, String> headers) {
        String jSONObject = payload.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "payload.toString()");
        Charset forName = Charset.forName(C.UTF8_NAME);
        Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
        byte[] bytes = jSONObject.getBytes(forName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        HttpURLConnection a2 = v6.a.a(url);
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            a2.setRequestProperty(entry.getKey(), entry.getValue());
        }
        a2.setConnectTimeout(c);
        a2.setReadTimeout(this.a);
        a2.setUseCaches(false);
        a2.setInstanceFollowRedirects(false);
        a2.setRequestMethod("POST");
        a2.setDoOutput(true);
        a2.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = a2.getOutputStream();
        try {
            outputStream.write(bytes);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStream, null);
            return a2;
        } finally {
        }
    }
}
