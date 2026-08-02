package f3;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public class q extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f46382a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static String f46383b;

    /* renamed from: c, reason: collision with root package name */
    public static q f46384c;

    /* renamed from: d, reason: collision with root package name */
    public static Promise f46385d;

    public static void a(String str) {
        Promise promise = f46385d;
        if (promise != null) {
            promise.reject(str);
        }
        f46385d = null;
    }

    public static void b(Object obj) {
        Promise promise = f46385d;
        if (promise != null) {
            promise.resolve(obj);
        }
        f46385d = null;
    }

    public static IntentSender c(ReactContext reactContext) {
        synchronized (f46382a) {
            try {
                if (f46383b == null) {
                    f46383b = reactContext.getPackageName() + "/" + q.class.getName() + "_ACTION";
                }
                Context applicationContext = reactContext.getApplicationContext();
                q qVar = f46384c;
                if (qVar != null) {
                    applicationContext.unregisterReceiver(qVar);
                }
                f46384c = new q();
                if (Build.VERSION.SDK_INT < 34 || applicationContext.getApplicationInfo().targetSdkVersion < 34) {
                    applicationContext.registerReceiver(f46384c, new IntentFilter(f46383b));
                } else {
                    applicationContext.registerReceiver(f46384c, new IntentFilter(f46383b), 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intent intent = new Intent(f46383b);
        intent.setPackage(reactContext.getPackageName());
        intent.setClass(reactContext.getApplicationContext(), q.class);
        intent.putExtra("receiver_token", f46384c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, 1409286144).getIntentSender();
    }

    public static boolean d() {
        return true;
    }

    public static void e(Promise promise) {
        f46385d = promise;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (f46382a) {
            try {
                if (f46384c != this) {
                    return;
                }
                context.getApplicationContext().unregisterReceiver(f46384c);
                f46384c = null;
                if (intent.hasExtra("receiver_token") && intent.getIntExtra("receiver_token", 0) == hashCode()) {
                    ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("success", true);
                    if (componentName != null) {
                        createMap.putString("message", componentName.flattenToString());
                    } else {
                        createMap.putString("message", "OK");
                    }
                    b(createMap);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
