package ru.ozon.android.messenger.blocks.emptystate;

import android.content.Context;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* loaded from: classes10.dex */
public final class d implements Jb.e<c> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f85090a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.b> f85091b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f85092c;

    public d(Jb.f fVar, Pc.a aVar, Jb.f fVar2) {
        this.f85090a = fVar;
        this.f85091b = aVar;
        this.f85092c = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new c((Context) this.f85090a.get(), this.f85091b.get(), (d.b) this.f85092c.get());
    }
}
