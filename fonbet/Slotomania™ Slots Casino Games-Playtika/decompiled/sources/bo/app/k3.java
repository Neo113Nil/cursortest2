package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public abstract class k3 implements c2 {
    private static final String c = BrazeLogger.getBrazeLogTag((Class<?>) k3.class);
    protected final List<c2> b;

    protected k3(List<c2> list) {
        this.b = list;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONArray getJsonObject() {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<c2> it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getJsonObject());
            }
        } catch (Exception e) {
            BrazeLogger.e(c, "Caught exception creating Json.", e);
        }
        return jSONArray;
    }
}
