package com.vk.ecomm.market.good;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import xsna.a84;
import xsna.bbj0;
import xsna.d70;
import xsna.dhc;
import xsna.fy9;
import xsna.gwh0;
import xsna.isq;
import xsna.rop;
import xsna.vrq;
import xsna.y110;

/* compiled from: GoodToolbarDelegate.kt */
/* loaded from: classes18.dex */
public final class c {
    public final fy9 a;
    public final bbj0 b;
    public final a84 c;
    public final d70 d;
    public final dhc e;
    public final gwh0 f;
    public final isq g;
    public final vrq h;
    public final y110 i;
    public final rop j = new rop(this, 8);

    /* compiled from: GoodToolbarDelegate.kt */
    public static final class a {
        public final Context a;
        public final Long b;
        public final UserId c;
        public final CommonMarketStat$TypeRefSource d;
        public final String e;
        public final String f;

        public a(Context context, Long l, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, String str2) {
            this.a = context;
            this.b = l;
            this.c = userId;
            this.d = commonMarketStat$TypeRefSource;
            this.e = str;
            this.f = str2;
        }
    }

    /* compiled from: GoodToolbarDelegate.kt */
    public static final class b {
        public b() {
            throw null;
        }
    }

    public c(fy9 fy9Var, bbj0 bbj0Var, a84 a84Var, d70 d70Var, dhc dhcVar, gwh0 gwh0Var, isq isqVar, vrq vrqVar, y110 y110Var) {
        this.a = fy9Var;
        this.b = bbj0Var;
        this.c = a84Var;
        this.d = d70Var;
        this.e = dhcVar;
        this.f = gwh0Var;
        this.g = isqVar;
        this.h = vrqVar;
        this.i = y110Var;
    }

    public final void a(Context context, UserId userId, Integer num) {
        gwh0 gwh0Var = this.f;
        if (gwh0Var != null) {
            gwh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_CART_OUT);
        }
        fy9.a(this.a, context, userId, new CartCounterState(num.intValue()), null, 8);
    }
}
