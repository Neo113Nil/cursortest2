package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class D2 implements ModulePreferences {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0538ul f12121a;

    public D2(@NotNull InterfaceC0538ul interfaceC0538ul) {
        this.f12121a = interfaceC0538ul;
    }

    @NotNull
    public abstract String a(@NotNull String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(@NotNull String str, boolean z5) {
        return ((AbstractC0630yd) this.f12121a).c(str, z5);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(@NotNull String str, int i5) {
        return ((AbstractC0630yd) this.f12121a).c(str, i5);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(@NotNull String str, long j) {
        return ((AbstractC0630yd) this.f12121a).c(a(str), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    @Nullable
    public final String getString(@NotNull String str, @Nullable String str2) {
        return ((AbstractC0630yd) this.f12121a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(@NotNull String str, boolean z5) {
        AbstractC0630yd abstractC0630yd = (AbstractC0630yd) this.f12121a;
        ((Xe) ((InterfaceC0538ul) abstractC0630yd.b(abstractC0630yd.f(a(str)), z5))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(@NotNull String str, int i5) {
        AbstractC0630yd abstractC0630yd = (AbstractC0630yd) this.f12121a;
        ((Xe) ((InterfaceC0538ul) abstractC0630yd.b(abstractC0630yd.f(str), i5))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(@NotNull String str, long j) {
        AbstractC0630yd abstractC0630yd = (AbstractC0630yd) this.f12121a;
        ((Xe) ((InterfaceC0538ul) abstractC0630yd.b(abstractC0630yd.f(a(str)), j))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(@NotNull String str, @Nullable String str2) {
        AbstractC0630yd abstractC0630yd = (AbstractC0630yd) this.f12121a;
        ((Xe) ((InterfaceC0538ul) abstractC0630yd.b(abstractC0630yd.f(a(str)), str2))).b();
    }
}
