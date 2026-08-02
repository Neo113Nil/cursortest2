package ug;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ug.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6574b {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f66640a = Logger.getLogger(AbstractC6574b.class.getName());

    public static JSONArray a(ArrayList arrayList, boolean z10) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Hashtable) {
                jSONArray.put(b((Hashtable) next, z10));
            } else if (next instanceof ArrayList) {
                jSONArray.put(a((ArrayList) next, z10));
            } else if (next instanceof Map) {
                jSONArray.put(c((Map) next, z10));
            } else {
                if (z10) {
                    next = "" + next;
                }
                jSONArray.put(next);
            }
        }
        return jSONArray;
    }

    public static JSONObject b(Hashtable hashtable, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            Object obj = hashtable.get(nextElement);
            if (obj instanceof Hashtable) {
                jSONObject.put("" + nextElement, b((Hashtable) obj, z10));
            } else if (obj instanceof ArrayList) {
                jSONObject.put("" + nextElement, a((ArrayList) obj, z10));
            } else if (obj instanceof Map) {
                jSONObject.put("" + nextElement, c((Map) obj, z10));
            } else {
                String str = "" + nextElement;
                if (z10) {
                    obj = "" + obj;
                }
                jSONObject.put(str, obj);
            }
        }
        return jSONObject;
    }

    public static JSONObject c(Map map, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 instanceof Hashtable) {
                jSONObject.put("" + obj, b((Hashtable) obj2, z10));
            } else if (obj2 instanceof Map) {
                jSONObject.put("" + obj, c((Map) obj2, z10));
            } else if (obj2 instanceof ArrayList) {
                jSONObject.put("" + obj, a((ArrayList) obj2, z10));
            } else {
                String str = "" + obj;
                if (z10) {
                    obj2 = "" + obj2;
                }
                jSONObject.put(str, obj2);
            }
        }
        return jSONObject;
    }

    public static Object d(String str) {
        try {
            return str.startsWith("{") ? f(new JSONObject(str)) : str.startsWith("[") ? e(new JSONArray(str)) : str;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                arrayList.add(f((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(e((JSONArray) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Hashtable f(JSONObject jSONObject) {
        Hashtable hashtable = new Hashtable();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                hashtable.put(next, f((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                hashtable.put(next, e((JSONArray) obj));
            } else {
                hashtable.put(next, obj);
            }
        }
        return hashtable;
    }

    public static String g(Object obj) {
        try {
            return obj instanceof Hashtable ? b((Hashtable) obj, false).toString() : obj instanceof ArrayList ? a((ArrayList) obj, false).toString() : obj instanceof Map ? c((Map) obj, false).toString() : obj.toString();
        } catch (Exception e10) {
            f66640a.log(Level.FINE, "Error inside getString obj=" + obj, (Throwable) e10);
            return null;
        }
    }
}
