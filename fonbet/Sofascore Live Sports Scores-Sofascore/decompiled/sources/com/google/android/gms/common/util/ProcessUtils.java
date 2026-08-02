package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class ProcessUtils {
    public static String a;
    public static int b;
    public static Boolean c;

    private ProcessUtils() {
    }

    public static String a() {
        BufferedReader bufferedReader;
        String str = a;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            a = processName;
            return processName;
        }
        int i = b;
        if (i == 0) {
            i = Process.myPid();
            b = i;
        }
        String str2 = null;
        str2 = null;
        str2 = null;
        BufferedReader bufferedReader2 = null;
        if (i > 0) {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 14);
                sb.append("/proc/");
                sb.append(i);
                sb.append("/cmdline");
                String sb2 = sb.toString();
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    bufferedReader = new BufferedReader(new FileReader(sb2));
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            } catch (IOException unused) {
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                String readLine = bufferedReader.readLine();
                Preconditions.i(readLine);
                str2 = readLine.trim();
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                IOUtils.a(bufferedReader2);
                throw th;
            }
            IOUtils.a(bufferedReader);
        }
        a = str2;
        return str2;
    }

    public static boolean b() {
        Boolean bool = c;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object a2 = zzj.a(Process.class, "isIsolated", new zzi[0]);
                    Object[] objArr = new Object[0];
                    if (a2 == null) {
                        throw new zzy(zzx.a("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) a2;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            c = bool;
        }
        return bool.booleanValue();
    }
}
