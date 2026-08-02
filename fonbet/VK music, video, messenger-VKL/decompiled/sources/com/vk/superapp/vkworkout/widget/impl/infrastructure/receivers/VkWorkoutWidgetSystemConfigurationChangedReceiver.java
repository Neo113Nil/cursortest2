package com.vk.superapp.vkworkout.widget.impl.infrastructure.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.superapp.vkworkout.widget.impl.infrastructure.services.VkWorkoutWidgetService;

/* compiled from: VkWorkoutWidgetSystemConfigurationChangedReceiver.kt */
/* loaded from: classes6.dex */
public final class VkWorkoutWidgetSystemConfigurationChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        int i = VkWorkoutWidgetService.d;
        VkWorkoutWidgetService.a.a(context);
    }
}
