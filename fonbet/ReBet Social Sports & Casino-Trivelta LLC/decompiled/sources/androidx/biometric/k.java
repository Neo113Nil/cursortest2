package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class k {

    public static class a {
        public static KeyguardManager a(@NonNull Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        public static boolean b(@NonNull KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    public static KeyguardManager a(Context context) {
        return a.a(context);
    }

    public static boolean b(Context context) {
        KeyguardManager a10 = a(context);
        if (a10 == null) {
            return false;
        }
        return a.b(a10);
    }
}
