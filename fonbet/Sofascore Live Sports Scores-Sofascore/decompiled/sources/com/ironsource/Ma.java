package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ma implements Qa {

    @NotNull
    private final La a;

    public Ma(@NotNull La la) {
        la.getClass();
        this.a = la;
    }

    @Override // com.ironsource.Qa
    public void a(@NotNull C4332u0 c4332u0) {
        c4332u0.getClass();
        this.a.a("Received load success before load called");
    }

    @Override // com.ironsource.Qa
    public void b() {
        J2 a = this.a.i().a(true);
        this.a.a(a);
        La la = this.a;
        la.a(new Pa(la, a));
        a.a(this.a.g());
    }

    @Override // com.ironsource.Qa
    public void c() {
        J2 k = this.a.k();
        if (k != null) {
            k.a(false);
        }
        this.a.a((J2) null);
        La la = this.a;
        la.a(new Na(la));
    }

    @Override // com.ironsource.Qa
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed before load called");
    }
}
