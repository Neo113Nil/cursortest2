package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.bnk;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.wa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4378wa extends AbstractC4188m implements M2, InterfaceC4414ya {

    @NotNull
    private final C4243p0 b;

    @NotNull
    private final H2 c;

    @NotNull
    private final W8 d;

    @NotNull
    private final WeakReference<InterfaceC4388x2> e;

    @NotNull
    private LevelPlayAdInfo f;

    @NotNull
    private final InterfaceC4396xa g;

    public C4378wa(@NotNull InterfaceC4388x2 interfaceC4388x2, @NotNull C4243p0 c4243p0, @NotNull H2 h2, @NotNull U2 u2, @NotNull W8 w8) {
        interfaceC4388x2.getClass();
        c4243p0.getClass();
        h2.getClass();
        u2.getClass();
        w8.getClass();
        this.b = c4243p0;
        this.c = h2;
        this.d = w8;
        this.e = new WeakReference<>(interfaceC4388x2);
        this.f = n();
        this.g = Ra.a(Ra.a, c4243p0, u2, c4243p0.d(h2.c()), this, m(), null, 32, null);
    }

    private final L2 m() {
        return new bnk(this, 19);
    }

    private final LevelPlayAdInfo n() {
        String uuid = this.c.b().toString();
        uuid.getClass();
        String c = this.c.c();
        String aVar = this.c.a().toString();
        aVar.getClass();
        return new LevelPlayAdInfo(uuid, c, aVar, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC4414ya
    public void a(@Nullable IronSourceError ironSourceError) {
        InterfaceC4388x2 interfaceC4388x2 = this.e.get();
        if (interfaceC4388x2 != null) {
            String uuid = this.c.b().toString();
            uuid.getClass();
            interfaceC4388x2.a(new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
        }
    }

    public final void b() {
        this.g.b();
    }

    public final void c() {
        this.g.c();
    }

    @Override // com.ironsource.InterfaceC4414ya
    public void d(@Nullable IronSourceError ironSourceError) {
        InterfaceC4388x2 interfaceC4388x2 = this.e.get();
        if (interfaceC4388x2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f;
            String uuid = this.c.b().toString();
            uuid.getClass();
            interfaceC4388x2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
        }
    }

    @Override // com.ironsource.J0
    public void e() {
        onAdClicked();
    }

    public final void f() {
        this.g.f();
    }

    @Override // com.ironsource.M2
    public /* bridge */ /* synthetic */ Unit g() {
        o();
        return Unit.a;
    }

    @Override // com.ironsource.M2
    public /* bridge */ /* synthetic */ Unit h() {
        q();
        return Unit.a;
    }

    @Override // com.ironsource.InterfaceC4414ya
    public void i() {
        InterfaceC4388x2 interfaceC4388x2 = this.e.get();
        if (interfaceC4388x2 != null) {
            interfaceC4388x2.a(this.f);
        }
    }

    @Override // com.ironsource.M2
    public /* bridge */ /* synthetic */ Unit j() {
        p();
        return Unit.a;
    }

    @Override // com.ironsource.InterfaceC4414ya
    public void k() {
        InterfaceC4388x2 interfaceC4388x2 = this.e.get();
        if (interfaceC4388x2 != null) {
            interfaceC4388x2.c(this.f);
        }
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.InterfaceC4414ya
    public void onAdClicked() {
        InterfaceC4388x2 interfaceC4388x2 = this.e.get();
        if (interfaceC4388x2 != null) {
            interfaceC4388x2.d(this.f);
        }
    }

    @Override // com.ironsource.InterfaceC4414ya
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.f = levelPlayAdInfo;
        InterfaceC4388x2 interfaceC4388x2 = this.e.get();
        if (interfaceC4388x2 != null) {
            interfaceC4388x2.b(this.f);
        }
    }

    @Override // com.ironsource.InterfaceC4414ya
    public void onAdLeftApplication() {
        InterfaceC4388x2 interfaceC4388x2 = this.e.get();
        if (interfaceC4388x2 != null) {
            interfaceC4388x2.e(this.f);
        }
    }

    @Override // com.ironsource.InterfaceC4414ya
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.f = levelPlayAdInfo;
        InterfaceC4388x2 interfaceC4388x2 = this.e.get();
        if (interfaceC4388x2 != null) {
            interfaceC4388x2.a(levelPlayAdInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }

    private final J2 a(C4243p0 c4243p0, H2 h2, boolean z) {
        IronLog.INTERNAL.verbose();
        return new J2(c4243p0, K2.z.a(h2, l().a(), z), this, this.d);
    }

    public final void d() {
        this.g.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J2 a(C4378wa c4378wa, boolean z) {
        c4378wa.getClass();
        return c4378wa.a(c4378wa.b, c4378wa.c, z);
    }
}
