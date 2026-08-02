package de.appplant.cordova.plugin.notification.receiver;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import de.appplant.cordova.plugin.notification.Manager;
import de.appplant.cordova.plugin.notification.Notification;
import de.appplant.cordova.plugin.notification.action.Action;

/* loaded from: classes6.dex */
public abstract class AbstractClickReceiver extends IntentService {
    private Intent intent;

    public abstract void onClick(Notification notification, Bundle bundle);

    public AbstractClickReceiver() {
        super("LocalNotificationClickReceiver");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        this.intent = intent;
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras();
        Context applicationContext = getApplicationContext();
        if (extras == null) {
            return;
        }
        Notification notification = Manager.getInstance(applicationContext).get(extras.getInt(Notification.EXTRA_ID));
        if (notification == null) {
            return;
        }
        onClick(notification, extras);
        this.intent = null;
    }

    protected String getAction() {
        return getIntent().getExtras().getString(Action.EXTRA_ID, "click");
    }

    protected Intent getIntent() {
        return this.intent;
    }
}
