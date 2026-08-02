package bo.app;

import android.net.TrafficStats;
import com.braze.support.BrazeLogger;
import com.twilio.voice.VoiceURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w8 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f26195b = (int) TimeUnit.SECONDS.toMillis(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f26196a;

    public w8(int i10) {
        this.f26196a = i10;
    }

    public final n9 a(final kd requestTarget, Map requestHeaders, JSONObject payload) {
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        TrafficStats.setThreadStatsTag(1337);
        URL url = requestTarget.f25669c;
        Map emptyMap = MapsKt.emptyMap();
        int i10 = -1;
        try {
            HttpURLConnection a10 = a(url, payload, requestHeaders);
            i10 = a10.getResponseCode();
            Map<String, List<String>> headerFields = a10.getHeaderFields();
            Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
            emptyMap = com.braze.support.h.a(headerFields);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(v8.a(a10), Charsets.UTF_8), 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return new n9(i10, emptyMap, new JSONObject(readText));
            } finally {
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Jb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.w8.a(bo.app.kd.this);
                }
            }, 4, (Object) null);
            return new n9(i10, emptyMap, 4);
        }
    }

    public static final String a(kd kdVar) {
        return "Failed request to [" + kdVar + "]";
    }

    public final HttpURLConnection a(URL url, JSONObject payload, Map headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(headers, "headers");
        String jSONObject = payload.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        byte[] bytes = jSONObject.getBytes(forName);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        HttpURLConnection a10 = wg.f26209a.a(url);
        for (Map.Entry entry : headers.entrySet()) {
            a10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        a10.setConnectTimeout(f26195b);
        a10.setReadTimeout(this.f26196a);
        a10.setUseCaches(false);
        a10.setInstanceFollowRedirects(false);
        a10.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
        a10.setDoOutput(true);
        a10.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = a10.getOutputStream();
        try {
            outputStream.write(bytes);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStream, null);
            return a10;
        } finally {
        }
    }
}
