package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.bf3;
import defpackage.tub;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.uf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3808uf extends AbstractC3692q2 {
    public final C3756sf b;
    public final C3906y9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3808uf(SignalsConfig.NovatiqConfig novatiqConfig, C3756sf c3756sf, C3906y9 c3906y9) {
        super(novatiqConfig.getBeaconUrl());
        novatiqConfig.getClass();
        c3756sf.getClass();
        this.b = c3756sf;
        this.c = c3906y9;
    }

    public final Xe a() {
        C3906y9 c3906y9 = this.c;
        if (c3906y9 != null) {
            C3756sf c3756sf = this.b;
            c3906y9.a("Novatiq", bf3.k("preparing Novatiq request with data - hyperId - ", c3756sf.a, " - sspHost - ", c3756sf.b, " - pubId - inmobi"));
        }
        String str = this.a;
        C3756sf c3756sf2 = this.b;
        Pair pair = new Pair("sptoken", c3756sf2.a);
        c3756sf2.getClass();
        Pair pair2 = new Pair("sspid", "i6i");
        C3756sf c3756sf3 = this.b;
        Pair pair3 = new Pair("ssphost", c3756sf3.b);
        c3756sf3.getClass();
        return new Xe(str, null, null, tub.h(pair, pair2, pair3, new Pair("pubid", "inmobi")), null, false, 54);
    }
}
