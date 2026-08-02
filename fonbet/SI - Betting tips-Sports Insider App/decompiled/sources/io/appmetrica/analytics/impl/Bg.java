package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Bg implements Ql, Ga {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12062a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f12063b;

    /* renamed from: c, reason: collision with root package name */
    public final R4 f12064c;

    /* renamed from: d, reason: collision with root package name */
    public final Am f12065d;

    /* renamed from: e, reason: collision with root package name */
    public final Pa f12066e;

    public Bg(@NotNull Context context, @NotNull Q4 q42, @NotNull C0397p4 c0397p4, @NotNull Y4 y42, @NotNull R4 r42, @NotNull Hl hl) {
        this.f12062a = context;
        this.f12063b = q42;
        this.f12064c = r42;
        Am a7 = hl.a(context, q42, c0397p4.f14455a);
        this.f12065d = a7;
        this.f12066e = y42.a(context, q42, c0397p4.f14456b, a7);
        hl.a(q42, this);
    }

    @NotNull
    public final Q4 a() {
        return this.f12063b;
    }

    @NotNull
    public final Context b() {
        return this.f12062a;
    }

    public final void a(@NotNull InterfaceC0143f4 interfaceC0143f4) {
        this.f12064c.f12802a.add(interfaceC0143f4);
    }

    public final void b(@NotNull InterfaceC0143f4 interfaceC0143f4) {
        this.f12064c.f12802a.remove(interfaceC0143f4);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(@NotNull C0161fm c0161fm) {
        ((X4) this.f12066e).a(c0161fm);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(@NotNull Jl jl, @Nullable C0161fm c0161fm) {
        ((X4) this.f12066e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(@NotNull C0397p4 c0397p4) {
        this.f12065d.a(c0397p4.f14455a);
        this.f12066e.a(c0397p4.f14456b);
    }

    public Bg(@NotNull Context context, @NotNull Q4 q42, @NotNull C0397p4 c0397p4, @NotNull Y4 y42) {
        this(context, q42, c0397p4, y42, new R4(), Hl.a());
    }

    public final void a(@NotNull P5 p52, @NotNull C0397p4 c0397p4) {
        if (!AbstractC0576w9.f14827c.contains(EnumC0047bb.a(p52.f12730d))) {
            this.f12066e.a(c0397p4.f14456b);
        }
        ((X4) this.f12066e).a(p52);
    }
}
