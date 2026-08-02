package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.service.InterfaceC9383a;

/* loaded from: classes10.dex */
public final class o implements Jb.e<InterfaceC9383a> {

    /* renamed from: a, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.domain.service.b f88741a;

    public o(m mVar, ru.ozon.android.messenger.framework.domain.service.b bVar) {
        this.f88741a = bVar;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC9383a.C1636a impl = (InterfaceC9383a.C1636a) this.f88741a.get();
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }
}
