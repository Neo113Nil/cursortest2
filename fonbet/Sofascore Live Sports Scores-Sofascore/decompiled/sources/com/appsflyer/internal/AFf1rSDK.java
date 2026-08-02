package com.appsflyer.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 0;
    private static short[] AFLogger = null;
    private static byte[] d = null;
    private static int force = 1;
    private static int registerClient;
    private static int unregisterClient;
    private static int v;

    static {
        registerClient();
        ViewConfiguration.getGlobalActionKeyTimeout();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getTouchSlop();
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getEdgeSlop();
        int i = v + 85;
        force = i % 128;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r6.length() < 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r6.length() < 20) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        return r6.substring(0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        com.appsflyer.internal.AFf1rSDK.force = (com.appsflyer.internal.AFf1rSDK.v + 37) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFKeystoreWrapper(String str, String str2, String str3, String str4, String str5) {
        String d2;
        int i = v + 41;
        force = i % 128;
        if (i % 2 == 0) {
            String[] strArr = new String[3];
            strArr[0] = str2;
            strArr[1] = str3;
            strArr[3] = str4;
            strArr[3] = str5;
            strArr[5] = "";
            d2 = AFj1xSDK.d(TextUtils.join("\u2063", strArr), str);
        } else {
            d2 = AFj1xSDK.d(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        }
    }

    @NonNull
    private static AFh1eSDK AFLogger(@NonNull AFh1lSDK aFh1lSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if (str == null) {
            return new AFh1eSDK(aFh1lSDK.unregisterClient == AFh1sSDK.DEFAULT, AFh1nSDK.NA);
        }
        String str4 = "";
        Object[] objArr = new Object[1];
        a((byte) (47 - (ViewConfiguration.getPressedStateDuration() >> 16)), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-60075933) + ((byte) KeyEvent.getModifierMetaStateMask()), (-1063431784) + TextUtils.lastIndexOf("", '0'), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFh1lSDK.unregisterClient == AFh1sSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = intern;
        }
        boolean equals = AFKeystoreWrapper(new StringBuilder(str3).reverse().toString(), aFh1lSDK.d, "android", "v1", str4).equals(str);
        return new AFh1eSDK(equals, equals ? AFh1nSDK.SUCCESS : AFh1nSDK.FAILURE);
    }

    private static void a(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        int i4;
        char c;
        int length;
        byte[] bArr;
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        StringBuilder sb = new StringBuilder();
        int i5 = i + ((int) (registerClient ^ 8464533719416152390L));
        if (i5 == -1) {
            $10 = ($11 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            byte[] bArr2 = d;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i6 = 0; i6 < length2; i6++) {
                    bArr3[i6] = (byte) (bArr2[i6] ^ 8464533719416152390L);
                }
                bArr2 = bArr3;
            }
            if (bArr2 != null) {
                int i7 = $11 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                $10 = i7 % 128;
                i5 = (byte) (i7 % 2 != 0 ? ((byte) (d[i3 - ((int) (AFKeystoreWrapper - 8464533719416152390L))] % 8464533719416152390L)) >> ((int) (registerClient * 8464533719416152390L)) : ((byte) (d[i3 + ((int) (AFKeystoreWrapper ^ 8464533719416152390L))] ^ 8464533719416152390L)) + ((int) (registerClient ^ 8464533719416152390L)));
            } else {
                i5 = (short) (((short) (AFLogger[i3 + ((int) (AFKeystoreWrapper ^ 8464533719416152390L))] ^ 8464533719416152390L)) + ((int) (registerClient ^ 8464533719416152390L)));
            }
        }
        if (i5 > 0) {
            aFj1eSDK.registerClient = ((i3 + i5) - 2) + ((int) (AFKeystoreWrapper ^ 8464533719416152390L)) + i4;
            char c2 = (char) (((int) (unregisterClient ^ 8464533719416152390L)) + i2);
            aFj1eSDK.AFKeystoreWrapper = c2;
            sb.append(c2);
            aFj1eSDK.AFLogger = aFj1eSDK.AFKeystoreWrapper;
            byte[] bArr4 = d;
            if (bArr4 != null) {
                int i8 = $10 + 107;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                }
                for (int i9 = 0; i9 < length; i9++) {
                    $11 = ($10 + 31) % 128;
                    bArr[i9] = (byte) (bArr4[i9] ^ 8464533719416152390L);
                }
                bArr4 = bArr;
            }
            boolean z = bArr4 != null;
            aFj1eSDK.d = 1;
            while (aFj1eSDK.d < i5) {
                int i10 = aFj1eSDK.registerClient;
                if (z) {
                    byte[] bArr5 = d;
                    aFj1eSDK.registerClient = i10 - 1;
                    c = (char) (aFj1eSDK.AFLogger + (((byte) (((byte) (bArr5[i10] ^ 8464533719416152390L)) + s)) ^ b));
                    aFj1eSDK.AFKeystoreWrapper = c;
                } else {
                    short[] sArr = AFLogger;
                    aFj1eSDK.registerClient = i10 - 1;
                    c = (char) (aFj1eSDK.AFLogger + (((short) (((short) (sArr[i10] ^ 8464533719416152390L)) + s)) ^ b));
                    aFj1eSDK.AFKeystoreWrapper = c;
                }
                sb.append(c);
                aFj1eSDK.AFLogger = aFj1eSDK.AFKeystoreWrapper;
                aFj1eSDK.d++;
            }
        }
        objArr[0] = sb.toString();
    }

    public static void registerClient() {
        AFKeystoreWrapper = 545197871;
        registerClient = 522035582;
        unregisterClient = 478744215;
        d = new byte[]{102, -106, -106, -106, 106, -104, 99, 111, -106, -110, 105, 105, 109, -106, -108, 106, 104, 107, -109, -97, 101, -103, 102, -106, 107, -99, 98, 107, -106, -106, 105, 108, -107, 107, -108, -101, 121, 109, -107, -107, 109, -110, 110, -108, 104, -105, 109, 105, -105, 105, 107, -112, 107, -105, 111, -108, -106, 104, 106, 105, -107, 109, 105, 70};
    }

    @NonNull
    public final AFh1eSDK registerClient(@NonNull AFh1lSDK aFh1lSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if (aFh1lSDK != null && str2 != null && str3 != null) {
            force = (v + 5) % 128;
            return AFLogger(aFh1lSDK, str, str2, str3);
        }
        AFh1eSDK aFh1eSDK = new AFh1eSDK(false, AFh1nSDK.INTERNAL_ERROR);
        int i = force + 19;
        v = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 0;
        }
        return aFh1eSDK;
    }
}
