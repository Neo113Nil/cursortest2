package com.vk.debug.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.debug.internal.DebugCpuIntensiveTaskService;
import com.vk.movika.sdk.base.presenter.b;

/* compiled from: DebugCpuIntensiveTaskBroadcastReceiver.kt */
/* loaded from: classes17.dex */
public final class DebugCpuIntensiveTaskBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b bVar;
        DebugCpuIntensiveTaskService.b bVar2;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == 558675548) {
                if (action.equals("com.vkontakte.android.STOP_CPU_INTENSIVE_TASK") && (bVar = DebugCpuIntensiveTaskService.d) != null) {
                    bVar.invoke();
                    return;
                }
                return;
            }
            if (hashCode == 846042034 && action.equals("com.vkontakte.android.STOP_CPU_INTENSIVE_TASK_SERVICE") && (bVar2 = DebugCpuIntensiveTaskService.c) != null) {
                bVar2.invoke();
            }
        }
    }
}
