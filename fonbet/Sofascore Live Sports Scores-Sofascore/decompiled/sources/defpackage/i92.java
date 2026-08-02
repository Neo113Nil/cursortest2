package defpackage;

import android.content.Context;
import com.appsflyer.internal.i;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i92 {
    public final Context a;
    public final c92 b;
    public final String c;

    public i92(Context context, c92 c92Var) {
        c92Var.getClass();
        this.a = context;
        this.b = c92Var;
        String c = dv3.c();
        Locale locale = Locale.US;
        this.c = i.k(locale, c, locale);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, sq3 sq3Var) {
        g92 g92Var;
        Object obj;
        lu3 lu3Var;
        int i;
        wf2 wf2Var;
        if (sq3Var instanceof g92) {
            g92Var = (g92) sq3Var;
            int i2 = g92Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g92Var.v = i2 - Integer.MIN_VALUE;
                obj = g92Var.t;
                lu3Var = lu3.a;
                i = g92Var.v;
                c92 c92Var = this.b;
                int i3 = 1;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    g92Var.r = z;
                    g92Var.v = 1;
                    c92Var.getClass();
                    obj = yaa.P(new cl(c92Var, this.c, rq3Var, 5), g92Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = g92Var.r;
                        wf2Var = g92Var.s;
                        y6a.M(obj);
                        return new yf4(wf2Var, new wf2(obj, 6), new h92(this, z, null), i3);
                    }
                    z = g92Var.r;
                    y6a.M(obj);
                }
                wf2 wf2Var2 = new wf2(obj, 6);
                g92Var.s = wf2Var2;
                g92Var.r = z;
                g92Var.v = 2;
                c92Var.getClass();
                obj = yaa.P(new r3(c92Var, rq3Var, 3), g92Var);
                if (obj != lu3Var) {
                    wf2Var = wf2Var2;
                    return new yf4(wf2Var, new wf2(obj, 6), new h92(this, z, null), i3);
                }
                return lu3Var;
            }
        }
        g92Var = new g92(this, sq3Var);
        obj = g92Var.t;
        lu3Var = lu3.a;
        i = g92Var.v;
        c92 c92Var2 = this.b;
        int i32 = 1;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        wf2 wf2Var22 = new wf2(obj, 6);
        g92Var.s = wf2Var22;
        g92Var.r = z;
        g92Var.v = 2;
        c92Var2.getClass();
        obj = yaa.P(new r3(c92Var2, rq3Var2, 3), g92Var);
        if (obj != lu3Var) {
        }
        return lu3Var;
    }
}
