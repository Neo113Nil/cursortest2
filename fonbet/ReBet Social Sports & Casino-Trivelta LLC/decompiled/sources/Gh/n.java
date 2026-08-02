package Gh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4155b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Map f4156a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(JSONObject obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = obj.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "obj.keys()");
            while (keys.hasNext()) {
                String key = keys.next();
                Object obj2 = obj.get(key);
                if (obj2 instanceof JSONArray) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = (JSONArray) obj2;
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        Object obj3 = jSONArray.get(i10);
                        if (obj3 instanceof JSONArray) {
                            JSONArray jSONArray2 = (JSONArray) obj3;
                            if (jSONArray2.length() == 2) {
                                ArrayList arrayList2 = new ArrayList();
                                Object obj4 = jSONArray2.get(0);
                                Intrinsics.checkNotNullExpressionValue(obj4, "item.get(0)");
                                arrayList2.add(obj4);
                                Object obj5 = jSONArray2.get(1);
                                Intrinsics.checkNotNullExpressionValue(obj5, "item.get(1)");
                                arrayList2.add(obj5);
                                arrayList.add(arrayList2);
                            }
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    linkedHashMap.put(key, arrayList);
                }
            }
            return new n(linkedHashMap);
        }

        public a() {
        }
    }

    public n(Map hours) {
        Intrinsics.checkNotNullParameter(hours, "hours");
        this.f4156a = hours;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.f4156a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : (List) value) {
                    if (obj instanceof List) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            jSONArray2.put(it.next());
                        }
                        jSONArray.put(jSONArray2);
                    }
                }
                jSONObject.put(str, jSONArray);
            }
        }
        return jSONObject;
    }
}
