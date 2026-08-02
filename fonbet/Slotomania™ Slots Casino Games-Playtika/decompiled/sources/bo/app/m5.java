package bo.app;

import bo.app.o5;
import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0017\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0018B3\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020\u000e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010&\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b'\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R.\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001a8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0018\u0010\u001fR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lbo/app/m5;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "e", "Lbo/app/n3;", "z", "()Lbo/app/n3;", "", "toString", "Lbo/app/o5;", JsonStorageKeyNames.SESSION_ID_KEY, "Lbo/app/o5;", "n", "()Lbo/app/o5;", "", "startTime", "D", "x", "()D", "<set-?>", SDKConstants.PARAM_END_TIME, "Ljava/lang/Double;", "w", "()Ljava/lang/Double;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/Double;)V", "", "isSealed", "Z", "y", "()Z", "(Z)V", "", "v", "()J", "duration", "startTimeSeconds", "endTimeSeconds", "sealed", "<init>", "(Lbo/app/o5;DLjava/lang/Double;Z)V", "sessionData", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class m5 implements IPutIntoJson<JSONObject> {
    public static final a f = new a(null);
    private final o5 b;
    private final double c;
    private volatile Double d;
    private volatile boolean e;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lbo/app/m5$a;", "", "", "END_TIME_KEY", "Ljava/lang/String;", "IS_SEALED_KEY", "", "NIL_DURATION", "J", "SESSION_ID_KEY", "START_TIME_KEY", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ double b;
        final /* synthetic */ m5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(double d, m5 m5Var) {
            super(0);
            this.b = d;
            this.c = m5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "End time '" + this.b + "' for session is less than the start time '" + this.c.getC() + "' for this session.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception creating Session Json.";
        }
    }

    public m5(o5 sessionId, double d, Double d2, boolean z) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.b = sessionId;
        this.c = d;
        a(d2);
        this.e = z;
    }

    protected void a(Double d) {
        this.d = d;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getC() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, this.b);
            jSONObject.put("start_time", this.c);
            jSONObject.put("is_sealed", this.e);
            if (getD() != null) {
                jSONObject.put(SDKConstants.PARAM_TOURNAMENTS_END_TIME, getD());
                return jSONObject;
            }
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
        }
        return jSONObject;
    }

    /* renamed from: n, reason: from getter */
    public final o5 getB() {
        return this.b;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.b + ", startTime=" + this.c + ", endTime=" + getD() + ", isSealed=" + this.e + ", duration=" + v() + ')';
    }

    public final long v() {
        Double d = getD();
        if (d == null) {
            return -1L;
        }
        double doubleValue = d.doubleValue();
        long j = (long) (doubleValue - this.c);
        if (j < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(doubleValue, this), 2, (Object) null);
        }
        return j;
    }

    /* renamed from: w, reason: from getter */
    public Double getD() {
        return this.d;
    }

    /* renamed from: x, reason: from getter */
    public final double getC() {
        return this.c;
    }

    /* renamed from: y, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    public final n3 z() {
        return new n3(this.b, this.c, getD(), this.e);
    }

    protected final void a(boolean z) {
        this.e = z;
    }

    public m5(JSONObject sessionData) {
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        o5.a aVar = o5.d;
        String string = sessionData.getString(SDKAnalyticsEvents.PARAMETER_SESSION_ID);
        Intrinsics.checkNotNullExpressionValue(string, "sessionData.getString(SESSION_ID_KEY)");
        this.b = aVar.a(string);
        this.c = sessionData.getDouble("start_time");
        this.e = sessionData.getBoolean("is_sealed");
        a(JsonUtils.getDoubleOrNull(sessionData, SDKConstants.PARAM_TOURNAMENTS_END_TIME));
    }
}
