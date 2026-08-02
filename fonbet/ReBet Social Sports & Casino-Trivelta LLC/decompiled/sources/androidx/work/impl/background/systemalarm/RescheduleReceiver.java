package androidx.work.impl.background.systemalarm;

import Q2.AbstractC1508t;
import R2.Y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23792a = AbstractC1508t.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC1508t.e().a(f23792a, "Received intent " + intent);
        try {
            Y.n(context).w(goAsync());
        } catch (IllegalStateException e10) {
            AbstractC1508t.e().d(f23792a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
