package com.vk.newsfeed.impl.controllers.stories;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.o25;

/* compiled from: StoriesBlockController.kt */
/* loaded from: classes4.dex */
public final class StoriesBlockController$receiver$1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.hashCode() == -443120485 && action.equals("com.vkontakte.android.ACTION_PROFILE_UPDATED")) {
            UserId userId = (UserId) intent.getParcelableExtra("uid");
            if (userId == null) {
                userId = UserId.d;
            }
            epx.f(userId, o25.a().o().a);
        }
    }
}
