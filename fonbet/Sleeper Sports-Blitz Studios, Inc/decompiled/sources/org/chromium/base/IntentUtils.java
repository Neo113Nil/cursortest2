package org.chromium.base;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class IntentUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String ANDROID_APP_REFERRER_SCHEME = "android-app";
    private static final Object COMPONENT_NAME_LOCK = new Object();
    private static final String TAG = "IntentUtils";
    public static final String TRUSTED_APPLICATION_CODE_EXTRA = "trusted_application_code_extra";
    private static ComponentName sFakeComponentName;
    private static boolean sForceTrustedIntentForTesting;

    public static boolean safeHasExtra(Intent intent, String name) {
        try {
            return intent.hasExtra(name);
        } catch (Throwable unused) {
            Log.e(TAG, "hasExtra failed on intent " + String.valueOf(intent));
            return false;
        }
    }

    public static void safeRemoveExtra(Intent intent, String name) {
        try {
            intent.removeExtra(name);
        } catch (Throwable unused) {
            Log.e(TAG, "removeExtra failed on intent " + String.valueOf(intent));
        }
    }

    public static boolean safeGetBooleanExtra(Intent intent, String name, boolean defaultValue) {
        try {
            return intent.getBooleanExtra(name, defaultValue);
        } catch (Throwable unused) {
            Log.e(TAG, "getBooleanExtra failed on intent " + String.valueOf(intent));
            return defaultValue;
        }
    }

    public static boolean safeGetBoolean(Bundle bundle, String name, boolean defaultValue) {
        try {
            return bundle.getBoolean(name, defaultValue);
        } catch (Throwable unused) {
            Log.e(TAG, "getBoolean failed on bundle " + String.valueOf(bundle));
            return defaultValue;
        }
    }

    public static int safeGetIntExtra(Intent intent, String name, int defaultValue) {
        try {
            return intent.getIntExtra(name, defaultValue);
        } catch (Throwable unused) {
            Log.e(TAG, "getIntExtra failed on intent " + String.valueOf(intent));
            return defaultValue;
        }
    }

    public static int safeGetInt(Bundle bundle, String name, int defaultValue) {
        try {
            return bundle.getInt(name, defaultValue);
        } catch (Throwable unused) {
            Log.e(TAG, "getInt failed on bundle " + String.valueOf(bundle));
            return defaultValue;
        }
    }

    public static int[] safeGetIntArrayExtra(Intent intent, String name) {
        try {
            return intent.getIntArrayExtra(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getIntArrayExtra failed on intent " + String.valueOf(intent));
            return null;
        }
    }

    public static int[] safeGetIntArray(Bundle bundle, String name) {
        try {
            return bundle.getIntArray(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getIntArray failed on bundle " + String.valueOf(bundle));
            return null;
        }
    }

    public static float[] safeGetFloatArray(Bundle bundle, String name) {
        try {
            return bundle.getFloatArray(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getFloatArray failed on bundle " + String.valueOf(bundle));
            return null;
        }
    }

    public static long safeGetLongExtra(Intent intent, String name, long defaultValue) {
        try {
            return intent.getLongExtra(name, defaultValue);
        } catch (Throwable unused) {
            Log.e(TAG, "getLongExtra failed on intent " + String.valueOf(intent));
            return defaultValue;
        }
    }

    public static long safeGetLong(Bundle bundle, String name, long defaultValue) {
        try {
            return bundle.getLong(name, defaultValue);
        } catch (Throwable unused) {
            Log.e(TAG, "getLong failed on bundle " + String.valueOf(bundle));
            return defaultValue;
        }
    }

    public static String safeGetStringExtra(Intent intent, String name) {
        try {
            return intent.getStringExtra(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getStringExtra failed on intent " + String.valueOf(intent));
            return null;
        }
    }

    public static String safeGetString(Bundle bundle, String name) {
        try {
            return bundle.getString(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getString failed on bundle " + String.valueOf(bundle));
            return null;
        }
    }

    public static Bundle safeGetBundleExtra(Intent intent, String name) {
        try {
            return intent.getBundleExtra(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getBundleExtra failed on intent " + String.valueOf(intent));
            return null;
        }
    }

    public static Bundle safeGetBundle(Bundle bundle, String name) {
        try {
            return bundle.getBundle(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getBundle failed on bundle " + String.valueOf(bundle));
            return null;
        }
    }

    public static <T extends Parcelable> T safeGetParcelable(Bundle bundle, String str) {
        try {
            return (T) bundle.getParcelable(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getParcelable failed on bundle " + String.valueOf(bundle));
            return null;
        }
    }

    public static <T extends Parcelable> T safeGetParcelableExtra(Intent intent, String str) {
        try {
            return (T) intent.getParcelableExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getParcelableExtra failed on intent " + String.valueOf(intent));
            return null;
        }
    }

    public static <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(Intent intent, String name) {
        try {
            return intent.getParcelableArrayListExtra(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getParcelableArrayListExtra failed on intent " + String.valueOf(intent));
            return null;
        }
    }

    public static <T extends Parcelable> ArrayList<T> safeGetParcelableArrayList(Bundle bundle, String name) {
        try {
            return bundle.getParcelableArrayList(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getParcelableArrayList failed on bundle " + String.valueOf(bundle));
            return null;
        }
    }

    public static Parcelable[] safeGetParcelableArrayExtra(Intent intent, String name) {
        try {
            return intent.getParcelableArrayExtra(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getParcelableArrayExtra failed on intent " + String.valueOf(intent));
            return null;
        }
    }

    public static ArrayList<String> safeGetStringArrayListExtra(Intent intent, String name) {
        try {
            return intent.getStringArrayListExtra(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getStringArrayListExtra failed on intent " + String.valueOf(intent));
            return null;
        }
    }

    public static byte[] safeGetByteArrayExtra(Intent intent, String name) {
        try {
            return intent.getByteArrayExtra(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getByteArrayExtra failed on intent " + String.valueOf(intent));
            return null;
        }
    }

    public static <T extends Serializable> T safeGetSerializableExtra(Intent intent, String str) {
        try {
            return (T) intent.getSerializableExtra(str);
        } catch (ClassCastException e) {
            Log.e(TAG, "Invalide class for Serializable: " + str, (Throwable) e);
            return null;
        } catch (Throwable unused) {
            Log.e(TAG, "getSerializableExtra failed on intent " + String.valueOf(intent));
            return null;
        }
    }

    public static IBinder safeGetBinder(Bundle bundle, String name) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getBinder(name);
        } catch (Throwable unused) {
            Log.e(TAG, "getBinder failed on bundle " + String.valueOf(bundle));
            return null;
        }
    }

    public static IBinder safeGetBinderExtra(Intent intent, String name) {
        if (intent.hasExtra(name)) {
            return safeGetBinder(intent.getExtras(), name);
        }
        return null;
    }

    public static void safePutBinderExtra(Intent intent, String name, IBinder binder) {
        if (intent == null) {
            return;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putBinder(name, binder);
        } catch (Throwable unused) {
            Log.e(TAG, "putBinder failed on bundle " + String.valueOf(bundle));
        }
        intent.putExtras(bundle);
    }

    public static boolean safeStartActivity(Context context, Intent intent) {
        return safeStartActivity(context, intent, null);
    }

    public static boolean safeStartActivity(Context context, Intent intent, Bundle bundle) {
        try {
            context.startActivity(intent, bundle);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public static boolean isIntentForNewTaskOrNewDocument(Intent intent) {
        return (intent.getFlags() & 268959744) != 0;
    }

    public static int getParceledIntentSize(Intent intent) {
        Parcel obtain = Parcel.obtain();
        intent.writeToParcel(obtain, 0);
        return obtain.dataSize();
    }

    public static void logTransactionTooLargeOrRethrow(RuntimeException e, Intent intent) {
        if (e.getCause() instanceof TransactionTooLargeException) {
            Log.e(TAG, "Could not resolve Activity for intent " + intent.toString(), (Throwable) e);
            return;
        }
        throw e;
    }

    private static Intent logInvalidIntent(Intent intent, Exception e) {
        Log.e(TAG, "Invalid incoming intent.", (Throwable) e);
        return intent.replaceExtras((Bundle) null);
    }

    public static Intent sanitizeIntent(final Intent incomingIntent) {
        if (Build.VERSION.SDK_INT >= 33) {
            return incomingIntent;
        }
        if (incomingIntent == null) {
            return null;
        }
        try {
            incomingIntent.getBooleanExtra("TriggerUnparcel", false);
            return incomingIntent;
        } catch (BadParcelableException e) {
            return logInvalidIntent(incomingIntent, e);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof ClassNotFoundException) {
                return logInvalidIntent(incomingIntent, e2);
            }
            throw e2;
        }
    }

    public static boolean isMainIntentFromLauncher(Intent intent) {
        return intent != null && TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER") && (intent.getFlags() & 1048576) == 0;
    }

    public static int getPendingIntentMutabilityFlag(boolean mutable) {
        if (mutable) {
            return Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
        }
        return 67108864;
    }

    public static boolean intentTargetsSelf(Intent intent) {
        boolean isEmpty = TextUtils.isEmpty(intent.getPackage());
        String hostPackageName = ApkInfo.getHostPackageName();
        boolean z = !isEmpty && hostPackageName.equals(intent.getPackage());
        ComponentName component = intent.getComponent();
        if (component == null || !hostPackageName.equals(component.getPackageName())) {
            return z;
        }
        if (isEmpty) {
            return true;
        }
        return z;
    }

    private static ComponentName getFakeComponentName(String packageName) {
        synchronized (COMPONENT_NAME_LOCK) {
            if (sFakeComponentName == null) {
                sFakeComponentName = new ComponentName(packageName, "FakeClass");
            }
        }
        return sFakeComponentName;
    }

    private static PendingIntent getAuthenticationToken() {
        Intent intent = new Intent();
        Context applicationContext = ContextUtils.getApplicationContext();
        intent.setComponent(getFakeComponentName(applicationContext.getPackageName()));
        return PendingIntent.getActivity(applicationContext, 0, intent, getPendingIntentMutabilityFlag(false));
    }

    public static void addTrustedIntentExtras(Intent intent) {
        if (intentTargetsSelf(intent)) {
            intent.putExtra(TRUSTED_APPLICATION_CODE_EXTRA, getAuthenticationToken());
        }
    }

    public static boolean isTrustedIntentFromSelf(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (sForceTrustedIntentForTesting) {
            return true;
        }
        PendingIntent pendingIntent = (PendingIntent) safeGetParcelableExtra(intent, TRUSTED_APPLICATION_CODE_EXTRA);
        if (pendingIntent == null) {
            return false;
        }
        return getAuthenticationToken().equals(pendingIntent);
    }

    public static void setForceIsTrustedIntentForTesting(boolean isTrusted) {
        sForceTrustedIntentForTesting = isTrusted;
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.IntentUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IntentUtils.sForceTrustedIntentForTesting = false;
            }
        });
    }
}
