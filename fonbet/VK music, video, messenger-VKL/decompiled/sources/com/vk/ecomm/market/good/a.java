package com.vk.ecomm.market.good;

import android.content.Context;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.a090;
import xsna.b090;
import xsna.c5g;
import xsna.epx;
import xsna.hy00;
import xsna.per;

/* compiled from: GoodBookmarkDelegate.kt */
/* loaded from: classes18.dex */
public final class a {

    /* compiled from: GoodBookmarkDelegate.kt */
    /* renamed from: com.vk.ecomm.market.good.a$a, reason: collision with other inner class name */
    public static final class C0945a {
        public final GoodFragmentAnalyticsParams a;
        public final CommonMarketStat$TypeRefSource b;
        public final per c;

        public C0945a(Context context, MarketFavable marketFavable, String str, GoodFragmentAnalyticsParams goodFragmentAnalyticsParams, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, per perVar) {
            this.a = goodFragmentAnalyticsParams;
            this.b = commonMarketStat$TypeRefSource;
            this.c = perVar;
        }
    }

    /* compiled from: GoodBookmarkDelegate.kt */
    public static final class b {
        public final MarketFavable a;
        public final String b;
        public final GoodFragmentAnalyticsParams c;

        public b(MarketFavable marketFavable, String str, GoodFragmentAnalyticsParams goodFragmentAnalyticsParams) {
            this.a = marketFavable;
            this.b = str;
            this.c = goodFragmentAnalyticsParams;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static b090 a(b090 b090Var, hy00 hy00Var) {
        ?? r2;
        List<a090> list;
        boolean z = false;
        if (b090Var == null || (list = b090Var.a) == null) {
            r2 = EmptyList.b;
        } else {
            List<a090> list2 = list;
            r2 = new ArrayList(c5g.u(list2, 10));
            for (a090 a090Var : list2) {
                MarketFavable marketFavable = a090Var.b;
                if (marketFavable.b == hy00Var.a && epx.f(marketFavable.c, hy00Var.b)) {
                    a090Var.b.f = hy00Var.c;
                    z = true;
                }
                r2.add(a090Var);
            }
        }
        if (!z || b090Var == null) {
            return null;
        }
        return new b090(r2, b090Var.b, b090Var.c, b090Var.d, b090Var.e);
    }
}
