package com.vk.stickers.bridge;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.common.links.AwayLink;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.PurchaseDetailsButton;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.g2v;
import xsna.gzs;
import xsna.i7o0;
import xsna.iwv;
import xsna.m33;
import xsna.maz;
import xsna.n8l0;
import xsna.s3q0;
import xsna.s3v0;
import xsna.xwk;
import xsna.zdw;
import xsna.zp80;

/* compiled from: CommonStickersActions.kt */
/* loaded from: classes5.dex */
public final class a implements n8l0 {
    public static final a a = new a();

    @Override // xsna.n8l0
    public final void a(Context context) {
        maz.c(xwk.d().e(), context, "https://vk.me/stickerskeywords", null, null, zp80.a(context, "https://vk.me/stickerskeywords"), 12);
    }

    @Override // xsna.n8l0
    public final void b(Context context, UserId userId, long j) {
        int i = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        a2.K("ugc_sticker_pack");
        a2.G(userId);
        a2.D(j);
        a2.s(true);
        a2.k(context);
    }

    @Override // xsna.n8l0
    public final void c(Activity activity, PurchaseDetails purchaseDetails, gzs<s3q0> gzsVar) {
        String string;
        ButtonAction buttonAction;
        AwayLink awayLink;
        s3v0 i = g2v.c().k().i(activity);
        Context context = i.a;
        String str = null;
        if (purchaseDetails == null) {
            s3v0.g(i, i.a(null, "vkme_stickers"), gzsVar, 2);
            return;
        }
        PurchaseDetailsButton purchaseDetailsButton = purchaseDetails.e;
        String str2 = purchaseDetails.c;
        if (str2 == null) {
            str2 = i.d(null, "vkme_stickers");
        }
        String str3 = purchaseDetails.d;
        if (str3 == null) {
            str3 = i.b(null, "vkme_stickers");
        }
        String str4 = str3;
        if (purchaseDetailsButton == null || (string = purchaseDetailsButton.b) == null) {
            string = context.getString(i.e() ? R.string.vkim_install_vk_me_login_button_text : R.string.vkim_install_vk_me_button_text);
        }
        String str5 = string;
        Drawable c = i.c("vkme_stickers");
        e3m.a aVar = e3m.a;
        s3v0.a aVar2 = new s3v0.a("vkme_stickers", str2, str4, str5, c, m33.a(R.drawable.vk_icon_logo_vkme_icon_28, context));
        if (purchaseDetailsButton != null && (buttonAction = purchaseDetailsButton.c) != null && (awayLink = buttonAction.e) != null) {
            str = awayLink.b;
        }
        i.f(aVar2, str, gzsVar);
    }

    @Override // xsna.n8l0
    public final String d() {
        iwv.a.getClass();
        return iwv.a.b.getPackageName();
    }

    @Override // xsna.n8l0
    public final void e(boolean z) {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.d.i().a("vkme_stickers", z, true);
    }
}
