package k5;

import Ve.Sp;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import k5.InterfaceC7518g2;

/* renamed from: k5.G, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C7488G extends D0<Integer> implements InterfaceC7518g2<Integer>, v3 {

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f70543i = {C7563s0.a(new byte[]{-84, -1, -48, -92, -118, -23, -114, -74, 3, -75, 42, 44, 26, -68, -43, -115}), C7563s0.a(new byte[]{116, 38, -87, 19, -98, -89, -22, -99, 73, 63, -29, 63, 58, -55, -8, 10}), C7563s0.a(new byte[]{-78, -20, -104, 51, 12, 62, 73, -12, 103, 99, -100, 25, 54, -32, -79, 118}), C7563s0.a(new byte[]{-69, 50, 113, 99, 36, -13, -55, 50, -111, -14, 116, 126, -22, -90, 5, -115}), C7563s0.a(new byte[]{86, -50, 17, 113, Byte.MIN_VALUE, -60, -105, -74, -49, -19, 101, 79, -21, -69, -27, 84}), C7563s0.a(new byte[]{-3, -99, 63, 100, -87, 18, -28, 11, -86, 115, 66, -118, 79, -12, -51, 116}), C7563s0.a(new byte[]{123, 102, 83, 49, -91, -19, -4, -60, -76, 100, -55, 91, 47, -112, -71, -118}), C7563s0.a(new byte[]{77, -51, 17, -108, 24, 99, 101, 40, -42, -39, -88, -118, 80, 105, -110, -104}), C7563s0.a(new byte[]{-76, -125, -35, 71, 114, 97, -72, -56, -17, -88, -45, 59, 81, -51, 32, 115}), C7563s0.a(new byte[]{46, 35, -98, -105, -48, 112, 62, -32, -43, -79, Byte.MIN_VALUE, 98, 70, -105, -70, -85}), C7563s0.a(new byte[]{-86, 97, 83, 105, 104, -45, 1, 102, 21, 53, 34, 105, 56, 0, -13, -93}), C7563s0.a(new byte[]{95, 73, -72, -67, -105, -72, -4, -39, 25, -92, -125, 39, 35, 18, -119, 66}), C7563s0.a(new byte[]{120, -126, 37, 68, -80, -44, 41, -35, -24, -8, 59, 103, 113, 104, -64, -127}), C7563s0.a(new byte[]{112, 52, -42, -116, 3, 6, -50, -113, 125, -91, -28, 7, 48, -21, 89, -121}), C7563s0.a(new byte[]{-117, 4, 104, 49, -14, 87, 116, 76, -4, 108, 19, 52, 29, 106, 22, -20}), C7563s0.a(new byte[]{-84, 22, 107, -78, 32, 78, 91, -63, 36, 80, -8, -66, 49, -10, -34, 101})};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f70544j = {C7563s0.a(new byte[]{44, -16, -55, Byte.MIN_VALUE, -121, -46, -13, -37, -36, 111, -84, 24, -123, -78, 72, 23}), C7563s0.a(new byte[]{-90, -72, 6, -90, 18, -52, -84, -16, -49, 21, 94, 81, -118, -26, 52, -61, 28, -115, 16, -31, 98, -17, 10, 35, -86, -66, 12, -121, -15, 109, -79, 28}), C7563s0.a(new byte[]{85, 42, 95, -93, 62, 10, 21, 119, 86, -103, -126, -91, -36, 81, -60, -104})};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f70545k = {C7563s0.a(new byte[]{-117, -92, 67, 26, 110, 112, 53, -59, -51, -30, -98, 66, 119, 114, 105, 95})};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f70546l = {C7563s0.a(new byte[]{42, 49, -81, 24, 41, 73, -28, -19, -110, -26, 43, -83, 29, -21, -68, -81, 66, -93, -63, -25, -104, 36, 86, 78, 86, 93, 46, 100, 30, 50, 102, 70}), C7563s0.a(new byte[]{87, 64, 12, -75, -84, -96, -2, -96, 35, 93, 41, -59, 90, 19, -74, -64, -101, -49, -119, 25, -97, -68, 4, 67, Byte.MIN_VALUE, 82, 42, 36, -117, 97, -88, 76})};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f70547m = {C7563s0.a(new byte[]{106, -70, 123, -6, -93, -43, 64, -107, -25, -16, -125, 80, 60, -99, 9, 101})};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f70548n = {C7563s0.a(new byte[]{-119, -85, 79, 2, -65, -2, 52, -89, 50, 105, 96, 72, -20, -69, 75, 126, -2, 4, -43, 27, -83, 105, 24, 24, 85, -77, 106, 76, 110, 22, 16, 108}), C7563s0.a(new byte[]{123, 97, -110, 25, -51, 42, 14, -26, 119, -38, 31, 36, -107, 102, 4, 5})};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f70549o = {C7563s0.a(new byte[]{52, 90, 54, 119, -106, -15, 29, -81, -72, 66, -50, 95, 52, 95, -27, -63}), C7563s0.a(new byte[]{-71, 17, 44, -108, 13, -108, 115, 13, 116, 112, -6, -53, 57, 31, -3, -67})};

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f70550p = {C7563s0.a(new byte[]{-80, 48, 28, -4, -65, 102, -42, 112, -19, 59, 92, 114, 17, -119, -95, 102}), C7563s0.a(new byte[]{6, -88, 87, -100, 47, -46, -29, 70, -83, 13, -74, 14, -86, -45, -50, -93}), C7563s0.a(new byte[]{116, -23, -114, -11, 84, -126, 2, -49, 84, 85, 64, 98, -74, 77, 107, 53})};

    /* renamed from: q, reason: collision with root package name */
    private static final String f70551q = C7563s0.a(new byte[]{52, -91, 68, 78, -18, 48, 29, 0, -5, -71, -50, -72, -66, 1, 118, -95});

    /* renamed from: r, reason: collision with root package name */
    private static final a[] f70552r = {new a(C7563s0.a(new byte[]{116, -66, -105, 109, 75, 103, 10, 91, 60, -73, -7, 20, -86, 90, -35, -35}), null), new a(C7563s0.a(new byte[]{1, -29, -62, -69, 32, -9, 19, 4, -67, 112, -59, 12, 93, 103, -71, -18, 21, 113, 34, -46, 65, -106, 121, -45, 72, 24, 1, -25, 62, -26, 115, 73}), null), new a(C7563s0.a(new byte[]{88, -121, 116, -69, -63, 86, -122, 7, -117, -16, -33, -98, -21, -52, 110, -35, 41, -8, -120, 13, -79, 78, 109, 124, 75, -116, -58, -115, -31, -14, -20, 27}), null), new a(C7563s0.a(new byte[]{-54, 18, 112, -59, 116, -109, -122, 11, 18, -105, 14, -52, 79, -55, -36, -39, 39, 18, 42, -16, 106, 96, 54, 83, 85, 31, -36, 68, -103, 28, 95, -59}), null), new a(C7563s0.a(new byte[]{-47, 43, 111, 21, 126, 50, 76, 74, 85, -63, 29, -63, 14, 70, -50, 54, -82, 64, -3, -51, 56, -16, 2, -37, 2, -39, -105, -48, -25, 23, 126, -69}), null), new a(C7563s0.a(new byte[]{-48, 106, 60, 16, -94, 15, 58, 1, 67, 88, 40, -9, -67, 19, -72, 51}), C7563s0.a(new byte[]{98, -5, -86, 71, -20, 123, -27, 108, 30, 20, 65, 14, 49, -101, 51, -2})), new a(C7563s0.a(new byte[]{116, -26, 1, -26, 23, 120, 67, 113, -47, -103, 92, -41, -121, -62, -122, 2}), C7563s0.a(new byte[]{98, -5, -86, 71, -20, 123, -27, 108, 30, 20, 65, 14, 49, -101, 51, -2})), new a(C7563s0.a(new byte[]{55, 40, 120, 84, -87, 15, 77, -42, 66, -123, -68, -67, -7, 67, 42, -121}), C7563s0.a(new byte[]{106, -70, 123, -6, -93, -43, 64, -107, -25, -16, -125, 80, 60, -99, 9, 101})), new a(C7563s0.a(new byte[]{112, -43, -54, 72, -125, -115, 39, -75, -6, -86, -117, -120, 94, -59, 122, 8, 24, -58, -51, 7, 118, -125, 58, Byte.MAX_VALUE, -72, -98, -58, 50, 15, 126, 65, 42}), null), new a(C7563s0.a(new byte[]{47, -81, -51, -72, 97, -92, -44, 107, 123, 99, -57, -122, -35, 106, Byte.MAX_VALUE, -35, 35, 76, -55, 25, -11, -83, -114, -5, -59, -95, 3, -35, 48, -120, -92, 7}), null), new a(C7563s0.a(new byte[]{-28, -81, 24, -3, -31, -73, -90, -80, 118, -71, 36, 36, -121, -71, 79, 120}), C7563s0.a(new byte[]{-37, -20, -40, 1, 37, -39, 25, 107, -15, -101, 10, 45, 97, -64, 54, -54})), new a(C7563s0.a(new byte[]{76, 45, 38, 124, -9, -73, 125, -93, -90, 58, 44, 54, 11, -84, 74, 4, 15, -68, -28, -89, 3, -1, -105, 11, 28, -1, 32, 111, -23, 70, 45, 59}), C7563s0.a(new byte[]{-99, -121, -84, -49, 24, -63, -70, 65, -78, -110, 16, -124, -73, 105, -58, -54})), new a(C7563s0.a(new byte[]{54, -55, -59, -104, 78, 113, -91, 118, -124, -5, 39, 33, 86, -77, 40, -72, 84, -35, 119, 81, -53, 109, -18, -51, -9, 22, -79, 54, 16, -76, -27, 25}), C7563s0.a(new byte[]{Byte.MIN_VALUE, -127, -37, 64, -86, -118, 2, 56, -85, 94, -47, 46, -91, -44, -9, -81})), new a(C7563s0.a(new byte[]{-6, -74, 40, -35, -42, 24, Byte.MIN_VALUE, -30, -64, 38, -60, -79, 124, -121, 73, 81}), C7563s0.a(new byte[]{Byte.MIN_VALUE, -127, -37, 64, -86, -118, 2, 56, -85, 94, -47, 46, -91, -44, -9, -81})), new a(C7563s0.a(new byte[]{39, -63, 105, 74, 23, 21, -39, 69, 50, 80, 77, 9, 35, -106, -80, 91}), null)};

    /* renamed from: s, reason: collision with root package name */
    private static final String[] f70553s = {C7563s0.a(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 55, -55, 114, -60, 54, 113, -46, 19, 119, -92, 71, 34, -26, 65, 8, -65, 120, -38, 42, -111, 4, -84, -68, -8, -77, -60, -123, 55, -8, 25, 17, 109}), C7563s0.a(new byte[]{57, -49, 75, 81, 83, 69, 102, -98, 95, 21, -93, -125, 95, 109, -18, -10}), C7563s0.a(new byte[]{96, -110, 25, -5, -106, 4, 18, 111, 52, 63, -55, -10, -101, 24, -76, -15})};

    /* renamed from: t, reason: collision with root package name */
    private static final File[] f70554t = {new File(C7563s0.a(new byte[]{-39, 26, -124, 86, -94, -95, 15, 11, -101, 51, -19, -55, -26, 69, 64, -86, 6, 50, -95, 82, -93, 72, 119, -66, 12, 27, -49, -27, 54, -86, -65, -89})), new File(C7563s0.a(new byte[]{36, 94, -33, -91, 12, 81, -92, 87, -28, -48, -56, 91, -3, 122, -113, -52}))};

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    protected final Context f70555e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70556f;

    /* renamed from: g, reason: collision with root package name */
    private final TelephonyManager f70557g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final Sp f70558h;

    /* renamed from: k5.G$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String f70559a;

        /* renamed from: b, reason: collision with root package name */
        final String f70560b;

        a(String str, String str2) {
            this.f70559a = str;
            this.f70560b = str2;
        }
    }

    C7488G(@NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0, TelephonyManager telephonyManager, @NonNull Sp sp) {
        super(Mm0.e.Emulator);
        this.f70555e = context;
        this.f70556f = abstractC7520h0;
        this.f70557g = telephonyManager;
        this.f70558h = sp;
    }

    private static boolean A(String[] strArr) {
        for (String str : strArr) {
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Boolean w(PackageManager packageManager) {
        for (String str : f70553s) {
            try {
                packageManager.getPackageInfo(str, UserVerificationMethods.USER_VERIFY_PATTERN);
                return Boolean.TRUE;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c7, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e6, code lost:
    
        r12 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ee, code lost:
    
        if (android.text.TextUtils.isEmpty(r12) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f0, code lost:
    
        r12 = r12.split(k5.C7563s0.a(new byte[]{119, -84, -4, -113, -80, -60, -101, 120, 83, 0, 125, 90, -91, 113, -38, -62}));
        r4 = r12.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0201, code lost:
    
        r6 = r12[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0209, code lost:
    
        if (r6.contains("wlan0") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0225, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0223, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0228, code lost:
    
        if (r12 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x022a, code lost:
    
        r12 = k5.C7488G.f70552r;
        r4 = r12.length;
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0231, code lost:
    
        r7 = r12[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0233, code lost:
    
        r8 = java.lang.Runtime.getRuntime().exec(k5.C7563s0.a(new byte[]{-119, 75, -21, -56, 44, -83, -110, 69, -89, 53, -33, 57, -62, -25, 90, 44}) + r7.f70559a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0255, code lost:
    
        r9 = new java.io.BufferedReader(new java.io.InputStreamReader(r8.getInputStream())).readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0267, code lost:
    
        if (r9 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0274, code lost:
    
        k5.L2.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0282, code lost:
    
        if (r9 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0285, code lost:
    
        r7 = r7.f70560b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0287, code lost:
    
        if (r7 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0289, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028a, code lost:
    
        if (r7 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0292, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0293, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0273, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x027e, code lost:
    
        k5.L2.b(r8);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0270, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0271, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0279, code lost:
    
        k5.L2.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x027c, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x027d, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0278, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0296, code lost:
    
        if (r6 >= 5) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0298, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x029b, code lost:
    
        if (r12 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x029a, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01de, code lost:
    
        k5.L2.b(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01e1, code lost:
    
        if (r6 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01e3, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01cb, code lost:
    
        r1 = r0;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01d3, code lost:
    
        k5.L2.b(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01d6, code lost:
    
        if (r0 != null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01db, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01d8, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01dd, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01ce, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01dc, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01d0, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01d1, code lost:
    
        r1 = r12;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0227, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
    
        if ((r12 != null && r12.getNetworkOperatorName().equalsIgnoreCase("android")) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015b, code lost:
    
        if (r12 != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015d, code lost:
    
        k5.C7563s0.a(new byte[]{-59, Byte.MIN_VALUE, 25, 109, 79, -68, 94, 49, 4, 51, -90, -103, 34, 113, 95, 123});
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
    
        if (A(k5.C7488G.f70548n) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016d, code lost:
    
        r0 = null;
        r0 = null;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0174, code lost:
    
        if (Gf.d.l(r6, "android.permission.INTERNET") == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0176, code lost:
    
        r12 = new java.lang.String[]{k5.C7563s0.a(new byte[]{-79, -122, -62, 78, -94, -115, 6, -73, -64, -33, 95, 15, 2, -110, 79, 15, -108, -64, -100, -84, -13, 93, -106, -35, -63, -37, 43, 106, 38, -100, 77, 99})};
        r4 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018a, code lost:
    
        r6 = new java.lang.ProcessBuilder(r12);
        r6.directory(new java.io.File(k5.C7563s0.a(new byte[]{9, 7, 58, 38, -116, -116, -59, 33, -29, 48, -23, 52, -35, -55, 18, 28})));
        r6.redirectErrorStream(true);
        r12 = r6.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a7, code lost:
    
        r6 = new java.io.BufferedReader(new java.io.InputStreamReader(r12.getInputStream()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b5, code lost:
    
        r7 = r6.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b9, code lost:
    
        if (r7 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bb, code lost:
    
        r4.append(r7);
        r4.append('\n');
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c4, code lost:
    
        k5.L2.b(r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e3 A[Catch: IOException -> 0x01e6, TRY_ENTER, TRY_LEAVE, TryCatch #10 {IOException -> 0x01e6, blocks: (B:100:0x01c7, B:169:0x01e3), top: B:90:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean y(C7488G c7488g) {
        ?? r12;
        ?? r122;
        boolean booleanValue;
        ?? r02;
        ?? r03;
        ?? r04;
        c7488g.getClass();
        EnumC7578w enumC7578w = EnumC7578w.READ_PHONE_STATE;
        String a11 = enumC7578w.a();
        Context context = c7488g.f70555e;
        if (Gf.d.l(context, a11)) {
            if (Build.VERSION.SDK_INT > 28) {
                booleanValue = false;
            } else {
                final PackageManager packageManager = context.getPackageManager();
                Boolean bool = (Boolean) c7488g.n(new Callable() { // from class: k5.D
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.telephony"));
                    }
                });
                Objects.requireNonNull(bool);
                booleanValue = bool.booleanValue();
            }
            if (booleanValue) {
                TelephonyManager telephonyManager = c7488g.f70557g;
                if (telephonyManager != null && Gf.d.l(context, enumC7578w.a()) && Gf.d.l(context, EnumC7578w.READ_PHONE_NUMBERS.a())) {
                    String line1Number = telephonyManager.getLine1Number();
                    for (String str : f70543i) {
                        if (str.equalsIgnoreCase(line1Number)) {
                            r02 = true;
                            break;
                        }
                    }
                }
                r02 = false;
                if (r02 == false) {
                    if (telephonyManager != null && Gf.d.l(context, EnumC7578w.READ_PHONE_STATE.a())) {
                        String deviceId = telephonyManager.getDeviceId();
                        for (String str2 : f70544j) {
                            if (str2.equalsIgnoreCase(deviceId)) {
                                r03 = true;
                                break;
                            }
                        }
                    }
                    r03 = false;
                    if (r03 == false) {
                        if (telephonyManager != null && Gf.d.l(context, EnumC7578w.READ_PHONE_STATE.a())) {
                            String subscriberId = telephonyManager.getSubscriberId();
                            for (String str3 : f70545k) {
                                if (str3.equalsIgnoreCase(subscriberId)) {
                                    r04 = true;
                                    break;
                                }
                            }
                        }
                        r04 = false;
                        if (r04 == false) {
                        }
                    }
                }
                r12 = true;
                if (r12 == false) {
                    C7563s0.a(new byte[]{-116, 89, -114, 50, -71, -64, -111, -60, 89, 25, -38, 86, -112, 62, 115, 34});
                    if (!A(f70546l)) {
                        C7563s0.a(new byte[]{102, -78, -29, 0, 34, -98, -62, 84, 87, -100, -99, 22, 105, 93, -57, 90});
                        if (!A(f70549o)) {
                            C7563s0.a(new byte[]{-94, -59, 91, -11, -127, 118, -121, -39, -65, 0, 66, -11, -21, -79, Byte.MAX_VALUE, -22});
                            if (!A(f70550p)) {
                                File[] fileArr = f70554t;
                                int length = fileArr.length;
                                int i11 = 0;
                                loop3: while (true) {
                                    if (i11 >= length) {
                                        r122 = false;
                                        break;
                                    }
                                    File file = fileArr[i11];
                                    if (file.exists() && file.canRead()) {
                                        StringBuilder sb2 = new StringBuilder();
                                        try {
                                            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                                            while (true) {
                                                try {
                                                    String readLine = bufferedReader.readLine();
                                                    if (readLine == null) {
                                                        break;
                                                    }
                                                    sb2.append(readLine);
                                                    sb2.append('\n');
                                                } catch (Throwable th2) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (Throwable th3) {
                                                        th2.addSuppressed(th3);
                                                    }
                                                    throw th2;
                                                }
                                            }
                                            bufferedReader.close();
                                            String sb3 = sb2.toString();
                                            for (String str4 : f70547m) {
                                                if (sb3.contains(str4)) {
                                                    r122 = true;
                                                    break loop3;
                                                }
                                            }
                                        } catch (IOException unused) {
                                            continue;
                                        }
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        r12 = false;
        if (r12 == false) {
        }
        return true;
    }

    @Override // k5.v3
    @NonNull
    public final Pm0.a<?> c() {
        return this.f70558h;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70556f;
    }

    @Override // k5.InterfaceC7518g2
    /* renamed from: c, reason: collision with other method in class */
    public final InterfaceC7518g2.a mo68c() {
        return new C7487F(this);
    }
}
