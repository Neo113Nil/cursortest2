package bo.app;

import com.braze.support.BrazeLogger;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ag implements u9 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f25255b = BrazeLogger.getBrazeLogTag((Class<?>) ag.class);

    /* renamed from: a, reason: collision with root package name */
    public final i f25256a;

    public ag(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject(EventKeys.DATA).getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(new tb(jSONArray2.getJSONObject(i11)));
            }
            arrayList.add(new ib(arrayList2));
        }
        this.f25256a = new i(arrayList);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f25256a.getKey());
            jSONObject.put(EventKeys.DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.e(f25255b, "Caught exception creating Json.", e10);
            return jSONObject;
        }
    }
}
