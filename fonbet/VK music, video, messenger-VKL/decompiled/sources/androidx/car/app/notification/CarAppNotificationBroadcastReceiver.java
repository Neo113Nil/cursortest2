package androidx.car.app.notification;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;

/* loaded from: classes11.dex */
public class CarAppNotificationBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @NonNull final Intent intent) {
        IBinder iBinder;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.removeExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.setComponent(componentName);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            iBinder = extras.getBinder("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
            extras.remove("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
        } else {
            iBinder = null;
        }
        if (iBinder == null) {
            Log.e("CarApp.NBR", "Notification intent missing expected extra: " + intent);
        } else {
            final IStartCarApp asInterface = IStartCarApp.Stub.asInterface(iBinder);
            Objects.requireNonNull(asInterface);
            RemoteUtils.d("startCarApp from notification", new RemoteUtils.b() { // from class: xsna.js9
                @Override // androidx.car.app.utils.RemoteUtils.b
                public final Object call() {
                    int i = CarAppNotificationBroadcastReceiver.a;
                    IStartCarApp.this.startCarApp(intent);
                    return null;
                }
            });
        }
    }
}
