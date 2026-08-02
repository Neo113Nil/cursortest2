package com.appsflyer.internal;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.is8;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class AFb1ySDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    private static Object enableTCFDataCollection;
    public static final Map getInstance;
    public static final Map getLevel;
    private static int getOutOfStore;
    private static Object getSdkVersion;
    private static byte[] onPause;
    private static int setAndroidIdData;
    private static byte[] setCustomerUserId;
    private static long setDebugLog;
    private static long setImeiData;
    private static int setOaidData;
    private static int setOutOfStore;
    private static byte[] stop;
    private static long updateServerUninstallToken;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003a -> B:6:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = 119 - b;
        byte[] bArr2 = new byte[49 - s];
        int i5 = 48 - s;
        if (bArr == null) {
            int i6 = $12 + 17;
            $13 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i4;
            int i9 = i3;
            int i10 = (i8 + (-i3)) - 1;
            int i11 = i9;
            i4 = i10;
            i3 = i11;
            bArr = bArr3;
            i2 = i7;
            int i12 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
                String str = new String(bArr2, 0);
                $12 = ($13 + 31) % 128;
                return str;
            }
            int i13 = i4;
            i9 = i12;
            i3 = bArr[i12];
            bArr3 = bArr;
            i8 = i13;
            int i102 = (i8 + (-i3)) - 1;
            int i112 = i9;
            i4 = i102;
            i3 = i112;
            bArr = bArr3;
            i2 = i7;
            int i122 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i1222 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:10|11|(1:13)(1:1051)|14|(8:15|16|17|18|19|20|21|22)|(39:24|25|26|(38:1025|1026|1027|1028|1029|(35:1016|1017|1018|1019|1020|(32:1007|1008|1009|1010|1011|36|(1:38)(1:(2:990|(1:992)(2:993|994))(26:998|999|1000|(1:41)(7:970|971|972|973|974|975|976)|(2:43|(3:45|46|47))|54|55|56|57|58|59|60|61|(1:63)(1:964)|64|(1:68)(1:963)|69|70|(1:72)(1:961)|73|(1:75)(1:960)|76|77|(2:79|(2:81|(4:83|84|85|86)(1:953))(2:955|956))|957|958))|39|(0)(0)|(0)|54|55|56|57|58|59|60|61|(0)(0)|64|(12:66|68|69|70|(0)(0)|73|(0)(0)|76|77|(0)|957|958)|963|69|70|(0)(0)|73|(0)(0)|76|77|(0)|957|958)|34|35|36|(0)(0)|39|(0)(0)|(0)|54|55|56|57|58|59|60|61|(0)(0)|64|(0)|963|69|70|(0)(0)|73|(0)(0)|76|77|(0)|957|958)|31|32|(0)|34|35|36|(0)(0)|39|(0)(0)|(0)|54|55|56|57|58|59|60|61|(0)(0)|64|(0)|963|69|70|(0)(0)|73|(0)(0)|76|77|(0)|957|958)|28|29|(0)|31|32|(0)|34|35|36|(0)(0)|39|(0)(0)|(0)|54|55|56|57|58|59|60|61|(0)(0)|64|(0)|963|69|70|(0)(0)|73|(0)(0)|76|77|(0)|957|958)|1034|1035|1036|1037|1038|26|(0)|28|29|(0)|31|32|(0)|34|35|36|(0)(0)|39|(0)(0)|(0)|54|55|56|57|58|59|60|61|(0)(0)|64|(0)|963|69|70|(0)(0)|73|(0)(0)|76|77|(0)|957|958) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x04a7, code lost:
    
        if (r42 == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x04a9, code lost:
    
        if (r12 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x04ab, code lost:
    
        com.appsflyer.internal.AFb1ySDK.$11 = ((r0 ^ 51) + ((r0 & 51) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04b7, code lost:
    
        r0 = com.appsflyer.internal.AFb1ySDK.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x04be, code lost:
    
        r49 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04e8, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r0[r31], r0[r30])).getMethod($$c(303, r0[r18], r0[829(0x33d, float:1.162E-42)]), null).invoke(r12, null)).booleanValue() == false) goto L872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0581, code lost:
    
        if (r42 == false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0583, code lost:
    
        r0 = new java.util.Random();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0588, code lost:
    
        r6 = com.appsflyer.internal.AFb1ySDK.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0591, code lost:
    
        r50 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x05be, code lost:
    
        r0.setSeed(((java.lang.Long) java.lang.Class.forName($$c(240, r6[r31], r6[193(0xc1, float:2.7E-43)])).getMethod($$c(332, r6[r18], r6[198(0xc6, float:2.77E-43)]), null).invoke(null, null)).longValue() ^ (-1588416808));
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x05c1, code lost:
    
        r4 = null;
        r5 = null;
        r6 = null;
        r10 = null;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x05c5, code lost:
    
        if (r4 != null) goto L1063;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x05c7, code lost:
    
        if (r5 != null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x05c9, code lost:
    
        r51 = com.appsflyer.internal.AFb1ySDK.$10;
        r53 = r4;
        r4 = (r51 ^ 63) + ((r51 & 63) << 1);
        r51 = r5;
        com.appsflyer.internal.AFb1ySDK.$11 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x05dd, code lost:
    
        if ((r4 % 2) != 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x05df, code lost:
    
        r4 = 111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x05f4, code lost:
    
        r52 = r6;
        r5 = new java.lang.StringBuilder(r4 + 1);
        r5.append('.');
        r6 = r20;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0604, code lost:
    
        if (r6 >= r4) goto L1066;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0606, code lost:
    
        if (r44 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0608, code lost:
    
        r54 = r4;
        r4 = r0.nextInt(26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0614, code lost:
    
        if (r0.nextBoolean() == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0616, code lost:
    
        r56 = r6;
        r55 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x061e, code lost:
    
        r6 = (int) java.lang.System.currentTimeMillis();
        r7 = r4 * (-813);
        r57 = r8;
        r8 = ((r7 | 26520) << 1) - (r7 ^ 26520);
        r7 = ~(((-66) ^ r4) | ((-66) & r4));
        r7 = (r4 ^ r6) | (r4 & r6);
        r8 = ~r7;
        r8 = ((r7 ^ r8) | (r7 & r8)) * (-814);
        r59 = ((r8 | r8) << 1) - (r8 ^ r8);
        r8 = ~((-66) | (~r6));
        r4 = ~r4;
        r60 = r4 & 65;
        r61 = r4;
        r4 = ~((r4 ^ 65) | r60);
        r8 = r8 | r4;
        r7 = ~r7;
        r7 = -(-(((r8 ^ r7) | (r7 & r8)) * 407));
        r8 = ((((r59 | r7) << 1) - (r59 ^ r7)) - (~(((r4 | (~((r61 ^ r6) | (r61 & r6)))) | (~((r6 & 65) | (r6 ^ 65)))) * 407))) - 1;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x069a, code lost:
    
        r5.append((char) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x06bd, code lost:
    
        r6 = ((r56 & 1) << 1) + (r56 ^ 1);
        r4 = r54;
        r7 = r55;
        r8 = r57;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x069e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0571, code lost:
    
        r56 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0573, code lost:
    
        r63 = r11;
        r60 = r14;
        r61 = r15;
        r14 = r21;
        r32 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0509, code lost:
    
        r2 = r2;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x1b09, code lost:
    
        r6 = (int) java.lang.System.currentTimeMillis();
        r7 = ~(((-765677037) & r6) | ((-765677037) ^ r6));
        r8 = (-1066209530) - (~(((r7 & (-1604070293)) | ((-1604070293) ^ r7)) * (-366)));
        r6 = ~(r6 | (-226494853));
        r6 = ((r6 & (-2143252477)) | ((-2143252477) ^ r6)) * 366;
        r7 = (r8 ^ r6) + ((r6 & r8) << 1);
        r6 = (int) java.lang.System.currentTimeMillis();
        r8 = ~r6;
        r8 = ~(((r8 & 206496413) | (206496413 ^ r8)) | 1459141475);
        r10 = ~(((-134627485) & r6) | ((-134627485) ^ r6));
        r10 = 1930405024 - (~(((r8 & r10) | (r8 ^ r10)) * 988));
        r11 = (r10 & 1609266140) + (1609266140 | r10);
        r8 = (~((206496413 & r6) | (206496413 ^ r6))) | 1387272546;
        r6 = ~r6;
        r6 = (r6 & 1459141475) | (r6 ^ 1459141475);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x1b83, code lost:
    
        if (r7 <= ((((~((r6 & (-206496414)) | (r6 ^ (-206496414)))) | r8) * 988) + r11)) goto L770;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x1b87, code lost:
    
        if (r61[r4] != false) goto L1069;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x1b98, code lost:
    
        r6 = (r4 ^ com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) + ((r4 & com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) << 1);
        r4 = ((r6 | (-114)) << 1) - (r6 ^ (-114));
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x1b89, code lost:
    
        com.appsflyer.internal.AFb1ySDK.getSdkVersion = null;
        com.appsflyer.internal.AFb1ySDK.enableTCFDataCollection = null;
        r4 = 2;
        r20 = 0;
        r22 = 1;
        r31 = 379;
        r2 = r2;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x1baa, code lost:
    
        r0 = r61[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x1bae, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0686, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x056f, code lost:
    
        r57 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0689, code lost:
    
        r56 = r6;
        r55 = r7;
        r57 = r8;
        r4 = -(-r4);
        r8 = ((r4 | 96) << 1) - (r4 ^ 96);
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x06a4, code lost:
    
        r54 = r4;
        r56 = r6;
        r55 = r7;
        r57 = r8;
        r4 = r0.nextInt(12);
        r5.append((char) (((r4 | 8192) << 1) - (r4 ^ 8192)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x06cc, code lost:
    
        r55 = r7;
        r57 = r8;
        r4 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x06d4, code lost:
    
        if (r51 != null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x06d8, code lost:
    
        r6 = new java.lang.Object[r37];
        r6[r22] = r4;
        r6[r20] = r12;
        r4 = com.appsflyer.internal.AFb1ySDK.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x070a, code lost:
    
        r5 = java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[r31], r4[r30])).getDeclaredConstructor(java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[r31], r4[r30])), java.lang.String.class).newInstance(r6);
        r56 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x070d, code lost:
    
        r6 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x070f, code lost:
    
        r4 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x084d, code lost:
    
        r7 = r55;
        r9 = r56;
        r8 = r57;
        r37 = 2;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0713, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0714, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0718, code lost:
    
        if (r4 != null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x071a, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x071b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x071c, code lost:
    
        if (r52 != null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x071e, code lost:
    
        r5 = com.appsflyer.internal.AFb1ySDK.$10;
        com.appsflyer.internal.AFb1ySDK.$11 = (((r5 | 93) << 1) - (r5 ^ 93)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x072c, code lost:
    
        r6 = new java.lang.Object[2];
        r6[r22] = r4;
        r6[r20] = r12;
        r4 = com.appsflyer.internal.AFb1ySDK.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x075e, code lost:
    
        r6 = java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[r31], r4[r30])).getDeclaredConstructor(java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[r31], r4[r30])), java.lang.String.class).newInstance(r6);
        r56 = r9;
        r5 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0764, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0765, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0769, code lost:
    
        if (r4 != null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x076b, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x076c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x076d, code lost:
    
        if (r10 != null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0770, code lost:
    
        r6 = new java.lang.Object[2];
        r6[r22] = r4;
        r6[r20] = r12;
        r4 = com.appsflyer.internal.AFb1ySDK.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x07a2, code lost:
    
        r10 = java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[r31], r4[r30])).getDeclaredConstructor(java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[r31], r4[r30])), java.lang.String.class).newInstance(r6);
        r56 = r9;
        r5 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x07a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x07aa, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x07ae, code lost:
    
        if (r4 != null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x07b0, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x07b1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x07b3, code lost:
    
        r6 = new java.lang.Object[2];
        r6[r22] = r4;
        r6[r20] = r12;
        r4 = com.appsflyer.internal.AFb1ySDK.$$a;
        r4 = java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[r31], r4[r30])).getDeclaredConstructor(java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[r31], r4[r30])), java.lang.String.class).newInstance(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x07e9, code lost:
    
        com.appsflyer.internal.AFb1ySDK.$11 = (com.appsflyer.internal.AFb1ySDK.$10 + 11) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x080b, code lost:
    
        r56 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0824, code lost:
    
        java.lang.Class.forName($$c(348, r4[r31], (byte) (-r4[228(0xe4, float:3.2E-43)]))).getMethod($$c(371, r4[r18], r4[842(0x34a, float:1.18E-42)]), null).invoke(java.lang.Class.forName($$c(348, r4[r31], (byte) (-r4[228(0xe4, float:3.2E-43)]))).getDeclaredConstructor(java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[r31], r4[r30]))).newInstance(r4), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0849, code lost:
    
        r5 = r51;
        r6 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0857, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0858, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x085c, code lost:
    
        if (r5 != null) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x085e, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0864, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0865, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x086a, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x086e, code lost:
    
        if (r5 != null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0870, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0871, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0867, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0862, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0872, code lost:
    
        r5 = new java.lang.StringBuilder();
        r6 = com.appsflyer.internal.AFb1ySDK.$$a;
        r5.append($$c(375, r6[125(0x7d, float:1.75E-43)], r6[842(0x34a, float:1.18E-42)]));
        r5.append(r4);
        r5.append($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, r6[1141(0x475, float:1.599E-42)], r6[75]));
        r4 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x089f, code lost:
    
        r7 = new java.lang.Object[2];
        r7[r22] = r0;
        r7[r20] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x08c4, code lost:
    
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, r6[r31], (byte) (-r6[511(0x1ff, float:7.16E-43)]))).getDeclaredConstructor(java.lang.String.class, r2).newInstance(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x08c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x08c6, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x08ca, code lost:
    
        if (r4 != null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x08cc, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x08cd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x08ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x08cf, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x08d5, code lost:
    
        if (r4 != null) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x08d7, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x08d8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x085f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x05e2, code lost:
    
        r4 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05e5, code lost:
    
        r53 = r4;
        r51 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x05e9, code lost:
    
        if (r6 != null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x05eb, code lost:
    
        r4 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x05ed, code lost:
    
        if (r10 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x05ef, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x05f2, code lost:
    
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x08d9, code lost:
    
        r53 = r4;
        r51 = r5;
        r52 = r6;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x08df, code lost:
    
        r55 = r7;
        r57 = r8;
        r56 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0904, code lost:
    
        r0 = com.appsflyer.internal.AFb1ySDK.$$a;
        r4 = $$c(r31, (byte) (-r0[752(0x2f0, float:1.054E-42)]), r0[135(0x87, float:1.89E-43)]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0917, code lost:
    
        com.appsflyer.internal.AFb1ySDK.$10 = (com.appsflyer.internal.AFb1ySDK.$11 + 27) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x093d, code lost:
    
        r6 = (java.lang.String) java.lang.Class.forName($$c(437, r0[379(0x17b, float:5.31E-43)], r0[r30])).getMethod($$c(448, r0[r25], r0[159(0x9f, float:2.23E-43)]), null).invoke(java.lang.Class.class.getMethod($$c(427, r0[r25], r0[r24]), java.lang.String.class).invoke(com.appsflyer.internal.AFb1ySDK.class, r4), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0987, code lost:
    
        r7 = new java.util.zip.ZipFile(r6.substring(5, r6.lastIndexOf($$c(454, (byte) 86, r0[75]) + r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x098e, code lost:
    
        r6 = new byte[8038];
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x099e, code lost:
    
        r4 = new java.lang.Object[]{r7.getInputStream(r7.getEntry(r4.substring(r22)))};
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x09a6, code lost:
    
        r8 = r0[379(0x17b, float:5.31E-43)];
        r32 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x09ac, code lost:
    
        r4 = java.lang.Class.forName($$c(454, r8, r0[310(0x136, float:4.34E-43)])).getDeclaredConstructor(java.lang.Class.forName($$c(480, r0[379(0x17b, float:5.31E-43)], (byte) (-r0[511(0x1ff, float:7.16E-43)])))).newInstance(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x09d3, code lost:
    
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x09d9, code lost:
    
        r4 = java.lang.Class.forName($$c(498, r0[379(0x17b, float:5.31E-43)], r0[474(0x1da, float:6.64E-43)])).getDeclaredConstructor(java.lang.Class.forName($$c(480, r0[379(0x17b, float:5.31E-43)], (byte) (-r0[511(0x1ff, float:7.16E-43)])))).newInstance(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0a0a, code lost:
    
        r60 = r6;
        java.lang.Class.forName($$c(498, r0[379(0x17b, float:5.31E-43)], r0[474(0x1da, float:6.64E-43)])).getMethod($$c(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, r0[r27], r0[150(0x96, float:2.1E-43)]), byte[].class).invoke(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0a3f, code lost:
    
        java.lang.Class.forName($$c(498, r0[379(0x17b, float:5.31E-43)], r0[474(0x1da, float:6.64E-43)])).getMethod($$c(371, r0[r18], r0[842(0x34a, float:1.18E-42)]), null).invoke(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0a63, code lost:
    
        r4 = 22;
        r0 = 7994;
        r8 = r57;
        r6 = r60;
        r5 = null;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0a6f, code lost:
    
        r9 = r6.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0a70, code lost:
    
        r60 = 1;
        r58 = r10;
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0a76, code lost:
    
        if (r12 >= r9) goto L1071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0a7c, code lost:
    
        r60 = ((r6[r12] + (r60 << r35)) + (r60 << 16)) - r60;
        r12 = r12 + 1;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0a8e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0a8f, code lost:
    
        r5 = r0;
        r4 = r7;
        r63 = r11;
        r60 = r14;
        r61 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0a97, code lost:
    
        r14 = r21;
        r2 = r2;
        r4 = r4;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0a99, code lost:
    
        r32 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
        r2 = r2;
        r4 = r4;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0aa5, code lost:
    
        r9 = (int) java.lang.System.currentTimeMillis();
        r10 = r4 * 522;
        r63 = (((-166920) | r10) << 1) - (r10 ^ (-166920));
        r10 = ((-322) & r4) | ((-322) ^ r4);
        r10 = (~((r10 & r9) | (r10 ^ r9))) * 521;
        r12 = (r63 ^ r10) + ((r63 & r10) << 1);
        r10 = ~r4;
        r63 = r11;
        r10 = (r10 & com.vungle.ads.internal.protos.Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE) | (r10 ^ com.vungle.ads.internal.protos.Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE);
        r11 = (~r10) * (-1042);
        r10 = ~r10;
        r9 = ~r9;
        r9 = ~(((r9 & (-322)) | ((-322) ^ r9)) | r4);
        r9 = (((r9 & r10) | (r10 ^ r9)) * 521) + (((r12 | r11) << 1) - (r11 ^ r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0af0, code lost:
    
        r10 = (int) java.lang.System.currentTimeMillis();
        r11 = -(-(r4 * (-1527)));
        r64 = ((6131475 | r11) << 1) - (r11 ^ 6131475);
        r11 = ~r10;
        r12 = ~(r11 | 8015);
        r9 = (((~((-8016) | r4)) | (~(r11 | r4))) * (-1528)) + ((((r4 ^ r12) | (r12 & r4)) * 764) + r64);
        r11 = ~(((-8016) & r4) | ((-8016) ^ r4));
        r12 = ~r4;
        r9 = (~((r12 ^ 8015) | (r12 & 8015))) | r11;
        r10 = ~r10;
        r10 = ~((r10 & 8015) | (r10 ^ 8015));
        r9 = ((r9 & r10) | (r9 ^ r10)) * 764;
        r9 = r6[(r9 ^ r9) + ((r9 & r9) << 1)];
        r11 = r9 * (-159);
        r64 = (10176 & r11) + (r11 | 10176);
        r11 = (r9 | 63) * 160;
        r12 = ((r64 | r11) << 1) - (r64 ^ r11);
        r10 = ~((int) java.lang.System.currentTimeMillis());
        r11 = ~((r10 ^ (-64)) | (r10 & (-64)));
        r10 = ~((r9 ^ (-64)) | (r9 & (-64)));
        r10 = (((r11 ^ r10) | (r10 & r11)) * (-160)) + r12;
        r9 = ~r9;
        r9 = -(-(((~((r9 & r10) | (r9 ^ r10))) | (-64)) * 160));
        r6[r9] = (byte) ((r10 & r9) + (r9 | r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0b9a, code lost:
    
        r11 = new java.lang.Object[r29];
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0b9c, code lost:
    
        r11[2] = java.lang.Integer.valueOf((r6.length - (~(-r4))) - 1);
        r11[1] = java.lang.Integer.valueOf(r4);
        r11[r20] = r6;
        r6 = com.appsflyer.internal.AFb1ySDK.$$a;
        r9 = java.lang.Class.forName($$c(528, r6[379(0x17b, float:5.31E-43)], r6[24]));
        r10 = byte[].class;
        r12 = java.lang.Integer.TYPE;
        r70 = r4;
        r4 = r9.getDeclaredConstructor(r10, r12, r12).newInstance(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0bd4, code lost:
    
        r9 = com.appsflyer.internal.AFb1ySDK.getSdkVersion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0bd6, code lost:
    
        if (r9 != null) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0d89, code lost:
    
        r71 = r6;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0d90, code lost:
    
        com.appsflyer.internal.AFb1ySDK.updateServerUninstallToken = r60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0d94, code lost:
    
        r12 = new byte[]{-94, -82, -83, -77, -87, -44, 19, -31, -123, -80, -99, -107, -120, -69, -74, -52};
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0d99, code lost:
    
        r6 = -android.os.Process.getGidForName("");
        r11 = (int) java.lang.System.currentTimeMillis();
        r12 = r6 * (-949);
        r64 = ((r12 | (-1863544703)) << 1) - (r12 ^ (-1863544703));
        r12 = ~r11;
        r11 = ~(((-965955300) ^ r12) | ((-965955300) & r12));
        r11 = ~((~r6) | r11);
        r11 = -(-(((r11 ^ r11) | (r11 & r11)) * 1900));
        r61 = ((r64 | r11) << 1) - (r64 ^ r11);
        r6 = ((~((r11 ^ 965955299) | (r11 & 965955299))) | (~((r12 ^ r6) | (r12 & r6)))) * (-950);
        r11 = ((r61 | r6) << 1) - (r61 ^ r6);
        r6 = ~(r12 | 965955299);
        r12 = ~(r6 | r11);
        r11 = (r11 - (~(((r6 ^ r12) | (r6 & r12)) * 950))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0e28, code lost:
    
        r6 = new java.lang.Object[r19];
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0e2e, code lost:
    
        r29 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0e30, code lost:
    
        r6[3] = java.lang.Integer.valueOf((int) (com.appsflyer.internal.AFb1ySDK.updateServerUninstallToken ^ (4147989162886485327L - (android.os.Process.getElapsedCpuTime() >> 48))));
        r6[2] = java.lang.Integer.valueOf(r11);
        r6[1] = r12;
        r6[0] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0e47, code lost:
    
        r60 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0e60, code lost:
    
        r61 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0e65, code lost:
    
        r64 = r5;
        r5 = java.lang.Class.forName($$c(585, r71[r18], r71[r25]), true, (java.lang.ClassLoader) com.appsflyer.internal.AFb1ySDK.enableTCFDataCollection).getMethod($$c(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, r71[28], r71[198(0xc6, float:2.77E-43)]), java.lang.Class.forName($$c(480, r71[379(0x17b, float:5.31E-43)], (byte) (-r71[511(0x1ff, float:7.16E-43)]))), r10, r4, r4).invoke(r9, r6);
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0e8c, code lost:
    
        java.lang.Class.forName($$c(480, r71[379(0x17b, float:5.31E-43)], (byte) (-r71[511(0x1ff, float:7.16E-43)]))).getMethod($$c(633, r71[9], r71[r23]), java.lang.Long.TYPE).invoke(r5, 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0ec0, code lost:
    
        if (r42 == false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x1310, code lost:
    
        r65 = r7;
        r66 = r8;
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x1318, code lost:
    
        r0 = com.appsflyer.internal.AFb1ySDK.$$b;
        r0 = java.lang.Class.forName($$c((short) ((r0 & 548) | (r0 ^ 548)), r71[379(0x17b, float:5.31E-43)], r71[24]));
        r6 = java.lang.Class.forName($$c(480, r71[379(0x17b, float:5.31E-43)], (byte) (-r71[511(0x1ff, float:7.16E-43)])));
        r5 = r0.getConstructor(r6).newInstance(r5);
        r0 = r0.getMethod($$c(770, r71[r25], r71[r30]), null).invoke(r5, null);
        r7 = java.lang.Class.forName($$c(781, r71[379(0x17b, float:5.31E-43)], r71[977(0x3d1, float:1.369E-42)])).getMethod($$c(802, r71[r25], r71[159(0x9f, float:2.23E-43)]), null);
        r6 = r6.getMethod($$c(636, r71[r27], r71[r23]), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x13a1, code lost:
    
        r5 = new java.lang.Object[]{r5};
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x13a9, code lost:
    
        r9 = r71[379(0x17b, float:5.31E-43)];
        r32 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x13b1, code lost:
    
        r5 = java.lang.Class.forName($$c(454, r9, r71[310(0x136, float:4.34E-43)])).getDeclaredConstructor(java.lang.Class.forName($$c(480, r71[379(0x17b, float:5.31E-43)], (byte) (-r71[511(0x1ff, float:7.16E-43)])))).newInstance(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x13d6, code lost:
    
        r9 = java.lang.Class.class.getMethod($$c(730, r71[r25], r71[262(0x106, float:3.67E-43)]), null).invoke(com.appsflyer.internal.AFb1ySDK.class, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x13ed, code lost:
    
        r11 = java.lang.Class.forName($$c(808, r71[379(0x17b, float:5.31E-43)], r71[r18]));
        r15 = r11.getConstructor(null).newInstance(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x140b, code lost:
    
        r67 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x1410, code lost:
    
        r2 = r11.getMethod($$c(653, r71[135(0x87, float:1.89E-43)], r71[842(0x34a, float:1.18E-42)]), r10, r4, r4);
        r4 = r11.getMethod($$c(836, r71[39], r71[r24]), null);
        r8 = java.lang.Class.forName($$c(846, r71[379(0x17b, float:5.31E-43)], r71[198(0xc6, float:2.77E-43)])).getMethod($$c(371, r71[r18], r71[842(0x34a, float:1.18E-42)]), null);
        r10 = new byte[1024];
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x1457, code lost:
    
        r12 = (java.lang.Integer) r6.invoke(r5, r10);
        r21 = r6;
        r6 = r12.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x1467, code lost:
    
        if (r6 <= 0) goto L1072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x1469, code lost:
    
        r68 = r8;
        r62 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x147d, code lost:
    
        if (r11 >= ((java.lang.Long) r7.invoke(r0, null)).longValue()) goto L1073;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x147f, code lost:
    
        r2.invoke(r15, r10, r14, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x148a, code lost:
    
        r8 = (int) java.lang.System.currentTimeMillis();
        r9 = r6 * (-958);
        r12 = -(-(r11 * (-958)));
        r69 = (r9 ^ r12) + ((r9 & r12) << 1);
        r9 = ~r11;
        r12 = ~r8;
        r71 = r2;
        r2 = ~(r9 | r12);
        r2 = ~r6;
        r2 = ~((r2 ^ r8) | (r2 & r8));
        r2 = (r2 ^ r2) | (r2 & r2);
        r2 = ~(r12 | r6);
        r2 = -(-(((r2 ^ r2) | (r2 & r2)) * 959));
        r72 = (r69 ^ r2) + ((r69 & r2) << 1);
        r2 = -(-((~((r6 ^ r11) | (r11 & r6))) * (-959)));
        r11 = (r72 & r2) + (r72 | r2);
        r2 = ~((r2 ^ r12) | (r2 & r12));
        r9 = ~(r9 | r8);
        r2 = (r2 & r9) | (r2 ^ r9);
        r6 = ~((r6 & r8) | (r6 ^ r8));
        r2 = -(-(((r2 & r6) | (r2 ^ r6)) * 959));
        r11 = (r11 & r2) + (r2 | r11);
        r6 = r21;
        r9 = r62;
        r8 = r68;
        r2 = r71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x1509, code lost:
    
        r0 = (byte[]) r4.invoke(r15, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x150f, code lost:
    
        r2 = r68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x1511, code lost:
    
        r2.invoke(r5, null);
        r2.invoke(r15, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x1193, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x1194, code lost:
    
        r5 = r0;
        r4 = r65;
        r2 = r67;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x1504, code lost:
    
        r68 = r8;
        r62 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x1989, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x198a, code lost:
    
        r4 = r65;
        r2 = r67;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x198e, code lost:
    
        r32 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x19a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x19a9, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x19b3, code lost:
    
        if (r5 != null) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x19b5, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x19b6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x19bf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x19c3, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x19c7, code lost:
    
        if (r5 != null) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x19c9, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x19ca, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x19b7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x19a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x19a5, code lost:
    
        r4 = r65;
        r2 = r2;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0ec2, code lost:
    
        r6 = com.appsflyer.internal.AFb1ySDK.getSdkVersion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0ec4, code lost:
    
        if (r6 != null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0ec6, code lost:
    
        r9 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0ecb, code lost:
    
        if (r6 != null) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0ecd, code lost:
    
        r6 = com.appsflyer.internal.AFb1ySDK.$11;
        r11 = ((r6 | 37) << 1) - (r6 ^ 37);
        com.appsflyer.internal.AFb1ySDK.$10 = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0ee0, code lost:
    
        if ((r11 % 2) != 0) goto L1070;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0ee2, code lost:
    
        r6 = r58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0ef2, code lost:
    
        r11 = java.lang.Class.forName($$c(480, r71[379(0x17b, float:5.31E-43)], (byte) (-r71[511(0x1ff, float:7.16E-43)]))).getMethod($$c(636, r71[r27], r71[r23]), r10, r4, r4);
        r12 = java.lang.Class.forName($$c(348, r71[379(0x17b, float:5.31E-43)], (byte) (-r71[228(0xe4, float:3.2E-43)])));
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0f31, code lost:
    
        r65 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0f36, code lost:
    
        r7 = r12.getConstructor(java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r71[379(0x17b, float:5.31E-43)], r71[r30]))).newInstance(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0f4e, code lost:
    
        if (r55 == false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0f52, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0f69, code lost:
    
        r67 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0f6e, code lost:
    
        ((java.lang.Boolean) java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r71[379(0x17b, float:5.31E-43)], r71[r30])).getMethod($$c(639, r71[9], r71[r24]), null).invoke(r9, null)).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0fa0, code lost:
    
        r8 = new byte[1024];
        r2 = r12.getMethod($$c(653, r71[135(0x87, float:1.89E-43)], r71[842(0x34a, float:1.18E-42)]), r10, r4, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0fb6, code lost:
    
        if (r0 <= 0) goto L1076;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0fc2, code lost:
    
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0fc4, code lost:
    
        r10 = (java.lang.Integer) r11.invoke(r5, r8, r14, java.lang.Integer.valueOf(java.lang.Math.min(1024, r0)));
        r15 = r10.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0fd3, code lost:
    
        if (r15 == (-1)) goto L1075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0fd5, code lost:
    
        r2.invoke(r7, r8, r14, r10);
        r4 = -r15;
        r15 = r11;
        r10 = (int) java.lang.System.currentTimeMillis();
        r11 = r4 * (-494);
        r21 = r2;
        r2 = r0 * (-494);
        r69 = (r11 ^ r2) + ((r2 & r11) << 1);
        r2 = (~((r4 ^ r0) | (r4 & r0))) * (-495);
        r11 = (r69 & r2) + (r69 | r2);
        r2 = ~r10;
        r10 = (((r4 ^ r2) | (r4 & r2)) * 495) + r11;
        r0 = ~((~r0) | (~r4));
        r2 = ~((r2 & r4) | (r2 ^ r4));
        r0 = ((r0 & r2) | (r0 ^ r2)) * 495;
        r0 = (r0 | r10) + (r10 & r0);
        r11 = r15;
        r2 = r21;
        r21 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x1027, code lost:
    
        r0 = com.appsflyer.internal.AFb1ySDK.$$a;
        java.lang.Class.forName($$c(661, r0[379(0x17b, float:5.31E-43)], r0[977(0x3d1, float:1.369E-42)])).getMethod($$c(682, r0[9], r0[r23]), null).invoke(r12.getMethod($$c(657, r0[r25], r0[842(0x34a, float:1.18E-42)]), null).invoke(r7, null), null);
        r12.getMethod($$c(371, r0[r18], r0[842(0x34a, float:1.18E-42)]), null).invoke(r7, null);
        r2 = java.lang.Class.forName($$c(685, r0[r28], (byte) (-r0[r26]))).getDeclaredMethod($$c(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_EXCEPTION, r0[242(0xf2, float:3.39E-43)], r0[159(0x9f, float:2.23E-43)]), java.lang.String.class, java.lang.String.class, java.lang.Integer.TYPE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x10a2, code lost:
    
        com.appsflyer.internal.AFb1ySDK.$11 = (com.appsflyer.internal.AFb1ySDK.$10 + 101) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x10ac, code lost:
    
        r4 = java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r0[379(0x17b, float:5.31E-43)], r0[r30]));
        r5 = com.appsflyer.internal.AFb1ySDK.$$b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x1106, code lost:
    
        r2 = r2.invoke(null, r4.getMethod($$c((short) ((r5 ^ 516) | (r5 & 516)), r0[r25], r0[914(0x392, float:1.281E-42)]), null).invoke(r9, null), java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r0[379(0x17b, float:5.31E-43)], r0[r30])).getMethod($$c((short) ((r5 & 516) | (r5 ^ 516)), r0[r25], r0[914(0x392, float:1.281E-42)]), null).invoke(r6, null), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x1110, code lost:
    
        r4 = java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r0[379(0x17b, float:5.31E-43)], r0[r30]));
        r5 = r0[r28];
        r7 = r0[842(0x34a, float:1.18E-42)];
        ((java.lang.Boolean) r4.getMethod($$c(725, r5, (byte) ((r7 ^ (-1)) + (r7 << 1))), null).invoke(r9, null)).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x1143, code lost:
    
        ((java.lang.Boolean) java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r0[379(0x17b, float:5.31E-43)], r0[r30])).getMethod($$c(725, r0[r28], (byte) (r0[842(0x34a, float:1.18E-42)] - 1)), null).invoke(r6, null)).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x1171, code lost:
    
        if (com.appsflyer.internal.AFb1ySDK.enableTCFDataCollection != null) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x1173, code lost:
    
        com.appsflyer.internal.AFb1ySDK.$10 = (com.appsflyer.internal.AFb1ySDK.$11 + 111) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x1190, code lost:
    
        com.appsflyer.internal.AFb1ySDK.enableTCFDataCollection = java.lang.Class.class.getMethod($$c(730, r0[r25], r0[262(0x106, float:3.67E-43)]), null).invoke(com.appsflyer.internal.AFb1ySDK.class, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x119b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x119c, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x11a0, code lost:
    
        if (r2 != null) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x11a2, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x11a3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x11a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x11a9, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x11ad, code lost:
    
        if (r2 != null) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x11af, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x11b0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x11b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x11b2, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x11b6, code lost:
    
        if (r2 != null) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x11b8, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x11b9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x11ba, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x11bb, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x11bf, code lost:
    
        if (r2 != null) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x11c1, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x11c2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x11c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x11c4, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x11c8, code lost:
    
        if (r2 != null) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x11ca, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x11cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x1022, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x0f90, code lost:
    
        r2 = r67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x124f, code lost:
    
        r4 = com.appsflyer.internal.AFb1ySDK.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x125f, code lost:
    
        ((java.lang.Boolean) java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[379(0x17b, float:5.31E-43)], r4[r30])).getMethod($$c(725, r4[r28], (byte) (r4[842(0x34a, float:1.18E-42)] - 1)), null).invoke(r9, null)).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x128b, code lost:
    
        r5 = java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r4[379(0x17b, float:5.31E-43)], r4[r30]));
        r7 = r4[r28];
        r4 = r4[842(0x34a, float:1.18E-42)];
        r9 = (int) java.lang.System.currentTimeMillis();
        r12 = ((((-1) ^ r9) | r9) * (-50)) + ((-52) - (~(-(-(r4 * (-49))))));
        r4 = ~r4;
        r11 = ~((r4 ^ r9) | (r4 & r9));
        r15 = ~r9;
        r11 = (r11 * 50) + r12;
        r9 = ~r9;
        r9 = ~((r9 & r4) | (r4 ^ r9));
        r4 = ~(r4 | (r4 ^ (-1)));
        r4 = (((r4 & r9) | (r9 ^ r4)) | (~((r15 ^ (-1)) | r15))) * 50;
        ((java.lang.Boolean) r5.getMethod($$c(725, r7, (byte) ((r11 ^ r4) + ((r4 & r11) << 1))), null).invoke(r6, null)).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x12e7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x12ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x12f3, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x12f7, code lost:
    
        if (r4 != null) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x12f9, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x12fa, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x12f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x12ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x1300, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x1304, code lost:
    
        if (r4 != null) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x1306, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x1307, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x12e8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x12e9, code lost:
    
        r5 = r0;
        r4 = r65;
        r2 = r2;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x12fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x1025, code lost:
    
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0f8d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x0f8e, code lost:
    
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x0f81, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x0f86, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0f8a, code lost:
    
        if (r2 != null) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0f8c, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x0f99, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0f94, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x0f95, code lost:
    
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x11e5, code lost:
    
        r2 = new java.lang.StringBuilder();
        r4 = com.appsflyer.internal.AFb1ySDK.$$a;
        r2.append($$c(649, r4[125(0x7d, float:1.75E-43)], r4[842(0x34a, float:1.18E-42)]));
        r2.append(r9);
        r2.append($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, r4[1141(0x475, float:1.599E-42)], r4[75]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x1212, code lost:
    
        r7 = new java.lang.Object[]{r2.toString(), r0};
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x122f, code lost:
    
        r2 = r67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x123f, code lost:
    
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, r4[379(0x17b, float:5.31E-43)], (byte) (-r4[511(0x1ff, float:7.16E-43)]))).getDeclaredConstructor(java.lang.String.class, r2).newInstance(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x1240, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x1245, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x1249, code lost:
    
        if (r4 != null) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x124b, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x124e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x124c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x124d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x1242, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x1243, code lost:
    
        r2 = r67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0f83, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x0f84, code lost:
    
        r67 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0f9a, code lost:
    
        r67 = r2;
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x11d3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x11d4, code lost:
    
        r67 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x11cc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x11cf, code lost:
    
        r14 = r21;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x11de, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x11df, code lost:
    
        r67 = r2;
        r65 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x11d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x11d9, code lost:
    
        r65 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x0ee9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0eea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x0eeb, code lost:
    
        r5 = r0;
        r4 = r7;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0eef, code lost:
    
        r6 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x0ec9, code lost:
    
        r9 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x1308, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x1309, code lost:
    
        r65 = r7;
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x19cb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x19cc, code lost:
    
        r4 = r7;
        r2 = r2;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x19cd, code lost:
    
        r14 = r21;
        r2 = r2;
        r4 = r4;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x19d0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x19ee, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x19f2, code lost:
    
        if (r5 == null) goto L700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x19f4, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x19f5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x19d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x19de, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x19e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x1a01, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x1a02, code lost:
    
        r4 = r7;
        r60 = r14;
        r61 = r15;
        r14 = r21;
        r29 = 3;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x0bd8, code lost:
    
        com.appsflyer.internal.AFb1ySDK.setDebugLog = r60;
        r9 = (int) (r60 ^ ((android.os.SystemClock.elapsedRealtime() >> 48) + 4633191931853444243L));
        r10 = (int) (com.appsflyer.internal.AFb1ySDK.setDebugLog ^ ((android.os.SystemClock.elapsedRealtime() >> 48) - 4633191933034406995L));
        r9 = new int[(int) (com.appsflyer.internal.AFb1ySDK.setDebugLog ^ ((android.os.SystemClock.elapsedRealtimeNanos() >> r28) - 4633191933034406998L))];
        r10 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1));
        r11 = (int) java.lang.System.currentTimeMillis();
        r12 = (r10 * 165) - 163;
        r4 = ~((~r11) | 1);
        r4 = ((r10 ^ r4) | (r4 & r10)) * (-328);
        r61 = (r12 & r4) + (r4 | r12);
        r4 = ((r10 ^ r11) | (r10 & r11)) * 164;
        r12 = ((r61 | r4) << 1) - (r61 ^ r4);
        r4 = ~r10;
        r4 = (~((r4 ^ (-2)) | (r4 & (-2)))) | (~(((-2) ^ r11) | ((-2) & r11)));
        r11 = ~r11;
        r4 = (r4 | (~(((r11 ^ r10) | (r10 & r11)) | 1))) * 164;
        r10 = ((r12 | r4) << 1) - (r4 ^ r12);
        r4 = (int) (com.appsflyer.internal.AFb1ySDK.setImeiData >>> ((byte) (32 - ((android.os.Process.getThreadPriority(r20) + 20) >> 6))));
        r9[r10] = (r4 | r9) & (~(r4 & r9));
        r4 = r20;
        r4 = -android.view.View.resolveSize(r4, r4);
        r10 = (int) java.lang.System.currentTimeMillis();
        r11 = r4 * 46;
        r12 = (r11 & 46) + (r11 | 46);
        r11 = ~r10;
        r11 = ~(((-2) ^ r11) | ((-2) & r11));
        r11 = (((r4 ^ r11) | (r11 & r4)) * (-90)) + r12;
        r12 = ~(((-2) ^ r10) | ((-2) & r10));
        r71 = r6;
        r6 = ~(r4 | 1);
        r6 = (((r12 ^ r6) | (r6 & r12)) * (-45)) + r11;
        r11 = ~r4;
        r11 = (-2) | (~((r11 & r10) | (r11 ^ r10)));
        r10 = ~r10;
        r4 = ~((r4 & r10) | (r10 ^ r4));
        r4 = -(-(((r4 & r11) | (r11 ^ r4)) * 45));
        r9[(r6 ^ r4) + ((r4 & r6) << 1)] = ((int) com.appsflyer.internal.AFb1ySDK.setImeiData) ^ r9;
        r4 = com.appsflyer.internal.AFb1ySDK.setOutOfStore;
        r6 = com.appsflyer.internal.AFb1ySDK.setCustomerUserId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0cfb, code lost:
    
        r12 = new java.lang.Object[r35];
        r12[5] = java.lang.Integer.valueOf(com.appsflyer.internal.AFb1ySDK.getOutOfStore);
        r12[r19] = java.lang.Integer.valueOf(r10);
        r12[3] = r6;
        r12[2] = java.lang.Integer.valueOf(r4);
        r12[1] = r9;
        r12[0] = r4;
        r4 = java.lang.Class.forName($$c(555, r71[r18], r71[214(0xd6, float:3.0E-43)]));
        r6 = new java.lang.Class[]{java.lang.Class.forName($$c(480, r71[379(0x17b, float:5.31E-43)], (byte) (-r71[511(0x1ff, float:7.16E-43)]))), int[].class, r12, r10, r12, r12};
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0d5e, code lost:
    
        r29 = r5;
        r5 = r4.getDeclaredConstructor(r6).newInstance(r12);
        r4 = r12;
        r64 = r29;
        r60 = r14;
        r61 = r15;
        r29 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0d6f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0d70, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0d74, code lost:
    
        if (r4 != null) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x0d76, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0d84, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0d77, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x0d78, code lost:
    
        r5 = r0;
        r4 = r7;
        r60 = r14;
        r61 = r15;
        r14 = r21;
        r29 = 3;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x0d85, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x19f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x19f7, code lost:
    
        r4 = r7;
        r60 = r14;
        r61 = r15;
        r14 = r21;
        r29 = 3;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x1a0c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x1a26, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x1a2a, code lost:
    
        if (r5 != null) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x1a2c, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x1a2d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x1a1b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x1a2e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x1a2f, code lost:
    
        r4 = r7;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x1a30, code lost:
    
        r60 = r14;
        r61 = r15;
        r2 = r2;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x1a3a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x1a3b, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x1a4c, code lost:
    
        if (r5 != null) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x1a4e, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x1a4f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x1a50, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x1a51, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x1a62, code lost:
    
        if (r5 != null) goto L727;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x1a64, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x1a65, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x1a66, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x1a67, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x1a78, code lost:
    
        if (r5 != null) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x1a7a, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x1a7b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x1980, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x1a8b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x1a96, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x1a9a, code lost:
    
        if (r5 != null) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x1a9c, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x1a9d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0471, code lost:
    
        if (r15[r11] != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x1a7c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x1a35, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x1a36, code lost:
    
        r4 = r7;
        r63 = r11;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x1aa9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x1aaa, code lost:
    
        r63 = r11;
        r60 = r14;
        r61 = r15;
        r14 = r21;
        r32 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x1ab7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x1ab8, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0474, code lost:
    
        r49 = r4;
        r50 = r5;
        r55 = r7;
        r57 = r8;
        r56 = r9;
        r63 = r11;
        r60 = r14;
        r61 = r15;
        r14 = r21;
        r4 = r37;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x1ac8, code lost:
    
        if (r4 != null) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x1aca, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x1acb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x1acc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:895:0x1acd, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x1add, code lost:
    
        if (r4 != null) goto L760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:897:0x1adf, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:898:0x1ae0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x048b, code lost:
    
        r39 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x06a1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:904:0x056d, code lost:
    
        r55 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:906:0x08e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:908:0x08f2, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x08f6, code lost:
    
        if (r4 != null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x1c02, code lost:
    
        r9 = r56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:910:0x08f8, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:911:0x08f9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x08ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x08fa, code lost:
    
        r50 = r5;
        r10 = null;
        r51 = null;
        r52 = null;
        r53 = null;
        r60 = r60;
        r61 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x0510, code lost:
    
        r0 = new java.lang.StringBuilder();
        r4 = com.appsflyer.internal.AFb1ySDK.$$a;
        r0.append($$c(r32, r4[125(0x7d, float:1.75E-43)], r4[842(0x34a, float:1.18E-42)]));
        r0.append(r12);
        r0.append($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, r4[1141(0x475, float:1.599E-42)], r4[75]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:920:0x0561, code lost:
    
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, r4[r31], (byte) (-r4[511(0x1ff, float:7.16E-43)]))).getDeclaredConstructor(java.lang.String.class).newInstance(r0.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:923:0x0562, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:924:0x0563, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:925:0x0567, code lost:
    
        if (r4 != null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x0569, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x057e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:928:0x056a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:929:0x056b, code lost:
    
        r50 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:931:0x04ec, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:933:0x04f1, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:934:0x04f5, code lost:
    
        if (r4 != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:935:0x04f7, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:936:0x050d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:937:0x04f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:938:0x04f9, code lost:
    
        r50 = r5;
        r55 = r7;
        r57 = r8;
        r56 = r9;
        r63 = r11;
        r60 = r14;
        r61 = r15;
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:940:0x04ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:941:0x04ef, code lost:
    
        r49 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:942:0x050e, code lost:
    
        r49 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:943:0x057f, code lost:
    
        r49 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:945:0x1ae1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x1ae2, code lost:
    
        r49 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:948:0x1ae6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:949:0x1ae7, code lost:
    
        r49 = r4;
        r50 = r5;
        r55 = r7;
        r57 = r8;
        r56 = r9;
        r63 = r11;
        r60 = r14;
        r61 = r15;
        r14 = r21;
        r43 = '}';
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:954:0x0493, code lost:
    
        if (r15[r11] != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0499, code lost:
    
        r42 = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:967:0x044c, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:969:0x044f, code lost:
    
        r35 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x049b, code lost:
    
        r43 = '}';
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x049d, code lost:
    
        r12 = r4[r11];
        r44 = r14[r11];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1007:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1025:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x1b09  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x18ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x1737 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x19f4 A[Catch: all -> 0x1980, TryCatch #40 {all -> 0x1980, blocks: (B:553:0x1979, B:555:0x197f, B:556:0x1984, B:573:0x1994, B:575:0x19a2, B:576:0x19a3, B:589:0x19a9, B:591:0x19b5, B:592:0x19b6, B:597:0x19c3, B:599:0x19c9, B:600:0x19ca, B:799:0x19ee, B:801:0x19f4, B:802:0x19f5, B:841:0x1a26, B:843:0x1a2c, B:844:0x1a2d, B:854:0x1a3b, B:856:0x1a4e, B:857:0x1a4f, B:860:0x1a51, B:862:0x1a64, B:863:0x1a65, B:866:0x1a67, B:868:0x1a7a, B:869:0x1a7b, B:875:0x1a96, B:877:0x1a9c, B:878:0x1a9d, B:311:0x0a3f, B:308:0x0a0a, B:306:0x09d9, B:403:0x1557, B:381:0x13d6), top: B:310:0x0a3f, inners: #8, #18, #25, #55, #70 }] */
    /* JADX WARN: Removed duplicated region for block: B:802:0x19f5 A[Catch: all -> 0x1980, TryCatch #40 {all -> 0x1980, blocks: (B:553:0x1979, B:555:0x197f, B:556:0x1984, B:573:0x1994, B:575:0x19a2, B:576:0x19a3, B:589:0x19a9, B:591:0x19b5, B:592:0x19b6, B:597:0x19c3, B:599:0x19c9, B:600:0x19ca, B:799:0x19ee, B:801:0x19f4, B:802:0x19f5, B:841:0x1a26, B:843:0x1a2c, B:844:0x1a2d, B:854:0x1a3b, B:856:0x1a4e, B:857:0x1a4f, B:860:0x1a51, B:862:0x1a64, B:863:0x1a65, B:866:0x1a67, B:868:0x1a7a, B:869:0x1a7b, B:875:0x1a96, B:877:0x1a9c, B:878:0x1a9d, B:311:0x0a3f, B:308:0x0a0a, B:306:0x09d9, B:403:0x1557, B:381:0x13d6), top: B:310:0x0a3f, inners: #8, #18, #25, #55, #70 }] */
    /* JADX WARN: Removed duplicated region for block: B:960:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:961:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:964:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:970:0x02d5 A[Catch: Exception -> 0x1c3f, TRY_ENTER, TRY_LEAVE, TryCatch #122 {Exception -> 0x1c3f, blocks: (B:11:0x014d, B:13:0x0162, B:45:0x0362, B:50:0x03a0, B:52:0x03a6, B:53:0x03a7, B:54:0x03a8, B:57:0x03ed, B:60:0x03f2, B:70:0x0433, B:73:0x043e, B:76:0x0449, B:83:0x046b, B:86:0x046f, B:92:0x1c04, B:148:0x1b85, B:152:0x1b89, B:150:0x1b98, B:154:0x1baa, B:157:0x1bae, B:162:0x1bb1, B:169:0x1bfa, B:171:0x1c00, B:172:0x1c01, B:953:0x0491, B:970:0x02d5, B:979:0x1c25, B:981:0x1c2b, B:982:0x1c2c, B:985:0x1c2e, B:987:0x1c34, B:988:0x1c35, B:994:0x0286, B:998:0x0289, B:1003:0x1c37, B:1005:0x1c3d, B:1006:0x1c3e, B:976:0x0333, B:973:0x02f1, B:1000:0x02af, B:47:0x0370, B:165:0x1bcf, B:166:0x1bf8), top: B:10:0x014d, inners: #1, #3, #7, #64, #113 }] */
    /* JADX WARN: Removed duplicated region for block: B:989:0x0270  */
    /* JADX WARN: Type inference failed for: r0v191, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v196, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v165 */
    /* JADX WARN: Type inference failed for: r2v166 */
    /* JADX WARN: Type inference failed for: r2v173 */
    /* JADX WARN: Type inference failed for: r2v177 */
    /* JADX WARN: Type inference failed for: r2v178 */
    /* JADX WARN: Type inference failed for: r2v179 */
    /* JADX WARN: Type inference failed for: r2v180 */
    /* JADX WARN: Type inference failed for: r2v181 */
    /* JADX WARN: Type inference failed for: r2v182 */
    /* JADX WARN: Type inference failed for: r2v183 */
    /* JADX WARN: Type inference failed for: r2v184 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r4v151 */
    /* JADX WARN: Type inference failed for: r4v152, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v235, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v254, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v255 */
    /* JADX WARN: Type inference failed for: r4v256, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v257 */
    /* JADX WARN: Type inference failed for: r4v261 */
    /* JADX WARN: Type inference failed for: r4v272, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r4v275 */
    /* JADX WARN: Type inference failed for: r4v276 */
    /* JADX WARN: Type inference failed for: r4v282 */
    /* JADX WARN: Type inference failed for: r4v284 */
    /* JADX WARN: Type inference failed for: r4v290 */
    /* JADX WARN: Type inference failed for: r4v417 */
    /* JADX WARN: Type inference failed for: r4v421 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v81, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v85, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v143, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r60v51 */
    /* JADX WARN: Type inference failed for: r61v55 */
    /* JADX WARN: Type inference failed for: r6v40, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v49 */
    static {
        String $$c;
        char c;
        char c2;
        Object obj;
        char c3;
        char c4;
        Object invoke;
        char c5;
        Object invoke2;
        char c6;
        Object invoke3;
        char c7;
        int i;
        int i2;
        char c8;
        int i3;
        Object[] objArr;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        int i4;
        boolean z;
        int i5;
        int i6;
        byte[] bArr;
        Object[] objArr2;
        boolean[] zArr4;
        boolean z2;
        String str;
        int i7;
        boolean[] zArr5;
        boolean[] zArr6;
        char c9;
        Class cls;
        int i8;
        int i9;
        boolean z3;
        boolean[] zArr7;
        boolean[] zArr8;
        Throwable th;
        ZipFile zipFile;
        Object obj2;
        int i10;
        Class cls2;
        ZipFile zipFile2;
        Class cls3;
        String str2;
        ZipFile zipFile3;
        Throwable th2;
        Class cls4;
        boolean z4;
        Class cls5;
        Object obj3;
        byte[] bArr2;
        int i11;
        init$0();
        int i12 = 2;
        try {
            byte[] bArr3 = $$a;
            Class<?> cls6 = Class.forName($$c(bArr3[55], bArr3[310], bArr3[680]));
            String $$c2 = $$c(bArr3[198], bArr3[8], bArr3[262]);
            Class cls7 = Integer.TYPE;
            int intValue = ((Integer) cls6.getMethod($$c2, cls7, cls7).invoke(null, -3, 4)).intValue();
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i13 = ~((102645819 & currentTimeMillis) | (102645819 ^ currentTimeMillis));
            int i14 = (((-511627456) ^ i13) | (i13 & (-511627456))) * 576;
            int i15 = ~((~currentTimeMillis) | (-408981637));
            int i16 = ((((492250628 | i14) << 1) - (i14 ^ 492250628)) - (~(((i15 & 917504) | (917504 ^ i15)) * 576))) - (-1655328767);
            int i17 = ~intValue;
            int i18 = ~(((-1854751875) ^ i17) | ((-1854751875) & i17));
            int i19 = ((-1944262643) ^ i18) | ((-1944262643) & i18);
            int i20 = 4;
            int i21 = i19 * (-865);
            int i22 = 0;
            boolean[] zArr9 = 0;
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i23 = i19 * 94285;
            int i24 = i16 * 111;
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            int i26 = ~i21;
            int i27 = ~((currentTimeMillis2 & i16) | (i16 ^ currentTimeMillis2));
            int i28 = (((i26 ^ i27) | (i26 & i27)) * (-220)) + i25;
            int i29 = 1;
            int i30 = ~(i21 | i16);
            int i31 = (((i30 ^ i27) | (i27 & i30)) * Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE) + i28;
            int i32 = ~((i26 & i16) | (i26 ^ i16));
            int i33 = ~i16;
            int i34 = ~((i33 & i21) | (i33 ^ i21));
            int i35 = -(-(((i32 & i34) | (i32 ^ i34)) * 110));
            int i36 = (i31 ^ i35) + ((i31 & i35) << 1);
            int i37 = (~((1854751874 ^ intValue) | (1854751874 & intValue))) * 865;
            int i38 = (i36 & i37) + (i37 | i36);
            int i39 = ~((-1944262643) | i17);
            int i40 = ~((~intValue) | 1854751874);
            int i41 = ((i40 & i39) | (i39 ^ i40)) * 865;
            if ((i38 & i41) + (i41 | i38) == 0) {
                System.currentTimeMillis();
                System.currentTimeMillis();
                return;
            }
            setImeiData = -3050331408800601918L;
            setOutOfStore = 1346082708;
            getOutOfStore = 3;
            setCustomerUserId = new byte[]{-110, 64, 120, 82, -115, 76, -8, 71};
            getLevel = new HashMap();
            getInstance = new HashMap();
            try {
                $$c = $$c(bArr3[179], bArr3[223], bArr3[13]);
                String $$c3 = getSdkVersion == null ? $$c((short) (-bArr3[757]), bArr3[223], bArr3[113]) : null;
                try {
                    c = 179;
                    try {
                        c2 = 223;
                    } catch (Exception unused) {
                        c2 = 223;
                        obj = null;
                        c3 = '\r';
                        obj = Class.forName($$c((short) ($$b & 943), r13[310], r13[977])).getMethod($$c(152, r13[13], (byte) (-$$a[311])), null).invoke(null, null);
                        if (obj != null) {
                        }
                        c4 = 'M';
                        invoke = null;
                        if (obj != null) {
                        }
                        c5 = 311;
                        invoke2 = null;
                        if (obj != null) {
                        }
                        c6 = '\b';
                        invoke3 = null;
                        if (invoke != null) {
                        }
                        c7 = 777;
                        i2 = 379;
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr4 = $$a;
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr4[i2], bArr4[c7])), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[i] = invoke3;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[0] = false;
                        zArr3[1] = false;
                        zArr3[2] = true;
                        zArr3[i] = true;
                        zArr3[4] = false;
                        zArr3[5] = true;
                        zArr3[6] = true;
                        i4 = 6;
                        Class<?> cls8 = Class.forName($$c(274, bArr4[i3], (byte) (-bArr4[228])));
                        i11 = cls8.getDeclaredField($$c(297, bArr4[113], bArr4[159])).getInt(cls8);
                        if (i11 < 34) {
                        }
                        zArr3[0] = i11 != 29 && i11 >= 26;
                        zArr3[1] = i11 >= 21;
                        zArr3[4] = i11 >= 21;
                        i5 = 0;
                        i6 = 0;
                        bArr = Throwable.class;
                        while (i5 == 0) {
                        }
                        return;
                    }
                    try {
                        obj = Class.forName($$c(89, bArr3[310], bArr3[347])).getMethod($$c(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, bArr3[223], bArr3[343]), null).invoke(null, null);
                    } catch (Exception unused2) {
                        obj = null;
                        c3 = '\r';
                        obj = Class.forName($$c((short) ($$b & 943), r13[310], r13[977])).getMethod($$c(152, r13[13], (byte) (-$$a[311])), null).invoke(null, null);
                        if (obj != null) {
                        }
                        c4 = 'M';
                        invoke = null;
                        if (obj != null) {
                        }
                        c5 = 311;
                        invoke2 = null;
                        if (obj != null) {
                        }
                        c6 = '\b';
                        invoke3 = null;
                        if (invoke != null) {
                        }
                        c7 = 777;
                        i2 = 379;
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr42 = $$a;
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr42[i2], bArr42[c7])), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[i] = invoke3;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[0] = false;
                        zArr3[1] = false;
                        zArr3[2] = true;
                        zArr3[i] = true;
                        zArr3[4] = false;
                        zArr3[5] = true;
                        zArr3[6] = true;
                        i4 = 6;
                        Class<?> cls82 = Class.forName($$c(274, bArr42[i3], (byte) (-bArr42[228])));
                        i11 = cls82.getDeclaredField($$c(297, bArr42[113], bArr42[159])).getInt(cls82);
                        if (i11 < 34) {
                        }
                        zArr3[0] = i11 != 29 && i11 >= 26;
                        zArr3[1] = i11 >= 21;
                        zArr3[4] = i11 >= 21;
                        i5 = 0;
                        i6 = 0;
                        bArr = Throwable.class;
                        while (i5 == 0) {
                        }
                        return;
                    }
                } catch (Exception unused3) {
                    c = 179;
                }
                if (obj != null) {
                    int i42 = $11;
                    $10 = ((i42 ^ 19) + ((i42 & 19) << 1)) % 128;
                    c3 = '\r';
                    if (obj != null) {
                        try {
                            Class<?> cls9 = obj.getClass();
                            byte[] bArr5 = $$a;
                            c4 = 'M';
                            try {
                                invoke = cls9.getMethod($$c(172, bArr5[c3], bArr5[77]), null).invoke(obj, null);
                            } catch (Exception unused4) {
                            }
                        } catch (Exception unused5) {
                        }
                        if (obj != null) {
                            try {
                                Class<?> cls10 = obj.getClass();
                                byte[] bArr6 = $$a;
                                c5 = 311;
                                try {
                                    invoke2 = cls10.getMethod($$c(182, bArr6[c3], bArr6[914]), null).invoke(obj, null);
                                } catch (Exception unused6) {
                                }
                            } catch (Exception unused7) {
                            }
                            if (obj != null) {
                                try {
                                    Class<?> cls11 = obj.getClass();
                                    int i43 = $$b;
                                    short s = (short) (((i43 | 1) << 1) - (i43 ^ 1));
                                    byte[] bArr7 = $$a;
                                    c6 = '\b';
                                    try {
                                        invoke3 = cls11.getMethod($$c(s, bArr7[c3], bArr7[c4]), null).invoke(obj, null);
                                    } catch (Exception unused8) {
                                    }
                                } catch (Exception unused9) {
                                }
                                if (invoke != null) {
                                    i = 3;
                                } else {
                                    if ($$c3 != null) {
                                        StringBuilder sb = new StringBuilder();
                                        c7 = 777;
                                        i = 3;
                                        i2 = 379;
                                        sb.append($$c(206, (byte) (-$$a[752]), r28[c4]));
                                        sb.append($$c3);
                                        try {
                                            invoke = Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, r28[379], r28[777])).getDeclaredConstructor(String.class).newInstance(sb.toString());
                                            if (invoke3 == null) {
                                                i3 = 310;
                                                c8 = '<';
                                            } else {
                                                int i44 = $$b;
                                                byte[] bArr8 = $$a;
                                                c8 = '<';
                                                String $$c4 = $$c((short) ((i44 ^ 32) | (i44 & 32)), bArr8[i2], bArr8[262]);
                                                System.currentTimeMillis();
                                                System.currentTimeMillis();
                                                try {
                                                    i3 = 310;
                                                    Object invoke4 = Class.forName($$c(240, bArr8[i2], bArr8[193])).getMethod($$c((short) ((i44 & 60) | (i44 ^ 60)), bArr8[c3], bArr8[c4]), String.class).invoke(null, $$c4);
                                                    $10 = ($11 + 81) % 128;
                                                    System.currentTimeMillis();
                                                    System.currentTimeMillis();
                                                    try {
                                                        invoke3 = Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr8[i2], bArr8[c7])).getDeclaredConstructor(String.class).newInstance(invoke4);
                                                    } catch (Throwable th3) {
                                                        Throwable cause = th3.getCause();
                                                        if (cause == null) {
                                                            throw th3;
                                                        }
                                                        throw cause;
                                                    }
                                                } catch (Throwable th4) {
                                                    Throwable cause2 = th4.getCause();
                                                    if (cause2 == null) {
                                                        throw th4;
                                                    }
                                                    throw cause2;
                                                }
                                            }
                                            if (invoke2 == null) {
                                                int i45 = $11;
                                                $10 = (((i45 | Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) << 1) - (i45 ^ Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE)) % 128;
                                                if (invoke != null) {
                                                    byte[] bArr9 = $$a;
                                                    try {
                                                        invoke2 = Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr9[i2], bArr9[c7])).getDeclaredConstructor(Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr9[i2], bArr9[c7])), String.class).newInstance(invoke, $$c(265, bArr9[c2], bArr9[0]));
                                                    } catch (Throwable th5) {
                                                        Throwable cause3 = th5.getCause();
                                                        if (cause3 == null) {
                                                            throw th5;
                                                        }
                                                        throw cause3;
                                                    }
                                                }
                                            }
                                            byte[] bArr422 = $$a;
                                            objArr = (Object[]) Array.newInstance(Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr422[i2], bArr422[c7])), 7);
                                            objArr[0] = null;
                                            objArr[1] = invoke2;
                                            objArr[2] = invoke;
                                            objArr[i] = invoke3;
                                            objArr[4] = invoke2;
                                            objArr[5] = invoke;
                                            objArr[6] = invoke3;
                                            zArr = new boolean[]{false, true, true, true, true, true, true};
                                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                            zArr3 = new boolean[7];
                                            zArr3[0] = false;
                                            zArr3[1] = false;
                                            zArr3[2] = true;
                                            zArr3[i] = true;
                                            zArr3[4] = false;
                                            zArr3[5] = true;
                                            zArr3[6] = true;
                                            i4 = 6;
                                            Class<?> cls822 = Class.forName($$c(274, bArr422[i3], (byte) (-bArr422[228])));
                                            i11 = cls822.getDeclaredField($$c(297, bArr422[113], bArr422[159])).getInt(cls822);
                                            if (i11 < 34) {
                                                System.currentTimeMillis();
                                                System.currentTimeMillis();
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            zArr3[0] = i11 != 29 && i11 >= 26;
                                            zArr3[1] = i11 >= 21;
                                            zArr3[4] = i11 >= 21;
                                            i5 = 0;
                                            i6 = 0;
                                            bArr = Throwable.class;
                                            while (i5 == 0) {
                                                int i46 = i12;
                                                if (i6 >= 9) {
                                                    return;
                                                }
                                                int i47 = $10;
                                                int i48 = i47 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                                                $11 = i48 % 128;
                                                if (i48 % 2 == 0) {
                                                    int i49 = 16 / 0;
                                                }
                                            }
                                            return;
                                        } catch (Throwable th6) {
                                            Throwable cause4 = th6.getCause();
                                            if (cause4 == null) {
                                                throw th6;
                                            }
                                            throw cause4;
                                        }
                                    }
                                    int i50 = $10;
                                    int i51 = (i50 ^ 19) + ((i50 & 19) << 1);
                                    $11 = i51 % 128;
                                    if (i51 % 2 == 0) {
                                        throw null;
                                    }
                                    i = 3;
                                    invoke = null;
                                }
                                c7 = 777;
                                i2 = 379;
                                if (invoke3 == null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr4222 = $$a;
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr4222[i2], bArr4222[c7])), 7);
                                objArr[0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = invoke;
                                objArr[i] = invoke3;
                                objArr[4] = invoke2;
                                objArr[5] = invoke;
                                objArr[6] = invoke3;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                zArr3 = new boolean[7];
                                zArr3[0] = false;
                                zArr3[1] = false;
                                zArr3[2] = true;
                                zArr3[i] = true;
                                zArr3[4] = false;
                                zArr3[5] = true;
                                zArr3[6] = true;
                                i4 = 6;
                                Class<?> cls8222 = Class.forName($$c(274, bArr4222[i3], (byte) (-bArr4222[228])));
                                i11 = cls8222.getDeclaredField($$c(297, bArr4222[113], bArr4222[159])).getInt(cls8222);
                                if (i11 < 34) {
                                }
                                if (i11 != 29) {
                                    zArr3[0] = i11 != 29 && i11 >= 26;
                                    zArr3[1] = i11 >= 21;
                                    zArr3[4] = i11 >= 21;
                                    i5 = 0;
                                    i6 = 0;
                                    bArr = Throwable.class;
                                    while (i5 == 0) {
                                    }
                                    return;
                                }
                                zArr3[0] = i11 != 29 && i11 >= 26;
                                zArr3[1] = i11 >= 21;
                                zArr3[4] = i11 >= 21;
                                i5 = 0;
                                i6 = 0;
                                bArr = Throwable.class;
                                while (i5 == 0) {
                                }
                                return;
                            }
                            c6 = '\b';
                            invoke3 = null;
                            if (invoke != null) {
                            }
                            c7 = 777;
                            i2 = 379;
                            if (invoke3 == null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr42222 = $$a;
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr42222[i2], bArr42222[c7])), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[i] = invoke3;
                            objArr[4] = invoke2;
                            objArr[5] = invoke;
                            objArr[6] = invoke3;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[7];
                            zArr3[0] = false;
                            zArr3[1] = false;
                            zArr3[2] = true;
                            zArr3[i] = true;
                            zArr3[4] = false;
                            zArr3[5] = true;
                            zArr3[6] = true;
                            i4 = 6;
                            Class<?> cls82222 = Class.forName($$c(274, bArr42222[i3], (byte) (-bArr42222[228])));
                            i11 = cls82222.getDeclaredField($$c(297, bArr42222[113], bArr42222[159])).getInt(cls82222);
                            if (i11 < 34) {
                            }
                            zArr3[0] = i11 != 29 && i11 >= 26;
                            zArr3[1] = i11 >= 21;
                            zArr3[4] = i11 >= 21;
                            i5 = 0;
                            i6 = 0;
                            bArr = Throwable.class;
                            while (i5 == 0) {
                            }
                            return;
                        }
                        c5 = 311;
                        invoke2 = null;
                        if (obj != null) {
                        }
                        c6 = '\b';
                        invoke3 = null;
                        if (invoke != null) {
                        }
                        c7 = 777;
                        i2 = 379;
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr422222 = $$a;
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr422222[i2], bArr422222[c7])), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[i] = invoke3;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[0] = false;
                        zArr3[1] = false;
                        zArr3[2] = true;
                        zArr3[i] = true;
                        zArr3[4] = false;
                        zArr3[5] = true;
                        zArr3[6] = true;
                        i4 = 6;
                        Class<?> cls822222 = Class.forName($$c(274, bArr422222[i3], (byte) (-bArr422222[228])));
                        i11 = cls822222.getDeclaredField($$c(297, bArr422222[113], bArr422222[159])).getInt(cls822222);
                        if (i11 < 34) {
                        }
                        zArr3[0] = i11 != 29 && i11 >= 26;
                        zArr3[1] = i11 >= 21;
                        zArr3[4] = i11 >= 21;
                        i5 = 0;
                        i6 = 0;
                        bArr = Throwable.class;
                        while (i5 == 0) {
                        }
                        return;
                    }
                    c4 = 'M';
                    invoke = null;
                    if (obj != null) {
                    }
                    c5 = 311;
                    invoke2 = null;
                    if (obj != null) {
                    }
                    c6 = '\b';
                    invoke3 = null;
                    if (invoke != null) {
                    }
                    c7 = 777;
                    i2 = 379;
                    if (invoke3 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr4222222 = $$a;
                    objArr = (Object[]) Array.newInstance(Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr4222222[i2], bArr4222222[c7])), 7);
                    objArr[0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = invoke;
                    objArr[i] = invoke3;
                    objArr[4] = invoke2;
                    objArr[5] = invoke;
                    objArr[6] = invoke3;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[7];
                    zArr3[0] = false;
                    zArr3[1] = false;
                    zArr3[2] = true;
                    zArr3[i] = true;
                    zArr3[4] = false;
                    zArr3[5] = true;
                    zArr3[6] = true;
                    i4 = 6;
                    Class<?> cls8222222 = Class.forName($$c(274, bArr4222222[i3], (byte) (-bArr4222222[228])));
                    i11 = cls8222222.getDeclaredField($$c(297, bArr4222222[113], bArr4222222[159])).getInt(cls8222222);
                    if (i11 < 34) {
                    }
                    zArr3[0] = i11 != 29 && i11 >= 26;
                    zArr3[1] = i11 >= 21;
                    zArr3[4] = i11 >= 21;
                    i5 = 0;
                    i6 = 0;
                    bArr = Throwable.class;
                    while (i5 == 0) {
                    }
                    return;
                }
                c3 = '\r';
                obj = Class.forName($$c((short) ($$b & 943), r13[310], r13[977])).getMethod($$c(152, r13[13], (byte) (-$$a[311])), null).invoke(null, null);
                if (obj != null) {
                }
                c4 = 'M';
                invoke = null;
                if (obj != null) {
                }
                c5 = 311;
                invoke2 = null;
                if (obj != null) {
                }
                c6 = '\b';
                invoke3 = null;
                if (invoke != null) {
                }
                c7 = 777;
                i2 = 379;
                if (invoke3 == null) {
                }
                if (invoke2 == null) {
                }
                byte[] bArr42222222 = $$a;
                objArr = (Object[]) Array.newInstance(Class.forName($$c(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, bArr42222222[i2], bArr42222222[c7])), 7);
                objArr[0] = null;
                objArr[1] = invoke2;
                objArr[2] = invoke;
                objArr[i] = invoke3;
                objArr[4] = invoke2;
                objArr[5] = invoke;
                objArr[6] = invoke3;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                zArr3 = new boolean[7];
                zArr3[0] = false;
                zArr3[1] = false;
                zArr3[2] = true;
                zArr3[i] = true;
                zArr3[4] = false;
                zArr3[5] = true;
                zArr3[6] = true;
                i4 = 6;
                Class<?> cls82222222 = Class.forName($$c(274, bArr42222222[i3], (byte) (-bArr42222222[228])));
                i11 = cls82222222.getDeclaredField($$c(297, bArr42222222[113], bArr42222222[159])).getInt(cls82222222);
                if (i11 < 34) {
                }
                zArr3[0] = i11 != 29 && i11 >= 26;
                zArr3[1] = i11 >= 21;
                zArr3[4] = i11 >= 21;
                i5 = 0;
                i6 = 0;
                bArr = Throwable.class;
                while (i5 == 0) {
                }
                return;
            } catch (Exception e) {
                is8.h(e);
                return;
            }
            bArr = $$a;
            ?? r4 = Class.forName($$c(862, (byte) bArr[c8], (byte) bArr[379])).getDeclaredConstructor(Class.forName($$c(897, (byte) bArr[379], (byte) (-bArr[511]))), Class.forName($$c(915, (byte) bArr[379], (byte) (-bArr[c5]))));
            try {
                Object obj4 = obj3;
                Object newInstance = r4.newInstance(Class.forName($$c(897, (byte) bArr[379], (byte) (-bArr[511]))).getMethod($$c(935, (byte) bArr[135], (byte) bArr[c]), byte[].class).invoke(null, bArr2), obj4);
                try {
                    try {
                        try {
                            Field declaredField = Class.forName($$c(938, (byte) bArr[c8], (byte) (-bArr[18]))).getDeclaredField($$c(969, (byte) bArr[15], (byte) bArr[829]));
                            declaredField.setAccessible(true);
                            Object obj5 = declaredField.get(obj4);
                            Class<?> cls12 = obj5.getClass();
                            try {
                                Field declaredField2 = cls12.getDeclaredField($$c(976, (byte) bArr[5], (byte) (-bArr[228])));
                                declaredField2.setAccessible(true);
                                int i52 = $$b;
                                Field declaredField3 = cls12.getDeclaredField($$c((short) (i52 | 804), (byte) bArr[5], (byte) bArr[986]));
                                declaredField3.setAccessible(true);
                                Object obj6 = declaredField2.get(obj5);
                                Object obj7 = declaredField3.get(obj5);
                                Object obj8 = declaredField.get(newInstance);
                                ArrayList arrayList = new ArrayList((List) obj6);
                                try {
                                    Class cls13 = (Class) Class.class.getMethod($$c((short) ((i52 & 828) | (i52 ^ 828)), (byte) bArr[c3], (byte) bArr[193]), null).invoke(obj7.getClass(), null);
                                    int length = Array.getLength(obj7);
                                    Object newInstance2 = Array.newInstance((Class<?>) cls13, length);
                                    for (int i53 = 0; i53 < length; i53++) {
                                        Array.set(newInstance2, i53, Array.get(obj7, i53));
                                    }
                                    declaredField2.set(obj8, arrayList);
                                    declaredField3.set(obj8, newInstance2);
                                    if (enableTCFDataCollection == null) {
                                        int i54 = $10;
                                        $11 = (((i54 | 41) << 1) - (i54 ^ 41)) % 128;
                                        enableTCFDataCollection = newInstance;
                                    }
                                    Object invoke5 = newInstance;
                                    if (z3) {
                                        try {
                                            byte[] bArr10 = $$a;
                                            ?? cls14 = Class.forName($$c(685, bArr10[c8], (byte) (-bArr10[c5])));
                                            Method declaredMethod = cls14.getDeclaredMethod($$c(IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, bArr10[242], bArr10[150]), String.class, Class.forName($$c(915, bArr10[379], (byte) (-bArr10[c5]))));
                                            declaredMethod.setAccessible(true);
                                            try {
                                                ?? invoke6 = declaredMethod.invoke(invoke5, str2, Class.class.getMethod($$c(730, bArr10[c3], bArr10[262]), null).invoke(AFb1ySDK.class, null));
                                                if (invoke6 != null) {
                                                    cls14.getDeclaredMethod($$c(371, bArr10[c2], bArr10[842]), null).invoke(invoke5, null);
                                                }
                                                cls4 = invoke6;
                                                zipFile3 = cls14;
                                            } catch (Throwable th7) {
                                                Throwable cause5 = th7.getCause();
                                                if (cause5 == null) {
                                                    throw th7;
                                                }
                                                throw cause5;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            zipFile = zipFile2;
                                            bArr = cls3;
                                            i3 = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                                            zArr8 = zArr8;
                                            zArr7 = zArr7;
                                            zipFile.close();
                                            throw th;
                                        }
                                    } else {
                                        String str3 = str2;
                                        ?? cls15 = Class.forName($$c(915, r0[379], (byte) (-$$a[c5])));
                                        ?? declaredMethod2 = cls15.getDeclaredMethod($$c(IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, r0[242], r0[150]), String.class);
                                        try {
                                            declaredMethod2.setAccessible(true);
                                            cls15 = new Object[]{str3};
                                            cls4 = declaredMethod2.invoke(invoke5, cls15);
                                            zipFile3 = cls15;
                                        } catch (InvocationTargetException e2) {
                                            try {
                                                throw ((Exception) e2.getCause());
                                            } catch (ClassNotFoundException unused10) {
                                                cls4 = null;
                                                zipFile3 = cls15;
                                                if (cls4 == null) {
                                                    try {
                                                        Class cls16 = cls4;
                                                        byte[] bArr11 = $$a;
                                                        String str4 = $$c(1050, bArr11[c2], bArr11[c3]);
                                                        Constructor declaredConstructor = cls16.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                        declaredConstructor.setAccessible(true);
                                                        if (z3) {
                                                            z4 = false;
                                                        } else {
                                                            int i55 = $11;
                                                            $10 = ((i55 & 73) + (i55 | 73)) % 128;
                                                            z4 = true;
                                                        }
                                                        getSdkVersion = declaredConstructor.newInstance(invoke5, Boolean.valueOf(z4));
                                                        byte[] bArr12 = new byte[13718];
                                                        zipFile3 = zipFile2;
                                                        try {
                                                            try {
                                                                Object[] objArr3 = {zipFile3.getInputStream(zipFile3.getEntry($$c(1082, (byte) (-bArr11[752]), bArr11[135]).substring(1)))};
                                                                byte b = bArr11[379];
                                                                i3 = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                                                                try {
                                                                    try {
                                                                        Object newInstance3 = Class.forName($$c(498, bArr11[379], bArr11[474])).getDeclaredConstructor(Class.forName($$c(480, bArr11[379], (byte) (-bArr11[511])))).newInstance(Class.forName($$c(454, b, bArr11[310])).getDeclaredConstructor(Class.forName($$c(480, bArr11[379], (byte) (-bArr11[511])))).newInstance(objArr3));
                                                                        try {
                                                                            Class.forName($$c(498, bArr11[379], bArr11[474])).getMethod($$c(IronSourceError.ERROR_NO_INTERNET_CONNECTION, bArr11[c6], bArr11[150]), byte[].class).invoke(newInstance3, bArr12);
                                                                            $10 = ($11 + 113) % 128;
                                                                            try {
                                                                                Class.forName($$c(498, bArr11[379], bArr11[474])).getMethod($$c(371, bArr11[c2], bArr11[842]), null).invoke(newInstance3, null);
                                                                                ZipFile zipFile4 = zipFile3;
                                                                                zArr9 = zArr2;
                                                                                Object obj9 = obj2;
                                                                                zArr2 = zArr8;
                                                                                zArr3 = zArr7;
                                                                                i6 = i7;
                                                                                i20 = 4;
                                                                                i22 = 0;
                                                                                i4 = 6;
                                                                                int i56 = Math.abs(i10);
                                                                                int i57 = 13664;
                                                                                bArr = cls3;
                                                                            } catch (Throwable th9) {
                                                                                Throwable cause6 = th9.getCause();
                                                                                if (cause6 == null) {
                                                                                    throw th9;
                                                                                }
                                                                                throw cause6;
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            Throwable cause7 = th10.getCause();
                                                                            if (cause7 == null) {
                                                                                throw th10;
                                                                            }
                                                                            throw cause7;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        Throwable cause8 = th11.getCause();
                                                                        if (cause8 == null) {
                                                                            throw th11;
                                                                        }
                                                                        throw cause8;
                                                                    }
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable cause9 = th.getCause();
                                                                    if (cause9 == null) {
                                                                        throw th;
                                                                    }
                                                                    throw cause9;
                                                                }
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                            }
                                                        } catch (Throwable th14) {
                                                            th2 = th14;
                                                            i3 = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                                                            th = th2;
                                                            bArr = cls3;
                                                            zipFile = zipFile3;
                                                            zArr8 = zArr8;
                                                            zArr7 = zArr7;
                                                            zipFile.close();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th15) {
                                                        th2 = th15;
                                                        zipFile3 = zipFile2;
                                                    }
                                                } else {
                                                    try {
                                                        ZipFile zipFile5 = zipFile2;
                                                        i3 = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                                                        Constructor declaredConstructor2 = cls2.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                        declaredConstructor2.setAccessible(true);
                                                        getSdkVersion = declaredConstructor2.newInstance(invoke5, Boolean.valueOf(!z3));
                                                        int i58 = $11;
                                                        $10 = ((i58 ^ 83) + ((i58 & 83) << 1)) % 128;
                                                        try {
                                                            zipFile5.close();
                                                            cls5 = cls3;
                                                            i9 = 2;
                                                            i5 = 1;
                                                            i22 = 0;
                                                            i29 = 1;
                                                            i2 = 379;
                                                            Object obj10 = null;
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                            cls = cls3;
                                                            zArr5 = zArr8;
                                                            zArr6 = zArr7;
                                                            i8 = ((i7 | 1) << 1) - (i7 ^ 1);
                                                            while (i8 < 7) {
                                                            }
                                                            byte[] bArr13 = $$a;
                                                            String $$c5 = $$c(1130, bArr13[c9], bArr13[474]);
                                                            int i59 = $11;
                                                            $10 = ((i59 ^ 13) + ((i59 & 13) << 1)) % 128;
                                                            try {
                                                                throw ((Throwable) Class.forName($$c(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, bArr13[379], (byte) (-bArr13[511]))).getDeclaredConstructor(String.class, cls).newInstance($$c5, th));
                                                            } catch (Throwable th17) {
                                                                Throwable cause10 = th17.getCause();
                                                                if (cause10 == null) {
                                                                    throw th17;
                                                                }
                                                                throw cause10;
                                                            }
                                                        }
                                                        i6 = (i7 & 1) + (i7 | 1);
                                                        i12 = i9;
                                                        zArr9 = zArr2;
                                                        objArr = objArr2;
                                                        zArr = zArr4;
                                                        z = z2;
                                                        $$c = str;
                                                        zArr2 = zArr8;
                                                        zArr3 = zArr7;
                                                        i20 = 4;
                                                        i4 = 6;
                                                        bArr = cls5;
                                                    } catch (Throwable th18) {
                                                        th2 = th18;
                                                        th = th2;
                                                        bArr = cls3;
                                                        zipFile = zipFile3;
                                                        zArr8 = zArr8;
                                                        zArr7 = zArr7;
                                                        zipFile.close();
                                                        throw th;
                                                    }
                                                }
                                                th2 = th18;
                                                th = th2;
                                                bArr = cls3;
                                                zipFile = zipFile3;
                                                zArr8 = zArr8;
                                                zArr7 = zArr7;
                                                zipFile.close();
                                                throw th;
                                            }
                                        }
                                    }
                                    if (cls4 == null) {
                                    }
                                    th2 = th18;
                                } catch (Throwable th19) {
                                    r4 = zipFile2;
                                    i3 = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                                    try {
                                        Throwable cause11 = th19.getCause();
                                        if (cause11 == null) {
                                            throw th19;
                                        }
                                        throw cause11;
                                    } catch (Exception e3) {
                                        e = e3;
                                        try {
                                            StringBuilder sb2 = new StringBuilder();
                                            byte[] bArr14 = $$a;
                                            sb2.append($$c(IronSourceError.ERROR_RV_SHOW_EXCEPTION, bArr14[125], bArr14[842]));
                                            sb2.append(obj4);
                                            sb2.append($$c(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, bArr14[1141], bArr14[75]));
                                            try {
                                                try {
                                                    throw ((Throwable) Class.forName($$c(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, bArr14[379], (byte) (-bArr14[511]))).getDeclaredConstructor(String.class, cls3).newInstance(sb2.toString(), e));
                                                } catch (Throwable th20) {
                                                    th = th20;
                                                    Throwable cause12 = th.getCause();
                                                    if (cause12 == null) {
                                                        throw th;
                                                    }
                                                    throw cause12;
                                                }
                                            } catch (Throwable th21) {
                                                th = th21;
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            bArr = cls3;
                                            th = th;
                                            bArr = bArr;
                                            zipFile = r4;
                                            zArr8 = zArr8;
                                            zArr7 = zArr7;
                                            zipFile.close();
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                r4 = zipFile2;
                                i3 = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            r4 = zipFile2;
                            i3 = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                        } catch (Throwable th23) {
                            th2 = th23;
                            zipFile3 = zipFile2;
                            i3 = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                            th = th2;
                            bArr = cls3;
                            zipFile = zipFile3;
                            zArr8 = zArr8;
                            zArr7 = zArr7;
                            zipFile.close();
                            throw th;
                        }
                        zipFile.close();
                        throw th;
                    } catch (Throwable th24) {
                        th.addSuppressed(th24);
                        throw th;
                    }
                } catch (Throwable th25) {
                    th = th25;
                    cls = bArr;
                    zArr5 = zArr8;
                    zArr6 = zArr7;
                    i8 = ((i7 | 1) << 1) - (i7 ^ 1);
                    while (i8 < 7) {
                    }
                    byte[] bArr132 = $$a;
                    String $$c52 = $$c(1130, bArr132[c9], bArr132[474]);
                    int i592 = $11;
                    $10 = ((i592 ^ 13) + ((i592 & 13) << 1)) % 128;
                    throw ((Throwable) Class.forName($$c(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, bArr132[379], (byte) (-bArr132[511]))).getDeclaredConstructor(String.class, cls).newInstance($$c52, th));
                }
            } catch (Throwable th26) {
                Throwable cause13 = th26.getCause();
                if (cause13 == null) {
                    throw th26;
                }
                throw cause13;
            }
            th = th2;
            bArr = cls3;
            zipFile = zipFile3;
            zArr8 = zArr8;
            zArr7 = zArr7;
        } catch (Throwable th27) {
            Throwable cause14 = th27.getCause();
            if (cause14 == null) {
                throw th27;
            }
            throw cause14;
        }
    }

    private AFb1ySDK() {
    }

    public static Object AFLogger(int i, int i2, char c) {
        int i3 = $11;
        int i4 = i3 + 93;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Object obj = getSdkVersion;
        $10 = ((i3 ^ Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) + ((i3 & Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(585, bArr[223], bArr[13]), true, (ClassLoader) enableTCFDataCollection);
            String $$c = $$c(1152, bArr[8], bArr[262]);
            Class cls2 = Integer.TYPE;
            return cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i;
        int i2 = $10;
        int i3 = (i2 & 9) + (i2 | 9);
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            byte[] bArr = new byte[1185];
            System.arraycopy("'\u0096½êò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDÉñ\u0010é\u0015þõ\u00066éÑ\u0010é\u0015þõ\u0006\fñ\u0003\u0002õ\u0010\u0015Þ\u000eýùôúó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0¶&\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<õ\u0002\u0000þÓü0úÖ/Ð'\u0003Ï-Ô\u00003\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÛ8Ç\u0015\u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0¶&\u000eø÷ÿúúåë\u0005þ\u0004ü\f\rä\u0010ðÿ\nò\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0·%\u000eø&®Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ýÿûÑü\u0001-\u0002\u0000Ðû2ÿüû\bÍ4\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\fýýõþ\u000eò.Ö\u0002\u0003öù\u0006û\fýýõþ\u000eò.Ö\u0002\u0003öù".getBytes("ISO-8859-1"), 0, bArr, 0, 1185);
            $$a = bArr;
            i = 20131;
        } else {
            byte[] bArr2 = new byte[1185];
            System.arraycopy("'\u0096½êò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDÉñ\u0010é\u0015þõ\u00066éÑ\u0010é\u0015þõ\u0006\fñ\u0003\u0002õ\u0010\u0015Þ\u000eýùôúó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0¶&\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<õ\u0002\u0000þÓü0úÖ/Ð'\u0003Ï-Ô\u00003\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÛ8Ç\u0015\u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0¶&\u000eø÷ÿúúåë\u0005þ\u0004ü\f\rä\u0010ðÿ\nò\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0·%\u000eø&®Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ýÿûÑü\u0001-\u0002\u0000Ðû2ÿüû\bÍ4\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\fýýõþ\u000eò.Ö\u0002\u0003öù\u0006û\fýýõþ\u000eò.Ö\u0002\u0003öù".getBytes("ISO-8859-1"), 0, bArr2, 0, 1185);
            $$a = bArr2;
            i = 195;
        }
        $$b = i;
    }

    private static void registerClient(int i, int i2) {
        int i3 = $11 + 111;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static int unregisterClient(Object obj) {
        int i = $10;
        Object obj2 = getSdkVersion;
        int i2 = (((i | 81) << 1) - (i ^ 81)) % 128;
        $11 = i2;
        $10 = (i2 + 37) % 128;
        try {
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(585, bArr[223], bArr[13]), true, (ClassLoader) enableTCFDataCollection).getMethod($$c(1165, bArr[7], bArr[193]), Object.class).invoke(obj2, obj)).intValue();
            int i3 = $10 + 105;
            $11 = i3 % 128;
            if (i3 % 2 != 0) {
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

    public static int AFLogger(int i) {
        int i2 = $10;
        int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
        int i4 = i3 % 128;
        $11 = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        Object obj = getSdkVersion;
        $10 = (i4 + 25) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$a;
            return ((Integer) Class.forName($$c(585, bArr[223], bArr[13]), true, (ClassLoader) enableTCFDataCollection).getMethod($$c(1165, bArr[7], bArr[193]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
