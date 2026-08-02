package expo.modules.location.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import expo.modules.filesystem.FileSystemPath$$ExternalSyntheticApiModelOutline0;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocationTaskService.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0017J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010\u0017\u001a\u00020\u0015J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u0012\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0003J\b\u0010!\u001a\u00020\u000bH\u0002J\u0019\u0010\"\u001a\u0004\u0018\u00010\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010$R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lexpo/modules/location/services/LocationTaskService;", "Landroid/app/Service;", "<init>", "()V", "mChannelId", "", "mKillService", "", "mParentContext", "Landroid/content/Context;", "mServiceId", "", "mBinder", "Landroid/os/IBinder;", "onBind", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "onStartCommand", "flags", "startId", "setParentContext", "", "context", "stop", "onTaskRemoved", "rootIntent", "startForeground", "serviceOptions", "Landroid/os/Bundle;", "buildServiceNotification", "Landroid/app/Notification;", "prepareChannel", "id", "getDefaultNotificationIcon", "colorStringToInteger", "color", "(Ljava/lang/String;)Ljava/lang/Integer;", "ServiceBinder", "Companion", "expo-location_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocationTaskService extends Service {
    public static final String META_DATA_FOREGROUND_SERVICE_ICON_KEY = "expo.modules.location.foreground_service_icon";
    private final IBinder mBinder;
    private String mChannelId;
    private boolean mKillService;
    private Context mParentContext;
    private final int mServiceId;
    private static int sServiceId = 481756;

    public LocationTaskService() {
        int i = sServiceId;
        sServiceId = i + 1;
        this.mServiceId = i;
        this.mBinder = new ServiceBinder();
    }

    /* compiled from: LocationTaskService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/location/services/LocationTaskService$ServiceBinder;", "Landroid/os/Binder;", "<init>", "(Lexpo/modules/location/services/LocationTaskService;)V", NotificationCompat.CATEGORY_SERVICE, "Lexpo/modules/location/services/LocationTaskService;", "getService", "()Lexpo/modules/location/services/LocationTaskService;", "expo-location_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ServiceBinder extends Binder {
        public ServiceBinder() {
        }

        /* renamed from: getService, reason: from getter */
        public final LocationTaskService getThis$0() {
            return LocationTaskService.this;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.mBinder;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return 3;
        }
        this.mChannelId = extras.getString(RemoteConfigConstants.RequestFieldKey.APP_ID) + ":" + extras.getString("taskName");
        this.mKillService = extras.getBoolean("killService", false);
        return 3;
    }

    public final void setParentContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mParentContext = context;
    }

    public final void stop() {
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        Intrinsics.checkNotNullParameter(rootIntent, "rootIntent");
        if (this.mKillService) {
            super.onTaskRemoved(rootIntent);
            stop();
        }
    }

    public final void startForeground(Bundle serviceOptions) {
        Intrinsics.checkNotNullParameter(serviceOptions, "serviceOptions");
        startForeground(this.mServiceId, buildServiceNotification(serviceOptions));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (r5.setColor(r10.intValue()) == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Notification buildServiceNotification(Bundle serviceOptions) {
        Notification.Builder colorized;
        int defaultNotificationIcon;
        Notification.Builder colorized2;
        prepareChannel(this.mChannelId);
        FileSystemPath$$ExternalSyntheticApiModelOutline0.m$2();
        LocationTaskService locationTaskService = this;
        Notification.Builder m = FileSystemPath$$ExternalSyntheticApiModelOutline0.m(locationTaskService, this.mChannelId);
        String string = serviceOptions.getString("notificationTitle");
        String string2 = serviceOptions.getString("notificationBody");
        Integer colorStringToInteger = colorStringToInteger(serviceOptions.getString("notificationColor"));
        if (string != null) {
            m.setContentTitle(string);
        }
        if (string2 != null) {
            m.setContentText(string2);
        }
        if (colorStringToInteger != null) {
            colorStringToInteger.intValue();
            colorized2 = m.setColorized(true);
        }
        colorized = m.setColorized(false);
        Intrinsics.checkNotNullExpressionValue(colorized, "setColorized(...)");
        Context context = this.mParentContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mParentContext");
            context = null;
        }
        PackageManager packageManager = context.getPackageManager();
        Context context3 = this.mParentContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mParentContext");
            context3 = null;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context3.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(C.BUFFER_FLAG_LAST_SAMPLE);
            m.setContentIntent(PendingIntent.getActivity(locationTaskService, 0, launchIntentForPackage, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | C.BUFFER_FLAG_FIRST_SAMPLE));
        }
        try {
            Context context4 = this.mParentContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mParentContext");
                context4 = null;
            }
            PackageManager packageManager2 = context4.getPackageManager();
            Context context5 = this.mParentContext;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mParentContext");
            } else {
                context2 = context5;
            }
            ApplicationInfo applicationInfo = packageManager2.getApplicationInfo(context2.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && bundle.containsKey(META_DATA_FOREGROUND_SERVICE_ICON_KEY)) {
                defaultNotificationIcon = applicationInfo.metaData.getInt(META_DATA_FOREGROUND_SERVICE_ICON_KEY);
            } else {
                defaultNotificationIcon = getDefaultNotificationIcon();
            }
        } catch (Exception e) {
            Log.e("expo-location", "Could not fetch default notification icon.", e);
            defaultNotificationIcon = getDefaultNotificationIcon();
        }
        Notification build = m.setCategory(NotificationCompat.CATEGORY_SERVICE).setSmallIcon(defaultNotificationIcon).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void prepareChannel(String id) {
        NotificationChannel notificationChannel;
        Object systemService = getSystemService(NotificationsService.NOTIFICATION_KEY);
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager == null) {
            return;
        }
        String obj = getApplicationInfo().loadLabel(getPackageManager()).toString();
        notificationChannel = notificationManager.getNotificationChannel(id);
        if (notificationChannel == null) {
            Util$$ExternalSyntheticApiModelOutline0.m$3();
            NotificationChannel m = ComponentDialog$$ExternalSyntheticApiModelOutline0.m(id, obj, 2);
            m.setDescription("Background location notification channel");
            notificationManager.createNotificationChannel(m);
        }
    }

    private final int getDefaultNotificationIcon() {
        Context context = this.mParentContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mParentContext");
            context = null;
        }
        Resources resources = context.getResources();
        Context context2 = this.mParentContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mParentContext");
            context2 = null;
        }
        Integer valueOf = Integer.valueOf(resources.getIdentifier("notification_icon", "drawable", context2.getPackageName()));
        Integer num = valueOf.intValue() != 0 ? valueOf : null;
        if (num != null) {
            return num.intValue();
        }
        return getApplicationInfo().icon;
    }

    private final Integer colorStringToInteger(String color) {
        try {
            return Integer.valueOf(Color.parseColor(color));
        } catch (Exception unused) {
            return null;
        }
    }
}
