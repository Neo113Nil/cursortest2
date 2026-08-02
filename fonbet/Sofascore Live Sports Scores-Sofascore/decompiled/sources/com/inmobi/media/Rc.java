package com.inmobi.media;

import com.inmobi.media.Rc;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import defpackage.joa;
import defpackage.ypa;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Rc {
    public final C3870x a;
    public final InMobiJsonResponse b;
    public final Nc c;
    public final Vc d;
    public Kl e;
    public final joa f;
    public final joa g;

    public Rc(C3870x c3870x, InMobiJsonResponse inMobiJsonResponse, Nc nc) {
        c3870x.getClass();
        inMobiJsonResponse.getClass();
        nc.getClass();
        this.a = c3870x;
        this.b = inMobiJsonResponse;
        this.c = nc;
        this.d = new Vc(c3870x);
        final int i = 0;
        this.f = ypa.b(new Function0(this) { // from class: unf
            public final /* synthetic */ Rc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                Rc rc = this.b;
                switch (i2) {
                    case 0:
                        return Rc.b(rc);
                    default:
                        return Rc.a(rc);
                }
            }
        });
        final int i2 = 1;
        this.g = ypa.b(new Function0(this) { // from class: unf
            public final /* synthetic */ Rc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                Rc rc = this.b;
                switch (i22) {
                    case 0:
                        return Rc.b(rc);
                    default:
                        return Rc.a(rc);
                }
            }
        });
    }

    public static final C3909yc a(Rc rc) {
        C3665p1 c3665p1 = rc.d.a.a;
        return new C3909yc(c3665p1.b, c3665p1.e, c3665p1.c);
    }

    public static final Qc b(Rc rc) {
        return (Qc) rc.d.b.getValue();
    }
}
