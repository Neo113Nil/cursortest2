package g5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6628a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63849a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f63850b;

    public C6628a(@NotNull String workSpecId, @NotNull String prerequisiteId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.f63849a = workSpecId;
        this.f63850b = prerequisiteId;
    }

    @NotNull
    public final String a() {
        return this.f63850b;
    }

    @NotNull
    public final String b() {
        return this.f63849a;
    }
}
