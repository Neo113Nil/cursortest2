package z50;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: z50.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10989c {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f107261a;

    public static void a(@NotNull String tag, @NotNull String data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        if (f107261a) {
            L80.a.a(tag, data);
        }
    }

    public static void b(boolean z11) {
        f107261a = z11;
    }
}
