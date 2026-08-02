package com.appsflyer.internal;

import com.google.android.exoplayer2.C;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* loaded from: classes8.dex */
public class AFi1mSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventParameterName;
    private static int afDebugLog;
    private static int afErrorLog;
    private static long afInfoLog;
    private static int afVerboseLog;
    public static final Map d;
    private static Object e;
    private static long force;
    private static byte[] i;
    private static Object unregisterClient;
    private static int v;
    private static byte[] w;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0039 -> B:7:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i3, short s) {
        int i4;
        int i5 = 2 % 2;
        int i6 = $13 + 63;
        int i7 = i6 % 128;
        $12 = i7;
        int i8 = i6 % 2;
        int i9 = 119 - i2;
        int i10 = i3 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[49 - s];
        int i11 = 48 - s;
        if (bArr == null) {
            int i12 = i7 + 101;
            $13 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 53 / 0;
            }
            i9 = i10;
            int i14 = i11;
            int i15 = 0;
            i10++;
            i9 = (i9 + (-i14)) - 3;
            int i16 = $13 + 27;
            $12 = i16 % 128;
            int i17 = i16 % 2;
            i4 = i15;
            bArr2[i4] = (byte) i9;
            i15 = i4 + 1;
            if (i4 == i11) {
                return new String(bArr2, 0);
            }
            i14 = bArr[i10];
            i10++;
            i9 = (i9 + (-i14)) - 3;
            int i162 = $13 + 27;
            $12 = i162 % 128;
            int i172 = i162 % 2;
            i4 = i15;
            bArr2[i4] = (byte) i9;
            i15 = i4 + 1;
            if (i4 == i11) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i9;
            i15 = i4 + 1;
            if (i4 == i11) {
            }
        }
    }

    static void init$0() {
        int i2;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = (i4 ^ 47) + ((i4 & 47) << 1);
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            byte[] bArr = new byte[1156];
            System.arraycopy("J\u0000G\u0098ñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5¿\u0019\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:õ\u0004É.úúýÑ.øÐýþ)\u0001Ñû3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÙ6Í\u000b\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÚ5¿\u0019\föõýÿî.Ë\u0000ý\nô\bç-Ó\u00018ÿþ÷ñÑ\bü\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Á\u0017\fö$ÀËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ë'Î/þþÍü-÷þ\u0002Í)ûÒ4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHÿî\u001fêì\u000eôö\rÿî$åþø\u0005ê\b÷þ\u001dæîú\u0005ú\u0004ø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010".getBytes(C.ISO88591_NAME), 0, bArr, 0, 1156);
            $$a = bArr;
            i2 = 50;
        } else {
            byte[] bArr2 = new byte[1156];
            System.arraycopy("J\u0000G\u0098ñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5¿\u0019\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:õ\u0004É.úúýÑ.øÐýþ)\u0001Ñû3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÙ6Í\u000b\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÚ5¿\u0019\föõýÿî.Ë\u0000ý\nô\bç-Ó\u00018ÿþ÷ñÑ\bü\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Á\u0017\fö$ÀËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ë'Î/þþÍü-÷þ\u0002Í)ûÒ4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHÿî\u001fêì\u000eôö\rÿî$åþø\u0005ê\b÷þ\u001dæîú\u0005ú\u0004ø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010".getBytes(C.ISO88591_NAME), 0, bArr2, 0, 1156);
            $$a = bArr2;
            i2 = 98;
        }
        $$b = i2;
        int i6 = $10;
        int i7 = (i6 ^ 33) + ((i6 & 33) << 1);
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 42 / 0;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r51v16 ??), method size: 7416
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instructions count: 7416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1mSDK.<clinit>():void");
    }

    public static int getMediationNetwork(int i2) {
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 17;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object obj = e;
        int i7 = (i4 ^ 15) + ((i4 & 15) << 1);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            byte b = bArr[264];
            Class<?> cls = Class.forName($$c(b, (short) ((b ^ 520) | (b & 520)), bArr[168]), true, (ClassLoader) unregisterClient);
            byte b2 = bArr[207];
            int i9 = $$b;
            return ((Integer) cls.getMethod($$c(b2, (short) ((i9 & IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION) | (i9 ^ IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION)), bArr[67]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getRevenue(Object obj) {
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = i3 + 17;
        $11 = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        Object obj3 = e;
        int i5 = i3 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        int i6 = i5 % 128;
        $11 = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 107;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        try {
            byte b = $$a[264];
            int intValue = ((Integer) Class.forName($$c(b, (short) ((b ^ 520) | (b & 520)), r1[168]), true, (ClassLoader) unregisterClient).getMethod($$c(r1[168], (short) 1120, r1[152]), Object.class).invoke(obj3, obj)).intValue();
            int i10 = $11 + 35;
            $10 = i10 % 128;
            if (i10 % 2 == 0) {
                return intValue;
            }
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

    public static Object getRevenue(char c, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = (i5 & 115) + (i5 | 115);
        $11 = i6 % 128;
        int i7 = i6 % 2;
        Object obj = e;
        int i8 = ((i5 | 33) << 1) - (i5 ^ 33);
        int i9 = i8 % 128;
        $11 = i9;
        int i10 = i8 % 2;
        int i11 = (i9 ^ 23) + ((i9 & 23) << 1);
        $10 = i11 % 128;
        int i12 = i11 % 2;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i2), Integer.valueOf(i3)};
            byte[] bArr = $$a;
            byte b = bArr[264];
            Class<?> cls = Class.forName($$c(b, (short) ((b ^ 520) | (b & 520)), bArr[168]), true, (ClassLoader) unregisterClient);
            byte b2 = bArr[168];
            return cls.getMethod($$c(b2, (short) ((b2 ^ 1095) | (b2 & 1095)), bArr[788]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFi1mSDK() {
    }

    private static void getRevenue(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = (i5 ^ 99) + ((i5 & 99) << 1);
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
    }
}
