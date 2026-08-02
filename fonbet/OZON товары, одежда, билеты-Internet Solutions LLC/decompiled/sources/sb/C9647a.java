package sb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sb.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9647a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rb.b f98502a;

    public C9647a(@NotNull rb.b packagesRepository) {
        Intrinsics.checkNotNullParameter(packagesRepository, "packagesRepository");
        this.f98502a = packagesRepository;
    }

    public final boolean a() {
        return !this.f98502a.a().isEmpty();
    }
}
