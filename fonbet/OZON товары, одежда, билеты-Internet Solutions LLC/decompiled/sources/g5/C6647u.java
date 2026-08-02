package g5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g5.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6647u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63870a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.work.e f63871b;

    public C6647u(@NotNull String workSpecId, @NotNull androidx.work.e progress) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f63870a = workSpecId;
        this.f63871b = progress;
    }

    @NotNull
    public final androidx.work.e a() {
        return this.f63871b;
    }

    @NotNull
    public final String b() {
        return this.f63870a;
    }
}
