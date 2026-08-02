package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.ku3;
import defpackage.tub;
import defpackage.xw3;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.vb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3830vb extends AbstractC3379e0 implements Bj, InterfaceC3700qa, InterfaceC3430g {
    public final byte[] h;
    public final C3665p1 i;
    public final AbstractC3768t1 j;
    public final Uc k;
    public final Nc l;
    public final X m;
    public final ku3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3830vb(byte[] bArr, C3665p1 c3665p1, AbstractC3768t1 abstractC3768t1, Uc uc, Nc nc) {
        super(c3665p1);
        c3665p1.getClass();
        abstractC3768t1.getClass();
        uc.getClass();
        nc.getClass();
        this.h = bArr;
        this.i = c3665p1;
        this.j = abstractC3768t1;
        this.k = uc;
        this.l = nc;
        this.m = new X(this.f, this.g);
        this.n = X4.a(this.b);
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            c3906y9.a("AUM-LoadResponseState", "Initialize Called");
        }
        byte[] bArr = this.h;
        if (bArr != null && bArr.length != 0) {
            C3275a c3275a = new C3275a(bArr, this.d.a, this.e);
            this.j.d();
            xw3.L(this.n, null, null, new C3804ub(c3275a, this, null), 3);
        } else {
            C3906y9 c3906y92 = this.e;
            if (c3906y92 != null) {
                c3906y92.b("AUM-LoadResponseState", "Empty response on Load");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.Bj
    public final void c() {
        N3.a(this.n);
    }

    @Override // com.inmobi.media.InterfaceC3700qa
    public final void e() {
        a(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
    }

    @Override // com.inmobi.media.InterfaceC3430g
    public final void j() {
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            c3906y9.b("AUM-LoadResponseState", "onDestroy");
        }
        this.l.a(new C3928z5(null, this.j, this.i), this);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            c3906y9.b("AUM-LoadResponseState", "transitionToLoadDroppedState " + map);
        }
        this.l.a(new U6(map, inMobiAdRequestStatus, this.j, this.i, this.k, this.l), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            c3906y9.b("AUM-LoadResponseState", "transitionToLoadDroppedState 2143");
        }
        this.l.a(new C3701qb((short) 2143, inMobiAdRequestStatus, this.i, this.k, this.l), this);
    }
}
