package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.Properties;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class mu implements Thread.UncaughtExceptionHandler {
    public static volatile boolean pcc;
    private String gm;
    private final Thread.UncaughtExceptionHandler sf = Thread.getDefaultUncaughtExceptionHandler();

    private mu() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        sf();
    }

    private void gm() {
        try {
            com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc());
        } catch (Throwable unused) {
        }
        try {
            if (sf.oo()) {
                com.bytedance.sdk.openadsdk.component.reward.lu.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).vj();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.nac.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc();
            }
        } catch (Throwable unused2) {
        }
        try {
            if (sf.oo()) {
                com.bytedance.sdk.openadsdk.component.reward.qf.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).vj();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.wh.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc();
            }
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.vh.sf().pcc();
        } catch (Throwable unused4) {
        }
        try {
            com.bytedance.sdk.component.adexpress.pcc.sf.sf.sf();
        } catch (Throwable unused5) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Properties] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(Thread thread, Throwable th) {
        ?? r12;
        boolean z;
        int i;
        FileInputStream fileInputStream = null;
        try {
            if (TextUtils.isEmpty(this.gm)) {
                sf();
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = 0;
        }
        if (TextUtils.isEmpty(this.gm)) {
            return;
        }
        File file = new File(this.gm, "tt_crash_count.properties");
        if (file.exists() && file.isFile() && file.canRead()) {
            ?? properties = new Properties();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                properties.load(fileInputStream2);
                String property = properties.getProperty("crash_count", "0");
                String property2 = properties.getProperty("crash_last_time", "0");
                int intValue = Integer.valueOf(property).intValue();
                if (System.currentTimeMillis() - Long.valueOf(property2).longValue() < 300000) {
                    i = intValue + 1;
                    z = false;
                } else {
                    z = true;
                    i = 1;
                }
                boolean z2 = i >= 3;
                int i2 = z2 ? 0 : i;
                if (z2) {
                    try {
                        file.delete();
                    } catch (Throwable unused) {
                    }
                } else {
                    properties.setProperty("crash_count", String.valueOf(i2));
                    if (z) {
                        properties.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                    }
                    r12 = new FileOutputStream(file);
                    try {
                        properties.store(r12, "tt_crash_info");
                        fileInputStream = r12;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = fileInputStream2;
                        com.bytedance.sdk.component.utils.lo.pcc("TTCrashHandler", "crash count error", th);
                        if (fileInputStream != null) {
                        }
                        if (r12 == 0) {
                        }
                        r12.close();
                    }
                }
                if (z2) {
                    gm();
                }
                r12 = fileInputStream;
                fileInputStream = fileInputStream2;
            } catch (Throwable th4) {
                th = th4;
                r12 = fileInputStream;
            }
        } else {
            ?? properties2 = new Properties();
            properties2.setProperty("crash_count", "1");
            properties2.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
            r12 = new FileOutputStream(file);
            try {
                properties2.store(r12, "tt_crash_info");
                r12 = r12;
            } catch (Throwable th5) {
                th = th5;
                try {
                    com.bytedance.sdk.component.utils.lo.pcc("TTCrashHandler", "crash count error", th);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (r12 == 0) {
                        return;
                    }
                    r12.close();
                } finally {
                }
            }
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (Throwable unused3) {
            }
        }
        if (r12 == 0) {
            return;
        }
        try {
            r12.close();
        } catch (Throwable unused4) {
        }
    }

    private void sf() {
        Context pcc2 = com.bytedance.sdk.openadsdk.core.lu.pcc();
        if (pcc2 == null) {
            return;
        }
        try {
            File file = new File(pcc2.getFilesDir(), "TTCache");
            file.mkdirs();
            this.gm = file.getPath();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        pcc = true;
        com.bytedance.sdk.component.utils.kj.pcc = true;
        com.bytedance.sdk.component.kj.sf.vj.gm = true;
        boolean z = false;
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (stringWriter2 != null) {
                z = stringWriter2.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (z) {
            pcc(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.sf;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    public static mu pcc() {
        return new mu();
    }
}
