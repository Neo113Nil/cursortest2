package com.appsflyer.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;

/* loaded from: classes.dex */
public class AFa1ySDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AFLogger$LogLevel;
    private static Object AFVersionDeclaration;
    private static int AppsFlyer2dXConversionCallback;
    public static final Map<Integer, Object> afErrorLog;
    private static byte[] afErrorLogForExcManagerOnly;
    private static Object afLogForce;
    private static final Map<String, Object> getLevel;
    private static long init;
    private static int onAppOpenAttributionNative;
    private static byte[] onInstallConversionFailureNative;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0068 -> B:9:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i11, short s11, short s12) {
        ?? r92;
        byte[] bArr;
        int i12;
        byte[] bArr2;
        int i13;
        byte b11;
        byte b12;
        byte b13;
        byte b14;
        int i14;
        int i15 = $11;
        int i16 = (i15 ^ 11) + ((i15 & 11) << 1);
        $10 = i16 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i16 % 2 != 0) {
            int i17 = (i11 ^ 30) + ((i11 & 30) << 1);
            int i18 = ((i17 | (-6)) << 1) - (i17 ^ (-6));
            r92 = s11 + 112;
            ?? r102 = 119 >>> s12;
            bArr2 = $$a;
            bArr = new byte[i18];
            i11 = (i18 | 119) + (i18 & 119);
            if (bArr2 == null) {
                i13 = 1;
                b14 = r102;
                i14 = i15 + 65;
                $10 = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i14 % 2 == 0) {
                    throw null;
                }
                b12 = b14;
                b13 = r92;
            } else {
                i12 = 1;
                b11 = r102;
                bArr[i12] = b11 == true ? (byte) 1 : (byte) 0;
                int i19 = (i12 ^ 66) + ((i12 & 66) << 1);
                i13 = ((i19 & (-65)) << 1) + (i19 ^ (-65));
                if (i12 == i11) {
                    return new String(bArr, 0);
                }
                b12 = bArr2[r92];
                int i21 = $11;
                $10 = ((i21 ^ 117) + ((i21 & 117) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                b13 = b11;
            }
        } else {
            r92 = s11 + 4;
            ?? r103 = 119 - s12;
            byte[] bArr3 = $$a;
            bArr = new byte[i11 + 1];
            if (bArr3 == null) {
                bArr2 = bArr3;
                i13 = 0;
                b14 = r103;
                i14 = i15 + 65;
                $10 = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i14 % 2 == 0) {
                }
            } else {
                i12 = 0;
                bArr2 = bArr3;
                b11 = r103;
                bArr[i12] = b11 == true ? (byte) 1 : (byte) 0;
                int i192 = (i12 ^ 66) + ((i12 & 66) << 1);
                i13 = ((i192 & (-65)) << 1) + (i192 ^ (-65));
                if (i12 == i11) {
                }
            }
        }
        r92 = (((r92 | (-49)) << 1) - (r92 ^ (-49))) + 50;
        ?? r104 = ((b13 & b12) << 1) + (b13 ^ b12);
        int i22 = $11;
        $10 = ((i22 ^ 101) + ((i22 & 101) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        i12 = i13;
        b11 = r104;
        bArr[i12] = b11 == true ? (byte) 1 : (byte) 0;
        int i1922 = (i12 ^ 66) + ((i12 & 66) << 1);
        i13 = ((i1922 & (-65)) << 1) + (i1922 ^ (-65));
        if (i12 == i11) {
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instructions count: 6124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.<clinit>():void");
    }

    private AFa1ySDK() {
    }

    public static int AFInAppEventType(int i11) {
        int i12 = $11;
        Object obj = afLogForce;
        $10 = (((i12 | 73) << 1) - (i12 ^ 73)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[350]), (short) 515, r0[11]), true, (ClassLoader) AFVersionDeclaration).getMethod($$c(r0[164], (short) 387, r0[91]), Integer.TYPE).invoke(obj, Integer.valueOf(i11))).intValue();
            int i13 = $11 + 31;
            $10 = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i13 % 2 == 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object AFKeystoreWrapper(int i11, char c11, int i12) {
        int i13 = $10;
        int i14 = (i13 & 105) + (i13 | 105);
        $11 = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i14 % 2 == 0) {
            throw null;
        }
        Object obj = afLogForce;
        $11 = (i13 + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {Integer.valueOf(i11), Character.valueOf(c11), Integer.valueOf(i12)};
            Class<?> cls = Class.forName($$c((byte) (-$$a[350]), (short) 515, r7[11]), true, (ClassLoader) AFVersionDeclaration);
            String $$c = $$c(r7[89], (short) 647, r7[91]);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            int i15 = $11;
            int i16 = ((i15 | 99) << 1) - (i15 ^ 99);
            $10 = i16 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i16 % 2 == 0) {
                return invoke;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    static void init$0() {
        $10 = ($11 + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
        byte[] bArr = new byte[1075];
        System.arraycopy("rÎ}é÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\fó\u000eüý\nïê!ñ\u0002\u0006\u000b\u0005÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\b\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿ\rö\u000eýúûÊ9\u000bï\u000fø\u0001ú\u0010»6\u000eï\u0016ê\u0001\nùÉ\u0016.ï\u0016ê\u0001\nù÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿ÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\róü\u0003â/÷\u0000\rþ\u000fÒ#\u0003ù\u000eÑ%\t\u0005ö\u0001\u0013×\u0017û÷\u000bñþ\u000fÏ\u001e\u0002\u0005ýß%\t\u0017ñ\nÓ,ýþæ!þ÷\u0005ùóü\u0003ý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\fõ\u0001ú\u0004þ\u0002\u0005ýý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\t\u0005\u0003%Ó/\u0000Õ1ï\t\u0006à%÷õ\u0006õõë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµë\u0006ê\bë\u0004ì\bë\bè\b\u0005\u0003%Ó/\u0000Õ1ï\t\u0006Ü\u0011\u0011ï\fø\u000fñ\rÜ\u0013\fø÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007ò\u000fÞ\u0013ü\u0003ë\u001fþ\r4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Ë÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\f\u0003ò\u0003à!\u0013\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005\u001bÐDÞñ\u0007Ù\u0000÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\fë\u000b\tð\u000eøþ\u0007þ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r5ý\u0013íÎ5ý\u0013íÎ\u0001\u0007ù\u000fñ\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005\u001bÐHÚñ\u0007ÙSþ\u000fÒþ\u0005\u0005\u001a\u0014ú\u0001û\u0003óò\u001bï\u000f\u0000õ\r\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005\u001bÐDÞñ\u0007Ù\u0000ñ\u0007\u0014ê\u0005\u0006\rö\u000eýúûÊHóü\u0012·\u001f\"\u0005õ\u0006ÿ×1ï\t\u0006ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿ\t\u0003\u0004ò4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ2Ì÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\tþ\u000fÜ\"ý\u0001õ\r\u0002\u0005þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\fþ\ré\u001b÷\u000bñ÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿ\rö\u000eýúûÊFñ\u0013üº&\u0011\u0013üá\u001fõ\u0003\u0007ñ\u0013ôä\u001d\n\u0001þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùõ\u0012\u0001Õ%ö\u0001\u0013×\u0017ë\u0003í\b\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003ûÓ7ûñÜ1\u0000ï\u0018\u0003ò\u0003ß)õ\u0012\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\rûï\u000fó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000e÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f".getBytes("ISO-8859-1"), 0, bArr, 0, 1075);
        $$a = bArr;
        $$b = 19;
        int i11 = $11;
        int i12 = (i11 ^ 77) + ((i11 & 77) << 1);
        $10 = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static int AFInAppEventType(Object obj) {
        int i11 = $11;
        int i12 = i11 + 89;
        $10 = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            throw null;
        }
        Object obj2 = afLogForce;
        $10 = (i11 + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((byte) (-bArr[350]), (short) 515, bArr[11]), true, (ClassLoader) AFVersionDeclaration);
            byte b11 = bArr[22];
            return ((Integer) cls.getMethod($$c(b11, (short) ((b11 ^ 570) | (b11 & 570)), bArr[55]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
