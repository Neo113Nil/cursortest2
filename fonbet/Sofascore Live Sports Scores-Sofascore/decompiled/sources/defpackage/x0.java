package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class x0 extends Application {
    public final ad2 a;

    public x0() {
        hs4 hs4Var = z45.a;
        this.a = s9a.c(rob.a.plus(tz9.o()));
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        if (rxc.b) {
            return;
        }
        try {
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException unused) {
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                return;
            }
            rxc.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
        } catch (Exception e) {
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    public final void b(CoroutineContext coroutineContext, Function2 function2) {
        coroutineContext.getClass();
        xw3.L(this.a, coroutineContext, null, new l0(function2, this, null, 2), 2);
    }
}
