package d10;

import E0.C2942q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: d10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6023a {
    @NotNull
    public static final String a(@NotNull String basePath, boolean z11) {
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            sb2.append("api/");
        }
        return C2942q.c(sb2, basePath, "toString(...)");
    }
}
