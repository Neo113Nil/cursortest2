package com.vk.traceprofiler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.traceprofiler.TraceProfilerServiceImpl;

/* compiled from: TraceProfilerReceiver.kt */
/* loaded from: classes6.dex */
public final class TraceProfilerReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1960906435) {
                if (action.equals("action_stop_profiler")) {
                    int i = TraceProfilerServiceImpl.d;
                    Intent intent2 = new Intent(context, (Class<?>) TraceProfilerServiceImpl.class);
                    intent2.setAction("stop_profiler");
                    TraceProfilerServiceImpl.a.a(context, intent2);
                    return;
                }
                return;
            }
            if (hashCode == -1502813105 && action.equals("action_start_profiler")) {
                int i2 = TraceProfilerServiceImpl.d;
                Intent intent3 = new Intent(context, (Class<?>) TraceProfilerServiceImpl.class);
                intent3.setAction("start_profiler");
                TraceProfilerServiceImpl.a.a(context, intent3);
            }
        }
    }
}
