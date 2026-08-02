package ru.ozon.android.messenger.framework.data;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB;

/* loaded from: classes10.dex */
public final class h implements Jb.e<MessengerDB> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f87419a;

    public h(Jb.f fVar) {
        this.f87419a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        d.f networkConfig = (d.f) this.f87419a.get();
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        int i11 = ru.ozon.android.messenger.framework.core.initialization.e.f87343e;
        return ru.ozon.android.messenger.framework.core.initialization.e.h(networkConfig.c());
    }
}
