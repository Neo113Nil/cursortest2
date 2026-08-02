package ru.ozon.android.messenger.framework.composer.di.module;

import E00.a;
import Jb.e;
import Jb.f;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c implements e<E00.a> {

    /* renamed from: a, reason: collision with root package name */
    private final f f86692a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Map<Class<?>, Pc.a<E00.a>>> f86693b;

    public c(a aVar, f fVar, Pc.a aVar2) {
        this.f86692a = fVar;
        this.f86693b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        E00.a aVar;
        ru.ozon.android.messenger.framework.composer.screen.e config = (ru.ozon.android.messenger.framework.composer.screen.e) this.f86692a.get();
        Map<Class<?>, Pc.a<E00.a>> interceptorsProviders = this.f86693b.get();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(interceptorsProviders, "interceptorsProviders");
        Pc.a<E00.a> aVar2 = interceptorsProviders.get(config.e());
        return (aVar2 == null || (aVar = aVar2.get()) == null) ? a.C0158a.a() : aVar;
    }
}
