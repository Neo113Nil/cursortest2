package com.sofascore.results.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.mha;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/service/PendingDeleteNotificationService;", "Landroid/app/Service;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PendingDeleteNotificationService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && intent.hasExtra("NotificationID")) {
            mha.x(this, intent.getIntExtra("NotificationID", -1));
        }
        return super.onStartCommand(intent, i, i2);
    }
}
