package Lj;

import Dj.h;
import Dj.j;
import Dj.m;
import Fj.C1162h;
import T3.AbstractC1585a0;
import T3.AbstractC1588b0;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.core.app.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import zendesk.talk.android.internal.call.a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f7374d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f7375a;

    /* renamed from: b, reason: collision with root package name */
    public final C1162h f7376b;

    /* renamed from: c, reason: collision with root package name */
    public final NotificationManager f7377c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(Context context, C1162h stopwatchTimeFormatter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stopwatchTimeFormatter, "stopwatchTimeFormatter");
        this.f7375a = context;
        this.f7376b = stopwatchTimeFormatter;
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f7377c = (NotificationManager) systemService;
    }

    public final Notification a(PendingIntent pendingIntent, PendingIntent finishPendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(finishPendingIntent, "finishPendingIntent");
        c();
        return b(pendingIntent, new a.d(null, 0L, false, 7, null), finishPendingIntent);
    }

    public final Notification b(PendingIntent pendingIntent, zendesk.talk.android.internal.call.a aVar, PendingIntent pendingIntent2) {
        long c10 = aVar.c();
        Notification d10 = e().m(this.f7375a.getString(zendesk.talk.android.internal.call.c.c(aVar))).l(c10 == 0 ? null : this.f7376b.a(c10)).E(j.f2840c).k(pendingIntent).b(new o.a(j.f2839b, this.f7375a.getString(m.f2885j), pendingIntent2)).j(AbstractC5338c.getColor(this.f7375a, h.f2833b)).h("call").d();
        Intrinsics.checkNotNullExpressionValue(d10, "build(...)");
        return d10;
    }

    public final void c() {
        if (d()) {
            AbstractC1588b0.a();
            this.f7377c.createNotificationChannel(AbstractC1585a0.a("talk_sdk_channel_id", this.f7375a.getString(m.f2884i), 2));
        }
    }

    public final boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final o.e e() {
        return d() ? new o.e(this.f7375a, "talk_sdk_channel_id") : new o.e(this.f7375a);
    }

    public final void f(PendingIntent pendingIntent, zendesk.talk.android.internal.call.a state, int i10, PendingIntent finishPendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(finishPendingIntent, "finishPendingIntent");
        this.f7377c.notify(i10, b(pendingIntent, state, finishPendingIntent));
    }
}
