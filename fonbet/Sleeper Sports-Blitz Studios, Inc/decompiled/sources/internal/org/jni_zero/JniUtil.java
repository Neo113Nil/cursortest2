package internal.org.jni_zero;

import android.util.ArrayMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class JniUtil {
    private static Object[] mapToArray(Map<Object, Object> map) {
        Object[] objArr = new Object[map.size() * 2];
        int i = 0;
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            int i2 = i + 1;
            objArr[i] = entry.getKey();
            i += 2;
            objArr[i2] = entry.getValue();
        }
        return objArr;
    }

    private static Map<Object, Object> arrayToMap(Object[] array) {
        int length = array.length;
        ArrayMap arrayMap = new ArrayMap(length / 2);
        for (int i = 0; i < length; i += 2) {
            arrayMap.put(array[i], array[i + 1]);
        }
        return arrayMap;
    }
}
