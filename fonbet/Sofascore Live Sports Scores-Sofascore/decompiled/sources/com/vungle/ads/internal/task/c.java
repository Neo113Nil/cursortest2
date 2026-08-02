package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.joa;
import defpackage.ph0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c implements d {
    public final Context a;
    public final PathProvider b;

    static {
        new a();
    }

    public c(Context context, PathProvider pathProvider) {
        context.getClass();
        pathProvider.getClass();
        this.a = context;
        this.b = pathProvider;
    }

    public final void a() {
        joa a = ypa.a(ysa.a, new b(this.a));
        int a2 = ((FilePreferences) a.getValue()).a("VERSION_CODE", -1);
        if (a2 < 70704) {
            if (a2 < 70000) {
                boolean z = u.a;
                t.a("CleanupJob", "CleanupJob: drop old files data");
                File file = new File(this.a.getNoBackupFilesDir(), "vungle_db");
                if (file.exists()) {
                    com.vungle.ads.internal.util.n.a(file, (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(file.getPath() + "-journal"), (Set) null);
                } else {
                    this.a.deleteDatabase("vungle_db");
                }
                String string = this.a.getSharedPreferences("com.vungle.sdk", 0).getString("cache_path", null);
                this.a.deleteSharedPreferences("com.vungle.sdk");
                File noBackupFilesDir = this.a.getNoBackupFilesDir();
                noBackupFilesDir.getClass();
                com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir, "vungle_settings"), (Set) null);
                if (string != null) {
                    com.vungle.ads.internal.util.n.a(new File(string), (Set) null);
                }
            }
            if (a2 < 70100) {
                com.vungle.ads.internal.util.n.a(new File(this.a.getApplicationInfo().dataDir, "vungle"), (Set) null);
            }
            if (a2 < 70301) {
                try {
                    com.vungle.ads.internal.util.n.a(new File(this.b.a(), "vungleSettings"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(this.b.a(), "failedTpatSet"), (Set) null);
                } catch (Exception e) {
                    boolean z2 = u.a;
                    t.a("CleanupJob", "Failed to delete temp data", e);
                }
            }
            if (a2 < 70500) {
                File noBackupFilesDir2 = this.a.getNoBackupFilesDir();
                try {
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir2, "failedTpats"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir2, "failedGenericTpats"), (Set) null);
                } catch (Exception e2) {
                    boolean z3 = u.a;
                    t.a("CleanupJob", "Failed to delete 742 tpat data", e2);
                }
            }
            if (a2 < 70600) {
                File noBackupFilesDir3 = this.a.getNoBackupFilesDir();
                try {
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir3, "vungle_cache/downloads"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir3, "vungle_cache/js"), (Set) null);
                } catch (Exception e3) {
                    boolean z4 = u.a;
                    t.a("CleanupJob", "Failed to delete 750 data", e3);
                }
            }
            ((FilePreferences) a.getValue()).b("VERSION_CODE", BuildConfig.VERSION_CODE).b();
        }
    }

    @Override // com.vungle.ads.internal.task.d
    public final int a(Bundle bundle, h hVar) {
        File file;
        bundle.getClass();
        hVar.getClass();
        File vmDir = this.b.getVmDir();
        String string = bundle.getString("AD_ID_KEY");
        if (string == null || (file = this.b.b(string)) == null) {
            file = vmDir;
        }
        boolean z = u.a;
        t.a("CleanupJob", "CleanupJob: Current directory snapshot");
        try {
            if (!Intrinsics.c(file, vmDir)) {
                com.vungle.ads.internal.util.n.a(file, (Set) null);
                return 0;
            }
            a();
            com.vungle.ads.internal.util.n.b(file, ph0.a0(new String[]{"omsdk.js", "omsdk-session.js"}));
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }
}
