package zb0;

import java.net.URI;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zb0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC11016a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final URI f107498a;

    public AbstractC11016a(@NotNull URI primaryDomain) {
        Intrinsics.checkNotNullParameter(primaryDomain, "primaryDomain");
        this.f107498a = primaryDomain;
    }

    public abstract void a(@NotNull List list, @NotNull Set set);

    public abstract void c(@NotNull List<? extends e> list, @NotNull List<URI> list2);
}
