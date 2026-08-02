package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import Z1.q;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f90814a;

    /* renamed from: b, reason: collision with root package name */
    private final long f90815b;

    public a(long j11, long j12) {
        this.f90814a = j11;
        this.f90815b = j12;
    }

    public final long a() {
        return this.f90814a;
    }

    public final long b() {
        return this.f90815b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Z1.m.c(this.f90814a, aVar.f90814a) && q.c(this.f90815b, aVar.f90815b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f90815b) + (Long.hashCode(this.f90814a) * 31);
    }

    @NotNull
    public final String toString() {
        return V.e.a("BubbleCoords(offset=", Z1.m.f(this.f90814a), ", size=", q.d(this.f90815b), ")");
    }
}
