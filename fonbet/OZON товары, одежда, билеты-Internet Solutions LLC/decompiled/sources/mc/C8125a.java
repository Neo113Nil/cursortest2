package mc;

import Gc.i;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.x;

/* renamed from: mc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8125a {

    /* renamed from: a, reason: collision with root package name */
    private static final x f74711a;

    /* renamed from: mc.a$a, reason: collision with other inner class name */
    private static final class C1266a {

        /* renamed from: a, reason: collision with root package name */
        static final x f74712a = new C8126b(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            x xVar = C1266a.f74712a;
            if (xVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f74711a = xVar;
        } catch (Throwable th2) {
            throw i.d(th2);
        }
    }

    public static x a() {
        x xVar = f74711a;
        if (xVar != null) {
            return xVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
