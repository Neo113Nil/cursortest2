package ye;

import Sc.r;
import Sc.s;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10737n;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f106590a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = new f(b(Looper.getMainLooper()));
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
    }

    public static final void a(C10737n c10737n) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.f(choreographer2);
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new h(c10737n));
    }

    @NotNull
    public static final Handler b(@NotNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.g(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final Object c(@NotNull kotlin.coroutines.jvm.internal.j frame) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            C10737n c10737n = new C10737n(1, Wc.b.b(frame));
            c10737n.o();
            choreographer2.postFrameCallback(new h(c10737n));
            Object n11 = c10737n.n();
            if (n11 == Wc.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return n11;
        }
        C10737n c10737n2 = new C10737n(1, Wc.b.b(frame));
        c10737n2.o();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(c10737n2);
        } else {
            C10720e0 c10720e0 = C10720e0.f105451a;
            De.s.f6650a.q(c10737n2.getContext(), new i(c10737n2));
        }
        Object n12 = c10737n2.n();
        if (n12 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n12;
    }
}
