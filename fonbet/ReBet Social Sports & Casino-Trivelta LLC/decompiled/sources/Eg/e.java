package Eg;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.twilio.voice.EventGroupType;
import java.util.ArrayList;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static int f3099b;

    /* renamed from: a, reason: collision with root package name */
    public static final e f3098a = new e();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f3100c = MapsKt.mapOf(TuplesKt.to("android.permission.ACCEPT_HANDOVER", 28), TuplesKt.to("android.permission.ACCESS_BACKGROUND_LOCATION", 29), TuplesKt.to("android.permission.ACCESS_MEDIA_LOCATION", 29), TuplesKt.to("android.permission.ACTIVITY_RECOGNITION", 29), TuplesKt.to("android.permission.ANSWER_PHONE_CALLS", 26), TuplesKt.to("android.permission.BLUETOOTH_ADVERTISE", 31), TuplesKt.to("android.permission.BLUETOOTH_CONNECT", 31), TuplesKt.to("android.permission.BLUETOOTH_SCAN", 31), TuplesKt.to("android.permission.BODY_SENSORS_BACKGROUND", 33), TuplesKt.to("android.permission.NEARBY_WIFI_DEVICES", 33), TuplesKt.to("android.permission.READ_MEDIA_AUDIO", 33), TuplesKt.to("android.permission.READ_MEDIA_IMAGES", 33), TuplesKt.to("android.permission.READ_MEDIA_VIDEO", 33), TuplesKt.to("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", 34), TuplesKt.to("android.permission.READ_PHONE_NUMBERS", 26), TuplesKt.to("android.permission.UWB_RANGING", 31));

    public static final void o(Promise promise, String str, Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        Object obj2 = args[1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
        PermissionAwareActivity permissionAwareActivity = (PermissionAwareActivity) obj2;
        Integer orNull = ArraysKt.getOrNull((int[]) obj, 0);
        promise.resolve((orNull != null && orNull.intValue() == 0) ? "granted" : permissionAwareActivity.shouldShowRequestPermissionRationale(str) ? "denied" : "blocked");
    }

    public static final void r(ArrayList arrayList, Promise promise, WritableMap writableMap, Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        int i10 = 0;
        Object obj = args[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        Object obj2 = args[1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
        PermissionAwareActivity permissionAwareActivity = (PermissionAwareActivity) obj2;
        for (Object obj3 : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj3;
            Integer orNull = ArraysKt.getOrNull(iArr, i10);
            writableMap.putString(str, (orNull != null && orNull.intValue() == 0) ? "granted" : permissionAwareActivity.shouldShowRequestPermissionRationale(str) ? "denied" : "blocked");
            i10 = i11;
        }
        promise.resolve(writableMap);
    }

    public final void c(ReactApplicationContext reactContext, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT < 31) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        Object systemService = reactContext.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        promise.resolve(Boolean.valueOf(alarmManager != null ? alarmManager.canScheduleExactAlarms() : false));
    }

    public final void d(ReactApplicationContext reactContext, Promise promise) {
        boolean canUseFullScreenIntent;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT < 34) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        Object systemService = reactContext.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        canUseFullScreenIntent = ((NotificationManager) systemService).canUseFullScreenIntent();
        promise.resolve(Boolean.valueOf(canUseFullScreenIntent));
    }

    public final void e(ReactApplicationContext reactContext, String permission, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (!j(permission)) {
            promise.resolve("unavailable");
        } else if (reactContext.getBaseContext().checkSelfPermission(permission) == 0) {
            promise.resolve("granted");
        } else {
            promise.resolve("denied");
        }
    }

    public final void f(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.reject("Permissions:checkLocationAccuracy", "checkLocationAccuracy is not supported on Android");
    }

    public final void g(ReactApplicationContext reactContext, ReadableArray permissions, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(promise, "promise");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Context baseContext = reactContext.getBaseContext();
        int size = permissions.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = permissions.getString(i10);
            if (string != null && !StringsKt.isBlank(string)) {
                writableNativeMap.putString(string, !j(string) ? "unavailable" : baseContext.checkSelfPermission(string) == 0 ? "granted" : "denied");
            }
        }
        promise.resolve(writableNativeMap);
    }

    public final void h(ReactApplicationContext reactContext, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        boolean areNotificationsEnabled = NotificationManagerCompat.from(reactContext).areNotificationsEnabled();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("status", areNotificationsEnabled ? "granted" : "denied");
        createMap.putMap(EventGroupType.SETTINGS_GROUP, Arguments.createMap());
        promise.resolve(createMap);
    }

    public final PermissionAwareActivity i(ReactApplicationContext reactApplicationContext) {
        ComponentCallbacks2 currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    public final boolean j(String str) {
        if (StringsKt.startsWith$default(str, "android.", false, 2, (Object) null) || StringsKt.startsWith$default(str, "com.android", false, 2, (Object) null)) {
            int i10 = Build.VERSION.SDK_INT;
            Integer num = (Integer) f3100c.get(str);
            if (i10 >= (num != null ? num.intValue() : 1)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(ReactApplicationContext reactContext, SparseArray callbacks, int i10, int[] grantResults) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        try {
            Callback callback = (Callback) callbacks.get(i10);
            if (callback != null) {
                callback.invoke(grantResults, i(reactContext));
                callbacks.remove(i10);
            } else {
                E6.a.M("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(i10));
            }
            return callbacks.size() == 0;
        } catch (IllegalStateException e10) {
            E6.a.p("PermissionsModule", e10, "Unexpected invocation of `onRequestPermissionsResult`", new Object[0]);
            return false;
        }
    }

    public final void l(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.reject("Permissions:openPhotoPicker", "openPhotoPicker is not supported on Android");
    }

    public final void m(ReactApplicationContext reactContext, String str, Promise promise) {
        Intent intent;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            String packageName = reactContext.getPackageName();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && Intrinsics.areEqual(str, "alarms")) {
                intent = new Intent();
                intent.setAction("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse("package:" + packageName));
            } else if (i10 >= 34 && Intrinsics.areEqual(str, "fullscreen")) {
                intent = new Intent();
                intent.setAction("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + packageName));
            } else if (i10 < 26 || !Intrinsics.areEqual(str, "notifications")) {
                intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + packageName));
            } else {
                intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
            }
            intent.addFlags(268435456);
            reactContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }

    public final void n(ReactApplicationContext reactContext, PermissionListener listener, SparseArray callbacks, final String permission, final Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (!j(permission)) {
            promise.resolve("unavailable");
            return;
        }
        if (reactContext.getBaseContext().checkSelfPermission(permission) == 0) {
            promise.resolve("granted");
            return;
        }
        try {
            PermissionAwareActivity i10 = i(reactContext);
            callbacks.put(f3099b, new Callback() { // from class: Eg.c
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    e.o(Promise.this, permission, objArr);
                }
            });
            i10.requestPermissions(new String[]{permission}, f3099b, listener);
            f3099b++;
        } catch (IllegalStateException e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }

    public final void p(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.reject("Permissions:requestLocationAccuracy", "requestLocationAccuracy is not supported on Android");
    }

    public final void q(ReactApplicationContext reactContext, PermissionListener listener, SparseArray callbacks, ReadableArray permissions, final Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(promise, "promise");
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        final ArrayList arrayList = new ArrayList();
        Context baseContext = reactContext.getBaseContext();
        int size = permissions.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            String string = permissions.getString(i11);
            if (string != null && !StringsKt.isBlank(string)) {
                if (!j(string)) {
                    writableNativeMap.putString(string, "unavailable");
                } else if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, "granted");
                } else {
                    arrayList.add(string);
                }
                i10++;
            }
        }
        if (permissions.size() == i10) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            PermissionAwareActivity i12 = i(reactContext);
            callbacks.put(f3099b, new Callback() { // from class: Eg.d
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    e.r(arrayList, promise, writableNativeMap, objArr);
                }
            });
            i12.requestPermissions((String[]) arrayList.toArray(new String[0]), f3099b, listener);
            f3099b++;
        } catch (IllegalStateException e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }

    public final void s(ReactApplicationContext reactContext, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        boolean areNotificationsEnabled = NotificationManagerCompat.from(reactContext).areNotificationsEnabled();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("status", areNotificationsEnabled ? "granted" : "blocked");
        createMap.putMap(EventGroupType.SETTINGS_GROUP, Arguments.createMap());
        promise.resolve(createMap);
    }

    public final void t(ReactApplicationContext reactContext, String permission, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Boolean.valueOf(i(reactContext).shouldShowRequestPermissionRationale(permission)));
        } catch (IllegalStateException e10) {
            promise.reject("E_INVALID_ACTIVITY", e10);
        }
    }
}
