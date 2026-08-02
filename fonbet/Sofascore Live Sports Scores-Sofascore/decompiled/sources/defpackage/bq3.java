package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class bq3 {
    public static final Logger a = Logger.getLogger(bq3.class.getName());
    public static final bq3 b = new bq3();

    public static bq3 b() {
        ((agj) zp3.a).getClass();
        bq3 bq3Var = (bq3) agj.b.get();
        bq3 bq3Var2 = b;
        if (bq3Var == null) {
            bq3Var = bq3Var2;
        }
        return bq3Var == null ? bq3Var2 : bq3Var;
    }

    public final bq3 a() {
        ((agj) zp3.a).getClass();
        ThreadLocal threadLocal = agj.b;
        bq3 bq3Var = (bq3) threadLocal.get();
        bq3 bq3Var2 = b;
        if (bq3Var == null) {
            bq3Var = bq3Var2;
        }
        threadLocal.set(this);
        return bq3Var == null ? bq3Var2 : bq3Var;
    }

    public final void c(bq3 bq3Var) {
        if (bq3Var == null) {
            yhk.s("toAttach");
            return;
        }
        agj agjVar = (agj) zp3.a;
        ThreadLocal threadLocal = agj.b;
        agjVar.getClass();
        bq3 bq3Var2 = (bq3) threadLocal.get();
        bq3 bq3Var3 = b;
        if (bq3Var2 == null) {
            bq3Var2 = bq3Var3;
        }
        if (bq3Var2 != this) {
            agj.a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (bq3Var != bq3Var3) {
            threadLocal.set(bq3Var);
        } else {
            threadLocal.set(null);
        }
    }
}
