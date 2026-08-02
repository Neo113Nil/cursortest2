package com.google.android.gms.cast;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.cast.zzfk;
import defpackage.aac;
import defpackage.f2n;
import defpackage.zy3;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public abstract class CastRemoteDisplayLocalService extends Service {
    public static final Logger d = new Logger("CastRDLocalService", null);
    public static final Object e = null;
    public boolean a = false;
    public CastRemoteDisplayClient b;
    public final zy3 c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface Callbacks {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class NotificationSettings {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Builder {
        }

        private NotificationSettings() {
            throw null;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Options {
    }

    static {
        new AtomicBoolean(false);
    }

    public CastRemoteDisplayLocalService() {
        new aac(this, 5);
        this.c = new zy3();
    }

    public final void a(String str) {
        d.a("[Instance: %s] %s", this, str);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        a("onBind");
        return this.c;
    }

    @Override // android.app.Service
    public final void onCreate() {
        a("onCreate");
        super.onCreate();
        new zzfk(getMainLooper()).postDelayed(new f2n(this, 4), 100L);
        if (this.b == null) {
            int i = CastRemoteDisplay.a;
            CastRemoteDisplayClient castRemoteDisplayClient = new CastRemoteDisplayClient(this, CastRemoteDisplayClient.l, Api.ApiOptions.E7, GoogleApi.Settings.c);
            new Logger("CastRemoteDisplay", null);
            this.b = castRemoteDisplayClient;
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        NotificationChannel notificationChannel = new NotificationChannel("cast_remote_display_local_service", getString(com.sofascore.results.R.string.cast_notification_default_channel_name), 2);
        notificationChannel.setShowBadge(false);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        a("onStartCommand");
        this.a = true;
        return 2;
    }
}
