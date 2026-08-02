package com.vk.clips.sdk.shared.item.market_ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.arf;
import xsna.cv;
import xsna.dm50;
import xsna.dr00;
import xsna.hr00;
import xsna.hw;
import xsna.iie;
import xsna.jq00;
import xsna.oq00;
import xsna.pq00;
import xsna.wo00;

/* compiled from: MarketAdsItemReducer.kt */
/* loaded from: classes17.dex */
public final class c extends dm50<dr00, MarketAdsItemPatch, pq00> {
    public final oq00 d;
    public final wo00 e;

    public c(jq00 jq00Var) {
        super(pq00.b.b);
        this.d = new oq00(jq00Var);
        this.e = new wo00();
    }

    @Override // xsna.dm50
    public final pq00 c(pq00 pq00Var, MarketAdsItemPatch marketAdsItemPatch) {
        boolean z;
        pq00 pq00Var2 = pq00Var;
        MarketAdsItemPatch marketAdsItemPatch2 = marketAdsItemPatch;
        if (marketAdsItemPatch2 instanceof MarketAdsItemPatch.b) {
            MarketAdsItemPatch.b bVar = (MarketAdsItemPatch.b) marketAdsItemPatch2;
            this.e.getClass();
            if (!(bVar instanceof MarketAdsItemPatch.b.a)) {
                if (bVar instanceof MarketAdsItemPatch.b.C0681b) {
                    return pq00.b.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            MarketAdsItemPatch.b.a aVar = (MarketAdsItemPatch.b.a) bVar;
            if (aVar instanceof MarketAdsItemPatch.b.a.C0679a) {
                MarketAdsItemPatch.b.a.C0679a c0679a = (MarketAdsItemPatch.b.a.C0679a) aVar;
                hr00 hr00Var = c0679a.b;
                hw.a.getClass();
                return new pq00.a(hr00Var, false, new cv(false, hw.b, hw.c), c0679a.c, false, c0679a.d);
            }
            if (!(aVar instanceof MarketAdsItemPatch.b.a.C0680b)) {
                throw new NoWhenBranchMatchedException();
            }
            MarketAdsItemPatch.b.a.C0680b c0680b = (MarketAdsItemPatch.b.a.C0680b) aVar;
            if (pq00Var2 instanceof pq00.b) {
                return pq00Var2;
            }
            if (pq00Var2 instanceof pq00.a) {
                return pq00.a.a((pq00.a) pq00Var2, c0680b.b, false, null, null, false, 30);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (marketAdsItemPatch2 instanceof MarketAdsItemPatch.c) {
            MarketAdsItemPatch.c cVar = (MarketAdsItemPatch.c) marketAdsItemPatch2;
            if (pq00Var2 instanceof pq00.b) {
                return pq00Var2;
            }
            if (!(pq00Var2 instanceof pq00.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (cVar instanceof MarketAdsItemPatch.c.b) {
                z = true;
            } else {
                if (!(cVar instanceof MarketAdsItemPatch.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            pq00.a aVar2 = (pq00.a) pq00Var2;
            return pq00.a.a(aVar2, hr00.a(aVar2.b, !z, false, 3071), z, null, null, false, 28);
        }
        if (marketAdsItemPatch2 instanceof MarketAdsItemPatch.a) {
            MarketAdsItemPatch.a aVar3 = (MarketAdsItemPatch.a) marketAdsItemPatch2;
            if (pq00Var2 instanceof pq00.a) {
                if (aVar3 instanceof MarketAdsItemPatch.a.b) {
                    pq00.a aVar4 = (pq00.a) pq00Var2;
                    MarketAdsItemPatch.a.b bVar2 = (MarketAdsItemPatch.a.b) aVar3;
                    return pq00.a.a(aVar4, null, false, cv.a(aVar4.d, bVar2.b, bVar2.c, 1), null, false, 27);
                }
                if (!(aVar3 instanceof MarketAdsItemPatch.a.C0678a)) {
                    throw new NoWhenBranchMatchedException();
                }
                pq00.a aVar5 = (pq00.a) pq00Var2;
                return pq00.a.a(aVar5, null, false, cv.a(aVar5.d, null, null, 6), null, false, 27);
            }
        } else if (marketAdsItemPatch2 instanceof MarketAdsItemPatch.UpdateMarketAdFocused) {
            MarketAdsItemPatch.UpdateMarketAdFocused updateMarketAdFocused = (MarketAdsItemPatch.UpdateMarketAdFocused) marketAdsItemPatch2;
            if (pq00Var2 instanceof pq00.a) {
                boolean z2 = updateMarketAdFocused == MarketAdsItemPatch.UpdateMarketAdFocused.FOCUSED;
                boolean z3 = z2 ? ((pq00.a) pq00Var2).c : false;
                pq00.a aVar6 = (pq00.a) pq00Var2;
                return pq00.a.a(aVar6, hr00.a(aVar6.b, !z3, z2, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE), z3, null, null, z2, 12);
            }
        } else {
            if (!(marketAdsItemPatch2 instanceof MarketAdsItemPatch.d)) {
                throw new NoWhenBranchMatchedException();
            }
            MarketAdsItemPatch.d dVar = (MarketAdsItemPatch.d) marketAdsItemPatch2;
            if (pq00Var2 instanceof pq00.a) {
                return pq00.a.a((pq00.a) pq00Var2, null, false, null, dVar.b, false, 23);
            }
        }
        return pq00Var2;
    }

    @Override // xsna.dm50
    public final dr00 d() {
        return new dr00(e(new arf(this, 26)), e(new iie(this, 23)));
    }

    @Override // xsna.dm50
    public final void h(pq00 pq00Var, dr00 dr00Var) {
        pq00 pq00Var2 = pq00Var;
        dr00 dr00Var2 = dr00Var;
        if (pq00Var2 instanceof pq00.a) {
            f(dr00Var2.a, pq00Var2);
            f(dr00Var2.b, pq00Var2);
        }
    }
}
