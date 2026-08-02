package com.vk.superapp.browser.internal.ui.shortcats;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.vkontakte.android.R;

/* compiled from: ShortcutSuccessReceiver.kt */
/* loaded from: classes6.dex */
public final class ShortcutSuccessReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Toast.makeText(context, R.string.vk_apps_add_to_home_success, 0).show();
    }
}
