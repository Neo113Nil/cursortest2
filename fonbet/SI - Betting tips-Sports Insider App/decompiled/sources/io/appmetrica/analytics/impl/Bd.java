package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Bd {

    /* renamed from: a, reason: collision with root package name */
    public final Bf f12052a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f12053b;

    /* renamed from: c, reason: collision with root package name */
    public final I0 f12054c;

    /* renamed from: d, reason: collision with root package name */
    public H0 f12055d;

    public Bd(Bf bf2) {
        this.f12052a = bf2;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f12053b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f12054c = new I0();
    }
}
