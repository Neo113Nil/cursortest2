package com.vk.push.pushsdk.work.multiprocess.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import xsna.bwx0;

/* compiled from: WorkManagerExecutorService.kt */
/* loaded from: classes5.dex */
public final class WorkManagerExecutorService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new bwx0();
    }
}
