package ru.ozon.android.messenger.framework.data;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* loaded from: classes10.dex */
public final class g implements Jb.e<ru.ozon.android.messenger.framework.data.cache.f> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f87418a;

    public g(Jb.f fVar) {
        this.f87418a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        d.f networkConfig = (d.f) this.f87418a.get();
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        int i11 = ru.ozon.android.messenger.framework.core.initialization.e.f87343e;
        return ru.ozon.android.messenger.framework.core.initialization.e.g(networkConfig.c());
    }
}
