package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Ve;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Fe implements Ge {
    private final T9 a = new T9();
    private final C2632r9 b = new C2632r9(IronSourceThreadManager.INSTANCE.getInitHandler());
    private final InterfaceC2738x7 c = Jb.u.d().a();

    public static final class a extends AbstractRunnableC2512ke {
        final /* synthetic */ Runnable b;

        a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC2512ke
        public void a() {
            this.b.run();
        }
    }

    @Override // com.ironsource.Ge
    public InterfaceC2738x7 a() {
        return this.c;
    }

    @Override // com.ironsource.Ge
    public void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void c(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.b.a(callback);
    }

    @Override // com.ironsource.Ge
    public void d(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.b.b(runnable);
    }

    @Override // com.ironsource.Ge
    public void e(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void f() {
        Ld.c().a();
    }

    @Override // com.ironsource.Ge
    public T9 g() {
        return this.a;
    }

    @Override // com.ironsource.Ge
    public void a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j);
    }

    @Override // com.ironsource.Ge
    public boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return IronSourceUtils.g(context);
    }

    @Override // com.ironsource.Ge
    public String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String b = com.ironsource.mediationsdk.p.h().b(context);
        Intrinsics.checkNotNullExpressionValue(b, "getInstance().getAdvertiserId(context)");
        return b;
    }

    @Override // com.ironsource.Ge
    public boolean d() {
        return IronSourceUtils.g();
    }

    @Override // com.ironsource.Ge
    public void e() {
        com.ironsource.mediationsdk.p.h().I();
    }

    @Override // com.ironsource.Ge
    public void a(AbstractRunnableC2512ke safeRunnable, long j) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.b.a(safeRunnable, j);
    }

    @Override // com.ironsource.Ge
    public void b() {
        Jb.u.d().q().a(new C2736x5(EnumC2754y5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }

    @Override // com.ironsource.Ge
    public C2329aa c() {
        return com.ironsource.mediationsdk.p.h().n();
    }

    @Override // com.ironsource.Ge
    public void a(AbstractRunnableC2512ke safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.b.a(safeRunnable);
    }

    @Override // com.ironsource.Ge
    public void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        J6.a().a(key, value);
    }

    @Override // com.ironsource.Ge
    public void a(long j, Ve.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.p.h().a(j, responseOrigin);
    }

    @Override // com.ironsource.Ge
    public Ve a(Context context, String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return com.ironsource.mediationsdk.p.h().a(context, appKey);
    }

    @Override // com.ironsource.Ge
    public String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String a2 = a().a(context);
        Intrinsics.checkNotNullExpressionValue(a2, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return a2;
    }

    @Override // com.ironsource.Ge
    public void a(F1 reporterSettings) {
        Intrinsics.checkNotNullParameter(reporterSettings, "reporterSettings");
        C2556n4.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), IronSourceUtils.d(), reporterSettings.a(), reporterSettings.g());
    }

    @Override // com.ironsource.Ge
    public void a(De initStatus) {
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        Ee.a.a(initStatus);
    }
}
