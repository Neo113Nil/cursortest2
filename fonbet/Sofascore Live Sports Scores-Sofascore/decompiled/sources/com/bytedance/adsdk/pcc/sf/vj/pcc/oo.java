package com.bytedance.adsdk.pcc.sf.vj.pcc;

import defpackage.a70;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    public static Object pcc(Object obj, Number number) {
        if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return pcc(((Number) obj).intValue(), number);
        }
        if (obj instanceof Long) {
            return pcc(((Long) obj).longValue(), number);
        }
        if (obj instanceof Float) {
            return pcc(((Float) obj).floatValue(), number);
        }
        if (obj instanceof Double) {
            return pcc(((Double) obj).doubleValue(), number);
        }
        if (!(obj instanceof String)) {
            a70.m(obj.getClass().getName().concat("This type of addition operation is not supported"));
            return null;
        }
        try {
            return pcc(Float.parseFloat((String) obj), number);
        } catch (NumberFormatException unused) {
            a70.m(obj.getClass().getName().concat("This type of addition operation is not supported"));
            return null;
        }
    }

    private static Object pcc(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j < ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j) < number.doubleValue());
        }
        a70.m(w1l.g(number, "This type of addition operation is not supported"));
        return null;
    }

    private static Object pcc(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f < ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f < ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f) < number.doubleValue());
        }
        a70.m(w1l.g(number, "This type of addition operation is not supported"));
        return null;
    }

    private static Object pcc(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d < ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d < ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d < ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d < number.doubleValue());
        }
        a70.m(w1l.g(number, "This type of addition operation is not supported"));
        return null;
    }

    private static Object pcc(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i < number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i) < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i) < number.doubleValue());
        }
        a70.m(w1l.g(number, "This type of addition operation is not supported"));
        return null;
    }
}
