package org.apache.commons.lang3.math;

import com.facebook.appevents.AppEventsConstants;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

/* loaded from: classes10.dex */
public class NumberUtils {
    public static final Long LONG_ZERO = 0L;
    public static final Long LONG_ONE = 1L;
    public static final Long LONG_MINUS_ONE = -1L;
    public static final Integer INTEGER_ZERO = 0;
    public static final Integer INTEGER_ONE = 1;
    public static final Integer INTEGER_TWO = 2;
    public static final Integer INTEGER_MINUS_ONE = -1;
    public static final Short SHORT_ZERO = 0;
    public static final Short SHORT_ONE = 1;
    public static final Short SHORT_MINUS_ONE = -1;
    public static final Byte BYTE_ZERO = (byte) 0;
    public static final Byte BYTE_ONE = (byte) 1;
    public static final Byte BYTE_MINUS_ONE = (byte) -1;
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
    public static final Double DOUBLE_ONE = Double.valueOf(1.0d);
    public static final Double DOUBLE_MINUS_ONE = Double.valueOf(-1.0d);
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    public static final Float FLOAT_ONE = Float.valueOf(1.0f);
    public static final Float FLOAT_MINUS_ONE = Float.valueOf(-1.0f);

    public static int compare(byte b, byte b2) {
        return b - b2;
    }

    public static int compare(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }

