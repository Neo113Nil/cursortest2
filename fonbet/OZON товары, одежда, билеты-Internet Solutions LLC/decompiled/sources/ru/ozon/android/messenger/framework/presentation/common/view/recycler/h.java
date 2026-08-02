package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.content.Context;

/* loaded from: classes10.dex */
public final class h implements Jb.e<g> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.b> f91230a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f91231b;

    public h(Jb.f fVar, Pc.a aVar) {
        this.f91230a = aVar;
        this.f91231b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new g((Context) this.f91231b.get(), this.f91230a.get());
    }
}
