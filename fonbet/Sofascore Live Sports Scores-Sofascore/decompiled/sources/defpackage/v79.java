package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class v79 {
    public static final gc2 d;
    public static final gc2 e;
    public static final gc2 f;
    public static final gc2 g;
    public static final gc2 h;
    public static final gc2 i;
    public final gc2 a;
    public final gc2 b;
    public final int c;

    static {
        gc2 gc2Var = gc2.d;
        d = q1f.o(":");
        e = q1f.o(":status");
        f = q1f.o(":method");
        g = q1f.o(":path");
        h = q1f.o(":scheme");
        i = q1f.o(":authority");
    }

    public v79(gc2 gc2Var, gc2 gc2Var2) {
        gc2Var.getClass();
        gc2Var2.getClass();
        this.a = gc2Var;
        this.b = gc2Var2;
        this.c = gc2Var2.h() + gc2Var.h() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v79)) {
            return false;
        }
        v79 v79Var = (v79) obj;
        return Intrinsics.c(this.a, v79Var.a) && Intrinsics.c(this.b, v79Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.w() + ": " + this.b.w();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v79(String str, String str2) {
        this(q1f.o(str), q1f.o(str2));
        str.getClass();
        gc2 gc2Var = gc2.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v79(String str, gc2 gc2Var) {
        this(gc2Var, q1f.o(str));
        gc2Var.getClass();
        str.getClass();
        gc2 gc2Var2 = gc2.d;
    }
}
