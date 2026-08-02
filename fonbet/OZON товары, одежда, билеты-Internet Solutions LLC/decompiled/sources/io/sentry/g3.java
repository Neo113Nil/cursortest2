package io.sentry;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class g3<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f67927a;

    g3(List<T> list) {
        this.f67927a = new ArrayList(list == null ? new ArrayList<>(0) : list);
    }

    @NotNull
    public final ArrayList a() {
        return this.f67927a;
    }
}
