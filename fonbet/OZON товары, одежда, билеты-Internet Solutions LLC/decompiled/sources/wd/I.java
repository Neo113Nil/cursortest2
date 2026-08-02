package wd;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<L> f104188a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.collections.M f104189b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.collections.K f104190c;

    public I(@NotNull List allDependencies, @NotNull kotlin.collections.M modulesWhoseInternalsAreVisible, @NotNull kotlin.collections.K directExpectedByDependencies, @NotNull kotlin.collections.M allExpectedByDependencies) {
        Intrinsics.checkNotNullParameter(allDependencies, "allDependencies");
        Intrinsics.checkNotNullParameter(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkNotNullParameter(directExpectedByDependencies, "directExpectedByDependencies");
        Intrinsics.checkNotNullParameter(allExpectedByDependencies, "allExpectedByDependencies");
        this.f104188a = allDependencies;
        this.f104189b = modulesWhoseInternalsAreVisible;
        this.f104190c = directExpectedByDependencies;
    }

    @NotNull
    public final List<L> a() {
        return this.f104188a;
    }

    @NotNull
    public final List<L> b() {
        return this.f104190c;
    }

    @NotNull
    public final Set<L> c() {
        return this.f104189b;
    }
}
