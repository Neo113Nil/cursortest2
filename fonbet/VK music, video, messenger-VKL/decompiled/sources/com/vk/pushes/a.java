package com.vk.pushes;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.pushes.NotificationUtils;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.b6m;
import xsna.bq00;
import xsna.e43;
import xsna.epx;
import xsna.f370;
import xsna.fkq0;
import xsna.gzs;
import xsna.ih4;
import xsna.j5g;
import xsna.jj70;
import xsna.kjs;
import xsna.o25;
import xsna.u4u;
import xsna.u870;
import xsna.wmz;
import xsna.z9w;

/* compiled from: NotificationChannelsServer.kt */
@SuppressLint({"CheckResult"})
/* loaded from: classes5.dex */
public final class a {
    public static final long a = TimeUnit.DAYS.toMillis(1);
    public static final /* synthetic */ int b = 0;

    /* compiled from: NotificationChannelsServer.kt */
    /* renamed from: com.vk.pushes.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1750a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationUtils.Type.values().length];
            try {
                iArr[NotificationUtils.Type.PrivateMessages.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationUtils.Type.ChatMessages.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationUtils.Type.CommunityChannelsMessages.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationUtils.Type.VkAppChannels.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @TargetApi(26)
    public static void a(NotificationChannel notificationChannel, Context context, NotificationUtils.Type type) {
        notificationChannel.setSound(NotificationUtils.e(context, type), null);
        notificationChannel.enableVibration(Preference.g(context).getBoolean("notifyVibrate" + NotificationUtils.d(context, type), true));
        if (!Preference.g(context).getBoolean("notifyLED" + NotificationUtils.d(context, type), true)) {
            notificationChannel.enableLights(false);
            return;
        }
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(Preference.g(context).getInt("notifyLedColor" + NotificationUtils.d(context, type), -1));
    }

    public static void b(u870 u870Var, boolean z) {
        if (fkq0.c(o25.a().c())) {
            if (!z) {
                long j = a;
                if (SystemClock.elapsedRealtime() < Preference.m(-j, "notifications_channels_update_pref", "notifications_channels_last_time_update_time") + j) {
                    z9w.a();
                    return;
                }
            }
            d(new bq00(u870Var, 16));
        }
    }

    @TargetApi(26)
    public static int c(Context context, String str) {
        SharedPreferences g = Preference.g(context);
        if (str == null || !g.getBoolean("notifyAdvanced".concat(str), false)) {
            str = "";
        }
        return g.getBoolean("notifyHeadsUp".concat(str), true) ? 4 : 3;
    }

    public static void d(bq00 bq00Var) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        new jj70(b6m.b(context)).a(null, null).subscribe(new wmz(new ih4(bq00Var, 4), 12), new kjs(new u4u(18), 10));
    }

    @TargetApi(26)
    public static boolean e(NotificationManager notificationManager, String str, final NotificationUtils.Type type, JSONObject jSONObject) {
        String str2;
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            boolean z = notificationChannel.getImportance() == 0;
            int i = C1750a.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                str2 = NotificationCompat.CATEGORY_MESSAGE;
            } else if (i == 2) {
                str2 = "chat";
            } else if (i == 3) {
                str2 = "community_msg";
            } else {
                if (i != 4) {
                    throw new IllegalStateException("only local channels are supported");
                }
                str2 = RTCStatsConstants.KEY_CHANNELS;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(str2);
            ArrayList O = optJSONArray != null ? f370.O(optJSONArray) : null;
            boolean f = epx.f(O != null ? (String) j5g.b0(0, O) : null, "off");
            final boolean z2 = !f;
            final boolean z3 = !(O != null && O.contains("no_text"));
            final boolean z4 = !(O != null && O.contains("no_sound"));
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            NotificationUtils.k(context, type, z2);
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            NotificationUtils.l(context2, type, z3);
            Context context3 = e43.a;
            NotificationUtils.m(context3 != null ? context3 : null, type, z4);
            L.d(new gzs() { // from class: xsna.b970
                @Override // xsna.gzs
                public final Object invoke() {
                    return "[Push][" + NotificationUtils.Type.this + "]: Save settings inapp enabling = " + z2 + " isTextEnabled = " + z3 + " isSoundEnabled=" + z4;
                }
            });
            if (z && !f) {
                jSONObject.put(str2, "off");
                return true;
            }
        }
        return false;
    }

    public static void f() {
        if (fkq0.c(o25.a().c())) {
            long j = a;
            if (SystemClock.elapsedRealtime() >= Preference.m(-j, "notifications_channels_update_pref", "notifications_channels_last_time_update_time") + j) {
                d(null);
            }
        }
    }
}
