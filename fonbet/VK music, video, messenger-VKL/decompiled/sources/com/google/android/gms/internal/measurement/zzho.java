package com.google.android.gms.internal.measurement;

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
import xsna.dpj0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzho {
    private static volatile zzig zza;

    private zzho() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|(5:8|(1:10)|11|12|13)|14|(5:16|(1:18)|11|12|13)|19|(1:23)|24|25|26|27|28|29|30|(1:32)(1:82)|33|(9:35|36|37|38|39|(2:40|(3:42|(3:57|58|59)(7:44|45|(2:47|(1:50))|51|(1:53)|54|55)|56)(1:60))|61|62|63)(1:81)|64|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x006f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0070, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
        r3 = com.google.android.gms.internal.measurement.zzig.zzc();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzig zza(Context context) {
        zzig zzigVar;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        zzig zzc;
        synchronized (zzho.class) {
            try {
                zzigVar = zza;
                if (zzigVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        zzc = zzig.zzc();
                        zzigVar = zzc;
                        zza = zzigVar;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        zzc = zzig.zzc();
                        zzigVar = zzc;
                        zza = zzigVar;
                    }
                    if (zzhb.zzb() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    zzig zzc2 = file.exists() ? zzig.zzd(file) : zzig.zzc();
                    if (zzc2.zzb()) {
                        File file2 = (File) zzc2.zza();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                dpj0 dpj0Var = new dpj0();
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                    } else {
                                        String str3 = new String(split[0]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        if (!dpj0Var.containsKey(str3)) {
                                            dpj0Var.put(str3, new dpj0());
                                        }
                                        ((dpj0) dpj0Var.get(str3)).put(decode, str4);
                                    }
                                }
                                file2.toString();
                                context.getPackageName();
                                zzhh zzhhVar = new zzhh(dpj0Var);
                                bufferedReader.close();
                                zzc = zzig.zzd(zzhhVar);
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        zzc = zzig.zzc();
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    zzigVar = zzc;
                    zza = zzigVar;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th2;
            } finally {
            }
        }
        return zzigVar;
    }
}
