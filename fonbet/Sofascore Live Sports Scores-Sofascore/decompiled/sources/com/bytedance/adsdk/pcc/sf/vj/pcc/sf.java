package com.bytedance.adsdk.pcc.sf.vj.pcc;

import defpackage.a70;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private static boolean pcc(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j) == number.doubleValue();
        }
        a70.m(w1l.g(number, "This type of addition operation is not supported"));
        return false;
    }

    private static boolean pcc(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i) == number.doubleValue();
        }
        a70.m(w1l.g(number, "This type of addition operation is not supported"));
        return false;
    }

    private static boolean pcc(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f) == number.doubleValue();
        }
        a70.m(w1l.g(number, "This type of addition operation is not supported"));
        return false;
    }

    private static boolean pcc(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d == number.doubleValue();
        }
        a70.m(w1l.g(number, "This type of addition operation is not supported"));
        return false;
    }

    public static boolean pcc(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return pcc(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return pcc(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return pcc(number.doubleValue(), number2);
            }
            a70.m(w1l.g(number, "This type of addition operation is not supported"));
            return false;
        }
        return pcc(number.intValue(), number2);
    }
}
