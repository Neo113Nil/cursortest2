package com.appsflyer.internal;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
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
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class AFc1iSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AFLogger$LogLevel;
    private static byte[] AFVersionDeclaration;
    private static int AppsFlyer2dXConversionCallback;
    public static final Map<Integer, Object> afErrorLog;
    private static Object afErrorLogForExcManagerOnly;
    private static final Map<String, Object> afLogForce;
    private static Object getLevel;
    private static int onAppOpenAttributionNative;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:4:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b11, int i11, int i12) {
        int i13;
        int i14 = ($11 + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
        $10 = i14;
        int i15 = ((b11 | 1) << 1) - (b11 ^ 1);
        byte[] bArr = $$a;
        int i16 = (i11 ^ 4) + ((i11 & 4) << 1);
        int i17 = -i12;
        int i18 = (i17 ^ 119) + ((i17 & 119) << 1);
        byte[] bArr2 = new byte[i15];
        int i19 = i15 - 1;
        if (bArr == null) {
            $11 = ((i14 & 115) + (i14 | 115)) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i18 = i19;
            int i21 = i16;
            i13 = 0;
            int i22 = ((i18 | i16) << 1) - (i18 ^ i16);
            i18 = (i22 ^ (-2)) + ((i22 & (-2)) << 1);
            i16 = i21;
            bArr2[i13] = (byte) i18;
            int i23 = (i13 & 1) + (i13 | 1);
            int i24 = i16 + 1;
            if (i13 == i19) {
                String str = new String(bArr2, 0);
                int i25 = $11 + 125;
                $10 = i25 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i25 % 2 == 0) {
                    return str;
                }
                throw null;
            }
            byte b12 = bArr[i24];
            $10 = ($11 + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i16 = b12;
            i13 = i23;
            i21 = i24;
            int i222 = ((i18 | i16) << 1) - (i18 ^ i16);
            i18 = (i222 ^ (-2)) + ((i222 & (-2)) << 1);
            i16 = i21;
            bArr2[i13] = (byte) i18;
            int i232 = (i13 & 1) + (i13 | 1);
            int i242 = i16 + 1;
            if (i13 == i19) {
            }
        } else {
            i13 = 0;
            bArr2[i13] = (byte) i18;
            int i2322 = (i13 & 1) + (i13 | 1);
            int i2422 = i16 + 1;
            if (i13 == i19) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:915|916|910|911|(36:906|907|(0)|20|21|(0)|23|24|(0)|26|27|(0)(0)|30|(0)|44|45|46|47|48|49|50|51|(0)(0)|54|(0)|858|59|60|(0)(0)|63|(0)(0)|66|67|(0)|852|853)|18|(0)|20|21|(0)|23|24|(0)|26|27|(0)(0)|30|(0)|44|45|46|47|48|49|50|51|(0)(0)|54|(0)|858|59|60|(0)(0)|63|(0)(0)|66|67|(0)|852|853) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b8, code lost:
    
        if (r3 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x13ca, code lost:
    
        r0 = r62.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
        com.appsflyer.internal.AFc1iSDK.afErrorLogForExcManagerOnly = r0.newInstance(r1, java.lang.Boolean.valueOf(!r61));
        r1 = 7;
        r2 = 1;
        r3 = 2;
        r24 = -1;
        r29 = false;
        r34 = 528;
        r41 = null;
        r26 = r26;
        r43 = r43;
        r57 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x15d0, code lost:
    
        r0 = r57[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x15d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x036a, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r0[r31], r14, r0[r32])).getMethod($$c(r0[19], (short) 805, r0[70]), null).invoke(r10, null)).booleanValue() != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x02f2, code lost:
    
        r1 = r29 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x02f5, code lost:
    
        r36 = 6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x119f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x13ca A[EDGE_INSN: B:195:0x13ca->B:196:0x13ca BREAK  A[LOOP:1: B:97:0x0841->B:250:0x1385], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x15a7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x15dd A[Catch: Exception -> 0x1689, TRY_ENTER, TryCatch #72 {Exception -> 0x1689, blocks: (B:3:0x0029, B:9:0x005c, B:34:0x020f, B:39:0x024f, B:41:0x0255, B:43:0x0256, B:44:0x0257, B:47:0x029a, B:50:0x02a2, B:60:0x02db, B:63:0x02e6, B:66:0x02ef, B:72:0x0318, B:206:0x15b5, B:212:0x15dd, B:198:0x1651, B:216:0x15e9, B:223:0x1629, B:225:0x162f, B:226:0x1630, B:208:0x15be, B:228:0x15d0, B:231:0x15d4, B:865:0x01a4, B:872:0x166f, B:874:0x1675, B:875:0x1676, B:878:0x1678, B:880:0x167e, B:881:0x167f, B:884:0x015c, B:889:0x1681, B:891:0x1687, B:892:0x1688, B:919:0x006e, B:219:0x15fc, B:220:0x1627, B:36:0x021e, B:869:0x01e4, B:867:0x01b1, B:886:0x017e), top: B:2:0x0029, inners: #1, #12, #25, #32, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x15e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x15d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1292 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x124b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x117c A[Catch: all -> 0x0d7e, Exception -> 0x118b, TRY_ENTER, TRY_LEAVE, TryCatch #66 {Exception -> 0x118b, blocks: (B:461:0x10fe, B:464:0x117c, B:467:0x1190), top: B:460:0x10fe, outer: #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x119a A[Catch: all -> 0x0d7e, TRY_ENTER, TRY_LEAVE, TryCatch #35 {all -> 0x0d7e, blocks: (B:180:0x0d5f, B:294:0x0d7b, B:185:0x11a7, B:189:0x1209, B:192:0x1224, B:275:0x1243, B:277:0x1249, B:278:0x124a, B:283:0x127b, B:287:0x1288, B:288:0x128e, B:297:0x0d86, B:299:0x0d8c, B:300:0x0d8d, B:303:0x0d93, B:305:0x0d99, B:306:0x0d9a, B:309:0x0d9c, B:311:0x0da2, B:312:0x0da3, B:391:0x0ea7, B:393:0x0ea9, B:395:0x0eaf, B:396:0x0eb0, B:399:0x0eb2, B:401:0x0eb8, B:402:0x0eb9, B:428:0x0f6e, B:437:0x0fc6, B:439:0x0fcc, B:440:0x0fcd, B:464:0x117c, B:470:0x119a, B:504:0x1066, B:506:0x106c, B:507:0x106d, B:511:0x1032, B:513:0x1038, B:514:0x1039, B:187:0x11ec, B:293:0x0d63, B:177:0x0d31, B:174:0x0d00, B:388:0x0e81, B:386:0x0e56, B:433:0x0f77, B:352:0x0ad0, B:136:0x0b0d, B:138:0x0b13, B:150:0x0bce, B:152:0x0bd4, B:153:0x0bd5, B:164:0x0c6c, B:172:0x0cf4, B:315:0x0da5, B:317:0x0dab, B:318:0x0dac, B:321:0x0dae, B:323:0x0db4, B:324:0x0db5, B:327:0x0db7, B:329:0x0dbd, B:330:0x0dbe, B:333:0x0dc0, B:335:0x0dc6, B:336:0x0dc7, B:339:0x0dc9, B:341:0x0dcf, B:342:0x0dd0, B:345:0x0bda, B:347:0x0be0, B:348:0x0be1, B:355:0x0afd, B:357:0x0b03, B:358:0x0b0a, B:371:0x0de4, B:379:0x0e4e, B:381:0x0e54, B:382:0x0e55, B:361:0x0ddc, B:363:0x0de2, B:364:0x0de3), top: B:179:0x0d5f, inners: #5, #38, #43, #46, #51, #57, #67, #92, #95 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x06dd A[Catch: all -> 0x06c7, Exception -> 0x06ca, TryCatch #40 {Exception -> 0x06ca, blocks: (B:736:0x06c0, B:738:0x06c6, B:739:0x06cc, B:743:0x06d7, B:745:0x06dd, B:746:0x06de), top: B:722:0x0655, outer: #70 }] */
    /* JADX WARN: Removed duplicated region for block: B:746:0x06de A[Catch: all -> 0x06c7, Exception -> 0x06ca, TRY_LEAVE, TryCatch #40 {Exception -> 0x06ca, blocks: (B:736:0x06c0, B:738:0x06c6, B:739:0x06cc, B:743:0x06d7, B:745:0x06dd, B:746:0x06de), top: B:722:0x0655, outer: #70 }] */
    /* JADX WARN: Removed duplicated region for block: B:825:0x037e A[Catch: all -> 0x037f, TryCatch #36 {all -> 0x037f, blocks: (B:809:0x039b, B:817:0x0401, B:819:0x0407, B:820:0x0408, B:823:0x0378, B:825:0x037e, B:826:0x0394, B:812:0x03dc, B:813:0x03ff), top: B:797:0x0330, inners: #93 }] */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0394 A[Catch: all -> 0x037f, TryCatch #36 {all -> 0x037f, blocks: (B:809:0x039b, B:817:0x0401, B:819:0x0407, B:820:0x0408, B:823:0x0378, B:825:0x037e, B:826:0x0394, B:812:0x03dc, B:813:0x03ff), top: B:797:0x0330, inners: #93 }] */
    /* JADX WARN: Removed duplicated region for block: B:855:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x01a4 A[Catch: Exception -> 0x1689, TRY_ENTER, TRY_LEAVE, TryCatch #72 {Exception -> 0x1689, blocks: (B:3:0x0029, B:9:0x005c, B:34:0x020f, B:39:0x024f, B:41:0x0255, B:43:0x0256, B:44:0x0257, B:47:0x029a, B:50:0x02a2, B:60:0x02db, B:63:0x02e6, B:66:0x02ef, B:72:0x0318, B:206:0x15b5, B:212:0x15dd, B:198:0x1651, B:216:0x15e9, B:223:0x1629, B:225:0x162f, B:226:0x1630, B:208:0x15be, B:228:0x15d0, B:231:0x15d4, B:865:0x01a4, B:872:0x166f, B:874:0x1675, B:875:0x1676, B:878:0x1678, B:880:0x167e, B:881:0x167f, B:884:0x015c, B:889:0x1681, B:891:0x1687, B:892:0x1688, B:919:0x006e, B:219:0x15fc, B:220:0x1627, B:36:0x021e, B:869:0x01e4, B:867:0x01b1, B:886:0x017e), top: B:2:0x0029, inners: #1, #12, #25, #32, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:882:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:893:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:897:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v174, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v307 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v27 */
    /* JADX WARN: Type inference failed for: r26v28 */
    /* JADX WARN: Type inference failed for: r26v29 */
    /* JADX WARN: Type inference failed for: r26v30 */
    /* JADX WARN: Type inference failed for: r26v33 */
    /* JADX WARN: Type inference failed for: r26v34 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v40 */
    /* JADX WARN: Type inference failed for: r29v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v132, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v151, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r54v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r54v10 */
    /* JADX WARN: Type inference failed for: r54v11 */
    /* JADX WARN: Type inference failed for: r54v12 */
    /* JADX WARN: Type inference failed for: r54v13 */
    /* JADX WARN: Type inference failed for: r54v14 */
    /* JADX WARN: Type inference failed for: r54v15 */
    /* JADX WARN: Type inference failed for: r54v16 */
    /* JADX WARN: Type inference failed for: r54v18 */
    /* JADX WARN: Type inference failed for: r54v19 */
    /* JADX WARN: Type inference failed for: r54v20 */
    /* JADX WARN: Type inference failed for: r54v21 */
    /* JADX WARN: Type inference failed for: r54v5 */
    /* JADX WARN: Type inference failed for: r54v6 */
    /* JADX WARN: Type inference failed for: r54v7 */
    /* JADX WARN: Type inference failed for: r54v8 */
    /* JADX WARN: Type inference failed for: r54v9 */
    /* JADX WARN: Type inference failed for: r57v34, types: [short] */
    static {
        int i11;
        char c11;
        String str;
        char c12;
        boolean z11;
        Object obj;
        Object invoke;
        Class<?> cls;
        byte[] bArr;
        boolean z12;
        Object invoke2;
        Object invoke3;
        char c13;
        char c14;
        int i12;
        int i13;
        boolean z13;
        int i14;
        boolean[] zArr;
        String str2;
        int i15;
        boolean[] zArr2;
        Object obj2;
        Object[] objArr;
        boolean[] zArr3;
        int i16;
        int i17;
        boolean z14;
        boolean[] zArr4;
        boolean z15;
        boolean z16;
        Object[] objArr2;
        boolean[] zArr5;
        char c15;
        boolean[] zArr6;
        boolean z17;
        Object[] objArr3;
        int i18;
        boolean z18;
        boolean z19;
        boolean z21;
        char c16;
        Throwable cause;
        boolean z22;
        boolean z23;
        boolean z24;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        char c17;
        Throwable cause2;
        int i19;
        Object[] objArr4;
        boolean[] zArr7;
        byte[] bArr2;
        byte[] bArr3;
        short s11;
        Object newInstance;
        int i21;
        boolean z25;
        Object[] objArr5;
        byte b11;
        Object obj8;
        InputStream inputStream;
        Class cls2;
        String str3;
        char c18;
        short s12;
        byte[] bArr4;
        Object invoke4;
        Object newInstance2;
        int length;
        int i22;
        Object obj9;
        Class cls3;
        boolean z26;
        int i23 = 7;
        init$0();
        AppsFlyer2dXConversionCallback = -1812804333;
        onAppOpenAttributionNative = 775122793;
        afLogForce = new HashMap();
        afErrorLog = new HashMap();
        try {
            byte[] bArr5 = $$a;
            byte b12 = bArr5[281];
            String $$c = $$c(b12, (short) ((b12 ^ 406) | (b12 & 406)), bArr5[70]);
            int i24 = 2;
            Object obj10 = null;
            if (afErrorLogForExcManagerOnly == null) {
                int i25 = $11 + 95;
                i11 = -1;
                $10 = i25 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i25 % 2 != 0) {
                    c11 = 4;
                    str = $$c(bArr5[6565], (short) 9001, bArr5[33]);
                } else {
                    c11 = 4;
                    str = $$c(bArr5[206], (short) 965, bArr5[70]);
                }
            } else {
                i11 = -1;
                c11 = 4;
                str = null;
            }
            try {
                c12 = '$';
                z11 = true;
                z11 = true;
                z11 = true;
                try {
                    obj = Class.forName($$c(bArr5[786], (short) 751, bArr5[36])).getMethod($$c(bArr5[9], (short) (-bArr5[17]), bArr5[70]), new Class[0]).invoke(null, null);
                } catch (Exception unused) {
                    obj = null;
                    try {
                        byte[] bArr6 = $$a;
                        obj = Class.forName($$c(bArr6[83], (short) 417, bArr6[c12])).getMethod($$c(bArr6[70], (short) 837, bArr6[89]), new Class[0]).invoke(null, null);
                    } catch (Exception unused2) {
                    }
                    if (obj != null) {
                        try {
                            Class<?> cls4 = obj.getClass();
                            byte[] bArr7 = $$a;
                            invoke = cls4.getMethod($$c(bArr7[69], (short) 259, bArr7[89]), null).invoke(obj, null);
                        } catch (Exception unused3) {
                            invoke = null;
                            if (obj != null) {
                                try {
                                    cls = obj.getClass();
                                    bArr = $$a;
                                    z12 = false;
                                } catch (Exception unused4) {
                                    z12 = false;
                                    invoke2 = null;
                                    if (obj != null) {
                                    }
                                    invoke3 = null;
                                    if (invoke == null) {
                                    }
                                    c13 = 'J';
                                    c14 = 25;
                                    if (invoke3 != null) {
                                    }
                                    if (invoke2 == null) {
                                    }
                                    byte[] bArr8 = $$a;
                                    short s13 = (short) 857;
                                    Object[] objArr6 = (Object[]) Array.newInstance(Class.forName($$c(bArr8[c13], s13, bArr8[c14])), 7);
                                    objArr6[z12 ? 1 : 0] = null;
                                    objArr6[z11 ? 1 : 0] = invoke2;
                                    objArr6[2] = invoke;
                                    objArr6[3] = invoke3;
                                    objArr6[c11] = invoke2;
                                    objArr6[5] = invoke;
                                    objArr6[6] = invoke3;
                                    boolean[] zArr8 = {false, true, true, true, true, true, true};
                                    boolean[] zArr9 = {false, false, false, false, true, true, true};
                                    boolean[] zArr10 = new boolean[7];
                                    zArr10[z12 ? 1 : 0] = z12;
                                    zArr10[z11 ? 1 : 0] = z12;
                                    zArr10[2] = z11;
                                    zArr10[3] = z11;
                                    zArr10[c11] = z12;
                                    zArr10[5] = z11;
                                    zArr10[6] = z11;
                                    char c19 = 6;
                                    Class<?> cls5 = Class.forName($$c(bArr8[30], (short) 149, bArr8[c12]));
                                    byte b13 = bArr8[95];
                                    int i26 = cls5.getDeclaredField($$c(b13, (short) (b13 | 617), bArr8[97])).getInt(cls5);
                                    if (i26 >= 34) {
                                    }
                                    zArr10[z12 ? 1 : 0] = (i26 != 29 && i26 >= 26) ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                    zArr10[z11 ? 1 : 0] = i26 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                    zArr10[c11] = i26 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                    i13 = z12 ? 1 : 0;
                                    int i27 = i13;
                                    boolean z27 = r1;
                                    int i28 = c11;
                                    boolean z28 = z12;
                                    loop0: while (i13 == 0) {
                                    }
                                }
                                try {
                                    invoke2 = cls.getMethod($$c(bArr[5], (short) 346, bArr[89]), null).invoke(obj, null);
                                } catch (Exception unused5) {
                                    invoke2 = null;
                                    if (obj != null) {
                                    }
                                    invoke3 = null;
                                    if (invoke == null) {
                                    }
                                    c13 = 'J';
                                    c14 = 25;
                                    if (invoke3 != null) {
                                    }
                                    if (invoke2 == null) {
                                    }
                                    byte[] bArr82 = $$a;
                                    short s132 = (short) 857;
                                    Object[] objArr62 = (Object[]) Array.newInstance(Class.forName($$c(bArr82[c13], s132, bArr82[c14])), 7);
                                    objArr62[z12 ? 1 : 0] = null;
                                    objArr62[z11 ? 1 : 0] = invoke2;
                                    objArr62[2] = invoke;
                                    objArr62[3] = invoke3;
                                    objArr62[c11] = invoke2;
                                    objArr62[5] = invoke;
                                    objArr62[6] = invoke3;
                                    boolean[] zArr82 = {false, true, true, true, true, true, true};
                                    boolean[] zArr92 = {false, false, false, false, true, true, true};
                                    boolean[] zArr102 = new boolean[7];
                                    zArr102[z12 ? 1 : 0] = z12;
                                    zArr102[z11 ? 1 : 0] = z12;
                                    zArr102[2] = z11;
                                    zArr102[3] = z11;
                                    zArr102[c11] = z12;
                                    zArr102[5] = z11;
                                    zArr102[6] = z11;
                                    char c192 = 6;
                                    Class<?> cls52 = Class.forName($$c(bArr82[30], (short) 149, bArr82[c12]));
                                    byte b132 = bArr82[95];
                                    int i262 = cls52.getDeclaredField($$c(b132, (short) (b132 | 617), bArr82[97])).getInt(cls52);
                                    if (i262 >= 34) {
                                    }
                                    zArr102[z12 ? 1 : 0] = (i262 != 29 && i262 >= 26) ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                    zArr102[z11 ? 1 : 0] = i262 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                    zArr102[c11] = i262 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                    i13 = z12 ? 1 : 0;
                                    int i272 = i13;
                                    boolean z272 = r1;
                                    int i282 = c11;
                                    boolean z282 = z12;
                                    loop0: while (i13 == 0) {
                                    }
                                }
                                if (obj != null) {
                                    try {
                                        Class<?> cls6 = obj.getClass();
                                        byte[] bArr9 = $$a;
                                        invoke3 = cls6.getMethod($$c(bArr9[69], (short) 273, bArr9[89]), null).invoke(obj, null);
                                    } catch (Exception unused6) {
                                        invoke3 = null;
                                        if (invoke == null) {
                                        }
                                        c13 = 'J';
                                        c14 = 25;
                                        if (invoke3 != null) {
                                        }
                                        if (invoke2 == null) {
                                        }
                                        byte[] bArr822 = $$a;
                                        short s1322 = (short) 857;
                                        Object[] objArr622 = (Object[]) Array.newInstance(Class.forName($$c(bArr822[c13], s1322, bArr822[c14])), 7);
                                        objArr622[z12 ? 1 : 0] = null;
                                        objArr622[z11 ? 1 : 0] = invoke2;
                                        objArr622[2] = invoke;
                                        objArr622[3] = invoke3;
                                        objArr622[c11] = invoke2;
                                        objArr622[5] = invoke;
                                        objArr622[6] = invoke3;
                                        boolean[] zArr822 = {false, true, true, true, true, true, true};
                                        boolean[] zArr922 = {false, false, false, false, true, true, true};
                                        boolean[] zArr1022 = new boolean[7];
                                        zArr1022[z12 ? 1 : 0] = z12;
                                        zArr1022[z11 ? 1 : 0] = z12;
                                        zArr1022[2] = z11;
                                        zArr1022[3] = z11;
                                        zArr1022[c11] = z12;
                                        zArr1022[5] = z11;
                                        zArr1022[6] = z11;
                                        char c1922 = 6;
                                        Class<?> cls522 = Class.forName($$c(bArr822[30], (short) 149, bArr822[c12]));
                                        byte b1322 = bArr822[95];
                                        int i2622 = cls522.getDeclaredField($$c(b1322, (short) (b1322 | 617), bArr822[97])).getInt(cls522);
                                        if (i2622 >= 34) {
                                        }
                                        zArr1022[z12 ? 1 : 0] = (i2622 != 29 && i2622 >= 26) ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                        zArr1022[z11 ? 1 : 0] = i2622 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                        zArr1022[c11] = i2622 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                        i13 = z12 ? 1 : 0;
                                        int i2722 = i13;
                                        boolean z2722 = r1;
                                        int i2822 = c11;
                                        boolean z2822 = z12;
                                        loop0: while (i13 == 0) {
                                        }
                                    }
                                    if (invoke == null) {
                                        if (str != null) {
                                            StringBuilder sb2 = new StringBuilder();
                                            byte[] bArr10 = $$a;
                                            c13 = 'J';
                                            c14 = 25;
                                            sb2.append($$c(bArr10[69], (short) 588, bArr10[z12 ? 1 : 0]));
                                            sb2.append(str);
                                            try {
                                                invoke = Class.forName($$c(bArr10[74], (short) 857, bArr10[25])).getDeclaredConstructor(String.class).newInstance(sb2.toString());
                                                if (invoke3 != null) {
                                                    i12 = 528;
                                                } else {
                                                    byte[] bArr11 = $$a;
                                                    byte b14 = bArr11[c14];
                                                    try {
                                                        i12 = 528;
                                                        try {
                                                            invoke3 = Class.forName($$c(bArr11[c13], (short) 857, bArr11[c14])).getDeclaredConstructor(String.class).newInstance(Class.forName($$c(bArr11[14], (short) (-bArr11[528]), bArr11[c14])).getMethod($$c(bArr11[69], (short) 727, bArr11[89]), String.class).invoke(null, $$c(b14, (short) 714, b14)));
                                                        } catch (Throwable th2) {
                                                            Throwable cause3 = th2.getCause();
                                                            if (cause3 == null) {
                                                                throw th2;
                                                            }
                                                            throw cause3;
                                                        }
                                                    } catch (Throwable th3) {
                                                        Throwable cause4 = th3.getCause();
                                                        if (cause4 == null) {
                                                            throw th3;
                                                        }
                                                        throw cause4;
                                                    }
                                                }
                                                if (invoke2 == null) {
                                                    $10 = ($11 + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                    if (invoke != null) {
                                                        byte[] bArr12 = $$a;
                                                        try {
                                                            Object[] objArr7 = new Object[2];
                                                            objArr7[z11 ? 1 : 0] = $$c(bArr12[151], (short) 306, bArr12[70]);
                                                            objArr7[z12 ? 1 : 0] = invoke;
                                                            short s14 = (short) 857;
                                                            invoke2 = Class.forName($$c(bArr12[c13], s14, bArr12[c14])).getDeclaredConstructor(Class.forName($$c(bArr12[c13], s14, bArr12[c14])), String.class).newInstance(objArr7);
                                                        } catch (Throwable th4) {
                                                            Throwable cause5 = th4.getCause();
                                                            if (cause5 == null) {
                                                                throw th4;
                                                            }
                                                            throw cause5;
                                                        }
                                                    }
                                                }
                                                byte[] bArr8222 = $$a;
                                                short s13222 = (short) 857;
                                                Object[] objArr6222 = (Object[]) Array.newInstance(Class.forName($$c(bArr8222[c13], s13222, bArr8222[c14])), 7);
                                                objArr6222[z12 ? 1 : 0] = null;
                                                objArr6222[z11 ? 1 : 0] = invoke2;
                                                objArr6222[2] = invoke;
                                                objArr6222[3] = invoke3;
                                                objArr6222[c11] = invoke2;
                                                objArr6222[5] = invoke;
                                                objArr6222[6] = invoke3;
                                                boolean[] zArr8222 = {false, true, true, true, true, true, true};
                                                boolean[] zArr9222 = {false, false, false, false, true, true, true};
                                                boolean[] zArr10222 = new boolean[7];
                                                zArr10222[z12 ? 1 : 0] = z12;
                                                zArr10222[z11 ? 1 : 0] = z12;
                                                zArr10222[2] = z11;
                                                zArr10222[3] = z11;
                                                zArr10222[c11] = z12;
                                                zArr10222[5] = z11;
                                                zArr10222[6] = z11;
                                                char c19222 = 6;
                                                Class<?> cls5222 = Class.forName($$c(bArr8222[30], (short) 149, bArr8222[c12]));
                                                byte b13222 = bArr8222[95];
                                                int i26222 = cls5222.getDeclaredField($$c(b13222, (short) (b13222 | 617), bArr8222[97])).getInt(cls5222);
                                                boolean z29 = i26222 >= 34 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                                zArr10222[z12 ? 1 : 0] = (i26222 != 29 && i26222 >= 26) ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                                zArr10222[z11 ? 1 : 0] = i26222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                                zArr10222[c11] = i26222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                                i13 = z12 ? 1 : 0;
                                                int i27222 = i13;
                                                boolean z27222 = z29;
                                                int i28222 = c11;
                                                boolean z28222 = z12;
                                                loop0: while (i13 == 0) {
                                                    int i29 = $11;
                                                    int i31 = ((i29 | 55) << 1) - (i29 ^ 55);
                                                    int i32 = i24;
                                                    int i33 = i31 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                    $10 = i33;
                                                    if (i31 % 2 != 0) {
                                                        if (i27222 >= i23) {
                                                            return;
                                                        }
                                                    } else if (i27222 >= 9) {
                                                        return;
                                                    }
                                                    if (zArr10222[i27222]) {
                                                        int i34 = i33 + 19;
                                                        int i35 = i34 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                        $11 = i35;
                                                        if (i34 % 2 == 0) {
                                                            int i36 = i27222;
                                                            boolean z31 = zArr8222[i36];
                                                            Object obj11 = objArr6222[i36];
                                                            boolean z32 = zArr9222[i36];
                                                            throw null;
                                                        }
                                                        try {
                                                            z21 = zArr8222[i27222];
                                                            c15 = 642;
                                                            try {
                                                                Object obj12 = objArr6222[i27222];
                                                                boolean z33 = zArr9222[i27222];
                                                                if (z21) {
                                                                    try {
                                                                        if (obj12 != null) {
                                                                            $10 = (i35 + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                            try {
                                                                                byte[] bArr13 = $$a;
                                                                                c16 = '.';
                                                                                boolean z34 = z27222;
                                                                                try {
                                                                                    i14 = i13;
                                                                                    try {
                                                                                        z24 = z34;
                                                                                        z15 = z34;
                                                                                    } catch (Throwable th5) {
                                                                                        th = th5;
                                                                                        cause = th.getCause();
                                                                                        if (cause != null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause;
                                                                                    }
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    cause = th.getCause();
                                                                                    if (cause != null) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                            }
                                                                        } else {
                                                                            z15 = z27222;
                                                                            i14 = i13;
                                                                            c16 = '.';
                                                                        }
                                                                        StringBuilder sb3 = new StringBuilder();
                                                                        byte[] bArr14 = $$a;
                                                                        sb3.append($$c(bArr14[c16], (short) 385, (byte) (-bArr14[i12])));
                                                                        sb3.append(obj12);
                                                                        byte b15 = bArr14[c19222];
                                                                        sb3.append($$c(b15, (short) ((b15 ^ 286) | (b15 & 286)), bArr14[385]));
                                                                        String sb4 = sb3.toString();
                                                                        int i37 = $10;
                                                                        $11 = ((i37 ^ 19) + ((i37 & 19) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                        try {
                                                                            throw ((Throwable) Class.forName($$c(bArr14[642], (short) 812, bArr14[c14])).getDeclaredConstructor(String.class).newInstance(sb4));
                                                                        } catch (Throwable th8) {
                                                                            Throwable cause6 = th8.getCause();
                                                                            if (cause6 == null) {
                                                                                throw th8;
                                                                            }
                                                                            throw cause6;
                                                                        }
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        zArr = zArr8222;
                                                                        z23 = z15;
                                                                        str2 = $$c;
                                                                        z22 = z23;
                                                                        i15 = i27222;
                                                                        zArr2 = zArr9222;
                                                                        objArr3 = objArr6222;
                                                                        zArr6 = zArr10222;
                                                                        z17 = z22;
                                                                        i18 = i15 + 1;
                                                                        i17 = 7;
                                                                        while (true) {
                                                                            if (i18 >= 7) {
                                                                            }
                                                                            int i38 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                            i18 = (i38 ^ (-110)) + ((i38 & (-110)) << 1);
                                                                        }
                                                                        if (z18 != z19) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    z24 = z27222;
                                                                    i14 = i13;
                                                                    c16 = '.';
                                                                }
                                                                if (z21) {
                                                                    try {
                                                                        Random random = new Random();
                                                                        try {
                                                                            zArr = zArr8222;
                                                                            try {
                                                                                try {
                                                                                    random.setSeed(((Long) Class.forName($$c(r1[14], (short) (-$$a[i12]), r1[c14])).getMethod($$c(r1[89], (short) 910, r1[70]), null).invoke(null, null)).longValue() ^ (-1560264313));
                                                                                    Object obj13 = null;
                                                                                    Object obj14 = null;
                                                                                    Object obj15 = null;
                                                                                    obj3 = null;
                                                                                    while (obj13 == null) {
                                                                                        int i39 = $11;
                                                                                        Object obj16 = obj13;
                                                                                        $10 = (((i39 | 119) << 1) - (i39 ^ 119)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                        if (obj14 == null) {
                                                                                            obj7 = obj14;
                                                                                            c17 = c19222;
                                                                                        } else if (obj15 == null) {
                                                                                            obj7 = obj14;
                                                                                            c17 = 5;
                                                                                        } else if (obj3 == null) {
                                                                                            obj7 = obj14;
                                                                                            c17 = i28222;
                                                                                        } else {
                                                                                            obj7 = obj14;
                                                                                            c17 = 3;
                                                                                        }
                                                                                        Object obj17 = obj15;
                                                                                        StringBuilder sb5 = new StringBuilder((c17 == true ? 1 : 0) + 1);
                                                                                        sb5.append(c16);
                                                                                        int i41 = z28222 ? 1 : 0;
                                                                                        ?? r12 = c17;
                                                                                        while (i41 < r12) {
                                                                                            int i42 = $10;
                                                                                            i15 = (i42 | 111) << 1;
                                                                                            zArr2 = r12;
                                                                                            $11 = (i15 - (i42 ^ 111)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                            if (z33) {
                                                                                                try {
                                                                                                    i15 = random.nextInt(26);
                                                                                                    i19 = i41;
                                                                                                    sb5.append((char) ((random.nextBoolean() ^ true) != z11 ? i15 + 65 : (i15 & 96) + (i15 | 96)));
                                                                                                } catch (Throwable th10) {
                                                                                                    th = th10;
                                                                                                    z23 = z24;
                                                                                                    str2 = $$c;
                                                                                                    z22 = z23;
                                                                                                    i15 = i27222;
                                                                                                    zArr2 = zArr9222;
                                                                                                    objArr3 = objArr6222;
                                                                                                    zArr6 = zArr10222;
                                                                                                    z17 = z22;
                                                                                                    i18 = i15 + 1;
                                                                                                    i17 = 7;
                                                                                                    while (true) {
                                                                                                        if (i18 >= 7) {
                                                                                                        }
                                                                                                        int i382 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                                        i18 = (i382 ^ (-110)) + ((i382 & (-110)) << 1);
                                                                                                    }
                                                                                                    if (z18 != z19) {
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                i19 = i41;
                                                                                                int i43 = -(-random.nextInt(12));
                                                                                                sb5.append((char) (((i43 | 8192) << 1) - (i43 ^ 8192)));
                                                                                            }
                                                                                            int i44 = (i19 ^ 67) + ((i19 & 67) << 1);
                                                                                            i41 = (i44 ^ (-66)) + ((i44 & (-66)) << 1);
                                                                                            r12 = zArr2;
                                                                                            z11 = true;
                                                                                        }
                                                                                        String sb6 = sb5.toString();
                                                                                        if (obj7 == null) {
                                                                                            int i45 = $10;
                                                                                            $11 = ((i45 ^ 57) + ((i45 & 57) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                            try {
                                                                                                Object[] objArr8 = new Object[i32];
                                                                                                objArr8[1] = sb6;
                                                                                                objArr8[z28222 ? 1 : 0] = obj12;
                                                                                                byte[] bArr15 = $$a;
                                                                                                str2 = $$c;
                                                                                                try {
                                                                                                    obj14 = Class.forName($$c(bArr15[c13], s13222, bArr15[c14])).getDeclaredConstructor(Class.forName($$c(bArr15[c13], s13222, bArr15[c14])), String.class).newInstance(objArr8);
                                                                                                    i15 = i27222;
                                                                                                    zArr2 = zArr9222;
                                                                                                    obj15 = obj17;
                                                                                                    obj13 = obj16;
                                                                                                } catch (Throwable th11) {
                                                                                                    th = th11;
                                                                                                    try {
                                                                                                        Throwable cause7 = th.getCause();
                                                                                                        if (cause7 == null) {
                                                                                                            throw th;
                                                                                                        }
                                                                                                        throw cause7;
                                                                                                    } catch (Throwable th12) {
                                                                                                        th = th12;
                                                                                                        z22 = z24;
                                                                                                        i15 = i27222;
                                                                                                        zArr2 = zArr9222;
                                                                                                        objArr3 = objArr6222;
                                                                                                        zArr6 = zArr10222;
                                                                                                        z17 = z22;
                                                                                                        i18 = i15 + 1;
                                                                                                        i17 = 7;
                                                                                                        while (true) {
                                                                                                            if (i18 >= 7) {
                                                                                                            }
                                                                                                            int i3822 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                                            i18 = (i3822 ^ (-110)) + ((i3822 & (-110)) << 1);
                                                                                                        }
                                                                                                        if (z18 != z19) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th13) {
                                                                                                th = th13;
                                                                                                str2 = $$c;
                                                                                            }
                                                                                        } else {
                                                                                            str2 = $$c;
                                                                                            if (obj17 == null) {
                                                                                                int i46 = $11;
                                                                                                $10 = ((i46 ^ 21) + ((i46 & 21) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                try {
                                                                                                    try {
                                                                                                        Object[] objArr9 = new Object[2];
                                                                                                        objArr9[1] = sb6;
                                                                                                        objArr9[z28222 ? 1 : 0] = obj12;
                                                                                                        byte[] bArr16 = $$a;
                                                                                                        obj15 = Class.forName($$c(bArr16[c13], s13222, bArr16[c14])).getDeclaredConstructor(Class.forName($$c(bArr16[c13], s13222, bArr16[c14])), String.class).newInstance(objArr9);
                                                                                                        i15 = i27222;
                                                                                                        zArr2 = zArr9222;
                                                                                                        obj14 = obj7;
                                                                                                        obj13 = obj16;
                                                                                                    } catch (Throwable th14) {
                                                                                                        Throwable cause8 = th14.getCause();
                                                                                                        if (cause8 == null) {
                                                                                                            throw th14;
                                                                                                        }
                                                                                                        throw cause8;
                                                                                                    }
                                                                                                } catch (Throwable th15) {
                                                                                                    th = th15;
                                                                                                    i15 = i27222;
                                                                                                    zArr2 = zArr9222;
                                                                                                    objArr4 = objArr6222;
                                                                                                    zArr7 = zArr10222;
                                                                                                    objArr3 = objArr4;
                                                                                                    z17 = z24;
                                                                                                    zArr6 = zArr7;
                                                                                                    i18 = i15 + 1;
                                                                                                    i17 = 7;
                                                                                                    while (true) {
                                                                                                        if (i18 >= 7) {
                                                                                                        }
                                                                                                        int i38222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                                        i18 = (i38222 ^ (-110)) + ((i38222 & (-110)) << 1);
                                                                                                    }
                                                                                                    if (z18 != z19) {
                                                                                                    }
                                                                                                }
                                                                                            } else if (obj3 == null) {
                                                                                                try {
                                                                                                    Object[] objArr10 = new Object[2];
                                                                                                    objArr10[1] = sb6;
                                                                                                    objArr10[z28222 ? 1 : 0] = obj12;
                                                                                                    byte[] bArr17 = $$a;
                                                                                                    obj3 = Class.forName($$c(bArr17[c13], s13222, bArr17[c14])).getDeclaredConstructor(Class.forName($$c(bArr17[c13], s13222, bArr17[c14])), String.class).newInstance(objArr10);
                                                                                                    i15 = i27222;
                                                                                                    zArr2 = zArr9222;
                                                                                                    obj14 = obj7;
                                                                                                    obj15 = obj17;
                                                                                                    obj13 = obj16;
                                                                                                } catch (Throwable th16) {
                                                                                                    Throwable cause9 = th16.getCause();
                                                                                                    if (cause9 == null) {
                                                                                                        throw th16;
                                                                                                    }
                                                                                                    throw cause9;
                                                                                                }
                                                                                            } else {
                                                                                                try {
                                                                                                    Object[] objArr11 = new Object[2];
                                                                                                    objArr11[1] = sb6;
                                                                                                    objArr11[z28222 ? 1 : 0] = obj12;
                                                                                                    byte[] bArr18 = $$a;
                                                                                                    obj13 = Class.forName($$c(bArr18[c13], s13222, bArr18[c14])).getDeclaredConstructor(Class.forName($$c(bArr18[c13], s13222, bArr18[c14])), String.class).newInstance(objArr11);
                                                                                                    int i47 = $11;
                                                                                                    $10 = (((i47 | 51) << 1) - (i47 ^ 51)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                    try {
                                                                                                        try {
                                                                                                            short s15 = (short) 782;
                                                                                                            i15 = i27222;
                                                                                                            try {
                                                                                                                zArr2 = zArr9222;
                                                                                                                try {
                                                                                                                    Object newInstance3 = Class.forName($$c(bArr18[30], s15, bArr18[c14])).getDeclaredConstructor(Class.forName($$c(bArr18[c13], s13222, bArr18[c14]))).newInstance(obj13);
                                                                                                                    try {
                                                                                                                        Class<?> cls7 = Class.forName($$c(bArr18[30], s15, bArr18[c14]));
                                                                                                                        byte b16 = bArr18[46];
                                                                                                                        cls7.getMethod($$c(b16, (short) (b16 | 649), bArr18[70]), null).invoke(newInstance3, null);
                                                                                                                        obj14 = obj7;
                                                                                                                        obj15 = obj17;
                                                                                                                    } catch (Throwable th17) {
                                                                                                                        Throwable cause10 = th17.getCause();
                                                                                                                        if (cause10 == null) {
                                                                                                                            throw th17;
                                                                                                                        }
                                                                                                                        throw cause10;
                                                                                                                    }
                                                                                                                } catch (Throwable th18) {
                                                                                                                    th = th18;
                                                                                                                    cause2 = th.getCause();
                                                                                                                    if (cause2 != null) {
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                    throw cause2;
                                                                                                                }
                                                                                                            } catch (Throwable th19) {
                                                                                                                th = th19;
                                                                                                                cause2 = th.getCause();
                                                                                                                if (cause2 != null) {
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Exception e11) {
                                                                                                            try {
                                                                                                                StringBuilder sb7 = new StringBuilder();
                                                                                                                byte[] bArr19 = $$a;
                                                                                                                byte b17 = bArr19[46];
                                                                                                                sb7.append($$c(b17, (short) ((b17 ^ 880) | (b17 & 880)), (byte) (-bArr19[i12])));
                                                                                                                sb7.append(obj13);
                                                                                                                byte b18 = bArr19[c19222];
                                                                                                                sb7.append($$c(b18, (short) ((b18 ^ 286) | (b18 & 286)), bArr19[385]));
                                                                                                                String sb8 = sb7.toString();
                                                                                                                try {
                                                                                                                    Object[] objArr12 = new Object[2];
                                                                                                                    objArr12[1] = e11;
                                                                                                                    objArr12[z28222 ? 1 : 0] = sb8;
                                                                                                                    throw ((Throwable) Class.forName($$c(bArr19[642], (short) 812, bArr19[c14])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr12));
                                                                                                                } catch (Throwable th20) {
                                                                                                                    Throwable cause11 = th20.getCause();
                                                                                                                    if (cause11 == null) {
                                                                                                                        throw th20;
                                                                                                                    }
                                                                                                                    throw cause11;
                                                                                                                }
                                                                                                            } catch (Throwable th21) {
                                                                                                                th = th21;
                                                                                                                objArr4 = objArr6222;
                                                                                                                zArr7 = zArr10222;
                                                                                                                objArr3 = objArr4;
                                                                                                                z17 = z24;
                                                                                                                zArr6 = zArr7;
                                                                                                                i18 = i15 + 1;
                                                                                                                i17 = 7;
                                                                                                                while (true) {
                                                                                                                    if (i18 >= 7) {
                                                                                                                    }
                                                                                                                    int i382222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                                                    i18 = (i382222 ^ (-110)) + ((i382222 & (-110)) << 1);
                                                                                                                }
                                                                                                                if (z18 != z19) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th22) {
                                                                                                        th = th22;
                                                                                                    }
                                                                                                } catch (Throwable th23) {
                                                                                                    Throwable cause12 = th23.getCause();
                                                                                                    if (cause12 == null) {
                                                                                                        throw th23;
                                                                                                    }
                                                                                                    throw cause12;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        $$c = str2;
                                                                                        i27222 = i15;
                                                                                        zArr9222 = zArr2;
                                                                                        z11 = true;
                                                                                        i32 = 2;
                                                                                        c16 = '.';
                                                                                    }
                                                                                    obj4 = obj13;
                                                                                    obj5 = obj14;
                                                                                    obj6 = obj15;
                                                                                } catch (Throwable th24) {
                                                                                    th = th24;
                                                                                    str2 = $$c;
                                                                                    i15 = i27222;
                                                                                    zArr2 = zArr9222;
                                                                                    objArr4 = objArr6222;
                                                                                    zArr7 = zArr10222;
                                                                                    objArr3 = objArr4;
                                                                                    z17 = z24;
                                                                                    zArr6 = zArr7;
                                                                                    i18 = i15 + 1;
                                                                                    i17 = 7;
                                                                                    while (true) {
                                                                                        if (i18 >= 7) {
                                                                                        }
                                                                                        int i3822222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                        i18 = (i3822222 ^ (-110)) + ((i3822222 & (-110)) << 1);
                                                                                    }
                                                                                    if (z18 != z19) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th25) {
                                                                                th = th25;
                                                                                Throwable cause13 = th.getCause();
                                                                                if (cause13 == null) {
                                                                                    throw th;
                                                                                }
                                                                                throw cause13;
                                                                            }
                                                                        } catch (Throwable th26) {
                                                                            th = th26;
                                                                        }
                                                                    } catch (Throwable th27) {
                                                                        th = th27;
                                                                        zArr = zArr8222;
                                                                    }
                                                                } else {
                                                                    zArr = zArr8222;
                                                                    obj3 = null;
                                                                    obj5 = null;
                                                                    obj6 = null;
                                                                    obj4 = null;
                                                                }
                                                                str2 = $$c;
                                                                i15 = i27222;
                                                                zArr2 = zArr9222;
                                                                try {
                                                                    bArr2 = new byte[7292];
                                                                    bArr3 = $$a;
                                                                    try {
                                                                        s11 = (short) 480;
                                                                        newInstance = Class.forName($$c(bArr3[c12], s11, bArr3[c14])).getDeclaredConstructor(Class.forName($$c(bArr3[642], (short) 1003, bArr3[c14]))).newInstance(AFc1iSDK.class.getResourceAsStream($$c(bArr3[786], (short) 689, bArr3[z28222 ? 1 : 0])));
                                                                        try {
                                                                            Class<?> cls8 = Class.forName($$c(bArr3[c12], s11, bArr3[c14]));
                                                                            byte b19 = bArr3[13];
                                                                            cls8.getMethod($$c(b19, (short) ((b19 & 226) | (b19 ^ 226)), bArr3[11]), byte[].class).invoke(newInstance, bArr2);
                                                                        } catch (Throwable th28) {
                                                                            Throwable cause14 = th28.getCause();
                                                                            if (cause14 == null) {
                                                                                throw th28;
                                                                            }
                                                                            throw cause14;
                                                                        }
                                                                    } catch (Throwable th29) {
                                                                        Throwable cause15 = th29.getCause();
                                                                        if (cause15 == null) {
                                                                            throw th29;
                                                                        }
                                                                        throw cause15;
                                                                    }
                                                                } catch (Throwable th30) {
                                                                    th = th30;
                                                                    i28222 = objArr6222;
                                                                    zArr4 = zArr10222;
                                                                }
                                                            } catch (Throwable th31) {
                                                                th = th31;
                                                                z16 = z27222;
                                                                i14 = i13;
                                                                zArr = zArr8222;
                                                                str2 = $$c;
                                                                i15 = i27222;
                                                                zArr2 = zArr9222;
                                                                objArr2 = objArr6222;
                                                                zArr5 = zArr10222;
                                                            }
                                                        } catch (Throwable th32) {
                                                            th = th32;
                                                            z16 = z27222;
                                                            i14 = i13;
                                                            zArr = zArr8222;
                                                            str2 = $$c;
                                                            i15 = i27222;
                                                            zArr2 = zArr9222;
                                                            objArr2 = objArr6222;
                                                            zArr5 = zArr10222;
                                                            c15 = 642;
                                                        }
                                                        try {
                                                            Class<?> cls9 = Class.forName($$c(bArr3[c12], s11, bArr3[c14]));
                                                            byte b21 = bArr3[46];
                                                            cls9.getMethod($$c(b21, (short) (b21 | 649), bArr3[70]), null).invoke(newInstance, null);
                                                            int i48 = 20;
                                                            int i49 = 7255;
                                                            String str4 = str2;
                                                            Class cls10 = null;
                                                            i28222 = i28222;
                                                            ?? r29 = z28222;
                                                            zArr4 = zArr4;
                                                            while (true) {
                                                                bArr2[i48 + 53] = (byte) (bArr2[i48 + 7271] - 48);
                                                                int length2 = bArr2.length;
                                                                int i51 = -i48;
                                                                int i52 = (length2 ^ i51) + ((length2 & i51) << 1);
                                                                try {
                                                                    Object[] objArr13 = new Object[3];
                                                                    objArr13[2] = Integer.valueOf(i52);
                                                                    objArr13[1] = Integer.valueOf(i48);
                                                                    objArr13[r29] = bArr2;
                                                                    byte[] bArr20 = $$a;
                                                                    byte b22 = bArr20[526];
                                                                    int i53 = i48;
                                                                    Class<?> cls11 = Class.forName($$c((byte) ((b22 ^ (-1)) + (b22 << 1)), (short) 172, bArr20[c14]));
                                                                    Class cls12 = Integer.TYPE;
                                                                    ?? r54 = (InputStream) cls11.getDeclaredConstructor(byte[].class, cls12, cls12).newInstance(objArr13);
                                                                    Object obj18 = afErrorLogForExcManagerOnly;
                                                                    if (obj18 == null) {
                                                                        try {
                                                                            byte b23 = bArr20[9];
                                                                            byte b24 = bArr20[693];
                                                                            Class<?> cls13 = Class.forName($$c(b23, (short) ((b24 ^ 1) + ((b24 & 1) << 1)), bArr20[c12]));
                                                                            byte b25 = bArr20[89];
                                                                            i21 = i49;
                                                                            int i54 = -(((Long) cls13.getMethod($$c(b25, (short) 556, b25), null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls13.getMethod($$c(b25, (short) 556, b25), null).invoke(null, null)).longValue() == 0L ? 0 : -1));
                                                                            int i55 = (i54 & (-12195790)) + (i54 | (-12195790));
                                                                            short s16 = (short) (9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                                            try {
                                                                                Object[] objArr14 = new Object[3];
                                                                                objArr14[2] = Float.valueOf(0.0f);
                                                                                objArr14[1] = Float.valueOf(0.0f);
                                                                                objArr14[r29] = Integer.valueOf((int) r29);
                                                                                byte b26 = bArr20[c12];
                                                                                ?? r57 = s16;
                                                                                Class<?> cls14 = Class.forName($$c(b26, (short) 888, b26));
                                                                                z25 = z21;
                                                                                String $$c2 = $$c(bArr20[89], (short) ($$b << 2), bArr20[70]);
                                                                                Class cls15 = Float.TYPE;
                                                                                obj8 = obj3;
                                                                                i28222 = objArr6222;
                                                                                inputStream = new AFj1rSDK(r54, AppsFlyer2dXConversionCallback, 2059891480 - (~(-(((Float) cls14.getMethod($$c2, cls12, cls15, cls15).invoke(null, objArr14)).floatValue() > 0.0f ? 1 : (((Float) cls14.getMethod($$c2, cls12, cls15, cls15).invoke(null, objArr14)).floatValue() == 0.0f ? 0 : -1)))), r57, onAppOpenAttributionNative, i55);
                                                                                zArr4 = r57;
                                                                            } catch (Throwable th33) {
                                                                                Throwable cause16 = th33.getCause();
                                                                                if (cause16 == null) {
                                                                                    throw th33;
                                                                                }
                                                                                throw cause16;
                                                                            }
                                                                        } catch (Throwable th34) {
                                                                            Throwable cause17 = th34.getCause();
                                                                            if (cause17 == null) {
                                                                                throw th34;
                                                                            }
                                                                            throw cause17;
                                                                        }
                                                                    } else {
                                                                        i21 = i49;
                                                                        z25 = z21;
                                                                        int i56 = 1979587286 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16)));
                                                                        try {
                                                                            objArr5 = new Object[]{Integer.valueOf((int) r29)};
                                                                            b11 = bArr20[70];
                                                                        } catch (Throwable th35) {
                                                                            th = th35;
                                                                        }
                                                                        try {
                                                                            obj8 = obj3;
                                                                            int i57 = -((Integer) Class.forName($$c(b11, (short) ((b11 & 488) | (b11 ^ 488)), bArr20[c12])).getMethod($$c(bArr20[9], (short) 242, bArr20[151]), cls12).invoke(null, objArr5)).intValue();
                                                                            short s17 = (short) ((i57 & 8) + (i57 | 8));
                                                                            int i58 = r29;
                                                                            try {
                                                                                ?? r11 = new Object[i28222];
                                                                                r11[3] = Integer.valueOf((-419836431) - (~Color.rgb(i58, i58, i58)));
                                                                                r11[2] = Short.valueOf(s17);
                                                                                r11[1] = Integer.valueOf(i56);
                                                                                r11[0] = r54;
                                                                                byte b27 = bArr20[281];
                                                                                i28222 = objArr6222;
                                                                                try {
                                                                                    inputStream = (InputStream) Class.forName($$c(b27, (short) ((b27 ^ 85) | (b27 & 85)), bArr20[70]), true, (ClassLoader) getLevel).getMethod($$c(bArr20[95], (short) 776, bArr20[40]), Class.forName($$c(bArr20[642], (short) 1003, bArr20[c14])), cls12, Short.TYPE, cls12).invoke(obj18, r11);
                                                                                    zArr4 = zArr4;
                                                                                } catch (Throwable th36) {
                                                                                    th = th36;
                                                                                    Throwable cause18 = th.getCause();
                                                                                    if (cause18 == null) {
                                                                                        throw th;
                                                                                    }
                                                                                    throw cause18;
                                                                                }
                                                                            } catch (Throwable th37) {
                                                                                th = th37;
                                                                            }
                                                                        } catch (Throwable th38) {
                                                                            th = th38;
                                                                            Throwable cause19 = th.getCause();
                                                                            if (cause19 == null) {
                                                                                throw th;
                                                                            }
                                                                            throw cause19;
                                                                        }
                                                                    }
                                                                    try {
                                                                        short s18 = (short) 1003;
                                                                        ((Long) Class.forName($$c(bArr20[642], s18, bArr20[c14])).getMethod($$c(bArr20[67], (short) 572, bArr20[46]), Long.TYPE).invoke(inputStream, Long.valueOf(16))).getClass();
                                                                        if (z25) {
                                                                            $11 = ($10 + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                            try {
                                                                                Object obj19 = afErrorLogForExcManagerOnly;
                                                                                Object obj20 = obj19 == null ? obj5 : obj6;
                                                                                Object obj21 = obj19 == null ? obj8 : obj4;
                                                                                try {
                                                                                    try {
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        c18 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        r54 = 253;
                                                                                        short s19 = (short) 782;
                                                                                        try {
                                                                                            zArr4 = zArr10222;
                                                                                            try {
                                                                                                Object newInstance4 = Class.forName($$c(bArr20[30], s19, bArr20[c14])).getDeclaredConstructor(Class.forName($$c(bArr20[c13], s13222, bArr20[c14]))).newInstance(obj20);
                                                                                                if (z24) {
                                                                                                    try {
                                                                                                        ((Boolean) Class.forName($$c(bArr20[c13], s13222, bArr20[c14])).getMethod($$c(bArr20[69], (short) 470, bArr20[46]), null).invoke(obj20, null)).getClass();
                                                                                                    } catch (Throwable th39) {
                                                                                                        Throwable cause20 = th39.getCause();
                                                                                                        if (cause20 == null) {
                                                                                                            throw th39;
                                                                                                        }
                                                                                                        throw cause20;
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    byte[] bArr21 = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                                                                                                    int i59 = i21;
                                                                                                    while (true) {
                                                                                                        if (i59 <= 0) {
                                                                                                            cls2 = cls10;
                                                                                                            str3 = str4;
                                                                                                            break;
                                                                                                        }
                                                                                                        byte[] bArr22 = bArr21;
                                                                                                        int i61 = i59;
                                                                                                        try {
                                                                                                            Object[] objArr15 = {bArr22, 0, Integer.valueOf(Math.min(UserVerificationMethods.USER_VERIFY_ALL, i59))};
                                                                                                            byte[] bArr23 = $$a;
                                                                                                            Class<?> cls16 = Class.forName($$c(bArr23[642], s18, bArr23[c14]));
                                                                                                            byte b28 = bArr23[67];
                                                                                                            cls2 = cls10;
                                                                                                            str3 = str4;
                                                                                                            String $$c3 = $$c(b28, (short) ((b28 ^ 280) | (b28 & 280)), bArr23[11]);
                                                                                                            Class cls17 = Integer.TYPE;
                                                                                                            Integer num = (Integer) cls16.getMethod($$c3, byte[].class, cls17, cls17).invoke(inputStream, objArr15);
                                                                                                            int intValue = num.intValue();
                                                                                                            if (intValue == i11) {
                                                                                                                break;
                                                                                                            }
                                                                                                            try {
                                                                                                                Object[] objArr16 = {bArr22, 0, num};
                                                                                                                Class<?> cls18 = Class.forName($$c(bArr23[30], s19, bArr23[c14]));
                                                                                                                byte b29 = bArr23[46];
                                                                                                                short s21 = s18;
                                                                                                                InputStream inputStream2 = inputStream;
                                                                                                                cls18.getMethod($$c(b29, (short) ((b29 ^ 265) | (b29 & 265)), bArr23[c19222]), byte[].class, cls17, cls17).invoke(newInstance4, objArr16);
                                                                                                                int i62 = -intValue;
                                                                                                                i59 = (i61 & i62) + (i61 | i62);
                                                                                                                bArr21 = bArr22;
                                                                                                                cls10 = cls2;
                                                                                                                str4 = str3;
                                                                                                                s18 = s21;
                                                                                                                inputStream = inputStream2;
                                                                                                                i11 = -1;
                                                                                                            } catch (Throwable th40) {
                                                                                                                Throwable cause21 = th40.getCause();
                                                                                                                if (cause21 == null) {
                                                                                                                    throw th40;
                                                                                                                }
                                                                                                                throw cause21;
                                                                                                            }
                                                                                                        } catch (Throwable th41) {
                                                                                                            Throwable cause22 = th41.getCause();
                                                                                                            if (cause22 == null) {
                                                                                                                throw th41;
                                                                                                            }
                                                                                                            throw cause22;
                                                                                                        }
                                                                                                    }
                                                                                                    short s22 = s18;
                                                                                                    try {
                                                                                                        byte[] bArr24 = $$a;
                                                                                                        try {
                                                                                                            Class.forName($$c(bArr24[83], (short) 926, bArr24[c14])).getMethod($$c(bArr24[67], (short) 360, bArr24[46]), null).invoke(Class.forName($$c(bArr24[30], s19, bArr24[c14])).getMethod($$c(bArr24[46], (short) 603, bArr24[89]), null).invoke(newInstance4, null), null);
                                                                                                            int i63 = $10;
                                                                                                            $11 = ((i63 & 41) + (i63 | 41)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                            try {
                                                                                                                Class<?> cls19 = Class.forName($$c(bArr24[30], s19, bArr24[c14]));
                                                                                                                byte b31 = bArr24[46];
                                                                                                                cls19.getMethod($$c(b31, (short) ((b31 ^ 649) | (b31 & 649)), bArr24[70]), null).invoke(newInstance4, null);
                                                                                                                byte b32 = bArr24[70];
                                                                                                                Class<?> cls20 = Class.forName($$c(b32, (short) ((b32 ^ 266) | (b32 & 266)), bArr24[253]));
                                                                                                                byte b33 = bArr24[95];
                                                                                                                Method declaredMethod = cls20.getDeclaredMethod($$c(b33, (short) ((b33 ^ 496) | (b33 & 496)), bArr24[c13]), String.class, String.class, Integer.TYPE);
                                                                                                                $10 = ($11 + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                try {
                                                                                                                    short s23 = (short) 737;
                                                                                                                    Object invoke5 = Class.forName($$c(bArr24[c13], s13222, bArr24[c14])).getMethod($$c(bArr24[5], s23, bArr24[89]), null).invoke(obj20, null);
                                                                                                                    int i64 = $10;
                                                                                                                    $11 = ((i64 & 85) + (i64 | 85)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                    try {
                                                                                                                        obj9 = declaredMethod.invoke(null, invoke5, Class.forName($$c(bArr24[c13], s13222, bArr24[c14])).getMethod($$c(bArr24[5], s23, bArr24[89]), null).invoke(obj21, null), 0);
                                                                                                                        try {
                                                                                                                            short s24 = (short) 598;
                                                                                                                            ((Boolean) Class.forName($$c(bArr24[c13], s13222, bArr24[c14])).getMethod($$c(bArr24[11], s24, bArr24[253]), null).invoke(obj20, null)).getClass();
                                                                                                                            $11 = ($10 + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                            try {
                                                                                                                                ((Boolean) Class.forName($$c(bArr24[c13], s13222, bArr24[c14])).getMethod($$c(bArr24[11], s24, bArr24[253]), null).invoke(obj21, null)).getClass();
                                                                                                                                $10 = ($11 + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                                try {
                                                                                                                                    if (getLevel == null) {
                                                                                                                                        try {
                                                                                                                                            byte b34 = bArr24[c14];
                                                                                                                                            getLevel = Class.class.getMethod($$c(b34, (short) (b34 | 562), bArr24[89]), null).invoke(AFc1iSDK.class, null);
                                                                                                                                        } catch (Throwable th42) {
                                                                                                                                            Throwable cause23 = th42.getCause();
                                                                                                                                            if (cause23 == null) {
                                                                                                                                                throw th42;
                                                                                                                                            }
                                                                                                                                            throw cause23;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    s12 = s22;
                                                                                                                                    zArr4 = zArr4;
                                                                                                                                } catch (Throwable th43) {
                                                                                                                                    th = th43;
                                                                                                                                    i11 = -1;
                                                                                                                                    objArr4 = i28222;
                                                                                                                                    zArr7 = zArr4;
                                                                                                                                    objArr3 = objArr4;
                                                                                                                                    z17 = z24;
                                                                                                                                    zArr6 = zArr7;
                                                                                                                                    i18 = i15 + 1;
                                                                                                                                    i17 = 7;
                                                                                                                                    while (true) {
                                                                                                                                        if (i18 >= 7) {
                                                                                                                                        }
                                                                                                                                        int i38222222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                                                                        i18 = (i38222222 ^ (-110)) + ((i38222222 & (-110)) << 1);
                                                                                                                                    }
                                                                                                                                    if (z18 != z19) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (Throwable th44) {
                                                                                                                                Throwable cause24 = th44.getCause();
                                                                                                                                if (cause24 == null) {
                                                                                                                                    throw th44;
                                                                                                                                }
                                                                                                                                throw cause24;
                                                                                                                            }
                                                                                                                        } catch (Throwable th45) {
                                                                                                                            Throwable cause25 = th45.getCause();
                                                                                                                            if (cause25 == null) {
                                                                                                                                throw th45;
                                                                                                                            }
                                                                                                                            throw cause25;
                                                                                                                        }
                                                                                                                    } catch (Throwable th46) {
                                                                                                                        Throwable cause26 = th46.getCause();
                                                                                                                        if (cause26 == null) {
                                                                                                                            throw th46;
                                                                                                                        }
                                                                                                                        throw cause26;
                                                                                                                    }
                                                                                                                } catch (Throwable th47) {
                                                                                                                    Throwable cause27 = th47.getCause();
                                                                                                                    if (cause27 == null) {
                                                                                                                        throw th47;
                                                                                                                    }
                                                                                                                    throw cause27;
                                                                                                                }
                                                                                                            } catch (Throwable th48) {
                                                                                                                Throwable cause28 = th48.getCause();
                                                                                                                if (cause28 == null) {
                                                                                                                    throw th48;
                                                                                                                }
                                                                                                                throw cause28;
                                                                                                            }
                                                                                                        } catch (Throwable th49) {
                                                                                                            Throwable cause29 = th49.getCause();
                                                                                                            if (cause29 == null) {
                                                                                                                throw th49;
                                                                                                            }
                                                                                                            throw cause29;
                                                                                                        }
                                                                                                    } catch (Throwable th50) {
                                                                                                        Throwable cause30 = th50.getCause();
                                                                                                        if (cause30 == null) {
                                                                                                            throw th50;
                                                                                                        }
                                                                                                        throw cause30;
                                                                                                    }
                                                                                                } catch (Throwable th51) {
                                                                                                    try {
                                                                                                        byte[] bArr25 = $$a;
                                                                                                        short s25 = (short) 598;
                                                                                                        ((Boolean) Class.forName($$c(bArr25[c13], s13222, bArr25[c14])).getMethod($$c(bArr25[11], s25, bArr25[r54]), null).invoke(obj20, null)).getClass();
                                                                                                        try {
                                                                                                            ((Boolean) Class.forName($$c(bArr25[c13], s13222, bArr25[c14])).getMethod($$c(bArr25[11], s25, bArr25[r54]), null).invoke(obj21, null)).getClass();
                                                                                                            throw th51;
                                                                                                        } catch (Throwable th52) {
                                                                                                            Throwable cause31 = th52.getCause();
                                                                                                            if (cause31 == null) {
                                                                                                                throw th52;
                                                                                                            }
                                                                                                            throw cause31;
                                                                                                        }
                                                                                                    } catch (Throwable th53) {
                                                                                                        Throwable cause32 = th53.getCause();
                                                                                                        if (cause32 == null) {
                                                                                                            throw th53;
                                                                                                        }
                                                                                                        throw cause32;
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th54) {
                                                                                                th = th54;
                                                                                                Throwable cause33 = th.getCause();
                                                                                                if (cause33 == null) {
                                                                                                    throw th;
                                                                                                }
                                                                                                throw cause33;
                                                                                            }
                                                                                        } catch (Throwable th55) {
                                                                                            th = th55;
                                                                                        }
                                                                                    } catch (Exception e12) {
                                                                                        StringBuilder sb9 = new StringBuilder();
                                                                                        byte[] bArr26 = $$a;
                                                                                        byte b35 = bArr26[46];
                                                                                        sb9.append($$c(b35, (short) ((b35 ^ 385) | (b35 & 385)), (byte) (-bArr26[i12])));
                                                                                        sb9.append(obj20);
                                                                                        byte b36 = bArr26[c19222];
                                                                                        sb9.append($$c(b36, (short) ((b36 ^ 286) | (b36 & 286)), bArr26[385]));
                                                                                        try {
                                                                                            throw ((Throwable) Class.forName($$c(bArr26[642], (short) 812, bArr26[c14])).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb9.toString(), e12));
                                                                                        } catch (Throwable th56) {
                                                                                            Throwable cause34 = th56.getCause();
                                                                                            if (cause34 == null) {
                                                                                                throw th56;
                                                                                            }
                                                                                            throw cause34;
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th57) {
                                                                                    th = th57;
                                                                                }
                                                                            } catch (Throwable th58) {
                                                                                th = th58;
                                                                                zArr4 = zArr10222;
                                                                                i11 = -1;
                                                                                objArr4 = i28222;
                                                                                zArr7 = zArr4;
                                                                                objArr3 = objArr4;
                                                                                z17 = z24;
                                                                                zArr6 = zArr7;
                                                                                i18 = i15 + 1;
                                                                                i17 = 7;
                                                                                while (true) {
                                                                                    if (i18 >= 7) {
                                                                                    }
                                                                                    int i382222222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                    i18 = (i382222222 ^ (-110)) + ((i382222222 & (-110)) << 1);
                                                                                }
                                                                                if (z18 != z19) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cls2 = cls10;
                                                                            str3 = str4;
                                                                            zArr4 = zArr10222;
                                                                            c18 = 253;
                                                                            try {
                                                                                ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                                                                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                                                try {
                                                                                    s12 = s18;
                                                                                    Object newInstance5 = Class.forName($$c(bArr20[192], bArr20[304], bArr20[c14])).getDeclaredConstructor(Class.forName($$c(bArr20[642], s12, bArr20[c14]))).newInstance(zipInputStream);
                                                                                    try {
                                                                                        short s26 = (short) i12;
                                                                                        Object newInstance6 = Class.forName($$c(bArr20[526], s26, bArr20[c14])).getDeclaredConstructor(null).newInstance(null);
                                                                                        byte[] bArr27 = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                                                                                        int i65 = 0;
                                                                                        while (true) {
                                                                                            try {
                                                                                                bArr4 = $$a;
                                                                                                Class<?> cls21 = Class.forName($$c(bArr4[192], bArr4[304], bArr4[c14]));
                                                                                                byte b37 = bArr4[67];
                                                                                                ZipEntry zipEntry = nextEntry;
                                                                                                Integer num2 = (Integer) cls21.getMethod($$c(b37, (short) ((b37 & 280) | (b37 ^ 280)), bArr4[11]), byte[].class).invoke(newInstance5, bArr27);
                                                                                                int intValue2 = num2.intValue();
                                                                                                if (intValue2 <= 0 || i65 >= zipEntry.getSize()) {
                                                                                                    break;
                                                                                                }
                                                                                                try {
                                                                                                    Object[] objArr17 = {bArr27, 0, num2};
                                                                                                    Class<?> cls22 = Class.forName($$c(bArr4[526], s26, bArr4[c14]));
                                                                                                    byte b38 = bArr4[46];
                                                                                                    int i66 = i65;
                                                                                                    String $$c4 = $$c(b38, (short) ((b38 & 265) | (b38 ^ 265)), bArr4[c19222]);
                                                                                                    Class cls23 = Integer.TYPE;
                                                                                                    cls22.getMethod($$c4, byte[].class, cls23, cls23).invoke(newInstance6, objArr17);
                                                                                                    i65 = (i66 - (~(-(-intValue2)))) - 1;
                                                                                                    nextEntry = zipEntry;
                                                                                                } catch (Throwable th59) {
                                                                                                    Throwable cause35 = th59.getCause();
                                                                                                    if (cause35 == null) {
                                                                                                        throw th59;
                                                                                                    }
                                                                                                    throw cause35;
                                                                                                }
                                                                                            } catch (Throwable th60) {
                                                                                                Throwable cause36 = th60.getCause();
                                                                                                if (cause36 == null) {
                                                                                                    throw th60;
                                                                                                }
                                                                                                throw cause36;
                                                                                            }
                                                                                        }
                                                                                        int i67 = $10;
                                                                                        $11 = (((i67 | 87) << 1) - (i67 ^ 87)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                        try {
                                                                                            Object invoke6 = Class.forName($$c(bArr4[526], s26, bArr4[c14])).getMethod($$c(bArr4[69], (short) 947, bArr4[67]), null).invoke(newInstance6, null);
                                                                                            try {
                                                                                                Class<?> cls24 = Class.forName($$c(bArr4[192], bArr4[304], bArr4[c14]));
                                                                                                byte b39 = bArr4[46];
                                                                                                cls24.getMethod($$c(b39, (short) ((b39 ^ 649) | (b39 & 649)), bArr4[70]), null).invoke(newInstance5, null);
                                                                                                try {
                                                                                                    byte[] bArr28 = $$a;
                                                                                                    Class<?> cls25 = Class.forName($$c(bArr28[526], s26, bArr28[c14]));
                                                                                                    byte b41 = bArr28[46];
                                                                                                    cls25.getMethod($$c(b41, (short) ((b41 ^ 649) | (b41 & 649)), bArr28[70]), null).invoke(newInstance6, null);
                                                                                                    try {
                                                                                                        byte[] bArr29 = $$a;
                                                                                                        byte b42 = bArr29[c14];
                                                                                                        invoke4 = Class.class.getMethod($$c(b42, (short) ((b42 ^ 562) | (b42 & 562)), bArr29[89]), null).invoke(AFc1iSDK.class, null);
                                                                                                        short s27 = (short) 99;
                                                                                                        try {
                                                                                                            newInstance2 = Class.forName($$c(bArr29[50], (short) 199, bArr29[253])).getDeclaredConstructor(Class.forName($$c(bArr29[642], s27, bArr29[c14])), Class.forName($$c(bArr29[70], (short) 397, bArr29[c14]))).newInstance(Class.forName($$c(bArr29[642], s27, bArr29[c14])).getMethod($$c(bArr29[67], (short) 977, bArr29[c19222]), byte[].class).invoke(null, invoke6), invoke4);
                                                                                                            try {
                                                                                                                Class<?> cls26 = Class.forName($$c(bArr29[146], (short) 315, bArr29[253]));
                                                                                                                byte b43 = bArr29[19];
                                                                                                                Field declaredField = cls26.getDeclaredField($$c(b43, (short) 830, b43));
                                                                                                                declaredField.setAccessible(true);
                                                                                                                Object obj22 = declaredField.get(invoke4);
                                                                                                                Class<?> cls27 = obj22.getClass();
                                                                                                                Field declaredField2 = cls27.getDeclaredField($$c(bArr29[30], (short) 980, bArr29[151]));
                                                                                                                declaredField2.setAccessible(true);
                                                                                                                Field declaredField3 = cls27.getDeclaredField($$c(bArr29[304], (short) 629, bArr29[151]));
                                                                                                                declaredField3.setAccessible(true);
                                                                                                                Object obj23 = declaredField2.get(obj22);
                                                                                                                Object obj24 = declaredField3.get(obj22);
                                                                                                                Object obj25 = declaredField.get(newInstance2);
                                                                                                                ArrayList arrayList = new ArrayList((List) obj23);
                                                                                                                Class<?> componentType = obj24.getClass().getComponentType();
                                                                                                                length = Array.getLength(obj24);
                                                                                                                Object newInstance7 = Array.newInstance(componentType, length);
                                                                                                                for (i22 = 0; i22 < length; i22 = (i22 | 1) + (i22 & 1)) {
                                                                                                                    Array.set(newInstance7, i22, Array.get(obj24, i22));
                                                                                                                }
                                                                                                                declaredField2.set(obj25, arrayList);
                                                                                                                declaredField3.set(obj25, newInstance7);
                                                                                                                if (getLevel == null) {
                                                                                                                    getLevel = newInstance2;
                                                                                                                }
                                                                                                                obj9 = newInstance2;
                                                                                                                zArr4 = zArr4;
                                                                                                            } catch (Exception e13) {
                                                                                                                StringBuilder sb10 = new StringBuilder();
                                                                                                                byte[] bArr30 = $$a;
                                                                                                                sb10.append($$c(bArr30[46], (short) 393, (byte) (-bArr30[528])));
                                                                                                                sb10.append(invoke4);
                                                                                                                byte b44 = bArr30[c19222];
                                                                                                                try {
                                                                                                                    sb10.append($$c(b44, (short) ((b44 ^ 286) | (b44 & 286)), bArr30[385]));
                                                                                                                    try {
                                                                                                                        throw ((Throwable) Class.forName($$c(bArr30[642], (short) 812, bArr30[c14])).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb10.toString(), e13));
                                                                                                                    } catch (Throwable th61) {
                                                                                                                        Throwable cause37 = th61.getCause();
                                                                                                                        if (cause37 == null) {
                                                                                                                            throw th61;
                                                                                                                        }
                                                                                                                        throw cause37;
                                                                                                                    }
                                                                                                                } catch (Throwable th62) {
                                                                                                                    th = th62;
                                                                                                                    objArr2 = i28222;
                                                                                                                    z16 = z24;
                                                                                                                    zArr5 = zArr4;
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th63) {
                                                                                                            Throwable cause38 = th63.getCause();
                                                                                                            if (cause38 == null) {
                                                                                                                throw th63;
                                                                                                            }
                                                                                                            throw cause38;
                                                                                                        }
                                                                                                    } catch (Throwable th64) {
                                                                                                        Throwable cause39 = th64.getCause();
                                                                                                        if (cause39 == null) {
                                                                                                            throw th64;
                                                                                                        }
                                                                                                        throw cause39;
                                                                                                    }
                                                                                                } catch (Throwable th65) {
                                                                                                    try {
                                                                                                        Throwable cause40 = th65.getCause();
                                                                                                        if (cause40 == null) {
                                                                                                            throw th65;
                                                                                                        }
                                                                                                        throw cause40;
                                                                                                    } catch (IOException unused7) {
                                                                                                        byte[] bArr292 = $$a;
                                                                                                        byte b422 = bArr292[c14];
                                                                                                        invoke4 = Class.class.getMethod($$c(b422, (short) ((b422 ^ 562) | (b422 & 562)), bArr292[89]), null).invoke(AFc1iSDK.class, null);
                                                                                                        short s272 = (short) 99;
                                                                                                        newInstance2 = Class.forName($$c(bArr292[50], (short) 199, bArr292[253])).getDeclaredConstructor(Class.forName($$c(bArr292[642], s272, bArr292[c14])), Class.forName($$c(bArr292[70], (short) 397, bArr292[c14]))).newInstance(Class.forName($$c(bArr292[642], s272, bArr292[c14])).getMethod($$c(bArr292[67], (short) 977, bArr292[c19222]), byte[].class).invoke(null, invoke6), invoke4);
                                                                                                        Class<?> cls262 = Class.forName($$c(bArr292[146], (short) 315, bArr292[253]));
                                                                                                        byte b432 = bArr292[19];
                                                                                                        Field declaredField4 = cls262.getDeclaredField($$c(b432, (short) 830, b432));
                                                                                                        declaredField4.setAccessible(true);
                                                                                                        Object obj222 = declaredField4.get(invoke4);
                                                                                                        Class<?> cls272 = obj222.getClass();
                                                                                                        Field declaredField22 = cls272.getDeclaredField($$c(bArr292[30], (short) 980, bArr292[151]));
                                                                                                        declaredField22.setAccessible(true);
                                                                                                        Field declaredField32 = cls272.getDeclaredField($$c(bArr292[304], (short) 629, bArr292[151]));
                                                                                                        declaredField32.setAccessible(true);
                                                                                                        Object obj232 = declaredField22.get(obj222);
                                                                                                        Object obj242 = declaredField32.get(obj222);
                                                                                                        Object obj252 = declaredField4.get(newInstance2);
                                                                                                        ArrayList arrayList2 = new ArrayList((List) obj232);
                                                                                                        Class<?> componentType2 = obj242.getClass().getComponentType();
                                                                                                        length = Array.getLength(obj242);
                                                                                                        Object newInstance72 = Array.newInstance(componentType2, length);
                                                                                                        while (i22 < length) {
                                                                                                        }
                                                                                                        declaredField22.set(obj252, arrayList2);
                                                                                                        declaredField32.set(obj252, newInstance72);
                                                                                                        if (getLevel == null) {
                                                                                                        }
                                                                                                        obj9 = newInstance2;
                                                                                                        zArr4 = zArr4;
                                                                                                        if (z25) {
                                                                                                        }
                                                                                                        if (cls3 == null) {
                                                                                                        }
                                                                                                        th = th;
                                                                                                        objArr2 = i28222;
                                                                                                        z16 = z24;
                                                                                                        zArr5 = zArr4;
                                                                                                        i11 = -1;
                                                                                                        objArr3 = objArr2;
                                                                                                        z17 = z16;
                                                                                                        zArr6 = zArr5;
                                                                                                        i18 = i15 + 1;
                                                                                                        i17 = 7;
                                                                                                        while (true) {
                                                                                                            if (i18 >= 7) {
                                                                                                            }
                                                                                                            int i3822222222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                                            i18 = (i3822222222 ^ (-110)) + ((i3822222222 & (-110)) << 1);
                                                                                                        }
                                                                                                        if (z18 != z19) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th66) {
                                                                                                try {
                                                                                                    Throwable cause41 = th66.getCause();
                                                                                                    if (cause41 == null) {
                                                                                                        throw th66;
                                                                                                    }
                                                                                                    throw cause41;
                                                                                                } catch (IOException unused8) {
                                                                                                    byte[] bArr282 = $$a;
                                                                                                    Class<?> cls252 = Class.forName($$c(bArr282[526], s26, bArr282[c14]));
                                                                                                    byte b412 = bArr282[46];
                                                                                                    cls252.getMethod($$c(b412, (short) ((b412 ^ 649) | (b412 & 649)), bArr282[70]), null).invoke(newInstance6, null);
                                                                                                    byte[] bArr2922 = $$a;
                                                                                                    byte b4222 = bArr2922[c14];
                                                                                                    invoke4 = Class.class.getMethod($$c(b4222, (short) ((b4222 ^ 562) | (b4222 & 562)), bArr2922[89]), null).invoke(AFc1iSDK.class, null);
                                                                                                    short s2722 = (short) 99;
                                                                                                    newInstance2 = Class.forName($$c(bArr2922[50], (short) 199, bArr2922[253])).getDeclaredConstructor(Class.forName($$c(bArr2922[642], s2722, bArr2922[c14])), Class.forName($$c(bArr2922[70], (short) 397, bArr2922[c14]))).newInstance(Class.forName($$c(bArr2922[642], s2722, bArr2922[c14])).getMethod($$c(bArr2922[67], (short) 977, bArr2922[c19222]), byte[].class).invoke(null, invoke6), invoke4);
                                                                                                    Class<?> cls2622 = Class.forName($$c(bArr2922[146], (short) 315, bArr2922[253]));
                                                                                                    byte b4322 = bArr2922[19];
                                                                                                    Field declaredField42 = cls2622.getDeclaredField($$c(b4322, (short) 830, b4322));
                                                                                                    declaredField42.setAccessible(true);
                                                                                                    Object obj2222 = declaredField42.get(invoke4);
                                                                                                    Class<?> cls2722 = obj2222.getClass();
                                                                                                    Field declaredField222 = cls2722.getDeclaredField($$c(bArr2922[30], (short) 980, bArr2922[151]));
                                                                                                    declaredField222.setAccessible(true);
                                                                                                    Field declaredField322 = cls2722.getDeclaredField($$c(bArr2922[304], (short) 629, bArr2922[151]));
                                                                                                    declaredField322.setAccessible(true);
                                                                                                    Object obj2322 = declaredField222.get(obj2222);
                                                                                                    Object obj2422 = declaredField322.get(obj2222);
                                                                                                    Object obj2522 = declaredField42.get(newInstance2);
                                                                                                    ArrayList arrayList22 = new ArrayList((List) obj2322);
                                                                                                    Class<?> componentType22 = obj2422.getClass().getComponentType();
                                                                                                    length = Array.getLength(obj2422);
                                                                                                    Object newInstance722 = Array.newInstance(componentType22, length);
                                                                                                    while (i22 < length) {
                                                                                                    }
                                                                                                    declaredField222.set(obj2522, arrayList22);
                                                                                                    declaredField322.set(obj2522, newInstance722);
                                                                                                    if (getLevel == null) {
                                                                                                    }
                                                                                                    obj9 = newInstance2;
                                                                                                    zArr4 = zArr4;
                                                                                                    if (z25) {
                                                                                                    }
                                                                                                    if (cls3 == null) {
                                                                                                    }
                                                                                                    th = th;
                                                                                                    objArr2 = i28222;
                                                                                                    z16 = z24;
                                                                                                    zArr5 = zArr4;
                                                                                                    i11 = -1;
                                                                                                    objArr3 = objArr2;
                                                                                                    z17 = z16;
                                                                                                    zArr6 = zArr5;
                                                                                                    i18 = i15 + 1;
                                                                                                    i17 = 7;
                                                                                                    while (true) {
                                                                                                        if (i18 >= 7) {
                                                                                                        }
                                                                                                        int i38222222222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                                        i18 = (i38222222222 ^ (-110)) + ((i38222222222 & (-110)) << 1);
                                                                                                    }
                                                                                                    if (z18 != z19) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th67) {
                                                                                            Throwable cause42 = th67.getCause();
                                                                                            if (cause42 == null) {
                                                                                                throw th67;
                                                                                            }
                                                                                            throw cause42;
                                                                                        }
                                                                                    } catch (Throwable th68) {
                                                                                        Throwable cause43 = th68.getCause();
                                                                                        if (cause43 == null) {
                                                                                            throw th68;
                                                                                        }
                                                                                        throw cause43;
                                                                                    }
                                                                                } catch (Throwable th69) {
                                                                                    Throwable cause44 = th69.getCause();
                                                                                    if (cause44 == null) {
                                                                                        throw th69;
                                                                                    }
                                                                                    throw cause44;
                                                                                }
                                                                            } catch (Throwable th70) {
                                                                                th = th70;
                                                                                objArr2 = i28222;
                                                                                z16 = z24;
                                                                                zArr5 = zArr4;
                                                                                i11 = -1;
                                                                                objArr3 = objArr2;
                                                                                z17 = z16;
                                                                                zArr6 = zArr5;
                                                                                i18 = i15 + 1;
                                                                                i17 = 7;
                                                                                while (true) {
                                                                                    if (i18 >= 7) {
                                                                                    }
                                                                                    int i382222222222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                    i18 = (i382222222222 ^ (-110)) + ((i382222222222 & (-110)) << 1);
                                                                                }
                                                                                if (z18 != z19) {
                                                                                }
                                                                            }
                                                                        }
                                                                        if (z25) {
                                                                            $10 = ($11 + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                            byte[] bArr31 = $$a;
                                                                            byte b45 = bArr31[70];
                                                                            Class<?> cls28 = Class.forName($$c(b45, (short) ((b45 ^ 266) | (b45 & 266)), bArr31[c18]));
                                                                            byte b46 = bArr31[13];
                                                                            Method declaredMethod2 = cls28.getDeclaredMethod($$c(b46, (short) ((b46 ^ 949) | (b46 & 949)), bArr31[c13]), String.class, Class.forName($$c(bArr31[70], (short) 397, bArr31[c14])));
                                                                            declaredMethod2.setAccessible(true);
                                                                            try {
                                                                                byte b47 = bArr31[c14];
                                                                                ?? invoke7 = declaredMethod2.invoke(obj9, str3, Class.class.getMethod($$c(b47, (short) ((b47 ^ 562) | (b47 & 562)), bArr31[89]), null).invoke(AFc1iSDK.class, null));
                                                                                if (invoke7 != null) {
                                                                                    int i68 = $11;
                                                                                    $10 = (((i68 | 99) << 1) - (i68 ^ 99)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                    byte b48 = bArr31[46];
                                                                                    cls28.getDeclaredMethod($$c(b48, (short) ((b48 ^ 649) | (b48 & 649)), bArr31[70]), new Class[0]).invoke(obj9, new Object[0]);
                                                                                }
                                                                                cls3 = invoke7;
                                                                            } catch (Throwable th71) {
                                                                                Throwable cause45 = th71.getCause();
                                                                                if (cause45 == null) {
                                                                                    throw th71;
                                                                                }
                                                                                throw cause45;
                                                                            }
                                                                        } else {
                                                                            String str5 = str3;
                                                                            byte[] bArr32 = $$a;
                                                                            Class<?> cls29 = Class.forName($$c(bArr32[70], (short) 397, bArr32[c14]));
                                                                            byte b49 = bArr32[13];
                                                                            Method declaredMethod3 = cls29.getDeclaredMethod($$c(b49, (short) ((b49 ^ 949) | (b49 & 949)), bArr32[c13]), String.class);
                                                                            try {
                                                                                declaredMethod3.setAccessible(true);
                                                                                cls3 = declaredMethod3.invoke(obj9, str5);
                                                                            } catch (InvocationTargetException e14) {
                                                                                try {
                                                                                    throw ((Exception) e14.getCause());
                                                                                } catch (ClassNotFoundException unused9) {
                                                                                    cls3 = null;
                                                                                    if (cls3 == null) {
                                                                                    }
                                                                                    th = th;
                                                                                    objArr2 = i28222;
                                                                                    z16 = z24;
                                                                                    zArr5 = zArr4;
                                                                                    i11 = -1;
                                                                                    objArr3 = objArr2;
                                                                                    z17 = z16;
                                                                                    zArr6 = zArr5;
                                                                                    i18 = i15 + 1;
                                                                                    i17 = 7;
                                                                                    while (true) {
                                                                                        if (i18 >= 7) {
                                                                                        }
                                                                                        int i3822222222222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                        i18 = (i3822222222222 ^ (-110)) + ((i3822222222222 & (-110)) << 1);
                                                                                    }
                                                                                    if (z18 != z19) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (cls3 == null) {
                                                                            try {
                                                                                cls10 = cls3;
                                                                                byte[] bArr33 = $$a;
                                                                                str4 = $$c(bArr33[281], (short) 657, bArr33[70]);
                                                                                Constructor declaredConstructor = cls10.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                declaredConstructor.setAccessible(true);
                                                                                if (z25) {
                                                                                    z26 = false;
                                                                                } else {
                                                                                    $10 = ($11 + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                    z26 = true;
                                                                                }
                                                                                afErrorLogForExcManagerOnly = declaredConstructor.newInstance(obj9, Boolean.valueOf(z26));
                                                                                byte[] bArr34 = new byte[7868];
                                                                                try {
                                                                                    short s28 = (short) 480;
                                                                                    Object newInstance8 = Class.forName($$c(bArr33[c12], s28, bArr33[c14])).getDeclaredConstructor(Class.forName($$c(bArr33[642], s12, bArr33[c14]))).newInstance(AFc1iSDK.class.getResourceAsStream($$c(bArr33[786], bArr33[71], bArr33[0])));
                                                                                    $11 = ($10 + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                    try {
                                                                                        Class<?> cls30 = Class.forName($$c(bArr33[c12], s28, bArr33[c14]));
                                                                                        byte b51 = bArr33[13];
                                                                                        cls30.getMethod($$c(b51, (short) (b51 | 226), bArr33[11]), byte[].class).invoke(newInstance8, bArr34);
                                                                                        int i69 = $11;
                                                                                        $10 = ((i69 ^ 9) + ((i69 & 9) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                        try {
                                                                                            Class<?> cls31 = Class.forName($$c(bArr33[c12], s28, bArr33[c14]));
                                                                                            byte b52 = bArr33[46];
                                                                                            cls31.getMethod($$c(b52, (short) (b52 | 649), bArr33[70]), null).invoke(newInstance8, null);
                                                                                            i49 = 7827;
                                                                                            i48 = Math.abs(i53);
                                                                                            bArr2 = bArr34;
                                                                                            objArr6222 = i28222;
                                                                                            obj3 = obj8;
                                                                                            zArr10222 = zArr4;
                                                                                            z21 = z25;
                                                                                            i11 = -1;
                                                                                            i28222 = 4;
                                                                                            r29 = 0;
                                                                                            i12 = 528;
                                                                                            zArr4 = zArr4;
                                                                                        } catch (Throwable th72) {
                                                                                            Throwable cause46 = th72.getCause();
                                                                                            if (cause46 == null) {
                                                                                                throw th72;
                                                                                            }
                                                                                            throw cause46;
                                                                                        }
                                                                                    } catch (Throwable th73) {
                                                                                        Throwable cause47 = th73.getCause();
                                                                                        if (cause47 == null) {
                                                                                            throw th73;
                                                                                        }
                                                                                        throw cause47;
                                                                                    }
                                                                                } catch (Throwable th74) {
                                                                                    Throwable cause48 = th74.getCause();
                                                                                    if (cause48 == null) {
                                                                                        throw th74;
                                                                                    }
                                                                                    throw cause48;
                                                                                }
                                                                            } catch (Throwable th75) {
                                                                                th = th75;
                                                                                objArr2 = i28222;
                                                                                z16 = z24;
                                                                                zArr5 = zArr4;
                                                                                i11 = -1;
                                                                                objArr3 = objArr2;
                                                                                z17 = z16;
                                                                                zArr6 = zArr5;
                                                                                i18 = i15 + 1;
                                                                                i17 = 7;
                                                                                while (true) {
                                                                                    if (i18 >= 7) {
                                                                                    }
                                                                                    int i38222222222222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                    i18 = (i38222222222222 ^ (-110)) + ((i38222222222222 & (-110)) << 1);
                                                                                }
                                                                                if (z18 != z19) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            try {
                                                                                break;
                                                                            } catch (Throwable th76) {
                                                                                th = th76;
                                                                                objArr2 = i28222;
                                                                                z16 = z24;
                                                                                zArr5 = zArr4;
                                                                                i11 = -1;
                                                                                objArr3 = objArr2;
                                                                                z17 = z16;
                                                                                zArr6 = zArr5;
                                                                                i18 = i15 + 1;
                                                                                i17 = 7;
                                                                                while (true) {
                                                                                    if (i18 >= 7) {
                                                                                    }
                                                                                    int i382222222222222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                                    i18 = (i382222222222222 ^ (-110)) + ((i382222222222222 & (-110)) << 1);
                                                                                }
                                                                                if (z18 != z19) {
                                                                                }
                                                                            }
                                                                        }
                                                                        th = th76;
                                                                        objArr2 = i28222;
                                                                        z16 = z24;
                                                                        zArr5 = zArr4;
                                                                    } catch (Throwable th77) {
                                                                        Throwable cause49 = th77.getCause();
                                                                        if (cause49 == null) {
                                                                            throw th77;
                                                                        }
                                                                        throw cause49;
                                                                    }
                                                                } catch (Throwable th78) {
                                                                    Throwable cause50 = th78.getCause();
                                                                    if (cause50 == null) {
                                                                        throw th78;
                                                                    }
                                                                    throw cause50;
                                                                }
                                                                i11 = -1;
                                                                objArr3 = objArr2;
                                                                z17 = z16;
                                                                zArr6 = zArr5;
                                                                i18 = i15 + 1;
                                                                i17 = 7;
                                                                while (true) {
                                                                    if (i18 >= 7) {
                                                                        z18 = false;
                                                                        obj2 = null;
                                                                        z19 = true;
                                                                        break;
                                                                    }
                                                                    int i71 = $11 + 71;
                                                                    $10 = i71 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                    if (i71 % 2 != 0) {
                                                                        break loop0;
                                                                    }
                                                                    if (zArr6[i18]) {
                                                                        z18 = true;
                                                                        z19 = true;
                                                                        obj2 = null;
                                                                        break;
                                                                    }
                                                                    int i3822222222222222 = ((i18 | 111) << 1) - (i18 ^ 111);
                                                                    i18 = (i3822222222222222 ^ (-110)) + ((i3822222222222222 & (-110)) << 1);
                                                                }
                                                                if (z18 != z19) {
                                                                    try {
                                                                        throw ((Throwable) Class.forName($$c(r1[c15], (short) 812, r1[c14])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[c12], (short) 363, (byte) (-$$a[528])), th));
                                                                    } catch (Throwable th79) {
                                                                        Throwable cause51 = th79.getCause();
                                                                        if (cause51 == null) {
                                                                            throw th79;
                                                                        }
                                                                        throw cause51;
                                                                    }
                                                                }
                                                                afErrorLogForExcManagerOnly = obj2;
                                                                getLevel = obj2;
                                                                i16 = 2;
                                                                z14 = false;
                                                                i12 = 528;
                                                                objArr = objArr3;
                                                                z13 = z17;
                                                                zArr3 = zArr6;
                                                            }
                                                            z11 = true;
                                                            i27222 = (i15 ^ 1) + ((i15 & 1) << 1);
                                                            i23 = i17;
                                                            i24 = i16;
                                                            objArr6222 = r26;
                                                            obj10 = obj2;
                                                            z27222 = z15;
                                                            zArr8222 = zArr;
                                                            $$c = str2;
                                                            zArr9222 = zArr2;
                                                            zArr10222 = zArr4;
                                                            i28222 = 4;
                                                            z28222 = r29;
                                                        } catch (Throwable th80) {
                                                            Throwable cause52 = th80.getCause();
                                                            if (cause52 == null) {
                                                                throw th80;
                                                            }
                                                            throw cause52;
                                                        }
                                                    } else {
                                                        z13 = z27222;
                                                        i14 = i13;
                                                        zArr = zArr8222;
                                                        str2 = $$c;
                                                        i15 = i27222;
                                                        zArr2 = zArr9222;
                                                        obj2 = obj10;
                                                        objArr = objArr6222;
                                                        zArr3 = zArr10222;
                                                        i16 = i32;
                                                        i17 = 7;
                                                        z14 = z28222;
                                                    }
                                                    i13 = i14;
                                                    Object[] objArr18 = objArr;
                                                    boolean z35 = z14;
                                                    z15 = z13;
                                                    zArr4 = zArr3;
                                                    z11 = true;
                                                    i27222 = (i15 ^ 1) + ((i15 & 1) << 1);
                                                    i23 = i17;
                                                    i24 = i16;
                                                    objArr6222 = objArr18;
                                                    obj10 = obj2;
                                                    z27222 = z15;
                                                    zArr8222 = zArr;
                                                    $$c = str2;
                                                    zArr9222 = zArr2;
                                                    zArr10222 = zArr4;
                                                    i28222 = 4;
                                                    z28222 = z35;
                                                }
                                            } catch (Throwable th81) {
                                                Throwable cause53 = th81.getCause();
                                                if (cause53 == null) {
                                                    throw th81;
                                                }
                                                throw cause53;
                                            }
                                        }
                                        invoke = null;
                                    }
                                    c13 = 'J';
                                    c14 = 25;
                                    if (invoke3 != null) {
                                    }
                                    if (invoke2 == null) {
                                    }
                                    byte[] bArr82222 = $$a;
                                    short s132222 = (short) 857;
                                    Object[] objArr62222 = (Object[]) Array.newInstance(Class.forName($$c(bArr82222[c13], s132222, bArr82222[c14])), 7);
                                    objArr62222[z12 ? 1 : 0] = null;
                                    objArr62222[z11 ? 1 : 0] = invoke2;
                                    objArr62222[2] = invoke;
                                    objArr62222[3] = invoke3;
                                    objArr62222[c11] = invoke2;
                                    objArr62222[5] = invoke;
                                    objArr62222[6] = invoke3;
                                    boolean[] zArr82222 = {false, true, true, true, true, true, true};
                                    boolean[] zArr92222 = {false, false, false, false, true, true, true};
                                    boolean[] zArr102222 = new boolean[7];
                                    zArr102222[z12 ? 1 : 0] = z12;
                                    zArr102222[z11 ? 1 : 0] = z12;
                                    zArr102222[2] = z11;
                                    zArr102222[3] = z11;
                                    zArr102222[c11] = z12;
                                    zArr102222[5] = z11;
                                    zArr102222[6] = z11;
                                    char c192222 = 6;
                                    Class<?> cls52222 = Class.forName($$c(bArr82222[30], (short) 149, bArr82222[c12]));
                                    byte b132222 = bArr82222[95];
                                    int i262222 = cls52222.getDeclaredField($$c(b132222, (short) (b132222 | 617), bArr82222[97])).getInt(cls52222);
                                    if (i262222 >= 34) {
                                    }
                                    if (i262222 != 29) {
                                        zArr102222[z12 ? 1 : 0] = (i262222 != 29 && i262222 >= 26) ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                        zArr102222[z11 ? 1 : 0] = i262222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                        zArr102222[c11] = i262222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                        i13 = z12 ? 1 : 0;
                                        int i272222 = i13;
                                        boolean z272222 = z29;
                                        int i282222 = c11;
                                        boolean z282222 = z12;
                                        loop0: while (i13 == 0) {
                                        }
                                    }
                                    zArr102222[z12 ? 1 : 0] = (i262222 != 29 && i262222 >= 26) ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                    zArr102222[z11 ? 1 : 0] = i262222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                    zArr102222[c11] = i262222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                    i13 = z12 ? 1 : 0;
                                    int i2722222 = i13;
                                    boolean z2722222 = z29;
                                    int i2822222 = c11;
                                    boolean z2822222 = z12;
                                    loop0: while (i13 == 0) {
                                    }
                                }
                                invoke3 = null;
                                if (invoke == null) {
                                }
                                c13 = 'J';
                                c14 = 25;
                                if (invoke3 != null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr822222 = $$a;
                                short s1322222 = (short) 857;
                                Object[] objArr622222 = (Object[]) Array.newInstance(Class.forName($$c(bArr822222[c13], s1322222, bArr822222[c14])), 7);
                                objArr622222[z12 ? 1 : 0] = null;
                                objArr622222[z11 ? 1 : 0] = invoke2;
                                objArr622222[2] = invoke;
                                objArr622222[3] = invoke3;
                                objArr622222[c11] = invoke2;
                                objArr622222[5] = invoke;
                                objArr622222[6] = invoke3;
                                boolean[] zArr822222 = {false, true, true, true, true, true, true};
                                boolean[] zArr922222 = {false, false, false, false, true, true, true};
                                boolean[] zArr1022222 = new boolean[7];
                                zArr1022222[z12 ? 1 : 0] = z12;
                                zArr1022222[z11 ? 1 : 0] = z12;
                                zArr1022222[2] = z11;
                                zArr1022222[3] = z11;
                                zArr1022222[c11] = z12;
                                zArr1022222[5] = z11;
                                zArr1022222[6] = z11;
                                char c1922222 = 6;
                                Class<?> cls522222 = Class.forName($$c(bArr822222[30], (short) 149, bArr822222[c12]));
                                byte b1322222 = bArr822222[95];
                                int i2622222 = cls522222.getDeclaredField($$c(b1322222, (short) (b1322222 | 617), bArr822222[97])).getInt(cls522222);
                                if (i2622222 >= 34) {
                                }
                                zArr1022222[z12 ? 1 : 0] = (i2622222 != 29 && i2622222 >= 26) ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                zArr1022222[z11 ? 1 : 0] = i2622222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                zArr1022222[c11] = i2622222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                                i13 = z12 ? 1 : 0;
                                int i27222222 = i13;
                                boolean z27222222 = z29;
                                int i28222222 = c11;
                                boolean z28222222 = z12;
                                loop0: while (i13 == 0) {
                                }
                            }
                            z12 = false;
                            invoke2 = null;
                            if (obj != null) {
                            }
                            invoke3 = null;
                            if (invoke == null) {
                            }
                            c13 = 'J';
                            c14 = 25;
                            if (invoke3 != null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr8222222 = $$a;
                            short s13222222 = (short) 857;
                            Object[] objArr6222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr8222222[c13], s13222222, bArr8222222[c14])), 7);
                            objArr6222222[z12 ? 1 : 0] = null;
                            objArr6222222[z11 ? 1 : 0] = invoke2;
                            objArr6222222[2] = invoke;
                            objArr6222222[3] = invoke3;
                            objArr6222222[c11] = invoke2;
                            objArr6222222[5] = invoke;
                            objArr6222222[6] = invoke3;
                            boolean[] zArr8222222 = {false, true, true, true, true, true, true};
                            boolean[] zArr9222222 = {false, false, false, false, true, true, true};
                            boolean[] zArr10222222 = new boolean[7];
                            zArr10222222[z12 ? 1 : 0] = z12;
                            zArr10222222[z11 ? 1 : 0] = z12;
                            zArr10222222[2] = z11;
                            zArr10222222[3] = z11;
                            zArr10222222[c11] = z12;
                            zArr10222222[5] = z11;
                            zArr10222222[6] = z11;
                            char c19222222 = 6;
                            Class<?> cls5222222 = Class.forName($$c(bArr8222222[30], (short) 149, bArr8222222[c12]));
                            byte b13222222 = bArr8222222[95];
                            int i26222222 = cls5222222.getDeclaredField($$c(b13222222, (short) (b13222222 | 617), bArr8222222[97])).getInt(cls5222222);
                            if (i26222222 >= 34) {
                            }
                            zArr10222222[z12 ? 1 : 0] = (i26222222 != 29 && i26222222 >= 26) ? z11 ? 1 : 0 : z12 ? 1 : 0;
                            zArr10222222[z11 ? 1 : 0] = i26222222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                            zArr10222222[c11] = i26222222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                            i13 = z12 ? 1 : 0;
                            int i272222222 = i13;
                            boolean z272222222 = z29;
                            int i282222222 = c11;
                            boolean z282222222 = z12;
                            loop0: while (i13 == 0) {
                            }
                        }
                        if (obj != null) {
                        }
                        z12 = false;
                        invoke2 = null;
                        if (obj != null) {
                        }
                        invoke3 = null;
                        if (invoke == null) {
                        }
                        c13 = 'J';
                        c14 = 25;
                        if (invoke3 != null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr82222222 = $$a;
                        short s132222222 = (short) 857;
                        Object[] objArr62222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr82222222[c13], s132222222, bArr82222222[c14])), 7);
                        objArr62222222[z12 ? 1 : 0] = null;
                        objArr62222222[z11 ? 1 : 0] = invoke2;
                        objArr62222222[2] = invoke;
                        objArr62222222[3] = invoke3;
                        objArr62222222[c11] = invoke2;
                        objArr62222222[5] = invoke;
                        objArr62222222[6] = invoke3;
                        boolean[] zArr82222222 = {false, true, true, true, true, true, true};
                        boolean[] zArr92222222 = {false, false, false, false, true, true, true};
                        boolean[] zArr102222222 = new boolean[7];
                        zArr102222222[z12 ? 1 : 0] = z12;
                        zArr102222222[z11 ? 1 : 0] = z12;
                        zArr102222222[2] = z11;
                        zArr102222222[3] = z11;
                        zArr102222222[c11] = z12;
                        zArr102222222[5] = z11;
                        zArr102222222[6] = z11;
                        char c192222222 = 6;
                        Class<?> cls52222222 = Class.forName($$c(bArr82222222[30], (short) 149, bArr82222222[c12]));
                        byte b132222222 = bArr82222222[95];
                        int i262222222 = cls52222222.getDeclaredField($$c(b132222222, (short) (b132222222 | 617), bArr82222222[97])).getInt(cls52222222);
                        if (i262222222 >= 34) {
                        }
                        zArr102222222[z12 ? 1 : 0] = (i262222222 != 29 && i262222222 >= 26) ? z11 ? 1 : 0 : z12 ? 1 : 0;
                        zArr102222222[z11 ? 1 : 0] = i262222222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                        zArr102222222[c11] = i262222222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                        i13 = z12 ? 1 : 0;
                        int i2722222222 = i13;
                        boolean z2722222222 = z29;
                        int i2822222222 = c11;
                        boolean z2822222222 = z12;
                        loop0: while (i13 == 0) {
                        }
                    }
                    invoke = null;
                    if (obj != null) {
                    }
                    z12 = false;
                    invoke2 = null;
                    if (obj != null) {
                    }
                    invoke3 = null;
                    if (invoke == null) {
                    }
                    c13 = 'J';
                    c14 = 25;
                    if (invoke3 != null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr822222222 = $$a;
                    short s1322222222 = (short) 857;
                    Object[] objArr622222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr822222222[c13], s1322222222, bArr822222222[c14])), 7);
                    objArr622222222[z12 ? 1 : 0] = null;
                    objArr622222222[z11 ? 1 : 0] = invoke2;
                    objArr622222222[2] = invoke;
                    objArr622222222[3] = invoke3;
                    objArr622222222[c11] = invoke2;
                    objArr622222222[5] = invoke;
                    objArr622222222[6] = invoke3;
                    boolean[] zArr822222222 = {false, true, true, true, true, true, true};
                    boolean[] zArr922222222 = {false, false, false, false, true, true, true};
                    boolean[] zArr1022222222 = new boolean[7];
                    zArr1022222222[z12 ? 1 : 0] = z12;
                    zArr1022222222[z11 ? 1 : 0] = z12;
                    zArr1022222222[2] = z11;
                    zArr1022222222[3] = z11;
                    zArr1022222222[c11] = z12;
                    zArr1022222222[5] = z11;
                    zArr1022222222[6] = z11;
                    char c1922222222 = 6;
                    Class<?> cls522222222 = Class.forName($$c(bArr822222222[30], (short) 149, bArr822222222[c12]));
                    byte b1322222222 = bArr822222222[95];
                    int i2622222222 = cls522222222.getDeclaredField($$c(b1322222222, (short) (b1322222222 | 617), bArr822222222[97])).getInt(cls522222222);
                    if (i2622222222 >= 34) {
                    }
                    zArr1022222222[z12 ? 1 : 0] = (i2622222222 != 29 && i2622222222 >= 26) ? z11 ? 1 : 0 : z12 ? 1 : 0;
                    zArr1022222222[z11 ? 1 : 0] = i2622222222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                    zArr1022222222[c11] = i2622222222 < 21 ? z11 ? 1 : 0 : z12 ? 1 : 0;
                    i13 = z12 ? 1 : 0;
                    int i27222222222 = i13;
                    boolean z27222222222 = z29;
                    int i28222222222 = c11;
                    boolean z28222222222 = z12;
                    loop0: while (i13 == 0) {
                    }
                }
            } catch (Exception unused10) {
                c12 = '$';
                z11 = true;
            }
        } catch (Exception e15) {
            throw new RuntimeException(e15);
        }
    }

    private AFc1iSDK() {
    }

    public static Object AFInAppEventParameterName(int i11, char c11, int i12) {
        int i13 = $10 + 107;
        $11 = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            throw null;
        }
        Object obj = afErrorLogForExcManagerOnly;
        try {
            Object[] objArr = {Integer.valueOf(i11), Character.valueOf(c11), Integer.valueOf(i12)};
            byte[] bArr = $$a;
            byte b11 = bArr[281];
            Class<?> cls = Class.forName($$c(b11, (short) ((b11 ^ 85) | (b11 & 85)), bArr[70]), true, (ClassLoader) getLevel);
            byte b12 = bArr[89];
            String $$c = $$c(b12, (short) ((b12 ^ 591) | (b12 & 591)), bArr[4]);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            $10 = ($11 + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return invoke;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int AFInAppEventType(Object obj) {
        int i11 = $10;
        int i12 = ((i11 | 29) << 1) - (i11 ^ 29);
        $11 = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            throw null;
        }
        Object obj2 = afErrorLogForExcManagerOnly;
        $11 = (((i11 | 21) << 1) - (i11 ^ 21)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            byte[] bArr = $$a;
            byte b11 = bArr[281];
            Class<?> cls = Class.forName($$c(b11, (short) ((b11 ^ 85) | (b11 & 85)), bArr[70]), true, (ClassLoader) getLevel);
            byte b12 = bArr[89];
            return ((Integer) cls.getMethod($$c(b12, (short) (b12 | 591), bArr[4]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    static void init$0() {
        int i11;
        int i12 = $11;
        int i13 = (i12 & 59) + (i12 | 59);
        $10 = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 != 0) {
            byte[] bArr = new byte[1026];
            System.arraycopy("H;pû6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ7Ëù\u0017íÏ=\bÁ\u00165ó\u0002\u0001\u000fõ\u0001ç'\u0004\u0007\u0001á#\u0000õþ\u000eù\u0017íÏ@÷\u000fûÉ'(ü\u0003ó\n\u0014ÿ\u0002õ\u000b\bÏ1\u0002þÿü\u0000\u0015÷\b\u0001\u000fø\u0010ÿüýÌC\u0006½$$ÿö\u0004\u0010\u0002ù\u0017íÏBý\bÁ\u00169ýóß5ó\u0002\u0001\u000f\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007\u001fÐ7ïó\tÛ\u0002\u000fø\u0010ÿüýÌC\u0006½\u00165ö\u0005úÂ4ñ\u000f\u0003ø\b\u0001ù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aÒ'\u0004\u0007\u0001á#\u0000õþ\u000eÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u001d'á\u001a\n\u0004\u0005\tÍ#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000fõþ\u0005ä1ù\u0002\u000f\u0003\u0005ýö\rÿ\u0013íê\u001a\u0011ïô#ï\u0015ó\u0000\u0011Ô%\u0005û\u0010Ó'\u000býù\ró\u0000\u0011Ñ \u0004\u0007ÿá'\u000bõþ\u0005ÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0018#\u0015Ð%\u0005û\u000e÷\u0003ü\u0006\u0000\u0004\u0007ÿÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0016!\u0014ôá#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000f\u0000\u0011Ñ.÷\u0003à \u0004\u0007ÿá'\u000b\b÷÷í\të\nH\u0003³Hý\r\u0002ø\u0001\u0004\n\n¯Nû\u0003\u0010·í\bì\ní\u0006î\ní\nê\nù\u0017íÏ@÷\u000fûÉ\u0017+÷\u0014\u0002Û%ô\u0005\u0003\u000f\u000fø\u0010ÿüýÌ5\u0011\u0002À\u00151\u0002Ù'\u0005õ\u0001\r\t\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001fÐ7ïó\tÛ\u0002ô\u0011à\u0015þ\u0005í!\u0000\u000fù\u0017íÏ=\bÁ\u0018\u001f\u0015ïê'\u0004\u0007\u0001á#\u0000õþ\u000e\u0005ô\u0005â#\u0015\u000fø\u0010ÿüýÌJõþ\u0014¹\u001f\u001c\u0016Î3ñ\u000b\bù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aØ(\u0001þ\u0007\u0001á#\u0000õþ\u000e\u0000\u0011Ó)÷\u0011\u0005ô\u0001á/\u0007á\u0017\u0006úú\u0000\t\u0000\u0011Ñ+÷\u0014\u0002Û%ô\u0005\u0003\u000f7ÿ\u0015ïÐ7ÿ\u0015ïÐ\u0003\tû\u0011ó\u0000\u0011Ô\u0000\u0007\u0007\u001c\u0016ü\u0003ý\u0005õô\u001dñ\u0011\u0002÷\u000fó\t\u0016ì\u0007\bõ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÙ\u0013\u0015öß)û\nú\u000b\b\u0001\u000b\u0005\u0006ô\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001fÐ:ìó\tÛQ6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ6Ìù\u0017íÏ=\bÁHû\u0005ö\u0007\u000b\u0000\u0011Þ$ÿ\u0003÷\u000f\u0004\u0007\u0000\u0011Ï#\u0013þÿ\u000b\u0001óí\u0013\u0015ö\u000fø\u0010ÿüýÌ5\u0011\u0002À\u0015$\u0013÷\u000fõ\r\u0007Ý\u0016\fõþ\u0005í\r\u000bòì\u0019ù\u0017íÏ=\bÁ\u001a%\u0005ûì(\u0001þ\u0007\u0001á#\u0000õþ\u000e\u0000\u000fë\u001dù\róù\u0017íÏ=\bÁ\u001d\bø5í\u0004\r\u0006÷\b\u0001ó\u0015öæ\u001f\f\u0003\u0000\u0011×'ý\r÷ú\r×1\u0002þÿü\u0000\u0015÷\b\u0001ù\u0017íÏ=\bÁ\u001a%\u0005û\u000e\u0000\u0005þû\u0015Þ\u001dÙ.ñ\u0004\u0013÷\b\u0001í\u0005ï\n\u000fø\u0010ÿüýÌI\u0001÷\u0005Ä('ù÷\u0001ô\r\r\u000bò\u0014ÿ\u0002õ\u000b\bâ\u0017\u0006úê\u001e\u0005\u0002ÿ\fù\u0017íÏ=\bÁ\u001a%\u0005ûá#\u0010ò\u0011ù\t\u0006ý\u0005ýÕ9ýóÞ3\u0002ñ\u001a\u0005ô\u0005á+÷\u0014\u0002\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000fýñ\u0011õ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÍ'\u000bõ\u0000\u0013ý\u0005ùþ\u0010ù\u0017íÏ=\bÁ\u001d'\u0004\u0007\u0001á#\u0000õþ\u000e".getBytes("ISO-8859-1"), 0, bArr, 0, 1026);
            $$a = bArr;
            i11 = 9552;
        } else {
            byte[] bArr2 = new byte[1026];
            System.arraycopy("H;pû6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ7Ëù\u0017íÏ=\bÁ\u00165ó\u0002\u0001\u000fõ\u0001ç'\u0004\u0007\u0001á#\u0000õþ\u000eù\u0017íÏ@÷\u000fûÉ'(ü\u0003ó\n\u0014ÿ\u0002õ\u000b\bÏ1\u0002þÿü\u0000\u0015÷\b\u0001\u000fø\u0010ÿüýÌC\u0006½$$ÿö\u0004\u0010\u0002ù\u0017íÏBý\bÁ\u00169ýóß5ó\u0002\u0001\u000f\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007\u001fÐ7ïó\tÛ\u0002\u000fø\u0010ÿüýÌC\u0006½\u00165ö\u0005úÂ4ñ\u000f\u0003ø\b\u0001ù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aÒ'\u0004\u0007\u0001á#\u0000õþ\u000eÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u001d'á\u001a\n\u0004\u0005\tÍ#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000fõþ\u0005ä1ù\u0002\u000f\u0003\u0005ýö\rÿ\u0013íê\u001a\u0011ïô#ï\u0015ó\u0000\u0011Ô%\u0005û\u0010Ó'\u000býù\ró\u0000\u0011Ñ \u0004\u0007ÿá'\u000bõþ\u0005ÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0018#\u0015Ð%\u0005û\u000e÷\u0003ü\u0006\u0000\u0004\u0007ÿÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0016!\u0014ôá#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000f\u0000\u0011Ñ.÷\u0003à \u0004\u0007ÿá'\u000b\b÷÷í\të\nH\u0003³Hý\r\u0002ø\u0001\u0004\n\n¯Nû\u0003\u0010·í\bì\ní\u0006î\ní\nê\nù\u0017íÏ@÷\u000fûÉ\u0017+÷\u0014\u0002Û%ô\u0005\u0003\u000f\u000fø\u0010ÿüýÌ5\u0011\u0002À\u00151\u0002Ù'\u0005õ\u0001\r\t\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001fÐ7ïó\tÛ\u0002ô\u0011à\u0015þ\u0005í!\u0000\u000fù\u0017íÏ=\bÁ\u0018\u001f\u0015ïê'\u0004\u0007\u0001á#\u0000õþ\u000e\u0005ô\u0005â#\u0015\u000fø\u0010ÿüýÌJõþ\u0014¹\u001f\u001c\u0016Î3ñ\u000b\bù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aØ(\u0001þ\u0007\u0001á#\u0000õþ\u000e\u0000\u0011Ó)÷\u0011\u0005ô\u0001á/\u0007á\u0017\u0006úú\u0000\t\u0000\u0011Ñ+÷\u0014\u0002Û%ô\u0005\u0003\u000f7ÿ\u0015ïÐ7ÿ\u0015ïÐ\u0003\tû\u0011ó\u0000\u0011Ô\u0000\u0007\u0007\u001c\u0016ü\u0003ý\u0005õô\u001dñ\u0011\u0002÷\u000fó\t\u0016ì\u0007\bõ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÙ\u0013\u0015öß)û\nú\u000b\b\u0001\u000b\u0005\u0006ô\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001fÐ:ìó\tÛQ6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ6Ìù\u0017íÏ=\bÁHû\u0005ö\u0007\u000b\u0000\u0011Þ$ÿ\u0003÷\u000f\u0004\u0007\u0000\u0011Ï#\u0013þÿ\u000b\u0001óí\u0013\u0015ö\u000fø\u0010ÿüýÌ5\u0011\u0002À\u0015$\u0013÷\u000fõ\r\u0007Ý\u0016\fõþ\u0005í\r\u000bòì\u0019ù\u0017íÏ=\bÁ\u001a%\u0005ûì(\u0001þ\u0007\u0001á#\u0000õþ\u000e\u0000\u000fë\u001dù\róù\u0017íÏ=\bÁ\u001d\bø5í\u0004\r\u0006÷\b\u0001ó\u0015öæ\u001f\f\u0003\u0000\u0011×'ý\r÷ú\r×1\u0002þÿü\u0000\u0015÷\b\u0001ù\u0017íÏ=\bÁ\u001a%\u0005û\u000e\u0000\u0005þû\u0015Þ\u001dÙ.ñ\u0004\u0013÷\b\u0001í\u0005ï\n\u000fø\u0010ÿüýÌI\u0001÷\u0005Ä('ù÷\u0001ô\r\r\u000bò\u0014ÿ\u0002õ\u000b\bâ\u0017\u0006úê\u001e\u0005\u0002ÿ\fù\u0017íÏ=\bÁ\u001a%\u0005ûá#\u0010ò\u0011ù\t\u0006ý\u0005ýÕ9ýóÞ3\u0002ñ\u001a\u0005ô\u0005á+÷\u0014\u0002\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000fýñ\u0011õ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÍ'\u000bõ\u0000\u0013ý\u0005ùþ\u0010ù\u0017íÏ=\bÁ\u001d'\u0004\u0007\u0001á#\u0000õþ\u000e".getBytes("ISO-8859-1"), 0, bArr2, 0, 1026);
            $$a = bArr2;
            i11 = 217;
        }
        $$b = i11;
    }

    public static int valueOf(int i11) {
        int i12 = ($11 + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Object obj = afErrorLogForExcManagerOnly;
        int i13 = (i12 + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        $11 = i13;
        $10 = (((i13 | 109) << 1) - (i13 ^ 109)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {Integer.valueOf(i11)};
            byte[] bArr = $$a;
            byte b11 = bArr[281];
            Class<?> cls = Class.forName($$c(b11, (short) ((b11 ^ 85) | (b11 & 85)), bArr[70]), true, (ClassLoader) getLevel);
            byte b12 = bArr[89];
            return ((Integer) cls.getMethod($$c(b12, (short) ((b12 ^ 591) | (b12 & 591)), bArr[4]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
