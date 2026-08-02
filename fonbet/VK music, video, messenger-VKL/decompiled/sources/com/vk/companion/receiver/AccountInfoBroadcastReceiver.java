package com.vk.companion.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import xsna.dm10;
import xsna.j6i;

/* compiled from: AccountInfoBroadcastReceiver.kt */
/* loaded from: classes17.dex */
public final class AccountInfoBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -2044606258) {
                if (hashCode == -841255210) {
                    if (action.equals("com.vk.companion.ACTION_INVALIDATE")) {
                        j6i.a().c();
                        return;
                    }
                    return;
                } else if (hashCode != 1041721509 || !action.equals("com.vk.companion.ACTION_LOGOUT")) {
                    return;
                }
            } else if (!action.equals("com.vk.companion.ACTION_LOGIN")) {
                return;
            }
            j6i.a().c();
            dm10.e().d();
        }
    }
}
