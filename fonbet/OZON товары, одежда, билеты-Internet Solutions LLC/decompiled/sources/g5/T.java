package g5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63840a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f63841b;

    public T(@NotNull String tag, @NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f63840a = tag;
        this.f63841b = workSpecId;
    }

    @NotNull
    public final String a() {
        return this.f63840a;
    }

    @NotNull
    public final String b() {
        return this.f63841b;
    }
}
