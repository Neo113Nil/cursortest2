package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Pa implements Qa {

    @NotNull
    private final La a;

    @NotNull
    private final J2 b;

    public Pa(@NotNull La la, @NotNull J2 j2) {
        la.getClass();
        j2.getClass();
        this.a = la;
        this.b = j2;
    }

    @Override // com.ironsource.Qa
    public void a(@NotNull C4332u0 c4332u0) {
        c4332u0.getClass();
        this.a.a(c4332u0, this.b);
        La la = this.a;
        la.a(new Oa(la, this.b));
    }

    @Override // com.ironsource.Qa
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a(ironSourceError);
        this.b.a(false);
        this.a.a((J2) null);
        La la = this.a;
        la.a(new Na(la));
    }

    @Override // com.ironsource.Qa
    public void c() {
        this.b.a(true);
        this.a.a((J2) null);
        La la = this.a;
        la.a(new Na(la));
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.a.a("Loading an ad while loading");
    }
}
