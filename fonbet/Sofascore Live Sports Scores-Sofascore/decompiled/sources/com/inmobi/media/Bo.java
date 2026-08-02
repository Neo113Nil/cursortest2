package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.tub;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Bo {
    public P5 a;
    public final Ao b;

    public Bo(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        context.getClass();
        webAssetCacheConfig.getClass();
        this.b = new Ao();
        AbstractC3424fj.g.submit(new defpackage.p3(7, webAssetCacheConfig, this, context));
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j) {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        webAssetCacheConfig.getClass();
        long min = (j == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j * webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent()) / 100))) * 1048576;
        Ao ao = this.b;
        Pattern pattern = P5.p;
        if (min <= 0) {
            a70.p("maxSize <= 0");
            return;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        P5 p5 = new P5(file, min, ao);
        if (p5.c.exists()) {
            try {
                p5.b();
                p5.a();
                p5.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(p5.c, true), Al.a));
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                p5.close();
                Al.a(p5.b);
            }
            this.a = p5;
        }
        file.mkdirs();
        p5 = new P5(file, min, ao);
        p5.c();
        this.a = p5;
    }

    public final boolean a(String str, String str2, InterfaceC3880x9 interfaceC3880x9) {
        String valueOf;
        P5 p5;
        OutputStreamWriter outputStreamWriter;
        str.getClass();
        str2.getClass();
        if (this.a == null) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WebAssetLRUCacheHelper", dmi.q("Disk Cache Failed to Initialize. Failed writeToCache: ", str));
            }
            return false;
        }
        try {
            valueOf = String.valueOf(str.hashCode());
            p5 = this.a;
            outputStreamWriter = null;
        } catch (Exception e) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WebAssetLRUCacheHelper", fc6.n("Failed to write to cache diskLruCache with: ", e.getMessage(), " for ", str));
            }
        }
        if (p5 == null) {
            Intrinsics.i("diskLruCache");
            throw null;
        }
        L5 a = p5.a(valueOf);
        if (a == null) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for ".concat(str));
            }
            return false;
        }
        try {
            OutputStream a2 = a.a(0);
            Charset charset = Al.b;
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(a2, charset);
            try {
                outputStreamWriter2.write(str);
                Al.a(outputStreamWriter2);
                try {
                    OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(a.a(1), charset);
                    try {
                        outputStreamWriter3.write(str2);
                        Al.a(outputStreamWriter3);
                        boolean z = a.c;
                        P5 p52 = a.d;
                        if (z) {
                            p52.a(a, false);
                            a.d.d(a.a.a);
                        } else {
                            p52.a(a, true);
                        }
                        return true;
                    } catch (Throwable th) {
                        th = th;
                        outputStreamWriter = outputStreamWriter3;
                        Al.a(outputStreamWriter);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStreamWriter = outputStreamWriter2;
                Al.a(outputStreamWriter);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, Bo bo, Context context) {
        try {
            F5.a.getClass();
            long j = F5.c;
            if (j < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                bo.getClass();
                a(context, j);
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa.a(Pa.a(context, "web_asset_file_key"), "cache_enabled", false);
                return;
            }
            bo.a(context, webAssetCacheConfig, j);
            ConcurrentHashMap concurrentHashMap2 = Qa.b;
            Qa.a(Pa.a(context, "web_asset_file_key"), "cache_enabled", true);
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e));
            e.getMessage();
        }
    }

    public final InputStream a(String str, InterfaceC3880x9 interfaceC3880x9) {
        O5 b;
        str.getClass();
        P5 p5 = this.a;
        if (p5 == null) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WebAssetLRUCacheHelper", dmi.q("Disk Cache Failed to Initialize. Failed readFromCache: ", str));
            }
            return null;
        }
        try {
            b = p5.b(String.valueOf(str.hashCode()));
        } catch (Exception e) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WebAssetLRUCacheHelper", fc6.n("Failed to read from cache with: ", e.getMessage(), " for ", str));
            }
        }
        if (b != null && str.equals(Al.a(new InputStreamReader(b.a[0], Al.b)))) {
            return b.a[1];
        }
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for ".concat(str));
        }
        return null;
    }

    public static void a(Context context, long j) {
        Pair pair = new Pair("size", Long.valueOf(j));
        ConcurrentHashMap concurrentHashMap = Qa.b;
        LinkedHashMap i = tub.i(pair, new Pair("state", Boolean.valueOf(Pa.a(context, "web_asset_file_key").a.getBoolean("cache_enabled", false))));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("LowAvailableSpaceForCache", i, EnumC3943zk.SDK);
    }
}
