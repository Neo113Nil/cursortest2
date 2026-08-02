package androidx.media3.exoplayer.offline;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.offline.c;
import androidx.media3.exoplayer.scheduler.Requirements;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import xsna.ahn;
import xsna.c8h0;
import xsna.fxc0;
import xsna.gi70;
import xsna.mf3;
import xsna.o7o;
import xsna.qn9;
import xsna.y2r0;

/* loaded from: classes.dex */
public abstract class DownloadService extends Service {
    public static final HashMap<Class<? extends DownloadService>, a> j = new HashMap<>();

    @Nullable
    public final b b;

    @Nullable
    public final String c;
    public final int d;
    public a e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* loaded from: classes12.dex */
    public static final class a implements c.InterfaceC0061c {
        public final Context b;
        public final c c;
        public final boolean d;

        @Nullable
        public final c8h0 e;
        public final Class<? extends DownloadService> f;

        @Nullable
        public DownloadService g;
        public Requirements h;

        public a() {
            throw null;
        }

        public a(Context context, c cVar, boolean z, c8h0 c8h0Var, Class cls) {
            this.b = context;
            this.c = cVar;
            this.d = z;
            this.e = c8h0Var;
            this.f = cls;
            cVar.f.add(this);
            l();
        }

        @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
        public final void a(o7o o7oVar) {
            b bVar;
            DownloadService downloadService = this.g;
            if (downloadService == null || (bVar = downloadService.b) == null) {
                return;
            }
            bVar.a();
        }

        @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
        public final void b() {
            DownloadService downloadService = this.g;
            if (downloadService != null) {
                HashMap<Class<? extends DownloadService>, a> hashMap = DownloadService.j;
                downloadService.j();
            }
        }

