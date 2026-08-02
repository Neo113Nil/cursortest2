package com.inmobi.media;

import defpackage.b28;
import defpackage.me4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.gc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3443gc {
    public static final boolean a(String str, String str2, String str3) {
        me4.p(str, str2, str3);
        try {
            a(str3);
            File file = new File(str3);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final String b(String str) {
        str.getClass();
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            try {
                return b28.a(file);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final void a(String str) {
        str.getClass();
        File file = new File(str);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
