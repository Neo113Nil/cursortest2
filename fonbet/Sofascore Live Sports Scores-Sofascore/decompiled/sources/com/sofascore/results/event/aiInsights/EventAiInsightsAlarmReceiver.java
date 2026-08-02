package com.sofascore.results.event.aiInsights;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.model.notifications.NotificationSettingKt;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import defpackage.efd;
import defpackage.ir4;
import defpackage.jgd;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/aiInsights/EventAiInsightsAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventAiInsightsAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        context.getClass();
        intent.getClass();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            Iterator it = ir4.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                NotificationSetting notificationSetting = (NotificationSetting) obj;
                if (Intrinsics.c(notificationSetting.getGroup(), "other") && Intrinsics.c(notificationSetting.getName(), "other")) {
                    break;
                }
            }
            NotificationSetting notificationSetting2 = (NotificationSetting) obj;
            if (notificationSetting2 == null || jgd.d.contains(NotificationSettingKt.getBackendChannelName(notificationSetting2))) {
                return;
            }
            String string = context.getString(R.string.sofascore_analyst_special_offer_ending);
            string.getClass();
            String string2 = context.getString(R.string.sofascore_analyst_special_offer_ending_body);
            string2.getClass();
            PendingIntent activity = PendingIntent.getActivity(context, 1, new Intent(context, (Class<?>) UpgradeSofascoreActivity.class), 201326592);
            efd efdVar = new efd(context, notificationSetting2.getChannelId());
            efdVar.e = efd.c(string);
            efdVar.f = efd.c(string2);
            efdVar.g = activity;
            efdVar.v.icon = 2131231886;
            efdVar.o = context.getColor(R.color.ic_launcher_background);
            efdVar.e(16, true);
            efdVar.e(8, true);
            efdVar.j = 0;
            efdVar.m = true;
            efdVar.p = -1;
            Notification b = efdVar.b();
            b.getClass();
            notificationManager.notify(2, b);
        }
    }
}
