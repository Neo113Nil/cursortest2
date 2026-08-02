package io.radar.sdk;

import T3.AbstractC1585a0;
import T3.AbstractC1588b0;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import io.agora.rtc2.internal.AudioRoutingController;
import io.radar.sdk.C4589c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lio/radar/sdk/RadarForegroundService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Landroid/os/Bundle;", "extras", "", "c", "(Landroid/os/Bundle;)V", "Lio/radar/sdk/G0;", "a", "Lio/radar/sdk/G0;", "logger", com.google.crypto.tink.integration.android.b.f37029b, "sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadarForegroundService extends Service {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static boolean f49786c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public G0 logger;

    /* renamed from: io.radar.sdk.RadarForegroundService$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return RadarForegroundService.f49786c;
        }

        public final void b(boolean z10) {
            RadarForegroundService.f49786c = z10;
        }

        public Companion() {
        }
    }

    public final void c(Bundle extras) {
        String str;
        String valueOf;
        String str2;
        String str3;
        G0 g02;
        Object systemService = getSystemService("notification");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
        }
        ((NotificationManager) systemService).deleteNotificationChannel("RadarSDK");
        int i10 = extras != null ? extras.getInt(StackTraceHelper.ID_KEY) : 0;
        if (i10 == 0) {
            i10 = 20160525;
        }
        int i11 = extras != null ? extras.getInt("importance", 3) : 3;
        String string = extras != null ? extras.getString("title") : null;
        if (extras == null || (str = extras.getString("text")) == null) {
            str = "Location tracking started";
        }
        int i12 = extras != null ? extras.getInt("icon") : 0;
        if (extras == null || (valueOf = extras.getString("iconString")) == null) {
            valueOf = String.valueOf(getApplicationInfo().icon);
        }
        Intrinsics.checkNotNullExpressionValue(valueOf, "extras?.getString(\"iconS…ationInfo.icon.toString()");
        if (extras == null || (str2 = extras.getString("iconColor")) == null) {
            str2 = "";
        }
        int identifier = getResources().getIdentifier(valueOf, "drawable", getApplicationContext().getPackageName());
        if (i12 != 0) {
            identifier = getResources().getIdentifier(String.valueOf(i12), "drawable", getApplicationContext().getPackageName());
        }
        if (extras == null || (str3 = extras.getString("channelName")) == null) {
            str3 = "Location Services";
        }
        AbstractC1588b0.a();
        NotificationChannel a10 = AbstractC1585a0.a("RadarSDK", str3, i11);
        Object systemService2 = getSystemService("notification");
        if (systemService2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
        }
        ((NotificationManager) systemService2).createNotificationChannel(a10);
        AbstractC4637n0.a();
        Notification.Builder smallIcon = AbstractC4635m0.a(getApplicationContext(), "RadarSDK").setContentText(str).setOngoing(true).setSmallIcon(identifier);
        Intrinsics.checkNotNullExpressionValue(smallIcon, "Builder(applicationConte… .setSmallIcon(smallIcon)");
        if (string != null && string.length() != 0) {
            smallIcon = smallIcon.setContentTitle(string);
            Intrinsics.checkNotNullExpressionValue(smallIcon, "builder.setContentTitle(title as CharSequence?)");
        }
        if (str2.length() > 0) {
            smallIcon.setColor(Color.parseColor(str2));
        }
        if (extras != null) {
            try {
                String string2 = extras.getString("activity");
                if (string2 != null) {
                    Intent intent = new Intent(this, Class.forName(string2));
                    intent.setFlags(268468224);
                    Notification.Builder contentIntent = smallIcon.setContentIntent(PendingIntent.getActivity(this, 0, intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET));
                    Intrinsics.checkNotNullExpressionValue(contentIntent, "builder.setContentIntent(pendingIntent)");
                    smallIcon = contentIntent;
                }
            } catch (ClassNotFoundException e10) {
                G0 g03 = this.logger;
                if (g03 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("logger");
                    g02 = null;
                } else {
                    g02 = g03;
                }
                g02.c("Error setting foreground service content intent", C4589c.EnumC4600l.SDK_EXCEPTION, e10);
            }
        }
        Notification build = smallIcon.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(i10, build, 8);
        } else {
            startForeground(i10, build);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (this.logger == null) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            this.logger = new G0(applicationContext);
        }
        if (intent != null) {
            G0 g02 = null;
            if (Intrinsics.areEqual(intent.getAction(), ViewProps.START)) {
                try {
                    c(intent.getExtras());
                } catch (Exception e10) {
                    G0 g03 = this.logger;
                    if (g03 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("logger");
                    } else {
                        g02 = g03;
                    }
                    g02.c("Error starting foreground service", C4589c.EnumC4600l.SDK_EXCEPTION, e10);
                }
            } else if (Intrinsics.areEqual(intent.getAction(), "stop")) {
                try {
                    stopForeground(true);
                    stopSelf();
                } catch (Exception e11) {
                    G0 g04 = this.logger;
                    if (g04 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("logger");
                    } else {
                        g02 = g04;
                    }
                    g02.c("Error stopping foreground service", C4589c.EnumC4600l.SDK_EXCEPTION, e11);
                }
            }
        }
        return 1;
    }
}
