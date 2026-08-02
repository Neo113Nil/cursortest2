package ru.ozon.android.messenger.framework.composer.di.module;

import Jb.e;
import Jb.f;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.usecases.C9407y;
import ru.ozon.android.messenger.framework.domain.usecases.C9408z;
import ru.ozon.android.messenger.framework.domain.usecases.W;

/* loaded from: classes10.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86689a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f86690b;

    /* renamed from: c, reason: collision with root package name */
    private final e f86691c;

    public b(Pc.a aVar, C9408z c9408z) {
        this.f86690b = aVar;
        this.f86691c = c9408z;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f86689a) {
            case 0:
                ru.ozon.android.messenger.framework.composer.screen.e config = (ru.ozon.android.messenger.framework.composer.screen.e) ((f) this.f86691c).get();
                ru.ozon.android.messenger.framework.composer.configuration.a composerConfiguratorStorage = (ru.ozon.android.messenger.framework.composer.configuration.a) this.f86690b.get();
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(composerConfiguratorStorage, "composerConfiguratorStorage");
                return e0.f(composerConfiguratorStorage.a(), config.h());
            default:
                return new W((ru.ozon.android.messenger.framework.domain.repository.b) this.f86690b.get(), (C9407y) ((C9408z) this.f86691c).get());
        }
    }

    public b(a aVar, f fVar, Pc.a aVar2) {
        this.f86691c = fVar;
        this.f86690b = aVar2;
    }
}
