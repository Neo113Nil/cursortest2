package org.aspectj.runtime.internal;

/* loaded from: classes10.dex */
public final class Conversions {
    public static Object voidObject() {
        return null;
    }

    public static Object voidValue(Object obj) {
        return obj;
    }

    private Conversions() {
    }

    public static Object intObject(int i) {
        return Integer.valueOf(i);
    }

    public static Object shortObject(short s) {
        return Short.valueOf(s);
    }

    public static Object byteObject(byte b) {
        return Byte.valueOf(b);
    }

    public static Object charObject(char c) {
        return Character.valueOf(c);
    }

    public static Object longObject(long j) {
        return Long.valueOf(j);
    }

    public static Object floatObject(float f) {
        return Float.valueOf(f);
    }

    public static Object doubleObject(double d) {
        return Double.valueOf(d);
    }

    public static Object booleanObject(boolean z) {
        return Boolean.valueOf(z);
    }

    public static int intValue(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to int");
    }

    public static long longValue(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to long");
    }

    public static float floatValue(Object obj) {
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to float");
    }

    public static double doubleValue(Object obj) {
        if (obj == null) {
            return 0.0d;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to double");
    }

    public static byte byteValue(Object obj) {
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to byte");
    }

    public static short shortValue(Object obj) {
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to short");
    }

    public static char charValue(Object obj) {
        if (obj == null) {
            return (char) 0;
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to char");
    }

    public static boolean booleanValue(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new ClassCastException(obj.getClass().getName() + " can not be converted to boolean");
    }
}
