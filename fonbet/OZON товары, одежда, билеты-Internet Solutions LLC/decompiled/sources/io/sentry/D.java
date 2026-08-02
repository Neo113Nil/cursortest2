package io.sentry;

import io.sentry.android.core.C7103d;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final D f66596b = new D();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList f66597a = new CopyOnWriteArrayList();

    private D() {
    }

    @NotNull
    public static D a() {
        return f66596b;
    }

    public final void b(@NotNull C7103d c7103d) {
        this.f66597a.add(c7103d);
    }
}
