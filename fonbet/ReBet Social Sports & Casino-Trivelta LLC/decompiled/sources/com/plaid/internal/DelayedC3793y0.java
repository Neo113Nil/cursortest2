package com.plaid.internal;

import com.plaid.link.event.LinkEvent;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class DelayedC3793y0 implements Delayed {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkEvent f41193a;

    /* renamed from: b, reason: collision with root package name */
    public final long f41194b;

    public DelayedC3793y0(@NotNull LinkEvent linkEvent, int i10) {
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        this.f41193a = linkEvent;
        this.f41194b = System.currentTimeMillis() + i10;
    }

    @NotNull
    public final LinkEvent a() {
        return this.f41193a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        Delayed other = delayed;
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.f41194b, ((DelayedC3793y0) other).f41194b);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(@NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.convert(this.f41194b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
}
