package com.braze.models;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class p implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final q f647a;
    public final double b;
    public Double c;
    public boolean d;

    public p(q sessionId, double d, Double d2, boolean z) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f647a = sessionId;
        this.b = d;
        ((n) this).c = d2;
        this.d = z;
    }

    public static final String a(double d, p pVar) {
        return "End time '" + d + "' for session is less than the start time '" + pVar.b + "' for this session.";
    }

    public static final String c() {
        return "Caught exception creating Session Json.";
    }

    public final long d() {
        Double e = e();
        if (e == null) {
            return -1L;
        }
        final double doubleValue = e.doubleValue();
        long j = (long) (doubleValue - this.b);
        if (j < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.models.p$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.a(doubleValue, this);
                }
            }, 6, (Object) null);
        }
        return j;
    }

    public Double e() {
        return this.c;
    }

    public final q f() {
        return this.f647a;
    }

    public final double g() {
        return this.b;
    }

    public final boolean h() {
        return this.d;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.f647a + ", startTime=" + this.b + ", endTime=" + e() + ", isSealed=" + this.d + ", duration=" + d() + ")";
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f647a);
            jSONObject.put("start_time", this.b);
            jSONObject.put("is_sealed", this.d);
            if (e() != null) {
                jSONObject.put(SDKConstants.PARAM_TOURNAMENTS_END_TIME, e());
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.p$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.c();
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }

    public p(JSONObject sessionData) {
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        String sessionId = sessionData.getString("session_id");
        Intrinsics.checkNotNullExpressionValue(sessionId, "getString(...)");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        UUID fromString = UUID.fromString(sessionId);
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        this.f647a = new q(fromString);
        this.b = sessionData.getDouble("start_time");
        this.d = sessionData.getBoolean("is_sealed");
        this.c = JsonUtils.getDoubleOrNull(sessionData, SDKConstants.PARAM_TOURNAMENTS_END_TIME);
    }
}
