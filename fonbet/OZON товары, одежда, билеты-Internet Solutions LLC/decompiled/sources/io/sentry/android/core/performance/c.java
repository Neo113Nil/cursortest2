package io.sentry.android.core.performance;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements Comparable<c> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l f67316a = new l();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f67317b = new l();

    @NotNull
    public final l a() {
        return this.f67316a;
    }

    @NotNull
    public final l b() {
        return this.f67317b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c cVar2 = cVar;
        int compare = Long.compare(this.f67316a.g(), cVar2.f67316a.g());
        return compare == 0 ? Long.compare(this.f67317b.g(), cVar2.f67317b.g()) : compare;
    }
}
