package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418q0 implements Ba {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14493a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f14494b;

    /* renamed from: c, reason: collision with root package name */
    public final C0117e4 f14495c = new C0117e4();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f14496d = f().getHandler();

    /* renamed from: e, reason: collision with root package name */
    public final S1 f14497e = new S1();

    /* renamed from: f, reason: collision with root package name */
    public final C0279kb f14498f = new C0279kb();

    public C0418q0(@NotNull Context context, @NotNull R3 r32) {
        this.f14493a = context;
        this.f14494b = r32.a();
        BaseReleaseLogger.init(context);
        f().execute(new aa.d(2));
        a().a();
        F3.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info("AppMetrica", "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 8.0.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 30.12.2025.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NotNull
    public final C0117e4 a() {
        return this.f14495c;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NotNull
    public final Handler b() {
        return this.f14496d;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NotNull
    public final S1 c() {
        return this.f14497e;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NotNull
    public final C0279kb d() {
        return this.f14498f;
    }

    @NotNull
    public final IHandlerExecutor f() {
        return this.f14494b;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final ICommonExecutor getDefaultExecutor() {
        return this.f14494b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(@Nullable AppMetricaConfig appMetricaConfig, @NotNull Ta ta2) {
        try {
            if (!C0617y0.f14938g) {
                if (appMetricaConfig != null) {
                    Boolean bool = appMetricaConfig.crashReporting;
                    if (bool == null) {
                        bool = Boolean.TRUE;
                    }
                    if (!bool.booleanValue()) {
                        this.f14498f.a();
                        if (appMetricaConfig != null) {
                            Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                            if (bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            if (!bool2.booleanValue()) {
                                this.f14497e.c();
                                if (appMetricaConfig != null) {
                                    C0617y0.f14938g = true;
                                }
                            }
                        }
                        this.f14497e.b();
                        if (appMetricaConfig != null) {
                        }
                    }
                }
                this.f14498f.c();
                this.f14498f.b();
                if (appMetricaConfig != null) {
                    this.f14498f.a(this.f14493a, appMetricaConfig, ta2);
                }
                if (appMetricaConfig != null) {
                }
                this.f14497e.b();
                if (appMetricaConfig != null) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
