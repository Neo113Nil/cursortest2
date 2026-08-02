package cc;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2909a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2909a f27699a = new C2909a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f27700b = C2909a.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f27701c = new ThreadLocal();

    public final void a() {
        try {
            f27701c.remove();
        } catch (Exception e10) {
            Log.w(f27700b, "Failed to clear cipher cache: " + e10.getMessage());
        }
    }

    public final Cipher b(String transformation) {
        Cipher cipher;
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        synchronized (this) {
            try {
                ThreadLocal threadLocal = f27701c;
                Map map = (Map) threadLocal.get();
                if (map == null) {
                    map = new LinkedHashMap();
                    threadLocal.set(map);
                }
                Object obj = map.get(transformation);
                if (obj == null) {
                    obj = Cipher.getInstance(transformation);
                    Intrinsics.checkNotNullExpressionValue(obj, "getInstance(...)");
                    map.put(transformation, obj);
                }
                cipher = (Cipher) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }
}
