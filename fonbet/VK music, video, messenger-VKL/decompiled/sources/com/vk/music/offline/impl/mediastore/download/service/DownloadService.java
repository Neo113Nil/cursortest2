package com.vk.music.offline.impl.mediastore.download.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.c;
import androidx.media3.exoplayer.scheduler.Requirements;
import com.vk.core.service.BoundService;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.bn40;
import xsna.bpn0;
import xsna.c8h0;
import xsna.e43;
import xsna.eo1;
import xsna.epx;
import xsna.gi70;
import xsna.gz80;
import xsna.i0q0;
import xsna.i3l;
import xsna.j5g;
import xsna.o7o;
import xsna.p31;
import xsna.r9o;
import xsna.s3q0;
import xsna.uv0;
import xsna.vt70;
import xsna.y2r0;

/* compiled from: DownloadService.kt */
/* loaded from: classes3.dex */
public abstract class DownloadService extends BoundService {
    public static final bpn0 p = new bpn0(new uv0(12));
    public final int d = 14;
    public final String e = "OfflineMusicDownloadService";
    public final int f = R.string.offline_hls_download_notification_channel_name;
    public final boolean g = !gz80.a(31);
    public final boolean h = gz80.a(29);
    public final boolean i;
    public final b j;
    public com.vk.music.offline.impl.mediastore.download.service.a k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;

    /* compiled from: DownloadService.kt */
    public static final class a {
        public static int a(ArrayList arrayList) {
            if (arrayList.isEmpty()) {
                return 1;
            }
            List H0 = j5g.H0(arrayList, 50);
            Iterator it = H0.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((String) it.next()).length();
            }
            return Math.max(1, 256000 / (((i / H0.size()) * 2) + 50));
        }

        public static boolean b() {
            return ((Boolean) DownloadService.p.getValue()).booleanValue();
        }

        public static boolean c(int i) {
            return b() ? i == 2 || i == 7 : i == 2 || i == 5 || i == 7;
        }

        public static void d(Context context, DownloadRequest downloadRequest) {
            i(context, new Intent(context, (Class<?>) OfflineMusicDownloadBoundService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", true).putExtra("download_request", downloadRequest).putExtra("stop_reason", 0));
        }

        public static void e(Context context, String str) {
            i(context, new Intent(context, (Class<?>) OfflineMusicDownloadBoundService.class).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD").putExtra("foreground", true).putExtra("content_id", str));
        }

        public static void f(Context context, ArrayList arrayList) {
            int a = a(arrayList);
            Iterator it = j5g.U0(arrayList, a, a, true).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                Intent putStringArrayListExtra = new Intent(context, (Class<?>) OfflineMusicDownloadBoundService.class).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD").putExtra("foreground", true).putStringArrayListExtra("content_ids", new ArrayList<>((List) next));
                bpn0 bpn0Var = DownloadService.p;
                i(context, putStringArrayListExtra);
                i = i2;
            }
        }

        public static void g(Context context, String str) {
            i(context, new Intent(context, (Class<?>) OfflineMusicDownloadBoundService.class).setAction("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON").putExtra("foreground", true).putExtra("content_id", str).putExtra("stop_reason", 3));
        }

        public static void h(Context context, ArrayList arrayList) {
            int a = a(arrayList);
            Iterator it = j5g.U0(arrayList, a, a, true).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                Intent putExtra = new Intent(context, (Class<?>) OfflineMusicDownloadBoundService.class).setAction("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON").putStringArrayListExtra("content_ids", new ArrayList<>((List) next)).putExtra("foreground", true).putExtra("stop_reason", 3);
                bpn0 bpn0Var = DownloadService.p;
                i(context, putExtra);
                i = i2;
            }
        }

        public static void i(Context context, Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("foreground", false);
            i0q0.j(new vt70(0));
            if (booleanExtra && gz80.a(26)) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        }
    }

    /* compiled from: DownloadService.kt */
    public final class b {
        public final Handler a = new Handler(Looper.getMainLooper());
        public boolean b;
        public boolean c;

        public b() {
        }

        public final void a() {
            DownloadService downloadService = DownloadService.this;
            int i = downloadService.d;
            Notification l = downloadService.l(downloadService.k().m, downloadService.k().o);
            if (this.c) {
                ((NotificationManager) downloadService.getSystemService("notification")).notify(i, l);
            } else {
                bpn0 bpn0Var = DownloadService.p;
                if (a.b()) {
                    this.c = DownloadService.q(downloadService, l);
                } else {
                    downloadService.startForeground(i, l);
                    this.c = true;
                }
            }
            if (this.b) {
                Handler handler = this.a;
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed(new p31(this, 10), 200L);
            }
        }
    }

    public DownloadService() {
        boolean z = true;
        if (!a.b() && !gz80.a(26)) {
            z = false;
        }
        this.i = z;
        this.j = new b();
    }

    public static boolean q(DownloadService downloadService, Notification notification) {
        Object failure;
        int i = downloadService.d;
        try {
            if (downloadService.h) {
                downloadService.startForeground(i, notification, 1);
            } else {
                downloadService.startForeground(i, notification);
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            if (r9o.b(a2)) {
                downloadService.stopSelf();
            }
            com.vk.metrics.eventtracking.b.a.q(a2);
        }
        return !(failure instanceof Result.Failure);
    }

    public abstract c k();

    public abstract Notification l(int i, List list);

    public abstract c8h0 m();

    public final void n(List<o7o> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (a.c(list.get(i).b)) {
                b bVar = this.j;
                bVar.b = true;
                bVar.a();
                return;
            }
        }
    }

