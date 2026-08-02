package jd;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import c0.h0;
import c0.u;
import c0.v;
import c0.w;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f18441a = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final long[] f18442b = {150, 150, 150, 150};

    /* renamed from: c, reason: collision with root package name */
    public final long[] f18443c = {0, 0, 0, 0, 0, 0, 0, 0};

    public static PendingIntent b(Context mContext, Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        intent.setFlags(537001984);
        String uri = intent.toUri(1);
        Intrinsics.checkNotNullExpressionValue(uri, "toUri(...)");
        intent.setData(Uri.parse(uri));
        PendingIntent activity = PendingIntent.getActivity(mContext, 0, intent, Build.VERSION.SDK_INT >= 31 ? 301989888 : 268435456);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    public static Notification e(String str, Context context, String str2, String str3, String str4, PendingIntent pendingIntent) {
        w wVar = new w(context, str2);
        wVar.f3311e = w.b(str3);
        wVar.f3312f = w.b(str4);
        wVar.f3326v.icon = 2131231064;
        if (pendingIntent != null) {
            wVar.f3313g = pendingIntent;
        }
        wVar.f3318m = str;
        wVar.f3319n = true;
        wVar.c(16, true);
        Notification a7 = wVar.a();
        Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
        return a7;
    }

    public final h0 a() {
        if (((h0) this.f18441a.get()) == null) {
            this.f18441a = new WeakReference((h0) y3.m(h0.class, null, 6));
        }
        Object obj = this.f18441a.get();
        Intrinsics.checkNotNull(obj);
        return (h0) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Notification c(String channelId, String channelName, String channelDescription, PendingIntent pendingIntent, String pushTitle, String pushText, Context context, boolean z5, boolean z7, String str, Integer num, boolean z10) {
        NotificationChannel notificationChannel;
        int i5;
        Uri uri;
        String str2;
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(channelDescription, "channelDescription");
        Intrinsics.checkNotNullParameter(pushTitle, "pushTitle");
        Intrinsics.checkNotNullParameter(pushText, "pushText");
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            h0 a7 = a();
            if (i10 >= 26) {
                notificationChannel = a7.f3273b.getNotificationChannel(channelId);
                long[] jArr = this.f18443c;
                long[] jArr2 = this.f18442b;
                if (i10 >= 26 || notificationChannel != null) {
                    i5 = 26;
                    uri = null;
                } else {
                    int color = context.getColor(R.color.colorAccent);
                    NotificationChannel notificationChannel2 = new NotificationChannel(channelId, channelName, 4);
                    notificationChannel2.enableVibration(z5);
                    notificationChannel2.setVibrationPattern(z5 ? jArr2 : jArr);
                    if (z7) {
                        Uri uriFor = Settings.System.getUriFor("notification_sound");
                        AudioAttributes build = new AudioAttributes.Builder().setUsage(5).setContentType(4).build();
                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                        notificationChannel2.setSound(uriFor, build);
                        uri = null;
                    } else {
                        uri = null;
                        notificationChannel2.setSound(null, null);
                    }
                    notificationChannel2.setDescription(channelDescription);
                    notificationChannel2.setLockscreenVisibility(1);
                    notificationChannel2.setLightColor(color);
                    notificationChannel2.enableLights(true);
                    h0 a10 = a();
                    i5 = 26;
                    if (i10 >= 26) {
                        a10.f3273b.createNotificationChannel(notificationChannel2);
                    } else {
                        a10.getClass();
                    }
                    notificationChannel = notificationChannel2;
                }
                if (i10 < i5) {
                    Intrinsics.checkNotNull(notificationChannel);
                    str2 = notificationChannel.getId();
                } else {
                    str2 = channelId;
                }
                w wVar = new w(context, str2);
                if (i10 < i5) {
                    Notification notification = wVar.f3326v;
                    notification.defaults = -1;
                    notification.flags |= 1;
                }
                if (z5) {
                    jArr = jArr2;
                }
                wVar.f3326v.vibrate = jArr;
                Uri uriFor2 = !z7 ? Settings.System.getUriFor("notification_sound") : uri;
                Notification notification2 = wVar.f3326v;
                notification2.sound = uriFor2;
                notification2.audioStreamType = -1;
                notification2.audioAttributes = v.a(v.d(v.c(v.b(), 4), 5));
                wVar.f3326v.icon = 2131231064;
                wVar.f3322r = num.intValue();
                int i11 = 0;
                if (i10 < 26) {
                    Intrinsics.checkNotNull(notificationChannel);
                    int importance = notificationChannel.getImportance();
                    if (importance == 2) {
                        i11 = -1;
                    } else if (importance != 3) {
                        i11 = 1;
                    }
                } else if (z7 || z5) {
                    i11 = 2;
                }
                wVar.j = i11;
                if (i10 >= 26) {
                    Intrinsics.checkNotNull(notificationChannel);
                    wVar.f3324t = notificationChannel.getId();
                }
                u uVar = new u();
                uVar.f3306b = w.b(pushText);
                wVar.e(uVar);
                wVar.f3321p = "msg";
                wVar.f3311e = w.b(pushTitle);
                wVar.f3312f = w.b(pushText);
                wVar.c(2, z10);
                wVar.c(16, true);
                if (pendingIntent != null) {
                    wVar.f3313g = pendingIntent;
                }
                if (str != null) {
                    wVar.f3318m = str;
                }
                Notification a11 = wVar.a();
                Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
                return a11;
            }
            a7.getClass();
        }
        notificationChannel = null;
        long[] jArr3 = this.f18443c;
        long[] jArr22 = this.f18442b;
        if (i10 >= 26) {
        }
        i5 = 26;
        uri = null;
        if (i10 < i5) {
        }
        w wVar2 = new w(context, str2);
        if (i10 < i5) {
        }
        if (z5) {
        }
        wVar2.f3326v.vibrate = jArr3;
        if (!z7) {
        }
        Notification notification22 = wVar2.f3326v;
        notification22.sound = uriFor2;
        notification22.audioStreamType = -1;
        notification22.audioAttributes = v.a(v.d(v.c(v.b(), 4), 5));
        wVar2.f3326v.icon = 2131231064;
        wVar2.f3322r = num.intValue();
        int i112 = 0;
        if (i10 < 26) {
        }
        wVar2.j = i112;
        if (i10 >= 26) {
        }
        u uVar2 = new u();
        uVar2.f3306b = w.b(pushText);
        wVar2.e(uVar2);
        wVar2.f3321p = "msg";
        wVar2.f3311e = w.b(pushTitle);
        wVar2.f3312f = w.b(pushText);
        wVar2.c(2, z10);
        wVar2.c(16, true);
        if (pendingIntent != null) {
        }
        if (str != null) {
        }
        Notification a112 = wVar2.a();
        Intrinsics.checkNotNullExpressionValue(a112, "build(...)");
        return a112;
    }

    public final void d(int i5, String channelId, String channelName, String channelDescription, PendingIntent intent, String pushTitle, String pushText, Context context, boolean z5, boolean z7, String str, int i10, PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(channelDescription, "channelDescription");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(pushTitle, "pushTitle");
        Intrinsics.checkNotNullParameter(pushText, "pushText");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            h0 a7 = a();
            if (Build.VERSION.SDK_INT < 33 ? true : a().a()) {
                Notification c2 = c(channelId, channelName, channelDescription, intent, pushTitle, pushText, context, z5, z7, str, Integer.valueOf(Color.parseColor("#0f4583")), false);
                if (i10 > 0 && str != null && str.length() != 0) {
                    a7.b(i5, c2);
                    a7.b(i10, e(str, context, channelId, pushTitle, pushText, pendingIntent));
                    return;
                }
                a7.b(i5, c2);
            }
        } catch (SecurityException unused) {
        } catch (Exception e7) {
            zc.d.b(4, "notifyCompat", e7);
        }
    }
}
