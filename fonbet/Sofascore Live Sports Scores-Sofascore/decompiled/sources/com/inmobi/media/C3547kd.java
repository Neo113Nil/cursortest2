package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.kd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3547kd implements Bj, InterfaceC3404f {
    public final short a;
    public final InMobiAdRequestStatus b;
    public final Rc c;
    public final Wc d;

    public C3547kd(short s, InMobiAdRequestStatus inMobiAdRequestStatus, Rc rc, Wc wc) {
        inMobiAdRequestStatus.getClass();
        rc.getClass();
        wc.getClass();
        this.a = s;
        this.b = inMobiAdRequestStatus;
        this.c = rc;
        this.d = wc;
    }

    @Override // com.inmobi.media.InterfaceC3404f
    public final Object a(rq3 rq3Var) {
        C3906y9 c3906y9 = this.c.a.a.c;
        if (c3906y9 != null) {
            c3906y9.a("NativeFailedState", "onDestroy");
        }
        Object a = this.d.a(new C3496id(), this, (sq3) rq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        C3906y9 c3906y9 = this.c.a.a.c;
        if (c3906y9 != null) {
            c3906y9.a("NativeFailedState", "Initialize Called");
        }
        this.c.c.a(this.b, this.a);
    }
}
