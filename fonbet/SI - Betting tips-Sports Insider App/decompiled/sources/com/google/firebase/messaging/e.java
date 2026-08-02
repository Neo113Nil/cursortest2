package com.google.firebase.messaging;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import io.sentry.android.core.w0;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f6111a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(69:0|1|(3:2|3|(1:5))|197|7|8|(3:173|174|(67:176|(60:178|(1:180)|11|(1:13)|14|(1:16)|17|(51:19|(1:159)|23|(1:25)|26|(1:28)(2:149|(1:154)(1:153))|29|(1:31)|32|(1:34)(5:137|(1:139)|140|(1:142)(1:148)|(1:144)(2:145|(1:147)))|35|(1:37)(6:119|(4:122|(2:130|131)(1:128)|129|120)|132|133|(1:135)|136)|38|(1:40)(1:118)|(1:42)|43|(33:114|115|(1:49)|50|(1:52)|53|(27:105|(1:109)|(1:57)|58|(23:100|(1:104)|(1:62)|63|(2:96|(1:98)(18:99|(1:67)|68|(1:70)|71|(1:73)|74|(3:76|(1:79)|80)|81|(1:83)|84|(1:86)|87|(1:89)|90|(1:92)|93|94))|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|45|(33:110|111|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|160|(2:168|169)|(1:167)|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|181|(63:183|(1:185)|11|(0)|14|(0)|17|(0)|160|(1:162)|168|169|(1:165)|167|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)(1:193)|186|(3:188|(1:190)(1:192)|191)|11|(0)|14|(0)|17|(0)|160|(0)|168|169|(0)|167|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94))|10|11|(0)|14|(0)|17|(0)|160|(0)|168|169|(0)|167|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94) */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0162, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0163, code lost:
    
        io.sentry.android.core.w0.m("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0317 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ca  */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v84, types: [int] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l a(FirebaseMessagingService firebaseMessagingService, h9.c cVar) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String s8;
        String s10;
        String u10;
        int i5;
        String u11;
        Uri defaultUri;
        String u12;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String u13;
        Integer valueOf;
        String u14;
        Integer m6;
        Integer m10;
        Integer m11;
        Integer num;
        Long r5;
        long[] v5;
        int[] o3;
        ?? r02;
        String u15;
        int i10;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e7) {
            w0.m("FirebaseMessaging", "Couldn't get own application info: " + e7);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String u16 = cVar.u("gcm.n.android_channel_id");
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(u16)) {
                    if (notificationManager.getNotificationChannel(u16) == null) {
                        w0.m("FirebaseMessaging", "Notification Channel requested (" + u16 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    c0.w wVar = new c0.w(firebaseMessagingService, u16);
                    s8 = cVar.s(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(s8)) {
                        wVar.f3311e = c0.w.b(s8);
                    }
                    s10 = cVar.s(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(s10)) {
                        wVar.f3312f = c0.w.b(s10);
                        c0.u uVar = new c0.u();
                        uVar.f3306b = c0.w.b(s10);
                        wVar.e(uVar);
                    }
                    u10 = cVar.u("gcm.n.icon");
                    if (!TextUtils.isEmpty(u10)) {
                        i5 = resources.getIdentifier(u10, "drawable", packageName);
                        if ((i5 == 0 || !b(i5, resources)) && ((i5 = resources.getIdentifier(u10, "mipmap", packageName)) == 0 || !b(i5, resources))) {
                            w0.m("FirebaseMessaging", "Icon resource " + u10 + " not found. Notification will use default icon.");
                        }
                        wVar.f3326v.icon = i5;
                        u11 = cVar.u("gcm.n.sound2");
                        if (TextUtils.isEmpty(u11)) {
                            u11 = cVar.u("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(u11)) {
                            defaultUri = null;
                        } else if ("default".equals(u11) || resources.getIdentifier(u11, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + u11);
                        }
                        char c2 = 4;
                        if (defaultUri != null) {
                            Notification notification = wVar.f3326v;
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = c0.v.a(c0.v.d(c0.v.c(c0.v.b(), 4), 5));
                        }
                        u12 = cVar.u("gcm.n.click_action");
                        if (TextUtils.isEmpty(u12)) {
                            String u17 = cVar.u("gcm.n.link_android");
                            if (TextUtils.isEmpty(u17)) {
                                u17 = cVar.u("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(u17) ? Uri.parse(u17) : null;
                            if (parse != null) {
                                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setData(parse);
                            } else {
                                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                if (launchIntentForPackage == null) {
                                    w0.m("FirebaseMessaging", "No activity found to launch app");
                                }
                            }
                        } else {
                            launchIntentForPackage = new Intent(u12);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(268435456);
                        }
                        AtomicInteger atomicInteger = f6111a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = (Bundle) cVar.f10430b;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                char c8 = c2;
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                                c2 = c8;
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (cVar.l("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", cVar.y());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        wVar.f3313g = activity;
                        broadcast = !cVar.l("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.y())), 1140850688);
                        if (broadcast != null) {
                            wVar.f3326v.deleteIntent = broadcast;
                        }
                        u13 = cVar.u("gcm.n.color");
                        if (!TextUtils.isEmpty(u13)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(u13));
                            } catch (IllegalArgumentException unused) {
                                w0.m("FirebaseMessaging", "Color is invalid: " + u13 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                wVar.f3322r = valueOf.intValue();
                            }
                            wVar.c(16, !cVar.l("gcm.n.sticky"));
                            wVar.f3320o = cVar.l("gcm.n.local_only");
                            u14 = cVar.u("gcm.n.ticker");
                            if (u14 != null) {
                                wVar.f3326v.tickerText = c0.w.b(u14);
                            }
                            m6 = cVar.m("gcm.n.notification_priority");
                            if (m6 != null) {
                                if (m6.intValue() < -2 || m6.intValue() > 2) {
                                    w0.m("FirebaseMessaging", "notificationPriority is invalid " + m6 + ". Skipping setting notificationPriority.");
                                }
                                if (m6 != null) {
                                    wVar.j = m6.intValue();
                                }
                                m10 = cVar.m("gcm.n.visibility");
                                if (m10 != null) {
                                    if (m10.intValue() < -1 || m10.intValue() > 1) {
                                        w0.m("NotificationParams", "visibility is invalid: " + m10 + ". Skipping setting visibility.");
                                    }
                                    if (m10 != null) {
                                        wVar.f3323s = m10.intValue();
                                    }
                                    m11 = cVar.m("gcm.n.notification_count");
                                    if (m11 != null) {
                                        if (m11.intValue() >= 0) {
                                            num = m11;
                                            if (num != null) {
                                                wVar.f3315i = num.intValue();
                                            }
                                            r5 = cVar.r();
                                            if (r5 != null) {
                                                wVar.f3316k = true;
                                                wVar.f3326v.when = r5.longValue();
                                            }
                                            v5 = cVar.v();
                                            if (v5 != null) {
                                                wVar.f3326v.vibrate = v5;
                                            }
                                            o3 = cVar.o();
                                            if (o3 != null) {
                                                int i12 = o3[0];
                                                int i13 = o3[1];
                                                int i14 = o3[2];
                                                Notification notification2 = wVar.f3326v;
                                                notification2.ledARGB = i12;
                                                notification2.ledOnMS = i13;
                                                notification2.ledOffMS = i14;
                                                if (i13 != 0 && i14 != 0) {
                                                    i11 = 1;
                                                }
                                                notification2.flags = (notification2.flags & (-2)) | i11;
                                            }
                                            boolean l6 = cVar.l("gcm.n.default_sound");
                                            boolean z5 = l6;
                                            if (cVar.l("gcm.n.default_vibrate_timings")) {
                                                z5 = (l6 ? 1 : 0) | 2;
                                            }
                                            r02 = z5;
                                            if (cVar.l("gcm.n.default_light_settings")) {
                                                r02 = (z5 ? 1 : 0) | 4;
                                            }
                                            Notification notification3 = wVar.f3326v;
                                            notification3.defaults = r02;
                                            if ((r02 & 4) != 0) {
                                                notification3.flags |= 1;
                                            }
                                            u15 = cVar.u("gcm.n.tag");
                                            if (TextUtils.isEmpty(u15)) {
                                                u15 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                            }
                                            return new l(wVar, u15);
                                        }
                                        w0.m("FirebaseMessaging", "notificationCount is invalid: " + m11 + ". Skipping setting notificationCount.");
                                    }
                                    num = null;
                                    if (num != null) {
                                    }
                                    r5 = cVar.r();
                                    if (r5 != null) {
                                    }
                                    v5 = cVar.v();
                                    if (v5 != null) {
                                    }
                                    o3 = cVar.o();
                                    if (o3 != null) {
                                    }
                                    boolean l62 = cVar.l("gcm.n.default_sound");
                                    boolean z52 = l62;
                                    if (cVar.l("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z52;
                                    if (cVar.l("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification32 = wVar.f3326v;
                                    notification32.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    u15 = cVar.u("gcm.n.tag");
                                    if (TextUtils.isEmpty(u15)) {
                                    }
                                    return new l(wVar, u15);
                                }
                                m10 = null;
                                if (m10 != null) {
                                }
                                m11 = cVar.m("gcm.n.notification_count");
                                if (m11 != null) {
                                }
                                num = null;
                                if (num != null) {
                                }
                                r5 = cVar.r();
                                if (r5 != null) {
                                }
                                v5 = cVar.v();
                                if (v5 != null) {
                                }
                                o3 = cVar.o();
                                if (o3 != null) {
                                }
                                boolean l622 = cVar.l("gcm.n.default_sound");
                                boolean z522 = l622;
                                if (cVar.l("gcm.n.default_vibrate_timings")) {
                                }
                                r02 = z522;
                                if (cVar.l("gcm.n.default_light_settings")) {
                                }
                                Notification notification322 = wVar.f3326v;
                                notification322.defaults = r02;
                                if ((r02 & 4) != 0) {
                                }
                                u15 = cVar.u("gcm.n.tag");
                                if (TextUtils.isEmpty(u15)) {
                                }
                                return new l(wVar, u15);
                            }
                            m6 = null;
                            if (m6 != null) {
                            }
                            m10 = cVar.m("gcm.n.visibility");
                            if (m10 != null) {
                            }
                            m10 = null;
                            if (m10 != null) {
                            }
                            m11 = cVar.m("gcm.n.notification_count");
                            if (m11 != null) {
                            }
                            num = null;
                            if (num != null) {
                            }
                            r5 = cVar.r();
                            if (r5 != null) {
                            }
                            v5 = cVar.v();
                            if (v5 != null) {
                            }
                            o3 = cVar.o();
                            if (o3 != null) {
                            }
                            boolean l6222 = cVar.l("gcm.n.default_sound");
                            boolean z5222 = l6222;
                            if (cVar.l("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z5222;
                            if (cVar.l("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222 = wVar.f3326v;
                            notification3222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            u15 = cVar.u("gcm.n.tag");
                            if (TextUtils.isEmpty(u15)) {
                            }
                            return new l(wVar, u15);
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i10 != 0) {
                            try {
                                valueOf = Integer.valueOf(firebaseMessagingService.getColor(i10));
                            } catch (Resources.NotFoundException unused2) {
                                w0.m("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            wVar.c(16, !cVar.l("gcm.n.sticky"));
                            wVar.f3320o = cVar.l("gcm.n.local_only");
                            u14 = cVar.u("gcm.n.ticker");
                            if (u14 != null) {
                            }
                            m6 = cVar.m("gcm.n.notification_priority");
                            if (m6 != null) {
                            }
                            m6 = null;
                            if (m6 != null) {
                            }
                            m10 = cVar.m("gcm.n.visibility");
                            if (m10 != null) {
                            }
                            m10 = null;
                            if (m10 != null) {
                            }
                            m11 = cVar.m("gcm.n.notification_count");
                            if (m11 != null) {
                            }
                            num = null;
                            if (num != null) {
                            }
                            r5 = cVar.r();
                            if (r5 != null) {
                            }
                            v5 = cVar.v();
                            if (v5 != null) {
                            }
                            o3 = cVar.o();
                            if (o3 != null) {
                            }
                            boolean l62222 = cVar.l("gcm.n.default_sound");
                            boolean z52222 = l62222;
                            if (cVar.l("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z52222;
                            if (cVar.l("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222 = wVar.f3326v;
                            notification32222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            u15 = cVar.u("gcm.n.tag");
                            if (TextUtils.isEmpty(u15)) {
                            }
                            return new l(wVar, u15);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        wVar.c(16, !cVar.l("gcm.n.sticky"));
                        wVar.f3320o = cVar.l("gcm.n.local_only");
                        u14 = cVar.u("gcm.n.ticker");
                        if (u14 != null) {
                        }
                        m6 = cVar.m("gcm.n.notification_priority");
                        if (m6 != null) {
                        }
                        m6 = null;
                        if (m6 != null) {
                        }
                        m10 = cVar.m("gcm.n.visibility");
                        if (m10 != null) {
                        }
                        m10 = null;
                        if (m10 != null) {
                        }
                        m11 = cVar.m("gcm.n.notification_count");
                        if (m11 != null) {
                        }
                        num = null;
                        if (num != null) {
                        }
                        r5 = cVar.r();
                        if (r5 != null) {
                        }
                        v5 = cVar.v();
                        if (v5 != null) {
                        }
                        o3 = cVar.o();
                        if (o3 != null) {
                        }
                        boolean l622222 = cVar.l("gcm.n.default_sound");
                        boolean z522222 = l622222;
                        if (cVar.l("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z522222;
                        if (cVar.l("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222 = wVar.f3326v;
                        notification322222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        u15 = cVar.u("gcm.n.tag");
                        if (TextUtils.isEmpty(u15)) {
                        }
                        return new l(wVar, u15);
                    }
                    i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i5 != 0 || !b(i5, resources)) {
                        i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i5 != 0 || !b(i5, resources)) {
                        i5 = 17301651;
                    }
                    wVar.f3326v.icon = i5;
                    u11 = cVar.u("gcm.n.sound2");
                    if (TextUtils.isEmpty(u11)) {
                    }
                    if (TextUtils.isEmpty(u11)) {
                    }
                    char c22 = 4;
                    if (defaultUri != null) {
                    }
                    u12 = cVar.u("gcm.n.click_action");
                    if (TextUtils.isEmpty(u12)) {
                    }
                    AtomicInteger atomicInteger2 = f6111a;
                    if (launchIntentForPackage == null) {
                    }
                    wVar.f3313g = activity;
                    if (!cVar.l("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    u13 = cVar.u("gcm.n.color");
                    if (!TextUtils.isEmpty(u13)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    wVar.c(16, !cVar.l("gcm.n.sticky"));
                    wVar.f3320o = cVar.l("gcm.n.local_only");
                    u14 = cVar.u("gcm.n.ticker");
                    if (u14 != null) {
                    }
                    m6 = cVar.m("gcm.n.notification_priority");
                    if (m6 != null) {
                    }
                    m6 = null;
                    if (m6 != null) {
                    }
                    m10 = cVar.m("gcm.n.visibility");
                    if (m10 != null) {
                    }
                    m10 = null;
                    if (m10 != null) {
                    }
                    m11 = cVar.m("gcm.n.notification_count");
                    if (m11 != null) {
                    }
                    num = null;
                    if (num != null) {
                    }
                    r5 = cVar.r();
                    if (r5 != null) {
                    }
                    v5 = cVar.v();
                    if (v5 != null) {
                    }
                    o3 = cVar.o();
                    if (o3 != null) {
                    }
                    boolean l6222222 = cVar.l("gcm.n.default_sound");
                    boolean z5222222 = l6222222;
                    if (cVar.l("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z5222222;
                    if (cVar.l("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222 = wVar.f3326v;
                    notification3222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    u15 = cVar.u("gcm.n.tag");
                    if (TextUtils.isEmpty(u15)) {
                    }
                    return new l(wVar, u15);
                }
                u16 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(u16)) {
                    if (notificationManager.getNotificationChannel(u16) == null) {
                        w0.m("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    c0.w wVar2 = new c0.w(firebaseMessagingService, u16);
                    s8 = cVar.s(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(s8)) {
                    }
                    s10 = cVar.s(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(s10)) {
                    }
                    u10 = cVar.u("gcm.n.icon");
                    if (!TextUtils.isEmpty(u10)) {
                    }
                    i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i5 != 0) {
                    }
                    i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i5 != 0) {
                    }
                    i5 = 17301651;
                    wVar2.f3326v.icon = i5;
                    u11 = cVar.u("gcm.n.sound2");
                    if (TextUtils.isEmpty(u11)) {
                    }
                    if (TextUtils.isEmpty(u11)) {
                    }
                    char c222 = 4;
                    if (defaultUri != null) {
                    }
                    u12 = cVar.u("gcm.n.click_action");
                    if (TextUtils.isEmpty(u12)) {
                    }
                    AtomicInteger atomicInteger22 = f6111a;
                    if (launchIntentForPackage == null) {
                    }
                    wVar2.f3313g = activity;
                    if (!cVar.l("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    u13 = cVar.u("gcm.n.color");
                    if (!TextUtils.isEmpty(u13)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    wVar2.c(16, !cVar.l("gcm.n.sticky"));
                    wVar2.f3320o = cVar.l("gcm.n.local_only");
                    u14 = cVar.u("gcm.n.ticker");
                    if (u14 != null) {
                    }
                    m6 = cVar.m("gcm.n.notification_priority");
                    if (m6 != null) {
                    }
                    m6 = null;
                    if (m6 != null) {
                    }
                    m10 = cVar.m("gcm.n.visibility");
                    if (m10 != null) {
                    }
                    m10 = null;
                    if (m10 != null) {
                    }
                    m11 = cVar.m("gcm.n.notification_count");
                    if (m11 != null) {
                    }
                    num = null;
                    if (num != null) {
                    }
                    r5 = cVar.r();
                    if (r5 != null) {
                    }
                    v5 = cVar.v();
                    if (v5 != null) {
                    }
                    o3 = cVar.o();
                    if (o3 != null) {
                    }
                    boolean l62222222 = cVar.l("gcm.n.default_sound");
                    boolean z52222222 = l62222222;
                    if (cVar.l("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z52222222;
                    if (cVar.l("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222 = wVar2.f3326v;
                    notification32222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    u15 = cVar.u("gcm.n.tag");
                    if (TextUtils.isEmpty(u15)) {
                    }
                    return new l(wVar2, u15);
                }
                w0.m("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                u16 = "fcm_fallback_notification_channel";
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                    if (identifier == 0) {
                        w0.d("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = firebaseMessagingService.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                packageName = firebaseMessagingService.getPackageName();
                Resources resources22 = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                c0.w wVar22 = new c0.w(firebaseMessagingService, u16);
                s8 = cVar.s(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(s8)) {
                }
                s10 = cVar.s(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(s10)) {
                }
                u10 = cVar.u("gcm.n.icon");
                if (!TextUtils.isEmpty(u10)) {
                }
                i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i5 != 0) {
                }
                i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i5 != 0) {
                }
                i5 = 17301651;
                wVar22.f3326v.icon = i5;
                u11 = cVar.u("gcm.n.sound2");
                if (TextUtils.isEmpty(u11)) {
                }
                if (TextUtils.isEmpty(u11)) {
                }
                char c2222 = 4;
                if (defaultUri != null) {
                }
                u12 = cVar.u("gcm.n.click_action");
                if (TextUtils.isEmpty(u12)) {
                }
                AtomicInteger atomicInteger222 = f6111a;
                if (launchIntentForPackage == null) {
                }
                wVar22.f3313g = activity;
                if (!cVar.l("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                u13 = cVar.u("gcm.n.color");
                if (!TextUtils.isEmpty(u13)) {
                }
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i10 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                wVar22.c(16, !cVar.l("gcm.n.sticky"));
                wVar22.f3320o = cVar.l("gcm.n.local_only");
                u14 = cVar.u("gcm.n.ticker");
                if (u14 != null) {
                }
                m6 = cVar.m("gcm.n.notification_priority");
                if (m6 != null) {
                }
                m6 = null;
                if (m6 != null) {
                }
                m10 = cVar.m("gcm.n.visibility");
                if (m10 != null) {
                }
                m10 = null;
                if (m10 != null) {
                }
                m11 = cVar.m("gcm.n.notification_count");
                if (m11 != null) {
                }
                num = null;
                if (num != null) {
                }
                r5 = cVar.r();
                if (r5 != null) {
                }
                v5 = cVar.v();
                if (v5 != null) {
                }
                o3 = cVar.o();
                if (o3 != null) {
                }
                boolean l622222222 = cVar.l("gcm.n.default_sound");
                boolean z522222222 = l622222222;
                if (cVar.l("gcm.n.default_vibrate_timings")) {
                }
                r02 = z522222222;
                if (cVar.l("gcm.n.default_light_settings")) {
                }
                Notification notification322222222 = wVar22.f3326v;
                notification322222222.defaults = r02;
                if ((r02 & 4) != 0) {
                }
                u15 = cVar.u("gcm.n.tag");
                if (TextUtils.isEmpty(u15)) {
                }
                return new l(wVar22, u15);
            }
        }
        u16 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        c0.w wVar222 = new c0.w(firebaseMessagingService, u16);
        s8 = cVar.s(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(s8)) {
        }
        s10 = cVar.s(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(s10)) {
        }
        u10 = cVar.u("gcm.n.icon");
        if (!TextUtils.isEmpty(u10)) {
        }
        i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i5 != 0) {
        }
        i5 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i5 != 0) {
        }
        i5 = 17301651;
        wVar222.f3326v.icon = i5;
        u11 = cVar.u("gcm.n.sound2");
        if (TextUtils.isEmpty(u11)) {
        }
        if (TextUtils.isEmpty(u11)) {
        }
        char c22222 = 4;
        if (defaultUri != null) {
        }
        u12 = cVar.u("gcm.n.click_action");
        if (TextUtils.isEmpty(u12)) {
        }
        AtomicInteger atomicInteger2222 = f6111a;
        if (launchIntentForPackage == null) {
        }
        wVar222.f3313g = activity;
        if (!cVar.l("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        u13 = cVar.u("gcm.n.color");
        if (!TextUtils.isEmpty(u13)) {
        }
        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        wVar222.c(16, !cVar.l("gcm.n.sticky"));
        wVar222.f3320o = cVar.l("gcm.n.local_only");
        u14 = cVar.u("gcm.n.ticker");
        if (u14 != null) {
        }
        m6 = cVar.m("gcm.n.notification_priority");
        if (m6 != null) {
        }
        m6 = null;
        if (m6 != null) {
        }
        m10 = cVar.m("gcm.n.visibility");
        if (m10 != null) {
        }
        m10 = null;
        if (m10 != null) {
        }
        m11 = cVar.m("gcm.n.notification_count");
        if (m11 != null) {
        }
        num = null;
        if (num != null) {
        }
        r5 = cVar.r();
        if (r5 != null) {
        }
        v5 = cVar.v();
        if (v5 != null) {
        }
        o3 = cVar.o();
        if (o3 != null) {
        }
        boolean l6222222222 = cVar.l("gcm.n.default_sound");
        boolean z5222222222 = l6222222222;
        if (cVar.l("gcm.n.default_vibrate_timings")) {
        }
        r02 = z5222222222;
        if (cVar.l("gcm.n.default_light_settings")) {
        }
        Notification notification3222222222 = wVar222.f3326v;
        notification3222222222.defaults = r02;
        if ((r02 & 4) != 0) {
        }
        u15 = cVar.u("gcm.n.tag");
        if (TextUtils.isEmpty(u15)) {
        }
        return new l(wVar222, u15);
    }

    public static boolean b(int i5, Resources resources) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i5, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            w0.d("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i5);
            return false;
        } catch (Resources.NotFoundException unused) {
            w0.d("FirebaseMessaging", "Couldn't find resource " + i5 + ", treating it as an invalid icon");
            return false;
        }
    }
}
