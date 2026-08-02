package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r implements Runnable {
    public final /* synthetic */ i0 a;

    public r(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var = this.a;
        if (i0Var.V == null) {
            try {
                IAlog.a("%sregistering orientation broadcast receiver", IAlog.a(i0Var));
                this.a.V = new e0(this.a);
                if (com.fyber.inneractive.sdk.util.o.a(this.a.b) != null) {
                    i0 i0Var2 = this.a;
                    e0 e0Var = i0Var2.V;
                    Context a = com.fyber.inneractive.sdk.util.o.a(i0Var2.b);
                    i0 i0Var3 = e0Var.c;
                    i0Var3.getClass();
                    IAlog.a("%sregister screen broadcast receiver", IAlog.a(i0Var3));
                    e0Var.a = a;
                    a.registerReceiver(e0Var, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e) {
                i0 i0Var4 = this.a;
                i0Var4.getClass();
                IAlog.f("%sfailed registering orientation broadcast recevier", IAlog.a(i0Var4));
                if (IAlog.a >= 3) {
                    e.printStackTrace();
                }
            }
        }
    }
}
