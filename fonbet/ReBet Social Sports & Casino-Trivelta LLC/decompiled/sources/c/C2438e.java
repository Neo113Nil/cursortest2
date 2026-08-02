package c;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import com.surt.guardian.GuardianSDK;
import com.surt.guardian.utils.Logger;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2438e {

    /* renamed from: d, reason: collision with root package name */
    public static final Dc.d f26546d = new Dc.d(null);

    /* renamed from: e, reason: collision with root package name */
    public static final MediaType f26547e = MediaType.INSTANCE.get("application/json; charset=utf-8");

    /* renamed from: a, reason: collision with root package name */
    public final String f26548a;

    /* renamed from: b, reason: collision with root package name */
    public final Ph.P f26549b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f26550c;

    public C2438e(String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.f26548a = baseUrl;
        this.f26549b = Ph.Q.a(C1452g0.b());
        this.f26550c = LazyKt.lazy(G0.f26428d);
    }

    public static final void b(C2438e c2438e, C2446i c2446i) {
        c2438e.getClass();
        try {
            ((OkHttpClient) c2438e.f26550c.getValue()).newCall(new Request.Builder().url(c2438e.f26548a + "/sdk/telemetry").header("X-SDK-Version", c2446i.g()).post(RequestBody.INSTANCE.create(c2438e.a(c2446i), f26547e)).build()).enqueue(new O0(c2446i));
        } catch (Exception e10) {
            Logger.f41582a.a("TelemetryClient", "Error sending telemetry: " + e10.getMessage());
        }
    }

    public static void c(C2438e c2438e, String reason) {
        c2438e.getClass();
        Intrinsics.checkNotNullParameter(GuardianSDK.VERSION, "sdkVersion");
        Intrinsics.checkNotNullParameter(reason, "reason");
        c2438e.d("attestation_failure", GuardianSDK.VERSION, reason, null, null);
    }

    public final String a(C2446i c2446i) {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(EventKeys.CALL_MESSAGE_EVENT_TYPE, c2446i.d()), TuplesKt.to(EventKeys.SDK_VERSION_KEY, c2446i.g()), TuplesKt.to(PublisherMetadata.DEVICE_MODEL, c2446i.a()), TuplesKt.to(PublisherMetadata.OS_VERSION, c2446i.f()), TuplesKt.to(EventKeys.TIMESTAMP, Long.valueOf(c2446i.h())));
        String b10 = c2446i.b();
        if (b10 != null) {
            mutableMapOf.put(EventKeys.ERROR_MESSAGE_KEY, b10);
        }
        String c10 = c2446i.c();
        if (c10 != null) {
            mutableMapOf.put("error_stack_trace", StringsKt.take(c10, 1000));
        }
        Map e10 = c2446i.e();
        if (e10 != null) {
            mutableMapOf.put("metadata", e10);
        }
        return "{" + CollectionsKt.joinToString$default(mutableMapOf.entrySet(), ",", null, null, 0, null, new R0(this), 30, null) + '}';
    }

    public final void d(String eventType, String sdkVersion, String str, String str2, Map map) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        AbstractC1459k.d(this.f26549b, null, null, new L0(eventType, sdkVersion, str, str2, map, this, null), 3, null);
    }

    public final void e(Map map) {
        Intrinsics.checkNotNullParameter(GuardianSDK.VERSION, "sdkVersion");
        d("sdk_initialized", GuardianSDK.VERSION, null, null, map);
    }
}
