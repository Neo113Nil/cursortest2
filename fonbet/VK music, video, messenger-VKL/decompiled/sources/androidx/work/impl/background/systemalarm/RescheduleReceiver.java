package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import xsna.dwx0;
import xsna.m100;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = m100.d("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m100 c = m100.c();
        Objects.toString(intent);
        c.getClass();
        try {
            dwx0 h = dwx0.h(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            h.getClass();
            synchronized (dwx0.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = h.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    h.i = goAsync;
                    if (h.h) {
                        goAsync.finish();
                        h.i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e) {
            m100.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
