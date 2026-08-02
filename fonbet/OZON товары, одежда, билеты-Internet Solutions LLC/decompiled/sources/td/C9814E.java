package td;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9814E<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f99362a;

    public C9814E(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f99362a = name;
    }

    @NotNull
    public final String toString() {
        return this.f99362a;
    }
}
