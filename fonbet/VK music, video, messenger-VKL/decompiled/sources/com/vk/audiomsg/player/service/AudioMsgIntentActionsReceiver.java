package com.vk.audiomsg.player.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import xsna.ir4;
import xsna.lza0;
import xsna.nr4;
import xsna.s12;
import xsna.v94;

/* compiled from: AudioMsgIntentActionsReceiver.kt */
/* loaded from: classes15.dex */
public final class AudioMsgIntentActionsReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        s12 s12Var = nr4.h;
        if (s12Var == null) {
            s12Var = null;
        }
        ir4 ir4Var = (ir4) s12Var.invoke();
        lza0 lza0Var = nr4.i;
        if (lza0Var == null) {
            lza0Var = null;
        }
        v94 v94Var = nr4.j;
        v94 v94Var2 = v94Var != null ? v94Var : null;
        int hashCode = action.hashCode();
        if (hashCode == -1547666756) {
            if (action.equals("com.vk.audiomsg.player.service.ACTION_TOGGLE_PLAY_PAUSE")) {
                ir4Var.D(lza0Var);
            }
        } else if (hashCode == -990577901) {
            if (action.equals("com.vk.audiomsg.player.service.ACTION_CLEAR")) {
                ir4Var.E(lza0Var);
            }
        } else if (hashCode == 679170471 && action.equals("com.vk.audiomsg.player.service.ACTION_OPEN_HOLDER")) {
            v94Var2.invoke();
        }
    }
}
