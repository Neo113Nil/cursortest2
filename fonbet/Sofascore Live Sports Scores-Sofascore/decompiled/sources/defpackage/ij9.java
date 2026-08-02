package defpackage;

import com.ironsource.C4094gc;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ij9 {
    public static final ij9 b;
    public static final ij9 c;
    public static final ij9 d;
    public static final ij9 e;
    public static final List f;
    public final String a;

    static {
        ij9 ij9Var = new ij9(C4094gc.a);
        b = ij9Var;
        ij9 ij9Var2 = new ij9(C4094gc.b);
        c = ij9Var2;
        ij9 ij9Var3 = new ij9("PUT");
        ij9 ij9Var4 = new ij9("PATCH");
        ij9 ij9Var5 = new ij9("DELETE");
        ij9 ij9Var6 = new ij9("HEAD");
        d = ij9Var6;
        ij9 ij9Var7 = new ij9("OPTIONS");
        e = ij9Var7;
        f = b.j(ij9Var, ij9Var2, ij9Var3, ij9Var4, ij9Var5, ij9Var6, ij9Var7);
    }

    public ij9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij9) && this.a.equals(((ij9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
