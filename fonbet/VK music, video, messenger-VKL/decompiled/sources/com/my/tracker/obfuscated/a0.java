package com.my.tracker.obfuscated;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.TimeZone;
import xsna.bd3;

/* loaded from: classes.dex */
public final class a0 {
    private z a;

    public static final class a {
        static final int a = a() ? 1 : 0;

        /* JADX WARN: Can't wrap try/catch for region: R(7:54|(2:58|59)|(2:57|41)|37|38|40|41) */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0096, code lost:
        
            r0 = java.util.Locale.US;
            r3 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/" + android.os.Process.myPid() + "/mounts")));
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00c1, code lost:
        
            r0 = new java.lang.String[]{"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00cd, code lost:
        
            r4 = r3.readLine();
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00d1, code lost:
        
            if (r4 == null) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00d3, code lost:
        
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00d5, code lost:
        
            if (r5 >= 4) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00dd, code lost:
        
            if (r4.contains(r0[r5]) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x00e3, code lost:
        
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00df, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x00e8, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x00fc, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x00ee, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00f7, code lost:
        
            if (r5 != null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00f9, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x00e6, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x00ec, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x00f1, code lost:
        
            if (r5 != null) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x00f6, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x00f3, code lost:
        
            r5.close();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static boolean a() {
            int i;
            Process process;
            BufferedReader bufferedReader;
            StringBuilder sb;
            String str = Build.TAGS;
            if (str != null && str.contains("test-keys")) {
                return true;
            }
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
            for (int i2 = 0; i2 < 10; i2++) {
                if (bd3.d(strArr[i2])) {
                    return true;
                }
            }
            String[] strArr2 = {"/system/xbin/which su", "/system/bin/which su", "which su"};
            Runtime runtime = Runtime.getRuntime();
            while (true) {
                BufferedReader bufferedReader2 = null;
                try {
                    if (i < 3) {
                        try {
                            process = runtime.exec(strArr2[i]);
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                                try {
                                    sb = new StringBuilder();
                                    while (true) {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        sb.append(readLine);
                                    }
                                    process.destroy();
                                } catch (Throwable unused) {
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    i = process == null ? i + 1 : 0;
                                    process.destroy();
                                }
                            } catch (Throwable unused3) {
                            }
                        } catch (Throwable unused4) {
                            process = null;
                        }
                        if (!TextUtils.isEmpty(sb.toString())) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused5) {
                            }
                            try {
                                process.destroy();
                            } catch (Throwable unused6) {
                            }
                            return true;
                        }
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused7) {
                        }
                        process.destroy();
                    } else {
                        try {
                            break;
                        } catch (Exception unused8) {
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                } catch (Throwable unused9) {
                }
            }
            return true;
        }
    }

