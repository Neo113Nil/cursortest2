package r3;

import android.content.Context;
import i3.AbstractC4521b;
import o3.C5803h;

/* renamed from: r3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6204d {
    public static void a(Context context) {
        c(context, "context");
        if (context.getPackageManager().checkPermission("android.permission.INTERNET", context.getPackageName()) == -1) {
            throw new IllegalStateException("Paystack requires internet permission. Please add the intenet permission to your AndroidManifest.xml");
        }
    }

    public static String b() {
        String b10 = AbstractC4521b.b();
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException("No Public key found, please set the Public key.");
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + str + "' cannot be null");
    }

    public static void d() {
        if (!AbstractC4521b.e()) {
            throw new C5803h("Paystack SDK has not been initialized.The SDK has to be initialized before use");
        }
    }
}
