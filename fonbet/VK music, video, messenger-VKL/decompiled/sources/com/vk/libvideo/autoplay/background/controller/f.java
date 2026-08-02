package com.vk.libvideo.autoplay.background.controller;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.dto.common.ImageSize;
import com.vk.libvideo.autoplay.background.controller.a;
import com.vk.libvideo.autoplay.background.controller.h;
import com.vk.libvideo.autoplay.background.notification.VideoNotificationAction;
import com.vk.libvideo.autoplay.background.notification.VideoNotificationActionReceiver;
import com.vk.libvideo.autoplay.background.notification.VideoNotificationDeleteReceiver;
import com.vk.libvideo.autoplay.background.service.VideoBackgroundService;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.functions.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import xsna.asu0;
import xsna.ats0;
import xsna.c5g;
import xsna.c63;
import xsna.cts0;
import xsna.dd70;
import xsna.dt;
import xsna.dts0;
import xsna.g86;
import xsna.hg1;
import xsna.i0q0;
import xsna.j5g;
import xsna.jgp;
import xsna.n970;
import xsna.nys0;
import xsna.on00;
import xsna.oys0;
import xsna.p69;
import xsna.pa;
import xsna.pro0;
import xsna.prq0;
import xsna.pys0;
import xsna.q4s0;
import xsna.qys0;
import xsna.r2i0;
import xsna.s1f0;
import xsna.s740;
import xsna.t2i0;
import xsna.tj60;
import xsna.uss0;
import xsna.w4s0;
import xsna.x4s0;
import xsna.xss0;
import xsna.yg5;
import xsna.yss0;

/* compiled from: VideoBackgroundNotificationController.kt */
/* loaded from: classes2.dex */
public final class f extends c63.b {
    public final Context b;
    public final dd70 c;
    public final pa e;
    public final oys0 g;
    public final cts0 h;
    public final s740 i;
    public final yss0 j;
    public final h.a k;
    public final a.b l;
    public final VideoQueueComponent m;
    public dts0 n;
    public qys0 o;
    public pys0 p;
    public VideoNotificationActionReceiver q;
    public VideoNotificationDeleteReceiver r;
    public nys0 s;
    public io.reactivex.rxjava3.disposables.c t;
    public boolean u;
    public final w4s0 d = new w4s0();
    public final q4s0 f = q4s0.a;

    public f(Context context, g gVar) {
        this.b = context;
        this.c = new dd70(context);
        this.e = gVar.a;
        this.g = gVar.b;
        this.h = gVar.c;
        this.i = gVar.d;
        this.j = gVar.e;
        this.k = gVar.f;
        this.l = gVar.g;
        this.m = gVar.h;
    }

    public final void D() {
        dts0 dts0Var;
        ats0 ats0Var;
        io.reactivex.rxjava3.disposables.c cVar = this.t;
        if (cVar != null) {
            cVar.dispose();
        }
        this.t = null;
        dd70 dd70Var = this.c;
        this.g.getClass();
        dd70Var.b.cancel(null, 906712373);
        this.d.j(true);
        qys0 qys0Var = this.o;
        if (qys0Var != null) {
            qys0Var.a = null;
        }
        if (qys0Var != null) {
            this.d.j.remove(qys0Var);
        }
        this.o = null;
        pys0 pys0Var = this.p;
        if (pys0Var != null) {
            pys0Var.a = null;
        }
        if (pys0Var != null && (dts0Var = this.n) != null) {
            cts0 cts0Var = this.h;
            if (cts0Var.b(dts0Var) && (ats0Var = cts0Var.d) != null) {
                ats0Var.a.remove(pys0Var);
            }
        }
        this.p = null;
        VideoNotificationActionReceiver videoNotificationActionReceiver = this.q;
        if (videoNotificationActionReceiver != null) {
            videoNotificationActionReceiver.c = null;
            videoNotificationActionReceiver.d = null;
            videoNotificationActionReceiver.e = null;
        }
        if (videoNotificationActionReceiver != null) {
            this.b.unregisterReceiver(videoNotificationActionReceiver);
        }
        this.q = null;
        VideoNotificationDeleteReceiver videoNotificationDeleteReceiver = this.r;
        if (videoNotificationDeleteReceiver != null) {
            videoNotificationDeleteReceiver.b = null;
        }
        if (videoNotificationDeleteReceiver != null) {
            this.b.unregisterReceiver(videoNotificationDeleteReceiver);
        }
        this.r = null;
        nys0 nys0Var = this.s;
        if (nys0Var != null) {
            yg5 yg5Var = nys0Var.b;
            if (yg5Var != null) {
                yg5Var.T(nys0Var);
            }
            nys0Var.b = null;
            nys0Var.c = null;
            nys0Var.d = null;
            nys0Var.e = null;
        }
        this.s = null;
        dts0 dts0Var2 = this.n;
        if (dts0Var2 != null) {
            this.h.e(dts0Var2);
        }
        this.n = null;
    }

