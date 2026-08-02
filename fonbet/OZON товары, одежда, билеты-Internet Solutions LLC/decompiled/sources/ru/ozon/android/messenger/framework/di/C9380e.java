package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.service.InterfaceC9383a;

/* renamed from: ru.ozon.android.messenger.framework.di.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9380e implements Jb.e<InterfaceC9383a> {

    /* renamed from: a, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.domain.service.b f88714a;

    public C9380e(C9377b c9377b, ru.ozon.android.messenger.framework.domain.service.b bVar) {
        this.f88714a = bVar;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC9383a.C1636a impl = (InterfaceC9383a.C1636a) this.f88714a.get();
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }
}
