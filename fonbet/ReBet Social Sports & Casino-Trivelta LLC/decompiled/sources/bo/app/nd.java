package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.twilio.voice.EventKeys;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nd implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final long f25826a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25827b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25828c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25829d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25830e;

    /* renamed from: f, reason: collision with root package name */
    public final vc f25831f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25832g;

    public nd(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f25826a = json.optLong("start_time", -1L);
        this.f25827b = json.optLong("end_time", -1L);
        this.f25828c = json.optInt(EventKeys.PRIORITY, 0);
        this.f25832g = json.optInt("min_seconds_since_last_trigger", -1);
        this.f25829d = json.optInt("delay", 0);
        this.f25830e = json.optInt("timeout", -1);
        this.f25831f = new vc(json);
    }

    public static final String b() {
        return "Could not convert ScheduleConfig to JSON";
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        try {
            JSONObject propertiesJSONObject = this.f25831f.getPropertiesJSONObject();
            if (propertiesJSONObject == null) {
                return null;
            }
            propertiesJSONObject.put("start_time", this.f25826a);
            propertiesJSONObject.put("end_time", this.f25827b);
            propertiesJSONObject.put(EventKeys.PRIORITY, this.f25828c);
            propertiesJSONObject.put("min_seconds_since_last_trigger", this.f25832g);
            propertiesJSONObject.put("timeout", this.f25830e);
            propertiesJSONObject.put("delay", this.f25829d);
            return propertiesJSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.S6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.nd.b();
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
