package r1;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import r1.g;

/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9157e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<g> f82716a = new ArrayList<>(32);

    @NotNull
    public final void a() {
        this.f82716a.add(g.b.f82746c);
    }

    @NotNull
    public final ArrayList b() {
        return this.f82716a;
    }

    @NotNull
    public final void c(float f7) {
        this.f82716a.add(new g.d(f7));
    }

    @NotNull
    public final void d(float f7, float f11) {
        this.f82716a.add(new g.e(f7, f11));
    }

    @NotNull
    public final void e(float f7, float f11) {
        this.f82716a.add(new g.m(f7, f11));
    }

    @NotNull
    public final void f(float f7, float f11) {
        this.f82716a.add(new g.f(f7, f11));
    }

    @NotNull
    public final void g() {
        this.f82716a.add(new g.r(-2.0f));
    }
}
