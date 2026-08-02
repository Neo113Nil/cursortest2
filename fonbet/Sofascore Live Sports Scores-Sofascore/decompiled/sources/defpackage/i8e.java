package defpackage;

import com.ironsource.U3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i8e {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public i8e(JSONObject jSONObject) {
        jSONObject.getClass();
        String string = jSONObject.getString("name");
        string.getClass();
        this.a = string;
        String optString = jSONObject.optString(U3.i.X);
        optString.getClass();
        this.b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        optString2.getClass();
        this.d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                jSONObject2.getClass();
                arrayList.add(new wae(jSONObject2));
            }
        }
        this.c = arrayList;
    }
}
