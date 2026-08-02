package ye;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.J;

/* renamed from: ye.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10888b extends kotlin.coroutines.a implements J {
    private volatile Object _preHandler;

    public C10888b() {
        super(J.f105405n0);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r5.getModifiers()) != false) goto L13;
     */
    @Override // xe.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        Method method;
        if (Build.VERSION.SDK_INT < 28) {
            Object obj = this._preHandler;
            if (obj != this) {
                method = (Method) obj;
            } else {
                try {
                    method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
                    if (Modifier.isPublic(method.getModifiers())) {
                    }
                } catch (Throwable unused) {
                }
                method = null;
                this._preHandler = method;
            }
            Object invoke = method != null ? method.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
