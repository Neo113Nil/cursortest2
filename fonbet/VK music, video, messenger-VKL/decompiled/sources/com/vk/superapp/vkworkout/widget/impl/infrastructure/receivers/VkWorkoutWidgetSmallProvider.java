package com.vk.superapp.vkworkout.widget.impl.infrastructure.receivers;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.superapp.bridges.dto.analytics.VkHealthProductType;
import com.vk.superapp.bridges.dto.analytics.VkSystemWidgetType;
import com.vk.superapp.vkworkout.widget.api.di.VkWorkoutWidgetComponent;
import com.vk.superapp.vkworkout.widget.impl.infrastructure.services.VkWorkoutWidgetService;
import xsna.bpn0;
import xsna.bpv0;
import xsna.dpv0;
import xsna.e370;
import xsna.s3q0;
import xsna.udx0;
import xsna.w8i;
import xsna.xbt0;
import xsna.xgx0;

/* compiled from: VkWorkoutWidgetSmallProvider.kt */
/* loaded from: classes6.dex */
public final class VkWorkoutWidgetSmallProvider extends AppWidgetProvider implements w8i {
    public static final /* synthetic */ int c = 0;
    public final bpn0 b = new bpn0(new xbt0(this, 2));

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetSmallReceiver onAppWidgetOptionsChanged");
        int i2 = VkWorkoutWidgetService.d;
        VkWorkoutWidgetService.a.a(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetSmallReceiver onDeleted");
        try {
            udx0 udx0Var = e370.i;
            if (udx0Var == null) {
                udx0Var = null;
            }
            udx0Var.h(new dpv0(VkHealthProductType.WORKOUTS, VkSystemWidgetType.SMALL_OVERVIEW));
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetSmallReceiver onDisabled");
        ((VkWorkoutWidgetComponent) this.b.getValue()).v5().a();
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        super.onEnabled(context);
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("VkWorkoutWidgetSmallReceiver onEnabled -> context!=null is ");
        sb.append(context != null);
        String sb2 = sb.toString();
        xgx0Var.getClass();
        xgx0.a(sb2);
        try {
            udx0 udx0Var = e370.i;
            if (udx0Var == null) {
                udx0Var = null;
            }
            udx0Var.f(new bpv0(VkHealthProductType.WORKOUTS, VkSystemWidgetType.SMALL_OVERVIEW));
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
        ((VkWorkoutWidgetComponent) this.b.getValue()).v5().c(0L);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetSmallReceiver onReceive");
        int i = VkWorkoutWidgetService.d;
        VkWorkoutWidgetService.a.a(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onRestored(Context context, int[] iArr, int[] iArr2) {
        super.onRestored(context, iArr, iArr2);
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetSmallReceiver onRestored");
        int i = VkWorkoutWidgetService.d;
        VkWorkoutWidgetService.a.a(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetSmallReceiver onUpdate");
        int i = VkWorkoutWidgetService.d;
        VkWorkoutWidgetService.a.a(context);
    }
}
