package te;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {
    public static final boolean a(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Class<?> cls = th2.getClass();
        while (!Intrinsics.d(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final void b(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        throw e11;
    }
}
