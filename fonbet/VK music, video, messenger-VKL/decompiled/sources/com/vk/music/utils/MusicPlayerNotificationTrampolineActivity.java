package com.vk.music.utils;

import android.app.Activity;
import android.os.Bundle;
import com.vk.music.player.service.MusicPlayerAction;
import xsna.bn40;
import xsna.fl4;
import xsna.lyd;

/* compiled from: MusicPlayerNotificationTrampolineActivity.kt */
/* loaded from: classes3.dex */
public final class MusicPlayerNotificationTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (action == null) {
            finish();
            return;
        }
        try {
            if (MusicPlayerAction.valueOf(action) == MusicPlayerAction.ACTION_SHOW_PLAYER) {
                fl4 g = lyd.g();
                int i = fl4.a;
                g.x(this, false);
            }
            finish();
        } catch (IllegalArgumentException e) {
            bn40.c(e, new Object[0]);
            finish();
        }
    }
}
