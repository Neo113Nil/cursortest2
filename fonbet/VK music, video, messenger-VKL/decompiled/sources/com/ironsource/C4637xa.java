package com.ironsource;

import com.ironsource.InterfaceC4488p4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import xsna.bj50;
import xsna.s3q0;

/* renamed from: com.ironsource.xa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4637xa extends AbstractC4429m implements O2, InterfaceC4673za {
    private final C4484p0 b;
    private final J2 c;
    private final WeakReference<InterfaceC4665z2> d;
    private LevelPlayAdInfo e = n();
    private final InterfaceC4655ya f;

    public C4637xa(InterfaceC4665z2 interfaceC4665z2, C4484p0 c4484p0, J2 j2, W2 w2) {
        InterfaceC4655ya a;
        this.b = c4484p0;
        this.c = j2;
        this.d = new WeakReference<>(interfaceC4665z2);
        a = Ua.a.a(c4484p0, w2, c4484p0.d(j2.c()), j2, this, m(), (r17 & 64) != 0 ? new InterfaceC4488p4.a() : null);
        this.f = a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L2 a(C4637xa c4637xa, boolean z) {
        return c4637xa.a(c4637xa.b, c4637xa.c, z);
    }

    private final N2 m() {
        return new bj50(this, 27);
    }

    private final LevelPlayAdInfo n() {
        return new LevelPlayAdInfo(this.c.b().toString(), this.c.c(), this.c.a().toString(), null, null, null, null, 120, null);
    }

    public final void c() {
        this.f.c();
    }

    public final void d() {
        this.f.d();
    }

    @Override // com.ironsource.K0
    public void e() {
        onAdClicked();
    }

    public final void f() {
        this.f.f();
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ s3q0 g() {
        o();
        return s3q0.a;
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ s3q0 h() {
        q();
        return s3q0.a;
    }

    @Override // com.ironsource.InterfaceC4673za
    public void i() {
        InterfaceC4665z2 interfaceC4665z2 = this.d.get();
        if (interfaceC4665z2 != null) {
            interfaceC4665z2.a(this.e);
        }
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ s3q0 j() {
        p();
        return s3q0.a;
    }

    @Override // com.ironsource.InterfaceC4673za
    public void k() {
        InterfaceC4665z2 interfaceC4665z2 = this.d.get();
        if (interfaceC4665z2 != null) {
            interfaceC4665z2.c(this.e);
        }
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.InterfaceC4673za
    public void onAdClicked() {
        InterfaceC4665z2 interfaceC4665z2 = this.d.get();
        if (interfaceC4665z2 != null) {
            interfaceC4665z2.d(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC4673za
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        this.e = levelPlayAdInfo;
        InterfaceC4665z2 interfaceC4665z2 = this.d.get();
        if (interfaceC4665z2 != null) {
            interfaceC4665z2.b(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC4673za
    public void onAdLeftApplication() {
        InterfaceC4665z2 interfaceC4665z2 = this.d.get();
        if (interfaceC4665z2 != null) {
            interfaceC4665z2.e(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC4673za
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        this.e = levelPlayAdInfo;
        InterfaceC4665z2 interfaceC4665z2 = this.d.get();
        if (interfaceC4665z2 != null) {
            interfaceC4665z2.a(levelPlayAdInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }

    private final L2 a(C4484p0 c4484p0, J2 j2, boolean z) {
        IronLog.INTERNAL.verbose();
        return new L2(c4484p0, M2.z.a(j2, l().a(), z), this);
    }

    public final void b() {
        this.f.b();
    }

    @Override // com.ironsource.InterfaceC4673za
    public void d(IronSourceError ironSourceError) {
        InterfaceC4665z2 interfaceC4665z2 = this.d.get();
        if (interfaceC4665z2 != null) {
            interfaceC4665z2.a(this.e, new LevelPlayAdError(ironSourceError, this.c.b().toString(), this.c.c()));
        }
    }

    @Override // com.ironsource.InterfaceC4673za
    public void b(IronSourceError ironSourceError) {
        InterfaceC4665z2 interfaceC4665z2 = this.d.get();
        if (interfaceC4665z2 != null) {
            interfaceC4665z2.a(new LevelPlayAdError(ironSourceError, this.c.b().toString(), this.c.c()));
        }
    }
}