    public final void o() {
        b bVar = this.j;
        bVar.b = false;
        bVar.a.removeCallbacksAndMessages(null);
        com.vk.music.offline.impl.mediastore.download.service.a aVar = this.k;
        if (aVar == null || aVar.i()) {
            if (!a.b()) {
                p();
            }
            boolean z = true;
            stopForeground(1);
            if (a.b()) {
                bVar.c = false;
            }
            if (!this.m || gz80.a(28)) {
                z = this.n | stopSelfResult(this.l);
            } else {
                stopSelf();
            }
            this.n = z;
        }
    }

    @Override // com.vk.core.service.BoundService, android.app.Service
    public void onCreate() {
        String str = this.e;
        if (str != null) {
            gi70.a(this, str, this.f);
        }
        if (this.k == null) {
            c8h0 m = this.g ? m() : null;
            k().g(false);
            this.k = new com.vk.music.offline.impl.mediastore.download.service.a(getApplicationContext(), k(), m, getClass());
        }
        com.vk.music.offline.impl.mediastore.download.service.a aVar = this.k;
        if (aVar != null) {
            aVar.f = this;
            if (aVar.c.i) {
                y2r0.p(null).postAtFrontOfQueue(new eo1(2, this, aVar));
            }
        }
    }

    @Override // com.vk.core.service.BoundService, android.app.Service
    public void onDestroy() {
        this.o = true;
        com.vk.music.offline.impl.mediastore.download.service.a aVar = this.k;
        if (aVar != null) {
            aVar.c.f.remove(aVar);
            aVar.f = null;
            aVar.g = null;
        }
        b bVar = this.j;
        bVar.b = false;
        bVar.a.removeCallbacksAndMessages(null);
        i0q0.j(new i3l(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
    
        if (r0.equals("androidx.media3.exoplayer.downloadService.action.INIT") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ac, code lost:
    
        if (r0.equals("androidx.media3.exoplayer.downloadService.action.RESTART") == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015e  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        boolean z;
        c k;
        b bVar;
        this.l = i2;
        this.m = false;
        if (intent == null || (str = intent.getAction()) == null) {
            str = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        switch (str.hashCode()) {
            case -2068303304:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON")) {
                    if (intent != null) {
                        String stringExtra = intent.getStringExtra("content_id");
                        int intExtra = intent.getIntExtra("stop_reason", 0);
                        if (stringExtra == null) {
                            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("content_ids");
                            if (stringArrayListExtra != null) {
                                Iterator<String> it = stringArrayListExtra.iterator();
                                while (it.hasNext()) {
                                    k().i(intExtra, it.next());
                                }
                                break;
                            }
                        } else {
                            k().i(intExtra, stringExtra);
                            break;
                        }
                    }
                }
                bn40.d("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
            case -1192305801:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD")) {
                    if (intent != null) {
                        String stringExtra2 = intent.getStringExtra("content_id");
                        if (stringExtra2 == null) {
                            Iterable stringArrayListExtra2 = intent.getStringArrayListExtra("content_ids");
                            if (stringArrayListExtra2 == null) {
                                stringArrayListExtra2 = EmptyList.b;
                            }
                            Iterator it2 = stringArrayListExtra2.iterator();
                            while (it2.hasNext()) {
                                k().f((String) it2.next());
                            }
                            break;
                        } else {
                            k().f(stringExtra2);
                            break;
                        }
                    }
                }
                bn40.d("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
            case -659421309:
                break;
            case -238450692:
                break;
            case 32678949:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS")) {
                    k().g(false);
                    break;
                }
                bn40.d("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
            case 464223742:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS")) {
                    k().e();
                    break;
                }
                bn40.d("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
            case 829812082:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD")) {
                    DownloadRequest downloadRequest = intent != null ? (DownloadRequest) intent.getParcelableExtra("download_request") : null;
                    if (downloadRequest != null) {
                        k().a(downloadRequest, intent.getIntExtra("stop_reason", 0));
                        break;
                    }
                }
                bn40.d("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
            case 845668953:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS")) {
                    Requirements requirements = intent != null ? (Requirements) intent.getParcelableExtra("requirements") : null;
                    if (requirements != null) {
                        k().h(requirements);
                        break;
                    }
                }
                bn40.d("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
            case 1746253622:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS")) {
                    k().g(true);
                    break;
                }
                bn40.d("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
            default:
                bn40.d("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
        }
        if (intent == null || !intent.getBooleanExtra("foreground", false)) {
            if (!epx.f(intent != null ? intent.getAction() : null, "androidx.media3.exoplayer.downloadService.action.RESTART")) {
                z = false;
                if (this.i && z) {
                    bVar = this.j;
                    if (!bVar.c) {
                        bVar.a();
                    }
                }
                this.n = false;
                k = k();
                if (k.h == 0 && k.g == 0) {
                    o();
                }
                return 1;
            }
        }
        z = true;
        if (this.i) {
            bVar = this.j;
            if (!bVar.c) {
            }
        }
        this.n = false;
        k = k();
        if (k.h == 0) {
            o();
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.m = true;
    }

    public final void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        if (!a.b()) {
            p();
        }
        stopForeground(1);
        if (a.b()) {
            this.j.c = false;
        }
        stopSelf();
        if (a.b()) {
            i0q0.j(new i3l(1));
        }
    }

    public abstract void p();
}
