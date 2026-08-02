package com.vk.ecomm.reviews.impl.marketitem.replies.presentation;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.MarketItemReviewRepliesArgs;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.n;
import java.util.List;
import xsna.c310;
import xsna.e43;
import xsna.on50;
import xsna.vj50;

/* compiled from: MarketItemReviewRepliesStore.kt */
/* loaded from: classes18.dex */
public final class b implements vj50<c310, on50, n, k> {
    public final MarketItemReviewRepliesArgs a;

    public b(MarketItemReviewRepliesArgs marketItemReviewRepliesArgs) {
        this.a = marketItemReviewRepliesArgs;
    }

    @Override // xsna.vj50
    public final c310 a() {
        MarketItemReviewRepliesArgs marketItemReviewRepliesArgs = this.a;
        return new c310(marketItemReviewRepliesArgs != null ? marketItemReviewRepliesArgs.d : 0, 258036, marketItemReviewRepliesArgs != null ? marketItemReviewRepliesArgs.c : 0L, marketItemReviewRepliesArgs != null ? marketItemReviewRepliesArgs.b : UserId.d);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ k b() {
        return null;
    }

    @Override // xsna.vj50
    public final List<n> c(c310 c310Var) {
        return e43.l(n.d.b, n.a.b);
    }
}
