package sm0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tm0.d;
import wm0.c;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tm0.b f98826a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f98827b;

    public b(@NotNull tm0.b metaProvider, @NotNull d profileProvider) {
        Intrinsics.checkNotNullParameter(metaProvider, "metaProvider");
        Intrinsics.checkNotNullParameter(profileProvider, "profileProvider");
        this.f98826a = metaProvider;
        this.f98827b = profileProvider;
    }

    @NotNull
    public final c a(@NotNull List<wm0.a> eventsList) {
        Intrinsics.checkNotNullParameter(eventsList, "eventsList");
        return new c(this.f98826a.d(), this.f98827b.b(), eventsList);
    }
}
