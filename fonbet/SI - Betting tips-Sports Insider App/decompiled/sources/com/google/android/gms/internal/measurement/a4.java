package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f4908a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f4909b = !a();

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(Context context) {
        boolean z5;
        if (f4909b) {
            return true;
        }
        synchronized (a4.class) {
            try {
                if (f4909b) {
                    return true;
                }
                int i5 = 1;
                while (true) {
                    z5 = false;
                    if (i5 > 2) {
                        break;
                    }
                    if (f4908a == null) {
                        f4908a = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = f4908a;
                    if (userManager == null) {
                        z5 = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e7) {
                        io.sentry.android.core.w0.n("DirectBootUtils", "Failed to check if user is unlocked.", e7);
                        f4908a = null;
                        i5++;
                    }
                }
                if (z5) {
                    f4908a = null;
                }
                if (z5) {
                    f4909b = true;
                }
                return z5;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
