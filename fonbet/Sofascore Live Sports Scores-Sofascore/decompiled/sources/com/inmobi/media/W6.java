package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.tub;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class W6 extends AbstractC3896y implements Bj, InterfaceC3700qa, InterfaceC3430g {
    public final C3870x b;
    public final AbstractC3768t1 c;
    public final Uc d;
    public final Nc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W6(C3870x c3870x, AbstractC3768t1 abstractC3768t1, Uc uc, Nc nc) {
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

    @Override // com.inmobi.media.InterfaceC3700qa
    public final void e() {
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-FetchedState", "transitionToLoadFailedState Called");
        }
        this.e.a(new C3752sb(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), inMobiAdRequestStatus, this.c, this.b, this.d, this.e), this);
    }

    @Override // com.inmobi.media.InterfaceC3430g
    public final void j() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-FetchedState", "onDestroy Called");
        }
        this.e.a(new C3928z5(null, this.c, this.b), this);
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }
}
