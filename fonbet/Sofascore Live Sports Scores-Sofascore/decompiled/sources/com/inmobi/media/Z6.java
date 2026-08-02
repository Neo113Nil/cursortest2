package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.ku3;
import defpackage.tub;
import defpackage.xw3;
import defpackage.zzl;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Z6 extends AbstractC3379e0 implements Bj, InterfaceC3700qa, InterfaceC3430g {
    public final C3665p1 h;
    public final Nc i;
    public final AbstractC3768t1 j;
    public final Uc k;
    public final ku3 l;
    public final Ac m;
    public final Z n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z6(C3665p1 c3665p1, AbstractC3768t1 abstractC3768t1, Nc nc, Uc uc) {
        super(c3665p1);
        c3665p1.getClass();
        nc.getClass();
        abstractC3768t1.getClass();
        uc.getClass();
        this.h = c3665p1;
        this.i = nc;
        this.j = abstractC3768t1;
        this.k = uc;
        this.l = X4.a(this.b);
        TimeoutConfigurations.MediationConfig a0 = this.c.getTimeouts().a0();
        String str = this.d.h;
        this.a.getClass();
        Ac a = AbstractC3935zc.a(a0, str, IronSourceConstants.EVENTS_NATIVE, AbstractC3450gj.b);
        this.m = a;
        this.n = new Z(c3665p1, a);
    }

    public final void a(Y y) {
        V v = y.b;
        InMobiAdRequestStatus inMobiAdRequestStatus = y.a;
        Objects.toString(v);
        Objects.toString(inMobiAdRequestStatus);
        V v2 = y.b;
        if (v2 instanceof C3579lj) {
            C3586m0 c3586m0 = this.g;
            xw3.L(c3586m0.a, null, null, new C3560l0(c3586m0, null), 3);
            a(y.a, ((C3579lj) y.b).a);
            return;
        }
        if (v2 instanceof R6) {
            a(y.a, ((R6) v2).a);
        } else if (v2 instanceof S6) {
            a(y.a, (short) ((S6) v2).a);
        } else if (v2 instanceof C3527jj) {
            a(((C3527jj) v2).a, y.a);
        } else {
            zzl.b();
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.Bj
    public final void c() {
        N3.a(this.l);
    }

    @Override // com.inmobi.media.InterfaceC3700qa
    public final void e() {
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2138);
    }

    @Override // com.inmobi.media.InterfaceC3430g
    public final void j() {
        this.i.a(new C3928z5(this.h), this);
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            c3906y9.a("AUM-FetchingState", "Initialize Called");
        }
        Yk.b();
        this.j.b();
        xw3.L(this.l, null, null, new Y6(this, null), 3);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            c3906y9.b("AUM-FetchingState", "transitionToFetchFailedState " + map);
        }
        this.i.a(new U6(map, inMobiAdRequestStatus, this.j, this.h, this.k, this.i), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        a(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s))), inMobiAdRequestStatus);
    }
}
