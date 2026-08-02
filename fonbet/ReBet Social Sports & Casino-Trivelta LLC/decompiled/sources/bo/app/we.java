package bo.app;

import bo.app.we;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class we implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final ye f26205a;

    /* renamed from: b, reason: collision with root package name */
    public final double f26206b;

    /* renamed from: c, reason: collision with root package name */
    public Double f26207c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26208d;

    public we(ye sessionId, double d10, Double d11, boolean z10) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f26205a = sessionId;
        this.f26206b = d10;
        ((za) this).f26207c = d11;
        this.f26208d = z10;
    }

    public static final String a(double d10, we weVar) {
        return "End time '" + d10 + "' for session is less than the start time '" + weVar.f26206b + "' for this session.";
    }

    public static final String b() {
        return "Caught exception creating Session Json.";
    }

    public final long c() {
        Double d10 = d();
        if (d10 == null) {
            return -1L;
        }
        final double doubleValue = d10.doubleValue();
        long j10 = (long) (doubleValue - this.f26206b);
        if (j10 < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.Kb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return we.a(doubleValue, this);
                }
            }, 6, (Object) null);
        }
        return j10;
    }

    public Double d() {
        return this.f26207c;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.f26205a + ", startTime=" + this.f26206b + ", endTime=" + d() + ", isSealed=" + this.f26208d + ", duration=" + c() + ")";
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f26205a);
            jSONObject.put("start_time", this.f26206b);
            jSONObject.put("is_sealed", this.f26208d);
            if (d() == null) {
                return jSONObject;
            }
            jSONObject.put("end_time", d());
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Lb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return we.b();
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }

    public we(JSONObject sessionData) {
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        String sessionId = sessionData.getString("session_id");
        Intrinsics.checkNotNullExpressionValue(sessionId, "getString(...)");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        UUID fromString = UUID.fromString(sessionId);
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        this.f26205a = new ye(fromString);
        this.f26206b = sessionData.getDouble("start_time");
        this.f26208d = sessionData.getBoolean("is_sealed");
        this.f26207c = JsonUtils.getDoubleOrNull(sessionData, "end_time");
    }
}
