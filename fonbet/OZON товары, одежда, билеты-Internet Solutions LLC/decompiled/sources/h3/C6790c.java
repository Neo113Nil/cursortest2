package h3;

import U7.m;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6790c {
    @NotNull
    public static w0 a(@NotNull Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (w0) newInstance;
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(m.a(modelClass, "Cannot create an instance of "), e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(m.a(modelClass, "Cannot create an instance of "), e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException(m.a(modelClass, "Cannot create an instance of "), e13);
        }
    }
}
