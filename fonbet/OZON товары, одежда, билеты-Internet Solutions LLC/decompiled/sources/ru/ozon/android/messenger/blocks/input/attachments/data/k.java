package ru.ozon.android.messenger.blocks.input.attachments.data;

import P60.t;

/* loaded from: classes10.dex */
public final class k implements Jb.e<j> {

    /* renamed from: a, reason: collision with root package name */
    private final f f85390a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.di.viewmodels.b f85391b;

    /* renamed from: c, reason: collision with root package name */
    private final t f85392c;

    public k(f fVar, ru.ozon.android.messenger.framework.di.viewmodels.b bVar, t tVar) {
        this.f85390a = fVar;
        this.f85391b = bVar;
        this.f85392c = tVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new j((c) this.f85390a.get(), (ru.ozon.android.messenger.utils.image.a) this.f85391b.get(), (ru.ozon.android.messenger.utils.file.d) this.f85392c.get());
    }
}
