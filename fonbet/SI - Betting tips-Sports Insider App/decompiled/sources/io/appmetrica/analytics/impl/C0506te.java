package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506te implements S8, InterfaceC0531ue {

    /* renamed from: a, reason: collision with root package name */
    public final L6 f14679a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f14680b;

    public C0506te(@NotNull L6 l6) {
        this.f14679a = l6;
        this.f14680b = new AtomicLong(l6.a());
        l6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a(@NotNull List<Integer> list) {
        this.f14680b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void b(@NotNull List<Integer> list) {
        this.f14680b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a() {
        this.f14680b.set(this.f14679a.a());
    }

    public final long b() {
        return this.f14680b.get();
    }
}
