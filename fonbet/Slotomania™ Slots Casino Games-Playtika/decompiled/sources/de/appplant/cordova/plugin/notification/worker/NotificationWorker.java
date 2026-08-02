package de.appplant.cordova.plugin.notification.worker;

import android.content.Context;
import android.os.Bundle;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import de.appplant.cordova.plugin.localnotification.ClearReceiver;
import de.appplant.cordova.plugin.localnotification.ClickReceiver;
import de.appplant.cordova.plugin.notification.Builder;
import de.appplant.cordova.plugin.notification.Manager;
import de.appplant.cordova.plugin.notification.Notification;
import de.appplant.cordova.plugin.notification.Options;

/* loaded from: classes7.dex */
public class NotificationWorker extends Worker {
    private static final String TAG = "NotificationWorker";

    public NotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        sendNotification();
        return ListenableWorker.Result.success();
    }

    private void sendNotification() {
        Options options = Manager.getInstance(getApplicationContext()).getOptions(getInputData().getInt(Notification.EXTRA_ID, 0));
        if (options == null) {
            return;
        }
        Bundle bundle = new Bundle();
        Notification build = new Builder(options).setClickActivity(ClickReceiver.class).setClearReceiver(ClearReceiver.class).setExtras(bundle).build();
        if (build == null) {
            return;
        }
        build.startShow(bundle);
    }
}
