package com.vk.audiomsg.player.service;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bgk0;
import xsna.bpn0;
import xsna.ir4;
import xsna.n970;
import xsna.nr4;
import xsna.o56;
import xsna.or4;
import xsna.q7s;
import xsna.s12;
import xsna.t2i0;
import xsna.ur4;
import xsna.yc;

/* compiled from: AudioMsgPlayerNotificationService.kt */
/* loaded from: classes15.dex */
public final class AudioMsgPlayerNotificationService extends Service {
    public static final /* synthetic */ int k = 0;
    public String e;
    public int f;
    public boolean g;
    public ir4 h;
    public final Handler b = new Handler();
    public final bpn0 c = new bpn0(new yc(this, 5));
    public final or4 d = new or4(this, 0);
    public final b i = new b();
    public final q7s j = new q7s();

    /* compiled from: AudioMsgPlayerNotificationService.kt */
    public final class a extends Binder {
        public a() {
        }
    }

    /* compiled from: AudioMsgPlayerNotificationService.kt */
    public final class b extends o56 {
        public b() {
        }

        @Override // xsna.o56, xsna.kr4
        public final void a(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            int i = AudioMsgPlayerNotificationService.k;
            AudioMsgPlayerNotificationService.this.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void c(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            int i = AudioMsgPlayerNotificationService.k;
            AudioMsgPlayerNotificationService.this.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void e(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            int i = AudioMsgPlayerNotificationService.k;
            AudioMsgPlayerNotificationService.this.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void i(ir4 ir4Var, ur4 ur4Var) {
            int i = AudioMsgPlayerNotificationService.k;
            AudioMsgPlayerNotificationService.this.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void m(ir4 ir4Var, ur4 ur4Var, Throwable th) {
            int i = AudioMsgPlayerNotificationService.k;
            AudioMsgPlayerNotificationService.this.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void n(ir4 ir4Var, bgk0 bgk0Var) {
            int i = AudioMsgPlayerNotificationService.k;
            AudioMsgPlayerNotificationService.this.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void p(ir4 ir4Var, bgk0 bgk0Var, List<ur4> list) {
            int i = AudioMsgPlayerNotificationService.k;
            AudioMsgPlayerNotificationService.this.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void s(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            int i = AudioMsgPlayerNotificationService.k;
            AudioMsgPlayerNotificationService.this.d();
        }
    }

    public static PendingIntent a(AudioMsgPlayerNotificationService audioMsgPlayerNotificationService, String str) {
        Intent intent = new Intent(audioMsgPlayerNotificationService, (Class<?>) AudioMsgIntentActionsReceiver.class);
        intent.setAction(str);
        return t2i0.b(audioMsgPlayerNotificationService, 0, intent, 167772160);
    }

    public final Notification b(AudioMsgPlayerNotificationService audioMsgPlayerNotificationService, String str, ir4 ir4Var) {
        String str2;
        boolean isPlaying = ir4Var.isPlaying();
        int i = R.drawable.vk_icon_play_24;
        int i2 = isPlaying ? R.drawable.vk_icon_pause_28 : R.drawable.vk_icon_play_24;
        String string = audioMsgPlayerNotificationService.getString(R.string.audio_msg_player_service_notification_title);
        ur4 b2 = ir4Var.b();
        if (b2 == null || (str2 = b2.f) == null) {
            str2 = "";
        }
        NotificationCompat.h hVar = new NotificationCompat.h(this, str);
        Notification notification = hVar.I;
        notification.icon = i2;
        hVar.e = NotificationCompat.h.d(string);
        hVar.f = NotificationCompat.h.d(str2);
        Intent intent = new Intent(audioMsgPlayerNotificationService, (Class<?>) AudioMsgIntentActionsReceiver.class);
        intent.setAction("com.vk.audiomsg.player.service.ACTION_OPEN_HOLDER");
        hVar.g = t2i0.b(audioMsgPlayerNotificationService, 0, intent, 167772160);
        hVar.n(2, isPlaying);
        hVar.n(16, true);
        notification.deleteIntent = a(audioMsgPlayerNotificationService, "com.vk.audiomsg.player.service.ACTION_CLEAR");
        hVar.t = true;
        notification.vibrate = new long[]{0};
        n970 n970Var = new n970();
        n970Var.e = new int[]{0, 1};
        hVar.B(n970Var);
        if (isPlaying) {
            i = R.drawable.vk_icon_pause_28;
        }
        hVar.b(new NotificationCompat.a(i, "", a(audioMsgPlayerNotificationService, "com.vk.audiomsg.player.service.ACTION_TOGGLE_PLAY_PAUSE")));
        hVar.b(new NotificationCompat.a(R.drawable.vk_icon_cancel_24, "", a(audioMsgPlayerNotificationService, "com.vk.audiomsg.player.service.ACTION_CLEAR")));
        return hVar.c();
    }

    public final void c() {
        if (this.g) {
            return;
        }
        this.e = nr4.f;
        this.f = nr4.g;
        s12 s12Var = nr4.h;
        if (s12Var == null) {
            s12Var = null;
        }
        this.h = (ir4) s12Var.invoke();
        String str = this.e;
        if (str == null) {
            str = null;
        }
        ((NotificationManager) getSystemService("notification")).deleteNotificationChannel(str);
        if (((NotificationManager) getSystemService("notification")).getNotificationChannel(str) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, getString(R.string.audio_msg_player_service_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        }
        boolean d = d();
        this.g = d;
        if (d) {
            ir4 ir4Var = this.h;
            (ir4Var != null ? ir4Var : null).v(this.i);
        }
    }

    public final boolean d() {
        if (Build.VERSION.SDK_INT < 31) {
            e();
            return true;
        }
        try {
            e();
            return true;
        } catch (ForegroundServiceStartNotAllowedException e) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Can't start audio service from bg", e));
            return false;
        }
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            int i = this.f;
            String str = this.e;
            if (str == null) {
                str = null;
            }
            ir4 ir4Var = this.h;
            startForeground(i, b(this, str, ir4Var != null ? ir4Var : null), 2);
            return;
        }
        int i2 = this.f;
        String str2 = this.e;
        if (str2 == null) {
            str2 = null;
        }
        ir4 ir4Var2 = this.h;
        startForeground(i2, b(this, str2, ir4Var2 != null ? ir4Var2 : null));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return (a) this.c.getValue();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.j.getClass();
        q7s.a("AudioMsgPlayerNotificationService");
        c();
        this.b.removeCallbacks(this.d);
        this.b.postDelayed(this.d, 600L);
        nr4 nr4Var = nr4.a;
        synchronized (nr4Var) {
            nr4.k = 2;
            if (nr4.d) {
                nr4.d = false;
                nr4Var.c();
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ir4 ir4Var = this.h;
        if (ir4Var == null) {
            ir4Var = null;
        }
        ir4Var.y(this.i);
        stopForeground(true);
    }
}
