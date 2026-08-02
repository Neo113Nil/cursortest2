package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import defpackage.ku3;
import defpackage.xw3;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3456h extends Ej implements InterfaceC3613n1, InterfaceC3700qa, InterfaceC3430g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3456h(ku3 ku3Var) {
        super(ku3Var);
        ku3Var.getClass();
    }

    public final void a(Map map) {
        map.getClass();
        Objects.toString(map);
        Bj bj = ((Nc) this).c;
        Mi mi = bj instanceof Mi ? (Mi) bj : null;
        if (mi != null) {
            map.getClass();
            InterfaceC3880x9 l = mi.l();
            if (l != null) {
                ((C3906y9) l).a("AUM-RenderedState", com.ironsource.Wf.f);
            }
            X4.a(mi.k(), new Ji(mi, map, null));
        }
    }

    public final void c() {
        Bj bj = ((Nc) this).c;
        AbstractC3436g5 abstractC3436g5 = bj instanceof AbstractC3436g5 ? (AbstractC3436g5) bj : null;
        if (abstractC3436g5 == null) {
            Xb.a((byte) 1, "InMobi", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return;
        }
        C3906y9 c3906y9 = abstractC3436g5.e;
        if (c3906y9 != null) {
            c3906y9.a("AUM-CreatedState", "fetch called");
        }
        C3328c0 c3328c0 = abstractC3436g5.f;
        c3328c0.getClass();
        c3328c0.a = SystemClock.elapsedRealtime();
        C3586m0 c3586m0 = abstractC3436g5.g;
        xw3.L(c3586m0.a, null, null, new C3405f0(c3586m0, null), 3);
        if (abstractC3436g5.b()) {
            C3906y9 c3906y92 = abstractC3436g5.e;
            if (c3906y92 != null) {
                c3906y92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3665p1 c3665p1 = abstractC3436g5.h;
        Nc nc = abstractC3436g5.j;
        c3665p1.getClass();
        nc.getClass();
        C3649ob c3649ob = new C3649ob(c3665p1, nc);
        C3444gd c3444gd = (C3444gd) abstractC3436g5;
        C3906y9 c3906y93 = c3444gd.e;
        if (c3906y93 != null) {
            c3906y93.a("AUM-NativeCreatedState", "transitionToFetchingState");
        }
        c3444gd.m.a(new C3651od(c3444gd.k, c3649ob, c3444gd.m, c3444gd.l), c3444gd);
    }

    @Override // com.inmobi.media.InterfaceC3700qa
    public final void e() {
        Bj bj = ((Nc) this).c;
        InterfaceC3700qa interfaceC3700qa = bj instanceof InterfaceC3700qa ? (InterfaceC3700qa) bj : null;
        if (interfaceC3700qa != null) {
            interfaceC3700qa.e();
        }
    }

    public final void g() {
        Bj bj = ((Nc) this).c;
        Mi mi = bj instanceof Mi ? (Mi) bj : null;
        if (mi != null) {
            InterfaceC3880x9 l = mi.l();
            if (l != null) {
                ((C3906y9) l).a("AUM-RenderedState", "onAdImpression");
            }
            X4.a(mi.k(), new Ki(mi, null));
        }
    }

    @Override // com.inmobi.media.InterfaceC3430g
    public final void j() {
        Bj bj = ((Nc) this).c;
        InterfaceC3430g interfaceC3430g = bj instanceof InterfaceC3430g ? (InterfaceC3430g) bj : null;
        if (interfaceC3430g != null) {
            interfaceC3430g.j();
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        inMobiAdRequestStatus.getClass();
        Objects.toString(inMobiAdRequestStatus);
        Bj bj = ((Nc) this).c;
        AbstractC3856wb abstractC3856wb = bj instanceof AbstractC3856wb ? (AbstractC3856wb) bj : null;
        if (abstractC3856wb != null) {
            inMobiAdRequestStatus.getClass();
            InterfaceC3880x9 l = abstractC3856wb.l();
            if (l != null) {
                ((C3906y9) l).b("AUM-LoadingState", "onLoadFailure");
            }
            abstractC3856wb.a(inMobiAdRequestStatus, s);
        }
    }

    public final void a(byte[] bArr) {
        (bArr != null ? Integer.valueOf(bArr.length) : "null").toString();
        Bj bj = ((Nc) this).c;
        AbstractC3436g5 abstractC3436g5 = bj instanceof AbstractC3436g5 ? (AbstractC3436g5) bj : null;
        if (abstractC3436g5 != null) {
            abstractC3436g5.a(bArr);
        }
    }
}
