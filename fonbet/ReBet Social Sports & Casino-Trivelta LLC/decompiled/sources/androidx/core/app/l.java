package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f18858a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f18859b;

    /* renamed from: c, reason: collision with root package name */
    public int f18860c;

    /* renamed from: d, reason: collision with root package name */
    public String f18861d;

    /* renamed from: e, reason: collision with root package name */
    public String f18862e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18863f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f18864g;

    /* renamed from: h, reason: collision with root package name */
    public AudioAttributes f18865h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18866i;

    /* renamed from: j, reason: collision with root package name */
    public int f18867j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18868k;

    /* renamed from: l, reason: collision with root package name */
    public String f18869l;

    /* renamed from: m, reason: collision with root package name */
    public String f18870m;
    long[] mVibrationPattern;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18871n;

    /* renamed from: o, reason: collision with root package name */
    public int f18872o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18873p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18874q;

    public static class a {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        public static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        public static NotificationChannel c(String str, CharSequence charSequence, int i10) {
            return new NotificationChannel(str, charSequence, i10);
        }

        public static void d(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableLights(z10);
        }

        public static void e(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableVibration(z10);
        }

        public static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        public static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        public static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        public static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        public static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        public static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        public static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        public static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        public static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        public static void r(NotificationChannel notificationChannel, int i10) {
            notificationChannel.setLightColor(i10);
        }

        public static void s(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.setShowBadge(z10);
        }

        public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        public static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        public static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        public static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    public static class b {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    public static class c {
        public static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        public static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        public static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public l(String str, int i10) {
        this.f18863f = true;
        this.f18864g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f18867j = 0;
        this.f18858a = (String) x0.f.g(str);
        this.f18860c = i10;
        this.f18865h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public NotificationChannel a() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannel c10 = a.c(this.f18858a, this.f18859b, this.f18860c);
        a.p(c10, this.f18861d);
        a.q(c10, this.f18862e);
        a.s(c10, this.f18863f);
        a.t(c10, this.f18864g, this.f18865h);
        a.d(c10, this.f18866i);
        a.r(c10, this.f18867j);
        a.u(c10, this.mVibrationPattern);
        a.e(c10, this.f18868k);
        if (i10 >= 30 && (str = this.f18869l) != null && (str2 = this.f18870m) != null) {
            c.d(c10, str, str2);
        }
        return c10;
    }

    public l(NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f18859b = a.m(notificationChannel);
        this.f18861d = a.g(notificationChannel);
        this.f18862e = a.h(notificationChannel);
        this.f18863f = a.b(notificationChannel);
        this.f18864g = a.n(notificationChannel);
        this.f18865h = a.f(notificationChannel);
        this.f18866i = a.v(notificationChannel);
        this.f18867j = a.k(notificationChannel);
        this.f18868k = a.w(notificationChannel);
        this.mVibrationPattern = a.o(notificationChannel);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f18869l = c.b(notificationChannel);
            this.f18870m = c.a(notificationChannel);
        }
        this.f18871n = a.a(notificationChannel);
        this.f18872o = a.l(notificationChannel);
        if (i10 >= 29) {
            this.f18873p = b.a(notificationChannel);
        }
        if (i10 >= 30) {
            this.f18874q = c.c(notificationChannel);
        }
    }
}
