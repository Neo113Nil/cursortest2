package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC4320t6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.b6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3998b6 implements InterfaceC4284r6, InterfaceC4302s6 {

    @NotNull
    private final InterfaceC4034d6 a;

    @NotNull
    private final C4100h0 b;

    @NotNull
    private final InterfaceC4320t6 c;

    public C3998b6(@NotNull InterfaceC4034d6 interfaceC4034d6, @NotNull C4243p0 c4243p0, @NotNull C4100h0 c4100h0, @NotNull InterfaceC4320t6.b bVar, @NotNull InterfaceC4249p6 interfaceC4249p6) {
        interfaceC4034d6.getClass();
        c4243p0.getClass();
        c4100h0.getClass();
        bVar.getClass();
        interfaceC4249p6.getClass();
        this.a = interfaceC4034d6;
        this.b = c4100h0;
        this.c = bVar.a(c4243p0, c4243p0.b(c4100h0.e(), c4100h0.c()), interfaceC4249p6, this, this);
    }

    public final void a(@NotNull Activity activity, @Nullable C4077fd c4077fd) {
        activity.getClass();
        this.b.a(c4077fd);
        this.c.a(activity);
    }

    @Override // com.ironsource.InterfaceC4302s6
    public void b(@Nullable IronSourceError ironSourceError) {
        InterfaceC4034d6 interfaceC4034d6 = this.a;
        String uuid = this.b.b().toString();
        uuid.getClass();
        interfaceC4034d6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, uuid, this.b.c()));
    }

    @Override // com.ironsource.InterfaceC4302s6
    public void c(@Nullable IronSourceError ironSourceError) {
        InterfaceC4034d6 interfaceC4034d6 = this.a;
        String uuid = this.b.b().toString();
        uuid.getClass();
        interfaceC4034d6.a(new LevelPlayAdError(ironSourceError, uuid, this.b.c()));
    }

    @Override // com.ironsource.J0
    public void e() {
        this.a.onAdClicked();
    }

    @Override // com.ironsource.InterfaceC4302s6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4284r6
    public void onClosed() {
        this.a.onAdClosed();
    }

    @Override // com.ironsource.InterfaceC4302s6
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.onAdDisplayed(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4284r6
    public void a(@NotNull LevelPlayReward levelPlayReward) {
        levelPlayReward.getClass();
        this.a.a(levelPlayReward);
    }

    @Override // com.ironsource.InterfaceC4302s6
    public void a() {
        this.a.a();
    }

    @Override // com.ironsource.InterfaceC4302s6
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.onAdLoaded(levelPlayAdInfo);
    }

    public final void b() {
        this.c.loadAd();
    }

    public /* synthetic */ C3998b6(InterfaceC4034d6 interfaceC4034d6, C4243p0 c4243p0, C4100h0 c4100h0, InterfaceC4320t6.b bVar, InterfaceC4249p6 interfaceC4249p6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4034d6, c4243p0, c4100h0, (i & 8) != 0 ? new InterfaceC4320t6.b() : bVar, interfaceC4249p6);
    }
}
