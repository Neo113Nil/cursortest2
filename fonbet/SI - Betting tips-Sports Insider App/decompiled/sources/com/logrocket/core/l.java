package com.logrocket.core;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import io.appmetrica.analytics.impl.Sb;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.q0;
import io.sentry.b5;
import java.io.File;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6622c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6623d;

    public /* synthetic */ l(int i5, Object obj, Object obj2, boolean z5) {
        this.f6620a = i5;
        this.f6622c = obj;
        this.f6623d = obj2;
        this.f6621b = z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        r2 = new android.os.StatFs(r8.getPath());
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        StatFs statFs;
        Long l6;
        File[] externalFilesDirs;
        File file;
        Long l10;
        Long l11;
        switch (this.f6620a) {
            case 0:
                LogRocketCore logRocketCore = (LogRocketCore) this.f6622c;
                f0 f0Var = (f0) this.f6623d;
                boolean z5 = this.f6621b;
                f0 f0Var2 = logRocketCore.N;
                logRocketCore.N = f0Var;
                v9.d dVar = logRocketCore.j;
                dVar.f24475c.clear();
                dVar.f24476d.clear();
                dVar.f24477e.clear();
                dVar.f24478f.clear();
                synchronized (dVar.f24489s) {
                    dVar.f24479g.clear();
                    dVar.f24480h.clear();
                    dVar.f24481i.clear();
                    dVar.f24484m.clear();
                }
                dVar.f24486o.clear();
                dVar.f24487p.clear();
                dVar.q.clear();
                dVar.f24488r.clear();
                dVar.j.set(true);
                dVar.f24483l = null;
                dVar.f24485n = Boolean.FALSE;
                logRocketCore.f6387k.set(false);
                logRocketCore.f6463b.clear();
                logRocketCore.j();
                logRocketCore.f6382e.a("Starting new session: " + logRocketCore.N.c());
                if (z5) {
                    try {
                        logRocketCore.f6399x.K(f0Var2);
                    } catch (y9.l e7) {
                        logRocketCore.f6382e.e("Error while starting new session.", e7);
                        logRocketCore.s(e7.f25758a);
                        return;
                    }
                }
                logRocketCore.f6399x.N(logRocketCore.N);
                s.a(false);
                logRocketCore.p();
                logRocketCore.o();
                y9.m mVar = logRocketCore.f6384g;
                if (mVar.f25767h.compareAndSet(false, true)) {
                    aa.j.a("logrocket-relay").execute(new io.sentry.android.replay.util.c(21, mVar, f0Var));
                }
                logRocketCore.f6383f.getClass();
                logRocketCore.f6385h.b();
                return;
            case 1:
                Sb.a((Sb) this.f6622c, (LocationControllerObserver) this.f6623d, this.f6621b);
                return;
            default:
                q0 q0Var = (q0) this.f6622c;
                io.sentry.protocol.f fVar = (io.sentry.protocol.f) this.f6623d;
                boolean z7 = this.f6621b;
                Context context = q0Var.f15818a;
                SentryAndroidOptions sentryAndroidOptions = q0Var.f15819b;
                File dataDirectory = Environment.getDataDirectory();
                Long l12 = null;
                if (dataDirectory != null) {
                    StatFs statFs2 = new StatFs(dataDirectory.getPath());
                    try {
                        l10 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting total internal storage amount.", th2);
                        l10 = null;
                    }
                    fVar.q = l10;
                    try {
                        l11 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                    } catch (Throwable th3) {
                        sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting unused internal storage amount.", th3);
                        l11 = null;
                    }
                    fVar.f16791r = l11;
                }
                if (z7) {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    try {
                        externalFilesDirs = context.getExternalFilesDirs(null);
                    } catch (Throwable unused) {
                        sentryAndroidOptions.getLogger().h(b5.INFO, "Not possible to read external files directory", new Object[0]);
                    }
                    if (externalFilesDirs != null) {
                        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
                        int length = externalFilesDirs.length;
                        for (int i5 = 0; i5 < length; i5++) {
                            file = externalFilesDirs[i5];
                            if (file != null) {
                                if (absolutePath != null && !absolutePath.isEmpty() && file.getAbsolutePath().contains(absolutePath)) {
                                }
                                statFs = null;
                                if (statFs == null) {
                                    try {
                                        l6 = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                    } catch (Throwable th4) {
                                        sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting total external storage amount.", th4);
                                        l6 = null;
                                    }
                                    fVar.f16792s = l6;
                                    try {
                                        l12 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                    } catch (Throwable th5) {
                                        sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting unused external storage amount.", th5);
                                    }
                                    fVar.f16793t = l12;
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        sentryAndroidOptions.getLogger().h(b5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                    }
                    file = null;
                    statFs = null;
                    if (statFs == null) {
                    }
                    break;
                } else {
                    return;
                }
        }
    }
}
