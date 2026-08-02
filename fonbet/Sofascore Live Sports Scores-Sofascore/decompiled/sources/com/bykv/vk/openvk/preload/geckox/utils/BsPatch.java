package com.bykv.vk.openvk.preload.geckox.utils;

import defpackage.i3c;
import defpackage.lnb;
import defpackage.yhk;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class BsPatch {
    static {
        System.loadLibrary("geckox_bspatch");
    }

    public static void a(File file, File file2, File file3, String str) throws Exception {
        if (!file.exists()) {
            yhk.i(file.getAbsolutePath(), "full package not exist：");
            return;
        }
        if (!file2.exists()) {
            yhk.i(file2.getAbsolutePath(), "patch package not exist：");
            return;
        }
        file3.mkdirs();
        File file4 = new File(file3, str);
        file4.delete();
        int patch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
        if (patch == 0) {
            return;
        }
        StringBuilder t = lnb.t(patch, "patch merged failed, code：", " full:");
        t.append(file.getAbsolutePath());
        t.append(" patch:");
        t.append(file2.getAbsolutePath());
        t.append(" dest:");
        i3c.n(t, file4.getAbsolutePath());
    }

    private static native int patch(String str, String str2, String str3) throws Exception;
}
