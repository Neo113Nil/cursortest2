package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class x79 {
    public static final gc2 d;
    public static final gc2 e;
    public static final gc2 f;
    public static final gc2 g;
    public static final gc2 h;
    public final gc2 a;
    public final gc2 b;
    public final int c;

    static {
        gc2 gc2Var = gc2.d;
        d = q1f.o(":status");
        e = q1f.o(":method");
        f = q1f.o(":path");
        g = q1f.o(":scheme");
        h = q1f.o(":authority");
        q1f.o(":host");
        q1f.o(":version");
    }

    public x79(gc2 gc2Var, gc2 gc2Var2) {
        this.a = gc2Var;
        this.b = gc2Var2;
        this.c = gc2Var2.h() + gc2Var.h() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x79) {
            x79 x79Var = (x79) obj;
            if (this.a.equals(x79Var.a) && this.b.equals(x79Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        return lnb.o(this.a.w(), ": ", this.b.w());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x79(String str, String str2) {
        this(q1f.o(str), q1f.o(str2));
        gc2 gc2Var = gc2.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x79(String str, gc2 gc2Var) {
        this(gc2Var, q1f.o(str));
        gc2 gc2Var2 = gc2.d;
    }
}
