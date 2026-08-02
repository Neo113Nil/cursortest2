package ru.ozon.android.messenger.blocks.cell;

import android.content.Context;

/* loaded from: classes10.dex */
public final class b implements Jb.e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f84456a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.b> f84457b;

    public b(Jb.f fVar, Pc.a aVar) {
        this.f84456a = fVar;
        this.f84457b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new a((Context) this.f84456a.get(), this.f84457b.get());
    }
}
