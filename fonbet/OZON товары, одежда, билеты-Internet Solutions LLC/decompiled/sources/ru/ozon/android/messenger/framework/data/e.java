package ru.ozon.android.messenger.framework.data;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* loaded from: classes10.dex */
public final class e implements Jb.e<ru.ozon.android.messenger.framework.data.cache.b> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f87414a;

    public e(Jb.f fVar) {
        this.f87414a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        d.f networkConfig = (d.f) this.f87414a.get();
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        int i11 = ru.ozon.android.messenger.framework.core.initialization.e.f87343e;
        return ru.ozon.android.messenger.framework.core.initialization.e.f(networkConfig.c());
    }
}
