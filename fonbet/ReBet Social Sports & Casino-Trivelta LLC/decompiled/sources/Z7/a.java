package Z7;

import V7.k;
import com.twilio.voice.EventKeys;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0306a f14725d = new C0306a(null);

    /* renamed from: a, reason: collision with root package name */
    public String f14726a;

    /* renamed from: b, reason: collision with root package name */
    public String f14727b;

    /* renamed from: c, reason: collision with root package name */
    public Long f14728c;

    /* renamed from: Z7.a$a, reason: collision with other inner class name */
    public static final class C0306a {
        public /* synthetic */ C0306a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0306a() {
        }
    }

    public a(String str) {
        this.f14728c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f14727b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l10 = this.f14728c;
        if (l10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f14726a = stringBuffer2;
    }

    public final void a() {
        k kVar = k.f12578a;
        k.d(this.f14726a);
    }

    public final int b(a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l10 = this.f14728c;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = data.f14728c;
        if (l11 == null) {
            return 1;
        }
        return Intrinsics.compare(l11.longValue(), longValue);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f14728c;
            if (l10 != null) {
                jSONObject.put(EventKeys.TIMESTAMP, l10);
            }
            jSONObject.put(EventKeys.ERROR_MESSAGE_KEY, this.f14727b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d() {
        if (isValid()) {
            k kVar = k.f12578a;
            k.t(this.f14726a, toString());
        }
    }

    public final boolean isValid() {
        return (this.f14727b == null || this.f14728c == null) ? false : true;
    }

    public String toString() {
        JSONObject c10 = c();
        if (c10 == null) {
            return super.toString();
        }
        String jSONObject = c10.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "params.toString()");
        return jSONObject;
    }

    public a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f14726a = name;
        JSONObject r10 = k.r(name, true);
        if (r10 != null) {
            this.f14728c = Long.valueOf(r10.optLong(EventKeys.TIMESTAMP, 0L));
            this.f14727b = r10.optString(EventKeys.ERROR_MESSAGE_KEY, null);
        }
    }
}
