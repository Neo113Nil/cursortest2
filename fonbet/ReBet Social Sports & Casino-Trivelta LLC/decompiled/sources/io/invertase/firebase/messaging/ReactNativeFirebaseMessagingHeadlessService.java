package io.invertase.firebase.messaging;

import android.content.Intent;
import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.google.firebase.messaging.RemoteMessage;

/* loaded from: classes3.dex */
public class ReactNativeFirebaseMessagingHeadlessService extends HeadlessJsTaskService {
    @Override // com.facebook.react.HeadlessJsTaskService
    public HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        return new HeadlessJsTaskConfig("ReactNativeFirebaseMessagingHeadlessTask", u.i((RemoteMessage) intent.getParcelableExtra("message")), Lg.i.g().e("messaging_android_headless_task_timeout", 60000L), true);
    }
}
