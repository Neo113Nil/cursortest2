package com.vk.debug.internal;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.log.L;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.asu0;
import xsna.dd70;
import xsna.gzs;
import xsna.poi0;
import xsna.qoi0;
import xsna.s3q0;

/* compiled from: DebugCpuIntensiveTaskService.kt */
/* loaded from: classes17.dex */
public final class DebugCpuIntensiveTaskService extends Service {
    public static b c;
    public static com.vk.movika.sdk.base.presenter.b d;
    public volatile boolean b;

    /* compiled from: DebugCpuIntensiveTaskService.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (DebugCpuIntensiveTaskService.this.b) {
                for (int i = -1000000; i < 1000001; i++) {
                    if ((1 / Math.sqrt(6.283185307179586d)) * ((float) Math.exp((-((float) Math.pow(i / 10, 2))) / 2)) < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        L.e("No! That's not true! That's impossible!");
                    }
                }
                asu0.a.getClass();
                asu0.h().execute(this);
            }
        }
    }

    /* compiled from: DebugCpuIntensiveTaskService.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((DebugCpuIntensiveTaskService) this.receiver).stopSelf();
            return s3q0.a;
        }
    }

    public final void a() {
        String str = this.b ? "Процессор загружен" : "Процессор не загружен";
        NotificationCompat.h hVar = new NotificationCompat.h(this, "__dbg_start_cpu_intensive_task_service");
        hVar.e = NotificationCompat.h.d("Сервис загрузки процессора");
        hVar.f = NotificationCompat.h.d(str);
        hVar.I.icon = R.drawable.vk_icon_new_logo_vk_24;
        String str2 = this.b ? "Освободить ЦП" : "Загрузить ЦП";
        Intent intent = new Intent(this, (Class<?>) DebugCpuIntensiveTaskBroadcastReceiver.class);
        intent.setAction("com.vkontakte.android.STOP_CPU_INTENSIVE_TASK");
        s3q0 s3q0Var = s3q0.a;
        hVar.b(new NotificationCompat.a((IconCompat) null, str2, PendingIntent.getBroadcast(this, 1835716749, intent, 67108864)));
        Intent intent2 = new Intent(this, (Class<?>) DebugCpuIntensiveTaskBroadcastReceiver.class);
        intent2.setAction("com.vkontakte.android.STOP_CPU_INTENSIVE_TASK_SERVICE");
        hVar.b(new NotificationCompat.a((IconCompat) null, "Закрыть", PendingIntent.getBroadcast(this, 1835716750, intent2, 67108864)));
        Notification c2 = hVar.c();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            qoi0.a(this, c2);
        } else if (i >= 29) {
            poi0.a(this, c2);
        } else {
            startForeground(1835716748, c2);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        dd70 dd70Var = new dd70(this);
        NotificationChannel notificationChannel = new NotificationChannel("__dbg_start_cpu_intensive_task_service", "__dbg_start_cpu_intensive_task_service", 2);
        notificationChannel.setDescription(null);
        notificationChannel.setGroup(null);
        notificationChannel.setShowBadge(true);
        notificationChannel.setSound(uri, audioAttributes);
        notificationChannel.enableLights(false);
        notificationChannel.setLightColor(0);
        notificationChannel.setVibrationPattern(null);
        notificationChannel.enableVibration(false);
        dd70.a.a(dd70Var.b, notificationChannel);
        a();
        c = new b(0, this, DebugCpuIntensiveTaskService.class, "stopSelf", "stopSelf()V", 0);
        d = new com.vk.movika.sdk.base.presenter.b(this, 29);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d = null;
        c = null;
        new dd70(this).b.deleteNotificationChannel("__dbg_start_cpu_intensive_task_service");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
