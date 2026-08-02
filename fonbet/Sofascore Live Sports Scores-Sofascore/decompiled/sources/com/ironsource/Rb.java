package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.ped;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class Rb extends AbstractC4188m implements InterfaceC4076fc, L0, InterfaceC4422z0 {

    @NotNull
    private final Ub b;

    @NotNull
    private final C4243p0 c;

    @NotNull
    private final C4004bc d;
    private C4040dc e;

    @NotNull
    private LevelPlayAdInfo f;

    public Rb(@NotNull Ub ub, @NotNull C4243p0 c4243p0, @NotNull C4004bc c4004bc) {
        ub.getClass();
        c4243p0.getClass();
        c4004bc.getClass();
        this.b = ub;
        this.c = c4243p0;
        this.d = c4004bc;
        this.f = m();
    }

    private final C4040dc a(C4243p0 c4243p0, C4004bc c4004bc) {
        IronLog.INTERNAL.verbose();
        return new C4040dc(c4243p0, C4058ec.y.a(c4004bc, l().a()), this);
    }

    private final LevelPlayAdInfo m() {
        String uuid = this.d.b().toString();
        uuid.getClass();
        String c = this.d.c();
        String aVar = this.d.a().toString();
        aVar.getClass();
        return new LevelPlayAdInfo(uuid, c, aVar, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.L0
    public void b(@Nullable IronSourceError ironSourceError) {
        this.b.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC4422z0
    public void c(@Nullable IronSourceError ironSourceError) {
        throw new ped("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.J0
    public void e() {
        this.b.b(this.f);
    }

    public final void n() {
        this.f = m();
        C4040dc c4040dc = this.e;
        if (c4040dc != null) {
            c4040dc.a(true);
        } else {
            Intrinsics.i("nativeAdUnit");
            throw null;
        }
    }

    public final void o() {
        C4040dc a = a(this.c, this.d);
        this.e = a;
        if (a != null) {
            a.a((L0) this);
        } else {
            Intrinsics.i("nativeAdUnit");
            throw null;
        }
    }

    public final void a(@NotNull Ob ob) {
        ob.getClass();
        C4040dc c4040dc = this.e;
        if (c4040dc != null) {
            c4040dc.a(new Wb(ob), this);
        } else {
            Intrinsics.i("nativeAdUnit");
            throw null;
        }
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4332u0 c4332u0) {
        c4332u0.getClass();
        LevelPlayAdInfo c = c4332u0.c();
        if (c != null) {
            this.f = c;
            this.b.a(c);
        }
    }

    @Override // com.ironsource.InterfaceC4422z0
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        throw new ped("An operation is not implemented: Not yet implemented");
    }
}
