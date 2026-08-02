package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0316ln implements InterfaceC0313lk, InterfaceC0551v9 {

    /* renamed from: a, reason: collision with root package name */
    public final Ea f14215a;

    /* renamed from: b, reason: collision with root package name */
    public final Kl f14216b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f14217c = new AtomicBoolean(false);

    public C0316ln(@NotNull Ea ea2, @NotNull Kl kl) {
        this.f14215a = ea2;
        this.f14216b = kl;
        Objects.toString(ea2.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f14217c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f14217c.get()) {
            return;
        }
        f();
        a();
    }

    @NotNull
    public final Ea d() {
        return this.f14215a;
    }

    public final boolean e() {
        return this.f14217c.get();
    }

    public void f() {
        this.f14216b.a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0313lk
    public final void onCreate() {
        this.f14217c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0313lk
    public final void onDestroy() {
        if (this.f14217c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(@NotNull NetworkTask networkTask) {
        C0353na.I.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }

    public void g() {
    }
}
