package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.geckox.e.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class a {
    private String a;
    private String b;
    private volatile File c;
    private volatile Long d;
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a e;
    private AtomicBoolean f = new AtomicBoolean(false);

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(String str) throws Exception {
        if (this.e != null) {
            return this.e;
        }
        File e = e(str);
        if (e == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(e, "res.macv");
        File file2 = new File(e, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.e = new c(e);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + e.getAbsolutePath());
            }
            this.e = new com.bykv.vk.openvk.preload.geckox.e.a.b(e);
        }
        return this.e;
    }

    private synchronized File e(String str) throws Exception {
        if (this.c != null) {
            return this.c;
        }
        if (this.d != null && this.d.longValue() == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b a = com.bykv.vk.openvk.preload.geckox.f.b.a(sb.toString());
        try {
            if (this.d == null) {
                this.d = g.a(new File(this.a, str));
            }
            if (this.d == null) {
                this.d = -1L;
                a.a();
                return null;
            }
            File file = new File(this.a, str2 + str + str2 + this.d + str2 + "using.lock");
            this.c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            File file2 = this.c;
            a.a();
            return file2;
        } catch (Throwable th) {
            a.a();
            throw th;
        }
    }

    public final InputStream a(String str) throws Exception {
        return d(this.b).a(a(this.b, str));
    }

    public final boolean b(String str) throws Exception {
        return d(this.b).b(a(this.b, str));
    }

    public final void c() throws Exception {
        if (this.f.getAndSet(true)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        String str = File.separator;
        sb.append(str);
        sb.append(this.b);
        sb.append(str);
        sb.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b a = com.bykv.vk.openvk.preload.geckox.f.b.a(sb.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.c == null) {
                return;
            }
            com.bykv.vk.openvk.preload.geckox.f.c.b(this.c.getAbsolutePath() + str + "using.lock");
            a.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.a + str + this.b);
        } finally {
            a.a();
        }
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    public final String b() {
        return this.b;
    }

    public final Long a() {
        return this.d;
    }

    public final int c(String str) {
        try {
            File file = new File(e(str), "res");
            if (!file.exists() || !file.isDirectory()) {
                return 0;
            }
            int length = file.listFiles().length;
            if (length > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
