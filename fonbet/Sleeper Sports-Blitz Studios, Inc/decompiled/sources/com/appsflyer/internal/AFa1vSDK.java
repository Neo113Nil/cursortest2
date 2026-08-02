package com.appsflyer.internal;

import java.util.Map;

/* loaded from: classes6.dex */
public class AFa1vSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Map AFInAppEventParameterName;
    public static final Map AFLogger;
    private static byte[] afDebugLog;
    private static long afInfoLog;
    private static Object d;
    private static byte[] e;
    private static int force;
    private static int i;
    private static Object registerClient;
    private static byte[] unregisterClient;
    private static long v;
    private static long w;

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0071 -> B:7:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i3, short s) {
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        byte[] bArr2;
        int i7;
        int i8;
        int i9;
        byte[] bArr3;
        byte[] bArr4;
        int i10;
        int i11;
        int i12 = 2 % 2;
        int i13 = $11 + 113;
        int i14 = i13 % 128;
        $10 = i14;
        if (i13 % 2 != 0) {
            i4 = (s ^ 81) + ((s & 81) << 1);
            i5 = 66 >>> i2;
            i6 = i3 + 55;
            bArr = $$a;
            bArr2 = new byte[i5];
            if (bArr == null) {
                i8 = 1;
                int i15 = (i14 & 79) + (i14 | 79);
                $11 = i15 % 128;
                int i16 = i15 % 2;
                i7 = i8;
                bArr3 = bArr2;
                bArr4 = bArr;
                i10 = i6;
                i11 = i5;
            } else {
                i7 = 1;
                i9 = (i7 & (-22)) + (i7 | (-22)) + 23;
                bArr2[i7] = (byte) i4;
                if (i9 == i5) {
                    String str = new String(bArr2, 0);
                    int i17 = $10;
                    int i18 = (i17 & 29) + (i17 | 29);
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    return str;
                }
                int i20 = i5;
                i5 = bArr[i6];
                i7 = i9;
                bArr3 = bArr2;
                bArr4 = bArr;
                i10 = i6;
                i11 = i20;
            }
        } else {
            int i21 = (s & 6) + (s | 6);
            i4 = (i21 | 27) + (i21 & 27);
            int i22 = -i2;
            i5 = ((i22 | 36) << 1) - (i22 ^ 36);
            i6 = i3 + 4;
            bArr = $$a;
            bArr2 = new byte[i5];
            if (bArr == null) {
                i8 = 0;
                int i152 = (i14 & 79) + (i14 | 79);
                $11 = i152 % 128;
                int i162 = i152 % 2;
                i7 = i8;
                bArr3 = bArr2;
                bArr4 = bArr;
                i10 = i6;
                i11 = i5;
            } else {
                i7 = 0;
                i9 = (i7 & (-22)) + (i7 | (-22)) + 23;
                bArr2[i7] = (byte) i4;
                if (i9 == i5) {
                }
            }
        }
        int i23 = -i5;
        int i24 = i23 * 624;
        int i25 = i4 * (-622);
        int i26 = (i24 & i25) + (i24 | i25);
        int i27 = ~i4;
        int i28 = (i27 ^ i23) | (i27 & i23);
        int i29 = -(-((~((i28 & i2) | (i28 ^ i2))) * 623));
        int i30 = ((i26 | i29) << 1) - (i29 ^ i26);
        int i31 = ~i2;
        int i32 = ~i23;
        int i33 = ~((i32 & i4) | (i32 ^ i4));
        int i34 = ~i4;
        int i35 = ~((i34 & i23) | (i34 ^ i23));
        int i36 = ~(i27 | i2);
        int i37 = i30 + (((i31 & i33) | (i31 ^ i33)) * (-623)) + (((i35 & i36) | (i35 ^ i36) | (~(i23 | i2))) * 623);
        int i38 = i10 + 1;
        int i39 = -(-(i37 * (-622)));
        int i40 = ((-1248) ^ i39) + ((i39 & (-1248)) << 1);
        int i41 = ~i37;
        int i42 = (i41 ^ (-2)) | (i41 & (-2));
        int i43 = -(-((~((i42 ^ i2) | (i42 & i2))) * 623));
        int i44 = (i40 & i43) + (i40 | i43) + (((~i2) | (~((1 ^ i37) | (i37 & 1)))) * (-623));
        int i45 = ~i42;
        int i46 = ~((i41 & i2) | (i41 ^ i2));
        int i47 = (i46 & i45) | (i45 ^ i46);
        int i48 = ~((i2 ^ (-2)) | (i2 & (-2)));
        int i49 = (((i47 & i48) | (i47 ^ i48)) * 623) + i44;
        int i50 = $11;
        int i51 = ((i50 | 51) << 1) - (i50 ^ 51);
        $10 = i51 % 128;
        int i52 = i51 % 2;
        int i53 = i11;
        i6 = i38;
        i4 = i49;
        i5 = i53;
        bArr = bArr4;
        bArr2 = bArr3;
        i9 = (i7 & (-22)) + (i7 | (-22)) + 23;
        bArr2[i7] = (byte) i4;
        if (i9 == i5) {
        }
    }

    static void init$0() {
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = ((i3 | 59) << 1) - (i3 ^ 59);
        $10 = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = new byte[1116];
        System.arraycopy("\u0006-íWò\u0000<Ìïþû\u000bøñ\u0012ñAÄùø\rñ\u0002\u000bó;ìùã.»\u001f\r÷öþò\u0000=Ëïþû\u000bøñ\u0012ññ\bð\u0001\u0004\u00034Ëïþ@ëÜí\tñ\u000bóù#êô\u000b\u0002ûì\u0001þ\u000bõø1Ïþ\u0002\u0001\u0004\u0000ë\tøÿñ\bð\u0001\u0004\u00034Ëïþ@ëÏþ'Ùû\u000bÿó÷\u0000ï)Ù\u0003ó\t\u0006ó)Ïþ\u0002\u0001\u0004\u0000ë\tøÿ\u0000ï,Ûû\u0005ð-Ùõ\u0000ï/Ò\tý àüù\u0001\u001fÙõ\u0000ï/àüù\u0001\u001fÙõÉ\u0001ë\u00110É\u0001ë\u00110\u0007é\u00131Ãø?æÛû\u0005\u0007é\u00131Ãø?¸\u0005û\nùõ\u0007é\u00131À\tñ\u00057ÙØ\u0004ý\rö\u0000ï\"Ü\u0001ý\tñüùò\tý\u0004ú\u0000üù\u0001ñ\bð\u0001\u0004\u00034½úCêË\nû\u0006>Ì\u000fñý\bøÿ\r÷ê\u0014ùø\u0000ñ\u0015ã\u0007ó\r\u0013ø\u0014ö\u0007é\u00131Ãø?ãø\bË\u0013üóú\tøÿì\u0001þ\u000bõø\u001eéú\u0006\u0016âûþ\u0001ô\u0007é\u00131Ãø?æÛû\u0005\u0014Øÿ\u0002ùÿ\u001fÝ\u0000\u000b\u0002òõûú\f\u0013û\u0011öÌìþ\fïÿBÊò\u0000<Ìïþû\u000bøñ\u0012ñAÄùø\rñ\u0002\u000bó;Ì2\u0000ï ëð\u0002ø\u0001\rü\u0007é\u00131¾\u0007ïD×\u0001\u0004\u0000ï\"íë\n\u0007é\u00131Ãø?êË\rþÿñ\u000bÿ\u0019Ùüùÿ\u001fÝ\u0000\u000b\u0002ò\u0007é\u00131Ãø?ãÙüùÿ\u001fÝ\u0000\u000b\u0002ò\u0007é\u00131Ãø?èáë\u0011\u0016Ùüùÿ\u001fÝ\u0000\u000b\u0002ò\u000b\u0002û\u001cÏ\u0007þñ\u0007é\u00131Ãø?êÇ\u0003\r\"Íþ\u000fæ.Ùüùÿ\u001fÝ\u0000\u000b\u0002òò\u0000=Ëïþû\u000bøñ\u0012ñBÃùø\rñ\u0002\u000bó<ëùÙ8¶$\r÷ò\u0000=Ëïþû\u000bøñ\u0012ñBÃùø\rñ\u0002\u000bó<ëùã.»\u001f\r÷öþ\u0000ï%æÿù\u0006ë\tøÿ\u001eçïû\u0006û\u0005\u0006\u0000÷\u000b\u0002û\fï ë\u0002û\u0013ß\u0000ñ\u0013ú\u0012ö\u0003\u0007ó\r\u0000ï,\u0000\u0007é\u00131Ãø?æÛû\u0005\u001fÝð\u000eï\u0007÷ú\u0003ûø\t\t\u0001óô\u000bü;¹ø\u0004ý\rö=èÝë0Ûû\u0005û\fû\u001eÝë\u0000ï1Ýí\u0002\u0001õÿ\r\u0013íë\ný÷\u0005ï\r\u0000ï/Õ\tìþ%Û\fûýñ\u0007é\u00131·ÿ\tû<²\u000f÷@Òï÷%Ùüùÿ\u001fÝ\u0000\u000b\u0002ò\u0000ï$çë\u0002-Õø\u0000÷\u0007é\u00131·ÿ\tû<²\u000f÷@Òï÷)Õø\u0000÷\u0000ï\u001fèí\u0013\u0007é\u00131Ãø?êÇ\u0003\r\"Íþ\u000fæ(Øÿ\u0002ùÿ\u001fÝ\u0000\u000b\u0002ò\u0003+Ç\u0003\r\"Íþ\u000fæ\u0007é\u00131Ãø?éÕûú\f\u0002ýô\u0005\u0001óô\u000bü;¹ø\u0004ý\rö=ãÙ\u001fæöüû÷3Ýë3Õ\tìþ%Û\fûýñ\u0007é\u00131¾\u0003ø?êÇ\u0003\r!Ë\rþÿñ\u0007é\u00131À\tñ\u00057éÕ\tìþ%Û\fûýñ\u0003\u000fï\u0001óô\u000bü;¹ø\u0004ý\rö=êßì\f\u001fÝë3Õ\tìþ%Û\fûýñ\rë\n\u001aáôý\u000bë\tñ\u000f\u0017á\u0005î\u000fí÷3Ùõ\u000b\u0000í\u0003û\u0007\u0002ð\u000bë\tñ\u000f\u0017á\u0005î\u000fí÷'íë\n!×\u0005ö\u0006õøÿ\u0000ï/Ò\u0000ûÿÿ\u0007õø\u001eÙ\u0007\t\u0013ö\u0016öû\fû\u001fÕ\tìþò\u0000<Ìïþû\u000bøñ\u0012ñAÄùø\rñ\u0002\u000bó;ìùã.¹!\r÷%¯Ììþ\fïÿBÊò\u0000<Ìïþû\u000bøñ\u0012ñAÄùø\rñ\u0002\u000bó;Ë3\u0013÷\u0015ö¸ýM¸\u0003óþ\bÿüööQ²\u0005ýðI\u0000ï/Ì\u0001þ\u000bõ\tè.Ô\u00029\u0000ÿøòÒ\týù\u0003Û\u0010ëí\u000fõ÷\u000e\u001fáë\u0011".getBytes("ISO-8859-1"), 0, bArr, 0, 1116);
        $$a = bArr;
        $$b = 138;
        int i6 = $11;
        int i7 = (i6 ^ 67) + ((i6 & 67) << 1);
        $10 = i7 % 128;
        int i8 = i7 % 2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r3v220 ??), method size: 7962
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instructions count: 7962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1vSDK.<clinit>():void");
    }

    public static int getMonetizationNetwork(int i2) {
        Object obj;
        int i3 = 2 % 2;
        int i4 = $10 + 117;
        int i5 = i4 % 128;
        $11 = i5;
        if (i4 % 2 == 0) {
            obj = registerClient;
            int i6 = 13 / 0;
        } else {
            obj = registerClient;
        }
        int i7 = (i5 ^ 103) + ((i5 & 103) << 1);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[53], (short) 524, bArr[344]), true, (ClassLoader) d).getMethod($$c(bArr[620], (short) 1077, (byte) 70), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i9 = $11 + 69;
            $10 = i9 % 128;
            if (i9 % 2 == 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getMediationNetwork(Object obj) {
        Object obj2;
        int i2 = 2 % 2;
        int i3 = $10 + 125;
        int i4 = i3 % 128;
        $11 = i4;
        if (i3 % 2 == 0) {
            obj2 = registerClient;
            int i5 = 24 / 0;
        } else {
            obj2 = registerClient;
        }
        int i6 = i4 + 105;
        int i7 = i6 % 128;
        $10 = i7;
        int i8 = i6 % 2;
        int i9 = (i7 ^ 33) + ((i7 & 33) << 1);
        $11 = i9 % 128;
        int i10 = i9 % 2;
        try {
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[53], (short) 524, bArr[344]), true, (ClassLoader) d).getMethod($$c(bArr[264], (short) 1098, bArr[147]), Object.class).invoke(obj2, obj)).intValue();
            int i11 = $11;
            int i12 = (i11 & 79) + (i11 | 79);
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 27 / 0;
            }
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object AFAdRevenueData(char c, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = i5 + 95;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        Object obj = registerClient;
        int i8 = (i5 ^ 3) + ((i5 & 3) << 1);
        $11 = i8 % 128;
        int i9 = i8 % 2;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i2), Integer.valueOf(i3)};
            byte[] bArr = $$a;
            Object invoke = Class.forName($$c(bArr[53], (short) 524, bArr[344]), true, (ClassLoader) d).getMethod($$c(bArr[620], (short) 1077, (byte) 70), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(obj, objArr);
            int i10 = $10;
            int i11 = (i10 ^ 23) + ((i10 & 23) << 1);
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                return invoke;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFa1vSDK() {
    }
}
