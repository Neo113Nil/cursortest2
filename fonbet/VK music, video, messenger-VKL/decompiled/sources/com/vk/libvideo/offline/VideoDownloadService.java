package com.vk.libvideo.offline;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.offline.c;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a0a;
import xsna.asp;
import xsna.bpn0;
import xsna.bu70;
import xsna.cu70;
import xsna.drm0;
import xsna.fxc0;
import xsna.gi70;
import xsna.h9o;
import xsna.mm80;
import xsna.o7o;
import xsna.qjg;
import xsna.t2i0;
import xsna.uhs0;
import xsna.zrp;

/* compiled from: VideoDownloadService.kt */
/* loaded from: classes.dex */
public final class VideoDownloadService extends DownloadService implements c.InterfaceC0061c {
    public static final int n;
    public static final int o;
    public final bpn0 k;
    public c l;
    public o7o m;

    /* compiled from: VideoDownloadService.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: VideoDownloadService.kt */
        /* renamed from: com.vk.libvideo.offline.VideoDownloadService$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1239a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.MUSIC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final PendingIntent a(VideoDownloadService videoDownloadService, b bVar) {
            Intent intent;
            int i = VideoDownloadService.n;
            int i2 = C1239a.$EnumSwitchMapping$0[bVar.ordinal()];
            if (i2 == 1) {
                intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setData(Uri.parse("https://" + a0a.d + "/audio"));
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = VideoDownloadNotifierReceiver.a;
                VideoDownloadNotifierReceiver$Companion$Actions videoDownloadNotifierReceiver$Companion$Actions = VideoDownloadNotifierReceiver$Companion$Actions.ACTION_CLICK;
                intent = new Intent(videoDownloadService, (Class<?>) VideoDownloadNotifierReceiver.class);
                intent.setAction(videoDownloadNotifierReceiver$Companion$Actions.getTitle());
            }
            try {
                return t2i0.a(videoDownloadService, 0, intent, 167772160);
            } catch (NullPointerException e) {
                com.vk.metrics.eventtracking.b.a.a(e);
                return null;
            } catch (SecurityException e2) {
                com.vk.metrics.eventtracking.b.a.a(e2);
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDownloadService.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b MUSIC;
        public static final b VIDEO;

        static {
            b bVar = new b(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = bVar;
            b bVar2 = new b("MUSIC", 1);
            MUSIC = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    static {
        a aVar = new a();
        n = qjg.a(aVar).hashCode();
        o = qjg.a(aVar).hashCode() >> 1;
    }

    public VideoDownloadService() {
        super(n, 200L);
        this.k = new bpn0(new uhs0(this, 0));
    }

    public static b o(o7o o7oVar) {
        return drm0.D(o7oVar.a.b, "track", false) ? b.MUSIC : b.VIDEO;
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void e(c cVar, o7o o7oVar, Exception exc) {
        this.m = o7oVar;
        int i = o7oVar.b;
        DownloadService.b bVar = this.b;
        int i2 = o;
        if (i == 3) {
            c cVar2 = this.l;
            if ((cVar2 != null ? cVar2 : null).o.isEmpty() && bVar != null && !this.i) {
                bVar.a();
            }
            gi70.b(this, i2, m(o7oVar));
            return;
        }
        if (i != 4) {
            return;
        }
        c cVar3 = this.l;
        if ((cVar3 != null ? cVar3 : null).o.isEmpty() && bVar != null && !this.i) {
            bVar.a();
        }
        gi70.b(this, i2, n(o7oVar));
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService
    public final c h() {
        c cVar = this.l;
        if (cVar == null) {
            return null;
        }
        return cVar;
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService
    public final Notification i(int i, List list) {
        b bVar;
        b bVar2;
        b bVar3;
        if (!list.isEmpty()) {
            o7o o7oVar = this.m;
            if (o7oVar == null || (bVar = o(o7oVar)) == null) {
                bVar = b.VIDEO;
            }
            String string = getString((o7oVar != null && o7oVar.b == 5 && bVar == b.VIDEO) ? R.string.video_download_removing : R.string.exo_download_downloading);
            NotificationCompat.h hVar = new NotificationCompat.h(this, "video_download_channel");
            hVar.z(R.drawable.vk_icon_download_outline_28);
            hVar.k(string);
            hVar.w(100, 50, true);
            hVar.i(a.a(this, bVar));
            return hVar.c();
        }
        o7o o7oVar2 = this.m;
        Integer valueOf = o7oVar2 != null ? Integer.valueOf(o7oVar2.b) : null;
        if (valueOf != null && valueOf.intValue() == 5) {
            if (o7oVar2 == null || (bVar3 = o(o7oVar2)) == null) {
                bVar3 = b.VIDEO;
            }
            String string2 = getString(bVar3 == b.VIDEO ? R.string.video_download_removal_complete : R.string.video_music_track_download_removal_complete);
            NotificationCompat.h hVar2 = new NotificationCompat.h(this, "video_download_channel");
            hVar2.z(R.drawable.vk_icon_download_cancel_outline_28);
            hVar2.k(string2);
            hVar2.i(a.a(this, bVar3));
            return hVar2.c();
        }
        if (valueOf != null && valueOf.intValue() == 4) {
            return n(o7oVar2);
        }
        if (valueOf != null && valueOf.intValue() == 3) {
            return m(o7oVar2);
        }
        if (o7oVar2 == null || (bVar2 = o(o7oVar2)) == null) {
            bVar2 = b.VIDEO;
        }
        NotificationCompat.h hVar3 = new NotificationCompat.h(this, "video_download_channel");
        hVar3.z(R.drawable.vk_icon_new_logo_vk_outline_28);
        hVar3.k("");
        hVar3.i(a.a(this, bVar2));
        hVar3.e(true);
        return hVar3.c();
    }

    public final Notification m(o7o o7oVar) {
        b bVar;
        if (o7oVar == null || (bVar = o(o7oVar)) == null) {
            bVar = b.VIDEO;
        }
        Notification a2 = ((h9o) this.k.getValue()).a(this, R.drawable.vk_icon_download_check_outline_28, a.a(this, bVar));
        a2.flags |= 16;
        return a2;
    }

    public final Notification n(o7o o7oVar) {
        b bVar;
        if (o7oVar == null || (bVar = o(o7oVar)) == null) {
            bVar = b.VIDEO;
        }
        NotificationCompat.h hVar = new NotificationCompat.h(this, "video_download_channel");
        hVar.z(R.drawable.vk_icon_error_circle_outline_28);
        hVar.k(getString(R.string.exo_download_failed));
        hVar.i(a.a(this, bVar));
        hVar.e(true);
        return hVar.c();
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService, android.app.Service
    public final void onCreate() {
        c cVar;
        RuntimeException runtimeException;
        fxc0.B().s().H();
        mm80 f = fxc0.B().s().f();
        if (f != null) {
            getApplicationContext();
            this.l = f.d();
        } else {
            bu70 bu70Var = bu70.a;
            getApplicationContext();
            synchronized (bu70Var) {
                cVar = bu70.e;
                if (cVar == null) {
                    runtimeException = cu70.a;
                    throw runtimeException;
                }
            }
            this.l = cVar;
        }
        super.onCreate();
        c cVar2 = this.l;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.getClass();
        cVar2.f.add(this);
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.l;
        if (cVar == null) {
            cVar = null;
        }
        cVar.f.remove(this);
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 2;
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService
    public final void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        stopSelf();
    }
}
