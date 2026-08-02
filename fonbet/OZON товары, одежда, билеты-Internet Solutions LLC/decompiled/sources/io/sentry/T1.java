package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class T1 implements Comparable<T1> {
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull T1 t12) {
        return Long.valueOf(d()).compareTo(Long.valueOf(t12.d()));
    }

    public long b(@NotNull T1 t12) {
        return d() - t12.d();
    }

    public long c(T1 t12) {
        return (t12 == null || compareTo(t12) >= 0) ? d() : t12.d();
    }

    public abstract long d();
}
