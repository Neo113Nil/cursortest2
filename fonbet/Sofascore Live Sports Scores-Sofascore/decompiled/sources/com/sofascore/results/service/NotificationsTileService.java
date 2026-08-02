package com.sofascore.results.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Icon;
import android.os.IBinder;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.sofascore.results.R;
import defpackage.a5f;
import defpackage.fgd;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.uic;
import defpackage.w2g;
import defpackage.wxf;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/service/NotificationsTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationsTileService extends TileService {
    @Override // android.service.quicksettings.TileService, android.app.Service
    public final IBinder onBind(Intent intent) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = super.onBind(intent);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        return (IBinder) u2gVar;
    }

    @Override // android.service.quicksettings.TileService
    public final void onClick() {
        if (new fgd(this).b.areNotificationsEnabled()) {
            if (wxf.q(this).equals("NOTIFICATION_ENABLED")) {
                Tile qsTile = getQsTile();
                if (qsTile != null) {
                    qsTile.setState(1);
                    wxf.z(this, true, false);
                    qsTile.setIcon(Icon.createWithResource(this, R.drawable.ic_notification_mute));
                    qsTile.setLabel(getString(R.string.sofascore_notifications_disabled));
                }
            } else {
                Tile qsTile2 = getQsTile();
                if (qsTile2 != null) {
                    qsTile2.setState(2);
                    wxf.f(6, this);
                    qsTile2.setIcon(Icon.createWithResource(this, R.drawable.ic_notification_active));
                    qsTile2.setLabel(getString(R.string.sofascore_notifications_enabled));
                }
            }
            Tile qsTile3 = getQsTile();
            if (qsTile3 != null) {
                qsTile3.updateTile();
            }
        }
        super.onClick();
    }

    @Override // android.service.quicksettings.TileService
    public final void onStartListening() {
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        String string = sharedPreferences.getString("PREF_NOTIFICATION_STATUS", "NOTIFICATION_ENABLED");
        String str = string != null ? string : "NOTIFICATION_ENABLED";
        if (!new fgd(this).b.areNotificationsEnabled()) {
            str = "NOTIFICATION_DISABLED";
        } else if (str.equals("NOTIFICATION_DISABLED")) {
            str = "NOTIFICATION_ENABLED";
        }
        if (str.equals("NOTIFICATION_ENABLED")) {
            Tile qsTile = getQsTile();
            if (qsTile != null) {
                qsTile.setState(2);
                qsTile.setIcon(Icon.createWithResource(this, R.drawable.ic_notification_active));
                qsTile.setLabel(getString(R.string.sofascore_notifications_enabled));
            }
        } else {
            Tile qsTile2 = getQsTile();
            if (qsTile2 != null) {
                qsTile2.setState(1);
                qsTile2.setIcon(Icon.createWithResource(this, R.drawable.ic_notification_mute));
                qsTile2.setLabel(getString(R.string.sofascore_notifications_disabled));
            }
        }
        Tile qsTile3 = getQsTile();
        if (qsTile3 != null) {
            qsTile3.updateTile();
        }
        super.onStartListening();
    }
}
