package u1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import r4.k;
import s7.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final u f24011a = new u(17);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f24012b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f24013c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f24014d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                k.r(autoCloseable);
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }
}
