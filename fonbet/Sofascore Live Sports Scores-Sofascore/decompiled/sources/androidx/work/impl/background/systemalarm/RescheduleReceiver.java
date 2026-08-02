package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.rik;
import defpackage.xbl;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        rik.x("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        rik o = rik.o();
        Objects.toString(intent);
        o.getClass();
        try {
            xbl d = xbl.d(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            d.getClass();
            synchronized (xbl.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = d.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    d.i = goAsync;
                    if (d.h) {
                        goAsync.finish();
                        d.i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException unused) {
            rik.o().getClass();
        }
    }
}
