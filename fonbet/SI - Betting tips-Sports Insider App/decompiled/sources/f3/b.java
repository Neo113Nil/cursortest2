package f3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.w0;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f9329a;

    public b(int i5) {
        Handler handler;
        Handler handler2;
        switch (i5) {
            case 1:
                Looper looper = Looper.getMainLooper();
                Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper(...)");
                Intrinsics.checkNotNullParameter(looper, "looper");
                this.f9329a = new Handler(looper);
                return;
            default:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = androidx.core.view.k.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        w0.n("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f9329a = handler2;
                        return;
                    } catch (InstantiationException e9) {
                        e = e9;
                        w0.n("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f9329a = handler2;
                        return;
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        w0.n("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f9329a = handler2;
                        return;
                    } catch (InvocationTargetException e11) {
                        Throwable cause = e11.getCause();
                        if (cause instanceof RuntimeException) {
                            throw ((RuntimeException) cause);
                        }
                        if (!(cause instanceof Error)) {
                            throw new RuntimeException(cause);
                        }
                        throw ((Error) cause);
                    }
                    handler2 = handler;
                }
                this.f9329a = handler2;
                return;
        }
    }
}
