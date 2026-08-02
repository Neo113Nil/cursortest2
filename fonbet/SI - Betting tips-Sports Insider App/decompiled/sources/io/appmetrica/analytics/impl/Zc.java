package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Zc implements ModuleSelfReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Qj f13290a = AbstractC0593x1.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f13291b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable Throwable th2) {
        Qj qj = this.f13290a;
        qj.getClass();
        qj.a(new C0412pj(str, th2));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str) {
        Qj qj = this.f13290a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f13291b).withName(str).build();
        qj.getClass();
        qj.a(new Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable String str2) {
        this.f13290a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable Map<String, ? extends Object> map) {
        Qj qj = this.f13290a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f13291b).withName(str).withAttributes(map).build();
        qj.getClass();
        qj.a(new Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable String str2) {
        Qj qj = this.f13290a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f13291b).withName(str).withValue(str2).build();
        qj.getClass();
        qj.a(new Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i5, @NotNull String str, @Nullable String str2) {
        Qj qj = this.f13290a;
        ModuleEvent build = ModuleEvent.newBuilder(i5).withName(str).withValue(str2).build();
        qj.getClass();
        qj.a(new Fj(build));
    }
}
