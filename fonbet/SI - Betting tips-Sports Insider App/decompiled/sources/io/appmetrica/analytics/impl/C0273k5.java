package io.appmetrica.analytics.impl;

import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273k5 implements InterfaceC0427q9 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0551v9 f14097a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14098b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14099c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f14100d;

    public C0273k5(@NotNull InterfaceC0551v9 interfaceC0551v9, @NotNull List<? extends F8> list, @NotNull List<? extends F8> list2, @NotNull Q4 q42) {
        this.f14097a = interfaceC0551v9;
        this.f14098b = list;
        this.f14099c = list2;
        Objects.toString(q42);
        this.f14100d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.f14099c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((F8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.f14098b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((F8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f14100d.set(false);
    }

    public final void c() {
        this.f14100d.set(true);
    }

    public final void d() {
        if (this.f14100d.get()) {
            List list = this.f14099c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((F8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C0316ln) this.f14097a).c();
        }
    }

    public final void e() {
        if (this.f14100d.get() && a()) {
            ((C0316ln) this.f14097a).c();
        }
    }

    public final void f() {
        if (this.f14100d.get() && a()) {
            ((C0316ln) this.f14097a).b();
        }
    }
}
