package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.ktd;
import defpackage.ltd;
import defpackage.rik;
import defpackage.xbl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        rik.x("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        rik.o().getClass();
        try {
            context.getClass();
            xbl d = xbl.d(context);
            d.getClass();
            d.a((ltd) new ktd(DiagnosticsWorker.class).a());
        } catch (IllegalStateException unused) {
            rik.o().getClass();
        }
    }
}
