package com.appsflyer.internal;

import java.util.Map;

/* loaded from: classes6.dex */
public class AFi1fSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AFLogger;
    private static int afInfoLog;
    private static Object d;
    private static Object e;
    private static long force;
    private static long i;
    public static final Map registerClient;
    private static byte[] unregisterClient;
    public static final Map valueOf;
    private static long w;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0059 -> B:4:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = $11;
        int i8 = i7 + 21;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        byte[] bArr = $$a;
        int i10 = (((i3 | (-42)) << 1) - (i3 ^ (-42))) + 46;
        int i11 = i2 + 1;
        int i12 = -b;
        int i13 = ((i12 | 119) << 1) - (i12 ^ 119);
        byte[] bArr2 = new byte[i11];
        if (bArr == null) {
            int i14 = i7 + 35;
            int i15 = i14 % 128;
            $10 = i15;
            int i16 = i14 % 2;
            int i17 = i15 + 35;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i11;
            int i20 = i10;
            i5 = 0;
            int i21 = -i19;
            int i22 = ((i21 * (-830)) - (~(-(-(i10 * 832))))) - 1;
            int i23 = ~i10;
            int i24 = ~i2;
            int i25 = ~((i23 & i24) | (i23 ^ i24));
            int i26 = (i21 ^ i10) | (i21 & i10);
            int i27 = ~((i26 & i2) | (i26 ^ i2));
            int i28 = -(-(((i25 & i27) | (i25 ^ i27)) * (-831)));
            int i29 = ((i22 | i28) << 1) - (i22 ^ i28);
            int i30 = (~i10) | i21;
            int i31 = -(-((~((i30 & i2) | (i30 ^ i2))) * (-1662)));
            int i32 = ((i29 | i31) << 1) - (i31 ^ i29);
            int i33 = ~i21;
            int i34 = ~i2;
            int i35 = -(-(((~((i21 & i2) | (i21 ^ i2))) | (~((i33 & i34) | (i33 ^ i34))) | (~((i10 & i2) | (i10 ^ i2)))) * 831));
            int i36 = ((i32 | i35) << 1) - (i35 ^ i32);
            int i37 = (-2035) - (~(-(-(i36 * (-676)))));
            int i38 = (i37 & 1354) + (i37 | 1354);
            int i39 = ~i36;
            int i40 = -(-((2 | i39) * (-677)));
            int i41 = (i38 & i40) + (i40 | i38);
            int i42 = (~((i39 & (-3)) | (i39 ^ (-3)))) * 677;
            i10 = i20;
            i13 = (i42 | i41) + (i41 & i42);
            i4 = i5;
            int i43 = ((i10 | 36) << 1) - (i10 ^ 36);
            int i44 = ((i43 | (-35)) << 1) - (i43 ^ (-35));
            int i45 = i4 + 4;
            i5 = (i45 & (-3)) + (i45 | (-3));
            bArr2[i4] = (byte) i13;
            if (i5 == i11) {
                return new String(bArr2, 0);
            }
            i19 = bArr[i44];
            int i46 = $11;
            int i47 = (i46 ^ 23) + ((i46 & 23) << 1);
            $10 = i47 % 128;
            int i48 = i47 % 2;
            int i49 = i13;
            i20 = i44;
            i10 = i49;
            int i212 = -i19;
            int i222 = ((i212 * (-830)) - (~(-(-(i10 * 832))))) - 1;
            int i232 = ~i10;
            int i242 = ~i2;
            int i252 = ~((i232 & i242) | (i232 ^ i242));
            int i262 = (i212 ^ i10) | (i212 & i10);
            int i272 = ~((i262 & i2) | (i262 ^ i2));
            int i282 = -(-(((i252 & i272) | (i252 ^ i272)) * (-831)));
            int i292 = ((i222 | i282) << 1) - (i222 ^ i282);
            int i302 = (~i10) | i212;
            int i312 = -(-((~((i302 & i2) | (i302 ^ i2))) * (-1662)));
            int i322 = ((i292 | i312) << 1) - (i312 ^ i292);
            int i332 = ~i212;
            int i342 = ~i2;
            int i352 = -(-(((~((i212 & i2) | (i212 ^ i2))) | (~((i332 & i342) | (i332 ^ i342))) | (~((i10 & i2) | (i10 ^ i2)))) * 831));
            int i362 = ((i322 | i352) << 1) - (i352 ^ i322);
            int i372 = (-2035) - (~(-(-(i362 * (-676)))));
            int i382 = (i372 & 1354) + (i372 | 1354);
            int i392 = ~i362;
            int i402 = -(-((2 | i392) * (-677)));
            int i412 = (i382 & i402) + (i402 | i382);
            int i422 = (~((i392 & (-3)) | (i392 ^ (-3)))) * 677;
            i10 = i20;
            i13 = (i422 | i412) + (i412 & i422);
            i4 = i5;
            int i432 = ((i10 | 36) << 1) - (i10 ^ 36);
            int i442 = ((i432 | (-35)) << 1) - (i432 ^ (-35));
            int i452 = i4 + 4;
            i5 = (i452 & (-3)) + (i452 | (-3));
            bArr2[i4] = (byte) i13;
            if (i5 == i11) {
            }
        } else {
            i4 = 0;
            int i4322 = ((i10 | 36) << 1) - (i10 ^ 36);
            int i4422 = ((i4322 | (-35)) << 1) - (i4322 ^ (-35));
            int i4522 = i4 + 4;
            i5 = (i4522 & (-3)) + (i4522 | (-3));
            bArr2[i4] = (byte) i13;
            if (i5 == i11) {
            }
        }
    }

    static void init$0() {
        int i2;
        int i3 = 2 % 2;
        int i4 = $10 + 113;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            byte[] bArr = new byte[1098];
            System.arraycopy("CeÙgñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Æ\u0012\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:É3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÙ6Í\u000b\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÚ5Æ\u0012\föõýÿî.Ë\u0000ý\nô\bç-Ó\u00018ÿþ÷ñÑ\bü\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5È\u0010\fö$´Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:È4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010".getBytes("ISO-8859-1"), 0, bArr, 0, 1098);
            $$a = bArr;
            i2 = 20767;
        } else {
            byte[] bArr2 = new byte[1098];
            System.arraycopy("CeÙgñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Æ\u0012\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:É3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÙ6Í\u000b\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÚ5Æ\u0012\föõýÿî.Ë\u0000ý\nô\bç-Ó\u00018ÿþ÷ñÑ\bü\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5È\u0010\fö$´Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:È4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010".getBytes("ISO-8859-1"), 0, bArr2, 0, 1098);
            $$a = bArr2;
            i2 = 189;
        }
        $$b = i2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        /*
            Method dump skipped, instructions count: 7322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1fSDK.<clinit>():void");
    }

    public static int getRevenue(int i2) {
        int i3 = 2 % 2;
        int i4 = $11 + 25;
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        Object obj = e;
        int i7 = i5 + 71;
        int i8 = i7 % 128;
        $11 = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 37;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            return ((Integer) Class.forName($$c(bArr[264], bArr[857], (short) 523), true, (ClassLoader) d).getMethod($$c(bArr[168], bArr[301], (short) 555), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFAdRevenueData(Object obj) {
        int i2 = 2 % 2;
        int i3 = $11 + 73;
        $10 = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        Object obj3 = e;
        try {
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[264], bArr[857], (short) 523), true, (ClassLoader) d).getMethod($$c(bArr[207], bArr[250], (short) 1079), Object.class).invoke(obj3, obj)).intValue();
            int i4 = $11 + 15;
            $10 = i4 % 128;
            if (i4 % 2 == 0) {
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

    public static Object AFAdRevenueData(int i2, int i3, char c) {
        Object obj;
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = i5 + 31;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            obj = e;
            int i7 = 1 / 0;
        } else {
            obj = e;
        }
        int i8 = i5 + 65;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(c)};
            byte[] bArr = $$a;
            Object invoke = Class.forName($$c(bArr[264], bArr[857], (short) 523), true, (ClassLoader) d).getMethod($$c(bArr[168], bArr[301], (short) 555), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj, objArr);
            int i10 = $10 + 35;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFi1fSDK() {
    }
}
