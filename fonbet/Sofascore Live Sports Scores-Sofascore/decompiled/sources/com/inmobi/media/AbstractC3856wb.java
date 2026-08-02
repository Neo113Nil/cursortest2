package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.ljg;
import defpackage.tub;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.wb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3856wb extends AbstractC3896y implements Bj, InterfaceC3700qa, InterfaceC3430g {
    public final C3870x b;
    public final AbstractC3768t1 c;
    public final Uc d;
    public final Nc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3856wb(C3870x c3870x, AbstractC3768t1 abstractC3768t1, Uc uc, Nc nc) {
        super(c3870x);
        c3870x.getClass();
        abstractC3768t1.getClass();
        uc.getClass();
        nc.getClass();
        this.b = c3870x;
        this.c = abstractC3768t1;
        this.d = uc;
        this.e = nc;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-LoadingState", "Initialize Called");
        }
        this.c.getClass();
        Bj bj = ((Pd) this).j.b.c;
        C3470hd c3470hd = bj instanceof C3470hd ? (C3470hd) bj : null;
        if (c3470hd != null) {
            C3906y9 c3906y9 = c3470hd.a.a.a.c;
            if (c3906y9 != null) {
                c3906y9.a("NativeCreatedState", "Inflate Called");
            }
            c3470hd.b.a(new Qd(c3470hd.a, c3470hd.b), c3470hd);
        }
    }

    @Override // com.inmobi.media.InterfaceC3700qa
    public final void e() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-LoadingState", "onInternalLoadTimeout");
        }
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), AbstractC3420ff.a() == null ? (short) 2139 : (short) 2203);
    }

    @Override // com.inmobi.media.InterfaceC3430g
    public final void j() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-LoadingState", "onDestroy");
        }
        this.e.a(new C3928z5(((Pd) this).j, this.c, this.b), this);
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-LoadingState", ljg.j(s, "transitionToLoadFailedState "));
        }
        this.e.a(new C3752sb(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s))), inMobiAdRequestStatus, this.c, this.b, this.d, this.e), this);
    }
}
