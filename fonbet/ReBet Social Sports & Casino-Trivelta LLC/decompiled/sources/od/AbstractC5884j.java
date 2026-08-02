package od;

import T3.AbstractC1585a0;
import T3.AbstractC1588b0;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.o;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.NotificationDeleteReceiver;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.ui.activities.SalesIQActivity;
import com.zoho.livechat.android.modules.notifications.sdk.entities.SalesIQNotificationPayload;
import com.zoho.livechat.android.modules.notifications.ui.activities.NotificationReceiverActivity;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.P;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.text.StringsKt;
import l0.AbstractC5338c;
import og.AbstractC5895g;
import og.AbstractC5896h;
import okhttp3.HttpUrl;
import rd.C6218a;
import ug.AbstractC6574b;
import ve.InterfaceC6686a;
import zf.C6966g;

/* renamed from: od.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5884j {

    /* renamed from: c, reason: collision with root package name */
    public static NotificationManagerCompat f59679c;

    /* renamed from: d, reason: collision with root package name */
    public static String f59680d;

    /* renamed from: a, reason: collision with root package name */
    public static SecureRandom f59677a = new SecureRandom();

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f59678b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f59681e = false;

    /* renamed from: od.j$a */
    public static class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public Context f59682a;

        /* renamed from: b, reason: collision with root package name */
        public String f59683b;

        /* renamed from: c, reason: collision with root package name */
        public String f59684c;

        /* renamed from: d, reason: collision with root package name */
        public String f59685d;

        /* renamed from: e, reason: collision with root package name */
        public String f59686e;

        /* renamed from: f, reason: collision with root package name */
        public String f59687f;

        /* renamed from: g, reason: collision with root package name */
        public String f59688g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f59689h;

        /* renamed from: i, reason: collision with root package name */
        public Map f59690i;

        public a(String str, Context context, String str2, String str3, String str4, String str5, String str6, boolean z10, Map map) {
            this.f59683b = str;
            this.f59682a = context;
            this.f59684c = str2;
            this.f59685d = str3;
            this.f59686e = str4;
            this.f59687f = str5;
            this.f59688g = str6;
            this.f59689h = z10;
            this.f59690i = map;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            return b(this.f59683b);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Bitmap b(String str) {
            HttpURLConnection httpURLConnection;
            HttpUrl.Builder builder;
            HttpURLConnection g10;
            HttpURLConnection httpURLConnection2 = null;
            try {
                String string = C6218a.M().getString("screenname", null);
                if (this.f59689h) {
                    builder = Yd.a.e(str, new String[0]);
                } else {
                    HttpUrl.Builder g11 = Yd.a.g("%1$s/downloadsdkimg.ls", string);
                    g11.addQueryParameter("imgpath", str);
                    g11.addQueryParameter("downloadtype", "sdkimage");
                    builder = g11;
                }
                g10 = sd.d.g(builder);
                try {
                } catch (Exception e10) {
                    httpURLConnection = g10;
                    e = e10;
                    try {
                        LiveChatUtil.log(e);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection2 = httpURLConnection;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    httpURLConnection2 = g10;
                    th = th3;
                    if (httpURLConnection2 != null) {
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                httpURLConnection = null;
            } catch (Throwable th4) {
                th = th4;
            }
            if (g10.getResponseCode() != 200) {
                g10.disconnect();
                return null;
            }
            InputStream inputStream = g10.getInputStream();
            if (inputStream == null) {
                g10.disconnect();
                return null;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            g10.disconnect();
            return decodeStream;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            if (isCancelled()) {
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                AbstractC5884j.r(this.f59682a, this.f59684c, this.f59685d, this.f59686e, this.f59687f, bitmap2, this.f59690i);
            }
        }
    }

    public static /* synthetic */ void a(Intent intent, Context context, String str, String str2, String str3, we.e eVar) {
        if (eVar.d()) {
            intent.putExtra(EventKeys.PAYLOAD, (Parcelable) eVar.b());
            x(context, str, str2, str3, u(context, intent));
        }
    }

    public static /* synthetic */ void b(Intent intent, o.e eVar, Context context, String str, we.e eVar2) {
        if (eVar2.d()) {
            intent.putExtra(EventKeys.PAYLOAD, (Parcelable) eVar2.b());
            eVar.k(u(context, intent));
            f59679c.notify(str, 1482, eVar.d());
        }
    }

    public static /* synthetic */ void c(Intent intent, o.e eVar, Context context, String str, we.e eVar2) {
        if (eVar2.d()) {
            intent.putExtra(EventKeys.PAYLOAD, (Parcelable) eVar2.b());
            eVar.k(u(context, intent));
            f59679c.notify(str, 1481, eVar.d());
        }
    }

    public static /* synthetic */ void d(Intent intent, Context context, String str, String str2, String str3, Bitmap bitmap, Bundle bundle, we.e eVar) {
        if (eVar.d()) {
            intent.putExtra(EventKeys.PAYLOAD, (Parcelable) eVar.b());
            z(context, str, str2, str3, bitmap, intent, bundle);
        }
    }

    public static /* synthetic */ void e(Intent intent, Context context, String str, String str2, o.g gVar, Spannable spannable, long j10, we.e eVar) {
        if (eVar.d()) {
            intent.putExtra(EventKeys.PAYLOAD, (Parcelable) eVar.b());
            y(context, str, str2, gVar, spannable, j10, u(context, intent));
        }
    }

    public static void f(String str, String str2, Intent intent) {
        intent.putExtra("chid", str);
        intent.putExtra("convID", str2);
        intent.putExtra("mode", "SINGLETASK");
        intent.setFlags(335544320);
    }

    public static void g() {
        NotificationManagerCompat t10 = t();
        f59679c = t10;
        t10.cancelAll();
    }

    public static void h(int i10) {
        NotificationManagerCompat t10 = t();
        f59679c = t10;
        t10.cancel(i10);
    }

    public static void i(String str) {
        NotificationManagerCompat t10 = t();
        f59679c = t10;
        t10.cancel(str, 1476);
        f59679c.cancel(str, 1481);
        f59679c.cancel(str, 1482);
        f59679c.cancel(str, 1480);
    }

    public static void j(final Context context, final String str, String str2, String str3, Map map, boolean z10) {
        int i10;
        f59679c = t();
        Application k10 = MobilistenInitProvider.k();
        final o.e eVar = new o.e(k10, s());
        eVar.m(str3);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
        int e10 = P.e(dVar, AbstractC5886l.f59720G2);
        if (e10 != 0) {
            eVar.j(e10);
        }
        if (LiveChatUtil.getNotificationIcon() != 0) {
            eVar.E(LiveChatUtil.getNotificationIcon());
        } else {
            eVar.E(P.h(dVar, AbstractC5886l.f59716F2));
        }
        eVar.A(1);
        Bundle bundle = new Bundle();
        if (MobilistenInitProvider.k() != null) {
            for (StatusBarNotification statusBarNotification : ((NotificationManager) MobilistenInitProvider.k().getSystemService("notification")).getActiveNotifications()) {
                if (1482 == statusBarNotification.getId() && str.equals(statusBarNotification.getTag())) {
                    i10 = statusBarNotification.getNotification().extras.getInt("count") + 1;
                    break;
                }
            }
        }
        i10 = 1;
        bundle.putInt("count", i10);
        eVar.c(bundle);
        String string = i10 > 1 ? context.getString(t.f60946T4, Integer.valueOf(i10)) : context.getString(t.f60940S4);
        o.c cVar = new o.c();
        cVar.a(string);
        eVar.G(cVar);
        eVar.l(string);
        if (Build.VERSION.SDK_INT < 33 || AbstractC5338c.checkSelfPermission(k10, "android.permission.POST_NOTIFICATIONS") == 0) {
            if (Kf.a.i()) {
                Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
                f(str, str2, intent);
                eVar.k(u(context, intent));
                f59679c.notify(str, 1482, eVar.d());
                return;
            }
            final Intent intent2 = new Intent(context, (Class<?>) NotificationReceiverActivity.class);
            intent2.addFlags(335544320);
            map.put("notification_title", str3);
            map.put("notification_message", string);
            Kf.a.h(map, z10, new InterfaceC6686a() { // from class: od.i
                @Override // ve.InterfaceC6686a
                public final void a(we.e eVar2) {
                    AbstractC5884j.b(intent2, eVar, context, str, eVar2);
                }
            });
        }
    }

    public static void k(final Context context, final String str, final String str2, final String str3, Map map) {
        try {
            if (!Kf.a.i()) {
                final Intent intent = new Intent(context, (Class<?>) NotificationReceiverActivity.class);
                intent.addFlags(335544320);
                Kf.a.h(map, false, new InterfaceC6686a() { // from class: od.f
                    @Override // ve.InterfaceC6686a
                    public final void a(we.e eVar) {
                        AbstractC5884j.a(intent, context, str3, str, str2, eVar);
                    }
                });
            } else {
                Intent intent2 = new Intent(context, (Class<?>) ChatActivity.class);
                intent2.putExtra("chid", str3);
                intent2.putExtra("mode", "SINGLETASK");
                intent2.setFlags(335544320);
                x(context, str3, str, str2, u(context, intent2));
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static void l(final Context context, final String str, String str2, String str3, Map map, boolean z10) {
        int i10;
        f59679c = t();
        Application k10 = MobilistenInitProvider.k();
        final o.e eVar = new o.e(k10, s());
        eVar.m(str3);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
        int e10 = P.e(dVar, AbstractC5886l.f59720G2);
        if (e10 != 0) {
            eVar.j(e10);
        }
        if (LiveChatUtil.getNotificationIcon() != 0) {
            eVar.E(LiveChatUtil.getNotificationIcon());
        } else {
            eVar.E(P.h(dVar, AbstractC5886l.f59716F2));
        }
        eVar.A(1);
        Bundle bundle = new Bundle();
        if (MobilistenInitProvider.k() != null) {
            for (StatusBarNotification statusBarNotification : ((NotificationManager) MobilistenInitProvider.k().getSystemService("notification")).getActiveNotifications()) {
                if (1481 == statusBarNotification.getId() && str.equals(statusBarNotification.getTag())) {
                    i10 = statusBarNotification.getNotification().extras.getInt("count") + 1;
                    break;
                }
            }
        }
        i10 = 1;
        bundle.putInt("count", i10);
        eVar.c(bundle);
        String string = i10 > 1 ? context.getString(t.f60958V4, Integer.valueOf(i10)) : context.getString(t.f60952U4);
        o.c cVar = new o.c();
        cVar.a(string);
        eVar.G(cVar);
        eVar.l(string);
        if (Build.VERSION.SDK_INT < 33 || AbstractC5338c.checkSelfPermission(k10, "android.permission.POST_NOTIFICATIONS") == 0) {
            if (!Kf.a.i()) {
                final Intent intent = new Intent(context, (Class<?>) NotificationReceiverActivity.class);
                intent.addFlags(335544320);
                Kf.a.h(map, z10, new InterfaceC6686a() { // from class: od.h
                    @Override // ve.InterfaceC6686a
                    public final void a(we.e eVar2) {
                        AbstractC5884j.c(intent, eVar, context, str, eVar2);
                    }
                });
            } else {
                Intent intent2 = new Intent(context, (Class<?>) ChatActivity.class);
                f(str, str2, intent2);
                eVar.k(u(context, intent2));
                f59679c.notify(str, 1481, eVar.d());
            }
        }
    }

    public static void m() {
        if (f59681e) {
            return;
        }
        f59681e = true;
        f59679c = t();
        Application k10 = MobilistenInitProvider.k();
        if (Build.VERSION.SDK_INT < 26 || f59679c == null) {
            return;
        }
        AbstractC1588b0.a();
        NotificationChannel a10 = AbstractC1585a0.a(s(), k10 != null ? k10.getString(t.f61064l3) : "Zoho SalesIQ", 4);
        a10.setLockscreenVisibility(1);
        f59679c.createNotificationChannel(a10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        com.zoho.livechat.android.utils.LiveChatUtil.log(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b A[Catch: Exception -> 0x0160, TryCatch #2 {Exception -> 0x0160, blocks: (B:12:0x0033, B:34:0x00e6, B:37:0x00f9, B:38:0x0106, B:39:0x0100, B:40:0x0115, B:42:0x011b, B:45:0x0133, B:49:0x00cb, B:63:0x00e1, B:78:0x015f, B:77:0x015c, B:60:0x00dc, B:73:0x0157, B:32:0x00c6, B:15:0x0039, B:17:0x0049, B:20:0x004e, B:22:0x007f, B:25:0x0094, B:27:0x009a, B:28:0x009c, B:29:0x00b9, B:52:0x00ae, B:56:0x00d7), top: B:11:0x0033, inners: #0, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133 A[Catch: Exception -> 0x0160, TRY_LEAVE, TryCatch #2 {Exception -> 0x0160, blocks: (B:12:0x0033, B:34:0x00e6, B:37:0x00f9, B:38:0x0106, B:39:0x0100, B:40:0x0115, B:42:0x011b, B:45:0x0133, B:49:0x00cb, B:63:0x00e1, B:78:0x015f, B:77:0x015c, B:60:0x00dc, B:73:0x0157, B:32:0x00c6, B:15:0x0039, B:17:0x0049, B:20:0x004e, B:22:0x007f, B:25:0x0094, B:27:0x009a, B:28:0x009c, B:29:0x00b9, B:52:0x00ae, B:56:0x00d7), top: B:11:0x0033, inners: #0, #3, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(final Context context, final String str, String str2, String str3, String str4, Map map, final long j10, boolean z10, boolean z11) {
        boolean z12;
        String str5;
        int i10;
        f59679c = t();
        StatusBarNotification[] activeNotifications = ((NotificationManager) MobilistenInitProvider.k().getSystemService("notification")).getActiveNotifications();
        int length = activeNotifications.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                z12 = z11;
                break;
            }
            StatusBarNotification statusBarNotification = activeNotifications[i12];
            if (str != null && str.equalsIgnoreCase(statusBarNotification.getTag())) {
                z12 = true;
                break;
            }
            i12++;
        }
        if (z12) {
            try {
                final o.g gVar = new o.g();
                Cursor cursor = null;
                try {
                    try {
                        cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_NOTIFICATIONS WHERE CHATID=? ORDER BY STIME DESC LIMIT 7", new String[]{str});
                        i10 = cursor.getCount();
                        try {
                            cursor.moveToLast();
                            str5 = str4;
                            do {
                                try {
                                    com.google.gson.k kVar = (com.google.gson.k) AbstractC5895g.b(Yd.a.j(), cursor.getString(cursor.getColumnIndexOrThrow("MESSAGE")), com.google.gson.k.class);
                                    String f10 = AbstractC5896h.f(kVar.r("message"));
                                    boolean a10 = AbstractC5896h.a(kVar.r("is_deleted"));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    if (a10) {
                                        spannableStringBuilder.append((CharSequence) context.getString(t.f61117t3));
                                        int indexOf = StringsKt.indexOf((CharSequence) spannableStringBuilder, (char) 10680, 0, false);
                                        int i13 = indexOf == 0 ? 2 : 0;
                                        int length2 = spannableStringBuilder.length();
                                        if (indexOf != 0) {
                                            length2 -= 2;
                                        }
                                        spannableStringBuilder.setSpan(new StyleSpan(2), i13, length2, 34);
                                    } else {
                                        spannableStringBuilder.append((CharSequence) com.zoho.livechat.android.utils.L.z(LiveChatUtil.unescapeHtml(f10)));
                                    }
                                    str5 = spannableStringBuilder.toString();
                                    gVar.a(spannableStringBuilder);
                                } catch (Exception e10) {
                                    e = e10;
                                    i11 = i10;
                                    LiveChatUtil.log(e);
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Exception e11) {
                                            LiveChatUtil.log(e11);
                                        }
                                    }
                                    i10 = i11;
                                    final String str6 = str5;
                                    final Spannable c10 = Vf.b.i().c(LiveChatUtil.unescapeHtml(str3));
                                    gVar.b(c10);
                                    if (i10 > 0) {
                                    }
                                    if (Kf.a.i()) {
                                    }
                                }
                            } while (cursor.moveToPrevious());
                            cursor.close();
                        } catch (Exception e12) {
                            e = e12;
                            str5 = str4;
                        }
                    } finally {
                    }
                } catch (Exception e13) {
                    e = e13;
                    str5 = str4;
                }
                final String str62 = str5;
                final Spannable c102 = Vf.b.i().c(LiveChatUtil.unescapeHtml(str3));
                gVar.b(c102);
                if (i10 > 0) {
                    gVar.c(String.format(i10 == 1 ? context.getString(t.f61078n3) : context.getString(t.f61071m3), Integer.valueOf(i10)));
                }
                if (Kf.a.i()) {
                    final Intent intent = new Intent(context, (Class<?>) NotificationReceiverActivity.class);
                    intent.addFlags(335544320);
                    Kf.a.h(map, z10, new InterfaceC6686a() { // from class: od.e
                        @Override // ve.InterfaceC6686a
                        public final void a(we.e eVar) {
                            AbstractC5884j.e(intent, context, str, str62, gVar, c102, j10, eVar);
                        }
                    });
                } else {
                    Intent intent2 = new Intent(context, (Class<?>) ChatActivity.class);
                    f(str, str2, intent2);
                    y(context, str, str62, gVar, c102, j10, u(context, intent2));
                }
            } catch (Exception e14) {
                LiveChatUtil.log(e14);
            }
        }
    }

    public static void o(Context context, String str, String str2, String str3, int i10) {
        SalesIQChat chat;
        f59679c = t();
        try {
            if (!str3.equals(C6218a.y()) && (chat = LiveChatUtil.getChat(str3)) != null) {
                chat.setUnreadCount(chat.getUnreadCount() + 1);
                LiveChatUtil.updateBadgeListener(Kf.a.d() + 1);
                com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
                ne.j.q0();
            }
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(MobilistenUtil.f());
            androidx.core.app.z f10 = androidx.core.app.z.f(context);
            f10.e(SalesIQActivity.class);
            f10.a(launchIntentForPackage);
            Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
            intent.putExtra("chid", str3);
            intent.putExtra("mode", "SINGLETASK");
            intent.setFlags(335544320);
            f10.a(intent);
            o.e L10 = new o.e(context, s()).m(str).l(Vf.b.i().c(LiveChatUtil.unescapeHtml(str2))).g(true).k(Build.VERSION.SDK_INT >= 31 ? f10.g(f59677a.nextInt(), 201326592) : f10.g(f59677a.nextInt(), 134217728)).L(new long[0]);
            L10.A(1);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
            int e10 = P.e(dVar, AbstractC5886l.f59720G2);
            if (e10 != 0) {
                L10.j(e10);
            }
            if (LiveChatUtil.getNotificationIcon() != 0) {
                L10.E(LiveChatUtil.getNotificationIcon());
            } else {
                L10.E(P.h(dVar, AbstractC5886l.f59716F2));
            }
            f59679c.notify(1480, L10.d());
        } catch (Exception e11) {
            LiveChatUtil.log(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    public static void p(Context context, String str, String str2) {
        f59679c = t();
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(MobilistenUtil.f());
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            PendingIntent activity = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, f59677a.nextInt(), launchIntentForPackage, 1275068416) : PendingIntent.getActivity(context, f59677a.nextInt(), launchIntentForPackage, 1207959552);
            if (MobilistenInitProvider.k() != null) {
                StatusBarNotification[] activeNotifications = ((NotificationManager) MobilistenInitProvider.k().getSystemService("notification")).getActiveNotifications();
                int length = activeNotifications.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        f59678b.clear();
                        break;
                    } else if (1479 == activeNotifications[i10].getId()) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            ArrayList arrayList = f59678b;
            arrayList.add(str);
            o.g gVar = new o.g();
            int size = arrayList.size();
            ArrayList arrayList2 = arrayList;
            if (size > 5) {
                arrayList2 = arrayList.subList(arrayList.size() - 6, arrayList.size());
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                gVar.a((String) it.next());
            }
            o.e k10 = new o.e(context, s()).m(context.getString(t.f61111s3)).l(str).G(gVar).g(true).k(activity);
            k10.A(1);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
            int e10 = P.e(dVar, AbstractC5886l.f59720G2);
            if (e10 != 0) {
                k10.j(e10);
            }
            if (LiveChatUtil.getNotificationIcon() != 0) {
                k10.E(LiveChatUtil.getNotificationIcon());
            } else {
                k10.E(P.h(dVar, AbstractC5886l.f59716F2));
            }
            Notification d10 = k10.d();
            if (AbstractC5338c.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                return;
            }
            f59679c.notify(1479, d10);
        } catch (Exception e11) {
            LiveChatUtil.log(e11);
        }
    }

    public static void q(Context context, SalesIQChat salesIQChat, String str, String str2) {
        String str3;
        PendingIntent u10;
        f59679c = t();
        try {
            if (Kf.a.i()) {
                Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
                intent.putExtra("chid", salesIQChat.getChid());
                intent.putExtra("mode", "SINGLETASK");
                intent.setFlags(335544320);
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(MobilistenUtil.f());
                androidx.core.app.z f10 = androidx.core.app.z.f(context);
                f10.e(SalesIQActivity.class);
                f10.a(launchIntentForPackage);
                f10.a(intent);
                u10 = Build.VERSION.SDK_INT >= 31 ? f10.g(f59677a.nextInt(), 201326592) : f10.g(f59677a.nextInt(), 134217728);
                str3 = str;
            } else {
                Intent intent2 = new Intent(context, (Class<?>) NotificationReceiverActivity.class);
                intent2.addFlags(335544320);
                str3 = str;
                intent2.putExtra(EventKeys.PAYLOAD, new SalesIQNotificationPayload.Chat(com.zoho.livechat.android.utils.L.z(str2), LiveChatUtil.getAnnonID(), salesIQChat.getConvID(), salesIQChat.getAttenderName(), null, null, salesIQChat.getAttenderid(), str3, null));
                u10 = u(context, intent2);
            }
            o.e L10 = new o.e(context, s()).m(str3).l(Vf.b.i().c(LiveChatUtil.unescapeHtml(str2))).g(true).k(u10).L(new long[0]);
            L10.A(1);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
            int e10 = P.e(dVar, AbstractC5886l.f59720G2);
            if (e10 != 0) {
                L10.j(e10);
            }
            if (LiveChatUtil.getNotificationIcon() != 0) {
                L10.E(LiveChatUtil.getNotificationIcon());
            } else {
                L10.E(P.h(dVar, AbstractC5886l.f59716F2));
            }
            Notification d10 = L10.d();
            if (AbstractC5338c.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                return;
            }
            f59679c.notify(1478, d10);
        } catch (Exception e11) {
            LiveChatUtil.log(e11);
        }
    }

    public static void r(final Context context, final String str, final String str2, final String str3, String str4, final Bitmap bitmap, Map map) {
        try {
            final Bundle bundle = new Bundle();
            bundle.putString("timeuuid", str);
            bundle.putString("groupid", "siq_vh");
            if (!Kf.a.i()) {
                final Intent intent = new Intent(context, (Class<?>) NotificationReceiverActivity.class);
                intent.addFlags(335544320);
                Kf.a.h(map, false, new InterfaceC6686a() { // from class: od.g
                    @Override // ve.InterfaceC6686a
                    public final void a(we.e eVar) {
                        AbstractC5884j.d(intent, context, str, str2, str3, bitmap, bundle, eVar);
                    }
                });
                return;
            }
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(MobilistenUtil.f());
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            if (str4 != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                if (!str4.startsWith("http://") && !str4.startsWith("https://")) {
                    str4 = "http://" + str4;
                }
                launchIntentForPackage.setData(Uri.parse(str4));
            }
            launchIntentForPackage.putExtras(bundle);
            z(context, str, str2, str3, bitmap, launchIntentForPackage, bundle);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static String s() {
        if (f59680d == null) {
            f59680d = MobilistenUtil.f() + ".mobilisten";
            m();
        }
        return f59680d;
    }

    public static NotificationManagerCompat t() {
        Application k10 = MobilistenInitProvider.k();
        if (f59679c == null && k10 != null) {
            f59679c = NotificationManagerCompat.from(k10);
        }
        return f59679c;
    }

    public static PendingIntent u(Context context, Intent intent) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(MobilistenUtil.f());
        int nextInt = f59677a.nextInt();
        if (!Kf.a.i() || launchIntentForPackage == null) {
            return PendingIntent.getActivity(context, nextInt, intent, 201326592);
        }
        launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        return PendingIntent.getActivities(context, nextInt, new Intent[]{launchIntentForPackage, intent}, 201326592);
    }

    public static void v(Context context, Map map) {
        Hashtable hashtable;
        boolean z10;
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                LiveChatUtil.log("Firebase notification | data : " + AbstractC6574b.g(map));
                if (!map.containsKey("addInfo")) {
                    if (map.containsKey("msg")) {
                        p(context, LiveChatUtil.unescapeHtml((String) map.get("msg")), (String) map.get("badge"));
                        return;
                    }
                    return;
                }
                Hashtable hashtable2 = (Hashtable) AbstractC6574b.d((String) map.get("addInfo"));
                if (!map.containsKey("msg")) {
                    if (map.containsKey("rfid") && LiveChatUtil.getInteger(((Hashtable) AbstractC6574b.d((String) map.get("rfid"))).get("mtype")).intValue() == 114) {
                        He.a.n().p(map);
                        return;
                    }
                    return;
                }
                try {
                    String string = LiveChatUtil.getString(hashtable2.get("groupid"));
                    if (string.equalsIgnoreCase("siq_call")) {
                        Qd.a.C().G(map, false);
                        return;
                    }
                    String string2 = LiveChatUtil.getString(hashtable2.get("chid"));
                    if (string2.isEmpty()) {
                        hashtable = (Hashtable) AbstractC6574b.d((String) map.get("rfid"));
                        if (hashtable != null) {
                            string2 = LiveChatUtil.getChatid(LiveChatUtil.getString(hashtable.get("chid")));
                        }
                    } else {
                        hashtable = null;
                    }
                    int intValue = LiveChatUtil.getInteger(map.get("badge")).intValue();
                    Hashtable hashtable3 = hashtable;
                    String string3 = LiveChatUtil.getString(map.get("msg"));
                    String string4 = LiveChatUtil.getString(hashtable2.get("title"));
                    SalesIQChat chat = LiveChatUtil.getChat(string2);
                    boolean z11 = string2 != null && string2.equals(chat != null ? chat.getChid() : "temp_chid");
                    if (!string.equalsIgnoreCase("siq_vh") && !string.equalsIgnoreCase("siq_customer")) {
                        if (string.equalsIgnoreCase("siq_endchat")) {
                            if (z11) {
                                k(context, string4, string3, string2, map);
                                if (hashtable2.containsKey("timer")) {
                                    long j10 = LiveChatUtil.getLong(hashtable2.get("starttime"));
                                    Long valueOf = Long.valueOf(j10);
                                    Integer integer = LiveChatUtil.getInteger(hashtable2.get("timer"));
                                    int intValue2 = integer.intValue();
                                    ContentResolver contentResolver = MobilistenInitProvider.k().getContentResolver();
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("TIMER_START_TIME", valueOf);
                                    contentValues.put("TIMER_END_TIME", integer);
                                    contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{string2});
                                    SharedPreferences.Editor edit = C6218a.M().edit();
                                    edit.putLong("endtimerstart", j10);
                                    edit.putInt("endtimertime", intValue2);
                                    edit.apply();
                                    return;
                                }
                                if (chat == null || chat.getStatus() == 4) {
                                    return;
                                }
                                Q.k(string2);
                                C6966g.z(string2);
                                LiveChatUtil.removeCurrentChatPKID();
                                chat.setStatus(4);
                                chat.showContinueChat(true);
                                chat.setUnreadCount(0);
                                com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat);
                                LiveChatUtil.updateBadgeListener(Kf.a.d(), false);
                                C6966g.q0(context, chat, rd.b.f(), 0L);
                                LiveChatUtil.triggerChatListener("CHAT_CLOSE", chat);
                                return;
                            }
                            return;
                        }
                        if (string.equalsIgnoreCase("siq_pickupchat")) {
                            if (!z11 || string2.equals(C6218a.y())) {
                                return;
                            }
                            o(context, string4, string3, string2, intValue);
                            return;
                        }
                        if (hashtable2.contains("groupid") || string2 == null || string2.isEmpty() || string2.equals(C6218a.y())) {
                            return;
                        }
                        SalesIQChat chat2 = LiveChatUtil.getChat(string2);
                        Hashtable hashtable4 = hashtable3 == null ? (Hashtable) AbstractC6574b.d((String) map.get("rfid")) : hashtable3;
                        if (chat2 != null) {
                            chat2.setTimerStartTime(0L);
                            chat2.setTimerEndTime(0);
                        } else if ("proactive".equals((String) hashtable2.get("module"))) {
                            chat2 = new SalesIQChat(UUID.randomUUID().toString(), string2, null, rd.b.f(), 7, SalesIQChat.c.Chat);
                            chat2.setAttenderid((String) hashtable2.get("sender"));
                            chat2.setAttenderName((String) hashtable2.get("dname"));
                            chat2.setLastmsgtime(hashtable2.containsKey("t") ? LiveChatUtil.getLong(hashtable2.get("t")) : rd.b.f());
                            chat2.setRchatid(hashtable4 != null ? (String) hashtable4.get("chid") : null);
                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat2);
                        }
                        int intValue3 = hashtable4 != null ? LiveChatUtil.getInteger(hashtable4.get("mtype")).intValue() : -1;
                        String str = hashtable4 != null ? (String) hashtable4.get("ofi") : null;
                        if (intValue3 == 64) {
                            He.a.n().s(hashtable2);
                        } else if (intValue3 == 63) {
                            He.a.n().r(hashtable2);
                        } else if (str == null) {
                            He.a.n().q(hashtable2);
                        }
                        if (string2.equals(C6218a.y())) {
                            z10 = true;
                        } else {
                            if (chat2 != null) {
                                z10 = true;
                                chat2.setUnreadCount(chat2.getUnreadCount() + 1);
                            } else {
                                z10 = true;
                            }
                            LiveChatUtil.updateBadgeListener(Kf.a.d() + 1);
                            if (chat2 != null) {
                                com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(chat2);
                            }
                            ne.j.q0();
                        }
                        String str2 = (String) hashtable2.get("msguid");
                        String str3 = string2;
                        com.zoho.livechat.android.provider.a.INSTANCE.insertPushNotification(context.getContentResolver(), str3, (String) hashtable2.get("sender"), (String) hashtable2.get("dname"), b.EnumC0639b.WMS, null, str2 != null ? str2.replace("%", "_") : null, (String) hashtable2.get("rmsg"), null, null, Long.valueOf(String.valueOf(hashtable2.get("t"))), intValue3 == 64 ? z10 : false, intValue3 == 63 ? z10 : false);
                        h(1480);
                        if (LiveChatUtil.canShowInAppNotification() || !C6218a.W()) {
                            n(context, str3, chat2 != null ? chat2.getConvID() : "", (String) hashtable2.get("dname"), intValue3 == 63 ? context.getString(t.f61117t3) : (String) hashtable2.get("rmsg"), map, Long.valueOf(String.valueOf(hashtable2.get("t"))).longValue(), false, (intValue3 == 63 || intValue3 == 64) ? false : z10);
                            return;
                        }
                        return;
                    }
                    String str4 = (String) hashtable2.get("timeuuid");
                    String str5 = (String) hashtable2.get("targetlink");
                    String str6 = (String) hashtable2.get("imgpath");
                    com.zoho.livechat.android.provider.a.INSTANCE.insertPushNotification(context.getContentResolver(), null, null, null, b.EnumC0639b.SIQ, string, str4, (String) map.get("msg"), str5, str6, Long.valueOf(rd.b.f()));
                    if (str6 == null || str6.trim().length() <= 0) {
                        r(context, str4, (String) hashtable2.get("title"), (String) map.get("msg"), str5, null, map);
                    } else {
                        new a(str6, context, str4, (String) hashtable2.get("title"), (String) map.get("msg"), str5, (String) map.get("badge"), string.equalsIgnoreCase("siq_customer"), map).execute(new String[0]);
                    }
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                }
            } catch (Exception e11) {
                LiveChatUtil.log(e11);
            }
        }
    }

    public static boolean w(Map map) {
        try {
            return LiveChatUtil.getString(map.get("uid")).equalsIgnoreCase(LiveChatUtil.getAnnonID());
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return false;
        }
    }

    public static void x(Context context, String str, String str2, String str3, PendingIntent pendingIntent) {
        f59679c = t();
        o.e L10 = new o.e(context, s()).m(Vf.b.i().c(LiveChatUtil.unescapeHtml(str2))).l(Vf.b.i().c(LiveChatUtil.unescapeHtml(str3))).G(new o.c().a(str3)).g(true).k(pendingIntent).L(new long[0]);
        L10.A(1);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
        int e10 = P.e(dVar, AbstractC5886l.f59720G2);
        if (e10 != 0) {
            L10.j(e10);
        }
        if (LiveChatUtil.getNotificationIcon() != 0) {
            L10.E(LiveChatUtil.getNotificationIcon());
        } else {
            L10.E(P.h(dVar, AbstractC5886l.f59716F2));
        }
        f59679c.notify(str, 1480, L10.d());
    }

    public static void y(Context context, String str, String str2, o.g gVar, Spannable spannable, long j10, PendingIntent pendingIntent) {
        f59679c = t();
        o.e L10 = new o.e(context, s()).m(spannable).l(com.zoho.livechat.android.utils.L.z(LiveChatUtil.unescapeHtml(str2))).g(true).G(gVar).k(pendingIntent).L(new long[0]);
        L10.A(1);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
        int e10 = P.e(dVar, AbstractC5886l.f59720G2);
        if (e10 != 0) {
            L10.j(e10);
        }
        if (j10 > 0) {
            L10.N(j10);
        }
        L10.A(1);
        if (LiveChatUtil.getNotificationIcon() != 0) {
            L10.E(LiveChatUtil.getNotificationIcon());
        } else {
            L10.E(P.h(dVar, AbstractC5886l.f59716F2));
        }
        f59679c.notify(str, 1476, L10.d());
    }

    public static void z(Context context, String str, String str2, String str3, Bitmap bitmap, Intent intent, Bundle bundle) {
        f59679c = t();
        int i10 = Build.VERSION.SDK_INT;
        PendingIntent activity = i10 >= 31 ? PendingIntent.getActivity(context, f59677a.nextInt(), intent, 1275068416) : PendingIntent.getActivity(context, f59677a.nextInt(), intent, 1207959552);
        Intent intent2 = new Intent(context, (Class<?>) NotificationDeleteReceiver.class);
        intent2.putExtras(bundle);
        PendingIntent broadcast = i10 >= 31 ? PendingIntent.getBroadcast(context, f59677a.nextInt(), intent2, 201326592) : PendingIntent.getBroadcast(context, f59677a.nextInt(), intent2, 134217728);
        if (bitmap != null) {
            o.e k10 = new o.e(context, s()).m(str2).l(str3).G(new o.b().b(bitmap)).g(true).q(broadcast).k(activity);
            k10.A(1);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
            int e10 = P.e(dVar, AbstractC5886l.f59720G2);
            if (e10 != 0) {
                k10.j(e10);
            }
            if (LiveChatUtil.getNotificationIcon() != 0) {
                k10.E(LiveChatUtil.getNotificationIcon());
            } else {
                k10.E(P.h(dVar, AbstractC5886l.f59716F2));
            }
            Notification d10 = k10.d();
            if (AbstractC5338c.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                return;
            }
            f59679c.notify(str, 1477, d10);
            return;
        }
        o.e k11 = new o.e(context, s()).m(str2).l(str3).g(true).q(broadcast).k(activity);
        k11.A(1);
        androidx.appcompat.view.d dVar2 = new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
        int e11 = P.e(dVar2, AbstractC5886l.f59720G2);
        if (e11 != 0) {
            k11.j(e11);
        }
        if (LiveChatUtil.getNotificationIcon() != 0) {
            k11.E(LiveChatUtil.getNotificationIcon());
        } else {
            k11.E(P.h(dVar2, AbstractC5886l.f59716F2));
        }
        Notification d11 = k11.d();
        if (AbstractC5338c.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        f59679c.notify(str, 1477, d11);
    }
}
