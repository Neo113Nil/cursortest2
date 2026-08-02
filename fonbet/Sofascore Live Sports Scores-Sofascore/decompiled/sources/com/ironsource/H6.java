package com.ironsource;

import android.app.Activity;
import com.ironsource.C4231o6;
import com.ironsource.InterfaceC4320t6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class H6 implements InterfaceC4320t6, C4231o6.b, C4231o6.a {

    @NotNull
    private final C4243p0 a;

    @NotNull
    private final InterfaceC4320t6.a b;

    @NotNull
    private final InterfaceC4249p6 c;

    @NotNull
    private final InterfaceC4284r6 d;

    @NotNull
    private final InterfaceC4302s6 e;

    @Nullable
    private C4231o6 f;

    public H6(@NotNull C4243p0 c4243p0, @NotNull InterfaceC4320t6.a aVar, @NotNull InterfaceC4249p6 interfaceC4249p6, @NotNull InterfaceC4284r6 interfaceC4284r6, @NotNull InterfaceC4302s6 interfaceC4302s6) {
        c4243p0.getClass();
        aVar.getClass();
        interfaceC4249p6.getClass();
        interfaceC4284r6.getClass();
        interfaceC4302s6.getClass();
        this.a = c4243p0;
        this.b = aVar;
        this.c = interfaceC4249p6;
        this.d = interfaceC4284r6;
        this.e = interfaceC4302s6;
    }

    @Override // com.ironsource.C4231o6.b
    public void a(@NotNull C4231o6 c4231o6) {
        c4231o6.getClass();
        this.f = null;
        this.e.a();
    }

    @Override // com.ironsource.C4231o6.b
    public void b(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.e.b(levelPlayAdInfo);
    }

    @Override // com.ironsource.C4231o6.b
    public void c(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.e.onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4320t6
    public void loadAd() {
        C4231o6 a = this.c.a(true, this.d);
        a.a(this);
        this.f = a;
    }

    @Override // com.ironsource.InterfaceC4320t6
    public void a(@NotNull Activity activity) {
        activity.getClass();
        C4231o6 c4231o6 = this.f;
        if (c4231o6 != null) {
            c4231o6.a(activity, this);
        }
    }

    @NotNull
    public final InterfaceC4320t6.a b() {
        return this.b;
    }

    @NotNull
    public final C4243p0 a() {
        return this.a;
    }

    @Override // com.ironsource.C4231o6.b
    public void b(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        this.e.b(ironSourceError);
    }

    @Override // com.ironsource.C4231o6.a
    public void a(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.e.a(levelPlayAdInfo);
    }

    @Override // com.ironsource.C4231o6.a
    public void a(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        this.e.c(ironSourceError);
    }
}
