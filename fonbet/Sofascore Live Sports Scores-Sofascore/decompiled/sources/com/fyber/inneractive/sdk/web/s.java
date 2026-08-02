package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s implements Runnable {
    public final /* synthetic */ i0 a;

    public s(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i0 i0Var = this.a;
            if (i0Var.V != null) {
                IAlog.a("%sunregistering orientation broadcast receiver", IAlog.a(i0Var));
                this.a.V.a();
            }
        } catch (IllegalArgumentException e) {
            if (e.getMessage() != null && !e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        this.a.V = null;
    }
}
