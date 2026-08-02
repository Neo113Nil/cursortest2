package com.fyber.inneractive.sdk.player.cache;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.fc6;
import defpackage.is8;
import java.io.File;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class l {
    public static final Charset a = Charset.forName(C.ASCII_NAME);

    static {
        Charset.forName(C.UTF8_NAME);
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            is8.e(fc6.k(file, "not a readable directory: "));
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                is8.e(fc6.k(file2, "failed to delete file: "));
                return;
            }
        }
    }
}
