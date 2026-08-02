package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Ve;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* loaded from: classes13.dex */
public final class Fe implements Ge {
    private final U9 a = new U9();
    private final C4546s9 b = new C4546s9();
    private final InterfaceC4652y7 c = Kb.u.d().a();

    public static final class a extends AbstractRunnableC4408ke {
        final /* synthetic */ Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            this.b.run();
        }
    }

    @Override // com.ironsource.Ge
    public InterfaceC4652y7 a() {
        return this.c;
    }

    @Override // com.ironsource.Ge
    public void b(Runnable runnable) {
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void c(Runnable runnable) {
        this.b.a(runnable);
    }

    @Override // com.ironsource.Ge
    public void d(Runnable runnable) {
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void e() {
        com.ironsource.mediationsdk.p.h().I();
    }

    @Override // com.ironsource.Ge
    public void f() {
        Ld.c().a();
    }

    @Override // com.ironsource.Ge
    public U9 g() {
        return this.a;
    }

    @Override // com.ironsource.Ge
    public void a(Runnable runnable, long j) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j);
    }

    @Override // com.ironsource.Ge
    public boolean b(Context context) {
        return IronSourceUtils.f(context);
    }

    @Override // com.ironsource.Ge
    public String c(Context context) {
        return com.ironsource.mediationsdk.p.h().b(context);
    }

    @Override // com.ironsource.Ge
    public boolean d() {
        return IronSourceUtils.g();
    }

    @Override // com.ironsource.Ge
    public void a(Runnable runnable) {
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(runnable), 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void b() {
        Kb.u.d().q().a(new C4632x5(EnumC4650y5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }

    @Override // com.ironsource.Ge
    public C4243ba c() {
        return com.ironsource.mediationsdk.p.h().n();
    }

    @Override // com.ironsource.Ge
    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        L6.a().a(str, str2);
    }

    @Override // com.ironsource.Ge
    public void a(long j, Ve.a aVar) {
        com.ironsource.mediationsdk.p.h().a(j, aVar);
    }

    @Override // com.ironsource.Ge
    public Ve a(Context context, String str) {
        return com.ironsource.mediationsdk.p.h().a(context, str);
    }

    @Override // com.ironsource.Ge
    public String a(Context context) {
        return a().a(context);
    }

    @Override // com.ironsource.Ge
    public void a(F1 f1) {
        C4452n4.d().a(f1.b(), f1.d(), f1.c(), f1.e(), IronSourceUtils.d(), f1.a(), f1.g());
    }

    @Override // com.ironsource.Ge
    public void a(De de) {
        Ee.a.a(de);
    }
}
