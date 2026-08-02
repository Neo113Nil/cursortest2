package com.bykv.vk.openvk.preload.geckox.e.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import defpackage.is8;
import defpackage.mz1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c extends a {
    public c(File file) {
        super(file);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    public final InputStream a(File file, String str) throws IOException {
        File file2 = new File(file, mz1.o(new StringBuilder("res"), File.separator, str));
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            GeckoLogger.d("gecko-debug-tag", "NormalFileLoader, file:", file2.getAbsolutePath());
            return new FileInputStream(file2.getCanonicalFile());
        }
        is8.e("file not found");
        return null;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    public final boolean b(File file, String str) throws IOException {
        return new File(file, mz1.o(new StringBuilder("res"), File.separator, str)).exists();
    }
}
