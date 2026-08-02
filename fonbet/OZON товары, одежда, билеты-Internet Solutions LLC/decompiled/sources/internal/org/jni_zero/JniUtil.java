package internal.org.jni_zero;

import android.util.ArrayMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class JniUtil {
    @CalledByNative
    private static Map<Object, Object> arrayToMap(Object[] objArr) {
        int length = objArr.length;
        ArrayMap arrayMap = new ArrayMap(length / 2);
        for (int i11 = 0; i11 < length; i11 += 2) {
            arrayMap.put(objArr[i11], objArr[i11 + 1]);
        }
        return arrayMap;
    }

    @CalledByNative
    private static Object[] mapToArray(Map<Object, Object> map) {
        Object[] objArr = new Object[map.size() * 2];
        int i11 = 0;
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            int i12 = i11 + 1;
            objArr[i11] = entry.getKey();
            i11 += 2;
            objArr[i12] = entry.getValue();
        }
        return objArr;
    }
}
