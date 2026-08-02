package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b0 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public boolean b;
    public Context c;
    public y d;

    public static void a(b0 b0Var, Context context, Intent intent) {
        boolean z;
        synchronized (b0Var) {
            try {
                z = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.a("%sFailed to get lock screen status", IAlog.a(b0Var));
                z = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var.b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !z) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var.b = false;
            }
            IAlog.a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.a(b0Var), Boolean.valueOf(b0Var.b), Integer.valueOf(b0Var.a.size()));
            Iterator it = b0Var.a.iterator();
            while (it.hasNext()) {
                a0 a0Var = (a0) it.next();
                boolean z2 = b0Var.b;
                com.fyber.inneractive.sdk.renderers.n nVar = (com.fyber.inneractive.sdk.renderers.n) a0Var;
                nVar.getClass();
                IAlog.a("%sgot onLockScreenStateChanged with: %s", IAlog.a(nVar), Boolean.valueOf(z2));
                if (z2) {
                    nVar.d(false);
                    com.fyber.inneractive.sdk.renderers.d dVar = nVar.y;
                    if (dVar != null && dVar.g) {
                        dVar.g = false;
                        r.b.removeCallbacks(dVar.j);
                    }
                } else {
                    nVar.N();
                    com.fyber.inneractive.sdk.renderers.d dVar2 = nVar.y;
                    if (dVar2 != null && !dVar2.h && !dVar2.g && dVar2.f != 0) {
                        dVar2.f = 0L;
                        dVar2.g = true;
                        dVar2.a();
                    }
                }
            }
        }
    }
}
