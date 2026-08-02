package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.c;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import xsna.dwx0;
import xsna.m100;

/* loaded from: classes12.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = m100.d("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        m100.c().getClass();
        try {
            dwx0 h = dwx0.h(context);
            c b = new c.a(DiagnosticsWorker.class).b();
            h.getClass();
            h.d(Collections.singletonList(b));
        } catch (IllegalStateException e) {
            m100.c().b(a, "WorkManager is not initialized", e);
        }
    }
}
