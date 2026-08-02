package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nuj {
    public final Context a;
    public final um3 b;
    public final rt1 c;
    public final dbd d;
    public final um3 e;

    public nuj(Context context, zbl zblVar) {
        dbd dbdVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        rt1 rt1Var = new rt1(applicationContext, zblVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        rt1 rt1Var2 = new rt1(applicationContext2, zblVar, 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            int i = cbd.a;
            dbdVar = new dbd(applicationContext3, zblVar);
        } else {
            dbdVar = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        rt1 rt1Var3 = new rt1(applicationContext4, zblVar, 2);
        context.getClass();
        this.a = context;
        this.b = rt1Var;
        this.c = rt1Var2;
        this.d = dbdVar;
        this.e = rt1Var3;
    }
}
