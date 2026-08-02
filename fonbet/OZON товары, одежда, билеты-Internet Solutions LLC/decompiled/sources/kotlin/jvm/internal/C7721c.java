package kotlin.jvm.internal;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7721c {
    @NotNull
    public static final <T> Iterator<T> a(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new C7720b(array);
    }
}
