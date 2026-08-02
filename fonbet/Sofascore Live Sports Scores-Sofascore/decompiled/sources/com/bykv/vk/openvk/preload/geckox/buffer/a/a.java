package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import defpackage.yhk;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;

    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file, long j) throws IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a b = b(file, j);
        GeckoLogger.d("gecko-debug-tag", "buffer type:" + b.getClass());
        return b;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file, long j) throws IOException {
        if (j <= 0) {
            try {
                return new b(file);
            } catch (Exception e) {
                yhk.n("create FileBuffer failed! file:", file.getAbsolutePath(), " caused by:", e.getMessage(), e);
                return null;
            }
        }
        try {
            return new c(j, file);
        } catch (Exception e2) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e2.getMessage(), e2);
        }
    }
}
