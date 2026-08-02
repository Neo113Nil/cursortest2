package com.sofascore.results.weeklyChallenge;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.model.notifications.NotificationSettingKt;
import com.sofascore.results.R;
import defpackage.efd;
import defpackage.ir4;
import defpackage.jgd;
import defpackage.wxf;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/WeeklyAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WeeklyAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        NotificationManager notificationManager;
        context.getClass();
        intent.getClass();
        Iterator it = ir4.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            NotificationSetting notificationSetting = (NotificationSetting) obj;
            if (Intrinsics.c(notificationSetting.getGroup(), "user") && Intrinsics.c(notificationSetting.getName(), "weekly_challenge")) {
                break;
            }
        }
        NotificationSetting notificationSetting2 = (NotificationSetting) obj;
        if (notificationSetting2 == null || jgd.d.contains(NotificationSettingKt.getBackendChannelName(notificationSetting2)) || (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) == null) {
            return;
        }
        String string = context.getString(R.string.weekly_challenge_results_push_title);
        string.getClass();
        String string2 = context.getString(R.string.weekly_challenge_results_push_body);
        string2.getClass();
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) WeeklyChallengeActivity.class), 201326592);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131232121);
        efd efdVar = new efd(context, notificationSetting2.getChannelId());
        efdVar.e = efd.c(string);
        efdVar.f = efd.c(string2);
        efdVar.g = activity;
        efdVar.v.icon = 2131231886;
        efdVar.f(wxf.p(context, decodeResource, false));
        efdVar.o = context.getColor(R.color.ic_launcher_background);
        efdVar.e(16, true);
        efdVar.e(8, true);
        efdVar.j = 0;
        efdVar.m = true;
        efdVar.p = -1;
        Notification b = efdVar.b();
        b.getClass();
        notificationManager.notify(1, b);
    }
}
