package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001e"}, d2 = {"Lbo/app/b5;", "Lbo/app/p2;", "Lorg/json/JSONObject;", "e", "", "startTime", "J", "c", "()J", SDKConstants.PARAM_END_TIME, "h", "", "priority", "I", "u", "()I", "delayInSeconds", "g", "timeoutInMilliseconds", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/l2;", "reEligibilityConfig", "Lbo/app/l2;", Constants.BRAZE_PUSH_TITLE_KEY, "()Lbo/app/l2;", "minSecondsSinceLastTrigger", "l", "json", "<init>", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class b5 implements p2 {
    public static final a i = new a(null);
    private final long b;
    private final long c;
    private final int d;
    private final int e;
    private final int f;
    private final l2 g;
    private final int h;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0016"}, d2 = {"Lbo/app/b5$a;", "", "", "DEFAULT_DELAY", "I", "", "DEFAULT_END_TIME", "J", "DEFAULT_MIN_SECONDS_SINCE_LAST", "DEFAULT_PRIORITY", "DEFAULT_START_TIME", "DEFAULT_TIMEOUT", "", "DELAY", "Ljava/lang/String;", "END_TIME", "MIN_SECONDS_SINCE_LAST", "PRIORITY", "START_TIME", "TIMEOUT", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not convert ScheduleConfig to JSON";
        }
    }

    public b5(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.b = json.optLong("start_time", -1L);
        this.c = json.optLong(SDKConstants.PARAM_TOURNAMENTS_END_TIME, -1L);
        this.d = json.optInt("priority", 0);
        this.h = json.optInt("min_seconds_since_last_trigger", -1);
        this.e = json.optInt("delay", 0);
        this.f = json.optInt("timeout", -1);
        this.g = new p4(json);
    }

    @Override // bo.app.p2
    /* renamed from: a, reason: from getter */
    public int getF() {
        return this.f;
    }

    @Override // bo.app.p2
    /* renamed from: c, reason: from getter */
    public long getB() {
        return this.b;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getJsonObject() {
        try {
            JSONObject jsonObject = getG().getJsonObject();
            if (jsonObject == null) {
                return null;
            }
            jsonObject.put("start_time", getB());
            jsonObject.put(SDKConstants.PARAM_TOURNAMENTS_END_TIME, getC());
            jsonObject.put("priority", getD());
            jsonObject.put("min_seconds_since_last_trigger", getH());
            jsonObject.put("timeout", getF());
            jsonObject.put("delay", getE());
            return jsonObject;
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
            return null;
        }
    }

    @Override // bo.app.p2
    /* renamed from: g, reason: from getter */
    public int getE() {
        return this.e;
    }

    @Override // bo.app.p2
    /* renamed from: h, reason: from getter */
    public long getC() {
        return this.c;
    }

    @Override // bo.app.p2
    /* renamed from: l, reason: from getter */
    public int getH() {
        return this.h;
    }

    @Override // bo.app.p2
    /* renamed from: t, reason: from getter */
    public l2 getG() {
        return this.g;
    }

    @Override // bo.app.p2
    /* renamed from: u, reason: from getter */
    public int getD() {
        return this.d;
    }
}