    public static int compare(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public static int compare(short s, short s2) {
        if (s == s2) {
            return 0;
        }
        return s < s2 ? -1 : 1;
    }

    public static byte max(byte b, byte b2, byte b3) {
        if (b2 > b) {
            b = b2;
        }
        return b3 > b ? b3 : b;
    }

    public static int max(int i, int i2, int i3) {
        if (i2 > i) {
            i = i2;
        }
        return i3 > i ? i3 : i;
    }

    public static long max(long j, long j2, long j3) {
        if (j2 > j) {
            j = j2;
        }
        return j3 > j ? j3 : j;
    }

    public static short max(short s, short s2, short s3) {
        if (s2 > s) {
            s = s2;
        }
        return s3 > s ? s3 : s;
    }

    public static byte min(byte b, byte b2, byte b3) {
        if (b2 < b) {
            b = b2;
        }
        return b3 < b ? b3 : b;
    }

    public static int min(int i, int i2, int i3) {
        if (i2 < i) {
            i = i2;
        }
        return i3 < i ? i3 : i;
    }

    public static long min(long j, long j2, long j3) {
        if (j2 < j) {
            j = j2;
        }
        return j3 < j ? j3 : j;
    }

    public static short min(short s, short s2, short s3) {
        if (s2 < s) {
            s = s2;
        }
        return s3 < s ? s3 : s;
    }

    public static int toInt(String str) {
        return toInt(str, 0);
    }

    public static int toInt(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long toLong(String str) {
        return toLong(str, 0L);
    }

    public static long toLong(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static float toFloat(String str) {
        return toFloat(str, 0.0f);
    }

    public static float toFloat(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static double toDouble(String str) {
        return toDouble(str, 0.0d);
    }

    public static double toDouble(String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public static double toDouble(BigDecimal bigDecimal) {
        return toDouble(bigDecimal, 0.0d);
    }

    public static double toDouble(BigDecimal bigDecimal, double d) {
        return bigDecimal == null ? d : bigDecimal.doubleValue();
    }

    public static byte toByte(String str) {
        return toByte(str, (byte) 0);
    }

    public static byte toByte(String str, byte b) {
        if (str == null) {
            return b;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    public static short toShort(String str) {
        return toShort(str, (short) 0);
    }

    public static short toShort(String str, short s) {
        if (str == null) {
            return s;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
        }
    }

    public static BigDecimal toScaledBigDecimal(BigDecimal bigDecimal) {
        return toScaledBigDecimal(bigDecimal, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toScaledBigDecimal(BigDecimal bigDecimal, int i, RoundingMode roundingMode) {
        if (bigDecimal == null) {
            return BigDecimal.ZERO;
        }
        if (roundingMode == null) {
            roundingMode = RoundingMode.HALF_EVEN;
        }
        return bigDecimal.setScale(i, roundingMode);
    }

    public static BigDecimal toScaledBigDecimal(Float f) {
        return toScaledBigDecimal(f, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toScaledBigDecimal(Float f, int i, RoundingMode roundingMode) {
        if (f == null) {
            return BigDecimal.ZERO;
        }
        return toScaledBigDecimal(BigDecimal.valueOf(f.floatValue()), i, roundingMode);
    }

    public static BigDecimal toScaledBigDecimal(Double d) {
        return toScaledBigDecimal(d, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toScaledBigDecimal(Double d, int i, RoundingMode roundingMode) {
        if (d == null) {
            return BigDecimal.ZERO;
        }
        return toScaledBigDecimal(BigDecimal.valueOf(d.doubleValue()), i, roundingMode);
    }

    public static BigDecimal toScaledBigDecimal(String str) {
        return toScaledBigDecimal(str, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toScaledBigDecimal(String str, int i, RoundingMode roundingMode) {
        if (str == null) {
            return BigDecimal.ZERO;
        }
        return toScaledBigDecimal(createBigDecimal(str), i, roundingMode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        if (r1 == 'l') goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Number createNumber(String str) {
        int i;
        String mantissa;
        String str2;
        Float createFloat;
        Double createDouble;
        String str3 = null;
        if (str == null) {
            return null;
        }
        if (StringUtils.isBlank(str)) {
            throw new NumberFormatException("A blank string is not a valid number");
        }
        String[] strArr = {"0x", "0X", "-0x", "-0X", "#", "-#"};
        char c = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 6) {
                i = 0;
                break;
            }
            String str4 = strArr[i2];
            if (str.startsWith(str4)) {
                i = str4.length();
                break;
            }
            i2++;
        }
        if (i > 0) {
            int i3 = i;
            while (i < str.length() && (c = str.charAt(i)) == '0') {
                i3++;
                i++;
            }
            int length = str.length() - i3;
            if (length > 16 || (length == 16 && c > '7')) {
                return createBigInteger(str);
            }
            if (length > 8 || (length == 8 && c > '7')) {
                return createLong(str);
            }
            return createInteger(str);
        }
        char charAt = str.charAt(str.length() - 1);
        int indexOf = str.indexOf(46);
        int indexOf2 = str.indexOf(101) + str.indexOf(69);
        int i4 = indexOf2 + 1;
        if (indexOf > -1) {
            if (i4 > -1) {
                if (i4 < indexOf || i4 > str.length()) {
                    throw new NumberFormatException(str + " is not a valid number.");
                }
                str2 = str.substring(indexOf + 1, i4);
            } else {
                str2 = str.substring(indexOf + 1);
            }
            mantissa = getMantissa(str, indexOf);
        } else {
            if (i4 > -1) {
                if (i4 > str.length()) {
                    throw new NumberFormatException(str + " is not a valid number.");
                }
                mantissa = getMantissa(str, i4);
            } else {
                mantissa = getMantissa(str);
            }
            str2 = null;
        }
        if (!Character.isDigit(charAt) && charAt != '.') {
            if (i4 > -1 && i4 < str.length() - 1) {
                str3 = str.substring(indexOf2 + 2, str.length() - 1);
            }
            String substring = str.substring(0, str.length() - 1);
            boolean z = isAllZeros(mantissa) && isAllZeros(str3);
            if (charAt != 'D') {
                if (charAt != 'F') {
                    if (charAt != 'L') {
                        if (charAt != 'd') {
                            if (charAt != 'f') {
                            }
                        }
                    }
                    if (str2 != null || str3 != null || ((substring.isEmpty() || substring.charAt(0) != '-' || !isDigits(substring.substring(1))) && !isDigits(substring))) {
                        throw new NumberFormatException(str + " is not a valid number.");
                    }
                    try {
                        return createLong(substring);
                    } catch (NumberFormatException unused) {
                        return createBigInteger(substring);
                    }
                }
                try {
                    Float createFloat2 = createFloat(str);
                    if (!createFloat2.isInfinite()) {
                        if (createFloat2.floatValue() != 0.0f || z) {
                            return createFloat2;
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            try {
                Double createDouble2 = createDouble(str);
                if (!createDouble2.isInfinite()) {
                    if (createDouble2.floatValue() != 0.0d || z) {
                        return createDouble2;
                    }
                }
            } catch (NumberFormatException unused3) {
            }
            try {
                return createBigDecimal(substring);
            } catch (NumberFormatException unused4) {
                throw new NumberFormatException(str + " is not a valid number.");
            }
        }
        if (i4 > -1 && i4 < str.length() - 1) {
            str3 = str.substring(indexOf2 + 2, str.length());
        }
        if (str2 == null && str3 == null) {
            try {
                try {
                    return createInteger(str);
                } catch (NumberFormatException unused5) {
                    return createBigInteger(str);
                }
            } catch (NumberFormatException unused6) {
                return createLong(str);
            }
        }
        if (isAllZeros(mantissa) && isAllZeros(str3)) {
            c = 1;
        }
        try {
            createFloat = createFloat(str);
            createDouble = createDouble(str);
        } catch (NumberFormatException unused7) {
        }
        if (!createFloat.isInfinite() && ((createFloat.floatValue() != 0.0f || c != 0) && createFloat.toString().equals(createDouble.toString()))) {
            return createFloat;
        }
        if (!createDouble.isInfinite() && (createDouble.doubleValue() != 0.0d || c != 0)) {
            BigDecimal createBigDecimal = createBigDecimal(str);
            return createBigDecimal.compareTo(BigDecimal.valueOf(createDouble.doubleValue())) == 0 ? createDouble : createBigDecimal;
        }
        return createBigDecimal(str);
    }

    private static String getMantissa(String str) {
        return getMantissa(str, str.length());
    }

    private static String getMantissa(String str, int i) {
        char charAt = str.charAt(0);
        return (charAt == '-' || charAt == '+') ? str.substring(1, i) : str.substring(0, i);
    }

    private static boolean isAllZeros(String str) {
        if (str == null) {
            return true;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) != '0') {
                return false;
            }
        }
        return !str.isEmpty();
    }

    public static Float createFloat(String str) {
        if (str == null) {
            return null;
        }
        return Float.valueOf(str);
    }

    public static Double createDouble(String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
    }

    public static Integer createInteger(String str) {
        if (str == null) {
            return null;
        }
        return Integer.decode(str);
    }

    public static Long createLong(String str) {
        if (str == null) {
            return null;
        }
        return Long.decode(str);
    }

    public static BigInteger createBigInteger(String str) {
        int i;
        if (str == null) {
            return null;
        }
        boolean startsWith = str.startsWith("-");
        int i2 = 16;
        if (str.startsWith("0x", startsWith ? 1 : 0) || str.startsWith("0X", startsWith ? 1 : 0)) {
            i = (startsWith ? 1 : 0) + 2;
        } else if (str.startsWith("#", startsWith ? 1 : 0)) {
            i = (startsWith ? 1 : 0) + 1;
        } else {
            if (str.startsWith(AppEventsConstants.EVENT_PARAM_VALUE_NO, startsWith ? 1 : 0)) {
                int length = str.length();
                int i3 = (startsWith ? 1 : 0) + 1;
                if (length > i3) {
                    i2 = 8;
                    i = i3;
                }
            }
            i2 = 10;
            i = startsWith ? 1 : 0;
        }
        BigInteger bigInteger = new BigInteger(str.substring(i), i2);
        return startsWith ? bigInteger.negate() : bigInteger;
    }

    public static BigDecimal createBigDecimal(String str) {
        if (str == null) {
            return null;
        }
        if (StringUtils.isBlank(str)) {
            throw new NumberFormatException("A blank string is not a valid number");
        }
        if (str.trim().startsWith("--")) {
            throw new NumberFormatException(str + " is not a valid number.");
        }
        return new BigDecimal(str);
    }

    public static long min(long... jArr) {
        validateArray(jArr);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    public static int min(int... iArr) {
        validateArray(iArr);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static short min(short... sArr) {
        validateArray(sArr);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            short s2 = sArr[i];
            if (s2 < s) {
                s = s2;
            }
        }
        return s;
    }

    public static byte min(byte... bArr) {
        validateArray(bArr);
        byte b = bArr[0];
        for (int i = 1; i < bArr.length; i++) {
            byte b2 = bArr[i];
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    public static double min(double... dArr) {
        validateArray(dArr);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            if (Double.isNaN(dArr[i])) {
                return Double.NaN;
            }
            double d2 = dArr[i];
            if (d2 < d) {
                d = d2;
            }
        }
        return d;
    }

    public static float min(float... fArr) {
        validateArray(fArr);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            if (Float.isNaN(fArr[i])) {
                return Float.NaN;
            }
            float f2 = fArr[i];
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    public static long max(long... jArr) {
        validateArray(jArr);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static int max(int... iArr) {
        validateArray(iArr);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static short max(short... sArr) {
        validateArray(sArr);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            short s2 = sArr[i];
            if (s2 > s) {
                s = s2;
            }
        }
        return s;
    }

    public static byte max(byte... bArr) {
        validateArray(bArr);
        byte b = bArr[0];
        for (int i = 1; i < bArr.length; i++) {
            byte b2 = bArr[i];
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    public static double max(double... dArr) {
        validateArray(dArr);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            if (Double.isNaN(dArr[i])) {
                return Double.NaN;
            }
            double d2 = dArr[i];
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    public static float max(float... fArr) {
        validateArray(fArr);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            if (Float.isNaN(fArr[i])) {
                return Float.NaN;
            }
            float f2 = fArr[i];
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    private static void validateArray(Object obj) {
        Validate.isTrue(obj != null, "The Array must not be null", new Object[0]);
        Validate.isTrue(Array.getLength(obj) != 0, "Array cannot be empty.", new Object[0]);
    }

    public static double min(double d, double d2, double d3) {
        return Math.min(Math.min(d, d2), d3);
    }

    public static float min(float f, float f2, float f3) {
        return Math.min(Math.min(f, f2), f3);
    }

    public static double max(double d, double d2, double d3) {
        return Math.max(Math.max(d, d2), d3);
    }

    public static float max(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    public static boolean isDigits(String str) {
        return StringUtils.isNumeric(str);
    }

    @Deprecated
    public static boolean isNumber(String str) {
        return isCreatable(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00e2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0091, code lost:
    
        if (r3 >= r0.length) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0093, code lost:
    
        r0 = r0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0095, code lost:
    
        if (r0 < '0') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0097, code lost:
    
        if (r0 > '9') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0099, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x009a, code lost:
    
        if (r0 == 'e') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009c, code lost:
    
        if (r0 != 'E') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009f, code lost:
    
        if (r0 != '.') goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a1, code lost:
    
        if (r16 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a3, code lost:
    
        if (r15 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b4, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a5, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a6, code lost:
    
        if (r13 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00aa, code lost:
    
        if (r0 == 'd') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ae, code lost:
    
        if (r0 == 'D') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00b0, code lost:
    
        if (r0 == 'f') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b2, code lost:
    
        if (r0 != r8) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00b7, code lost:
    
        if (r0 == 'l') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00bb, code lost:
    
        if (r0 != 'L') goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00be, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00bf, code lost:
    
        if (r14 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c1, code lost:
    
        if (r15 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c3, code lost:
    
        if (r16 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c5, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00c7, code lost:
    
        if (r13 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c9, code lost:
    
        if (r14 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00cb, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00cc, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isCreatable(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char c = charArray[0];
        boolean z = true;
        int i = (c == '-' || c == '+') ? 1 : 0;
        int i2 = i + 1;
        char c2 = 'F';
        if (length > i2 && charArray[i] == '0' && !StringUtils.contains(str, 46)) {
            char c3 = charArray[i2];
            if (c3 == 'x' || c3 == 'X') {
                int i3 = i + 2;
                if (i3 == length) {
                    return false;
                }
                while (i3 < charArray.length) {
                    char c4 = charArray[i3];
                    if ((c4 < '0' || c4 > '9') && ((c4 < 'a' || c4 > 'f') && (c4 < 'A' || c4 > 'F'))) {
                        return false;
                    }
                    i3++;
                }
                return true;
            }
            if (Character.isDigit(c3)) {
                while (i2 < charArray.length) {
                    char c5 = charArray[i2];
                    if (c5 < '0' || c5 > '7') {
                        return false;
                    }
                    i2++;
                }
                return true;
            }
        }
        int i4 = length - 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            boolean z6 = z;
            if (i < i4 || (i < length && z2 && !z3)) {
                char c6 = charArray[i];
                if (c6 >= '0' && c6 <= '9') {
                    z2 = false;
                    z3 = z6;
                } else if (c6 == '.') {
                    if (z5 || z4) {
                        break;
                    }
                    z5 = z6;
                } else if (c6 == 'e' || c6 == 'E') {
                    if (z4 || !z3) {
                        return false;
                    }
                    z2 = z6;
                    z4 = z2;
                } else {
                    if ((c6 != '+' && c6 != '-') || !z2) {
                        return false;
                    }
                    z2 = false;
                    z3 = false;
                }
                i++;
                z = z6;
                c2 = 'F';
            }
        }
    }

    public static boolean isParsable(String str) {
        if (StringUtils.isEmpty(str) || str.charAt(str.length() - 1) == '.') {
            return false;
        }
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                return false;
            }
            return withDecimalsParsing(str, 1);
        }
        return withDecimalsParsing(str, 0);
    }

    private static boolean withDecimalsParsing(String str, int i) {
        int i2 = 0;
        while (i < str.length()) {
            boolean z = str.charAt(i) == '.';
            if (z) {
                i2++;
            }
            if (i2 > 1) {
                return false;
            }
            if (!z && !Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }
}
