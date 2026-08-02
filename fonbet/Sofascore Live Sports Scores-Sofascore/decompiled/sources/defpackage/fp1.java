package defpackage;

import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class fp1 {
    public static final ff5 a = new ff5(1, new vn1(1));
    public static Boolean b;

    public static final void a(q80 q80Var, dfj dfjVar, sf8 sf8Var, List list, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        Executor executor = (Executor) av8Var.k(a);
        if (executor == null || !b(q80Var.b.length())) {
            av8Var.d0(-517090505);
            av8Var.s(false);
        } else {
            av8Var.d0(-518737659);
            try {
                executor.execute(new ep1(dfjVar, (ema) av8Var.k(dh3.n), list, q80Var, (kx4) av8Var.k(dh3.h), sf8Var, 0));
            } catch (RejectedExecutionException unused) {
            }
            av8Var.s(false);
        }
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean bool = b;
            if (bool == null) {
                bool = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = bool;
            }
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
