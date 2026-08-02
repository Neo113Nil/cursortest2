package com.inmobi.media;

import defpackage.tub;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Oo implements Qo {
    public final com.inmobi.media.ads.network.common.model.Ad a;
    public final C3906y9 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public Oo(com.inmobi.media.ads.network.common.model.Ad ad, C3906y9 c3906y9) {
        this.a = ad;
        this.b = c3906y9;
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        if (!this.c.compareAndSet(false, true)) {
            C3906y9 c3906y9 = this.b;
            if (c3906y9 == null) {
                return "win/loss notification already triggered";
            }
            c3906y9.b("m1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad = this.a;
            List a = ad != null ? Ti.a(ad, "loss_beacon") : null;
            if (a != null && !a.isEmpty()) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    String a2 = P3.a((String) it.next(), tub.h(new Pair(com.ironsource.mediationsdk.d.l, String.valueOf(i)), new Pair(com.ironsource.mediationsdk.d.n, String.valueOf(d))));
                    E3 e3 = E3.a;
                    C3906y9 c3906y92 = this.b;
                    a2.getClass();
                    E3.a(a2, true, c3906y92);
                }
                if (i > 0 && d > 0.0d) {
                    return null;
                }
                C3906y9 c3906y93 = this.b;
                if (c3906y93 == null) {
                    return "notification triggering with invalid params";
                }
                c3906y93.b("m1", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
                return "notification triggering with invalid params";
            }
            C3906y9 c3906y94 = this.b;
            if (c3906y94 == null) {
                return "no win/loss notification url";
            }
            c3906y94.b("m1", "Loss beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (Exception e) {
            C3906y9 c3906y95 = this.b;
            if (c3906y95 == null) {
                return "loss notification failed internally";
            }
            c3906y95.a("m1", "Exception in notifyLoss", e);
            return "loss notification failed internally";
        }
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        if (this.c.compareAndSet(false, true)) {
            try {
                com.inmobi.media.ads.network.common.model.Ad ad = this.a;
                List a = ad != null ? Ti.a(ad, "win_beacon") : null;
                if (a != null && !a.isEmpty()) {
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        String a2 = P3.a((String) it.next(), tub.h(new Pair("${AUCTION_MIN_TO_WIN}", String.valueOf(d)), new Pair("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d))));
                        E3 e3 = E3.a;
                        C3906y9 c3906y9 = this.b;
                        a2.getClass();
                        E3.a(a2, true, c3906y9);
                    }
                    if (d > 0.0d) {
                        return null;
                    }
                    C3906y9 c3906y92 = this.b;
                    if (c3906y92 != null) {
                        c3906y92.b("m1", "Win notification triggered with invalid minBidToWin: " + d);
                        return "notification triggering with invalid params";
                    }
                    return "notification triggering with invalid params";
                }
                C3906y9 c3906y93 = this.b;
                if (c3906y93 != null) {
                    c3906y93.b("m1", "Win beacon URLs not found or empty");
                    return "no win/loss notification url";
                }
                return "no win/loss notification url";
            } catch (Exception e) {
                C3906y9 c3906y94 = this.b;
                if (c3906y94 != null) {
                    c3906y94.a("m1", "Exception in notifyWin", e);
                    return "win notification failed internally";
                }
                return "win notification failed internally";
            }
        }
        C3906y9 c3906y95 = this.b;
        if (c3906y95 != null) {
            c3906y95.b("m1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
