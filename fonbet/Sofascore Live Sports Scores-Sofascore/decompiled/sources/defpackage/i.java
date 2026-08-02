package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class i {
    public static final gc2 a;
    public static final gc2 b;
    public static final gc2 c;
    public static final gc2 d;
    public static final gc2 e;

    static {
        gc2 gc2Var = gc2.d;
        a = q1f.o("/");
        b = q1f.o("\\");
        c = q1f.o("/\\");
        d = q1f.o(".");
        e = q1f.o("..");
    }

    public static final uae a(uae uaeVar, uae uaeVar2, boolean z) {
        uaeVar2.getClass();
        if (c(uaeVar2) != -1) {
            return uaeVar2;
        }
        if (uaeVar2.f() != null) {
            return uaeVar2;
        }
        gc2 b2 = b(uaeVar);
        if (b2 == null && (b2 = b(uaeVar2)) == null) {
            b2 = f(uae.b);
        }
        x52 x52Var = new x52();
        x52Var.X0(uaeVar.a);
        if (x52Var.b > 0) {
            x52Var.X0(b2);
        }
        x52Var.X0(uaeVar2.a);
        return d(x52Var, z);
    }

    public static final gc2 b(uae uaeVar) {
        gc2 gc2Var = uaeVar.a;
        gc2 gc2Var2 = a;
        if (gc2.k(gc2Var, gc2Var2) != -1) {
            return gc2Var2;
        }
        gc2 gc2Var3 = uaeVar.a;
        gc2 gc2Var4 = b;
        if (gc2.k(gc2Var3, gc2Var4) != -1) {
            return gc2Var4;
        }
        return null;
    }

    public static final int c(uae uaeVar) {
        gc2 gc2Var = uaeVar.a;
        if (gc2Var.h() != 0) {
            if (gc2Var.m(0) != 47) {
                if (gc2Var.m(0) == 92) {
                    if (gc2Var.h() > 2 && gc2Var.m(1) == 92) {
                        gc2 gc2Var2 = b;
                        gc2Var2.getClass();
                        int j = gc2Var.j(2, gc2Var2.l());
                        return j == -1 ? gc2Var.h() : j;
                    }
                } else if (gc2Var.h() > 2 && gc2Var.m(1) == 58 && gc2Var.m(2) == 92) {
                    char m = (char) gc2Var.m(0);
                    if ('a' <= m && m < '{') {
                        return 3;
                    }
                    if ('A' <= m && m < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113 A[EDGE_INSN: B:68:0x0113->B:69:0x0113 BREAK  A[LOOP:1: B:20:0x00ae->B:36:0x00ae], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final uae d(x52 x52Var, boolean z) {
        gc2 gc2Var;
        long j;
        char t;
        boolean w;
        gc2 gc2Var2;
        int size;
        int i;
        gc2 l0;
        x52 x52Var2 = new x52();
        gc2 gc2Var3 = null;
        int i2 = 0;
        while (true) {
            if (!x52Var.I(0L, a)) {
                gc2Var = b;
                if (!x52Var.I(0L, gc2Var)) {
                    break;
                }
            }
            byte readByte = x52Var.readByte();
            if (gc2Var3 == null) {
                gc2Var3 = e(readByte);
            }
            i2++;
        }
        boolean z2 = i2 >= 2 && Intrinsics.c(gc2Var3, gc2Var);
        gc2 gc2Var4 = c;
        if (z2) {
            gc2Var3.getClass();
            x52Var2.X0(gc2Var3);
            x52Var2.X0(gc2Var3);
        } else {
            if (i2 <= 0) {
                long f0 = x52Var.f0(gc2Var4);
                if (gc2Var3 == null) {
                    gc2Var3 = f0 == -1 ? f(uae.b) : e(x52Var.t(f0));
                }
                if (Intrinsics.c(gc2Var3, gc2Var) && x52Var.b >= 2) {
                    j = -1;
                    if (x52Var.t(1L) == 58 && (('a' <= (t = (char) x52Var.t(0L)) && t < '{') || ('A' <= t && t < '['))) {
                        if (f0 == 2) {
                            x52Var2.W(x52Var, 3L);
                        } else {
                            x52Var2.W(x52Var, 2L);
                        }
                    }
                } else {
                    j = -1;
                }
                Unit unit = Unit.a;
                boolean z3 = x52Var2.b <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    w = x52Var.w();
                    gc2Var2 = d;
                    if (!w) {
                        break;
                    }
                    long f02 = x52Var.f0(gc2Var4);
                    if (f02 == j) {
                        l0 = x52Var.l0(x52Var.b);
                    } else {
                        l0 = x52Var.l0(f02);
                        x52Var.readByte();
                    }
                    gc2 gc2Var5 = e;
                    if (Intrinsics.c(l0, gc2Var5)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (!z || (!z3 && (arrayList.isEmpty() || Intrinsics.c(CollectionsKt.h0(arrayList), gc2Var5)))) {
                                arrayList.add(l0);
                            } else if (!z2 || arrayList.size() != 1) {
                                o13.E(arrayList);
                            }
                        }
                    } else if (!Intrinsics.c(l0, gc2Var2) && !Intrinsics.c(l0, gc2.d)) {
                        arrayList.add(l0);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        x52Var2.X0(gc2Var3);
                    }
                    x52Var2.X0((gc2) arrayList.get(i));
                }
                if (x52Var2.b == 0) {
                    x52Var2.X0(gc2Var2);
                }
                return new uae(x52Var2.l0(x52Var2.b));
            }
            gc2Var3.getClass();
            x52Var2.X0(gc2Var3);
        }
        j = -1;
        if (x52Var2.b <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            w = x52Var.w();
            gc2Var2 = d;
            if (!w) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (x52Var2.b == 0) {
        }
        return new uae(x52Var2.l0(x52Var2.b));
    }

    public static final gc2 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        a70.p(ljg.j(b2, "not a directory separator: "));
        return null;
    }

    public static final gc2 f(String str) {
        if (Intrinsics.c(str, "/")) {
            return a;
        }
        if (Intrinsics.c(str, "\\")) {
            return b;
        }
        a70.p(dmi.q("not a directory separator: ", str));
        return null;
    }
}
