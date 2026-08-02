package com.vk.libvideo.offline;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.offline.c;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.bu70;
import xsna.c5g;
import xsna.cu70;
import xsna.drm0;
import xsna.e43;
import xsna.fxc0;
import xsna.gi70;
import xsna.k9o;
import xsna.l9o;
import xsna.lco;
import xsna.mm80;
import xsna.o7o;
import xsna.op4;
import xsna.qjg;
import xsna.qyi0;
import xsna.vhs0;
import xsna.wao;
import xsna.xjo;
import xsna.y2r0;

/* compiled from: VideoDownloadServiceV2.kt */
/* loaded from: classes3.dex */
public final class VideoDownloadServiceV2 extends DownloadService implements c.InterfaceC0061c {
    public static final int p;
    public static final int q;
    public static final int r;
    public NotificationManager k;
    public c l;
    public k9o m;
    public op4 n;
    public final io.reactivex.rxjava3.disposables.b o;

    /* compiled from: VideoDownloadServiceV2.kt */
    public static final class a {
    }

    /* compiled from: VideoDownloadServiceV2.kt */
    public static final class b {
        public b() {
        }
    }

    static {
        a aVar = new a();
        p = qjg.a(aVar).hashCode();
        q = qjg.a(aVar).hashCode() >> 2;
        r = qjg.a(aVar).hashCode() >> 1;
    }

