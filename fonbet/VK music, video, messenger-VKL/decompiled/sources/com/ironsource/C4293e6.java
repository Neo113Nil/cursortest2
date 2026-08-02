package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC4615w6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import xsna.zcl;

/* renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4293e6 extends AbstractC4429m implements InterfaceC4579u6, InterfaceC4597v6 {
    private final InterfaceC4329g6 b;
    private final C4341h0 c;
    private final InterfaceC4615w6 d;

    public /* synthetic */ C4293e6(InterfaceC4329g6 interfaceC4329g6, C4484p0 c4484p0, C4341h0 c4341h0, InterfaceC4615w6.b bVar, InterfaceC4543s6 interfaceC4543s6, int i, zcl zclVar) {
        this(interfaceC4329g6, c4484p0, c4341h0, (i & 8) != 0 ? new InterfaceC4615w6.b() : bVar, interfaceC4543s6);
    }

    public final void a(Activity activity, C4336gd c4336gd) {
        this.c.a(c4336gd);
        this.d.a(activity);
    }

    @Override // com.ironsource.InterfaceC4597v6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        this.b.onAdLoaded(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4597v6
    public void c(IronSourceError ironSourceError) {
        this.b.a(new LevelPlayAdError(ironSourceError, this.c.b().toString(), this.c.c()));
    }

    @Override // com.ironsource.K0
    public void e() {
        this.b.onAdClicked();
    }

    public final void m() {
        this.d.loadAd();
    }

    @Override // com.ironsource.InterfaceC4597v6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        this.b.onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4579u6
    public void onClosed() {
        this.b.onAdClosed();
    }

    public C4293e6(InterfaceC4329g6 interfaceC4329g6, C4484p0 c4484p0, C4341h0 c4341h0, InterfaceC4615w6.b bVar, InterfaceC4543s6 interfaceC4543s6) {
        this.b = interfaceC4329g6;
        this.c = c4341h0;
        this.d = bVar.a(c4484p0, c4484p0.b(c4341h0.e(), c4341h0.c()), interfaceC4543s6, this, this);
    }

    @Override // com.ironsource.InterfaceC4597v6
    public void a(IronSourceError ironSourceError) {
        this.b.onAdLoadFailed(new LevelPlayAdError(ironSourceError, this.c.b().toString(), this.c.c()));
    }

    @Override // com.ironsource.InterfaceC4597v6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        this.b.onAdDisplayed(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4579u6
    public void a(LevelPlayReward levelPlayReward) {
        this.b.a(levelPlayReward);
    }

    @Override // com.ironsource.InterfaceC4597v6
    public void a() {
        this.b.a();
    }
}