        @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
        public final void c(c cVar, boolean z) {
            if (z || cVar.j) {
                return;
            }
            DownloadService downloadService = this.g;
            if (downloadService == null || downloadService.h) {
                List<o7o> list = cVar.o;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).b == 0) {
                        k();
                        return;
                    }
                }
            }
        }

        @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
        public final void d() {
            l();
        }

        @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
        public final void e(c cVar, o7o o7oVar, @Nullable Exception exc) {
            b bVar;
            DownloadService downloadService = this.g;
            if (downloadService != null && (bVar = downloadService.b) != null) {
                int i = o7oVar.b;
                if (i == 2 || i == 5 || i == 7) {
                    bVar.c();
                } else {
                    bVar.a();
                }
            }
            DownloadService downloadService2 = this.g;
            if (downloadService2 == null || downloadService2.h) {
                int i2 = o7oVar.b;
                HashMap<Class<? extends DownloadService>, a> hashMap = DownloadService.j;
                if (i2 == 2 || i2 == 5 || i2 == 7) {
                    ahn.F("DownloadService wasn't running. Restarting.");
                    k();
                }
            }
        }

        @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
        public final void f(c cVar) {
            DownloadService downloadService = this.g;
            if (downloadService != null) {
                DownloadService.g(downloadService, cVar.o);
            }
        }

        public final void h(DownloadService downloadService) {
            fxc0.z(this.g == null);
            this.g = downloadService;
            if (this.c.i) {
                y2r0.p(null).postAtFrontOfQueue(new qn9(2, this, downloadService));
            }
        }

        public final void i() {
            Requirements requirements = new Requirements(0);
            if (Objects.equals(this.h, requirements)) {
                return;
            }
            this.e.cancel();
            this.h = requirements;
        }

        public final void j(DownloadService downloadService) {
            fxc0.z(this.g == downloadService);
            this.g = null;
        }

        public final void k() {
            boolean z = this.d;
            Class<? extends DownloadService> cls = this.f;
            Context context = this.b;
            if (!z) {
                try {
                    HashMap<Class<? extends DownloadService>, a> hashMap = DownloadService.j;
                    context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
                    return;
                } catch (IllegalStateException unused) {
                    ahn.F("Failed to restart (process is idle)");
                    return;
                }
            }
            try {
                HashMap<Class<? extends DownloadService>, a> hashMap2 = DownloadService.j;
                Intent action = new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
                String str = y2r0.a;
                context.startForegroundService(action);
            } catch (IllegalStateException unused2) {
                ahn.F("Failed to restart (foreground launch restriction)");
            }
        }

        public final boolean l() {
            c cVar = this.c;
            boolean z = cVar.n;
            c8h0 c8h0Var = this.e;
            if (c8h0Var == null) {
                return !z;
            }
            if (!z) {
                i();
                return true;
            }
            Requirements requirements = cVar.p.c;
            if (!c8h0Var.b(requirements).equals(requirements)) {
                i();
                return false;
            }
            if (Objects.equals(this.h, requirements)) {
                return true;
            }
            if (c8h0Var.a(requirements, this.b.getPackageName())) {
                this.h = requirements;
                return true;
            }
            ahn.F("Failed to schedule restart");
            i();
            return false;
        }
    }

    /* loaded from: classes12.dex */
    public final class b {
        public final int a;
        public final long b;
        public final Handler c = new Handler(Looper.getMainLooper());
        public boolean d;
        public boolean e;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final void a() {
            if (this.e) {
                e();
            }
        }

        public final void b() {
            if (this.e) {
                return;
            }
            e();
        }

        public final void c() {
            this.d = true;
            e();
        }

        public final void d() {
            this.d = false;
            this.c.removeCallbacksAndMessages(null);
        }

        @SuppressLint({"InlinedApi"})
        public final void e() {
            DownloadService downloadService = DownloadService.this;
            a aVar = downloadService.e;
            aVar.getClass();
            c cVar = aVar.c;
            Notification i = downloadService.i(cVar.m, cVar.o);
            boolean z = this.e;
            int i2 = this.a;
            if (z) {
                ((NotificationManager) downloadService.getSystemService("notification")).notify(i2, i);
            } else {
                String str = y2r0.a;
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        downloadService.startForeground(i2, i, 1);
                    } catch (RuntimeException e) {
                        ahn.n("Util", "The service must be declared with a foregroundServiceType that includes dataSync");
                        throw e;
                    }
                } else {
                    downloadService.startForeground(i2, i);
                }
                this.e = true;
            }
            if (this.d) {
                Handler handler = this.c;
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed(new mf3(this, 5), this.b);
            }
        }
    }

    public DownloadService(int i, long j2) {
        if (i == 0) {
            this.b = null;
            this.c = null;
            this.d = 0;
        } else {
            this.b = new b(i, j2);
            this.c = "video_download_channel";
            this.d = R.string.video_download_notification_channel;
        }
    }

    public static void g(DownloadService downloadService, List list) {
        b bVar = downloadService.b;
        if (bVar != null) {
            for (int i = 0; i < list.size(); i++) {
                int i2 = ((o7o) list.get(i)).b;
                if (i2 == 2 || i2 == 5 || i2 == 7) {
                    bVar.c();
                    return;
                }
            }
        }
    }

    public static void k(Context context, Class cls, DownloadRequest downloadRequest) {
        context.startService(new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", false).putExtra("download_request", downloadRequest).putExtra("stop_reason", 0));
    }

    public static void l(Context context, Intent intent, boolean z) {
        if (!z) {
            context.startService(intent);
        } else {
            String str = y2r0.a;
            context.startForegroundService(intent);
        }
    }

    public abstract c h();

    public abstract Notification i(int i, List list);

    public final void j() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.d();
        }
        a aVar = this.e;
        aVar.getClass();
        if (aVar.l()) {
            this.h |= stopSelfResult(this.f);
        }
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public void onCreate() {
        String str = this.c;
        if (str != null) {
            gi70.a(this, str, this.d);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, a> hashMap = j;
        a aVar = (a) hashMap.get(cls);
        if (aVar == null) {
            boolean z = this.b != null;
            if (Build.VERSION.SDK_INT >= 31) {
            }
            c h = h();
            h.g(false);
            a aVar2 = new a(getApplicationContext(), h, z, null, cls);
            hashMap.put(cls, aVar2);
            aVar = aVar2;
        }
        this.e = aVar;
        aVar.h(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.i = true;
        a aVar = this.e;
        aVar.getClass();
        aVar.j(this);
        b bVar = this.b;
        if (bVar != null) {
            bVar.d();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        String str;
        String str2;
        c cVar;
        b bVar;
        this.f = i2;
        if (intent != null) {
            str = intent.getAction();
            str2 = intent.getStringExtra("content_id");
            this.g |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(str);
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        a aVar = this.e;
        aVar.getClass();
        cVar = aVar.c;
        switch (str) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    ahn.n("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    cVar.i(intent.getIntExtra("stop_reason", 0), str2);
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (str2 != null) {
                    cVar.f(str2);
                    break;
                } else {
                    ahn.n("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                cVar.g(false);
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                cVar.e();
                break;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                DownloadRequest downloadRequest = (DownloadRequest) intent.getParcelableExtra("download_request");
                if (downloadRequest != null) {
                    cVar.a(downloadRequest, intent.getIntExtra("stop_reason", 0));
                    break;
                } else {
                    ahn.n("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                Requirements requirements = (Requirements) intent.getParcelableExtra("requirements");
                if (requirements != null) {
                    cVar.h(requirements);
                    break;
                } else {
                    ahn.n("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                cVar.g(true);
                break;
            default:
                ahn.n("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
        }
        if (this.g && (bVar = this.b) != null) {
            bVar.b();
        }
        this.h = false;
        if (cVar.h == 0 && cVar.g == 0) {
            j();
        }
        return 1;
    }

    public void onTimeout(int i, int i2) {
        ahn.F("onTimeout() called by system. Calling stopSelf() to terminate gracefully.");
        stopSelf();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}
