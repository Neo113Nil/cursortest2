package l2;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import m3.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final f f19336c = new f(27);

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f19337d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f19338a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.network.b f19339b;

    public a(String filename, boolean z5) {
        ReentrantLock reentrantLock;
        Intrinsics.checkNotNullParameter(filename, "filename");
        synchronized (f19336c) {
            try {
                LinkedHashMap linkedHashMap = f19337d;
                Object obj = linkedHashMap.get(filename);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(filename, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f19338a = reentrantLock;
        this.f19339b = z5 ? new io.sentry.util.network.b(filename) : null;
    }
}
