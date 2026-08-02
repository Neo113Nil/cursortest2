package cf;

import We.O;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f57149a = new LinkedHashSet();

    public final synchronized void a(@NotNull O route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f57149a.remove(route);
    }

    public final synchronized void b(@NotNull O failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f57149a.add(failedRoute);
    }

    public final synchronized boolean c(@NotNull O route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f57149a.contains(route);
    }
}
