package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274k6 implements Fa {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f14101a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(@Nullable Throwable th2, @NotNull V v5) {
        Iterator it = this.f14101a.iterator();
        while (it.hasNext()) {
            ((Fa) it.next()).a(th2, v5);
        }
    }

    public final void a(@NotNull Fa... faArr) {
        kotlin.collections.z.o(this.f14101a, faArr);
    }

    public final void a(@NotNull List<? extends Fa> list) {
        this.f14101a.addAll(list);
    }

    public final void a() {
        this.f14101a.clear();
    }
}
