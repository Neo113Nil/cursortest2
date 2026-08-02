package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s38 {
    public final nw3 a;

    public s38(nw3 nw3Var) {
        this.a = nw3Var;
    }

    public static s38 a() {
        s38 s38Var = (s38) r38.c().b(s38.class);
        if (s38Var != null) {
            return s38Var;
        }
        yhk.s("FirebaseCrashlytics component is not present.");
        return null;
    }

    public final void b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        nw3 nw3Var = this.a;
        ((xx3) nw3Var.o.b).h(new lw3(nw3Var, currentTimeMillis - nw3Var.d, str));
    }

    public final void c(Throwable th) {
        if (th == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        nw3 nw3Var = this.a;
        ((xx3) nw3Var.o.b).g(new mc3(nw3Var, th));
    }

    public final void d(boolean z) {
        nw3 nw3Var = this.a;
        Boolean valueOf = Boolean.valueOf(z);
        rd4 rd4Var = nw3Var.b;
        synchronized (rd4Var) {
            rd4Var.g = valueOf;
            SharedPreferences.Editor edit = ((SharedPreferences) rd4Var.b).edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", z);
            edit.apply();
            synchronized (rd4Var.d) {
                try {
                    boolean i = rd4Var.i();
                    boolean z2 = rd4Var.a;
                    if (i) {
                        if (!z2) {
                            ((TaskCompletionSource) rd4Var.e).trySetResult(null);
                            rd4Var.a = true;
                        }
                    } else if (z2) {
                        rd4Var.e = new TaskCompletionSource();
                        rd4Var.a = false;
                    }
                } finally {
                }
            }
        }
    }
}
