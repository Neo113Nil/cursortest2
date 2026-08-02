package X8;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class d {
    public static final ReadableMap b(Map map) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (Map.Entry entry : map.entrySet()) {
            javaOnlyMap.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return javaOnlyMap;
    }
}
