package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Na implements Qa {

    @NotNull
    private final La a;

    public Na(@NotNull La la) {
        la.getClass();
        this.a = la;
    }

    @Override // com.ironsource.Qa
    public void a(@NotNull C4332u0 c4332u0) {
        c4332u0.getClass();
        this.a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Qa
    public void c() {
        this.a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Qa
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed on a destroyed ad");
    }
}
