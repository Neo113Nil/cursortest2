package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ybk {
    public static wbk a(Object obj) {
        gw8 gw8Var = (gw8) obj;
        wbk wbkVar = gw8Var.unknownFields;
        if (wbkVar != wbk.f) {
            return wbkVar;
        }
        wbk wbkVar2 = new wbk(0, new int[8], new Object[8], true);
        gw8Var.unknownFields = wbkVar2;
        return wbkVar2;
    }

    public static boolean b(int i, zz0 zz0Var, Object obj) {
        int i2 = zz0Var.b;
        qo2 qo2Var = (qo2) zz0Var.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            zz0Var.Z(0);
            ((wbk) obj).c(i3 << 3, Long.valueOf(qo2Var.s()));
            return true;
        }
        if (i4 == 1) {
            zz0Var.Z(1);
            ((wbk) obj).c((i3 << 3) | 1, Long.valueOf(qo2Var.p()));
            return true;
        }
        if (i4 == 2) {
            ((wbk) obj).c((i3 << 3) | 2, zz0Var.p());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw maa.g();
            }
            zz0Var.Z(5);
            ((wbk) obj).c(5 | (i3 << 3), Integer.valueOf(qo2Var.o()));
            return true;
        }
        wbk wbkVar = new wbk(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new maa("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zz0Var.f() != Integer.MAX_VALUE && b(i7, zz0Var, wbkVar)) {
        }
        if (i6 != zz0Var.b) {
            throw new maa("Protocol message end-group tag did not match expected tag.");
        }
        if (wbkVar.e) {
            wbkVar.e = false;
        }
        ((wbk) obj).c(i5 | 3, wbkVar);
        return true;
    }
}
