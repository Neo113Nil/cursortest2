package ac;

import android.util.Log;

/* renamed from: ac.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1930a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f15121a = false;

    public static synchronized void a() {
        synchronized (AbstractC1930a.class) {
            if (f15121a) {
                return;
            }
            try {
                Log.i("NitroModules", "Loading NitroModules C++ library...");
                System.loadLibrary("NitroModules");
                Log.i("NitroModules", "Successfully loaded NitroModules C++ library!");
                f15121a = true;
            } finally {
            }
        }
    }
}
