package com.google.firebase.messaging;

import android.annotation.TargetApi;
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
import android.util.Log;
import androidx.core.app.l;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5924e {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f59710a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.e$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final l.d f59711a;

        /* renamed from: b, reason: collision with root package name */
        public final String f59712b;

        a(l.d dVar, String str) {
            this.f59711a = dVar;
            this.f59712b = str;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(73:0|1|2|3|(1:5)|202|7|8|9|10|(67:181|(60:183|(1:185)|13|(1:15)|16|(1:18)|19|(51:21|(1:166)|25|(1:27)|28|(1:30)(2:156|(1:161)(1:160))|(1:32)|33|(1:35)(5:144|(1:146)|147|(1:149)(1:155)|(1:151)(2:152|(1:154)))|36|(1:38)(3:140|(1:142)|143)|39|(1:41)(1:139)|(1:43)|44|(34:135|136|(1:50)|51|(1:53)|54|(28:126|(1:130)|(1:58)|59|(24:121|(1:125)|(1:63)|64|(20:118|(1:120)|(1:68)|69|(1:71)|72|(3:108|109|(15:111|(1:113)|114|(1:76)|77|(4:79|80|81|(2:83|(1:85)(2:86|87))(2:89|90))|(1:96)|97|(1:99)|100|(1:102)|103|(1:105)|106|107)(2:115|116))|74|(0)|77|(0)|(0)|97|(0)|100|(0)|103|(0)|106|107)|66|(0)|69|(0)|72|(0)|74|(0)|77|(0)|(0)|97|(0)|100|(0)|103|(0)|106|107)|61|(0)|64|(0)|66|(0)|69|(0)|72|(0)|74|(0)|77|(0)|(0)|97|(0)|100|(0)|103|(0)|106|107)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|72|(0)|74|(0)|77|(0)|(0)|97|(0)|100|(0)|103|(0)|106|107)|46|(34:131|132|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|72|(0)|74|(0)|77|(0)|(0)|97|(0)|100|(0)|103|(0)|106|107)|48|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|72|(0)|74|(0)|77|(0)|(0)|97|(0)|100|(0)|103|(0)|106|107)|167|(2:176|177)|(1:175)(1:174)|25|(0)|28|(0)(0)|(0)|33|(0)(0)|36|(0)(0)|39|(0)(0)|(0)|44|(0)|46|(0)|48|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|72|(0)|74|(0)|77|(0)|(0)|97|(0)|100|(0)|103|(0)|106|107)|186|(63:188|(1:190)|13|(0)|16|(0)|19|(0)|167|(1:169)|176|177|(1:172)|175|25|(0)|28|(0)(0)|(0)|33|(0)(0)|36|(0)(0)|39|(0)(0)|(0)|44|(0)|46|(0)|48|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|72|(0)|74|(0)|77|(0)|(0)|97|(0)|100|(0)|103|(0)|106|107)(1:198)|191|(3:193|(1:195)(1:197)|196)|13|(0)|16|(0)|19|(0)|167|(0)|176|177|(0)|175|25|(0)|28|(0)(0)|(0)|33|(0)(0)|36|(0)(0)|39|(0)(0)|(0)|44|(0)|46|(0)|48|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|72|(0)|74|(0)|77|(0)|(0)|97|(0)|100|(0)|103|(0)|106|107)|12|13|(0)|16|(0)|19|(0)|167|(0)|176|177|(0)|175|25|(0)|28|(0)(0)|(0)|33|(0)(0)|36|(0)(0)|39|(0)(0)|(0)|44|(0)|46|(0)|48|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|72|(0)|74|(0)|77|(0)|(0)|97|(0)|100|(0)|103|(0)|106|107) */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x014f, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0150, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0288 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0469  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static a a(FirebaseMessagingService firebaseMessagingService, A a11) {
        Bundle bundle;
        String packageName;
        PackageManager packageManager;
        CharSequence e11;
        String e12;
        String f7;
        int i11;
        int i12;
        String f11;
        Uri defaultUri;
        String f12;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String f13;
        Integer valueOf;
        String f14;
        Integer b11;
        Integer b12;
        Integer b13;
        Long d11;
        JSONArray c11;
        long[] jArr;
        JSONArray c12;
        String f15;
        int i13;
        String string;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e13) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e13);
        }
        bundle = Bundle.EMPTY;
        String f16 = a11.f("gcm.n.android_channel_id");
        int[] iArr = null;
        if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
            NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(f16)) {
                if (notificationManager.getNotificationChannel(f16) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + f16 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                }
                packageName = firebaseMessagingService.getPackageName();
                Resources resources = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                l.d dVar = new l.d(firebaseMessagingService, f16);
                e11 = a11.e(packageName, resources, "gcm.n.title");
                if (!TextUtils.isEmpty(e11)) {
                    dVar.j(e11);
                }
                e12 = a11.e(packageName, resources, "gcm.n.body");
                if (!TextUtils.isEmpty(e12)) {
                    dVar.i(e12);
                    l.c cVar = new l.c();
                    cVar.d(e12);
                    dVar.F(cVar);
                }
                f7 = a11.f("gcm.n.icon");
                if (!TextUtils.isEmpty(f7)) {
                    i12 = resources.getIdentifier(f7, "drawable", packageName);
                    if ((i12 == 0 || !b(resources, i12)) && ((i12 = resources.getIdentifier(f7, "mipmap", packageName)) == 0 || !b(resources, i12))) {
                        Log.w("FirebaseMessaging", "Icon resource " + f7 + " not found. Notification will use default icon.");
                    }
                    dVar.C(i12);
                    f11 = a11.f("gcm.n.sound2");
                    if (TextUtils.isEmpty(f11)) {
                        f11 = a11.f("gcm.n.sound");
                    }
                    if (TextUtils.isEmpty(f11)) {
                        defaultUri = null;
                    } else if ("default".equals(f11) || resources.getIdentifier(f11, "raw", packageName) == 0) {
                        defaultUri = RingtoneManager.getDefaultUri(2);
                    } else {
                        defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + f11);
                    }
                    if (defaultUri != null) {
                        dVar.E(defaultUri);
                    }
                    f12 = a11.f("gcm.n.click_action");
                    if (TextUtils.isEmpty(f12)) {
                        String f17 = a11.f("gcm.n.link_android");
                        if (TextUtils.isEmpty(f17)) {
                            f17 = a11.f("gcm.n.link");
                        }
                        Uri parse = !TextUtils.isEmpty(f17) ? Uri.parse(f17) : null;
                        if (parse != null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setData(parse);
                        } else {
                            launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                            if (launchIntentForPackage == null) {
                                Log.w("FirebaseMessaging", "No activity found to launch app");
                            }
                        }
                    } else {
                        launchIntentForPackage = new Intent(f12);
                        launchIntentForPackage.setPackage(packageName);
                        launchIntentForPackage.setFlags(268435456);
                    }
                    AtomicInteger atomicInteger = f59710a;
                    if (launchIntentForPackage == null) {
                        activity = null;
                    } else {
                        launchIntentForPackage.addFlags(67108864);
                        launchIntentForPackage.putExtras(a11.i());
                        if (a11.a("google.c.a.e")) {
                            launchIntentForPackage.putExtra("gcm.n.analytics_data", a11.h());
                        }
                        activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                    }
                    dVar.h(activity);
                    broadcast = !a11.a("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(a11.h())), 1140850688);
                    if (broadcast != null) {
                        dVar.n(broadcast);
                    }
                    f13 = a11.f("gcm.n.color");
                    if (!TextUtils.isEmpty(f13)) {
                        try {
                            valueOf = Integer.valueOf(Color.parseColor(f13));
                        } catch (IllegalArgumentException unused) {
                            Log.w("FirebaseMessaging", "Color is invalid: " + f13 + ". Notification will use default color.");
                        }
                        if (valueOf != null) {
                            dVar.g(valueOf.intValue());
                        }
                        dVar.d(!a11.a("gcm.n.sticky"));
                        dVar.u(a11.a("gcm.n.local_only"));
                        f14 = a11.f("gcm.n.ticker");
                        if (f14 != null) {
                            dVar.G(f14);
                        }
                        b11 = a11.b("gcm.n.notification_priority");
                        if (b11 != null) {
                            if (b11.intValue() < -2 || b11.intValue() > 2) {
                                Log.w("FirebaseMessaging", "notificationPriority is invalid " + b11 + ". Skipping setting notificationPriority.");
                            }
                            if (b11 != null) {
                                dVar.y(b11.intValue());
                            }
                            b12 = a11.b("gcm.n.visibility");
                            if (b12 != null) {
                                if (b12.intValue() < -1 || b12.intValue() > 1) {
                                    Log.w("NotificationParams", "visibility is invalid: " + b12 + ". Skipping setting visibility.");
                                }
                                if (b12 != null) {
                                    dVar.J(b12.intValue());
                                }
                                b13 = a11.b("gcm.n.notification_count");
                                if (b13 != null) {
                                    if (b13.intValue() < 0) {
                                        Log.w("FirebaseMessaging", "notificationCount is invalid: " + b13 + ". Skipping setting notificationCount.");
                                    }
                                    if (b13 != null) {
                                        dVar.v(b13.intValue());
                                    }
                                    d11 = a11.d();
                                    if (d11 != null) {
                                        dVar.A(true);
                                        dVar.K(d11.longValue());
                                    }
                                    c11 = a11.c("gcm.n.vibrate_timings");
                                    if (c11 != null) {
                                        try {
                                        } catch (NumberFormatException | JSONException unused2) {
                                            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c11 + ". Skipping setting vibrateTimings.");
                                        }
                                        if (c11.length() <= 1) {
                                            throw new JSONException("vibrateTimings have invalid length");
                                        }
                                        int length = c11.length();
                                        jArr = new long[length];
                                        for (int i14 = 0; i14 < length; i14++) {
                                            jArr[i14] = c11.optLong(i14);
                                        }
                                        if (jArr != null) {
                                            dVar.I(jArr);
                                        }
                                        c12 = a11.c("gcm.n.light_settings");
                                        if (c12 != null) {
                                            int[] iArr2 = new int[3];
                                            try {
                                                if (c12.length() != 3) {
                                                    throw new JSONException("lightSettings don't have all three fields");
                                                }
                                                int parseColor = Color.parseColor(c12.optString(0));
                                                if (parseColor == -16777216) {
                                                    throw new IllegalArgumentException("Transparent color is invalid");
                                                }
                                                iArr2[0] = parseColor;
                                                iArr2[1] = c12.optInt(1);
                                                iArr2[2] = c12.optInt(2);
                                                iArr = iArr2;
                                            } catch (IllegalArgumentException e14) {
                                                Log.w("NotificationParams", "LightSettings is invalid: " + c12 + ". " + e14.getMessage() + ". Skipping setting LightSettings");
                                            } catch (JSONException unused3) {
                                                Log.w("NotificationParams", "LightSettings is invalid: " + c12 + ". Skipping setting LightSettings");
                                            }
                                        }
                                        if (iArr != null) {
                                            dVar.t(iArr[0], iArr[1], iArr[2]);
                                        }
                                        boolean a12 = a11.a("gcm.n.default_sound");
                                        boolean z11 = a12;
                                        if (a11.a("gcm.n.default_vibrate_timings")) {
                                            z11 = (a12 ? 1 : 0) | 2;
                                        }
                                        int i15 = z11;
                                        if (a11.a("gcm.n.default_light_settings")) {
                                            i15 = (z11 ? 1 : 0) | 4;
                                        }
                                        dVar.m(i15);
                                        f15 = a11.f("gcm.n.tag");
                                        if (TextUtils.isEmpty(f15)) {
                                            f15 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                        }
                                        return new a(dVar, f15);
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    c12 = a11.c("gcm.n.light_settings");
                                    if (c12 != null) {
                                    }
                                    if (iArr != null) {
                                    }
                                    boolean a122 = a11.a("gcm.n.default_sound");
                                    boolean z112 = a122;
                                    if (a11.a("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i152 = z112;
                                    if (a11.a("gcm.n.default_light_settings")) {
                                    }
                                    dVar.m(i152);
                                    f15 = a11.f("gcm.n.tag");
                                    if (TextUtils.isEmpty(f15)) {
                                    }
                                    return new a(dVar, f15);
                                }
                                b13 = null;
                                if (b13 != null) {
                                }
                                d11 = a11.d();
                                if (d11 != null) {
                                }
                                c11 = a11.c("gcm.n.vibrate_timings");
                                if (c11 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                c12 = a11.c("gcm.n.light_settings");
                                if (c12 != null) {
                                }
                                if (iArr != null) {
                                }
                                boolean a1222 = a11.a("gcm.n.default_sound");
                                boolean z1122 = a1222;
                                if (a11.a("gcm.n.default_vibrate_timings")) {
                                }
                                int i1522 = z1122;
                                if (a11.a("gcm.n.default_light_settings")) {
                                }
                                dVar.m(i1522);
                                f15 = a11.f("gcm.n.tag");
                                if (TextUtils.isEmpty(f15)) {
                                }
                                return new a(dVar, f15);
                            }
                            b12 = null;
                            if (b12 != null) {
                            }
                            b13 = a11.b("gcm.n.notification_count");
                            if (b13 != null) {
                            }
                            b13 = null;
                            if (b13 != null) {
                            }
                            d11 = a11.d();
                            if (d11 != null) {
                            }
                            c11 = a11.c("gcm.n.vibrate_timings");
                            if (c11 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c12 = a11.c("gcm.n.light_settings");
                            if (c12 != null) {
                            }
                            if (iArr != null) {
                            }
                            boolean a12222 = a11.a("gcm.n.default_sound");
                            boolean z11222 = a12222;
                            if (a11.a("gcm.n.default_vibrate_timings")) {
                            }
                            int i15222 = z11222;
                            if (a11.a("gcm.n.default_light_settings")) {
                            }
                            dVar.m(i15222);
                            f15 = a11.f("gcm.n.tag");
                            if (TextUtils.isEmpty(f15)) {
                            }
                            return new a(dVar, f15);
                        }
                        b11 = null;
                        if (b11 != null) {
                        }
                        b12 = a11.b("gcm.n.visibility");
                        if (b12 != null) {
                        }
                        b12 = null;
                        if (b12 != null) {
                        }
                        b13 = a11.b("gcm.n.notification_count");
                        if (b13 != null) {
                        }
                        b13 = null;
                        if (b13 != null) {
                        }
                        d11 = a11.d();
                        if (d11 != null) {
                        }
                        c11 = a11.c("gcm.n.vibrate_timings");
                        if (c11 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        c12 = a11.c("gcm.n.light_settings");
                        if (c12 != null) {
                        }
                        if (iArr != null) {
                        }
                        boolean a122222 = a11.a("gcm.n.default_sound");
                        boolean z112222 = a122222;
                        if (a11.a("gcm.n.default_vibrate_timings")) {
                        }
                        int i152222 = z112222;
                        if (a11.a("gcm.n.default_light_settings")) {
                        }
                        dVar.m(i152222);
                        f15 = a11.f("gcm.n.tag");
                        if (TextUtils.isEmpty(f15)) {
                        }
                        return new a(dVar, f15);
                    }
                    i13 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i13 != 0) {
                        try {
                            valueOf = Integer.valueOf(androidx.core.content.a.getColor(firebaseMessagingService, i13));
                        } catch (Resources.NotFoundException unused4) {
                            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        }
                        if (valueOf != null) {
                        }
                        dVar.d(!a11.a("gcm.n.sticky"));
                        dVar.u(a11.a("gcm.n.local_only"));
                        f14 = a11.f("gcm.n.ticker");
                        if (f14 != null) {
                        }
                        b11 = a11.b("gcm.n.notification_priority");
                        if (b11 != null) {
                        }
                        b11 = null;
                        if (b11 != null) {
                        }
                        b12 = a11.b("gcm.n.visibility");
                        if (b12 != null) {
                        }
                        b12 = null;
                        if (b12 != null) {
                        }
                        b13 = a11.b("gcm.n.notification_count");
                        if (b13 != null) {
                        }
                        b13 = null;
                        if (b13 != null) {
                        }
                        d11 = a11.d();
                        if (d11 != null) {
                        }
                        c11 = a11.c("gcm.n.vibrate_timings");
                        if (c11 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        c12 = a11.c("gcm.n.light_settings");
                        if (c12 != null) {
                        }
                        if (iArr != null) {
                        }
                        boolean a1222222 = a11.a("gcm.n.default_sound");
                        boolean z1122222 = a1222222;
                        if (a11.a("gcm.n.default_vibrate_timings")) {
                        }
                        int i1522222 = z1122222;
                        if (a11.a("gcm.n.default_light_settings")) {
                        }
                        dVar.m(i1522222);
                        f15 = a11.f("gcm.n.tag");
                        if (TextUtils.isEmpty(f15)) {
                        }
                        return new a(dVar, f15);
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    dVar.d(!a11.a("gcm.n.sticky"));
                    dVar.u(a11.a("gcm.n.local_only"));
                    f14 = a11.f("gcm.n.ticker");
                    if (f14 != null) {
                    }
                    b11 = a11.b("gcm.n.notification_priority");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    b12 = a11.b("gcm.n.visibility");
                    if (b12 != null) {
                    }
                    b12 = null;
                    if (b12 != null) {
                    }
                    b13 = a11.b("gcm.n.notification_count");
                    if (b13 != null) {
                    }
                    b13 = null;
                    if (b13 != null) {
                    }
                    d11 = a11.d();
                    if (d11 != null) {
                    }
                    c11 = a11.c("gcm.n.vibrate_timings");
                    if (c11 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c12 = a11.c("gcm.n.light_settings");
                    if (c12 != null) {
                    }
                    if (iArr != null) {
                    }
                    boolean a12222222 = a11.a("gcm.n.default_sound");
                    boolean z11222222 = a12222222;
                    if (a11.a("gcm.n.default_vibrate_timings")) {
                    }
                    int i15222222 = z11222222;
                    if (a11.a("gcm.n.default_light_settings")) {
                    }
                    dVar.m(i15222222);
                    f15 = a11.f("gcm.n.tag");
                    if (TextUtils.isEmpty(f15)) {
                    }
                    return new a(dVar, f15);
                }
                i11 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i11 != 0 || !b(resources, i11)) {
                    i11 = packageManager.getApplicationInfo(packageName, 0).icon;
                }
                i12 = (i11 == 0 && b(resources, i11)) ? i11 : 17301651;
                dVar.C(i12);
                f11 = a11.f("gcm.n.sound2");
                if (TextUtils.isEmpty(f11)) {
                }
                if (TextUtils.isEmpty(f11)) {
                }
                if (defaultUri != null) {
                }
                f12 = a11.f("gcm.n.click_action");
                if (TextUtils.isEmpty(f12)) {
                }
                AtomicInteger atomicInteger2 = f59710a;
                if (launchIntentForPackage == null) {
                }
                dVar.h(activity);
                if (!a11.a("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                f13 = a11.f("gcm.n.color");
                if (!TextUtils.isEmpty(f13)) {
                }
                i13 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i13 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                dVar.d(!a11.a("gcm.n.sticky"));
                dVar.u(a11.a("gcm.n.local_only"));
                f14 = a11.f("gcm.n.ticker");
                if (f14 != null) {
                }
                b11 = a11.b("gcm.n.notification_priority");
                if (b11 != null) {
                }
                b11 = null;
                if (b11 != null) {
                }
                b12 = a11.b("gcm.n.visibility");
                if (b12 != null) {
                }
                b12 = null;
                if (b12 != null) {
                }
                b13 = a11.b("gcm.n.notification_count");
                if (b13 != null) {
                }
                b13 = null;
                if (b13 != null) {
                }
                d11 = a11.d();
                if (d11 != null) {
                }
                c11 = a11.c("gcm.n.vibrate_timings");
                if (c11 != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                c12 = a11.c("gcm.n.light_settings");
                if (c12 != null) {
                }
                if (iArr != null) {
                }
                boolean a122222222 = a11.a("gcm.n.default_sound");
                boolean z112222222 = a122222222;
                if (a11.a("gcm.n.default_vibrate_timings")) {
                }
                int i152222222 = z112222222;
                if (a11.a("gcm.n.default_light_settings")) {
                }
                dVar.m(i152222222);
                f15 = a11.f("gcm.n.tag");
                if (TextUtils.isEmpty(f15)) {
                }
                return new a(dVar, f15);
            }
            f16 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(f16)) {
                if (notificationManager.getNotificationChannel(f16) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                }
                packageName = firebaseMessagingService.getPackageName();
                Resources resources2 = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                l.d dVar2 = new l.d(firebaseMessagingService, f16);
                e11 = a11.e(packageName, resources2, "gcm.n.title");
                if (!TextUtils.isEmpty(e11)) {
                }
                e12 = a11.e(packageName, resources2, "gcm.n.body");
                if (!TextUtils.isEmpty(e12)) {
                }
                f7 = a11.f("gcm.n.icon");
                if (!TextUtils.isEmpty(f7)) {
                }
                i11 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i11 != 0) {
                }
                i11 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i11 == 0) {
                }
                dVar2.C(i12);
                f11 = a11.f("gcm.n.sound2");
                if (TextUtils.isEmpty(f11)) {
                }
                if (TextUtils.isEmpty(f11)) {
                }
                if (defaultUri != null) {
                }
                f12 = a11.f("gcm.n.click_action");
                if (TextUtils.isEmpty(f12)) {
                }
                AtomicInteger atomicInteger22 = f59710a;
                if (launchIntentForPackage == null) {
                }
                dVar2.h(activity);
                if (!a11.a("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                f13 = a11.f("gcm.n.color");
                if (!TextUtils.isEmpty(f13)) {
                }
                i13 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i13 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                dVar2.d(!a11.a("gcm.n.sticky"));
                dVar2.u(a11.a("gcm.n.local_only"));
                f14 = a11.f("gcm.n.ticker");
                if (f14 != null) {
                }
                b11 = a11.b("gcm.n.notification_priority");
                if (b11 != null) {
                }
                b11 = null;
                if (b11 != null) {
                }
                b12 = a11.b("gcm.n.visibility");
                if (b12 != null) {
                }
                b12 = null;
                if (b12 != null) {
                }
                b13 = a11.b("gcm.n.notification_count");
                if (b13 != null) {
                }
                b13 = null;
                if (b13 != null) {
                }
                d11 = a11.d();
                if (d11 != null) {
                }
                c11 = a11.c("gcm.n.vibrate_timings");
                if (c11 != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                c12 = a11.c("gcm.n.light_settings");
                if (c12 != null) {
                }
                if (iArr != null) {
                }
                boolean a1222222222 = a11.a("gcm.n.default_sound");
                boolean z1122222222 = a1222222222;
                if (a11.a("gcm.n.default_vibrate_timings")) {
                }
                int i1522222222 = z1122222222;
                if (a11.a("gcm.n.default_light_settings")) {
                }
                dVar2.m(i1522222222);
                f15 = a11.f("gcm.n.tag");
                if (TextUtils.isEmpty(f15)) {
                }
                return new a(dVar2, f15);
            }
            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            f16 = "fcm_fallback_notification_channel";
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = firebaseMessagingService.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            packageName = firebaseMessagingService.getPackageName();
            Resources resources22 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            l.d dVar22 = new l.d(firebaseMessagingService, f16);
            e11 = a11.e(packageName, resources22, "gcm.n.title");
            if (!TextUtils.isEmpty(e11)) {
            }
            e12 = a11.e(packageName, resources22, "gcm.n.body");
            if (!TextUtils.isEmpty(e12)) {
            }
            f7 = a11.f("gcm.n.icon");
            if (!TextUtils.isEmpty(f7)) {
            }
            i11 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i11 != 0) {
            }
            i11 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i11 == 0) {
            }
            dVar22.C(i12);
            f11 = a11.f("gcm.n.sound2");
            if (TextUtils.isEmpty(f11)) {
            }
            if (TextUtils.isEmpty(f11)) {
            }
            if (defaultUri != null) {
            }
            f12 = a11.f("gcm.n.click_action");
            if (TextUtils.isEmpty(f12)) {
            }
            AtomicInteger atomicInteger222 = f59710a;
            if (launchIntentForPackage == null) {
            }
            dVar22.h(activity);
            if (!a11.a("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            f13 = a11.f("gcm.n.color");
            if (!TextUtils.isEmpty(f13)) {
            }
            i13 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i13 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            dVar22.d(!a11.a("gcm.n.sticky"));
            dVar22.u(a11.a("gcm.n.local_only"));
            f14 = a11.f("gcm.n.ticker");
            if (f14 != null) {
            }
            b11 = a11.b("gcm.n.notification_priority");
            if (b11 != null) {
            }
            b11 = null;
            if (b11 != null) {
            }
            b12 = a11.b("gcm.n.visibility");
            if (b12 != null) {
            }
            b12 = null;
            if (b12 != null) {
            }
            b13 = a11.b("gcm.n.notification_count");
            if (b13 != null) {
            }
            b13 = null;
            if (b13 != null) {
            }
            d11 = a11.d();
            if (d11 != null) {
            }
            c11 = a11.c("gcm.n.vibrate_timings");
            if (c11 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            c12 = a11.c("gcm.n.light_settings");
            if (c12 != null) {
            }
            if (iArr != null) {
            }
            boolean a12222222222 = a11.a("gcm.n.default_sound");
            boolean z11222222222 = a12222222222;
            if (a11.a("gcm.n.default_vibrate_timings")) {
            }
            int i15222222222 = z11222222222;
            if (a11.a("gcm.n.default_light_settings")) {
            }
            dVar22.m(i15222222222);
            f15 = a11.f("gcm.n.tag");
            if (TextUtils.isEmpty(f15)) {
            }
            return new a(dVar22, f15);
        }
        f16 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        l.d dVar222 = new l.d(firebaseMessagingService, f16);
        e11 = a11.e(packageName, resources222, "gcm.n.title");
        if (!TextUtils.isEmpty(e11)) {
        }
        e12 = a11.e(packageName, resources222, "gcm.n.body");
        if (!TextUtils.isEmpty(e12)) {
        }
        f7 = a11.f("gcm.n.icon");
        if (!TextUtils.isEmpty(f7)) {
        }
        i11 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i11 != 0) {
        }
        i11 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i11 == 0) {
        }
        dVar222.C(i12);
        f11 = a11.f("gcm.n.sound2");
        if (TextUtils.isEmpty(f11)) {
        }
        if (TextUtils.isEmpty(f11)) {
        }
        if (defaultUri != null) {
        }
        f12 = a11.f("gcm.n.click_action");
        if (TextUtils.isEmpty(f12)) {
        }
        AtomicInteger atomicInteger2222 = f59710a;
        if (launchIntentForPackage == null) {
        }
        dVar222.h(activity);
        if (!a11.a("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        f13 = a11.f("gcm.n.color");
        if (!TextUtils.isEmpty(f13)) {
        }
        i13 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i13 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        dVar222.d(!a11.a("gcm.n.sticky"));
        dVar222.u(a11.a("gcm.n.local_only"));
        f14 = a11.f("gcm.n.ticker");
        if (f14 != null) {
        }
        b11 = a11.b("gcm.n.notification_priority");
        if (b11 != null) {
        }
        b11 = null;
        if (b11 != null) {
        }
        b12 = a11.b("gcm.n.visibility");
        if (b12 != null) {
        }
        b12 = null;
        if (b12 != null) {
        }
        b13 = a11.b("gcm.n.notification_count");
        if (b13 != null) {
        }
        b13 = null;
        if (b13 != null) {
        }
        d11 = a11.d();
        if (d11 != null) {
        }
        c11 = a11.c("gcm.n.vibrate_timings");
        if (c11 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        c12 = a11.c("gcm.n.light_settings");
        if (c12 != null) {
        }
        if (iArr != null) {
        }
        boolean a122222222222 = a11.a("gcm.n.default_sound");
        boolean z112222222222 = a122222222222;
        if (a11.a("gcm.n.default_vibrate_timings")) {
        }
        int i152222222222 = z112222222222;
        if (a11.a("gcm.n.default_light_settings")) {
        }
        dVar222.m(i152222222222);
        f15 = a11.f("gcm.n.tag");
        if (TextUtils.isEmpty(f15)) {
        }
        return new a(dVar222, f15);
    }

    @TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
    private static boolean b(Resources resources, int i11) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i11, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i11);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i11 + ", treating it as an invalid icon");
            return false;
        }
    }
}
