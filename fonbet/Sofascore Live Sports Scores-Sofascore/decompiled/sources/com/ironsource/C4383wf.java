package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.wf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4383wf extends Sg {

    @NotNull
    private final Uc d;

    @NotNull
    private final Mg e;

    @NotNull
    private final H f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4383wf(@NotNull T0 t0, @NotNull Uc uc, @NotNull Mg mg, @NotNull H h) {
        super(t0, uc);
        t0.getClass();
        uc.getClass();
        mg.getClass();
        h.getClass();
        this.d = uc;
        this.e = mg;
        this.f = h;
    }

    @Override // com.ironsource.Sg
    public void a(@NotNull B b) {
        B a;
        b.getClass();
        if (this.f.a(b)) {
            this.d.a(this.e.b(), b);
        } else {
            if (!this.f.a() || (a = this.f.c().a()) == null) {
                return;
            }
            this.d.a(this.e.b(), a);
        }
    }

    @Override // com.ironsource.Sg
    public void b(@NotNull B b) {
        b.getClass();
    }

    @Override // com.ironsource.Sg
    public void c(@NotNull B b) {
        b.getClass();
        this.d.a(this.e.b(), b);
    }

    @Override // com.ironsource.Sg
    public void a() {
        B a = this.f.c().a();
        if (a != null) {
            this.d.a(this.e.b(), a);
        }
    }
}
