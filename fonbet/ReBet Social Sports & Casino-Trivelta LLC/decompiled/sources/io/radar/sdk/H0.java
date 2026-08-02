package io.radar.sdk;

import Gh.C1165b;
import Gh.h;
import T3.AbstractC1585a0;
import T3.AbstractC1588b0;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import androidx.core.app.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class H0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f49673a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, Gh.h[] events) {
            Gh.B e10;
            JSONObject a10;
            String optString;
            JSONObject a11;
            JSONObject b10;
            JSONObject b11;
            JSONObject b12;
            String valueOf;
            String str;
            JSONObject b13;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(events, "events");
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            for (Gh.h hVar : events) {
                if (hVar.f() == h.c.USER_ENTERED_GEOFENCE) {
                    Gh.j c10 = hVar.c();
                    if (c10 != null && (b13 = c10.b()) != null) {
                        optString = b13.optString("radar:entryNotificationText");
                    }
                    optString = null;
                } else if (hVar.f() == h.c.USER_EXITED_GEOFENCE) {
                    Gh.j c11 = hVar.c();
                    if (c11 != null && (b12 = c11.b()) != null) {
                        optString = b12.optString("radar:exitNotificationText");
                    }
                    optString = null;
                } else if (hVar.f() == h.c.USER_ENTERED_BEACON) {
                    C1165b a12 = hVar.a();
                    if (a12 != null && (b11 = a12.b()) != null) {
                        optString = b11.optString("radar:entryNotificationText");
                    }
                    optString = null;
                } else if (hVar.f() == h.c.USER_EXITED_BEACON) {
                    C1165b a13 = hVar.a();
                    if (a13 != null && (b10 = a13.b()) != null) {
                        optString = b10.optString("radar:exitNotificationText");
                    }
                    optString = null;
                } else if (hVar.f() == h.c.USER_APPROACHING_TRIP_DESTINATION) {
                    Gh.B e11 = hVar.e();
                    if (e11 != null && (a11 = e11.a()) != null) {
                        optString = a11.optString("radar:approachingNotificationText");
                    }
                    optString = null;
                } else {
                    if (hVar.f() == h.c.USER_ARRIVED_AT_TRIP_DESTINATION && (e10 = hVar.e()) != null && (a10 = e10.a()) != null) {
                        optString = a10.optString("radar:arrivalNotificationText");
                    }
                    optString = null;
                }
                if (optString != null && optString.length() > 0) {
                    String g10 = hVar.g();
                    Object systemService = context.getSystemService("notification");
                    NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                    AbstractC1588b0.a();
                    NotificationChannel a14 = AbstractC1585a0.a("Location", "Location", 4);
                    a14.enableVibration(true);
                    if (notificationManager != null) {
                        notificationManager.createNotificationChannel(a14);
                    }
                    I0 m10 = L0.f49705a.m(context);
                    if (m10 == null || (valueOf = m10.c()) == null) {
                        valueOf = String.valueOf(context.getApplicationContext().getApplicationInfo().icon);
                    }
                    o.e A10 = new o.e(context, "Location").E(context.getApplicationContext().getResources().getIdentifier(valueOf, "drawable", context.getApplicationContext().getPackageName())).g(true).l(optString).G(new o.c().a(optString)).A(0);
                    Intrinsics.checkNotNullExpressionValue(A10, "Builder(context, CHANNEL…nCompat.PRIORITY_DEFAULT)");
                    if (m10 == null || (str = m10.b()) == null) {
                        str = "";
                    }
                    if (str.length() > 0) {
                        A10.j(Color.parseColor(str));
                    }
                    if (notificationManager != null) {
                        notificationManager.notify(g10, 20160525, A10.d());
                    }
                }
            }
        }

        public a() {
        }
    }
}
