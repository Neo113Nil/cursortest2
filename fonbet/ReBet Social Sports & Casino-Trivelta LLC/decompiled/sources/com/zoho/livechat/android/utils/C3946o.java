package com.zoho.livechat.android.utils;

import android.content.Context;
import java.io.File;

/* renamed from: com.zoho.livechat.android.utils.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3946o {

    /* renamed from: a, reason: collision with root package name */
    public File f44558a;

    public C3946o(Context context) {
        if (context.getExternalCacheDir() != null) {
            this.f44558a = context.getExternalCacheDir();
        } else {
            this.f44558a = context.getCacheDir();
        }
        File file = new File(this.f44558a, "Mobilisten");
        this.f44558a = file;
        if (file.exists()) {
            return;
        }
        this.f44558a.mkdirs();
    }

    public static boolean c(File file) {
        try {
            if (file.getCanonicalPath().contains("Mobilisten")) {
                return file.createNewFile();
            }
            return false;
        } catch (Throwable th2) {
            LiveChatUtil.log(th2);
            return false;
        }
    }

    public static boolean d(File file) {
        try {
            if (file.getCanonicalPath().contains("Mobilisten")) {
                return file.delete();
            }
            return false;
        } catch (Throwable th2) {
            LiveChatUtil.log(th2);
            return false;
        }
    }

    public boolean a(Context context) {
        return b(context, null);
    }

    public boolean b(Context context, File file) {
        if (file == null) {
            file = this.f44558a;
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        file2.delete();
                    } else if (file2.isDirectory()) {
                        b(context, file2);
                        file2.delete();
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public File e() {
        if (!this.f44558a.exists()) {
            this.f44558a.mkdirs();
        }
        return this.f44558a;
    }
}
