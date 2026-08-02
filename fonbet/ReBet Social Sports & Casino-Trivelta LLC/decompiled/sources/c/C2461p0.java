package c;

import com.twilio.voice.EventKeys;
import java.util.concurrent.TimeUnit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import zendesk.core.Constants;

/* renamed from: c.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2461p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26652a;

    /* renamed from: b, reason: collision with root package name */
    public final OkHttpClient f26653b;

    public C2461p0(String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.f26652a = baseUrl;
        this.f26653b = new OkHttpClient.Builder().callTimeout(5L, TimeUnit.SECONDS).build();
    }

    public final String a(String jwt) {
        String string;
        Intrinsics.checkNotNullParameter(jwt, "jwt");
        try {
            Response execute = this.f26653b.newCall(new Request.Builder().url(this.f26652a + "/geolocation/client-ip").header(Constants.AUTHORIZATION_HEADER, "Bearer ".concat(jwt)).header(Constants.ACCEPT_HEADER, "application/json").get().build()).execute();
            try {
                if (!execute.isSuccessful()) {
                    CloseableKt.closeFinally(execute, null);
                    return null;
                }
                ResponseBody body = execute.body();
                if (body != null && (string = body.string()) != null) {
                    JSONObject optJSONObject = new JSONObject(string).optJSONObject(EventKeys.DATA);
                    String str = "";
                    String optString = optJSONObject != null ? optJSONObject.optString(EventKeys.IP, "") : null;
                    if (optString != null) {
                        Intrinsics.checkNotNull(optString);
                        str = optString;
                    }
                    if (str.length() == 0) {
                        str = null;
                    }
                    CloseableKt.closeFinally(execute, null);
                    return str;
                }
                CloseableKt.closeFinally(execute, null);
                return null;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
