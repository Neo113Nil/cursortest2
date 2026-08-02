package Na;

import Oa.i;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f7986a = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: b, reason: collision with root package name */
    public static final Map f7987b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final i f7988c = new i("PlayCoreVersion");

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map b10 = b();
        bundle.putInt("playcore_version_code", ((Integer) b10.get("java")).intValue());
        if (b10.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b10.get("native")).intValue());
        }
        if (b10.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b10.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b() {
        Map map;
        synchronized (h.class) {
            map = f7987b;
            map.put("java", 11004);
        }
        return map;
    }
}
