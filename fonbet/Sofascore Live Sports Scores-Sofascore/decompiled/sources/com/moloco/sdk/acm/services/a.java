package com.moloco.sdk.acm.services;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.internal.t;
import defpackage.hje;
import defpackage.ku3;
import defpackage.mqi;
import defpackage.rq4;
import defpackage.u6b;
import defpackage.xw3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a implements rq4 {
    public final t a;
    public final ku3 b;
    public final t c;

    public a(t tVar, ku3 ku3Var, t tVar2) {
        ku3Var.getClass();
        this.a = tVar;
        this.b = ku3Var;
        this.c = tVar2;
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        t tVar = this.c;
        if (!((PowerManager) ((mqi) tVar.c).getValue()).isInteractive()) {
            Context context = (Context) tVar.b;
            if (context.getPackageManager().checkPermission("android.permission.USE_FULL_SCREEN_INTENT", context.getPackageName()) == 0) {
                mqi mqiVar = c.a;
                c.b("ApplicationLifecycleObserver", "Application onStop - skipping upload (device not interactive)");
                return;
            }
        }
        mqi mqiVar2 = c.a;
        c.b("ApplicationLifecycleObserver", "Application onStop");
        xw3.L(this.b, null, null, new hje(this, null, 18), 3);
    }
}
