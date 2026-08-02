package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e3.x;
import f3.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2930a = x.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        x.e().a(f2930a, "Received intent " + intent);
        try {
            v e7 = v.e(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            e7.getClass();
            synchronized (v.f9425m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = e7.f9434i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    e7.f9434i = goAsync;
                    if (e7.f9433h) {
                        goAsync.finish();
                        e7.f9434i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException e9) {
            x.e().d(f2930a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e9);
        }
    }
}
