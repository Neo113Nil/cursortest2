package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.view.k;
import f3.x;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends x {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21057a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f21058b = Executors.newFixedThreadPool(4, new c());

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f21059c;

    public static Handler K0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
