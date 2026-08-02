package com.appsflyer.internal;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.ByteCompanionObject;
import okio.Segment;

/* loaded from: classes.dex */
public class AFa1hSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventType;
    private static long afDebugLog;
    private static int afErrorLog;
    private static byte[] afErrorLogForExcManagerOnly;
    private static int afInfoLog;
    private static int afVerboseLog;
    private static int afWarnLog;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4130d;

    /* renamed from: e, reason: collision with root package name */
    private static Object f4131e;
    private static long force;

    /* renamed from: i, reason: collision with root package name */
    private static Object f4132i;
    private static byte[] unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private static long f4133v;

    /* renamed from: w, reason: collision with root package name */
    private static byte[] f4134w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0032 -> B:7:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s8, short s10, int i5) {
        short s11;
        int i10 = $13;
        $12 = (i10 + 115) % 128;
        byte[] bArr = $$a;
        int i11 = 1173 - i5;
        int i12 = 119 - s10;
        byte[] bArr2 = new byte[s8 + 1];
        if (bArr == null) {
            int i13 = i10 + 121;
            $12 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 60 / 0;
            }
            int i15 = i11;
            byte[] bArr3 = bArr;
            short s12 = 0;
            i12 = (i12 + i11) - 3;
            i11 = i15 + 1;
            s11 = s12;
            bArr = bArr3;
            bArr2[s11] = (byte) i12;
            if (s11 == s8) {
                return new String(bArr2, 0);
            }
            ?? r02 = s11 + 1;
            i15 = i11;
            i11 = bArr[i11];
            bArr3 = bArr;
            s12 = r02;
            i12 = (i12 + i11) - 3;
            i11 = i15 + 1;
            s11 = s12;
            bArr = bArr3;
            bArr2[s11] = (byte) i12;
            if (s11 == s8) {
            }
        } else {
            s11 = 0;
            bArr2[s11] = (byte) i12;
            if (s11 == s8) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:1090|1091|1088|(5:1077|1078|1079|1080|1081)|25|(39:1073|1074|28|(0)|30|31|(0)|33|34|(0)|36|(0)(0)|(0)|54|55|56|57|58|59|60|61|62|63|64|(0)(0)|67|(0)|1021|72|73|(0)(0)|76|77|(0)(0)|80|81|(0)|1015|1016)|27|28|(0)|30|31|(0)|33|34|(0)|36|(0)(0)|(0)|54|55|56|57|58|59|60|61|62|63|64|(0)(0)|67|(0)|1021|72|73|(0)(0)|76|77|(0)(0)|80|81|(0)|1015|1016) */
    /* JADX WARN: Can't wrap try/catch for region: R(48:1090|1091|1088|1077|1078|1079|1080|1081|25|(39:1073|1074|28|(0)|30|31|(0)|33|34|(0)|36|(0)(0)|(0)|54|55|56|57|58|59|60|61|62|63|64|(0)(0)|67|(0)|1021|72|73|(0)(0)|76|77|(0)(0)|80|81|(0)|1015|1016)|27|28|(0)|30|31|(0)|33|34|(0)|36|(0)(0)|(0)|54|55|56|57|58|59|60|61|62|63|64|(0)(0)|67|(0)|1021|72|73|(0)(0)|76|77|(0)(0)|80|81|(0)|1015|1016) */
    /* JADX WARN: Code restructure failed: missing block: B:1025:0x0434, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1027:0x0437, code lost:
    
        r38 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1029:0x043a, code lost:
    
        r38 = r1;
        r36 = '8';
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04a2, code lost:
    
        if (((java.lang.Boolean) r1.getMethod($$c(r5, r2, (short) 865), null).invoke(r0, null)).booleanValue() != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01b3, code lost:
    
        if (r5 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x191b, code lost:
    
        r0 = r59.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
        com.appsflyer.internal.AFa1hSDK.f4132i = r0.newInstance(r1, java.lang.Boolean.valueOf(!r41));
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x1949, code lost:
    
        r0 = (int) java.lang.System.currentTimeMillis();
        r6 = ~(((-1250256032) ^ r0) | ((-1250256032) & r0));
        r7 = 2131057976 - (~(((r6 & 226762495) | (226762495 ^ r6)) * 262));
        r8 = (r7 & (-626405422)) + ((-626405422) | r7);
        r0 = ~r0;
        r0 = -(-(((~((r0 & (-1250256032)) | ((-1250256032) ^ r0))) | 226762495) * 262));
        r1 = (r8 & r0) + (r0 | r8);
        r0 = (int) java.lang.System.currentTimeMillis();
        r6 = ~((1195487659 & r0) | (1195487659 ^ r0));
        r7 = 1010254117 - (~(((r6 & 1652425198) | (1652425198 ^ r6)) * 398));
        r0 = ~r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x19ae, code lost:
    
        if (r1 <= ((r7 - (~(((~((r0 & 1195487659) | (1195487659 ^ r0))) | 1652425198) * 398))) - 1)) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x19bf, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x19c2, code lost:
    
        r7 = r66;
        r8 = true;
        r17 = 0;
        r18 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x19b0, code lost:
    
        r4.close();
        r0 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x19ba, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x19bb, code lost:
    
        r18 = 3;
        r2 = r2;
        r46 = r46;
        r57 = r57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x1d61 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1018:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:1019:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:1022:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:1030:0x02ad A[Catch: Exception -> 0x1d87, TRY_ENTER, TRY_LEAVE, TryCatch #90 {Exception -> 0x1d87, blocks: (B:8:0x015b, B:10:0x016e, B:43:0x032b, B:49:0x0377, B:51:0x037d, B:53:0x037e, B:54:0x037f, B:57:0x03d0, B:60:0x03d5, B:63:0x03e0, B:73:0x041a, B:77:0x0427, B:80:0x0431, B:87:0x0456, B:113:0x1c31, B:115:0x1c93, B:120:0x1c9f, B:125:0x1d45, B:129:0x1cc0, B:130:0x1cd0, B:136:0x1d1a, B:138:0x1d20, B:139:0x1d21, B:140:0x1cd7, B:1006:0x1d61, B:1009:0x1d68, B:1030:0x02ad, B:1038:0x1d6d, B:1040:0x1d73, B:1041:0x1d74, B:1044:0x1d76, B:1046:0x1d7c, B:1047:0x1d7d, B:1050:0x0265, B:1056:0x1d7f, B:1058:0x1d85, B:1059:0x1d86, B:1035:0x02f0, B:1033:0x02bb, B:46:0x033d, B:1053:0x0288, B:132:0x1ce4, B:133:0x1d18), top: B:7:0x015b, inners: #34, #40, #41, #46, #124 }] */
    /* JADX WARN: Removed duplicated region for block: B:1048:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:1060:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1064:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1073:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x1c93 A[Catch: Exception -> 0x1d87, TRY_LEAVE, TryCatch #90 {Exception -> 0x1d87, blocks: (B:8:0x015b, B:10:0x016e, B:43:0x032b, B:49:0x0377, B:51:0x037d, B:53:0x037e, B:54:0x037f, B:57:0x03d0, B:60:0x03d5, B:63:0x03e0, B:73:0x041a, B:77:0x0427, B:80:0x0431, B:87:0x0456, B:113:0x1c31, B:115:0x1c93, B:120:0x1c9f, B:125:0x1d45, B:129:0x1cc0, B:130:0x1cd0, B:136:0x1d1a, B:138:0x1d20, B:139:0x1d21, B:140:0x1cd7, B:1006:0x1d61, B:1009:0x1d68, B:1030:0x02ad, B:1038:0x1d6d, B:1040:0x1d73, B:1041:0x1d74, B:1044:0x1d76, B:1046:0x1d7c, B:1047:0x1d7d, B:1050:0x0265, B:1056:0x1d7f, B:1058:0x1d85, B:1059:0x1d86, B:1035:0x02f0, B:1033:0x02bb, B:46:0x033d, B:1053:0x0288, B:132:0x1ce4, B:133:0x1d18), top: B:7:0x015b, inners: #34, #40, #41, #46, #124 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x1cc0 A[Catch: Exception -> 0x1d87, TRY_ENTER, TryCatch #90 {Exception -> 0x1d87, blocks: (B:8:0x015b, B:10:0x016e, B:43:0x032b, B:49:0x0377, B:51:0x037d, B:53:0x037e, B:54:0x037f, B:57:0x03d0, B:60:0x03d5, B:63:0x03e0, B:73:0x041a, B:77:0x0427, B:80:0x0431, B:87:0x0456, B:113:0x1c31, B:115:0x1c93, B:120:0x1c9f, B:125:0x1d45, B:129:0x1cc0, B:130:0x1cd0, B:136:0x1d1a, B:138:0x1d20, B:139:0x1d21, B:140:0x1cd7, B:1006:0x1d61, B:1009:0x1d68, B:1030:0x02ad, B:1038:0x1d6d, B:1040:0x1d73, B:1041:0x1d74, B:1044:0x1d76, B:1046:0x1d7c, B:1047:0x1d7d, B:1050:0x0265, B:1056:0x1d7f, B:1058:0x1d85, B:1059:0x1d86, B:1035:0x02f0, B:1033:0x02bb, B:46:0x033d, B:1053:0x0288, B:132:0x1ce4, B:133:0x1d18), top: B:7:0x015b, inners: #34, #40, #41, #46, #124 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1cd7 A[Catch: Exception -> 0x1d87, TRY_LEAVE, TryCatch #90 {Exception -> 0x1d87, blocks: (B:8:0x015b, B:10:0x016e, B:43:0x032b, B:49:0x0377, B:51:0x037d, B:53:0x037e, B:54:0x037f, B:57:0x03d0, B:60:0x03d5, B:63:0x03e0, B:73:0x041a, B:77:0x0427, B:80:0x0431, B:87:0x0456, B:113:0x1c31, B:115:0x1c93, B:120:0x1c9f, B:125:0x1d45, B:129:0x1cc0, B:130:0x1cd0, B:136:0x1d1a, B:138:0x1d20, B:139:0x1d21, B:140:0x1cd7, B:1006:0x1d61, B:1009:0x1d68, B:1030:0x02ad, B:1038:0x1d6d, B:1040:0x1d73, B:1041:0x1d74, B:1044:0x1d76, B:1046:0x1d7c, B:1047:0x1d7d, B:1050:0x0265, B:1056:0x1d7f, B:1058:0x1d85, B:1059:0x1d86, B:1035:0x02f0, B:1033:0x02bb, B:46:0x033d, B:1053:0x0288, B:132:0x1ce4, B:133:0x1d18), top: B:7:0x015b, inners: #34, #40, #41, #46, #124 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x1792  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x191b A[EDGE_INSN: B:390:0x191b->B:391:0x191b BREAK  A[LOOP:2: B:190:0x0b28->B:356:0x18ca], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x1ae7 A[Catch: all -> 0x1a4b, TryCatch #16 {all -> 0x1a4b, blocks: (B:435:0x1a01, B:443:0x1a44, B:445:0x1a4a, B:446:0x1a4f, B:456:0x1a5d, B:458:0x1a67, B:459:0x1a68, B:483:0x1a7a, B:485:0x1a86, B:486:0x1a87, B:489:0x1a89, B:491:0x1a95, B:492:0x1a96, B:706:0x1ae1, B:708:0x1ae7, B:709:0x1ae8, B:758:0x1b21, B:760:0x1b27, B:761:0x1b28, B:774:0x1b35, B:776:0x1b4a, B:777:0x1b4b, B:783:0x1b73, B:785:0x1b79, B:786:0x1b7a, B:795:0x1b7c, B:797:0x1b93, B:798:0x1b94, B:804:0x1bb3, B:806:0x1bb9, B:807:0x1bba, B:188:0x0af4, B:438:0x1a13, B:439:0x1a42, B:304:0x1583, B:266:0x1408, B:177:0x0a82, B:263:0x13d3), top: B:187:0x0af4, inners: #9, #15, #23, #42, #44, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:709:0x1ae8 A[Catch: all -> 0x1a4b, TryCatch #16 {all -> 0x1a4b, blocks: (B:435:0x1a01, B:443:0x1a44, B:445:0x1a4a, B:446:0x1a4f, B:456:0x1a5d, B:458:0x1a67, B:459:0x1a68, B:483:0x1a7a, B:485:0x1a86, B:486:0x1a87, B:489:0x1a89, B:491:0x1a95, B:492:0x1a96, B:706:0x1ae1, B:708:0x1ae7, B:709:0x1ae8, B:758:0x1b21, B:760:0x1b27, B:761:0x1b28, B:774:0x1b35, B:776:0x1b4a, B:777:0x1b4b, B:783:0x1b73, B:785:0x1b79, B:786:0x1b7a, B:795:0x1b7c, B:797:0x1b93, B:798:0x1b94, B:804:0x1bb3, B:806:0x1bb9, B:807:0x1bba, B:188:0x0af4, B:438:0x1a13, B:439:0x1a42, B:304:0x1583, B:266:0x1408, B:177:0x0a82, B:263:0x13d3), top: B:187:0x0af4, inners: #9, #15, #23, #42, #44, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x1b27 A[Catch: all -> 0x1a4b, TryCatch #16 {all -> 0x1a4b, blocks: (B:435:0x1a01, B:443:0x1a44, B:445:0x1a4a, B:446:0x1a4f, B:456:0x1a5d, B:458:0x1a67, B:459:0x1a68, B:483:0x1a7a, B:485:0x1a86, B:486:0x1a87, B:489:0x1a89, B:491:0x1a95, B:492:0x1a96, B:706:0x1ae1, B:708:0x1ae7, B:709:0x1ae8, B:758:0x1b21, B:760:0x1b27, B:761:0x1b28, B:774:0x1b35, B:776:0x1b4a, B:777:0x1b4b, B:783:0x1b73, B:785:0x1b79, B:786:0x1b7a, B:795:0x1b7c, B:797:0x1b93, B:798:0x1b94, B:804:0x1bb3, B:806:0x1bb9, B:807:0x1bba, B:188:0x0af4, B:438:0x1a13, B:439:0x1a42, B:304:0x1583, B:266:0x1408, B:177:0x0a82, B:263:0x13d3), top: B:187:0x0af4, inners: #9, #15, #23, #42, #44, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:761:0x1b28 A[Catch: all -> 0x1a4b, TryCatch #16 {all -> 0x1a4b, blocks: (B:435:0x1a01, B:443:0x1a44, B:445:0x1a4a, B:446:0x1a4f, B:456:0x1a5d, B:458:0x1a67, B:459:0x1a68, B:483:0x1a7a, B:485:0x1a86, B:486:0x1a87, B:489:0x1a89, B:491:0x1a95, B:492:0x1a96, B:706:0x1ae1, B:708:0x1ae7, B:709:0x1ae8, B:758:0x1b21, B:760:0x1b27, B:761:0x1b28, B:774:0x1b35, B:776:0x1b4a, B:777:0x1b4b, B:783:0x1b73, B:785:0x1b79, B:786:0x1b7a, B:795:0x1b7c, B:797:0x1b93, B:798:0x1b94, B:804:0x1bb3, B:806:0x1bb9, B:807:0x1bba, B:188:0x0af4, B:438:0x1a13, B:439:0x1a42, B:304:0x1583, B:266:0x1408, B:177:0x0a82, B:263:0x13d3), top: B:187:0x0af4, inners: #9, #15, #23, #42, #44, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:785:0x1b79 A[Catch: all -> 0x1a4b, TryCatch #16 {all -> 0x1a4b, blocks: (B:435:0x1a01, B:443:0x1a44, B:445:0x1a4a, B:446:0x1a4f, B:456:0x1a5d, B:458:0x1a67, B:459:0x1a68, B:483:0x1a7a, B:485:0x1a86, B:486:0x1a87, B:489:0x1a89, B:491:0x1a95, B:492:0x1a96, B:706:0x1ae1, B:708:0x1ae7, B:709:0x1ae8, B:758:0x1b21, B:760:0x1b27, B:761:0x1b28, B:774:0x1b35, B:776:0x1b4a, B:777:0x1b4b, B:783:0x1b73, B:785:0x1b79, B:786:0x1b7a, B:795:0x1b7c, B:797:0x1b93, B:798:0x1b94, B:804:0x1bb3, B:806:0x1bb9, B:807:0x1bba, B:188:0x0af4, B:438:0x1a13, B:439:0x1a42, B:304:0x1583, B:266:0x1408, B:177:0x0a82, B:263:0x13d3), top: B:187:0x0af4, inners: #9, #15, #23, #42, #44, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:786:0x1b7a A[Catch: all -> 0x1a4b, TryCatch #16 {all -> 0x1a4b, blocks: (B:435:0x1a01, B:443:0x1a44, B:445:0x1a4a, B:446:0x1a4f, B:456:0x1a5d, B:458:0x1a67, B:459:0x1a68, B:483:0x1a7a, B:485:0x1a86, B:486:0x1a87, B:489:0x1a89, B:491:0x1a95, B:492:0x1a96, B:706:0x1ae1, B:708:0x1ae7, B:709:0x1ae8, B:758:0x1b21, B:760:0x1b27, B:761:0x1b28, B:774:0x1b35, B:776:0x1b4a, B:777:0x1b4b, B:783:0x1b73, B:785:0x1b79, B:786:0x1b7a, B:795:0x1b7c, B:797:0x1b93, B:798:0x1b94, B:804:0x1bb3, B:806:0x1bb9, B:807:0x1bba, B:188:0x0af4, B:438:0x1a13, B:439:0x1a42, B:304:0x1583, B:266:0x1408, B:177:0x0a82, B:263:0x13d3), top: B:187:0x0af4, inners: #9, #15, #23, #42, #44, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0456 A[Catch: Exception -> 0x1d87, TRY_ENTER, TRY_LEAVE, TryCatch #90 {Exception -> 0x1d87, blocks: (B:8:0x015b, B:10:0x016e, B:43:0x032b, B:49:0x0377, B:51:0x037d, B:53:0x037e, B:54:0x037f, B:57:0x03d0, B:60:0x03d5, B:63:0x03e0, B:73:0x041a, B:77:0x0427, B:80:0x0431, B:87:0x0456, B:113:0x1c31, B:115:0x1c93, B:120:0x1c9f, B:125:0x1d45, B:129:0x1cc0, B:130:0x1cd0, B:136:0x1d1a, B:138:0x1d20, B:139:0x1d21, B:140:0x1cd7, B:1006:0x1d61, B:1009:0x1d68, B:1030:0x02ad, B:1038:0x1d6d, B:1040:0x1d73, B:1041:0x1d74, B:1044:0x1d76, B:1046:0x1d7c, B:1047:0x1d7d, B:1050:0x0265, B:1056:0x1d7f, B:1058:0x1d85, B:1059:0x1d86, B:1035:0x02f0, B:1033:0x02bb, B:46:0x033d, B:1053:0x0288, B:132:0x1ce4, B:133:0x1d18), top: B:7:0x015b, inners: #34, #40, #41, #46, #124 }] */
    /* JADX WARN: Removed duplicated region for block: B:989:0x04ba A[Catch: all -> 0x04bb, TryCatch #76 {all -> 0x04bb, blocks: (B:97:0x04de, B:105:0x0537, B:107:0x053d, B:108:0x053e, B:987:0x04b4, B:989:0x04ba, B:990:0x04d7, B:100:0x0511, B:101:0x0535), top: B:96:0x04de, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:990:0x04d7 A[Catch: all -> 0x04bb, TryCatch #76 {all -> 0x04bb, blocks: (B:97:0x04de, B:105:0x0537, B:107:0x053d, B:108:0x053e, B:987:0x04b4, B:989:0x04ba, B:990:0x04d7, B:100:0x0511, B:101:0x0535), top: B:96:0x04de, inners: #11 }] */
    /* JADX WARN: Type inference failed for: r0v210, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v271, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v289, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v92, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [int] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r12v82, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v119, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v151, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v246, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v340 */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.Random] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.util.Random] */
    /* JADX WARN: Type inference failed for: r2v148, types: [byte, short] */
    /* JADX WARN: Type inference failed for: r2v149 */
    /* JADX WARN: Type inference failed for: r2v152, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v155, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v161 */
    /* JADX WARN: Type inference failed for: r2v162 */
    /* JADX WARN: Type inference failed for: r2v163 */
    /* JADX WARN: Type inference failed for: r2v170, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v171 */
    /* JADX WARN: Type inference failed for: r2v173, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v178, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v185, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v222 */
    /* JADX WARN: Type inference failed for: r2v235 */
    /* JADX WARN: Type inference failed for: r2v236 */
    /* JADX WARN: Type inference failed for: r2v247, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v331, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v335 */
    /* JADX WARN: Type inference failed for: r2v351 */
    /* JADX WARN: Type inference failed for: r2v352 */
    /* JADX WARN: Type inference failed for: r2v353 */
    /* JADX WARN: Type inference failed for: r2v359 */
    /* JADX WARN: Type inference failed for: r46v41 */
    /* JADX WARN: Type inference failed for: r46v6 */
    /* JADX WARN: Type inference failed for: r46v7 */
    /* JADX WARN: Type inference failed for: r4v89, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r57v9 */
    /* JADX WARN: Type inference failed for: r5v143, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v294, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v110, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v162, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v77, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v94, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r9v70, types: [java.lang.Class[]] */
    static {
        char c2;
        char c8;
        char c10;
        Object obj;
        int i5;
        Object invoke;
        Class<?> cls;
        byte[] bArr;
        char c11;
        Object invoke2;
        char c12;
        Object invoke3;
        char c13;
        char c14;
        Class<?> cls2;
        boolean z5;
        boolean z7;
        int i10;
        boolean z10;
        Class<Throwable> cls3;
        Class<byte[]> cls4;
        Integer num;
        Object obj2;
        boolean z11;
        boolean[] zArr;
        int i11;
        Object obj3;
        boolean[] zArr2;
        String str;
        Class<String> cls5;
        boolean[] zArr3;
        int i12;
        String str2;
        boolean[] zArr4;
        Object obj4;
        int i13;
        int i14;
        byte b10;
        byte b11;
        byte b12;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        int i15;
        int i16;
        int i17;
        Object obj12;
        int i18;
        boolean[] zArr5;
        Object obj13;
        boolean[] zArr6;
        String str3;
        ?? r22;
        Throwable th2;
        Throwable cause;
        int i19;
        int i20;
        byte[] bArr2;
        String str4;
        Class cls6;
        ?? r11;
        Throwable cause2;
        byte[] bArr3;
        ?? cls7;
        String str5;
        Object newInstance;
        int i21;
        Class cls8;
        Object obj14;
        Object obj15;
        Object obj16;
        char c15;
        Object invoke4;
        Object obj17;
        short s8;
        short s10;
        Object obj18;
        Class cls9;
        Throwable th3;
        Throwable cause3;
        Class<?> cls10;
        Throwable cause4;
        int i22;
        byte b13;
        Class<?> cls11;
        byte b14;
        byte b15;
        Class<?> cls12 = Integer.TYPE;
        Class<Throwable> cls13 = Throwable.class;
        Class<byte[]> cls14 = byte[].class;
        Integer num2 = 0;
        Object obj19 = AFa1hSDK.class;
        init$0();
        try {
            byte[] bArr4 = $$a;
            int i23 = 0;
            int i24 = 3;
            int intValue = ((Integer) Class.forName($$c(bArr4[194], bArr4[105], (short) 1169)).getMethod($$c(bArr4[26], bArr4[46], (short) 1136), cls12, cls12).invoke(null, 3, 7)).intValue();
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i25 = -(-((~(((-536873107) & currentTimeMillis) | ((-536873107) ^ currentTimeMillis))) * 623));
            int i26 = ((139775766 | i25) << 1) - (i25 ^ 139775766);
            int i27 = ((~currentTimeMillis) | 1354285828) * (-623);
            int i28 = (i26 & i27) + (i26 | i27);
            int i29 = -(-(((~((1405085453 ^ currentTimeMillis) | (1405085453 & currentTimeMillis))) | 536873106 | (~((-587672732) | currentTimeMillis))) * 623));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            int i31 = ~intValue;
            int i32 = ~((283040942 ^ i31) | (i31 & 283040942));
            int i33 = (153092945 ^ i32) | (i32 & 153092945);
            int i34 = ((-281025673) ^ intValue) | ((-281025673) & intValue);
            int i35 = ~i34;
            int i36 = -(-(((i33 ^ i35) | (i35 & i33)) * (-252)));
            int i37 = (i30 ^ i36) + ((i36 & i30) << 1) + 2098992860;
            int i38 = ~intValue;
            int i39 = (~((i38 & 283040942) | (283040942 ^ i38) | 155108215)) | (~i34);
            int i40 = i39 * 252;
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i41 = (((i37 * (-858)) + (i39 * 216720)) - (~((i40 | currentTimeMillis2) * (-859)))) - 1;
            int i42 = ~currentTimeMillis2;
            int i43 = ~((i42 ^ i40) | (i42 & i40));
            int i44 = ~i40;
            int i45 = ~i37;
            int i46 = (i44 ^ i45) | (i44 & i45);
            int i47 = ~((i46 ^ currentTimeMillis2) | (i46 & currentTimeMillis2));
            int i48 = (((i43 ^ i47) | (i43 & i47)) * 859) + i41;
            int i49 = ~(i45 | (~currentTimeMillis2));
            int i50 = ~i37;
            int i51 = ~((i40 & i50) | (i50 ^ i40));
            if ((i48 - (~(((i51 & i49) | (i49 ^ i51)) * 859))) - 1 == 0) {
                return;
            }
            f4133v = -3847093770088650534L;
            afWarnLog = 578427012;
            afVerboseLog = 3;
            afErrorLogForExcManagerOnly = new byte[]{38, -99, -103, -111, 76, -9, -5, 67};
            AFInAppEventType = new HashMap();
            f4130d = new HashMap();
            try {
                String $$c = $$c(bArr4[511], bArr4[107], (short) 1123);
                String $$c2 = f4132i == null ? $$c(bArr4[123], bArr4[107], (short) 1091) : null;
                try {
                    b13 = bArr4[23];
                    c2 = 511;
                } catch (Exception unused) {
                    c2 = 511;
                }
                try {
                    byte b16 = bArr4[105];
                    c8 = 'k';
                    try {
                        cls11 = Class.forName($$c(b13, b16, (short) (b16 | 1057)));
                        b14 = bArr4[6];
                        b15 = bArr4[107];
                        c10 = 'H';
                    } catch (Exception unused2) {
                        c10 = 'H';
                        obj = null;
                        c2 = c2;
                        c8 = c8;
                        try {
                            byte[] bArr5 = $$a;
                            Class<?> cls15 = Class.forName($$c(bArr5[c10], bArr5[105], (short) 1037));
                            byte b17 = bArr5[c8];
                            byte b18 = bArr5[4];
                            i5 = 6;
                            try {
                                obj = cls15.getMethod($$c(b17, b18, (short) ((b18 ^ 1000) | (b18 & 1000))), null).invoke(null, null);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            i5 = 6;
                            if (obj != null) {
                            }
                            invoke = null;
                            if (obj != null) {
                            }
                            c11 = 'O';
                            invoke2 = null;
                            c12 = c11;
                            if (obj != null) {
                            }
                            invoke3 = null;
                            Class<String> cls16 = String.class;
                            if (invoke == null) {
                            }
                            c13 = 694;
                            c14 = 'P';
                            if (invoke3 == null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr6 = $$a;
                            short s11 = (short) 952;
                            Object[] objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr6[c14], bArr6[26], s11)), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = invoke3;
                            objArr[4] = invoke2;
                            objArr[5] = invoke;
                            objArr[i5] = invoke3;
                            boolean[] zArr7 = {false, true, true, true, true, true, true};
                            boolean[] zArr8 = {false, false, false, false, true, true, true};
                            boolean[] zArr9 = new boolean[7];
                            zArr9[0] = false;
                            zArr9[1] = false;
                            zArr9[2] = true;
                            zArr9[3] = true;
                            zArr9[4] = false;
                            zArr9[5] = true;
                            zArr9[i5] = true;
                            byte b19 = bArr6[114];
                            char c16 = '8';
                            byte b20 = bArr6[105];
                            Object[] objArr2 = objArr;
                            Class<?> cls17 = Class.forName($$c(b19, b20, (short) ((b20 & 872) | (b20 ^ 872))));
                            byte b21 = bArr6[56];
                            byte b22 = bArr6[44];
                            i22 = cls17.getDeclaredField($$c(b21, b22, (short) (b22 | 835))).getInt(cls17);
                            if (i22 < 34) {
                            }
                            zArr9[0] = i22 != 29 && i22 >= 26;
                            zArr9[1] = i22 >= 21;
                            zArr9[4] = i22 >= 21;
                            z7 = false;
                            int i52 = 0;
                            ?? r112 = s11;
                            while (!z7) {
                            }
                        }
                        if (obj != null) {
                            try {
                                Class<?> cls18 = obj.getClass();
                                byte[] bArr7 = $$a;
                                invoke = cls18.getMethod($$c(bArr7[79], bArr7[4], (short) 996), null).invoke(obj, null);
                            } catch (Exception unused5) {
                                invoke = null;
                                if (obj != null) {
                                    try {
                                        cls = obj.getClass();
                                        bArr = $$a;
                                        c11 = 'O';
                                    } catch (Exception unused6) {
                                        c11 = 'O';
                                        invoke2 = null;
                                        c12 = c11;
                                        if (obj != null) {
                                        }
                                        invoke3 = null;
                                        Class<String> cls162 = String.class;
                                        if (invoke == null) {
                                        }
                                        c13 = 694;
                                        c14 = 'P';
                                        if (invoke3 == null) {
                                        }
                                        if (invoke2 == null) {
                                        }
                                        byte[] bArr62 = $$a;
                                        short s112 = (short) 952;
                                        Object[] objArr3 = (Object[]) Array.newInstance(Class.forName($$c(bArr62[c14], bArr62[26], s112)), 7);
                                        objArr3[0] = null;
                                        objArr3[1] = invoke2;
                                        objArr3[2] = invoke;
                                        objArr3[3] = invoke3;
                                        objArr3[4] = invoke2;
                                        objArr3[5] = invoke;
                                        objArr3[i5] = invoke3;
                                        boolean[] zArr72 = {false, true, true, true, true, true, true};
                                        boolean[] zArr82 = {false, false, false, false, true, true, true};
                                        boolean[] zArr92 = new boolean[7];
                                        zArr92[0] = false;
                                        zArr92[1] = false;
                                        zArr92[2] = true;
                                        zArr92[3] = true;
                                        zArr92[4] = false;
                                        zArr92[5] = true;
                                        zArr92[i5] = true;
                                        byte b192 = bArr62[114];
                                        char c162 = '8';
                                        byte b202 = bArr62[105];
                                        Object[] objArr22 = objArr3;
                                        Class<?> cls172 = Class.forName($$c(b192, b202, (short) ((b202 & 872) | (b202 ^ 872))));
                                        byte b212 = bArr62[56];
                                        byte b222 = bArr62[44];
                                        i22 = cls172.getDeclaredField($$c(b212, b222, (short) (b222 | 835))).getInt(cls172);
                                        if (i22 < 34) {
                                        }
                                        zArr92[0] = i22 != 29 && i22 >= 26;
                                        zArr92[1] = i22 >= 21;
                                        zArr92[4] = i22 >= 21;
                                        z7 = false;
                                        int i522 = 0;
                                        ?? r1122 = s112;
                                        while (!z7) {
                                        }
                                    }
                                    try {
                                        byte b23 = bArr[12];
                                        byte b24 = bArr[4];
                                        invoke2 = cls.getMethod($$c(b23, b24, (short) (b24 | 970)), null).invoke(obj, null);
                                        c12 = 'O';
                                    } catch (Exception unused7) {
                                        invoke2 = null;
                                        c12 = c11;
                                        if (obj != null) {
                                        }
                                        invoke3 = null;
                                        Class<String> cls1622 = String.class;
                                        if (invoke == null) {
                                        }
                                        c13 = 694;
                                        c14 = 'P';
                                        if (invoke3 == null) {
                                        }
                                        if (invoke2 == null) {
                                        }
                                        byte[] bArr622 = $$a;
                                        short s1122 = (short) 952;
                                        Object[] objArr32 = (Object[]) Array.newInstance(Class.forName($$c(bArr622[c14], bArr622[26], s1122)), 7);
                                        objArr32[0] = null;
                                        objArr32[1] = invoke2;
                                        objArr32[2] = invoke;
                                        objArr32[3] = invoke3;
                                        objArr32[4] = invoke2;
                                        objArr32[5] = invoke;
                                        objArr32[i5] = invoke3;
                                        boolean[] zArr722 = {false, true, true, true, true, true, true};
                                        boolean[] zArr822 = {false, false, false, false, true, true, true};
                                        boolean[] zArr922 = new boolean[7];
                                        zArr922[0] = false;
                                        zArr922[1] = false;
                                        zArr922[2] = true;
                                        zArr922[3] = true;
                                        zArr922[4] = false;
                                        zArr922[5] = true;
                                        zArr922[i5] = true;
                                        byte b1922 = bArr622[114];
                                        char c1622 = '8';
                                        byte b2022 = bArr622[105];
                                        Object[] objArr222 = objArr32;
                                        Class<?> cls1722 = Class.forName($$c(b1922, b2022, (short) ((b2022 & 872) | (b2022 ^ 872))));
                                        byte b2122 = bArr622[56];
                                        byte b2222 = bArr622[44];
                                        i22 = cls1722.getDeclaredField($$c(b2122, b2222, (short) (b2222 | 835))).getInt(cls1722);
                                        if (i22 < 34) {
                                        }
                                        zArr922[0] = i22 != 29 && i22 >= 26;
                                        zArr922[1] = i22 >= 21;
                                        zArr922[4] = i22 >= 21;
                                        z7 = false;
                                        int i5222 = 0;
                                        ?? r11222 = s1122;
                                        while (!z7) {
                                        }
                                    }
                                    if (obj != null) {
                                        try {
                                            Class<?> cls19 = obj.getClass();
                                            byte[] bArr8 = $$a;
                                            invoke3 = cls19.getMethod($$c(bArr8[c12], bArr8[4], (short) 972), null).invoke(obj, null);
                                        } catch (Exception unused8) {
                                            invoke3 = null;
                                            Class<String> cls16222 = String.class;
                                            if (invoke == null) {
                                            }
                                            c13 = 694;
                                            c14 = 'P';
                                            if (invoke3 == null) {
                                            }
                                            if (invoke2 == null) {
                                            }
                                            byte[] bArr6222 = $$a;
                                            short s11222 = (short) 952;
                                            Object[] objArr322 = (Object[]) Array.newInstance(Class.forName($$c(bArr6222[c14], bArr6222[26], s11222)), 7);
                                            objArr322[0] = null;
                                            objArr322[1] = invoke2;
                                            objArr322[2] = invoke;
                                            objArr322[3] = invoke3;
                                            objArr322[4] = invoke2;
                                            objArr322[5] = invoke;
                                            objArr322[i5] = invoke3;
                                            boolean[] zArr7222 = {false, true, true, true, true, true, true};
                                            boolean[] zArr8222 = {false, false, false, false, true, true, true};
                                            boolean[] zArr9222 = new boolean[7];
                                            zArr9222[0] = false;
                                            zArr9222[1] = false;
                                            zArr9222[2] = true;
                                            zArr9222[3] = true;
                                            zArr9222[4] = false;
                                            zArr9222[5] = true;
                                            zArr9222[i5] = true;
                                            byte b19222 = bArr6222[114];
                                            char c16222 = '8';
                                            byte b20222 = bArr6222[105];
                                            Object[] objArr2222 = objArr322;
                                            Class<?> cls17222 = Class.forName($$c(b19222, b20222, (short) ((b20222 & 872) | (b20222 ^ 872))));
                                            byte b21222 = bArr6222[56];
                                            byte b22222 = bArr6222[44];
                                            i22 = cls17222.getDeclaredField($$c(b21222, b22222, (short) (b22222 | 835))).getInt(cls17222);
                                            if (i22 < 34) {
                                            }
                                            zArr9222[0] = i22 != 29 && i22 >= 26;
                                            zArr9222[1] = i22 >= 21;
                                            zArr9222[4] = i22 >= 21;
                                            z7 = false;
                                            int i52222 = 0;
                                            ?? r112222 = s11222;
                                            while (!z7) {
                                            }
                                        }
                                        Class<String> cls162222 = String.class;
                                        if (invoke == null) {
                                            if ($$c2 != null) {
                                                StringBuilder sb2 = new StringBuilder();
                                                byte[] bArr9 = $$a;
                                                c13 = 694;
                                                c14 = 'P';
                                                sb2.append($$c(bArr9[c12], bArr9[694], (short) 962));
                                                sb2.append($$c2);
                                                try {
                                                    invoke = Class.forName($$c(bArr9[80], bArr9[26], (short) 952)).getDeclaredConstructor(cls162222).newInstance(sb2.toString());
                                                    if (invoke3 == null) {
                                                        cls2 = cls12;
                                                    } else {
                                                        byte[] bArr10 = $$a;
                                                        byte b25 = bArr10[26];
                                                        byte b26 = b25;
                                                        try {
                                                            Object[] objArr4 = {$$c(b25, b26, (short) (b26 | 928))};
                                                            Class<?> cls20 = Class.forName($$c(bArr10[0], bArr10[26], (short) 928));
                                                            byte b27 = bArr10[c12];
                                                            byte b28 = bArr10[4];
                                                            cls2 = cls12;
                                                            try {
                                                                invoke3 = Class.forName($$c(bArr10[c14], bArr10[26], (short) 952)).getDeclaredConstructor(cls162222).newInstance(cls20.getMethod($$c(b27, b28, (short) ((b28 & 897) | (b28 ^ 897))), cls162222).invoke(null, objArr4));
                                                            } catch (Throwable th4) {
                                                                Throwable cause5 = th4.getCause();
                                                                if (cause5 == null) {
                                                                    throw th4;
                                                                }
                                                                throw cause5;
                                                            }
                                                        } catch (Throwable th5) {
                                                            Throwable cause6 = th5.getCause();
                                                            if (cause6 == null) {
                                                                throw th5;
                                                            }
                                                            throw cause6;
                                                        }
                                                    }
                                                    if (invoke2 == null) {
                                                        int i53 = $10;
                                                        int i54 = (((i53 | 1) << 1) - (i53 ^ 1)) % 128;
                                                        $11 = i54;
                                                        if (invoke != null) {
                                                            $10 = (i54 + 7) % 128;
                                                            byte[] bArr11 = $$a;
                                                            try {
                                                                short s12 = (short) 952;
                                                                invoke2 = Class.forName($$c(bArr11[c14], bArr11[26], s12)).getDeclaredConstructor(Class.forName($$c(bArr11[c14], bArr11[26], s12)), cls162222).newInstance(invoke, $$c(bArr11[47], bArr11[c8], (short) 903));
                                                            } catch (Throwable th6) {
                                                                Throwable cause7 = th6.getCause();
                                                                if (cause7 == null) {
                                                                    throw th6;
                                                                }
                                                                throw cause7;
                                                            }
                                                        }
                                                    }
                                                    byte[] bArr62222 = $$a;
                                                    short s112222 = (short) 952;
                                                    Object[] objArr3222 = (Object[]) Array.newInstance(Class.forName($$c(bArr62222[c14], bArr62222[26], s112222)), 7);
                                                    objArr3222[0] = null;
                                                    objArr3222[1] = invoke2;
                                                    objArr3222[2] = invoke;
                                                    objArr3222[3] = invoke3;
                                                    objArr3222[4] = invoke2;
                                                    objArr3222[5] = invoke;
                                                    objArr3222[i5] = invoke3;
                                                    boolean[] zArr72222 = {false, true, true, true, true, true, true};
                                                    boolean[] zArr82222 = {false, false, false, false, true, true, true};
                                                    boolean[] zArr92222 = new boolean[7];
                                                    zArr92222[0] = false;
                                                    zArr92222[1] = false;
                                                    zArr92222[2] = true;
                                                    zArr92222[3] = true;
                                                    zArr92222[4] = false;
                                                    zArr92222[5] = true;
                                                    zArr92222[i5] = true;
                                                    byte b192222 = bArr62222[114];
                                                    char c162222 = '8';
                                                    byte b202222 = bArr62222[105];
                                                    Object[] objArr22222 = objArr3222;
                                                    Class<?> cls172222 = Class.forName($$c(b192222, b202222, (short) ((b202222 & 872) | (b202222 ^ 872))));
                                                    byte b212222 = bArr62222[56];
                                                    byte b222222 = bArr62222[44];
                                                    i22 = cls172222.getDeclaredField($$c(b212222, b222222, (short) (b222222 | 835))).getInt(cls172222);
                                                    if (i22 < 34) {
                                                        System.currentTimeMillis();
                                                        System.currentTimeMillis();
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    zArr92222[0] = i22 != 29 && i22 >= 26;
                                                    zArr92222[1] = i22 >= 21;
                                                    zArr92222[4] = i22 >= 21;
                                                    z7 = false;
                                                    int i522222 = 0;
                                                    ?? r1122222 = s112222;
                                                    while (!z7 && i522222 < 9) {
                                                        i10 = $11 + 97;
                                                        $10 = i10 % 128;
                                                        if (i10 % 2 == 0) {
                                                            boolean z12 = zArr92222[i522222];
                                                            throw null;
                                                        }
                                                        if (zArr92222[i522222]) {
                                                            try {
                                                                boolean z13 = zArr72222[i522222];
                                                                Object obj20 = objArr22222[i522222];
                                                                boolean z14 = zArr82222[i522222];
                                                                if (z13) {
                                                                    if (obj20 != null) {
                                                                        try {
                                                                            byte[] bArr12 = $$a;
                                                                            z10 = z5;
                                                                            try {
                                                                                cls3 = cls13;
                                                                                try {
                                                                                    Class<?> cls21 = Class.forName($$c(bArr12[c14], bArr12[26], r1122222 == true ? 1 : 0));
                                                                                    byte b29 = bArr12[274];
                                                                                    byte b30 = bArr12[c8];
                                                                                    cls4 = cls14;
                                                                                    try {
                                                                                    } catch (Throwable th7) {
                                                                                        th = th7;
                                                                                        cause4 = th.getCause();
                                                                                        if (cause4 == null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause4;
                                                                                    }
                                                                                } catch (Throwable th8) {
                                                                                    th = th8;
                                                                                    cause4 = th.getCause();
                                                                                    if (cause4 == null) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                cause4 = th.getCause();
                                                                                if (cause4 == null) {
                                                                                }
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                        }
                                                                    } else {
                                                                        z10 = z5;
                                                                        cls3 = cls13;
                                                                        cls4 = cls14;
                                                                    }
                                                                    try {
                                                                        StringBuilder sb3 = new StringBuilder();
                                                                        byte[] bArr13 = $$a;
                                                                        sb3.append($$c(bArr13[16], bArr13[126], (short) 858));
                                                                        sb3.append(obj20);
                                                                        short s13 = (short) 854;
                                                                        sb3.append($$c(bArr13[7], bArr13[i24], s13));
                                                                        try {
                                                                            Object[] objArr5 = new Object[1];
                                                                            objArr5[i23] = sb3.toString();
                                                                            Class<?> cls22 = Class.forName($$c(bArr13[14], bArr13[26], s13));
                                                                            Class<?>[] clsArr = new Class[1];
                                                                            clsArr[i23] = cls162222;
                                                                            throw ((Throwable) cls22.getDeclaredConstructor(clsArr).newInstance(objArr5));
                                                                        } catch (Throwable th11) {
                                                                            Throwable cause8 = th11.getCause();
                                                                            if (cause8 == null) {
                                                                                throw th11;
                                                                            }
                                                                            throw cause8;
                                                                        }
                                                                    } catch (Throwable th12) {
                                                                        th = th12;
                                                                        num = num2;
                                                                        obj5 = obj19;
                                                                        z11 = z7;
                                                                        zArr4 = zArr72222;
                                                                        i12 = i522222;
                                                                        obj3 = r1122222 == true ? 1 : 0;
                                                                        zArr2 = zArr82222;
                                                                        str2 = $$c;
                                                                        cls5 = cls162222;
                                                                        zArr3 = zArr92222;
                                                                        obj4 = obj5;
                                                                        int currentTimeMillis3 = (int) System.currentTimeMillis();
                                                                        int i55 = -(-(i12 * (-69)));
                                                                        int i56 = (71 & i55) + (i55 | 71);
                                                                        int i57 = ~(((-2) & i12) | ((-2) ^ i12));
                                                                        int i58 = ~((i12 ^ currentTimeMillis3) | (i12 & currentTimeMillis3));
                                                                        int i59 = -(-(((i57 & i58) | (i57 ^ i58)) * (-140)));
                                                                        int i60 = (i56 & i59) + (i59 | i56);
                                                                        int i61 = (i12 ^ 1) | (i12 & 1);
                                                                        int i62 = (i60 - (~(-(-((~((i61 & currentTimeMillis3) | (i61 ^ currentTimeMillis3))) * 70))))) - 1;
                                                                        int i63 = ~(((-2) & i12) | ((-2) ^ i12));
                                                                        i11 = i12;
                                                                        int i64 = ~i11;
                                                                        int i65 = i63 | (~((i64 & 1) | (i64 ^ 1)));
                                                                        int i66 = ~((currentTimeMillis3 & 1) | (currentTimeMillis3 ^ 1));
                                                                        int i67 = -(-(((i66 & i65) | (i65 ^ i66)) * 70));
                                                                        while (i13 < 7) {
                                                                        }
                                                                        int i68 = $11;
                                                                        i14 = (i68 & 57) + (i68 | 57);
                                                                        $10 = i14 % 128;
                                                                        if (i14 % 2 == 0) {
                                                                        }
                                                                        try {
                                                                            Object[] objArr6 = {$$c(b10, b11, b12), th};
                                                                            byte[] bArr14 = $$a;
                                                                            throw ((Throwable) Class.forName($$c(bArr14[14], bArr14[26], (short) 854)).getDeclaredConstructor(cls5, cls3).newInstance(objArr6));
                                                                        } catch (Throwable th13) {
                                                                            Throwable cause9 = th13.getCause();
                                                                            if (cause9 == null) {
                                                                                throw th13;
                                                                            }
                                                                            throw cause9;
                                                                        }
                                                                    }
                                                                }
                                                                z10 = z5;
                                                                cls3 = cls13;
                                                                cls4 = cls14;
                                                                if (z13) {
                                                                    try {
                                                                        ?? random = new Random();
                                                                        try {
                                                                            byte[] bArr15 = $$a;
                                                                            ?? r46 = 26;
                                                                            num = num2;
                                                                            try {
                                                                                try {
                                                                                    random.setSeed(((Long) Class.forName($$c(bArr15[i23], bArr15[26], (short) 928)).getMethod($$c(bArr15[4], bArr15[c8], (short) 836), null).invoke(null, null)).longValue() ^ (-1617552406));
                                                                                    Object obj21 = null;
                                                                                    Object obj22 = null;
                                                                                    Object obj23 = null;
                                                                                    obj6 = null;
                                                                                    boolean[] zArr10 = random;
                                                                                    String str6 = str;
                                                                                    while (obj21 == null) {
                                                                                        int i69 = $11 + 25;
                                                                                        Object obj24 = obj21;
                                                                                        $10 = i69 % 128;
                                                                                        if (i69 % 2 != 0) {
                                                                                            throw null;
                                                                                        }
                                                                                        if (obj22 == null) {
                                                                                            obj10 = obj22;
                                                                                            obj11 = obj23;
                                                                                            i15 = i5;
                                                                                        } else if (obj23 == null) {
                                                                                            Object obj25 = obj22;
                                                                                            int i70 = ~((int) System.currentTimeMillis());
                                                                                            int i71 = ((321061583 | (~(((-124302408) ^ i70) | ((-124302408) & i70)))) * (-933)) - 1283983286;
                                                                                            int i72 = ~(321061583 | i70);
                                                                                            int i73 = (((i72 ^ (-392935120)) | (i72 & (-392935120))) * 933) + i71;
                                                                                            int i74 = (i73 & 1526217128) + (i73 | 1526217128);
                                                                                            obj11 = obj23;
                                                                                            int currentTimeMillis4 = (int) System.currentTimeMillis();
                                                                                            z11 = 1507632205;
                                                                                            int i75 = (1507632205 ^ currentTimeMillis4) | (1507632205 & currentTimeMillis4);
                                                                                            obj10 = obj25;
                                                                                            int i76 = -(-((291676384 | (~i75)) * (-668)));
                                                                                            int i77 = (((-1369678672) | i76) << 1) - ((-1369678672) ^ i76);
                                                                                            int i78 = ~((291676384 ^ currentTimeMillis4) | (291676384 & currentTimeMillis4));
                                                                                            int i79 = -(-(((1507632205 & i78) | (1507632205 ^ i78)) * 1336));
                                                                                            if (i74 <= ((i75 | 291676384) * 668) + (i77 ^ i79) + ((i77 & i79) << 1)) {
                                                                                                i15 = 5;
                                                                                            }
                                                                                            i15 = 4;
                                                                                        } else {
                                                                                            obj10 = obj22;
                                                                                            obj11 = obj23;
                                                                                            if (obj6 != null) {
                                                                                                i15 = i24;
                                                                                            }
                                                                                            i15 = 4;
                                                                                        }
                                                                                        StringBuilder sb4 = new StringBuilder((i15 ^ 1) + ((i15 & 1) << 1));
                                                                                        sb4.append('.');
                                                                                        int i80 = i23;
                                                                                        ?? r12 = zArr10;
                                                                                        int i81 = r46;
                                                                                        String str7 = str6;
                                                                                        while (i80 < i15) {
                                                                                            int i82 = i15;
                                                                                            if (z14) {
                                                                                                try {
                                                                                                    int nextInt = r12.nextInt(26);
                                                                                                    if (r12.nextBoolean()) {
                                                                                                        int i83 = -(-nextInt);
                                                                                                        i18 = (i83 ^ 65) + ((i83 & 65) << 1);
                                                                                                        i17 = i80;
                                                                                                        str7 = str7;
                                                                                                    } else {
                                                                                                        i17 = i80;
                                                                                                        int currentTimeMillis5 = (int) System.currentTimeMillis();
                                                                                                        int i84 = 1057 - (~(nextInt * 530));
                                                                                                        int i85 = (i84 ^ 50880) + ((i84 & 50880) << 1);
                                                                                                        ?? r57 = nextInt;
                                                                                                        int i86 = ((~((nextInt ^ 96) | (nextInt & 96))) | (~((~currentTimeMillis5) | nextInt))) * 529;
                                                                                                        int i87 = (i85 ^ i86) + ((i85 & i86) << 1);
                                                                                                        int i88 = ~((r57 ^ currentTimeMillis5) | (r57 & currentTimeMillis5));
                                                                                                        int i89 = -(-((((-97) ^ i88) | (i88 & (-97))) * 529));
                                                                                                        i18 = (i89 | i87) + (i87 & i89);
                                                                                                        str7 = r57;
                                                                                                    }
                                                                                                    sb4.append((char) i18);
                                                                                                    obj12 = r12;
                                                                                                } catch (Throwable th14) {
                                                                                                    th = th14;
                                                                                                    obj5 = obj19;
                                                                                                    z11 = z7;
                                                                                                    zArr4 = zArr72222;
                                                                                                    i12 = i522222;
                                                                                                    obj3 = r1122222 == true ? 1 : 0;
                                                                                                    zArr2 = zArr82222;
                                                                                                    str2 = $$c;
                                                                                                    cls5 = cls162222;
                                                                                                    zArr3 = zArr92222;
                                                                                                    obj4 = obj5;
                                                                                                    int currentTimeMillis32 = (int) System.currentTimeMillis();
                                                                                                    int i552 = -(-(i12 * (-69)));
                                                                                                    int i562 = (71 & i552) + (i552 | 71);
                                                                                                    int i572 = ~(((-2) & i12) | ((-2) ^ i12));
                                                                                                    int i582 = ~((i12 ^ currentTimeMillis32) | (i12 & currentTimeMillis32));
                                                                                                    int i592 = -(-(((i572 & i582) | (i572 ^ i582)) * (-140)));
                                                                                                    int i602 = (i562 & i592) + (i592 | i562);
                                                                                                    int i612 = (i12 ^ 1) | (i12 & 1);
                                                                                                    int i622 = (i602 - (~(-(-((~((i612 & currentTimeMillis32) | (i612 ^ currentTimeMillis32))) * 70))))) - 1;
                                                                                                    int i632 = ~(((-2) & i12) | ((-2) ^ i12));
                                                                                                    i11 = i12;
                                                                                                    int i642 = ~i11;
                                                                                                    int i652 = i632 | (~((i642 & 1) | (i642 ^ 1)));
                                                                                                    int i662 = ~((currentTimeMillis32 & 1) | (currentTimeMillis32 ^ 1));
                                                                                                    int i672 = -(-(((i662 & i652) | (i652 ^ i662)) * 70));
                                                                                                    while (i13 < 7) {
                                                                                                    }
                                                                                                    int i682 = $11;
                                                                                                    i14 = (i682 & 57) + (i682 | 57);
                                                                                                    $10 = i14 % 128;
                                                                                                    if (i14 % 2 == 0) {
                                                                                                    }
                                                                                                    Object[] objArr62 = {$$c(b10, b11, b12), th};
                                                                                                    byte[] bArr142 = $$a;
                                                                                                    throw ((Throwable) Class.forName($$c(bArr142[14], bArr142[26], (short) 854)).getDeclaredConstructor(cls5, cls3).newInstance(objArr62));
                                                                                                }
                                                                                            } else {
                                                                                                i17 = i80;
                                                                                                int nextInt2 = r12.nextInt(12);
                                                                                                Object obj26 = r12;
                                                                                                int currentTimeMillis6 = (int) System.currentTimeMillis();
                                                                                                int i90 = nextInt2 * 70;
                                                                                                int i91 = (i90 & (-557056)) + (i90 | (-557056));
                                                                                                int i92 = ~nextInt2;
                                                                                                obj12 = obj26;
                                                                                                int i93 = (i92 & (-8193)) | (i92 ^ (-8193));
                                                                                                int i94 = ~((i93 & currentTimeMillis6) | (i93 ^ currentTimeMillis6));
                                                                                                int i95 = (nextInt2 & Segment.SIZE) | (nextInt2 ^ Segment.SIZE);
                                                                                                int i96 = (i94 | (~((i95 & currentTimeMillis6) | (i95 ^ currentTimeMillis6)))) * 69;
                                                                                                int i97 = (i91 & i96) + (i91 | i96);
                                                                                                int i98 = ~nextInt2;
                                                                                                int i99 = ~((i98 ^ Segment.SIZE) | (i98 & Segment.SIZE));
                                                                                                int i100 = ~((i98 ^ currentTimeMillis6) | (i98 & currentTimeMillis6));
                                                                                                sb4.append((char) (((~((-8193) | nextInt2)) * 69) + (((~((currentTimeMillis6 & Segment.SIZE) | (currentTimeMillis6 ^ Segment.SIZE))) | (i99 ^ i100) | (i100 & i99)) * (-69)) + i97));
                                                                                            }
                                                                                            i80 = i17 + 1;
                                                                                            i15 = i82;
                                                                                            r12 = obj12;
                                                                                            i81 = i82;
                                                                                            str7 = str7;
                                                                                        }
                                                                                        zArr2 = r12;
                                                                                        String sb5 = sb4.toString();
                                                                                        if (obj10 == null) {
                                                                                            try {
                                                                                                Object[] objArr7 = new Object[2];
                                                                                                objArr7[1] = sb5;
                                                                                                objArr7[i23] = obj20;
                                                                                                byte[] bArr16 = $$a;
                                                                                                Class<?> cls23 = Class.forName($$c(bArr16[c14], bArr16[26], r1122222 == true ? 1 : 0));
                                                                                                Class<?>[] clsArr2 = new Class[2];
                                                                                                clsArr2[i23] = Class.forName($$c(bArr16[c14], bArr16[26], r1122222 == true ? 1 : 0));
                                                                                                clsArr2[1] = cls162222;
                                                                                                obj22 = cls23.getDeclaredConstructor(clsArr2).newInstance(objArr7);
                                                                                                z11 = z7;
                                                                                                obj21 = obj24;
                                                                                                obj23 = obj11;
                                                                                                z7 = z11;
                                                                                                zArr10 = zArr2;
                                                                                                r46 = i81;
                                                                                                str6 = str7;
                                                                                            } catch (Throwable th15) {
                                                                                                Throwable cause10 = th15.getCause();
                                                                                                if (cause10 == null) {
                                                                                                    throw th15;
                                                                                                }
                                                                                                throw cause10;
                                                                                            }
                                                                                        } else {
                                                                                            if (obj11 == null) {
                                                                                                int i101 = $10;
                                                                                                $11 = (((i101 | 85) << 1) - (i101 ^ 85)) % 128;
                                                                                                try {
                                                                                                    Object[] objArr8 = new Object[2];
                                                                                                    objArr8[1] = sb5;
                                                                                                    objArr8[i23] = obj20;
                                                                                                    byte[] bArr17 = $$a;
                                                                                                    Class<?> cls24 = Class.forName($$c(bArr17[c14], bArr17[26], r1122222 == true ? 1 : 0));
                                                                                                    Class<?>[] clsArr3 = new Class[2];
                                                                                                    clsArr3[i23] = Class.forName($$c(bArr17[c14], bArr17[26], r1122222 == true ? 1 : 0));
                                                                                                    clsArr3[1] = cls162222;
                                                                                                    obj23 = cls24.getDeclaredConstructor(clsArr3).newInstance(objArr8);
                                                                                                    z11 = z7;
                                                                                                    obj21 = obj24;
                                                                                                    i81 = i81;
                                                                                                    obj22 = obj10;
                                                                                                } catch (Throwable th16) {
                                                                                                    Throwable cause11 = th16.getCause();
                                                                                                    if (cause11 == null) {
                                                                                                        throw th16;
                                                                                                    }
                                                                                                    throw cause11;
                                                                                                }
                                                                                            } else {
                                                                                                if (obj6 == null) {
                                                                                                    try {
                                                                                                        Object[] objArr9 = new Object[2];
                                                                                                        objArr9[1] = sb5;
                                                                                                        objArr9[i23] = obj20;
                                                                                                        byte[] bArr18 = $$a;
                                                                                                        Class<?> cls25 = Class.forName($$c(bArr18[c14], bArr18[26], r1122222 == true ? 1 : 0));
                                                                                                        Class<?>[] clsArr4 = new Class[2];
                                                                                                        clsArr4[i23] = Class.forName($$c(bArr18[c14], bArr18[26], r1122222 == true ? 1 : 0));
                                                                                                        clsArr4[1] = cls162222;
                                                                                                        obj6 = cls25.getDeclaredConstructor(clsArr4).newInstance(objArr9);
                                                                                                        z11 = z7;
                                                                                                        obj21 = obj24;
                                                                                                        i16 = i81;
                                                                                                    } catch (Throwable th17) {
                                                                                                        Throwable cause12 = th17.getCause();
                                                                                                        if (cause12 == null) {
                                                                                                            throw th17;
                                                                                                        }
                                                                                                        throw cause12;
                                                                                                    }
                                                                                                } else {
                                                                                                    try {
                                                                                                        try {
                                                                                                            Object[] objArr10 = new Object[2];
                                                                                                            objArr10[1] = sb5;
                                                                                                            objArr10[i23] = obj20;
                                                                                                            byte[] bArr19 = $$a;
                                                                                                            Class<?> cls26 = Class.forName($$c(bArr19[c14], bArr19[26], r1122222 == true ? 1 : 0));
                                                                                                            Class<?> cls27 = Class.forName($$c(bArr19[c14], bArr19[26], r1122222 == true ? 1 : 0));
                                                                                                            Class<?>[] clsArr5 = new Class[2];
                                                                                                            clsArr5[i23] = cls27;
                                                                                                            clsArr5[1] = cls162222;
                                                                                                            Object newInstance2 = cls26.getDeclaredConstructor(clsArr5).newInstance(objArr10);
                                                                                                            try {
                                                                                                                Object[] objArr11 = new Object[1];
                                                                                                                objArr11[i23] = newInstance2;
                                                                                                                short s14 = (short) 820;
                                                                                                                Class<?> cls28 = Class.forName($$c(bArr19[114], bArr19[26], s14));
                                                                                                                i16 = 26;
                                                                                                                z11 = z7;
                                                                                                                try {
                                                                                                                    Class<?>[] clsArr6 = new Class[1];
                                                                                                                    clsArr6[i23] = Class.forName($$c(bArr19[c14], bArr19[26], r1122222 == true ? 1 : 0));
                                                                                                                    Object newInstance3 = cls28.getDeclaredConstructor(clsArr6).newInstance(objArr11);
                                                                                                                    try {
                                                                                                                        Class<?> cls29 = Class.forName($$c(bArr19[114], bArr19[26], s14));
                                                                                                                        byte b31 = bArr19[16];
                                                                                                                        byte b32 = bArr19[c8];
                                                                                                                        cls29.getMethod($$c(b31, b32, (short) ((b32 ^ 777) | (b32 & 777))), null).invoke(newInstance3, null);
                                                                                                                        obj21 = newInstance2;
                                                                                                                    } catch (Throwable th18) {
                                                                                                                        Throwable cause13 = th18.getCause();
                                                                                                                        if (cause13 == null) {
                                                                                                                            throw th18;
                                                                                                                        }
                                                                                                                        throw cause13;
                                                                                                                    }
                                                                                                                } catch (Throwable th19) {
                                                                                                                    th = th19;
                                                                                                                    Throwable cause14 = th.getCause();
                                                                                                                    if (cause14 == null) {
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                    throw cause14;
                                                                                                                }
                                                                                                            } catch (Throwable th20) {
                                                                                                                th = th20;
                                                                                                            }
                                                                                                        } catch (Exception e7) {
                                                                                                            try {
                                                                                                                StringBuilder sb6 = new StringBuilder();
                                                                                                                byte[] bArr20 = $$a;
                                                                                                                sb6.append($$c(bArr20[16], bArr20[126], (short) 793));
                                                                                                                sb6.append((Object) sb5);
                                                                                                                short s15 = (short) 854;
                                                                                                                sb6.append($$c(bArr20[7], bArr20[i24], s15));
                                                                                                                String sb7 = sb6.toString();
                                                                                                                try {
                                                                                                                    Object[] objArr12 = new Object[2];
                                                                                                                    objArr12[1] = e7;
                                                                                                                    objArr12[i23] = sb7;
                                                                                                                    Class<?> cls30 = Class.forName($$c(bArr20[14], bArr20[26], s15));
                                                                                                                    Class<?>[] clsArr7 = new Class[2];
                                                                                                                    clsArr7[i23] = cls162222;
                                                                                                                    clsArr7[1] = cls3;
                                                                                                                    throw ((Throwable) cls30.getDeclaredConstructor(clsArr7).newInstance(objArr12));
                                                                                                                } catch (Throwable th21) {
                                                                                                                    Throwable cause15 = th21.getCause();
                                                                                                                    if (cause15 == null) {
                                                                                                                        throw th21;
                                                                                                                    }
                                                                                                                    throw cause15;
                                                                                                                }
                                                                                                            } catch (Throwable th22) {
                                                                                                                th = th22;
                                                                                                                obj5 = obj19;
                                                                                                                zArr4 = zArr72222;
                                                                                                                i12 = i522222;
                                                                                                                obj3 = r1122222 == true ? 1 : 0;
                                                                                                                zArr2 = zArr82222;
                                                                                                                str2 = $$c;
                                                                                                                cls5 = cls162222;
                                                                                                                zArr3 = zArr92222;
                                                                                                                obj4 = obj5;
                                                                                                                int currentTimeMillis322 = (int) System.currentTimeMillis();
                                                                                                                int i5522 = -(-(i12 * (-69)));
                                                                                                                int i5622 = (71 & i5522) + (i5522 | 71);
                                                                                                                int i5722 = ~(((-2) & i12) | ((-2) ^ i12));
                                                                                                                int i5822 = ~((i12 ^ currentTimeMillis322) | (i12 & currentTimeMillis322));
                                                                                                                int i5922 = -(-(((i5722 & i5822) | (i5722 ^ i5822)) * (-140)));
                                                                                                                int i6022 = (i5622 & i5922) + (i5922 | i5622);
                                                                                                                int i6122 = (i12 ^ 1) | (i12 & 1);
                                                                                                                int i6222 = (i6022 - (~(-(-((~((i6122 & currentTimeMillis322) | (i6122 ^ currentTimeMillis322))) * 70))))) - 1;
                                                                                                                int i6322 = ~(((-2) & i12) | ((-2) ^ i12));
                                                                                                                i11 = i12;
                                                                                                                int i6422 = ~i11;
                                                                                                                int i6522 = i6322 | (~((i6422 & 1) | (i6422 ^ 1)));
                                                                                                                int i6622 = ~((currentTimeMillis322 & 1) | (currentTimeMillis322 ^ 1));
                                                                                                                int i6722 = -(-(((i6622 & i6522) | (i6522 ^ i6622)) * 70));
                                                                                                                while (i13 < 7) {
                                                                                                                }
                                                                                                                int i6822 = $11;
                                                                                                                i14 = (i6822 & 57) + (i6822 | 57);
                                                                                                                $10 = i14 % 128;
                                                                                                                if (i14 % 2 == 0) {
                                                                                                                }
                                                                                                                Object[] objArr622 = {$$c(b10, b11, b12), th};
                                                                                                                byte[] bArr1422 = $$a;
                                                                                                                throw ((Throwable) Class.forName($$c(bArr1422[14], bArr1422[26], (short) 854)).getDeclaredConstructor(cls5, cls3).newInstance(objArr622));
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th23) {
                                                                                                        Throwable cause16 = th23.getCause();
                                                                                                        if (cause16 == null) {
                                                                                                            throw th23;
                                                                                                        }
                                                                                                        throw cause16;
                                                                                                    }
                                                                                                }
                                                                                                obj23 = obj11;
                                                                                                i81 = i16;
                                                                                                obj22 = obj10;
                                                                                            }
                                                                                            z7 = z11;
                                                                                            zArr10 = zArr2;
                                                                                            r46 = i81;
                                                                                            str6 = str7;
                                                                                        }
                                                                                    }
                                                                                    obj7 = obj21;
                                                                                    obj8 = obj22;
                                                                                    obj9 = obj23;
                                                                                    zArr5 = r46;
                                                                                    str = str6;
                                                                                } catch (Throwable th24) {
                                                                                    th = th24;
                                                                                    z11 = z7;
                                                                                    obj5 = obj19;
                                                                                    zArr4 = zArr72222;
                                                                                    i12 = i522222;
                                                                                    obj3 = r1122222 == true ? 1 : 0;
                                                                                    zArr2 = zArr82222;
                                                                                    str2 = $$c;
                                                                                    cls5 = cls162222;
                                                                                    zArr3 = zArr92222;
                                                                                    obj4 = obj5;
                                                                                    int currentTimeMillis3222 = (int) System.currentTimeMillis();
                                                                                    int i55222 = -(-(i12 * (-69)));
                                                                                    int i56222 = (71 & i55222) + (i55222 | 71);
                                                                                    int i57222 = ~(((-2) & i12) | ((-2) ^ i12));
                                                                                    int i58222 = ~((i12 ^ currentTimeMillis3222) | (i12 & currentTimeMillis3222));
                                                                                    int i59222 = -(-(((i57222 & i58222) | (i57222 ^ i58222)) * (-140)));
                                                                                    int i60222 = (i56222 & i59222) + (i59222 | i56222);
                                                                                    int i61222 = (i12 ^ 1) | (i12 & 1);
                                                                                    int i62222 = (i60222 - (~(-(-((~((i61222 & currentTimeMillis3222) | (i61222 ^ currentTimeMillis3222))) * 70))))) - 1;
                                                                                    int i63222 = ~(((-2) & i12) | ((-2) ^ i12));
                                                                                    i11 = i12;
                                                                                    int i64222 = ~i11;
                                                                                    int i65222 = i63222 | (~((i64222 & 1) | (i64222 ^ 1)));
                                                                                    int i66222 = ~((currentTimeMillis3222 & 1) | (currentTimeMillis3222 ^ 1));
                                                                                    int i67222 = -(-(((i66222 & i65222) | (i65222 ^ i66222)) * 70));
                                                                                    for (i13 = (i62222 & i67222) + (i67222 | i62222); i13 < 7; i13++) {
                                                                                        if (zArr3[i13]) {
                                                                                            System.currentTimeMillis();
                                                                                            System.currentTimeMillis();
                                                                                            f4132i = null;
                                                                                            f4131e = null;
                                                                                            i23 = 0;
                                                                                            obj2 = obj4;
                                                                                            zArr = zArr4;
                                                                                            str = str2;
                                                                                            z7 = z11;
                                                                                            i522222 = i11 + 1;
                                                                                            obj19 = obj2;
                                                                                            cls13 = cls3;
                                                                                            cls14 = cls4;
                                                                                            z5 = z10;
                                                                                            zArr72222 = zArr;
                                                                                            num2 = num;
                                                                                            zArr82222 = zArr2;
                                                                                            $$c = str;
                                                                                            r1122222 = obj3;
                                                                                            cls162222 = cls5;
                                                                                            zArr92222 = zArr3;
                                                                                            i5 = 6;
                                                                                        }
                                                                                    }
                                                                                    int i68222 = $11;
                                                                                    i14 = (i68222 & 57) + (i68222 | 57);
                                                                                    $10 = i14 % 128;
                                                                                    if (i14 % 2 == 0) {
                                                                                        byte[] bArr21 = $$a;
                                                                                        b10 = bArr21[116];
                                                                                        b11 = bArr21[92];
                                                                                        b12 = bArr21[1017];
                                                                                    } else {
                                                                                        byte[] bArr22 = $$a;
                                                                                        b10 = bArr22[105];
                                                                                        b11 = bArr22[126];
                                                                                        b12 = bArr22[151];
                                                                                    }
                                                                                    Object[] objArr6222 = {$$c(b10, b11, b12), th};
                                                                                    byte[] bArr14222 = $$a;
                                                                                    throw ((Throwable) Class.forName($$c(bArr14222[14], bArr14222[26], (short) 854)).getDeclaredConstructor(cls5, cls3).newInstance(objArr6222));
                                                                                }
                                                                            } catch (Throwable th25) {
                                                                                th = th25;
                                                                                Throwable cause17 = th.getCause();
                                                                                if (cause17 == null) {
                                                                                    throw th;
                                                                                }
                                                                                throw cause17;
                                                                            }
                                                                        } catch (Throwable th26) {
                                                                            th = th26;
                                                                        }
                                                                    } catch (Throwable th27) {
                                                                        th = th27;
                                                                        num = num2;
                                                                    }
                                                                } else {
                                                                    num = num2;
                                                                    obj6 = null;
                                                                    obj7 = null;
                                                                    obj9 = null;
                                                                    obj8 = null;
                                                                    zArr5 = zArr;
                                                                    str = str;
                                                                }
                                                                z11 = z7;
                                                                byte[] bArr23 = $$a;
                                                                byte b33 = bArr23[426];
                                                                ?? r23 = bArr23[c13];
                                                                String $$c3 = $$c(b33, r23, (short) 789);
                                                                try {
                                                                    Object[] objArr13 = new Object[1];
                                                                    objArr13[i23] = $$c3;
                                                                    String $$c4 = $$c(bArr23[c12], bArr23[4], (short) 741);
                                                                    Class[] clsArr8 = new Class[1];
                                                                    clsArr8[i23] = cls162222;
                                                                    r23 = Class.class.getMethod($$c4, clsArr8).invoke(obj19, objArr13);
                                                                    try {
                                                                        Class<?> cls31 = Class.forName($$c(bArr23[c14], bArr23[26], (short) 731));
                                                                        byte b34 = bArr23[c162222];
                                                                        byte b35 = bArr23[4];
                                                                        r23 = (String) cls31.getMethod($$c(b34, b35, (short) ((b35 ^ 704) | (b35 & 704))), null).invoke(r23, null);
                                                                        StringBuilder sb8 = new StringBuilder();
                                                                        byte b36 = bArr23[7];
                                                                        short s16 = (short) 714;
                                                                        sb8.append($$c(b36, (byte) ((b36 ^ 86) | (b36 & 86)), s16));
                                                                        sb8.append($$c3);
                                                                        try {
                                                                            ZipFile zipFile = new ZipFile(r23.substring(5, r23.lastIndexOf(sb8.toString())));
                                                                            try {
                                                                                byte[] bArr24 = new byte[7308];
                                                                                InputStream inputStream = zipFile.getInputStream(zipFile.getEntry($$c3.substring(1)));
                                                                                $11 = ($10 + 33) % 128;
                                                                                try {
                                                                                    Object[] objArr14 = new Object[1];
                                                                                    objArr14[i23] = inputStream;
                                                                                    ?? cls32 = Class.forName($$c(bArr23[776], bArr23[26], s16));
                                                                                    zArr = zArr72222;
                                                                                    zArr2 = zArr82222;
                                                                                    short s17 = (short) 688;
                                                                                    try {
                                                                                        r22 = Class.forName($$c(bArr23[14], bArr23[26], s17));
                                                                                        ?? r92 = new Class[1];
                                                                                        r92[i23] = r22;
                                                                                        try {
                                                                                            r22 = new Object[1];
                                                                                            r22[i23] = cls32.getDeclaredConstructor(r92).newInstance(objArr14);
                                                                                            short s18 = (short) 670;
                                                                                            Class<?> cls33 = Class.forName($$c(bArr23[105], bArr23[26], s18));
                                                                                            Class<?> cls34 = Class.forName($$c(bArr23[14], bArr23[26], s17));
                                                                                            Class<?>[] clsArr9 = new Class[1];
                                                                                            clsArr9[i23] = cls34;
                                                                                            Object newInstance4 = cls33.getDeclaredConstructor(clsArr9).newInstance(r22);
                                                                                            $10 = ($11 + 9) % 128;
                                                                                            try {
                                                                                                r22 = new Object[1];
                                                                                                r22[i23] = bArr24;
                                                                                                ?? cls35 = Class.forName($$c(bArr23[105], bArr23[26], s18));
                                                                                                try {
                                                                                                    str = $$c;
                                                                                                    try {
                                                                                                        String $$c5 = $$c(bArr23[49], bArr23[46], (short) 648);
                                                                                                        Class[] clsArr10 = new Class[1];
                                                                                                        clsArr10[i23] = cls4;
                                                                                                        cls35.getMethod($$c5, clsArr10).invoke(newInstance4, r22);
                                                                                                        try {
                                                                                                            try {
                                                                                                                r22 = Class.forName($$c(bArr23[105], bArr23[26], s18));
                                                                                                                byte b37 = bArr23[16];
                                                                                                                byte b38 = bArr23[c8];
                                                                                                                r22.getMethod($$c(b37, b38, (short) ((b38 ^ 777) | (b38 & 777))), null).invoke(newInstance4, null);
                                                                                                                i19 = 20;
                                                                                                                i20 = 7258;
                                                                                                                bArr2 = bArr24;
                                                                                                                str4 = str;
                                                                                                                cls6 = null;
                                                                                                                r11 = r1122222;
                                                                                                            } catch (Throwable th28) {
                                                                                                                boolean z15 = r1122222 == true ? 1 : 0;
                                                                                                                Throwable cause18 = th28.getCause();
                                                                                                                if (cause18 == null) {
                                                                                                                    throw th28;
                                                                                                                }
                                                                                                                throw cause18;
                                                                                                            }
                                                                                                        } catch (Throwable th29) {
                                                                                                            th = th29;
                                                                                                        }
                                                                                                    } catch (Throwable th30) {
                                                                                                        th = th30;
                                                                                                        boolean z16 = r1122222 == true ? 1 : 0;
                                                                                                        cause = th.getCause();
                                                                                                        if (cause != null) {
                                                                                                            throw th;
                                                                                                        }
                                                                                                        throw cause;
                                                                                                    }
                                                                                                } catch (Throwable th31) {
                                                                                                    th = th31;
                                                                                                    boolean z17 = r1122222 == true ? 1 : 0;
                                                                                                    cause = th.getCause();
                                                                                                    if (cause != null) {
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th32) {
                                                                                                th = th32;
                                                                                                boolean z18 = r1122222 == true ? 1 : 0;
                                                                                            }
                                                                                        } catch (Throwable th33) {
                                                                                            boolean z19 = r1122222 == true ? 1 : 0;
                                                                                            Throwable cause19 = th33.getCause();
                                                                                            if (cause19 == null) {
                                                                                                throw th33;
                                                                                            }
                                                                                            throw cause19;
                                                                                        }
                                                                                    } catch (Throwable th34) {
                                                                                        th = th34;
                                                                                        boolean z20 = r1122222 == true ? 1 : 0;
                                                                                        Throwable cause20 = th.getCause();
                                                                                        if (cause20 == null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause20;
                                                                                    }
                                                                                } catch (Throwable th35) {
                                                                                    th = th35;
                                                                                    boolean z21 = r1122222 == true ? 1 : 0;
                                                                                }
                                                                            } catch (Throwable th36) {
                                                                                th = th36;
                                                                                obj13 = obj19;
                                                                                zArr6 = zArr72222;
                                                                                i12 = i522222;
                                                                                obj3 = r1122222 == true ? 1 : 0;
                                                                                zArr2 = zArr82222;
                                                                                str3 = $$c;
                                                                            }
                                                                            while (true) {
                                                                                long j = 1;
                                                                                try {
                                                                                    long j6 = j;
                                                                                    int i102 = i23;
                                                                                    while (i102 < bArr2.length) {
                                                                                        try {
                                                                                            j6 = ((bArr2[i102] + (j6 << i5)) + (j6 << 16)) - j6;
                                                                                            int i103 = i102 + 52;
                                                                                            i102 = ((i103 & (-51)) << 1) + (i103 ^ (-51));
                                                                                        } catch (Throwable th37) {
                                                                                            th2 = th37;
                                                                                            r23 = obj19;
                                                                                            i12 = i522222;
                                                                                            obj3 = r11;
                                                                                            cls5 = cls162222;
                                                                                            zArr3 = zArr92222;
                                                                                            zArr5 = zArr;
                                                                                            str = str;
                                                                                            try {
                                                                                                zipFile.close();
                                                                                                throw th2;
                                                                                            } catch (Throwable th38) {
                                                                                                th2.addSuppressed(th38);
                                                                                                throw th2;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    bArr2[i19 + 164] = (byte) (bArr2[i19 + 7287] - 34);
                                                                                    int length = bArr2.length;
                                                                                    int i104 = -i19;
                                                                                    int i105 = i19;
                                                                                    byte[] bArr25 = bArr2;
                                                                                    int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                                                    int i106 = i104 * (-167);
                                                                                    int i107 = length * (-167);
                                                                                    int i108 = ((i106 | i107) << 1) - (i106 ^ i107);
                                                                                    int i109 = ~i104;
                                                                                    int i110 = ~length;
                                                                                    int i111 = ~((i109 ^ i110) | (i109 & i110));
                                                                                    int i112 = ~((i110 ^ currentTimeMillis7) | (i110 & currentTimeMillis7));
                                                                                    int i113 = ((i111 ^ i112) | (i111 & i112)) * 336;
                                                                                    int i114 = (i108 & i113) + (i108 | i113);
                                                                                    int i115 = ~(i104 | length);
                                                                                    int i116 = ~(i104 | currentTimeMillis7);
                                                                                    int i117 = -(-(((i115 ^ i116) | (i115 & i116)) * (-168)));
                                                                                    int i118 = (i114 & i117) + (i114 | i117);
                                                                                    int i119 = ~length;
                                                                                    int i120 = ~((~currentTimeMillis7) | i104);
                                                                                    int i121 = ((i120 & i119) | (i119 ^ i120)) * 168;
                                                                                    try {
                                                                                        Object[] objArr15 = new Object[i24];
                                                                                        try {
                                                                                            objArr15[2] = Integer.valueOf((i118 & i121) + (i118 | i121));
                                                                                            objArr15[1] = Integer.valueOf(i105);
                                                                                            objArr15[i23] = bArr25;
                                                                                            bArr3 = $$a;
                                                                                            cls7 = Class.forName($$c(bArr3[228], bArr3[26], (short) 640));
                                                                                        } catch (Throwable th39) {
                                                                                            th = th39;
                                                                                            cause2 = th.getCause();
                                                                                            if (cause2 != null) {
                                                                                                throw th;
                                                                                            }
                                                                                            throw cause2;
                                                                                        }
                                                                                        try {
                                                                                            Class[] clsArr11 = new Class[3];
                                                                                            clsArr11[i23] = cls4;
                                                                                            clsArr11[1] = cls2;
                                                                                            clsArr11[2] = cls2;
                                                                                            Object newInstance5 = cls7.getDeclaredConstructor(clsArr11).newInstance(objArr15);
                                                                                            try {
                                                                                                Object obj27 = f4132i;
                                                                                                if (obj27 == null) {
                                                                                                    try {
                                                                                                        force = j6;
                                                                                                        obj3 = obj19;
                                                                                                        int uptimeMillis = (int) (j6 ^ ((SystemClock.uptimeMillis() >> 48) + 2972051176395814500L));
                                                                                                        try {
                                                                                                            int globalActionKeyTimeout = (int) (force ^ ((-2972051176831883011L) - (ViewConfiguration.getGlobalActionKeyTimeout() >> 32)));
                                                                                                            int[] iArr = new int[(int) (force ^ ((SystemClock.currentThreadTimeMillis() >> 48) - 2972051176831883014L))];
                                                                                                            int currentThreadTimeMillis = (int) (force ^ ((-2972051176831883016L) - (SystemClock.currentThreadTimeMillis() >> 48)));
                                                                                                            long j10 = f4133v;
                                                                                                            int i122 = i23;
                                                                                                            int i123 = -View.getDefaultSize(i122, i122);
                                                                                                            int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                                                                            int i124 = ~i123;
                                                                                                            int i125 = ~((i124 ^ (-33)) | (i124 & (-33)) | currentTimeMillis8);
                                                                                                            int i126 = (~currentTimeMillis8) | i123;
                                                                                                            int i127 = ~((i126 ^ 32) | (i126 & 32));
                                                                                                            int i128 = ~(((-33) ^ i123) | ((-33) & i123));
                                                                                                            int i129 = ~(i123 | currentTimeMillis8);
                                                                                                            int i130 = (((i128 ^ i129) | (i128 & i129)) * (-318)) + (((i125 ^ i127) | (i125 & i127)) * (-318)) + (i123 * (-317)) + 10208;
                                                                                                            int i131 = ~i123;
                                                                                                            int i132 = ~((i131 & currentTimeMillis8) | (i131 ^ currentTimeMillis8));
                                                                                                            int i133 = -(-((((-33) ^ i132) | (i132 & (-33))) * 318));
                                                                                                            int i134 = (int) (j10 >>> ((byte) ((i130 & i133) + (i133 | i130))));
                                                                                                            iArr[currentThreadTimeMillis] = (i134 | uptimeMillis) & (~(i134 & uptimeMillis));
                                                                                                            int elapsedRealtimeNanos = (int) (force ^ ((SystemClock.elapsedRealtimeNanos() >> 60) - 2972051176831883015L));
                                                                                                            int i135 = (int) f4133v;
                                                                                                            iArr[elapsedRealtimeNanos] = (uptimeMillis & (~i135)) | ((~uptimeMillis) & i135);
                                                                                                            int i136 = afWarnLog;
                                                                                                            byte[] bArr26 = afErrorLogForExcManagerOnly;
                                                                                                            try {
                                                                                                                Object[] objArr16 = new Object[i5];
                                                                                                                try {
                                                                                                                    objArr16[5] = Integer.valueOf(afVerboseLog);
                                                                                                                    objArr16[4] = Integer.valueOf(globalActionKeyTimeout);
                                                                                                                    objArr16[3] = bArr26;
                                                                                                                    objArr16[2] = Integer.valueOf(i136);
                                                                                                                    objArr16[1] = iArr;
                                                                                                                    objArr16[0] = newInstance5;
                                                                                                                    Class<?> cls36 = Class.forName($$c(bArr3[74], bArr3[c8], (short) 613));
                                                                                                                    str5 = str4;
                                                                                                                    Class<?>[] clsArr12 = new Class[6];
                                                                                                                    clsArr12[0] = Class.forName($$c(bArr3[14], bArr3[26], (short) 688));
                                                                                                                    clsArr12[1] = int[].class;
                                                                                                                    clsArr12[2] = cls2;
                                                                                                                    i24 = 3;
                                                                                                                    clsArr12[3] = byte[].class;
                                                                                                                    clsArr12[4] = cls2;
                                                                                                                    clsArr12[5] = cls2;
                                                                                                                    newInstance = cls36.getDeclaredConstructor(clsArr12).newInstance(objArr16);
                                                                                                                    i21 = i105;
                                                                                                                    cls8 = cls6;
                                                                                                                } catch (Throwable th40) {
                                                                                                                    th = th40;
                                                                                                                    Throwable cause21 = th.getCause();
                                                                                                                    if (cause21 == null) {
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                    throw cause21;
                                                                                                                }
                                                                                                            } catch (Throwable th41) {
                                                                                                                th = th41;
                                                                                                            }
                                                                                                        } catch (Throwable th42) {
                                                                                                            th = th42;
                                                                                                            th2 = th;
                                                                                                            i12 = i522222;
                                                                                                            cls5 = cls162222;
                                                                                                            zArr3 = zArr92222;
                                                                                                            r23 = obj3;
                                                                                                            i24 = 3;
                                                                                                            obj3 = r11;
                                                                                                            zArr5 = zArr;
                                                                                                            str = str;
                                                                                                            zipFile.close();
                                                                                                            throw th2;
                                                                                                        }
                                                                                                    } catch (Throwable th43) {
                                                                                                        th = th43;
                                                                                                        obj3 = obj19;
                                                                                                    }
                                                                                                } else {
                                                                                                    obj3 = obj19;
                                                                                                    str5 = str4;
                                                                                                    afDebugLog = j6;
                                                                                                    int zoomControlsTimeout = (int) (j6 ^ (8658846069134590113L - (ViewConfiguration.getZoomControlsTimeout() >> 32)));
                                                                                                    try {
                                                                                                        Object[] objArr17 = new Object[3];
                                                                                                        try {
                                                                                                            objArr17[2] = Short.valueOf((short) (afDebugLog ^ ((-8658846070070128791L) - (SystemClock.currentThreadTimeMillis() >> 48))));
                                                                                                            objArr17[1] = Integer.valueOf(zoomControlsTimeout);
                                                                                                            objArr17[0] = newInstance5;
                                                                                                            cls10 = Class.forName($$c(bArr3[c2], bArr3[c8], (short) 583), true, (ClassLoader) f4131e);
                                                                                                        } catch (Throwable th44) {
                                                                                                            th = th44;
                                                                                                            cause3 = th.getCause();
                                                                                                            if (cause3 == null) {
                                                                                                                throw th;
                                                                                                            }
                                                                                                            throw cause3;
                                                                                                        }
                                                                                                        try {
                                                                                                            String $$c6 = $$c(bArr3[12], bArr3[85], (short) 551);
                                                                                                            i21 = i105;
                                                                                                            cls8 = cls6;
                                                                                                            try {
                                                                                                                Class<?>[] clsArr13 = new Class[3];
                                                                                                                clsArr13[0] = Class.forName($$c(bArr3[14], bArr3[26], (short) 688));
                                                                                                                clsArr13[1] = cls2;
                                                                                                                clsArr13[2] = Short.TYPE;
                                                                                                                newInstance = cls10.getMethod($$c6, clsArr13).invoke(obj27, objArr17);
                                                                                                            } catch (Throwable th45) {
                                                                                                                th = th45;
                                                                                                                cause3 = th.getCause();
                                                                                                                if (cause3 == null) {
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th46) {
                                                                                                            th = th46;
                                                                                                            cause3 = th.getCause();
                                                                                                            if (cause3 == null) {
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th47) {
                                                                                                        th = th47;
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    short s19 = (short) 688;
                                                                                                    Class.forName($$c(bArr3[14], bArr3[26], s19)).getMethod($$c(bArr3[55], bArr3[16], (short) 537), Long.TYPE).invoke(newInstance, 22);
                                                                                                    if (z13) {
                                                                                                        try {
                                                                                                            Object obj28 = f4132i;
                                                                                                            if (obj28 == null) {
                                                                                                                int i137 = $10;
                                                                                                                $11 = (((i137 | 125) << 1) - (i137 ^ 125)) % 128;
                                                                                                                obj15 = obj8;
                                                                                                            } else {
                                                                                                                obj15 = obj9;
                                                                                                            }
                                                                                                            if (obj28 == null) {
                                                                                                                int i138 = $10;
                                                                                                                int i139 = (i138 ^ 85) + ((i138 & 85) << 1);
                                                                                                                $11 = i139 % 128;
                                                                                                                if (i139 % 2 == 0) {
                                                                                                                    try {
                                                                                                                        int i140 = 87 / 0;
                                                                                                                    } catch (Throwable th48) {
                                                                                                                        th = th48;
                                                                                                                        th2 = th;
                                                                                                                        i12 = i522222;
                                                                                                                        cls5 = cls162222;
                                                                                                                        zArr3 = zArr92222;
                                                                                                                        r23 = obj3;
                                                                                                                        i24 = 3;
                                                                                                                        obj3 = r11;
                                                                                                                        zArr5 = zArr;
                                                                                                                        str = str;
                                                                                                                        zipFile.close();
                                                                                                                        throw th2;
                                                                                                                    }
                                                                                                                }
                                                                                                                obj16 = obj6;
                                                                                                            } else {
                                                                                                                obj16 = obj7;
                                                                                                            }
                                                                                                            c15 = 18;
                                                                                                            Method method = Class.forName($$c(bArr3[14], bArr3[26], s19)).getMethod($$c(bArr3[55], bArr3[46], (short) 534), cls4, cls2, cls2);
                                                                                                            ?? cls37 = Class.forName($$c(bArr3[114], bArr3[26], (short) 820));
                                                                                                            try {
                                                                                                                cls5 = cls162222;
                                                                                                                try {
                                                                                                                    Object newInstance6 = cls37.getConstructor(Class.forName($$c(bArr3[c14], bArr3[26], r11))).newInstance(obj15);
                                                                                                                    if (z10) {
                                                                                                                        int i141 = $10;
                                                                                                                        $11 = ((i141 & 123) + (i141 | 123)) % 128;
                                                                                                                        try {
                                                                                                                            zArr3 = zArr92222;
                                                                                                                            try {
                                                                                                                                i12 = i522222;
                                                                                                                                try {
                                                                                                                                    ((Boolean) Class.forName($$c(bArr3[c14], bArr3[26], r11)).getMethod($$c(bArr3[c12], bArr3[16], (short) 531), null).invoke(obj15, null)).getClass();
                                                                                                                                } catch (Throwable th49) {
                                                                                                                                    th = th49;
                                                                                                                                    try {
                                                                                                                                        Throwable cause22 = th.getCause();
                                                                                                                                        if (cause22 == null) {
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                        throw cause22;
                                                                                                                                    } catch (Exception e9) {
                                                                                                                                        e = e9;
                                                                                                                                        obj14 = obj3;
                                                                                                                                        try {
                                                                                                                                            StringBuilder sb9 = new StringBuilder();
                                                                                                                                            byte[] bArr27 = $$a;
                                                                                                                                            sb9.append($$c(bArr27[16], bArr27[126], (short) 521));
                                                                                                                                            sb9.append(obj15);
                                                                                                                                            short s20 = (short) 854;
                                                                                                                                            sb9.append($$c(bArr27[7], bArr27[3], s20));
                                                                                                                                            try {
                                                                                                                                                throw ((Throwable) Class.forName($$c(bArr27[14], bArr27[26], s20)).getDeclaredConstructor(cls5, cls3).newInstance(sb9.toString(), e));
                                                                                                                                            } catch (Throwable th50) {
                                                                                                                                                Throwable cause23 = th50.getCause();
                                                                                                                                                if (cause23 == null) {
                                                                                                                                                    throw th50;
                                                                                                                                                }
                                                                                                                                                throw cause23;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th51) {
                                                                                                                                            th = th51;
                                                                                                                                            try {
                                                                                                                                                byte[] bArr28 = $$a;
                                                                                                                                                short s21 = (short) 445;
                                                                                                                                                ((Boolean) Class.forName($$c(bArr28[c14], bArr28[26], r11)).getMethod($$c(bArr28[46], bArr28[18], s21), null).invoke(obj15, null)).getClass();
                                                                                                                                                try {
                                                                                                                                                    ((Boolean) Class.forName($$c(bArr28[c14], bArr28[26], r11)).getMethod($$c(bArr28[46], bArr28[18], s21), null).invoke(obj16, null)).getClass();
                                                                                                                                                    throw th;
                                                                                                                                                } catch (Throwable th52) {
                                                                                                                                                    Throwable cause24 = th52.getCause();
                                                                                                                                                    if (cause24 == null) {
                                                                                                                                                        throw th52;
                                                                                                                                                    }
                                                                                                                                                    throw cause24;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th53) {
                                                                                                                                                Throwable cause25 = th53.getCause();
                                                                                                                                                if (cause25 == null) {
                                                                                                                                                    throw th53;
                                                                                                                                                }
                                                                                                                                                throw cause25;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (Throwable th54) {
                                                                                                                                th = th54;
                                                                                                                                i12 = i522222;
                                                                                                                            }
                                                                                                                        } catch (Throwable th55) {
                                                                                                                            th = th55;
                                                                                                                            i12 = i522222;
                                                                                                                            zArr3 = zArr92222;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i12 = i522222;
                                                                                                                        zArr3 = zArr92222;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        byte[] bArr29 = new byte[Segment.SHARE_MINIMUM];
                                                                                                                        byte b39 = bArr3[16];
                                                                                                                        byte b40 = bArr3[7];
                                                                                                                        Method method2 = cls37.getMethod($$c(b39, b40, (short) ((b40 ^ 517) | (b40 & 517))), cls4, cls2, cls2);
                                                                                                                        while (i20 > 0) {
                                                                                                                            byte[] bArr30 = bArr29;
                                                                                                                            Integer num3 = (Integer) method.invoke(newInstance, bArr30, num, Integer.valueOf(Math.min(Segment.SHARE_MINIMUM, i20)));
                                                                                                                            int intValue2 = num3.intValue();
                                                                                                                            if (intValue2 == -1) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            Object obj29 = newInstance;
                                                                                                                            method2.invoke(newInstance6, bArr30, num, num3);
                                                                                                                            int i142 = -intValue2;
                                                                                                                            int currentTimeMillis9 = (int) System.currentTimeMillis();
                                                                                                                            int i143 = ~i142;
                                                                                                                            Method method3 = method;
                                                                                                                            int i144 = ~i20;
                                                                                                                            int i145 = ((~((i143 ^ i144) | (i143 & i144))) * 210) + (i20 * (-209)) + (i142 * (-209));
                                                                                                                            int i146 = ~i20;
                                                                                                                            int i147 = ~currentTimeMillis9;
                                                                                                                            int i148 = ~((i146 ^ i147) | (i147 & i146));
                                                                                                                            int i149 = ~((~i142) | currentTimeMillis9);
                                                                                                                            int i150 = -(-(((i148 ^ i149) | (i148 & i149)) * 210));
                                                                                                                            int i151 = (i145 & i150) + (i145 | i150);
                                                                                                                            int i152 = ~currentTimeMillis9;
                                                                                                                            int i153 = ~(i20 | (i143 ^ i152) | (i152 & i143));
                                                                                                                            int i154 = ~((i144 & i142) | (i144 ^ i142) | currentTimeMillis9);
                                                                                                                            int i155 = ((i153 & i154) | (i153 ^ i154)) * 210;
                                                                                                                            i20 = (i155 | i151) + (i151 & i155);
                                                                                                                            bArr29 = bArr30;
                                                                                                                            newInstance = obj29;
                                                                                                                            method = method3;
                                                                                                                        }
                                                                                                                        byte[] bArr31 = $$a;
                                                                                                                        Object invoke5 = cls37.getMethod($$c(bArr31[16], bArr31[4], (short) 513), null).invoke(newInstance6, null);
                                                                                                                        byte b41 = bArr31[c10];
                                                                                                                        byte b42 = bArr31[26];
                                                                                                                        Class.forName($$c(b41, b42, (short) ((b42 ^ 496) | (b42 & 496)))).getMethod($$c(bArr31[55], bArr31[16], (short) 488), null).invoke(invoke5, null);
                                                                                                                        byte b43 = bArr31[16];
                                                                                                                        byte b44 = bArr31[c8];
                                                                                                                        cls37.getMethod($$c(b43, b44, (short) ((b44 ^ 777) | (b44 & 777))), null).invoke(newInstance6, null);
                                                                                                                        Method declaredMethod = Class.forName($$c(bArr31[c8], bArr31[18], (short) 485)).getDeclaredMethod($$c(bArr31[c162222], bArr31[c14], (short) 465), cls5, cls5, cls2);
                                                                                                                        try {
                                                                                                                        } catch (Throwable th56) {
                                                                                                                            th = th56;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            short s22 = (short) 459;
                                                                                                                            obj14 = Class.forName($$c(bArr31[c14], bArr31[26], r11)).getMethod($$c(bArr31[12], bArr31[4], s22), null).invoke(obj15, null);
                                                                                                                            $10 = ($11 + 73) % 128;
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        invoke4 = declaredMethod.invoke(null, obj14, Class.forName($$c(bArr31[c14], bArr31[26], r11)).getMethod($$c(bArr31[12], bArr31[4], s22), null).invoke(obj16, null), num);
                                                                                                                                        try {
                                                                                                                                            short s23 = (short) 445;
                                                                                                                                            obj14 = (Boolean) Class.forName($$c(bArr31[c14], bArr31[26], r11)).getMethod($$c(bArr31[46], bArr31[18], s23), null).invoke(obj15, null);
                                                                                                                                            obj14.getClass();
                                                                                                                                            try {
                                                                                                                                                obj14 = (Boolean) Class.forName($$c(bArr31[c14], bArr31[26], r11)).getMethod($$c(bArr31[46], bArr31[18], s23), null).invoke(obj16, null);
                                                                                                                                                obj14.getClass();
                                                                                                                                                try {
                                                                                                                                                    if (f4131e == null) {
                                                                                                                                                        int i156 = $10 + 105;
                                                                                                                                                        $11 = i156 % 128;
                                                                                                                                                        if (i156 % 2 == 0) {
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            byte b45 = bArr31[26];
                                                                                                                                                            byte b46 = bArr31[4];
                                                                                                                                                            Method method4 = Class.class.getMethod($$c(b45, b46, (short) ((b46 ^ 424) | (b46 & 424))), null);
                                                                                                                                                            obj14 = obj3;
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    f4131e = method4.invoke(obj14, null);
                                                                                                                                                                    obj17 = obj14;
                                                                                                                                                                } catch (Throwable th57) {
                                                                                                                                                                    th = th57;
                                                                                                                                                                    th2 = th;
                                                                                                                                                                    obj3 = r11;
                                                                                                                                                                    obj18 = obj14;
                                                                                                                                                                    i24 = 3;
                                                                                                                                                                    r23 = obj18;
                                                                                                                                                                    zArr5 = zArr;
                                                                                                                                                                    str = str;
                                                                                                                                                                    zipFile.close();
                                                                                                                                                                    throw th2;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th58) {
                                                                                                                                                                th = th58;
                                                                                                                                                                Throwable cause26 = th.getCause();
                                                                                                                                                                if (cause26 == null) {
                                                                                                                                                                    throw th;
                                                                                                                                                                }
                                                                                                                                                                throw cause26;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th59) {
                                                                                                                                                            th = th59;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        obj17 = obj3;
                                                                                                                                                    }
                                                                                                                                                    s8 = s19;
                                                                                                                                                    s10 = s16;
                                                                                                                                                    obj3 = r11;
                                                                                                                                                    obj2 = obj17;
                                                                                                                                                } catch (Throwable th60) {
                                                                                                                                                    th = th60;
                                                                                                                                                    obj14 = obj3;
                                                                                                                                                    th2 = th;
                                                                                                                                                    obj3 = r11;
                                                                                                                                                    obj18 = obj14;
                                                                                                                                                    i24 = 3;
                                                                                                                                                    r23 = obj18;
                                                                                                                                                    zArr5 = zArr;
                                                                                                                                                    str = str;
                                                                                                                                                    zipFile.close();
                                                                                                                                                    throw th2;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th61) {
                                                                                                                                                Throwable cause27 = th61.getCause();
                                                                                                                                                if (cause27 == null) {
                                                                                                                                                    throw th61;
                                                                                                                                                }
                                                                                                                                                throw cause27;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th62) {
                                                                                                                                            Throwable cause28 = th62.getCause();
                                                                                                                                            if (cause28 == null) {
                                                                                                                                                throw th62;
                                                                                                                                            }
                                                                                                                                            throw cause28;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th63) {
                                                                                                                                        th = th63;
                                                                                                                                        obj14 = obj3;
                                                                                                                                        byte[] bArr282 = $$a;
                                                                                                                                        short s212 = (short) 445;
                                                                                                                                        ((Boolean) Class.forName($$c(bArr282[c14], bArr282[26], r11)).getMethod($$c(bArr282[46], bArr282[18], s212), null).invoke(obj15, null)).getClass();
                                                                                                                                        ((Boolean) Class.forName($$c(bArr282[c14], bArr282[26], r11)).getMethod($$c(bArr282[46], bArr282[18], s212), null).invoke(obj16, null)).getClass();
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th64) {
                                                                                                                                    th = th64;
                                                                                                                                    Throwable cause29 = th.getCause();
                                                                                                                                    if (cause29 == null) {
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                    throw cause29;
                                                                                                                                }
                                                                                                                            } catch (Throwable th65) {
                                                                                                                                th = th65;
                                                                                                                            }
                                                                                                                        } catch (Throwable th66) {
                                                                                                                            th = th66;
                                                                                                                            Throwable cause30 = th.getCause();
                                                                                                                            if (cause30 == null) {
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                            throw cause30;
                                                                                                                        }
                                                                                                                    } catch (Throwable th67) {
                                                                                                                        th = th67;
                                                                                                                        obj14 = obj3;
                                                                                                                        byte[] bArr2822 = $$a;
                                                                                                                        short s2122 = (short) 445;
                                                                                                                        ((Boolean) Class.forName($$c(bArr2822[c14], bArr2822[26], r11)).getMethod($$c(bArr2822[46], bArr2822[18], s2122), null).invoke(obj15, null)).getClass();
                                                                                                                        ((Boolean) Class.forName($$c(bArr2822[c14], bArr2822[26], r11)).getMethod($$c(bArr2822[46], bArr2822[18], s2122), null).invoke(obj16, null)).getClass();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                } catch (Exception e10) {
                                                                                                                    e = e10;
                                                                                                                    i12 = i522222;
                                                                                                                    zArr3 = zArr92222;
                                                                                                                    obj14 = obj3;
                                                                                                                    StringBuilder sb92 = new StringBuilder();
                                                                                                                    byte[] bArr272 = $$a;
                                                                                                                    sb92.append($$c(bArr272[16], bArr272[126], (short) 521));
                                                                                                                    sb92.append(obj15);
                                                                                                                    short s202 = (short) 854;
                                                                                                                    sb92.append($$c(bArr272[7], bArr272[3], s202));
                                                                                                                    throw ((Throwable) Class.forName($$c(bArr272[14], bArr272[26], s202)).getDeclaredConstructor(cls5, cls3).newInstance(sb92.toString(), e));
                                                                                                                } catch (Throwable th68) {
                                                                                                                    th = th68;
                                                                                                                    i12 = i522222;
                                                                                                                    zArr3 = zArr92222;
                                                                                                                    obj14 = obj3;
                                                                                                                    byte[] bArr28222 = $$a;
                                                                                                                    short s21222 = (short) 445;
                                                                                                                    ((Boolean) Class.forName($$c(bArr28222[c14], bArr28222[26], r11)).getMethod($$c(bArr28222[46], bArr28222[18], s21222), null).invoke(obj15, null)).getClass();
                                                                                                                    ((Boolean) Class.forName($$c(bArr28222[c14], bArr28222[26], r11)).getMethod($$c(bArr28222[46], bArr28222[18], s21222), null).invoke(obj16, null)).getClass();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (Exception e11) {
                                                                                                                e = e11;
                                                                                                                i12 = i522222;
                                                                                                                cls5 = cls162222;
                                                                                                            } catch (Throwable th69) {
                                                                                                                th = th69;
                                                                                                                i12 = i522222;
                                                                                                                cls5 = cls162222;
                                                                                                            }
                                                                                                        } catch (Throwable th70) {
                                                                                                            th = th70;
                                                                                                            i12 = i522222;
                                                                                                            cls5 = cls162222;
                                                                                                            zArr3 = zArr92222;
                                                                                                            obj14 = obj3;
                                                                                                        }
                                                                                                    } else {
                                                                                                        Object obj30 = newInstance;
                                                                                                        i12 = i522222;
                                                                                                        cls5 = cls162222;
                                                                                                        zArr3 = zArr92222;
                                                                                                        r22 = obj3;
                                                                                                        c15 = 18;
                                                                                                        try {
                                                                                                            ?? cls38 = Class.forName($$c(bArr3[228], bArr3[26], (short) 427));
                                                                                                            ?? cls39 = Class.forName($$c(bArr3[14], bArr3[26], s19));
                                                                                                            try {
                                                                                                                Object newInstance7 = cls38.getConstructor(new Class[]{cls39}).newInstance(obj30);
                                                                                                                byte b47 = bArr3[c14];
                                                                                                                byte b48 = bArr3[4];
                                                                                                                Object invoke6 = cls38.getMethod($$c(b47, b48, (short) ((b48 ^ ByteCompanionObject.MIN_VALUE) | (b48 & ByteCompanionObject.MIN_VALUE))), null).invoke(newInstance7, null);
                                                                                                                Class<?> cls40 = Class.forName($$c(bArr3[c10], bArr3[26], (short) 389));
                                                                                                                byte b49 = bArr3[c162222];
                                                                                                                byte b50 = bArr3[4];
                                                                                                                Method method5 = cls40.getMethod($$c(b49, b50, (short) (b50 | 352)), null);
                                                                                                                try {
                                                                                                                    Method method6 = cls39.getMethod($$c(bArr3[55], bArr3[46], (short) 534), cls4);
                                                                                                                    try {
                                                                                                                        Object newInstance8 = Class.forName($$c(bArr3[776], bArr3[26], s16)).getDeclaredConstructor(Class.forName($$c(bArr3[14], bArr3[26], s19))).newInstance(newInstance7);
                                                                                                                        try {
                                                                                                                            byte b51 = bArr3[26];
                                                                                                                            byte b52 = bArr3[4];
                                                                                                                            Object invoke7 = Class.class.getMethod($$c(b51, b52, (short) ((b52 ^ 424) | (b52 & 424))), null).invoke(r22, null);
                                                                                                                            ?? cls41 = Class.forName($$c((byte) (-bArr3[587]), bArr3[26], (short) 362));
                                                                                                                            Object newInstance9 = cls41.getConstructor(null).newInstance(null);
                                                                                                                            byte b53 = bArr3[16];
                                                                                                                            byte b54 = bArr3[7];
                                                                                                                            String $$c7 = $$c(b53, b54, (short) ((b54 ^ 517) | (b54 & 517)));
                                                                                                                            try {
                                                                                                                                Class[] clsArr14 = new Class[3];
                                                                                                                                try {
                                                                                                                                    clsArr14[0] = cls4;
                                                                                                                                    clsArr14[1] = cls2;
                                                                                                                                    clsArr14[2] = cls2;
                                                                                                                                    Method method7 = cls41.getMethod($$c7, clsArr14);
                                                                                                                                    obj3 = r11;
                                                                                                                                    try {
                                                                                                                                        Method method8 = cls41.getMethod($$c(bArr3[c12], bArr3[55], (short) 334), null);
                                                                                                                                        Class<?> cls42 = Class.forName($$c(bArr3[4], bArr3[26], (short) 324));
                                                                                                                                        byte b55 = bArr3[16];
                                                                                                                                        byte b56 = bArr3[c8];
                                                                                                                                        s8 = s19;
                                                                                                                                        Method method9 = cls42.getMethod($$c(b55, b56, (short) (b56 | 777)), null);
                                                                                                                                        byte[] bArr32 = new byte[Segment.SHARE_MINIMUM];
                                                                                                                                        int i157 = 0;
                                                                                                                                        while (true) {
                                                                                                                                            try {
                                                                                                                                                Integer num4 = (Integer) method6.invoke(newInstance8, bArr32);
                                                                                                                                                int intValue3 = num4.intValue();
                                                                                                                                                if (intValue3 <= 0) {
                                                                                                                                                    s10 = s16;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                Method method10 = method6;
                                                                                                                                                int i158 = $10 + 17;
                                                                                                                                                $11 = i158 % 128;
                                                                                                                                                if (i158 % 2 == 0) {
                                                                                                                                                    s10 = s16;
                                                                                                                                                    if (i157 >= ((Long) method5.invoke(invoke6, new Object[1])).longValue()) {
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    $10 = ($11 + 91) % 128;
                                                                                                                                                    method7.invoke(newInstance9, bArr32, num, num4);
                                                                                                                                                    int i159 = -(-intValue3);
                                                                                                                                                    i157 = ((i157 | i159) << 1) - (i159 ^ i157);
                                                                                                                                                    method6 = method10;
                                                                                                                                                    s16 = s10;
                                                                                                                                                } else {
                                                                                                                                                    s10 = s16;
                                                                                                                                                    if (i157 >= ((Long) method5.invoke(invoke6, null)).longValue()) {
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    $10 = ($11 + 91) % 128;
                                                                                                                                                    method7.invoke(newInstance9, bArr32, num, num4);
                                                                                                                                                    int i1592 = -(-intValue3);
                                                                                                                                                    i157 = ((i157 | i1592) << 1) - (i1592 ^ i157);
                                                                                                                                                    method6 = method10;
                                                                                                                                                    s16 = s10;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th71) {
                                                                                                                                                th = th71;
                                                                                                                                                i24 = 3;
                                                                                                                                                th2 = th;
                                                                                                                                                r23 = r22;
                                                                                                                                                zArr5 = zArr;
                                                                                                                                                str = str;
                                                                                                                                                zipFile.close();
                                                                                                                                                throw th2;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        byte[] bArr33 = (byte[]) method8.invoke(newInstance9, null);
                                                                                                                                        try {
                                                                                                                                            method9.invoke(newInstance8, null);
                                                                                                                                            method9.invoke(newInstance9, null);
                                                                                                                                        } catch (Exception unused9) {
                                                                                                                                        }
                                                                                                                                        byte[] bArr34 = $$a;
                                                                                                                                        Class<?> cls43 = Class.forName($$c((byte) (-bArr34[775]), bArr34[18], (short) 308));
                                                                                                                                        short s24 = (short) 273;
                                                                                                                                        Class<?> cls44 = Class.forName($$c(bArr34[14], bArr34[26], s24));
                                                                                                                                        byte b57 = bArr34[c8];
                                                                                                                                        byte b58 = bArr34[26];
                                                                                                                                        Constructor<?> declaredConstructor = cls43.getDeclaredConstructor(cls44, Class.forName($$c(b57, b58, (short) ((b58 ^ 242) | (b58 & 242)))));
                                                                                                                                        try {
                                                                                                                                            Object[] objArr18 = {bArr33};
                                                                                                                                            ?? cls45 = Class.forName($$c(bArr34[14], bArr34[26], s24));
                                                                                                                                            byte b59 = bArr34[55];
                                                                                                                                            byte b60 = bArr34[7];
                                                                                                                                            Object newInstance10 = declaredConstructor.newInstance(cls45.getMethod($$c(b59, b60, (short) (b60 | 235)), cls4).invoke(null, objArr18), invoke7);
                                                                                                                                            try {
                                                                                                                                                Class<?> cls46 = Class.forName($$c(bArr34[348], bArr34[18], (short) 232));
                                                                                                                                                byte b61 = bArr34[274];
                                                                                                                                                Field declaredField = cls46.getDeclaredField($$c(b61, b61, (short) 201));
                                                                                                                                                declaredField.setAccessible(true);
                                                                                                                                                Object obj31 = declaredField.get(invoke7);
                                                                                                                                                Class<?> cls47 = obj31.getClass();
                                                                                                                                                Field declaredField2 = cls47.getDeclaredField($$c(bArr34[114], bArr34[47], (short) ($$b & 971)));
                                                                                                                                                declaredField2.setAccessible(true);
                                                                                                                                                byte b62 = bArr34[222];
                                                                                                                                                byte b63 = bArr34[47];
                                                                                                                                                Field declaredField3 = cls47.getDeclaredField($$c(b62, b63, (short) ((b63 ^ 162) | (b63 & 162))));
                                                                                                                                                declaredField3.setAccessible(true);
                                                                                                                                                Object obj32 = declaredField2.get(obj31);
                                                                                                                                                Object obj33 = declaredField3.get(obj31);
                                                                                                                                                Object obj34 = declaredField.get(newInstance10);
                                                                                                                                                ArrayList arrayList = new ArrayList((List) obj32);
                                                                                                                                                Class<?> cls48 = obj33.getClass();
                                                                                                                                                try {
                                                                                                                                                    byte b64 = bArr34[0];
                                                                                                                                                    byte b65 = bArr34[4];
                                                                                                                                                    Class cls49 = (Class) Class.class.getMethod($$c(b64, b65, (short) (b65 | 131)), null).invoke(cls48, null);
                                                                                                                                                    int length2 = Array.getLength(obj33);
                                                                                                                                                    Object newInstance11 = Array.newInstance((Class<?>) cls49, length2);
                                                                                                                                                    for (int i160 = 0; i160 < length2; i160++) {
                                                                                                                                                        int i161 = $10;
                                                                                                                                                        $11 = ((i161 ^ 3) + ((i161 & 3) << 1)) % 128;
                                                                                                                                                        Array.set(newInstance11, i160, Array.get(obj33, i160));
                                                                                                                                                    }
                                                                                                                                                    declaredField2.set(obj34, arrayList);
                                                                                                                                                    declaredField3.set(obj34, newInstance11);
                                                                                                                                                    $11 = ($10 + 63) % 128;
                                                                                                                                                    if (f4131e == null) {
                                                                                                                                                        f4131e = newInstance10;
                                                                                                                                                    }
                                                                                                                                                    invoke4 = newInstance10;
                                                                                                                                                    obj2 = r22;
                                                                                                                                                } catch (Throwable th72) {
                                                                                                                                                    try {
                                                                                                                                                        Throwable cause31 = th72.getCause();
                                                                                                                                                        if (cause31 == null) {
                                                                                                                                                            throw th72;
                                                                                                                                                        }
                                                                                                                                                        throw cause31;
                                                                                                                                                    } catch (Exception e12) {
                                                                                                                                                        e = e12;
                                                                                                                                                        try {
                                                                                                                                                            StringBuilder sb10 = new StringBuilder();
                                                                                                                                                            byte[] bArr35 = $$a;
                                                                                                                                                            sb10.append($$c(bArr35[16], bArr35[126], (short) ($$b & 909)));
                                                                                                                                                            sb10.append(invoke7);
                                                                                                                                                            i24 = 3;
                                                                                                                                                            short s25 = (short) 854;
                                                                                                                                                            sb10.append($$c(bArr35[7], bArr35[3], s25));
                                                                                                                                                            try {
                                                                                                                                                                throw ((Throwable) Class.forName($$c(bArr35[14], bArr35[26], s25)).getDeclaredConstructor(cls5, cls3).newInstance(sb10.toString(), e));
                                                                                                                                                            } catch (Throwable th73) {
                                                                                                                                                                Throwable cause32 = th73.getCause();
                                                                                                                                                                if (cause32 == null) {
                                                                                                                                                                    throw th73;
                                                                                                                                                                }
                                                                                                                                                                throw cause32;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th74) {
                                                                                                                                                            th = th74;
                                                                                                                                                            i24 = 3;
                                                                                                                                                            th2 = th;
                                                                                                                                                            r23 = r22;
                                                                                                                                                            zArr5 = zArr;
                                                                                                                                                            str = str;
                                                                                                                                                            zipFile.close();
                                                                                                                                                            throw th2;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } catch (Exception e13) {
                                                                                                                                                e = e13;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th75) {
                                                                                                                                            Throwable cause33 = th75.getCause();
                                                                                                                                            if (cause33 == null) {
                                                                                                                                                throw th75;
                                                                                                                                            }
                                                                                                                                            throw cause33;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th76) {
                                                                                                                                        th = th76;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th77) {
                                                                                                                                    th = th77;
                                                                                                                                    obj3 = r11;
                                                                                                                                    i24 = 3;
                                                                                                                                    th2 = th;
                                                                                                                                    r23 = r22;
                                                                                                                                    zArr5 = zArr;
                                                                                                                                    str = str;
                                                                                                                                    zipFile.close();
                                                                                                                                    throw th2;
                                                                                                                                }
                                                                                                                            } catch (Throwable th78) {
                                                                                                                                th = th78;
                                                                                                                                obj3 = r11;
                                                                                                                                i24 = 3;
                                                                                                                            }
                                                                                                                        } catch (Throwable th79) {
                                                                                                                            Throwable cause34 = th79.getCause();
                                                                                                                            if (cause34 == null) {
                                                                                                                                throw th79;
                                                                                                                            }
                                                                                                                            throw cause34;
                                                                                                                        }
                                                                                                                    } catch (Throwable th80) {
                                                                                                                        Throwable cause35 = th80.getCause();
                                                                                                                        if (cause35 == null) {
                                                                                                                            throw th80;
                                                                                                                        }
                                                                                                                        throw cause35;
                                                                                                                    }
                                                                                                                } catch (Throwable th81) {
                                                                                                                    th = th81;
                                                                                                                    obj3 = r11;
                                                                                                                }
                                                                                                            } catch (Throwable th82) {
                                                                                                                th = th82;
                                                                                                                obj3 = r11;
                                                                                                            }
                                                                                                        } catch (Throwable th83) {
                                                                                                            th = th83;
                                                                                                            obj3 = r11;
                                                                                                        }
                                                                                                    }
                                                                                                    if (z13) {
                                                                                                        int i162 = $11;
                                                                                                        $10 = ((i162 ^ 67) + ((i162 & 67) << 1)) % 128;
                                                                                                        try {
                                                                                                            byte[] bArr36 = $$a;
                                                                                                            Class<?> cls50 = Class.forName($$c(bArr36[c8], bArr36[c15], (short) 485));
                                                                                                            String $$c8 = $$c(bArr36[49], bArr36[c14], (short) ($$b & 896));
                                                                                                            byte b66 = bArr36[c8];
                                                                                                            byte b67 = bArr36[26];
                                                                                                            Method declaredMethod2 = cls50.getDeclaredMethod($$c8, cls5, Class.forName($$c(b66, b67, (short) (b67 | 242))));
                                                                                                            declaredMethod2.setAccessible(true);
                                                                                                            try {
                                                                                                                byte b68 = bArr36[26];
                                                                                                                byte b69 = bArr36[4];
                                                                                                                ?? invoke8 = declaredMethod2.invoke(invoke4, str5, Class.class.getMethod($$c(b68, b69, (short) (b69 | 424)), null).invoke(obj2, null));
                                                                                                                if (invoke8 != null) {
                                                                                                                    int i163 = $10;
                                                                                                                    $11 = (((i163 | 63) << 1) - (i163 ^ 63)) % 128;
                                                                                                                    byte b70 = bArr36[16];
                                                                                                                    byte b71 = bArr36[c8];
                                                                                                                    cls50.getDeclaredMethod($$c(b70, b71, (short) ((b71 ^ 777) | (b71 & 777))), null).invoke(invoke4, null);
                                                                                                                }
                                                                                                                cls9 = invoke8;
                                                                                                            } catch (Throwable th84) {
                                                                                                                Throwable cause36 = th84.getCause();
                                                                                                                if (cause36 == null) {
                                                                                                                    throw th84;
                                                                                                                }
                                                                                                                throw cause36;
                                                                                                            }
                                                                                                        } catch (Throwable th85) {
                                                                                                            th2 = th85;
                                                                                                            obj18 = obj2;
                                                                                                            i24 = 3;
                                                                                                            r23 = obj18;
                                                                                                            zArr5 = zArr;
                                                                                                            str = str;
                                                                                                            zipFile.close();
                                                                                                            throw th2;
                                                                                                        }
                                                                                                    } else {
                                                                                                        byte[] bArr37 = $$a;
                                                                                                        byte b72 = bArr37[c8];
                                                                                                        byte b73 = bArr37[26];
                                                                                                        Method declaredMethod3 = Class.forName($$c(b72, b73, (short) ((b73 ^ 242) | (b73 & 242)))).getDeclaredMethod($$c(bArr37[49], bArr37[c14], (short) ($$b & 896)), cls5);
                                                                                                        try {
                                                                                                            declaredMethod3.setAccessible(true);
                                                                                                            cls9 = declaredMethod3.invoke(invoke4, str5);
                                                                                                        } catch (InvocationTargetException e14) {
                                                                                                            try {
                                                                                                                throw ((Exception) e14.getCause());
                                                                                                            } catch (ClassNotFoundException unused10) {
                                                                                                                cls9 = null;
                                                                                                                if (cls9 != null) {
                                                                                                                }
                                                                                                                th3 = th;
                                                                                                                th2 = th3;
                                                                                                                i24 = 3;
                                                                                                                r23 = obj2;
                                                                                                                zArr5 = zArr;
                                                                                                                str = str;
                                                                                                                zipFile.close();
                                                                                                                throw th2;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (cls9 != null) {
                                                                                                        try {
                                                                                                            break;
                                                                                                        } catch (Throwable th86) {
                                                                                                            th3 = th86;
                                                                                                            th2 = th3;
                                                                                                            i24 = 3;
                                                                                                            r23 = obj2;
                                                                                                            zArr5 = zArr;
                                                                                                            str = str;
                                                                                                            zipFile.close();
                                                                                                            throw th2;
                                                                                                        }
                                                                                                    }
                                                                                                    System.currentTimeMillis();
                                                                                                    System.currentTimeMillis();
                                                                                                    try {
                                                                                                        cls6 = cls9;
                                                                                                        byte[] bArr38 = $$a;
                                                                                                        str4 = $$c(bArr38[c2], bArr38[c8], (short) 120);
                                                                                                        Constructor declaredConstructor2 = cls6.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                        declaredConstructor2.setAccessible(true);
                                                                                                        f4132i = declaredConstructor2.newInstance(invoke4, Boolean.valueOf(!z13));
                                                                                                        byte[] bArr39 = new byte[13460];
                                                                                                        byte b74 = bArr38[426];
                                                                                                        byte b75 = bArr38[c13];
                                                                                                        try {
                                                                                                            short s26 = s10;
                                                                                                            short s27 = s8;
                                                                                                            Object newInstance12 = Class.forName($$c(bArr38[776], bArr38[26], s26)).getDeclaredConstructor(Class.forName($$c(bArr38[14], bArr38[26], s27))).newInstance(zipFile.getInputStream(zipFile.getEntry($$c(b74, b75, (short) ((b75 ^ 16) | (b75 & 16))).substring(1))));
                                                                                                            $10 = ($11 + 109) % 128;
                                                                                                            try {
                                                                                                                short s28 = (short) 670;
                                                                                                                Object newInstance13 = Class.forName($$c(bArr38[105], bArr38[26], s28)).getDeclaredConstructor(Class.forName($$c(bArr38[14], bArr38[26], s27))).newInstance(newInstance12);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        Class.forName($$c(bArr38[105], bArr38[26], s28)).getMethod($$c(bArr38[49], bArr38[46], (short) 648), cls4).invoke(newInstance13, bArr39);
                                                                                                                        try {
                                                                                                                            Class<?> cls51 = Class.forName($$c(bArr38[105], bArr38[26], s28));
                                                                                                                            byte b76 = bArr38[16];
                                                                                                                            byte b77 = bArr38[c8];
                                                                                                                            cls51.getMethod($$c(b76, b77, (short) ((b77 ^ 777) | (b77 & 777))), null).invoke(newInstance13, null);
                                                                                                                            obj19 = obj2;
                                                                                                                            s16 = s26;
                                                                                                                            r11 = obj3;
                                                                                                                            cls162222 = cls5;
                                                                                                                            zArr92222 = zArr3;
                                                                                                                            i522222 = i12;
                                                                                                                            i23 = 0;
                                                                                                                            i24 = 3;
                                                                                                                            i5 = 6;
                                                                                                                            bArr2 = bArr39;
                                                                                                                            i19 = Math.abs(i21);
                                                                                                                            i20 = 13413;
                                                                                                                        } catch (Throwable th87) {
                                                                                                                            Throwable cause37 = th87.getCause();
                                                                                                                            if (cause37 == null) {
                                                                                                                                throw th87;
                                                                                                                            }
                                                                                                                            throw cause37;
                                                                                                                        }
                                                                                                                    } catch (Throwable th88) {
                                                                                                                        th = th88;
                                                                                                                        Throwable cause38 = th.getCause();
                                                                                                                        if (cause38 == null) {
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                        throw cause38;
                                                                                                                    }
                                                                                                                } catch (Throwable th89) {
                                                                                                                    th = th89;
                                                                                                                }
                                                                                                            } catch (Throwable th90) {
                                                                                                                Throwable cause39 = th90.getCause();
                                                                                                                if (cause39 == null) {
                                                                                                                    throw th90;
                                                                                                                }
                                                                                                                throw cause39;
                                                                                                            }
                                                                                                        } catch (Throwable th91) {
                                                                                                            Throwable cause40 = th91.getCause();
                                                                                                            if (cause40 == null) {
                                                                                                                throw th91;
                                                                                                            }
                                                                                                            throw cause40;
                                                                                                        }
                                                                                                    } catch (Throwable th92) {
                                                                                                        th3 = th92;
                                                                                                        th2 = th3;
                                                                                                        i24 = 3;
                                                                                                        r23 = obj2;
                                                                                                        zArr5 = zArr;
                                                                                                        str = str;
                                                                                                        zipFile.close();
                                                                                                        throw th2;
                                                                                                    }
                                                                                                    th3 = th86;
                                                                                                    th2 = th3;
                                                                                                    i24 = 3;
                                                                                                    r23 = obj2;
                                                                                                    zArr5 = zArr;
                                                                                                    str = str;
                                                                                                } catch (Throwable th93) {
                                                                                                    th = th93;
                                                                                                    i12 = i522222;
                                                                                                    cls5 = cls162222;
                                                                                                    zArr3 = zArr92222;
                                                                                                    r22 = obj3;
                                                                                                    i24 = 3;
                                                                                                    obj3 = r11;
                                                                                                }
                                                                                            } catch (Throwable th94) {
                                                                                                th = th94;
                                                                                                r22 = obj19;
                                                                                                i12 = i522222;
                                                                                                obj3 = r11;
                                                                                                cls5 = cls162222;
                                                                                                zArr3 = zArr92222;
                                                                                                i24 = 3;
                                                                                                zArr = zArr;
                                                                                                str = str;
                                                                                                th2 = th;
                                                                                                r23 = r22;
                                                                                                zArr5 = zArr;
                                                                                                str = str;
                                                                                                zipFile.close();
                                                                                                throw th2;
                                                                                            }
                                                                                        } catch (Throwable th95) {
                                                                                            th = th95;
                                                                                            cause2 = th.getCause();
                                                                                            if (cause2 != null) {
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th96) {
                                                                                        th = th96;
                                                                                    }
                                                                                } catch (Throwable th97) {
                                                                                    th = th97;
                                                                                    obj13 = obj19;
                                                                                    i12 = i522222;
                                                                                    obj3 = r11;
                                                                                    zArr6 = zArr;
                                                                                    str3 = str;
                                                                                    cls5 = cls162222;
                                                                                    zArr3 = zArr92222;
                                                                                    r22 = obj13;
                                                                                    zArr = zArr6;
                                                                                    str = str3;
                                                                                    th2 = th;
                                                                                    r23 = r22;
                                                                                    zArr5 = zArr;
                                                                                    str = str;
                                                                                    zipFile.close();
                                                                                    throw th2;
                                                                                }
                                                                                try {
                                                                                    zipFile.close();
                                                                                    throw th2;
                                                                                } catch (Throwable th98) {
                                                                                    th = th98;
                                                                                    obj4 = r23;
                                                                                    zArr4 = zArr5;
                                                                                    str2 = str;
                                                                                    int currentTimeMillis32222 = (int) System.currentTimeMillis();
                                                                                    int i552222 = -(-(i12 * (-69)));
                                                                                    int i562222 = (71 & i552222) + (i552222 | 71);
                                                                                    int i572222 = ~(((-2) & i12) | ((-2) ^ i12));
                                                                                    int i582222 = ~((i12 ^ currentTimeMillis32222) | (i12 & currentTimeMillis32222));
                                                                                    int i592222 = -(-(((i572222 & i582222) | (i572222 ^ i582222)) * (-140)));
                                                                                    int i602222 = (i562222 & i592222) + (i592222 | i562222);
                                                                                    int i612222 = (i12 ^ 1) | (i12 & 1);
                                                                                    int i622222 = (i602222 - (~(-(-((~((i612222 & currentTimeMillis32222) | (i612222 ^ currentTimeMillis32222))) * 70))))) - 1;
                                                                                    int i632222 = ~(((-2) & i12) | ((-2) ^ i12));
                                                                                    i11 = i12;
                                                                                    int i642222 = ~i11;
                                                                                    int i652222 = i632222 | (~((i642222 & 1) | (i642222 ^ 1)));
                                                                                    int i662222 = ~((currentTimeMillis32222 & 1) | (currentTimeMillis32222 ^ 1));
                                                                                    int i672222 = -(-(((i662222 & i652222) | (i652222 ^ i662222)) * 70));
                                                                                    while (i13 < 7) {
                                                                                    }
                                                                                    int i682222 = $11;
                                                                                    i14 = (i682222 & 57) + (i682222 | 57);
                                                                                    $10 = i14 % 128;
                                                                                    if (i14 % 2 == 0) {
                                                                                    }
                                                                                    Object[] objArr62222 = {$$c(b10, b11, b12), th};
                                                                                    byte[] bArr142222 = $$a;
                                                                                    throw ((Throwable) Class.forName($$c(bArr142222[14], bArr142222[26], (short) 854)).getDeclaredConstructor(cls5, cls3).newInstance(objArr62222));
                                                                                }
                                                                            }
                                                                        } catch (Throwable th99) {
                                                                            th = th99;
                                                                            obj4 = obj19;
                                                                            zArr4 = zArr72222;
                                                                            i12 = i522222;
                                                                            obj3 = r1122222 == true ? 1 : 0;
                                                                            zArr2 = zArr82222;
                                                                            str2 = $$c;
                                                                            cls5 = cls162222;
                                                                            zArr3 = zArr92222;
                                                                        }
                                                                    } catch (Throwable th100) {
                                                                        boolean z22 = r1122222 == true ? 1 : 0;
                                                                        Throwable cause41 = th100.getCause();
                                                                        if (cause41 == null) {
                                                                            throw th100;
                                                                        }
                                                                        throw cause41;
                                                                    }
                                                                } catch (Throwable th101) {
                                                                    boolean z23 = r1122222 == true ? 1 : 0;
                                                                    Throwable cause42 = th101.getCause();
                                                                    if (cause42 == null) {
                                                                        throw th101;
                                                                    }
                                                                    throw cause42;
                                                                }
                                                            } catch (Throwable th102) {
                                                                th = th102;
                                                                z10 = z5;
                                                                cls3 = cls13;
                                                                cls4 = cls14;
                                                            }
                                                        } else {
                                                            z10 = z5;
                                                            cls3 = cls13;
                                                            cls4 = cls14;
                                                            num = num2;
                                                            obj2 = obj19;
                                                            z11 = z7;
                                                            zArr = zArr72222;
                                                            i11 = i522222;
                                                            obj3 = r1122222 == true ? 1 : 0;
                                                            zArr2 = zArr82222;
                                                            str = $$c;
                                                            cls5 = cls162222;
                                                            zArr3 = zArr92222;
                                                        }
                                                        z7 = z11;
                                                        i522222 = i11 + 1;
                                                        obj19 = obj2;
                                                        cls13 = cls3;
                                                        cls14 = cls4;
                                                        z5 = z10;
                                                        zArr72222 = zArr;
                                                        num2 = num;
                                                        zArr82222 = zArr2;
                                                        $$c = str;
                                                        r1122222 = obj3;
                                                        cls162222 = cls5;
                                                        zArr92222 = zArr3;
                                                        i5 = 6;
                                                    }
                                                    return;
                                                } catch (Throwable th103) {
                                                    Throwable cause43 = th103.getCause();
                                                    if (cause43 == null) {
                                                        throw th103;
                                                    }
                                                    throw cause43;
                                                }
                                            }
                                            invoke = null;
                                        }
                                        c13 = 694;
                                        c14 = 'P';
                                        if (invoke3 == null) {
                                        }
                                        if (invoke2 == null) {
                                        }
                                        byte[] bArr622222 = $$a;
                                        short s1122222 = (short) 952;
                                        Object[] objArr32222 = (Object[]) Array.newInstance(Class.forName($$c(bArr622222[c14], bArr622222[26], s1122222)), 7);
                                        objArr32222[0] = null;
                                        objArr32222[1] = invoke2;
                                        objArr32222[2] = invoke;
                                        objArr32222[3] = invoke3;
                                        objArr32222[4] = invoke2;
                                        objArr32222[5] = invoke;
                                        objArr32222[i5] = invoke3;
                                        boolean[] zArr722222 = {false, true, true, true, true, true, true};
                                        boolean[] zArr822222 = {false, false, false, false, true, true, true};
                                        boolean[] zArr922222 = new boolean[7];
                                        zArr922222[0] = false;
                                        zArr922222[1] = false;
                                        zArr922222[2] = true;
                                        zArr922222[3] = true;
                                        zArr922222[4] = false;
                                        zArr922222[5] = true;
                                        zArr922222[i5] = true;
                                        byte b1922222 = bArr622222[114];
                                        char c1622222 = '8';
                                        byte b2022222 = bArr622222[105];
                                        Object[] objArr222222 = objArr32222;
                                        Class<?> cls1722222 = Class.forName($$c(b1922222, b2022222, (short) ((b2022222 & 872) | (b2022222 ^ 872))));
                                        byte b2122222 = bArr622222[56];
                                        byte b2222222 = bArr622222[44];
                                        i22 = cls1722222.getDeclaredField($$c(b2122222, b2222222, (short) (b2222222 | 835))).getInt(cls1722222);
                                        if (i22 < 34) {
                                        }
                                        if (i22 != 29) {
                                            zArr922222[0] = i22 != 29 && i22 >= 26;
                                            zArr922222[1] = i22 >= 21;
                                            zArr922222[4] = i22 >= 21;
                                            z7 = false;
                                            int i5222222 = 0;
                                            ?? r11222222 = s1122222;
                                            while (!z7) {
                                                i10 = $11 + 97;
                                                $10 = i10 % 128;
                                                if (i10 % 2 == 0) {
                                                }
                                            }
                                        }
                                        zArr922222[0] = i22 != 29 && i22 >= 26;
                                        zArr922222[1] = i22 >= 21;
                                        zArr922222[4] = i22 >= 21;
                                        z7 = false;
                                        int i52222222 = 0;
                                        ?? r112222222 = s1122222;
                                        while (!z7) {
                                        }
                                    }
                                    invoke3 = null;
                                    Class<String> cls1622222 = String.class;
                                    if (invoke == null) {
                                    }
                                    c13 = 694;
                                    c14 = 'P';
                                    if (invoke3 == null) {
                                    }
                                    if (invoke2 == null) {
                                    }
                                    byte[] bArr6222222 = $$a;
                                    short s11222222 = (short) 952;
                                    Object[] objArr322222 = (Object[]) Array.newInstance(Class.forName($$c(bArr6222222[c14], bArr6222222[26], s11222222)), 7);
                                    objArr322222[0] = null;
                                    objArr322222[1] = invoke2;
                                    objArr322222[2] = invoke;
                                    objArr322222[3] = invoke3;
                                    objArr322222[4] = invoke2;
                                    objArr322222[5] = invoke;
                                    objArr322222[i5] = invoke3;
                                    boolean[] zArr7222222 = {false, true, true, true, true, true, true};
                                    boolean[] zArr8222222 = {false, false, false, false, true, true, true};
                                    boolean[] zArr9222222 = new boolean[7];
                                    zArr9222222[0] = false;
                                    zArr9222222[1] = false;
                                    zArr9222222[2] = true;
                                    zArr9222222[3] = true;
                                    zArr9222222[4] = false;
                                    zArr9222222[5] = true;
                                    zArr9222222[i5] = true;
                                    byte b19222222 = bArr6222222[114];
                                    char c16222222 = '8';
                                    byte b20222222 = bArr6222222[105];
                                    Object[] objArr2222222 = objArr322222;
                                    Class<?> cls17222222 = Class.forName($$c(b19222222, b20222222, (short) ((b20222222 & 872) | (b20222222 ^ 872))));
                                    byte b21222222 = bArr6222222[56];
                                    byte b22222222 = bArr6222222[44];
                                    i22 = cls17222222.getDeclaredField($$c(b21222222, b22222222, (short) (b22222222 | 835))).getInt(cls17222222);
                                    if (i22 < 34) {
                                    }
                                    zArr9222222[0] = i22 != 29 && i22 >= 26;
                                    zArr9222222[1] = i22 >= 21;
                                    zArr9222222[4] = i22 >= 21;
                                    z7 = false;
                                    int i522222222 = 0;
                                    ?? r1122222222 = s11222222;
                                    while (!z7) {
                                    }
                                }
                                c11 = 'O';
                                invoke2 = null;
                                c12 = c11;
                                if (obj != null) {
                                }
                                invoke3 = null;
                                Class<String> cls16222222 = String.class;
                                if (invoke == null) {
                                }
                                c13 = 694;
                                c14 = 'P';
                                if (invoke3 == null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr62222222 = $$a;
                                short s112222222 = (short) 952;
                                Object[] objArr3222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr62222222[c14], bArr62222222[26], s112222222)), 7);
                                objArr3222222[0] = null;
                                objArr3222222[1] = invoke2;
                                objArr3222222[2] = invoke;
                                objArr3222222[3] = invoke3;
                                objArr3222222[4] = invoke2;
                                objArr3222222[5] = invoke;
                                objArr3222222[i5] = invoke3;
                                boolean[] zArr72222222 = {false, true, true, true, true, true, true};
                                boolean[] zArr82222222 = {false, false, false, false, true, true, true};
                                boolean[] zArr92222222 = new boolean[7];
                                zArr92222222[0] = false;
                                zArr92222222[1] = false;
                                zArr92222222[2] = true;
                                zArr92222222[3] = true;
                                zArr92222222[4] = false;
                                zArr92222222[5] = true;
                                zArr92222222[i5] = true;
                                byte b192222222 = bArr62222222[114];
                                char c162222222 = '8';
                                byte b202222222 = bArr62222222[105];
                                Object[] objArr22222222 = objArr3222222;
                                Class<?> cls172222222 = Class.forName($$c(b192222222, b202222222, (short) ((b202222222 & 872) | (b202222222 ^ 872))));
                                byte b212222222 = bArr62222222[56];
                                byte b222222222 = bArr62222222[44];
                                i22 = cls172222222.getDeclaredField($$c(b212222222, b222222222, (short) (b222222222 | 835))).getInt(cls172222222);
                                if (i22 < 34) {
                                }
                                zArr92222222[0] = i22 != 29 && i22 >= 26;
                                zArr92222222[1] = i22 >= 21;
                                zArr92222222[4] = i22 >= 21;
                                z7 = false;
                                int i5222222222 = 0;
                                ?? r11222222222 = s112222222;
                                while (!z7) {
                                }
                            }
                            if (obj != null) {
                            }
                            c11 = 'O';
                            invoke2 = null;
                            c12 = c11;
                            if (obj != null) {
                            }
                            invoke3 = null;
                            Class<String> cls162222222 = String.class;
                            if (invoke == null) {
                            }
                            c13 = 694;
                            c14 = 'P';
                            if (invoke3 == null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr622222222 = $$a;
                            short s1122222222 = (short) 952;
                            Object[] objArr32222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr622222222[c14], bArr622222222[26], s1122222222)), 7);
                            objArr32222222[0] = null;
                            objArr32222222[1] = invoke2;
                            objArr32222222[2] = invoke;
                            objArr32222222[3] = invoke3;
                            objArr32222222[4] = invoke2;
                            objArr32222222[5] = invoke;
                            objArr32222222[i5] = invoke3;
                            boolean[] zArr722222222 = {false, true, true, true, true, true, true};
                            boolean[] zArr822222222 = {false, false, false, false, true, true, true};
                            boolean[] zArr922222222 = new boolean[7];
                            zArr922222222[0] = false;
                            zArr922222222[1] = false;
                            zArr922222222[2] = true;
                            zArr922222222[3] = true;
                            zArr922222222[4] = false;
                            zArr922222222[5] = true;
                            zArr922222222[i5] = true;
                            byte b1922222222 = bArr622222222[114];
                            char c1622222222 = '8';
                            byte b2022222222 = bArr622222222[105];
                            Object[] objArr222222222 = objArr32222222;
                            Class<?> cls1722222222 = Class.forName($$c(b1922222222, b2022222222, (short) ((b2022222222 & 872) | (b2022222222 ^ 872))));
                            byte b2122222222 = bArr622222222[56];
                            byte b2222222222 = bArr622222222[44];
                            i22 = cls1722222222.getDeclaredField($$c(b2122222222, b2222222222, (short) (b2222222222 | 835))).getInt(cls1722222222);
                            if (i22 < 34) {
                            }
                            zArr922222222[0] = i22 != 29 && i22 >= 26;
                            zArr922222222[1] = i22 >= 21;
                            zArr922222222[4] = i22 >= 21;
                            z7 = false;
                            int i52222222222 = 0;
                            ?? r112222222222 = s1122222222;
                            while (!z7) {
                            }
                        }
                        invoke = null;
                        if (obj != null) {
                        }
                        c11 = 'O';
                        invoke2 = null;
                        c12 = c11;
                        if (obj != null) {
                        }
                        invoke3 = null;
                        Class<String> cls1622222222 = String.class;
                        if (invoke == null) {
                        }
                        c13 = 694;
                        c14 = 'P';
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr6222222222 = $$a;
                        short s11222222222 = (short) 952;
                        Object[] objArr322222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr6222222222[c14], bArr6222222222[26], s11222222222)), 7);
                        objArr322222222[0] = null;
                        objArr322222222[1] = invoke2;
                        objArr322222222[2] = invoke;
                        objArr322222222[3] = invoke3;
                        objArr322222222[4] = invoke2;
                        objArr322222222[5] = invoke;
                        objArr322222222[i5] = invoke3;
                        boolean[] zArr7222222222 = {false, true, true, true, true, true, true};
                        boolean[] zArr8222222222 = {false, false, false, false, true, true, true};
                        boolean[] zArr9222222222 = new boolean[7];
                        zArr9222222222[0] = false;
                        zArr9222222222[1] = false;
                        zArr9222222222[2] = true;
                        zArr9222222222[3] = true;
                        zArr9222222222[4] = false;
                        zArr9222222222[5] = true;
                        zArr9222222222[i5] = true;
                        byte b19222222222 = bArr6222222222[114];
                        char c16222222222 = '8';
                        byte b20222222222 = bArr6222222222[105];
                        Object[] objArr2222222222 = objArr322222222;
                        Class<?> cls17222222222 = Class.forName($$c(b19222222222, b20222222222, (short) ((b20222222222 & 872) | (b20222222222 ^ 872))));
                        byte b21222222222 = bArr6222222222[56];
                        byte b22222222222 = bArr6222222222[44];
                        i22 = cls17222222222.getDeclaredField($$c(b21222222222, b22222222222, (short) (b22222222222 | 835))).getInt(cls17222222222);
                        if (i22 < 34) {
                        }
                        zArr9222222222[0] = i22 != 29 && i22 >= 26;
                        zArr9222222222[1] = i22 >= 21;
                        zArr9222222222[4] = i22 >= 21;
                        z7 = false;
                        int i522222222222 = 0;
                        ?? r1122222222222 = s11222222222;
                        while (!z7) {
                        }
                    }
                } catch (Exception unused11) {
                    c8 = 'k';
                    c10 = 'H';
                    obj = null;
                    c2 = c2;
                    c8 = c8;
                    byte[] bArr52 = $$a;
                    Class<?> cls152 = Class.forName($$c(bArr52[c10], bArr52[105], (short) 1037));
                    byte b172 = bArr52[c8];
                    byte b182 = bArr52[4];
                    i5 = 6;
                    obj = cls152.getMethod($$c(b172, b182, (short) ((b182 ^ 1000) | (b182 & 1000))), null).invoke(null, null);
                    if (obj != null) {
                    }
                    invoke = null;
                    if (obj != null) {
                    }
                    c11 = 'O';
                    invoke2 = null;
                    c12 = c11;
                    if (obj != null) {
                    }
                    invoke3 = null;
                    Class<String> cls16222222222 = String.class;
                    if (invoke == null) {
                    }
                    c13 = 694;
                    c14 = 'P';
                    if (invoke3 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr62222222222 = $$a;
                    short s112222222222 = (short) 952;
                    Object[] objArr3222222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr62222222222[c14], bArr62222222222[26], s112222222222)), 7);
                    objArr3222222222[0] = null;
                    objArr3222222222[1] = invoke2;
                    objArr3222222222[2] = invoke;
                    objArr3222222222[3] = invoke3;
                    objArr3222222222[4] = invoke2;
                    objArr3222222222[5] = invoke;
                    objArr3222222222[i5] = invoke3;
                    boolean[] zArr72222222222 = {false, true, true, true, true, true, true};
                    boolean[] zArr82222222222 = {false, false, false, false, true, true, true};
                    boolean[] zArr92222222222 = new boolean[7];
                    zArr92222222222[0] = false;
                    zArr92222222222[1] = false;
                    zArr92222222222[2] = true;
                    zArr92222222222[3] = true;
                    zArr92222222222[4] = false;
                    zArr92222222222[5] = true;
                    zArr92222222222[i5] = true;
                    byte b192222222222 = bArr62222222222[114];
                    char c162222222222 = '8';
                    byte b202222222222 = bArr62222222222[105];
                    Object[] objArr22222222222 = objArr3222222222;
                    Class<?> cls172222222222 = Class.forName($$c(b192222222222, b202222222222, (short) ((b202222222222 & 872) | (b202222222222 ^ 872))));
                    byte b212222222222 = bArr62222222222[56];
                    byte b222222222222 = bArr62222222222[44];
                    i22 = cls172222222222.getDeclaredField($$c(b212222222222, b222222222222, (short) (b222222222222 | 835))).getInt(cls172222222222);
                    if (i22 < 34) {
                    }
                    zArr92222222222[0] = i22 != 29 && i22 >= 26;
                    zArr92222222222[1] = i22 >= 21;
                    zArr92222222222[4] = i22 >= 21;
                    z7 = false;
                    int i5222222222222 = 0;
                    ?? r11222222222222 = s112222222222;
                    while (!z7) {
                    }
                }
                try {
                    obj = cls11.getMethod($$c(b14, b15, (short) ((b15 ^ 1034) | (b15 & 1034))), null).invoke(null, null);
                    c2 = 511;
                    c8 = 'k';
                } catch (Exception unused12) {
                    obj = null;
                    c2 = c2;
                    c8 = c8;
                    byte[] bArr522 = $$a;
                    Class<?> cls1522 = Class.forName($$c(bArr522[c10], bArr522[105], (short) 1037));
                    byte b1722 = bArr522[c8];
                    byte b1822 = bArr522[4];
                    i5 = 6;
                    obj = cls1522.getMethod($$c(b1722, b1822, (short) ((b1822 ^ 1000) | (b1822 & 1000))), null).invoke(null, null);
                    if (obj != null) {
                    }
                    invoke = null;
                    if (obj != null) {
                    }
                    c11 = 'O';
                    invoke2 = null;
                    c12 = c11;
                    if (obj != null) {
                    }
                    invoke3 = null;
                    Class<String> cls162222222222 = String.class;
                    if (invoke == null) {
                    }
                    c13 = 694;
                    c14 = 'P';
                    if (invoke3 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr622222222222 = $$a;
                    short s1122222222222 = (short) 952;
                    Object[] objArr32222222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr622222222222[c14], bArr622222222222[26], s1122222222222)), 7);
                    objArr32222222222[0] = null;
                    objArr32222222222[1] = invoke2;
                    objArr32222222222[2] = invoke;
                    objArr32222222222[3] = invoke3;
                    objArr32222222222[4] = invoke2;
                    objArr32222222222[5] = invoke;
                    objArr32222222222[i5] = invoke3;
                    boolean[] zArr722222222222 = {false, true, true, true, true, true, true};
                    boolean[] zArr822222222222 = {false, false, false, false, true, true, true};
                    boolean[] zArr922222222222 = new boolean[7];
                    zArr922222222222[0] = false;
                    zArr922222222222[1] = false;
                    zArr922222222222[2] = true;
                    zArr922222222222[3] = true;
                    zArr922222222222[4] = false;
                    zArr922222222222[5] = true;
                    zArr922222222222[i5] = true;
                    byte b1922222222222 = bArr622222222222[114];
                    char c1622222222222 = '8';
                    byte b2022222222222 = bArr622222222222[105];
                    Object[] objArr222222222222 = objArr32222222222;
                    Class<?> cls1722222222222 = Class.forName($$c(b1922222222222, b2022222222222, (short) ((b2022222222222 & 872) | (b2022222222222 ^ 872))));
                    byte b2122222222222 = bArr622222222222[56];
                    byte b2222222222222 = bArr622222222222[44];
                    i22 = cls1722222222222.getDeclaredField($$c(b2122222222222, b2222222222222, (short) (b2222222222222 | 835))).getInt(cls1722222222222);
                    if (i22 < 34) {
                    }
                    zArr922222222222[0] = i22 != 29 && i22 >= 26;
                    zArr922222222222[1] = i22 >= 21;
                    zArr922222222222[4] = i22 >= 21;
                    z7 = false;
                    int i52222222222222 = 0;
                    ?? r112222222222222 = s1122222222222;
                    while (!z7) {
                    }
                }
            } catch (Exception e15) {
                throw new RuntimeException(e15);
            }
        } catch (Throwable th104) {
            Throwable cause44 = th104.getCause();
            if (cause44 == null) {
                throw th104;
            }
            throw cause44;
        }
    }

    private AFa1hSDK() {
    }

    private static void AFAdRevenueData(int i5, int i10) {
        $11 = ($10 + 77) % 128;
    }

    public static int getMonetizationNetwork(int i5) {
        int i10 = $10 + 85;
        int i11 = i10 % 128;
        $11 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        Object obj = f4132i;
        $10 = ((i11 ^ 63) + ((i11 & 63) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i5)};
            byte[] bArr = $$a;
            return ((Integer) Class.forName($$c(bArr[511], bArr[107], (short) 583), true, (ClassLoader) f4131e).getMethod($$c(bArr[72], bArr[4], bArr[7]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int getRevenue(Object obj) {
        int i5 = $11;
        Object obj2 = f4132i;
        $10 = (((i5 | 39) << 1) - (i5 ^ 39)) % 128;
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[511], bArr[107], (short) 583), true, (ClassLoader) f4131e).getMethod($$c(bArr[12], bArr[85], (short) 551), Object.class).invoke(obj2, objArr)).intValue();
            int i10 = $10 + 103;
            $11 = i10 % 128;
            if (i10 % 2 != 0) {
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

    public static void init$0() {
        int i5 = $11;
        $10 = (((i5 | 113) << 1) - (i5 ^ 113)) % 128;
        byte[] bArr = new byte[1194];
        System.arraycopy("\u000f×sN\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾9\u0011ò\u0019í\u0004\rüÌ\u00191ò\u0019í\u0004\rüö\u0011ÿ\u0000\ròí$ô\u0005\t\u000e\b\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓ3õô\n\u000b\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u00063Ø\u0004\u0001\u00042Î\u00073Ô\u00030Ð\u00056ÿÏ\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b(ÉDäô\n\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓ3õô\n\u000b\u0003\bþ&ñ\u0016\u0014ò\f\nóâ \u0016ðû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓ:îô\nÜL5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ9\u0003\u0000\u0004Ó\u0006\u0004\u0003\u0005ý\u0003\u0007þ\u00060\u0002\u0004Îî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\u0001\u0012Ü\u001b\u0002\bû\u0016ø\t\u0002ã\u001a\u0012\u0006û\u0006ü\u0001\u0012Ò5\u0000\u0003ö\fø\u0019Ó-ÿÈ\u0001\u0002\t\u000f/ø\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 1194);
        $$a = bArr;
        $$b = 246;
        int i10 = $10;
        int i11 = (i10 & 45) + (i10 | 45);
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 21 / 0;
        }
    }

    public static Object getRevenue(int i5, char c2, int i10) {
        int i11 = $10;
        int i12 = (i11 & 63) + (i11 | 63);
        int i13 = i12 % 128;
        $11 = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        Object obj = f4132i;
        $10 = (i13 + 43) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i5), Character.valueOf(c2), Integer.valueOf(i10)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[511], bArr[107], (short) 583), true, (ClassLoader) f4131e);
            byte b10 = bArr[14];
            String $$c = $$c(b10, bArr[4], b10);
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            $11 = ($10 + 27) % 128;
            return invoke;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
