package ef;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ef.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6356f {
    public static final boolean a(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.d(method, "GET") || Intrinsics.d(method, "HEAD")) ? false : true;
    }
}
