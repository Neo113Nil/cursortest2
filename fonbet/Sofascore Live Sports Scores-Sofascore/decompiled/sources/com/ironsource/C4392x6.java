package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.x6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4392x6 implements InterfaceC4428z6 {

    @NotNull
    private final C4338u6 a;

    @NotNull
    private final C4231o6 b;
    private boolean c;

    public C4392x6(@NotNull C4338u6 c4338u6, @NotNull C4231o6 c4231o6, boolean z) {
        c4338u6.getClass();
        c4231o6.getClass();
        this.a = c4338u6;
        this.b = c4231o6;
        this.c = z;
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.a.a("show success while loading");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void b(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        boolean z = this.c;
        C4338u6 c4338u6 = this.a;
        if (!z) {
            this.a.a(new C4374w6(c4338u6, this.b, null, false));
            return;
        }
        C4231o6 a = c4338u6.b().a(false, this.a.c());
        this.a.a(new C4374w6(this.a, this.b, a, true));
        this.a.d().b(levelPlayAdInfo);
        a.a(this.a);
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void c(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.a.a("ad info changed while loading");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void loadAd() {
        if (this.c) {
            this.a.a("load called while loading");
        }
        this.c = true;
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull Activity activity) {
        activity.getClass();
        this.a.a("show called while loading");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        this.a.a("show failed while loading");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6) {
        c4231o6.getClass();
        this.a.a("ad expired while loading");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void b(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        this.a.a(new C4356v6(this.a));
        if (this.c) {
            this.a.d().b(ironSourceError);
        }
    }
}
