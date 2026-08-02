package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import defpackage.f35;
import defpackage.g4;
import defpackage.muo;
import defpackage.n2;
import defpackage.u1k;
import defpackage.v1k;
import defpackage.wuo;
import defpackage.z9h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzky {
    public static UserManager a = null;
    public static volatile boolean b = false;

    private zzky() {
    }

    public static g4 a(Context context, Callable callable, Executor executor) {
        muo muoVar = new muo(callable, 1);
        if (b(context)) {
            v1k v1kVar = new v1k();
            v1kVar.i = new u1k(v1kVar, muoVar);
            executor.execute(v1kVar);
            return v1kVar;
        }
        z9h z9hVar = new z9h();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        wuo wuoVar = new wuo(atomicBoolean, context, z9hVar, muoVar, executor);
        context.registerReceiver(wuoVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!b(context) || !atomicBoolean.compareAndSet(false, true)) {
            z9hVar.addListener(new n2(12, z9hVar, atomicBoolean, context, wuoVar, false), f35.a);
            return z9hVar;
        }
        try {
            context.unregisterReceiver(wuoVar);
        } catch (IllegalArgumentException unused) {
        }
        v1k v1kVar2 = new v1k();
        v1kVar2.i = new u1k(v1kVar2, muoVar);
        executor.execute(v1kVar2);
        z9hVar.n(v1kVar2);
        return z9hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(Context context) {
        boolean z;
        if (b) {
            return true;
        }
        synchronized (zzky.class) {
            try {
                if (b) {
                    return true;
                }
                int i = 1;
                while (true) {
                    z = false;
                    if (i > 2) {
                        break;
                    }
                    UserManager userManager = a;
                    if (userManager == null) {
                        userManager = (UserManager) context.getSystemService(UserManager.class);
                        a = userManager;
                    }
                    if (userManager == null) {
                        z = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException unused) {
                        a = null;
                        i++;
                    }
                }
                if (z) {
                    a = null;
                }
                if (z) {
                    b = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
