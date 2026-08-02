package T7;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public static final O f11030a = new O();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f11031b = new ConcurrentHashMap();

    public static final JSONObject a(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return (JSONObject) f11031b.get(accessToken);
    }

    public static final void b(String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        f11031b.put(key, value);
    }
}
