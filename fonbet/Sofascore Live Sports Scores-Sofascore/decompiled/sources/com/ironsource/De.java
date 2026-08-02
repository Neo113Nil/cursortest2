package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Te;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class De implements Ee {

    @NotNull
    private final T9 a = new T9();

    @NotNull
    private final InterfaceC4339u7 b = Ib.v.d().a();

    @Override // com.ironsource.Ee
    public void a(@NotNull D1 d1) {
        d1.getClass();
        C4157k4.d().a(d1.b(), d1.d(), d1.c(), d1.e(), IronSourceUtils.d(), d1.a(), d1.g());
    }

    @Override // com.ironsource.Ee
    public void b() {
        Ib.v.d().q().a(new C4355v5(EnumC4373w5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }

    @Override // com.ironsource.Ee
    @NotNull
    public String c(@NotNull Context context) {
        context.getClass();
        String b = com.ironsource.mediationsdk.p.g().b(context);
        b.getClass();
        return b;
    }

    @Override // com.ironsource.Ee
    public void d(@NotNull Runnable runnable) {
        runnable.getClass();
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.Ee
    public void e() {
        com.ironsource.mediationsdk.p.g().H();
    }

    @Override // com.ironsource.Ee
    public void f() {
        Kd.c().a();
    }

    @Override // com.ironsource.Ee
    @NotNull
    public T9 g() {
        return this.a;
    }

    @Override // com.ironsource.Ee
    public boolean d() {
        return IronSourceUtils.g();
    }

    @Override // com.ironsource.Ee
    public void c(@NotNull Runnable runnable) {
        runnable.getClass();
        IronSourceThreadManager.INSTANCE.getLevelPlayThread().a(runnable);
    }

    @Override // com.ironsource.Ee
    @Nullable
    public C3959aa c() {
        return com.ironsource.mediationsdk.p.g().m();
    }

    @Override // com.ironsource.Ee
    public boolean b(@NotNull Context context) {
        context.getClass();
        return IronSourceUtils.f(context);
    }

    @Override // com.ironsource.Ee
    public void b(@NotNull Runnable runnable) {
        runnable.getClass();
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.Ee
    public void a(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j);
    }

    @Override // com.ironsource.Ee
    public void a(@NotNull Runnable runnable) {
        runnable.getClass();
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, com.ironsource.environment.thread.a.a.a(runnable), 0L, 2, null);
    }

    @Override // com.ironsource.Ee
    public void a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        I6.a().a(str, str2);
    }

    @Override // com.ironsource.Ee
    public void a(long j, @NotNull Te.a aVar) {
        aVar.getClass();
        com.ironsource.mediationsdk.p.g().a(j, aVar);
    }

    @Override // com.ironsource.Ee
    @Nullable
    public Te a(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        return com.ironsource.mediationsdk.p.g().a(context, str);
    }

    @Override // com.ironsource.Ee
    @NotNull
    public String a(@NotNull Context context) {
        context.getClass();
        String a = a().a(context);
        a.getClass();
        return a;
    }

    @Override // com.ironsource.Ee
    @NotNull
    public InterfaceC4339u7 a() {
        return this.b;
    }

    @Override // com.ironsource.Ee
    public void a(@NotNull Be be) {
        be.getClass();
        Ce.a.a(be);
    }
}
