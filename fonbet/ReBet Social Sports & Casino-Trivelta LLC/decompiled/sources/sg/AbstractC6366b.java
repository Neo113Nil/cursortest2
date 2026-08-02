package sg;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: sg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6366b {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f64892a = Logger.getLogger(AbstractC6366b.class.getName());

    public static Object a(String str) {
        try {
            return str.startsWith("{") ? c(new JSONObject(str)) : str.startsWith("[") ? b(new JSONArray(str)) : str;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                arrayList.add(c((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(b((JSONArray) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Hashtable c(JSONObject jSONObject) {
        Hashtable hashtable = new Hashtable();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                hashtable.put(next, c((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                hashtable.put(next, b((JSONArray) obj));
            } else {
                hashtable.put(next, obj);
            }
        }
        return hashtable;
    }
}
