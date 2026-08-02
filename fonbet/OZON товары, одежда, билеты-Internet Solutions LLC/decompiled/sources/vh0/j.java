package vh0;

import C.J;
import Sc.r;
import Sc.s;
import Yg0.a;
import Zg0.d;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import androidx.core.app.l;
import androidx.core.app.q;
import androidx.core.content.pm.f;
import androidx.core.graphics.drawable.IconCompat;
import dh0.C6200a;
import fh0.AbstractC6567b;
import fh0.C6568c;
import fh0.C6569d;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qh0.C9059c;
import ru.ozon.push.sdk.external.service.RemoteMessage;
import ru.ozon.push.sdk.internal.service.OzonPushActionInfo;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f102952a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Zg0.g f102953b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.core.app.n f102954c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final oh0.d f102955d;

    /* renamed from: e, reason: collision with root package name */
    private final ph0.h f102956e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final n f102957f;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f102958b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Permission is not granted";
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.core.content.pm.f f102959b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.core.content.pm.f fVar) {
            super(0);
            this.f102959b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "shortcutInfo is " + this.f102959b;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6568c f102960b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f102961c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Notification f102962d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C6568c c6568c, String str, Notification notification) {
            super(0);
            this.f102960b = c6568c;
            this.f102961c = str;
            this.f102962d = notification;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            C6568c c6568c = this.f102960b;
            int n11 = c6568c.n();
            String d11 = c6568c.d();
            Bundle bundle = this.f102962d.extras;
            StringBuilder f7 = P4.f.f(n11, "Push notification was shown. Id: ", " in channel ");
            Nh.a.h(f7, this.f102961c, " with category ", d11, ", extras are ");
            f7.append(bundle);
            return f7.toString();
        }
    }

    public j(@NotNull Context context, @NotNull Zg0.g configuration, @NotNull androidx.core.app.n notificationManagerCompat, @NotNull oh0.d notificationAvailabilityChecker, ph0.h hVar, @NotNull n smallIconLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(notificationManagerCompat, "notificationManagerCompat");
        Intrinsics.checkNotNullParameter(notificationAvailabilityChecker, "notificationAvailabilityChecker");
        Intrinsics.checkNotNullParameter(smallIconLoader, "smallIconLoader");
        this.f102952a = context;
        this.f102953b = configuration;
        this.f102954c = notificationManagerCompat;
        this.f102955d = notificationAvailabilityChecker;
        this.f102956e = hVar;
        this.f102957f = smallIconLoader;
    }

    private static void a(Intent intent, RemoteMessage remoteMessage, OzonPushActionInfo ozonPushActionInfo) {
        intent.putExtra("ru.ozon.push.sdk.PUSH_CLICKED", true);
        intent.putExtra("ru.ozon.push.sdk.REMOTE_MESSAGE", remoteMessage);
        intent.putExtra("ru.ozon.push.sdk.ACTION_INFO", ozonPushActionInfo);
    }

    private static Bitmap c(String str) {
        if (str.length() != 0) {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                openConnection.setConnectTimeout(2000);
                openConnection.setReadTimeout(7000);
                InputStream inputStream = openConnection.getInputStream();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    Vd0.b.a(inputStream, null);
                    return decodeStream;
                } finally {
                }
            } catch (IOException e11) {
                Lm0.a.f17149a.e(e11);
            }
        }
        return null;
    }

    private final Notification d(C6568c c6568c, Zg0.h hVar, l.d dVar, xj.a aVar) {
        boolean z11;
        C9059c h11 = c6568c.h();
        int b11 = h11 != null ? h11.b() : c6568c.n();
        if (C6569d.a(c6568c)) {
            dVar.x();
            dVar.E(null);
            dVar.I(new long[]{0});
        }
        Notification b12 = dVar.b();
        Intrinsics.checkNotNullExpressionValue(b12, "build(...)");
        androidx.core.app.n nVar = this.f102954c;
        List<StatusBarNotification> f7 = nVar.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getActiveNotifications(...)");
        List<StatusBarNotification> list = f7;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (StatusBarNotification statusBarNotification : list) {
                C9059c h12 = c6568c.h();
                if (h12 != null && statusBarNotification.getId() == h12.b()) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!C6569d.a(c6568c) || z11) {
            String s11 = c6568c.s();
            if (s11 != null) {
                int hashCode = s11.hashCode();
                String b13 = hVar.b();
                Context context = this.f102952a;
                l.d dVar2 = new l.d(context, b13);
                dVar2.f(b13);
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                dVar2.C(Rh0.h.a(this.f102953b, resources));
                dVar2.p(s11);
                dVar2.d(true);
                dVar2.q();
                Intrinsics.checkNotNullExpressionValue(dVar2, "setGroupSummary(...)");
                if (C6569d.a(c6568c)) {
                    dVar2.x();
                    dVar2.E(null);
                    dVar2.I(new long[]{0});
                }
                nVar.j(dVar2.b(), hashCode, null);
                int i11 = sh0.b.f98783c;
                sh0.b.f("PushNotifier", aVar, new i(c6568c, hVar), 4);
            }
            nVar.j(b12, b11, null);
        }
        ph0.h hVar2 = this.f102956e;
        if (hVar2 != null) {
            hVar2.f(c6568c);
        }
        return b12;
    }

    public final boolean b() {
        return this.f102955d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [Sc.r$b] */
    /* JADX WARN: Type inference failed for: r17v0, types: [vh0.j] */
    /* JADX WARN: Type inference failed for: r18v0, types: [fh0.c, java.lang.Object] */
    @SuppressLint({"MissingPermission"})
    public final void e(@NotNull C6568c pushModel, @NotNull Zg0.h channel) {
        Intent launchIntentForPackage;
        String str;
        PendingIntent activity;
        androidx.core.content.pm.f fVar;
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        Intrinsics.checkNotNullParameter(channel, "channel");
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("Do not invoke this method from main thread");
        }
        xj.a b11 = sj.f.b(new Pair("notification_id", Integer.valueOf(pushModel.n())));
        int i11 = Build.VERSION.SDK_INT;
        Context context = this.f102952a;
        if (i11 >= 33 && androidx.core.content.a.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            int i12 = sh0.b.f98783c;
            sh0.b.f("PushNotifier", b11, a.f102958b, 4);
            return;
        }
        String b12 = channel.b();
        l.d dVar = new l.d(context, b12);
        dVar.i(pushModel.l());
        dVar.j(pushModel.u());
        dVar.f(b12);
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        dVar.C(Rh0.h.a(this.f102953b, resources));
        dVar.p(pushModel.s());
        l.c cVar = new l.c();
        cVar.d(pushModel.l());
        dVar.F(cVar);
        dVar.d(true);
        dVar.y(1);
        dVar.e(pushModel.d());
        dVar.J(pushModel.w());
        Intrinsics.checkNotNullExpressionValue(dVar, "setVisibility(...)");
        IconCompat b13 = this.f102957f.b(pushModel.p().b().get("small_icon_url"));
        if (b13 != null) {
            dVar.D(b13);
        }
        Integer i13 = pushModel.i();
        if (i13 != null) {
            dVar.C(i13.intValue());
        }
        dVar.v(pushModel.c());
        String j11 = pushModel.j();
        Bitmap c11 = j11 != null ? c(j11) : null;
        if (c11 != null) {
            l.b bVar = new l.b();
            bVar.e(c11);
            Intrinsics.checkNotNullExpressionValue(bVar, "bigPicture(...)");
            if (pushModel.k() != null) {
                bVar.d();
            }
            dVar.F(bVar);
        }
        C6568c.b k11 = pushModel.k();
        if (k11 instanceof C6568c.b.C1025b) {
            ((C6568c.b.C1025b) pushModel.k()).getClass();
            dVar.r();
            Intrinsics.checkNotNullExpressionValue(dVar, "setLargeIcon(...)");
        } else if (k11 instanceof C6568c.b.a) {
            ((C6568c.b.a) pushModel.k()).getClass();
            dVar.s(null);
            Intrinsics.checkNotNullExpressionValue(dVar, "setLargeIcon(...)");
        } else if (k11 instanceof C6568c.b.C1026c) {
            Bitmap c12 = c(((C6568c.b.C1026c) pushModel.k()).a());
            if (c12 != null) {
                dVar.s(c12);
            }
            Unit unit = Unit.f71690a;
        } else {
            if (k11 != null) {
                throw new Sc.o();
            }
            Unit unit2 = Unit.f71690a;
        }
        OzonPushActionInfo ozonPushActionInfo = new OzonPushActionInfo(pushModel.n(), pushModel.v());
        if (pushModel.e() != null) {
            AbstractC6567b e11 = pushModel.e();
            RemoteMessage p11 = pushModel.p();
            if (e11 instanceof AbstractC6567b.C1023b) {
                a(((AbstractC6567b.C1023b) e11).c(), p11, ozonPushActionInfo);
            } else {
                if (!(e11 instanceof AbstractC6567b.e)) {
                    if (e11 instanceof AbstractC6567b.d) {
                        ((AbstractC6567b.d) e11).getClass();
                        a(null, p11, ozonPushActionInfo);
                        throw null;
                    }
                    if (e11 instanceof AbstractC6567b.c) {
                        ((AbstractC6567b.c) e11).getClass();
                        a(null, p11, ozonPushActionInfo);
                        throw null;
                    }
                    if (!(e11 instanceof AbstractC6567b.a)) {
                        throw new Sc.o();
                    }
                    ((AbstractC6567b.a) e11).getClass();
                    C7705l.C(null);
                    throw null;
                }
                a(((AbstractC6567b.e) e11).c(), p11, ozonPushActionInfo);
            }
            activity = e11.a(context);
        } else {
            if (pushModel.o() != null) {
                launchIntentForPackage = pushModel.o();
            } else {
                String f97695b = ozonPushActionInfo.getF97695b();
                if (f97695b == null || kotlin.text.h.K(f97695b)) {
                    launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    if (launchIntentForPackage == null) {
                        Lm0.a.f17149a.e("Launch activity not found", new Object[0]);
                        launchIntentForPackage = new Intent();
                    }
                } else {
                    a.C0652a c0652a = Yg0.a.f35038y;
                    String url = ozonPushActionInfo.getF97695b();
                    c0652a.getClass();
                    Intrinsics.checkNotNullParameter(url, "url");
                    try {
                        r.Companion companion = r.INSTANCE;
                        str = Uri.parse(url).buildUpon().appendQueryParameter("from", "from_app_push").build().toString();
                    } catch (Throwable th2) {
                        r.Companion companion2 = r.INSTANCE;
                        str = s.a(th2);
                    }
                    if (!(str instanceof r.b)) {
                        url = str;
                    }
                    launchIntentForPackage = new Intent("android.intent.action.VIEW").setData(Uri.parse(url)).setPackage(context.getPackageName());
                    Intrinsics.f(launchIntentForPackage);
                }
            }
            launchIntentForPackage.putExtra("ru.ozon.push.sdk.PUSH_CLICKED", true);
            launchIntentForPackage.putExtra("ru.ozon.push.sdk.REMOTE_MESSAGE", pushModel.p());
            launchIntentForPackage.putExtra("ru.ozon.push.sdk.ACTION_INFO", ozonPushActionInfo);
            launchIntentForPackage.addFlags(268435456);
            activity = PendingIntent.getActivity(context, kotlin.random.c.INSTANCE.d(), launchIntentForPackage, 201326592);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        }
        dVar.h(activity);
        if ("msg".equals(pushModel.d())) {
            String str2 = pushModel.f().get("icon");
            Bitmap c13 = str2 != null ? c(str2) : null;
            IconCompat c14 = c13 != null ? IconCompat.c(Icon.createWithBitmap(c13), context) : null;
            q.c cVar2 = new q.c();
            cVar2.c(pushModel.u());
            if (c14 != null) {
                cVar2.b(c14);
            }
            q a11 = cVar2.a();
            Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
            l.g gVar = new l.g(a11);
            gVar.d(pushModel.l(), pushModel.t(), a11);
            dVar.F(gVar);
            String s11 = pushModel.s();
            f.b bVar2 = new f.b(context, J.b(s11 != null ? Integer.valueOf(s11.hashCode()) : null, "chat_"));
            bVar2.d(c14);
            bVar2.e(new Intent("android.intent.action.VIEW", Uri.parse(pushModel.v())));
            bVar2.j(pushModel.u());
            bVar2.f();
            bVar2.i(a11);
            bVar2.h();
            bVar2.b(e0.h("android.shortcut.conversation"));
            fVar = bVar2.a();
            Intrinsics.checkNotNullExpressionValue(fVar, "build(...)");
            if (androidx.core.content.pm.i.d(context, fVar)) {
                dVar.z(fVar);
            }
        } else {
            fVar = null;
        }
        int i14 = sh0.b.f98783c;
        sh0.b.f("PushNotifier", b11, new b(fVar), 4);
        pushModel.b(dVar);
        try {
            c cVar3 = new c(pushModel, b12, d(pushModel, channel, dVar, b11));
            Zg0.d b14 = C6200a.b();
            if (b14 instanceof d.b) {
                C6200a.c().a(C6200a.a((String) cVar3.invoke()), null);
                ((d.b) b14).getClass();
            }
            sh0.b.f("PushNotifier", b11, cVar3, 4);
            if (fVar != null) {
                androidx.core.content.pm.i.a(context, C7714v.a0(fVar.a()));
            }
        } catch (Throwable th3) {
            if (!Rh0.i.a(th3)) {
                throw th3;
            }
            Lm0.a.f17149a.e(th3, "Dead system raise", new Object[0]);
        }
    }
}
