package de.appplant.cordova.plugin.notification.worker;

import android.content.Context;
import android.util.Log;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class NotificationWorkerManager {
    private static final String TAG = "WorkerManager";
    private static final String UNIQUE_WORKER_NAME = "UniqueNotificationWorkerName";

    public static void cancelAll(Context context) {
        try {
            WorkManager.getInstance(context).cancelUniqueWork(UNIQUE_WORKER_NAME);
        } catch (Exception e) {
            Log.w(TAG, "Failed to cancel notifications", e);
        }
    }

    public static void beginWork(Context context, ArrayList<OneTimeWorkRequest> arrayList) {
        if (arrayList.size() > 0) {
            try {
                WorkManager.getInstance(context).beginUniqueWork(UNIQUE_WORKER_NAME, ExistingWorkPolicy.REPLACE, arrayList).enqueue();
            } catch (Exception e) {
                Log.w(TAG, "Failed to schedule notifications", e);
            }
        }
    }
}
