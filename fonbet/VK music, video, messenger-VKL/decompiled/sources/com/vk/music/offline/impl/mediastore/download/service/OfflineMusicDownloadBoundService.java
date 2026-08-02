package com.vk.music.offline.impl.mediastore.download.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.media3.exoplayer.offline.c;
import androidx.media3.exoplayer.scheduler.PlatformScheduler;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.metrics.eventtracking.b;
import com.vk.music.offline.impl.mediastore.download.service.DownloadService;
import java.util.List;
import xsna.a0a;
import xsna.bpn0;
import xsna.c8h0;
import xsna.e43;
import xsna.epx;
import xsna.i9o;
import xsna.jo60;
import xsna.o7o;
import xsna.q7s;
import xsna.sy50;
import xsna.t2i0;

/* compiled from: OfflineMusicDownloadBoundService.kt */
/* loaded from: classes3.dex */
public final class OfflineMusicDownloadBoundService extends DownloadService implements c.InterfaceC0061c {
    public static final PlatformScheduler w;
    public final q7s q = new q7s();
    public final bpn0 r = new bpn0(new sy50(this, 4));
    public int s = -1;
    public final bpn0 t = new bpn0(new jo60(1));
    public final PlatformScheduler u = w;
    public boolean v;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        w = new PlatformScheduler(context);
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void e(c cVar, o7o o7oVar, Exception exc) {
        int i = o7oVar.b;
        this.s = i;
        if (!((Boolean) DownloadService.p.getValue()).booleanValue() && !this.v && (i == 2 || i == 7)) {
            s();
        }
        int i2 = this.s;
        if ((i2 == 3 || i2 == 4) && k().o.isEmpty() && !this.o) {
            DownloadService.b bVar = this.j;
            if (bVar.c) {
                bVar.a();
            }
        }
    }

    @Override // com.vk.music.offline.impl.mediastore.download.service.DownloadService
    public final c k() {
        return (c) this.t.getValue();
    }

    @Override // com.vk.music.offline.impl.mediastore.download.service.DownloadService
    public final Notification l(int i, List list) {
        return ((i9o) this.r.getValue()).a(this.s, r(), list);
    }

    @Override // com.vk.music.offline.impl.mediastore.download.service.DownloadService
    public final c8h0 m() {
        return this.u;
    }

    @Override // com.vk.music.offline.impl.mediastore.download.service.DownloadService, com.vk.core.service.BoundService, android.app.Service
    public final void onCreate() {
        this.q.getClass();
        q7s.a("OfflineMusicDownloadBoundService");
        super.onCreate();
        c k = k();
        k.getClass();
        k.f.add(this);
    }

    @Override // com.vk.music.offline.impl.mediastore.download.service.DownloadService, com.vk.core.service.BoundService, android.app.Service
    public final void onDestroy() {
        this.v = false;
        super.onDestroy();
        k().f.remove(this);
    }

    @Override // com.vk.music.offline.impl.mediastore.download.service.DownloadService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (((Boolean) DownloadService.p.getValue()).booleanValue()) {
            return 2;
        }
        if (intent == null || !intent.getBooleanExtra("foreground", false)) {
            if (!epx.f(intent != null ? intent.getAction() : null, "androidx.media3.exoplayer.downloadService.action.RESTART") && this.v) {
                return 2;
            }
        }
        s();
        return 2;
    }

    @Override // com.vk.music.offline.impl.mediastore.download.service.DownloadService
    public final void p() {
        this.v = false;
    }

    public final PendingIntent r() {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse("https://" + a0a.d + "/audio"));
        try {
            return t2i0.a(this, 0, intent, 167772160);
        } catch (NullPointerException e) {
            b.a.a(e);
            return null;
        } catch (SecurityException e2) {
            b.a.a(e2);
            return null;
        }
    }

    public final void s() {
        if (this.v) {
            return;
        }
        this.v = DownloadService.q(this, ((i9o) this.r.getValue()).a(this.s, r(), k().o));
    }
}
