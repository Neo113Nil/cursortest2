package com.vk.music.notifications.restriction;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vkontakte.android.LinkRedirActivity;
import xsna.e3m;
import xsna.e43;
import xsna.fsk;
import xsna.hg1;
import xsna.k840;
import xsna.np3;
import xsna.ph6;
import xsna.sh6;
import xsna.til0;
import xsna.tv4;
import xsna.u370;
import xsna.wh6;

/* compiled from: VkMusicRestrictionPopupDisplayer.kt */
/* loaded from: classes.dex */
public final class d extends a {
    @Override // com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer
    public final void b(Context context, String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str2, MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType, String str3) {
        boolean z;
        Activity h = e3m.h(context);
        if (h != null) {
            u370 u370Var = k840.f;
            if (u370Var == null) {
                u370Var = null;
            }
            u370Var.getClass();
            z = LinkRedirActivity.class.isInstance(h);
        } else {
            z = false;
        }
        if (z || !(BuildInfo.s() || BuildInfo.u() || BuildInfo.t())) {
            MusicRestrictionPopupDisplayer.d(this, str, musicPlaybackLaunchContext, str2, null, 8);
            return;
        }
        if (!(h instanceof AppCompatActivity)) {
            tv4.b("Trying to open restriction popup with not compat activity!", com.vk.metrics.eventtracking.b.a);
            return;
        }
        this.b.E(str, str2, musicPlaybackLaunchContext);
        AppCompatActivity appCompatActivity = (AppCompatActivity) h;
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        til0 til0Var = new til0(1);
        Context context2 = e43.a;
        Context context3 = context2 != null ? context2 : null;
        int i = 0;
        this.h = hg1.m(fsk.P(til0Var, context3), appCompatActivity, 0L, false, 62).subscribe(new sh6(new ph6(str, appCompatActivity, str3, this, subscriptionPopupType), i), new np3(new wh6(i), 2));
    }
}
