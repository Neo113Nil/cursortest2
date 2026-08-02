package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ua, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4342ua {

    @NotNull
    private final C4243p0 a;

    @NotNull
    private String b;
    private boolean c;

    public AbstractC4342ua(@NotNull C4243p0 c4243p0) {
        c4243p0.getClass();
        this.a = c4243p0;
        this.b = "";
    }

    public final void a(@NotNull C4100h0 c4100h0) {
        c4100h0.getClass();
        this.a.f().a(new C0(this.a, c4100h0, null, 4, null));
    }

    public final void b(@NotNull Runnable runnable) {
        runnable.getClass();
        this.a.b(runnable);
    }

    public final boolean c() {
        return this.c;
    }

    @InterfaceC4307sb
    public abstract boolean d();

    @NotNull
    public final String b() {
        return this.b;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.b = str;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(@NotNull Runnable runnable) {
        runnable.getClass();
        this.a.a(runnable);
    }

    @NotNull
    public final C4243p0 a() {
        return this.a;
    }
}
