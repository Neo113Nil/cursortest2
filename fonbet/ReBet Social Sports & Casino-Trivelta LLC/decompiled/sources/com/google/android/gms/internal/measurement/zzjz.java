package com.google.android.gms.internal.measurement;

import Ra.k;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import z.r;

/* loaded from: classes2.dex */
public final class zzjz {
    private static volatile k zza;

    private zzjz() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:89)(1:24)|25|26|27|28|29|30|31|(1:33)(1:81)|34|(9:36|37|38|39|40|(2:41|(3:43|(3:58|59|60)(7:45|46|(2:48|(1:51))|52|(1:54)|55|56)|57)(1:61))|62|63|64)(1:80)|65|14) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0079, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r0 = Ra.k.a();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k zza(Context context) {
        k kVar;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        k kVar2 = zza;
        if (kVar2 != null) {
            return kVar2;
        }
        synchronized (zzjz.class) {
            try {
                kVar = zza;
                if (kVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i10 = zzkb.zza;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        kVar = k.a();
                        zza = kVar;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        kVar = k.a();
                        zza = kVar;
                    }
                    Context createDeviceProtectedStorageContext = (!zzjm.zza() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    char c10 = 0;
                    File file = new File(createDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                    k a10 = file.exists() ? k.d(file) : k.a();
                    if (a10.c()) {
                        File file2 = (File) a10.b();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                r rVar = new r();
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        StringBuilder sb2 = new StringBuilder(readLine.length() + 9);
                                        sb2.append("Invalid: ");
                                        sb2.append(readLine);
                                        Log.e("HermeticFileOverrides", sb2.toString());
                                    } else {
                                        String str3 = new String(split[c10]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        r rVar2 = (r) rVar.get(str3);
                                        if (rVar2 == null) {
                                            rVar2 = new r();
                                            rVar.put(str3, rVar2);
                                        }
                                        rVar2.put(decode, str4);
                                        c10 = 0;
                                    }
                                }
                                String obj = file2.toString();
                                String packageName = createDeviceProtectedStorageContext.getPackageName();
                                StringBuilder sb3 = new StringBuilder(obj.length() + 28 + String.valueOf(packageName).length());
                                sb3.append("Parsed ");
                                sb3.append(obj);
                                sb3.append(" for Android package ");
                                sb3.append(packageName);
                                Log.w("HermeticFileOverrides", sb3.toString());
                                zzjt zzjtVar = new zzjt(rVar);
                                bufferedReader.close();
                                kVar = k.d(zzjtVar);
                            } catch (Throwable th2) {
                                try {
                                    bufferedReader.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        }
                    } else {
                        kVar = k.a();
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    zza = kVar;
                }
            } catch (Throwable th4) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th4;
            } finally {
            }
        }
        return kVar;
    }
}
