package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4410y6 implements InterfaceC4428z6, InterfaceC4284r6 {

    @NotNull
    private final C4338u6 a;

    @NotNull
    private final C4231o6 b;

    @Nullable
    private C4231o6 c;

    public C4410y6(@NotNull C4338u6 c4338u6, @NotNull C4231o6 c4231o6, @Nullable C4231o6 c4231o62) {
        c4338u6.getClass();
        c4231o6.getClass();
        this.a = c4338u6;
        this.b = c4231o6;
        this.c = c4231o62;
        c4231o6.a(this);
    }

    private final InterfaceC4428z6 a(IronSourceError ironSourceError) {
        if (Y4.a.a(ironSourceError)) {
            return new C4374w6(this.a, this.b, this.c, true);
        }
        C4231o6 c4231o6 = this.c;
        if (c4231o6 == null) {
            return new C4356v6(this.a);
        }
        LevelPlayAdInfo e = c4231o6.e();
        C4338u6 c4338u6 = this.a;
        return e != null ? new C4374w6(c4338u6, c4231o6, null, false, 8, null) : new C4392x6(c4338u6, c4231o6, false);
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void b(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        if (c4231o6 == this.c) {
            this.c = null;
        } else {
            this.a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void c(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        if (c4231o6 == this.b) {
            this.a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.J0
    public void e() {
        this.a.c().e();
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void loadAd() {
        this.a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC4284r6
    public void onClosed() {
        this.a.a(a(this, null, 1, null));
        this.a.c().onClosed();
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void b(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        if (c4231o6 == this.b) {
            this.a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        boolean c = Intrinsics.c(c4231o6, this.b);
        C4338u6 c4338u6 = this.a;
        if (!c) {
            c4338u6.a("progressive show success while showing current ad");
        } else {
            c4338u6.d().a(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        if (!Intrinsics.c(c4231o6, this.b)) {
            this.a.a("progressive show failed while showing current ad");
            return;
        }
        this.a.a(a(ironSourceError));
        this.a.d().c(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6) {
        c4231o6.getClass();
        if (c4231o6 == this.c) {
            this.c = null;
        } else {
            this.a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC4284r6
    public void a(@NotNull LevelPlayReward levelPlayReward) {
        levelPlayReward.getClass();
        this.a.c().a(levelPlayReward);
    }

    public static /* synthetic */ InterfaceC4428z6 a(C4410y6 c4410y6, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 1) != 0) {
            ironSourceError = null;
        }
        return c4410y6.a(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull Activity activity) {
        activity.getClass();
        this.a.a("show called while showing");
    }
}
