package defpackage;

import com.ironsource.U3;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jh2 {
    public static final jh2 h;
    public final hl4 a;
    public final Executor b;
    public final Object[][] c;
    public final List d;
    public final Boolean e;
    public final Integer f;
    public final Integer g;

    static {
        nc3 nc3Var = new nc3();
        nc3Var.c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        nc3Var.d = Collections.EMPTY_LIST;
        h = new jh2(nc3Var);
    }

    public jh2(nc3 nc3Var) {
        this.a = (hl4) nc3Var.a;
        this.b = (Executor) nc3Var.b;
        this.c = (Object[][]) nc3Var.c;
        this.d = (List) nc3Var.d;
        this.e = (Boolean) nc3Var.e;
        this.f = (Integer) nc3Var.f;
        this.g = (Integer) nc3Var.g;
    }

    public static nc3 b(jh2 jh2Var) {
        nc3 nc3Var = new nc3();
        nc3Var.a = jh2Var.a;
        nc3Var.b = jh2Var.b;
        nc3Var.c = jh2Var.c;
        nc3Var.d = jh2Var.d;
        nc3Var.e = jh2Var.e;
        nc3Var.f = jh2Var.f;
        nc3Var.g = jh2Var.g;
        return nc3Var;
    }

    public final Object a(ih2 ih2Var) {
        z1a.y(ih2Var, U3.i.W);
        int i = 0;
        while (true) {
            Object[][] objArr = this.c;
            if (i >= objArr.length) {
                return null;
            }
            Object[] objArr2 = objArr[i];
            if (ih2Var == objArr2[0]) {
                return objArr2[1];
            }
            i++;
        }
    }

    public final jh2 c(ih2 ih2Var, Object obj) {
        Object[][] objArr;
        z1a.y(ih2Var, U3.i.W);
        nc3 b = b(this);
        int i = 0;
        while (true) {
            objArr = this.c;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (ih2Var == objArr[i][0]) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i == -1 ? 1 : 0), 2);
        b.c = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        Object[][] objArr3 = (Object[][]) b.c;
        if (i == -1) {
            objArr3[objArr.length] = new Object[]{ih2Var, obj};
        } else {
            objArr3[i] = new Object[]{ih2Var, obj};
        }
        return new jh2(b);
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, "deadline");
        I.e(null, "authority");
        I.e(null, "callCredentials");
        Executor executor = this.b;
        I.e(executor != null ? executor.getClass() : null, "executor");
        I.e(null, "compressorName");
        I.e(Arrays.deepToString(this.c), "customOptions");
        I.d("waitForReady", Boolean.TRUE.equals(this.e));
        I.e(this.f, "maxInboundMessageSize");
        I.e(this.g, "maxOutboundMessageSize");
        I.e(this.d, "streamTracerFactories");
        return I.toString();
    }
}
