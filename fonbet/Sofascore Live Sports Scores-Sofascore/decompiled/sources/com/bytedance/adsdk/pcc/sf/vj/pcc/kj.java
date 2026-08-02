package com.bytedance.adsdk.pcc.sf.vj.pcc;

import defpackage.a70;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    private static Object pcc(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(number.intValue() + i);
        }
        if (number instanceof Long) {
            return Long.valueOf(number.longValue() + i);
        }
        if (number instanceof Float) {
            return Float.valueOf(number.floatValue() + i);
        }
        if (number instanceof Double) {
            return Double.valueOf(number.doubleValue() + i);
        }
        a70.m(w1l.g(number, "This type of addition operation is not supported"));
        return null;
    }

    private static Object pcc(long j, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(number.longValue() + j);
            }
            if (number instanceof Float) {
                return Float.valueOf(number.floatValue() + j);
            }
            if (number instanceof Double) {
                return Double.valueOf(number.doubleValue() + j);
            }
            a70.m(w1l.g(number, "This type of addition operation is not supported"));
            return null;
        }
        return Long.valueOf(j + number.intValue());
    }

    private static Object pcc(float f, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f + number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(number.floatValue() + f);
            }
            if (number instanceof Double) {
                return Double.valueOf(number.doubleValue() + f);
            }
            a70.m(w1l.g(number, "This type of addition operation is not supported"));
            return null;
        }
        return Float.valueOf(f + number.intValue());
    }

    private static Object pcc(double d, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d + number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(number.doubleValue() + d);
            }
            a70.m(w1l.g(number, "This type of addition operation is not supported"));
            return null;
        }
        return Double.valueOf(d + number.intValue());
    }

    public static Object pcc(Number number, Number number2) {
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
            return null;
        }
        return pcc(number.intValue(), number2);
    }
}
