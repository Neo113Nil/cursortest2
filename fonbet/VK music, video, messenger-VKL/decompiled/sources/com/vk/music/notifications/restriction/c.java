package com.vk.music.notifications.restriction;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vkontakte.android.LinkRedirActivity;
import xsna.c63;
import xsna.c940;
import xsna.e3m;
import xsna.hp40;
import xsna.k840;
import xsna.pro0;
import xsna.q55;
import xsna.r55;
import xsna.s750;
import xsna.tx;
import xsna.u370;
import xsna.x93;

/* compiled from: HuaweiMusicRestrictionPopupDisplayer.kt */
/* loaded from: classes3.dex */
public final class c extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s750 s750Var, c940 c940Var) {
        super(s750Var, c940Var, new hp40());
        r55 r55Var = r55.a;
        q55 q55Var = q55.a;
    }

    @Override // com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer
    public final void b(Context context, String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str2, MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType, String str3) {
        if (context instanceof Activity) {
            u370 u370Var = k840.f;
            if (u370Var == null) {
                u370Var = null;
            }
            u370Var.getClass();
            if (LinkRedirActivity.class.isInstance(context)) {
                MusicRestrictionPopupDisplayer.d(this, str, musicPlaybackLaunchContext, null, subscriptionPopupType, 4);
                return;
            }
        }
        Activity h = e3m.h(context);
        if (h == null) {
            Handler handler = x93.a;
            c63 c63Var = c63.a;
            h = c63.b();
        }
        if (h != null) {
            pro0.f(new tx(16, h, str));
        }
    }
}
