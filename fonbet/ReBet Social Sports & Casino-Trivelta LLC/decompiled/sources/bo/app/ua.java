package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class ua implements f9 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f26112b = BrazeLogger.getBrazeLogTag((Class<?>) ua.class);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f26113a;

    public ua(ArrayList arrayList) {
        this.f26113a = arrayList;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONArray getJsonObject() {
        JSONArray jSONArray = new JSONArray();
        try {
            ArrayList arrayList = this.f26113a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jSONArray.put(((f9) obj).getJsonObject());
            }
            return jSONArray;
        } catch (Exception e10) {
            BrazeLogger.e(f26112b, "Caught exception creating Json.", e10);
            return jSONArray;
        }
    }
}
