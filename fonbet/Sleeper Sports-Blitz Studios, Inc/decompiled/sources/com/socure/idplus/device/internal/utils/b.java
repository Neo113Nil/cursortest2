package com.socure.idplus.device.internal.utils;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* loaded from: classes8.dex */
public abstract class b {
    public static boolean a() {
        boolean z = false;
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", CmcdConfiguration.KEY_STARTUP});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                z = true;
            }
        } catch (Throwable th) {
            try {
                com.socure.idplus.device.internal.logger.b.a("DeviceUtils", "could not fetch process " + th);
            } finally {
                if (process != null) {
                    process.destroy();
                }
            }
        }
        return z;
    }
}
