package androidx.health.platform.client.impl.sdkservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import xsna.m0v;
import xsna.qqo0;

/* loaded from: classes12.dex */
public final class HealthDataSdkService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!"androidx.health.platform.client.ACTION_BIND_SDK_SERVICE".equals(intent.getAction())) {
            return null;
        }
        Locale locale = Locale.ROOT;
        return new m0v(getApplicationContext(), Executors.newSingleThreadExecutor(new qqo0(Executors.defaultThreadFactory(), new AtomicLong(0L))));
    }
}
