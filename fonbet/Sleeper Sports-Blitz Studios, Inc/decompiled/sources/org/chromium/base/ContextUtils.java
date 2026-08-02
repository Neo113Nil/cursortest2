package org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.preference.PreferenceManager;
import internal.org.chromium.build.BuildConfig;
import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class ContextUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ContextUtils";
    private static Context sApplicationContext;

    /* JADX INFO: Access modifiers changed from: private */
    static class Holder {
        private static SharedPreferences sSharedPreferences = ContextUtils.fetchAppSharedPreferences();

        private Holder() {
        }
    }

    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    public static void initApplicationContext(Context appContext) {
        initJavaSideApplicationContext(appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SharedPreferences fetchAppSharedPreferences() {
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
            return defaultSharedPreferences;
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static SharedPreferences getAppSharedPreferences() {
        return Holder.sSharedPreferences;
    }

    public static void initApplicationContextForTests(Context appContext) {
        final Context context = sApplicationContext;
        initJavaSideApplicationContext(appContext);
        final SharedPreferences sharedPreferences = Holder.sSharedPreferences;
        Holder.sSharedPreferences = fetchAppSharedPreferences();
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.ContextUtils$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ContextUtils.lambda$initApplicationContextForTests$0(context, sharedPreferences);
            }
        });
    }

    static /* synthetic */ void lambda$initApplicationContextForTests$0(Context context, SharedPreferences sharedPreferences) {
        sApplicationContext = context;
        Holder.sSharedPreferences = sharedPreferences;
    }

    private static void initJavaSideApplicationContext(Context appContext) {
        if (BuildConfig.ENABLE_ASSERTS && (appContext instanceof Application)) {
            appContext = new ContextWrapper(appContext);
        }
        sApplicationContext = appContext;
    }

    public static boolean isIsolatedProcess() {
        boolean isIsolated;
        isIsolated = Process.isIsolated();
        return isIsolated;
    }

    public static boolean isSdkSandboxProcess() {
        boolean isSdkSandbox;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        isSdkSandbox = Process.isSdkSandbox();
        return isSdkSandbox;
    }

    public static String getProcessName() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getMethod("currentProcessName", null).invoke(null, null);
        } catch (Exception e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    public static boolean isProcess64Bit() {
        return Process.is64Bit();
    }

    public static Activity activityFromContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Intent registerProtectedBroadcastReceiver(Context context, BroadcastReceiver receiver, IntentFilter filter) {
        return registerBroadcastReceiver(context, receiver, filter, null, null, 0);
    }

    public static Intent registerProtectedBroadcastReceiver(Context context, BroadcastReceiver receiver, IntentFilter filter, Handler scheduler) {
        return registerBroadcastReceiver(context, receiver, filter, null, scheduler, 0);
    }

    public static Intent registerExportedBroadcastReceiver(Context context, BroadcastReceiver receiver, IntentFilter filter, String permission) {
        return registerBroadcastReceiver(context, receiver, filter, permission, null, 2);
    }

    public static Intent registerNonExportedBroadcastReceiver(Context context, BroadcastReceiver receiver, IntentFilter filter) {
        return registerBroadcastReceiver(context, receiver, filter, null, null, 4);
    }

    public static Intent registerNonExportedBroadcastReceiver(Context context, BroadcastReceiver receiver, IntentFilter filter, Handler scheduler) {
        return registerBroadcastReceiver(context, receiver, filter, null, scheduler, 4);
    }

    private static Intent registerBroadcastReceiver(Context context, BroadcastReceiver receiver, IntentFilter filter, String permission, Handler scheduler, int flags) {
        Intent registerReceiver;
        if (Build.VERSION.SDK_INT >= 26) {
            registerReceiver = context.registerReceiver(receiver, filter, permission, scheduler, flags);
            return registerReceiver;
        }
        return context.registerReceiver(receiver, filter, permission, scheduler);
    }
}
