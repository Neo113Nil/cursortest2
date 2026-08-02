package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zbk {
    public static xbk a(Object obj) {
        hw8 hw8Var = (hw8) obj;
        xbk xbkVar = hw8Var.unknownFields;
        if (xbkVar != xbk.f) {
            return xbkVar;
        }
        xbk xbkVar2 = new xbk(0, new int[8], new Object[8], true);
        hw8Var.unknownFields = xbkVar2;
        return xbkVar2;
    }

    public static boolean b(int i, zz0 zz0Var, Object obj) {
        int i2 = zz0Var.b;
        qo2 qo2Var = (qo2) zz0Var.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            zz0Var.Z(0);
            ((xbk) obj).c(i3 << 3, Long.valueOf(qo2Var.s()));
            return true;
        }
        if (i4 == 1) {
            zz0Var.Z(1);
            ((xbk) obj).c((i3 << 3) | 1, Long.valueOf(qo2Var.p()));
            return true;
        }
        if (i4 == 2) {
            ((xbk) obj).c((i3 << 3) | 2, zz0Var.q());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw naa.g();
            }
            zz0Var.Z(5);
            ((xbk) obj).c(5 | (i3 << 3), Integer.valueOf(qo2Var.o()));
            return true;
        }
        xbk xbkVar = new xbk(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new naa("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zz0Var.f() != Integer.MAX_VALUE && b(i7, zz0Var, xbkVar)) {
        }
        if (i6 != zz0Var.b) {
            throw new naa("Protocol message end-group tag did not match expected tag.");
        }
        if (xbkVar.e) {
            xbkVar.e = false;
        }
        ((xbk) obj).c(i5 | 3, xbkVar);
        return true;
    }
}