    public final void E(dts0 dts0Var, uss0 uss0Var, xss0 xss0Var) {
        IconCompat d;
        int i = xss0Var.b;
        oys0 oys0Var = this.g;
        oys0Var.getClass();
        MediaSessionCompat.Token token = dts0Var.b;
        Map<String, String> map = uss0Var.a;
        Context context = oys0Var.a;
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel("video_player_notification_channel_id", context.getString(R.string.video_background_notification_channel), 3));
        NotificationCompat.h hVar = new NotificationCompat.h(context, "video_player_notification_channel_id");
        hVar.I.deleteIntent = t2i0.b(context, 0, new Intent(VideoNotificationDeleteReceiver.c), 335544320);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        hVar.g = launchIntentForPackage == null ? null : t2i0.a(context, 0, launchIntentForPackage, 335544320);
        hVar.e = NotificationCompat.h.d(map.get(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE));
        hVar.f = NotificationCompat.h.d(map.get(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE));
        hVar.n = NotificationCompat.h.d(i == 6 ? context.getString(R.string.video_background_notification_loading_description) : i == 7 ? context.getString(R.string.video_background_notification_error_description) : null);
        Map<String, Bitmap> map2 = uss0Var.c;
        Bitmap bitmap = map2.get(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON);
        if (bitmap == null) {
            bitmap = map2.get(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
        }
        hVar.q(bitmap);
        boolean z = true;
        hVar.n(2, i == 3 || i == 6);
        hVar.I.icon = R.drawable.vk_icon_video_circle_outline_24;
        hVar.u = "transport";
        hVar.G = 1;
        hVar.J = true;
        hVar.l = false;
        hVar.t = true;
        ArrayList a = oys0.a(xss0Var);
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            VideoNotificationAction videoNotificationAction = (VideoNotificationAction) it.next();
            Intent putExtra = new Intent(VideoNotificationActionReceiver.f).putExtra(VideoNotificationActionReceiver.g, videoNotificationAction);
            PendingIntent c = t2i0.c(putExtra, context, z, new r2i0(context, videoNotificationAction.hashCode(), putExtra, 67108864));
            if (videoNotificationAction.i()) {
                d = IconCompat.d(videoNotificationAction.j(), context);
            } else {
                Drawable drawable = context.getDrawable(videoNotificationAction.j());
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                if (mutate != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    mutate.setAlpha(138);
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    mutate.draw(canvas);
                    d = IconCompat.c(createBitmap);
                } else {
                    d = IconCompat.d(videoNotificationAction.j(), context);
                }
            }
            NotificationCompat.a.C0022a c0022a = new NotificationCompat.a.C0022a(d, context.getString(videoNotificationAction.h()), c);
            c0022a.h = false;
            arrayList.add(c0022a.b());
            z = true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            hVar.b((NotificationCompat.a) it2.next());
        }
        n970 n970Var = new n970();
        n970Var.f = token;
        ArrayList a2 = oys0.a(xss0Var);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = a2.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((VideoNotificationAction) next) != VideoNotificationAction.CLOSE) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(a2.indexOf((VideoNotificationAction) it4.next())));
        }
        int[] N0 = j5g.N0(arrayList3);
        n970Var.e = Arrays.copyOf(N0, N0.length);
        hVar.B(n970Var);
        Notification c2 = hVar.c();
        w4s0 w4s0Var = this.d;
        if (i != 3 && i != 6) {
            w4s0Var.j(false);
            this.c.a(c2, 906712373);
            return;
        }
        pro0.d(w4s0Var.i);
        VideoBackgroundService e = w4s0Var.e();
        if (e == null) {
            w4s0Var.l = 906712373;
            w4s0Var.m = c2;
            w4s0Var.a();
        } else {
            boolean l = e.l(906712373, c2, new x4s0(0, w4s0Var, w4s0.class, "canShowNotification", "canShowNotification()Z", 0));
            w4s0Var.n = l;
            if (l) {
                e.e = w4s0Var.k;
            }
        }
    }

    public final void F(final yg5 yg5Var) {
        if (yg5Var == null || !yg5Var.M0() || yg5Var.A().W9() || yg5Var.B() || yg5Var.A().z0()) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.t;
        if (cVar != null) {
            cVar.dispose();
        }
        G(yg5Var);
        final s740 s740Var = this.i;
        s740Var.getClass();
        io.reactivex.rxjava3.internal.operators.single.c cVar2 = new io.reactivex.rxjava3.internal.operators.single.c(new n() { // from class: xsna.vss0
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                s740.this.getClass();
                yg5 yg5Var2 = yg5Var;
                Map a = s740.a(yg5Var2);
                ImageSize Cb = yg5Var2.A().getImage().Cb(cn70.b(100), false, true);
                String str = Cb != null ? Cb.d.d : null;
                if (!a.isEmpty()) {
                    return io.reactivex.rxjava3.core.x.k(a);
                }
                jgp jgpVar = jgp.b;
                return str == null ? io.reactivex.rxjava3.core.x.k(jgpVar) : mcr0.h(Uri.parse(str)).U(new hkc0(new wss0(0), 10)).l0(jgpVar).o(jgpVar);
            }
        });
        asu0 asu0Var = asu0.a;
        this.t = hg1.i(cVar2.m(asu0Var.d()).l(new tj60(new s1f0(6, yg5Var, s740Var), 18)).m(asu0Var.d()), new g86(24, this, yg5Var));
    }

    public final void G(yg5 yg5Var) {
        uss0 uss0Var;
        s740 s740Var = this.i;
        s740Var.getClass();
        boolean P0 = yg5Var.P0();
        jgp jgpVar = jgp.b;
        if (P0) {
            uss0Var = new uss0(dt.b(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, s740Var.a.getString(R.string.video_background_notification_ad_title)), jgpVar, s740.a(yg5Var));
        } else if (yg5Var.v()) {
            uss0Var = new uss0(s740.b(yg5Var), jgpVar, s740.a(yg5Var));
        } else {
            uss0Var = new uss0(s740.b(yg5Var), on00.f(new Pair(MediaMetadataCompat.METADATA_KEY_DURATION, Long.valueOf(yg5Var.getDuration()))), s740.a(yg5Var));
        }
        xss0 a = this.j.a(yg5Var);
        dts0 dts0Var = this.n;
        cts0 cts0Var = this.h;
        if (dts0Var == null) {
            dts0Var = cts0Var.a(this.b);
            this.n = dts0Var;
        }
        if (dts0Var == null) {
            return;
        }
        cts0Var.f(dts0Var, uss0Var);
        cts0Var.g(dts0Var, a);
        E(dts0Var, uss0Var, a);
    }

    @Override // xsna.c63.b
    public final void n(Activity activity) {
        pa paVar;
        yg5 b;
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.d() || !this.u) {
            return;
        }
        this.u = false;
        if (this.f.d() && (b = (paVar = this.e).b()) != null && b.M0()) {
            yg5 b2 = paVar.b();
            if (b2 != null) {
                b2.pause();
            }
            D();
        }
    }

    @Override // xsna.c63.b
    public final void o(Activity activity) {
        VideoPipStateHolder.a.getClass();
        this.u = VideoPipStateHolder.d();
    }

    @Override // xsna.c63.b
    public final void q(Activity activity, boolean z) {
        D();
        VideoPipStateHolder.a.getClass();
        this.u = VideoPipStateHolder.d();
    }

    @Override // xsna.c63.b
    public final void r(Activity activity, boolean z) {
        VideoPipStateHolder.a.getClass();
        this.u = VideoPipStateHolder.d();
        if (z && !activity.isFinishing() && this.u) {
            q4s0 q4s0Var = this.f;
            if ((q4s0Var.d() || q4s0Var.d()) && q4s0Var.c() && q4s0Var.b()) {
                w4s0 w4s0Var = this.d;
                if (!w4s0Var.n) {
                    SystemClock.elapsedRealtime();
                    pro0.d(w4s0Var.i);
                    w4s0Var.a();
                }
                i0q0.f(new prq0(this, 5));
            }
        }
    }

    @Override // xsna.c63.b
    public final void u() {
        if (this.u) {
            return;
        }
        F(this.e.b());
    }

    @Override // xsna.c63.b
    public final void v() {
        if (this.u) {
            return;
        }
        q4s0 q4s0Var = this.f;
        if ((q4s0Var.d() || q4s0Var.d()) && q4s0Var.c() && q4s0Var.b()) {
            w4s0 w4s0Var = this.d;
            if (!w4s0Var.n) {
                SystemClock.elapsedRealtime();
                pro0.d(w4s0Var.i);
                w4s0Var.a();
            }
            F(q4s0Var.a());
        }
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        D();
    }

    @Override // xsna.c63.b
    public final void y(Activity activity) {
        q4s0 q4s0Var = this.f;
        if (q4s0Var.d() && q4s0Var.c()) {
            w4s0 w4s0Var = this.d;
            if (w4s0Var.n) {
                return;
            }
            p69 p69Var = w4s0Var.i;
            pro0.d(p69Var);
            i0q0.d(3000L, p69Var);
        }
    }
}
