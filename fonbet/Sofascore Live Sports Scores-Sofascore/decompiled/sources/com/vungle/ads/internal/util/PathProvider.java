package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/util/PathProvider;", "", "Ljava/io/File;", "getCleverCacheDir", "getVmDir", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class PathProvider {
    public final Context a;
    public final File b;
    public final File c;
    public final File d;

    public PathProvider(Context context) {
        context.getClass();
        this.a = context;
        File file = new File(context.getNoBackupFilesDir(), "vungle_cache");
        this.b = file;
        File file2 = new File(file, "adAssets");
        this.c = file2;
        File file3 = new File(file, "clever_cache");
        this.d = file3;
        for (File file4 : kotlin.collections.b.j(file, file2, file3)) {
            if (!file4.exists()) {
                file4.mkdirs();
            }
        }
    }

    public static long a(String str) {
        str.getClass();
        try {
            return new StatFs(str).getAvailableBytes();
        } catch (IllegalArgumentException e) {
            boolean z = u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Failed to get available bytes ");
            a.append(e.getMessage());
            t.c("PathProvider", a.toString());
            return -1L;
        }
    }

    public final File b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        File file = new File(getVmDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File c() {
        if (!this.b.exists()) {
            this.b.mkdirs();
        }
        return this.b;
    }

    @NotNull
    public final File getCleverCacheDir() {
        if (!this.d.exists()) {
            this.d.mkdirs();
        }
        return this.d;
    }

    @NotNull
    public final File getVmDir() {
        if (!this.c.exists()) {
            this.c.mkdirs();
        }
        return this.c;
    }

    public final File b() {
        return new File(a(), "unclosed_ad");
    }

    public final File a() {
        File noBackupFilesDir = this.a.getNoBackupFilesDir();
        noBackupFilesDir.getClass();
        return noBackupFilesDir;
    }
}
