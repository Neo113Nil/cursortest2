package g5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g5.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6644q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63866a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f63867b;

    public C6644q(@NotNull String name, @NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f63866a = name;
        this.f63867b = workSpecId;
    }

    @NotNull
    public final String a() {
        return this.f63866a;
    }

    @NotNull
    public final String b() {
        return this.f63867b;
    }
}
