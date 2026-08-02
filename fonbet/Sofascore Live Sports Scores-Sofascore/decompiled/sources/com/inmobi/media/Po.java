package com.inmobi.media;

import defpackage.tub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Po {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final String a(C3870x c3870x, int i, double d) {
        c3870x.getClass();
        LinkedHashMap linkedHashMap = a;
        Integer valueOf = Integer.valueOf(System.identityHashCode(c3870x));
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new AtomicBoolean(false);
            linkedHashMap.put(valueOf, obj);
        }
        if (!((AtomicBoolean) obj).compareAndSet(false, true)) {
            C3906y9 c3906y9 = c3870x.a.c;
            if (c3906y9 == null) {
                return "win/loss notification already triggered";
            }
            c3906y9.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            ArrayList a2 = H4.a(c3870x.b, "loss_beacon");
            if (a2.isEmpty()) {
                C3906y9 c3906y92 = c3870x.a.c;
                if (c3906y92 == null) {
                    return "no win/loss notification url";
                }
                c3906y92.b("NativeWinLossBeacon", "Loss beacon URLs not found or empty");
                return "no win/loss notification url";
            }
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                String a3 = P3.a((String) it.next(), tub.h(new Pair(com.ironsource.mediationsdk.d.l, String.valueOf(i)), new Pair(com.ironsource.mediationsdk.d.n, String.valueOf(d))));
                E3 e3 = E3.a;
                C3906y9 c3906y93 = c3870x.a.c;
                a3.getClass();
                E3.a(a3, true, c3906y93);
            }
            if (i > 0 && d > 0.0d) {
                return null;
            }
            C3906y9 c3906y94 = c3870x.a.c;
            if (c3906y94 == null) {
                return "notification triggering with invalid params";
            }
            c3906y94.b("NativeWinLossBeacon", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
            return "notification triggering with invalid params";
        } catch (Exception e) {
            C3906y9 c3906y95 = c3870x.a.c;
            if (c3906y95 == null) {
                return "loss notification failed internally";
            }
            c3906y95.a("NativeWinLossBeacon", "Exception in notifyLoss", e);
            return "loss notification failed internally";
        }
    }

    public static final String a(C3870x c3870x, double d) {
        c3870x.getClass();
        LinkedHashMap linkedHashMap = a;
        Integer valueOf = Integer.valueOf(System.identityHashCode(c3870x));
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new AtomicBoolean(false);
            linkedHashMap.put(valueOf, obj);
        }
        if (((AtomicBoolean) obj).compareAndSet(false, true)) {
            try {
                ArrayList a2 = H4.a(c3870x.b, "win_beacon");
                if (a2.isEmpty()) {
                    C3906y9 c3906y9 = c3870x.a.c;
                    if (c3906y9 != null) {
                        c3906y9.b("NativeWinLossBeacon", "Win beacon URLs not found or empty");
                        return "no win/loss notification url";
                    }
                    return "no win/loss notification url";
                }
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    String a3 = P3.a((String) it.next(), tub.h(new Pair("${AUCTION_MIN_TO_WIN}", String.valueOf(d)), new Pair("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d))));
                    E3 e3 = E3.a;
                    C3906y9 c3906y92 = c3870x.a.c;
                    a3.getClass();
                    E3.a(a3, true, c3906y92);
                }
                if (d > 0.0d) {
                    return null;
                }
                C3906y9 c3906y93 = c3870x.a.c;
                if (c3906y93 != null) {
                    c3906y93.b("NativeWinLossBeacon", "Win notification triggered with invalid minBidToWin: " + d);
                    return "notification triggering with invalid params";
                }
                return "notification triggering with invalid params";
            } catch (Exception e) {
                C3906y9 c3906y94 = c3870x.a.c;
                if (c3906y94 != null) {
                    c3906y94.a("NativeWinLossBeacon", "Exception in notifyWin", e);
                    return "win notification failed internally";
                }
                return "win notification failed internally";
            }
        }
        C3906y9 c3906y95 = c3870x.a.c;
        if (c3906y95 != null) {
            c3906y95.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
