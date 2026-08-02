package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y48 {
    public static final l10 d = l10.c();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final oi3 b;
    public Boolean c;

    public y48(r38 r38Var, vff vffVar, l48 l48Var, vff vffVar2, RemoteConfigManager remoteConfigManager, oi3 oi3Var, SessionManager sessionManager) {
        Bundle bundle = null;
        this.c = null;
        if (r38Var == null) {
            this.c = Boolean.FALSE;
            this.b = oi3Var;
            new tu9(new Bundle());
            return;
        }
        s48 s48Var = r38Var.c;
        fyj fyjVar = fyj.s;
        fyjVar.d = r38Var;
        r38Var.a();
        fyjVar.p = s48Var.h;
        fyjVar.f = l48Var;
        fyjVar.g = vffVar2;
        fyjVar.i.execute(new eyj(fyjVar, 1));
        r38Var.a();
        Context context = r38Var.a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            e.getMessage();
        }
        tu9 tu9Var = bundle != null ? new tu9(bundle) : new tu9();
        remoteConfigManager.setFirebaseRemoteConfigProvider(vffVar);
        this.b = oi3Var;
        oi3Var.b = tu9Var;
        oi3.d.a = b0a.K(context);
        oi3Var.c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean g = oi3Var.g();
        this.c = g;
        if (d.a) {
            if (g != null ? g.booleanValue() : r38.c().g()) {
                r38Var.a();
                "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(oyn.G(s48Var.h, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
            }
        }
    }

    public static y48 a() {
        return (y48) r38.c().b(y48.class);
    }

    public final void b(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        synchronized (this) {
            try {
                r38.c();
                if (this.b.f().booleanValue()) {
                    d.getClass();
                    return;
                }
                oi3 oi3Var = this.b;
                if (!oi3Var.f().booleanValue()) {
                    vi3.Q().getClass();
                    oi3Var.c.g("isEnabled", Boolean.TRUE.equals(valueOf));
                }
                this.c = valueOf;
                if (Boolean.TRUE.equals(valueOf)) {
                    d.getClass();
                } else if (Boolean.FALSE.equals(this.c)) {
                    d.getClass();
                }
            } catch (IllegalStateException unused) {
            }
        }
    }
}