    private static Point b(Context context) {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            return point;
        } catch (Throwable th) {
            x2.a("DeviceParamsDataProvider: collecting screen size exception: ", th);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:9|11|12|(1:137)(3:16|17|18)|(2:20|21)|(12:23|24|25|26|27|28|29|30|31|32|33|(10:35|36|37|38|39|40|(1:42)(1:116)|43|44|(20:46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|(15:66|67|68|69|70|71|72|73|74|75|76|77|78|79|80)(12:94|70|71|72|73|74|75|76|77|78|79|80))(12:113|55|56|57|58|59|60|61|62|63|64|(0)(0)))(6:121|40|(0)(0)|43|44|(0)(0)))|131|25|26|27|28|29|30|31|32|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0094, code lost:
    
        com.my.tracker.obfuscated.x2.a("DeviceParamsDataProvider: collecting app lang exception: ", r0);
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x007c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x007d, code lost:
    
        com.my.tracker.obfuscated.x2.a("DeviceParamsDataProvider: collecting packageName exception: ", r0);
        r9 = "";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #12 {all -> 0x00af, blocks: (B:33:0x009a, B:35:0x00a0), top: B:32:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x00f3, TRY_LEAVE, TryCatch #13 {all -> 0x00f3, blocks: (B:44:0x00cf, B:46:0x00d9), top: B:43:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152 A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #3 {all -> 0x0163, blocks: (B:64:0x014c, B:66:0x0152), top: B:63:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0167  */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [int] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Point b;
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        int i4;
        float f4;
        float f5;
        String str11;
        int i5;
        long j;
        long j2;
        ?? r32;
        int i6;
        File filesDir;
        DisplayMetrics displayMetrics;
        PackageInfo a2;
        TelephonyManager telephonyManager;
        String str12 = "";
        z zVar = this.a;
        if (zVar != null) {
            return zVar;
        }
        x2.a("DeviceParamsDataProvider: collect application info...");
        String str13 = Build.DEVICE;
        String str14 = Build.MANUFACTURER;
        String str15 = Build.MODEL;
        String str16 = Build.VERSION.RELEASE;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable th) {
            th = th;
            str = "";
            str2 = str;
        }
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator) || networkOperator.length() <= 3) {
                    str3 = networkOperator;
                    str2 = "";
                } else {
                    str3 = networkOperator.substring(3);
                    try {
                        str2 = networkOperator.substring(0, 3);
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = "";
                        x2.a("DeviceParamsDataProvider: collecting telephony exception: ", th);
                        str4 = "";
                        str5 = str;
                        str7 = str2;
                        str6 = str3;
                        String str17 = context.getPackageName();
                        String str18 = context.getResources().getConfiguration().locale.getLanguage();
                        a2 = t.a(context);
                        if (a2 == null) {
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = "";
                str3 = str2;
                x2.a("DeviceParamsDataProvider: collecting telephony exception: ", th);
                str4 = "";
                str5 = str;
                str7 = str2;
                str6 = str3;
                String str172 = context.getPackageName();
                String str182 = context.getResources().getConfiguration().locale.getLanguage();
                a2 = t.a(context);
                if (a2 == null) {
                }
            }
            try {
                try {
                } catch (Throwable th4) {
                    th = th4;
                    x2.a("DeviceParamsDataProvider: collecting telephony exception: ", th);
                    str4 = "";
                    str5 = str;
                    str7 = str2;
                    str6 = str3;
                    String str1722 = context.getPackageName();
                    String str1822 = context.getResources().getConfiguration().locale.getLanguage();
                    a2 = t.a(context);
                    if (a2 == null) {
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str8 = "";
            }
            if (telephonyManager.getSimState() == 5) {
                str4 = telephonyManager.getSimOperator();
                str5 = str;
                str7 = str2;
                str6 = str3;
                String str17222 = context.getPackageName();
                String str18222 = context.getResources().getConfiguration().locale.getLanguage();
                a2 = t.a(context);
                if (a2 == null) {
                    str8 = a2.versionName;
                    try {
                        str9 = Long.toString(a2.getLongVersionCode());
                    } catch (Throwable th6) {
                        th = th6;
                        x2.a("DeviceParamsDataProvider: collecting app package info exception: ", th);
                        str9 = "";
                        str10 = str8;
                        b = b(context);
                        if (b != null) {
                        }
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                        }
                    }
                    str10 = str8;
                    b = b(context);
                    if (b != null) {
                        int i7 = b.x;
                        i2 = b.y;
                        i = i7;
                    } else {
                        i = -1;
                        i2 = -1;
                    }
                    try {
                        displayMetrics = context.getResources().getDisplayMetrics();
                    } catch (Throwable th7) {
                        th = th7;
                        f = Float.NaN;
                        f2 = Float.NaN;
                        i3 = -1;
                    }
                    if (displayMetrics != null) {
                        i3 = displayMetrics.densityDpi;
                        try {
                            f = displayMetrics.density;
                            try {
                                f2 = displayMetrics.xdpi;
                                try {
                                    f4 = displayMetrics.ydpi;
                                    f3 = f2;
                                    i4 = i3;
                                } catch (Throwable th8) {
                                    th = th8;
                                    x2.a("DeviceParamsDataProvider: collecting display metrics exception: ", th);
                                    f3 = f2;
                                    i4 = i3;
                                    f4 = Float.NaN;
                                    f5 = f;
                                    TimeZone timeZone = TimeZone.getDefault();
                                    str11 = timeZone.getDisplayName(false, 0) + " " + timeZone.getID();
                                    i5 = a.a;
                                    long j3 = -1;
                                    filesDir = context.getFilesDir();
                                    if (filesDir != null) {
                                    }
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                f2 = Float.NaN;
                                x2.a("DeviceParamsDataProvider: collecting display metrics exception: ", th);
                                f3 = f2;
                                i4 = i3;
                                f4 = Float.NaN;
                                f5 = f;
                                TimeZone timeZone2 = TimeZone.getDefault();
                                str11 = timeZone2.getDisplayName(false, 0) + " " + timeZone2.getID();
                                i5 = a.a;
                                long j32 = -1;
                                filesDir = context.getFilesDir();
                                if (filesDir != null) {
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            f = Float.NaN;
                        }
                        f5 = f;
                        try {
                            TimeZone timeZone22 = TimeZone.getDefault();
                            str11 = timeZone22.getDisplayName(false, 0) + " " + timeZone22.getID();
                        } catch (Throwable th11) {
                            x2.a("DeviceParamsDataProvider: collecting timezone exception: ", th11);
                            str11 = "";
                        }
                        try {
                            i5 = a.a;
                        } catch (Throwable th12) {
                            x2.a("DeviceParamsDataProvider: collecting isRooted exception: ", th12);
                            i5 = -1;
                        }
                        long j322 = -1;
                        try {
                            filesDir = context.getFilesDir();
                        } catch (Throwable th13) {
                            th = th13;
                            j = -1;
                        }
                        if (filesDir != null) {
                            j2 = -1;
                            str12 = Locale.getDefault().getLanguage();
                            String str19 = str12;
                            r32 = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
                            i6 = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
                            z zVar2 = new z(3, c3.a(context), str13, str16, str17222, str9, str10, str14, str15, str19, str18222, str7, str6, str5, str4, str11, i, i2, i4, f5, f3, f4, i5, j322, j2, r32, i6);
                            x2.a("DeviceParamsDataProvider: collected");
                            this.a = zVar2;
                            return zVar2;
                        }
                        j = filesDir.getTotalSpace();
                        try {
                            j322 = filesDir.getFreeSpace();
                        } catch (Throwable th14) {
                            th = th14;
                            x2.a("DeviceParamsDataProvider: collecting disk info exception: ", th);
                            long j4 = j;
                            j2 = j322;
                            j322 = j4;
                            str12 = Locale.getDefault().getLanguage();
                            String str192 = str12;
                            r32 = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
                            i6 = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
                            z zVar22 = new z(3, c3.a(context), str13, str16, str17222, str9, str10, str14, str15, str192, str18222, str7, str6, str5, str4, str11, i, i2, i4, f5, f3, f4, i5, j322, j2, r32, i6);
                            x2.a("DeviceParamsDataProvider: collected");
                            this.a = zVar22;
                            return zVar22;
                        }
                        long j42 = j;
                        j2 = j322;
                        j322 = j42;
                        try {
                            str12 = Locale.getDefault().getLanguage();
                        } catch (Throwable th15) {
                            x2.a("DeviceParamsDataProvider: collecting lang exception: ", th15);
                        }
                        String str1922 = str12;
                        try {
                            r32 = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
                        } catch (Throwable th16) {
                            x2.a("DeviceParamsDataProvider: collecting touchscreen info exception: ", th16);
                            r32 = -1;
                        }
                        try {
                            i6 = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
                        } catch (Throwable th17) {
                            x2.a("DeviceParamsDataProvider: collecting ui mode info exception: ", th17);
                            i6 = -1;
                        }
                        z zVar222 = new z(3, c3.a(context), str13, str16, str17222, str9, str10, str14, str15, str1922, str18222, str7, str6, str5, str4, str11, i, i2, i4, f5, f3, f4, i5, j322, j2, r32, i6);
                        x2.a("DeviceParamsDataProvider: collected");
                        this.a = zVar222;
                        return zVar222;
                    }
                    f5 = Float.NaN;
                    i4 = -1;
                    f3 = Float.NaN;
                    f4 = Float.NaN;
                    TimeZone timeZone222 = TimeZone.getDefault();
                    str11 = timeZone222.getDisplayName(false, 0) + " " + timeZone222.getID();
                    i5 = a.a;
                    long j3222 = -1;
                    filesDir = context.getFilesDir();
                    if (filesDir != null) {
                    }
                } else {
                    str9 = "";
                    str10 = str9;
                    b = b(context);
                    if (b != null) {
                    }
                    displayMetrics = context.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                    }
                }
            }
            str4 = "";
            str5 = str;
            str7 = str2;
            str6 = str3;
            String str172222 = context.getPackageName();
            String str182222 = context.getResources().getConfiguration().locale.getLanguage();
            a2 = t.a(context);
            if (a2 == null) {
            }
        } else {
            str7 = "";
            str6 = str7;
            str5 = str6;
            str4 = str5;
            String str1722222 = context.getPackageName();
            String str1822222 = context.getResources().getConfiguration().locale.getLanguage();
            a2 = t.a(context);
            if (a2 == null) {
            }
        }
    }
}
