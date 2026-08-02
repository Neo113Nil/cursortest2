package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class n implements Jb.e<ru.ozon.android.messenger.framework.domain.a> {

    /* renamed from: a, reason: collision with root package name */
    private final m f88738a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.d> f88739b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f88740c;

    public n(m mVar, Pc.a<ru.ozon.android.messenger.framework.domain.repository.d> aVar, Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> aVar2) {
        this.f88738a = mVar;
        this.f88739b = aVar;
        this.f88740c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.android.messenger.framework.domain.repository.d messagesRepository = this.f88739b.get();
        ru.ozon.android.messenger.framework.domain.repository.b repository = this.f88740c.get();
        this.f88738a.getClass();
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new ru.ozon.android.messenger.framework.domain.e(messagesRepository, repository);
    }
}
