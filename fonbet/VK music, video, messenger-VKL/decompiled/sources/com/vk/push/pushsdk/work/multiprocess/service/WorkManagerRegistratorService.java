package com.vk.push.pushsdk.work.multiprocess.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import xsna.gwx0;

/* compiled from: WorkManagerRegistratorService.kt */
/* loaded from: classes5.dex */
public final class WorkManagerRegistratorService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new gwx0();
    }
}
