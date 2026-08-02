package io.sentry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6 f16210b;

    public /* synthetic */ b4(b6 b6Var, int i5) {
        this.f16209a = i5;
        this.f16210b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16209a) {
            case 0:
                this.f16210b.loadLazyFields();
                return;
            case 1:
                b6 b6Var = this.f16210b;
                String cacheDirPathWithoutDsn = b6Var.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        io.sentry.config.a.g(file);
                        if (b6Var.isEnableAppStartProfiling() || b6Var.isStartProfilerOnAppStart()) {
                            if (!b6Var.isStartProfilerOnAppStart() && !b6Var.isTracingEnabled()) {
                                b6Var.getLogger().h(b5.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                e4 e4Var = new e4(b6Var, b6Var.isEnableAppStartProfiling() ? b6Var.getInternalTracesSampler().a(new l1.a(new v6("app.launch", io.sentry.protocol.h0.CUSTOM, "profile", null), Double.valueOf(io.sentry.util.j.a().c()))) : new c4.d(Boolean.FALSE, (Double) null));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, d4.f16310e));
                                    try {
                                        b6Var.getSerializer().a(e4Var, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        b6Var.getLogger().e(b5.ERROR, "Unable to create app start profiling config file. ", th2);
                        return;
                    }
                }
                return;
            case 2:
                b6 b6Var2 = this.f16210b;
                for (u0 u0Var : b6Var2.getOptionsObservers()) {
                    String release = b6Var2.getRelease();
                    io.sentry.cache.e eVar = (io.sentry.cache.e) u0Var;
                    if (release == null) {
                        eVar.a("release.json");
                    } else {
                        eVar.b(release, "release.json");
                    }
                    String proguardUuid = b6Var2.getProguardUuid();
                    if (proguardUuid == null) {
                        eVar.a("proguard-uuid.json");
                    } else {
                        eVar.b(proguardUuid, "proguard-uuid.json");
                    }
                    io.sentry.protocol.t sdkVersion = b6Var2.getSdkVersion();
                    if (sdkVersion == null) {
                        eVar.a("sdk-version.json");
                    } else {
                        eVar.b(sdkVersion, "sdk-version.json");
                    }
                    String dist = b6Var2.getDist();
                    if (dist == null) {
                        eVar.a("dist.json");
                    } else {
                        eVar.b(dist, "dist.json");
                    }
                    String environment = b6Var2.getEnvironment();
                    if (environment == null) {
                        eVar.a("environment.json");
                    } else {
                        eVar.b(environment, "environment.json");
                    }
                    eVar.b(b6Var2.getTags(), "tags.json");
                    Double d10 = b6Var2.getSessionReplay().f16401b;
                    if (d10 == null) {
                        eVar.a("replay-error-sample-rate.json");
                    } else {
                        eVar.b(d10.toString(), "replay-error-sample-rate.json");
                    }
                }
                io.sentry.cache.g findPersistingScopeObserver = b6Var2.findPersistingScopeObserver();
                if (findPersistingScopeObserver != null) {
                    try {
                        ((io.sentry.cache.tape.e) findPersistingScopeObserver.f16255b.a()).clear();
                    } catch (IOException e7) {
                        findPersistingScopeObserver.f16254a.getLogger().e(b5.ERROR, "Failed to clear breadcrumbs from file queue", e7);
                    }
                    findPersistingScopeObserver.k("user.json");
                    findPersistingScopeObserver.k("level.json");
                    findPersistingScopeObserver.k("request.json");
                    findPersistingScopeObserver.k("fingerprint.json");
                    findPersistingScopeObserver.k("contexts.json");
                    findPersistingScopeObserver.k("extras.json");
                    findPersistingScopeObserver.k("tags.json");
                    findPersistingScopeObserver.k("trace.json");
                    findPersistingScopeObserver.k("transaction.json");
                    return;
                }
                return;
            default:
                d4.d().b(this.f16210b.getFlushTimeoutMillis());
                return;
        }
    }
}
