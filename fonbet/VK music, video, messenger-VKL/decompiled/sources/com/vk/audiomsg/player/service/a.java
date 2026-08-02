package com.vk.audiomsg.player.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import xsna.nr4;

/* compiled from: AudioMsgPlayerNotificationHelper.kt */
/* loaded from: classes15.dex */
public final class a implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AudioMsgPlayerNotificationService.this.c();
        nr4.c = this;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
