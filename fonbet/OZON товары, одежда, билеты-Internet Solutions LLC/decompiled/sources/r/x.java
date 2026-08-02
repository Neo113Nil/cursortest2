package r;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class x {

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        static KeyguardManager a(@NonNull Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        static boolean b(@NonNull KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    static KeyguardManager a(@NonNull Context context) {
        return a.a(context);
    }

    static boolean b(@NonNull Context context) {
        KeyguardManager a11 = a.a(context);
        if (a11 == null) {
            return false;
        }
        return a.b(a11);
    }
}