    public VideoDownloadServiceV2() {
        super(p, 2000L);
        this.o = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void e(c cVar, o7o o7oVar, Exception exc) {
        Bitmap bitmap;
        int hashCode = o7oVar.a.hashCode();
        int i = o7oVar.b;
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    m(Integer.valueOf(hashCode));
                    op4 op4Var = this.n;
                    ((LinkedHashMap) (op4Var != null ? op4Var : null).b).remove(Integer.valueOf(hashCode));
                    return;
                } else {
                    int i2 = cVar.m;
                    if ((i2 & 1) == 0 && (i2 & 2) == 0) {
                        return;
                    }
                    i(i2, cVar.o);
                    return;
                }
            }
            m(Integer.valueOf(hashCode));
            Context applicationContext = getApplicationContext();
            int i3 = r;
            k9o k9oVar = this.m;
            if (k9oVar == null) {
                k9oVar = null;
            }
            Context context = k9oVar.a;
            NotificationCompat.h hVar = new NotificationCompat.h(context, "video_download_channel");
            hVar.l = false;
            hVar.I.icon = R.drawable.vk_icon_logo_vk_video_28;
            hVar.e = NotificationCompat.h.d(context.getString(R.string.exo_download_failed));
            hVar.g = k9oVar.d;
            hVar.n(16, true);
            gi70.b(applicationContext, i3, hVar.c());
            op4 op4Var2 = this.n;
            ((LinkedHashMap) (op4Var2 != null ? op4Var2 : null).b).remove(Integer.valueOf(hashCode));
            return;
        }
        m(Integer.valueOf(hashCode));
        Context applicationContext2 = getApplicationContext();
        k9o k9oVar2 = this.m;
        if (k9oVar2 == null) {
            k9oVar2 = null;
        }
        vhs0 vhs0Var = new vhs0(this, 0);
        k9oVar2.getClass();
        VideoFileOld videoFileOld = new VideoFileOld(new JSONObject(y2r0.r(o7oVar.a.h)));
        int hashCode2 = o7oVar.a.hashCode();
        k9oVar2.b(o7oVar, videoFileOld, hashCode2, vhs0Var);
        String str = videoFileOld.l;
        Bitmap bitmap2 = (Bitmap) ((LinkedHashMap) k9oVar2.b.b).get(Integer.valueOf(hashCode2));
        float f = o7oVar.h.b;
        long j = o7oVar.h.a;
        Context context2 = k9oVar2.a;
        Drawable drawable = context2.getDrawable(R.drawable.vk_icon_done_circle_16);
        if (drawable != null) {
            drawable.setTint(context2.getColor(R.color.notification_text_accent));
            drawable.mutate();
            bitmap = xjo.b(drawable, 0, 0, 7);
        } else {
            bitmap = null;
        }
        RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), R.layout.video_download_complete_notification_refinement);
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(R.id.completed_icon, bitmap);
        }
        remoteViews.setTextViewText(R.id.download_title, str);
        if (bitmap2 != null) {
            remoteViews.setImageViewBitmap(R.id.download_preview, bitmap2);
        }
        NotificationCompat.h hVar2 = new NotificationCompat.h(k9oVar2.a, "video_download_channel");
        hVar2.B(new NotificationCompat.j());
        hVar2.l = false;
        hVar2.I.icon = R.drawable.vk_icon_logo_vk_video_28;
        hVar2.e = NotificationCompat.h.d(k9oVar2.a.getString(R.string.long_video_download_complete_notification_message));
        hVar2.z = remoteViews;
        hVar2.g = k9oVar2.d;
        hVar2.r = "COMPLETED_DOWNLOADS_NOTIFICATION_GROUP";
        gi70.b(applicationContext2, hashCode, hVar2.c());
        op4 op4Var3 = this.n;
        if (op4Var3 == null) {
            op4Var3 = null;
        }
        ((LinkedHashMap) op4Var3.b).remove(Integer.valueOf(hashCode));
        Context applicationContext3 = getApplicationContext();
        int i4 = q;
        k9o k9oVar3 = this.m;
        k9o k9oVar4 = k9oVar3 != null ? k9oVar3 : null;
        NotificationCompat.h hVar3 = new NotificationCompat.h(k9oVar4.a, "video_download_channel");
        hVar3.l = false;
        hVar3.I.icon = R.drawable.vk_icon_logo_vk_video_28;
        hVar3.r = "COMPLETED_DOWNLOADS_NOTIFICATION_GROUP";
        hVar3.s = true;
        hVar3.g = k9oVar4.d;
        gi70.b(applicationContext3, i4, hVar3.c());
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService
    public final c h() {
        c cVar = this.l;
        if (cVar == null) {
            return null;
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.widget.RemoteViews] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    @Override // androidx.media3.exoplayer.offline.DownloadService
    public final Notification i(int i, List list) {
        int i2;
        String string;
        String str;
        ?? r11;
        Bitmap bitmap;
        List list2 = list;
        boolean z = list2 instanceof Collection;
        ?? r4 = 0;
        String str2 = "video_download_channel";
        if (!z || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((o7o) it.next()).b == 5) {
                    if (!z || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((o7o) it2.next()).b == 2) {
                                break;
                            }
                        }
                    }
                    if (!z || !list2.isEmpty()) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (((o7o) it3.next()).b == 0) {
                            }
                        }
                    }
                    k9o k9oVar = this.m;
                    if (k9oVar == null) {
                        k9oVar = null;
                    }
                    Context context = k9oVar.a;
                    NotificationCompat.h hVar = new NotificationCompat.h(context, "video_download_channel");
                    hVar.l = false;
                    hVar.I.icon = R.drawable.vk_icon_logo_vk_video_28;
                    hVar.e = NotificationCompat.h.d(context.getString(R.string.video_download_removing));
                    hVar.g = k9oVar.d;
                    Notification c = hVar.c();
                    NotificationManager notificationManager = this.k;
                    (notificationManager == null ? null : notificationManager).notify(p, c);
                    return c;
                }
            }
        }
        k9o k9oVar2 = this.m;
        if (k9oVar2 == null) {
            k9oVar2 = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it4 = list2.iterator();
        while (true) {
            i2 = 1;
            if (!it4.hasNext()) {
                break;
            }
            Object next = it4.next();
            int i3 = ((o7o) next).b;
            if (i3 == 1 || i3 == 2 || i3 == 0) {
                arrayList.add(next);
            }
        }
        qyi0 qyi0Var = new qyi0(this, 19);
        k9oVar2.getClass();
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(new VideoFileOld(new JSONObject(y2r0.r(((o7o) it5.next()).a.h))));
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it6 = arrayList2.iterator();
        int i4 = 0;
        while (it6.hasNext()) {
            Object next2 = it6.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                e43.t();
                throw null;
            }
            int hashCode = ((o7o) arrayList.get(i4)).a.hashCode();
            k9oVar2.b((o7o) arrayList.get(i4), (VideoFile) arrayList2.get(i4), hashCode, qyi0Var);
            arrayList3.add(new wao(((VideoFile) next2).getTitle(), (Bitmap) ((LinkedHashMap) k9oVar2.b.b).get(Integer.valueOf(hashCode)), (int) ((o7o) arrayList.get(i4)).h.b, ((o7o) arrayList.get(i4)).b == 1, ((o7o) arrayList.get(i4)).h.a, k9oVar2.c));
            i4 = i5;
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it7 = arrayList3.iterator();
        int i6 = 0;
        while (it7.hasNext()) {
            Object next3 = it7.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                e43.t();
                throw null;
            }
            wao waoVar = (wao) next3;
            Context context2 = k9oVar2.a;
            o7o o7oVar = (o7o) arrayList.get(i6);
            Context context3 = k9oVar2.a;
            if ((i & 1) != 0) {
                string = context3.getString(R.string.video_download_state_network_awaiting);
            } else if ((i & 2) != 0) {
                string = context3.getString(R.string.video_download_state_wifi_awaiting);
            } else {
                int i8 = o7oVar.b;
                string = i8 == 0 ? context3.getString(R.string.long_video_download_queue_notification_message) : i8 == i2 ? context3.getString(R.string.long_video_download_pause_notification_message_v2) : null;
            }
            if (waoVar != null) {
                int i9 = waoVar.c;
                Drawable drawable = context2.getDrawable(waoVar.d ? R.drawable.vk_icon_pause_16 : R.drawable.vk_icon_download_outline_16);
                if (drawable != null) {
                    drawable.setTint(context2.getColor(R.color.notification_icon_secondary));
                    drawable.mutate();
                    bitmap = xjo.b(drawable, r4, r4, 7);
                } else {
                    bitmap = null;
                }
                r11 = new RemoteViews(context2.getPackageName(), R.layout.video_download_notification_refinement);
                if (bitmap != null) {
                    r11.setImageViewBitmap(R.id.download_icon, bitmap);
                    r11.setViewVisibility(R.id.download_icon, r4);
                } else {
                    r11.setViewVisibility(R.id.download_icon, 8);
                }
                r11.setTextViewText(R.id.download_title, waoVar.a);
                r11.setProgressBar(R.id.download_progress_bar, 100, i9, r4);
                if (string == null) {
                    str = str2;
                    string = waoVar.f.a(waoVar.e).a;
                } else {
                    str = str2;
                }
                if (bitmap == null) {
                    string = drm0.t0(string).toString();
                }
                r11.setTextViewText(R.id.download_status_message, string);
                StringBuilder sb = new StringBuilder();
                sb.append(i9);
                sb.append('%');
                r11.setTextViewText(R.id.download_progress_percentage, sb.toString());
                Bitmap bitmap2 = waoVar.b;
                if (bitmap2 != null) {
                    r11.setImageViewBitmap(R.id.download_preview, bitmap2);
                }
            } else {
                str = str2;
                r11 = 0;
            }
            arrayList4.add(r11);
            i6 = i7;
            str2 = str;
            r4 = 0;
            i2 = 1;
        }
        String str3 = str2;
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it8 = arrayList4.iterator();
        int i10 = 0;
        while (it8.hasNext()) {
            Object next4 = it8.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                e43.t();
                throw null;
            }
            VideoFile videoFile = (VideoFile) arrayList2.get(i10);
            o7o o7oVar2 = (o7o) arrayList.get(i10);
            Context context4 = k9oVar2.a;
            String str4 = str3;
            NotificationCompat.h hVar2 = new NotificationCompat.h(context4, str4);
            hVar2.B(new NotificationCompat.j());
            hVar2.l = false;
            hVar2.I.icon = R.drawable.vk_icon_logo_vk_video_28;
            hVar2.g = k9oVar2.d;
            hVar2.z = (RemoteViews) next4;
            hVar2.e = NotificationCompat.h.d(videoFile.getTitle());
            if (!arrayList.isEmpty()) {
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    int i12 = ((o7o) it9.next()).b;
                    if (i12 == 2 || i12 == 7 || i != 0) {
                        hVar2.r = "DOWNLOADING_NOTIFICATION_GROUP";
                        break;
                    }
                }
            }
            int hashCode2 = o7oVar2.a.hashCode();
            int i13 = o7oVar2.b;
            if (i13 == 0) {
                k9oVar2.a(hVar2, hashCode2, videoFile);
            } else if (i13 == 1) {
                hVar2.a(0, lco.a(VideoDownloadNotifierReceiver$Companion$Actions.ACTION_RESUME, hashCode2, context4, videoFile), context4.getString(R.string.long_video_download_notification_resume_btn_text));
                k9oVar2.a(hVar2, hashCode2, videoFile);
            } else if (i13 == 2 || i13 == 7) {
                hVar2.a(0, lco.a(VideoDownloadNotifierReceiver$Companion$Actions.ACTION_PAUSE, hashCode2, context4, videoFile), context4.getString(R.string.long_video_download_notification_pause_btn_text));
                k9oVar2.a(hVar2, hashCode2, videoFile);
            }
            arrayList5.add(hVar2.c());
            i10 = i11;
            str3 = str4;
        }
        NotificationCompat.h hVar3 = new NotificationCompat.h(k9oVar2.a, str3);
        hVar3.l = false;
        hVar3.I.icon = R.drawable.vk_icon_logo_vk_video_28;
        hVar3.r = "DOWNLOADING_NOTIFICATION_GROUP";
        hVar3.s = true;
        hVar3.g = k9oVar2.d;
        Notification c2 = hVar3.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList5.size();
        for (int i14 = 0; i14 < size; i14++) {
            linkedHashMap.put(Integer.valueOf(((o7o) arrayList.get(i14)).a.hashCode()), arrayList5.get(i14));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            Notification notification = (Notification) entry.getValue();
            NotificationManager notificationManager2 = this.k;
            if (notificationManager2 == null) {
                notificationManager2 = null;
            }
            notificationManager2.notify(intValue, notification);
        }
        return c2;
    }

    public final void m(Integer num) {
        DownloadService.b bVar;
        c cVar = this.l;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar.o.isEmpty() && (bVar = this.b) != null && !this.i) {
            bVar.a();
        }
        int intValue = num.intValue();
        NotificationManager notificationManager = this.k;
        (notificationManager != null ? notificationManager : null).cancel(intValue);
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
        this.k = (NotificationManager) getSystemService("notification");
        super.onCreate();
        c cVar2 = this.l;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.getClass();
        cVar2.f.add(this);
        this.n = new op4(new b());
        Context applicationContext = getApplicationContext();
        l9o l9oVar = new l9o();
        lco lcoVar = new lco();
        op4 op4Var = this.n;
        this.m = new k9o(applicationContext, l9oVar, lcoVar, op4Var != null ? op4Var : null);
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.l;
        if (cVar == null) {
            cVar = null;
        }
        cVar.f.remove(this);
        this.o.e();
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
