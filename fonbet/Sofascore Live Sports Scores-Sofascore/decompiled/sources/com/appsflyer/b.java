package com.appsflyer;

import android.content.SharedPreferences;
import com.facebook.appevents.u;
import com.facebook.i;
import com.facebook.internal.m;
import com.facebook.internal.p;
import com.facebook.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k;
import defpackage.cw3;
import defpackage.hje;
import defpackage.ku3;
import defpackage.rq3;
import defpackage.xw3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        rq3 rq3Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                AFLogger.AFKeystoreWrapper((a) obj);
                return;
            case 1:
                AFLogger.AFKeystoreWrapper((a) obj);
                return;
            case 2:
                AFLogger.AFKeystoreWrapper((a) obj);
                return;
            case 3:
                AFLogger.AFKeystoreWrapper((d) obj);
                return;
            case 4:
                AFLogger.AFKeystoreWrapper((f) obj);
                return;
            case 5:
                AFLogger.AFKeystoreWrapper((a) obj);
                return;
            case 6:
                ((i) obj).a();
                return;
            case 7:
                String str = (String) obj;
                if (cw3.a.contains(u.class)) {
                    return;
                }
                try {
                    str.getClass();
                    if (!u.c.get()) {
                        u.a.b();
                    }
                    SharedPreferences sharedPreferences = u.b;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.internalUserData", str).apply();
                        return;
                    } else {
                        Intrinsics.i("sharedPreferences");
                        throw null;
                    }
                } catch (Throwable th) {
                    cw3.a(u.class, th);
                    return;
                }
            case 8:
                m.g((m) obj);
                return;
            case 9:
                p pVar = (p) obj;
                pVar.a.d(q.b(pVar.b));
                return;
            case 10:
                com.moloco.sdk.acm.eventprocessing.f fVar = (com.moloco.sdk.acm.eventprocessing.f) obj;
                xw3.L((ku3) fVar.d, null, null, new hje(fVar, rq3Var, 17), 3);
                return;
            case 11:
                ((k) obj).destroy();
                return;
            case 12:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a.d((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a) obj);
                return;
        }
    }
}
