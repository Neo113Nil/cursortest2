package com.appsflyer.internal;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* loaded from: classes.dex */
public class AFi1ySDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    private static Object enableTCFDataCollection;
    private static byte[] getInstance;
    public static final Map getLevel;
    private static int getOutOfStore;
    private static byte[] getSdkVersion;
    private static Object onPause;
    private static long setAndroidIdData;
    private static long setDebugLog;
    private static int setImeiData;
    private static int setOaidData;
    private static int setOutOfStore;
    private static byte[] setPhoneNumber;
    public static final Map stop;
    private static long updateServerUninstallToken;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:4:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4 = i2 + 33;
        byte[] bArr = $$a;
        int i5 = i + 4;
        byte[] bArr2 = new byte[b + 1];
        if (bArr == null) {
            $12 = ($13 + 47) % 128;
            byte b2 = b;
            i3 = 0;
            i4 = (i4 + b2) - 3;
            bArr2[i3] = (byte) i4;
            i5++;
            if (i3 == b) {
                String str = new String(bArr2, 0);
                int i6 = $12 + 97;
                $13 = i6 % 128;
                if (i6 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            i3++;
            b2 = bArr[i5];
            $13 = ($12 + 25) % 128;
            i4 = (i4 + b2) - 3;
            bArr2[i3] = (byte) i4;
            i5++;
            if (i3 == b) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i5++;
            if (i3 == b) {
            }
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
            Method dump skipped, instructions count: 8082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1ySDK.<clinit>():void");
    }

    private AFi1ySDK() {
    }

    public static int AFKeystoreWrapper(int i) {
        int i2 = $11;
        int i3 = ((i2 ^ 81) + ((i2 & 81) << 1)) % 128;
        $10 = i3;
        Object obj = enableTCFDataCollection;
        $11 = ((i3 ^ 53) + ((i3 & 53) << 1)) % 128;
        try {
            int intValue = ((Integer) Class.forName($$c(584, r1[510], (byte) (-$$a[19])), true, (ClassLoader) onPause).getMethod($$c(1166, r1[26], (byte) ($$b & 371)), Integer.TYPE).invoke(obj, Integer.valueOf(i))).intValue();
            int i4 = $11 + 63;
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

    public static Object d(char c, int i, int i2) {
        int i3 = $11 + 77;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Object obj = enableTCFDataCollection;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            Class<?> cls = Class.forName($$c(584, r4[510], (byte) (-$$a[19])), true, (ClassLoader) onPause);
            String $$c = $$c(1151, r4[50], (byte) ($$b & 374));
            Class cls2 = Character.TYPE;
            Class cls3 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls3, cls3).invoke(obj, objArr);
            $10 = ($11 + 3) % 128;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        $10 = ($11 + 67) % 128;
        byte[] bArr = new byte[1184];
        System.arraycopy("~\u000b\u001ct\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾9\u0011ò\u0019í\u0004\rüÌ\u00191ò\u0019í\u0004\rüö\u0011ÿ\u0000\ròí$ô\u0005\t\u000e\b\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b&ËJÞô\n\u000b\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0005\u00064×0Ò4Ó\u00051Ï\u00042Ó\t.Í\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b'Ê;íô\n\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b&ËJÞô\n\u000b\u0003\b\b\u001d\u0017ý\u0004þ\u0006öõ\u001eò\u0012\u0003ø\u0010û\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b&ËKÝô\nÜO5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\t\u0006ÿ\u0003\u0006.Ò\u0005\u0001\u0002\u00071\u0002\u0006\u0003\u0004\u0002Ìî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸ü\u0007ö\u0005\u0005\r\u0004ô\u0010Ô,\u0000ÿ\f\tö\u0005\u0005\r\u0004ô\u0010Ô,\u0000ÿ\f\t".getBytes("ISO-8859-1"), 0, bArr, 0, 1184);
        $$a = bArr;
        $$b = Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE;
        int i = $10;
        $11 = ((i & 91) + (i | 91)) % 128;
    }

    private static void registerClient(int i, int i2) {
        int i3 = $11;
        $10 = (((i3 | Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) << 1) - (i3 ^ Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)) % 128;
    }

    public static int AFKeystoreWrapper(Object obj) {
        int i = $10;
        Object obj2 = enableTCFDataCollection;
        $11 = ((i & 99) + (i | 99)) % 128;
        try {
            int intValue = ((Integer) Class.forName($$c(584, r0[510], (byte) (-$$a[19])), true, (ClassLoader) onPause).getMethod($$c(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, r0[4], r0[510]), Object.class).invoke(obj2, obj)).intValue();
            int i2 = $10;
            $11 = ((i2 ^ 43) + ((i2 & 43) << 1)) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
