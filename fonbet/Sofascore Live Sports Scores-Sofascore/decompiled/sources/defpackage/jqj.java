package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jqj extends BroadcastReceiver {
    public kqj a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        kqj kqjVar = this.a;
        if (kqjVar == null) {
            return;
        }
        if (kqjVar.c()) {
            kqj kqjVar2 = this.a;
            ((iqj) kqjVar2.f).e.schedule(kqjVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }
}
