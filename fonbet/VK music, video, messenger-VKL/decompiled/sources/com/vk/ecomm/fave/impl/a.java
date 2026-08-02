package com.vk.ecomm.fave.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.CommonMarketStat$TypeEventTypeAddItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeAddItemToCart;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.bjc;
import xsna.c2y;
import xsna.f40;
import xsna.fd5;
import xsna.fkq0;
import xsna.fy9;
import xsna.hg1;
import xsna.iid0;
import xsna.kz00;
import xsna.maz;
import xsna.ny00;
import xsna.pps;
import xsna.rsg0;
import xsna.ssw;
import xsna.uzp0;
import xsna.v53;
import xsna.ver0;
import xsna.yd10;
import xsna.yfb;

/* compiled from: MarketFaveInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class a implements com.vk.ecomm.fave.api.di.a {
    public final ssw a;
    public final ny00 b;

    public a(ssw sswVar, ny00 ny00Var) {
        this.a = sswVar;
        this.b = ny00Var;
    }

    public static void f(Good good, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(good.b), Long.valueOf(good.c.b), null, good.d0, null, 40, null);
        UiTrackingScreen b = UiTracker.j.b();
        SchemeStat$TypeClick a = SchemeStat$TypeClick.a.a(schemeStat$EventItem, -1, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, CommonMarketStat$TypeRefSource.BOOKMARKS, null, null, new MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem(eventType, null, null, null, null, null, null, null, null, null, null, null, null, 8190, null), 57));
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, a, uzp0Var.a).q();
    }

    @Override // com.vk.ecomm.fave.api.di.a
    public final void a(Good good, NewsEntry newsEntry, Context context) {
        ssw sswVar = this.a;
        yd10 yd10Var = (yd10) sswVar.b;
        UserId a = fkq0.a(good.c);
        long j = good.b;
        ver0.c(context, hg1.n(rsg0.w0(yfb.x(yd10Var.a(a, (int) j, good.x + 1, null, null, null))), context, false, null, 62).subscribe(new c2y(new pps(good, sswVar, newsEntry, 1), 4), new f40(new v53(16, sswVar, context), 28)));
        f(good, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.ADD_ITEM_TO_CART);
        iid0 iid0Var = new iid0();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        UiTrackingScreen b = UiTracker.j.b();
        SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, new MobileOfficialAppsMarketStat$TypeAddItemToCart(good.c.b, CommonMarketStat$TypeEventTypeAddItem.ADD_ITEM, Integer.valueOf((int) j), CommonMarketStat$TypeRefSource.BOOKMARKS), 1);
        iid0Var.f = c;
        iid0Var.g = b2;
        iid0Var.q();
    }

    @Override // com.vk.ecomm.fave.api.di.a
    public final void b(CallProducerButton callProducerButton, Good good, Context context) {
        String str;
        ny00 ny00Var = this.b;
        kz00 kz00Var = ny00Var.c;
        if (callProducerButton == null || (str = callProducerButton.d) == null) {
            return;
        }
        Boolean bool = callProducerButton.f;
        if (bool != null ? bool.booleanValue() : false) {
            kz00Var.d(context, str, new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(str))));
            return;
        }
        InaccessibilityMessage inaccessibilityMessage = callProducerButton.j;
        if (inaccessibilityMessage == null) {
            return;
        }
        kz00Var.c(context, inaccessibilityMessage, callProducerButton.i, new fd5(ny00Var, good, context, 5));
    }

    @Override // com.vk.ecomm.fave.api.di.a
    public final void c(Context context, Good good) {
        fy9.a(this.b.a, context, good.c, null, null, 12);
    }

    @Override // com.vk.ecomm.fave.api.di.a
    public final void d(Good good, String str, Context context) {
        maz.c(this.b.d.e(), context, str, LaunchContext.A, null, null, 24);
        f(good, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK);
    }

    @Override // com.vk.ecomm.fave.api.di.a
    public final void e(Context context, Good good) {
        this.b.a(context, good);
        f(good, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER);
    }
}
