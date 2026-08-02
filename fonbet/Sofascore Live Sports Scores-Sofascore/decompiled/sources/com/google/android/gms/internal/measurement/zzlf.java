package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import defpackage.b6f;
import defpackage.dh0;
import defpackage.fhh;
import defpackage.kvd;
import defpackage.p0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlf {
    public static volatile kvd a;

    private zzlf() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:22)|23|24|25|26|27|28|29|(1:31)(1:78)|32|(9:34|35|36|37|38|(2:39|(3:41|(3:56|57|58)(7:43|44|(2:46|(1:49))|50|(1:52)|53|54)|55)(1:59))|60|61|62)(1:77)|63|14) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x006c, code lost:
    
        r4 = defpackage.p0.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kvd a(Context context) {
        kvd kvdVar;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        kvd kvdVar2;
        kvd kvdVar3 = a;
        if (kvdVar3 != null) {
            return kvdVar3;
        }
        synchronized (zzlf.class) {
            try {
                kvdVar = a;
                if (kvdVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    dh0 dh0Var = zzlg.a;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        kvdVar = p0.a;
                        a = kvdVar;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        kvdVar = p0.a;
                        a = kvdVar;
                    }
                    if (!context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    kvd kvdVar4 = file.exists() ? new b6f(file) : p0.a;
                    if (kvdVar4.g()) {
                        File file2 = (File) kvdVar4.d();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                fhh fhhVar = new fhh(0);
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        new StringBuilder(readLine.length() + 9);
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
                                        fhh fhhVar2 = (fhh) fhhVar.get(str3);
                                        if (fhhVar2 == null) {
                                            fhhVar2 = new fhh(0);
                                            fhhVar.put(str3, fhhVar2);
                                        }
                                        fhhVar2.put(decode, str4);
                                    }
                                }
                                new StringBuilder(file2.toString().length() + 28 + String.valueOf(context.getPackageName()).length());
                                zzle zzleVar = new zzle(fhhVar);
                                bufferedReader.close();
                                kvdVar2 = new b6f(zzleVar);
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        kvdVar2 = p0.a;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    kvdVar = kvdVar2;
                    a = kvdVar;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th2;
            } finally {
            }
        }
        return kvdVar;
    }
}
