package androidx.work.impl.diagnostics;

import Q2.AbstractC1508t;
import Q2.L;
import Q2.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23901a = AbstractC1508t.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC1508t.e().a(f23901a, "Requesting diagnostics");
        try {
            L.h(context).b(w.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            AbstractC1508t.e().d(f23901a, "WorkManager is not initialized", e10);
        }
    }
}
