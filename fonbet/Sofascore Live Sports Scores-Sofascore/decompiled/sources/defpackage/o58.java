package defpackage;

import android.app.Application;
import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o58 {
    public final r38 a;
    public final a9h b;

    public o58(r38 r38Var, a9h a9hVar, CoroutineContext coroutineContext, y8h y8hVar) {
        r38Var.getClass();
        a9hVar.getClass();
        coroutineContext.getClass();
        y8hVar.getClass();
        this.a = r38Var;
        this.b = a9hVar;
        r38Var.a();
        Context applicationContext = r38Var.a.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
            return;
        }
        ((Application) applicationContext).registerActivityLifecycleCallbacks(y8hVar);
        xw3.L(s9a.c(coroutineContext), null, null, new yp7(this, y8hVar, (rq3) null, 8), 3);
    }
}
